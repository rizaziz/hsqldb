/* Copyright (c) 2001-2021, The HSQL Development Group
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the HSQL Development Group nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL HSQL DEVELOPMENT GROUP, HSQLDB.ORG,
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


package org.hsqldb.jdbc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Base test case for HSQLDB JDBC 4 test suite.
 *
 * @author Campbell Burnet (campbell-burnet@users dot sourceforge.net)
 * @since 1.7.x
 * @version 2.6.x
 */
public class JdbcSuite extends TestCase {

    // inherit javadocs
    public JdbcSuite(String testName) {
        super(testName);
    }

    // inherit javadocs
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }


    // inherit javadocs
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * suite method automatically generated by JUnit module
     *
     * @return the JDBC test suite
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("JdbcSuite");
        suite.addTest(HsqldbExtensionsToJDBCStatementTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCArrayTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCBlobClientTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCBlobFileTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCBlobTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCCallableStatementTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCCallableStatementWhileClosedTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCClobClientTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCClobFileTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCClobTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCConnectionCreateStatementTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCConnectionPrepareCallTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCConnectionPrepareStatementTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCConnectionTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCDataSourceFactoryTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCDataSourceTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCDatabaseMetaDataSupportsConvertTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCDatabaseMetaDataTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCDriverTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCNClobTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCParameterMetaDataTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCPoolTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCPreparedStatementTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCResultSetMetaDataTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCResultSetTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCRowIdTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCSQLXMLTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCSavepointTest.suite());
        suite.addTest(org.hsqldb.jdbc.JDBCStatementTest.suite());
        //suite.addTest(org.hsqldb.jdbc.ScriptedTest.suite());
        suite.addTest(org.hsqldb.jdbc.UtilTest.suite());
        // TODO:
        //suite.addTest(org.hsqldb.jdbc.jdbcConflictingRowTest.suite());
        //suite.addTest(org.hsqldb.jdbc.jdbcDataSetTest.suite());
        //suite.addTest(org.hsqldb.jdbc.jdbcDataSetResolverTest.suite());
        //suite.addTest(org.hsqldb.jdbc.jdbcQueryObjectGeneratorTest.suite());
        //suite.addTest(org.hsqldb.jdbc.jdbcRowSetTest.suite());
        return suite;
    }

    /**
     * Runs the entire JDBC test suite.
     *
     * @param argList ignored
     */
    public static void main(java.lang.String[] argList) {

        junit.textui.TestRunner.run(suite());
    }

}

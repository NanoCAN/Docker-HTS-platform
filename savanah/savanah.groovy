/* Database config */
environments{
    production{
        dataSource {
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver" 
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            url = "jdbc:mysql://mysql/savanah?useUnicode=yes&characterEncoding=UTF-8"
            username = 'savanah'
            password = 'thatpasswordagain'
            pooled = true
            properties {
                maxActive = -1
                minEvictableIdleTimeMillis=1800000
                timeBetweenEvictionRunsMillis=1800000
                numTestsPerEvictionRun=3
                testOnBorrow=true
                testWhileIdle=true
                testOnReturn=true
                validationQuery="SELECT 1"
            }
        }   
        dataSource_DART {
            pooled = true
            driverClassName = "org.h2.Driver"
            username = "sa"
            password = ""
            dbCreate = "update"
            url = "jdbc:h2:dartDb;MVCC=TRUE;LOCK_TIMEOUT=10000"            
        }     
    }
}

grails.logging.jul.usebridge = false
grails.serverURL = "http://localhost/SAVANAH/"
upload.directory = "/upload/"
baseUrl = "http://localhost/SAVANAH/readoutExport/"

//CAS configuration for single sign on
grails.plugins.springsecurity.cas.active = false

//OpenLabFramework config
openlabframework.rest.url = "https://OpenLabFramework/"
openlabframework.rest.callback.url = "https://OpenLabFramework/OpenLabFramework/"
openlabframework.appAccessToken = "0750ab92-c412-459d-aee3-d7612d009024"

//speed up SQL operations
jdbc.groovySql = true
jdbc.batchSize = 500

//loglevel
savanahLogLevel = "DEBUG"

//hitseekr config
hitseekr.url = "http://hitseekr"

//db migration
grails.plugin.databasemigration.updateOnStart = false

//elasticsearch config
elasticSearch.client.mode = 'transport'
elasticSearch.client.hosts = [
       [host:'elasticsearch', port:9300]       
]
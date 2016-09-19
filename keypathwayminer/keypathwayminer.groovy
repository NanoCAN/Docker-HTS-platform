grails.app.context = "/keypathwayminer"

/* Database config */
environments{
    production{
        dataSource {
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver" 
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            url = "jdbc:mysql://mysql/kpm?useUnicode=yes&characterEncoding=UTF-8"
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
    }
}

/* KPM config */
kpm.max.concurrent.runs = 1
kpm.max.cores = 2
kpm.allowed.algorithms = ["Greedy"] // Note case-sensitivity
kpm.max.allowed.combinations = 100



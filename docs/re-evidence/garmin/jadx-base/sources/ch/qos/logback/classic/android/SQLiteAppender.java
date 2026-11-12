package ch.qos.logback.classic.android;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.db.SQLBuilder;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.util.Duration;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SQLiteAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    private static final int ARG0_INDEX = 7;
    private static final int CALLER_CLASS_INDEX = 12;
    private static final int CALLER_FILENAME_INDEX = 11;
    private static final int CALLER_LINE_INDEX = 14;
    private static final int CALLER_METHOD_INDEX = 13;
    private static final short EXCEPTION_EXISTS = 2;
    private static final int FORMATTED_MESSAGE_INDEX = 2;
    private static final int LEVEL_STRING_INDEX = 4;
    private static final int LOGGER_NAME_INDEX = 3;
    private static final short PROPERTIES_EXIST = 1;
    private static final int REFERENCE_FLAG_INDEX = 6;
    private static final int THREAD_NAME_INDEX = 5;
    private static final int TIMESTMP_INDEX = 1;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private SQLiteDatabase f27275db;
    private DBNameResolver dbNameResolver;
    private String filename;
    private String insertExceptionSQL;
    private String insertPropertiesSQL;
    private String insertSQL;
    private SQLiteLogCleaner logCleaner;
    private Duration maxHistory;
    private long lastCleanupTime = 0;
    private Clock clock = new SystemClock();

    private String asStringTruncatedTo254(Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string != null && string.length() > 254) {
            string = string.substring(0, 254);
        }
        return string == null ? "" : string;
    }

    private void bindCallerData(SQLiteStatement sQLiteStatement, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0 || (stackTraceElement = stackTraceElementArr[0]) == null) {
            return;
        }
        bindString(sQLiteStatement, 11, stackTraceElement.getFileName());
        bindString(sQLiteStatement, 12, stackTraceElement.getClassName());
        bindString(sQLiteStatement, 13, stackTraceElement.getMethodName());
        bindString(sQLiteStatement, 14, Integer.toString(stackTraceElement.getLineNumber()));
    }

    private void bindLoggingEvent(SQLiteStatement sQLiteStatement, ILoggingEvent iLoggingEvent) {
        sQLiteStatement.bindLong(1, iLoggingEvent.getTimeStamp());
        sQLiteStatement.bindString(2, iLoggingEvent.getFormattedMessage());
        sQLiteStatement.bindString(3, iLoggingEvent.getLoggerName());
        sQLiteStatement.bindString(4, iLoggingEvent.getLevel().toString());
        sQLiteStatement.bindString(5, iLoggingEvent.getThreadName());
        sQLiteStatement.bindLong(6, computeReferenceMask(iLoggingEvent));
    }

    private void bindLoggingEventArguments(SQLiteStatement sQLiteStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        for (int i14 = 0; i14 < length && i14 < 4; i14++) {
            sQLiteStatement.bindString(i14 + 7, asStringTruncatedTo254(objArr[i14]));
        }
    }

    private void bindString(SQLiteStatement sQLiteStatement, int i14, String str) {
        if (str != null) {
            sQLiteStatement.bindString(i14, str);
        }
    }

    private void clearExpiredLogs(SQLiteDatabase sQLiteDatabase) {
        if (lastCheckExpired(this.maxHistory, this.lastCleanupTime)) {
            this.lastCleanupTime = this.clock.currentTimeMillis();
            getLogCleaner().performLogCleanup(sQLiteDatabase, this.maxHistory);
        }
    }

    private static short computeReferenceMask(ILoggingEvent iLoggingEvent) {
        short s8 = ((iLoggingEvent.getMDCPropertyMap() != null ? iLoggingEvent.getMDCPropertyMap().keySet().size() : 0) > 0 || (iLoggingEvent.getLoggerContextVO().getPropertyMap() != null ? iLoggingEvent.getLoggerContextVO().getPropertyMap().size() : 0) > 0) ? PROPERTIES_EXIST : (short) 0;
        return iLoggingEvent.getThrowableProxy() != null ? (short) (s8 | EXCEPTION_EXISTS) : s8;
    }

    private void insertException(SQLiteStatement sQLiteStatement, String str, short s8, long j8) {
        sQLiteStatement.bindLong(1, j8);
        sQLiteStatement.bindLong(2, s8);
        sQLiteStatement.bindString(3, str);
        sQLiteStatement.executeInsert();
    }

    private void insertProperties(Map<String, String> map, long j8) {
        if (map.size() > 0) {
            SQLiteStatement sQLiteStatementCompileStatement = this.f27275db.compileStatement(this.insertPropertiesSQL);
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sQLiteStatementCompileStatement.bindLong(1, j8);
                    sQLiteStatementCompileStatement.bindString(2, entry.getKey());
                    sQLiteStatementCompileStatement.bindString(3, entry.getValue());
                    sQLiteStatementCompileStatement.executeInsert();
                }
                sQLiteStatementCompileStatement.close();
            } catch (Throwable th3) {
                sQLiteStatementCompileStatement.close();
                throw th3;
            }
        }
    }

    private void insertThrowable(IThrowableProxy iThrowableProxy, long j8) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f27275db.compileStatement(this.insertExceptionSQL);
        short s8 = 0;
        while (iThrowableProxy != null) {
            try {
                StringBuilder sb3 = new StringBuilder();
                ThrowableProxyUtil.subjoinFirstLine(sb3, iThrowableProxy);
                String string = sb3.toString();
                short s14 = (short) (s8 + PROPERTIES_EXIST);
                long j14 = j8;
                insertException(sQLiteStatementCompileStatement, string, s8, j14);
                int commonFrames = iThrowableProxy.getCommonFrames();
                StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
                s8 = s14;
                int i14 = 0;
                while (i14 < stackTraceElementProxyArray.length - commonFrames) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('\t');
                    ThrowableProxyUtil.subjoinSTEP(sb4, stackTraceElementProxyArray[i14]);
                    String string2 = sb4.toString();
                    short s15 = (short) (s8 + PROPERTIES_EXIST);
                    insertException(sQLiteStatementCompileStatement, string2, s8, j14);
                    i14++;
                    s8 = s15;
                }
                if (commonFrames > 0) {
                    String str = "\t... " + commonFrames + " common frames omitted";
                    short s16 = (short) (s8 + PROPERTIES_EXIST);
                    insertException(sQLiteStatementCompileStatement, str, s8, j14);
                    s8 = s16;
                }
                iThrowableProxy = iThrowableProxy.getCause();
                j8 = j14;
            } catch (Throwable th3) {
                sQLiteStatementCompileStatement.close();
                throw th3;
            }
        }
        sQLiteStatementCompileStatement.close();
    }

    private boolean lastCheckExpired(Duration duration, long j8) {
        if (duration == null || duration.getMilliseconds() <= 0) {
            return false;
        }
        return j8 <= 0 || this.clock.currentTimeMillis() - j8 >= duration.getMilliseconds();
    }

    private Map<String, String> mergePropertyMaps(ILoggingEvent iLoggingEvent) {
        HashMap map = new HashMap();
        Map<String, String> propertyMap = iLoggingEvent.getLoggerContextVO().getPropertyMap();
        if (propertyMap != null) {
            map.putAll(propertyMap);
        }
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap != null) {
            map.putAll(mDCPropertyMap);
        }
        return map;
    }

    private void secondarySubAppend(ILoggingEvent iLoggingEvent, long j8) {
        insertProperties(mergePropertyMaps(iLoggingEvent), j8);
        if (iLoggingEvent.getThrowableProxy() != null) {
            insertThrowable(iLoggingEvent.getThrowableProxy(), j8);
        }
    }

    private long subAppend(ILoggingEvent iLoggingEvent, SQLiteStatement sQLiteStatement) {
        bindLoggingEvent(sQLiteStatement, iLoggingEvent);
        bindLoggingEventArguments(sQLiteStatement, iLoggingEvent.getArgumentArray());
        bindCallerData(sQLiteStatement, iLoggingEvent.getCallerData());
        try {
            return sQLiteStatement.executeInsert();
        } catch (SQLiteException e4) {
            addWarn("Failed to insert loggingEvent", e4);
            return -1L;
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            try {
                clearExpiredLogs(this.f27275db);
                SQLiteStatement sQLiteStatementCompileStatement = this.f27275db.compileStatement(this.insertSQL);
                try {
                    this.f27275db.beginTransaction();
                    long jSubAppend = subAppend(iLoggingEvent, sQLiteStatementCompileStatement);
                    if (jSubAppend != -1) {
                        secondarySubAppend(iLoggingEvent, jSubAppend);
                        this.f27275db.setTransactionSuccessful();
                    }
                } finally {
                    if (this.f27275db.inTransaction()) {
                        this.f27275db.endTransaction();
                    }
                    sQLiteStatementCompileStatement.close();
                }
            } catch (Throwable th3) {
                addError("Cannot append event", th3);
            }
        }
    }

    public void finalize() {
        this.f27275db.close();
    }

    public File getDatabaseFile(String str) {
        File file = (str == null || str.trim().length() <= 0) ? null : new File(str);
        return (file == null || file.isDirectory()) ? new File(new AndroidContextUtil().getDatabasePath("logback.db")) : file;
    }

    public String getFilename() {
        return this.filename;
    }

    public SQLiteLogCleaner getLogCleaner() {
        if (this.logCleaner == null) {
            final Clock clock = this.clock;
            this.logCleaner = new SQLiteLogCleaner() { // from class: ch.qos.logback.classic.android.SQLiteAppender.1
                @Override // ch.qos.logback.classic.android.SQLiteLogCleaner
                public void performLogCleanup(SQLiteDatabase sQLiteDatabase, Duration duration) {
                    sQLiteDatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(SQLiteAppender.this.dbNameResolver, clock.currentTimeMillis() - duration.getMilliseconds()));
                }
            };
        }
        return this.logCleaner;
    }

    public String getMaxHistory() {
        Duration duration = this.maxHistory;
        return duration != null ? duration.toString() : "";
    }

    public long getMaxHistoryMs() {
        Duration duration = this.maxHistory;
        if (duration != null) {
            return duration.getMilliseconds();
        }
        return 0L;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setDbNameResolver(DBNameResolver dBNameResolver) {
        this.dbNameResolver = dBNameResolver;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setLogCleaner(SQLiteLogCleaner sQLiteLogCleaner) {
        this.logCleaner = sQLiteLogCleaner;
    }

    public void setMaxHistory(String str) {
        this.maxHistory = Duration.valueOf(str);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str;
        this.started = false;
        File databaseFile = getDatabaseFile(this.filename);
        if (databaseFile == null) {
            addError("Cannot determine database filename");
            return;
        }
        try {
            databaseFile.getParentFile().mkdirs();
            addInfo("db path: " + databaseFile.getAbsolutePath());
            this.f27275db = SQLiteDatabase.openOrCreateDatabase(databaseFile.getPath(), (SQLiteDatabase.CursorFactory) null);
            if (this.dbNameResolver == null) {
                this.dbNameResolver = new DefaultDBNameResolver();
            }
            this.insertExceptionSQL = SQLBuilder.buildInsertExceptionSQL(this.dbNameResolver);
            this.insertPropertiesSQL = SQLBuilder.buildInsertPropertiesSQL(this.dbNameResolver);
            this.insertSQL = SQLBuilder.buildInsertSQL(this.dbNameResolver);
            try {
                this.f27275db.execSQL(SQLBuilder.buildCreateLoggingEventTableSQL(this.dbNameResolver));
                this.f27275db.execSQL(SQLBuilder.buildCreatePropertyTableSQL(this.dbNameResolver));
                this.f27275db.execSQL(SQLBuilder.buildCreateExceptionTableSQL(this.dbNameResolver));
                clearExpiredLogs(this.f27275db);
                super.start();
                this.started = true;
            } catch (SQLiteException e4) {
                e = e4;
                str = "Cannot create database tables";
                addError(str, e);
            }
        } catch (SQLiteException e14) {
            e = e14;
            str = "Cannot open database";
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f27275db.close();
        this.lastCleanupTime = 0L;
    }
}

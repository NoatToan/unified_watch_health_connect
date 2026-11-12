package org.pgsqlite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.miui.tsmclient.util.Constants;
import defpackage.b8l;
import defpackage.cm8;
import defpackage.za3;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class SQLitePlugin extends ReactContextBaseJavaModule {
    private static final String PLUGIN_NAME = "SQLite";
    public static final String TAG = "SQLitePlugin";
    protected Context context;
    protected ExecutorService threadPool;
    private static final Pattern FIRST_WORD = Pattern.compile("^\\s*(\\S+)", 2);
    static ConcurrentHashMap<String, d> dbrmap = new ConcurrentHashMap<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29562a;

        static {
            int[] iArr = new int[b.values().length];
            f29562a = iArr;
            try {
                iArr[b.echoStringValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29562a[b.open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29562a[b.close.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29562a[b.attach.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29562a[b.delete.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29562a[b.executeSqlBatch.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29562a[b.backgroundExecuteSqlBatch.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum b {
        open,
        close,
        attach,
        delete,
        executeSqlBatch,
        backgroundExecuteSqlBatch,
        echoStringValue
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29568b;
        public String c;
        public boolean d;
        public final BlockingQueue<c> e;
        public final za3 f;
        public SQLiteDatabase g;

        public d(String str, ReadableMap readableMap, za3 za3Var) {
            this.f29567a = str;
            int i = 268435456;
            try {
                String strE = b8l.e(readableMap, "assetFilename", null);
                this.c = strE;
                if (strE != null && strE.length() > 0 && b8l.c(readableMap, "readOnly", false)) {
                    i = 1;
                }
            } catch (Exception e) {
                cm8.j(SQLitePlugin.TAG, "Error retrieving assetFilename or mode from options:", e);
            }
            this.f29568b = i;
            boolean zC = b8l.c(readableMap, "androidLockWorkaround", false);
            this.d = zC;
            if (zC) {
                cm8.n(SQLitePlugin.TAG, "Android db closing/locking workaround applied");
            }
            this.e = new LinkedBlockingQueue();
            this.f = za3Var;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            c cVarTake;
            Exception e;
            try {
                this.g = SQLitePlugin.this.openDatabase(this.f29567a, this.c, this.f29568b, this.f);
                try {
                    cVarTake = this.e.take();
                    while (!cVarTake.f29565a) {
                        try {
                            SQLitePlugin.this.executeSqlBatch(this.f29567a, cVarTake.d, cVarTake.f, cVarTake.e, cVarTake.g);
                            if (this.d) {
                                String[] strArr = cVarTake.d;
                                if (strArr.length == 1 && strArr[0].equals("COMMIT")) {
                                    SQLitePlugin.this.closeDatabaseNow(this.f29567a);
                                    this.g = SQLitePlugin.this.openDatabase(this.f29567a, "", this.f29568b, null);
                                }
                            }
                            cVarTake = this.e.take();
                        } catch (Exception e2) {
                            e = e2;
                            cm8.j(SQLitePlugin.TAG, "unexpected error", e);
                        }
                    }
                } catch (Exception e3) {
                    cVarTake = null;
                    e = e3;
                }
                if (cVarTake == null || !cVarTake.f29566b) {
                    return;
                }
                try {
                    SQLitePlugin.this.closeDatabaseNow(this.f29567a);
                    SQLitePlugin.dbrmap.remove(this.f29567a);
                    if (cVarTake.c) {
                        try {
                            if (SQLitePlugin.this.deleteDatabaseNow(this.f29567a)) {
                                cVarTake.g.c("database removed");
                            } else {
                                cVarTake.g.a("couldn't delete database");
                            }
                        } catch (Exception e4) {
                            cm8.j(SQLitePlugin.TAG, "couldn't delete database", e4);
                            cVarTake.g.a("couldn't delete database: " + e4);
                        }
                    } else {
                        cVarTake.g.c("database removed");
                    }
                } catch (Exception e5) {
                    cm8.j(SQLitePlugin.TAG, "couldn't close database", e5);
                    za3 za3Var = cVarTake.g;
                    if (za3Var != null) {
                        za3Var.a("couldn't close database: " + e5);
                    }
                }
            } catch (SQLiteException e6) {
                cm8.j(SQLitePlugin.TAG, "SQLite error opening database, stopping db thread", e6);
                za3 za3Var2 = this.f;
                if (za3Var2 != null) {
                    za3Var2.a("Can't open database." + e6);
                }
                SQLitePlugin.dbrmap.remove(this.f29567a);
            } catch (Exception e7) {
                cm8.j(SQLitePlugin.TAG, "Unexpected error opening database, stopping db thread", e7);
                za3 za3Var3 = this.f;
                if (za3Var3 != null) {
                    za3Var3.a("Can't open database." + e7);
                }
                SQLitePlugin.dbrmap.remove(this.f29567a);
            }
        }
    }

    public enum e {
        update,
        insert,
        delete,
        select,
        begin,
        commit,
        rollback,
        other
    }

    public SQLitePlugin(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = null;
        this.context = reactApplicationContext.getApplicationContext();
        this.threadPool = Executors.newCachedThreadPool();
    }

    private void attachDatabase(String str, String str2, String str3, za3 za3Var) {
        d dVar = dbrmap.get(str);
        if (dVar == null) {
            za3Var.a("Database " + str + "i s not created yet");
            return;
        }
        try {
            dVar.e.put(new c(new String[]{"ATTACH DATABASE '" + getContext().getDatabasePath(str2).getAbsolutePath() + "' AS " + str3}, new String[]{"1111"}, null, za3Var));
        } catch (InterruptedException unused) {
            za3Var.a("Can't put query in the queue. Interrupted.");
        }
    }

    private void bindArgsToStatement(SQLiteStatement sQLiteStatement, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            if (readableArray.getType(i) == ReadableType.Number) {
                double d2 = readableArray.getDouble(i);
                long j = (long) d2;
                if (d2 == j) {
                    sQLiteStatement.bindLong(i + 1, j);
                } else {
                    sQLiteStatement.bindDouble(i + 1, d2);
                }
            } else if (readableArray.isNull(i)) {
                sQLiteStatement.bindNull(i + 1);
            } else {
                sQLiteStatement.bindString(i + 1, b8l.d(readableArray, i, ""));
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void bindRow(WritableMap writableMap, String str, Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            writableMap.putNull(str);
            return;
        }
        if (type == 1) {
            writableMap.putDouble(str, cursor.getLong(i));
            return;
        }
        if (type == 2) {
            writableMap.putDouble(str, cursor.getDouble(i));
        } else if (type != 4) {
            writableMap.putString(str, cursor.getString(i));
        } else {
            writableMap.putString(str, new String(Base64.encode(cursor.getBlob(i), 0)));
        }
    }

    private void closeDatabase(String str, za3 za3Var) {
        d dVar = dbrmap.get(str);
        if (dVar == null) {
            if (za3Var != null) {
                za3Var.c("database closed");
                return;
            }
            return;
        }
        try {
            dVar.e.put(new c(false, za3Var));
        } catch (Exception e2) {
            if (za3Var != null) {
                za3Var.a("couldn't close database" + e2);
            }
            cm8.j(TAG, "couldn't close database", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeDatabaseNow(String str) {
        SQLiteDatabase database = getDatabase(str);
        if (database != null) {
            database.close();
        }
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void createFromAssets(String str, File file, InputStream inputStream) throws Exception {
        Closeable closeable = null;
        try {
            cm8.w(TAG, "Copying pre-populated DB content");
            String absolutePath = file.getAbsolutePath();
            String strSubstring = absolutePath.substring(0, absolutePath.lastIndexOf("/") + 1);
            File file2 = new File(strSubstring);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(strSubstring + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        cm8.w(TAG, "Copied pre-populated DB asset to: " + file3.getAbsolutePath());
                        closeQuietly(fileOutputStream);
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                closeable = fileOutputStream;
                th = th;
                closeQuietly(closeable);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void deleteDatabase(String str, za3 za3Var) {
        d dVar = dbrmap.get(str);
        if (dVar == null) {
            if (deleteDatabaseNow(str)) {
                za3Var.c("database deleted");
                return;
            } else {
                za3Var.a("couldn't delete database");
                return;
            }
        }
        try {
            dVar.e.put(new c(true, za3Var));
        } catch (Exception e2) {
            if (za3Var != null) {
                za3Var.a("couldn't close database" + e2);
            }
            cm8.j(TAG, "couldn't close database", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public boolean deleteDatabaseNow(String str) {
        return SQLiteDatabase.deleteDatabase(getContext().getDatabasePath(str));
    }

    private boolean executeAndPossiblyThrow(b bVar, ReadableMap readableMap, za3 za3Var) {
        String[] strArr;
        String[] strArr2;
        ReadableArray[] readableArrayArr;
        switch (a.f29562a[bVar.ordinal()]) {
            case 1:
                za3Var.c(b8l.e(readableMap, "value", ""));
                break;
            case 2:
                startDatabase(b8l.e(readableMap, "name", ""), readableMap, za3Var);
                break;
            case 3:
                closeDatabase(b8l.e(readableMap, "path", ""), za3Var);
                break;
            case 4:
                attachDatabase(b8l.e(readableMap, "path", ""), b8l.e(readableMap, "dbName", ""), b8l.e(readableMap, "dbAlias", ""), za3Var);
                break;
            case 5:
                deleteDatabase(b8l.e(readableMap, "path", ""), za3Var);
                break;
            case 6:
            case 7:
                String strE = b8l.e((ReadableMap) b8l.b(readableMap, "dbargs", null), "dbname", "");
                ReadableArray readableArray = (ReadableArray) b8l.b(readableMap, "executes", null);
                if (readableArray.isNull(0)) {
                    strArr = new String[0];
                    strArr2 = null;
                    readableArrayArr = null;
                } else {
                    int size = readableArray.size();
                    String[] strArr3 = new String[size];
                    String[] strArr4 = new String[size];
                    ReadableArray[] readableArrayArr2 = new ReadableArray[size];
                    for (int i = 0; i < size; i++) {
                        ReadableMap readableMap2 = (ReadableMap) b8l.a(readableArray, i, null);
                        strArr3[i] = b8l.e(readableMap2, "sql", "");
                        strArr4[i] = b8l.e(readableMap2, "qid", "");
                        readableArrayArr2[i] = (ReadableArray) b8l.b(readableMap2, "params", null);
                    }
                    strArr = strArr3;
                    strArr2 = strArr4;
                    readableArrayArr = readableArrayArr2;
                }
                c cVar = new c(strArr, strArr2, readableArrayArr, za3Var);
                d dVar = dbrmap.get(strE);
                if (dVar == null) {
                    za3Var.a("database not open");
                } else {
                    try {
                        dVar.e.put(cVar);
                    } catch (Exception e2) {
                        cm8.j(TAG, "couldn't add to queue", e2);
                        za3Var.a("couldn't add to queue");
                        return true;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:106:0x0137 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #7 {Exception -> 0x0092, blocks: (B:9:0x001c, B:19:0x003a, B:51:0x009c, B:63:0x00bc, B:97:0x011d, B:106:0x0137, B:115:0x0150, B:116:0x0153, B:104:0x0131), top: B:134:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:121:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @SuppressLint({"NewApi"})
    public void executeSqlBatch(String str, String[] strArr, ReadableArray[] readableArrayArr, String[] strArr2, za3 za3Var) throws Throwable {
        WritableMap writableMap;
        String message;
        WritableMap writableMapCreateMap;
        boolean z;
        String str2;
        boolean z2;
        String str3;
        SQLiteStatement sQLiteStatementCompileStatement;
        int iExecuteUpdateDelete;
        SQLiteDatabase database = getDatabase(str);
        if (database == null) {
            za3Var.a("database has been closed");
            return;
        }
        int length = strArr.length;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < length; i++) {
            String str4 = strArr2[i];
            try {
                String str5 = strArr[i];
                e queryType = getQueryType(str5);
                message = "unknown";
                if (queryType != e.update) {
                    try {
                        if (queryType == e.delete) {
                            str3 = str5;
                            try {
                                sQLiteStatementCompileStatement = database.compileStatement(str3);
                                if (readableArrayArr != null) {
                                    try {
                                        try {
                                            bindArgsToStatement(sQLiteStatementCompileStatement, readableArrayArr[i]);
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            message = e.getMessage();
                                            cm8.j(TAG, "SQLiteStatement.executeUpdateDelete() failed", e);
                                            closeQuietly(sQLiteStatementCompileStatement);
                                            iExecuteUpdateDelete = -1;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        closeQuietly(sQLiteStatementCompileStatement);
                                        throw th;
                                    }
                                }
                                iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
                                closeQuietly(sQLiteStatementCompileStatement);
                            } catch (SQLiteException e3) {
                                e = e3;
                                sQLiteStatementCompileStatement = null;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteStatementCompileStatement = null;
                            }
                            if (iExecuteUpdateDelete != -1) {
                                writableMapCreateMap = Arguments.createMap();
                                writableMapCreateMap.putInt("rowsAffected", iExecuteUpdateDelete);
                            } else {
                                writableMapCreateMap = null;
                            }
                        } else {
                            z = true;
                            if (queryType != e.insert || readableArrayArr == null) {
                                str2 = str5;
                                if (queryType == e.begin) {
                                    try {
                                        database.beginTransaction();
                                        writableMapCreateMap = Arguments.createMap();
                                        try {
                                            writableMapCreateMap.putInt("rowsAffected", 0);
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            message = e.getMessage();
                                            cm8.j(TAG, "SQLiteDatabase.beginTransaction() failed", e);
                                        }
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        writableMapCreateMap = null;
                                    }
                                } else if (queryType == e.commit) {
                                    try {
                                        database.setTransactionSuccessful();
                                        database.endTransaction();
                                        writableMapCreateMap = Arguments.createMap();
                                        try {
                                            writableMapCreateMap.putInt("rowsAffected", 0);
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            message = e.getMessage();
                                            cm8.j(TAG, "SQLiteDatabase.setTransactionSuccessful/endTransaction() failed", e);
                                        }
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        writableMapCreateMap = null;
                                    }
                                } else if (queryType == e.rollback) {
                                    try {
                                        database.endTransaction();
                                        writableMapCreateMap = Arguments.createMap();
                                        z2 = false;
                                        try {
                                            writableMapCreateMap.putInt("rowsAffected", 0);
                                        } catch (SQLiteException e8) {
                                            e = e8;
                                            message = e.getMessage();
                                            cm8.j(TAG, "SQLiteDatabase.endTransaction() failed", e);
                                        }
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        z2 = false;
                                        writableMapCreateMap = null;
                                    }
                                    z = z2;
                                    str3 = str2;
                                } else {
                                    str3 = str2;
                                    writableMapCreateMap = null;
                                }
                            } else {
                                cm8.b("executeSqlBatch", "INSERT");
                                SQLiteStatement sQLiteStatementCompileStatement2 = database.compileStatement(str5);
                                bindArgsToStatement(sQLiteStatementCompileStatement2, readableArrayArr[i]);
                                str2 = str5;
                                try {
                                    long jExecuteInsert = sQLiteStatementCompileStatement2.executeInsert();
                                    writableMapCreateMap = Arguments.createMap();
                                    if (jExecuteInsert != -1) {
                                        try {
                                            try {
                                                writableMapCreateMap.putDouble("insertId", jExecuteInsert);
                                                writableMapCreateMap.putInt("rowsAffected", 1);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                writableMap = writableMapCreateMap;
                                                try {
                                                    closeQuietly(sQLiteStatementCompileStatement2);
                                                    throw th;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    message = e.getMessage();
                                                    cm8.j(TAG, "SQLitePlugin.executeSql[Batch](): failed", e);
                                                    writableMapCreateMap = writableMap;
                                                    if (writableMapCreateMap != null) {
                                                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                                                        writableMapCreateMap2.putString("qid", str4);
                                                        writableMapCreateMap2.putString("type", "success");
                                                        writableMapCreateMap2.putMap("result", writableMapCreateMap);
                                                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                                                    } else {
                                                        WritableMap writableMapCreateMap3 = Arguments.createMap();
                                                        writableMapCreateMap3.putString("qid", str4);
                                                        writableMapCreateMap3.putString("type", "error");
                                                        WritableMap writableMapCreateMap4 = Arguments.createMap();
                                                        writableMapCreateMap4.putString("message", message);
                                                        writableMapCreateMap3.putMap("result", writableMapCreateMap4);
                                                        writableArrayCreateArray.pushMap(writableMapCreateMap3);
                                                    }
                                                }
                                            }
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            message = e.getMessage();
                                            cm8.j(TAG, "SQLiteDatabase.executeInsert() failed", e);
                                        }
                                    } else {
                                        writableMapCreateMap.putInt("rowsAffected", 0);
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    writableMapCreateMap = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    writableMap = null;
                                }
                                try {
                                    closeQuietly(sQLiteStatementCompileStatement2);
                                } catch (Exception e13) {
                                    e = e13;
                                    writableMap = writableMapCreateMap;
                                    message = e.getMessage();
                                    cm8.j(TAG, "SQLitePlugin.executeSql[Batch](): failed", e);
                                    writableMapCreateMap = writableMap;
                                }
                            }
                            str3 = str2;
                        }
                        z = false;
                    } catch (Exception e14) {
                        e = e14;
                        writableMap = null;
                        message = e.getMessage();
                        cm8.j(TAG, "SQLitePlugin.executeSql[Batch](): failed", e);
                        writableMapCreateMap = writableMap;
                        if (writableMapCreateMap != null) {
                            WritableMap writableMapCreateMap5 = Arguments.createMap();
                            writableMapCreateMap5.putString("qid", str4);
                            writableMapCreateMap5.putString("type", "success");
                            writableMapCreateMap5.putMap("result", writableMapCreateMap);
                            writableArrayCreateArray.pushMap(writableMapCreateMap5);
                        } else {
                            WritableMap writableMapCreateMap6 = Arguments.createMap();
                            writableMapCreateMap6.putString("qid", str4);
                            writableMapCreateMap6.putString("type", "error");
                            WritableMap writableMapCreateMap7 = Arguments.createMap();
                            writableMapCreateMap7.putString("message", message);
                            writableMapCreateMap6.putMap("result", writableMapCreateMap7);
                            writableArrayCreateArray.pushMap(writableMapCreateMap6);
                        }
                    }
                } else {
                    str3 = str5;
                    sQLiteStatementCompileStatement = database.compileStatement(str3);
                    if (readableArrayArr != null) {
                        bindArgsToStatement(sQLiteStatementCompileStatement, readableArrayArr[i]);
                    }
                    iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
                    closeQuietly(sQLiteStatementCompileStatement);
                    if (iExecuteUpdateDelete != -1) {
                        writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putInt("rowsAffected", iExecuteUpdateDelete);
                    } else {
                        writableMapCreateMap = null;
                    }
                    z = false;
                }
                if (z) {
                    writableMapCreateMap = executeSqlStatementQuery(database, str3, readableArrayArr != null ? readableArrayArr[i] : null, za3Var);
                }
            } catch (Exception e15) {
                e = e15;
            }
            if (writableMapCreateMap != null) {
                WritableMap writableMapCreateMap8 = Arguments.createMap();
                writableMapCreateMap8.putString("qid", str4);
                writableMapCreateMap8.putString("type", "success");
                writableMapCreateMap8.putMap("result", writableMapCreateMap);
                writableArrayCreateArray.pushMap(writableMapCreateMap8);
            } else {
                WritableMap writableMapCreateMap9 = Arguments.createMap();
                writableMapCreateMap9.putString("qid", str4);
                writableMapCreateMap9.putString("type", "error");
                WritableMap writableMapCreateMap10 = Arguments.createMap();
                writableMapCreateMap10.putString("message", message);
                writableMapCreateMap9.putMap("result", writableMapCreateMap10);
                writableArrayCreateArray.pushMap(writableMapCreateMap9);
            }
        }
        za3Var.b(writableArrayCreateArray);
    }

    private WritableMap executeSqlStatementQuery(SQLiteDatabase sQLiteDatabase, String str, ReadableArray readableArray, za3 za3Var) throws Exception {
        WritableMap writableMapCreateMap = Arguments.createMap();
        try {
            try {
                String[] strArr = new String[0];
                if (readableArray != null) {
                    int size = readableArray.size();
                    String[] strArr2 = new String[size];
                    for (int i = 0; i < size; i++) {
                        if (readableArray.isNull(i)) {
                            strArr2[i] = "";
                        } else {
                            strArr2[i] = b8l.d(readableArray, i, "");
                        }
                    }
                    strArr = strArr2;
                }
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, strArr);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    int columnCount = cursorRawQuery.getColumnCount();
                    do {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            bindRow(writableMapCreateMap2, cursorRawQuery.getColumnName(i2), cursorRawQuery, i2);
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    } while (cursorRawQuery.moveToNext());
                    writableMapCreateMap.putArray("rows", writableArrayCreateArray);
                }
                closeQuietly(cursorRawQuery);
                return writableMapCreateMap;
            } catch (Exception e2) {
                cm8.j(TAG, "SQLitePlugin.executeSql[Batch]() failed", e2);
                throw e2;
            }
        } catch (Throwable th) {
            closeQuietly(null);
            throw th;
        }
    }

    private SQLiteDatabase getDatabase(String str) {
        d dVar = dbrmap.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    private e getQueryType(String str) {
        Matcher matcher = FIRST_WORD.matcher(str);
        if (matcher.find()) {
            try {
                return e.valueOf(matcher.group(1).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        return e.other;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SQLiteDatabase openDatabase(String str, String str2, int i, za3 za3Var) throws Exception {
        InputStream fileInputStream;
        File databasePath;
        Closeable closeable = null;
        try {
            SQLiteDatabase database = getDatabase(str);
            if (database != null && database.isOpen()) {
                throw new Exception("Database already open");
            }
            boolean z = false;
            boolean z2 = str2 != null && str2.length() > 0;
            try {
                if (!z2) {
                    fileInputStream = null;
                    databasePath = null;
                } else if (str2.compareTo("1") == 0) {
                    String str3 = "www/" + str;
                    try {
                        fileInputStream = getContext().getAssets().open(str3);
                        try {
                            cm8.w(TAG, "Pre-populated DB asset FOUND  in app bundle www subdirectory: " + str3);
                            databasePath = null;
                        } catch (Exception unused) {
                            cm8.i(TAG, "pre-populated DB asset NOT FOUND in app bundle www subdirectory: " + str3);
                            databasePath = null;
                            z = true;
                        }
                    } catch (Exception unused2) {
                        fileInputStream = null;
                    }
                } else {
                    if (str2.charAt(0) == '~') {
                        String strSubstring = str2.startsWith("~/") ? str2.substring(2) : str2.substring(1);
                        try {
                            fileInputStream = getContext().getAssets().open(strSubstring);
                            try {
                                cm8.w(TAG, "Pre-populated DB asset FOUND in app bundle subdirectory: " + strSubstring);
                            } catch (Exception unused3) {
                                cm8.i(TAG, "pre-populated DB asset NOT FOUND in app bundle www subdirectory: " + strSubstring);
                                databasePath = null;
                                z = true;
                            }
                        } catch (Exception unused4) {
                            fileInputStream = null;
                        }
                    } else {
                        File filesDir = getContext().getFilesDir();
                        if (str2.startsWith("/")) {
                            str2 = str2.substring(1);
                        }
                        try {
                            databasePath = new File(filesDir, str2);
                            fileInputStream = new FileInputStream(databasePath);
                            try {
                                String str4 = TAG;
                                cm8.w(str4, "Pre-populated DB asset FOUND in Files subdirectory: " + databasePath.getCanonicalPath());
                                if (i == 1) {
                                    try {
                                        cm8.w(str4, "Detected read-only mode request for external asset.");
                                    } catch (Exception unused5) {
                                        cm8.i(TAG, "Error opening pre-populated DB asset in app bundle www subdirectory: " + str2);
                                        z = true;
                                    }
                                }
                            } catch (Exception unused6) {
                                databasePath = null;
                            }
                        } catch (Exception unused7) {
                            fileInputStream = null;
                            databasePath = null;
                        }
                    }
                    databasePath = null;
                }
                if (databasePath == null) {
                    databasePath = getContext().getDatabasePath(str);
                    if (!databasePath.exists() && z2) {
                        if (z || fileInputStream == null) {
                            cm8.i(TAG, "Unable to import pre-populated db asset");
                            throw new Exception("Unable to import pre-populated db asset");
                        }
                        cm8.w(TAG, "Copying pre-populated db asset to destination");
                        try {
                            createFromAssets(str, databasePath, fileInputStream);
                        } catch (Exception e2) {
                            cm8.j(TAG, "Error importing pre-populated DB asset", e2);
                            throw new Exception("Error importing pre-populated DB asset");
                        }
                    }
                    if (!databasePath.exists()) {
                        databasePath.getParentFile().mkdirs();
                    }
                    i = 268435456;
                }
                cm8.w(TAG, "DB file is ready, proceeding to OPEN SQLite DB: " + databasePath.getAbsolutePath());
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(databasePath.getAbsolutePath(), null, i);
                if (za3Var != null) {
                    za3Var.c("Database opened");
                }
                closeQuietly(fileInputStream);
                return sQLiteDatabaseOpenDatabase;
            } catch (Throwable th) {
                th = th;
                closeable = fileInputStream;
                closeQuietly(closeable);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void startDatabase(String str, ReadableMap readableMap, za3 za3Var) {
        if (dbrmap.get(str) != null) {
            za3Var.c("database started");
            return;
        }
        d dVar = new d(str, readableMap, za3Var);
        dbrmap.put(str, dVar);
        getThreadPool().execute(dVar);
    }

    @ReactMethod
    public void attach(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("attach", readableMap, new za3(callback, callback2));
        } catch (Exception e2) {
            callback2.invoke("Unexpected error" + e2.getMessage());
        }
    }

    @ReactMethod
    public void backgroundExecuteSqlBatch(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("backgroundExecuteSqlBatch", readableMap, new za3(callback, callback2));
        } catch (Exception e2) {
            callback2.invoke("Unexpected error" + e2.getMessage());
        }
    }

    @ReactMethod
    public void close(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute(Constants.EXTRA_CLOSE_TAI, readableMap, new za3(callback, callback2));
        } catch (Exception e2) {
            callback2.invoke("Unexpected error" + e2.getMessage());
        }
    }

    public void closeAllOpenDatabases() {
        while (!dbrmap.isEmpty()) {
            String next = dbrmap.keySet().iterator().next();
            closeDatabaseNow(next);
            try {
                dbrmap.get(next).e.put(new c());
            } catch (Exception e2) {
                cm8.j(TAG, "couldn't stop db thread for db: " + next, e2);
            }
            dbrmap.remove(next);
        }
    }

    @ReactMethod
    public void delete(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("delete", readableMap, new za3(callback, callback2));
        } catch (Exception e2) {
            callback2.invoke("Unexpected error" + e2.getMessage());
        }
    }

    @ReactMethod
    public void echoStringValue(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("echoStringValue", readableMap, new za3(callback, callback2));
        } catch (Exception unused) {
            callback2.invoke("Unexpected error");
        }
    }

    public boolean execute(String str, ReadableMap readableMap, za3 za3Var) throws Exception {
        try {
            try {
                return executeAndPossiblyThrow(b.valueOf(str), readableMap, za3Var);
            } catch (Exception e2) {
                cm8.j(TAG, "unexpected error", e2);
                za3Var.a("Unexpected error executing processing SQLite query");
                throw e2;
            }
        } catch (IllegalArgumentException e3) {
            cm8.j(TAG, "unexpected error", e3);
            za3Var.a("Unexpected error executing processing SQLite query");
            throw e3;
        }
    }

    public Context getContext() {
        return this.context;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return PLUGIN_NAME;
    }

    public ExecutorService getThreadPool() {
        return this.threadPool;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("open", readableMap, new za3(callback, callback2));
        } catch (Exception e2) {
            callback2.invoke("Unexpected error:" + e2.getMessage());
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f29565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f29566b;
        public final boolean c;
        public final String[] d;
        public final String[] e;
        public final ReadableArray[] f;
        public final za3 g;

        public c(String[] strArr, String[] strArr2, ReadableArray[] readableArrayArr, za3 za3Var) {
            this.f29565a = false;
            this.f29566b = false;
            this.c = false;
            this.d = strArr;
            this.e = strArr2;
            this.f = readableArrayArr;
            this.g = za3Var;
        }

        public c(boolean z, za3 za3Var) {
            this.f29565a = true;
            this.f29566b = true;
            this.c = z;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = za3Var;
        }

        public c() {
            this.f29565a = true;
            this.f29566b = false;
            this.c = false;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        }
    }

    @ReactMethod
    public void executeSqlBatch(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("executeSqlBatch", readableMap, new za3(callback, callback2));
        } catch (Exception unused) {
            callback2.invoke("Unexpected error");
        }
    }
}

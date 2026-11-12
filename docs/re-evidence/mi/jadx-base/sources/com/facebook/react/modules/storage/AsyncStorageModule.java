package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.cm8;
import defpackage.kl1;
import defpackage.ndj;
import defpackage.pl1;
import defpackage.xcj;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = AsyncStorageModule.NAME)
public final class AsyncStorageModule extends ReactContextBaseJavaModule {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final g executor;
    private xcj mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public class a extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f7447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f7448b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f7447a = callback;
            this.f7448b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0104  */
        /* JADX WARN: Code duplicated, block: B:43:0x010a  */
        /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) throws Throwable {
            char c;
            Cursor cursor;
            Cursor cursorQuery;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f7447a.invoke(pl1.a(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i = 0; i < this.f7448b.size(); i += 999) {
                int iMin = Math.min(this.f7448b.size() - i, 999);
                try {
                    try {
                        c = 1;
                        try {
                            cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.m().query("catalystLocalStorage", strArr, kl1.a(iMin), kl1.b(this.f7448b, i, iMin), null, null, null);
                            try {
                                try {
                                    hashSet.clear();
                                    if (cursorQuery.getCount() != this.f7448b.size()) {
                                        for (int i2 = i; i2 < i + iMin; i2++) {
                                            hashSet.add(this.f7448b.getString(i2));
                                        }
                                    }
                                    if (cursorQuery.moveToFirst()) {
                                        do {
                                            WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                            writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                            writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                            writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                            hashSet.remove(cursorQuery.getString(0));
                                        } while (cursorQuery.moveToNext());
                                    }
                                    cursorQuery.close();
                                    for (String str : hashSet) {
                                        WritableArray writableArrayCreateArray3 = Arguments.createArray();
                                        writableArrayCreateArray3.pushString(str);
                                        writableArrayCreateArray3.pushNull();
                                        writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                                    }
                                    hashSet.clear();
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e) {
                                e = e;
                                cm8.D("ReactNative", e.getMessage(), e);
                                Callback callback = this.f7447a;
                                Object[] objArr = new Object[2];
                                objArr[0] = pl1.b(null, e.getMessage());
                                objArr[c] = null;
                                callback.invoke(objArr);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                    return;
                                }
                                return;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            cursorQuery = null;
                            cm8.D("ReactNative", e.getMessage(), e);
                            Callback callback2 = this.f7447a;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = pl1.b(null, e.getMessage());
                            objArr2[c] = null;
                            callback2.invoke(objArr2);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    c = 1;
                }
            }
            this.f7447a.invoke(null, writableArrayCreateArray);
        }
    }

    public class b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f7449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f7450b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f7449a = callback;
            this.f7450b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:58:0x015b  */
        /* JADX WARN: Code duplicated, block: B:59:0x0165  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f7449a.invoke(pl1.a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.m().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().beginTransaction();
                    for (int i = 0; i < this.f7450b.size(); i++) {
                        if (this.f7450b.getArray(i).size() != 2) {
                            WritableMap writableMapD = pl1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e) {
                                cm8.D("ReactNative", e.getMessage(), e);
                                if (writableMapD == null) {
                                    pl1.b(null, e.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f7450b.getArray(i).getString(0) == null) {
                            WritableMap writableMapC = pl1.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e2) {
                                cm8.D("ReactNative", e2.getMessage(), e2);
                                if (writableMapC == null) {
                                    pl1.b(null, e2.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f7450b.getArray(i).getString(1) == null) {
                            WritableMap writableMapD2 = pl1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e3) {
                                cm8.D("ReactNative", e3.getMessage(), e3);
                                if (writableMapD2 == null) {
                                    pl1.b(null, e3.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        sQLiteStatementCompileStatement.clearBindings();
                        sQLiteStatementCompileStatement.bindString(1, this.f7450b.getArray(i).getString(0));
                        sQLiteStatementCompileStatement.bindString(2, this.f7450b.getArray(i).getString(1));
                        sQLiteStatementCompileStatement.execute();
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e4) {
                        cm8.D("ReactNative", e4.getMessage(), e4);
                        writableMapB = pl1.b(null, e4.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e5) {
                        cm8.D("ReactNative", e5.getMessage(), e5);
                        pl1.b(null, e5.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e6) {
                cm8.D("ReactNative", e6.getMessage(), e6);
                WritableMap writableMapB2 = pl1.b(null, e6.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                } catch (Exception e7) {
                    cm8.D("ReactNative", e7.getMessage(), e7);
                    if (writableMapB2 == null) {
                        writableMapB = pl1.b(null, e7.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f7449a.invoke(writableMapB);
                    } else {
                        this.f7449a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f7449a.invoke(writableMapB);
            } else {
                this.f7449a.invoke(new Object[0]);
            }
        }
    }

    public class c extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f7451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f7452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f7451a = callback;
            this.f7452b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f7451a.invoke(pl1.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().beginTransaction();
                    for (int i = 0; i < this.f7452b.size(); i += 999) {
                        int iMin = Math.min(this.f7452b.size() - i, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().delete("catalystLocalStorage", kl1.a(iMin), kl1.b(this.f7452b, i, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e) {
                        cm8.D("ReactNative", e.getMessage(), e);
                        writableMapB = pl1.b(null, e.getMessage());
                    }
                } catch (Exception e2) {
                    cm8.D("ReactNative", e2.getMessage(), e2);
                    WritableMap writableMapB2 = pl1.b(null, e2.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e3) {
                        cm8.D("ReactNative", e3.getMessage(), e3);
                        if (writableMapB2 == null) {
                            writableMapB = pl1.b(null, e3.getMessage());
                        }
                        if (writableMapB != null) {
                            this.f7451a.invoke(writableMapB);
                        } else {
                            this.f7451a.invoke(new Object[0]);
                        }
                    }
                    writableMapB = writableMapB2;
                }
                if (writableMapB != null) {
                    this.f7451a.invoke(writableMapB);
                } else {
                    this.f7451a.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                } catch (Exception e4) {
                    cm8.D("ReactNative", e4.getMessage(), e4);
                    pl1.b(null, e4.getMessage());
                }
                throw th;
            }
        }
    }

    public class d extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f7453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f7454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f7453a = callback;
            this.f7454b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:68:0x0173  */
        /* JADX WARN: Code duplicated, block: B:69:0x017d  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f7453a.invoke(pl1.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().beginTransaction();
                    for (int i = 0; i < this.f7454b.size(); i++) {
                        if (this.f7454b.getArray(i).size() != 2) {
                            WritableMap writableMapD = pl1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e) {
                                cm8.D("ReactNative", e.getMessage(), e);
                                if (writableMapD == null) {
                                    pl1.b(null, e.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f7454b.getArray(i).getString(0) == null) {
                            WritableMap writableMapC = pl1.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e2) {
                                cm8.D("ReactNative", e2.getMessage(), e2);
                                if (writableMapC == null) {
                                    pl1.b(null, e2.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f7454b.getArray(i).getString(1) == null) {
                            WritableMap writableMapD2 = pl1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e3) {
                                cm8.D("ReactNative", e3.getMessage(), e3);
                                if (writableMapD2 == null) {
                                    pl1.b(null, e3.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (!kl1.e(AsyncStorageModule.this.mReactDatabaseSupplier.m(), this.f7454b.getArray(i).getString(0), this.f7454b.getArray(i).getString(1))) {
                            WritableMap writableMapA = pl1.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e4) {
                                cm8.D("ReactNative", e4.getMessage(), e4);
                                if (writableMapA == null) {
                                    pl1.b(null, e4.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e5) {
                        cm8.D("ReactNative", e5.getMessage(), e5);
                        writableMapB = pl1.b(null, e5.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e6) {
                        cm8.D("ReactNative", e6.getMessage(), e6);
                        pl1.b(null, e6.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e7) {
                cm8.D("ReactNative", e7.getMessage(), e7);
                WritableMap writableMapB2 = pl1.b(null, e7.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                } catch (Exception e8) {
                    cm8.D("ReactNative", e8.getMessage(), e8);
                    if (writableMapB2 == null) {
                        writableMapB = pl1.b(null, e8.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f7453a.invoke(writableMapB);
                    } else {
                        this.f7453a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f7453a.invoke(writableMapB);
            } else {
                this.f7453a.invoke(new Object[0]);
            }
        }
    }

    public class e extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f7455a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f7455a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.l()) {
                this.f7455a.invoke(pl1.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.f7455a.invoke(new Object[0]);
            } catch (Exception e) {
                cm8.D("ReactNative", e.getMessage(), e);
                this.f7455a.invoke(pl1.b(null, e.getMessage()));
            }
        }
    }

    public class f extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f7457a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f7457a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f7457a.invoke(pl1.a(null), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.m().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    this.f7457a.invoke(null, writableArrayCreateArray);
                } catch (Exception e) {
                    cm8.D("ReactNative", e.getMessage(), e);
                    this.f7457a.invoke(pl1.b(null, e.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public class g implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<Runnable> f7459a = new ArrayDeque<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f7460b;
        public final Executor c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f7461a;

            public a(Runnable runnable) {
                this.f7461a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f7461a.run();
                } finally {
                    g.this.a();
                }
            }
        }

        public g(Executor executor) {
            this.c = executor;
        }

        public synchronized void a() {
            Runnable runnablePoll = this.f7459a.poll();
            this.f7460b = runnablePoll;
            if (runnablePoll != null) {
                this.c.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f7459a.offer(new a(runnable));
            if (this.f7460b == null) {
                a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.l();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.b();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(pl1.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(pl1.c(null));
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(pl1.c(null));
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new g(executor);
        this.mReactDatabaseSupplier = xcj.n(reactApplicationContext);
    }
}

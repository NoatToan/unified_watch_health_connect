package com.reactnativecommunity.asyncstorage;

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
import defpackage.jl1;
import defpackage.ndj;
import defpackage.ol1;
import defpackage.wcj;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = AsyncStorageModule.NAME)
public final class AsyncStorageModule extends ReactContextBaseJavaModule {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNC_AsyncSQLiteDBStorage";
    private final g executor;
    private wcj mReactDatabaseSupplier;
    private boolean mShuttingDown;

    public class a extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f10479b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f10478a = callback;
            this.f10479b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f10478a.invoke(ol1.a(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i = 0; i < this.f10479b.size(); i += 999) {
                int iMin = Math.min(this.f10479b.size() - i, 999);
                Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.m().query("catalystLocalStorage", strArr, jl1.a(iMin), jl1.b(this.f10479b, i, iMin), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != this.f10479b.size()) {
                            for (int i2 = i; i2 < i + iMin; i2++) {
                                hashSet.add(this.f10479b.getString(i2));
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
                    } catch (Exception e) {
                        cm8.D("ReactNative", e.getMessage(), e);
                        this.f10478a.invoke(ol1.b(null, e.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            this.f10478a.invoke(null, writableArrayCreateArray);
        }
    }

    public class b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f10481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f10480a = callback;
            this.f10481b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:58:0x015b  */
        /* JADX WARN: Code duplicated, block: B:59:0x0165  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f10480a.invoke(ol1.a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.m().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().beginTransaction();
                    for (int i = 0; i < this.f10481b.size(); i++) {
                        if (this.f10481b.getArray(i).size() != 2) {
                            WritableMap writableMapD = ol1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e) {
                                cm8.D("ReactNative", e.getMessage(), e);
                                if (writableMapD == null) {
                                    ol1.b(null, e.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f10481b.getArray(i).getString(0) == null) {
                            WritableMap writableMapC = ol1.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e2) {
                                cm8.D("ReactNative", e2.getMessage(), e2);
                                if (writableMapC == null) {
                                    ol1.b(null, e2.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f10481b.getArray(i).getString(1) == null) {
                            WritableMap writableMapD2 = ol1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e3) {
                                cm8.D("ReactNative", e3.getMessage(), e3);
                                if (writableMapD2 == null) {
                                    ol1.b(null, e3.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        sQLiteStatementCompileStatement.clearBindings();
                        sQLiteStatementCompileStatement.bindString(1, this.f10481b.getArray(i).getString(0));
                        sQLiteStatementCompileStatement.bindString(2, this.f10481b.getArray(i).getString(1));
                        sQLiteStatementCompileStatement.execute();
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e4) {
                        cm8.D("ReactNative", e4.getMessage(), e4);
                        writableMapB = ol1.b(null, e4.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e5) {
                        cm8.D("ReactNative", e5.getMessage(), e5);
                        ol1.b(null, e5.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e6) {
                cm8.D("ReactNative", e6.getMessage(), e6);
                WritableMap writableMapB2 = ol1.b(null, e6.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                } catch (Exception e7) {
                    cm8.D("ReactNative", e7.getMessage(), e7);
                    if (writableMapB2 == null) {
                        writableMapB = ol1.b(null, e7.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f10480a.invoke(writableMapB);
                    } else {
                        this.f10480a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f10480a.invoke(writableMapB);
            } else {
                this.f10480a.invoke(new Object[0]);
            }
        }
    }

    public class c extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f10483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f10482a = callback;
            this.f10483b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f10482a.invoke(ol1.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().beginTransaction();
                    for (int i = 0; i < this.f10483b.size(); i += 999) {
                        int iMin = Math.min(this.f10483b.size() - i, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().delete("catalystLocalStorage", jl1.a(iMin), jl1.b(this.f10483b, i, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e) {
                        cm8.D("ReactNative", e.getMessage(), e);
                        writableMapB = ol1.b(null, e.getMessage());
                    }
                } catch (Exception e2) {
                    cm8.D("ReactNative", e2.getMessage(), e2);
                    WritableMap writableMapB2 = ol1.b(null, e2.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e3) {
                        cm8.D("ReactNative", e3.getMessage(), e3);
                        if (writableMapB2 == null) {
                            writableMapB = ol1.b(null, e3.getMessage());
                        }
                        if (writableMapB != null) {
                            this.f10482a.invoke(writableMapB);
                        } else {
                            this.f10482a.invoke(new Object[0]);
                        }
                    }
                    writableMapB = writableMapB2;
                }
                if (writableMapB != null) {
                    this.f10482a.invoke(writableMapB);
                } else {
                    this.f10482a.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                } catch (Exception e4) {
                    cm8.D("ReactNative", e4.getMessage(), e4);
                    ol1.b(null, e4.getMessage());
                }
                throw th;
            }
        }
    }

    public class d extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f10485b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f10484a = callback;
            this.f10485b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:68:0x0173  */
        /* JADX WARN: Code duplicated, block: B:69:0x017d  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f10484a.invoke(ol1.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().beginTransaction();
                    for (int i = 0; i < this.f10485b.size(); i++) {
                        if (this.f10485b.getArray(i).size() != 2) {
                            WritableMap writableMapD = ol1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e) {
                                cm8.D("ReactNative", e.getMessage(), e);
                                if (writableMapD == null) {
                                    ol1.b(null, e.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f10485b.getArray(i).getString(0) == null) {
                            WritableMap writableMapC = ol1.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e2) {
                                cm8.D("ReactNative", e2.getMessage(), e2);
                                if (writableMapC == null) {
                                    ol1.b(null, e2.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f10485b.getArray(i).getString(1) == null) {
                            WritableMap writableMapD2 = ol1.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e3) {
                                cm8.D("ReactNative", e3.getMessage(), e3);
                                if (writableMapD2 == null) {
                                    ol1.b(null, e3.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (!jl1.e(AsyncStorageModule.this.mReactDatabaseSupplier.m(), this.f10485b.getArray(i).getString(0), this.f10485b.getArray(i).getString(1))) {
                            WritableMap writableMapA = ol1.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                                return;
                            } catch (Exception e4) {
                                cm8.D("ReactNative", e4.getMessage(), e4);
                                if (writableMapA == null) {
                                    ol1.b(null, e4.getMessage());
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
                        writableMapB = ol1.b(null, e5.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                    } catch (Exception e6) {
                        cm8.D("ReactNative", e6.getMessage(), e6);
                        ol1.b(null, e6.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e7) {
                cm8.D("ReactNative", e7.getMessage(), e7);
                WritableMap writableMapB2 = ol1.b(null, e7.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m().endTransaction();
                } catch (Exception e8) {
                    cm8.D("ReactNative", e8.getMessage(), e8);
                    if (writableMapB2 == null) {
                        writableMapB = ol1.b(null, e8.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f10484a.invoke(writableMapB);
                    } else {
                        this.f10484a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f10484a.invoke(writableMapB);
            } else {
                this.f10484a.invoke(new Object[0]);
            }
        }
    }

    public class e extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f10486a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.l()) {
                this.f10486a.invoke(ol1.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.f10486a.invoke(new Object[0]);
            } catch (Exception e) {
                cm8.D("ReactNative", e.getMessage(), e);
                this.f10486a.invoke(ol1.b(null, e.getMessage()));
            }
        }
    }

    public class f extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10488a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f10488a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f10488a.invoke(ol1.a(null), null);
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
                    this.f10488a.invoke(null, writableArrayCreateArray);
                } catch (Exception e) {
                    cm8.D("ReactNative", e.getMessage(), e);
                    this.f10488a.invoke(ol1.b(null, e.getMessage()), null);
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
        public final ArrayDeque<Runnable> f10490a = new ArrayDeque<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f10491b;
        public final Executor c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f10492a;

            public a(Runnable runnable) {
                this.f10492a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f10492a.run();
                } finally {
                    g.this.a();
                }
            }
        }

        public g(Executor executor) {
            this.c = executor;
        }

        public synchronized void a() {
            Runnable runnablePoll = this.f10490a.poll();
            this.f10491b = runnablePoll;
            if (runnablePoll != null) {
                this.c.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.f10490a.offer(new a(runnable));
            if (this.f10491b == null) {
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
            callback.invoke(ol1.c(null), null);
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
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
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
        this.mReactDatabaseSupplier = wcj.n(reactApplicationContext);
    }
}

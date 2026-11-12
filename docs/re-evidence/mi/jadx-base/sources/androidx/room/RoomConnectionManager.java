package androidx.room;

import androidx.room.RoomConnectionManager;
import androidx.room.coroutines.AndroidSQLiteDriverConnectionPool;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.driver.SupportSQLiteConnectionPool;
import androidx.room.driver.SupportSQLiteDriver;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.driver.AndroidSQLiteDriver;
import com.miui.tsmclient.util.Constants;
import com.tencent.wcdb.database.SQLiteDatabaseConfiguration;
import com.xiaomi.onetrack.c.q;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u000212B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0006\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J@\u0010\u001f\u001a\u0002H \"\u0004\b\u0000\u0010 2\u0006\u0010!\u001a\u00020\"2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0&\u0012\u0006\u0012\u0004\u0018\u00010'0$H\u0096@¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0010¢\u0006\u0002\b,J\u0006\u0010-\u001a\u00020\u001eJ\u0006\u0010.\u001a\u00020\"J \u0010/\u001a\u00020\u0003*\u00020\u00032\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001e0\tH\u0002R\u0014\u0010\f\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Landroidx/room/RoomConnectionManager;", "Landroidx/room/BaseRoomConnectionManager;", q.f13857a, "Landroidx/room/DatabaseConfiguration;", "openDelegate", "Landroidx/room/RoomOpenDelegate;", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenDelegate;)V", "supportOpenHelperFactory", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "(Landroidx/room/DatabaseConfiguration;Lkotlin/jvm/functions/Function1;)V", "configuration", "getConfiguration", "()Landroidx/room/DatabaseConfiguration;", "getOpenDelegate", "()Landroidx/room/RoomOpenDelegate;", "callbacks", "", "Landroidx/room/RoomDatabase$Callback;", "getCallbacks", "()Ljava/util/List;", "connectionPool", "Landroidx/room/coroutines/ConnectionPool;", "supportOpenHelper", "getSupportOpenHelper$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "supportDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "init", "", "useConnection", "R", "isReadOnly", "", "block", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveFileName", "", "fileName", "resolveFileName$room_runtime_release", Constants.EXTRA_CLOSE_TAI, "isSupportDatabaseOpen", "installOnOpenCallback", "onOpen", "SupportOpenHelperCallback", "NoOpOpenDelegate", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomConnectionManager extends BaseRoomConnectionManager {

    @NotNull
    private final List<RoomDatabase.Callback> callbacks;

    @NotNull
    private final DatabaseConfiguration configuration;

    @NotNull
    private final ConnectionPool connectionPool;

    @NotNull
    private final RoomOpenDelegate openDelegate;

    @Nullable
    private SupportSQLiteDatabase supportDatabase;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/room/RoomConnectionManager$NoOpOpenDelegate;", "Landroidx/room/RoomOpenDelegate;", "<init>", "()V", "onCreate", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "onPreMigrate", "onValidateSchema", "Landroidx/room/RoomOpenDelegate$ValidationResult;", "onPostMigrate", "onOpen", "createAllTables", "dropAllTables", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // androidx.room.RoomOpenDelegate
        @NotNull
        public RoomOpenDelegate.ValidationResult onValidateSchema(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Landroidx/room/RoomConnectionManager$SupportOpenHelperCallback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "version", "", "<init>", "(Landroidx/room/RoomConnectionManager;I)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "onDowngrade", "onOpen", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i) {
            super(i);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            RoomConnectionManager.this.onCreate(new SupportSQLiteConnection(db));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onDowngrade(@NotNull SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db, "db");
            onUpgrade(db, oldVersion, newVersion);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onOpen(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            RoomConnectionManager.this.onOpen(new SupportSQLiteConnection(db));
            RoomConnectionManager.this.supportDatabase = db;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(@NotNull SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db, "db");
            RoomConnectionManager.this.onMigrate(new SupportSQLiteConnection(db), oldVersion, newVersion);
        }
    }

    public RoomConnectionManager(@NotNull DatabaseConfiguration config, @NotNull RoomOpenDelegate openDelegate) {
        ConnectionPool connectionPoolNewSingleConnectionPool;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(openDelegate, "openDelegate");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        SQLiteDriver sQLiteDriver = config.sqliteDriver;
        if (sQLiteDriver != null) {
            boolean z = sQLiteDriver instanceof AndroidSQLiteDriver;
            String str = SQLiteDatabaseConfiguration.MEMORY_DB_PATH;
            if (z) {
                BaseRoomConnectionManager.DriverWrapper driverWrapper = new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver);
                String str2 = config.name;
                connectionPoolNewSingleConnectionPool = new AndroidSQLiteDriverConnectionPool(driverWrapper, str2 != null ? str2 : str);
            } else {
                connectionPoolNewSingleConnectionPool = config.name == null ? ConnectionPoolKt.newSingleConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), SQLiteDatabaseConfiguration.MEMORY_DB_PATH) : ConnectionPoolKt.newConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), config.name, getMaxNumberOfReaders(config.journalMode), getMaxNumberOfWriters(config.journalMode));
            }
            this.connectionPool = connectionPoolNewSingleConnectionPool;
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!".toString());
            }
            this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(config.context).name(config.name).callback(new SupportOpenHelperCallback(openDelegate.getVersion())).build())));
        }
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(RoomConnectionManager roomConnectionManager, SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        roomConnectionManager.supportDatabase = db;
        return Unit.INSTANCE;
    }

    private final void init() {
        boolean z = getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z);
        }
    }

    private final DatabaseConfiguration installOnOpenCallback(DatabaseConfiguration databaseConfiguration, final Function1<? super SupportSQLiteDatabase, Unit> function1) {
        List<RoomDatabase.Callback> listEmptyList = databaseConfiguration.callbacks;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return DatabaseConfiguration.copy$default(databaseConfiguration, null, null, null, null, CollectionsKt___CollectionsKt.plus((Collection<? extends RoomDatabase.Callback>) listEmptyList, new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public void onOpen(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                function1.invoke2(db);
            }
        }), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final void close() {
        this.connectionPool.close();
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    public List<RoomDatabase.Callback> getCallbacks() {
        return this.callbacks;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    public DatabaseConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    public RoomOpenDelegate getOpenDelegate() {
        return this.openDelegate;
    }

    @Nullable
    public final SupportSQLiteOpenHelper getSupportOpenHelper$room_runtime_release() {
        SupportSQLiteDriver supportDriver;
        ConnectionPool connectionPool = this.connectionPool;
        SupportSQLiteConnectionPool supportSQLiteConnectionPool = connectionPool instanceof SupportSQLiteConnectionPool ? (SupportSQLiteConnectionPool) connectionPool : null;
        if (supportSQLiteConnectionPool == null || (supportDriver = supportSQLiteConnectionPool.getSupportDriver()) == null) {
            return null;
        }
        return supportDriver.getOpenHelper();
    }

    public final boolean isSupportDatabaseOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @NotNull
    public String resolveFileName$room_runtime_release(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (Intrinsics.areEqual(fileName, SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @Nullable
    public <R> Object useConnection(boolean z, @NotNull Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return this.connectionPool.useConnection(z, function2, continuation);
    }

    public RoomConnectionManager(@NotNull DatabaseConfiguration config, @NotNull Function1<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper> supportOpenHelperFactory) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.configuration = config;
        this.openDelegate = new NoOpOpenDelegate();
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(supportOpenHelperFactory.invoke2(installOnOpenCallback(config, new Function1() { // from class: qwk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RoomConnectionManager._init_$lambda$1(this.f31913a, (SupportSQLiteDatabase) obj);
            }
        }))));
        init();
    }
}

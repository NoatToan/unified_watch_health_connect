package com.xiaomi.fitness.eco.device.manager.dao;

import android.app.Application;
import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.database.BaseDatabase;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Database(entities = {EcoDevice.class}, exportSchema = false, version = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDatabase;", "Lcom/xiaomi/fitness/database/BaseDatabase;", "<init>", "()V", "getEcoDeviceDao", "Lcom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDao;", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoDeviceDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceDatabase.kt\ncom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDatabase\n+ 2 BaseDatabase.kt\ncom/xiaomi/fitness/database/BaseDatabase$Companion\n*L\n1#1,38:1\n20#2,8:39\n*S KotlinDebug\n*F\n+ 1 EcoDeviceDatabase.kt\ncom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDatabase\n*L\n21#1:39,8\n*E\n"})
public abstract class EcoDeviceDatabase extends BaseDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DB_NAME = "eco_device_db";

    @NotNull
    private static final EcoDeviceDatabase instance;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDatabase$Companion;", "", "<init>", "()V", "DB_NAME", "", "instance", "Lcom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDatabase;", "getInstance", "()Lcom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDatabase;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EcoDeviceDatabase getInstance() {
            return EcoDeviceDatabase.instance;
        }
    }

    static {
        Application application = ApplicationExtKt.getApplication();
        final String str = DB_NAME;
        instance = (EcoDeviceDatabase) ((BaseDatabase) new SingleHolder(new Function1<Context, EcoDeviceDatabase>() { // from class: com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDatabase$special$$inlined$getInstance$1
            /* JADX WARN: Type inference failed for: r3v5, types: [com.xiaomi.fitness.database.BaseDatabase, com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDatabase] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final EcoDeviceDatabase invoke2(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RoomDatabase.Builder builderDatabaseBuilder = Room.databaseBuilder(ApplicationExtKt.getSafeContext(it), EcoDeviceDatabase.class, str);
                builderDatabaseBuilder.addCallback(new RoomDatabase.Callback() { // from class: com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDatabase$Companion$instance$1$1
                    @Override // androidx.room.RoomDatabase.Callback
                    public void onCreate(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onCreate(db);
                        Logger.i("eco_device_db db is created", new Object[0]);
                    }

                    @Override // androidx.room.RoomDatabase.Callback
                    public void onOpen(SupportSQLiteDatabase db) {
                        Intrinsics.checkNotNullParameter(db, "db");
                        super.onOpen(db);
                        Logger.i("eco_device_db db is opened", new Object[0]);
                    }
                });
                return (BaseDatabase) builderDatabaseBuilder.allowMainThreadQueries().build();
            }
        }).getInstance(application));
    }

    @NotNull
    public abstract EcoDeviceDao getEcoDeviceDao();
}

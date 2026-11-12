package com.xiaomi.hm.health.device.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.hmchartui.utils.Constant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.database.dao.DeviceRecordDao;
import com.xiaomi.hm.health.device.database.entity.DeviceRecordEntity;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Database(entities = {DeviceRecordEntity.class}, exportSchema = false, version = 2)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/database/DeviceDataDb;", "Landroidx/room/RoomDatabase;", "Lcom/xiaomi/hm/health/device/database/dao/DeviceRecordDao;", "deviceRecordDao", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class DeviceDataDb extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "DeviceDataDb";

    @NotNull
    private static final String b = "userId";

    @NotNull
    private static final String c = "device_data_userId.db";

    @Nullable
    private static DeviceDataDb d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/database/DeviceDataDb$Companion;", "", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/database/DeviceDataDb;", PointCategory.INIT, "create", "getInstance", "", "logout", "DB_NAME", "Ljava/lang/String;", "TAG", Constant.USER_ID, DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/device/database/DeviceDataDb;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return String.valueOf(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return PointCategory.INIT;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "DeviceDataDb ignore logout";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a() {
            try {
                String userid = HMPersonInfo.getInstance().getUserInfo().getUserid();
                if (userid == null) {
                    userid = "";
                }
                return m.replace$default(DeviceDataDb.c, "userId", userid, false, 4, (Object) null);
            } catch (Exception e) {
                HMLog.error$default("INIT-DB", null, e, new a(e), 2, null);
                return DeviceDataDb.c;
            }
        }

        @NotNull
        public final DeviceDataDb create(@NotNull Context context) {
            return (DeviceDataDb) Room.databaseBuilder(context, DeviceDataDb.class, a()).fallbackToDestructiveMigration().build();
        }

        @NotNull
        public final DeviceDataDb getInstance() {
            DeviceDataDb deviceDataDb = DeviceDataDb.d;
            Objects.requireNonNull(deviceDataDb, "DeviceData db not init");
            return deviceDataDb;
        }

        @NotNull
        public final synchronized DeviceDataDb init(@NotNull Context context) {
            DeviceDataDb deviceDataDbCreate;
            deviceDataDbCreate = DeviceDataDb.d;
            if (deviceDataDbCreate == null) {
                deviceDataDbCreate = create(context);
                DeviceDataDb.d = deviceDataDbCreate;
                HMLog.info(DeviceDataDb.a, b.a);
            }
            return deviceDataDbCreate;
        }

        public final synchronized void logout() {
            DeviceDataDb deviceDataDb = DeviceDataDb.d;
            if (deviceDataDb == null) {
                HMLog.info(DeviceDataDb.a, c.a);
                return;
            }
            if (deviceDataDb.isOpen()) {
                deviceDataDb.close();
            }
            DeviceDataDb.d = null;
        }
    }

    @NotNull
    public abstract DeviceRecordDao deviceRecordDao();
}

package com.xiaomi.hm.health.bt.profile.gdsp.log;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPApiFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPSyncTask;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GeneralDataSensingProcedureApi;
import java.io.File;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/log/LogTaskFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LogTaskFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "LogTaskFactory";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/log/LogTaskFactory$Companion;", "", "", "supportV1", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "baseProfile", "Ljava/io/File;", "file", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "callback", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "create", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HMBaseTask create(boolean supportV1, @NotNull BaseProfile baseProfile, @NotNull File file, @NotNull IHMDataCallback<File> callback) {
            if (!supportV1) {
                return new HMSyncLogTask(baseProfile, file, callback);
            }
            GeneralDataSensingProcedureApi generalDataSensingProcedureApiCreate = GDSPApiFactory.INSTANCE.create(baseProfile);
            if (generalDataSensingProcedureApiCreate != null) {
                return new GDSPSyncTask(7, Calendar.getInstance(), generalDataSensingProcedureApiCreate, new LogDataHandler(file, callback), new LogDataInterceptor(file));
            }
            Debug.fi(LogTaskFactory.a, "GDSP API is null");
            return null;
        }
    }
}

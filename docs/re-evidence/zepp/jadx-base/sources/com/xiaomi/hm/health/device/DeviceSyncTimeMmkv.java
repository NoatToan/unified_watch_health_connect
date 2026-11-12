package com.xiaomi.hm.health.device;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0005R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/DeviceSyncTimeMmkv;", "", "", "isFirstSync", "isFirst", "", "setIsFirstSync", "isFirstSyncHr", "setIsFirstSyncHr", "onDeviceFirstEnable", "", "a", "Ljava/lang/String;", "TAG", "b", "DEVICE_SYNC_TIME_MMKV_NAME", "c", "IS_FIRST_SYNC_KEY", GoogleApiAvailabilityLight.a, "IS_FIRST_SYNC_HR_KEY", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "e", "Lkotlin/Lazy;", "()Lcom/huami/utils/persistence/kvkit/KvPersistence;", "sKv", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceSyncTimeMmkv {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "DeviceSyncTimeMmkv";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String DEVICE_SYNC_TIME_MMKV_NAME = "device_sync_time_mmkv";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String IS_FIRST_SYNC_KEY = "is_first_sync";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String IS_FIRST_SYNC_HR_KEY = "is_first_sync_hr";

    @NotNull
    public static final DeviceSyncTimeMmkv INSTANCE = new DeviceSyncTimeMmkv();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy sKv = LazyKt__LazyJVMKt.lazy(d.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "is first sync data:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "is first sync hr:" + this.a;
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
            return "set all is first sync";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<KvPersistence> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KvPersistence invoke() {
            return KvKit.getKvPersistence(DeviceSyncTimeMmkv.DEVICE_SYNC_TIME_MMKV_NAME, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set is first sync data:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set is first sync hr:" + this.a;
        }
    }

    private DeviceSyncTimeMmkv() {
    }

    private final KvPersistence a() {
        return (KvPersistence) sKv.getValue();
    }

    public final boolean isFirstSync() {
        Boolean bool = (Boolean) a().getValue(IS_FIRST_SYNC_KEY, Boolean.TRUE);
        HMLog.info(TAG, new a(bool.booleanValue()));
        return bool.booleanValue();
    }

    public final boolean isFirstSyncHr() {
        Boolean bool = (Boolean) a().getValue(IS_FIRST_SYNC_HR_KEY, Boolean.TRUE);
        HMLog.info(TAG, new b(bool.booleanValue()));
        return bool.booleanValue();
    }

    public final void onDeviceFirstEnable() {
        HMLog.info(TAG, c.a);
        KvPersistence kvPersistenceA = a();
        Boolean bool = Boolean.TRUE;
        kvPersistenceA.setValue(IS_FIRST_SYNC_KEY, bool);
        a().setValue(IS_FIRST_SYNC_HR_KEY, bool);
    }

    public final void setIsFirstSync(boolean isFirst) {
        HMLog.info(TAG, new e(isFirst));
        a().setValue(IS_FIRST_SYNC_KEY, Boolean.valueOf(isFirst));
    }

    public final void setIsFirstSyncHr(boolean isFirst) {
        HMLog.info(TAG, new f(isFirst));
        a().setValue(IS_FIRST_SYNC_KEY, Boolean.valueOf(isFirst));
    }
}

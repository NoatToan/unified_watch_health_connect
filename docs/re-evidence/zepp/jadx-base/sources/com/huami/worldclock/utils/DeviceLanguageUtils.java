package com.huami.worldclock.utils;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/worldclock/utils/DeviceLanguageUtils;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Ljava/util/Locale;", "parseDeviceLanguageToLocale", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceLanguageUtils {

    @NotNull
    public static final DeviceLanguageUtils INSTANCE = new DeviceLanguageUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "DeviceLanguageUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "miLiDevice is not HMMiLiProDevice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "deviceInfo is  null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "deviceInfo is  null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "otherVersion is  null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "otherVersion is  null";
        }
    }

    private DeviceLanguageUtils() {
    }

    @Nullable
    public final Locale parseDeviceLanguageToLocale(@Nullable HMBaseDevice hmBaseDevice) {
        HMOtherVersion otherVersion;
        if (hmBaseDevice == null || !(hmBaseDevice instanceof HMMiLiProDevice)) {
            HMLog.info(TAG, a.a);
            return null;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hmBaseDevice;
        boolean z = hMMiLiProDevice.getDeviceInfo() == null;
        if (z) {
            HMLog.info(TAG, e.a);
            return null;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        DeviceInfo deviceInfo = hMMiLiProDevice.getDeviceInfo();
        boolean z2 = deviceInfo.getOtherVersion() == null;
        if (z2) {
            HMLog.info(TAG, f.a);
            otherVersion = null;
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            otherVersion = deviceInfo.getOtherVersion();
        }
        int language = 2;
        if (otherVersion != null) {
            try {
                HMLanguage language2 = otherVersion.getLanguage();
                if (language2 != null) {
                    language = language2.getLanguage();
                }
            } catch (Throwable th) {
                HMLog.info(TAG, new b(th));
                return null;
            }
        }
        return HmLocale.getLocale(language);
    }

    @Nullable
    public final Locale parseDeviceLanguageToLocale(@Nullable DeviceInfo deviceInfo) {
        HMOtherVersion otherVersion;
        if (deviceInfo == null) {
            HMLog.info(TAG, c.a);
            return null;
        }
        boolean z = deviceInfo.getOtherVersion() == null;
        if (z) {
            HMLog.info(TAG, g.a);
            otherVersion = null;
        } else if (!z) {
            otherVersion = deviceInfo.getOtherVersion();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int language = 2;
        if (otherVersion != null) {
            try {
                HMLanguage language2 = otherVersion.getLanguage();
                if (language2 != null) {
                    language = language2.getLanguage();
                }
            } catch (Exception e2) {
                HMLog.info(TAG, new d(e2));
                return null;
            }
        }
        return HmLocale.getLocale(language);
    }
}

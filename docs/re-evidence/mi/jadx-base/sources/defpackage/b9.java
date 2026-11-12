package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\bH&J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0016\u0010\rJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0019H&¨\u0006\u001a"}, d2 = {"Lb9;", "", "", PluginDeviceInfo.FICONON, "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "(Z)Ljava/lang/Boolean;", "", "interval", PluginDeviceInfo.FMODEL, "(I)Ljava/lang/Boolean;", PluginDeviceInfo.FICONOFFLINE, "()Ljava/lang/Integer;", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONOFF, "isNewHealthDetect", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "Lqe;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f3931a = a.f3932a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lb9$a;", "", "ecfLock", "Ljava/lang/Object;", PluginDeviceInfo.FMODEL, "()Ljava/lang/Object;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f3932a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Object f3933b = new Object();

        @NotNull
        public final Object a() {
            return f3933b;
        }
    }

    @Nullable
    Boolean a(int interval);

    @Nullable
    Boolean a(boolean isEnable);

    @Nullable
    qe a();

    boolean a(@NotNull HMHrReminder hrReminder);

    boolean a(boolean isEnable, boolean isNewHealthDetect);

    @Nullable
    Boolean b();

    boolean b(boolean isEnable);

    @Nullable
    Boolean c();

    @Nullable
    Boolean c(boolean isEnable);

    @Nullable
    Boolean d();

    boolean d(boolean isEnable);

    @Nullable
    Integer e();

    boolean enableSmartSpo2(boolean isEnable);

    @Nullable
    Integer getLowSpo2AlertValue();

    @Nullable
    Boolean getOsaEnable();

    @Nullable
    Boolean getSmartSpo2Enable();

    @Nullable
    Boolean setAtrialFibEnable(boolean isEnable);

    boolean setLowSpo2AlertValue(int value);
}

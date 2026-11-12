package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ?\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\nJG\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\t\u0010\rJS\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u001a\u0010\t\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138@X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u0019"}, d2 = {"Lgv;", "", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "message", "", "args", "", PluginDeviceInfo.FMODEL, "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", PluginDeviceInfo.FDESC, "code", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "", "priority", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "tag", "", "Ljava/lang/ThreadLocal;", "explicitTag", "Ljava/lang/ThreadLocal;", "()Ljava/lang/ThreadLocal;", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
public abstract class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<String> f19357a = new ThreadLocal<>();

    public static /* synthetic */ void b(gv gvVar, Throwable th, String str, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        gvVar.b(th, str, objArr);
    }

    @NotNull
    public final /* synthetic */ ThreadLocal<String> a() {
        return this.f19357a;
    }

    public abstract void a(int priority, @Nullable String code, @Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    public abstract void a(@NotNull String code, @Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    public abstract void a(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    public abstract boolean a(@Nullable String tag, int priority);

    public abstract void b(@Nullable Throwable t, @Nullable String message, @NotNull Object... args);

    public static /* synthetic */ void a(gv gvVar, Throwable th, String str, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        gvVar.a(th, str, objArr);
    }

    public static /* synthetic */ void a(gv gvVar, String str, Throwable th, String str2, Object[] objArr, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            gvVar.a(str, th, str2, objArr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
    }
}

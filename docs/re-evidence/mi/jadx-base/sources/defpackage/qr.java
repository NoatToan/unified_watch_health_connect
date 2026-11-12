package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0005\u0010\u000bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lqr;", "Lp7t;", "", "result", "", PluginDeviceInfo.FMODEL, "(Z)V", PluginDeviceInfo.FDESC, "()Z", "Lp4;", "checkData", "(Lp4;)V", "", "data", "([B)V", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class qr implements p7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f31757a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.p7t
    public abstract /* synthetic */ void a();

    @Override // defpackage.p7t
    public abstract /* synthetic */ void a(bft bftVar);

    public abstract void a(@NotNull CheckData checkData);

    @Override // defpackage.p7t
    public void a(@Nullable byte[] data) {
    }

    public final boolean b() {
        return true;
    }

    @Override // defpackage.p7t
    public void a(boolean result) {
        if (result) {
            return;
        }
        a(new CheckData(false));
    }
}

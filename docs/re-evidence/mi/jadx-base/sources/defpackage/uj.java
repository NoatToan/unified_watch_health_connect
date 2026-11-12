package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H\u0016J$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Luj;", "", "", PluginDeviceInfo.FDESC, PluginDeviceInfo.FMODEL, "Lkd;", "device", "Lik;", "eventType", "", "eventExtra", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public interface uj {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static void a(@NotNull uj ujVar) {
        }

        public static /* synthetic */ void a(uj ujVar, kd kdVar, ik ikVar, byte[] bArr, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postEvent");
            }
            if ((i & 4) != 0) {
                bArr = null;
            }
            ujVar.a(kdVar, ikVar, bArr);
        }

        public static void a(@NotNull uj ujVar, @NotNull kd device, @NotNull ik eventType, @Nullable byte[] bArr) {
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            q1t q1tVar = new q1t(device.Q(), eventType);
            if (bArr != null) {
                q1tVar.a(bArr);
            }
            t5t.d("LFEventAdapter", "Post LF event:" + q1tVar);
            kd8.b().h(q1tVar);
            if (!(device instanceof ne)) {
                t5t.d("LFEventAdapter", "Not mili pro device,drop event:" + q1tVar);
                return;
            }
            ((ne) device).a(q1tVar);
        }
    }

    void a();

    void a(@NotNull kd device, @NotNull ik eventType, @Nullable byte[] eventExtra);

    void b();
}

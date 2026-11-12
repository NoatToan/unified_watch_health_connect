package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lrp;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f32761a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lrp$a;", "", "", "data", "Lkj;", PluginDeviceInfo.FMODEL, "", "QUERY_IMAGE_FORMAT", "I", "RESPONSE_IMAGE_FORMAT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ImageFormat a(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte b2 = data[0];
            dl.a(data[1], data[2]);
            int iA = dl.a(data, 3);
            dl.a(data, 3, iA);
            int i = iA + 2;
            if (data[iA + 1] != 1) {
                return null;
            }
            int i2 = data[i] & 255;
            int iA2 = dl.a(data[iA + 3], data[iA + 4]);
            byte b3 = data[iA + 5];
            return new ImageFormat(jj.u.a(i2), iA2, dl.a(b3, data[iA + 6]), data[iA + 7] & 255);
        }
    }
}

package cy2;

import android.os.Parcel;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcy2/h;", "", "Lo4/d0;", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f56838a = new h();

    private h() {
    }

    public static d0 a(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return d0.a(f0.b(parcel.readInt()));
        }
        return null;
    }

    public static void b(d0 d0Var, Parcel parcel) {
        if (d0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(f0.j(d0Var.f128833a));
        }
    }
}

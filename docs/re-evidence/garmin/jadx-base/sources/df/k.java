package df;

import android.net.NetworkRequest;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldf/k;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f59411a = new k();

    private k() {
    }

    public static m a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i14 : iArr) {
            try {
                builder.addCapability(i14);
            } catch (IllegalArgumentException unused) {
                ue.u uVarA = ue.u.a();
                m.f59413b.getClass();
                m.a aVar = m.f59413b;
                uVarA.getClass();
            }
        }
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = n.f59415a[i15];
            if (!p13.u.x(iArr, i16)) {
                try {
                    builder.removeCapability(i16);
                } catch (IllegalArgumentException unused2) {
                    ue.u uVarA2 = ue.u.a();
                    m.f59413b.getClass();
                    m.a aVar2 = m.f59413b;
                    uVarA2.getClass();
                }
            }
        }
        for (int i17 : iArr2) {
            builder.addTransportType(i17);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new m(networkRequestBuild);
    }
}

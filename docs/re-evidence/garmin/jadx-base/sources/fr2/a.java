package fr2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.k0;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfr2/a;", "Lfr2/f;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<Long, ? extends ns2.a<? extends ms2.e>> f73321h;

    static {
        new C1479a(null);
    }

    public a() {
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f73321h = k0Var;
    }

    public static hs2.e.a E4(br2.f fVar) {
        fVar.getClass();
        w.f140538a.getClass();
        return w.f140543f.get(Long.valueOf(fVar.f19599a));
    }

    public final boolean F4(long j8) {
        List<br2.f> listD = s1().d();
        if (listD == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((br2.f) obj).f19599a == j8) {
                arrayList.add(obj);
            }
        }
        return ((br2.f) h0.b0(arrayList)).f19602d == br2.d.CONNECTED;
    }

    /* JADX INFO: renamed from: fr2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfr2/a$a;", "", "<init>", "()V", "", "PASSCODE_CHECK_TIMEOUT", "J", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1479a {
        public /* synthetic */ C1479a(j jVar) {
            this();
        }

        private C1479a() {
        }
    }
}

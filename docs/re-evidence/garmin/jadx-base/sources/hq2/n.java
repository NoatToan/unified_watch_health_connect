package hq2;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhq2/n;", "Lhq2/r;", "Lhs2/d;", "device", "Lhq2/p;", "userProvider", "Lhs2/a;", TtmlNode.TAG_METADATA, "<init>", "(Lhs2/d;Lhq2/p;Lhs2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f85263g = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hs2.d dVar, p pVar, hs2.a aVar) {
        super(dVar, pVar, aVar);
        dVar.getClass();
        pVar.getClass();
        aVar.getClass();
    }

    @Override // ms2.d
    /* JADX INFO: renamed from: a */
    public final is2.b getF205815a() {
        return is2.b.PRELOAD_IPASS;
    }

    @Override // as2.j
    public final q03.r<Short> getBalance() {
        e13.p pVarA = ks2.e.a(this.f85271a);
        gw.j jVar = new gw.j(new k(this, 1), 22);
        int i14 = w03.b.f181178a;
        return new e13.j(pVarA, jVar);
    }

    @Override // hq2.r
    public final qs2.a o() {
        return qs2.a.f147385n;
    }

    @Override // hq2.r
    public final int p() {
        return R.string.operator_ipass;
    }

    @Override // hq2.r
    public final byte[] q() {
        j.f85251a.getClass();
        return j.f85257g;
    }

    @Override // hq2.r
    public final e13.j r() {
        e13.p pVarA = ks2.e.a(this.f85271a);
        gw.j jVar = new gw.j(new k(this, 0), 21);
        int i14 = w03.b.f181178a;
        return new e13.j(pVarA, jVar);
    }

    public final byte[] w() {
        j.f85251a.getClass();
        return j.f85255e;
    }
}

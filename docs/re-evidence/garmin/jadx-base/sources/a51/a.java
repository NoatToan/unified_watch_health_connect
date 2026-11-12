package a51;

import am.p1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.r;
import l72.f0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import w51.o0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f1410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f1411d;

    public /* synthetic */ a(e23.a aVar, e23.a aVar2, boolean z14) {
        this.f1408a = 2;
        this.f1409b = z14;
        this.f1410c = aVar;
        this.f1411d = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1408a;
        e23.a aVar = this.f1411d;
        e23.a aVar2 = this.f1410c;
        boolean z14 = this.f1409b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                zf.b.a(z14, aVar2, aVar, (p3.m) obj, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                p1.f(z14, aVar2, aVar, (p3.m) obj, p0.t(1));
                break;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        mVar.C(-182962725);
                        f0.f110999a.i(y.Q(mVar, R.string.lbl_review_settings), x2.f(r.S, 1.0f), false, this.f1410c, mVar, 48, 4);
                        mVar.f();
                    } else {
                        mVar.C(-182684438);
                        f0.f110999a.d(384, 9, this.f1411d, x2.f(r.S, 1.0f), y.Q(mVar, R.string.lbl_continue), mVar, null, false);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                o0.i(z14, aVar2, aVar, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(boolean z14, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f1408a = i15;
        this.f1409b = z14;
        this.f1410c = aVar;
        this.f1411d = aVar2;
    }
}

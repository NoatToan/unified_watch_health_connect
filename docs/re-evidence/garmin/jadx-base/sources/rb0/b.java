package rb0;

import android.graphics.drawable.Drawable;
import e23.l;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hv.a f151540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f151541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f151542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f151543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f151544f;

    public /* synthetic */ b(hv.a aVar, int i14, p1 p1Var, n1 n1Var, p1 p1Var2, int i15) {
        this.f151539a = i15;
        this.f151540b = aVar;
        this.f151541c = i14;
        this.f151542d = p1Var;
        this.f151543e = n1Var;
        this.f151544f = p1Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f151539a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                hv.a aVar = this.f151540b;
                int i15 = this.f151541c;
                String strB = aVar.b(i15, iIntValue);
                if (strB != null) {
                    this.f151542d.setValue(strB);
                }
                Drawable drawableA = aVar.a(i15, iIntValue);
                this.f151543e.t(iIntValue);
                this.f151544f.setValue(Boolean.valueOf(aVar.d(i15, iIntValue) && drawableA != null));
                break;
            default:
                hv.a aVar2 = this.f151540b;
                int i16 = this.f151541c;
                String strB2 = aVar2.b(i16, iIntValue);
                if (strB2 != null) {
                    this.f151542d.setValue(strB2);
                }
                Drawable drawableA2 = aVar2.a(i16, iIntValue);
                this.f151543e.t(iIntValue);
                this.f151544f.setValue(Boolean.valueOf(aVar2.d(i16, iIntValue) && drawableA2 != null));
                break;
        }
        return Unit.INSTANCE;
    }
}

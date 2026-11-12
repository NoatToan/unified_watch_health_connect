package t30;

import p005kotlin.Unit;
import p3.p1;
import s5.n;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f162176b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f162175a = i14;
        this.f162176b = obj;
    }

    @Override // s5.n
    public final void a(s5.m mVar) {
        int i14 = this.f162175a;
        Object obj = this.f162176b;
        switch (i14) {
            case 0:
                mVar.getClass();
                ((p1) obj).setValue(Boolean.TRUE);
                break;
            case 1:
                w31.c.a aVar = w31.c.f181844f;
                mVar.getClass();
                tn1.e.a(((w31.c) obj).f181850b, tn1.d.HRV_STATUS, tn1.f.ENHANCED_MESSAGE);
                break;
            case 2:
                mVar.getClass();
                ((nr.g.w) obj).f127171g.invoke();
                break;
            default:
                mVar.getClass();
                e23.a<Unit> aVar2 = ((nr.e.d) obj).f127019e;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                break;
        }
    }
}

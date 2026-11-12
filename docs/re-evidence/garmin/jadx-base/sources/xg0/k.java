package xg0;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f190782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wg0.a f190783c;

    public /* synthetic */ k(m mVar, wg0.a aVar, int i14) {
        this.f190781a = i14;
        this.f190782b = mVar;
        this.f190783c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f190781a;
        wg0.a aVar = this.f190783c;
        m mVar = this.f190782b;
        switch (i14) {
            case 0:
                int i15 = m.I0;
                mVar.f190791c.s3(aVar);
                break;
            case 1:
                mVar.f190791c.V3(aVar.f185046e, aVar.f185047f);
                break;
            case 2:
                int i16 = m.I0;
                mVar.f190791c.s3(aVar);
                break;
            default:
                boolean z14 = !mVar.f190813z;
                mVar.l(z14);
                aVar.f185058q = z14;
                mVar.f190791c.u4();
                break;
        }
    }

    public /* synthetic */ k(m mVar, wg0.a aVar, int i14, int i15) {
        this.f190781a = i15;
        this.f190782b = mVar;
        this.f190783c = aVar;
    }
}

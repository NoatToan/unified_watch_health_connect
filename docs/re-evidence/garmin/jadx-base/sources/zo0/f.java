package zo0;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f206136b;

    public /* synthetic */ f(g gVar, int i14) {
        this.f206135a = i14;
        this.f206136b = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f206135a;
        int i15 = 1;
        TimeUnit timeUnit = TimeUnit.DAYS;
        g gVar = this.f206136b;
        switch (i14) {
            case 0:
                gVar.f206139a.Y0(new f(gVar, i15), new f(gVar, 2));
                break;
            case 1:
                g.a aVar = g.f206137d;
                gVar.f206141c.a(timeUnit.toMillis(1) + System.currentTimeMillis());
                break;
            default:
                g.a aVar2 = g.f206137d;
                gVar.f206141c.a(timeUnit.toMillis(7) + System.currentTimeMillis());
                break;
        }
    }
}

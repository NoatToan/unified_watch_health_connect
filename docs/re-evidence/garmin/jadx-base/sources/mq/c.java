package mq;

import android.view.View;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f120146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f120147c;

    public /* synthetic */ c(o oVar, o oVar2, int i14) {
        this.f120145a = i14;
        this.f120146b = oVar;
        this.f120147c = oVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f120145a;
        o oVar = this.f120147c;
        o oVar2 = this.f120146b;
        switch (i14) {
            case 0:
                int i15 = d.B;
                oVar2.f120193a.post(new c(oVar, oVar2, 1));
                break;
            case 1:
                int i16 = d.B;
                View view2 = oVar2.f120193a;
                double height = view2.getHeight();
                View view3 = oVar.f120193a;
                int iMax = (int) Math.max(height, view3.getHeight());
                view2.setMinimumHeight(iMax);
                view3.setMinimumHeight(iMax);
                break;
            case 2:
                Logger logger = e.f120159p;
                oVar2.f120193a.post(new c(oVar, oVar2, 3));
                break;
            default:
                Logger logger2 = e.f120159p;
                View view4 = oVar2.f120193a;
                double height2 = view4.getHeight();
                View view5 = oVar.f120193a;
                int iMax2 = (int) Math.max(height2, view5.getHeight());
                view4.setMinimumHeight(iMax2);
                view5.setMinimumHeight(iMax2);
                break;
        }
    }
}

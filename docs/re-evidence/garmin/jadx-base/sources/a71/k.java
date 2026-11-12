package a71;

import android.view.View;
import com.garmin.feature.garminpay.ui.common.BannerControlView;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f1782b;

    public /* synthetic */ k(e23.l lVar, int i14) {
        this.f1781a = i14;
        this.f1782b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f1781a;
        e23.l lVar = this.f1782b;
        switch (i14) {
            case 0:
                lVar.invoke(view2);
                break;
            case 1:
                br2.c cVar = br2.c.f19585a;
                lVar.invoke(view2);
                break;
            case 2:
                br2.c cVar2 = br2.c.f19585a;
                lVar.invoke(view2);
                break;
            case 3:
                int i15 = BannerControlView.f51846k;
                view2.getClass();
                lVar.invoke(view2);
                break;
            case 4:
                int i16 = BannerControlView.f51846k;
                view2.getClass();
                lVar.invoke(view2);
                break;
            case 5:
                Logger logger = lq2.c.f114342c;
                lVar.invoke(view2);
                break;
            default:
                lVar.invoke(view2);
                break;
        }
    }
}

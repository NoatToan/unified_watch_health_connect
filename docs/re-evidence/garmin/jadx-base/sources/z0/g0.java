package z0;

import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaSensorsIndicatorsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f200627b;

    public /* synthetic */ g0(Object obj, int i14) {
        this.f200626a = i14;
        this.f200627b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f200626a;
        Object obj = this.f200627b;
        switch (i14) {
            case 0:
                h0.c cVar = h0.G;
                ((h0) obj).q();
                return;
            case 1:
                ((m0) obj).f200686k.b(null);
                return;
            case 2:
                z30.b bVar = (z30.b) obj;
                e23.l<? super Integer, Unit> lVar = bVar.f202127a;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(bVar.f202131e));
                    return;
                }
                return;
            case 3:
                ((androidx.media3.exoplayer.video.c) obj).f9816n--;
                return;
            case 4:
                zb0.o oVar = (zb0.o) obj;
                oVar.f203595q.g(false);
                oVar.S6();
                return;
            case 5:
                zb0.g0 g0Var = (zb0.g0) obj;
                g0Var.y6();
                gc0.c.a(g0Var.f203496g, g0Var.f203492c.f76871d);
                return;
            case 6:
                zb0.g0 g0Var2 = zb0.g0.this;
                g0Var2.f203507r.post(g0Var2.f203508t);
                return;
            default:
                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity = (OrcaSensorsIndicatorsActivity) obj;
                ImageView imageView = orcaSensorsIndicatorsActivity.f30891c;
                if (imageView == null) {
                    p005kotlin.jvm.internal.s.m("wakeUpImageView");
                    throw null;
                }
                imageView.setImageResource(2131232091);
                ImageView imageView2 = orcaSensorsIndicatorsActivity.f30891c;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("wakeUpImageView");
                    throw null;
                }
        }
    }
}

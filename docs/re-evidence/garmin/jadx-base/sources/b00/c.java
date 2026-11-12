package b00;

import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.view.conversation.CommentView;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import com.github.mikephil.charting.charts.BarLineChartBase;
import vr2.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14140c;

    public /* synthetic */ c(int i14, Object obj, Object obj2) {
        this.f14138a = i14;
        this.f14139b = obj;
        this.f14140c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view2) {
        int i14 = this.f14138a;
        Object obj = this.f14140c;
        Object obj2 = this.f14139b;
        switch (i14) {
            case 0:
                e eVar = (e) obj2;
                e23.a aVar = (e23.a) obj;
                boolean z14 = eVar.f14146c;
                BarLineChartBase<?> barLineChartBase = eVar.f14145b;
                if (!z14) {
                    barLineChartBase.setOnTouchListener(eVar.f14150g);
                }
                if (!barLineChartBase.isEmpty() && aVar != null) {
                    aVar.invoke();
                }
                return false;
            case 1:
                ((bp2.d) obj2).f19459b.c(new bp2.d.b.a((zo2.a) obj));
                return true;
            case 2:
                q qVar = (q) obj2;
                com.garmin.feature.garminpay.ui.devicesettings.a aVar2 = (com.garmin.feature.garminpay.ui.devicesettings.a) obj;
                if (qVar != null) {
                    aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.b(qVar, false, true, 2, null));
                } else {
                    int i15 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                }
                return true;
            case 3:
                com.garmin.android.apps.connectmobile.smartscale.model.e eVar2 = (com.garmin.android.apps.connectmobile.smartscale.model.e) obj2;
                com.garmin.android.apps.connectmobile.settings.devices.index.b bVar = (com.garmin.android.apps.connectmobile.settings.devices.index.b) obj;
                if (!eVar2.getIsPrimary()) {
                    bVar.r(eVar2);
                }
                return true;
            case 4:
                SnowballCardDetailActivity snowballCardDetailActivity = (SnowballCardDetailActivity) obj2;
                SnowballCardDetailActivity.a aVar3 = SnowballCardDetailActivity.f51257j;
                snowballCardDetailActivity.b().e0(snowballCardDetailActivity, (String) obj);
                return true;
            case 5:
                ((com.garmin.feature.garminpay.ui.userwallet.d) obj2).f52285b.c(new com.garmin.feature.garminpay.ui.userwallet.d.c.b((q) obj, true));
                return true;
            case 6:
                int i16 = com.garmin.feature.garminpay.ui.userwallet.d.e.f52290h;
                Toast.makeText(((com.garmin.feature.garminpay.ui.userwallet.d.e) obj2).itemView.getContext(), String.valueOf((q) obj), 1).show();
                return true;
            default:
                CommentView.b bVar2 = (CommentView.b) obj;
                if (!((CommentView) obj2).f47643o) {
                    return false;
                }
                bVar2.d();
                return true;
        }
    }
}

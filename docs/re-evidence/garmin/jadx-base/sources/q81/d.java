package q81;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import e32.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq81/d;", "Le32/p;", "Lu81/a;", "Landroid/view/View;", "view", "Lkotlin/Function2;", "Lo81/f;", "", "supportingStatSelected", "<init>", "(Landroid/view/View;Le23/p;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements p<u81.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<o81.f, u81.a, Unit> f143307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f143308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HorseshoePieChart f143309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f143310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f143311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f143312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComposeView f143313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vz.a<u81.a> f143314h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(View view2, e23.p<? super o81.f, ? super u81.a, Unit> pVar) {
        view2.getClass();
        pVar.getClass();
        this.f143307a = pVar;
        Context context = view2.getContext();
        context.getClass();
        this.f143308b = context;
        View viewFindViewById = view2.findViewById(R.id.hill_score_pie_chart);
        viewFindViewById.getClass();
        HorseshoePieChart horseshoePieChart = (HorseshoePieChart) viewFindViewById;
        this.f143309c = horseshoePieChart;
        View viewFindViewById2 = view2.findViewById(R.id.hill_score_qualifier);
        viewFindViewById2.getClass();
        this.f143310d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.hill_score_feedback_phrase);
        viewFindViewById3.getClass();
        this.f143311e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.hill_score_sync_primary_training_device);
        viewFindViewById4.getClass();
        this.f143312f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.hill_score_factors_container);
        viewFindViewById5.getClass();
        this.f143313g = (ComposeView) viewFindViewById5;
        this.f143314h = new vz.a<>(horseshoePieChart, new r81.a(context), new t71.g(horseshoePieChart));
    }

    @Override // e32.p
    public final void a() {
        v22.e.j(this.f143309c);
        this.f143310d.setText(R.string.common_no_data);
        TextView textView = this.f143311e;
        textView.setText(R.string.msg_hill_score_sync_device_v2);
        textView.setTextAlignment(4);
        v22.e.j(this.f143312f);
        v22.e.j(this.f143313g);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(u81.a aVar) {
        return false;
    }

    @Override // e32.p
    public final void c(u81.a aVar) {
        String str;
        String string;
        u81.a aVar2 = aVar;
        g gVar = null;
        if ((aVar2 != null ? aVar2.f169468j : null) == null) {
            a();
            return;
        }
        g.a aVar3 = g.f143317c;
        Integer num = aVar2.f169468j;
        Integer num2 = aVar2.f169466h;
        aVar3.getClass();
        Context context = this.f143308b;
        TextView textView = this.f143311e;
        TextView textView2 = this.f143310d;
        if (num == null || num.intValue() >= g.RECREATIONAL_TO_CHALLENGER.f143320a) {
            textView.setTextAlignment(2);
            this.f143309c.setVisibility(num2 != null ? 0 : 8);
            this.f143314h.a(aVar2);
            if (num2 != null) {
                j jVar = j.f143327a;
                int iIntValue = num2.intValue();
                jVar.getClass();
                textView2.setText(j.a(iIntValue));
            }
            boolean zG = s.g(aVar2.f169469k, Boolean.FALSE);
            TextView textView3 = this.f143312f;
            if (!zG || (str = aVar2.f169470l) == null) {
                v22.e.j(textView3);
            } else {
                textView3.setText(context.getString(R.string.lbl_hill_score_sync_ptd_message, str));
                textView3.setVisibility(0);
            }
            z3.e eVar = new z3.e(275969464, true, new b(0, this, aVar2));
            ComposeView composeView = this.f143313g;
            composeView.setContent(eVar);
            composeView.setVisibility(0);
        } else {
            a();
            textView2.setText(R.string.msg_not_enough_data);
        }
        int iIntValue2 = aVar2.f169468j.intValue();
        context.getClass();
        for (g gVar2 : g.values()) {
            if (gVar2.f143320a == iIntValue2) {
                gVar = gVar2;
                break;
            }
        }
        if (gVar != null) {
            string = context.getString(gVar.f143321b);
            string.getClass();
        } else {
            string = "";
        }
        textView.setText(string);
    }
}

package lp1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import gl1.y;
import java.util.ArrayList;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Llp1/b;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lip1/a;", "", "navigateToActivity", "<init>", "(Landroid/content/Context;Le23/l;)V", "a", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<ip1.a, Unit> f114130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f114131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k32.r f114132e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llp1/b$a;", "Lk32/s;", "Landroid/view/View;", "itemView", "<init>", "(Llp1/b;Landroid/view/View;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends k32.s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f114133h = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f114134g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f114134g = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, e23.l<? super ip1.a, Unit> lVar) {
        context.getClass();
        lVar.getClass();
        this.f114130c = lVar;
        this.f114131d = new ArrayList();
        this.f114132e = new k32.r(context);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f114131d.size();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String string;
        Double gainSolarActivityTime;
        Double duration;
        if (i14 == -1) {
            return;
        }
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            ip1.a aVar2 = (ip1.a) this.f114131d.get(i14);
            aVar2.getClass();
            Context context = aVar.itemView.getContext();
            String activityName = aVar2.getActivityName();
            ip1.k summaryDTO = aVar2.getSummaryDTO();
            DateTime startTimeLocal = summaryDTO != null ? summaryDTO.getStartTimeLocal() : null;
            String strF = "";
            if (startTimeLocal == null) {
                string = "";
            } else {
                j0.f23099a.getClass();
                string = startTimeLocal.toString(j0.D() ? "HH:mm" : "h:mm a");
                if (string == null) {
                    string = "";
                }
            }
            ip1.k summaryDTO2 = aVar2.getSummaryDTO();
            int iDoubleValue = (summaryDTO2 == null || (duration = summaryDTO2.getDuration()) == null) ? 0 : (int) duration.doubleValue();
            l3.a aVar3 = l3.f23124b;
            context.getClass();
            aVar3.getClass();
            if (iDoubleValue > 0) {
                strF = iDoubleValue < 3600 ? androidx.core.view.j.f(iDoubleValue / 60, u0.j(context.getString(R.string.sleep_my_day_minute_unit))) : l3.a.h1(iDoubleValue, context);
            }
            if (string.length() > 0 && strF.length() > 0) {
                string = context.getString(R.string.string_space_bullet_string_pattern, string, strF);
            } else if (string.length() <= 0) {
                string = strF;
            }
            string.getClass();
            ip1.k summaryDTO3 = aVar2.getSummaryDTO();
            long jDoubleValue = 0;
            if (summaryDTO3 != null && summaryDTO3.g() && (gainSolarActivityTime = aVar2.getSummaryDTO().getGainSolarActivityTime()) != null) {
                jDoubleValue = (long) gainSolarActivityTime.doubleValue();
            }
            aVar.d(activityName, string, y.n(context, jDoubleValue));
            v22.e.j(aVar.f102733e);
            aVar.itemView.setOnClickListener(new hx0.k(28, aVar.f114134g, aVar2));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, this.f114132e.a(viewGroup));
    }
}

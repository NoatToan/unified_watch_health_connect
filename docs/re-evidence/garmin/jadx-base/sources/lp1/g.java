package lp1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.f1;
import gl1.y;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Llp1/g;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Le32/l;", "Lep1/g;", "navigator", "<init>", "(Landroid/content/Context;Le32/l;)V", "a", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e32.l<ep1.g> f114144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k32.r f114145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f114146e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llp1/g$a;", "Lk32/s;", "Landroid/view/View;", "itemView", "<init>", "(Llp1/g;Landroid/view/View;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends k32.s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f114147j = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Context f114148g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final pi0.e f114149h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ g f114150i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, View view2) {
            super(view2);
            view2.getClass();
            this.f114150i = gVar;
            Context context = view2.getContext();
            this.f114148g = context;
            context.getClass();
            this.f114149h = new pi0.e(context);
        }
    }

    public g(Context context, e32.l<ep1.g> lVar) {
        context.getClass();
        lVar.getClass();
        this.f114144c = lVar;
        this.f114145d = new k32.r(context);
        this.f114146e = new ArrayList();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f114146e.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 == -1) {
            return;
        }
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            ip1.f fVar = (ip1.f) this.f114146e.get(i14);
            fVar.getClass();
            LocalDate localDate = fVar.f94684a;
            pi0.e eVar = aVar.f114149h;
            String strD = eVar.d(localDate, qi0.a.WEEKDAY);
            String strD2 = eVar.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
            Context context = aVar.f114148g;
            context.getClass();
            aVar.d(strD, strD2, y.n(context, fVar.f94685b));
            v22.e.j(aVar.f102733e);
            aVar.itemView.setOnClickListener(new hx0.k(29, localDate, aVar.f114150i));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, this.f114145d.a(viewGroup));
    }
}

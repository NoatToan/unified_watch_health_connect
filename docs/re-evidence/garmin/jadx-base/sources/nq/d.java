package nq;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lnq/d;", "Lpq/e$b;", "Lsq/a;", "Landroid/view/View;", "itemView", "Lnq/e;", "adapter", "", "Lpq/h;", "userActionStrategy", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "Lkotlin/Function1;", "", "onExerciseSetClick", "<init>", "(Landroid/view/View;Lnq/e;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Le23/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends pq.e.b<sq.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f126888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<pq.h> f126889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c f126890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<sq.a, Unit> f126891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(View view2, e eVar, List<? extends pq.h> list, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, e23.l<? super sq.a, Unit> lVar) {
        super(view2);
        view2.getClass();
        eVar.getClass();
        list.getClass();
        cVar.getClass();
        this.f126888a = eVar;
        this.f126889b = list;
        this.f126890c = cVar;
        this.f126891d = lVar;
    }

    @Override // pq.e.b, pq.e
    public final void d() {
        ((CardView) this.itemView.findViewById(R.id.cardBackground)).setCardBackgroundColor(a7.b.getColor(this.itemView.getContext(), R.color.gcm_surface_2));
    }

    @Override // pq.e.b, pq.e
    public final void e() {
        ((CardView) this.itemView.findViewById(R.id.cardBackground)).setCardBackgroundColor(a7.b.getColor(this.itemView.getContext(), R.color.gcm3_workout_selected_step_background));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:8:0x0056  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // pq.e.b
    public final void f(sq.a aVar) {
        int i14;
        String strC1;
        String lowerCase;
        String strC2;
        sq.a aVar2 = aVar;
        aVar2.getClass();
        this.itemView.setOnClickListener(new lq.g(23, this, aVar2));
        View viewFindViewById = this.itemView.findViewById(R.id.reorderIcon);
        viewFindViewById.getClass();
        pq.g gVar = pq.g.f139551a;
        List<pq.h> list = this.f126889b;
        if (list.contains(gVar)) {
            List<T> list2 = this.f126888a.f10698a.f10426f;
            list2.getClass();
            p pVarF = oc.b.F(getBindingAdapterPosition(), list2);
            if (((Number) pVarF.f128594a).intValue() == ((Number) pVarF.f128595b).intValue() - 1) {
                i14 = 8;
            } else {
                i14 = 0;
            }
        } else {
            i14 = 8;
        }
        viewFindViewById.setVisibility(i14);
        this.itemView.findViewById(R.id.removeIcon).setVisibility(list.contains(n.f126926a) ? 0 : 8);
        String strB = z.b(R.string.no_value, this.itemView);
        String strB2 = z.b(R.string.strength_training_choose_an_exercise, this.itemView);
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = aVar2.f160521b;
        boolean zH = this.f126890c.H(eVar.f41115e, eVar.f41116f);
        TextView textView = (TextView) this.itemView.findViewById(R.id.exerciseName);
        String str = eVar.f41117g;
        if (str != null && !w.J(str)) {
            String str2 = eVar.f41117g;
            if (str2 != null) {
                strB = str2;
            }
            strB2 = strB;
        }
        textView.setText(strB2);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.details);
        Double D = eVar.D();
        if (D != null) {
            double dDoubleValue = D.doubleValue();
            l3.a aVar3 = l3.f23124b;
            Context context = this.itemView.getContext();
            context.getClass();
            aVar3.getClass();
            strC1 = l3.a.c1(context, (long) dDoubleValue);
        } else {
            strC1 = null;
        }
        Long lH = eVar.H();
        if ((lH != null && lH.longValue() == -2) || eVar.H() == null) {
            lowerCase = null;
        } else {
            l3.a aVar4 = l3.f23124b;
            Context context2 = this.itemView.getContext();
            Long lH2 = eVar.H();
            double dLongValue = lH2 != null ? lH2.longValue() : 0.0d;
            aVar4.getClass();
            lowerCase = l3.a.Q0(dLongValue, context2, false).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        Long lZ = eVar.Z();
        if (!zH) {
            strC2 = ((lZ == null && lZ.longValue() == -2) || lZ == null) ? null : l3.a.C1(l3.f23124b, this.itemView.getContext(), lZ.longValue() / 1000.0d, zY, false, null, 56);
        } else if ((lZ != null ? lZ.longValue() : 0L) <= 0) {
            strC2 = this.itemView.getContext().getString(R.string.strength_training_body);
        } else if (lZ == null) {
        }
        List listK = x.k(strC1, lowerCase, strC2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            String str3 = (String) obj;
            if (str3 != null && !w.J(str3)) {
                arrayList.add(obj);
            }
        }
        textView2.setText(h0.k0(arrayList, " • ", null, null, null, 62));
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.rest);
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = aVar2.f160522c;
        Double D2 = eVar2 != null ? eVar2.D() : null;
        if (D2 == null) {
            textView3.getClass();
            textView3.setVisibility(8);
            return;
        }
        l3.a aVar5 = l3.f23124b;
        Context context3 = this.itemView.getContext();
        context3.getClass();
        long jDoubleValue = (long) D2.doubleValue();
        aVar5.getClass();
        String strC3 = l3.a.c1(context3, jDoubleValue);
        textView3.setText(this.itemView.getContext().getString(R.string.workout_step_type_rest) + StringUtils.SPACE + strC3);
        textView3.setVisibility(0);
    }

    public /* synthetic */ d(View view2, e eVar, List list, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(view2, eVar, list, cVar, (i14 & 16) != 0 ? null : lVar);
    }
}

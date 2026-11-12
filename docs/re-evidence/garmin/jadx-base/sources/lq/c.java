package lq;

import am.z0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import b71.i;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.g0;
import com.garmin.android.gncs.NotificationConstants;
import f12.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import ps.p;
import ps.x0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Llq/c;", "Landroid/widget/BaseExpandableListAdapter;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lar/c;", "distanceMetricData", "Lps/p;", "activitySplits", "Llq/h;", "selectedFilterType", "<init>", "(Landroid/content/Context;Lar/c;Lps/p;Llq/h;)V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f114268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<b, List<b>> f114269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f114270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f114271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f114273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f114274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f114275i;

    public interface a {
        void a();

        void b();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llq/c$b;", "", "", "interval_num", NotificationConstants.KEY_DATA_MIME_TYPE, "", "time", "distance", "pace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f114277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f114278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f114279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f114280e;

        public b(String str, String str2, Double d14, Double d15, Double d16) {
            this.f114276a = str;
            this.f114277b = str2;
            this.f114278c = d14;
            this.f114279d = d15;
            this.f114280e = d16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f114276a, bVar.f114276a) && s.g(this.f114277b, bVar.f114277b) && s.g(this.f114278c, bVar.f114278c) && s.g(this.f114279d, bVar.f114279d) && s.g(this.f114280e, bVar.f114280e);
        }

        public final int hashCode() {
            String str = this.f114276a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f114277b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d14 = this.f114278c;
            int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f114279d;
            int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f114280e;
            return iHashCode4 + (d16 != null ? d16.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("Interval(interval_num=", this.f114276a, ", type=", this.f114277b, ", time=");
            i.p(this.f114278c, this.f114279d, ", distance=", ", pace=", sbI);
            return i.g(sbI, this.f114280e, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public c(Context context, ar.c cVar, p pVar, h hVar) {
        ?? arrayList;
        String strValueOf;
        context.getClass();
        cVar.getClass();
        pVar.getClass();
        hVar.getClass();
        this.f114267a = context;
        this.f114268b = new ArrayList();
        this.f114269c = new HashMap<>();
        this.f114274h = cVar.f12517a;
        this.f114275i = ar.b.g(cVar, ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y());
        List<x1> listI = pVar.i();
        if (listI != null) {
            arrayList = new ArrayList();
            for (Object obj : listI) {
                g0.a aVar = g0.f29436c;
                String strO0 = ((x1) obj).o0();
                aVar.getClass();
                if (g0.a.b(strO0)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        int i14 = 1;
        for (x1 x1Var : (Iterable) arrayList) {
            if (ge1.b.M(hVar) != h.ALL) {
                h hVarM = ge1.b.M(hVar);
                h.a aVar2 = h.f114305d;
                String strO1 = x1Var.o0();
                aVar2.getClass();
                if (hVarM == h.a.a(strO1)) {
                }
            }
            List<Integer> listP0 = x1Var.p0();
            listP0 = listP0 == null ? new ArrayList<>() : listP0;
            ArrayList arrayList2 = new ArrayList();
            if (!listP0.isEmpty()) {
                if (listP0.size() > 1) {
                    this.f114273g++;
                }
                Iterator it = listP0.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (iIntValue > 0) {
                        List<x0> listG = pVar.g();
                        if (iIntValue <= (listG != null ? listG.size() : 0)) {
                            List<x0> listG2 = pVar.g();
                            x0 x0Var = listG2 != null ? listG2.get(iIntValue - 1) : null;
                            arrayList2.add(new b("", x1Var.o0(), x0Var != null ? x0Var.getDuration() : null, x0Var != null ? x0Var.getDistance() : null, x0Var != null ? x0Var.getAverageSpeed() : null));
                        }
                    }
                }
            }
            g0.a aVar3 = g0.f29436c;
            String strO2 = x1Var.o0();
            aVar3.getClass();
            if (g0.a.a(strO2) == g0.ACTIVE) {
                strValueOf = String.valueOf(i14);
                i14++;
            } else {
                strValueOf = "";
            }
            b bVar = new b(strValueOf, x1Var.o0(), x1Var.getDuration(), x1Var.getDistance(), x1Var.getAverageSpeed());
            this.f114268b.add(bVar);
            this.f114269c.put(bVar, arrayList2);
        }
        if (this.f114273g > 0) {
            this.f114270d = true;
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i14, int i15) {
        List<b> list = this.f114269c.get(this.f114268b.get(i14));
        list.getClass();
        return list.get(i15);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i14, int i15) {
        return i15;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i14, int i15, boolean z14, View view2, ViewGroup viewGroup) {
        int i16;
        viewGroup.getClass();
        Object child = getChild(i14, i15);
        child.getClass();
        b bVar = (b) child;
        String str = bVar.f114277b;
        Context context = this.f114267a;
        if (view2 == null) {
            Object systemService = context.getSystemService("layout_inflater");
            systemService.getClass();
            view2 = ((LayoutInflater) systemService).inflate(R.layout.list_item, viewGroup, false);
        }
        TextView textView = (TextView) view2.findViewById(R.id.type);
        g0.f29436c.getClass();
        g0 g0VarA = g0.a.a(str);
        g0 g0Var = g0.ACTIVE;
        String str2 = this.f114274h;
        if (g0VarA == g0Var) {
            z0 z0Var = z0.f4390a;
            if (z0.b(am.x0.f4308n, str2)) {
                i16 = R.string.lbl_run;
            } else {
                i16 = z0.b(am.x0.f4312o, str2) ? R.string.lbl_bike : g0.a.a(str).f29447b;
            }
        } else {
            i16 = g0.a.a(str).f29447b;
        }
        textView.setText(context.getString(i16));
        TextView textView2 = (TextView) view2.findViewById(R.id.time);
        Double d14 = bVar.f114278c;
        d14.getClass();
        textView2.setText(aq.a.W(context, d14));
        TextView textView3 = (TextView) view2.findViewById(R.id.distance);
        Double d15 = bVar.f114279d;
        if (d15 != null) {
            if (z0.Q(str2)) {
                textView3.setText(aq.a.G(context, d15));
            } else if (z0.b(am.x0.f4297k1, str2) || z0.b(am.x0.f4301l1, str2)) {
                textView3.setText(aq.a.r(context, d15));
            } else if (z0.b(am.x0.I0, str2)) {
                textView3.setText(aq.a.d0(context, d15));
            } else {
                textView3.setText(aq.a.f(context, d15));
            }
        }
        boolean z15 = z0.Q(str2) || z0.b(am.x0.f4297k1, str2);
        TextView textView4 = (TextView) view2.findViewById(R.id.pace);
        Double d16 = bVar.f114280e;
        if (d16 != null) {
            boolean zB = z0.b(am.x0.f4308n, str2);
            boolean z16 = this.f114275i;
            if (zB) {
                textView4.setText(aq.a.D(context, d16, z16));
            } else if (z0.b(am.x0.f4312o, str2)) {
                textView4.setText(aq.a.K(context, d16, z16));
            } else if (z15 || z0.b(am.x0.f4301l1, str2)) {
                textView4.setText(aq.a.H(context, d16));
            } else if (z0.c(str2)) {
                textView4.setText(aq.a.K(context, d16, z16));
            } else {
                textView4.setText(aq.a.D(context, d16, z16));
            }
        }
        view2.setBackgroundResource((i14 + 1) % 2 == 0 ? R.color.gcm_table_row_even : R.color.gcm_table_row_odd);
        return view2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i14) {
        List<b> list = this.f114269c.get(this.f114268b.get(i14));
        int size = list != null ? list.size() : 0;
        if (size > 1) {
            return size;
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i14) {
        return this.f114268b.get(i14);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f114268b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i14) {
        return i14;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i14, boolean z14, View view2, ViewGroup viewGroup) {
        int i15;
        Object obj = this.f114268b.get(i14);
        obj.getClass();
        b bVar = (b) obj;
        String str = bVar.f114277b;
        Context context = this.f114267a;
        if (view2 == null) {
            Object systemService = context.getSystemService("layout_inflater");
            systemService.getClass();
            view2 = ((LayoutInflater) systemService).inflate(R.layout.list_group, viewGroup, false);
        }
        ((TextView) view2.findViewById(R.id.interval_num)).setText(bVar.f114276a);
        TextView textView = (TextView) view2.findViewById(R.id.type);
        g0.f29436c.getClass();
        g0 g0VarA = g0.a.a(str);
        g0 g0Var = g0.ACTIVE;
        String str2 = this.f114274h;
        if (g0VarA == g0Var) {
            z0 z0Var = z0.f4390a;
            if (z0.b(am.x0.f4308n, str2)) {
                i15 = R.string.lbl_run;
            } else {
                i15 = z0.b(am.x0.f4312o, str2) ? R.string.lbl_bike : g0.a.a(str).f29447b;
            }
        } else {
            i15 = g0.a.a(str).f29447b;
        }
        textView.setText(context.getString(i15));
        TextView textView2 = (TextView) view2.findViewById(R.id.time);
        Double d14 = bVar.f114278c;
        d14.getClass();
        textView2.setText(aq.a.W(context, d14));
        TextView textView3 = (TextView) view2.findViewById(R.id.distance);
        Double d15 = bVar.f114279d;
        if (d15 != null) {
            if (z0.Q(str2)) {
                textView3.setText(aq.a.G(context, d15));
            } else if (z0.b(am.x0.f4297k1, str2) || z0.b(am.x0.f4301l1, str2)) {
                textView3.setText(aq.a.r(context, d15));
            } else if (z0.b(am.x0.I0, str2)) {
                textView3.setText(aq.a.d0(context, d15));
            } else {
                textView3.setText(aq.a.f(context, d15));
            }
        }
        boolean z15 = z0.Q(str2) || z0.b(am.x0.f4297k1, str2);
        TextView textView4 = (TextView) view2.findViewById(R.id.pace);
        Double d16 = bVar.f114280e;
        if (d16 != null) {
            boolean zB = z0.b(am.x0.f4308n, str2);
            boolean z16 = this.f114275i;
            if (zB) {
                textView4.setText(aq.a.D(context, d16, z16));
            } else if (z0.b(am.x0.f4312o, str2)) {
                textView4.setText(aq.a.K(context, d16, z16));
            } else if (z15 || z0.b(am.x0.f4301l1, str2)) {
                textView4.setText(aq.a.H(context, d16));
            } else if (z0.c(str2)) {
                textView4.setText(aq.a.K(context, d16, z16));
            } else {
                textView4.setText(aq.a.D(context, d16, z16));
            }
        }
        View viewFindViewById = view2.findViewById(R.id.arrowIcon);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        if (getChildrenCount(i14) > 0) {
            if (z14) {
                imageView.setImageResource(R.drawable.chevron_up);
            } else {
                imageView.setImageResource(R.drawable.chevron_down);
            }
            imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
        } else {
            imageView.setImageResource(R.drawable.drawable_empty);
        }
        view2.setBackgroundResource((i14 + 1) % 2 == 0 ? R.color.gcm_table_row_even : R.color.gcm_table_row_odd);
        return view2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i14, int i15) {
        return true;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.ExpandableListAdapter
    public final void onGroupCollapsed(int i14) {
        a aVar;
        super.onGroupCollapsed(i14);
        int i15 = this.f114272f - 1;
        this.f114272f = i15;
        if (i15 == this.f114273g || (aVar = this.f114271e) == null) {
            return;
        }
        aVar.a();
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.ExpandableListAdapter
    public final void onGroupExpanded(int i14) {
        a aVar;
        super.onGroupExpanded(i14);
        int i15 = this.f114272f + 1;
        this.f114272f = i15;
        if (i15 != this.f114273g || (aVar = this.f114271e) == null) {
            return;
        }
        aVar.b();
    }

    public /* synthetic */ c(Context context, ar.c cVar, p pVar, h hVar, int i14, j jVar) {
        this(context, cVar, pVar, (i14 & 8) != 0 ? h.ALL : hVar);
    }
}

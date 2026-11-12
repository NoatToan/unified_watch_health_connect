package z40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import c22.m2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v0;
import com.garmin.android.library.mapsdkadapter.f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d53.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import og2.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.y;
import x40.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz40/b;", "Lcom/garmin/android/apps/connectmobile/v0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends v0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f202315r = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f202316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f202317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z40.c f202318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f202319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f202320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f202321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C3770b f202322q;

    /* JADX INFO: renamed from: z40.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z40/b$b", "Lz40/a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3770b implements z40.a {
        public C3770b() {
        }

        @Override // z40.a
        public final void D(RecyclerView.f0 f0Var) {
            s sVar = b.this.f202319n;
            if (sVar != null) {
                sVar.o(f0Var);
            } else {
                p005kotlin.jvm.internal.s.m("itemTouchHelper");
                throw null;
            }
        }

        @Override // z40.a
        public final void R(int i14) {
            b.C6(b.this, i14);
        }

        @Override // z40.a
        public final void S() {
            b bVar = b.this;
            n nVar = bVar.f202317l;
            if (nVar != null) {
                nVar.a(bVar.f202320o);
            } else {
                p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z40/b$c", "Lc22/m2;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends m2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f202324g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar, int i14, Drawable drawable, b bVar) {
            super(dVar, i14, drawable);
            this.f202324g = bVar;
        }

        @Override // androidx.recyclerview.widget.s.d
        public final void o(int i14, RecyclerView.f0 f0Var) {
            f0Var.getClass();
            b.C6(this.f202324g, f0Var.getBindingAdapterPosition());
        }

        @Override // c22.m2
        public final boolean p(RecyclerView.f0 f0Var) {
            f0Var.getClass();
            return true;
        }

        @Override // c22.m2
        public final boolean q(RecyclerView.f0 f0Var) {
            f0Var.getClass();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"z40/b$d", "Lsq0/b;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements sq0.b {
        public d() {
        }

        @Override // sq0.b
        public final int K0() {
            return 0;
        }

        @Override // sq0.b
        public final boolean f(int i14, int i15) {
            String string;
            b bVar = b.this;
            ArrayList arrayList = bVar.f202320o;
            ArrayList arrayList2 = bVar.f202320o;
            Collections.swap(arrayList, i14, i15);
            z40.c cVar = bVar.f202318m;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
            cVar.notifyItemMoved(i14, i15);
            if (i14 >= arrayList2.size() || i15 >= arrayList2.size()) {
                string = "";
            } else {
                String str = (String) bVar.f202321p.get(i14);
                if (i14 > i15) {
                    string = bVar.requireContext().getString(R.string.lbl_move_above_value, str);
                    string.getClass();
                } else {
                    string = bVar.requireContext().getString(R.string.lbl_move_below_value, str);
                    string.getClass();
                }
            }
            Context contextRequireContext = bVar.requireContext();
            contextRequireContext.getClass();
            c22.b.h(contextRequireContext, string);
            return true;
        }

        @Override // sq0.b
        public final void h8(int i14) {
        }

        @Override // sq0.b
        public final int z1() {
            return b.this.f202320o.size();
        }
    }

    public b() {
        super(R.layout.edit_waypoints_bottom_sheet_content, Integer.valueOf(R.layout.edit_waypoints_bottom_sheet_sticky_header));
        this.f202320o = new ArrayList();
        this.f202321p = new ArrayList();
        this.f202322q = new C3770b();
    }

    public static final void C6(b bVar, int i14) {
        ArrayList arrayList = bVar.f202320o;
        if (i14 == -1 || i14 > arrayList.size()) {
            return;
        }
        arrayList.remove(i14);
        bVar.f202321p.remove(i14);
        n nVar = bVar.f202317l;
        if (nVar == null) {
            p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        nVar.a(arrayList);
        if (arrayList.size() == 1) {
            bVar.dismiss();
            return;
        }
        TextView textView = bVar.f202316k;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("coursePointsTextView");
            throw null;
        }
        textView.setText(bVar.getString(R.string.lbl_number_of_waypoints, String.valueOf(arrayList.size())));
        z40.c cVar = bVar.f202318m;
        if (cVar != null) {
            cVar.notifyItemRemoved(i14);
        } else {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String A6() {
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.v0, com.garmin.android.apps.connectmobile.c0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.section_header_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f202316k = textView;
        textView.setText(getString(R.string.lbl_number_of_waypoints, String.valueOf(this.f202320o.size())));
        w6().setPeekHeight(getResources().getDisplayMetrics().heightPixels / 2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        List listB1;
        ArrayList<String> stringArrayList;
        ArrayList arrayList = this.f202320o;
        arrayList.clear();
        Bundle arguments = getArguments();
        if (arguments == null) {
            listB1 = null;
        } else {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("EXTRA_COURSE_POINTS", f.class) : arguments.getParcelableArrayList("EXTRA_COURSE_POINTS");
            if (parcelableArrayList != null) {
                listB1 = h0.b1(parcelableArrayList);
            } else {
                listB1 = null;
            }
        }
        if (listB1 == null) {
            listB1 = j0.f134944a;
        }
        arrayList.addAll(listB1);
        String string = getString(R.string.lbl_number_point, "");
        string.getClass();
        String string2 = w.i0(string).toString();
        ArrayList arrayList2 = this.f202321p;
        arrayList2.clear();
        Bundle arguments2 = getArguments();
        List<String> listB2 = (arguments2 == null || (stringArrayList = arguments2.getStringArrayList("EXTRA_WAYPOINT_NAMES")) == null) ? null : h0.b1(stringArrayList);
        if (listB2 == null) {
            listB2 = j0.f134944a;
        }
        ArrayList arrayList3 = new ArrayList(y.r(listB2, 10));
        for (String str : listB2) {
            if (!g22.n.d(str)) {
                str = string2;
            }
            arrayList3.add(str);
        }
        arrayList2.addAll(arrayList3);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        Context context = view2.getContext();
        context.getClass();
        z40.c cVar = new z40.c(arrayList2, this.f202322q, context);
        this.f202318m = cVar;
        recyclerView.setAdapter(cVar);
        d dVar = new d();
        int color = a7.b.getColor(requireContext(), R.color.gcm_surface_danger_action);
        Drawable drawable = a7.b.getDrawable(requireContext(), R.drawable.discard);
        if (drawable != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            k.F(R.color.gcm_icon_on_color, contextRequireContext, drawable);
        }
        s sVar = new s(new c(dVar, color, drawable, this));
        this.f202319n = sVar;
        sVar.e(recyclerView);
    }

    @Override // com.garmin.android.apps.connectmobile.v0
    public final String z6() {
        String string = getString(R.string.title_edit_waypoints);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lz40/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_COURSE_POINTS", "EXTRA_WAYPOINT_NAMES", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.google.android.material.button.MaterialButton;
import defpackage.c3n;
import defpackage.ca3;
import defpackage.dwh;
import defpackage.h2j;
import defpackage.hr5;
import defpackage.iqi;
import defpackage.kti;
import defpackage.kwi;
import defpackage.m80;
import defpackage.mlq;
import defpackage.njh;
import defpackage.pmi;
import defpackage.r9h;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends dwh<S> {

    @VisibleForTesting
    public static final Object l = "MONTHS_VIEW_GROUP_TAG";

    @VisibleForTesting
    public static final Object m = "NAVIGATION_PREV_TAG";

    @VisibleForTesting
    public static final Object n = "NAVIGATION_NEXT_TAG";

    @VisibleForTesting
    public static final Object o = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8640b;
    public DateSelector<S> c;
    public CalendarConstraints d;
    public Month e;
    public k f;
    public ca3 g;
    public RecyclerView h;
    public RecyclerView i;
    public View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f8641k;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8642a;

        public a(int i) {
            this.f8642a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.i.smoothScrollToPosition(this.f8642a);
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.k0(null);
        }
    }

    public class c extends c3n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8645a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f8645a = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.z zVar, int[] iArr) {
            if (this.f8645a == 0) {
                iArr[0] = MaterialCalendar.this.i.getWidth();
                iArr[1] = MaterialCalendar.this.i.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.i.getHeight();
                iArr[1] = MaterialCalendar.this.i.getHeight();
            }
        }
    }

    public class d implements l {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.MaterialCalendar.l
        public void a(long j) {
            if (MaterialCalendar.this.d.g().n(j)) {
                MaterialCalendar.this.c.O(j);
                Iterator<r9h<S>> it = MaterialCalendar.this.f15991a.iterator();
                while (it.hasNext()) {
                    it.next().b(MaterialCalendar.this.c.M());
                }
                MaterialCalendar.this.i.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.h != null) {
                    MaterialCalendar.this.h.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public class e extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Calendar f8648a = mlq.l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Calendar f8649b = mlq.l();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.d) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                com.google.android.material.datepicker.d dVar = (com.google.android.material.datepicker.d) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (njh<Long, Long> njhVar : MaterialCalendar.this.c.i0()) {
                    Long l = njhVar.f27979a;
                    if (l != null && njhVar.f27980b != null) {
                        this.f8648a.setTimeInMillis(l.longValue());
                        this.f8649b.setTimeInMillis(njhVar.f27980b.longValue());
                        int iK = dVar.k(this.f8648a.get(1));
                        int iK2 = dVar.k(this.f8649b.get(1));
                        View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iK);
                        View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(iK2);
                        int iU = iK / gridLayoutManager.u();
                        int iU2 = iK2 / gridLayoutManager.u();
                        int i = iU;
                        while (i <= iU2) {
                            View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.u() * i);
                            if (viewFindViewByPosition3 != null) {
                                canvas.drawRect(i == iU ? viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2) : 0, viewFindViewByPosition3.getTop() + MaterialCalendar.this.g.d.c(), i == iU2 ? viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2) : recyclerView.getWidth(), viewFindViewByPosition3.getBottom() - MaterialCalendar.this.g.d.b(), MaterialCalendar.this.g.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    public class f extends androidx.core.view.a {
        public f() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.t0(MaterialCalendar.this.f8641k.getVisibility() == 0 ? MaterialCalendar.this.getString(h2j.Q) : MaterialCalendar.this.getString(h2j.O));
        }
    }

    public class g extends RecyclerView.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.c f8651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MaterialButton f8652b;

        public g(com.google.android.material.datepicker.c cVar, MaterialButton materialButton) {
            this.f8651a = cVar;
            this.f8652b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f8652b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int iFindFirstVisibleItemPosition = i < 0 ? MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() : MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
            MaterialCalendar.this.e = this.f8651a.j(iFindFirstVisibleItemPosition);
            this.f8652b.setText(this.f8651a.k(iFindFirstVisibleItemPosition));
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.N();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.c f8654a;

        public i(com.google.android.material.datepicker.c cVar) {
            this.f8654a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
            if (iFindFirstVisibleItemPosition < MaterialCalendar.this.i.getAdapter().getItemCount()) {
                MaterialCalendar.this.L(this.f8654a.j(iFindFirstVisibleItemPosition));
            }
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.c f8656a;

        public j(com.google.android.material.datepicker.c cVar) {
            this.f8656a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
            if (iFindLastVisibleItemPosition >= 0) {
                MaterialCalendar.this.L(this.f8656a.j(iFindLastVisibleItemPosition));
            }
        }
    }

    public enum k {
        DAY,
        YEAR
    }

    public interface l {
        void a(long j);
    }

    public static int H(Context context) {
        return context.getResources().getDimensionPixelSize(pmi.X);
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(pmi.f0) + resources.getDimensionPixelOffset(pmi.g0) + resources.getDimensionPixelOffset(pmi.e0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(pmi.Z);
        int i2 = com.google.android.material.datepicker.b.f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(pmi.X) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(pmi.d0)) + resources.getDimensionPixelOffset(pmi.V);
    }

    public static <T> MaterialCalendar<T> J(DateSelector<T> dateSelector, int i2, CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.j());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    public final void B(View view, com.google.android.material.datepicker.c cVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(iqi.B);
        materialButton.setTag(o);
        androidx.core.view.c.r0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(iqi.D);
        materialButton2.setTag(m);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(iqi.C);
        materialButton3.setTag(n);
        this.j = view.findViewById(iqi.L);
        this.f8641k = view.findViewById(iqi.G);
        M(k.DAY);
        materialButton.setText(this.e.l());
        this.i.addOnScrollListener(new g(cVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(cVar));
        materialButton2.setOnClickListener(new j(cVar));
    }

    public final RecyclerView.n C() {
        return new e();
    }

    public CalendarConstraints D() {
        return this.d;
    }

    public ca3 E() {
        return this.g;
    }

    public Month F() {
        return this.e;
    }

    public DateSelector<S> G() {
        return this.c;
    }

    public final void K(int i2) {
        this.i.post(new a(i2));
    }

    public void L(Month month) {
        com.google.android.material.datepicker.c cVar = (com.google.android.material.datepicker.c) this.i.getAdapter();
        int iL = cVar.l(month);
        int iL2 = iL - cVar.l(this.e);
        boolean z = Math.abs(iL2) > 3;
        boolean z2 = iL2 > 0;
        this.e = month;
        if (z && z2) {
            this.i.scrollToPosition(iL - 3);
            K(iL);
        } else if (!z) {
            K(iL);
        } else {
            this.i.scrollToPosition(iL + 3);
            K(iL);
        }
    }

    public void M(k kVar) {
        this.f = kVar;
        if (kVar == k.YEAR) {
            this.h.getLayoutManager().scrollToPosition(((com.google.android.material.datepicker.d) this.h.getAdapter()).k(this.e.c));
            this.j.setVisibility(0);
            this.f8641k.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.j.setVisibility(8);
            this.f8641k.setVisibility(0);
            L(this.e);
        }
    }

    public void N() {
        k kVar = this.f;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            M(k.DAY);
        } else if (kVar == k.DAY) {
            M(kVar2);
        }
    }

    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.i.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8640b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.e = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f8640b);
        this.g = new ca3(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthK = this.d.k();
        if (MaterialDatePicker.I(contextThemeWrapper)) {
            i2 = kwi.A;
            i3 = 1;
        } else {
            i2 = kwi.y;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        viewInflate.setMinimumHeight(I(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(iqi.H);
        androidx.core.view.c.r0(gridView, new b());
        gridView.setAdapter((ListAdapter) new hr5());
        gridView.setNumColumns(monthK.d);
        gridView.setEnabled(false);
        this.i = (RecyclerView) viewInflate.findViewById(iqi.K);
        this.i.setLayoutManager(new c(getContext(), i3, false, i3));
        this.i.setTag(l);
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(contextThemeWrapper, this.c, this.d, new d());
        this.i.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(kti.c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(iqi.L);
        this.h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.h.setAdapter(new com.google.android.material.datepicker.d(this));
            this.h.addItemDecoration(C());
        }
        if (viewInflate.findViewById(iqi.B) != null) {
            B(viewInflate, cVar);
        }
        if (!MaterialDatePicker.I(contextThemeWrapper)) {
            new t().b(this.i);
        }
        this.i.scrollToPosition(cVar.l(this.e));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f8640b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.e);
    }

    @Override // defpackage.dwh
    public boolean s(r9h<S> r9hVar) {
        return super.s(r9hVar);
    }
}

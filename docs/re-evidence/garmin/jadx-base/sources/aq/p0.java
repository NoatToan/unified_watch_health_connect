package aq;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laq/p0;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f12150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f12151c;

    public p0(ViewGroup viewGroup, n0 n0Var, View view2) {
        this.f12149a = viewGroup;
        this.f12150b = n0Var;
        this.f12151c = view2;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f12149a;
        if (viewGroup.getWidth() <= 0) {
            return;
        }
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        n0.a aVar = new n0.a(viewGroup.findViewById(R.id.exercise_name_column_layout).getWidth(), viewGroup.findViewById(R.id.duration_column_layout).getWidth(), viewGroup.findViewById(R.id.rep_column_layout).getWidth(), viewGroup.findViewById(R.id.weight_column_layout).getWidth());
        int i14 = n0.f12063j;
        final n0 n0Var = this.f12150b;
        n0Var.getClass();
        androidx.fragment.app.v supportFragmentManager = n0Var.requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        f2 f2Var = new f2(supportFragmentManager, n0Var.u6().f29800l, n0Var, aVar);
        n0Var.f12067d = f2Var;
        n0.d dVar = n0Var.f12071h;
        dVar.getClass();
        f2Var.f11943f = dVar;
        View viewFindViewById = this.f12151c.findViewById(R.id.recyclerView);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        n0Var.f12064a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(n0Var.requireContext()));
        RecyclerView recyclerView2 = n0Var.f12064a;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        f2 f2Var2 = n0Var.f12067d;
        if (f2Var2 == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        recyclerView2.setAdapter(f2Var2);
        f2 f2Var3 = n0Var.f12067d;
        if (f2Var3 == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        id1.e eVar = new id1.e(f2Var3);
        Context contextRequireContext = n0Var.requireContext();
        contextRequireContext.getClass();
        Resources resources = contextRequireContext.getResources();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        eVar.f93028e = new ColorDrawable(resources.getColor(R.color.gcm_surface_danger_action, null));
        Context contextRequireContext2 = n0Var.requireContext();
        contextRequireContext2.getClass();
        eVar.f93029f = contextRequireContext2.getString(R.string.lbl_delete);
        TextPaint textPaint = new TextPaint();
        eVar.f93030g = textPaint;
        final int i15 = 1;
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = eVar.f93030g;
        if (textPaint2 != null) {
            textPaint2.setTextSize(contextRequireContext2.getResources().getDimension(R.dimen.andfont_body_1));
        }
        TextPaint textPaint3 = eVar.f93030g;
        if (textPaint3 != null) {
            textPaint3.setColor(contextRequireContext2.getResources().getColor(R.color.gcm_text_primary, null));
        }
        androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(eVar);
        RecyclerView recyclerView3 = n0Var.f12064a;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        sVar.e(recyclerView3);
        androidx.lifecycle.y0<List<u0>> y0Var = n0Var.u6().f29802n;
        androidx.lifecycle.n0 viewLifecycleOwner = n0Var.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        final int i16 = 0;
        dh.b.L(y0Var, viewLifecycleOwner, new n0.h(new e23.l() { // from class: aq.m0
            /* JADX WARN: Code duplicated, block: B:17:0x0039  */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z14;
                int i17 = i16;
                n0 n0Var2 = n0Var;
                switch (i17) {
                    case 0:
                        List<u0> list = (List) obj;
                        int i18 = n0.f12063j;
                        list.getClass();
                        f2 f2Var4 = n0Var2.f12067d;
                        if (f2Var4 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        f2.e eVar2 = f2Var4.f11944g;
                        List<u0> list2 = f2Var4.f11942e;
                        eVar2.getClass();
                        list2.getClass();
                        eVar2.f11948a = list2;
                        eVar2.f11949b = list;
                        f2Var4.f11942e = list;
                        androidx.recyclerview.widget.o.a(eVar2).b(new androidx.recyclerview.widget.b(f2Var4));
                        return Unit.INSTANCE;
                    default:
                        Integer num = (Integer) obj;
                        int i19 = n0.f12063j;
                        num.getClass();
                        int iIntValue = num.intValue();
                        CheckBox checkBox = n0Var2.f12065b;
                        if (checkBox == null) {
                            p005kotlin.jvm.internal.s.m("headerCheckbox");
                            throw null;
                        }
                        f2 f2Var5 = n0Var2.f12067d;
                        if (f2Var5 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        if (f2Var5.f11942e.isEmpty()) {
                            z14 = false;
                        } else {
                            f2 f2Var6 = n0Var2.f12067d;
                            if (f2Var6 == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            if (iIntValue == f2Var6.f11942e.size()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        checkBox.setChecked(z14);
                        int iIntValue2 = num.intValue();
                        ViewGroup viewGroup2 = n0Var2.f12066c;
                        if (viewGroup2 != null) {
                            v22.e.r(viewGroup2, iIntValue2 != 0);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("editFooterLayout");
                        throw null;
                }
            }
        }));
        EditExercisesMultiSelectViewModel editExercisesMultiSelectViewModelU6 = n0Var.u6();
        editExercisesMultiSelectViewModelU6.f29797i.j(Integer.valueOf(editExercisesMultiSelectViewModelU6.B4()));
        c22.l2<Integer> l2Var = n0Var.u6().f29797i;
        androidx.lifecycle.n0 viewLifecycleOwner2 = n0Var.getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(l2Var, viewLifecycleOwner2, new n0.h(new e23.l() { // from class: aq.m0
            /* JADX WARN: Code duplicated, block: B:17:0x0039  */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z14;
                int i17 = i15;
                n0 n0Var2 = n0Var;
                switch (i17) {
                    case 0:
                        List<u0> list = (List) obj;
                        int i18 = n0.f12063j;
                        list.getClass();
                        f2 f2Var4 = n0Var2.f12067d;
                        if (f2Var4 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        f2.e eVar2 = f2Var4.f11944g;
                        List<u0> list2 = f2Var4.f11942e;
                        eVar2.getClass();
                        list2.getClass();
                        eVar2.f11948a = list2;
                        eVar2.f11949b = list;
                        f2Var4.f11942e = list;
                        androidx.recyclerview.widget.o.a(eVar2).b(new androidx.recyclerview.widget.b(f2Var4));
                        return Unit.INSTANCE;
                    default:
                        Integer num = (Integer) obj;
                        int i19 = n0.f12063j;
                        num.getClass();
                        int iIntValue = num.intValue();
                        CheckBox checkBox = n0Var2.f12065b;
                        if (checkBox == null) {
                            p005kotlin.jvm.internal.s.m("headerCheckbox");
                            throw null;
                        }
                        f2 f2Var5 = n0Var2.f12067d;
                        if (f2Var5 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        if (f2Var5.f11942e.isEmpty()) {
                            z14 = false;
                        } else {
                            f2 f2Var6 = n0Var2.f12067d;
                            if (f2Var6 == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            if (iIntValue == f2Var6.f11942e.size()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        checkBox.setChecked(z14);
                        int iIntValue2 = num.intValue();
                        ViewGroup viewGroup2 = n0Var2.f12066c;
                        if (viewGroup2 != null) {
                            v22.e.r(viewGroup2, iIntValue2 != 0);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("editFooterLayout");
                        throw null;
                }
            }
        }));
    }
}

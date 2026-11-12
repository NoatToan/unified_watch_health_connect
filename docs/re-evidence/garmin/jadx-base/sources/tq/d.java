package tq;

import am.x0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000eBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ltq/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ltq/d$a;", "Lam/x0;", "activityType", "", "Lqs/x;", "types", "selectedType", "Lkotlin/Function1;", "", "onChipSelected", "<init>", "(Lam/x0;Ljava/util/List;Lqs/x;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f166014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends x> f166015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<x, Unit> f166016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f166017d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltq/d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Ltq/d;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f166018b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f166019a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, View view2) {
            super(view2);
            view2.getClass();
            Button button = (Button) view2;
            this.f166019a = button;
            button.setOnClickListener(new pm0.h(23, dVar, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(x0 x0Var, List<? extends x> list, x xVar, l<? super x, Unit> lVar) {
        x0Var.getClass();
        list.getClass();
        this.f166014a = x0Var;
        this.f166015b = list;
        this.f166016c = lVar;
        ArrayList arrayListM = p13.x.m(null);
        arrayListM.addAll(list);
        this.f166015b = arrayListM;
        int iIndexOf = (xVar == null || arrayListM.indexOf(xVar) < 0) ? 0 : arrayListM.indexOf(xVar);
        notifyDataSetChanged();
        this.f166017d = iIndexOf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f166015b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        int i15;
        a aVar = (a) f0Var;
        aVar.getClass();
        Button button = aVar.f166019a;
        Context context = button.getContext();
        x xVar = this.f166015b.get(i14);
        switch (xVar == null ? -1 : e.f166020a[xVar.ordinal()]) {
            case 1:
                if (this.f166014a != x0.O0) {
                    i15 = R.string.allday_stress_active;
                    break;
                }
            case 2:
                i15 = R.string.lbl_run;
                break;
            case 3:
                i15 = R.string.lbl_course_point_obstacle;
                break;
            case 4:
                i15 = R.string.workout_step_type_rest;
                break;
            case 5:
                i15 = R.string.activities_gaming_type_match;
                break;
            case 6:
                i15 = R.string.lbl_break;
                break;
            case 7:
                i15 = R.string.activities_ascent_label;
                break;
            case 8:
                i15 = R.string.activities_descent_label;
                break;
            case 9:
                i15 = R.string.lbl_transition;
                break;
            default:
                i15 = R.string.common_all;
                break;
        }
        button.setText(context.getString(i15));
        button.setSelected(i14 == this.f166017d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.view_display_chip, viewGroup, false));
    }

    public /* synthetic */ d(x0 x0Var, List list, x xVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, list, xVar, (i14 & 8) != 0 ? null : lVar);
    }
}

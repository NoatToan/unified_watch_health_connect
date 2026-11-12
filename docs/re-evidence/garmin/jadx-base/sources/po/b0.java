package po;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.b1;
import ps.c1;
import ps.t1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lpo/b0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lpo/b0$a;", "Lps/c1;", "metricTrackLogs", "Lkotlin/Function1;", "Lps/t1;", "", "onMetricSelected", "<init>", "(Lps/c1;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f138821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<t1, Unit> f138822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f138823c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo/b0$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppCompatCheckedTextView f138824a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.item_tv);
            viewFindViewById.getClass();
            this.f138824a = (AppCompatCheckedTextView) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(c1 c1Var, e23.l<? super t1, Unit> lVar) {
        c1Var.getClass();
        lVar.getClass();
        this.f138821a = c1Var;
        this.f138822b = lVar;
        this.f138823c = p13.h0.C0(p13.w.c(new t1(new b1.r(5.0f), null, null, 6, null)), c1Var.f139766c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f138823c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String str;
        b1 b1Var;
        a aVar = (a) f0Var;
        aVar.getClass();
        Context context = aVar.itemView.getContext();
        t1 t1Var = (t1) this.f138823c.get(i14);
        c1 c1Var = this.f138821a;
        t1 t1Var2 = c1Var.f139768e;
        if (t1Var2 == null || (b1Var = t1Var2.f140222a) == null || (str = b1Var.f139689a) == null) {
            str = ((t1) p13.h0.b0(c1Var.f139766c)).f140222a.f139689a;
        }
        AppCompatCheckedTextView appCompatCheckedTextView = aVar.f138824a;
        appCompatCheckedTextView.setText(context.getString(t1Var.f140222a.f139690b));
        appCompatCheckedTextView.setChecked(p005kotlin.jvm.internal.s.g(t1Var.f140222a.f139689a, str));
        appCompatCheckedTextView.setOnClickListener(new pm0.h(1, this, t1Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.checked_text_view_list_item, viewGroup, false);
        viewE.getClass();
        return new a(viewE);
    }
}

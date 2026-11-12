package hq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lhq/b0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "", "exerciseOnSelect", "<init>", "(Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<com.garmin.android.apps.connectmobile.repcounting.model.d, Unit> f84965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f84966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f84967c;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(e23.l<? super com.garmin.android.apps.connectmobile.repcounting.model.d, Unit> lVar) {
        lVar.getClass();
        this.f84965a = lVar;
        this.f84966b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f84966b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        t0 t0Var = (t0) this.f84966b.get(i14);
        if (t0Var instanceof p0) {
            return 0;
        }
        if (t0Var instanceof r0) {
            return 1;
        }
        lc.u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        t0 t0Var = (t0) this.f84966b.get(i14);
        if ((f0Var instanceof q0) && (t0Var instanceof p0)) {
            q0 q0Var = (q0) f0Var;
            String str = ((p0) t0Var).f85130a;
            str.getClass();
            TextView textView = q0Var.f85137a;
            textView.setText(str);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, str.length() == 0 ? q0Var.itemView.getResources().getDimensionPixelSize(R.dimen.spacing_small) : -2, 1.0f));
            return;
        }
        if ((f0Var instanceof s0) && (t0Var instanceof r0)) {
            s0 s0Var = (s0) f0Var;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = ((r0) t0Var).f85140a;
            dVar.getClass();
            s0Var.itemView.setOnClickListener(new cw2.b(27, s0Var, dVar));
            s0Var.f85147b.setText(dVar.f41107f);
            r0 r0Var = this.f84967c;
            s0Var.f85148c.setChecked(dVar.equals(r0Var != null ? r0Var.f85140a : null));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            q0.f85136b.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_group_header, viewGroup, false);
            viewInflate.getClass();
            return new q0(viewInflate);
        }
        if (i14 != 1) {
            vb.h.s(v.e0.f(i14, "Fix me developer! Unsupported viewType=[", "] is found."));
            return null;
        }
        s0.f85145d.getClass();
        e23.l<com.garmin.android.apps.connectmobile.repcounting.model.d, Unit> lVar = this.f84965a;
        lVar.getClass();
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_select_exercises_row_item_select, viewGroup, false);
        viewInflate2.getClass();
        return new s0(viewInflate2, lVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lhq/b0$a;", "", "<init>", "()V", "", "VIEW_TYPE_HEADER", "I", "VIEW_TYPE_ITEM", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

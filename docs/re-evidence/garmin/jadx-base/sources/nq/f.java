package nq;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.c0;
import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnq/f;", "Lpq/e$a;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/c0;", "Landroid/view/View;", "itemView", "", "Lpq/h;", "userActionStrategy", "<init>", "(Landroid/view/View;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends pq.e.a<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<pq.h> f126895a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(View view2, List<? extends pq.h> list) {
        super(view2);
        view2.getClass();
        list.getClass();
        this.f126895a = list;
    }

    @Override // pq.e.a, pq.e
    public final void d() {
        this.itemView.setAlpha(1.0f);
        this.itemView.findViewById(R.id.removeIcon).setVisibility(this.f126895a.contains(m.f126925a) ? 0 : 4);
    }

    @Override // pq.e.a, pq.e
    public final void e() {
        this.itemView.setAlpha(0.5f);
        this.itemView.findViewById(R.id.removeIcon).setVisibility(4);
    }

    @Override // pq.e.a
    public final void f(c0 c0Var) {
        c0 c0Var2 = c0Var;
        c0Var2.getClass();
        View viewFindViewById = this.itemView.findViewById(R.id.reorderIcon);
        viewFindViewById.getClass();
        pq.f fVar = pq.f.f139550a;
        List<pq.h> list = this.f126895a;
        viewFindViewById.setVisibility(list.contains(fVar) ? 0 : 8);
        this.itemView.findViewById(R.id.removeIcon).setVisibility(list.contains(m.f126925a) ? 0 : 4);
        ((TextView) this.itemView.findViewById(R.id.round)).setText(this.itemView.getContext().getString(R.string.string_space_string_pattern, z.b(R.string.golf_lbl_round, this.itemView), String.valueOf(c0Var2.getAdapterIndex() + 1)));
    }
}

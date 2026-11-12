package uy1;

import am.x0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\n\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Luy1/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Luy1/f$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lmy1/e;", "itemList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "b", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<my1.e> f173412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f173413b;

    public interface a {
        void N1(x0 x0Var, com.garmin.android.apps.connectmobile.courses.model.d dVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy1/f$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Luy1/f;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f173414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f173415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.item_header);
            viewFindViewById.getClass();
            this.f173414a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.item_description);
            viewFindViewById2.getClass();
            this.f173415b = (TextView) viewFindViewById2;
        }
    }

    public f(Context context, List<my1.e> list) {
        context.getClass();
        list.getClass();
        this.f173412a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f173412a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        my1.e eVar = this.f173412a.get(i14);
        bVar.f173414a.setText(eVar.f121504a);
        bVar.f173415b.setText(eVar.f121505b);
        bVar.itemView.setOnClickListener(new u12.e(12, this, eVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, j.b(viewGroup, R.layout.ti_simple_two_row_item, viewGroup, false));
    }
}

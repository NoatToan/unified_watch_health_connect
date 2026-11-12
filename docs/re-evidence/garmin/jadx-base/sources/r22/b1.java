package r22;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lr22/b1;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lr22/b1$a;", "", "", "labelsList", "Lkotlin/Function1;", "", "", "onItemSelected", "<init>", "(Ljava/util/List;Le23/l;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f149592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<Integer, Unit> f149593b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr22/b1$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f149594a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.text1);
            TextView textView = (TextView) viewFindViewById;
            textView.setTextAppearance(com.garmin.android.apps.connectmobile.R.style.Text_Body1);
            textView.setGravity(8388627);
            viewFindViewById.getClass();
            this.f149594a = (TextView) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1(List<String> list, e23.l<? super Integer, Unit> lVar) {
        list.getClass();
        lVar.getClass();
        this.f149592a = list;
        this.f149593b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f149592a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        aVar.f149594a.setText(this.f149592a.get(i14));
        aVar.itemView.setOnClickListener(new aq.b0(this, i14, 18));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.simple_list_item_1, viewGroup, false);
        viewE.getClass();
        return new a(viewE);
    }
}

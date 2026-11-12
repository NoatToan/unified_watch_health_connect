package hq;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lhq/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lhq/g$a;", "", "Lhq/h;", "filterList", "Lkotlin/Function1;", "", "onChipCloseClick", "<init>", "(Ljava/util/List;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f85013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<h, Unit> f85014b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhq/g$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f85015c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f85016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f85017b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.chip_text_view);
            viewFindViewById.getClass();
            this.f85016a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.chip_action_image_view);
            viewFindViewById2.getClass();
            this.f85017b = (ImageView) viewFindViewById2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<h> list, e23.l<? super h, Unit> lVar) {
        list.getClass();
        lVar.getClass();
        this.f85013a = list;
        this.f85014b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f85013a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        h hVar = this.f85013a.get(i14);
        hVar.getClass();
        e23.l<h, Unit> lVar = this.f85014b;
        lVar.getClass();
        aVar.f85016a.setText(hVar.f85026a);
        aVar.f85017b.setOnClickListener(new cw2.b(25, lVar, hVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(n23.j.b(viewGroup, R.layout.view_chip_with_icon, viewGroup, false));
    }
}

package ro1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000bB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lro1/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lro1/f$a;", "", "Lro1/e;", "appList", "Lkotlin/Function1;", "", "onPickAppListener", "<init>", "(Ljava/util/List;Le23/l;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f153935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<e, Unit> f153936b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lro1/f$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lro1/f;Landroid/view/View;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f153937c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f153938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f153939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, View view2) {
            super(view2);
            view2.getClass();
            this.f153939b = fVar;
            this.f153938a = view2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends e> list, e23.l<? super e, Unit> lVar) {
        list.getClass();
        lVar.getClass();
        this.f153935a = list;
        this.f153936b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f153935a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        e eVar = this.f153935a.get(i14);
        eVar.getClass();
        View view2 = aVar.f153938a;
        ((ImageView) view2.findViewById(R.id.app_icon)).setImageDrawable(eVar.f153930b);
        ((TextView) view2.findViewById(R.id.app_label)).setText(eVar.f153931c);
        v22.e.n(view2, new rk0.g(2, aVar.f153939b, eVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.share_app_picker_item, viewGroup, false));
    }
}

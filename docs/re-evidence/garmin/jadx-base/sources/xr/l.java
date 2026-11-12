package xr;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import xd2.m0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxr/l;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191984a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f191985b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super PrivacyType, Unit> f191986c = new m0(7);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxr/l$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lxr/l;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f191987f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f191988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f191989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f191990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f191991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f191992e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, View view2) {
            super(view2);
            view2.getClass();
            this.f191988a = view2;
            this.f191989b = (ImageView) view2.findViewById(R.id.icon_image_view);
            this.f191990c = (TextView) view2.findViewById(R.id.checkable_row_name);
            this.f191991d = (TextView) view2.findViewById(R.id.checkable_row_hint);
            this.f191992e = (ImageView) view2.findViewById(R.id.checkable_row_img);
            view2.setOnClickListener(new wv2.h(8, this, lVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f191985b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (f0Var instanceof a) {
            a aVar = (a) f0Var;
            hr.a aVar2 = (hr.a) this.f191985b.get(i14);
            aVar2.getClass();
            ImageView imageView = aVar.f191992e;
            imageView.getClass();
            v22.e.s(imageView, aVar2.f85283b);
            PrivacyType privacyType = aVar2.f85282a;
            TextView textView = aVar.f191990c;
            View view2 = aVar.f191988a;
            textView.setText(view2.getContext().getString(privacyType.getF28797a()));
            TextView textView2 = aVar.f191991d;
            textView2.setText(view2.getContext().getString(privacyType.getF28798b()));
            textView2.setVisibility(0);
            ImageView imageView2 = aVar.f191989b;
            imageView2.setImageResource(privacyType.getDrawableResourceID());
            imageView2.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.item_selection_row, viewGroup, false));
    }
}

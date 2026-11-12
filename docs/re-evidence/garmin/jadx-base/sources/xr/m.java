package xr;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import xd2.m0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lxr/m;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191993a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f191994b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super Double, Unit> f191995c = new m0(8);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxr/m$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lxr/m;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f191996f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f191997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f191998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f191999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f192000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final sr.p f192001e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, View view2) {
            super(view2);
            view2.getClass();
            this.f191997a = view2;
            this.f191998b = (ImageView) view2.findViewById(R.id.icon_image_view);
            this.f191999c = (TextView) view2.findViewById(R.id.checkable_row_name);
            this.f192000d = (ImageView) view2.findViewById(R.id.checkable_row_img);
            Context context = view2.getContext();
            context.getClass();
            this.f192001e = new sr.p(new l22.a(context));
            v22.e.n(view2, new x9.b(5, this, mVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f191994b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        Integer numValueOf;
        f0Var.getClass();
        if (f0Var instanceof a) {
            a aVar = (a) f0Var;
            hr.b bVar = (hr.b) this.f191994b.get(i14);
            bVar.getClass();
            ImageView imageView = aVar.f192000d;
            imageView.getClass();
            v22.e.s(imageView, bVar.f85285b);
            double d14 = bVar.f85284a;
            TextView textView = aVar.f191999c;
            sr.p pVar = aVar.f192001e;
            pVar.getClass();
            float f14 = (float) d14;
            Integer numValueOf2 = null;
            if (f14 == 0.0f) {
                numValueOf = Integer.valueOf(R.string.lbl_too_easy);
            } else if (f14 == 25.0f) {
                numValueOf = Integer.valueOf(R.string.lbl_easy);
            } else if (f14 == 50.0f) {
                numValueOf = Integer.valueOf(R.string.lbl_moderate);
            } else if (f14 == 75.0f) {
                numValueOf = Integer.valueOf(R.string.lbl_hard);
            } else {
                numValueOf = f14 == 100.0f ? Integer.valueOf(R.string.lbl_very_hard) : null;
            }
            textView.setText(numValueOf == null ? "" : pVar.f160580a.getString(numValueOf.intValue()));
            if (f14 == 0.0f) {
                numValueOf2 = Integer.valueOf(R.drawable.icon_rating_too_easy);
            } else if (f14 == 25.0f) {
                numValueOf2 = Integer.valueOf(R.drawable.icon_rating_easy);
            } else if (f14 == 50.0f) {
                numValueOf2 = Integer.valueOf(R.drawable.icon_rating_moderate);
            } else if (f14 == 75.0f) {
                numValueOf2 = Integer.valueOf(R.drawable.icon_rating_hard);
            } else if (f14 == 100.0f) {
                numValueOf2 = Integer.valueOf(R.drawable.icon_rating_very_hard);
            }
            if (numValueOf2 != null) {
                int iIntValue = numValueOf2.intValue();
                ImageView imageView2 = aVar.f191998b;
                imageView2.setImageResource(iIntValue);
                imageView2.setVisibility(0);
                int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, imageView2.getContext().getResources().getDisplayMetrics());
                imageView2.getLayoutParams().height = iApplyDimension;
                imageView2.getLayoutParams().width = iApplyDimension;
                imageView2.requestLayout();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.item_selection_row, viewGroup, false));
    }
}

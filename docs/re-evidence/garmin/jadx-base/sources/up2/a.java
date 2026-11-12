package up2;

import a71.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lup2/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lup2/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lvp2/b;", "dataSet", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<C3213a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<vp2.b> f172157b;

    /* JADX INFO: renamed from: up2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lup2/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3213a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f172158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f172159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f172160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3213a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.bankSupportTitleTextView);
            viewFindViewById.getClass();
            this.f172158a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.bankSupportIcon);
            viewFindViewById2.getClass();
            this.f172159b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.exitIcon);
            viewFindViewById3.getClass();
            this.f172160c = (ImageView) viewFindViewById3;
        }
    }

    public a(Context context, List<vp2.b> list) {
        context.getClass();
        list.getClass();
        this.f172156a = context;
        this.f172157b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f172157b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        C3213a c3213a = (C3213a) f0Var;
        c3213a.getClass();
        vp2.b bVar = this.f172157b.get(i14);
        TextView textView = c3213a.f172158a;
        ImageView imageView = c3213a.f172160c;
        textView.setText(bVar.f179408a);
        Drawable drawable = a7.b.getDrawable(this.f172156a, bVar.f179409b);
        ImageView imageView2 = c3213a.f172159b;
        imageView2.setImageDrawable(drawable);
        Context context = c3213a.itemView.getContext();
        if (context != null && c22.b.e(context)) {
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            Resources resources = context.getResources();
            resources.getClass();
            layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, 20.0f), 1.8f);
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            Resources resources2 = context.getResources();
            resources2.getClass();
            layoutParams2.height = (int) c22.b.c(context, xy2.b.n(resources2, 20.0f), 1.8f);
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            Resources resources3 = context.getResources();
            resources3.getClass();
            layoutParams3.width = (int) c22.b.c(context, xy2.b.n(resources3, 16.0f), 1.8f);
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            Resources resources4 = context.getResources();
            resources4.getClass();
            layoutParams4.height = (int) c22.b.c(context, xy2.b.n(resources4, 16.0f), 1.8f);
        }
        c3213a.itemView.setOnClickListener(new k(bVar.f179410c, 6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.item_bank_support, viewGroup, false);
        viewE.getClass();
        return new C3213a(viewE);
    }
}

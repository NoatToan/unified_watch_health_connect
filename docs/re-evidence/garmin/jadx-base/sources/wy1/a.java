package wy1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;
import vy1.e;
import wv2.h;
import xy1.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\nB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lwy1/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lwy1/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lxy1/d;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<C3498a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<d> f188050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f188051b;

    /* JADX INFO: renamed from: wy1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwy1/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Lwy1/a;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C3498a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f188052c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f188053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f188054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3498a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f188054b = aVar;
            View view3 = this.itemView;
            view3.getClass();
            this.f188053a = (ConstraintLayout) view3;
        }
    }

    public a(Context context, List<d> list) {
        context.getClass();
        this.f188050a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        List<d> list = this.f188050a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        C3498a c3498a = (C3498a) f0Var;
        c3498a.getClass();
        List<d> list = this.f188050a;
        if (list != null) {
            d dVar = list.get(i14);
            dVar.getClass();
            ConstraintLayout constraintLayout = c3498a.f188053a;
            a aVar = c3498a.f188054b;
            ((TextView) constraintLayout.findViewById(R.id.textview)).setText(dVar.f192713b);
            ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.imageView2);
            imageView.setClickable(false);
            imageView.setFocusable(false);
            constraintLayout.setOnClickListener(new h(1, aVar, dVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new C3498a(this, j.b(viewGroup, R.layout.view_display_chip_x, viewGroup, false));
    }

    public /* synthetic */ a(Context context, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : list);
    }
}

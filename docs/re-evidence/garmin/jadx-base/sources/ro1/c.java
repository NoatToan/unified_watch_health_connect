package ro1;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lro1/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lro1/c$a;", "Lro1/u;", "viewModel", "<init>", "(Lro1/u;)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f153915b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f153916a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lro1/c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lro1/c;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f153917c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f153918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f153919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.stats_template_image);
            viewFindViewById.getClass();
            ImageView imageView = (ImageView) viewFindViewById;
            this.f153918a = imageView;
            View viewFindViewById2 = view2.findViewById(R.id.thumbnail_image);
            viewFindViewById2.getClass();
            this.f153919b = (ImageView) viewFindViewById2;
            imageView.setOnClickListener(new pm0.h(12, cVar, this));
        }
    }

    /* JADX INFO: renamed from: ro1.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2913c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f153920a;

        public C2913c(e23.l lVar) {
            lVar.getClass();
            this.f153920a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f153920a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f153920a.invoke(obj);
        }
    }

    static {
        new b(null);
    }

    public c(u uVar) {
        uVar.getClass();
        this.f153916a = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return ro1.b.values().length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        onBindViewHolder(aVar, i14, new ArrayList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.share_image_stats_template_list_item, viewGroup, false);
        viewE.post(new com.mapbox.maps.plugin.annotation.a(this, viewE, viewGroup, (ImageView) viewE.findViewById(R.id.stats_template_image), (ImageView) viewE.findViewById(R.id.thumbnail_image), 2));
        return new a(this, viewE);
    }

    public int r(View view2, ViewGroup viewGroup) {
        int height = view2.getHeight();
        int width = (int) (((double) viewGroup.getWidth()) * 0.28d);
        return height <= width ? height : width;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(a aVar, int i14, List<Object> list) {
        ro1.b bVar;
        aVar.getClass();
        ImageView imageView = aVar.f153918a;
        list.getClass();
        if (list.isEmpty()) {
            ro1.b.f153905d.getClass();
            if (i14 > 0) {
                w13.c cVar = ro1.b.f153909h;
                if (i14 < cVar.getF168272d()) {
                    bVar = (ro1.b) cVar.get(i14);
                } else {
                    bVar = ro1.b.Default;
                }
            } else {
                bVar = ro1.b.Default;
            }
            imageView.setImageResource(bVar.f153910a);
        }
        u uVar = this.f153916a;
        ro1.b bVarD = uVar.f154017f.d();
        boolean z14 = false;
        if (bVarD != null && i14 == bVarD.ordinal()) {
            z14 = true;
        }
        imageView.setSelected(z14);
        y0<g3<Bitmap>> y0Var = uVar.f154021j;
        Object context = aVar.itemView.getContext();
        context.getClass();
        y0Var.f((androidx.lifecycle.n0) context, new C2913c(new qw0.y(aVar, 15)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lro1/c$b;", "", "<init>", "()V", "", "STATS_TEMPLATE_ADJUST_RATIO_SCREEN_WIDTH", "D", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}

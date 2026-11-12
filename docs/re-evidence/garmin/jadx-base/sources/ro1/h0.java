package ro1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import i3.e5;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lro1/h0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lro1/h0$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lro1/u;", "viewModel", "<init>", "(Landroid/content/Context;Lro1/u;)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f153960b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lro1/h0$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lro1/h0;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f153961c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f153962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f153963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0 h0Var, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.time_limited_icon);
            viewFindViewById.getClass();
            this.f153962a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.sticker_image);
            viewFindViewById2.getClass();
            ImageView imageView = (ImageView) viewFindViewById2;
            this.f153963b = imageView;
            imageView.setOnClickListener(new pm0.h(13, h0Var, this));
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153964a;

        static {
            int[] iArr = new int[so1.e.values().length];
            try {
                iArr[so1.e.BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[so1.e.DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f153964a = iArr;
        }
    }

    static {
        new a(null);
    }

    public h0(Context context, u uVar) {
        context.getClass();
        uVar.getClass();
        this.f153959a = context;
        this.f153960b = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return r().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        so1.e eVar = r().get(i14).f153986a;
        int i15 = eVar == null ? -1 : c.f153964a[eVar.ordinal()];
        return (i15 == 1 || i15 == 2) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        ImageView imageView = bVar.f153963b;
        l0 l0Var = r().get(i14);
        bVar.f153962a.setVisibility(l0Var.f153987b ? 0 : 4);
        k0 k0Var = (k0) p13.h0.d0(l0Var.f153988c);
        if (k0Var != null) {
            com.bumptech.glide.b.e(this.f153959a).l(k0Var.f153983b).k(2131233184).E(imageView);
            if (l0Var.f153986a == so1.e.GENERAL) {
                String str = k0Var.f153982a;
                String strV = str != null ? d53.u.v(str, "_", StringUtils.SPACE, false) : null;
                if (strV != null) {
                    imageView.setContentDescription(strV);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.share_image_sticker_list_item, viewGroup, false);
        if (i14 == 1 && (viewE instanceof ConstraintLayout)) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewE;
            dVar.f(constraintLayout);
            dVar.k(R.id.sticker_image).f6203e.f6231f0 = 0.8f;
            dVar.b(constraintLayout);
        }
        viewE.getClass();
        return new b(this, viewE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(RecyclerView.f0 f0Var) {
        b bVar = (b) f0Var;
        bVar.getClass();
        super.onViewRecycled(bVar);
        bVar.f153963b.setContentDescription(null);
    }

    public final List<l0> r() {
        List<l0> list;
        g3<List<l0>> g3VarD = this.f153960b.f154019h.d();
        return ((g3VarD != null ? g3VarD.f35300a : null) != fw.p.SUCCESS || (list = g3VarD.f35301b) == null) ? p13.j0.f134944a : list;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lro1/h0$a;", "", "<init>", "()V", "", "API_STICKER", "I", "APP_STICKER", "", "APP_STICKER_HEIGHT_RATIO", "F", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

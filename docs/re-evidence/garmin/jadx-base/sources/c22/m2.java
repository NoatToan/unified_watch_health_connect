package c22;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lc22/m2;", "Landroidx/recyclerview/widget/s$d;", "Lsq0/b;", "adapter", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroid/graphics/drawable/Drawable;", "iconDrawable", "<init>", "(Lsq0/b;ILandroid/graphics/drawable/Drawable;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m2 extends androidx.recyclerview.widget.s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sq0.b f23144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Drawable f23145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ColorDrawable f23146f;

    static {
        new a(null);
    }

    public m2(sq0.b bVar, int i14, Drawable drawable) {
        bVar.getClass();
        this.f23144d = bVar;
        this.f23145e = drawable;
        this.f23146f = new ColorDrawable(i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.s.d
    public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        super.b(recyclerView, f0Var);
        f0Var.itemView.setAlpha(1.0f);
        if (f0Var instanceof sq0.c) {
            ((sq0.c) f0Var).c();
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        return androidx.recyclerview.widget.s.d.k(p(f0Var) ? 3 : 0, q(f0Var) ? 48 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    @Override // androidx.recyclerview.widget.s.d
    public final void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f14, float f15, int i14, boolean z14) {
        float top;
        recyclerView.getClass();
        f0Var.getClass();
        View view2 = f0Var.itemView;
        if (i14 != 1) {
            float top2 = (view2.getTop() + f15) - recyclerView.getChildAt(0).getHeight();
            float height = f0Var.itemView.getHeight() + top2 + recyclerView.getChildAt(0).getHeight();
            if (top2 >= 0.0f) {
                sq0.b bVar = this.f23144d;
                if (recyclerView.getChildAt(bVar.K0()) == null || top2 >= recyclerView.getChildAt(bVar.K0()).getTop()) {
                    top = (recyclerView.getChildAt(bVar.z1()) == null || height <= ((float) recyclerView.getChildAt(bVar.z1()).getTop())) ? f15 : (recyclerView.getChildAt(bVar.z1()).getTop() - f0Var.itemView.getHeight()) - f0Var.itemView.getTop();
                } else {
                    top = 0.0f;
                }
            } else {
                top = 0.0f;
            }
            super.l(canvas, recyclerView, f0Var, f14, top, i14, z14);
            return;
        }
        view2.getClass();
        int left = f14 >= 0.0f ? view2.getLeft() : view2.getRight() + ((int) f14);
        int left2 = f14 >= 0.0f ? view2.getLeft() + ((int) f14) : view2.getRight();
        int top3 = view2.getTop();
        int bottom = view2.getBottom();
        ColorDrawable colorDrawable = this.f23146f;
        colorDrawable.setBounds(left, top3, left2, bottom);
        colorDrawable.draw(canvas);
        Drawable drawable = this.f23145e;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i15 = intrinsicWidth / 2;
            int i16 = f14 >= 0.0f ? left + i15 : (left2 - i15) - intrinsicWidth;
            int bottom2 = (((view2.getBottom() - view2.getTop()) - intrinsicHeight) / 2) + view2.getTop();
            drawable.setBounds(i16, bottom2, intrinsicWidth + i16, intrinsicHeight + bottom2);
            drawable.draw(canvas);
        }
        super.l(canvas, recyclerView, f0Var, f14, f15, i14, z14);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        if (f0Var.getItemViewType() != f0Var2.getItemViewType()) {
            return false;
        }
        this.f23144d.f(f0Var.getBindingAdapterPosition(), f0Var2.getBindingAdapterPosition());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.s.d
    public final void n(int i14, RecyclerView.f0 f0Var) {
        if (i14 != 0 && (f0Var instanceof sq0.c)) {
            ((sq0.c) f0Var).a();
        }
        super.n(i14, f0Var);
    }

    public abstract boolean p(RecyclerView.f0 f0Var);

    public abstract boolean q(RecyclerView.f0 f0Var);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc22/m2$a;", "", "<init>", "()V", "", "ALPHA_FULL", "F", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m2(sq0.b bVar, int i14, Drawable drawable, int i15, p005kotlin.jvm.internal.j jVar) {
        this(bVar, i14, (i15 & 4) != 0 ? null : drawable);
    }
}

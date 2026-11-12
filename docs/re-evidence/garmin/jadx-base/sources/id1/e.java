package id1;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid1/e;", "Landroidx/recyclerview/widget/s$d;", "Lid1/d;", "adapter", "<init>", "(Lid1/d;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f93027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorDrawable f93028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f93029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextPaint f93030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f93031h;

    public e(d dVar) {
        dVar.getClass();
        this.f93027d = dVar;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        super.b(recyclerView, f0Var);
        this.f93027d.n();
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        return ((f0Var instanceof f) || (f0Var instanceof g)) ? s.d.k(0, 0) : s.d.k(3, 16);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean i() {
        return true;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean j() {
        return true;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f14, float f15, int i14, boolean z14) {
        recyclerView.getClass();
        f0Var.getClass();
        if (this.f93031h) {
            super.l(canvas, recyclerView, f0Var, f14, f15, i14, z14);
            return;
        }
        View view2 = f0Var.itemView;
        view2.getClass();
        int left = f14 >= 0.0f ? view2.getLeft() : view2.getRight() + ((int) f14);
        int left2 = f14 >= 0.0f ? view2.getLeft() + ((int) f14) : view2.getRight();
        ColorDrawable colorDrawable = this.f93028e;
        if (colorDrawable != null) {
            colorDrawable.setBounds(left, view2.getTop(), left2, view2.getBottom());
        }
        ColorDrawable colorDrawable2 = this.f93028e;
        if (colorDrawable2 != null) {
            colorDrawable2.draw(canvas);
        }
        TextPaint textPaint = this.f93030g;
        if (textPaint != null) {
            String str = this.f93029f;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            float fMeasureText = textPaint.measureText(str2);
            float fDescent = textPaint.descent() + (-textPaint.ascent());
            StaticLayout staticLayout = new StaticLayout(str2, this.f93030g, (int) fMeasureText, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            float dimension = recyclerView.getContext().getResources().getDimension(R.dimen.spacing_normal);
            float f16 = f14 >= 0.0f ? left + dimension : (left2 - dimension) - fMeasureText;
            float bottom = (((view2.getBottom() - view2.getTop()) - fDescent) / 2) + view2.getTop();
            canvas.save();
            canvas.translate(f16, bottom);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        super.l(canvas, recyclerView, f0Var, f14, f15, i14, z14);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        return this.f93027d.f(f0Var.getBindingAdapterPosition(), f0Var2.getBindingAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void n(int i14, RecyclerView.f0 f0Var) {
        super.n(i14, f0Var);
        this.f93031h = i14 == 2;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
        this.f93027d.m(f0Var.getBindingAdapterPosition());
    }
}

package r22;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lr22/c1;", "Landroidx/recyclerview/widget/s$d;", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroid/graphics/drawable/Drawable;", "iconDrawable", "<init>", "(ILandroid/graphics/drawable/Drawable;)V", "Landroid/content/res/Resources;", "resources", "stringRes", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "textSize", "(Landroid/content/res/Resources;IIII)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c1 extends androidx.recyclerview.widget.s.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f149627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ColorDrawable f149628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f149629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextPaint f149630g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(Resources resources, int i14, int i15, int i16, int i17) {
        this(i14, null);
        resources.getClass();
        this.f149629f = resources.getString(i15);
        TextPaint textPaint = new TextPaint();
        this.f149630g = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(resources.getDimension(i17));
        textPaint.setColor(i16);
    }

    @Override // androidx.recyclerview.widget.s.d
    public int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        if (p(f0Var)) {
            return androidx.recyclerview.widget.s.d.k(0, 12);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f14, float f15, int i14, boolean z14) {
        recyclerView.getClass();
        f0Var.getClass();
        View view2 = f0Var.itemView;
        view2.getClass();
        int left = f14 >= 0.0f ? view2.getLeft() : view2.getRight() + ((int) f14);
        int left2 = f14 >= 0.0f ? view2.getLeft() + ((int) f14) : view2.getRight();
        int top = view2.getTop();
        int bottom = view2.getBottom();
        ColorDrawable colorDrawable = this.f149628e;
        colorDrawable.setBounds(left, top, left2, bottom);
        colorDrawable.draw(canvas);
        Drawable drawable = this.f149627d;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i15 = intrinsicWidth / 2;
            int i16 = f14 >= 0.0f ? i15 + left : (left2 - i15) - intrinsicWidth;
            int bottom2 = (((view2.getBottom() - view2.getTop()) - intrinsicHeight) / 2) + view2.getTop();
            drawable.setBounds(i16, bottom2, intrinsicWidth + i16, intrinsicHeight + bottom2);
            drawable.draw(canvas);
        }
        TextPaint textPaint = this.f149630g;
        if (textPaint != null) {
            String str = this.f149629f;
            if (str == null) {
                str = "";
            }
            float fMeasureText = textPaint.measureText(str);
            float fDescent = textPaint.descent() + (-textPaint.ascent());
            StaticLayout staticLayout = new StaticLayout(str, textPaint, (int) fMeasureText, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            float dimension = recyclerView.getContext().getResources().getDimension(R.dimen.spacing_normal);
            float f16 = f14 >= 0.0f ? left + dimension : (left2 - dimension) - fMeasureText;
            float bottom3 = (((view2.getBottom() - view2.getTop()) - fDescent) / 2) + view2.getTop();
            canvas.save();
            canvas.translate(f16, bottom3);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        super.l(canvas, recyclerView, f0Var, f14, f15, i14, z14);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        return false;
    }

    public abstract boolean p(RecyclerView.f0 f0Var);

    public /* synthetic */ c1(int i14, Drawable drawable, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : drawable);
    }

    public c1(int i14, Drawable drawable) {
        this.f149627d = drawable;
        this.f149628e = new ColorDrawable(i14);
    }
}

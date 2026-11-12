package cy0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcy0/b;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "iconShapeId", "iconBackgroundColorId", "<init>", "(Landroid/content/Context;II)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Drawable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56686d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f56687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f56688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f56689c;

    public b(Context context, int i14, int i15) {
        Rect bounds;
        context.getClass();
        Drawable drawableA = j.a.a(context, R.drawable.icon_activity_map_pointer_fill);
        this.f56687a = drawableA;
        Drawable drawableA2 = j.a.a(context, R.drawable.icon_activity_map_pointer_stroke);
        this.f56688b = drawableA2;
        Drawable drawableA3 = j.a.a(context, i14);
        this.f56689c = drawableA3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        d92.b.f58623a.getClass();
        j92.b bVar = d92.b.f58625c;
        bVar.getClass();
        j92.e eVar = j92.b.f97899b;
        float f14 = eVar.f97921f;
        f56686d.getClass();
        int iApplyDimension = (int) TypedValue.applyDimension(1, f14, displayMetrics);
        bVar.getClass();
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, eVar.f97922g, displayMetrics);
        setBounds(0, 0, iApplyDimension, iApplyDimension2);
        if (drawableA != null) {
            drawableA.setBounds(0, 0, iApplyDimension, iApplyDimension2);
            drawableA.setTint(a7.b.getColor(context, i15));
        }
        if (drawableA2 != null) {
            drawableA2.setBounds(0, 0, iApplyDimension, iApplyDimension2);
        }
        if (drawableA3 != null) {
            bVar.getClass();
            int iApplyDimension3 = (int) TypedValue.applyDimension(1, j92.b.f97901d.f97903b, displayMetrics);
            bVar.getClass();
            int iApplyDimension4 = (int) TypedValue.applyDimension(1, eVar.f97917b, displayMetrics);
            Rect rect = new Rect();
            if (drawableA == null || (bounds = drawableA.getBounds()) == null) {
                bounds = drawableA3.getBounds();
                bounds.getClass();
            }
            Gravity.apply(17, iApplyDimension3, iApplyDimension3, bounds, rect);
            rect.bottom -= iApplyDimension4;
            rect.top -= iApplyDimension4;
            drawableA3.setBounds(rect);
            gl.c.f77766a.getClass();
            drawableA3.setTint(f0.j(gl.c.f77767b.f77769a));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Drawable drawable = this.f56687a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f56688b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = this.f56689c;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcy0/b$a;", "", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package u40;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lu40/h;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/courses/model/f;", "coursePoint", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/courses/model/f;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f168569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f168570b;

    static {
        new a(null);
    }

    public h(Context context, com.garmin.android.apps.connectmobile.courses.model.f fVar) {
        context.getClass();
        fVar.getClass();
        Drawable drawableA = j.a.a(context, R.drawable.icon_map_object_pointer);
        this.f168569a = drawableA;
        this.f168570b = f.a(fVar, context, fb2.g.e(24, context), a7.b.getColor(context, R.color.violet_60_static));
        int iE = fb2.g.e(24, context);
        int iE2 = fb2.g.e(32, context);
        setBounds(0, 0, iE, iE2);
        if (drawableA != null) {
            drawableA.setBounds(0, 0, iE, iE2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Drawable drawable = this.f168569a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f168570b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lu40/h$a;", "", "<init>", "()V", "", "DRAWABLE_WIDTH_SIZE_DP", "I", "DRAWABLE_HEIGHT_SIZE_DP", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

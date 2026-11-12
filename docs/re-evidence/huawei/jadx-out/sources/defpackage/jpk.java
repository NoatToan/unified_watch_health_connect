package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class jpk implements Serializable {
    private static final long serialVersionUID = 334431821164339725L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jpg f38795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38797c;
    private Drawable d;
    private float e;
    private int f;
    private int h;
    private int j;

    public jpk(jpg jpgVar, int i, int i2) {
        this.f38797c = -1;
        this.j = -1;
        this.e = -1.0f;
        this.f38796b = -1.0f;
        this.f38795a = jpgVar;
        this.f = i;
        this.h = i2;
    }

    public void a(Drawable drawable) {
        this.d = drawable;
    }

    public jpk(jpg jpgVar, int i, int i2, int i3, int i4) {
        this.e = -1.0f;
        this.f38796b = -1.0f;
        this.f38795a = jpgVar;
        this.f38797c = i;
        this.j = i2;
        this.f = i3;
        this.h = i4;
    }

    public Drawable b() {
        Drawable[] drawableArr;
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable;
        }
        Context contextB = BaseApplication.b();
        int i = this.f;
        if (i == -1) {
            ReleaseLogUtil.a("Track_HiHealthMarker", "mMarkerIconId is invalid");
            return null;
        }
        int i2 = this.j;
        if (i2 == -1) {
            return d(ContextCompat.getDrawable(contextB, i), this.h);
        }
        Drawable drawableD = d(ContextCompat.getDrawable(contextB, i2), this.h);
        Drawable drawable2 = ContextCompat.getDrawable(contextB, this.f);
        int i3 = this.f38797c;
        if (i3 == -1) {
            drawableArr = new Drawable[]{drawableD, drawable2};
        } else {
            drawableArr = new Drawable[]{ContextCompat.getDrawable(contextB, i3), drawableD, drawable2};
        }
        return new LayerDrawable(drawableArr);
    }

    private Drawable d(Drawable drawable, int i) {
        return (drawable == null || i == -1) ? drawable : qqf.c(drawable, i);
    }

    public jpg e() {
        return this.f38795a;
    }

    public float c() {
        return this.e;
    }

    public void e(float f) {
        this.e = f;
    }

    public float a() {
        return this.f38796b;
    }

    public void a(float f) {
        this.f38796b = f;
    }
}

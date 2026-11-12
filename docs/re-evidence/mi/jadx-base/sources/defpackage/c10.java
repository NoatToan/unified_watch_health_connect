package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c10 {
    public static final Map<mfd, BaseInterpolator> e = e4f.g(mfd.LINEAR, new LinearInterpolator(), mfd.EASE_IN, new AccelerateInterpolator(), mfd.EASE_OUT, new DecelerateInterpolator(), mfd.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Interpolator f4812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4813b;
    public fc1 c;
    public int d;

    public static Interpolator c(mfd mfdVar, ReadableMap readableMap) {
        BaseInterpolator ldmVar = mfdVar.equals(mfd.SPRING) ? new ldm(ldm.a(readableMap)) : e.get(mfdVar);
        if (ldmVar != null) {
            return ldmVar;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + mfdVar);
    }

    public final Animation a(View view, int i, int i2, int i3, int i4) {
        if (!e()) {
            return null;
        }
        Animation animationB = b(view, i, i2, i3, i4);
        if (animationB != null) {
            animationB.setDuration(this.d);
            animationB.setStartOffset(this.f4813b);
            animationB.setInterpolator(this.f4812a);
        }
        return animationB;
    }

    public abstract Animation b(View view, int i, int i2, int i3, int i4);

    public void d(ReadableMap readableMap, int i) {
        this.c = readableMap.hasKey("property") ? fc1.a(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        this.d = i;
        this.f4813b = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (!readableMap.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        this.f4812a = c(mfd.a(readableMap.getString("type")), readableMap);
        if (e()) {
            return;
        }
        throw new IllegalViewOperationException("Invalid layout animation : " + readableMap);
    }

    public abstract boolean e();

    public void f() {
        this.c = null;
        this.d = 0;
        this.f4813b = 0;
        this.f4812a = null;
    }
}

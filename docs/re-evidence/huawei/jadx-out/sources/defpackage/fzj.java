package defpackage;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fzj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<GifDrawable> f34789a = new ArrayList();

    public void e(GifDrawable gifDrawable) {
        this.f34789a.add(gifDrawable);
        gifDrawable.setLoopCount(6);
        gifDrawable.registerAnimationCallback(new Animatable2Compat.AnimationCallback() { // from class: fzj.1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                super.onAnimationStart(drawable);
                LogUtil.a("GifManager", "onAnimationStart for drawable = ", drawable);
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                super.onAnimationEnd(drawable);
                LogUtil.a("GifManager", "onAnimationEnd for drawable = ", drawable);
            }
        });
    }

    public void a() {
        for (GifDrawable gifDrawable : this.f34789a) {
            if (gifDrawable != null) {
                try {
                    gifDrawable.start();
                } catch (NullPointerException e) {
                    LogUtil.c("GifManager", "triggerStart gif failed, exception = ", ExceptionUtils.c(e));
                }
            }
        }
    }

    public void c() {
        for (GifDrawable gifDrawable : this.f34789a) {
            if (gifDrawable != null) {
                gifDrawable.stop();
            }
        }
    }

    private void d(int i) {
        for (GifDrawable gifDrawable : this.f34789a) {
            if (gifDrawable != null) {
                gifDrawable.setLoopCount(i);
            }
        }
    }

    public void e() {
        d(2);
    }

    public void d() {
        d(6);
        a();
    }

    public void b() {
        d(50);
        a();
    }
}

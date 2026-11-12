package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;

/* JADX INFO: loaded from: classes3.dex */
public class fw6 {
    public static void a(View view) {
        float[] fArr = new float[2];
        fArr[0] = dyq.f(view.getContext()) ? gw6.f19395b : gw6.f19394a;
        fArr[1] = 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, SleepAnalyzerAlpha.NAME_ALPHA, fArr);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.start();
    }

    public static void b(View view) {
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        fArr[1] = dyq.f(view.getContext()) ? gw6.f19395b : gw6.f19394a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, SleepAnalyzerAlpha.NAME_ALPHA, fArr);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }
}

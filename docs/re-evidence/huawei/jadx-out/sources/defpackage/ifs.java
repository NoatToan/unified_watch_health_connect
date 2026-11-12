package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes31.dex */
public class ifs {
    public static AnimationSet b() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 0, qrs.d(BaseApplication.getContext(), 30.0f), 0, 0.0f);
        translateAnimation.setDuration(250L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static AnimationSet g() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 0, 0.0f, 0, qrs.d(BaseApplication.getContext(), -30.0f));
        translateAnimation.setDuration(250L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(250L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static AnimationSet a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 0, qrs.d(BaseApplication.getContext(), -30.0f), 0, 0.0f);
        translateAnimation.setDuration(250L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static AnimationSet d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 0, 0.0f, 0, qrs.d(BaseApplication.getContext(), 30.0f));
        translateAnimation.setDuration(250L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(250L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public static int e() {
        return R.animator.search_show;
    }

    public static int c() {
        return R.animator.search_gone;
    }
}

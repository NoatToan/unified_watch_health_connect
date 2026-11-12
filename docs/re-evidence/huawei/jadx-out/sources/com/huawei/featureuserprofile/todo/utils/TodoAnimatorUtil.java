package com.huawei.featureuserprofile.todo.utils;

import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class TodoAnimatorUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HwCubicBezierInterpolator f5768a = new HwCubicBezierInterpolator(0.0f, 0.2f, 0.2f, 1.0f);

    public interface AnimatorFinishCallback {
        void dismissAll();
    }

    public static void d(RecyclerView recyclerView) {
        int i = R.anim.todo_item_in;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            i = R.anim.todo_item_in_mirror;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(BaseApplication.getContext(), i);
        animationLoadAnimation.setFillAfter(true);
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animationLoadAnimation);
        layoutAnimationController.setOrder(1);
        layoutAnimationController.setInterpolator(f5768a);
        layoutAnimationController.setDelay(0.15f);
        recyclerView.setLayoutAnimation(layoutAnimationController);
    }

    public static void d(RecyclerView recyclerView, final AnimatorFinishCallback animatorFinishCallback) {
        if (recyclerView == null) {
            LogUtil.j("TodoAnimator", "dismissAnimateStart mListView is null");
            animatorFinishCallback.dismissAll();
            return;
        }
        LogUtil.a("TodoAnimator", "dismissAnimateStart");
        final List<View> listE = e(recyclerView);
        if (njy.b(listE)) {
            final int i = 0;
            while (i < listE.size()) {
                final View view = listE.get(i);
                Handler handler = new Handler();
                Runnable runnable = new Runnable() { // from class: czn
                    @Override // java.lang.Runnable
                    public final void run() {
                        TodoAnimatorUtil.e(view, i, listE, animatorFinishCallback);
                    }
                };
                i++;
                handler.postDelayed(runnable, i * 30);
            }
            return;
        }
        animatorFinishCallback.dismissAll();
        LogUtil.j("TodoAnimator", "todolist is empty");
    }

    public static /* synthetic */ void e(View view, int i, List list, AnimatorFinishCallback animatorFinishCallback) {
        b(view, null);
        if (i == list.size() - 1) {
            b(view, animatorFinishCallback);
        }
    }

    private static List<View> e(RecyclerView recyclerView) {
        ArrayList arrayList = new ArrayList(recyclerView.getChildCount());
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            arrayList.add(recyclerView.getChildAt(i));
        }
        return arrayList;
    }

    private static void b(final View view, final AnimatorFinishCallback animatorFinishCallback) {
        int width = view.getWidth();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            width = 0;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, width, view.getHeight());
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 30.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(200L);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(f5768a);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.featureuserprofile.todo.utils.TodoAnimatorUtil.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
                if (animatorFinishCallback != null) {
                    LogUtil.a("TodoAnimator", "all dismissAnimate finish");
                    animatorFinishCallback.dismissAll();
                }
            }
        });
        view.startAnimation(animationSet);
    }

    public static void e(boolean z, View view, Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation;
        ScaleAnimation scaleAnimation;
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(250L);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(f5768a);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        if (animationListener != null) {
            animationSet.setAnimationListener(animationListener);
        }
        view.startAnimation(animationSet);
    }
}

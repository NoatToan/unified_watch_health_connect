package com.kogitune.activity_transition.core;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class TransitionAnimation {
    private static final String a = "Transition";
    private static final int b = 3000;
    public static WeakReference<Bitmap> bitmapCache = null;
    public static boolean isImageFileReady = false;
    public static final Object lock = new Object();

    public static class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ MoveData b;
        public final /* synthetic */ TransitionData c;
        public final /* synthetic */ TimeInterpolator d;
        public final /* synthetic */ Animator.AnimatorListener e;

        public a(View view, MoveData moveData, TransitionData transitionData, TimeInterpolator timeInterpolator, Animator.AnimatorListener animatorListener) {
            this.a = view;
            this.b = moveData;
            this.c = transitionData;
            this.d = timeInterpolator;
            this.e = animatorListener;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            int[] iArr = new int[2];
            this.a.getLocationOnScreen(iArr);
            MoveData moveData = this.b;
            TransitionData transitionData = this.c;
            moveData.leftDelta = transitionData.thumbnailLeft - iArr[0];
            moveData.topDelta = transitionData.thumbnailTop - iArr[1];
            moveData.widthScale = transitionData.thumbnailWidth / this.a.getWidth();
            this.b.heightScale = this.c.thumbnailHeight / this.a.getHeight();
            TransitionAnimation.b(this.b, this.d, this.e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MoveData moveData, TimeInterpolator timeInterpolator, Animator.AnimatorListener animatorListener) {
        View view = moveData.toView;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(moveData.widthScale);
        view.setScaleY(moveData.heightScale);
        view.setTranslationX(moveData.leftDelta);
        view.setTranslationY(moveData.topDelta);
        view.animate().setDuration(moveData.duration).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(animatorListener).setInterpolator(timeInterpolator);
    }

    private static void c(View view, Bitmap bitmap) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageBitmap(bitmap);
        } else if (Build.VERSION.SDK_INT > 16) {
            view.setBackground(new BitmapDrawable(view.getResources(), bitmap));
        } else {
            view.setBackgroundDrawable(new BitmapDrawable(view.getResources(), bitmap));
        }
    }

    private static void d(View view, String str) {
        Bitmap bitmapDecodeFile;
        WeakReference<Bitmap> weakReference = bitmapCache;
        if (weakReference == null || (bitmapDecodeFile = weakReference.get()) == null) {
            synchronized (lock) {
                while (!isImageFileReady) {
                    try {
                        lock.wait(3000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
        } else {
            bitmapCache.clear();
        }
        c(view, bitmapDecodeFile);
    }

    public static MoveData startAnimation(Context context, View view, Bundle bundle, Bundle bundle2, int i, TimeInterpolator timeInterpolator, Animator.AnimatorListener animatorListener) {
        TransitionData transitionData = new TransitionData(context, bundle);
        String str = transitionData.imageFilePath;
        if (str != null) {
            d(view, str);
        }
        MoveData moveData = new MoveData();
        moveData.toView = view;
        moveData.duration = i;
        if (bundle2 == null) {
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, moveData, transitionData, timeInterpolator, animatorListener));
        }
        return moveData;
    }

    public static void startExitAnimation(MoveData moveData, TimeInterpolator timeInterpolator, Runnable runnable, Animator.AnimatorListener animatorListener) {
        View view = moveData.toView;
        int i = moveData.duration;
        int i2 = moveData.leftDelta;
        long j = i;
        view.animate().setDuration(j).scaleX(moveData.widthScale).scaleY(moveData.heightScale).setInterpolator(timeInterpolator).translationX(i2).setListener(animatorListener).translationY(moveData.topDelta);
        view.postDelayed(runnable, j);
    }
}

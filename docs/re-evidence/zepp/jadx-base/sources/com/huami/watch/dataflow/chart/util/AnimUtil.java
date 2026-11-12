package com.huami.watch.dataflow.chart.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class AnimUtil {
    public static final int DURATION_CHART_SLEEP_SWITCH = 650;
    public static final int DURATION_CHART_STEP_SLEEP_SWITCH = 300;
    public static final int DURATION_CHART_STEP_SWITCH = 550;
    public static final int DURATION_DATE_SWITCH = 600;
    public static final int DURATION_FLOW_IN = 600;
    public static final int DURATION_LOADING = 3500;
    public static final int DURATION_NUM_SWITCH = 20;
    public static final int DURATION_PIE_CHART = 800;
    private static final String a = "Chart.AnimUtil";
    private static LayoutTransition b;
    private static LayoutTransition c;

    public interface AnimColorListener {
        void onColorChanged(int i);
    }

    public static class AnimSetBuilder {
        private static Animator a;
        private static ArrayList<Animator> b = new ArrayList<>();

        private AnimSetBuilder() {
        }

        private static void a() {
            a = null;
            b.clear();
        }

        public static void addAnim(Animator animator) {
            b.add(animator);
        }

        public static AnimatorSet build() {
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder builderPlay = animatorSet.play(a);
            Iterator<Animator> it2 = b.iterator();
            while (it2.hasNext()) {
                builderPlay.with(it2.next());
            }
            a();
            return animatorSet;
        }

        public static void setFirstAnim(Animator animator) {
            a = animator;
        }

        public static void addAnim(Animator animator, long j) {
            animator.setDuration(j);
            b.add(animator);
        }

        public static void setFirstAnim(Animator animator, long j) {
            animator.setDuration(j);
            a = animator;
        }

        public static void addAnim(Animator animator, long j, long j2) {
            animator.setStartDelay(j2);
            if (j > 0) {
                animator.setDuration(j);
            }
            b.add(animator);
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setVisibility(8);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setVisibility(0);
        }
    }

    public class c extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ((View) ((ObjectAnimator) animator).getTarget()).setRotationY(0.0f);
        }
    }

    public class d extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ((View) ((ObjectAnimator) animator).getTarget()).setRotationX(0.0f);
        }
    }

    public class e implements Animator.AnimatorListener {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TextView c;
        public final /* synthetic */ String d;

        public e(TextView textView, String str, TextView textView2, String str2) {
            this.a = textView;
            this.b = str;
            this.c = textView2;
            this.d = str2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setText(this.b);
            this.a.setAlpha(0.9f);
            this.a.setScaleX(0.9f);
            this.a.setScaleY(0.9f);
            this.c.setText(this.d);
            this.c.setAlpha(0.5f);
            this.c.setScaleX(0.5f);
            this.c.setScaleY(0.5f);
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        public f(TextView textView, TextView textView2) {
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = (1.0f - fFloatValue) * 0.9f;
            float f2 = (fFloatValue * 0.5f) + 0.5f;
            this.a.setAlpha(f);
            this.a.setScaleX(f);
            this.a.setScaleY(f);
            this.b.setAlpha(f2);
            this.b.setScaleX(f2);
            this.b.setScaleY(f2);
        }
    }

    public class g implements TypeEvaluator<Object> {
        @Override // android.animation.TypeEvaluator
        public Object evaluate(float f, Object obj, Object obj2) {
            return obj;
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView a;

        public h(TextView textView) {
            this.a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setText((CharSequence) valueAnimator.getAnimatedValue("Text"));
        }
    }

    public class i implements TypeEvaluator<Object> {
        @Override // android.animation.TypeEvaluator
        public Object evaluate(float f, Object obj, Object obj2) {
            return obj2;
        }
    }

    public class j implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView a;

        public j(TextView textView) {
            this.a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setText((String) valueAnimator.getAnimatedValue("Text"));
        }
    }

    public class k implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView a;

        public k(TextView textView) {
            this.a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setText(String.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }
    }

    public class l implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ View[] g;
        public final /* synthetic */ AnimColorListener h;

        public l(int i, int i2, int i3, int i4, int i5, int i6, View[] viewArr, AnimColorListener animColorListener) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = viewArr;
            this.h = animColorListener;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - fFloatValue;
            int iRgb = Color.rgb((int) ((this.a * fFloatValue) + (this.b * f)), (int) ((this.c * fFloatValue) + (this.d * f)), (int) ((this.e * fFloatValue) + (this.f * f)));
            for (View view : this.g) {
                view.setBackgroundColor(iRgb);
            }
            AnimColorListener animColorListener = this.h;
            if (animColorListener != null) {
                animColorListener.onColorChanged(iRgb);
            }
        }
    }

    public class m implements Runnable {
        public final /* synthetic */ View a;

        public m(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setVisibility(4);
        }
    }

    private static LayoutTransition a() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(90L);
        layoutTransition.setInterpolator(2, new AccelerateDecelerateInterpolator());
        layoutTransition.setInterpolator(3, new AccelerateDecelerateInterpolator());
        ObjectAnimator duration = ObjectAnimator.ofFloat((Object) null, "rotationX", 90.0f, 0.0f).setDuration(layoutTransition.getDuration(2));
        layoutTransition.setAnimator(2, duration);
        duration.addListener(new c());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat((Object) null, "rotationX", 0.0f, -90.0f).setDuration(layoutTransition.getDuration(3));
        layoutTransition.setAnimator(3, duration2);
        duration2.addListener(new d());
        return layoutTransition;
    }

    public static Animator animColorTrans(int i2, int i3, View... viewArr) {
        return animColorTrans(i2, i3, null, viewArr);
    }

    public static Animator animDateSwitch(String str, String str2, TextView textView, TextView textView2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new e(textView, str, textView2, str2));
        valueAnimatorOfFloat.addUpdateListener(new f(textView, textView2));
        valueAnimatorOfFloat.setDuration(600L);
        return valueAnimatorOfFloat;
    }

    public static Animator animFade(View view, float f2, float f3) {
        return ObjectAnimator.ofFloat(view, "alpha", f2, f3);
    }

    public static Animator animFadeIn(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.3f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        return objectAnimatorOfFloat;
    }

    public static Animator animFlow(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        return valueAnimatorOfFloat;
    }

    public static void animInfoSwitch(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (b == null) {
            b = a();
        }
        if (c == null) {
            c = a();
        }
        viewGroup.setLayoutTransition(b);
        viewGroup2.setLayoutTransition(c);
        viewGroup2.setVisibility(0);
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            int i4 = (100 - (i3 * 10)) * i3;
            if (i4 > i2) {
                i2 = i4;
            }
            if (childAt.isEnabled()) {
                viewGroup.postDelayed(new m(childAt), i2);
            }
            if (i3 == childCount - 1) {
                viewGroup.postDelayed(new a(viewGroup), i2 + 90);
            }
        }
        int childCount2 = viewGroup2.getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = viewGroup2.getChildAt(i6);
            int i7 = (100 - (i6 * 10)) * i6;
            if (i7 > i5) {
                i5 = i7;
            }
            if (childAt2.isEnabled()) {
                viewGroup2.postDelayed(new b(childAt2), i5);
            }
        }
    }

    public static Animator animNumSwitch(int i2, int i3, TextView textView) {
        int i4 = i3 - i2;
        String strValueOf = String.valueOf(Math.abs(i4));
        int length = strValueOf.length();
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < strValueOf.length(); i5++) {
            iArr[i5] = strValueOf.charAt((strValueOf.length() - i5) - 1) - '0';
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(formatNumStyle(i2));
        int i6 = 1;
        for (int i7 = 0; i7 < length; i7++) {
            int iIntValue = Integer.valueOf(iArr[i7]).intValue();
            for (int i8 = 0; i8 < iIntValue; i8++) {
                if (i4 > 0) {
                    i2 += i6;
                } else if (i4 < 0) {
                    i2 -= i6;
                }
                arrayList.add(formatNumStyle(i2));
            }
            i6 *= 10;
        }
        arrayList.add(formatNumStyle(i3));
        int size = arrayList.size() + 1;
        Keyframe[] keyframeArr = new Keyframe[size];
        int i9 = 0;
        while (i9 <= arrayList.size()) {
            keyframeArr[i9] = Keyframe.ofObject((1.0f / arrayList.size()) * i9, arrayList.get(i9 == 0 ? 0 : i9 - 1));
            i9++;
        }
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("Text", keyframeArr));
        valueAnimatorOfPropertyValuesHolder.setEvaluator(new g());
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new h(textView));
        valueAnimatorOfPropertyValuesHolder.setDuration(size * 20);
        return valueAnimatorOfPropertyValuesHolder;
    }

    public static Animator animNumSwitch1(int i2, int i3, TextView textView) {
        String strValueOf = String.valueOf(i2);
        int length = strValueOf.length();
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < strValueOf.length(); i4++) {
            iArr[(strValueOf.length() - i4) - 1] = strValueOf.charAt(i4) - '0';
            Log.i(a, "Num : " + iArr[(strValueOf.length() - i4) - 1]);
        }
        String strValueOf2 = String.valueOf(i3);
        int length2 = strValueOf2.length();
        int[] iArr2 = new int[length2];
        for (int i5 = 0; i5 < strValueOf2.length(); i5++) {
            iArr2[(strValueOf2.length() - i5) - 1] = strValueOf2.charAt(i5) - '0';
            Log.i(a, "Num : " + iArr2[(strValueOf2.length() - i5) - 1]);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = length2 - 1;
        while (i6 >= 0) {
            int i7 = iArr2[i6];
            int i8 = length > i6 ? iArr[i6] : 0;
            if (i7 > i8) {
                for (int i9 = 0; i9 < (i7 - i8) + 1; i9++) {
                    arrayList.add(b(strValueOf, strValueOf2, i6, i8 + i9));
                }
            } else if (i7 < i8) {
                for (int i10 = 0; i10 < (i8 - i7) + 1; i10++) {
                    arrayList.add(b(strValueOf, strValueOf2, i6, i8 - i10));
                }
            } else {
                arrayList.add(b(strValueOf, strValueOf2, i6, i8));
            }
            i6--;
        }
        Keyframe[] keyframeArr = new Keyframe[arrayList.size() + 1];
        Iterator it2 = arrayList.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            i11++;
            keyframeArr[i11] = Keyframe.ofObject((1.0f / arrayList.size()) * i11, (String) it2.next());
        }
        keyframeArr[0] = keyframeArr[1];
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("Text", keyframeArr));
        valueAnimatorOfPropertyValuesHolder.setEvaluator(new i());
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new j(textView));
        valueAnimatorOfPropertyValuesHolder.setDuration(20L);
        return valueAnimatorOfPropertyValuesHolder;
    }

    public static Animator animNumSwitch2(int i2, int i3, TextView textView) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.addUpdateListener(new k(textView));
        valueAnimatorOfInt.setDuration(500L);
        return valueAnimatorOfInt;
    }

    public static void animPlayTo(ValueAnimator valueAnimator, float f2) {
        valueAnimator.setCurrentPlayTime((long) (valueAnimator.getDuration() * f2));
    }

    public static Animator animScaleX(View view, float f2, float f3) {
        return ObjectAnimator.ofFloat(view, "scaleX", f2, f3);
    }

    public static Animator animSlideIn(int i2, View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationY", i2, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.3f, 1.0f));
    }

    public static Animator animSlideOut(int i2, View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationY", 0.0f, -i2), PropertyValuesHolder.ofFloat("alpha", 0.7f, 0.0f));
    }

    private static String b(String str, String str2, int i2, int i3) {
        if (str.length() < str2.length()) {
            int length = str2.length() - str.length();
            for (int i4 = 0; i4 < length; i4++) {
                str = '0' + str;
            }
        } else if (str2.length() < str.length()) {
            int length2 = str.length() - str2.length();
            for (int i5 = 0; i5 < length2; i5++) {
                str2 = '0' + str2;
            }
        }
        String strSubstring = i2 == 0 ? "" : str.substring(str2.length() - i2, str2.length());
        String string = Integer.valueOf((i2 != str.length() + (-1) ? str2.substring(0, (str.length() - i2) - 1) : "") + i3 + strSubstring).toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Show Num : ");
        sb.append(string);
        Log.i(a, sb.toString());
        return string;
    }

    public static void dismissChildren(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.isEnabled()) {
                childAt.setVisibility(4);
            }
        }
        viewGroup.setVisibility(8);
    }

    public static String formatNum(int i2) {
        String strValueOf = String.valueOf(i2);
        if (i2 == 0) {
            return "0000";
        }
        if (strValueOf.length() >= 4) {
            return strValueOf;
        }
        int length = strValueOf.length();
        if (length == 1) {
            return com.unionpay.tsmservice.data.Constant.DEFAULT_CVN2 + strValueOf;
        }
        if (length == 2) {
            return "00" + strValueOf;
        }
        if (length != 3) {
            return strValueOf;
        }
        return "0" + strValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    public static CharSequence formatNumStyle(int i2) {
        String str;
        if (ChartUtil.isNonChineseLocale()) {
            return String.valueOf(i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1711276033);
        String strValueOf = String.valueOf(i2);
        if (i2 == 0) {
            str = "0000";
        } else if (strValueOf.length() >= 4) {
            str = "";
        } else {
            int length = strValueOf.length();
            if (length == 1) {
                str = com.unionpay.tsmservice.data.Constant.DEFAULT_CVN2;
            } else if (length == 2) {
                str = "00";
            } else if (length != 3) {
                str = "";
            } else {
                str = "0";
            }
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(foregroundColorSpan, 0, str.length(), 33);
        SpannableString spannableString2 = new SpannableString(strValueOf);
        if (i2 == 0) {
            spannableStringBuilder.append((CharSequence) spannableString);
        } else {
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) spannableString2);
        }
        return spannableStringBuilder;
    }

    public static long getAnimDuration(AnimatorSet animatorSet) {
        long j2 = 0;
        for (Animator animator : animatorSet.getChildAnimations()) {
            long startDelay = animator.getStartDelay() + animator.getDuration();
            if (startDelay > j2) {
                j2 = startDelay;
            }
        }
        return j2;
    }

    public static void infoSwitch(ViewGroup viewGroup, ViewGroup viewGroup2) {
        viewGroup.setLayoutTransition(null);
        viewGroup2.setLayoutTransition(null);
        dismissChildren(viewGroup);
        showChildren(viewGroup2);
    }

    public static void seekAnim(AnimatorSet animatorSet, long j2) {
        if (animatorSet != null) {
            if (animatorSet.isStarted()) {
                animatorSet.end();
            }
            for (Animator animator : animatorSet.getChildAnimations()) {
                long startDelay = j2 - animator.getStartDelay();
                if (startDelay < 0) {
                    startDelay = 0;
                }
                if (animator instanceof ValueAnimator) {
                    ((ValueAnimator) animator).setCurrentPlayTime(startDelay);
                }
            }
        }
    }

    public static void showChildren(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.isEnabled()) {
                childAt.setVisibility(0);
            }
        }
        viewGroup.setVisibility(0);
    }

    public static Animator animColorTrans(int i2, int i3, AnimColorListener animColorListener, View... viewArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new l(Color.red(i3), Color.red(i2), Color.green(i3), Color.green(i2), Color.blue(i3), Color.blue(i2), viewArr, animColorListener));
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.setDuration(500L);
        return valueAnimatorOfFloat;
    }

    @SuppressLint({"NewApi"})
    public static void seekAnim(View view, AnimatorSet animatorSet, long j2) {
        seekAnim(animatorSet, j2);
        view.postInvalidateOnAnimation();
    }
}

package com.xiaomi.hm.health.device.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.calendar.ICalendar;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.lib.view.ViewUtils;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.device.animator.TextViewAnimator;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R2\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/animator/TextViewAnimator;", "", "", "startAnim", g.g, "", "isRunning", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getTexts", "()Ljava/util/ArrayList;", "setTexts", "(Ljava/util/ArrayList;)V", "texts", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "getAnimatorSet", "()Landroid/animation/AnimatorSet;", "setAnimatorSet", "(Landroid/animation/AnimatorSet;)V", "", "b", LogUtil.I, "index", "c", "Z", "Landroid/os/Handler;", GoogleApiAvailabilityLight.a, "Landroid/os/Handler;", "handler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TextViewAnimator {
    private static final long e = 1000;
    public AnimatorSet animatorSet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isRunning;
    public TextView textView;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static long f = 3800;
    private static long g = 500;
    private static float h = 10.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private ArrayList<String> texts = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/animator/TextViewAnimator$Companion;", "", "", "REMAIN", "J", "getREMAIN", "()J", "setREMAIN", "(J)V", "FADE_IN", "getFADE_IN", "setFADE_IN", "", "TRANSLATION_Y", "F", "getTRANSLATION_Y", "()F", "setTRANSLATION_Y", "(F)V", ICalendar.Property.DURATION, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getFADE_IN() {
            return TextViewAnimator.g;
        }

        public final long getREMAIN() {
            return TextViewAnimator.f;
        }

        public final float getTRANSLATION_Y() {
            return TextViewAnimator.h;
        }

        public final void setFADE_IN(long j) {
            TextViewAnimator.g = j;
        }

        public final void setREMAIN(long j) {
            TextViewAnimator.f = j;
        }

        public final void setTRANSLATION_Y(float f) {
            TextViewAnimator.h = f;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.animator.TextViewAnimator$startAnim$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/hm/health/device/animator/TextViewAnimator$startAnim$2", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TextViewAnimator textViewAnimator) {
            textViewAnimator.index = (textViewAnimator.index + 1) % textViewAnimator.getTexts().size();
            textViewAnimator.getAnimatorSet().start();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animation) {
            Handler handler = TextViewAnimator.this.handler;
            final TextViewAnimator textViewAnimator = TextViewAnimator.this;
            handler.postDelayed(new Runnable() { // from class: rn7
                @Override // java.lang.Runnable
                public final void run() {
                    TextViewAnimator.AnonymousClass2.b(textViewAnimator);
                }
            }, TextViewAnimator.INSTANCE.getREMAIN());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TextViewAnimator textViewAnimator) {
        textViewAnimator.getAnimatorSet().start();
    }

    public final void cancel() {
        this.isRunning = false;
        getAnimatorSet().cancel();
        this.handler.removeCallbacksAndMessages(null);
    }

    @NotNull
    public final AnimatorSet getAnimatorSet() {
        AnimatorSet animatorSet = this.animatorSet;
        Objects.requireNonNull(animatorSet);
        return animatorSet;
    }

    @NotNull
    public final TextView getTextView() {
        TextView textView = this.textView;
        Objects.requireNonNull(textView);
        return textView;
    }

    @NotNull
    public final ArrayList<String> getTexts() {
        return this.texts;
    }

    /* JADX INFO: renamed from: isRunning, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void setAnimatorSet(@NotNull AnimatorSet animatorSet) {
        this.animatorSet = animatorSet;
    }

    public final void setTextView(@NotNull TextView textView) {
        this.textView = textView;
    }

    public final void setTexts(@NotNull ArrayList<String> arrayList) {
        this.texts = arrayList;
    }

    public final void startAnim() {
        this.index = 0;
        this.isRunning = true;
        TextView textView = getTextView();
        ArrayList<String> arrayList = this.texts;
        int i = this.index;
        this.index = i + 1;
        textView.setText(arrayList.get(i));
        setAnimatorSet(new AnimatorSet());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getTextView(), "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getTextView(), "translationY", 0.0f, -ViewUtils.dp2px(DeviceXFunctionsKt.getContext(), h));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getTextView(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(g);
        objectAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.xiaomi.hm.health.device.animator.TextViewAnimator.startAnim.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
                TextViewAnimator.this.getTextView().setTranslationY(0.0f);
                TextViewAnimator.this.getTextView().setText(TextViewAnimator.this.getTexts().get(TextViewAnimator.this.index));
            }
        });
        getAnimatorSet().setDuration(1000L);
        getAnimatorSet().addListener(new AnonymousClass2());
        getAnimatorSet().play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).before(objectAnimatorOfFloat3);
        this.handler.postDelayed(new Runnable() { // from class: qn7
            @Override // java.lang.Runnable
            public final void run() {
                TextViewAnimator.b(this.a);
            }
        }, f);
    }
}

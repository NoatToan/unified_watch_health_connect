package com.huami.watch.companion.ecg.view.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.R;
import com.twitter.sdk.android.tweetcomposer.g;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\"\u0018\u00002\u00020\u0001:\u00010B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b(\u0010,B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b(\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u00061"}, d2 = {"Lcom/huami/watch/companion/ecg/view/voice/SpeakButton;", "Lcom/huami/watch/companion/ecg/view/voice/DrawCenterTextView;", "", "a", "Lcom/huami/watch/companion/ecg/view/voice/SpeakButton$StateListener;", "stateListener", "", "setStateListener", "Landroid/graphics/Canvas;", "canvas", "onDraw", "performClick", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "", "J", "getMLastClickTime", "()J", "setMLastClickTime", "(J)V", "mLastClickTime", "b", "Z", "mReleaseCancel", "Landroid/view/GestureDetector;", "c", "Lkotlin/Lazy;", "getMGestureDetector", "()Landroid/view/GestureDetector;", "mGestureDetector", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/companion/ecg/view/voice/SpeakButton$StateListener;", "mStateListener", "com/huami/watch/companion/ecg/view/voice/SpeakButton$onSpeakGestureListener$1", "e", "Lcom/huami/watch/companion/ecg/view/voice/SpeakButton$onSpeakGestureListener$1;", "onSpeakGestureListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "StateListener", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class SpeakButton extends DrawCenterTextView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long mLastClickTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean mReleaseCancel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGestureDetector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private StateListener mStateListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SpeakButton$onSpeakGestureListener$1 onSpeakGestureListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/huami/watch/companion/ecg/view/voice/SpeakButton$StateListener;", "", "", "onStart", "onCancel", "onFinish", "", g.g, "onScroll", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public interface StateListener {
        void onCancel();

        void onFinish();

        void onScroll(boolean cancel);

        void onStart();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/GestureDetector;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<GestureDetector> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GestureDetector invoke() {
            GestureDetector gestureDetector = new GestureDetector(SpeakButton.this.getContext(), SpeakButton.this.onSpeakGestureListener);
            gestureDetector.setIsLongpressEnabled(false);
            return gestureDetector;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.huami.watch.companion.ecg.view.voice.SpeakButton$onSpeakGestureListener$1] */
    public SpeakButton(@NotNull Context context) {
        super(context);
        this.mGestureDetector = LazyKt__LazyJVMKt.lazy(new a());
        setLongClickable(true);
        this.onSpeakGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.huami.watch.companion.ecg.view.voice.SpeakButton$onSpeakGestureListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NotNull MotionEvent e) {
                if (this.a.a()) {
                    return false;
                }
                SpeakButton.StateListener stateListener = this.a.mStateListener;
                if (stateListener != null) {
                    stateListener.onStart();
                }
                this.a.getParent().requestDisallowInterceptTouchEvent(true);
                this.a.setText(R.string.release_end);
                this.a.mReleaseCancel = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(@NotNull MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
                boolean z = e1.getY() - e2.getY() >= ((float) this.a.getResources().getDimensionPixelSize(R.dimen.min_release_distance));
                if (this.a.mReleaseCancel != z) {
                    this.a.mReleaseCancel = z;
                    this.a.setText(z ? R.string.release_cancel : R.string.release_end);
                    SpeakButton.StateListener stateListener = this.a.mStateListener;
                    if (stateListener != null) {
                        stateListener.onScroll(z);
                    }
                }
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        boolean z = System.currentTimeMillis() - this.mLastClickTime < 1000;
        this.mLastClickTime = System.currentTimeMillis();
        return z;
    }

    private final GestureDetector getMGestureDetector() {
        return (GestureDetector) this.mGestureDetector.getValue();
    }

    @Override // com.huami.watch.companion.ecg.view.voice.DrawCenterTextView
    public void _$_clearFindViewByIdCache() {
    }

    public final long getMLastClickTime() {
        return this.mLastClickTime;
    }

    @Override // com.huami.watch.companion.ecg.view.voice.DrawCenterTextView, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Drawable drawable = getCompoundDrawables()[2];
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), R.color.s1));
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        boolean zOnTouchEvent = getMGestureDetector().onTouchEvent(event);
        if ((event.getAction() != 1 && event.getAction() != 3) || zOnTouchEvent) {
            return zOnTouchEvent;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        performClick();
        setText(R.string.pressed_speak);
        StateListener stateListener = this.mStateListener;
        if (stateListener != null) {
            if (this.mReleaseCancel) {
                if (stateListener != null) {
                    stateListener.onCancel();
                }
            } else if (stateListener != null) {
                stateListener.onFinish();
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final void setMLastClickTime(long j) {
        this.mLastClickTime = j;
    }

    public final void setStateListener(@Nullable StateListener stateListener) {
        this.mStateListener = stateListener;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.huami.watch.companion.ecg.view.voice.SpeakButton$onSpeakGestureListener$1] */
    public SpeakButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mGestureDetector = LazyKt__LazyJVMKt.lazy(new a());
        setLongClickable(true);
        this.onSpeakGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.huami.watch.companion.ecg.view.voice.SpeakButton$onSpeakGestureListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NotNull MotionEvent e) {
                if (this.a.a()) {
                    return false;
                }
                SpeakButton.StateListener stateListener = this.a.mStateListener;
                if (stateListener != null) {
                    stateListener.onStart();
                }
                this.a.getParent().requestDisallowInterceptTouchEvent(true);
                this.a.setText(R.string.release_end);
                this.a.mReleaseCancel = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(@NotNull MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
                boolean z = e1.getY() - e2.getY() >= ((float) this.a.getResources().getDimensionPixelSize(R.dimen.min_release_distance));
                if (this.a.mReleaseCancel != z) {
                    this.a.mReleaseCancel = z;
                    this.a.setText(z ? R.string.release_cancel : R.string.release_end);
                    SpeakButton.StateListener stateListener = this.a.mStateListener;
                    if (stateListener != null) {
                        stateListener.onScroll(z);
                    }
                }
                return true;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.huami.watch.companion.ecg.view.voice.SpeakButton$onSpeakGestureListener$1] */
    public SpeakButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGestureDetector = LazyKt__LazyJVMKt.lazy(new a());
        setLongClickable(true);
        this.onSpeakGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.huami.watch.companion.ecg.view.voice.SpeakButton$onSpeakGestureListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NotNull MotionEvent e) {
                if (this.a.a()) {
                    return false;
                }
                SpeakButton.StateListener stateListener = this.a.mStateListener;
                if (stateListener != null) {
                    stateListener.onStart();
                }
                this.a.getParent().requestDisallowInterceptTouchEvent(true);
                this.a.setText(R.string.release_end);
                this.a.mReleaseCancel = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(@NotNull MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
                boolean z = e1.getY() - e2.getY() >= ((float) this.a.getResources().getDimensionPixelSize(R.dimen.min_release_distance));
                if (this.a.mReleaseCancel != z) {
                    this.a.mReleaseCancel = z;
                    this.a.setText(z ? R.string.release_cancel : R.string.release_end);
                    SpeakButton.StateListener stateListener = this.a.mStateListener;
                    if (stateListener != null) {
                        stateListener.onScroll(z);
                    }
                }
                return true;
            }
        };
    }
}

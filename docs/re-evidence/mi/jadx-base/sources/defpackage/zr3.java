package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.cardview.widget.CardView;
import java.util.Objects;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.transition.ActivityOptionsHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zr3 implements View.OnClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41590a = 0;
    Handler handler;
    private int mBgColor;
    private Bitmap mBitmap;
    private final Context mContext;
    private long mLastPerformClick;
    private View.OnClickListener mOnClickListener;
    private View.OnTouchListener mOnTouchListener;
    private boolean mPointInView;
    private int mRadius;
    private int mStartX;
    private int mStartY;
    private final View mTargetView;
    private final ITouchStyle mTouchStyle;
    private static final boolean IS_SUPPORT_SCALE_UP = ActivityOptionsHelper.isSupportScaleUpDown();
    private static final int DEFAULT_BG_COLOR_RES = gki.c;
    private static final long DOUBLE_CLICK_INTERVAL = ViewConfiguration.getJumpTapTimeout();

    public zr3(Context context, View view, View view2) {
        this(context, view, view2, null);
    }

    private ActivityOptions buildActivityOptions() {
        Bitmap bitmap;
        if (!IS_SUPPORT_SCALE_UP || (bitmap = this.mBitmap) == null) {
            return null;
        }
        View view = this.mTargetView;
        return ActivityOptionsHelper.makeScaleUpAnim(view, bitmap, this.mStartX, this.mStartY, this.mRadius, this.mBgColor, view.getScaleX(), this.handler, null, null, null, null, 103);
    }

    private boolean pointInView(float f, float f2) {
        int scaledTouchSlop = ViewConfiguration.get(this.mTargetView.getContext()).getScaledTouchSlop();
        float f3 = -scaledTouchSlop;
        return f >= f3 && f2 >= f3 && f < ((float) (this.mTargetView.getWidth() + scaledTouchSlop)) && f2 < ((float) (this.mTargetView.getHeight() + scaledTouchSlop));
    }

    public abstract void onCardZoomTriggered(ActivityOptions activityOptions);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.mLastPerformClick > DOUBLE_CLICK_INTERVAL) {
            onCardZoomTriggered(buildActivityOptions());
            this.mLastPerformClick = jElapsedRealtime;
            View.OnClickListener onClickListener = this.mOnClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (IS_SUPPORT_SCALE_UP) {
                Rect rect = new Rect(this.mTargetView.getPaddingStart(), this.mTargetView.getPaddingTop(), this.mTargetView.getWidth() - this.mTargetView.getPaddingEnd(), this.mTargetView.getHeight() - this.mTargetView.getPaddingBottom());
                try {
                    this.mBitmap = Bitmap.createBitmap(ActivityOptionsHelper.captureSnapshot(this.mTargetView), rect.left, rect.top, rect.width(), rect.height());
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                int[] iArr = new int[2];
                this.mTargetView.getLocationOnScreen(iArr);
                this.mStartX = iArr[0] + rect.left;
                this.mStartY = iArr[1] + rect.top;
                View view2 = this.mTargetView;
                if (view2 instanceof CardView) {
                    this.mRadius = (int) ((CardView) view2).getRadius();
                }
            }
            this.mTouchStyle.onMotionEvent(motionEvent);
        } else if (action == 1) {
            if (this.mPointInView && this.mOnTouchListener != null) {
                view.performClick();
            }
            this.mTouchStyle.onMotionEvent(motionEvent);
        } else if (action == 2) {
            this.mPointInView = pointInView(motionEvent.getX(), motionEvent.getY());
            this.mTouchStyle.onMotionEvent(motionEvent);
        } else if (action == 3) {
            this.mTouchStyle.onMotionEvent(motionEvent);
        }
        View.OnTouchListener onTouchListener = this.mOnTouchListener;
        return onTouchListener == null ? view.onTouchEvent(motionEvent) : onTouchListener.onTouch(view, motionEvent);
    }

    public zr3 setBgColorInt(int i) {
        if (i != 0) {
            this.mBgColor = i;
        }
        return this;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.mOnClickListener = onClickListener;
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.mOnTouchListener = onTouchListener;
        }
    }

    public zr3 setRadius(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("radius should larger than 0");
        }
        this.mRadius = i;
        return this;
    }

    public zr3 setTransitionBgColorRes(int i) {
        if (i != 0) {
            this.mBgColor = this.mContext.getColor(i);
        }
        return this;
    }

    public zr3(Context context, View view, View view2, ITouchStyle iTouchStyle) {
        this.mPointInView = true;
        this.handler = new Handler(Looper.getMainLooper());
        Objects.requireNonNull(context);
        this.mContext = context;
        Objects.requireNonNull(view);
        View view3 = view2 == null ? view : view2;
        this.mTargetView = view3;
        if (iTouchStyle == null) {
            this.mTouchStyle = Folme.useAt(view3).touch();
        } else {
            this.mTouchStyle = iTouchStyle;
        }
        if (view2 != null && (view2.getBackground() instanceof ColorDrawable)) {
            this.mBgColor = ((ColorDrawable) view2.getBackground()).getColor();
        } else {
            this.mBgColor = context.getColor(DEFAULT_BG_COLOR_RES);
        }
        view.setOnClickListener(this);
        view.setOnTouchListener(this);
    }
}

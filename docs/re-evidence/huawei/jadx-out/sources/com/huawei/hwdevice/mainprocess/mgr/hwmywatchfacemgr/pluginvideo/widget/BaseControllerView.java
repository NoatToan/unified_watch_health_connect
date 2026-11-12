package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.Constant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.LayoutHelper;
import com.huawei.hwdevicemgr.R;
import com.huawei.watchface.videoedit.param.ThumbnailViewConfig;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class BaseControllerView extends View implements View.OnTouchListener {
    private static final int BOLD_WIDTH = 10;
    private static final String TAG = "BaseControllerView";
    protected Path mClipPathExpended;
    protected ThumbnailViewConfig mConfig;
    protected Drawable mCropBar;
    protected final int mCropBarHeight;
    protected Drawable mCropBarPressed;
    protected Drawable mCropBarShadow;
    protected final int mCropBarWidth;
    protected Rect mCropFrameRect;
    protected int mCropOffset;
    protected Drawable mCurrentPointerDrawable;
    protected final int mCurrentPointerHeight;
    protected Rect mCurrentPointerRect;
    protected int mCurrentPointerTime;
    protected final int mCurrentPointerWidth;
    protected boolean mIsEditSupport;
    protected Rect mLeftCropBarRect;
    protected int mLeftCropTime;
    protected Rect mLeftPreviewMaskRect;
    protected CropListener mOnCropListener;
    protected OperateState mOperateState;
    protected Paint mPaint;
    protected Rect mPointerCoverRect;
    protected Rect mPreviewRect;
    protected int mPreviewViewWidth;
    protected Rect mRightCropBarRect;
    protected int mRightCropTime;
    protected Rect mRightPreviewMaskRect;
    protected Path mRoundClipPath;
    protected Rect mTouchCurrentPointerRect;
    protected Rect mTouchLeftCropBarRect;
    protected Rect mTouchRightCropBarRect;
    protected int mVideoDuration;
    protected int mViewHeight;
    protected int mViewWidth;

    protected enum OperateState {
        IDLE,
        LEFT_CROPPING,
        RIGHT_CROPPING,
        POINTER_MOVING,
        SCROLLING
    }

    protected void calculateCropFramePositionWhenMoved(int i) {
    }

    protected void calculateCurrentPointerPositionWhenMoved(int i) {
    }

    protected boolean cancelTouched() {
        return false;
    }

    protected boolean detectTouchedRect(int i, int i2) {
        return false;
    }

    protected boolean getShouldNotMoveWhenConfig() {
        return false;
    }

    protected int getViewPadding() {
        return 0;
    }

    public boolean hasUserChanged() {
        return false;
    }

    protected void initViews() {
    }

    public BaseControllerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOperateState = OperateState.IDLE;
        this.mCropOffset = 0;
        this.mRoundClipPath = new Path();
        this.mClipPathExpended = new Path();
        this.mCropBar = context.getResources().getDrawable(R.drawable.watch_face_btn_control_handle, context.getTheme());
        this.mCropBarPressed = context.getResources().getDrawable(R.drawable.watch_face_btn_control_handle_pressed, context.getTheme());
        this.mCropBarShadow = context.getResources().getDrawable(R.drawable.watch_face_btn_control_handle_shadow, context.getTheme());
        this.mCurrentPointerDrawable = context.getResources().getDrawable(R.drawable.watch_face_ic_video_processing, context.getTheme());
        this.mCropBarWidth = this.mCropBar.getIntrinsicWidth();
        this.mCropBarHeight = LayoutHelper.getDimensPixelSize(context, R.dimen.health_common_52dp);
        this.mCurrentPointerWidth = this.mCurrentPointerDrawable.getIntrinsicWidth();
        this.mCurrentPointerHeight = LayoutHelper.getDimensPixelSize(context, R.dimen.health_common_56dp);
        this.mViewHeight = LayoutHelper.getDimensPixelSize(context, R.dimen.health_common_68dp);
        int screenWidth = LayoutHelper.isPort() ? LayoutHelper.getScreenWidth() : LayoutHelper.getScreenWidth() - LayoutHelper.getNavigationBarHeight();
        this.mPreviewViewWidth = screenWidth;
        this.mViewWidth = screenWidth;
        this.mPaint = new Paint();
        this.mConfig = new ThumbnailViewConfig();
        setOnTouchListener(this);
    }

    public void initialize(String str, int i, int i2, int i3, boolean z) {
        this.mConfig.setFilePath(str);
        this.mConfig.setVideoWidth(i);
        this.mConfig.setVideoHeight(i2);
        this.mConfig.setDuration(i3);
        this.mIsEditSupport = z;
        this.mVideoDuration = i3;
        this.mLeftCropTime = 0;
        this.mRightCropTime = i3;
        initViews();
    }

    public void setOnCropListener(CropListener cropListener) {
        this.mOnCropListener = cropListener;
    }

    public int getVideoCropStartTime() {
        return this.mLeftCropTime;
    }

    public int getVideoCropEndTime() {
        return this.mRightCropTime;
    }

    public int getVideoCropDuration() {
        return this.mRightCropTime - this.mLeftCropTime;
    }

    public void setProgress(int i) {
        if (this.mIsEditSupport) {
            int i2 = this.mRightCropTime;
            if (i <= i2 && i >= (i2 = this.mLeftCropTime)) {
                LogUtil.b(TAG, "setProgress time in crop duration");
            } else {
                i = i2;
            }
        } else if (i > getTimeByPosition(this.mPreviewRect.right)) {
            i = getTimeByPosition(this.mPreviewRect.right);
        } else if (i < getTimeByPosition(this.mPreviewRect.left)) {
            i = getTimeByPosition(this.mPreviewRect.left);
        } else {
            LogUtil.b(TAG, "setProgress position in crop duration");
        }
        this.mCurrentPointerTime = i;
        int positionByTime = getPositionByTime(i);
        this.mCurrentPointerRect.left = positionByTime;
        this.mCurrentPointerRect.right = positionByTime + this.mCurrentPointerWidth;
        this.mTouchCurrentPointerRect = setRect(this.mTouchCurrentPointerRect, this.mCurrentPointerRect.left - Constant.TOUCH_CROP_OFFSET, this.mCurrentPointerRect.top, this.mCurrentPointerRect.right + Constant.TOUCH_CROP_OFFSET, this.mCurrentPointerRect.bottom);
        invalidate(this.mCurrentPointerRect);
    }

    public ThumbnailViewConfig getConfigData() {
        return this.mConfig;
    }

    protected int getTimeByPosition(int i) {
        float fWidth;
        int i2;
        if (this.mIsEditSupport) {
            if (i < this.mPreviewRect.left + this.mCropBarWidth) {
                i = this.mPreviewRect.left + this.mCropBarWidth;
            } else if (i > this.mPreviewRect.right - this.mCropBarWidth) {
                i = this.mPreviewRect.right - this.mCropBarWidth;
            } else {
                LogUtil.b(TAG, "getTimeByPosition EditSupport position in crop duration");
            }
            fWidth = (((i - this.mPreviewRect.left) - this.mCropBarWidth) * 1.0f) / (this.mPreviewRect.width() - (this.mCropBarWidth * 2));
            i2 = this.mVideoDuration;
        } else {
            if (i < this.mPreviewRect.left) {
                i = this.mPreviewRect.left;
            } else if (i > this.mPreviewRect.right) {
                i = this.mPreviewRect.right;
            } else {
                LogUtil.b(TAG, "getTimeByPosition Not EditSupport position in crop duration");
            }
            fWidth = ((i - this.mPreviewRect.left) * 1.0f) / (this.mPreviewRect.width() - 10);
            i2 = this.mVideoDuration;
        }
        return (int) (fWidth * i2);
    }

    protected int getPositionByTime(int i) {
        int iWidth;
        int i2;
        if (i < 0) {
            i = 0;
        } else {
            int i3 = this.mVideoDuration;
            if (i > i3) {
                i = i3;
            } else {
                LogUtil.b(TAG, "getPositionByTime time in crop duration");
            }
        }
        if (this.mIsEditSupport) {
            iWidth = ((int) (((i * 1.0f) / this.mVideoDuration) * (this.mPreviewRect.width() - (this.mCropBarWidth * 2)))) + this.mPreviewRect.left;
            i2 = this.mCropBarWidth;
        } else {
            iWidth = (int) (((i * 1.0f) / this.mVideoDuration) * (this.mPreviewRect.width() - 10));
            i2 = this.mPreviewRect.left;
        }
        return iWidth + i2;
    }

    protected void calculatePreviewMaskRect() {
        this.mLeftPreviewMaskRect = setRect(this.mLeftPreviewMaskRect, this.mPreviewRect.left, this.mPreviewRect.top, this.mCropFrameRect.left, this.mPreviewRect.bottom);
        this.mRightPreviewMaskRect = setRect(this.mRightPreviewMaskRect, this.mCropFrameRect.right, this.mPreviewRect.top, this.mPreviewRect.right, this.mPreviewRect.bottom);
    }

    protected void calculateCropBarAndPointerRectPosition() {
        Rect rect = this.mLeftCropBarRect;
        int i = this.mCropFrameRect.left;
        int i2 = this.mCropBarWidth / 2;
        int i3 = (this.mViewHeight - this.mCropBarHeight) / 2;
        int i4 = this.mCropFrameRect.left;
        int i5 = this.mCropBarWidth / 2;
        int i6 = this.mViewHeight;
        Rect rect2 = setRect(rect, i - i2, i3, i4 + i5, i6 - ((i6 - this.mCropBarHeight) / 2));
        this.mLeftCropBarRect = rect2;
        this.mTouchLeftCropBarRect = setRect(this.mTouchLeftCropBarRect, rect2.left - Constant.DEFAULT_CROP_BAR_SHADOW_PADDING, this.mLeftCropBarRect.top - Constant.DEFAULT_CROP_BAR_SHADOW_PADDING, this.mLeftCropBarRect.right + Constant.DEFAULT_CROP_BAR_SHADOW_PADDING, this.mLeftCropBarRect.bottom + Constant.DEFAULT_CROP_BAR_SHADOW_PADDING);
        Rect rect3 = this.mRightCropBarRect;
        int i7 = this.mCropFrameRect.right;
        int i8 = this.mCropBarWidth / 2;
        int i9 = (this.mViewHeight - this.mCropBarHeight) / 2;
        int i10 = this.mCropFrameRect.right;
        int i11 = this.mCropBarWidth / 2;
        int i12 = this.mViewHeight;
        Rect rect4 = setRect(rect3, i7 - i8, i9, i11 + i10, i12 - ((i12 - this.mCropBarHeight) / 2));
        this.mRightCropBarRect = rect4;
        this.mTouchRightCropBarRect = setRect(this.mTouchRightCropBarRect, rect4.left - Constant.DEFAULT_CROP_BAR_SHADOW_PADDING, this.mRightCropBarRect.top - Constant.DEFAULT_CROP_BAR_SHADOW_PADDING, this.mRightCropBarRect.right + Constant.DEFAULT_CROP_BAR_SHADOW_PADDING, this.mRightCropBarRect.bottom + Constant.DEFAULT_CROP_BAR_SHADOW_PADDING);
        if (this.mOperateState == OperateState.LEFT_CROPPING || this.mOperateState == OperateState.RIGHT_CROPPING) {
            Rect rect5 = this.mCurrentPointerRect;
            int i13 = this.mLeftCropBarRect.right;
            int i14 = (this.mViewHeight - this.mCurrentPointerHeight) / 2;
            int i15 = this.mLeftCropBarRect.right;
            int i16 = this.mCurrentPointerWidth;
            int i17 = this.mViewHeight;
            Rect rect6 = setRect(rect5, i13, i14, i15 + i16, i17 - ((i17 - this.mCurrentPointerHeight) / 2));
            this.mCurrentPointerRect = rect6;
            this.mTouchCurrentPointerRect = setRect(this.mTouchCurrentPointerRect, rect6.left - Constant.TOUCH_CROP_OFFSET, this.mCurrentPointerRect.top, this.mCurrentPointerRect.right + Constant.TOUCH_CROP_OFFSET, this.mCurrentPointerRect.bottom);
        }
    }

    protected boolean updatePositionWhenMoved(int i) {
        int i2 = i + this.mCropOffset;
        int iOrdinal = this.mOperateState.ordinal();
        if (iOrdinal == 1) {
            int positionByTime = getPositionByTime(this.mRightCropTime - 1000);
            if (i2 > positionByTime) {
                i2 = positionByTime;
            }
            calculateCropFramePositionWhenMoved(i2);
            invalidate();
        } else if (iOrdinal == 2) {
            int positionByTime2 = getPositionByTime(this.mLeftCropTime + 1000) + 1;
            if (i2 < positionByTime2) {
                i2 = positionByTime2;
            }
            calculateCropFramePositionWhenMoved(i2);
            invalidate();
        } else if (iOrdinal == 3) {
            if (this.mIsEditSupport) {
                if (i2 > this.mRightCropBarRect.left) {
                    i2 = this.mRightCropBarRect.left;
                } else if (i2 < this.mLeftCropBarRect.right) {
                    i2 = this.mLeftCropBarRect.right;
                } else {
                    LogUtil.b(TAG, "updatePositionWhenMoved EditSupport positionX in crop duration");
                }
            } else if (i2 > this.mPreviewRect.right) {
                i2 = this.mPreviewRect.right;
            } else if (i2 < this.mPreviewRect.left) {
                i2 = this.mPreviewRect.left;
            } else {
                LogUtil.b(TAG, "updatePositionWhenMoved Not EditSupport positionX in crop duration");
            }
            calculateCurrentPointerPositionWhenMoved(i2);
            invalidate();
        }
        return true;
    }

    protected void drawDrawable(Canvas canvas, Drawable drawable, Rect rect) {
        if (drawable == null || rect == null) {
            return;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }

    protected Rect setRect(Rect rect, int i, int i2, int i3, int i4) {
        if (rect == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect.set(i, i2, i3, i4);
        return rect;
    }

    protected void drawCropRectBorder(Canvas canvas) {
        if (canvas == null) {
            LogUtil.d(TAG, "drawCropRectBorder: canvas is null");
            return;
        }
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(6.0f);
        this.mPaint.setColor(-1);
        if (this.mIsEditSupport) {
            canvas.drawRect(this.mCropFrameRect.left, this.mCropFrameRect.top + 3.0f, this.mCropFrameRect.right, this.mCropFrameRect.bottom - 3.0f, this.mPaint);
        } else {
            canvas.drawRoundRect(new RectF(this.mPreviewRect.left + 3.0f, this.mCropFrameRect.top + 3.0f, this.mPreviewRect.right - 3.0f, this.mCropFrameRect.bottom - 3.0f), Constant.ROUND_CORNER_RADIUS, Constant.ROUND_CORNER_RADIUS, this.mPaint);
        }
    }

    protected void drawCropPreviewCover(Canvas canvas) {
        if (canvas == null) {
            LogUtil.d(TAG, "drawCropPreviewCover: canvas is null");
            return;
        }
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(ContextCompat.getColor(getContext(), R.color.watch_face_crop_cover));
        Rect rect = this.mLeftPreviewMaskRect;
        if (rect != null) {
            canvas.drawRect(rect, this.mPaint);
        }
        Rect rect2 = this.mRightPreviewMaskRect;
        if (rect2 != null) {
            canvas.drawRect(rect2, this.mPaint);
        }
    }

    protected void drawCropBarsAndPointer(Canvas canvas) {
        if (this.mIsEditSupport) {
            drawDrawable(canvas, this.mCropBarShadow, this.mTouchLeftCropBarRect);
            drawDrawable(canvas, this.mCropBarShadow, this.mTouchRightCropBarRect);
            drawDrawable(canvas, this.mOperateState == OperateState.LEFT_CROPPING ? this.mCropBarPressed : this.mCropBar, this.mLeftCropBarRect);
            drawDrawable(canvas, this.mOperateState == OperateState.RIGHT_CROPPING ? this.mCropBarPressed : this.mCropBar, this.mRightCropBarRect);
        } else {
            Drawable drawable = getResources().getDrawable(R.drawable.watch_face_pointer_cover);
            int dimensPixelSize = (LayoutHelper.getDimensPixelSize(getContext(), R.dimen.health_common_20dp) - this.mCurrentPointerRect.width()) / 2;
            int i = (this.mPreviewRect.right - this.mCurrentPointerRect.right) - 6;
            int i2 = (this.mCurrentPointerRect.left - this.mPreviewRect.left) - 6;
            if (i < dimensPixelSize) {
                this.mPointerCoverRect = setRect(this.mPointerCoverRect, this.mCurrentPointerRect.left - dimensPixelSize, this.mPreviewRect.top, this.mCurrentPointerRect.right + i, this.mPreviewRect.bottom);
            } else if (i2 < dimensPixelSize) {
                this.mPointerCoverRect = setRect(this.mPointerCoverRect, this.mCurrentPointerRect.left - i2, this.mPreviewRect.top, dimensPixelSize + this.mCurrentPointerRect.right, this.mPreviewRect.bottom);
            } else {
                this.mPointerCoverRect = setRect(this.mPointerCoverRect, this.mCurrentPointerRect.left - dimensPixelSize, this.mPreviewRect.top, this.mCurrentPointerRect.right + dimensPixelSize, this.mPreviewRect.bottom);
            }
            drawDrawable(canvas, drawable, this.mPointerCoverRect);
        }
        if (shouldShowPointerView()) {
            drawDrawable(canvas, this.mCurrentPointerDrawable, this.mCurrentPointerRect);
        }
    }

    protected boolean shouldShowPointerView() {
        return this.mOperateState == OperateState.POINTER_MOVING || this.mOperateState == OperateState.IDLE;
    }

    protected boolean isRectInScreen(Rect rect) {
        if (rect.right < getViewPadding() || rect.right >= this.mPreviewViewWidth + getViewPadding()) {
            return rect.left > getViewPadding() && rect.left <= this.mPreviewViewWidth + getViewPadding();
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            return detectTouchedRect(x, y);
        }
        if (action != 1) {
            if (action == 2) {
                return getShouldNotMoveWhenConfig() || updatePositionWhenMoved(x);
            }
            if (action != 3) {
                return false;
            }
        }
        return cancelTouched();
    }
}

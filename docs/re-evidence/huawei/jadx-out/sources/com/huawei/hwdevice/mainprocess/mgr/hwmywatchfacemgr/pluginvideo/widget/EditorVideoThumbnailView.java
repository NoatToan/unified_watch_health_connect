package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;
import android.widget.TextView;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThumbnailLoader;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.VideoThumbnailLoader;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.info.VideoFileInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.param.ThumbnailData;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.Constant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.EditUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.LayoutHelper;
import com.huawei.hwdevicemgr.R;
import com.huawei.watchface.videoedit.utils.ScreenUtils;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class EditorVideoThumbnailView extends BaseControllerView implements View.OnTouchListener {
    private static final int DOUBLE = 2;
    private static final int LONG_PRESS_LIMIT = 500;
    private static final int LONG_PRESS_X_OFFSET = 10;
    private static final int MASK_COVER_ALPHA = 96;
    private static final int MINI_CLIP_TIME = 500;
    private static final int MSG_START_CHECK_LONG_PRESS = 100;
    private static final int POINTER_HEIGHT_DELTA = 5;
    private static final int PREVIEW_STACK_NUM = 4;
    private static final int SCROLL_DURATION = 500;
    public static final String TAG = "ThumbnailView";
    private Context mContext;
    private int mCropBarHalfWidth;
    private Drawable mCropBarLeft;
    private Drawable mCropBarRight;
    private TextView mCropTimeView;
    private int mCurrentPointerWidth;
    private int mDurationStep;
    private int mEndCropTime;
    private Handler mHandler;
    private boolean mIsLongPress;
    private int mLastPointerTime;
    private int mLongPressCurrentX;
    private int mLongPressStartX;
    private int mOldPosition;
    private PlayerDelegate mPlayerDelegate;
    private List<PreviewStack> mPreviewRectList;
    private int mPreviewUnitHeight;
    private int mPreviewUnitNum;
    private int mPreviewUnitWidth;
    private Scroller mScroller;
    private int mStackDurationStep;
    private StackExtendStatus mStackExtendStatus;
    private int mStartCropTime;
    private ThumbnailLoader.ThumbnailLoadListener mThumbnailLoadListener;
    private VideoThumbnailLoader mThumbnailsLoader;
    private Rect mVisiableRect;

    protected enum StackExtendStatus {
        OPENING,
        OPENED,
        CLOSING,
        CLOSED
    }

    public EditorVideoThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastPointerTime = 0;
        this.mStackExtendStatus = StackExtendStatus.CLOSED;
        this.mLongPressStartX = 0;
        this.mLongPressCurrentX = 0;
        this.mCropBarLeft = null;
        this.mCropBarRight = null;
        this.mVisiableRect = new Rect();
        this.mCropTimeView = null;
        this.mHandler = new Handler() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.EditorVideoThumbnailView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 100) {
                    EditorVideoThumbnailView.this.mIsLongPress = true;
                    EditorVideoThumbnailView.this.openStackPreview();
                }
            }
        };
        this.mThumbnailLoadListener = new ThumbnailLoader.ThumbnailLoadListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.EditorVideoThumbnailView.2
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThumbnailLoader.ThumbnailLoadListener
            public void onImagePixelsLoaded(Bitmap bitmap, String str, int i, int i2, int i3) {
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThumbnailLoader.ThumbnailLoadListener
            public void onImagePixelsLoaded(int[] iArr, String str, int i, int i2, int i3) {
                if (iArr == null || EditorVideoThumbnailView.this.mPreviewRectList == null || EditorVideoThumbnailView.this.mPreviewRectList.size() <= 0) {
                    return;
                }
                int size = EditorVideoThumbnailView.this.mPreviewRectList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    EditorVideoThumbnailView.this.setPreviewColorAtTime(iArr, i3, (PreviewStack) EditorVideoThumbnailView.this.mPreviewRectList.get(i4));
                }
            }
        };
        this.mScroller = new Scroller(context);
        this.mThumbnailsLoader = new VideoThumbnailLoader(context);
        this.mContext = context;
    }

    public void initialize(VideoFileInfo videoFileInfo) {
        if (videoFileInfo == null) {
            return;
        }
        super.initialize(videoFileInfo.getFilePath(), videoFileInfo.getWidth(), videoFileInfo.getHeight(), videoFileInfo.getDurationMs(), true);
        this.mStartCropTime = videoFileInfo.getClipStartMs();
        this.mEndCropTime = videoFileInfo.getClipEndMs();
        this.mLeftCropTime = Utils.isRtl() ? this.mEndCropTime : this.mStartCropTime;
        this.mRightCropTime = Utils.isRtl() ? this.mStartCropTime : this.mEndCropTime;
        initCropListener();
    }

    private void initCropListener() {
        this.mOnCropListener = new CropListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.EditorVideoThumbnailView.3
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void updateProgress() {
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void updateTimeText() {
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void onLeftCropping(int i, boolean z, boolean z2) {
                if (z) {
                    EditorVideoThumbnailView.this.mPlayerDelegate.seekTo(i);
                }
                updateCropTimeText(EditUtil.getTextString(EditorVideoThumbnailView.this.mStartCropTime, EditorVideoThumbnailView.this.mEndCropTime));
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void onRightCropping(int i, boolean z) {
                if (z) {
                    EditorVideoThumbnailView.this.mPlayerDelegate.seekTo(i);
                }
                updateCropTimeText(EditUtil.getTextString(EditorVideoThumbnailView.this.mStartCropTime, EditorVideoThumbnailView.this.mEndCropTime));
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void onCurrentPointerMoving(int i, boolean z) {
                if (z) {
                    EditorVideoThumbnailView.this.mPlayerDelegate.seekTo(i);
                }
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void onSeekStart() {
                EditorVideoThumbnailView.this.mPlayerDelegate.pause();
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void onSeekEnd(boolean z) {
                if (z) {
                    EditorVideoThumbnailView.this.mPlayerDelegate.seekTo(EditorVideoThumbnailView.this.mStartCropTime);
                }
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
            public void updateCropTimeText(String str) {
                if (EditorVideoThumbnailView.this.mCropTimeView != null) {
                    EditorVideoThumbnailView.this.mCropTimeView.setText(str);
                }
            }
        };
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected void initViews() {
        this.mCurrentPointerDrawable = this.mContext.getResources().getDrawable(R.drawable.watch_face_img_gallery_videoedit_pointer_bar, this.mContext.getTheme());
        this.mCurrentPointerWidth = this.mCurrentPointerDrawable.getIntrinsicWidth();
        this.mCropBarLeft = this.mContext.getResources().getDrawable(R.drawable.watch_face_img_gallery_videocutbar_left, this.mContext.getTheme());
        this.mCropBarRight = this.mContext.getResources().getDrawable(R.drawable.watch_face_img_gallery_videocutbar_right, this.mContext.getTheme());
        this.mCropBarHalfWidth = this.mCropBarLeft.getIntrinsicWidth() / 2;
        if (this.mOnCropListener != null) {
            this.mOnCropListener.updateCropTimeText(EditUtil.getTextString(this.mStartCropTime, this.mEndCropTime));
        }
        initPreviewParamsAndRects();
        calculatePreviewUnit();
        calculateCropFrameRect();
        calculatePointerRect(0);
        invalidate();
    }

    private void initPreviewParamsAndRects() {
        this.mPreviewViewWidth = (getWidth() - (getViewPadding() * 2)) - this.mCropBarLeft.getIntrinsicWidth();
        int dimensPixelSize = LayoutHelper.getDimensPixelSize(getContext(), LayoutHelper.isPort() ? R.dimen.health_common_72dp : R.dimen.health_common_36dp);
        this.mPreviewUnitHeight = dimensPixelSize;
        this.mPreviewUnitWidth = (int) (dimensPixelSize * 0.5625f);
        int i = this.mPreviewViewWidth;
        int i2 = this.mPreviewUnitWidth;
        this.mPreviewUnitNum = i / i2;
        int iFloor = i2 + ((int) Math.floor((((double) (this.mPreviewViewWidth % this.mPreviewUnitWidth)) * 1.0d) / ((double) this.mPreviewUnitNum)));
        this.mPreviewUnitWidth = iFloor;
        this.mPreviewViewWidth = iFloor * this.mPreviewUnitNum;
        int viewPadding = getViewPadding() + this.mCropBarHalfWidth;
        int i3 = this.mPreviewViewWidth + viewPadding;
        int height = (int) ((getHeight() * 0.5f) - (this.mPreviewUnitHeight * 0.5f));
        int height2 = (int) ((getHeight() * 0.5f) + (this.mPreviewUnitHeight * 0.5f));
        this.mPreviewRect = setRect(this.mPreviewRect, viewPadding, height, i3, height2);
        this.mVisiableRect = setRect(this.mVisiableRect, viewPadding, height, i3, height2);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected void calculateCropFramePositionWhenMoved(int i) {
        if (this.mOldPosition == i) {
            return;
        }
        this.mOldPosition = i;
        if (this.mOperateState == BaseControllerView.OperateState.LEFT_CROPPING) {
            calculateLeftCropFramePositionWhenMoved(i);
        }
        if (this.mOperateState == BaseControllerView.OperateState.RIGHT_CROPPING) {
            calculateRightCropFramePositionWhenMoved(i);
        }
    }

    private void calculateLeftCropFramePositionWhenMoved(int i) {
        this.mLeftCropTime = getTimeByPosition(Math.min(i, Utils.isRtl() ? getPositionByTime(this.mRightCropTime + 1000) + 1 : getPositionByTime(this.mRightCropTime - 1000)));
        if (Utils.isRtl()) {
            this.mEndCropTime = this.mLeftCropTime;
        } else {
            this.mStartCropTime = this.mLeftCropTime;
        }
        if (this.mOnCropListener != null && (this.mStackExtendStatus == StackExtendStatus.OPENED || this.mStackExtendStatus == StackExtendStatus.CLOSED)) {
            this.mOnCropListener.onLeftCropping(this.mLeftCropTime, true, true);
        }
        calculateCropFrameRect();
        updateCheckLongPress(this.mCropFrameRect.left);
    }

    private void calculateRightCropFramePositionWhenMoved(int i) {
        this.mRightCropTime = getTimeByPosition(Math.max(i, Utils.isRtl() ? getPositionByTime(this.mLeftCropTime - 1000) : getPositionByTime(this.mLeftCropTime + 1000) + 1));
        if (Utils.isRtl()) {
            this.mStartCropTime = this.mRightCropTime;
        } else {
            this.mEndCropTime = this.mRightCropTime;
        }
        if (this.mOnCropListener != null && (this.mStackExtendStatus == StackExtendStatus.OPENED || this.mStackExtendStatus == StackExtendStatus.CLOSED)) {
            this.mOnCropListener.onRightCropping(this.mRightCropTime, true);
        }
        calculateCropFrameRect();
        updateCheckLongPress(this.mCropFrameRect.right);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected void calculateCurrentPointerPositionWhenMoved(int i) {
        int timeByPosition = getTimeByPosition(i);
        if (timeByPosition != this.mCurrentPointerTime) {
            calculatePointerRect(timeByPosition);
            if (this.mOnCropListener != null && Math.abs(this.mLastPointerTime - this.mCurrentPointerTime) > 500) {
                this.mOnCropListener.onCurrentPointerMoving(this.mCurrentPointerTime, true);
                this.mLastPointerTime = this.mCurrentPointerTime;
            }
            updateCheckLongPress(i);
        }
    }

    private void calculateCropFrameRect() {
        this.mCropFrameRect = setRect(this.mCropFrameRect, getPositionByTime(this.mLeftCropTime), this.mPreviewRect.top, getPositionByTime(this.mRightCropTime), this.mPreviewRect.bottom);
    }

    private void calculatePointerRect(int i) {
        this.mCurrentPointerTime = i;
        int iMin = Math.min(Math.max(getPositionByTime(i), this.mCropFrameRect.left + this.mCropBarHalfWidth), (this.mCropFrameRect.right - this.mCropBarHalfWidth) - this.mCurrentPointerWidth);
        int i2 = this.mCurrentPointerWidth + iMin;
        int iDp2px = this.mPreviewRect.top - ScreenUtils.dp2px(5);
        int iDp2px2 = this.mPreviewRect.bottom + ScreenUtils.dp2px(5);
        this.mCurrentPointerRect = setRect(this.mCurrentPointerRect, iMin, iDp2px, i2, iDp2px2);
        this.mTouchCurrentPointerRect = setRect(this.mTouchCurrentPointerRect, iMin - Constant.TOUCH_CROP_OFFSET, iDp2px, i2 + Constant.TOUCH_CROP_OFFSET, iDp2px2);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected boolean updatePositionWhenMoved(int i) {
        int iMax = Math.max(Math.min(i, this.mVisiableRect.right), this.mVisiableRect.left);
        int i2 = AnonymousClass4.$SwitchMap$com$huawei$hwdevice$mainprocess$mgr$hwmywatchfacemgr$pluginvideo$widget$BaseControllerView$OperateState[this.mOperateState.ordinal()];
        if (i2 == 1 || i2 == 2) {
            calculateCropFramePositionWhenMoved(iMax);
        } else if (i2 == 3) {
            calculateCurrentPointerPositionWhenMoved(iMax);
        }
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.EditorVideoThumbnailView$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$hwdevice$mainprocess$mgr$hwmywatchfacemgr$pluginvideo$widget$BaseControllerView$OperateState;

        static {
            int[] iArr = new int[BaseControllerView.OperateState.values().length];
            $SwitchMap$com$huawei$hwdevice$mainprocess$mgr$hwmywatchfacemgr$pluginvideo$widget$BaseControllerView$OperateState = iArr;
            try {
                iArr[BaseControllerView.OperateState.LEFT_CROPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$hwdevice$mainprocess$mgr$hwmywatchfacemgr$pluginvideo$widget$BaseControllerView$OperateState[BaseControllerView.OperateState.RIGHT_CROPPING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huawei$hwdevice$mainprocess$mgr$hwmywatchfacemgr$pluginvideo$widget$BaseControllerView$OperateState[BaseControllerView.OperateState.POINTER_MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void calculatePreviewUnit() {
        int i;
        VideoThumbnailLoader videoThumbnailLoader = this.mThumbnailsLoader;
        if (videoThumbnailLoader != null) {
            videoThumbnailLoader.init(generateThumbnailInfo());
        }
        int i2 = this.mPreviewUnitNum > 0 ? this.mVideoDuration / this.mPreviewUnitNum : 0;
        this.mDurationStep = i2;
        this.mStackDurationStep = i2 / 5;
        List<PreviewStack> list = this.mPreviewRectList;
        if (list == null) {
            this.mPreviewRectList = new ArrayList();
        } else {
            list.clear();
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.mPreviewUnitNum; i3++) {
            int i4 = this.mPreviewRect.left + (this.mPreviewUnitWidth * i3);
            if (i3 == this.mPreviewUnitNum - 1) {
                i = this.mPreviewRect.right;
            } else {
                i = this.mPreviewRect.left + (this.mPreviewUnitWidth * (i3 + 1));
            }
            int i5 = this.mDurationStep * i3;
            Preview preview = new Preview(i5, setRect(null, i4, this.mPreviewRect.top, i, this.mPreviewRect.bottom));
            ThumbnailData thumbnailDataGenerateThumbnailInfo = generateThumbnailInfo();
            thumbnailDataGenerateThumbnailInfo.listener = null;
            int[] iArrLoadFromCache = this.mThumbnailsLoader.loadFromCache(thumbnailDataGenerateThumbnailInfo, preview.getTime());
            if (iArrLoadFromCache != null) {
                preview.setColors(iArrLoadFromCache);
            } else {
                arrayList.add(Integer.valueOf(i5));
            }
            preview.setDefaultPosition(setRect(null, i4, this.mPreviewRect.top, i, this.mPreviewRect.bottom));
            PreviewStack previewStack = new PreviewStack(preview);
            previewStack.setStackNum(4);
            this.mPreviewRectList.add(previewStack);
        }
        if (arrayList.size() > 0) {
            LogUtil.b(TAG, "calculatePreviewUnit timeList:", arrayList.toString());
            this.mThumbnailsLoader.startThumbnailsWithTimeArray(arrayList);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected int getTimeByPosition(int i) {
        float f;
        int i2;
        int iClamp = Utils.clamp(i, this.mPreviewRect.left, this.mPreviewRect.right);
        int iWidth = this.mPreviewRect.width();
        if (Utils.isRtl()) {
            f = (this.mPreviewRect.right - iClamp) * 1.0f;
            i2 = this.mVideoDuration;
        } else {
            f = (iClamp - this.mPreviewRect.left) * 1.0f;
            i2 = this.mVideoDuration;
        }
        return (int) ((f * i2) / iWidth);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected int getPositionByTime(int i) {
        int iClamp = Utils.clamp(i, 0, this.mVideoDuration);
        int iWidth = this.mPreviewRect.width();
        if (Utils.isRtl()) {
            return this.mPreviewRect.right - ((int) (((iClamp * 1.0f) / this.mVideoDuration) * iWidth));
        }
        return ((int) (((iClamp * 1.0f) / this.mVideoDuration) * iWidth)) + this.mPreviewRect.left;
    }

    private ThumbnailData generateThumbnailInfo() {
        return new ThumbnailData(this.mThumbnailLoadListener, this, this.mConfig, this.mPreviewUnitWidth, this.mPreviewUnitHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewColorAtTime(int[] iArr, int i, PreviewStack previewStack) {
        Preview preview;
        if (previewStack == null || (preview = previewStack.getPreview()) == null || !isInPreviewDuration(preview, i)) {
            return;
        }
        if (preview.getTime() == i) {
            preview.setColors(iArr);
            invalidate(preview.getPosition());
        } else {
            if (previewStack.getStackPreview() == null) {
                return;
            }
            int size = previewStack.getStackPreview().size();
            for (int i2 = 0; i2 < size; i2++) {
                Preview preview2 = previewStack.getStackPreview().get(i2);
                if (preview2.getTime() == i) {
                    preview2.setColors(iArr);
                    invalidate(preview2.getPosition());
                }
            }
        }
    }

    private boolean isInPreviewDuration(Preview preview, int i) {
        return i >= preview.time && i < preview.time + this.mDurationStep;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected boolean cancelTouched() {
        if (this.mIsLongPress) {
            closeStackPreview();
        }
        resetCheckLongPress();
        LogUtil.b(TAG, " end cancelTouched");
        if (this.mOperateState != BaseControllerView.OperateState.IDLE) {
            if (this.mOperateState == BaseControllerView.OperateState.LEFT_CROPPING || this.mOperateState == BaseControllerView.OperateState.RIGHT_CROPPING) {
                this.mOperateState = BaseControllerView.OperateState.IDLE;
                this.mOnCropListener.onSeekEnd(true);
                calculatePointerRect(this.mStartCropTime);
            } else {
                this.mOperateState = BaseControllerView.OperateState.IDLE;
                this.mOnCropListener.onSeekEnd(false);
                this.mOnCropListener.onCurrentPointerMoving(this.mCurrentPointerTime, true);
            }
        }
        invalidate();
        return true;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected boolean detectTouchedRect(int i, int i2) {
        Rect rect = new Rect((this.mCropFrameRect.left - this.mCropBarHalfWidth) - Constant.TOUCH_REGION_CROP_BAR, this.mPreviewRect.top, this.mCropFrameRect.left + this.mCropBarHalfWidth + Constant.TOUCH_CROP_OFFSET, this.mPreviewRect.bottom);
        Rect rect2 = new Rect((this.mCropFrameRect.right - this.mCropBarHalfWidth) - Constant.TOUCH_CROP_OFFSET, this.mPreviewRect.top, this.mCropFrameRect.right + this.mCropBarHalfWidth + Constant.TOUCH_REGION_CROP_BAR, this.mPreviewRect.bottom);
        if (rect.contains(i, i2) && this.mIsEditSupport) {
            LogUtil.b(TAG, "detectTouchedRect touch left start");
            this.mOperateState = BaseControllerView.OperateState.LEFT_CROPPING;
            startCheckLongPress(this.mCropFrameRect.left);
            if (this.mOnCropListener != null) {
                this.mOnCropListener.onSeekStart();
            }
        } else if (rect2.contains(i, i2) && this.mIsEditSupport) {
            LogUtil.b(TAG, "detectTouchedRect touch right start");
            this.mOperateState = BaseControllerView.OperateState.RIGHT_CROPPING;
            startCheckLongPress(this.mCropFrameRect.right);
            if (this.mOnCropListener != null) {
                this.mOnCropListener.onSeekStart();
            }
        } else {
            if (!this.mTouchCurrentPointerRect.contains(i, i2)) {
                return false;
            }
            LogUtil.b(TAG, "detectTouchedRect touch pointer start");
            this.mOperateState = BaseControllerView.OperateState.POINTER_MOVING;
            if (this.mOnCropListener != null) {
                this.mOnCropListener.onSeekStart();
            }
        }
        invalidate();
        return true;
    }

    private void startCheckLongPress(int i) {
        this.mLongPressStartX = i;
        this.mHandler.sendEmptyMessageDelayed(100, 500L);
        updateCheckLongPress(i);
    }

    private void updateCheckLongPress(int i) {
        if (this.mIsLongPress) {
            return;
        }
        if (Math.abs(i - this.mLongPressStartX) > 10) {
            this.mLongPressStartX = i;
            this.mHandler.removeMessages(100);
            this.mHandler.sendEmptyMessageDelayed(100, 500L);
        } else {
            int iClamp = Utils.clamp(i, this.mPreviewRect.left, this.mPreviewRect.right);
            this.mLongPressCurrentX = iClamp;
            LogUtil.b(TAG, "updateCheckLongPress mLongPressCurrentX:", Integer.valueOf(iClamp), " x:", Integer.valueOf(iClamp), " mPreviewRect", this.mPreviewRect.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openStackPreview() {
        this.mStackExtendStatus = StackExtendStatus.OPENING;
        this.mScroller.startScroll(0, 0, this.mPreviewUnitWidth * 5, 0, 500);
        invalidate();
        LogUtil.b(TAG, " openStackPreview");
    }

    private void closeStackPreview() {
        this.mStackExtendStatus = StackExtendStatus.CLOSING;
        this.mScroller.startScroll(0, 0, -(this.mPreviewUnitWidth * 5), 0, 500);
        invalidate();
        LogUtil.b(TAG, " closeStackPreview");
    }

    private void resetCheckLongPress() {
        this.mHandler.removeMessages(100);
        this.mIsLongPress = false;
        this.mLongPressStartX = 0;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.mScroller.computeScrollOffset()) {
            float currX = (this.mScroller.getCurrX() * 1.0f) / this.mScroller.getFinalX();
            if (this.mStackExtendStatus == StackExtendStatus.CLOSING) {
                currX = 1.0f - currX;
            }
            addAndLoadPreviews(currX);
            calculateCropFrameRect();
            calculatePointerRect(this.mOperateState == BaseControllerView.OperateState.POINTER_MOVING ? this.mCurrentPointerTime : this.mStartCropTime);
        } else {
            if (!this.mIsLongPress) {
                clearPreviews();
            }
            if (this.mStackExtendStatus == StackExtendStatus.OPENING) {
                this.mStackExtendStatus = StackExtendStatus.OPENED;
            }
            if (this.mStackExtendStatus == StackExtendStatus.CLOSING) {
                this.mStackExtendStatus = StackExtendStatus.CLOSED;
                this.mOnCropListener.updateProgress();
            }
        }
        postInvalidate();
    }

    private void addAndLoadPreviews(float f) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        List<PreviewStack> list = this.mPreviewRectList;
        if (list == null || list.isEmpty()) {
            i = 0;
            i2 = 0;
        } else {
            int size = this.mPreviewRectList.size();
            int i3 = 0;
            int i4 = 0;
            i2 = 0;
            while (i3 < size) {
                PreviewStack previewStack = this.mPreviewRectList.get(i3);
                if (previewStack.getStackPreview() == null) {
                    previewStack.setStackPreview(new ArrayList());
                } else {
                    previewStack.getStackPreview().clear();
                }
                Rect defaultPosition = previewStack.getPreview().getDefaultPosition();
                int iCeil = (int) Math.ceil((((double) (defaultPosition.left - this.mLongPressCurrentX)) * 1.0d) / ((double) this.mPreviewUnitWidth));
                int i5 = this.mLongPressCurrentX;
                int i6 = this.mPreviewUnitWidth;
                int i7 = defaultPosition.left;
                int i8 = this.mPreviewUnitWidth;
                float f2 = ((((i5 + (i6 * iCeil)) - i7) % i8) * 1.0f) / i8;
                int actualScrollWidth = (int) (iCeil * getActualScrollWidth() * f);
                int actualScrollWidth2 = (int) (getActualScrollWidth() * f2 * f);
                Rect rect = setRect(null, (defaultPosition.left + actualScrollWidth) - actualScrollWidth2, defaultPosition.top, ((defaultPosition.left + this.mPreviewUnitWidth) + actualScrollWidth) - actualScrollWidth2, defaultPosition.bottom);
                boolean z = i3 == this.mPreviewRectList.size() - 1;
                if (z) {
                    int i9 = (int) (this.mPreviewUnitWidth * ((4.0f * f) + 1.0f));
                    if (rect.width() > i9) {
                        rect.right = rect.left + i9;
                    }
                    i4 = rect.left + i9;
                }
                if (i3 == 0) {
                    i2 = rect.left;
                }
                previewStack.getPreview().setPosition(rect);
                addPreviews(f, i4, z, previewStack, rect);
                i3++;
            }
            i = i4;
        }
        if (arrayList.size() > 0) {
            this.mThumbnailsLoader.startThumbnailsWithTimeArray(arrayList);
        }
        calculatePreviewRect(i2, i);
    }

    private void calculatePreviewRect(int i, int i2) {
        setRect(this.mPreviewRect, i, this.mPreviewRect.top, i2, this.mPreviewRect.bottom);
    }

    private void addPreviews(float f, int i, boolean z, PreviewStack previewStack, Rect rect) {
        int stackNum = previewStack.getStackNum();
        for (int i2 = 0; i2 <= stackNum; i2++) {
            if (i2 != 0) {
                int i3 = (int) (rect.left + (this.mPreviewUnitWidth * i2 * f));
                int time = previewStack.getPreview().getTime() + (this.mStackDurationStep * i2);
                int i4 = this.mPreviewUnitWidth + i3;
                Preview preview = new Preview(time, setRect(null, i3, rect.top, (!z || i4 <= i) ? i4 : i, rect.bottom));
                int[] iArrLoadFromCache = this.mThumbnailsLoader.loadFromCache(generateThumbnailInfo(), time);
                if (iArrLoadFromCache != null) {
                    preview.setColors(iArrLoadFromCache);
                }
                previewStack.getStackPreview().add(preview);
            }
        }
    }

    private void clearPreviews() {
        List<PreviewStack> list = this.mPreviewRectList;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (PreviewStack previewStack : this.mPreviewRectList) {
            if (previewStack.getStackPreview() != null) {
                previewStack.getStackPreview().clear();
            }
        }
    }

    private int getActualScrollWidth() {
        return this.mPreviewUnitWidth * 4;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        this.mClipPathExpended.reset();
        this.mClipPathExpended.addRect(this.mVisiableRect.left, this.mVisiableRect.top, this.mVisiableRect.right, this.mVisiableRect.bottom, Path.Direction.CW);
        canvas.clipPath(this.mClipPathExpended);
        drawPreview(canvas);
        drawCropPreviewCover(canvas);
        canvas.save();
        canvas.restore();
        drawCropRectBorder(canvas);
        canvas.restore();
        drawCropBarsAndPointer(canvas);
    }

    private void drawPreview(Canvas canvas) {
        List<PreviewStack> list = this.mPreviewRectList;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this.mPreviewRectList.size();
        for (int i = 0; i < size; i++) {
            PreviewStack previewStack = this.mPreviewRectList.get(i);
            if (previewStack.getStackPreview() != null && previewStack.getStackPreview().size() > 0) {
                for (int size2 = previewStack.getStackPreview().size() - 1; size2 >= 0; size2--) {
                    drawStackImageInRect(previewStack.getStackPreview().get(size2), canvas, previewStack.getPreview().getColors(), 0);
                }
            }
            drawImageInRect(previewStack.getPreview(), canvas);
        }
    }

    private void drawImageInRect(Preview preview, Canvas canvas) {
        Rect position = preview.getPosition();
        int iWidth = position.width();
        try {
            canvas.drawBitmap(preview.getColors(), 0, this.mPreviewUnitWidth > position.width() ? this.mPreviewUnitWidth : position.width(), Utils.isRtl() ? ((this.mPreviewRect.right - iWidth) - position.left) + this.mPreviewRect.left : position.left, position.top, iWidth, position.height(), false, (Paint) null);
        } catch (ArrayIndexOutOfBoundsException e) {
            LogUtil.d(TAG, "ArrayIndexOutOfBoundsException error:", ExceptionUtils.c(e));
        }
    }

    private void drawStackImageInRect(Preview preview, Canvas canvas, int[] iArr, int i) {
        Rect position = preview.getPosition();
        int iWidth = position.width();
        int iWidth2 = this.mPreviewUnitWidth > position.width() ? this.mPreviewUnitWidth : position.width();
        if (preview.getColors().length != 0) {
            iArr = preview.getColors();
        }
        try {
            canvas.drawBitmap(iArr, 0, iWidth2, Utils.isRtl() ? ((this.mPreviewRect.right - iWidth) - position.left) + this.mPreviewRect.left : position.left, position.top, iWidth, position.height(), false, (Paint) null);
        } catch (ArrayIndexOutOfBoundsException e) {
            LogUtil.d(TAG, "ArrayIndexOutOfBoundsException error:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected void drawCropPreviewCover(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(-16777216);
        this.mPaint.setAlpha(96);
        Rect rect = new Rect(this.mPreviewRect.left, this.mPreviewRect.top, this.mCropFrameRect.left, this.mPreviewRect.bottom);
        Rect rect2 = new Rect(this.mCropFrameRect.right, this.mPreviewRect.top, this.mPreviewRect.right, this.mPreviewRect.bottom);
        canvas.drawRect(rect, this.mPaint);
        canvas.drawRect(rect2, this.mPaint);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected void drawCropRectBorder(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(6.0f);
        this.mPaint.setColor(this.mContext.getResources().getColor(R.color.watch_face_crop_colorAccent));
        canvas.drawRect(this.mCropFrameRect.left, this.mCropFrameRect.top + 3, this.mCropFrameRect.right, this.mCropFrameRect.bottom - 3, this.mPaint);
        this.mPaint.setColor(this.mContext.getResources().getColor(R.color.aar_common_color_divider_line_in_white_view));
        canvas.drawRect(this.mPreviewRect.left, this.mPreviewRect.top + 3, this.mPreviewRect.right, this.mPreviewRect.bottom - 3, this.mPaint);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    protected void drawCropBarsAndPointer(Canvas canvas) {
        Rect rect = new Rect(this.mCropFrameRect.left - this.mCropBarHalfWidth, this.mPreviewRect.top, this.mCropFrameRect.left + this.mCropBarHalfWidth, this.mPreviewRect.bottom);
        Rect rect2 = new Rect(this.mCropFrameRect.right - this.mCropBarHalfWidth, this.mPreviewRect.top, this.mCropFrameRect.right + this.mCropBarHalfWidth, this.mPreviewRect.bottom);
        drawDrawable(canvas, this.mCropBarLeft, rect);
        drawDrawable(canvas, this.mCropBarRight, rect2);
        if (shouldShowPointerView()) {
            drawDrawable(canvas, this.mCurrentPointerDrawable, this.mCurrentPointerRect);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    public int getVideoCropStartTime() {
        return this.mStartCropTime;
    }

    public int getVideoDuration() {
        return this.mVideoDuration;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    public int getVideoCropEndTime() {
        return this.mEndCropTime;
    }

    protected static class PreviewStack {
        private Preview preview;
        private int stackNum;
        private List<Preview> stackPreview;

        PreviewStack(Preview preview) {
            this.preview = preview;
        }

        Preview getPreview() {
            return this.preview;
        }

        List<Preview> getStackPreview() {
            return this.stackPreview;
        }

        void setStackPreview(List<Preview> list) {
            this.stackPreview = list;
        }

        int getStackNum() {
            return this.stackNum;
        }

        void setStackNum(int i) {
            this.stackNum = i;
        }
    }

    protected static class Preview {
        private int[] colors;
        private Rect defaultPosition;
        private Rect position;
        private int time;

        public Preview(int i, Rect rect) {
            this.time = i;
            this.position = rect;
        }

        public Rect getPosition() {
            return this.position;
        }

        public void setPosition(Rect rect) {
            this.position = rect;
        }

        public int getTime() {
            return this.time;
        }

        public int[] getColors() {
            int[] iArr = this.colors;
            if (iArr == null) {
                return new int[0];
            }
            return (int[]) iArr.clone();
        }

        public void setColors(int[] iArr) {
            if (iArr == null) {
                return;
            }
            this.colors = (int[]) iArr.clone();
        }

        Rect getDefaultPosition() {
            return this.defaultPosition;
        }

        void setDefaultPosition(Rect rect) {
            this.defaultPosition = rect;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            initViews();
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.BaseControllerView
    public void setProgress(int i) {
        calculatePointerRect(Utils.clamp(i, this.mStartCropTime, this.mEndCropTime));
        invalidate();
    }

    public void setPlayerInterface(PlayerDelegate playerDelegate) {
        this.mPlayerDelegate = playerDelegate;
    }

    public void setTimeView(TextView textView) {
        this.mCropTimeView = textView;
    }

    public void release() {
        this.mThumbnailsLoader.releaseContext();
    }
}

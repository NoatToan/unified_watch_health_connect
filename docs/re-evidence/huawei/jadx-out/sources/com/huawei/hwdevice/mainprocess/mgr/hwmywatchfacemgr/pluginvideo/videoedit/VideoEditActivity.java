package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.VideoChoosePicUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.StateMachine;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.edit.ThemeGenerator;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.info.VideoFileInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer2;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.MagicStateChangedCallBack;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.Constant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.EditUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.LayoutHelper;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.EditorVideoThumbnailView;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.widget.RoundTextureView;
import com.huawei.hwdevicemgr.R;
import com.huawei.secure.android.common.activity.SafeFragmentActivity;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.videoedit.param.MaterialInfo;
import defpackage.orf;
import defpackage.qpx;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VideoEditActivity extends SafeFragmentActivity implements View.OnClickListener, SaveManager.SaveListener, MagicStateChangedCallBack {
    private static final int DEFAULT_SCREEN = 466;
    private static final int DELAY_TIME_HIDDEN = 2000;
    private static final int DELAY_TIME_UPDATE_PROGRESS = 300;
    private static final int MSG_UPDATE_VIDEO_PROGRESS = 1002;
    private static final String TAG = "VideoEditActivity";
    private ImageView mCancelImg;
    private TextView mCropTimeView;
    private MagicPlayer2 mMagicPlayer2;
    private ImageView mOkImg;
    private ImageView mPlayPauseView;
    private SaveManager mSaveManager;
    protected SwaySurfaceManager mSurfaceManager;
    private RoundTextureView mTextureView;
    private int mVideoEndTime;
    private VideoFileInfo mVideoFileInfo;
    private String mVideoPath;
    private int mVideoStartTime;
    private EditorVideoThumbnailView mVideoThumbnailView;
    private boolean mIsShouldRequestPermission = true;
    private List<MaterialInfo> mFileList = new ArrayList();
    private CropListener mCropListener = new VideoCropListener();
    private boolean mIsShowing = false;
    private boolean isFirst = true;
    private int outWidth = 466;
    private int outHeight = 466;
    private Handler mHandler = new Handler() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.VideoEditActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1002) {
                return;
            }
            VideoEditActivity.this.handleUpdateVideoProgress();
        }
    };

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager.SaveListener
    public void onSaveFail() {
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager.SaveListener
    public void onSaveStart() {
    }

    public static void startVideoEditActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) VideoEditActivity.class);
        Uri uri = Uri.parse(Uri.encode(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(VideoEditorJumper.genVideoUri(uri.getPath()));
        intent.putParcelableArrayListExtra("input-file-path", arrayList);
        intent.putExtra("android.media.audiorecord.source", Constant.SOURCE_SINGLE_VIDEO);
        intent.putExtra(Constant.FILEPATH, str);
        intent.putExtra("video_start_time", 0);
        intent.putExtra("video_end_time", 10000);
        orf.d(activity, intent, 2);
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.b(TAG, "onCreate");
        initEditManger();
    }

    private void initView() {
        this.mVideoThumbnailView = (EditorVideoThumbnailView) findViewById(R.id.video_thumbnail_view);
        this.mCropTimeView = (TextView) findViewById(R.id.video_duration_time);
        this.mPlayPauseView = (ImageView) findViewById(R.id.play_pause);
        RoundTextureView roundTextureView = (RoundTextureView) findViewById(R.id.texture_view);
        this.mTextureView = roundTextureView;
        roundTextureView.setScreenWidthAndHeight(this.outWidth, this.outHeight);
        initOutlineView();
        this.mCancelImg = (ImageView) findViewById(R.id.ic_public_cancel);
        this.mOkImg = (ImageView) findViewById(R.id.ic_public_ok);
        this.mTextureView.setSurfaceTextureListener(new TextureSurface());
        this.mPlayPauseView.setOnClickListener(this);
        this.mTextureView.setOnClickListener(this);
        this.mCancelImg.setOnClickListener(this);
        this.mOkImg.setOnClickListener(this);
        this.mCancelImg.setImageDrawable(getResources().getDrawable(R.drawable.watch_face_ic_public_cancel));
        this.mOkImg.setImageDrawable(getResources().getDrawable(R.drawable.watch_face_ic_public_ok));
        boolean zIsNeedMirror = LanguageUtils.isNeedMirror();
        ViewGroup.LayoutParams layoutParams = this.mCancelImg.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.mOkImg.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = zIsNeedMirror ? DensityUtil.dip2px(24.0f) : 0;
            marginLayoutParams.leftMargin = zIsNeedMirror ? 0 : DensityUtil.dip2px(24.0f);
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.rightMargin = zIsNeedMirror ? 0 : DensityUtil.dip2px(24.0f);
            marginLayoutParams2.leftMargin = zIsNeedMirror ? DensityUtil.dip2px(24.0f) : 0;
        }
        this.mPlayPauseView.setImageResource(R.drawable.watch_face_video_play_selector);
    }

    private void initOutlineView() {
        if (this.outHeight != this.outWidth) {
            findViewById(R.id.texture_view_circle_round).setVisibility(8);
            ((ConstraintLayout.LayoutParams) this.mTextureView.getLayoutParams()).dimensionRatio = String.valueOf((((double) this.outWidth) * 1.0d) / ((double) this.outHeight));
            this.mTextureView.setTextureViewRectangle(findViewById(R.id.texture_view_rectangle_round));
        }
    }

    private void initEditManger() {
        requestWindowFeature(1);
        setContentView(R.layout.watchface_activity_video_edit_layout);
        setStatusBarColor();
        initOutSize();
        initView();
        getWindow().addFlags(128);
        getWindow().setSoftInputMode(48);
        List<Uri> materialUriList = TemplateUtil.getMaterialUriList(getIntent(), "input-file-path");
        if (materialUriList == null) {
            return;
        }
        List<MaterialInfo> listGenerateMaterialInfoFromGallery = TemplateUtil.generateMaterialInfoFromGallery(getIntent(), "input-file-path");
        this.mFileList = listGenerateMaterialInfoFromGallery;
        if (TemplateUtil.showFormatSupportToast(this, materialUriList, listGenerateMaterialInfoFromGallery)) {
            qpx.e(this, R.string.watch_face_tips_not_support_video_type);
            finish();
        }
        Intent intent = getIntent();
        this.mVideoPath = intent.getStringExtra(Constant.FILEPATH);
        this.mVideoStartTime = intent.getIntExtra("video_start_time", 0);
        this.mVideoEndTime = intent.getIntExtra("video_end_time", 0);
        intent.putExtra(TemplateUtil.MATERIAL_SOURCE_FLAG, 1);
        intent.putExtra(TemplateUtil.TEMPLATE_MEDIA_INFO, TemplateUtil.generateJsonData(this.mFileList));
        this.mSurfaceManager = new SwaySurfaceManager(this);
        this.mSaveManager = new SaveManager(this, this);
        this.mMagicPlayer2 = this.mSurfaceManager.getPlayer();
        this.mSurfaceManager.registerMagicStateChangedCb(this);
        VideoFileInfo videoFileInfo = new VideoFileInfo(this.mVideoPath);
        this.mVideoFileInfo = videoFileInfo;
        int durationMs = videoFileInfo.getDurationMs();
        int i = this.mVideoStartTime;
        if (i <= this.mVideoEndTime) {
            this.mVideoFileInfo.setClipStart(i);
            this.mVideoFileInfo.setClipEnd(Math.min(durationMs, this.mVideoEndTime));
        }
        this.mVideoThumbnailView.initialize(this.mVideoFileInfo);
        this.mVideoThumbnailView.setOnCropListener(this.mCropListener);
        this.mVideoThumbnailView.setPlayerInterface(this.mSurfaceManager);
        this.mVideoThumbnailView.setTimeView(this.mCropTimeView);
        this.mSurfaceManager.enter(intent);
        LayoutHelper.updateDimensions(this);
    }

    public void resetPlay() {
        if (this.mSurfaceManager != null) {
            ThemeGenerator.setModelDuration(this.mSurfaceManager.getTemplateModel(), 0, this.mVideoThumbnailView.getVideoDuration());
            this.mSurfaceManager.forceStopScrollingThenPlay(false);
        }
    }

    private void setStatusBarColor() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.watch_face_edit_all_root_background));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager.SaveListener
    public void onSaveSuccess(File file, Uri uri) {
        Intent intent = new Intent();
        intent.putExtra(Constant.VIDEO_EDIT_RESULT_URI, uri);
        intent.setData(uri);
        try {
            intent.putExtra(Constant.VIDEO_EDIT_RESULT_FILE, file.getCanonicalPath());
        } catch (IOException e) {
            LogUtil.b(TAG, "onSaveSuccess IOException ", ExceptionUtils.c(e));
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager.SaveListener
    public void onSaveCancel() {
        resetPlay();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.MagicStateChangedCallBack
    public void onStateChanged(final StateMachine stateMachine, final StateMachine stateMachine2) {
        runOnUiThread(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.VideoEditActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1438x8def2434(stateMachine, stateMachine2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onStateChanged$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-VideoEditActivity, reason: not valid java name */
    /* synthetic */ void m1438x8def2434(StateMachine stateMachine, StateMachine stateMachine2) {
        MagicPlayer2 magicPlayer2 = this.mMagicPlayer2;
        if (magicPlayer2 != null && this.mVideoThumbnailView != null && this.mSurfaceManager != null) {
            long currentTime = magicPlayer2.getCurrentTime();
            long durationTime = this.mMagicPlayer2.getDurationTime();
            int videoCropStartTime = this.mVideoThumbnailView.getVideoCropStartTime();
            if (this.isFirst && stateMachine == StateMachine.RUNNING) {
                this.isFirst = false;
                this.mSurfaceManager.pause();
                this.mSurfaceManager.seekTo(videoCropStartTime, false);
                seekTo(videoCropStartTime, false);
                this.mHandler.removeMessages(1002);
            } else if (100 + currentTime > durationTime) {
                this.mSurfaceManager.pause();
                seekTo(videoCropStartTime, true);
            } else {
                this.mHandler.sendEmptyMessage(1002);
            }
            LogUtil.b(TAG, "onStateChanged newState=", stateMachine, "oldState=", stateMachine2, "currentTime=", Long.valueOf(currentTime), "duration=", Long.valueOf(durationTime), "cropStartTime=", Integer.valueOf(videoCropStartTime));
        }
        updatePlayPauseView();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.play_pause) {
            MagicPlayer2 magicPlayer2 = this.mMagicPlayer2;
            if (magicPlayer2 == null || this.mSurfaceManager == null) {
                return;
            }
            StateMachine stateMachine = magicPlayer2.getStateMachine();
            if (stateMachine == StateMachine.RUNNING) {
                pauseVideo();
                return;
            }
            if (stateMachine == StateMachine.READY) {
                playVideo();
                return;
            } else if (stateMachine == StateMachine.INIT) {
                updatePlayPauseView();
                this.mSurfaceManager.enter(getIntent());
                return;
            } else {
                LogUtil.b(TAG, "onClick other state");
                return;
            }
        }
        if (id == R.id.ic_public_cancel) {
            finish();
        } else if (id == R.id.ic_public_ok) {
            save(VideoChoosePicUtil.getVideoEditSavePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseVideo() {
        MagicPlayer2 magicPlayer2;
        if (this.mSurfaceManager == null || (magicPlayer2 = this.mMagicPlayer2) == null || magicPlayer2.getStateMachine() != StateMachine.RUNNING) {
            return;
        }
        this.mSurfaceManager.pause();
        updatePlayPauseView();
    }

    private void playVideo() {
        SwaySurfaceManager swaySurfaceManager = this.mSurfaceManager;
        if (swaySurfaceManager != null) {
            swaySurfaceManager.play();
            this.mIsShowing = true;
            updatePlayPauseView();
            this.mHandler.sendEmptyMessage(1002);
        }
    }

    public class VideoCropListener implements CropListener {
        public VideoCropListener() {
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void onLeftCropping(int i, boolean z, boolean z2) {
            if (z) {
                VideoEditActivity.this.seekTo(i);
                VideoEditActivity videoEditActivity = VideoEditActivity.this;
                videoEditActivity.mVideoStartTime = videoEditActivity.mVideoThumbnailView.getVideoCropStartTime();
                VideoEditActivity videoEditActivity2 = VideoEditActivity.this;
                videoEditActivity2.mVideoEndTime = videoEditActivity2.mVideoThumbnailView.getVideoCropEndTime();
                if (z2) {
                    updateTimeText();
                }
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void onRightCropping(int i, boolean z) {
            if (z) {
                VideoEditActivity.this.seekTo(i);
                updateTimeText();
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void onCurrentPointerMoving(int i, boolean z) {
            if (z) {
                VideoEditActivity.this.seekTo(i);
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void onSeekStart() {
            VideoEditActivity.this.pauseVideo();
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void onSeekEnd(boolean z) {
            if (z && VideoEditActivity.this.mVideoThumbnailView != null && VideoEditActivity.this.mSurfaceManager != null) {
                VideoEditActivity.this.mSurfaceManager.seekTo(VideoEditActivity.this.mVideoThumbnailView.getVideoCropStartTime(), false);
            }
            VideoEditActivity.this.mHandler.removeMessages(1002);
            VideoEditActivity.this.mHandler.sendEmptyMessage(1002);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void updateProgress() {
            VideoEditActivity.this.mHandler.removeMessages(1002);
            VideoEditActivity.this.mHandler.sendEmptyMessage(1002);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void updateTimeText() {
            updateCropTimeText(EditUtil.getTextString(VideoEditActivity.this.mVideoThumbnailView.getVideoCropStartTime(), VideoEditActivity.this.mVideoThumbnailView.getVideoCropEndTime()));
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.CropListener
        public void updateCropTimeText(String str) {
            try {
                int i = Integer.parseInt(str);
                VideoEditActivity.this.mCropTimeView.setText(DensityUtil.getQuantityStringById(R.plurals.watch_face_cut_video_duration, i, Integer.valueOf(i)));
            } catch (Exception e) {
                LogUtil.d(VideoEditActivity.TAG, "updateCropTimeText error ", ExceptionUtils.c(e));
            }
        }
    }

    class TextureSurface implements TextureView.SurfaceTextureListener {
        Surface surface;
        SurfaceTexture surfaceTexture;

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private TextureSurface() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (this.surfaceTexture == null) {
                this.surfaceTexture = surfaceTexture;
            }
            if (this.surface == null) {
                this.surface = new Surface(surfaceTexture);
            }
            if (VideoEditActivity.this.mSurfaceManager != null) {
                VideoEditActivity.this.mSurfaceManager.setSurface(this.surface);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (VideoEditActivity.this.mSurfaceManager != null) {
                VideoEditActivity.this.mSurfaceManager.surfaceChanged(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.surface = null;
            return false;
        }
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SaveManager saveManager = this.mSaveManager;
        if (saveManager != null) {
            saveManager.destroy();
        }
        SwaySurfaceManager swaySurfaceManager = this.mSurfaceManager;
        if (swaySurfaceManager != null) {
            swaySurfaceManager.destroy();
        }
    }

    private void save(String str) {
        if (this.mSaveManager == null || this.mSurfaceManager == null) {
            return;
        }
        int videoCropStartTime = this.mVideoThumbnailView.getVideoCropStartTime();
        int videoCropEndTime = this.mVideoThumbnailView.getVideoCropEndTime() - videoCropStartTime;
        if (videoCropEndTime < 1000 || videoCropEndTime > 10200) {
            qpx.b(this, DensityUtil.getStringById(R.string.watch_face_video_duration_is_invalid, 1, 10));
            return;
        }
        pauseVideo();
        ThemeGenerator.setModelDuration(this.mSurfaceManager.getTemplateModel(), videoCropStartTime, videoCropEndTime);
        this.mSaveManager.startSave(this.mSurfaceManager.getTemplateModel(), str, false, null, this.outWidth, this.outHeight);
    }

    public void initOutSize() {
        String[] strArrSplit;
        try {
            try {
                String watchFaceScreen = HwWatchFaceBtManager.getInstance(this).getWatchFaceScreen(true, false);
                if (!TextUtils.isEmpty(watchFaceScreen) && (strArrSplit = watchFaceScreen.split("\\*")) != null && strArrSplit.length == 2) {
                    this.outHeight = Integer.parseInt(strArrSplit[0]);
                    this.outWidth = Integer.parseInt(strArrSplit[1]);
                }
            } finally {
                int i = this.outWidth;
                if (i <= 0) {
                    this.outWidth = 466;
                } else {
                    this.outWidth = (i / 2) * 2;
                }
                int i2 = this.outHeight;
                if (i2 <= 0) {
                    this.outHeight = 466;
                } else {
                    this.outHeight = (i2 / 2) * 2;
                }
                LogUtil.b(TAG, "initOutSize :outWidth ", Integer.valueOf(this.outWidth), ":outHeight ", Integer.valueOf(this.outHeight));
            }
        } catch (NullPointerException | NumberFormatException e) {
            LogUtil.d(TAG, "initOutSize error ", ExceptionUtils.c(e));
            int i3 = this.outWidth;
            if (i3 <= 0) {
                this.outWidth = 466;
            } else {
                this.outWidth = (i3 / 2) * 2;
            }
            int i4 = this.outHeight;
            if (i4 <= 0) {
                this.outHeight = 466;
            } else {
                this.outHeight = (i4 / 2) * 2;
            }
            LogUtil.b(TAG, "initOutSize :outWidth ", Integer.valueOf(this.outWidth), ":outHeight ", Integer.valueOf(this.outHeight));
        }
    }

    private void handleHiddenPlayPauseView() {
        ImageView imageView = this.mPlayPauseView;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.mIsShowing = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUpdateVideoProgress() {
        setProgress();
        MagicPlayer2 magicPlayer2 = this.mMagicPlayer2;
        if (magicPlayer2 == null || magicPlayer2.getStateMachine() != StateMachine.RUNNING) {
            return;
        }
        this.mHandler.sendEmptyMessageDelayed(1002, 300L);
    }

    private void updatePlayPauseView() {
        this.mHandler.postDelayed(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.VideoEditActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1439xc464f031();
            }
        }, 20L);
    }

    /* JADX INFO: renamed from: lambda$updatePlayPauseView$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-VideoEditActivity, reason: not valid java name */
    /* synthetic */ void m1439xc464f031() {
        MagicPlayer2 magicPlayer2 = this.mMagicPlayer2;
        if (magicPlayer2 == null || this.mPlayPauseView == null) {
            return;
        }
        StateMachine stateMachine = magicPlayer2.getStateMachine();
        if (stateMachine == StateMachine.RUNNING) {
            this.mPlayPauseView.setImageResource(R.drawable.watch_face_video_pause_selector);
            return;
        }
        if (stateMachine == StateMachine.READY) {
            this.mPlayPauseView.setImageResource(R.drawable.watch_face_video_play_selector);
        } else if (stateMachine == StateMachine.INIT) {
            this.mPlayPauseView.setImageResource(R.drawable.watch_face_video_play_selector);
        } else {
            LogUtil.b(TAG, "updatePlayPauseView other state");
        }
    }

    private void setProgress() {
        EditorVideoThumbnailView editorVideoThumbnailView;
        int currentTime = (int) this.mMagicPlayer2.getCurrentTime();
        if (((int) this.mMagicPlayer2.getDurationTime()) <= 0 || (editorVideoThumbnailView = this.mVideoThumbnailView) == null || this.mSurfaceManager == null) {
            return;
        }
        int videoCropStartTime = editorVideoThumbnailView.getVideoCropStartTime();
        int videoCropEndTime = this.mVideoThumbnailView.getVideoCropEndTime();
        if (videoCropEndTime > 0 && currentTime >= videoCropEndTime && this.mMagicPlayer2.getStateMachine() == StateMachine.RUNNING) {
            LogUtil.b(TAG, "setProgress-position =", Integer.valueOf(currentTime), "  cropStartTime =", Integer.valueOf(videoCropStartTime));
            this.mSurfaceManager.pause();
            seekTo(videoCropStartTime, true);
            currentTime = videoCropStartTime;
        }
        this.mVideoThumbnailView.setProgress(currentTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j) {
        seekTo(j, false);
    }

    private void seekTo(long j, boolean z) {
        SwaySurfaceManager swaySurfaceManager = this.mSurfaceManager;
        if (swaySurfaceManager != null) {
            swaySurfaceManager.seekTo((int) j, z);
            this.mHandler.removeMessages(1002);
            this.mHandler.sendEmptyMessage(1002);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        pauseVideo();
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

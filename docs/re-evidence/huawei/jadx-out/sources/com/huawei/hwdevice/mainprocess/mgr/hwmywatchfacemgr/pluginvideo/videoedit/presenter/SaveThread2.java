package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.AudioModel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.CodecContext;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.VideoModel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.Initializable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.Muxer;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.encode.VideoEncoder;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.gles.VideoRender;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.InputSurface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.videoedit.gles.glutils.ModelUtils;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.TimeLineImpl;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import com.huawei.watchface.videoedit.utils.EncoderFormat;
import com.huawei.watchface.videoedit.utils.Releasable;
import com.huawei.watchface.videoedit.utils.SaveUtils;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SaveThread2 extends GlRenderThread2 implements CodecContext {
    public static final int NORMAL_FPS_INCREASED_TIME_MILSECONDS = 33;
    private static final String TAG = "SaveThread2";
    private AudioModel mAudioModel;
    private int mBitRate;
    private Context mContext;
    private int mEncodeHeight;
    private int mEncodeWidth;
    private Handler mHandler;
    private volatile boolean mIsAudioMixFail = false;
    private boolean mIsNeedInsert;
    private boolean mIsSinglePhotoMode;
    private volatile boolean mIsStopRequested;
    private TemplateModel mModel;
    private SaveListener mSaveListener;
    private TimeLineImpl mTimeLine;
    private int mVideoHeight;
    private VideoModel mVideoModel;
    private final VideoRender mVideoRender;
    private String mVideoSavePath;
    private int mVideoWidth;
    private List<ModelVisitor> mVisitors;

    public interface SaveListener {
        void onProgress(int i, int i2);

        void onSaveFail();

        void onSaveSuccess(File file, Uri uri);
    }

    public SaveThread2(Context context, TemplateModel templateModel, String str, boolean z, int i, int i2) {
        setName("GL-save-thread");
        this.mTimeLine = new TimeLineImpl();
        this.mModel = templateModel;
        this.mAudioModel = new AudioModel();
        this.mVideoModel = new VideoModel();
        VideoRender videoRender = new VideoRender(context, MagicPlayer.Mode.SAVE);
        this.mVideoRender = videoRender;
        this.mVisitors = RenderSentinel.initVisitor(videoRender.getRenderDataManager(), 1);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mIsStopRequested = false;
        this.mVideoSavePath = str;
        this.mIsNeedInsert = z;
        this.mContext = context;
        this.mEncodeWidth = i;
        this.mEncodeHeight = i2;
    }

    private void onDataSetChanged() {
        if (Utils.isEmpty(this.mVisitors)) {
            LogUtil.d(TAG, "onDataSetChanged visitor is empty.");
            return;
        }
        Iterator<ModelVisitor> it = this.mVisitors.iterator();
        while (it.hasNext()) {
            it.next().onDataSetChanged(this.mModel);
        }
    }

    public void setSaveListener(SaveListener saveListener) {
        this.mSaveListener = saveListener;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0187 A[PHI: r6 r7 r21
      0x0187: PHI (r6v8 char) = (r6v7 char), (r6v7 char), (r6v10 char), (r6v10 char) binds: [B:48:0x0155, B:50:0x0159, B:55:0x0181, B:57:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r7v6 com.huawei.watchface.videoedit.utils.Releasable) = 
      (r7v5 com.huawei.watchface.videoedit.utils.Releasable)
      (r7v5 com.huawei.watchface.videoedit.utils.Releasable)
      (r7v8 com.huawei.watchface.videoedit.utils.Releasable)
      (r7v8 com.huawei.watchface.videoedit.utils.Releasable)
     binds: [B:48:0x0155, B:50:0x0159, B:55:0x0181, B:57:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r21v9 char) = (r21v8 char), (r21v8 char), (r21v11 char), (r21v11 char) binds: [B:48:0x0155, B:50:0x0159, B:55:0x0181, B:57:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.GlRenderThread2
    protected void doWork() throws Throwable {
        char c2;
        Releasable releasable;
        InputSurface inputSurface;
        char c3;
        setVideoSize();
        Muxer muxer = new Muxer(this.mVideoSavePath);
        VideoEncoder videoEncoder = new VideoEncoder(muxer, this.mBitRate, this.mEncodeWidth, this.mEncodeHeight, this.mIsSinglePhotoMode);
        char c4 = 1;
        Releasable releasable2 = null;
        try {
            try {
                if (!callInit(muxer, videoEncoder)) {
                    LogUtil.e(TAG, "doWork magic play working wrong: InterruptedException");
                    LogUtil.b(TAG, "doWork save finished. force stop ? ", Boolean.valueOf(this.mIsStopRequested));
                    callRelease(this.mVideoRender, null, videoEncoder, muxer);
                    muxer.failed();
                    return;
                }
                InputSurface inputSurface2 = new InputSurface(videoEncoder.getSurface());
                try {
                    inputSurface2.makeCurrent();
                    this.mVideoRender.onSizeChanged(1080, (int) ((this.mEncodeHeight / (this.mEncodeWidth * 1.0f)) * 1080.0f));
                    this.mVideoRender.setEncoderSize(this.mEncodeWidth, this.mEncodeHeight);
                    this.mVideoRender.init();
                    prepareComponentModel();
                    long duration = this.mModel.getDuration();
                    publishProgress(0L, duration);
                    while (true) {
                        if (this.mIsStopRequested) {
                            c2 = c4;
                            inputSurface = inputSurface2;
                            c3 = 0;
                            break;
                        }
                        long j = duration;
                        c2 = c4;
                        inputSurface = inputSurface2;
                        try {
                            if (drawFrameAtTime(videoEncoder, inputSurface2, duration, this.mTimeLine.getCurrentTime())) {
                                try {
                                    saveSuccess();
                                    c3 = c2;
                                    break;
                                } catch (RuntimeException unused) {
                                    c4 = c2;
                                    releasable = inputSurface;
                                } catch (Exception unused2) {
                                    c4 = c2;
                                    releasable = inputSurface;
                                    saveFail();
                                    muxer.failed();
                                    LogUtil.b(TAG, "doWork save finished. force stop ? ", Boolean.valueOf(this.mIsStopRequested));
                                    Releasable[] releasableArr = new Releasable[4];
                                    releasableArr[0] = this.mVideoRender;
                                    releasableArr[c2] = releasable;
                                    releasableArr[2] = videoEncoder;
                                    releasableArr[3] = muxer;
                                    callRelease(releasableArr);
                                    if (c4 != 0 || this.mIsAudioMixFail) {
                                        muxer.failed();
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    c4 = c2;
                                    releasable = inputSurface;
                                    LogUtil.b(TAG, "doWork save finished. force stop ? ", Boolean.valueOf(this.mIsStopRequested));
                                    Releasable[] releasableArr2 = new Releasable[4];
                                    releasableArr2[0] = this.mVideoRender;
                                    releasableArr2[c2] = releasable;
                                    releasableArr2[2] = videoEncoder;
                                    releasableArr2[3] = muxer;
                                    callRelease(releasableArr2);
                                    if (c4 != 0 || this.mIsAudioMixFail) {
                                        muxer.failed();
                                    }
                                    throw th;
                                }
                            } else {
                                this.mTimeLine.increasByFixTime(33L);
                                duration = j;
                                c4 = c2;
                                inputSurface2 = inputSurface;
                            }
                        } catch (RuntimeException unused3) {
                            releasable2 = inputSurface;
                            releasable = releasable2;
                            c4 = 0;
                        } catch (Exception unused4) {
                            releasable2 = inputSurface;
                            releasable = releasable2;
                            c4 = 0;
                            saveFail();
                            muxer.failed();
                            LogUtil.b(TAG, "doWork save finished. force stop ? ", Boolean.valueOf(this.mIsStopRequested));
                            Releasable[] releasableArr3 = new Releasable[4];
                            releasableArr3[0] = this.mVideoRender;
                            releasableArr3[c2] = releasable;
                            releasableArr3[2] = videoEncoder;
                            releasableArr3[3] = muxer;
                            callRelease(releasableArr3);
                            if (c4 != 0) {
                                muxer.failed();
                            } else {
                                muxer.failed();
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            releasable2 = inputSurface;
                            releasable = releasable2;
                            c4 = 0;
                            LogUtil.b(TAG, "doWork save finished. force stop ? ", Boolean.valueOf(this.mIsStopRequested));
                            Releasable[] releasableArr4 = new Releasable[4];
                            releasableArr4[0] = this.mVideoRender;
                            releasableArr4[c2] = releasable;
                            releasableArr4[2] = videoEncoder;
                            releasableArr4[3] = muxer;
                            callRelease(releasableArr4);
                            if (c4 != 0) {
                                muxer.failed();
                            } else {
                                muxer.failed();
                            }
                            throw th;
                        }
                        saveFail();
                        muxer.failed();
                        LogUtil.b(TAG, "doWork save finished. force stop ? ", Boolean.valueOf(this.mIsStopRequested));
                        Releasable[] releasableArr5 = new Releasable[4];
                        releasableArr5[0] = this.mVideoRender;
                        releasableArr5[c2] = releasable;
                        releasableArr5[2] = videoEncoder;
                        releasableArr5[3] = muxer;
                        callRelease(releasableArr5);
                        if (c4 == 0 || this.mIsAudioMixFail) {
                            muxer.failed();
                        }
                        return;
                    }
                    LogUtil.b(TAG, "doWork save finished. force stop ? ", Boolean.valueOf(this.mIsStopRequested));
                    Releasable[] releasableArr6 = new Releasable[4];
                    releasableArr6[0] = this.mVideoRender;
                    releasableArr6[c2] = inputSurface;
                    releasableArr6[2] = videoEncoder;
                    releasableArr6[3] = muxer;
                    callRelease(releasableArr6);
                    if (c3 == 0 || this.mIsAudioMixFail) {
                        muxer.failed();
                    }
                } catch (RuntimeException unused5) {
                    c2 = c4;
                    inputSurface = inputSurface2;
                } catch (Exception unused6) {
                    c2 = c4;
                    inputSurface = inputSurface2;
                } catch (Throwable th3) {
                    th = th3;
                    c2 = c4;
                    inputSurface = inputSurface2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (RuntimeException unused7) {
            c2 = 1;
        } catch (Exception unused8) {
            c2 = 1;
        } catch (Throwable th5) {
            th = th5;
            c2 = 1;
        }
    }

    private void saveFail() {
        LogUtil.e(TAG, "saveFail magic play working wrong: Exception");
        this.mHandler.post(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.SaveThread2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1452x2672322d();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$saveFail$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-presenter-SaveThread2, reason: not valid java name */
    /* synthetic */ void m1452x2672322d() {
        SaveListener saveListener = this.mSaveListener;
        if (saveListener != null) {
            saveListener.onSaveFail();
        }
    }

    private void saveSuccess() {
        final File file = new File(this.mVideoSavePath);
        final Uri uriForFile = null;
        try {
            if (this.mIsNeedInsert) {
                uriForFile = SaveUtils.insert(this.mContext.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, generateSaveValue(file)).orElse(null);
            } else {
                uriForFile = FileProvider.getUriForFile(this.mContext, CommonUtils.getAuthority(), file);
            }
        } catch (IOException unused) {
            LogUtil.d(TAG, "saveSuccess: IOException");
        }
        this.mHandler.post(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.SaveThread2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1453x67a054bb(file, uriForFile);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$saveSuccess$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-presenter-SaveThread2, reason: not valid java name */
    /* synthetic */ void m1453x67a054bb(File file, Uri uri) {
        SaveListener saveListener = this.mSaveListener;
        if (saveListener != null) {
            saveListener.onSaveSuccess(file, uri);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec.CodecContext
    public boolean isCanceled() {
        return this.mIsStopRequested;
    }

    private void prepareComponentModel() {
        this.mAudioModel.prepare(this.mModel);
        this.mVideoModel.prepare(this.mModel);
        onDataSetChanged();
        this.mTimeLine.startSaveMode(true);
        this.mVideoModel.setSurfacePool(this.mVideoRender.getRenderTextureManager().getVideoSurfaces(), this.mVideoRender.getRenderTextureManager());
    }

    private boolean drawFrameAtTime(VideoEncoder videoEncoder, InputSurface inputSurface, long j, long j2) throws Exception {
        long j3 = (long) ((j2 / 33.0f) * 3.3333334E7f);
        long j4 = j3 / 1000;
        long j5 = j4 / 1000;
        boolean z = j5 >= j;
        if (z) {
            j5 = j - 1;
        }
        int i = (int) j5;
        this.mVideoModel.update(i);
        this.mAudioModel.update(i);
        this.mVideoRender.onDrawFrame(j5);
        inputSurface.setPresentationTime(j3);
        inputSurface.swapBuffers();
        videoEncoder.encodeFrame(this, z, j4);
        if (z) {
            publishProgress(j, j);
            return true;
        }
        publishProgress(j5, j);
        return false;
    }

    private void publishProgress(final long j, final long j2) {
        this.mHandler.post(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.SaveThread2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1451x59b4ee04(j, j2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$publishProgress$2$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-presenter-SaveThread2, reason: not valid java name */
    /* synthetic */ void m1451x59b4ee04(long j, long j2) {
        SaveListener saveListener = this.mSaveListener;
        if (saveListener != null) {
            saveListener.onProgress((int) j, (int) j2);
        }
    }

    private void callRelease(Releasable... releasableArr) {
        for (Releasable releasable : releasableArr) {
            Utils.release(releasable);
        }
    }

    private boolean callInit(Initializable... initializableArr) {
        for (Initializable initializable : initializableArr) {
            if (initializable != null && !initializable.init()) {
                return false;
            }
        }
        return true;
    }

    private void setVideoSize() {
        int[] modelHeightAndWidth = ModelUtils.getModelHeightAndWidth(this.mContext, this.mModel);
        if (modelHeightAndWidth.length == 2) {
            this.mVideoWidth = modelHeightAndWidth[0];
            this.mVideoHeight = modelHeightAndWidth[1];
        }
        this.mIsSinglePhotoMode = this.mModel.getCanvasConfig().isSingleVideo();
        this.mBitRate = this.mModel.getCanvasConfig().getActiveBitRate();
        int minLength = this.mModel.getCanvasConfig().getMinLength();
        long duration = this.mModel.getDuration();
        float maxDurationForSize = EncoderFormat.getMaxDurationForSize(minLength) * 60000;
        float f = 1.0f;
        int i = 20;
        while (i > 0 && maxDurationForSize <= duration * f) {
            i--;
            f = (float) (((double) f) * 0.8d);
            LogUtil.b(TAG, "setVideoSize count is ", Integer.valueOf(i), " bitRateRatio", Float.valueOf(f));
        }
        int i2 = (int) (this.mBitRate * f);
        this.mBitRate = i2;
        LogUtil.b(TAG, "setVideoSize mBitRate is ", Integer.valueOf(i2), " bitRateRatio", Float.valueOf(f));
    }

    public void requestStop() {
        if (this.mIsStopRequested) {
            return;
        }
        this.mIsStopRequested = true;
        LogUtil.b(TAG, "request stop player");
    }

    private ContentValues generateSaveValue(File file) throws IOException {
        ContentValues contentValues = new ContentValues(10);
        String name = file.getName();
        contentValues.put("title", name.split("\\.")[0]);
        contentValues.put("_display_name", name);
        contentValues.put("_data", file.getCanonicalPath());
        long jCurrentTimeMillis = System.currentTimeMillis();
        contentValues.put("datetaken", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis / 1000));
        contentValues.put("resolution", this.mVideoWidth + "x" + this.mVideoHeight);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("duration", Long.valueOf(this.mModel.getDuration()));
        contentValues.put("_size", Long.valueOf(file.length()));
        return contentValues;
    }
}

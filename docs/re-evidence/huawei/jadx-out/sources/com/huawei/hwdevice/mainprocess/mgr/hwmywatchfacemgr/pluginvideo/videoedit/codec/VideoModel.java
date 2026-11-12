package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.codec;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.SurfacePool;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.RenderSurfaceListener;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.SurfaceFrameAvailableListener;
import com.huawei.watchface.videoedit.param.PlayerBean;
import com.huawei.watchface.videoedit.param.PlayerModel;
import com.huawei.watchface.videoedit.param.TargetTimeRange;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.presenter.PresenterUtils;
import com.huawei.watchface.videoedit.presenter.VideoPlayVisitor;
import com.huawei.watchface.videoedit.utils.BitmapUtils;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class VideoModel implements SurfacePool, SurfaceFrameAvailableListener {
    private static final int DECODE_MAX_WAIT_TIME_MS = 10;
    private static final int INVALID_INDEX = -1;
    private static final int MAX_TRY_COUNT = 20;
    private static final int SCREEN_HEIGHT = 1920;
    private static final int SCREEN_WIDTH = 1080;
    private static final float SINGLE_TICKTOCK_TIME_NS = 33333.332f;
    private static final String TAG = "VideoModel";
    private RenderSurfaceListener mSurfaceListener;
    private final Object lock = new Object();
    private final AtomicInteger count = new AtomicInteger(0);
    private final List<SaveVideoSurfaceManager2> surfaceManagers = new ArrayList();
    private int tickTockCount = 0;
    private VideoPlayVisitor mVisitor = new VideoPlayVisitor(0, "video");

    public void prepare(TemplateModel templateModel) {
        this.mVisitor.onDataSetChanged(templateModel);
    }

    public void update(int i) throws Throwable {
        removeNoActiveVideoSurface(i);
        loadPhotos(i);
        bindVideoSurface(i);
        decodeVideoFrame(i);
        waitFrameBufferSyncComplete();
    }

    private void removeNoActiveVideoSurface(int i) {
        int size = this.surfaceManagers.size();
        for (int i2 = 0; i2 < size; i2++) {
            SaveVideoSurfaceManager2 saveVideoSurfaceManager2 = this.surfaceManagers.get(i2);
            if (saveVideoSurfaceManager2.isSurfaceBusying()) {
                TargetTimeRange targetTimeRange = saveVideoSurfaceManager2.getPlayerBean().getTargetTimeRange();
                if (targetTimeRange.getStart() + targetTimeRange.getDuration() < i) {
                    LogUtil.b(TAG, "removeNoActiveVideoSurface surface unbind surface ", Integer.valueOf(saveVideoSurfaceManager2.getIndex()));
                    saveVideoSurfaceManager2.onSurfaceUnBind();
                }
            }
        }
    }

    private long getNaoSecond() {
        return (long) (this.tickTockCount * SINGLE_TICKTOCK_TIME_NS);
    }

    private int findAttachedVideo(String str, List<PlayerBean> list) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    private void bindVideoSurface(int i) {
        int iFindAttachedVideo;
        PlayerModel visitorModel = this.mVisitor.getVisitorModel();
        List<PlayerBean> playerBeansByTime = visitorModel.getPlayerBeansByTime(i, "video");
        playerBeansByTime.addAll(visitorModel.getPlayerBeansByTime(i, "video_musk"));
        Iterator<SaveVideoSurfaceManager2> it = this.surfaceManagers.iterator();
        while (it.hasNext()) {
            PlayerBean playerBean = it.next().getPlayerBean();
            if (playerBean != null && (iFindAttachedVideo = findAttachedVideo(playerBean.getId(), playerBeansByTime)) != -1) {
                playerBeansByTime.remove(iFindAttachedVideo);
            }
        }
        for (PlayerBean playerBean2 : playerBeansByTime) {
            if (playerBean2.getTargetTimeRange().getStart() <= i) {
                LogUtil.b(TAG, "bindVideoSurface player bean should bind ", playerBean2.getId());
                for (SaveVideoSurfaceManager2 saveVideoSurfaceManager2 : this.surfaceManagers) {
                    if (!saveVideoSurfaceManager2.isSurfaceAviliable()) {
                        LogUtil.b(TAG, "bindVideoSurface surface ", Integer.valueOf(saveVideoSurfaceManager2.getIndex()), " is not aviliable for video");
                    } else {
                        try {
                            linkVideoAndSurface(saveVideoSurfaceManager2, playerBean2, i);
                            saveVideoSurfaceManager2.resetInput();
                            LogUtil.c(TAG, "bindVideoSurface link surface success ");
                            return;
                        } catch (RuntimeException e) {
                            LogUtil.d(TAG, "bindVideoSurface RuntimeException", ExceptionUtils.c(e));
                        } catch (Exception e2) {
                            LogUtil.d(TAG, "bindVideoSurface Exception", ExceptionUtils.c(e2));
                        }
                    }
                }
            }
        }
    }

    private void linkVideoAndSurface(SaveVideoSurfaceManager2 saveVideoSurfaceManager2, PlayerBean playerBean, int i) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(playerBean.getPath());
        int trackCount = mediaExtractor.getTrackCount();
        for (int i2 = 0; i2 < trackCount; i2++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
            if (trackFormat.getString("mime").startsWith("video")) {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
                mediaExtractor.selectTrack(i2);
                mediaCodecCreateDecoderByType.configure(trackFormat, saveVideoSurfaceManager2.getSurface(), (MediaCrypto) null, 0);
                mediaCodecCreateDecoderByType.start();
                saveVideoSurfaceManager2.setMediaExtractor(mediaExtractor);
                int start = playerBean.getSourceTimeRange().getStart();
                LogUtil.c(TAG, "linkVideoAndSurface getClipStartMs() is " + start);
                LogUtil.b(TAG, "linkVideoAndSurface link: current: ", Integer.valueOf(i), ", startMs: ", Integer.valueOf(start), ", surface:", Integer.valueOf(saveVideoSurfaceManager2.getIndex()), ", startRange: ", Integer.valueOf(playerBean.getSourceTimeRange().getStart()), ",", Integer.valueOf(playerBean.getSourceTimeRange().getDuration()), ", targetRange: ", Integer.valueOf(playerBean.getTargetTimeRange().getStart()), ",", Integer.valueOf(playerBean.getTargetTimeRange().getDuration()));
                mediaExtractor.seekTo(((long) start) * 1000, 0);
                saveVideoSurfaceManager2.setVideoDecoder(mediaCodecCreateDecoderByType);
                saveVideoSurfaceManager2.onSurfaceBind(playerBean);
                return;
            }
        }
    }

    private void decodeVideoFrame(int i) {
        LogUtil.b(TAG, "decodeVideoFrame decode frame ", Integer.valueOf(i));
        this.tickTockCount = i / 33;
        for (SaveVideoSurfaceManager2 saveVideoSurfaceManager2 : this.surfaceManagers) {
            if (!saveVideoSurfaceManager2.isSurfaceAviliable() && !isGapReady(saveVideoSurfaceManager2.getDecodeTimeUs(), getNaoSecond())) {
                decodeVideoFrameForSurface(saveVideoSurfaceManager2);
            }
        }
    }

    private void decodeVideoFrameForSurface(SaveVideoSurfaceManager2 saveVideoSurfaceManager2) {
        MediaCodec videoDecoder = saveVideoSurfaceManager2.getVideoDecoder();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaExtractor mediaExtractor = saveVideoSurfaceManager2.getMediaExtractor();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 20;
        while (true) {
            int iDequeueInputBuffer = videoDecoder.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer >= 0 && !saveVideoSurfaceManager2.isInputFinished()) {
                ByteBuffer inputBuffer = videoDecoder.getInputBuffer(iDequeueInputBuffer);
                long sampleTime = mediaExtractor.getSampleTime();
                int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                if (sampleData < 0) {
                    LogUtil.d(TAG, "decodeVideoFrameForSurface data read finish, begin to release decoder buffer,should not happen here");
                    videoDecoder.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    saveVideoSurfaceManager2.inputFinished();
                } else {
                    videoDecoder.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, sampleTime, 0);
                    i++;
                    LogUtil.d(TAG, "decodeVideoFrameForSurface tryCount is ", Integer.valueOf(i));
                    mediaExtractor.advance();
                    if (sampleTime != mediaExtractor.getSampleTime()) {
                        LogUtil.d(TAG, "decodeVideoFrameForSurface videoFrameTimeStamp is ", Long.valueOf(sampleTime), "extractor.getSampleTime() is", Long.valueOf(mediaExtractor.getSampleTime()));
                    }
                }
            }
            int iDequeueOutputBuffer = videoDecoder.dequeueOutputBuffer(bufferInfo, 10000L);
            LogUtil.b(TAG, "decodeVideoFrameForSurface decoder dequeueOutputBuffer is", Integer.valueOf(iDequeueOutputBuffer));
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer < 0) {
                    LogUtil.b(TAG, "decodeVideoFrameForSurface outputIndex < 0", Integer.valueOf(iDequeueOutputBuffer));
                } else if (releaseOutputBuffer(bufferInfo, iDequeueOutputBuffer, videoDecoder, saveVideoSurfaceManager2, arrayList)) {
                    break;
                }
            } else {
                if (i == 0) {
                    LogUtil.b(TAG, "decodeVideoFrameForSurface max count is 0");
                    break;
                }
                i--;
            }
        }
        recycleOutputBuffers(arrayList, videoDecoder);
    }

    private void recycleOutputBuffers(ArrayList<Integer> arrayList, MediaCodec mediaCodec) {
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        int i = size - 1;
        int iIntValue = arrayList.get(i).intValue();
        this.count.incrementAndGet();
        LogUtil.b(TAG, "recycleOutputBuffers count is ", Integer.valueOf(this.count.get()));
        mediaCodec.releaseOutputBuffer(iIntValue, true);
        for (int i2 = 0; i2 < i; i2++) {
            mediaCodec.releaseOutputBuffer(arrayList.get(i2).intValue(), false);
        }
    }

    private void waitFrameBufferSyncComplete() throws InterruptedException {
        synchronized (this.lock) {
            if (this.count.get() == 0) {
                LogUtil.b(TAG, "waitFrameBufferSyncComplete finished");
                return;
            }
            LogUtil.b(TAG, "waitFrameBufferSyncComplete waiting");
            while (this.count.get() != 0) {
                this.lock.wait(10L);
                this.count.set(0);
            }
            LogUtil.b(TAG, "waitFrameBufferSyncComplete waitFrameBufferSyncComplete done");
        }
    }

    private boolean releaseOutputBuffer(MediaCodec.BufferInfo bufferInfo, int i, MediaCodec mediaCodec, SaveVideoSurfaceManager2 saveVideoSurfaceManager2, ArrayList<Integer> arrayList) {
        long naoSecond = getNaoSecond();
        boolean z = bufferInfo.size != 0;
        if (bufferInfo.presentationTimeUs >= 0 && z) {
            saveVideoSurfaceManager2.setDecodeTimeUs(bufferInfo.presentationTimeUs);
            if (arrayList.size() > 0) {
                mediaCodec.releaseOutputBuffer(arrayList.get(0).intValue(), false);
                arrayList.remove(0);
            }
            arrayList.add(Integer.valueOf(i));
        } else {
            mediaCodec.releaseOutputBuffer(i, false);
        }
        LogUtil.d(TAG, "releaseOutputBuffer surface:", Integer.valueOf(saveVideoSurfaceManager2.getIndex()), ", decodeOutputInfo.presentationTimeUs is ", Long.valueOf(bufferInfo.presentationTimeUs), " decodeOutputInfo.flags is ", Integer.valueOf(bufferInfo.flags), " currentTime ", Long.valueOf(naoSecond), ", decodeTime(us): ", Long.valueOf(saveVideoSurfaceManager2.getDecodeTimeUs()));
        return isExitAble(saveVideoSurfaceManager2, naoSecond, bufferInfo.flags);
    }

    private boolean isExitAble(SaveVideoSurfaceManager2 saveVideoSurfaceManager2, long j, int i) {
        return isGapReady(saveVideoSurfaceManager2.getDecodeTimeUs(), j) || (i & 4) != 0;
    }

    private boolean isGapReady(long j, long j2) {
        return j >= j2 || Math.abs(j - j2) < 10000;
    }

    private void loadPhotos(int i) throws Throwable {
        List<PlayerBean> playerBeansByTime = this.mVisitor.getVisitorModel().getPlayerBeansByTime(i, PresenterUtils.PHOTO);
        if (this.mSurfaceListener == null) {
            return;
        }
        for (PlayerBean playerBean : playerBeansByTime) {
            if (!this.mSurfaceListener.queryBitmapIsCached(playerBean.getId())) {
                Bitmap bitmapLoadImage = BitmapUtils.loadImage(playerBean.getPath(), BitmapUtils.getFullScreenNailScale(playerBean.getWidth(), playerBean.getHeight(), 1080.0f, 1920.0f));
                if (bitmapLoadImage != null) {
                    this.mSurfaceListener.onBitmapLoaded(bitmapLoadImage, playerBean.getId());
                }
            }
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.SurfacePool
    public void setSurfacePool(List<Surface> list, RenderSurfaceListener renderSurfaceListener) {
        if (list == null || renderSurfaceListener == null) {
            LogUtil.d(TAG, "setSurfacePool surfaces is null or surfaceListener is null");
            return;
        }
        synchronized (this.surfaceManagers) {
            this.surfaceManagers.clear();
            this.mSurfaceListener = renderSurfaceListener;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Surface surface = list.get(i);
                LogUtil.b(TAG, "setSurfacePool surfaces hashcode is ", Integer.valueOf(surface.hashCode()));
                this.surfaceManagers.add(new SaveVideoSurfaceManager2(surface, i, renderSurfaceListener));
            }
            renderSurfaceListener.registerFrameAvailalbleLister(this);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videorender.SurfaceFrameAvailableListener
    public void surfaceFrameAvailable() {
        synchronized (this.lock) {
            int iDecrementAndGet = this.count.decrementAndGet();
            LogUtil.b(TAG, "surfaceFrameAvailable ct is ", Integer.valueOf(iDecrementAndGet));
            if (iDecrementAndGet == 0) {
                this.lock.notifyAll();
            }
        }
    }
}

package com.huawei.healthcloud.plugintrack.trackanimation.decoder;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes10.dex */
public class VideoDecoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoDecoderCallback f10645b;
    private Context e;
    private MediaMuxer f;
    private String i;
    private MediaExtractor j;
    private Uri o;
    private int k = -1;
    private int g = 0;
    private int d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10644a = 0;
    private int h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10646c = 0;
    private long l = 0;

    public VideoDecoder(Context context) {
        this.e = context;
    }

    public void e(VideoDecoderCallback videoDecoderCallback) {
        this.f10645b = videoDecoderCallback;
    }

    public void b(String str, int i, int i2) {
        a(str, ((long) i) * 1000000, ((long) i2) * 1000000);
    }

    public void a(String str, long j, long j2) {
        if (j > j2) {
            c(false);
            LogUtil.j("Suggestion_VideoDecoder", "splitVideo: error start time > end time");
            return;
        }
        d();
        if (!b(str, j, j2)) {
            c(false);
            LogUtil.j("Suggestion_VideoDecoder", "splitVideo: init Decoder fail");
            return;
        }
        if (this.j == null || this.f == null) {
            LogUtil.j("Suggestion_VideoDecoder", "splitVideo: extractor or muxer is null");
            c(false);
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.h);
        this.f.start();
        e(j, j2, byteBufferAllocate);
        a(j, j2, byteBufferAllocate);
        try {
            this.j.release();
            this.f.stop();
            this.f.release();
            this.f = null;
            this.j = null;
            c(true);
        } catch (IllegalStateException e) {
            LogUtil.j("Suggestion_VideoDecoder", "splitVideo: error ", LogAnonymous.b(e));
            c(false);
        }
        this.j = null;
    }

    public void e() {
        try {
            this.e = null;
            MediaExtractor mediaExtractor = this.j;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.j = null;
            }
            MediaMuxer mediaMuxer = this.f;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.f.release();
                this.f = null;
            }
        } catch (IllegalStateException e) {
            LogUtil.j("Suggestion_VideoDecoder", "release: error ", LogAnonymous.b(e));
        }
    }

    private void d() {
        this.f = null;
        this.j = null;
        this.i = "";
        this.o = null;
        this.k = -1;
        this.d = -1;
        this.g = 0;
        this.f10644a = 0;
    }

    private boolean b(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_VideoDecoder", "initDecoder: video path is empty");
            return false;
        }
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.j = mediaExtractor;
        try {
            mediaExtractor.setDataSource(str);
            d(str);
            if (this.f == null) {
                return false;
            }
            c(str);
        } catch (IOException e) {
            LogUtil.j("Suggestion_VideoDecoder", "splitVideo: ", LogAnonymous.b(e));
        }
        for (int i = 0; i < this.j.getTrackCount(); i++) {
            MediaFormat trackFormat = this.j.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (!TextUtils.isEmpty(string) && a(j, j2, i, trackFormat, string)) {
                return false;
            }
        }
        return true;
    }

    private boolean a(long j, long j2, int i, MediaFormat mediaFormat, String str) {
        if (str.startsWith("video/")) {
            this.g = i;
            this.h = mediaFormat.getInteger("max-input-size");
            long j3 = mediaFormat.getLong("durationUs");
            this.l = j3;
            if (j > j3) {
                LogUtil.j("Suggestion_VideoDecoder", "splitVideo: start time > video duration");
                return true;
            }
            if (j + j2 > j3) {
                LogUtil.j("Suggestion_VideoDecoder", "splitVideo: end time > video duration");
                return true;
            }
            LogUtil.d("Suggestion_VideoDecoder", "splitVideo: video info : width = ", Integer.valueOf(mediaFormat.getInteger("width")), " height = ", Integer.valueOf(mediaFormat.getInteger("height")), " maxInputSize ", Integer.valueOf(this.h), " videoDuration = ", Long.valueOf(this.l));
            this.k = this.f.addTrack(mediaFormat);
        }
        if (!str.startsWith("audio/")) {
            return false;
        }
        this.f10644a = i;
        this.f10646c = mediaFormat.getInteger("max-input-size");
        this.d = this.f.addTrack(mediaFormat);
        return false;
    }

    private void c(String str) {
        if (this.f == null) {
            LogUtil.j("Suggestion_VideoDecoder", "setMuxerRotation: muxer is null");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        int iE = CommonUtil.e(mediaMetadataRetriever.extractMetadata(24), -1);
        if (iE >= 0) {
            this.f.setOrientationHint(iE);
        }
    }

    private void a(long j, long j2, ByteBuffer byteBuffer) {
        this.j.selectTrack(this.f10644a);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = 0L;
        this.j.readSampleData(byteBuffer, 0);
        if (this.j.getSampleTime() == 0) {
            this.j.advance();
        }
        this.j.seekTo(j, 0);
        while (true) {
            int sampleData = this.j.readSampleData(byteBuffer, 0);
            if (sampleData < 0) {
                this.j.unselectTrack(this.f10644a);
                return;
            }
            long sampleTime = this.j.getSampleTime();
            if (j2 != 0 && sampleTime > j + j2) {
                this.j.unselectTrack(this.f10644a);
                return;
            }
            bufferInfo.offset = 0;
            bufferInfo.size = sampleData;
            bufferInfo.flags = this.j.getSampleFlags();
            bufferInfo.presentationTimeUs = sampleTime;
            this.f.writeSampleData(this.d, byteBuffer, bufferInfo);
            this.j.advance();
        }
    }

    private void e(long j, long j2, ByteBuffer byteBuffer) {
        this.j.selectTrack(this.g);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = 0L;
        this.j.readSampleData(byteBuffer, 0);
        this.j.seekTo(j, 0);
        while (true) {
            int sampleData = this.j.readSampleData(byteBuffer, 0);
            if (sampleData < 0) {
                this.j.unselectTrack(this.g);
                return;
            }
            long sampleTime = this.j.getSampleTime();
            if (j2 != 0 && sampleTime > j + j2) {
                this.j.unselectTrack(this.g);
                return;
            }
            bufferInfo.flags = this.j.getSampleFlags();
            bufferInfo.offset = 0;
            bufferInfo.size = sampleData;
            bufferInfo.presentationTimeUs = sampleTime;
            this.f.writeSampleData(this.k, byteBuffer, bufferInfo);
            this.j.advance();
        }
    }

    private void d(String str) {
        if (this.e == null) {
            LogUtil.j("Suggestion_VideoDecoder", "initMuxer: context is null");
            c(false);
            return;
        }
        if (PermissionUtil.a()) {
            b(str);
        } else {
            c();
        }
        try {
            if (!TextUtils.isEmpty(this.i)) {
                this.f = new MediaMuxer(this.i, 0);
            } else if (this.o != null && PermissionUtil.a()) {
                this.f = new MediaMuxer(this.e.getContentResolver().openFileDescriptor(this.o, "rw").getFileDescriptor(), 0);
            } else {
                LogUtil.j("Suggestion_VideoDecoder", "initMuxer: path and uri is empty");
            }
        } catch (IOException e) {
            LogUtil.j("Suggestion_VideoDecoder", "initMuxer: error ", LogAnonymous.b(e));
            c(false);
        }
    }

    private void c() {
        String str = CommonUtil.f(BaseApplication.getContext()) + File.separator + "DCIM/HuaweiHealth/";
        if (!e(str)) {
            LogUtil.j("Suggestion_VideoDecoder", "folder create fail ", str);
            c(false);
            return;
        }
        try {
            this.i = str + new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(Long.valueOf(System.currentTimeMillis())) + "_cut.mp4";
        } catch (IllegalArgumentException e) {
            LogUtil.j("Suggestion_VideoDecoder", "initMuxer: error ", LogAnonymous.b(e));
            c(false);
        }
    }

    private boolean e(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    private void b(String str) {
        String strSubstring = str.contains(File.separator) ? str.substring(str.lastIndexOf(File.separator)) : null;
        if (!TextUtils.isEmpty(strSubstring) && strSubstring.contains(".")) {
            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf("."));
        }
        if (!TextUtils.isEmpty(strSubstring)) {
            strSubstring = strSubstring + "_cut.mp4";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", strSubstring);
        contentValues.put("_display_name", strSubstring);
        contentValues.put("mime_type", "video/mp4");
        long j = jCurrentTimeMillis / 1000;
        contentValues.put("date_added", Long.valueOf(j));
        contentValues.put("date_modified", Long.valueOf(j));
        contentValues.put("date_expires", Long.valueOf((jCurrentTimeMillis + 3600000) / 1000));
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", "DCIM/HuaweiHealth/");
        try {
            this.o = BaseApplication.getContext().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } catch (IllegalArgumentException e) {
            LogUtil.j("Suggestion_VideoDecoder", "initVideoName: ", LogAnonymous.b(e));
        }
    }

    private void c(boolean z) {
        if (this.f10645b == null) {
            LogUtil.j("Suggestion_VideoDecoder", "notifyResult: callback is empty");
            return;
        }
        if (this.o != null) {
            d(z);
        }
        if (TextUtils.isEmpty(this.i)) {
            this.f10645b.onResult(false, "");
            LogUtil.j("Suggestion_VideoDecoder", "notifyResult: path is empty");
            return;
        }
        this.f10645b.onResult(z, this.i);
        if (z) {
            return;
        }
        File file = new File(this.i);
        if (file.exists()) {
            FileUtils.j(file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public String b(Uri uri) throws Throwable {
        IllegalArgumentException e;
        Cursor cursorQuery;
        String[] strArr = {"_data"};
        ?? r10 = 0;
        try {
            try {
                cursorQuery = BaseApplication.getContext().getContentResolver().query(uri, strArr, null, null, null);
                try {
                    if (cursorQuery == null) {
                        LogUtil.j("Suggestion_VideoDecoder", "getFilePathFromContentUri: cursor is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return null;
                        }
                        return null;
                    }
                    cursorQuery.moveToFirst();
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(strArr[0]));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return string;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    LogUtil.j("Suggestion_VideoDecoder", "getFilePathFromContentUri: ", LogAnonymous.b(e));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th) {
                r10 = uri;
                th = th;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    private void d(boolean z) {
        if (this.o == null) {
            LogUtil.j("Suggestion_VideoDecoder", "onVideoSaveSuccess: uri is null");
            return;
        }
        try {
            if (z) {
                ContentValues contentValues = new ContentValues();
                contentValues.putNull("date_expires");
                contentValues.put("is_pending", (Integer) 0);
                BaseApplication.getContext().getContentResolver().update(this.o, contentValues, null, null);
                this.i = b(this.o);
                return;
            }
            BaseApplication.getContext().getContentResolver().delete(this.o, null, null);
            this.o = null;
        } catch (IllegalArgumentException e) {
            LogUtil.j("Suggestion_VideoDecoder", "onVideoSaveSuccess: resolver update error ", LogAnonymous.b(e));
        }
    }
}

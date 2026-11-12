package com.xiaomi.fitness.watch.face.edit.video.videoprocess;

import android.graphics.PointF;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.google.android.gms.common.Scopes;
import defpackage.drq;
import defpackage.nu6;
import defpackage.yxp;
import defpackage.zza;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class b {
    public static String i = "video/avc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13371b;
    public int c;
    public int d;
    public int e;
    public a g;
    public int f = 0;
    public volatile boolean h = false;

    public interface a {
        void onVideoProcessFinish();

        void onVideoProcessProgress(int i);
    }

    public b(String str, String str2, int i2) {
        this.f13370a = str;
        this.f13371b = str2;
        this.e = i2;
        StringBuilder sb = new StringBuilder();
        sb.append("video process input path:");
        sb.append(str);
        sb.append(", output path:");
        sb.append(str2);
        sb.append(", output size:");
        sb.append(i2);
    }

    public final /* synthetic */ void b(int i2, int i3, int i4) {
        try {
            try {
                f(i2, i3, i4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.h = false;
        }
    }

    public void c(final int i2, final int i3, final int i4) {
        if (this.h) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("video start processing, startX:");
        sb.append(i2);
        sb.append(", startY:");
        sb.append(i3);
        sb.append(", cropSize:");
        sb.append(i4);
        this.h = true;
        Executors.newFixedThreadPool(1).submit(new Runnable() { // from class: irq
            @Override // java.lang.Runnable
            public final void run() {
                this.f22027a.b(i2, i3, i4);
            }
        });
    }

    public final int d(MediaExtractor mediaExtractor, boolean z) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i2 = 0; i2 < trackCount; i2++) {
            String string = mediaExtractor.getTrackFormat(i2).getString("mime");
            if (z && string.startsWith("video/")) {
                return i2;
            }
        }
        return -1;
    }

    public void e(a aVar) {
        this.g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2 A[Catch: Exception -> 0x02ee, TryCatch #0 {Exception -> 0x02ee, blocks: (B:111:0x02e7, B:115:0x02f2, B:117:0x02fa, B:119:0x02ff, B:121:0x0307), top: B:147:0x02e7 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02fa A[Catch: Exception -> 0x02ee, TryCatch #0 {Exception -> 0x02ee, blocks: (B:111:0x02e7, B:115:0x02f2, B:117:0x02fa, B:119:0x02ff, B:121:0x0307), top: B:147:0x02e7 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02ff A[Catch: Exception -> 0x02ee, TryCatch #0 {Exception -> 0x02ee, blocks: (B:111:0x02e7, B:115:0x02f2, B:117:0x02fa, B:119:0x02ff, B:121:0x0307), top: B:147:0x02e7 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0307 A[Catch: Exception -> 0x02ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ee, blocks: (B:111:0x02e7, B:115:0x02f2, B:117:0x02fa, B:119:0x02ff, B:121:0x0307), top: B:147:0x02e7 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0312  */
    /* JADX WARN: Code duplicated, block: B:132:0x0321 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0323 A[Catch: Exception -> 0x031f, TryCatch #6 {Exception -> 0x031f, blocks: (B:129:0x0318, B:133:0x0323, B:135:0x032b, B:137:0x0330, B:139:0x0338), top: B:149:0x0318 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x032b A[Catch: Exception -> 0x031f, TryCatch #6 {Exception -> 0x031f, blocks: (B:129:0x0318, B:133:0x0323, B:135:0x032b, B:137:0x0330, B:139:0x0338), top: B:149:0x0318 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0330 A[Catch: Exception -> 0x031f, TryCatch #6 {Exception -> 0x031f, blocks: (B:129:0x0318, B:133:0x0323, B:135:0x032b, B:137:0x0330, B:139:0x0338), top: B:149:0x0318 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0338 A[Catch: Exception -> 0x031f, TRY_LEAVE, TryCatch #6 {Exception -> 0x031f, blocks: (B:129:0x0318, B:133:0x0323, B:135:0x032b, B:137:0x0330, B:139:0x0338), top: B:149:0x0318 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x02e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.xiaomi.fitness.watch.face.edit.video.videoprocess.b] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.media.MediaExtractor] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.media.MediaExtractor] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.media.MediaExtractor] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void f(int i2, int i3, int i4) throws Throwable {
        Throwable th;
        zza zzaVar;
        boolean z;
        ?? r7;
        boolean z2;
        ?? r8;
        MediaMuxer mediaMuxer;
        ?? r9;
        boolean z3;
        MediaCodec mediaCodecE;
        ?? r10;
        boolean z4;
        MediaCodec mediaCodec;
        ?? r11;
        ?? r6;
        a aVar;
        ?? r12;
        ?? r13;
        a aVar2;
        int iMin;
        float f;
        float f2;
        float f3;
        float f4;
        ?? r14;
        ?? r15;
        ?? r16;
        int i5;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        try {
            ?? mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(this.f13370a);
                int iD = d(mediaExtractor, true);
                if (iD < 0) {
                    throw new IOException("No video track found in input video");
                }
                mediaExtractor.selectTrack(iD);
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(iD);
                this.c = trackFormat.getInteger("width");
                this.d = trackFormat.getInteger("height");
                long j = trackFormat.getLong("durationUs");
                int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                mediaMuxer = new MediaMuxer(this.f13371b, 0);
                try {
                    if (integer == 0 || integer == 180) {
                        iMin = Math.min(Math.min(i4, this.c - i2), Math.min(i4, this.d - i3));
                        int i6 = this.d;
                        f = i6 / iMin;
                        int i7 = this.c;
                        f2 = (i7 / i6) * f;
                        int i8 = i2 * 2;
                        int i9 = (i7 - iMin) - i8;
                        float f5 = i9 >= 0 ? (i9 / i7) * f2 : (-(((i8 + iMin) - i7) / i7)) * f2;
                        int i10 = i3 * 2;
                        int i11 = (i6 - iMin) - i10;
                        f3 = i11 >= 0 ? (-(i11 / i6)) * f : (((i10 + iMin) - i6) / i6) * f;
                        f4 = f5;
                    } else {
                        iMin = Math.min(Math.min(i4, this.d - i2), Math.min(i4, this.c - i3));
                        int i12 = this.d;
                        f2 = i12 / iMin;
                        int i13 = this.c;
                        f = (i13 / i12) * f2;
                        int i14 = i2 * 2;
                        int i15 = (i12 - iMin) - i14;
                        f4 = (i15 >= 0 ? i15 / i12 : -(((i14 + iMin) - i12) / i12)) * f2;
                        int i16 = i3 * 2;
                        int i17 = (i13 - iMin) - i16;
                        f3 = (i17 >= 0 ? -(i17 / i13) : ((i16 + iMin) - i13) / i13) * f;
                    }
                    yxp yxpVar = new yxp(new PointF(f2, f), new PointF(f4, f3), -integer);
                    StringBuilder sb = new StringBuilder();
                    sb.append("input video width:");
                    sb.append(this.c);
                    sb.append(", height:");
                    sb.append(this.d);
                    sb.append(", rotation:");
                    sb.append(integer);
                    sb.append(", final cropSize:");
                    sb.append(iMin);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new drq(yxpVar));
                    zzaVar = new zza(arrayList);
                    try {
                        trackFormat.getString("mime");
                        String str = i;
                        int i18 = this.e;
                        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i18, i18);
                        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
                        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
                        mediaFormatCreateVideoFormat.setInteger("color-standard", 1);
                        mediaFormatCreateVideoFormat.setInteger("color-range", 1);
                        mediaFormatCreateVideoFormat.setInteger("bitrate", 1100000);
                        mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, 1);
                        mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, 1);
                        int iA = nu6.a(1);
                        int iAddTrack = -1;
                        if (iA != -1) {
                            mediaFormatCreateVideoFormat.setInteger("level", iA);
                        }
                        TrackTranscoderException.Error error = TrackTranscoderException.Error.ENCODER_NOT_FOUND;
                        TrackTranscoderException.Error error2 = TrackTranscoderException.Error.ENCODER_FORMAT_NOT_FOUND;
                        TrackTranscoderException.Error error3 = TrackTranscoderException.Error.ENCODER_CONFIGURATION_ERROR;
                        mediaCodecE = com.xiaomi.fitness.watch.face.edit.video.videoprocess.a.e(mediaFormatCreateVideoFormat, null, true, error, error2, error3);
                        try {
                            zzaVar.b(mediaCodecE.createInputSurface(), trackFormat, mediaFormatCreateVideoFormat);
                            ?? r0 = 0;
                            ?? E = com.xiaomi.fitness.watch.face.edit.video.videoprocess.a.e(trackFormat, zzaVar.a(), false, error, error2, error3);
                            try {
                                mediaCodecE.start();
                                E.start();
                                ?? r17 = 1;
                                while (r17 != 0) {
                                    int iDequeueInputBuffer = E.dequeueInputBuffer(10000L);
                                    if (iDequeueInputBuffer >= 0) {
                                        int sampleData = mediaExtractor.readSampleData(E.getInputBuffer(iDequeueInputBuffer), r0);
                                        if (sampleData < 0) {
                                            r15 = r17;
                                            E.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                            r16 = r0;
                                        } else {
                                            r15 = r17;
                                            E.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                                            mediaExtractor.advance();
                                            r16 = r17;
                                        }
                                        a aVar3 = this.g;
                                        r15 = r16;
                                        if (aVar3 != null && (i5 = this.f) > 0 && i5 <= 100) {
                                            aVar3.onVideoProcessProgress(i5);
                                            r15 = r16;
                                        }
                                    }
                                    r15 = r16;
                                    r15 = r16;
                                    r15 = r17;
                                    for (int iDequeueOutputBuffer = E.dequeueOutputBuffer(bufferInfo, 10000L); iDequeueOutputBuffer >= 0; iDequeueOutputBuffer = E.dequeueOutputBuffer(bufferInfo, 0L)) {
                                        if ((bufferInfo.flags & 4) != 0) {
                                            E.releaseOutputBuffer(iDequeueOutputBuffer, r0);
                                            mediaCodecE.signalEndOfInputStream();
                                        } else {
                                            E.releaseOutputBuffer(iDequeueOutputBuffer, true);
                                            zzaVar.c(TimeUnit.MICROSECONDS.toNanos(bufferInfo.presentationTimeUs));
                                        }
                                    }
                                    int iDequeueOutputBuffer2 = mediaCodecE.dequeueOutputBuffer(bufferInfo2, 10000L);
                                    r0 = r0;
                                    if (iDequeueOutputBuffer2 == -2) {
                                        iAddTrack = mediaMuxer.addTrack(mediaCodecE.getOutputFormat());
                                        mediaMuxer.start();
                                    } else {
                                        while (iDequeueOutputBuffer2 >= 0) {
                                            ByteBuffer outputBuffer = mediaCodecE.getOutputBuffer(iDequeueOutputBuffer2);
                                            if (bufferInfo2.size > 0) {
                                                outputBuffer.position(bufferInfo2.offset);
                                                outputBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                                                mediaMuxer.writeSampleData(iAddTrack, outputBuffer, bufferInfo2);
                                                if (j > 0) {
                                                    this.f = (int) (((long) (((int) bufferInfo2.presentationTimeUs) * 100)) / j);
                                                }
                                                r0 = 0;
                                                mediaCodecE.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                                            }
                                            iDequeueOutputBuffer2 = mediaCodecE.dequeueOutputBuffer(bufferInfo2, 0L);
                                            r0 = r0;
                                        }
                                    }
                                    r0 = r0;
                                    r17 = r15;
                                }
                                this.f = 100;
                                a aVar4 = this.g;
                                if (aVar4 != null) {
                                    aVar4.onVideoProcessProgress(100);
                                }
                                try {
                                    E.stop();
                                    E.release();
                                    mediaCodecE.stop();
                                    mediaCodecE.release();
                                    mediaExtractor.release();
                                    mediaMuxer.stop();
                                    mediaMuxer.release();
                                    zzaVar.release();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                aVar2 = this.g;
                                if (aVar2 == null) {
                                    return;
                                }
                            } catch (Exception unused) {
                                mediaCodec = mediaCodecE;
                                r13 = E;
                                r12 = mediaExtractor;
                                if (r13 != 0) {
                                    try {
                                        r13.stop();
                                        r13.release();
                                        if (mediaCodec != null) {
                                            mediaCodec.stop();
                                            mediaCodec.release();
                                        }
                                        if (r12 != 0) {
                                            r12.release();
                                        }
                                        if (mediaMuxer != null) {
                                            mediaMuxer.stop();
                                            mediaMuxer.release();
                                        }
                                        if (zzaVar != null) {
                                            zzaVar.release();
                                        }
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        aVar2 = this.g;
                                        if (aVar2 == null) {
                                            return;
                                        }
                                        aVar2.onVideoProcessFinish();
                                    }
                                } else {
                                    if (mediaCodec != null) {
                                        mediaCodec.stop();
                                        mediaCodec.release();
                                    }
                                    if (r12 != 0) {
                                        r12.release();
                                    }
                                    if (mediaMuxer != null) {
                                        mediaMuxer.stop();
                                        mediaMuxer.release();
                                    }
                                    if (zzaVar != null) {
                                        zzaVar.release();
                                    }
                                }
                                aVar2 = this.g;
                                if (aVar2 == null) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r14 = E;
                                th = th;
                                r6 = r14;
                                r11 = mediaExtractor;
                                if (r6 != 0) {
                                    try {
                                        r6.stop();
                                        r6.release();
                                        if (mediaCodecE != null) {
                                            mediaCodecE.stop();
                                            mediaCodecE.release();
                                        }
                                        if (r11 != 0) {
                                            r11.release();
                                        }
                                        if (mediaMuxer != null) {
                                            mediaMuxer.stop();
                                            mediaMuxer.release();
                                        }
                                        if (zzaVar != null) {
                                            zzaVar.release();
                                        }
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                        aVar = this.g;
                                        if (aVar != null) {
                                            throw th;
                                        }
                                        aVar.onVideoProcessFinish();
                                        throw th;
                                    }
                                } else {
                                    if (mediaCodecE != null) {
                                        mediaCodecE.stop();
                                        mediaCodecE.release();
                                    }
                                    if (r11 != 0) {
                                        r11.release();
                                    }
                                    if (mediaMuxer != null) {
                                        mediaMuxer.stop();
                                        mediaMuxer.release();
                                    }
                                    if (zzaVar != null) {
                                        zzaVar.release();
                                    }
                                }
                                aVar = this.g;
                                if (aVar != null) {
                                    throw th;
                                }
                                aVar.onVideoProcessFinish();
                                throw th;
                            }
                        } catch (Exception unused2) {
                            mediaCodec = mediaCodecE;
                            r13 = 0;
                            r12 = mediaExtractor;
                        } catch (Throwable th3) {
                            th = th3;
                            r14 = 0;
                        }
                    } catch (Exception unused3) {
                        z4 = false;
                        r10 = mediaExtractor;
                        mediaCodec = null;
                        r13 = z4;
                        r12 = r10;
                        if (r13 != 0) {
                            r13.stop();
                            r13.release();
                            if (mediaCodec != null) {
                                mediaCodec.stop();
                                mediaCodec.release();
                            }
                            if (r12 != 0) {
                                r12.release();
                            }
                            if (mediaMuxer != null) {
                                mediaMuxer.stop();
                                mediaMuxer.release();
                            }
                            if (zzaVar != null) {
                                zzaVar.release();
                            }
                        } else {
                            if (mediaCodec != null) {
                                mediaCodec.stop();
                                mediaCodec.release();
                            }
                            if (r12 != 0) {
                                r12.release();
                            }
                            if (mediaMuxer != null) {
                                mediaMuxer.stop();
                                mediaMuxer.release();
                            }
                            if (zzaVar != null) {
                                zzaVar.release();
                            }
                        }
                        aVar2 = this.g;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.onVideoProcessFinish();
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = false;
                        r9 = mediaExtractor;
                        mediaCodecE = null;
                        r6 = z3;
                        r11 = r9;
                        if (r6 != 0) {
                            r6.stop();
                            r6.release();
                            if (mediaCodecE != null) {
                                mediaCodecE.stop();
                                mediaCodecE.release();
                            }
                            if (r11 != 0) {
                                r11.release();
                            }
                            if (mediaMuxer != null) {
                                mediaMuxer.stop();
                                mediaMuxer.release();
                            }
                            if (zzaVar != null) {
                                zzaVar.release();
                            }
                        } else {
                            if (mediaCodecE != null) {
                                mediaCodecE.stop();
                                mediaCodecE.release();
                            }
                            if (r11 != 0) {
                                r11.release();
                            }
                            if (mediaMuxer != null) {
                                mediaMuxer.stop();
                                mediaMuxer.release();
                            }
                            if (zzaVar != null) {
                                zzaVar.release();
                            }
                        }
                        aVar = this.g;
                        if (aVar != null) {
                            throw th;
                        }
                        aVar.onVideoProcessFinish();
                        throw th;
                    }
                } catch (Exception unused4) {
                    zzaVar = null;
                } catch (Throwable th5) {
                    th = th5;
                    zzaVar = null;
                }
                aVar2.onVideoProcessFinish();
            } catch (Exception unused5) {
                zzaVar = null;
                z2 = false;
                r8 = mediaExtractor;
                mediaMuxer = null;
                z4 = z2;
                r10 = r8;
                mediaCodec = null;
                r13 = z4;
                r12 = r10;
                if (r13 != 0) {
                    r13.stop();
                    r13.release();
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        mediaCodec.release();
                    }
                    if (r12 != 0) {
                        r12.release();
                    }
                    if (mediaMuxer != null) {
                        mediaMuxer.stop();
                        mediaMuxer.release();
                    }
                    if (zzaVar != null) {
                        zzaVar.release();
                    }
                } else {
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        mediaCodec.release();
                    }
                    if (r12 != 0) {
                        r12.release();
                    }
                    if (mediaMuxer != null) {
                        mediaMuxer.stop();
                        mediaMuxer.release();
                    }
                    if (zzaVar != null) {
                        zzaVar.release();
                    }
                }
                aVar2 = this.g;
                if (aVar2 == null) {
                    return;
                }
                aVar2.onVideoProcessFinish();
            } catch (Throwable th6) {
                th = th6;
                zzaVar = null;
                z = false;
                r7 = mediaExtractor;
                mediaMuxer = null;
                z3 = z;
                r9 = r7;
                mediaCodecE = null;
                r6 = z3;
                r11 = r9;
                if (r6 != 0) {
                    r6.stop();
                    r6.release();
                    if (mediaCodecE != null) {
                        mediaCodecE.stop();
                        mediaCodecE.release();
                    }
                    if (r11 != 0) {
                        r11.release();
                    }
                    if (mediaMuxer != null) {
                        mediaMuxer.stop();
                        mediaMuxer.release();
                    }
                    if (zzaVar != null) {
                        zzaVar.release();
                    }
                } else {
                    if (mediaCodecE != null) {
                        mediaCodecE.stop();
                        mediaCodecE.release();
                    }
                    if (r11 != 0) {
                        r11.release();
                    }
                    if (mediaMuxer != null) {
                        mediaMuxer.stop();
                        mediaMuxer.release();
                    }
                    if (zzaVar != null) {
                        zzaVar.release();
                    }
                }
                aVar = this.g;
                if (aVar != null) {
                    throw th;
                }
                aVar.onVideoProcessFinish();
                throw th;
            }
        } catch (Exception unused6) {
            zzaVar = null;
            z2 = false;
            r8 = 0;
        } catch (Throwable th7) {
            th = th7;
            zzaVar = null;
            z = false;
            r7 = 0;
        }
    }
}

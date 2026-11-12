package com.xiaomi.ai.android.impl;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    private int a;
    private String b;
    private AudioTrack c;
    private MediaCodec d;
    private SpeechSynthesizerCapability e;
    private final Object f;
    private final Object g;
    private Future<?> h;
    private Future<?> i;
    private com.xiaomi.ai.android.core.d j;
    private c k;
    private d l;
    private MediaPlayer m;
    private b n;
    private HandlerThread o;
    private Handler p;
    private boolean q;
    private volatile boolean r;

    /* JADX INFO: renamed from: com.xiaomi.ai.android.impl.a$a, reason: collision with other inner class name */
    public class C0768a {
        private HashMap<String, Integer> b = new HashMap<>();
        private HashMap<String, Integer> c = new HashMap<>();
        private String d;
        private String e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;

        public C0768a() {
            this.b.put(a("Layer III", "MPEG2", new char[]{'0', '0', '1', '1'}, 0, 4), 128000);
            this.b.put(a("Layer III", "MPEG2", new char[]{'0', '1', '0', '0'}, 0, 4), 16000);
            this.b.put(a("Layer III", "MPEG2", new char[]{'0', '0', '1', '0'}, 0, 4), 32000);
            this.c.put(a("Layer III", "MPEG1", null, 0, 0), 1152);
            HashMap<String, Integer> map = this.c;
            String strA = a("Layer III", "MPEG2", null, 0, 0);
            Integer numValueOf = Integer.valueOf(StageEnum.APP_RESULT_FOTA_NV_SUCCESS);
            map.put(strA, numValueOf);
            this.c.put(a("Layer III", "MPEG2.5", null, 0, 0), numValueOf);
        }

        private String a(byte b) {
            String binaryString = Integer.toBinaryString(b | 256);
            int length = binaryString.length();
            return binaryString.substring(length - 8, length);
        }

        private String a(String str, String str2, char[] cArr, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            for (int i3 = i; i3 < i + i2; i3++) {
                sb.append(cArr[i3]);
            }
            return sb.toString();
        }

        private boolean a(char[] cArr) {
            for (int i = 21; i < 31; i++) {
                if (cArr[i] != '1') {
                    return false;
                }
            }
            return true;
        }

        private int b(char[] cArr) {
            if (cArr[7] == '0' && cArr[6] == '0') {
                return 2;
            }
            return (cArr[7] == '1' && cArr[6] == '1') ? 1 : 0;
        }

        private char[] b(byte[] bArr) {
            char[] cArrC = c(bArr);
            char[] cArr = new char[cArrC.length];
            for (int i = 0; i < cArrC.length; i++) {
                cArr[(cArrC.length - i) - 1] = cArrC[i];
            }
            return cArr;
        }

        private int c(char[] cArr) {
            Integer num = this.c.get(a(g(cArr), h(cArr), null, 0, 0));
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        private char[] c(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(String.format("%s", a(b)));
            }
            return sb.toString().toCharArray();
        }

        private int d(char[] cArr) {
            Integer num = this.b.get(a(g(cArr), h(cArr), cArr, 12, 4));
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        private int e(char[] cArr) {
            if (g(cArr) == "Layer I") {
                return ((int) Math.floor(((c(cArr) / 8.0f) * d(cArr)) / f(cArr))) + (cArr[9] == '1' ? 4 : 0);
            }
            return ((int) Math.floor(((c(cArr) / 8.0f) * d(cArr)) / f(cArr))) + (cArr[9] == '1' ? 1 : 0);
        }

        private int f(char[] cArr) {
            if (cArr[20] == '0' && cArr[19] == '0') {
                if (cArr[11] == '0' && cArr[10] == '0') {
                    return 11025;
                }
                if (cArr[11] == '0' && cArr[10] == '1') {
                    return 12000;
                }
                return (cArr[11] == '1' && cArr[10] == '0') ? 8000 : -1;
            }
            if (cArr[20] == '1' && cArr[19] == '0') {
                if (cArr[11] == '0' && cArr[10] == '0') {
                    return 22050;
                }
                if (cArr[11] == '0' && cArr[10] == '1') {
                    return 24000;
                }
                return (cArr[11] == '1' && cArr[10] == '0') ? 16000 : -1;
            }
            if (cArr[20] == '1' && cArr[19] == '1') {
                if (cArr[11] == '0' && cArr[10] == '0') {
                    return 44100;
                }
                if (cArr[11] == '0' && cArr[10] == '1') {
                    return OpusUtil.SAMPLE_RATE;
                }
                if (cArr[11] == '1' && cArr[10] == '0') {
                    return 32000;
                }
            }
            return -1;
        }

        private String g(char[] cArr) {
            if (cArr[18] == '0' && cArr[17] == '1') {
                return "Layer III";
            }
            if (cArr[18] == '1' && cArr[17] == '0') {
                return "Layer II";
            }
            return (cArr[18] == '1' && cArr[17] == '1') ? "Layer I" : "Layer unkown";
        }

        private String h(char[] cArr) {
            if (cArr[20] == '0' && cArr[19] == '0') {
                return "MPEG2.5";
            }
            if (cArr[20] == '1' && cArr[19] == '0') {
                return "MPEG2";
            }
            return (cArr[20] == '1' && cArr[19] == '1') ? "MPEG1" : "MPEG_UNKNOW";
        }

        public int a() {
            return this.i;
        }

        public boolean a(byte[] bArr) {
            char[] cArrB = b(bArr);
            if (!a(cArrB)) {
                return false;
            }
            this.d = g(cArrB);
            this.e = h(cArrB);
            this.g = d(cArrB);
            this.f = f(cArrB);
            this.h = c(cArrB);
            this.i = e(cArrB);
            int iB = b(cArrB);
            this.j = iB;
            return this.d != "Layer unkown" && this.e != "MPEG_UNKNOW" && this.i > 0 && this.f > 0 && this.g > 0 && iB > 0 && this.h > 0;
        }
    }

    public enum b {
        PLAYER_MODE_STREAM,
        PLAYER_MODE_URL
    }

    public class c implements Runnable {
        private PipedOutputStream c;
        private d g;
        private volatile boolean d = true;
        private boolean e = false;
        private boolean f = false;
        private PipedInputStream b = new PipedInputStream(1024);

        public c(d dVar) {
            this.g = dVar;
            try {
                this.c = new PipedOutputStream(this.b);
            } catch (IOException e) {
                Logger.d("MediaPlayerImpl", Log.getStackTraceString(e));
            }
        }

        private int a(byte[] bArr, int i, int i2) {
            int i3 = 0;
            while (this.d && i2 > 0) {
                try {
                    int i4 = this.b.read(bArr, i, i2);
                    if (!Thread.interrupted() && this.d) {
                        if (i4 <= 0) {
                            Logger.b("MediaPlayerImpl", "readStream: read size = " + i4);
                            return i3;
                        }
                        i3 += i4;
                        i += i4;
                        i2 -= i4;
                    }
                    Logger.b("MediaPlayerImpl", "readStream: interrupted or loop=" + this.d);
                    return -1;
                } catch (IOException e) {
                    Logger.d("MediaPlayerImpl", Log.getStackTraceString(e));
                }
            }
            return i3;
        }

        private void b() {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = a.this.d.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = Build.VERSION.SDK_INT >= 21 ? a.this.d.getOutputBuffer(iDequeueOutputBuffer) : a.this.d.getOutputBuffers()[iDequeueOutputBuffer];
                if (outputBuffer == null) {
                    Logger.d("MediaPlayerImpl", "pullDecodedData: byteBuffer is null");
                    return;
                }
                int i = bufferInfo.size;
                if (i > 0) {
                    byte[] bArr = new byte[i];
                    outputBuffer.get(bArr, 0, i);
                    this.g.a(bArr);
                    Logger.a("MediaPlayerImpl", "pullDecodedData: length=" + bufferInfo.size);
                }
                outputBuffer.clear();
                a.this.d.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if (bufferInfo.flags == 4) {
                    this.g.a(new byte[0]);
                    this.d = false;
                    Logger.b("MediaPlayerImpl", "pullDecodedData: BUFFER_FLAG_END_OF_STREAM");
                }
            }
        }

        private void b(byte[] bArr, boolean z) {
            int length;
            StringBuilder sb = new StringBuilder();
            sb.append("putEncodeData: length=");
            sb.append(bArr != null ? bArr.length : 0);
            sb.append(", eof=");
            sb.append(z);
            Logger.a("MediaPlayerImpl", sb.toString());
            while (this.d) {
                int iDequeueInputBuffer = a.this.d.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = Build.VERSION.SDK_INT >= 21 ? a.this.d.getInputBuffer(iDequeueInputBuffer) : a.this.d.getInputBuffers()[iDequeueInputBuffer];
                    if (inputBuffer != null) {
                        inputBuffer.clear();
                        if (bArr != null) {
                            inputBuffer.put(bArr);
                            length = bArr.length;
                        } else {
                            length = 0;
                        }
                        a.this.d.queueInputBuffer(iDequeueInputBuffer, 0, length, 0L, z ? 4 : 0);
                        return;
                    }
                    Logger.d("MediaPlayerImpl", "putEncodeData: byteBuffer is null, index=" + iDequeueInputBuffer);
                }
            }
        }

        public int a(byte[] bArr, boolean z) {
            int length;
            synchronized (this) {
                PipedOutputStream pipedOutputStream = this.c;
                if (pipedOutputStream != null) {
                    if (bArr != null) {
                        try {
                            pipedOutputStream.write(bArr);
                        } catch (Exception e) {
                            Logger.b("MediaPlayerImpl", "StreamDecodeTask write: " + e.getMessage());
                            return -1;
                        }
                    }
                    PipedOutputStream pipedOutputStream2 = this.c;
                    if (pipedOutputStream2 != null && z) {
                        pipedOutputStream2.close();
                        this.c = null;
                    }
                }
                length = bArr != null ? bArr.length : 0;
            }
            return length;
        }

        public void a() {
            Logger.b("MediaPlayerImpl", "StreamDecodeTask exit");
            this.d = false;
            a(null, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    Logger.b("MediaPlayerImpl", "StreamDecodeTask begin");
                    byte[] bArr = new byte[4];
                    C0768a c0768a = a.this.new C0768a();
                    while (this.d) {
                        if (!this.f) {
                            if (a(bArr, 0, 4) == 4) {
                                if (c0768a.a(bArr)) {
                                    int iA = c0768a.a();
                                    byte[] bArr2 = new byte[iA];
                                    System.arraycopy(bArr, 0, bArr2, 0, 4);
                                    int i = iA - 4;
                                    if (a(bArr2, 4, i) == i) {
                                        b(bArr2, false);
                                    }
                                } else {
                                    Logger.d("MediaPlayerImpl", "StreamDecodeTask: invalid mp3 header");
                                }
                            }
                            this.f = true;
                        } else if (!this.e) {
                            b(null, true);
                            Logger.b("MediaPlayerImpl", "StreamDecodeTask: put end flag");
                            this.e = true;
                        }
                        b();
                    }
                    try {
                        if (this.c != null) {
                            Logger.b("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                            this.c.close();
                            this.c = null;
                        }
                        if (this.b != null) {
                            Logger.b("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                            this.b.close();
                            this.b = null;
                        }
                    } catch (Exception e) {
                        Logger.d("MediaPlayerImpl", Log.getStackTraceString(e));
                    }
                    synchronized (a.this.f) {
                        try {
                            if (a.this.d != null) {
                                a.this.d.flush();
                            }
                        } catch (IllegalStateException e2) {
                            Logger.d("MediaPlayerImpl", Log.getStackTraceString(e2));
                            a.this.r = false;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        if (this.c != null) {
                            Logger.b("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                            this.c.close();
                            this.c = null;
                        }
                        if (this.b != null) {
                            Logger.b("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                            this.b.close();
                            this.b = null;
                        }
                    } catch (Exception e3) {
                        Logger.d("MediaPlayerImpl", Log.getStackTraceString(e3));
                    }
                    synchronized (a.this.f) {
                        try {
                            if (a.this.d != null) {
                                a.this.d.flush();
                            }
                        } catch (IllegalStateException e4) {
                            Logger.d("MediaPlayerImpl", Log.getStackTraceString(e4));
                            a.this.r = false;
                        }
                        throw th;
                    }
                }
            } catch (IllegalStateException e5) {
                Logger.d("MediaPlayerImpl", Log.getStackTraceString(e5));
                a.this.r = false;
                try {
                    if (this.c != null) {
                        Logger.b("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                        this.c.close();
                        this.c = null;
                    }
                    if (this.b != null) {
                        Logger.b("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                        this.b.close();
                        this.b = null;
                    }
                } catch (Exception e6) {
                    Logger.d("MediaPlayerImpl", Log.getStackTraceString(e6));
                }
                synchronized (a.this.f) {
                    try {
                        if (a.this.d != null) {
                            a.this.d.flush();
                        }
                    } catch (IllegalStateException e7) {
                        Logger.d("MediaPlayerImpl", Log.getStackTraceString(e7));
                        a.this.r = false;
                    }
                }
            } catch (Exception e8) {
                Logger.d("MediaPlayerImpl", Log.getStackTraceString(e8));
                try {
                    if (this.c != null) {
                        Logger.b("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                        this.c.close();
                        this.c = null;
                    }
                    if (this.b != null) {
                        Logger.b("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                        this.b.close();
                        this.b = null;
                    }
                } catch (Exception e9) {
                    Logger.d("MediaPlayerImpl", Log.getStackTraceString(e9));
                }
                synchronized (a.this.f) {
                    try {
                        if (a.this.d != null) {
                            a.this.d.flush();
                        }
                    } catch (IllegalStateException e10) {
                        Logger.d("MediaPlayerImpl", Log.getStackTraceString(e10));
                        a.this.r = false;
                    }
                }
            }
            Logger.b("MediaPlayerImpl", "StreamDecodeTask end");
        }
    }

    public class d implements Runnable {
        private volatile boolean c = true;
        public BlockingQueue<byte[]> a = new LinkedBlockingQueue();

        public d() {
            if (a.this.q) {
                if (a.this.c == null || (a.this.c != null && a.this.c.getState() == 0)) {
                    a.this.g();
                    return;
                }
                if (a.this.c != null) {
                    try {
                        a.this.c.play();
                    } catch (IllegalStateException e) {
                        a.this.r = false;
                        Logger.d("MediaPlayerImpl", Logger.throwableToString(e));
                    }
                }
            }
        }

        public int a(byte[] bArr) {
            try {
                this.a.put(bArr);
                return bArr.length;
            } catch (InterruptedException e) {
                Logger.d("MediaPlayerImpl", Log.getStackTraceString(e));
                return -1;
            }
        }

        public void a() {
            Logger.b("MediaPlayerImpl", "StreamPlayerTask exit");
            this.c = false;
            this.a.clear();
            this.a.add(new byte[0]);
        }

        /* JADX WARN: Code duplicated, block: B:69:0x0169  */
        @Override // java.lang.Runnable
        public void run() {
            Logger.b("MediaPlayerImpl", "StreamPlayerTask begin");
            try {
                try {
                    if (a.this.e != null) {
                        if (a.this.j.b().getBoolean(AivsConfig.Tts.ENABLE_PLAY_DIALOG_ID)) {
                            a.this.e.onPlayStart(a.this.a, a.this.b);
                        } else {
                            a.this.e.onPlayStart(a.this.a);
                        }
                    }
                    while (this.c) {
                        byte[] bArrTake = this.a.take();
                        Logger.a("MediaPlayerImpl", "StreamPlayerTask: data length=" + bArrTake.length);
                        if (!this.c || bArrTake.length == 0) {
                            break;
                            break;
                        } else if (a.this.q) {
                            a.this.c.write(bArrTake, 0, bArrTake.length);
                        } else {
                            a.this.e.onPcmData(bArrTake);
                        }
                    }
                    if (a.this.q) {
                        synchronized (a.this.g) {
                            if (a.this.c != null && a.this.c.getState() != 0) {
                                try {
                                    a.this.c.pause();
                                    a.this.c.flush();
                                } catch (IllegalStateException e) {
                                    Logger.d("MediaPlayerImpl", Logger.throwableToString(e));
                                    a.this.r = false;
                                }
                            }
                        }
                    }
                    if (a.this.e != null) {
                        if (a.this.j.b().getBoolean(AivsConfig.Tts.ENABLE_PLAY_FINISH_DIALOG_ID)) {
                            a.this.e.onPlayFinish(a.this.b);
                        } else {
                            a.this.e.onPlayFinish();
                        }
                    }
                } catch (Exception e2) {
                    Logger.d("MediaPlayerImpl", Log.getStackTraceString(e2));
                    if (a.this.q) {
                        synchronized (a.this.g) {
                            if (a.this.c != null && a.this.c.getState() != 0) {
                                try {
                                    a.this.c.pause();
                                    a.this.c.flush();
                                } catch (IllegalStateException e3) {
                                    Logger.d("MediaPlayerImpl", Logger.throwableToString(e3));
                                    a.this.r = false;
                                }
                            }
                        }
                    }
                    if (a.this.e != null) {
                        if (a.this.j.b().getBoolean(AivsConfig.Tts.ENABLE_PLAY_FINISH_DIALOG_ID)) {
                            a.this.e.onPlayFinish(a.this.b);
                        }
                    }
                }
                Logger.b("MediaPlayerImpl", "StreamPlayerTask end");
            } catch (Throwable th) {
                if (a.this.q) {
                    synchronized (a.this.g) {
                        if (a.this.c != null && a.this.c.getState() != 0) {
                            try {
                                a.this.c.pause();
                                a.this.c.flush();
                            } catch (IllegalStateException e4) {
                                Logger.d("MediaPlayerImpl", Logger.throwableToString(e4));
                                a.this.r = false;
                            }
                        }
                    }
                }
                if (a.this.e != null) {
                    if (a.this.j.b().getBoolean(AivsConfig.Tts.ENABLE_PLAY_FINISH_DIALOG_ID)) {
                        a.this.e.onPlayFinish(a.this.b);
                    } else {
                        a.this.e.onPlayFinish();
                    }
                }
                Logger.b("MediaPlayerImpl", "StreamPlayerTask end");
                throw th;
            }
        }
    }

    public a(com.xiaomi.ai.android.core.d dVar) {
        this.a = 16000;
        this.f = new Object();
        this.g = new Object();
        this.n = b.PLAYER_MODE_STREAM;
        this.j = dVar;
        h();
    }

    public a(com.xiaomi.ai.android.core.d dVar, int i, String str) {
        this.a = 16000;
        this.f = new Object();
        this.g = new Object();
        this.n = b.PLAYER_MODE_STREAM;
        this.j = dVar;
        this.a = i;
        this.b = str;
        h();
    }

    private boolean h() {
        Logger.b("MediaPlayerImpl", "init: sampleRate = " + this.a);
        i();
        this.q = this.j.b().getBoolean(AivsConfig.Tts.ENABLE_INTERNAL_PLAYER, true);
        this.r = g();
        this.r = f();
        HandlerThread handlerThread = new HandlerThread("MediaPlayerImplThread");
        this.o = handlerThread;
        handlerThread.start();
        this.p = new Handler(this.o.getLooper(), new Handler.Callback() { // from class: com.xiaomi.ai.android.impl.a.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                c cVar;
                if (message.what == 1) {
                    synchronized (a.this) {
                        cVar = a.this.k != null ? a.this.k : null;
                    }
                    if (cVar != null) {
                        Bundle data = message.getData();
                        cVar.a(data.getByteArray("data"), data.getBoolean("eof"));
                    }
                }
                return true;
            }
        });
        return this.r;
    }

    private void i() {
        Logger.b("MediaPlayerImpl", "release start");
        this.r = false;
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.p = null;
        }
        HandlerThread handlerThread = this.o;
        if (handlerThread != null) {
            handlerThread.quit();
            Logger.b("MediaPlayerImpl", "release HandlerThread");
            this.o = null;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a();
            this.k = null;
            Logger.b("MediaPlayerImpl", "release StreamDecodeTask");
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.a();
            this.l = null;
            Logger.a("MediaPlayerImpl", "release StreamPlayerTask");
        }
        if (this.q) {
            synchronized (this.g) {
                AudioTrack audioTrack = this.c;
                if (audioTrack != null) {
                    audioTrack.release();
                    this.c = null;
                    Logger.b("MediaPlayerImpl", "release AudioTrack");
                }
            }
        }
        try {
            synchronized (this.f) {
                MediaCodec mediaCodec = this.d;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.d.release();
                    this.d = null;
                    Logger.b("MediaPlayerImpl", "release MediaCodec");
                }
            }
        } catch (Exception e) {
            Logger.d("MediaPlayerImpl", Logger.throwableToString(e));
        }
        j();
        Logger.b("MediaPlayerImpl", "release end");
    }

    private void j() {
        if (this.m != null) {
            Logger.b("MediaPlayerImpl", "releaseMediaPlayer");
            this.m.stop();
            this.m.release();
            this.m = null;
        }
    }

    private String k() {
        try {
            if (Build.VERSION.SDK_INT < 21) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        if (str.equals(MimeTypes.AUDIO_MPEG)) {
                            Logger.b("MediaPlayerImpl", "getCodecName: " + codecInfoAt.getName());
                            return codecInfoAt.getName();
                        }
                    }
                }
                return null;
            }
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                    if (str2.equals(MimeTypes.AUDIO_MPEG)) {
                        Logger.b("MediaPlayerImpl", "getCodecName: " + mediaCodecInfo.getName());
                        return mediaCodecInfo.getName();
                    }
                }
            }
            return null;
        } catch (Exception e) {
            Logger.d("MediaPlayerImpl", Logger.throwableToString(e));
            return null;
        }
    }

    public int a() {
        return this.a;
    }

    public int a(byte[] bArr, boolean z) {
        synchronized (this) {
            if (this.p == null) {
                return -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("write: length=");
            sb.append(bArr != null ? bArr.length : 0);
            sb.append(", eof=");
            sb.append(z);
            Logger.b("MediaPlayerImpl", sb.toString());
            Bundle bundle = new Bundle();
            bundle.putByteArray("data", bArr);
            bundle.putBoolean("eof", z);
            Message messageObtainMessage = this.p.obtainMessage(1);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
            return bArr != null ? bArr.length : 0;
        }
    }

    public void a(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public boolean a(String str) {
        synchronized (this) {
            Logger.b("MediaPlayerImpl", "prepare url=" + str);
            j();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.m = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            try {
                this.m.setDataSource(str);
                this.m.prepare();
                this.n = b.PLAYER_MODE_URL;
            } catch (Exception e) {
                Logger.d("MediaPlayerImpl", Log.getStackTraceString(e));
                j();
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        synchronized (this) {
            try {
                Logger.b("MediaPlayerImpl", "prepare");
                SpeechSynthesizerCapability speechSynthesizerCapability = (SpeechSynthesizerCapability) this.j.a(SpeechSynthesizerCapability.class);
                this.e = speechSynthesizerCapability;
                int i = 0;
                if (!this.q && speechSynthesizerCapability == null) {
                    Logger.d("MediaPlayerImpl", "init: SpeechSynthesizerCapability not registered");
                    return false;
                }
                if (!this.r) {
                    h();
                }
                Handler handler = this.p;
                if (handler != null) {
                    handler.removeMessages(1);
                }
                d dVar = this.l;
                if (dVar != null) {
                    dVar.a();
                    this.l = null;
                }
                c cVar = this.k;
                if (cVar != null) {
                    cVar.a();
                    this.k = null;
                }
                if (this.h != null && this.i != null) {
                    while (true) {
                        if ((this.h.isDone() && this.i.isDone()) || i > 100) {
                            break;
                        }
                        try {
                            Thread.sleep(10L);
                            i++;
                        } catch (InterruptedException unused) {
                            Logger.b("MediaPlayerImpl", "prepare: wait InterruptedException");
                        }
                    }
                }
                d dVar2 = new d();
                this.l = dVar2;
                this.k = new c(dVar2);
                ExecutorService executorService = com.xiaomi.ai.b.c.a;
                this.h = executorService.submit(this.l);
                this.i = executorService.submit(this.k);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        Logger.b("MediaPlayerImpl", "interrupt");
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.a();
            this.l = null;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a();
            this.k = null;
        }
        j();
    }

    public boolean d() {
        synchronized (this) {
            Logger.b("MediaPlayerImpl", "play");
            if (this.n == b.PLAYER_MODE_URL) {
                MediaPlayer mediaPlayer = this.m;
                if (mediaPlayer == null) {
                    Logger.d("MediaPlayerImpl", "play: not prepared yet");
                    return false;
                }
                mediaPlayer.start();
            }
            return true;
        }
    }

    public boolean e() {
        synchronized (this) {
            Logger.b("MediaPlayerImpl", Command.STOP);
            i();
        }
        return true;
    }

    public boolean f() {
        String stackTraceString;
        String strK = k();
        if (strK == null) {
            stackTraceString = "init: no supported codec for MIME=audio/mpeg";
        } else {
            try {
                this.d = MediaCodec.createByCodecName(strK);
            } catch (Exception e) {
                Logger.d("MediaPlayerImpl", Log.getStackTraceString(e));
            }
            if (this.d == null) {
                try {
                    this.d = MediaCodec.createDecoderByType(MimeTypes.AUDIO_MPEG);
                } catch (Exception e2) {
                    stackTraceString = Log.getStackTraceString(e2);
                }
            }
            try {
                this.d.configure(MediaFormat.createAudioFormat(MimeTypes.AUDIO_MPEG, this.a, 1), (Surface) null, (MediaCrypto) null, 0);
                this.d.start();
                return true;
            } catch (Exception e3) {
                stackTraceString = "initMediaCodec:init failed:" + e3.getMessage();
            }
        }
        Logger.d("MediaPlayerImpl", stackTraceString);
        return false;
    }

    public boolean g() {
        if (!this.q) {
            return true;
        }
        AudioTrack audioTrack = new AudioTrack(3, this.a, 4, 2, AudioTrack.getMinBufferSize(this.a, 4, 2), 1);
        this.c = audioTrack;
        int state = audioTrack.getState();
        if (state != 0) {
            this.c.play();
            return true;
        }
        Logger.d("MediaPlayerImpl", "init: invalid AudioTrack state=" + state);
        this.c.release();
        this.c = null;
        return false;
    }
}

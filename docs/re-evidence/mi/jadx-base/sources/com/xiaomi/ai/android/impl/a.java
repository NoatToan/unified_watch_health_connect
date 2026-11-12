package com.xiaomi.ai.android.impl;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.api.Common;
import com.xiaomi.digitalkey.wearable.DigitalKeyService;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.ues;
import defpackage.wpe;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10951b;
    private Common.TTSCodec c;
    private AudioTrack d;
    private MediaCodec e;
    private SpeechSynthesizerCapability f;
    private final Object g;
    private final Object h;
    private Future<?> i;
    private Future<?> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.xiaomi.ai.android.core.e f10952k;
    private d l;
    private e m;
    private MediaPlayer n;
    private c o;
    private HandlerThread p;
    private Handler q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10953r;
    private volatile boolean s;

    /* JADX INFO: renamed from: com.xiaomi.ai.android.impl.a$a, reason: collision with other inner class name */
    public class C0346a implements Handler.Callback {
        public C0346a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            d dVar;
            int i = message.what;
            if (i == 1) {
                synchronized (a.this) {
                    try {
                        dVar = a.this.l != null ? a.this.l : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (dVar != null) {
                    Bundle data = message.getData();
                    dVar.d(data.getByteArray("data"), data.getBoolean("eof"));
                }
            } else if (i == 2) {
                a.this.e();
            } else if (i == 3) {
                a.this.j();
            }
            return true;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, Integer> f10955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, Integer> f10956b;
        public String c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b() {
            HashMap<String, Integer> map = new HashMap<>();
            this.f10955a = map;
            HashMap<String, Integer> map2 = new HashMap<>();
            this.f10956b = map2;
            map.put(c("Layer III", "MPEG2", new char[]{'0', '0', '1', '1'}, 0, 4), 128000);
            map.put(c("Layer III", "MPEG2", new char[]{'0', '1', '0', '0'}, 0, 4), 16000);
            map.put(c("Layer III", "MPEG2", new char[]{'0', '0', '1', '0'}, 0, 4), 32000);
            map.put(c("Layer III", "MPEG2", new char[]{'0', '1', '1', '0'}, 0, 4), Integer.valueOf(MIOTAudioModuleCore.SAMPLING_RATE));
            map2.put(c("Layer III", "MPEG1", null, 0, 0), 1152);
            map2.put(c("Layer III", "MPEG2", null, 0, 0), 576);
            map2.put(c("Layer III", "MPEG2.5", null, 0, 0), 576);
        }

        public int a() {
            return this.h;
        }

        public final String b(byte b2) {
            String binaryString = Integer.toBinaryString(b2 | 256);
            int length = binaryString.length();
            return binaryString.substring(length - 8, length);
        }

        public final String c(String str, String str2, char[] cArr, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            if (cArr != null) {
                for (int i3 = i; i3 < i + i2; i3++) {
                    sb.append(cArr[i3]);
                }
            }
            return sb.toString();
        }

        public final boolean d(char[] cArr) {
            for (int i = 21; i < 31; i++) {
                if (cArr[i] != '1') {
                    return false;
                }
            }
            return true;
        }

        public final char[] e(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArr) {
                sb.append(String.format("%s", b(b2)));
            }
            return sb.toString().toCharArray();
        }

        public final int f(char[] cArr) {
            Integer num = this.f10955a.get(c(k(cArr), l(cArr), cArr, 12, 4));
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public boolean g(byte[] bArr) {
            char[] cArrI = i(bArr);
            if (!d(cArrI)) {
                return false;
            }
            this.c = k(cArrI);
            this.d = l(cArrI);
            this.f = f(cArrI);
            this.e = m(cArrI);
            this.g = n(cArrI);
            this.h = j(cArrI);
            int iH = h(cArrI);
            this.i = iH;
            return this.c != "Layer unkown" && this.d != "MPEG_UNKNOW" && this.h > 0 && this.e > 0 && this.f > 0 && iH > 0 && this.g > 0;
        }

        public final int h(char[] cArr) {
            char c = cArr[7];
            if (c == '0' && cArr[6] == '0') {
                return 2;
            }
            return (c == '1' && cArr[6] == '1') ? 1 : 0;
        }

        public final char[] i(byte[] bArr) {
            char[] cArrE = e(bArr);
            char[] cArr = new char[cArrE.length];
            for (int i = 0; i < cArrE.length; i++) {
                cArr[(cArrE.length - i) - 1] = cArrE[i];
            }
            return cArr;
        }

        public final int j(char[] cArr) {
            if (k(cArr) == "Layer I") {
                return ((int) Math.floor(((n(cArr) / 8.0f) * f(cArr)) / m(cArr))) + (cArr[9] == '1' ? 4 : 0);
            }
            return ((int) Math.floor(((n(cArr) / 8.0f) * f(cArr)) / m(cArr))) + (cArr[9] == '1' ? 1 : 0);
        }

        public final String k(char[] cArr) {
            char c = cArr[18];
            if (c == '0' && cArr[17] == '1') {
                return "Layer III";
            }
            if (c == '1' && cArr[17] == '0') {
                return "Layer II";
            }
            return (c == '1' && cArr[17] == '1') ? "Layer I" : "Layer unkown";
        }

        public final String l(char[] cArr) {
            char c = cArr[20];
            if (c == '0' && cArr[19] == '0') {
                return "MPEG2.5";
            }
            if (c == '1' && cArr[19] == '0') {
                return "MPEG2";
            }
            return (c == '1' && cArr[19] == '1') ? "MPEG1" : "MPEG_UNKNOW";
        }

        public final int m(char[] cArr) {
            char c = cArr[20];
            if (c == '0' && cArr[19] == '0') {
                char c2 = cArr[11];
                if (c2 == '0' && cArr[10] == '0') {
                    return 11025;
                }
                if (c2 == '0' && cArr[10] == '1') {
                    return 12000;
                }
                return (c2 == '1' && cArr[10] == '0') ? 8000 : -1;
            }
            if (c == '1' && cArr[19] == '0') {
                char c3 = cArr[11];
                if (c3 == '0' && cArr[10] == '0') {
                    return DigitalKeyService.DIGITAL_KEY_INSUFFICIENT_SE_SPACE;
                }
                if (c3 == '0' && cArr[10] == '1') {
                    return 24000;
                }
                return (c3 == '1' && cArr[10] == '0') ? 16000 : -1;
            }
            if (c == '1' && cArr[19] == '1') {
                char c4 = cArr[11];
                if (c4 == '0' && cArr[10] == '0') {
                    return 44100;
                }
                if (c4 == '0' && cArr[10] == '1') {
                    return MIOTAudioModuleCore.SAMPLING_RATE;
                }
                if (c4 == '1' && cArr[10] == '0') {
                    return 32000;
                }
            }
            return -1;
        }

        public final int n(char[] cArr) {
            Integer num = this.f10956b.get(c(k(cArr), l(cArr), null, 0, 0));
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    public enum c {
        PLAYER_MODE_STREAM,
        PLAYER_MODE_URL
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PipedOutputStream f10960b;
        public e f;
        public volatile boolean c = true;
        public boolean d = false;
        public boolean e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PipedInputStream f10959a = new PipedInputStream(1024);

        public d(e eVar) {
            this.f = eVar;
            try {
                this.f10960b = new PipedOutputStream(this.f10959a);
            } catch (IOException e) {
                wpe.e("MediaPlayerImpl", Log.getStackTraceString(e));
            }
        }

        public final int a(byte[] bArr, int i, int i2) {
            int i3 = 0;
            while (this.c && i2 > 0) {
                try {
                    int i4 = this.f10959a.read(bArr, i, i2);
                    if (!Thread.interrupted() && this.c) {
                        if (i4 <= 0) {
                            wpe.h("MediaPlayerImpl", "readStream: read size = " + i4);
                            return i3;
                        }
                        i3 += i4;
                        i += i4;
                        i2 -= i4;
                    }
                    wpe.h("MediaPlayerImpl", "readStream: interrupted or loop=" + this.c);
                    return -1;
                } catch (IOException e) {
                    wpe.e("MediaPlayerImpl", Log.getStackTraceString(e));
                }
            }
            return i3;
        }

        public void b() {
            wpe.h("MediaPlayerImpl", "StreamDecodeTask exit");
            this.c = false;
            d(null, true);
        }

        public final void c(byte[] bArr, boolean z) {
            int length;
            StringBuilder sb = new StringBuilder();
            sb.append("putEncodeData: length=");
            sb.append(bArr != null ? bArr.length : 0);
            sb.append(", eof=");
            sb.append(z);
            wpe.b("MediaPlayerImpl", sb.toString());
            while (this.c) {
                int iDequeueInputBuffer = a.this.e.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = a.this.e.getInputBuffer(iDequeueInputBuffer);
                    if (inputBuffer != null) {
                        inputBuffer.clear();
                        if (bArr != null) {
                            inputBuffer.put(bArr);
                            length = bArr.length;
                        } else {
                            length = 0;
                        }
                        a.this.e.queueInputBuffer(iDequeueInputBuffer, 0, length, 0L, z ? 4 : 0);
                        return;
                    }
                    wpe.e("MediaPlayerImpl", "putEncodeData: byteBuffer is null, index=" + iDequeueInputBuffer);
                }
            }
        }

        public int d(byte[] bArr, boolean z) {
            int length;
            synchronized (this) {
                try {
                    PipedOutputStream pipedOutputStream = this.f10960b;
                    if (pipedOutputStream != null) {
                        if (bArr != null) {
                            try {
                                pipedOutputStream.write(bArr);
                            } catch (Exception e) {
                                wpe.h("MediaPlayerImpl", "StreamDecodeTask write: " + e.getMessage());
                                return -1;
                            }
                        }
                        PipedOutputStream pipedOutputStream2 = this.f10960b;
                        if (pipedOutputStream2 != null && z) {
                            pipedOutputStream2.close();
                            this.f10960b = null;
                        }
                    }
                    length = bArr != null ? bArr.length : 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return length;
        }

        public final void e() {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = a.this.e.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = a.this.e.getOutputBuffer(iDequeueOutputBuffer);
                if (outputBuffer == null) {
                    wpe.e("MediaPlayerImpl", "pullDecodedData: byteBuffer is null");
                    return;
                }
                int i = bufferInfo.size;
                if (i > 0) {
                    byte[] bArr = new byte[i];
                    outputBuffer.get(bArr, 0, i);
                    this.f.a(bArr);
                    wpe.b("MediaPlayerImpl", "pullDecodedData: length=" + bufferInfo.size);
                }
                outputBuffer.clear();
                a.this.e.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if (bufferInfo.flags == 4) {
                    this.f.a(new byte[0]);
                    this.c = false;
                    wpe.h("MediaPlayerImpl", "pullDecodedData: BUFFER_FLAG_END_OF_STREAM");
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    wpe.h("MediaPlayerImpl", "StreamDecodeTask begin");
                    byte[] bArr = new byte[4];
                    b bVar = new b();
                    while (this.c) {
                        if (!this.e) {
                            if (a(bArr, 0, 4) == 4) {
                                if (bVar.g(bArr)) {
                                    int iA = bVar.a();
                                    byte[] bArr2 = new byte[iA];
                                    System.arraycopy(bArr, 0, bArr2, 0, 4);
                                    int i = iA - 4;
                                    if (a(bArr2, 4, i) == i) {
                                        c(bArr2, false);
                                    }
                                } else {
                                    wpe.e("MediaPlayerImpl", "StreamDecodeTask: invalid mp3 header");
                                }
                                this.e = true;
                            }
                            this.e = true;
                        } else if (!this.d) {
                            c(null, true);
                            wpe.h("MediaPlayerImpl", "StreamDecodeTask: put end flag");
                            this.d = true;
                        }
                        e();
                    }
                    try {
                        if (this.f10960b != null) {
                            wpe.h("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                            this.f10960b.close();
                            this.f10960b = null;
                        }
                        if (this.f10959a != null) {
                            wpe.h("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                            this.f10959a.close();
                            this.f10959a = null;
                        }
                    } catch (Exception e) {
                        wpe.e("MediaPlayerImpl", Log.getStackTraceString(e));
                    }
                    synchronized (a.this.g) {
                        try {
                            if (a.this.e != null) {
                                a.this.e.flush();
                            }
                        } catch (IllegalStateException e2) {
                            wpe.e("MediaPlayerImpl", Log.getStackTraceString(e2));
                            a.this.s = false;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        if (this.f10960b != null) {
                            wpe.h("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                            this.f10960b.close();
                            this.f10960b = null;
                        }
                        if (this.f10959a != null) {
                            wpe.h("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                            this.f10959a.close();
                            this.f10959a = null;
                        }
                    } catch (Exception e3) {
                        wpe.e("MediaPlayerImpl", Log.getStackTraceString(e3));
                    }
                    synchronized (a.this.g) {
                        try {
                            if (a.this.e != null) {
                                a.this.e.flush();
                            }
                        } catch (IllegalStateException e4) {
                            wpe.e("MediaPlayerImpl", Log.getStackTraceString(e4));
                            a.this.s = false;
                        }
                        throw th;
                    }
                }
            } catch (IllegalStateException e5) {
                wpe.e("MediaPlayerImpl", Log.getStackTraceString(e5));
                a.this.s = false;
                try {
                    if (this.f10960b != null) {
                        wpe.h("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                        this.f10960b.close();
                        this.f10960b = null;
                    }
                    if (this.f10959a != null) {
                        wpe.h("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                        this.f10959a.close();
                        this.f10959a = null;
                    }
                } catch (Exception e6) {
                    wpe.e("MediaPlayerImpl", Log.getStackTraceString(e6));
                }
                synchronized (a.this.g) {
                    try {
                        if (a.this.e != null) {
                            a.this.e.flush();
                        }
                    } catch (IllegalStateException e7) {
                        wpe.e("MediaPlayerImpl", Log.getStackTraceString(e7));
                        a.this.s = false;
                    }
                }
            } catch (Exception e8) {
                wpe.e("MediaPlayerImpl", Log.getStackTraceString(e8));
                try {
                    if (this.f10960b != null) {
                        wpe.h("MediaPlayerImpl", "StreamDecodeTask OutputStream close");
                        this.f10960b.close();
                        this.f10960b = null;
                    }
                    if (this.f10959a != null) {
                        wpe.h("MediaPlayerImpl", "StreamDecodeTask InputStream close");
                        this.f10959a.close();
                        this.f10959a = null;
                    }
                } catch (Exception e9) {
                    wpe.e("MediaPlayerImpl", Log.getStackTraceString(e9));
                }
                synchronized (a.this.g) {
                    try {
                        if (a.this.e != null) {
                            a.this.e.flush();
                        }
                    } catch (IllegalStateException e10) {
                        wpe.e("MediaPlayerImpl", Log.getStackTraceString(e10));
                        a.this.s = false;
                    }
                }
            }
            wpe.h("MediaPlayerImpl", "StreamDecodeTask end");
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f10961a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BlockingQueue<byte[]> f10962b = new LinkedBlockingQueue();

        public e() {
            if (a.this.f10953r) {
                if (a.this.d == null || a.this.d.getState() == 0) {
                    a.this.d();
                    return;
                }
                if (a.this.d != null) {
                    try {
                        a.this.d.play();
                    } catch (IllegalStateException e) {
                        a.this.s = false;
                        wpe.e("MediaPlayerImpl", wpe.o(e));
                    }
                }
            }
        }

        public int a(byte[] bArr) {
            try {
                this.f10962b.put(bArr);
                return bArr.length;
            } catch (InterruptedException e) {
                wpe.e("MediaPlayerImpl", Log.getStackTraceString(e));
                return -1;
            }
        }

        public void b() {
            wpe.h("MediaPlayerImpl", "StreamPlayerTask exit");
            this.f10961a = false;
            this.f10962b.clear();
            this.f10962b.add(new byte[0]);
        }

        /* JADX WARN: Code duplicated, block: B:77:0x016a  */
        @Override // java.lang.Runnable
        public void run() {
            wpe.h("MediaPlayerImpl", "StreamPlayerTask begin");
            try {
                try {
                    if (a.this.f != null) {
                        if (a.this.f10952k.i().b("tts.enable_play_dialog_id")) {
                            a.this.f.onPlayStart(a.this.f10950a, a.this.f10951b);
                        } else {
                            a.this.f.onPlayStart(a.this.f10950a);
                        }
                    }
                    while (this.f10961a) {
                        byte[] bArrTake = this.f10962b.take();
                        wpe.b("MediaPlayerImpl", "StreamPlayerTask: data length=" + bArrTake.length);
                        if (!this.f10961a || bArrTake.length == 0) {
                            break;
                            break;
                        } else if (a.this.f10953r) {
                            a.this.d.write(bArrTake, 0, bArrTake.length);
                        } else {
                            a.this.f.onPcmData(bArrTake);
                        }
                    }
                    if (a.this.f10953r) {
                        synchronized (a.this.h) {
                            if (a.this.d != null && a.this.d.getState() != 0) {
                                try {
                                    a.this.d.pause();
                                    a.this.d.flush();
                                } catch (IllegalStateException e) {
                                    wpe.e("MediaPlayerImpl", wpe.o(e));
                                    a.this.s = false;
                                }
                            }
                        }
                    }
                    if (a.this.f != null) {
                        if (a.this.f10952k.i().b("tts.enable_play_finish_dialog_id")) {
                            a.this.f.onPlayFinish(a.this.f10951b);
                        } else {
                            a.this.f.onPlayFinish();
                        }
                    }
                } catch (Exception e2) {
                    wpe.e("MediaPlayerImpl", Log.getStackTraceString(e2));
                    if (a.this.f10953r) {
                        synchronized (a.this.h) {
                            if (a.this.d != null && a.this.d.getState() != 0) {
                                try {
                                    a.this.d.pause();
                                    a.this.d.flush();
                                } catch (IllegalStateException e3) {
                                    wpe.e("MediaPlayerImpl", wpe.o(e3));
                                    a.this.s = false;
                                }
                            }
                        }
                    }
                    if (a.this.f != null) {
                        if (a.this.f10952k.i().b("tts.enable_play_finish_dialog_id")) {
                            a.this.f.onPlayFinish(a.this.f10951b);
                        }
                    }
                }
                wpe.h("MediaPlayerImpl", "StreamPlayerTask end");
            } catch (Throwable th) {
                if (a.this.f10953r) {
                    synchronized (a.this.h) {
                        if (a.this.d != null && a.this.d.getState() != 0) {
                            try {
                                a.this.d.pause();
                                a.this.d.flush();
                            } catch (IllegalStateException e4) {
                                wpe.e("MediaPlayerImpl", wpe.o(e4));
                                a.this.s = false;
                            }
                        }
                    }
                }
                if (a.this.f != null) {
                    if (a.this.f10952k.i().b("tts.enable_play_finish_dialog_id")) {
                        a.this.f.onPlayFinish(a.this.f10951b);
                    } else {
                        a.this.f.onPlayFinish();
                    }
                }
                wpe.h("MediaPlayerImpl", "StreamPlayerTask end");
                throw th;
            }
        }
    }

    public a(com.xiaomi.ai.android.core.e eVar) {
        this.f10950a = 16000;
        this.g = new Object();
        this.h = new Object();
        this.o = c.PLAYER_MODE_STREAM;
        this.f10952k = eVar;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this) {
            try {
                SpeechSynthesizerCapability speechSynthesizerCapability = (SpeechSynthesizerCapability) this.f10952k.a(SpeechSynthesizerCapability.class);
                this.f = speechSynthesizerCapability;
                if (!this.f10953r && speechSynthesizerCapability == null) {
                    wpe.e("MediaPlayerImpl", "prepareInternal: SpeechSynthesizerCapability not registered");
                    return;
                }
                if (!this.s) {
                    e();
                }
                if (!this.s) {
                    wpe.e("MediaPlayerImpl", "prepareInternal: isInitSuccess is false");
                    return;
                }
                e eVar = this.m;
                if (eVar != null) {
                    eVar.b();
                    this.m = null;
                }
                d dVar = this.l;
                if (dVar != null) {
                    dVar.b();
                    this.l = null;
                }
                if (this.i != null && this.j != null) {
                    int i = 0;
                    while (true) {
                        if ((this.i.isDone() && this.j.isDone()) || i > 100) {
                            break;
                        }
                        try {
                            Thread.sleep(10L);
                            i++;
                        } catch (InterruptedException unused) {
                            wpe.h("MediaPlayerImpl", "prepareInternal: wait InterruptedException");
                        }
                    }
                }
                e eVar2 = new e();
                this.m = eVar2;
                this.l = new d(eVar2);
                ExecutorService executorService = ues.f35695a;
                this.i = executorService.submit(this.m);
                this.j = executorService.submit(this.l);
                wpe.h("MediaPlayerImpl", "prepare end");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        if (this.n != null) {
            wpe.h("MediaPlayerImpl", "releaseMediaPlayer");
            this.n.stop();
            this.n.release();
            this.n = null;
        }
    }

    public int a(byte[] bArr, boolean z) {
        synchronized (this) {
            try {
                if (this.c == Common.TTSCodec.PCM) {
                    e eVar = this.m;
                    if (eVar == null) {
                        wpe.h("MediaPlayerImpl", "write: mStreamPlayerTask is null");
                        return -1;
                    }
                    if (z) {
                        eVar.a(new byte[0]);
                    } else {
                        eVar.a(bArr);
                    }
                    return bArr != null ? bArr.length : 0;
                }
                if (this.q == null) {
                    return -1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("write: length=");
                sb.append(bArr != null ? bArr.length : 0);
                sb.append(", eof=");
                sb.append(z);
                wpe.h("MediaPlayerImpl", sb.toString());
                Bundle bundle = new Bundle();
                bundle.putByteArray("data", bArr);
                bundle.putBoolean("eof", z);
                Message messageObtainMessage = this.q.obtainMessage(1);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
                return bArr != null ? bArr.length : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        return this.f10950a;
    }

    public void g() {
        synchronized (this) {
            try {
                Handler handler = this.q;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                e eVar = this.m;
                if (eVar != null) {
                    eVar.b();
                    this.m = null;
                }
                d dVar = this.l;
                if (dVar != null) {
                    dVar.b();
                    this.l = null;
                }
                l();
                wpe.h("MediaPlayerImpl", "interrupt end");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a(com.xiaomi.ai.android.core.e eVar, int i, String str) {
        this.f10950a = 16000;
        this.g = new Object();
        this.h = new Object();
        this.o = c.PLAYER_MODE_STREAM;
        this.f10952k = eVar;
        this.f10950a = i;
        this.f10951b = str;
        c();
    }

    private void c() {
        wpe.h("MediaPlayerImpl", "init: sampleRate = " + this.f10950a);
        m();
        this.f10953r = this.f10952k.i().c("tts.enable_internal_player", true);
        HandlerThread handlerThread = new HandlerThread("MediaPlayerImplThread");
        this.p = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.p.getLooper(), new C0346a());
        this.q = handler;
        handler.obtainMessage(2).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        if (!this.f10953r) {
            return true;
        }
        AudioTrack audioTrack = new AudioTrack(3, this.f10950a, 4, 2, AudioTrack.getMinBufferSize(this.f10950a, 4, 2), 1);
        this.d = audioTrack;
        int state = audioTrack.getState();
        if (state != 0) {
            this.d.play();
            return true;
        }
        wpe.e("MediaPlayerImpl", "initAudioTrack: invalid AudioTrack state=" + state);
        this.d.release();
        this.d = null;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.s = d();
        if (this.s) {
            this.s = f();
        } else {
            wpe.e("MediaPlayerImpl", "initCore: isInitSuccess is false");
        }
    }

    private boolean f() {
        String stackTraceString;
        String strA = a();
        if (strA == null) {
            stackTraceString = "initMediaCodec: no supported codec for MIME=audio/mpeg";
        } else {
            try {
                this.e = MediaCodec.createByCodecName(strA);
            } catch (Exception e2) {
                wpe.e("MediaPlayerImpl", Log.getStackTraceString(e2));
            }
            if (this.e == null) {
                try {
                    this.e = MediaCodec.createDecoderByType("audio/mpeg");
                } catch (Exception e3) {
                    stackTraceString = Log.getStackTraceString(e3);
                }
            }
            try {
                this.e.configure(MediaFormat.createAudioFormat("audio/mpeg", this.f10950a, 1), (Surface) null, (MediaCrypto) null, 0);
                this.e.start();
                return true;
            } catch (Exception e4) {
                stackTraceString = "initMediaCodec:init failed:" + e4.getMessage();
            }
        }
        wpe.e("MediaPlayerImpl", stackTraceString);
        return false;
    }

    private void k() {
        wpe.h("MediaPlayerImpl", "release start");
        this.s = false;
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.q = null;
        }
        HandlerThread handlerThread = this.p;
        if (handlerThread != null) {
            handlerThread.quit();
            wpe.h("MediaPlayerImpl", "release HandlerThread");
            this.p = null;
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.b();
            this.l = null;
            wpe.h("MediaPlayerImpl", "release StreamDecodeTask");
        }
        e eVar = this.m;
        if (eVar != null) {
            eVar.b();
            this.m = null;
            wpe.b("MediaPlayerImpl", "release StreamPlayerTask");
        }
        if (this.f10953r) {
            synchronized (this.h) {
                try {
                    AudioTrack audioTrack = this.d;
                    if (audioTrack != null) {
                        audioTrack.release();
                        this.d = null;
                        wpe.h("MediaPlayerImpl", "release AudioTrack");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            synchronized (this.g) {
                try {
                    MediaCodec mediaCodec = this.e;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.e.release();
                        this.e = null;
                        wpe.h("MediaPlayerImpl", "release MediaCodec");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e2) {
            wpe.e("MediaPlayerImpl", wpe.o(e2));
        }
        l();
        wpe.h("MediaPlayerImpl", "release end");
    }

    public boolean h() {
        synchronized (this) {
            try {
                wpe.h("MediaPlayerImpl", OneTrack.Event.PLAY);
                if (this.o == c.PLAYER_MODE_URL) {
                    MediaPlayer mediaPlayer = this.n;
                    if (mediaPlayer == null) {
                        wpe.e("MediaPlayerImpl", "play: not prepared yet");
                        return false;
                    }
                    mediaPlayer.start();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean i() {
        wpe.h("MediaPlayerImpl", "prepare");
        Handler handler = this.q;
        if (handler != null) {
            handler.removeMessages(1);
            this.q.obtainMessage(3).sendToTarget();
        }
        return true;
    }

    public boolean m() {
        synchronized (this) {
            k();
        }
        return true;
    }

    public a(com.xiaomi.ai.android.core.e eVar, int i, String str, Common.TTSCodec tTSCodec) {
        this.f10950a = 16000;
        this.g = new Object();
        this.h = new Object();
        this.o = c.PLAYER_MODE_STREAM;
        this.f10952k = eVar;
        this.f10950a = i;
        this.f10951b = str;
        this.c = tTSCodec;
        c();
    }

    private String a() {
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equals("audio/mpeg")) {
                        wpe.h("MediaPlayerImpl", "getCodecName: " + mediaCodecInfo.getName());
                        return mediaCodecInfo.getName();
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            wpe.e("MediaPlayerImpl", wpe.o(e2));
            return null;
        }
    }

    public void a(int i, String str, Common.TTSCodec tTSCodec) {
        this.f10950a = i;
        this.f10951b = str;
        this.c = tTSCodec;
    }

    public boolean a(String str) {
        synchronized (this) {
            wpe.h("MediaPlayerImpl", "prepare url=" + str);
            l();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.n = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            try {
                this.n.setDataSource(str);
                this.n.prepare();
                this.o = c.PLAYER_MODE_URL;
            } catch (Exception e2) {
                wpe.e("MediaPlayerImpl", Log.getStackTraceString(e2));
                l();
                return false;
            }
        }
        return true;
    }
}

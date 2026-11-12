package com.xiaomi.ai.android.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.android.codec.AudioEncoder;
import com.xiaomi.ai.android.vad.IVad;
import com.xiaomi.ai.android.vad.Vad;
import com.xiaomi.ai.android.vad.Vad2;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.util.Iterator;
import java.util.LinkedList;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class k extends Handler {
    private d a;
    private AudioEncoder b;
    private IVad c;
    private boolean d;
    private String e;
    private LinkedList<Message> f;

    public k(d dVar, Looper looper) {
        String str;
        super(looper);
        this.f = new LinkedList<>();
        this.a = dVar;
        AivsConfig aivsConfigB = dVar.b();
        this.e = aivsConfigB.getString(AivsConfig.Asr.CODEC, AivsConfig.Asr.CODEC_PCM);
        if (!aivsConfigB.getBoolean(AivsConfig.Asr.ENCODED_BY_CLIENT, false) && (this.e.equals(AivsConfig.Asr.CODEC_BV32_FLOAT) || this.e.equals(AivsConfig.Asr.CODEC_OPUS))) {
            AudioEncoder audioEncoder = new AudioEncoder(dVar);
            this.b = audioEncoder;
            if (!audioEncoder.a()) {
                this.b.c();
                this.b = null;
            }
        }
        boolean z = aivsConfigB.getInt(AivsConfig.Asr.VAD_TYPE) == 1;
        this.d = z;
        if (z) {
            if (aivsConfigB.getBoolean(AivsConfig.Asr.ENABLE_NEW_VAD)) {
                this.c = new Vad2(aivsConfigB.getInt(AivsConfig.Asr.MIN_VOICE), aivsConfigB.getInt(AivsConfig.Asr.MIN_SIL), aivsConfigB.getInt(AivsConfig.Asr.MAX_VOICE), aivsConfigB.getInt(AivsConfig.Asr.MAX_LENGTH_RESET));
                str = "use new vad";
            } else {
                this.c = new Vad(600, 200, 4.0f);
                str = "use default vad";
            }
            Logger.b("UploadHandler", str);
        }
    }

    private void a(byte[] bArr, boolean z) {
        String str;
        if (bArr == null && this.e.equals(AivsConfig.Asr.CODEC_BV32_FLOAT)) {
            return;
        }
        if (bArr == null && !z) {
            str = "postEncodedData: data error";
        } else {
            if (bArr == null || bArr.length <= 32768) {
                int iA = this.b.a(bArr, z);
                byte[] bArrB = this.b.b();
                if (iA > 0 && iA <= bArrB.length && this.a.g() != null) {
                    this.a.j().b(this.a.e().c());
                    this.a.g().postData(bArrB, 0, iA);
                    return;
                } else {
                    Logger.a("UploadHandler", "postEncodedData: encodedSize:" + iA);
                    return;
                }
            }
            str = "postEncodedData: data oversize, " + bArr.length + SearchCriteria.GT + 32768;
        }
        Logger.d("UploadHandler", str);
    }

    private void d() {
        if (this.f.isEmpty()) {
            return;
        }
        Logger.b("UploadHandler", "flushCacheQueue: queue size=" + this.f.size());
        e();
        Iterator<Message> it2 = this.f.iterator();
        while (it2.hasNext()) {
            it2.next().sendToTarget();
        }
        this.f.clear();
    }

    private void e() {
        if (this.f.isEmpty()) {
            return;
        }
        Message messageElement = this.f.element();
        int i = messageElement.what;
        if (i != 1 && (i != 0 || !((Event) messageElement.obj).getFullName().equals(AIApiConstants.SpeechRecognizer.RecognizeStreamFinished))) {
            return;
        }
        while (true) {
            Message messagePeek = this.f.peek();
            if (messagePeek == null) {
                return;
            }
            int i2 = messagePeek.what;
            if (i2 == 1) {
                this.f.poll();
            } else if (i2 == 0) {
                Event event = (Event) messagePeek.obj;
                if (event.getFullName().equals(AIApiConstants.SpeechRecognizer.RecognizeStreamFinished)) {
                    Logger.b("UploadHandler", "removeUnfinishedAsr: remove " + event);
                    this.f.poll();
                    return;
                }
                return;
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (!this.f.isEmpty()) {
                Logger.b("UploadHandler", "release: cache queue size=" + this.f.size());
                this.f.clear();
            }
        }
        removeMessages(0);
        removeMessages(1);
    }

    public void a(Message message) {
        if (message.what == 0) {
            this.a.i().a((Event) message.obj);
        }
        if (this.a.g() != null && this.a.g().isConnected()) {
            synchronized (this) {
                if (!this.f.isEmpty()) {
                    d();
                }
            }
            Logger.a("UploadHandler", "queue: send to target " + message);
            message.sendToTarget();
            return;
        }
        if (Logger.getLogLevel() == 3) {
            Logger.a("UploadHandler", "queue: cache " + message);
        } else {
            Logger.b("UploadHandler", "queue: cache " + message.hashCode());
        }
        synchronized (this) {
            this.f.add(message);
        }
    }

    public int b() {
        int size;
        synchronized (this) {
            size = this.f.size();
        }
        return size;
    }

    public void c() {
        synchronized (this) {
            d();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ConnectionCapability connectionCapability;
        Logger.a("UploadHandler", "handleMessage:" + message.what);
        com.xiaomi.ai.core.a aVarG = this.a.g();
        if (aVarG == null) {
            Logger.d("UploadHandler", "handleMessage: engine has been released!");
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                Bundle data = message.getData();
                byte[] byteArray = data.getByteArray("data");
                boolean z = data.getBoolean("raw");
                if (this.b != null && !z) {
                    a(byteArray, data.getBoolean("eof"));
                } else {
                    if (byteArray == null) {
                        return;
                    }
                    this.a.j().b(this.a.e().c());
                    aVarG.postData(byteArray);
                    Logger.a("UploadHandler", "post data without encode");
                }
                IVad iVad = this.c;
                if (iVad == null || byteArray == null || !iVad.checkVad(byteArray)) {
                    return;
                }
                Logger.b("UploadHandler", "detect vad, stop capture");
                Instruction instructionBuildInstruction = APIUtils.buildInstruction(new SpeechRecognizer.StopCapture());
                instructionBuildInstruction.getHeader().setDialogId(this.a.e().c());
                this.a.j().b(instructionBuildInstruction);
                this.a.d().obtainMessage(1, instructionBuildInstruction).sendToTarget();
                this.c.release();
                return;
            }
            if (i != 2) {
                Logger.d("UploadHandler", "handleMessage: unknown message:" + message.what);
                return;
            }
        }
        Event event = (Event) message.obj;
        if (this.d && AIApiConstants.SpeechRecognizer.Recognize.equals(event.getFullName())) {
            this.c.release();
            this.c.init();
        }
        this.a.e().a(event);
        this.a.j().b(event);
        if (AIApiConstants.SpeechRecognizer.RecognizeStreamFinished.equals(event.getFullName()) && (connectionCapability = (ConnectionCapability) this.a.a(ConnectionCapability.class)) != null) {
            connectionCapability.onLastPackageSend(event.getId());
        }
        aVarG.postEvent(event);
    }
}

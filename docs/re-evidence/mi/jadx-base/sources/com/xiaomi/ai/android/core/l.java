package com.xiaomi.ai.android.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.android.codec.AudioEncoder;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.android.vad.IVad;
import com.xiaomi.ai.android.vad.Vad;
import com.xiaomi.ai.android.vad.Vad2;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import defpackage.bf8;
import defpackage.dcd;
import defpackage.e01;
import defpackage.f01;
import defpackage.gt3;
import defpackage.wpe;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class l extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioEncoder f10915b;
    private IVad c;
    private boolean d;
    private String e;
    private LinkedList<Message> f;

    public l(e eVar, Looper looper) {
        String str;
        super(looper);
        this.f = new LinkedList<>();
        this.f10914a = eVar;
        e01 e01VarI = eVar.i();
        this.e = e01VarI.j("asr.codec", "PCM");
        if (!e01VarI.c("asr.encoded_by_client", false) && (this.e.equals("BV32_FLOAT") || this.e.equals("OPUS"))) {
            AudioEncoder audioEncoder = new AudioEncoder(eVar);
            this.f10915b = audioEncoder;
            if (!audioEncoder.b()) {
                this.f10915b.c();
                this.f10915b = null;
            }
        }
        boolean z = e01VarI.e("asr.vad_type") == 1;
        this.d = z;
        if (z) {
            if (e01VarI.b("asr.enable_new_vad")) {
                this.c = new Vad2(e01VarI.e("asr.minvoice"), e01VarI.e("asr.minsil"), e01VarI.e("asr.maxvoice"), e01VarI.e("asr.max_length_reset"));
                str = "use new vad";
            } else {
                this.c = new Vad(600, 200, 4.0f);
                str = "use default vad";
            }
            wpe.h("UploadHandler", str);
        }
    }

    private void a() {
        if (this.f.isEmpty()) {
            return;
        }
        wpe.h("UploadHandler", "flushCacheQueue: queue size=" + this.f.size());
        e();
        Iterator<Message> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().sendToTarget();
        }
        this.f.clear();
    }

    private void e() {
        if (this.f.isEmpty()) {
            return;
        }
        Message messageElement = this.f.element();
        int i = messageElement.what;
        if (i != 1 && (i != 0 || !((bf8) messageElement.obj).a().getFullName().equals(AIApiConstants.SpeechRecognizer.RecognizeStreamFinished))) {
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
                bf8 bf8Var = (bf8) messagePeek.obj;
                if (bf8Var.a().getFullName().equals(AIApiConstants.SpeechRecognizer.RecognizeStreamFinished)) {
                    wpe.h("UploadHandler", "removeUnfinishedAsr: remove " + bf8Var);
                    this.f.poll();
                    return;
                }
                return;
            }
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
            a();
            removeMessages(3);
        }
    }

    public void d() {
        synchronized (this) {
            try {
                if (!this.f.isEmpty()) {
                    wpe.h("UploadHandler", "release: cache queue size=" + this.f.size());
                    this.f.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        removeMessages(0);
        removeMessages(1);
        removeMessages(3);
        removeMessages(4);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ConnectionCapability connectionCapability;
        wpe.b("UploadHandler", "handleMessage:" + message.what);
        gt3 gt3VarE = this.f10914a.e();
        if (gt3VarE == null) {
            wpe.e("UploadHandler", "handleMessage: engine has been released!");
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                Bundle data = message.getData();
                byte[] byteArray = data.getByteArray("data");
                boolean z = data.getBoolean("raw");
                if (this.f10915b != null && !z && gt3VarE.getType() != 3) {
                    a(byteArray, data.getBoolean("eof"));
                } else {
                    if (byteArray == null) {
                        return;
                    }
                    this.f10914a.r().d(this.f10914a.m().a());
                    gt3VarE.postData(byteArray);
                    wpe.b("UploadHandler", "post data without encode");
                }
                IVad iVad = this.c;
                if (iVad == null || byteArray == null || !iVad.checkVad(byteArray)) {
                    return;
                }
                wpe.h("UploadHandler", "detect vad, stop capture");
                Instruction instructionBuildInstruction = APIUtils.buildInstruction(new SpeechRecognizer.StopCapture());
                instructionBuildInstruction.getHeader().setDialogId(this.f10914a.m().a());
                this.f10914a.r().f(instructionBuildInstruction);
                this.f10914a.k().obtainMessage(1, new dcd(instructionBuildInstruction, instructionBuildInstruction.toString())).sendToTarget();
                this.c.release();
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    if (NetworkUtils.isNetworkAvailable(this.f10914a.j())) {
                        this.f10914a.f().b(false);
                        return;
                    }
                    wpe.e("UploadHandler", "UploadHandler time out : network not available , feed error");
                    this.f10914a.a(new f01(StdStatuses.NETWORK_DISABLED, "network not available"));
                    d();
                    return;
                }
                if (i != 4) {
                    wpe.e("UploadHandler", "handleMessage: unknown message:" + message.what);
                    return;
                }
                if (gt3VarE.getType() == 1) {
                    wpe.h("UploadHandler", "handleMessage: stop xmd");
                    gt3VarE.stop();
                    return;
                }
                return;
            }
        }
        bf8 bf8Var = (bf8) message.obj;
        Event<?> eventA = bf8Var.a();
        if (this.f10914a.l() != null && (!this.f10914a.i().b("connection.enable_only_offline_use_executor") || gt3VarE.getType() == 3)) {
            if (this.f10914a.l().a(eventA)) {
                return;
            } else {
                bf8Var = new bf8(eventA, eventA.toString());
            }
        }
        if (this.d && AIApiConstants.SpeechRecognizer.Recognize.equals(eventA.getFullName())) {
            this.c.release();
            this.c.init();
        }
        if (this.f10915b != null && this.e.equals("OPUS") && (AIApiConstants.SpeechRecognizer.RecognizeStreamFinished.equals(eventA.getFullName()) || AIApiConstants.SpeechWakeup.WakeupStreamFinished.equals(eventA.getFullName()))) {
            wpe.b("UploadHandler", "handleMessage: send eofMsg");
            a(null, true);
        }
        this.f10914a.r().c(eventA);
        if (AIApiConstants.SpeechRecognizer.RecognizeStreamFinished.equals(eventA.getFullName()) && (connectionCapability = (ConnectionCapability) this.f10914a.a(ConnectionCapability.class)) != null) {
            connectionCapability.onLastPackageSend(eventA.getId());
        }
        gt3VarE.postEvent(bf8Var);
    }

    public void a(Message message) {
        if (message.what == 0) {
            this.f10914a.q().a(((bf8) message.obj).a());
        }
        gt3 gt3VarE = this.f10914a.e();
        if (gt3VarE == null) {
            wpe.e("UploadHandler", "queue: engine has been released!");
            return;
        }
        if (!gt3VarE.isConnected() || (gt3VarE.getType() != 3 && !NetworkUtils.isNetworkAvailable(this.f10914a.j()))) {
            synchronized (this) {
                this.f.add(message);
            }
            return;
        }
        synchronized (this) {
            try {
                if (!this.f.isEmpty()) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        message.sendToTarget();
    }

    private void a(byte[] bArr, boolean z) {
        String str;
        if (bArr == null && this.e.equals("BV32_FLOAT")) {
            return;
        }
        if (bArr == null && !z) {
            str = "postEncodedData: data error";
        } else if (bArr == null || bArr.length <= 32768) {
            int iA = this.f10915b.a(bArr, z);
            byte[] bArrA = this.f10915b.a();
            gt3 gt3VarE = this.f10914a.e();
            if (gt3VarE != null) {
                if (iA > 0 && iA <= bArrA.length) {
                    this.f10914a.r().d(this.f10914a.m().a());
                    gt3VarE.postData(bArrA, 0, iA);
                    return;
                } else {
                    wpe.b("UploadHandler", "postEncodedData: encodedSize:" + iA);
                    return;
                }
            }
            str = "postEncodedData: engine has been released!";
        } else {
            str = "postEncodedData: data oversize, " + bArr.length + ">32768";
        }
        wpe.e("UploadHandler", str);
    }
}

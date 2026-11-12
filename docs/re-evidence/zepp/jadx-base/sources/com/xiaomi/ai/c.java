package com.xiaomi.ai;

import android.content.Context;
import android.location.Location;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.nfc.web.Constant;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.mibrain.GetAnonymousAuthorizationInterface;
import com.xiaomi.ai.mibrain.MibrainException;
import com.xiaomi.ai.mibrain.MibrainRequest;
import com.xiaomi.ai.mibrain.MibrainRequestListener;
import com.xiaomi.ai.mibrain.MibrainRequestParams;
import com.xiaomi.ai.mibrain.MibrainRequestParamsBuilder;
import com.xiaomi.ai.mibrain.Mibrainsdk;
import com.xiaomi.ai.utils.Log;
import com.xiaomi.ai.utils.UploadHelper;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class c extends SpeechEngine {
    private static final String b = "MiSpeechSDK:MiAiEngine";
    private static final int f = 4;
    private static final int g = 10;
    private static final int h = 5;
    private com.xiaomi.ai.streamplayer.k.a A;
    public GetAnonymousAuthorizationInterface a;
    private SpannableStringBuilder c;
    private int d;
    private String e;
    private com.xiaomi.ai.streamplayer.k i;
    private volatile boolean j;
    private a k;
    private AudioManager l;
    private MibrainRequest m;
    private e n;
    private final Object o;
    private final Object p;
    private String q;
    private volatile SpeechEngine.ParamBuilder r;
    private m s;
    private int t;
    private String u;
    private String v;
    private String w;
    private int x;
    private ExecutorService y;
    private AtomicBoolean z;

    public class a extends Thread {
        private MibrainRequest b;
        private boolean c;
        private SpeechEngine.ParamBuilder d;

        public a(MibrainRequest mibrainRequest, SpeechEngine.ParamBuilder paramBuilder) {
            this.b = mibrainRequest;
            this.d = paramBuilder;
        }

        private void a(b bVar) {
            byte[] bArr;
            if (bVar == null || (bArr = bVar.a) == null) {
                return;
            }
            float fA = com.xiaomi.ai.utils.n.a(bArr, bArr.length);
            if (this.d.needAsr) {
                c.this.notifyAsrBufferReceived(bVar.a);
                c.this.notifyAsrRmsChanged(fA);
            }
            if (this.d.needVpRec) {
                c.this.notifyVoiceRecBufferReceived(bVar.a);
                c.this.notifyVoiceRecRmsChanged(fA);
            }
            if (this.d.needVpReg) {
                c.this.notifyVoiceRegBufferReceived(bVar.a);
                c.this.notifyVoiceRegRmsChanged(fA);
            }
        }

        private void a(e eVar) {
            while (eVar.c()) {
                a(eVar.b());
            }
            eVar.a(c.this.new b(new byte[0], 0, 0, true));
            eVar.b.clear();
        }

        private boolean a() {
            SpeechEngine.ParamBuilder paramBuilder = this.d;
            AsrRequest asrRequest = paramBuilder.asrRequest;
            if (asrRequest != null && asrRequest.d == AsrRequest.DataInputMode.DATA_INPUT_MODE_RECORDER) {
                return true;
            }
            VoiceprintRegisterRequest voiceprintRegisterRequest = paramBuilder.voiceprintRegisterRequest;
            if (voiceprintRegisterRequest != null && voiceprintRegisterRequest.mode == VoiceprintRegisterRequest.DataInputMode.DATA_INPUT_MODE_RECORDER) {
                return true;
            }
            VoiceprintRecognizeRequest voiceprintRecognizeRequest = paramBuilder.voiceprintRecognizeRequest;
            return voiceprintRecognizeRequest != null && voiceprintRecognizeRequest.mode == VoiceprintRecognizeRequest.DataInputMode.DATA_INPUT_MODE_RECORDER;
        }

        private void b(e eVar) {
            synchronized (c.class) {
                if (isInterrupted()) {
                    return;
                }
                c.this.a(com.xiaomi.ai.utils.h.a("recordingToBuffer", -16711936));
                int minBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
                AudioRecord audioRecord = new AudioRecord(1, 16000, 16, 2, minBufferSize);
                if (audioRecord.getState() != 1) {
                    synchronized (c.this.o) {
                        if (c()) {
                            return;
                        }
                        c.this.a("recorder init failed");
                        SpeechError speechError = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                        speechError.errCode = 5;
                        speechError.errType = 2;
                        speechError.errMsg = "Fail to init recorder";
                        c.this.notifyError(this.d, speechError);
                        return;
                    }
                }
                try {
                    audioRecord.startRecording();
                    short[] sArr = new short[minBufferSize];
                    while (c.this.j && !isInterrupted() && eVar.c()) {
                        try {
                            try {
                                int i = audioRecord.read(sArr, 0, minBufferSize);
                                if (i <= 0) {
                                    c.this.j = false;
                                    Log.e(c.b, "audio read size =0");
                                    try {
                                        audioRecord.stop();
                                    } catch (IllegalStateException e) {
                                        c.this.a("IllegalStateException: ", e);
                                    }
                                    audioRecord.release();
                                    return;
                                }
                                byte[] bArrA = com.xiaomi.ai.utils.e.a(sArr, i);
                                b bVar = c.this.new b(bArrA, 0, bArrA.length, false);
                                eVar.a(bVar);
                                a(bVar);
                            } catch (Exception e2) {
                                Log.w(c.b, "InterruptedException at recordingToBuffer: ", e2);
                                try {
                                    audioRecord.stop();
                                } catch (IllegalStateException e3) {
                                    c.this.a("IllegalStateException: ", e3);
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                audioRecord.stop();
                            } catch (IllegalStateException e4) {
                                c.this.a("IllegalStateException: ", e4);
                            }
                            audioRecord.release();
                            throw th;
                        }
                    }
                    eVar.a(c.this.new b(new byte[0], 0, 0, true));
                    try {
                        audioRecord.stop();
                    } catch (IllegalStateException e5) {
                        c.this.a("IllegalStateException: ", e5);
                    }
                    audioRecord.release();
                    return;
                } catch (IllegalStateException e6) {
                    synchronized (c.this.o) {
                        if (c()) {
                            return;
                        }
                        c.this.a("IllegalStateException: ", e6);
                        audioRecord.release();
                        SpeechError speechError2 = new SpeechError(SpeechEngine.ProcessStage.STAGE_REQUESTING);
                        speechError2.errMsg = e6.toString();
                        speechError2.errCode = 11;
                        speechError2.errType = 2;
                        c.this.notifyError(this.d, speechError2);
                        return;
                    }
                }
                throw th;
            }
        }

        private boolean b() {
            SpeechEngine.ParamBuilder paramBuilder = this.d;
            AsrRequest asrRequest = paramBuilder.asrRequest;
            if (asrRequest != null && asrRequest.d == AsrRequest.DataInputMode.DATA_INPUT_MODE_BUFFER) {
                return true;
            }
            VoiceprintRegisterRequest voiceprintRegisterRequest = paramBuilder.voiceprintRegisterRequest;
            if (voiceprintRegisterRequest != null && voiceprintRegisterRequest.mode == VoiceprintRegisterRequest.DataInputMode.DATA_INPUT_MODE_BUFFER) {
                return true;
            }
            VoiceprintRecognizeRequest voiceprintRecognizeRequest = paramBuilder.voiceprintRecognizeRequest;
            return voiceprintRecognizeRequest != null && voiceprintRecognizeRequest.mode == VoiceprintRecognizeRequest.DataInputMode.DATA_INPUT_MODE_BUFFER;
        }

        private boolean c() {
            return (c.this.r == this.d && c.this.m == this.b) ? false : true;
        }

        private boolean d() {
            synchronized (c.this.o) {
                if (c()) {
                    return true;
                }
                c.this.notifyAsrReadyForSpeech();
                return false;
            }
        }

        private boolean e() {
            synchronized (c.this.o) {
                if (c()) {
                    return true;
                }
                c.this.notifyAsrBeginningOfSpeech();
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            synchronized (c.this.o) {
                boolean z = true;
                if (this.c || c()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("call failed isNotifyEnd ");
                    sb.append(this.c);
                    sb.append("mMibrainRequest==request");
                    if (this.b != c.this.m) {
                        z = false;
                    }
                    sb.append(z);
                    Log.w(c.b, sb.toString());
                } else {
                    c.this.notifyAsrEndOfSpeech();
                    this.c = true;
                }
            }
        }

        private boolean g() {
            synchronized (c.this.o) {
                if (c()) {
                    return true;
                }
                c.this.notifyVoiceRecBeginningOfSpeech();
                return false;
            }
        }

        private void h() {
            synchronized (c.this.o) {
                boolean z = true;
                if (this.c || c()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("call failed isNotifyEnd ");
                    sb.append(this.c);
                    sb.append("mMibrainRequest==request");
                    if (this.b != c.this.m) {
                        z = false;
                    }
                    sb.append(z);
                    Log.w(c.b, sb.toString());
                } else {
                    c.this.notifyVoiceRecEndOfSpeech();
                    this.c = true;
                }
            }
        }

        private boolean i() {
            synchronized (c.this.o) {
                if (c()) {
                    return true;
                }
                c.this.notifyVoiceRegBeginningOfSpeech();
                return false;
            }
        }

        private void j() {
            synchronized (c.this.o) {
                boolean z = true;
                if (this.c || c()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("call failed isNotifyEnd ");
                    sb.append(this.c);
                    sb.append("mMibrainRequest==request");
                    if (this.b != c.this.m) {
                        z = false;
                    }
                    sb.append(z);
                    Log.e(c.b, sb.toString());
                } else {
                    c.this.notifyVoiceRegEndOfSpeech();
                    this.c = true;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            e eVar;
            if (isInterrupted() || (eVar = c.this.n) == null) {
                return;
            }
            if (this.d.needAsr && d()) {
                return;
            }
            if (this.d.needAsr && e()) {
                return;
            }
            if (this.d.needVpRec && g()) {
                return;
            }
            if (this.d.needVpReg && i()) {
                return;
            }
            try {
                if (a()) {
                    eVar.d();
                }
                if (a()) {
                    b(eVar);
                } else {
                    if (!b()) {
                        throw new IllegalArgumentException("date input mode error");
                    }
                    a(eVar);
                }
                if (!b()) {
                    eVar.e();
                }
                if (this.d.needAsr) {
                    f();
                }
                if (this.d.needVpRec) {
                    h();
                }
                if (this.d.needVpReg) {
                    j();
                }
            } catch (Throwable th) {
                if (!b()) {
                    eVar.e();
                }
                throw th;
            }
        }
    }

    public class b {
        public byte[] a;
        public boolean b;
        public boolean c;
        public EnumC0771c d;
        public String e;

        public b(EnumC0771c enumC0771c) {
            this.d = enumC0771c;
        }

        public b(String str, EnumC0771c enumC0771c) {
            this.e = str;
            this.d = enumC0771c;
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            this.a = bArr;
            Objects.requireNonNull(bArr, "addBuffer params error, buffer is null ");
            if (i2 < 0 || i < 0) {
                throw new IllegalArgumentException("addBuffer params error,offset < 0 or len <0");
            }
            if (i2 + i > bArr.length) {
                throw new IllegalArgumentException("addBuffer params error,offset + len > bytes.length");
            }
            byte[] bArr2 = new byte[i2];
            this.a = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
            this.b = z;
            this.d = EnumC0771c.DATA;
        }

        public b(byte[] bArr, int i, int i2, boolean z, boolean z2) {
            this.a = bArr;
            Objects.requireNonNull(bArr, "addBuffer params error, buffer is null ");
            if (i2 < 0 || i < 0) {
                throw new IllegalArgumentException("addBuffer params error,offset < 0 or len <0");
            }
            if (i2 + i > bArr.length) {
                throw new IllegalArgumentException("addBuffer params error,offset + len > bytes.length");
            }
            byte[] bArr2 = new byte[i2];
            this.a = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
            this.b = z;
            this.c = z2;
            this.d = EnumC0771c.DATA;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.ai.c$c, reason: collision with other inner class name */
    public enum EnumC0771c {
        DATA,
        FLAG_ABANDON_START,
        FLAG_ABANDON_END,
        NLP_DATA,
        VAD_BEGIN
    }

    public class d implements MibrainRequestListener {
        private MibrainRequest b;
        private a c;
        private SpeechEngine.ParamBuilder e;
        private String g;
        private boolean d = false;
        private volatile SpeechEngine.ProcessStage f = SpeechEngine.ProcessStage.STAGE_REQUESTING;

        public d(SpeechEngine.ParamBuilder paramBuilder, MibrainRequest mibrainRequest) {
            this.b = mibrainRequest;
            this.e = paramBuilder;
        }

        private SpeechError a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            int i;
            SpeechError speechError;
            String strOptString;
            SpeechEngine.ParamBuilder paramBuilder = this.e;
            if (paramBuilder.needEvent && paramBuilder.eventRequest != null) {
                return null;
            }
            try {
                String string = jSONObject.getJSONObject("meta").getString("type");
                if (ContentDirectory.ERROR.equals(string)) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
                    int i2 = jSONObject3.getInt("error_code");
                    String string2 = jSONObject3.getString("error_msg");
                    SpeechError speechError2 = new SpeechError(this.f);
                    speechError2.errType = 1;
                    speechError2.errCode = i2;
                    speechError2.errMsg = string2;
                    return speechError2;
                }
                if (!"TRANSACTION_BEGIN".equals(string) && !"RESULT_VOR_FINAL".equals(string) && !"RESULT_VOR_QUERY".equals(string) && !"RESULT_VOR_DEL".equals(string) && !"RESULT_VOR_REG".equals(string) && !"RESULT_VOR_REG_PARTIAL".equals(string) && !"RESULT_VOR_REG_FINAL".equals(string) && !"RESULT_ASR_PARTIAL".equals(string) && !"RESULT_ASR_FINAL".equals(string) && !"RESULT_NLP".equals(string) && !"RESULT_TTS_BEGIN".equals(string) && !"RESULT_TTS_END".equals(string) && !"TRANSACTION_END".equals(string) && !"RESULT_FILE_STORED".equals(string)) {
                    Log.e(c.b, "unkown type result = " + jSONObject);
                    return null;
                }
                boolean z = false;
                switch (k.a[this.f.ordinal()]) {
                    case 1:
                        if (!"TRANSACTION_BEGIN".equals(string)) {
                            z = true;
                        }
                        break;
                    case 2:
                        if (!"RESULT_ASR_PARTIAL".equals(string) && !"RESULT_ASR_FINAL".equals(string) && !"RESULT_FILE_STORED".equals(string)) {
                            z = true;
                        }
                        break;
                    case 3:
                        boolean z2 = !"RESULT_NLP".equals(string);
                        if (!this.d) {
                            z = z2;
                        } else {
                            this.f = SpeechEngine.ProcessStage.STAGE_TTS;
                        }
                        break;
                    case 4:
                        if (!"RESULT_VOR_FINAL".equals(string)) {
                            z = true;
                        }
                        break;
                    case 5:
                        if (!"RESULT_VOR_REG_FINAL".equals(string) && !"RESULT_VOR_REG_PARTIAL".equals(string) && !"TRANSACTION_END".equals(string)) {
                            z = true;
                        }
                        break;
                    case 6:
                        if (!"RESULT_TTS_BEGIN".equals(string) && !"RESULT_TTS_END".equals(string) && !"TRANSACTION_END".equals(string)) {
                            z = true;
                        }
                        break;
                    case 7:
                        if (!"RESULT_VOR_DEL".equals(string)) {
                            z = true;
                        }
                        break;
                    case 8:
                        if (!"RESULT_VOR_QUERY".equals(string)) {
                            z = true;
                        }
                        break;
                }
                if (z) {
                    speechError = new SpeechError(this.f);
                    speechError.errType = 2;
                    speechError.errCode = 3;
                    strOptString = "Internal state error";
                } else {
                    if (this.f != SpeechEngine.ProcessStage.STAGE_NLP || (i = (jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE).getJSONObject("status")).getInt("code")) == 200) {
                        return null;
                    }
                    speechError = new SpeechError(this.f);
                    speechError.errType = 1;
                    speechError.errCode = i;
                    strOptString = jSONObject2.optString("error_details");
                }
                speechError.errMsg = strOptString;
                return speechError;
            } catch (JSONException e) {
                c.this.a("JSONException: ", e);
                SpeechError speechError3 = new SpeechError(this.f);
                speechError3.errType = 2;
                speechError3.errCode = 2;
                speechError3.errMsg = e.toString();
                return speechError3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:311:0x0541 A[Catch: all -> 0x054c, TryCatch #7 {, blocks: (B:309:0x053b, B:311:0x0541, B:313:0x0543, B:314:0x054a), top: B:327:0x053b }] */
        /* JADX WARN: Code duplicated, block: B:313:0x0543 A[Catch: all -> 0x054c, TryCatch #7 {, blocks: (B:309:0x053b, B:311:0x0541, B:313:0x0543, B:314:0x054a), top: B:327:0x053b }] */
        /* JADX WARN: Code duplicated, block: B:327:0x053b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void a(MibrainRequest mibrainRequest, String str) {
            SpeechError speechError;
            c cVar;
            String str2;
            if (b(mibrainRequest)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                a(mibrainRequest, jSONObject);
                SpeechError speechErrorA = a(jSONObject);
                if (speechErrorA != null) {
                    c.this.a(com.xiaomi.ai.utils.h.a("Text received: ERROR!!!"));
                    c.this.a(com.xiaomi.ai.utils.h.a(com.xiaomi.ai.utils.a.a(str), SupportMenu.CATEGORY_MASK));
                    synchronized (c.this.o) {
                        if (b(mibrainRequest)) {
                            return;
                        }
                        c.this.notifyError(this.e, speechErrorA);
                        return;
                    }
                }
                c.this.a(com.xiaomi.ai.utils.h.a("Text received: "));
                c.this.a(com.xiaomi.ai.utils.a.a(str));
                c cVar2 = c.this;
                if (cVar2.mResultParser == null) {
                    cVar2.mResultParser = new SpeechEngine.ResultParser();
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("meta");
                String string = jSONObject2.getString("type");
                if ("TRANSACTION_BEGIN".equals(string)) {
                    synchronized (c.this.o) {
                        if (b(mibrainRequest)) {
                            return;
                        }
                        this.f = c.this.getNextStage(this.e, this.f);
                        cVar = c.this;
                        str2 = "TRANSACTION_BEGIN stage: " + this.f;
                    }
                } else {
                    if ("RESULT_ASR_PARTIAL".equals(string)) {
                        SpeechResult asrResult = c.this.mResultParser.getAsrResult(jSONObject);
                        synchronized (c.this.o) {
                            if (asrResult.query != null) {
                                if (b(mibrainRequest)) {
                                    return;
                                }
                                c.this.notifyAsrParticalResults(asrResult);
                                return;
                            } else {
                                SpeechError speechError2 = new SpeechError(SpeechEngine.ProcessStage.STAGE_ASR);
                                speechError2.errCode = 12;
                                speechError2.errType = 2;
                                c.this.notifyError(this.e, speechError2);
                                return;
                            }
                        }
                    }
                    if ("RESULT_ASR_FINAL".equals(string)) {
                        SpeechResult asrResult2 = c.this.mResultParser.getAsrResult(jSONObject);
                        synchronized (c.this.o) {
                            if (asrResult2.query == null) {
                                SpeechError speechError3 = new SpeechError(SpeechEngine.ProcessStage.STAGE_ASR);
                                speechError3.errCode = 12;
                                speechError3.errType = 2;
                                c.this.notifyError(this.e, speechError3);
                                return;
                            }
                            if (b(mibrainRequest)) {
                                return;
                            }
                            this.d = TextUtils.isEmpty(asrResult2.query);
                            c.this.notifyAsrResults(asrResult2);
                            this.f = c.this.getNextStage(this.e, this.f);
                            cVar = c.this;
                            str2 = "TRESULT_ASR_FINAL stage: " + this.f;
                        }
                    } else if ("RESULT_FILE_STORED".equals(string)) {
                        String strOptString = jSONObject2.optString("request_id", null);
                        synchronized (c.this.o) {
                            try {
                                if (strOptString == null) {
                                    SpeechError speechError4 = new SpeechError(SpeechEngine.ProcessStage.STAGE_ASR);
                                    speechError4.errCode = 12;
                                    speechError4.errType = 2;
                                    c.this.notifyError(this.e, speechError4);
                                    return;
                                }
                                if (b(mibrainRequest)) {
                                    return;
                                }
                                c.this.notifyAsrFileStored(strOptString, jSONObject.toString());
                                this.f = c.this.getNextStage(this.e, this.f);
                                cVar = c.this;
                                str2 = "RESULT_FILE_STORED stage: " + this.f;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        boolean z = false;
                        if (!"RESULT_NLP".equals(string)) {
                            if ("RESULT_TTS_BEGIN".equals(string)) {
                                for (int i = 0; i < 10 && c.this.l.isBluetoothScoOn(); i++) {
                                    synchronized (c.this.o) {
                                        c.this.o.wait(100L);
                                    }
                                }
                                String strOptString2 = jSONObject.getJSONObject("meta").getJSONObject(PlayableModel.KIND_TTS).optString("codec");
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    if (c.this.z.get()) {
                                        c cVar3 = c.this;
                                        cVar3.i = new com.xiaomi.ai.streamplayer.k(cVar3.mStreamType);
                                        c.this.i.a(strOptString2);
                                        c.this.i.a(c.this.A);
                                        c.this.i.a(c.this.x);
                                        c.this.i.a();
                                    }
                                    c.this.notifyTtsTransStart();
                                    return;
                                }
                            }
                            if ("RESULT_TTS_END".equals(string) || (this.f == SpeechEngine.ProcessStage.STAGE_TTS && "TRANSACTION_END".equals(string))) {
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    if (c.this.i != null) {
                                        c.this.i.b();
                                    }
                                    this.f = c.this.getNextStage(this.e, this.f);
                                    c.this.a("RESULT_TTS_END stage: " + this.f);
                                    boolean z2 = "RESULT_TTS_END".equals(string) || this.f == SpeechEngine.ProcessStage.STAGE_TTS;
                                    synchronized (c.this.o) {
                                        if (b(mibrainRequest)) {
                                            return;
                                        }
                                        c.this.notifyTtsTransEnd(z2);
                                        return;
                                    }
                                }
                            }
                            if ("RESULT_TTS_URL".equals(string)) {
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    c.this.notifyTtsGotUrl(jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE).toString());
                                    return;
                                }
                            }
                            if ("RESULT_VOR_REG_FINAL".equals(string)) {
                                SpeechResult voiceRegResult = c.this.mResultParser.getVoiceRegResult(jSONObject);
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    c.this.notifyVoiceRegResults(voiceRegResult);
                                    this.f = c.this.getNextStage(this.e, this.f);
                                    return;
                                }
                            }
                            if ("RESULT_VOR_FINAL".equals(string)) {
                                SpeechResult voiceRecResult = c.this.mResultParser.getVoiceRecResult(jSONObject);
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    c.this.notifyVoiceRecResults(voiceRecResult);
                                    this.f = c.this.getNextStage(this.e, this.f);
                                    return;
                                }
                            }
                            if ("RESULT_VOR_REG_PARTIAL".equals(string)) {
                                SpeechResult voiceRegResult2 = c.this.mResultParser.getVoiceRegResult(jSONObject);
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    c.this.notifyVoiceRegResults(voiceRegResult2);
                                    this.f = c.this.getNextStage(this.e, this.f);
                                    return;
                                }
                            }
                            if ("RESULT_VOR_DEL".equals(string)) {
                                SpeechResult voiceDelResult = c.this.mResultParser.getVoiceDelResult(jSONObject);
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    c.this.notifyVoiceDelResults(voiceDelResult);
                                    this.f = c.this.getNextStage(this.e, this.f);
                                    return;
                                }
                            }
                            if ("RESULT_VOR_QUERY".equals(string)) {
                                SpeechResult voiceQryResult = c.this.mResultParser.getVoiceQryResult(jSONObject);
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    c.this.notifyVoiceQryResults(voiceQryResult);
                                    this.f = c.this.getNextStage(this.e, this.f);
                                    return;
                                }
                            }
                            if ("SERVICE_EVENT".equals(string)) {
                                if (jSONObject2.has("event_level")) {
                                    this.g = jSONObject2.getString("event_level");
                                }
                                synchronized (c.this.o) {
                                    if (b(mibrainRequest)) {
                                        return;
                                    }
                                    c.this.notifyServiceEvent(new ServiceEvent(this.g, jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE)));
                                    return;
                                }
                            }
                            if ("INSTRUCTION".equals(string)) {
                                Instruction[] instruction = c.this.mResultParser.getInstruction(jSONObject);
                                synchronized (c.this.o) {
                                    if (instruction != null) {
                                        c.this.notifyInstruction(instruction, null);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        SpeechResult nlpResult = c.this.mResultParser.getNlpResult(jSONObject);
                        c.this.q = nlpResult.sessionId;
                        Instruction[] instruction2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE).has("instructions") ? c.this.mResultParser.getInstruction(jSONObject) : null;
                        boolean z3 = instruction2 != null;
                        NlpRequest nlpRequest = this.e.nlpRequest;
                        if (nlpRequest == null || !nlpRequest.discardInstructionOfNlpResult) {
                            z = z3;
                        }
                        synchronized (c.this.o) {
                            if (b(mibrainRequest)) {
                                return;
                            }
                            if (z) {
                                c.this.notifyInstruction(instruction2, nlpResult);
                            } else {
                                c.this.notifyNlpResults(nlpResult);
                            }
                            this.f = c.this.getNextStage(this.e, this.f);
                            cVar = c.this;
                            str2 = "RESULT_NLP stage: " + this.f;
                        }
                    }
                }
                cVar.a(str2);
                return;
            } catch (Exception e) {
                c.this.a("Exception in onTextMessage: ", e);
                speechError = new SpeechError(this.f);
                speechError.errType = 2;
                speechError.errCode = 1;
                speechError.errMsg = e.toString();
                synchronized (c.this.o) {
                    if (b(mibrainRequest)) {
                        return;
                    }
                    c.this.notifyError(this.e, speechError);
                }
            }
            c.this.a("Exception in onTextMessage: ", e);
            speechError = new SpeechError(this.f);
            speechError.errType = 2;
            speechError.errCode = 1;
            speechError.errMsg = e.toString();
            synchronized (c.this.o) {
                if (b(mibrainRequest)) {
                    return;
                }
                c.this.notifyError(this.e, speechError);
            }
        }

        private void a(MibrainRequest mibrainRequest, JSONObject jSONObject) {
            try {
                a aVar = this.c;
                if (aVar == null) {
                    return;
                }
                String string = jSONObject.getJSONObject("meta").getString("type");
                if ("RESULT_ASR_VAD".equals(string)) {
                    if (jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE).getBoolean("is_final")) {
                        synchronized (c.this.o) {
                            if (!b(mibrainRequest)) {
                                aVar.f();
                            }
                        }
                        return;
                    }
                    return;
                }
                if ("RESULT_ASR_FINAL".equals(string) || "RESULT_FILE_STORED".equals(string)) {
                    synchronized (c.this.o) {
                        if (!b(mibrainRequest)) {
                            aVar.f();
                        }
                    }
                    return;
                }
                return;
                c.this.a("JSONException: ", e);
            } catch (JSONException e) {
                c.this.a("JSONException: ", e);
            }
        }

        private void a(MibrainRequest mibrainRequest, byte[] bArr) {
            synchronized (c.this.o) {
                if (b(mibrainRequest)) {
                    return;
                }
                com.xiaomi.ai.streamplayer.k kVar = c.this.i;
                if (bArr != null) {
                    if (kVar != null) {
                        kVar.a(bArr, 0, bArr.length);
                    }
                } else {
                    SpeechError speechError = new SpeechError(this.f);
                    speechError.errType = 2;
                    speechError.errCode = 6;
                    speechError.errMsg = "resolveBinaryResult binary is null";
                    c.this.notifyError(this.e, speechError);
                }
            }
        }

        private boolean a(MibrainRequest mibrainRequest) {
            if (mibrainRequest == this.b) {
                return true;
            }
            SpeechError speechError = new SpeechError(this.f);
            speechError.errType = 2;
            speechError.errCode = -1;
            speechError.errMsg = "FATAL ERROR isResponseCorrect check failed !!";
            c.this.notifyError(this.e, speechError);
            return false;
        }

        private boolean b(MibrainRequest mibrainRequest) {
            boolean z;
            synchronized (c.this.o) {
                z = c.this.hasError() || c.this.m != mibrainRequest;
            }
            return z;
        }

        public String a() {
            return this.g;
        }

        public void a(a aVar) {
            this.c = aVar;
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onEventTrack(String str) {
            EventTrackListener eventTrackListener = c.this.mEventTrackListener;
            if (eventTrackListener != null) {
                eventTrackListener.onEventTrack(str);
            } else {
                Log.e(c.b, "no Need onEventTrack callback ,skip");
            }
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onInstruction(MibrainRequest mibrainRequest, String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public String onNeedUpdateToken() {
            if (c.this.mUpdateTokenCallback != null) {
                Log.e(c.b, "Need UpdateToken");
                return c.this.mUpdateTokenCallback.onNeedUpdateToken();
            }
            Log.e(c.b, "no Need UpdateToken callback ,skip");
            return null;
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestASRResult(MibrainRequest mibrainRequest, String str, boolean z) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestError(MibrainRequest mibrainRequest, String str, int i, int i2) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            synchronized (c.this.o) {
                if (b(mibrainRequest)) {
                    return;
                }
                SpeechError speechError = new SpeechError(this.f);
                if (i == 1) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
                        speechError.errCode = jSONObject2.getInt("error_code");
                        speechError.errMsg = jSONObject2.getString("error_msg");
                        speechError.requestId = jSONObject.getJSONObject("meta").getString("request_id");
                    } catch (JSONException e) {
                        speechError.errType = 2;
                        speechError.errCode = -9;
                        str = e.getMessage();
                        speechError.errMsg = str;
                    }
                    c.this.notifyError(this.e, speechError);
                }
                speechError.errType = i;
                speechError.errCode = i2;
                speechError.errMsg = str;
                c.this.notifyError(this.e, speechError);
            }
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public String onRequestGetToken(MibrainRequest mibrainRequest, boolean z) {
            String str;
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (b(mibrainRequest)) {
                return null;
            }
            m mVar = c.this.s;
            if (mVar != null) {
                m.a aVarA = mVar.a(z);
                if (aVarA != null && (str = aVarA.a) != null) {
                    return str;
                }
                synchronized (c.this.o) {
                    if (b(mibrainRequest)) {
                        return null;
                    }
                    SpeechError speechError = new SpeechError(this.f);
                    speechError.errType = 2;
                    speechError.errCode = -23;
                    StringBuilder sb = new StringBuilder();
                    sb.append("oauth getToken failed code= ");
                    sb.append(aVarA == null ? "" : Integer.valueOf(aVarA.b));
                    speechError.errMsg = sb.toString();
                    c.this.notifyError(this.e, speechError);
                }
            } else {
                Log.e(c.b, "onRequestGetToken aiOauthHelper = null ");
            }
            return null;
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestNLpResult(MibrainRequest mibrainRequest, String str) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestOtherResult(MibrainRequest mibrainRequest, String str) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestSessionEnd(MibrainRequest mibrainRequest) {
            if (a(mibrainRequest)) {
                return;
            }
            Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestSessionStart(MibrainRequest mibrainRequest) {
            if (a(mibrainRequest)) {
                return;
            }
            Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestTTSResult(MibrainRequest mibrainRequest, String str, byte[] bArr, boolean z) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                a(mibrainRequest, bArr);
            } else {
                a(mibrainRequest, str);
            }
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestVoiceprintDeleteResult(MibrainRequest mibrainRequest, String str) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestVoiceprintQueryResult(MibrainRequest mibrainRequest, String str) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestVoiceprintRecognizedResult(MibrainRequest mibrainRequest, String str) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }

        @Override // com.xiaomi.ai.mibrain.MibrainRequestListener
        public void onRequestVoiceprintRegisteredResult(MibrainRequest mibrainRequest, String str, boolean z) {
            if (!a(mibrainRequest)) {
                Log.e(c.b, " isResponseCorrect = false ,mibrainRequest = " + mibrainRequest + " this.request = " + this.b);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(mibrainRequest, str);
        }
    }

    public class e {
        private MibrainRequest c;
        private SpeechEngine.ParamBuilder d;
        private boolean e;
        private Thread f;
        private d g;
        private BlockingQueue<b> b = new LinkedBlockingDeque();
        private Runnable h = new l(this);

        public e(SpeechEngine.ParamBuilder paramBuilder) {
            this.d = paramBuilder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(b bVar) {
            this.b.add(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(d dVar) {
            this.g = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MibrainRequest mibrainRequest) {
            this.c = mibrainRequest;
        }

        private boolean a() {
            return (this.d == c.this.r && c.this.m == this.c) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b b() {
            try {
                b bVarTake = this.b.take();
                EnumC0771c enumC0771c = bVarTake.d;
                if (enumC0771c == EnumC0771c.DATA) {
                    byte[] bArr = bVarTake.a;
                    if (bArr != null && !this.e) {
                        int iAddAudioData = this.c.addAudioData(bArr, bVarTake.c, bVarTake.b);
                        if (bVarTake.b) {
                            Log.w(c.b, "add end flag");
                        }
                        if (iAddAudioData == -5) {
                            this.e = true;
                            return null;
                        }
                        if (iAddAudioData < 0) {
                            SpeechError speechError = new SpeechError(this.g.f);
                            speechError.errMsg = "sdk addAudioData failed ";
                            speechError.errCode = iAddAudioData;
                            speechError.errType = 2;
                            synchronized (c.this.o) {
                                if (!a()) {
                                    c.this.notifyError(this.d, speechError);
                                }
                            }
                            this.e = true;
                            return null;
                        }
                    } else if (bVarTake.b) {
                        Log.w(c.b, "add end flag");
                        int iAddAudioData2 = this.c.addAudioData(new byte[0], true);
                        if (iAddAudioData2 == -5) {
                            this.e = true;
                            return null;
                        }
                        if (iAddAudioData2 < 0) {
                            SpeechError speechError2 = new SpeechError(this.g.f);
                            speechError2.errMsg = "sdk addAudioData failed ";
                            speechError2.errCode = iAddAudioData2;
                            speechError2.errType = 2;
                            synchronized (c.this.o) {
                                if (!a()) {
                                    c.this.notifyError(this.d, speechError2);
                                }
                            }
                            this.e = true;
                            return null;
                        }
                    }
                } else if (enumC0771c == EnumC0771c.NLP_DATA) {
                    String str = bVarTake.e;
                    if (str != null && !this.e) {
                        int iAddNlpData = this.c.addNlpData(str);
                        if (iAddNlpData == -5) {
                            this.e = true;
                            return null;
                        }
                        if (iAddNlpData < 0) {
                            SpeechError speechError3 = new SpeechError(this.g.f);
                            speechError3.errMsg = "sdk addNlpData failed ";
                            speechError3.errCode = iAddNlpData;
                            speechError3.errType = 2;
                            synchronized (c.this.o) {
                                if (!a()) {
                                    c.this.notifyError(this.d, speechError3);
                                }
                            }
                            this.e = true;
                            return null;
                        }
                    }
                } else if (enumC0771c == EnumC0771c.VAD_BEGIN && !this.e) {
                    int iAddRawData = this.c.addRawData(UploadHelper.generateVADBeginJSON().getBytes(), 4, false, false);
                    if (iAddRawData == -5) {
                        this.e = true;
                        return null;
                    }
                    if (iAddRawData < 0) {
                        SpeechError speechError4 = new SpeechError(this.g.f);
                        speechError4.errMsg = "add VAD_BEGIN failed";
                        speechError4.errCode = iAddRawData;
                        speechError4.errType = 2;
                        synchronized (c.this.o) {
                            if (!a()) {
                                c.this.notifyError(this.d, speechError4);
                            }
                        }
                        this.e = true;
                        return null;
                    }
                }
                if (!bVarTake.b) {
                    return bVarTake;
                }
                this.e = true;
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            MibrainRequest mibrainRequest;
            return !Thread.currentThread().isInterrupted() && this.d == c.this.r && this.c.getErrorCode() == 0 && (mibrainRequest = this.c) != null && mibrainRequest == c.this.m && !this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            Thread thread = new Thread(this.h);
            this.f = thread;
            thread.start();
            Log.e(c.b, "RecorderCacheQueueHelper start ");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            this.b.add(c.this.new b(new byte[0], 0, 0, true));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            this.b.add(c.this.new b(new byte[0], 0, 0, true));
            this.e = true;
            Thread thread = this.f;
            if (thread != null) {
                thread.interrupt();
            }
        }
    }

    public c(Context context, String str, String str2) {
        super(context, str, str2);
        this.d = 0;
        this.e = null;
        this.o = new Object();
        this.p = new Object();
        this.r = null;
        this.s = null;
        this.t = 0;
        this.a = new h(this);
        this.A = new j(this);
        this.l = (AudioManager) context.getSystemService("audio");
        this.x = 1;
        this.y = Executors.newSingleThreadExecutor();
        this.z = new AtomicBoolean(true);
    }

    private String a(boolean z) {
        m.a aVarA;
        String str;
        try {
            m mVar = this.s;
            if (mVar == null || (aVarA = mVar.a(z)) == null || (str = aVarA.a) == null) {
                return null;
            }
            return str;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private String a(boolean z, String str) {
        m.a aVarA;
        String str2;
        if (str == null) {
            return null;
        }
        try {
            m mVar = this.s;
            if (mVar == null || (aVarA = mVar.a(z)) == null || (str2 = aVarA.a) == null) {
                return null;
            }
            return str2;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    private void a(SpeechEngine.ParamBuilder paramBuilder) {
        NlpRequest nlpRequest;
        NlpRequest nlpRequest2;
        int i = this.t;
        if (i == SpeechEngine.ENGINE_AUTH_MIAI && this.mOauthListener == null) {
            throw new IllegalStateException("please call setMiAIOauthCallbacks first !!");
        }
        if (i == SpeechEngine.ENGINE_AUTH_MIAO && this.mOauthListener == null) {
            throw new IllegalStateException("please call setMiAOOauthCallbacks first !!");
        }
        if (i == SpeechEngine.ENGINE_AUTH_MIOT && this.mToken == null) {
            throw new IllegalStateException("please call updateMiotAuth first !!");
        }
        endSpeech();
        endVoiceprintRegister();
        endVoiceprintRecognize();
        boolean z = paramBuilder.needTts;
        if (z && !paramBuilder.needAsr && !paramBuilder.needNlp && (nlpRequest2 = paramBuilder.ttsRequest.h) != null) {
            paramBuilder.needExtraNlp = true;
            paramBuilder.nlpRequest = nlpRequest2;
        }
        if (!z && paramBuilder.needAsr && !paramBuilder.needNlp && (nlpRequest = paramBuilder.asrRequest.n) != null) {
            paramBuilder.needExtraNlp = true;
            paramBuilder.nlpRequest = nlpRequest;
        }
        synchronized (this.o) {
            if (paramBuilder.needAsr || paramBuilder.needVpRec || paramBuilder.needVpReg) {
                this.j = true;
            }
            this.n = new e(paramBuilder);
            this.r = paramBuilder;
        }
        new Thread(new i(this, paramBuilder)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CharSequence charSequence) {
        a(charSequence, (Throwable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CharSequence charSequence, Throwable th) {
        synchronized (this.p) {
            try {
                if (th != null) {
                    Log.e(b, charSequence.toString(), th);
                    this.c.append((CharSequence) (((Object) charSequence) + th.toString()));
                } else {
                    Log.i(b, charSequence.toString());
                    this.c.append(charSequence);
                }
                this.c.append((CharSequence) "\n");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MibrainRequestParams b(SpeechEngine.ParamBuilder paramBuilder) throws JSONException {
        NlpRequest nlpRequest;
        NlpRequest nlpRequest2;
        JSONArray jSONArray;
        JSONObject jSONObject;
        int i;
        int i2;
        boolean z;
        EventRequest eventRequest;
        String str;
        TtsRequest ttsRequest;
        int i3;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        MibrainRequestParamsBuilder mibrainRequestParamsBuilder = new MibrainRequestParamsBuilder();
        mibrainRequestParamsBuilder.setAppId(this.mAppId).setToken(this.mToken).setApiKey(this.u);
        if (this.mUseExternalOAuthToken == 0 && ((i3 = this.t) == SpeechEngine.ENGINE_AUTH_MIAI || i3 == SpeechEngine.ENGINE_AUTH_MIAO)) {
            mibrainRequestParamsBuilder.setToken(null);
        } else {
            Log.d("OAuth", "UseExternalOAuthToken");
        }
        mibrainRequestParamsBuilder.setProtocolVersion(this.mProtocolVersion);
        mibrainRequestParamsBuilder.setEventLevel(paramBuilder.mEventLevel);
        mibrainRequestParamsBuilder.setApiKey(paramBuilder.apiKey);
        mibrainRequestParamsBuilder.setConnectTimeOut(this.mConnectTimeout);
        mibrainRequestParamsBuilder.setReceiverTimeOut(this.mReceiveTimeout);
        mibrainRequestParamsBuilder.setUploadTimeout(this.mUploadTimeout);
        mibrainRequestParamsBuilder.setActiveTimeout(this.mActiveTimeout);
        mibrainRequestParamsBuilder.setEnv(this.d);
        mibrainRequestParamsBuilder.setAuthMode(this.t);
        mibrainRequestParamsBuilder.setNeedExtraNLP(paramBuilder.needExtraNlp ? 1 : 0);
        mibrainRequestParamsBuilder.setStartEventTrack(this.mStartEventTrack);
        mibrainRequestParamsBuilder.setEventTrackReceiver(this.mEventTrackReceiver);
        mibrainRequestParamsBuilder.setUseExternalOAuthToken(this.mUseExternalOAuthToken);
        if (paramBuilder.needWakeupData) {
            mibrainRequestParamsBuilder.setWakeupInfo(paramBuilder.wakeupInfoString);
            mibrainRequestParamsBuilder.setNeedWakeupData(true);
        }
        if (paramBuilder.needAsr) {
            mibrainRequestParamsBuilder.setChannels(1);
            AsrRequest asrRequest = paramBuilder.asrRequest;
            mibrainRequestParamsBuilder.setMaxEmptyAudioTime((asrRequest == null || !asrRequest.b) ? 4 : 8);
            mibrainRequestParamsBuilder.setAudioBitNum(16);
            mibrainRequestParamsBuilder.setSampleRate(16000);
            mibrainRequestParamsBuilder.setAsrLang(paramBuilder.asrRequest.f);
            AsrRequest asrRequest2 = paramBuilder.asrRequest;
            mibrainRequestParamsBuilder.setIsForSai(asrRequest2 != null && asrRequest2.b);
            mibrainRequestParamsBuilder.setPreAsrTrack(paramBuilder.asrRequest.g);
            mibrainRequestParamsBuilder.setAsrRemoveEndPunc(paramBuilder.asrRequest.c);
            mibrainRequestParamsBuilder.setCodecMode(paramBuilder.asrRequest.h);
            mibrainRequestParamsBuilder.setOpusBitRates(paramBuilder.asrRequest.j);
            mibrainRequestParamsBuilder.setOpusFrameSize(paramBuilder.asrRequest.i);
            mibrainRequestParamsBuilder.setASRDialect(paramBuilder.asrRequest.k);
            mibrainRequestParamsBuilder.setASRDisableTimeout(paramBuilder.asrRequest.l ? 1 : 0);
            mibrainRequestParamsBuilder.setASRAudioMaxTime(paramBuilder.asrRequest.m);
            AsrRequest asrRequest3 = paramBuilder.asrRequest;
            if (asrRequest3 != null) {
                mibrainRequestParamsBuilder.setASRVendor(asrRequest3.a());
            }
        }
        if (paramBuilder.needTts) {
            new JSONObject().put("codec", "mp3");
            mibrainRequestParamsBuilder.setTTSCodec("mp3");
            TtsRequest ttsRequest2 = paramBuilder.ttsRequest;
            if (ttsRequest2 != null) {
                mibrainRequestParamsBuilder.setTTSVendor(ttsRequest2.a());
                mibrainRequestParamsBuilder.setTTSTimeout(paramBuilder.ttsRequest.b);
                if (this.mContext.getPackageName().equals("com.zmifi.phoneai")) {
                    mibrainRequestParamsBuilder.setTTSLang(paramBuilder.ttsRequest.g);
                }
            }
        }
        AsrRequest asrRequest4 = paramBuilder.asrRequest;
        if (asrRequest4 != null) {
            mibrainRequestParamsBuilder.setUseInternalVadFlag(asrRequest4.a);
        }
        AsrRequest asrRequest5 = paramBuilder.asrRequest;
        if (asrRequest5 != null) {
            mibrainRequestParamsBuilder.setVadTypeLocal(asrRequest5.e == AsrRequest.VadMode.VAD_MODE_LOCAL ? MibrainRequestParamsBuilder.VadMode.VAD_MODE_LOCAL : MibrainRequestParamsBuilder.VadMode.VAD_MODE_CLOUD);
        }
        String strB = com.xiaomi.ai.utils.n.b(this.mContext);
        mibrainRequestParamsBuilder.setScopeData(com.xiaomi.ai.utils.n.b(strB));
        mibrainRequestParamsBuilder.setDeviceId(strB);
        JSONObject jSONObject2 = new JSONObject();
        if (activeNetworkInfo != null) {
            jSONObject2.put("network", activeNetworkInfo.getType() == 0 ? "mobile" : "wifi");
        }
        if (!TextUtils.isEmpty(this.mDeviceModel)) {
            jSONObject2.put("model", this.mDeviceModel);
        }
        jSONObject2.put("ip", "");
        if ((paramBuilder.needNlp || paramBuilder.needExtraNlp) && (nlpRequest = paramBuilder.nlpRequest) != null) {
            Float f2 = nlpRequest.latitude;
            if (f2 != null && nlpRequest.longitude != null) {
                jSONObject2.put(Constant.KEY_LATITUDE, f2);
                jSONObject2.put(Constant.KEY_LONGITUDE, paramBuilder.nlpRequest.longitude);
            } else if (nlpRequest.locationEnable) {
                Location locationA = com.xiaomi.ai.utils.b.a(this.mContext);
                if (locationA != null) {
                    jSONObject2.put(Constant.KEY_LATITUDE, locationA.getLatitude());
                    jSONObject2.put(Constant.KEY_LONGITUDE, locationA.getLongitude());
                } else {
                    Log.e(b, "location is null");
                }
            }
            String str2 = paramBuilder.nlpRequest.nlpVersion;
            if (str2 == null) {
                str2 = "2.2";
            }
            mibrainRequestParamsBuilder.setCustomNLPVersion(str2);
            jSONObject2.put("time_zone", TimeZone.getDefault().getID());
            jSONObject2.put("time_zone_display_name", TimeZone.getDefault().getDisplayName());
            mibrainRequestParamsBuilder.setIsPendingSend(paramBuilder.nlpRequest.isPendingSend);
        }
        String property = this.mUserAgent;
        if (property == null) {
            property = System.getProperty("http.agent");
        }
        mibrainRequestParamsBuilder.setUserAgent(property);
        mibrainRequestParamsBuilder.setDevice(jSONObject2.toString());
        if (paramBuilder.needTts && (ttsRequest = paramBuilder.ttsRequest) != null) {
            mibrainRequestParamsBuilder.setTTSText(ttsRequest.a);
            mibrainRequestParamsBuilder.setTTSTone(paramBuilder.ttsRequest.e);
            mibrainRequestParamsBuilder.setTTSVolume(paramBuilder.ttsRequest.d);
            mibrainRequestParamsBuilder.setTTSSpeed(paramBuilder.ttsRequest.c);
            mibrainRequestParamsBuilder.setTTSAsFileUrl(paramBuilder.ttsRequest.f ? 1 : 0);
        }
        String str3 = this.e;
        if (str3 != null) {
            if (this.d != 2) {
                Log.e(b, "only STAGING env  can setCustomNLPApi !!!!");
                return null;
            }
            mibrainRequestParamsBuilder.setCustomNLPApi(str3);
            mibrainRequestParamsBuilder.setCustomNLPAppId(this.mAppId);
            mibrainRequestParamsBuilder.setCustomNLPAppToken(this.mToken);
        }
        if ((paramBuilder.needNlp || paramBuilder.needExtraNlp) && (nlpRequest2 = paramBuilder.nlpRequest) != null) {
            mibrainRequestParamsBuilder.setNLPText(nlpRequest2.getTextToProcess());
            JSONObject jSONObject3 = new JSONObject();
            boolean z2 = paramBuilder.nlpRequest.startNewSession;
            if (z2) {
                this.q = "";
            }
            jSONObject3.put("is_new", z2);
            String str4 = paramBuilder.nlpRequest.mSessionId;
            if (str4 == null) {
                str4 = this.q;
            }
            jSONObject3.put("id", str4);
            mibrainRequestParamsBuilder.setNLPSession(jSONObject3.toString());
            JSONObject jSONObject4 = paramBuilder.nlpRequest.device;
            if (jSONObject4 != null) {
                mibrainRequestParamsBuilder.setDevice(jSONObject4.toString());
            }
            JSONObject jSONObject5 = paramBuilder.nlpRequest.speechData;
            if (jSONObject5 != null) {
                mibrainRequestParamsBuilder.setNLPSpeechData(jSONObject5.toString());
            }
            NlpRequest.UserInfo userInfo = paramBuilder.nlpRequest.userInfo;
            if (userInfo != null) {
                mibrainRequestParamsBuilder.setNLPUserInfoIdType(userInfo.userType);
                mibrainRequestParamsBuilder.setNLPUserInfoId(paramBuilder.nlpRequest.userInfo.userId);
                mibrainRequestParamsBuilder.setNLPUserInfoExtend(paramBuilder.nlpRequest.userInfo.extend);
            }
            NlpRequest nlpRequest3 = paramBuilder.nlpRequest;
            if (nlpRequest3.contextMap != null || nlpRequest3.contextStrMap != null) {
                JSONObject jSONObject6 = new JSONObject();
                ConcurrentHashMap<String, String> concurrentHashMap = paramBuilder.nlpRequest.contextMap;
                if (concurrentHashMap != null) {
                    for (String str5 : concurrentHashMap.keySet()) {
                        try {
                            String strTrim = paramBuilder.nlpRequest.contextMap.get(str5).trim();
                            if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
                                jSONArray = new JSONArray(strTrim);
                                jSONObject = null;
                            } else {
                                jSONObject = new JSONObject(strTrim);
                                jSONArray = null;
                            }
                        } catch (JSONException e2) {
                            Log.e(b, "JSONException when set context for key: " + str5, e2);
                            jSONArray = null;
                            jSONObject = null;
                        }
                        if (jSONArray != null) {
                            jSONObject6.put(str5, jSONArray);
                        } else if (jSONObject != null) {
                            jSONObject6.put(str5, jSONObject);
                        }
                    }
                }
                ConcurrentHashMap<String, String> concurrentHashMap2 = paramBuilder.nlpRequest.contextStrMap;
                if (concurrentHashMap2 != null) {
                    for (String str6 : concurrentHashMap2.keySet()) {
                        jSONObject6.put(str6, paramBuilder.nlpRequest.contextStrMap.get(str6));
                    }
                }
                mibrainRequestParamsBuilder.setNLPContext(jSONObject6.toString());
            }
            JSONObject jSONObject7 = paramBuilder.nlpRequest.context;
            if (jSONObject7 != null) {
                mibrainRequestParamsBuilder.setNLPContext(jSONObject7.toString());
            }
            String str7 = paramBuilder.nlpRequest.requestId;
            if (str7 != null) {
                mibrainRequestParamsBuilder.setRequestId(str7);
            }
        }
        VoiceprintRegisterRequest voiceprintRegisterRequest = paramBuilder.voiceprintRegisterRequest;
        if (voiceprintRegisterRequest != null && paramBuilder.needVpReg) {
            mibrainRequestParamsBuilder.setVoiceprintUserId(voiceprintRegisterRequest.userId);
            mibrainRequestParamsBuilder.setVoiceprintFamilyId(paramBuilder.voiceprintRegisterRequest.family);
            mibrainRequestParamsBuilder.setVoiceprintQueries(paramBuilder.voiceprintRegisterRequest.query);
            mibrainRequestParamsBuilder.setVoiceprintVendor(paramBuilder.voiceprintRegisterRequest.vendorStr);
            mibrainRequestParamsBuilder.setVoiceId(paramBuilder.voiceprintRegisterRequest.voiceId);
            mibrainRequestParamsBuilder.setVoiceprintDisableTextDependent(paramBuilder.voiceprintRegisterRequest.disableTextDependent);
        }
        VoiceprintDeleteRequest voiceprintDeleteRequest = paramBuilder.voiceprintDeleteRequest;
        if (voiceprintDeleteRequest != null && paramBuilder.needVpDel) {
            mibrainRequestParamsBuilder.setVoiceprintDeleteIds(voiceprintDeleteRequest.ids.toString());
            mibrainRequestParamsBuilder.setVoiceprintFamilyId(paramBuilder.voiceprintDeleteRequest.family);
            mibrainRequestParamsBuilder.setVoiceprintVendor(paramBuilder.voiceprintDeleteRequest.vendorStr);
        }
        VoiceprintQueryRequest voiceprintQueryRequest = paramBuilder.voiceprintQueryRequest;
        if (voiceprintQueryRequest != null && paramBuilder.needVpQry) {
            mibrainRequestParamsBuilder.setVoiceprintFamilyId(voiceprintQueryRequest.family);
            mibrainRequestParamsBuilder.setVoiceprintVendor(paramBuilder.voiceprintQueryRequest.vendorStr);
        }
        VoiceprintRecognizeRequest voiceprintRecognizeRequest = paramBuilder.voiceprintRecognizeRequest;
        if (voiceprintRecognizeRequest != null && paramBuilder.needVpRec) {
            mibrainRequestParamsBuilder.setVoiceprintQueries(voiceprintRecognizeRequest.query);
            mibrainRequestParamsBuilder.setVoiceprintFamilyId(paramBuilder.voiceprintRecognizeRequest.family);
            mibrainRequestParamsBuilder.setVoiceprintUserId(paramBuilder.voiceprintRecognizeRequest.id);
            mibrainRequestParamsBuilder.setVoiceprintVendor(paramBuilder.voiceprintRecognizeRequest.vendorStr);
            mibrainRequestParamsBuilder.setVoiceprintDisableTextDependent(paramBuilder.voiceprintRecognizeRequest.disableTextDependent);
        }
        if (paramBuilder.needEvent && (eventRequest = paramBuilder.eventRequest) != null) {
            mibrainRequestParamsBuilder.setEventNameSpace(eventRequest.a);
            mibrainRequestParamsBuilder.setEventName(paramBuilder.eventRequest.b);
            mibrainRequestParamsBuilder.setEventPayload(paramBuilder.eventRequest.c);
            if (!paramBuilder.eventRequest.h && (str = this.q) != null && !str.isEmpty()) {
                mibrainRequestParamsBuilder.setEventSessionId(this.q);
            }
            mibrainRequestParamsBuilder.setEventContextNameSpace(paramBuilder.eventRequest.d);
            mibrainRequestParamsBuilder.setEventContextName(paramBuilder.eventRequest.e);
            mibrainRequestParamsBuilder.setEventContextPayload(paramBuilder.eventRequest.f);
            JSONObject jSONObject8 = paramBuilder.eventRequest.i;
            if (jSONObject8 != null) {
                mibrainRequestParamsBuilder.setDevice(jSONObject8.toString());
            }
        }
        boolean z3 = paramBuilder.needAsr;
        try {
            if (z3 && !(z = paramBuilder.needTts) && !paramBuilder.needNlp && !z && !paramBuilder.needVpReg && !paramBuilder.needVpRec && !paramBuilder.needVpQry && !paramBuilder.needVpDel) {
                i = MibrainRequestParamsBuilder.MI_CMD_ASR;
            } else if (z3 && paramBuilder.needNlp && !paramBuilder.needTts && !paramBuilder.needVpReg && !paramBuilder.needVpRec && !paramBuilder.needVpQry && !paramBuilder.needVpDel) {
                i = MibrainRequestParamsBuilder.MI_CMD_ASR_NLP;
            } else if (z3 && paramBuilder.needNlp && paramBuilder.needTts && !paramBuilder.needVpReg && !paramBuilder.needVpRec && !paramBuilder.needVpQry && !paramBuilder.needVpDel) {
                i = MibrainRequestParamsBuilder.MI_CMD_ASR_NLP_TTS;
            } else if (!z3 && paramBuilder.needNlp && !paramBuilder.needTts && !paramBuilder.needVpReg && !paramBuilder.needVpRec && !paramBuilder.needVpQry && !paramBuilder.needVpDel) {
                i = MibrainRequestParamsBuilder.MI_CMD_NLP;
            } else if (z3 || !paramBuilder.needNlp || !paramBuilder.needTts || paramBuilder.needVpReg || paramBuilder.needVpRec || paramBuilder.needVpQry || paramBuilder.needVpDel) {
                if (z3 || paramBuilder.needNlp || !paramBuilder.needTts || paramBuilder.needVpReg || paramBuilder.needVpRec || paramBuilder.needVpQry || paramBuilder.needVpDel) {
                    boolean z4 = paramBuilder.needVpReg;
                    if (!z4 || z3 || paramBuilder.needNlp || paramBuilder.needTts || paramBuilder.needVpDel || paramBuilder.needVpQry || paramBuilder.needVpRec) {
                        boolean z5 = paramBuilder.needVpRec;
                        if (!z5 || z3 || paramBuilder.needNlp || paramBuilder.needTts || paramBuilder.needVpDel || paramBuilder.needVpQry || z4) {
                            boolean z6 = paramBuilder.needVpDel;
                            if (z6 && !z3 && !paramBuilder.needNlp && !paramBuilder.needTts && !z5 && !paramBuilder.needVpQry && !z4) {
                                i = MibrainRequestParamsBuilder.MI_CMD_VOR_DELETE;
                            } else if (!paramBuilder.needVpQry || z3 || paramBuilder.needNlp || paramBuilder.needTts || z5 || z6 || z4) {
                                if (!paramBuilder.needEvent) {
                                    throw new IllegalArgumentException("needAsr:" + paramBuilder.needAsr + ",needNlp:" + paramBuilder.needNlp + ",needTts:" + paramBuilder.needTts + ",needVpReg:" + paramBuilder.needVpReg + ",needVpDel:" + paramBuilder.needVpDel + ",needVpRec:" + paramBuilder.needVpRec + ",needVpQry:" + paramBuilder.needVpQry + ",needEvent:" + paramBuilder.needEvent + "  combine Illegally ");
                                }
                                i = paramBuilder.eventRequest.g ? MibrainRequestParamsBuilder.MI_CMD_EVENT_TTS : MibrainRequestParamsBuilder.MI_CMD_EVENT;
                            } else {
                                i = MibrainRequestParamsBuilder.MI_CMD_VOR_QUERY;
                            }
                        } else {
                            i2 = MibrainRequestParamsBuilder.MI_CMD_VOR;
                        }
                    } else {
                        i2 = MibrainRequestParamsBuilder.MI_CMD_VOR_REG;
                    }
                    mibrainRequestParamsBuilder.setRequestCmd(i2);
                    mibrainRequestParamsBuilder.setReceiverTimeOut(this.mReceiveTimeout * 2);
                    return mibrainRequestParamsBuilder.buid();
                }
                i = MibrainRequestParamsBuilder.MI_CMD_TTS;
            } else {
                i = MibrainRequestParamsBuilder.MI_CMD_NLP_TTS;
            }
            return mibrainRequestParamsBuilder.buid();
        } catch (MibrainException e3) {
            e3.printStackTrace();
            throw new IllegalArgumentException(e3);
        }
        mibrainRequestParamsBuilder.setRequestCmd(i);
    }

    private String b() {
        String strB;
        Context context = this.mContext;
        return (context == null || (strB = com.xiaomi.ai.utils.n.b(context)) == null) ? "" : com.xiaomi.ai.utils.n.b(strB);
    }

    public CharSequence a() {
        return this.c;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void addBuffer(byte[] bArr, int i, int i2) {
        e eVar = this.n;
        if (eVar == null) {
            throw new IllegalStateException("you should call doStartIntegrally first !!");
        }
        eVar.a(new b(bArr, i, i2, false));
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void addNlpData(JSONObject jSONObject) {
        e eVar = this.n;
        if (eVar == null) {
            throw new IllegalStateException("you should call doStartIntegrally first !!");
        }
        eVar.a(new b(jSONObject.toString(), EnumC0771c.NLP_DATA));
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void addVADBegin() {
        e eVar = this.n;
        if (eVar == null) {
            throw new IllegalStateException("you should call doStartIntegrally first 1!!");
        }
        eVar.a(new b(EnumC0771c.VAD_BEGIN));
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void cancelTTS() {
        synchronized (this.o) {
            com.xiaomi.ai.streamplayer.k kVar = this.i;
            if (kVar != null) {
                kVar.c();
                this.i = null;
            }
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void cleanAllUserLoginData() {
        try {
            m mVar = this.s;
            if (mVar != null) {
                mVar.e();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void cleanUserLoginData() {
        try {
            m mVar = this.s;
            if (mVar != null) {
                if (mVar.a() == null) {
                    Log.e(b, "oAuth is null");
                } else {
                    this.s.d();
                }
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void cleanUserLoginData(String str) {
        try {
            m mVar = this.s;
            if (mVar != null) {
                if (mVar.a(str) != null) {
                    this.s.c(str);
                    return;
                }
                Log.e(b, "oAuth is null " + str);
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doAsyncTrackUpload(HTTPCallback hTTPCallback, TrackInfo trackInfo, String str) {
        com.xiaomi.ai.utils.k kVar = this.mTrackUtils;
        if (kVar != null) {
            kVar.a(this.d);
            this.mTrackUtils.a(hTTPCallback, trackInfo, str, getAuthorizationValue(), this.t);
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doAsyncTrackUpload(TrackInfo trackInfo, String str) {
        com.xiaomi.ai.utils.k kVar = this.mTrackUtils;
        if (kVar != null) {
            kVar.a(this.d);
            com.xiaomi.ai.utils.k kVar2 = this.mTrackUtils;
            kVar2.a(kVar2.a(), trackInfo, str, getAuthorizationValue(), this.t);
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doDeleteVoiceprint(VoiceprintDeleteRequest voiceprintDeleteRequest) {
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needVpDel = true;
        paramBuilder.setApiKey(this.u);
        paramBuilder.voiceprintDeleteRequest = voiceprintDeleteRequest;
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        paramBuilder.setApiKey(this.u);
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doListenSpeech(AsrRequest asrRequest) {
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needAsr();
        paramBuilder.setApiKey(this.u);
        paramBuilder.setAsrRequest(asrRequest);
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doQueryVoiceprint(VoiceprintQueryRequest voiceprintQueryRequest) {
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needVpQry = true;
        paramBuilder.setApiKey(this.u);
        paramBuilder.voiceprintQueryRequest = voiceprintQueryRequest;
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        paramBuilder.setApiKey(this.u);
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doSemanticsParse(NlpRequest nlpRequest) {
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needNlp();
        paramBuilder.setApiKey(this.u);
        paramBuilder.setNlpRequest(nlpRequest);
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doSpeak(TtsRequest ttsRequest) {
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needTts();
        paramBuilder.setApiKey(this.u);
        paramBuilder.setTtsRequest(ttsRequest);
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doStartIntegrally(SpeechEngine.ParamBuilder paramBuilder) {
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        paramBuilder.setApiKey(this.u);
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doVoiceprintRecognize(VoiceprintRecognizeRequest voiceprintRecognizeRequest) {
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needVpRec = true;
        paramBuilder.setApiKey(this.u);
        paramBuilder.voiceprintRecognizeRequest = voiceprintRecognizeRequest;
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void doVoiceprintRegister(VoiceprintRegisterRequest voiceprintRegisterRequest) {
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needVpReg = true;
        paramBuilder.setApiKey(this.u);
        paramBuilder.voiceprintRegisterRequest = voiceprintRegisterRequest;
        synchronized (this.p) {
            this.c = new SpannableStringBuilder();
        }
        a(paramBuilder);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void endSpeech() {
        this.j = false;
        e eVar = this.n;
        if (eVar != null) {
            eVar.a(new b(new byte[0], 0, 0, true));
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void endVoiceprintRecognize() {
        this.j = false;
        e eVar = this.n;
        if (eVar != null) {
            eVar.a(new b(new byte[0], 0, 0, true));
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void endVoiceprintRegister() {
        this.j = false;
        e eVar = this.n;
        if (eVar != null) {
            eVar.a(new b(new byte[0], 0, 0, true));
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void forceStop() {
        synchronized (this.o) {
            super.forceStop();
            com.xiaomi.ai.streamplayer.k kVar = this.i;
            if (kVar != null) {
                kVar.c();
                this.i = null;
            }
            e eVar = this.n;
            if (eVar != null) {
                eVar.f();
                this.n = null;
            }
            a aVar = this.k;
            if (aVar != null) {
                aVar.interrupt();
                this.k = null;
            }
            MibrainRequest mibrainRequest = this.m;
            if (mibrainRequest != null) {
                mibrainRequest.asyncStopRequest();
                this.m = null;
            }
            this.r = null;
            setBluetoothOn(false);
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public String getAuthorizationValue() {
        return getAuthorizationValue(false);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public String getAuthorizationValue(boolean z) {
        String str;
        String str2;
        String strA;
        String str3;
        String str4;
        int i = this.t;
        if (i == SpeechEngine.ENGINE_AUTH_MIOT) {
            String str5 = this.mAppId;
            if (str5 == null || (str4 = this.mToken) == null) {
                return null;
            }
            return String.format("MIOT-TOKEN-V1 app_id:%s,%s", str5, str4);
        }
        if (i == SpeechEngine.ENGINE_AUTH_MIAI) {
            String strA2 = a(z);
            if (strA2 == null) {
                return null;
            }
            return String.format("DO-TOKEN-V1 app_id:%s,scope_data:%s,access_token:%s", this.mAppId, b(), strA2);
        }
        if (i == SpeechEngine.ENGINE_AUTH_MIAO) {
            String strA3 = a(z);
            if (strA3 == null) {
                return null;
            }
            return String.format("AO-TOKEN-V1 dev_app_id:%s,access_token:%s", this.mAppId, strA3);
        }
        if (i == SpeechEngine.ENGINE_AUTH_ANONYMOUS) {
            strA = a(z, this.mAppId);
            if (strA == null) {
                str3 = "anon";
                Log.d(str3, "failed");
                return null;
            }
            return this.s.a(this.mAppId, this.u, strA);
        }
        if (i != SpeechEngine.ENGINE_AUTH_ANONYMOUS_PROXY) {
            if (i != SpeechEngine.ENGINE_AUTH_TP || (str = this.mAppId) == null || (str2 = this.mToken) == null) {
                return null;
            }
            return String.format("TP-TOKEN-V1 app_id:%s,access_token:%s", str, str2);
        }
        strA = a(z, this.mAppId);
        if (strA == null) {
            str3 = "anon proxy";
            Log.d(str3, "failed");
            return null;
        }
        return this.s.a(this.mAppId, this.u, strA);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public boolean getOAuthStatus() {
        StringBuilder sb;
        m mVar = this.s;
        if (mVar == null) {
            return false;
        }
        int i = this.t;
        if (i == SpeechEngine.ENGINE_AUTH_ANONYMOUS || i == SpeechEngine.ENGINE_AUTH_ANONYMOUS_PROXY) {
            if (mVar.a(this.mAppId) != null) {
                return true;
            }
            sb = new StringBuilder();
        } else {
            if (mVar.a() != null) {
                return true;
            }
            sb = new StringBuilder();
        }
        sb.append("NO AUTH DATA, mode ");
        sb.append(this.t);
        Log.d(b, sb.toString());
        return false;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public String getResourceDetails(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String authorizationValue = getAuthorizationValue();
        if (authorizationValue == null) {
            a(true);
            authorizationValue = getAuthorizationValue();
            if (authorizationValue == null) {
                return null;
            }
        }
        return MibrainRequest.getResourceDetails(str, str2, authorizationValue, this.d);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public UploadHelper getUploadHelper(SendWakeupDataStatusInterface sendWakeupDataStatusInterface) {
        UploadHelper uploadHelper = new UploadHelper();
        if (uploadHelper.startUploadRequest(sendWakeupDataStatusInterface, this.s, this.d, this.t, this.mAppId, this.mToken, this.u, com.xiaomi.ai.utils.n.b(com.xiaomi.ai.utils.n.b(this.mContext))) != 0) {
            return null;
        }
        return uploadHelper;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void init(Context context, String str, int i) {
        super.init(context, str, i);
        Log.setJNILogHook(true);
        Mibrainsdk.setLogLevel(Mibrainsdk.MIBRAIN_DEBUG_LEVEL_WARNING);
        int i2 = SpeechEngine.ENGINE_AUTH_MIAI;
        if (i == i2 || i == SpeechEngine.ENGINE_AUTH_MIAO || i == SpeechEngine.ENGINE_AUTH_ANONYMOUS || i == SpeechEngine.ENGINE_AUTH_ANONYMOUS_PROXY) {
            m mVar = new m(context, str, this.mToken, this.mAppId);
            this.s = mVar;
            mVar.b();
            this.s.a(i != i2 ? 0 : 1);
            if (i == SpeechEngine.ENGINE_AUTH_ANONYMOUS || i == SpeechEngine.ENGINE_AUTH_ANONYMOUS_PROXY) {
                this.s.a(str, com.xiaomi.ai.utils.n.b(context), new com.xiaomi.ai.utils.g(context).d(), i);
                this.u = str;
            }
        }
        this.t = i;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void release() {
        super.release();
        synchronized (this.o) {
            m mVar = this.s;
            if (mVar != null) {
                mVar.c();
                this.s = null;
            }
            e eVar = this.n;
            if (eVar != null) {
                eVar.f();
                this.n = null;
            }
            setBluetoothOn(false);
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public int sendPendingNLPData(NlpRequest nlpRequest) {
        nlpRequest.setIsPendingSend(0);
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needNlp();
        paramBuilder.setApiKey(this.u);
        paramBuilder.setNlpRequest(nlpRequest);
        try {
            MibrainRequestParams mibrainRequestParamsB = b(paramBuilder);
            if (this.m == null) {
                Log.e(b, "NULL ERROR");
            }
            MibrainRequest mibrainRequest = this.m;
            if (mibrainRequest == null) {
                return -1;
            }
            mibrainRequest.updateRequestParams(mibrainRequestParamsB);
            return this.m.sendPendingData();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void sendWakeupData(SendWakeupDataStatusInterface sendWakeupDataStatusInterface, String str, String str2, String str3, int i, int i2, String str4, byte[] bArr) {
        g gVar = new g(this, i, str3, str, str2, i2, str4, bArr, new f(this, sendWakeupDataStatusInterface));
        ExecutorService executorService = this.y;
        if (executorService != null) {
            executorService.execute(gVar);
        } else if (sendWakeupDataStatusInterface != null) {
            sendWakeupDataStatusInterface.onSendError("ThreadPool error");
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setAnonymousAuthCallbacks(MiAiOauthCallbacks miAiOauthCallbacks) {
        super.setMiAIOauthCallbacks(miAiOauthCallbacks);
        Objects.requireNonNull(miAiOauthCallbacks, "aiOauthListener is null");
        int i = this.t;
        if (i != SpeechEngine.ENGINE_AUTH_ANONYMOUS && i != SpeechEngine.ENGINE_AUTH_ANONYMOUS_PROXY) {
            throw new IllegalArgumentException("setMiAOOauthCallbacks is only for ENGINE_AUTH_ANONYMOUS");
        }
        this.s.a(miAiOauthCallbacks);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public boolean setAuthorizationTokens(String str, String str2, long j) {
        m mVar = this.s;
        if (mVar != null) {
            return mVar.a(this.t, this.mAppId, str, str2, j);
        }
        Log.e(b, "setAuthorizationTokens: mOauthHelper is null\n");
        return false;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setCustomNlpUrl(String str) {
        this.e = str;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setEnv(int i) {
        setEnv(i, this.mAppId, this.mToken);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setEnv(int i, String str) {
        setEnv(i, str, this.mToken);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setEnv(int i, String str, String str2) {
        m mVar = this.s;
        if (mVar != null) {
            mVar.b(i);
        }
        this.d = i;
        this.mAppId = str;
        this.mToken = str2;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setExternalOAuthToken(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("OAuth token  is empty");
        }
        setUseExternalOAuthToken(true);
        this.mToken = str;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setMiAIOauthCallbacks(MiAiOauthCallbacks miAiOauthCallbacks) {
        super.setMiAIOauthCallbacks(miAiOauthCallbacks);
        Objects.requireNonNull(miAiOauthCallbacks, "aiOauthListener is null");
        if (this.t != SpeechEngine.ENGINE_AUTH_MIAI) {
            throw new IllegalArgumentException("setMiAOOauthCallbacks is only for ENGINE_AUTH_MIAO");
        }
        this.s.a(miAiOauthCallbacks);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setMiAOOauthCallbacks(MiAiOauthCallbacks miAiOauthCallbacks) {
        super.setMiAIOauthCallbacks(miAiOauthCallbacks);
        Objects.requireNonNull(miAiOauthCallbacks, "aiOauthListener is null");
        if (this.t != SpeechEngine.ENGINE_AUTH_MIAO) {
            throw new IllegalArgumentException("setMiAOOauthCallbacks is only for ENGINE_AUTH_MIAO");
        }
        this.s.a(miAiOauthCallbacks);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setTTSMode(int i) {
        this.x = i;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setTrackUploadCallback(HTTPCallback hTTPCallback) {
        this.mTrackUtils.a(hTTPCallback);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void setTtsEnable(boolean z) {
        synchronized (this.o) {
            this.z.set(z);
        }
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public int startUploadASRRecord(SendWakeupDataStatusInterface sendWakeupDataStatusInterface, UploadHelper.ASRRecordInfo aSRRecordInfo, byte[] bArr) {
        if (sendWakeupDataStatusInterface == null) {
            return -1;
        }
        com.xiaomi.ai.e eVar = new com.xiaomi.ai.e(this, sendWakeupDataStatusInterface, aSRRecordInfo, bArr);
        ExecutorService executorService = this.y;
        if (executorService != null) {
            executorService.execute(eVar);
            return 0;
        }
        sendWakeupDataStatusInterface.onSendError("ThreadPool error");
        return -1;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public int startUploadWakeupData(SendWakeupDataStatusInterface sendWakeupDataStatusInterface, UploadHelper.WakeupDataInfo wakeupDataInfo, byte[] bArr) {
        if (sendWakeupDataStatusInterface == null) {
            return -1;
        }
        com.xiaomi.ai.d dVar = new com.xiaomi.ai.d(this, sendWakeupDataStatusInterface, wakeupDataInfo, bArr);
        ExecutorService executorService = this.y;
        if (executorService != null) {
            executorService.execute(dVar);
            return 0;
        }
        sendWakeupDataStatusInterface.onSendError("ThreadPool error");
        return -1;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public boolean updateAnonymousProxyArgs(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.t != SpeechEngine.ENGINE_AUTH_ANONYMOUS_PROXY) {
            Log.e(ContentDirectory.ERROR, "wrong mode " + this.t);
            return false;
        }
        m mVar = this.s;
        if (mVar == null || mVar.a(str, str2, str3, str4, str5, str6) != 0) {
            return false;
        }
        this.w = str;
        this.mAppId = str;
        this.mToken = str2;
        this.u = str3;
        return true;
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void updateMiotAuth(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Miot token or session  is empty");
        }
        this.mToken = String.format(Locale.getDefault(), "session_id:%s,token:%s", str2, str);
    }

    @Override // com.xiaomi.ai.SpeechEngine
    public void updateTPAuth(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(" token  is empty");
        }
        this.mToken = str;
    }
}

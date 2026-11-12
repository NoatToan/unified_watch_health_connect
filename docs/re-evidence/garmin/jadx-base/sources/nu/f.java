package nu;

import am.j;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.audiofx.LoudnessEnhancer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.util.MimeTypes;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lnu/f;", "Lnu/b;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends nu.b implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f127880p = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f127881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AudioManager f127882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f127883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f127884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f127885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f127886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LoudnessEnhancer f127887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AudioFocusRequest f127888o;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        context.getClass();
        Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        systemService.getClass();
        this.f127882i = (AudioManager) systemService;
        this.f127886m = "";
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(12).setContentType(1).build()).setOnAudioFocusChangeListener(this).build();
        audioFocusRequestBuild.getClass();
        this.f127888o = audioFocusRequestBuild;
    }

    public static final void n(f fVar) {
        fVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TextToSpeech", "handleTtsError");
        fVar.o();
        fVar.c();
        fVar.f127885l = null;
        c cVar = fVar.f127881h;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // nu.b
    public final void a(c cVar) {
        cVar.getClass();
        this.f127881h = cVar;
        TextToSpeech textToSpeech = this.f127874b;
        if (textToSpeech != null) {
            textToSpeech.setOnUtteranceProgressListener(new b(cVar));
        }
    }

    @Override // nu.h
    public final void c() {
        c cVar = this.f127881h;
        boolean zB = cVar != null ? cVar.b() : false;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("AbandonAudioFocus called (hasMorePrompts=", ")", zB);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TextToSpeech", strG);
        if (zB) {
            return;
        }
        this.f127882i.abandonAudioFocusRequest(this.f127888o);
        this.f127883j = false;
        i2.a.b(a2Var, "TextToSpeech", "Audio focus abandoned.");
    }

    @Override // nu.h
    public final void i(String str, String str2) {
        this.f127885l = str2;
        this.f127886m = str;
        int iRequestAudioFocus = this.f127882i.requestAudioFocus(this.f127888o);
        if (iRequestAudioFocus == 0) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "TextToSpeech", "Audio focus request failed. Still try to play prompt");
            p(str2);
            return;
        }
        if (iRequestAudioFocus == 1) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "TextToSpeech", "Audio focus request granted.");
            p(str2);
            return;
        }
        if (iRequestAudioFocus != 2) {
            return;
        }
        this.f127884k = true;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var3, "TextToSpeech", "Audio focus delayed; will start when granted.");
    }

    @Override // nu.h
    public final void j() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TextToSpeech", "Moving to next prompt.");
        c cVar = this.f127881h;
        if (cVar != null) {
            cVar.d(this.f127886m);
        }
    }

    public final void o() {
        LoudnessEnhancer loudnessEnhancer = this.f127887n;
        if (loudnessEnhancer != null) {
            try {
                loudnessEnhancer.release();
            } catch (RuntimeException e4) {
                String strN = fb1.c.n("Failed to release LoudnessEnhancer: ", e4.getMessage());
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "TextToSpeech", strN);
            }
        }
        this.f127887n = null;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i14) {
        String str;
        if (i14 != -3 && i14 != -2 && i14 != -1) {
            if (i14 != 1) {
                return;
            }
            String strE = com.airbnb.lottie.animation.keyframe.a.e("Audio focus GAIN (delayed=", " granted=", ")", this.f127884k, this.f127883j);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "TextToSpeech", strE);
            if ((this.f127884k || !this.f127883j) && (str = this.f127885l) != null) {
                p(str);
                this.f127884k = false;
                return;
            }
            return;
        }
        String strF = e0.f(i14, "Audio focus LOST (", "); stopping TTS.");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "TextToSpeech", strF);
        i2.a.b(a2Var2, "TextToSpeech", "stopPlayback");
        TextToSpeech textToSpeech = this.f127874b;
        if (textToSpeech != null && textToSpeech.isSpeaking()) {
            TextToSpeech textToSpeech2 = this.f127874b;
            if (textToSpeech2 != null) {
                textToSpeech2.stop();
            }
            i2.a.b(a2Var2, "TextToSpeech", "TTS stopped by caller.");
        }
        o();
        c();
        c cVar = this.f127881h;
        if (cVar != null) {
            cVar.c();
        }
    }

    public final void p(String str) {
        int iGenerateAudioSessionId = this.f127882i.generateAudioSessionId();
        Bundle bundleE = j.e(iGenerateAudioSessionId, "sessionId");
        TextToSpeech textToSpeech = this.f127874b;
        if (textToSpeech != null) {
            textToSpeech.speak(str, 0, bundleE, this.f127886m);
        }
        o();
        try {
            LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(iGenerateAudioSessionId);
            loudnessEnhancer.setTargetGain(900);
            loudnessEnhancer.setEnabled(true);
            this.f127887n = loudnessEnhancer;
        } catch (RuntimeException e4) {
            String strN = fb1.c.n("Failed to attach LoudnessEnhancer: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "TextToSpeech", strN);
            this.f127887n = null;
        }
        this.f127883j = true;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "TextToSpeech", "TTS playback started.");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnu/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PROMPT_GAIN_MILLIBELS", "I", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"nu/f$b", "Landroid/speech/tts/UtteranceProgressListener;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends UtteranceProgressListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f127890b;

        public b(c cVar) {
            this.f127890b = cVar;
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onDone(String str) {
            str.getClass();
            String strConcat = "onDone: ".concat(str);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "TextToSpeech", strConcat);
            int i14 = f.f127880p;
            f fVar = f.this;
            fVar.o();
            this.f127890b.d(str);
            fVar.f127885l = null;
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onError(String str, int i14) {
            str.getClass();
            String str2 = "onError(code=" + i14 + ") for " + str;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "TextToSpeech", str2);
            f.n(f.this);
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onStart(String str) {
            str.getClass();
            String strConcat = "onStart: ".concat(str);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.n(a2Var, "TextToSpeech", strConcat);
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onError(String str) {
            str.getClass();
            String strConcat = "onError (no code) for ".concat(str);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "TextToSpeech", strConcat);
            f.n(f.this);
        }
    }
}

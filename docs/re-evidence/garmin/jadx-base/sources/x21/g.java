package x21;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import d53.w;
import e23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx21/g;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "", "", "onListeningChanged", "", "onTranscript", "", "onAmplitude", "onFatalError", "Lkotlin/Function0;", "onSessionTimeout", "<init>", "(Landroid/content/Context;Le23/l;Le23/l;Le23/l;Le23/l;Le23/a;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f188502t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f188503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Boolean, Unit> f188504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<String, Unit> f188505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Float, Unit> f188506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<String, Unit> f188507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<Unit> f188508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f188509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f188510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SpeechRecognizer f188511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f188512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f188513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f188514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x21.a f188515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ParcelFileDescriptor f188516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AudioManager f188517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f188518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f188519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f188520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f188521s;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"x21/g$b", "Landroid/speech/RecognitionListener;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements RecognitionListener {
        public b() {
        }

        @Override // android.speech.RecognitionListener
        public final void onBeginningOfSpeech() {
            g gVar = g.this;
            if (gVar.f188510h) {
                return;
            }
            gVar.i();
        }

        @Override // android.speech.RecognitionListener
        public final void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public final void onEndOfSpeech() {
            g gVar = g.this;
            if (gVar.f188510h) {
                return;
            }
            gVar.f188506d.invoke(Float.valueOf(0.0f));
        }

        @Override // android.speech.RecognitionListener
        public final void onError(int i14) {
            Object bVar;
            String strH;
            Float fValueOf = Float.valueOf(0.0f);
            boolean z14 = g.this.f188513k;
            g gVar = g.this;
            if (!gVar.f188510h) {
                gVar.f188506d.invoke(fValueOf);
            }
            if (!g.this.f188513k) {
                g.this.f188504b.invoke(Boolean.FALSE);
                return;
            }
            if (i14 == 6 || i14 == 7) {
                g gVar2 = g.this;
                int i15 = gVar2.f188514l + 1;
                gVar2.f188514l = i15;
                if (i15 > 2) {
                    gVar2.f();
                    return;
                } else {
                    gVar2.d(null);
                    g.a(g.this);
                    return;
                }
            }
            g gVar3 = g.this;
            if (i14 != 8) {
                gVar3.d(null);
                g.this.f188513k = false;
                g gVar4 = g.this;
                if (!gVar4.f188510h) {
                    gVar4.i();
                }
                g.this.f188506d.invoke(fValueOf);
                g.this.f188504b.invoke(Boolean.FALSE);
                if (i14 == 1) {
                    strH = "Network timeout";
                } else if (i14 != 2) {
                    strH = i14 != 3 ? j.h(i14, "Speech recognition error: ") : "Audio recording error";
                } else {
                    strH = "Network error";
                }
                g.this.f188507e.invoke(strH);
                return;
            }
            gVar3.d(null);
            SpeechRecognizer speechRecognizer = g.this.f188511i;
            if (speechRecognizer != null) {
                try {
                    int i16 = q.f128596b;
                    speechRecognizer.destroy();
                    bVar = Unit.INSTANCE;
                } catch (Throwable th3) {
                    int i17 = q.f128596b;
                    bVar = new q.b(th3);
                }
                q.a(bVar);
            }
            g gVar5 = g.this;
            gVar5.f188511i = null;
            g.a(gVar5);
        }

        @Override // android.speech.RecognitionListener
        public final void onEvent(int i14, Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public final void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList;
            String str = (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null) ? null : (String) h0.d0(stringArrayList);
            g gVar = g.this;
            boolean z14 = gVar.f188510h;
            l<String, Unit> lVar = gVar.f188505c;
            h hVar = gVar.f188512j;
            if (z14) {
                if (str == null) {
                    str = "";
                }
                hVar.d(str);
                lVar.invoke(hVar.b());
                return;
            }
            if (str == null || w.J(str)) {
                return;
            }
            hVar.d(str);
            lVar.invoke(hVar.b());
        }

        @Override // android.speech.RecognitionListener
        public final void onReadyForSpeech(Bundle bundle) {
            g.this.f188504b.invoke(Boolean.TRUE);
        }

        @Override // android.speech.RecognitionListener
        public final void onResults(Bundle bundle) {
            g gVar = g.this;
            if (!gVar.f188510h) {
                gVar.f188506d.invoke(Float.valueOf(0.0f));
            }
            ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
            Objects.toString(stringArrayList);
            g.this.d(stringArrayList != null ? (String) h0.d0(stringArrayList) : null);
            g gVar2 = g.this;
            gVar2.f188514l = 0;
            boolean z14 = gVar2.f188513k;
            g gVar3 = g.this;
            if (z14) {
                g.a(gVar3);
            } else {
                gVar3.f188504b.invoke(Boolean.FALSE);
            }
        }

        @Override // android.speech.RecognitionListener
        public final void onRmsChanged(float f14) {
            g gVar = g.this;
            if (gVar.f188510h) {
                return;
            }
            gVar.f188506d.invoke(Float.valueOf(t.d((f14 + 2.0f) / 12.0f, 0.0f, 2.0f)));
        }
    }

    static {
        new a(null);
        f188502t = new int[]{3, 5, 1};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, l<? super Boolean, Unit> lVar, l<? super String, Unit> lVar2, l<? super Float, Unit> lVar3, l<? super String, Unit> lVar4, e23.a<Unit> aVar) {
        context.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        aVar.getClass();
        this.f188503a = context;
        this.f188504b = lVar;
        this.f188505c = lVar2;
        this.f188506d = lVar3;
        this.f188507e = lVar4;
        this.f188508f = aVar;
        this.f188509g = new Handler(Looper.getMainLooper());
        this.f188510h = Build.VERSION.SDK_INT >= 31;
        this.f188512j = new h();
        Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f188517o = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.f188519q = new e(this, 0);
        this.f188520r = new e(this, 1);
        this.f188521s = new b();
    }

    public static final void a(g gVar) {
        if (gVar.f188513k) {
            gVar.f188509g.removeCallbacks(gVar.f188519q);
            gVar.f188509g.postDelayed(gVar.f188519q, 60L);
        }
    }

    public static Intent b() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault());
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 80000L);
        intent.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", 80000L);
        intent.putExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", 3000L);
        return intent;
    }

    public final void c() {
        Object bVar;
        ParcelFileDescriptor parcelFileDescriptor = this.f188516n;
        if (parcelFileDescriptor != null) {
            try {
                int i14 = q.f128596b;
                parcelFileDescriptor.close();
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            q.a(bVar);
        }
        this.f188516n = null;
    }

    public final void d(String str) {
        h hVar = this.f188512j;
        if (w.J(hVar.f188524b) && str != null && !w.J(str) && !hVar.f188525c) {
            hVar.f188524b = str;
        } else if (w.J(hVar.f188524b) && str != null) {
            w.J(str);
        }
        hVar.a();
        hVar.f188525c = false;
        hVar.b();
        this.f188505c.invoke(hVar.b());
    }

    public final void e() {
        if (this.f188511i != null) {
            return;
        }
        Context context = this.f188503a;
        if (!SpeechRecognizer.isRecognitionAvailable(context)) {
            this.f188507e.invoke("Speech recognition is not available on this device");
            return;
        }
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context);
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(this.f188521s);
        this.f188511i = speechRecognizerCreateSpeechRecognizer;
    }

    public final void f() {
        Object bVar;
        this.f188509g.removeCallbacks(this.f188519q);
        this.f188509g.removeCallbacks(this.f188520r);
        d(null);
        this.f188513k = false;
        SpeechRecognizer speechRecognizer = this.f188511i;
        if (speechRecognizer != null) {
            try {
                int i14 = q.f128596b;
                speechRecognizer.cancel();
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            q.a(bVar);
        }
        if (this.f188510h) {
            c();
            x21.a aVar = this.f188515m;
            if (aVar != null) {
                aVar.b();
            }
        } else {
            i();
        }
        this.f188506d.invoke(Float.valueOf(0.0f));
        this.f188504b.invoke(Boolean.FALSE);
        this.f188508f.invoke();
    }

    public final void g() {
        Intent intentB;
        Object bVar;
        if (this.f188513k) {
            e();
            SpeechRecognizer speechRecognizer = this.f188511i;
            if (speechRecognizer == null) {
                this.f188513k = false;
                this.f188504b.invoke(Boolean.FALSE);
                return;
            }
            if (this.f188510h) {
                x21.a aVar = this.f188515m;
                intentB = null;
                if (aVar != null) {
                    try {
                        int i14 = q.f128596b;
                        bVar = ParcelFileDescriptor.createPipe();
                    } catch (Throwable th3) {
                        int i15 = q.f128596b;
                        bVar = new q.b(th3);
                    }
                    if (bVar instanceof q.b) {
                        bVar = null;
                    }
                    ParcelFileDescriptor[] parcelFileDescriptorArr = (ParcelFileDescriptor[]) bVar;
                    if (parcelFileDescriptorArr != null) {
                        ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArr[0];
                        aVar.a(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArr[1]));
                        c();
                        this.f188516n = parcelFileDescriptor;
                        intentB = b();
                        intentB.putExtra("android.speech.extra.AUDIO_SOURCE", parcelFileDescriptor);
                        intentB.putExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                        intentB.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
                        intentB.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                    }
                }
                if (intentB == null) {
                    this.f188507e.invoke("Audio recording error");
                    return;
                }
            } else {
                if (!this.f188518p) {
                    this.f188518p = true;
                    for (int i16 : f188502t) {
                        AudioManager audioManager = this.f188517o;
                        if (audioManager != null) {
                            audioManager.setStreamMute(i16, true);
                        }
                    }
                }
                intentB = b();
            }
            speechRecognizer.startListening(intentB);
            this.f188504b.invoke(Boolean.TRUE);
            if (this.f188510h) {
                return;
            }
            this.f188509g.postDelayed(new e(this, 2), 500L);
        }
    }

    public final void h() {
        Object bVar;
        this.f188513k = false;
        this.f188509g.removeCallbacks(this.f188519q);
        this.f188509g.removeCallbacks(this.f188520r);
        d(null);
        SpeechRecognizer speechRecognizer = this.f188511i;
        if (speechRecognizer != null) {
            try {
                int i14 = q.f128596b;
                speechRecognizer.cancel();
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            q.a(bVar);
        }
        if (this.f188510h) {
            c();
            x21.a aVar = this.f188515m;
            if (aVar != null) {
                aVar.b();
            }
        } else {
            i();
        }
        this.f188506d.invoke(Float.valueOf(0.0f));
        this.f188504b.invoke(Boolean.FALSE);
    }

    public final void i() {
        if (this.f188518p) {
            this.f188518p = false;
            for (int i14 : f188502t) {
                AudioManager audioManager = this.f188517o;
                if (audioManager != null) {
                    audioManager.setStreamMute(i14, false);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lx21/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_CONSECUTIVE_TIMEOUTS", "I", "", "SESSION_TIMEOUT_MILLIS", "J", "RESTART_GAP_MILLIS", "COMPLETE_SILENCE_MILLIS", "POSSIBLY_COMPLETE_SILENCE_MILLIS", "MINIMUM_INPUT_MILLIS", "EARCON_MUTE_MILLIS", "", "BEEP_STREAMS", "[I", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

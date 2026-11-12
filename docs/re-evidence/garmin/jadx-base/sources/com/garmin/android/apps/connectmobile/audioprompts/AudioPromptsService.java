package com.garmin.android.apps.connectmobile.audioprompts;

import am.j;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Binder;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.audioprompts.GravelEngine;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import nu.h;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import v.e0;
import z6.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService;", "Landroid/app/Service;", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "c", "d", "a", "f", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioPromptsService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioPromptsActivity.b.a f30194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f30195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f30196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f30197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GravelEngine f30198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Looper f30199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.audioprompts.a f30200g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Thread f30204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f30205l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f30207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile iu.b f30208o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f30201h = new LinkedList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f30206m = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SynchronousQueue<Unit> f30209p = new SynchronousQueue<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f30210q = new g();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService$a;", "", "", "identifier", "Lcom/garmin/proto/generated/GDIAudioPromptsProto$AudioPromptsService;", "request", "", "deviceID", "<init>", "(Ljava/lang/String;Lcom/garmin/proto/generated/GDIAudioPromptsProto$AudioPromptsService;J)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GDIAudioPromptsProto.AudioPromptsService f30212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f30213c;

        public a(String str, GDIAudioPromptsProto.AudioPromptsService audioPromptsService, long j8) {
            audioPromptsService.getClass();
            this.f30211a = str;
            this.f30212b = audioPromptsService;
            this.f30213c = j8;
        }
    }

    public interface c {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService$d;", "Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService$c;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements c {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService$e;", "Landroid/os/Binder;", "<init>", "(Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e extends Binder {
        public e() {
        }
    }

    public interface f {
        boolean a();

        gu.f b();

        void c(gu.f fVar);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService$g", "Lnu/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements nu.c {
        public g() {
        }

        @Override // nu.c
        public final void a() {
            HandlerThread handlerThread = new HandlerThread("AudioPromptServiceProcessingQueue");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            AudioPromptsService audioPromptsService = AudioPromptsService.this;
            audioPromptsService.f30199f = looper;
            LinkedList linkedList = audioPromptsService.f30201h;
            GravelEngine gravelEngine = audioPromptsService.f30198e;
            com.garmin.android.apps.connectmobile.audioprompts.a aVar = null;
            if (gravelEngine != null) {
                Looper looper2 = handlerThread.getLooper();
                looper2.getClass();
                h hVar = audioPromptsService.f30197d;
                if (hVar == null) {
                    s.m("tts");
                    throw null;
                }
                aVar = new com.garmin.android.apps.connectmobile.audioprompts.a(looper2, gravelEngine, hVar);
            }
            audioPromptsService.f30200g = aVar;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            linkedList.clear();
        }

        @Override // nu.c
        public final boolean b() {
            com.garmin.android.apps.connectmobile.audioprompts.a aVar = AudioPromptsService.this.f30200g;
            aVar.getClass();
            boolean zA = aVar.a();
            String strH = com.airbnb.lottie.animation.keyframe.a.h("hasMorePrompts: ", zA);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "AudioPromptsService", strH);
            return zA;
        }

        @Override // nu.c
        public final void c() {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AudioPromptsService", "onFocusAbandon");
            iu.a aVar2 = iu.a.f94990a;
            iu.b bVar = AudioPromptsService.this.f30208o;
            aVar2.getClass();
            iu.a.a(bVar);
            AudioPromptsService.this.f30208o = null;
            AudioPromptsService.this.a();
        }

        @Override // nu.c
        public final void d(String str) {
            str.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AudioPromptsService", "onSpeechEnd");
            AudioPromptsService audioPromptsService = AudioPromptsService.this;
            com.garmin.android.apps.connectmobile.audioprompts.a aVar2 = audioPromptsService.f30200g;
            aVar2.getClass();
            gu.f fVarB = aVar2.b();
            if (fVarB != null) {
                i2.a.b(a2Var, "AudioPromptsService", "Not abandoning audio focus (has remaining messages). onSpeechEnd returns false");
                com.garmin.android.apps.connectmobile.audioprompts.a aVar3 = audioPromptsService.f30200g;
                aVar3.getClass();
                aVar3.c(fVarB);
                return;
            }
            i2.a.b(a2Var, "AudioPromptsService", "nextAudioPrompt is null, no more prompts to play.");
            if (!n.d(str) || audioPromptsService.f30202i) {
                i2.a.b(a2Var, "AudioPromptsService", "broadcastTextSpoken: identifier is null or isTextSpokenReceived:" + audioPromptsService.f30202i + StringUtils.SPACE);
            } else {
                audioPromptsService.f30202i = true;
                i2.a.b(a2Var, "AudioPromptsService", "broadcastTextSpoken: identifier[" + str + "]");
                oi2.a.C2513a c2513a = oi2.a.f132270a;
                ku.a aVar4 = new ku.a(str);
                c2513a.getClass();
                l73.c.b().e(aVar4);
            }
            i2.a.b(a2Var, "AudioPromptsService", "Abandoned audio focus (all speech completed).");
            if (audioPromptsService.f30208o != null) {
                iu.a aVar5 = iu.a.f94990a;
                iu.b bVar = audioPromptsService.f30208o;
                aVar5.getClass();
                iu.a.a(bVar);
            }
            audioPromptsService.f30208o = null;
            audioPromptsService.a();
        }
    }

    static {
        new b(null);
    }

    public static Locale b(Locale locale, int i14, h hVar) {
        if (i14 != -2 && i14 != -1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AudioPromptsService", "Set the locale to " + locale);
            return locale;
        }
        if (Build.VERSION.SDK_INT >= 36) {
            Set setM0 = u.m0(new String[]{"oppo", "vivo", "oneplus", "realme", "iqoo"});
            String str = Build.BRAND;
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (setM0.contains(lowerCase)) {
                LinkedHashSet<Locale> linkedHashSetH = hVar.h();
                if (!linkedHashSetH.isEmpty()) {
                    for (Locale locale2 : linkedHashSetH) {
                        if (s.g(locale2.getLanguage(), locale.getLanguage()) && s.g(locale2.getCountry(), locale.getCountry())) {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var2, "AudioPromptsService", "Workaround for oppo/vivo/oneplus/realme/iqoo Android 16 phones, set the locale to " + locale);
                            return locale;
                        }
                    }
                }
            }
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var3, "AudioPromptsService", "Set the fallback locale to US");
        Locale locale3 = Locale.US;
        locale3.getClass();
        hVar.d(locale3);
        return locale3;
    }

    public final void a() {
        iu.a.f94990a.getClass();
        if (iu.a.f94991b.size() != 0) {
            this.f30209p.offer(Unit.INSTANCE);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AudioPromptsService", "AudioPromptQueue still has items, continuing.");
            return;
        }
        String strF = e0.f(this.f30203j, "AudioPromptQueue is empty, stopping service. ", ")");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "AudioPromptsService", strF);
        AudioPromptsActivity.b.a aVar3 = this.f30194a;
        if (aVar3 != null) {
            aVar3.a();
        }
        stopSelf(this.f30203j);
    }

    public final void c(Locale locale, h hVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AudioPromptsService", "Set the Gravel locale to " + locale);
        AssetManager assets = getAssets();
        assets.getClass();
        GravelEngine gravelEngine = new GravelEngine(assets, locale);
        this.f30198e = gravelEngine;
        Looper looper = this.f30199f;
        this.f30200g = looper != null ? new com.garmin.android.apps.connectmobile.audioprompts.a(looper, gravelEngine, hVar) : null;
    }

    public final void d() {
        h hVar = this.f30197d;
        Locale localeB = null;
        if (hVar == null) {
            s.m("tts");
            throw null;
        }
        if (this.f30205l) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            int iD = hVar.d(locale);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AudioPromptsService", "Try to set the locale from phone for workaround device: " + iD + ", " + locale);
            localeB = b(locale, iD, hVar);
        } else if (hVar.g(this.f30206m)) {
            int iK = hVar.k(this.f30206m);
            Locale localeF = hVar.f(this.f30206m);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "AudioPromptsService", "Try to set the locale from dialect setting: " + iK + ", " + localeF);
            if (localeF == null) {
                localeF = Locale.US;
            }
            localeF.getClass();
            localeB = b(localeF, iK, hVar);
        } else {
            String str = "Device without dialect setting, no update to current tts language setup. Default: " + Locale.getDefault();
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "AudioPromptsService", str);
        }
        if (localeB != null) {
            c(localeB, hVar);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        e eVar = this.f30195b;
        if (eVar != null) {
            return eVar;
        }
        s.m("binder");
        throw null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AudioPromptsService", "Intent is onCreate");
        this.f30195b = new e();
        this.f30196c = (c) KoinJavaComponent.get$default(c.class, null, null, 6, null);
        if (this.f30197d == null) {
            final nu.f fVarA = ((nu.d) KoinJavaComponent.get$default(nu.d.class, null, null, 6, null)).a(this);
            this.f30197d = fVarA;
            final g gVar = this.f30210q;
            gVar.getClass();
            fVarA.f127874b = new TextToSpeech(fVarA.f127873a, new TextToSpeech.OnInitListener() { // from class: nu.a
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i14) {
                    b bVar = fVarA;
                    c cVar = gVar;
                    int i15 = b.f127872g;
                    if (i14 == 0) {
                        try {
                            Locale locale = Locale.getDefault();
                            TextToSpeech textToSpeech = bVar.f127874b;
                            if (textToSpeech != null) {
                                textToSpeech.setLanguage(locale);
                            }
                            TextToSpeech textToSpeech2 = bVar.f127874b;
                            if (textToSpeech2 != null) {
                                textToSpeech2.setSpeechRate(1.0f);
                            }
                            String str = "Android BaseTextToSpeech initialized with locale [" + hb2.h.b() + "]";
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar2.getClass();
                            i2.a.b(a2Var2, "BaseTextToSpeech", str);
                            bVar.a(cVar);
                            bVar.f127875c = true;
                            cVar.a();
                        } catch (IllegalArgumentException e4) {
                            String strN = fb1.c.n("ttsInitListener: ", e4.getMessage());
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var3, "BaseTextToSpeech", strN);
                        }
                    }
                }
            });
        }
        if (this.f30198e == null) {
            AssetManager assets = getAssets();
            assets.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            this.f30198e = new GravelEngine(assets, locale);
        }
        if (this.f30204k == null || !this.f30207n) {
            i2.a.b(a2Var, "AudioPromptsService", "AudioPromptConsumer: startConsumer()");
            this.f30207n = true;
            Thread thread = new Thread(new eh2.b(this, 14), "AudioPromptConsumer");
            this.f30204k = thread;
            thread.start();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AudioPromptsService", "AudioPromptConsumer: onDestroy()");
        this.f30207n = false;
        Thread thread = this.f30204k;
        if (thread == null) {
            s.m("consumerThread");
            throw null;
        }
        thread.interrupt();
        iu.a.f94990a.getClass();
        iu.a.f94991b.clear();
        iu.a.f94992c.clear();
        Looper looper = this.f30199f;
        if (looper != null) {
            looper.quit();
        }
        h hVar = this.f30197d;
        if (hVar == null) {
            s.m("tts");
            throw null;
        }
        if (hVar.getF127875c()) {
            h hVar2 = this.f30197d;
            if (hVar2 == null) {
                s.m("tts");
                throw null;
            }
            hVar2.c();
            h hVar3 = this.f30197d;
            if (hVar3 == null) {
                s.m("tts");
                throw null;
            }
            hVar3.shutdown();
        }
        stopForeground(1);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        Object bVar;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AudioPromptsService", "Intent is onStartCommand.");
        this.f30203j = i15;
        this.f30206m = intent != null ? intent.getLongExtra("AudioPromptsService.EXTRA_DEVICE_ID", -1L) : -1L;
        if (intent == null) {
            i2.a.b(a2Var, "AudioPromptsService", "Intent is null.");
            return 1;
        }
        boolean booleanExtra = intent.getBooleanExtra("AudioPromptsService.EXTRA_NOTIFICATION_FG", false);
        i2.a.b(a2Var, "AudioPromptsService", "Intent is requireFG " + booleanExtra + ".");
        if (s.g(intent.getAction(), "AudioPromptsService.ACTION_START")) {
            i2.a.b(a2Var, "AudioPromptsService", "Intent is ACTION_START.");
            int intExtra = intent.getIntExtra("AudioPromptsService.EXTRA_PRODUCT_NUMBER", -1);
            int intExtra2 = intent.getIntExtra("AudioPromptsService.EXTRA_SOFTWARE_VERSION", -1);
            gu.a.f79026a.getClass();
            this.f30205l = gu.a.a(intExtra, intExtra2);
            this.f30202i = false;
            if (booleanExtra) {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
                sz0.e eVar = sz0.e.O0;
                String str = eVar.f161386a;
                if (notificationManager.getNotificationChannel(str) == null) {
                    NotificationChannel notificationChannel = new NotificationChannel(str, eVar.b(new l22.a(this)), 2);
                    notificationChannel.setSound(null, null);
                    notificationChannel.enableVibration(false);
                    notificationChannel.enableLights(false);
                    notificationChannel.setShowBadge(false);
                    notificationChannel.setLockscreenVisibility(0);
                    notificationChannel.setDescription("Silent foreground notification for audio prompts");
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                q qVar = new q(this, str);
                qVar.f202683e = q.e(getString(R.string.garmin_connect_name));
                qVar.f202684f = q.e(getString(R.string.msg_audio_prompt_in_progress));
                qVar.N.icon = 2131232010;
                qVar.i(8, true);
                qVar.O = true;
                qVar.f202703y = true;
                qVar.f202691m = -1;
                Notification notificationC = qVar.c();
                notificationC.getClass();
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 29) {
                    startForeground(41, notificationC, 2);
                } else {
                    startForeground(41, notificationC);
                }
                if (((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).i() && i16 == 35) {
                    AudioPromptsActivity.f30189c.getClass();
                    try {
                        int i17 = o13.q.f128596b;
                        Intent intent2 = new Intent(this, (Class<?>) AudioPromptsActivity.class);
                        intent2.addFlags(276824064);
                        startActivity(intent2);
                        bVar = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        int i18 = o13.q.f128596b;
                        bVar = new o13.q.b(th3);
                    }
                    Throwable thB = o13.q.b(bVar);
                    if (thB != null) {
                        AudioPromptsActivity.a aVar2 = AudioPromptsActivity.f30189c;
                        String strP = j.p("Failed to start activity ", thB);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var2, "AudioPromptsActivity", strP);
                    }
                }
            }
        } else if (d53.u.q(intent.getAction(), "AudioPromptsService.ACTION_TERMINATE", true)) {
            i2.a.b(a2Var, "AudioPromptsService", "Intent is ACTION_TERMINATE.");
            AudioPromptsActivity.b.a aVar4 = this.f30194a;
            if (aVar4 != null) {
                aVar4.a();
            }
            stopSelf();
        }
        return 2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTION_START", "ACTION_TERMINATE", "EXTRA_NOTIFICATION_FG", "EXTRA_IDENTIFIER", "EXTRA_DEVICE_ID", "EXTRA_PRODUCT_NUMBER", "EXTRA_SOFTWARE_VERSION", "", "WHAT_PLAY_AUDIO_PROMPT", "I", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}

package com.huami.mifit.sportlib.tts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
class e extends b<String> implements TextToSpeech.OnInitListener {
    private static final String r = "Speaker";
    public static final float s = 1.0f;
    public static final float t = 1.0f;
    private static final int u = 69913;
    private TextToSpeech n;
    private boolean o;
    private float p;
    private float q;

    public e(Context context) {
        super(context);
        this.o = false;
        this.p = 1.0f;
        this.q = 1.0f;
        this.n = new TextToSpeech(context, this);
    }

    public static void p(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.speech.tts.engine.CHECK_TTS_DATA");
        activity.startActivityForResult(intent, u);
    }

    public static void q(int i, int i2, Intent intent) {
        if (i != u) {
            return;
        }
        if (i2 == 1) {
            LogKit.i("Speaker", "support tts!!!");
        } else {
            LogKit.i("Speaker", "not support tts!!!");
        }
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public void a() {
        this.n.playSilence(0L, 0, null);
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public void b() {
        this.n.shutdown();
        this.a.destroy();
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public boolean c() {
        return this.n.isSpeaking();
    }

    @Override // com.huami.mifit.sportlib.tts.b
    public a<String> d() {
        return new f();
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
        TextToSpeech textToSpeech = this.n;
        int iIsLanguageAvailable = textToSpeech == null ? -2 : textToSpeech.isLanguageAvailable(Locale.US);
        if (i != 0 || iIsLanguageAvailable < 0) {
            this.o = false;
        } else {
            try {
                this.n.setLanguage(Locale.US);
                this.n.setPitch(this.p);
                this.n.setSpeechRate(this.q);
                this.o = true;
            } catch (Exception unused) {
                LogKit.w2f("Speaker", "init TTS ERROR:" + Build.MANUFACTURER);
            }
        }
        LogKit.w2f("Speaker", "status:" + i + " ready:" + this.o + " isLanguageAvailable US:" + iIsLanguageAvailable);
    }

    @Override // com.huami.mifit.sportlib.tts.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void e(int i, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (!this.o || zIsEmpty) {
            LogKit.w2f("Speaker", "ready:" + this.o + ",text isEmpty:" + zIsEmpty);
            return;
        }
        LogKit.w2f("Speaker", "speak:" + str);
        HashMap<String, String> map = new HashMap<>();
        map.put(TrainingWebConst.QueryParam.STREAM_TYPE, String.valueOf(3));
        this.n.speak(str, 1, map);
    }

    public e(Context context, float f, float f2, boolean z) {
        super(context);
        this.o = false;
        this.p = 1.0f;
        this.q = 1.0f;
        this.p = f;
        this.q = f2;
        this.n = new TextToSpeech(context, this);
        ((f) this.a).w(z);
    }
}

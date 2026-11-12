package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import com.huawei.healthcloud.plugintrack.manager.voice.BaseSoundEffectManager;
import com.huawei.healthcloud.plugintrack.model.SportBeat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class jwz extends BaseSoundEffectManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f39151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f39152c;
    private boolean d;
    private final AudioManager e;
    private String f;
    private SportBeat g;
    private int h;
    private jax i;
    private b j;
    private Timer m;

    public static boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float h() {
        return 1.0f;
    }

    public jwz(SportBeat sportBeat) {
        super(BaseApplication.getContext());
        this.f39152c = false;
        this.d = false;
        Context context = BaseApplication.getContext();
        this.f39151b = context;
        this.g = sportBeat;
        this.e = (AudioManager) context.getSystemService("audio");
    }

    private void b(String str) {
        jax jaxVar = new jax(c(str), 0, b(str, "mp3"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jaxVar);
        e(arrayList);
    }

    public String b(String str, String str2) {
        return "beat_res" + File.separator + "1.0.0" + File.separator + str2 + File.separator + str + "." + str2;
    }

    public void g() {
        if (c()) {
            if (this.j == null) {
                b bVar = new b();
                this.j = bVar;
                lso.d(this.f39151b, true, (lso.e) bVar);
            }
            String strA = a();
            final String strC = c(strA);
            if (!d(strC)) {
                b(new SoundPool.OnLoadCompleteListener() { // from class: jwz.4
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public void onLoadComplete(SoundPool soundPool, int i, int i2) {
                        jwz.this.h(strC);
                    }
                });
                b(strA);
            } else {
                h(strC);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        this.f39152c = true;
        int iB = b() == 0 ? 170 : b();
        if (iB > 120) {
            d(str, iB);
        } else {
            c(str, iB);
        }
    }

    private void d(String str, int i) {
        jax jaxVar = this.f10483a.get(str);
        if (jaxVar == null) {
            LogUtil.e("Track_SportBeatPlayer", "option is null");
            return;
        }
        float fH = h();
        this.h = a(jaxVar.d(), fH, fH, jaxVar.a(), -1, i / 176.68f);
        Timer timer = new Timer();
        this.m = timer;
        timer.scheduleAtFixedRate(new d(this), 0L, 1000L);
    }

    private void c(String str, int i) {
        Timer timer = new Timer();
        this.m = timer;
        timer.scheduleAtFixedRate(new a(this, str), 0L, 60000 / i);
    }

    private void n() {
        e(this.h);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
    }

    static final class a extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f39154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39155c;
        WeakReference<jwz> e;

        a(jwz jwzVar, String str) {
            this.e = new WeakReference<>(jwzVar);
            this.f39154b = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            jwz jwzVar = this.e.get();
            if (jwzVar == null) {
                LogUtil.e("Track_SportBeatPlayer", "MetronomeTask player is null");
                return;
            }
            if (jwzVar.f39152c) {
                jwzVar.e(this.f39155c);
                jax jaxVar = (jax) jwzVar.f10483a.get(this.f39154b);
                if (jaxVar == null) {
                    LogUtil.e("Track_SportBeatPlayer", "option is null");
                } else {
                    float fH = jwzVar.h();
                    this.f39155c = jwzVar.a(jaxVar.d(), fH, fH, jaxVar.a(), 0, 1.0f);
                }
            }
        }
    }

    static final class d extends TimerTask {
        WeakReference<jwz> e;

        public d(jwz jwzVar) {
            this.e = new WeakReference<>(jwzVar);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            jwz jwzVar = this.e.get();
            if (jwzVar == null) {
                LogUtil.e("Track_SportBeatPlayer", "UpdateVolumeTask player is null");
            } else {
                float fH = jwzVar.h();
                jwzVar.c(jwzVar.h, fH, fH);
            }
        }
    }

    public void i() {
        n();
        String strA = a();
        jax jaxVarE = e(c(strA));
        if (jaxVarE != null) {
            this.i = jaxVarE;
            this.f = strA;
        }
        this.f39152c = false;
        this.d = false;
    }

    public void f() {
        if (this.i != null) {
            c(c(this.f), this.i);
        }
        g();
    }

    public jax e(String str) {
        if (!this.f10483a.containsKey(str)) {
            LogUtil.e("Track_SportBeatPlayer", "remove mSoundPool is null");
            return null;
        }
        jax jaxVar = this.f10483a.get(str);
        this.f10483a.remove(str);
        return jaxVar;
    }

    public void c(String str, jax jaxVar) {
        if (this.f10483a.containsKey(str)) {
            LogUtil.e("Track_SportBeatPlayer", "remove mSoundPool is null");
        } else {
            this.f10483a.put(str, jaxVar);
        }
    }

    public void c(SportBeat sportBeat) {
        if (this.g.equals(sportBeat)) {
            return;
        }
        this.g = sportBeat;
    }

    public void j() {
        i();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.BaseSoundEffectManager
    public void e() {
        super.e();
        this.i = null;
        n();
        lso.d(this.f39151b, false, (lso.e) this.j);
        ReleaseLogUtil.d("Track_SportBeatPlayer", "destroy");
    }

    public String c(String str) {
        return "SPORT_BEAT" + str;
    }

    public int b() {
        return this.g.getFrequency();
    }

    public boolean d() {
        return this.g.isOpen();
    }

    public String a() {
        int audio = this.g.getAudio();
        if (audio == 1) {
            return "b02";
        }
        if (audio == 2) {
            return "b03";
        }
        if (audio == 3) {
            return "b04";
        }
        return "b01";
    }

    class b extends lso.e {
        private b() {
        }

        @Override // lso.e, android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            if (jwz.this.g == null) {
                return;
            }
            LogUtil.a("Track_SportBeatPlayer", "onCallStateChanged state = ", Integer.valueOf(i), ", mIsPlaying = ", Boolean.valueOf(jwz.this.d()));
            if (i != 1 && i != 2) {
                if (jwz.this.d() && !jwz.this.f39152c && jwz.this.d) {
                    jwz.this.d = false;
                    jwz.this.f();
                    return;
                }
                return;
            }
            if (jwz.this.f39152c) {
                jwz.this.i();
                jwz.this.d = true;
            }
        }
    }
}

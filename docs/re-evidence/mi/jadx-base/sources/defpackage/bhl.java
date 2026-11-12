package defpackage;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodecInfo;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.mapbox.ScreenRecorderService;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(21)
public class bhl {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static bhl f4220r;
    public static final String s = AppUtil.getApp().getPackageName() + ".action.STOP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<FragmentActivity> f4222b;
    public Intent d;
    public wgl f;
    public MediaProjection g;
    public String h;
    public VirtualDisplay i;
    public MediaProjectionManager j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f4223k;
    public d l;
    public WeakReference<SharePathVideoAmapActivity> m;
    public boolean n;
    public e o;
    public Uri p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4221a = getClass().getSimpleName();
    public BroadcastReceiver q = new a();
    public int c = 0;
    public boolean e = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (bhl.s.equals(intent.getAction())) {
                bhl.this.G();
            }
        }
    }

    public class b implements wgl.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4225a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f4226b;

        public b(File file) {
            this.f4226b = file;
        }

        @Override // wgl.c
        public void a(Throwable th) {
            if (bhl.this.f4222b.get() == null || ((FragmentActivity) bhl.this.f4222b.get()).isDestroyed() || ((FragmentActivity) bhl.this.f4222b.get()).isFinishing()) {
                return;
            }
            ((FragmentActivity) bhl.this.f4222b.get()).runOnUiThread(new Runnable() { // from class: chl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5352a.d();
                }
            });
            if (th != null) {
                th.printStackTrace();
                this.f4226b.delete();
            } else {
                ((FragmentActivity) bhl.this.f4222b.get()).sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE").addCategory("android.intent.category.DEFAULT").setData(Uri.fromFile(this.f4226b)));
            }
        }

        @Override // wgl.c
        public void b(long j) {
            if (this.f4225a <= 0) {
                this.f4225a = j;
            }
        }

        public final /* synthetic */ void d() {
            bhl.this.F();
        }

        @Override // wgl.c
        public void onStart() {
        }
    }

    public class c extends VirtualDisplay.Callback {
        public c() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onStopped() {
            super.onStopped();
        }
    }

    public class d extends MediaProjection.Callback {
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            Logger.d(bhl.this.f4221a, "onStop: ");
            if (bhl.this.f != null) {
                bhl.this.F();
            }
            if (bhl.this.i != null) {
                bhl.this.i.release();
            }
            if (bhl.this.g != null) {
                bhl.this.g.unregisterCallback(this);
            }
            if (bhl.this.e) {
                bhl.this.e = false;
                bhl bhlVar = bhl.this;
                bhlVar.z(bhlVar.c, bhl.this.d);
            }
        }

        public d() {
        }
    }

    public interface e {
        void onStartSavingVideo();

        void onStopSavingVideo(boolean z);

        void onVideoSaved(Uri uri);
    }

    public bhl(SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        this.m = new WeakReference<>(sharePathVideoAmapActivity);
    }

    public static String[] o(MediaCodecInfo[] mediaCodecInfoArr) {
        String[] strArr = new String[mediaCodecInfoArr.length];
        for (int i = 0; i < mediaCodecInfoArr.length; i++) {
            strArr[i] = mediaCodecInfoArr[i].getName();
        }
        return strArr;
    }

    public static bhl q(SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        if (f4220r == null) {
            f4220r = new bhl(sharePathVideoAmapActivity);
        }
        return f4220r;
    }

    public void A(MediaProjection mediaProjection, String str) {
        this.g = mediaProjection;
        this.h = str;
        if (this.j == null || mediaProjection == null || this.m.get() == null) {
            return;
        }
        this.g.registerCallback(this.l, this.m.get().getMHandler());
        B(mediaProjection);
    }

    public final void B(MediaProjection mediaProjection) {
        String[] strArr = this.f4223k;
        if (strArr == null || strArr.length == 0) {
            n();
            return;
        }
        mqq mqqVarB = vgl.b(strArr[0]);
        if (this.f4222b.get() != null) {
            File fileC = vgl.c(this.f4222b.get(), mqqVarB);
            if (fileC == null) {
                n();
                return;
            }
            this.f = w(mediaProjection, mqqVarB, fileC);
        }
        if (this.m.get() != null) {
            this.m.get().postDelay(new Runnable() { // from class: ygl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40161a.u();
                }
            }, 100L);
        }
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void u() {
        wgl wglVar = this.f;
        if (wglVar == null) {
            return;
        }
        wglVar.B();
        if (this.f4222b.get() != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                this.f4222b.get().registerReceiver(this.q, new IntentFilter(s), 4);
            } else {
                this.f4222b.get().registerReceiver(this.q, new IntentFilter(s));
            }
        }
    }

    public void D(FragmentActivity fragmentActivity, SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        Logger.i(this.f4221a, "startScreenRecord");
        MediaProjection mediaProjection = this.g;
        if (mediaProjection == null) {
            y(fragmentActivity, sharePathVideoAmapActivity);
        } else {
            B(mediaProjection);
        }
        this.n = true;
    }

    public void E() {
        VirtualDisplay virtualDisplay = this.i;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.i.release();
            this.i = null;
        }
        MediaProjection mediaProjection = this.g;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.l);
            this.g.stop();
            this.g = null;
        }
        if (this.j != null) {
            this.j = null;
        }
    }

    public void F() {
        wgl wglVar = this.f;
        if (wglVar != null) {
            wglVar.r();
        }
        this.f = null;
        E();
        try {
            if (this.f4222b.get() != null) {
                this.f4222b.get().unregisterReceiver(this.q);
            }
        } catch (Exception unused) {
        }
    }

    public final void G() {
        Logger.i(this.f4221a, "stopRecordingAndOpenFile starting");
        if (this.m.get() == null) {
            return;
        }
        this.m.get().endRecordTrace();
        Logger.i(this.f4221a, "stopRecordingAndOpenFile endRecordTrace mFragmentWeak.get()=" + this.m.get());
        if (this.f != null && this.o != null && !this.m.get().getIsPlaying()) {
            this.m.get().postDelay(new Runnable() { // from class: xgl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39102a.v();
                }
            }, 0L);
        } else {
            this.n = false;
            F();
        }
    }

    public void H() {
        if (this.n) {
            if (this.f != null) {
                G();
            }
            if (this.f4222b.get() != null) {
                Intent intent = new Intent(this.f4222b.get(), (Class<?>) ScreenRecorderService.class);
                intent.putExtra(ScreenRecorderService.h, true);
                try {
                    this.f4222b.get().startService(intent);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void n() {
        if (this.f == null) {
            return;
        }
        if (this.f4222b.get() != null) {
            Toast.makeText(this.f4222b.get(), "No permission to write sd card, create file failed", 0).show();
        }
        F();
    }

    @RequiresApi(api = 29)
    public final void p(final File file) {
        if (this.m.get() != null) {
            this.m.get().postDelay(new Runnable() { // from class: ahl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1031a.s(file);
                }
            }, 500L);
        }
    }

    public final VirtualDisplay r(MediaProjection mediaProjection, mqq mqqVar) {
        if (this.i == null) {
            this.i = mediaProjection.createVirtualDisplay("ScreenRecorder-display0", mqqVar.f27109a, mqqVar.f27110b, 1, 1, null, new c(), null);
        } else {
            Point point = new Point();
            this.i.getDisplay().getSize(point);
            int i = point.x;
            int i2 = mqqVar.f27109a;
            if (i != i2 || point.y != mqqVar.f27110b) {
                this.i.resize(i2, mqqVar.f27110b, 1);
            }
        }
        return this.i;
    }

    public final /* synthetic */ void s(File file) {
        this.p = im9.w(file, "/share/TraceRecord");
        e eVar = this.o;
        if (eVar != null) {
            eVar.onStopSavingVideo(true);
            this.o.onVideoSaved(this.p);
        }
        this.m.get().showWXShare();
    }

    public void setOnSaveVideoListener(e eVar) {
        this.o = eVar;
    }

    public final /* synthetic */ void t(FragmentActivity fragmentActivity, MediaCodecInfo[] mediaCodecInfoArr) {
        this.f4223k = o(mediaCodecInfoArr);
        this.j = (MediaProjectionManager) fragmentActivity.getSystemService("media_projection");
        this.l = new d();
        MediaProjectionManager mediaProjectionManager = this.j;
        if (mediaProjectionManager != null) {
            fragmentActivity.startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 1);
        }
    }

    public final /* synthetic */ void v() {
        this.n = false;
        this.o.onStartSavingVideo();
        if (this.m.get().isInvalid()) {
            if (this.f4222b.get() != null) {
                Toast.makeText(this.f4222b.get(), j1j.L, 0).show();
            }
            e eVar = this.o;
            if (eVar != null) {
                eVar.onStopSavingVideo(false);
                return;
            }
            return;
        }
        File file = new File(this.f.l());
        Uri uriFromFile = Uri.fromFile(file);
        if (uriFromFile != null) {
            Logger.i(this.f4221a, "Recorder stopped!  Saved file " + file);
            if (this.f4222b.get() != null) {
                this.f4222b.get().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriFromFile));
            }
        }
        F();
        if (Build.VERSION.SDK_INT >= 29) {
            p(file);
        } else {
            e eVar2 = this.o;
            if (eVar2 != null) {
                eVar2.onStopSavingVideo(false);
            }
            this.m.get().showWXShare();
        }
        Logger.i(this.f4221a, "stopRecordingAndOpenFile postDelay finished");
    }

    public final wgl w(MediaProjection mediaProjection, mqq mqqVar, File file) {
        wgl wglVar = new wgl(mqqVar, null, r(mediaProjection, mqqVar), file.getAbsolutePath(), this.h);
        wglVar.y(new b(file));
        return wglVar;
    }

    public void x() {
    }

    public final void y(final FragmentActivity fragmentActivity, SharePathVideoAmapActivity sharePathVideoAmapActivity) {
        this.f4222b = new WeakReference<>(fragmentActivity);
        this.m = new WeakReference<>(sharePathVideoAmapActivity);
        vgl.e("video/avc", new vgl.a() { // from class: zgl
            @Override // vgl.a
            public final void a(MediaCodecInfo[] mediaCodecInfoArr) {
                this.f41257a.t(fragmentActivity, mediaCodecInfoArr);
            }
        });
    }

    public void z(int i, Intent intent) {
        Logger.d(this.f4221a, "start: " + i + " - " + intent.toString());
        MediaProjectionManager mediaProjectionManager = this.j;
        if (mediaProjectionManager == null) {
            Logger.d(this.f4221a, "Capture screen start failed! ProjectionManager is null");
            return;
        }
        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i, intent);
        this.g = mediaProjection;
        if (mediaProjection != null) {
            this.c = i;
            this.d = intent;
            Logger.d(this.f4221a, "start: resultCode: " + i + " - intent: " + intent);
            if (this.m.get() != null) {
                this.g.registerCallback(this.l, this.m.get().getMHandler());
            }
            B(this.g);
        }
        Logger.d(this.f4221a, "Capture screen start success!");
    }
}

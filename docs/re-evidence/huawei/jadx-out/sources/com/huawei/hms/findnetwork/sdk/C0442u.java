package com.huawei.hms.findnetwork.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl;
import com.huawei.hiar.ARTrackable;
import com.huawei.hms.findnetwork.bean.BtMeasureResult;
import com.huawei.hms.findnetwork.comm.request.bean.NearLinkNavigationResult;
import com.huawei.hms.findnetwork.comm.util.ErrorCode;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C0442u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BtMeasureResult f13242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NearLinkNavigationResult f13243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13244c;
    public long d;
    public Handler e;
    public HandlerThread f;
    public long g;

    /* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.u$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f13245a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, c cVar) {
            super(looper);
            this.f13245a = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C0442u c0442u;
            super.handleMessage(message);
            if (message.what != 1 || this.f13245a == null) {
                return;
            }
            Pair pairC = C0442u.this.c();
            NearLinkNavigationResult nearLinkNavigationResult = (NearLinkNavigationResult) pairC.second;
            if (nearLinkNavigationResult != null) {
                if (nearLinkNavigationResult.getStage() != -1.0f) {
                    this.f13245a.a(((Integer) pairC.first).intValue(), nearLinkNavigationResult);
                } else {
                    HmsFindSDKLog.i("NearLinkDataPresent", "no valid range result.");
                }
                c0442u = C0442u.this;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c0442u = C0442u.this;
                if (jCurrentTimeMillis - c0442u.g >= 10000) {
                    HmsFindSDKLog.w("NearLinkDataPresent", "remote process maybe killed.");
                    C0442u.this.d();
                    this.f13245a.a();
                    return;
                }
            }
            c0442u.e.sendEmptyMessageDelayed(1, 500L);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.u$b */
    public static final abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0442u f13247a = new C0442u();
    }

    /* JADX INFO: renamed from: com.huawei.hms.findnetwork.sdk.u$c */
    public interface c {
        void a();

        void a(int i, NearLinkNavigationResult nearLinkNavigationResult);
    }

    public static C0442u b() {
        return b.f13247a;
    }

    public final int a(int i) {
        if (i == 1) {
            return 10;
        }
        if (i != 5) {
            return i != 10 ? -1 : 12;
        }
        return 11;
    }

    public final NearLinkNavigationResult a() {
        if (this.f13242a == null || Math.abs(System.currentTimeMillis() - this.f13244c) >= 6100) {
            return null;
        }
        NearLinkNavigationResult nearLinkNavigationResult = new NearLinkNavigationResult();
        nearLinkNavigationResult.setDeviceId(this.f13242a.getSn());
        nearLinkNavigationResult.setStage(0.0f);
        nearLinkNavigationResult.setDirection(a(this.f13242a.getFlag()));
        nearLinkNavigationResult.setAngleAccuracy(this.f13242a.getPercentage());
        return nearLinkNavigationResult;
    }

    public Pair c() {
        if (this.f13243b == null || Math.abs(System.currentTimeMillis() - this.d) >= TrackAnimationControl.DISPLAY_PHOTO_DURATION) {
            return new Pair(-1, null);
        }
        float stage = this.f13243b.getStage();
        if (stage != -1.0f && stage != 3.0f) {
            return new Pair(Integer.valueOf(ARTrackable.TrackingState.PAUSED == C0423a.c().d() ? ErrorCode.CODE_AR_ENVIRONMENT_NOT_SATISFIED : 0), this.f13243b);
        }
        NearLinkNavigationResult nearLinkNavigationResultA = a();
        if (nearLinkNavigationResultA == null) {
            nearLinkNavigationResultA = this.f13243b;
        }
        return new Pair(0, nearLinkNavigationResultA);
    }

    public void d() {
        HmsFindSDKLog.i("NearLinkDataPresent", "releaseTimer");
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.e = null;
        }
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f = null;
        }
        this.f13243b = null;
        this.f13242a = null;
    }

    public void a(Runnable runnable, long j) {
        Handler handler = this.e;
        if (handler == null) {
            return;
        }
        handler.postDelayed(runnable, j);
    }

    public void a(c cVar) {
        HmsFindSDKLog.i("NearLinkDataPresent", "startTimer");
        if (this.e != null) {
            HmsFindSDKLog.i("NearLinkDataPresent", "startTimer ignore, have started");
            return;
        }
        this.g = System.currentTimeMillis();
        if (this.f == null) {
            this.f = new HandlerThread("NearLinkDataPresent");
        }
        this.f.start();
        a aVar = new a(this.f.getLooper(), cVar);
        this.e = aVar;
        aVar.sendEmptyMessageDelayed(1, 500L);
    }

    public void a(BtMeasureResult btMeasureResult) {
        this.f13242a = btMeasureResult;
        this.f13244c = System.currentTimeMillis();
    }

    public void a(NearLinkNavigationResult nearLinkNavigationResult) {
        this.f13243b = nearLinkNavigationResult;
        this.d = System.currentTimeMillis();
    }
}

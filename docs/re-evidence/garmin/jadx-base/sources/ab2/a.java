package ab2;

import al2.c;
import android.os.Build;
import androidx.lifecycle.y0;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import com.garmin.android.gncs.telephony.PhoneCallListener;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.mapbox.bindgen.Cleaner;
import java.util.ArrayList;
import kotlin.l;
import kotlin.m;
import p005kotlin.Unit;
import p1.q0;
import rd2.j;
import sd2.f;
import yr1.e;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2641a;

    public /* synthetic */ a(c cVar) {
        this.f2641a = 10;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = 0;
        switch (this.f2641a) {
            case 0:
                y0<ArrayList<f>> y0Var = b.f2643b;
                try {
                    b.f2644c.f152045a.getClass();
                    ArrayList<f> arrayListD = j.d();
                    if (arrayListD == null || arrayListD.isEmpty()) {
                        y0Var.j(new ArrayList<>(0));
                    } else {
                        y0Var.j(arrayListD);
                    }
                    return;
                } catch (Throwable th3) {
                    b.f2645d.error((String) null, th3);
                    return;
                }
            case 1:
                PhoneCallListener.onIncomingCallMissed$lambda$17();
                return;
            case 2:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                return;
            case 3:
                CrashlyticsWorker.lambda$await$6();
                return;
            case 4:
                Cleaner.lambda$create$0();
                return;
            case 5:
                q0<m> q0Var = m.O1;
                synchronized (q0Var) {
                    try {
                        int i15 = Build.VERSION.SDK_INT;
                        Object[] objArr = q0Var.f134667a;
                        int i16 = q0Var.f134668b;
                        if (i15 < 30) {
                            while (i14 < i16) {
                                m mVar = (m) objArr[i14];
                                boolean showLayoutBounds = mVar.getShowLayoutBounds();
                                m.K1.getClass();
                                mVar.setShowLayoutBounds(m.a.a());
                                if (showLayoutBounds != mVar.getShowLayoutBounds()) {
                                    mVar.post(new l(mVar, 2));
                                }
                                i14++;
                            }
                        } else {
                            while (i14 < i16) {
                                m mVar2 = (m) objArr[i14];
                                mVar2.post(new l(mVar2, 3));
                                i14++;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 6:
                androidx.media3.exoplayer.source.j.b bVar = AdsMediaSource.f9405u;
                throw null;
            case 7:
                androidx.media3.exoplayer.source.j.b bVar2 = AdsMediaSource.f9405u;
                throw null;
            case 8:
                int i17 = v.l.C;
                return;
            case 9:
                return;
            default:
                e eVar = e.f199078a;
                return;
        }
    }

    public /* synthetic */ a(int i14) {
        this.f2641a = i14;
    }

    public /* synthetic */ a(AdsMediaSource adsMediaSource, AdsMediaSource.c cVar, int i14) {
        this.f2641a = i14;
    }
}

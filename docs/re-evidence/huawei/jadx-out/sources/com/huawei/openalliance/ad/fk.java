package com.huawei.openalliance.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fk f18797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f18798b;
    private static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f18799c;

    public void b() {
        if (this.f18799c != null) {
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.fk.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        hw.b("PlayAdStatusHandler", "unregisterPPSReceiver");
                        fk.f18798b.unregisterReceiver(fk.this.f18799c);
                    } catch (Throwable th) {
                        try {
                            hw.b("PlayAdStatusHandler", "unregister error," + th.getClass().getSimpleName());
                        } finally {
                            fk.this.f18799c = null;
                        }
                    }
                }
            });
        }
    }

    public void a() {
        if (this.f18799c != null) {
            b();
        }
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.fk.1
            @Override // java.lang.Runnable
            public void run() {
                IntentFilter intentFilter = new IntentFilter(Constants.ACTION_REWARD_STATUS_CHANGED);
                fk.this.f18799c = new a();
                com.huawei.openalliance.ad.utils.as.a(fk.f18798b, fk.this.f18799c, intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
                hw.b("PlayAdStatusHandler", "registerPPSReceiver");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.huawei.openalliance.ad.processor.eventbeans.b b(String str) {
        MaterialClickInfo materialClickInfo = new MaterialClickInfo();
        materialClickInfo.e(0);
        materialClickInfo.h(1);
        return new com.huawei.openalliance.ad.processor.eventbeans.b.a().a((Integer) 89).b(str).d(com.huawei.openalliance.ad.utils.b.a((Object) f18798b)).a(materialClickInfo).a();
    }

    private static fk b(Context context) {
        fk fkVar;
        synchronized (d) {
            if (f18797a == null) {
                f18797a = new fk(context);
            }
            fkVar = f18797a;
        }
        return fkVar;
    }

    public static fk a(Context context) {
        return b(context);
    }

    static class a extends BroadcastReceiver {
        /* JADX WARN: Code duplicated, block: B:49:0x00de  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StringBuilder sb;
            pc pcVar;
            com.huawei.openalliance.ad.processor.eventbeans.b bVarB;
            String str;
            hw.b("PlayAdStatusHandler", "onReceive:" + intent.getAction());
            if (Constants.ACTION_REWARD_STATUS_CHANGED.equals(intent.getAction())) {
                try {
                    com.huawei.openalliance.ad.inter.data.i iVarB = df.b();
                    if (iVarB == null) {
                        str = "can not get reward";
                    } else {
                        ContentRecord contentRecordA = pw.a(iVarB);
                        IRewardAdStatusListener iRewardAdStatusListenerAe = iVarB.ae();
                        String stringExtra = intent.getStringExtra(Constants.KEY_REWARD_STATUS);
                        String strA = iVarB.A();
                        hw.b("PlayAdStatusHandler", "status:" + stringExtra);
                        if (iRewardAdStatusListenerAe != null) {
                            if (contentRecordA != null) {
                                pcVar = new pc(context, sw.a(context, contentRecordA.f()), contentRecordA);
                                pcVar.a(contentRecordA);
                            } else {
                                pcVar = null;
                            }
                            if (pcVar == null) {
                                return;
                            }
                            com.huawei.openalliance.ad.analysis.c cVar = new com.huawei.openalliance.ad.analysis.c(context);
                            switch (stringExtra) {
                                case "PackageLoadedShow":
                                    pt.a(contentRecordA).d(com.huawei.openalliance.ad.utils.b.a((Object) context));
                                    cVar.a(strA, context, contentRecordA, "2100043");
                                    pcVar.a(new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a().a());
                                    iRewardAdStatusListenerAe.onAdShown();
                                    break;
                                case "EndPageShow":
                                    cVar.a(strA, context, contentRecordA, "2100044");
                                    iRewardAdStatusListenerAe.onAdClosed();
                                    break;
                                case "WidgetLaunchGameClick":
                                    bVarB = fk.b(ClickDestination.WIDGET_APP);
                                    pcVar.a(bVarB);
                                    iRewardAdStatusListenerAe.onAdClicked();
                                    break;
                                case "PageClose":
                                    pcVar.a(0, 0, (List<String>) null);
                                    if (fk.f18797a != null) {
                                        fk.f18797a.b();
                                        break;
                                    }
                                    break;
                                case "LaunchGameClick":
                                    bVarB = fk.b(ClickDestination.LAUNCH_GAME_APP);
                                    pcVar.a(bVarB);
                                    iRewardAdStatusListenerAe.onAdClicked();
                                    break;
                                case "AddShortCutClick":
                                    bVarB = fk.b(ClickDestination.SHORT_CUT);
                                    pcVar.a(bVarB);
                                    iRewardAdStatusListenerAe.onAdClicked();
                                    break;
                                case "OnRewarded":
                                    pcVar.a(contentRecordA.aC(), contentRecordA.aD(), "");
                                    cVar.a(strA, context, contentRecordA, "2100045");
                                    iRewardAdStatusListenerAe.onRewarded();
                                    break;
                                case "OnError":
                                    cVar.a(strA, context, contentRecordA, "2100042");
                                    iRewardAdStatusListenerAe.onAdError(-1, -2);
                                    if (fk.f18797a == null) {
                                    }
                                    fk.f18797a.b();
                                    break;
                                case "PlayGameClick":
                                    bVarB = fk.b(ClickDestination.PLAY_GAME);
                                    pcVar.a(bVarB);
                                    iRewardAdStatusListenerAe.onAdClicked();
                                    break;
                                default:
                                    break;
                            }
                        }
                        str = "there is no status listener";
                    }
                    hw.c("PlayAdStatusHandler", str);
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder("handler reward status changed error,");
                    sb.append(e.getClass().getSimpleName());
                    hw.d("PlayAdStatusHandler", sb.toString());
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("handler reward status changed error,");
                    sb.append(e.getClass().getSimpleName());
                    hw.d("PlayAdStatusHandler", sb.toString());
                }
            }
        }

        private a() {
        }
    }

    private fk(Context context) {
        f18798b = context.getApplicationContext();
    }
}

package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes23.dex */
public class chb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f1594a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f1595b = new HashMap();
    private TimerTask d = null;
    public static final Map<String, String> e = new ConcurrentHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Timer f1593c = new Timer("VoipResendHandle");

    public void c() {
        if (this.d != null) {
            LogUtil.a("VoipResendHandle", "onNotificationRemoved cleaResendLongVibrateCache timerTask cancel");
            this.d.cancel();
        } else {
            LogUtil.a("VoipResendHandle", "onNotificationRemoved clearResendLongVibrateCache timerTask is null");
        }
    }

    public void e() {
        this.f1594a.put("com.whatsapp", "reject_call");
        this.f1594a.put("jp.naver.line.android", "com.linecorp.intent.action.voip.default");
        this.f1594a.put("com.instagram.android", "DECLINE");
        this.f1594a.put("org.telegram.messenger", "org.telegram.messenger.DECLINE_CALL");
        this.f1594a.put("com.facebook.orca", "com.facebook.intent.action.prod.RTC_DECLINE_CALL_ACTION");
        this.f1594a.put("com.viber.voip", "com.viber.voip.action.REJECT_CALL");
        this.f1594a.put("org.thoughtcrime.securesms", "org.thoughtcrime.securesms.service.webrtc.ActiveCallAction.DENY");
        this.f1595b.put("com.whatsapp", "hangup_call");
        this.f1595b.put("jp.naver.line.android", "com.linecorp.intent.action.voip.default");
        this.f1595b.put("com.instagram.android", "LEAVE");
        this.f1595b.put("org.telegram.messenger", "org.telegram.messenger.END_CALL");
        this.f1595b.put("com.facebook.orca", "com.facebook.rtc.fbwebrtc.intent.action.HOSTED_FRAGMENT_SHOW_UI");
        this.f1595b.put("org.thoughtcrime.securesms", "org.thoughtcrime.securesms.service.webrtc.ActiveCallAction.HANGUP");
    }

    public void d(String str) {
        LogUtil.e("VoipResendHandle", "createResendLongVibrateCache put  app=", str);
        Map<String, String> map = e;
        map.put(str, str);
        TimerTask timerTask = this.d;
        if (timerTask != null) {
            timerTask.cancel();
        }
        try {
            TimerTask timerTaskC = c(map, str);
            this.d = timerTaskC;
            f1593c.schedule(timerTaskC, 60000L);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            ReleaseLogUtil.a("VoipResendHandle", "activeClearMapTimerTaskAfterGap exception: ", ExceptionUtils.c(e2));
        }
    }

    private TimerTask c(final Map map, final String str) {
        return new TimerTask() { // from class: chb.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                map.clear();
                ReleaseLogUtil.d("Notify_VoipResendHandle", str, " map been cleared");
            }
        };
    }
}

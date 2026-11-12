package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.health.suggestion.ui.fitness.helper.MediaHelper;
import com.huawei.health.suggestion.ui.fitness.module.LongCoachView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes31.dex */
public class hku extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36855b;
    private WeakReference<LongCoachView> d;

    public hku(LongCoachView longCoachView) {
        this.d = new WeakReference<>(longCoachView);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            LogUtil.j("Suggestion_UpdateUiHandler", "UpdateUiHandler msg is null!");
            return;
        }
        super.handleMessage(message);
        LongCoachView longCoachView = this.d.get();
        if (longCoachView == null) {
            LogUtil.j("Suggestion_UpdateUiHandler", "UpdateUiHandler msg is null!");
            return;
        }
        if (message.what == 1200) {
            LogUtil.j("Suggestion_UpdateUiHandler", "last updateTime is 5 mins ago");
            return;
        }
        if (message.what == 1201 && longCoachView.c() != null && longCoachView.c().getVisibility() == 0) {
            longCoachView.c().setVisibility(8);
            longCoachView.e(8);
            return;
        }
        if (message.what == 1202) {
            e(longCoachView);
            return;
        }
        if (message.what == 1204 && longCoachView.getLockLayout() != null) {
            longCoachView.getLockLayout().setVisibility(hjg.e(longCoachView.getLockLayout()));
        } else if (message.what == 1203 && longCoachView.getLockLayout() != null && longCoachView.getLockLayout().getVisibility() == 0) {
            longCoachView.getLockLayout().setVisibility(8);
        } else {
            LogUtil.d("Suggestion_UpdateUiHandler", "Message mStation unexpected");
        }
    }

    private void e(LongCoachView longCoachView) {
        MediaHelper mediaHelperF = longCoachView.f();
        if (mediaHelperF != null && mediaHelperF.j() != this.f36855b) {
            HealthTextView healthTextViewM = longCoachView.m();
            healthTextViewM.setVisibility(0);
            int iJ = mediaHelperF.j();
            this.f36855b = iJ;
            hkk.b(iJ, healthTextViewM, longCoachView.k(), longCoachView.o());
        }
        sendEmptyMessageDelayed(1202, 500L);
    }
}

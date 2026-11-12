package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.soundaction.manager.EventDispatcher;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwvoiceplaymodel.IVoiceHandler;

/* JADX INFO: loaded from: classes31.dex */
public class gyn implements EventDispatcher {
    private static final Object d = new Object();
    private static gyn e;

    public static gyn a() {
        gyn gynVar;
        synchronized (d) {
            if (e == null) {
                e = new gyn();
            }
            gynVar = e;
        }
        return gynVar;
    }

    @Override // com.huawei.health.soundaction.manager.EventDispatcher
    public boolean dispatchEvent(Object obj) {
        String strB = gyr.b(obj);
        if (TextUtils.isEmpty(strB)) {
            return false;
        }
        LogUtil.a("Track_VoiceRequestDispatcher", "dispatchEvent eventMsg = ", strB);
        Bundle bundle = new Bundle();
        bundle.putString("voiceMessage", strB);
        IVoiceHandler iVoiceHandlerA = a(strB);
        if (iVoiceHandlerA == null || nwa.n().s()) {
            return false;
        }
        LogUtil.a("Track_VoiceRequestDispatcher", "dispatchEvent result = ", Integer.valueOf(iVoiceHandlerA.handleVoiceEvent(bundle)));
        return true;
    }

    private IVoiceHandler a(String str) {
        if (str.startsWith("running")) {
            return gyp.d();
        }
        if (str.startsWith("suggestion")) {
            return gyo.e();
        }
        return null;
    }
}

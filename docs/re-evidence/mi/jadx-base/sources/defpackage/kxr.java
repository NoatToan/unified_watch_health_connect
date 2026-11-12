package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;

/* JADX INFO: loaded from: classes2.dex */
public class kxr implements czr {
    @Override // defpackage.czr
    public void a(YRNTraceEvent yRNTraceEvent) {
        gur gurVarD;
        if (yRNTraceEvent == null || TextUtils.isEmpty(yRNTraceEvent.getAppName()) || (gurVarD = vwr.g().d(yRNTraceEvent.getAppName())) == null || gurVarD.k() == null) {
            return;
        }
        gurVarD.k().handleTraceEvent(yRNTraceEvent);
    }
}

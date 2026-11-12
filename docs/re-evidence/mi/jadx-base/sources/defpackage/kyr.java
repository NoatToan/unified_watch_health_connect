package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.a;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class kyr {
    public static a a(Activity activity, String str, String str2, List<cej> list, boolean z, String str3, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        jdj jdjVarM = a.t().e(vwr.g().a()).f(activity).m(z);
        if (TextUtils.isEmpty(str2)) {
            str2 = "index.android";
        }
        jdjVarM.k(str2);
        jdjVarM.h(activity != null ? LifecycleState.BEFORE_RESUME : LifecycleState.BEFORE_CREATE);
        if (list == null || list.isEmpty()) {
            list = new ArrayList<>();
            list.add(new x1f());
        }
        jdjVarM.b(list);
        if (nativeModuleCallExceptionHandler != null) {
            jdjVarM.l(nativeModuleCallExceptionHandler);
        }
        jdjVarM.i(str);
        a aVarC = jdjVarM.c();
        if (z) {
            p06 devSettings = aVarC.D().getDevSettings();
            devSettings.setRemoteJSDebugEnabled(false);
            if (devSettings instanceof b) {
                ((b) devSettings).c().d(str3);
            }
        }
        return aVarC;
    }
}

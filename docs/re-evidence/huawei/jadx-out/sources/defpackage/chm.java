package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.huawei.codevalueplatform.coderule.bean.basebean.Rule;
import com.huawei.codevalueplatform.coderule.model.CodeRulesUpdater;
import com.huawei.hms.network.NetworkKit;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class chm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1608a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f1609b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f1610c = "";
    private static boolean d = false;
    private static int e = 250;

    public static void c(Application application, String str) {
        f1609b = application;
        f1610c = str;
        NetworkKit.init(application, new NetworkKit.Callback() { // from class: chm.2
            @Override // com.huawei.hms.network.NetworkKit.Callback
            public void onResult(boolean z) {
                cib.b("CodeValuePlatform", "NetworkKit init isSuccess: " + z);
            }
        });
    }

    public static void i() {
        f1608a = true;
    }

    public static boolean b() {
        return f1608a;
    }

    public static boolean h() {
        return d;
    }

    public static int e() {
        return e;
    }

    public static Context c() {
        return f1609b;
    }

    public static String d() {
        return f1610c;
    }

    public static void c(String str, CodeRulesUpdater.UpdateCallback updateCallback) {
        new CodeRulesUpdater().b(str, updateCallback);
    }

    public static List<Rule> a() {
        return new CodeRulesUpdater().b();
    }

    public static Intent b(String str, List<Rule> list) {
        return new chl().c(str, list);
    }
}

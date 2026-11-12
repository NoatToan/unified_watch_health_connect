package com.huawei.health.qrcode;

import android.app.Application;
import android.content.Intent;
import com.huawei.codevalueplatform.coderule.bean.basebean.Rule;
import com.huawei.codevalueplatform.coderule.model.CodeRulesUpdater;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.chm;
import defpackage.lst;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class CodeValueUtil {

    public interface RuleResultCallback {
        void onResponse(String str, d dVar);
    }

    public static void b(Application application, String str) {
        chm.c(application, str);
    }

    public static void c() {
        LogUtil.a("CodeValueUtil", "setLogEnable logging enabled");
        chm.i();
    }

    public static void b(String str, final RuleResultCallback ruleResultCallback) {
        LogUtil.d("CodeValueUtil", "checkToUpdateRules with url:", str);
        chm.c(str, new CodeRulesUpdater.UpdateCallback() { // from class: com.huawei.health.qrcode.CodeValueUtil.1
            @Override // com.huawei.codevalueplatform.coderule.model.CodeRulesUpdater.UpdateCallback
            public void onUpdate(String str2, List<Rule> list) {
                ruleResultCallback.onResponse(str2, new d(list));
            }
        });
    }

    public static d b() {
        return new d(chm.a());
    }

    public static Intent a(String str, d dVar) {
        return chm.b(str, dVar.b());
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Rule> f8647a;

        public d(List<Rule> list) {
            this.f8647a = list;
        }

        public List<Rule> b() {
            return (List) lst.d(this.f8647a);
        }

        public int d() {
            List<Rule> list = this.f8647a;
            if (list != null) {
                return list.size();
            }
            LogUtil.j("CodeValueUtil_RuleInfo", "ruleList is null");
            return -1;
        }
    }
}

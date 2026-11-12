package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwhealthdatamgr.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nlm extends nlc {
    @Override // defpackage.nlc
    public int a() {
        return 10;
    }

    @Override // defpackage.nlc
    public String e(long j) {
        return String.valueOf(j);
    }

    @Override // defpackage.nlc
    public String c(int i) {
        if (this.f43249a == null) {
            return "";
        }
        String strB = jaa.b(this.f43249a);
        if (!TextUtils.isEmpty(strB) && LanguageUtil.f(BaseApplication.b())) {
            return String.format(qre.f(R.string.IDS_sport_history_run_course_name), jaa.d(BaseApplication.b(), i), strB);
        }
        return jaa.d(BaseApplication.b(), i);
    }
}

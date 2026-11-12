package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class wuo {
    public static int e() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            return R.drawable.health_navbar_rtl_back_selector;
        }
        return com.huawei.health.servicesui.R.drawable.hwsearchview_ic_public_back;
    }
}

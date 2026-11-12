package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.configuredpage.ConfiguredFlagInterface;

/* JADX INFO: loaded from: classes19.dex */
public class ube implements ConfiguredFlagInterface {
    @Override // com.huawei.ui.main.stories.configuredpage.ConfiguredFlagInterface
    public String getConfiguredContents(String str) {
        if ("sleep_heartHealth".equals(str)) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_health_heart_study_app_install_tips);
        }
        return "";
    }
}

package defpackage;

import com.google.gson.reflect.TypeToken;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.ui.main.stories.template.BaseParser;

/* JADX INFO: loaded from: classes19.dex */
public class wid implements BaseParser {
    @Override // com.huawei.ui.main.stories.template.BaseParser
    public <T extends BaseTemplateConfig> wpf<T> parse(String str) {
        return (wpf) wqm.e(str, new TypeToken<wpf<why>>() { // from class: com.huawei.ui.main.stories.privacy.template.util.PrivacyDataDetailTemplateParser$1
        }.getType());
    }
}

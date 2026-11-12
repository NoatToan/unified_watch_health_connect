package defpackage;

import com.google.gson.reflect.TypeToken;
import com.huawei.tabtemplate.BaseTemplateConfig;
import com.huawei.ui.main.stories.template.BaseParser;

/* JADX INFO: loaded from: classes19.dex */
public class wqi implements BaseParser {
    @Override // com.huawei.ui.main.stories.template.BaseParser
    public <T extends BaseTemplateConfig> wpf<T> parse(String str) {
        return (wpf) wqm.e(str, new TypeToken<wpf<qen>>() { // from class: com.huawei.ui.main.stories.template.health.parser.SportTemplateConfigParser$1
        }.getType());
    }
}

package defpackage;

import com.huawei.ui.main.stories.template.BasePresenter;
import com.huawei.ui.main.stories.template.BaseView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wij {
    private static Map<String, Class> d = new HashMap<String, Class>(16) { // from class: wij.2
        private static final long serialVersionUID = -7839806308839555166L;

        {
            put("privacy_model_activity_presenter", wie.class);
            put("group_data_fragment_presenter", whv.class);
            put("double_group_data_fragment_presenter", whx.class);
            put("day_data_fragment_presenter", whw.class);
        }
    };

    public static <T extends BasePresenter> T d(String str, BaseView baseView) {
        return (T) wqu.b(d.get(str), baseView);
    }
}

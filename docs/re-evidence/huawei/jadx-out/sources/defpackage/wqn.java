package defpackage;

import com.huawei.ui.main.stories.template.BasePresenter;
import com.huawei.ui.main.stories.template.BaseView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wqn {
    private static Map<String, Class<? extends BasePresenter>> e = new HashMap<String, Class<? extends BasePresenter>>(16) { // from class: wqn.3
        private static final long serialVersionUID = -351216119762982286L;

        {
            put("health_no_device_presenter", wqf.class);
            put("health_common_content_presenter", wpt.class);
            put("health_common_activity_presenter", uxd.class);
            put("health_day_content_presenter", uyc.class);
            put("health_week_content_presenter", uyc.class);
            put("health_month_content_presenter", uyc.class);
            put("temperature_activity_presenter", vax.class);
        }
    };

    public static <T extends BasePresenter> T e(String str, BaseView baseView) {
        return (T) wqu.b(e.get(str), baseView);
    }
}

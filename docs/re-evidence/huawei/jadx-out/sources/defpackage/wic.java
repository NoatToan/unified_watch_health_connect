package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyDayDataView;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyDoubleGroupDataView;
import com.huawei.ui.main.stories.privacy.template.view.component.PrivacyGroupDataView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wic {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Class> f52077c = new HashMap<String, Class>(16) { // from class: wic.5
        private static final long serialVersionUID = -6059043297075236209L;

        {
            put("privacy_group_data_view", PrivacyGroupDataView.class);
            put("privacy_double_group_data_view", PrivacyDoubleGroupDataView.class);
            put("privacy_day_data_view", PrivacyDayDataView.class);
        }
    };

    public static <T extends BaseComponent> T a(String str, Context context) {
        return (T) e(f52077c.get(str), context);
    }

    public static <T extends BaseComponent> T e(Class<T> cls, Context context) {
        Constructor<T> constructor;
        if (cls == null || context == null) {
            constructor = null;
        } else {
            try {
                constructor = cls.getConstructor(Context.class);
            } catch (NoSuchMethodException unused) {
                LogUtil.e("PrivacyComponentProvider", "ClassNotFoundException or NoSuchMethodException:");
                constructor = null;
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(context);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            LogUtil.e("PrivacyComponentProvider", "IllegalAccessException or InstantiationException or InvocationTargetException");
            return null;
        }
    }
}

package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.template.BaseComponent;
import com.huawei.ui.main.stories.template.BasePresenter;
import com.huawei.ui.main.stories.template.BaseView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class wqu {
    public static <T extends BasePresenter> T b(Class<T> cls, BaseView baseView) {
        Constructor<T> constructor;
        T t = null;
        try {
            constructor = cls.getConstructor(new Class[0]);
        } catch (NoSuchMethodException unused) {
            LogUtil.e("PowerUtil", "NoSuchMethodException");
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            T t2 = (T) ((Constructor) Objects.requireNonNull(constructor)).newInstance(new Object[0]);
            try {
                t2.attachView(baseView);
                return t2;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                t = t2;
                LogUtil.e("PowerUtil", "IllegalAccessException or InstantiationException or InvocationTargetException");
                return t;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused3) {
        }
    }

    public static <T extends BaseComponent> T b(Class<T> cls, Context context) {
        Constructor<T> constructor;
        if (cls == null || context == null) {
            constructor = null;
        } else {
            try {
                constructor = cls.getConstructor(Context.class);
            } catch (NoSuchMethodException unused) {
                LogUtil.e("PowerUtil", "ClassNotFoundException or NoSuchMethodException:");
                constructor = null;
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(context);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            LogUtil.e("PowerUtil", "IllegalAccessException or InstantiationException or InvocationTargetException");
            return null;
        }
    }
}

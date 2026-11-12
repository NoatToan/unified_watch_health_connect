package defpackage;

import android.text.TextUtils;
import com.huawei.health.h5pro.service.H5ProServiceLiveTerm;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class exs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f33649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H5ProServiceLiveTerm f33650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, ext> f33651c;
    private String[] e;

    public exs(Class<?> cls) {
        this(cls, true);
    }

    public String[] a() {
        return this.e;
    }

    public H5ProServiceLiveTerm b() {
        return this.f33650b;
    }

    public ext c(String str) {
        return this.f33651c.get(str);
    }

    public Object c() {
        return this.f33649a;
    }

    public String d() {
        Object obj = this.f33649a;
        if (obj != null) {
            return obj.getClass().getName();
        }
        Map<String, ext> map = this.f33651c;
        return (map == null || map.isEmpty()) ? "" : this.f33651c.values().iterator().next().c().getDeclaringClass().getName();
    }

    public exs(Object obj) {
        this(obj.getClass(), false);
        this.f33649a = obj;
    }

    private exs(Class<?> cls, boolean z) {
        H5ProMethod h5ProMethod;
        H5ProService h5ProService = (H5ProService) cls.getAnnotation(H5ProService.class);
        this.e = h5ProService.users();
        this.f33650b = h5ProService.liveTerm();
        this.f33651c = new HashMap();
        for (Method method : cls.getMethods()) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && ((!z || Modifier.isStatic(modifiers)) && (h5ProMethod = (H5ProMethod) method.getAnnotation(H5ProMethod.class)) != null)) {
                String strName = h5ProMethod.name();
                this.f33651c.put(TextUtils.isEmpty(strName) ? method.getName() : strName, new ext(method, h5ProMethod.scope()));
            }
        }
    }
}

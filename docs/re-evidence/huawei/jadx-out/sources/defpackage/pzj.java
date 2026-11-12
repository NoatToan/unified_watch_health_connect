package defpackage;

import com.huawei.skinner.attrentry.SkinAttr;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class pzj extends HashMap<pyi.b, Class<? extends SkinAttr>> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Class<? extends SkinAttr> put(pyi.b bVar, Class<? extends SkinAttr> cls) {
        Class<? extends SkinAttr> cls2 = get(bVar);
        if (cls2 != null) {
            try {
                if (cls.newInstance().getPriority() > cls2.newInstance().getPriority()) {
                    return (Class) super.put(bVar, cls);
                }
                return null;
            } catch (IllegalAccessException e) {
                pyx.b("SkinAttrPriorityMap.put: IllegalAccessException: " + e.getMessage());
                return null;
            } catch (InstantiationException e2) {
                pyx.b("SkinAttrPriorityMap.put: InstantiationException: " + e2.getMessage());
                return null;
            }
        }
        return (Class) super.put(bVar, cls);
    }
}

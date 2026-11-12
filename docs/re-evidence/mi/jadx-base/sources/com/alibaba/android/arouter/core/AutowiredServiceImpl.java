package com.alibaba.android.arouter.core;

import android.content.Context;
import android.util.LruCache;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.AutowiredService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Route(path = "/arouter/service/autowired")
public class AutowiredServiceImpl implements AutowiredService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LruCache<String, ISyringe> f5709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f5710b;

    public final void a(Object obj, Class<?> cls) {
        if (cls == null) {
            cls = obj.getClass();
        }
        ISyringe iSyringeB = b(cls);
        if (iSyringeB != null) {
            iSyringeB.inject(obj);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass.getName().startsWith(PluginPackageConstant.RN_DIR_A)) {
            return;
        }
        a(obj, superclass);
    }

    @Override // com.alibaba.android.arouter.facade.service.AutowiredService
    public void autowire(Object obj) {
        a(obj, null);
    }

    public final ISyringe b(Class<?> cls) {
        String name = cls.getName();
        try {
            if (this.f5710b.contains(name)) {
                return null;
            }
            ISyringe iSyringe = this.f5709a.get(name);
            if (iSyringe == null) {
                iSyringe = (ISyringe) Class.forName(cls.getName() + "$$ARouter$$Autowired").getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            this.f5709a.put(name, iSyringe);
            return iSyringe;
        } catch (Exception unused) {
            this.f5710b.add(name);
            return null;
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        this.f5709a = new LruCache<>(50);
        this.f5710b = new ArrayList();
    }
}

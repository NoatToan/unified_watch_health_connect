package cn.hutool.core.bean;

import defpackage.bbk;
import defpackage.fdi;
import defpackage.i04;
import defpackage.qk1;
import defpackage.rh2;
import defpackage.s14;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DynaBean extends s14<DynaBean> implements Serializable {
    private static final long serialVersionUID = 1;
    private final Object bean;
    private final Class<?> beanClass;

    public DynaBean(Class<?> cls, Object... objArr) {
        this(bbk.t(cls, objArr));
    }

    public static DynaBean create(Object obj) {
        return new DynaBean(obj);
    }

    public boolean containsProp(String str) {
        return rh2.o(this.beanClass).getProp(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynaBean dynaBean = (DynaBean) obj;
        Object obj2 = this.bean;
        if (obj2 == null) {
            return dynaBean.bean == null;
        }
        return obj2.equals(dynaBean.bean);
    }

    public <T> T get(String str) throws BeanException {
        if (Map.class.isAssignableFrom(this.beanClass)) {
            return (T) ((Map) this.bean).get(str);
        }
        fdi prop = rh2.o(this.beanClass).getProp(str);
        if (prop != null) {
            return (T) prop.i(this.bean);
        }
        throw new BeanException("No public field or get method for {}", str);
    }

    public <T> T getBean() {
        return (T) this.bean;
    }

    public <T> Class<T> getBeanClass() {
        return (Class<T>) this.beanClass;
    }

    public int hashCode() {
        Object obj = this.bean;
        return 31 + (obj == null ? 0 : obj.hashCode());
    }

    public Object invoke(String str, Object... objArr) {
        return bbk.p(this.bean, str, objArr);
    }

    public <T> T safeGet(String str) {
        try {
            return (T) get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void set(String str, Object obj) throws BeanException {
        if (Map.class.isAssignableFrom(this.beanClass)) {
            ((Map) this.bean).put(str, obj);
            return;
        }
        fdi prop = rh2.o(this.beanClass).getProp(str);
        if (prop == null) {
            throw new BeanException("No public field or set method for {}", str);
        }
        prop.q(this.bean, obj);
    }

    public String toString() {
        return this.bean.toString();
    }

    public DynaBean(Class<?> cls) {
        this(bbk.t(cls, new Object[0]));
    }

    public static DynaBean create(Class<?> cls) {
        return new DynaBean(cls);
    }

    public DynaBean(Object obj) {
        qk1.t(obj);
        obj = obj instanceof DynaBean ? ((DynaBean) obj).getBean() : obj;
        this.bean = obj;
        this.beanClass = i04.a(obj);
    }

    public static DynaBean create(Class<?> cls, Object... objArr) {
        return new DynaBean(cls, objArr);
    }
}

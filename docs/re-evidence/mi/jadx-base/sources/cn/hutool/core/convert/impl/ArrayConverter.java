package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import defpackage.apd;
import defpackage.g4h;
import defpackage.qj1;
import defpackage.tt3;
import defpackage.w73;
import defpackage.yj4;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ArrayConverter extends AbstractConverter<Object> {
    private static final long serialVersionUID = 1;
    private boolean ignoreElementError;
    private final Class<?> targetComponentType;
    private final Class<?> targetType;

    public ArrayConverter(Class<?> cls) {
        this(cls, false);
    }

    private Object convertArrayToArray(Object obj) {
        if (qj1.w(obj) == this.targetComponentType) {
            return obj;
        }
        int iG = qj1.G(obj);
        Object objNewInstance = Array.newInstance(this.targetComponentType, iG);
        for (int i = 0; i < iG; i++) {
            Array.set(objNewInstance, i, convertComponentType(Array.get(obj, i)));
        }
        return objNewInstance;
    }

    private Object convertComponentType(Object obj) {
        return yj4.f(this.targetComponentType, obj, null, this.ignoreElementError);
    }

    private Object convertObjectToArray(Object obj) {
        if (obj instanceof CharSequence) {
            Class<?> cls = this.targetComponentType;
            return (cls == Character.TYPE || cls == Character.class) ? convertArrayToArray(obj.toString().toCharArray()) : convertArrayToArray(tt3.b0(obj.toString(), ','));
        }
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            Object objNewInstance = Array.newInstance(this.targetComponentType, list.size());
            while (i < list.size()) {
                Array.set(objNewInstance, i, convertComponentType(list.get(i)));
                i++;
            }
            return objNewInstance;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            Object objNewInstance2 = Array.newInstance(this.targetComponentType, collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Array.set(objNewInstance2, i, convertComponentType(it.next()));
                i++;
            }
            return objNewInstance2;
        }
        if (obj instanceof Iterable) {
            List listD = apd.d((Iterable) obj);
            Object objNewInstance3 = Array.newInstance(this.targetComponentType, listD.size());
            while (i < listD.size()) {
                Array.set(objNewInstance3, i, convertComponentType(listD.get(i)));
                i++;
            }
            return objNewInstance3;
        }
        if (!(obj instanceof Iterator)) {
            if ((obj instanceof Number) && Byte.TYPE == this.targetComponentType) {
                return w73.l((Number) obj);
            }
            return ((obj instanceof Serializable) && Byte.TYPE == this.targetComponentType) ? g4h.j(obj) : convertToSingleElementArray(obj);
        }
        List listE = apd.e((Iterator) obj);
        Object objNewInstance4 = Array.newInstance(this.targetComponentType, listE.size());
        while (i < listE.size()) {
            Array.set(objNewInstance4, i, convertComponentType(listE.get(i)));
            i++;
        }
        return objNewInstance4;
    }

    private Object[] convertToSingleElementArray(Object obj) {
        Object[] objArrK = qj1.K(this.targetComponentType, 1);
        objArrK[0] = convertComponentType(obj);
        return objArrK;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Object convertInternal(Object obj) {
        return obj.getClass().isArray() ? convertArrayToArray(obj) : convertObjectToArray(obj);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Object> getTargetType() {
        return this.targetType;
    }

    public void setIgnoreElementError(boolean z) {
        this.ignoreElementError = z;
    }

    public ArrayConverter(Class<?> cls, boolean z) {
        Class cls2 = cls == null ? Object[].class : cls;
        if (cls2.isArray()) {
            this.targetType = cls2;
            this.targetComponentType = cls2.getComponentType();
        } else {
            this.targetComponentType = cls2;
            this.targetType = qj1.v(cls2);
        }
        this.ignoreElementError = z;
    }
}

package cn.hutool.core.bean;

import cn.hutool.core.map.CaseInsensitiveMap;
import cn.hutool.core.util.ModifierUtil;
import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.bbk;
import defpackage.fdi;
import defpackage.qk1;
import defpackage.r43;
import defpackage.tt3;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BeanDesc implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<?> beanClass;
    private final Map<String, fdi> propMap = new LinkedHashMap();

    public BeanDesc(Class<?> cls) {
        qk1.t(cls);
        this.beanClass = cls;
        init();
    }

    private fdi createProp(Field field, Method[] methodArr) {
        fdi fdiVarFindProp = findProp(field, methodArr, false);
        if (fdiVarFindProp.f17680b == null || fdiVarFindProp.c == null) {
            fdi fdiVarFindProp2 = findProp(field, methodArr, true);
            if (fdiVarFindProp.f17680b == null) {
                fdiVarFindProp.f17680b = fdiVarFindProp2.f17680b;
            }
            if (fdiVarFindProp.c == null) {
                fdiVarFindProp.c = fdiVarFindProp2.c;
            }
        }
        return fdiVarFindProp;
    }

    private fdi findProp(Field field, Method[] methodArr, boolean z) {
        String name = field.getName();
        boolean zA = r43.a(field.getType());
        Method method = null;
        Method method2 = null;
        for (Method method3 : methodArr) {
            Class<?>[] parameterTypes = method3.getParameterTypes();
            if (parameterTypes.length <= 1) {
                String name2 = method3.getName();
                if (parameterTypes.length == 0) {
                    if (isMatchGetter(name2, name, zA, z)) {
                        method = method3;
                    }
                } else if (isMatchSetter(name2, name, zA, z)) {
                    method2 = method3;
                }
                if (method != null && method2 != null) {
                    break;
                }
            }
        }
        return new fdi(field, method, method2);
    }

    private BeanDesc init() {
        Method[] methodArrN = bbk.n(this.beanClass);
        for (Field field : bbk.i(this.beanClass)) {
            if (!ModifierUtil.d(field)) {
                fdi fdiVarCreateProp = createProp(field, methodArrN);
                this.propMap.putIfAbsent(fdiVarCreateProp.e(), fdiVarCreateProp);
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (("is" + r8).equals(r5) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isMatchGetter(java.lang.String r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            if (r8 == 0) goto Lc
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = r6.toLowerCase()
            r8 = r6
            goto L10
        Lc:
            java.lang.String r8 = defpackage.tt3.x0(r6)
        L10:
            java.lang.String r0 = "get"
            boolean r1 = r5.startsWith(r0)
            r2 = 0
            java.lang.String r3 = "is"
            if (r1 != 0) goto L22
            boolean r1 = r5.startsWith(r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = "getclass"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L2b
            return r2
        L2b:
            if (r7 == 0) goto L7b
            boolean r7 = r6.startsWith(r3)
            r1 = 1
            if (r7 == 0) goto L65
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L7b
        L64:
            return r1
        L65:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L7b
            return r1
        L7b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r5 = r6.equals(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.hutool.core.bean.BeanDesc.isMatchGetter(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    private boolean isMatchSetter(String str, String str2, boolean z, boolean z2) {
        String strX0;
        if (z2) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
            strX0 = str2;
        } else {
            strX0 = tt3.x0(str2);
        }
        if (!str.startsWith(CourseConfigModel.DevCmd.CMD_ACTION_SET)) {
            return false;
        }
        if (z && str2.startsWith("is")) {
            if ((CourseConfigModel.DevCmd.CMD_ACTION_SET + tt3.Q(str2, "is")).equals(str)) {
                return true;
            }
            if ((CourseConfigModel.DevCmd.CMD_ACTION_SET + strX0).equals(str)) {
                return true;
            }
        }
        return (CourseConfigModel.DevCmd.CMD_ACTION_SET + str2).equals(str);
    }

    public Field getField(String str) {
        fdi fdiVar = this.propMap.get(str);
        if (fdiVar == null) {
            return null;
        }
        return fdiVar.c();
    }

    public Method getGetter(String str) {
        fdi fdiVar = this.propMap.get(str);
        if (fdiVar == null) {
            return null;
        }
        return fdiVar.g();
    }

    public String getName() {
        return this.beanClass.getName();
    }

    public fdi getProp(String str) {
        return this.propMap.get(str);
    }

    public Map<String, fdi> getPropMap(boolean z) {
        return z ? new CaseInsensitiveMap(1.0f, this.propMap) : this.propMap;
    }

    public Collection<fdi> getProps() {
        return this.propMap.values();
    }

    public Method getSetter(String str) {
        fdi fdiVar = this.propMap.get(str);
        if (fdiVar == null) {
            return null;
        }
        return fdiVar.h();
    }

    public String getSimpleName() {
        return this.beanClass.getSimpleName();
    }
}

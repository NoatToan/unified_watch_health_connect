package cn.hutool.core.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.text.StrBuilder;
import defpackage.lio;
import defpackage.p8i;
import defpackage.qj1;
import defpackage.rh2;
import defpackage.tt3;
import defpackage.v4f;
import defpackage.yj4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class BeanPath implements Serializable {
    private static final char[] EXP_CHARS = {'.', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST};
    private static final long serialVersionUID = 1;
    private boolean isStartWith = false;
    protected List<String> patternParts;

    public BeanPath(String str) {
        init(str);
    }

    public static BeanPath create(String str) {
        return new BeanPath(str);
    }

    private static Object getFieldValue(Object obj, String str) {
        if (tt3.F(str)) {
            return null;
        }
        if (tt3.i(str, AbstractJsonLexerKt.COLON)) {
            List<String> listD0 = tt3.d0(str, AbstractJsonLexerKt.COLON);
            int i = Integer.parseInt(listD0.get(0));
            int i2 = Integer.parseInt(listD0.get(1));
            int i3 = 3 == listD0.size() ? Integer.parseInt(listD0.get(2)) : 1;
            if (obj instanceof Collection) {
                return CollUtil.t((Collection) obj, i, i2, i3);
            }
            if (qj1.B(obj)) {
                return qj1.N(obj, i, i2, i3);
            }
            return null;
        }
        if (!tt3.i(str, ',')) {
            return rh2.p(obj, str);
        }
        List<String> listD1 = tt3.d0(str, ',');
        if (obj instanceof Collection) {
            return CollUtil.f((Collection) obj, (int[]) yj4.a(int[].class, listD1));
        }
        if (qj1.B(obj)) {
            return qj1.u(obj, (int[]) yj4.a(int[].class, listD1));
        }
        int size = listD1.size();
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = tt3.v0(listD1.get(i4), '\'');
        }
        return obj instanceof Map ? v4f.k((Map) obj, strArr) : v4f.k(rh2.e(obj), strArr);
    }

    private void init(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StrBuilder strBuilderH0 = lio.H0();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (i == 0 && '$' == cCharAt) {
                this.isStartWith = true;
            } else if (p8i.a(EXP_CHARS, cCharAt)) {
                if (']' == cCharAt) {
                    if (!z) {
                        throw new IllegalArgumentException(tt3.y("Bad expression '{}':{}, we find ']' but no '[' !", str, Integer.valueOf(i)));
                    }
                    z = false;
                } else {
                    if (z) {
                        throw new IllegalArgumentException(tt3.y("Bad expression '{}':{}, we find '[' but no ']' !", str, Integer.valueOf(i)));
                    }
                    if ('[' == cCharAt) {
                        z = true;
                    }
                }
                if (strBuilderH0.length() > 0) {
                    arrayList.add(unWrapIfPossible(strBuilderH0));
                }
                strBuilderH0.reset();
            } else {
                strBuilderH0.append(cCharAt);
            }
        }
        if (z) {
            throw new IllegalArgumentException(tt3.y("Bad expression '{}':{}, we find '[' but no ']' !", str, Integer.valueOf(length - 1)));
        }
        if (strBuilderH0.length() > 0) {
            arrayList.add(unWrapIfPossible(strBuilderH0));
        }
        this.patternParts = Collections.unmodifiableList(arrayList);
    }

    private static String unWrapIfPossible(CharSequence charSequence) {
        return tt3.l(charSequence, " = ", " > ", " < ", " like ", ",") ? charSequence.toString() : tt3.v0(charSequence, '\'');
    }

    public Object get(Object obj) {
        return get(this.patternParts, obj, false);
    }

    public void set(Object obj, Object obj2) {
        set(obj, this.patternParts, obj2);
    }

    private Object get(List<String> list, Object obj, boolean z) {
        int size = list.size();
        if (z) {
            size--;
        }
        Object fieldValue = obj;
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            fieldValue = getFieldValue(fieldValue, str);
            if (fieldValue == null) {
                if (!z2 || this.isStartWith || !rh2.u(obj, str, true)) {
                    return null;
                }
                fieldValue = obj;
                z2 = false;
            }
        }
        return fieldValue;
    }

    private void set(Object obj, List<String> list, Object obj2) {
        Object obj3 = get(list, obj, true);
        if (obj3 == null) {
            set(obj, list.subList(0, list.size() - 1), new HashMap());
            obj3 = get(list, obj, true);
        }
        rh2.z(obj3, list.get(list.size() - 1), obj2);
    }
}

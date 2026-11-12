package defpackage;

import cn.hutool.core.map.CaseInsensitiveMap;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a5f implements tnq<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<?, ?> f639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f640b;

    public a5f(Map<?, ?> map, boolean z, boolean z2) {
        if (!z || (map instanceof CaseInsensitiveMap)) {
            this.f639a = map;
        } else {
            this.f639a = new CaseInsensitiveMap(map);
        }
        this.f640b = z2;
    }

    @Override // defpackage.tnq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean containsKey(String str) {
        return c(str, null) != null;
    }

    public final String c(String str, Type type) {
        if (this.f639a.containsKey(str)) {
            return str;
        }
        String strQ0 = tt3.q0(str);
        if (this.f639a.containsKey(strQ0)) {
            return strQ0;
        }
        if (type != null && Boolean.class != type && Boolean.TYPE != type) {
            return null;
        }
        String strY0 = tt3.y0(str, "is");
        if (this.f639a.containsKey(strY0)) {
            return strY0;
        }
        String strQ1 = tt3.q0(strY0);
        if (this.f639a.containsKey(strQ1)) {
            return strQ1;
        }
        return null;
    }

    @Override // defpackage.tnq
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(String str, Type type) {
        String strC = c(str, type);
        if (strC == null) {
            return null;
        }
        return yj4.f(type, this.f639a.get(strC), null, this.f640b);
    }
}

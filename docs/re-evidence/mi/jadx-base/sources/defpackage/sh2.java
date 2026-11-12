package defpackage;

import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class sh2 implements tnq<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33630b;
    public final Map<String, fdi> c;

    public sh2(Object obj, boolean z, boolean z2) {
        this.f33629a = obj;
        this.f33630b = z2;
        this.c = rh2.o(obj.getClass()).getPropMap(z);
    }

    @Override // defpackage.tnq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean containsKey(String str) {
        fdi fdiVarC = c(str, null);
        return fdiVarC != null && fdiVarC.m(false);
    }

    public final fdi c(String str, Type type) {
        fdi fdiVar = this.c.get(str);
        if (fdiVar == null) {
            return (type == null || Boolean.class == type || Boolean.TYPE == type) ? this.c.get(tt3.y0(str, "is")) : fdiVar;
        }
        return fdiVar;
    }

    @Override // defpackage.tnq
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(String str, Type type) {
        fdi fdiVarC = c(str, type);
        if (fdiVarC != null) {
            return fdiVarC.j(this.f33629a, type, this.f33630b);
        }
        return null;
    }
}

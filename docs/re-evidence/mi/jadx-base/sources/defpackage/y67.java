package defpackage;

import cn.hutool.core.bean.DynaBean;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class y67 implements tnq<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynaBean f39858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39859b;

    public y67(DynaBean dynaBean, boolean z) {
        this.f39858a = dynaBean;
        this.f39859b = z;
    }

    @Override // defpackage.tnq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean containsKey(String str) {
        return this.f39858a.containsProp(str);
    }

    @Override // defpackage.tnq
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(String str, Type type) {
        return yj4.f(type, this.f39858a.get(str), null, this.f39859b);
    }
}

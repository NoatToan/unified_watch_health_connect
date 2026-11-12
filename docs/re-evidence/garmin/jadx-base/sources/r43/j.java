package r43;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p13.j0;
import p43.m1;
import p43.n0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f150361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f150362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150363c;

    public j(k kVar, String... strArr) {
        kVar.getClass();
        strArr.getClass();
        this.f150361a = kVar;
        this.f150362b = strArr;
        String str = b.ERROR_TYPE.f150337a;
        String str2 = kVar.f150386a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f150363c = String.format(str, Arrays.copyOf(new Object[]{String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // p43.m1
    public final boolean C() {
        return false;
    }

    @Override // p43.m1
    public final Collection<n0> b() {
        return j0.f134944a;
    }

    @Override // p43.m1
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        p005kotlin.reflect.jvm.internal.impl.builtins.b.f105830f.getClass();
        return (p005kotlin.reflect.jvm.internal.impl.builtins.b) p005kotlin.reflect.jvm.internal.impl.builtins.b.f105831g.getValue();
    }

    @Override // p43.m1
    public final List<d1> getParameters() {
        return j0.f134944a;
    }

    @Override // p43.m1
    public final t23.h t() {
        l.f150388a.getClass();
        return l.f150390c;
    }

    public final String toString() {
        return this.f150363c;
    }
}

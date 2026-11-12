package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llc/a1;", "Llc/g;", "", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a1 extends g<String[]> {
    public a1() {
        super(true);
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        return nd.b.i(bundle, str);
    }

    @Override // lc.q0
    public final String b() {
        return "string[]";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        String[] strArr = (String[]) obj;
        return strArr != null ? (String[]) p13.s.t(strArr, new String[]{str}) : new String[]{str};
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return new String[]{str};
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        String[] strArr = (String[]) obj;
        str.getClass();
        if (strArr != null) {
            bundle.putStringArray(str, strArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        return p13.m.b((String[]) obj, (String[]) obj2);
    }

    @Override // lc.g
    public final String[] h() {
        return new String[0];
    }

    @Override // lc.g
    public final List i(String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2 == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str : strArr2) {
            arrayList.add(r0.a(r0.f111862a, str));
        }
        return arrayList;
    }
}

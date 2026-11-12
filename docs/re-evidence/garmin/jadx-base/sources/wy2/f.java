package wy2;

import am.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwy2/f;", "", "thiz", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "args", "<init>", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f188119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f188120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f188121c;

    public f(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        objArr.getClass();
        this.f188119a = obj;
        this.f188120b = method;
        this.f188121c = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        f fVar = (f) obj;
        return this.f188119a.equals(fVar.f188119a) && this.f188120b.equals(fVar.f188120b) && Arrays.equals(this.f188121c, fVar.f188121c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f188121c) + ((this.f188120b.hashCode() + (this.f188119a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f188121c);
        StringBuilder sb3 = new StringBuilder("InvocationInfo(thiz=");
        sb3.append(this.f188119a);
        sb3.append(", method=");
        sb3.append(this.f188120b);
        sb3.append(", args=");
        return j.o(string, ")", sb3);
    }
}

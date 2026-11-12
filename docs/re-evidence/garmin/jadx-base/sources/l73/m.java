package l73;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f111455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadMode f111456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f111457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f111459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f111460f;

    public m(Method method, Class<?> cls, ThreadMode threadMode, int i14, boolean z14) {
        this.f111455a = method;
        this.f111456b = threadMode;
        this.f111457c = cls;
        this.f111458d = i14;
        this.f111459e = z14;
    }

    public final synchronized void a() {
        if (this.f111460f == null) {
            StringBuilder sb3 = new StringBuilder(64);
            sb3.append(this.f111455a.getDeclaringClass().getName());
            sb3.append('#');
            sb3.append(this.f111455a.getName());
            sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb3.append(this.f111457c.getName());
            this.f111460f = sb3.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        a();
        m mVar = (m) obj;
        mVar.a();
        return this.f111460f.equals(mVar.f111460f);
    }

    public final int hashCode() {
        return this.f111455a.hashCode();
    }
}

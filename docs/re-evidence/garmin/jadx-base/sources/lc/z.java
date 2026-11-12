package lc;

import androidx.lifecycle.u1;
import androidx.lifecycle.y1;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Llc/z;", "Landroidx/lifecycle/u1;", "Llc/s0;", "<init>", "()V", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z extends u1 implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f111916b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f111917a = new LinkedHashMap();

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f111917a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((y1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    @Override // lc.s0
    public final y1 t3(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.f111917a;
        y1 y1Var = (y1) linkedHashMap.get(str);
        if (y1Var != null) {
            return y1Var;
        }
        y1 y1Var2 = new y1();
        linkedHashMap.put(str, y1Var2);
        return y1Var2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        o13.x.a aVar = o13.x.f128613b;
        d53.a.a(16);
        sb3.append(ge1.b.d0(16, ((long) iIdentityHashCode) & 4294967295L));
        sb3.append("} ViewModelStores (");
        Iterator it = this.f111917a.keySet().iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/z$a;", "", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

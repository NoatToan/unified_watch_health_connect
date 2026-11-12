package ig1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.function.Consumer;
import org.apache.commons.lang3.reflect.MethodUtils;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k0 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93353c;

    public /* synthetic */ k0(int i14, Object obj, Object obj2) {
        this.f93351a = i14;
        this.f93352b = obj;
        this.f93353c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i14 = this.f93351a;
        Object obj2 = this.f93353c;
        Object obj3 = this.f93352b;
        switch (i14) {
            case 0:
                int i15 = m0.f93361m;
                ((ArrayList) obj3).add(oi0.d.a(((m0) obj2).f70343a, (String) obj, new l0(0)));
                break;
            default:
                MethodUtils.lambda$getMatchingMethod$4((Class[]) obj3, (TreeMap) obj2, (Method) obj);
                break;
        }
    }
}

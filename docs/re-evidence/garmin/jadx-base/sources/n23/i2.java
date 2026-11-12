package n23;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2.b f122503b;

    public i2(f2 f2Var, f2.b bVar) {
        this.f122502a = f2Var;
        this.f122503b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // e23.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        ?? arrayList;
        Class[] clsArr;
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        Class cls = this.f122502a.f122441d;
        ClassLoader classLoaderD = z23.f.d(cls);
        c33.f fVarB = this.f122503b.b();
        if (fVarB != null) {
            ArrayList arrayList2 = fVarB.f24212l;
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                k23.d<?> dVarA = b0.a(classLoaderD, (String) it.next());
                if (dVarA != null) {
                    arrayList.add(dVarA);
                }
            }
        } else {
            z23.b.f202025a.getClass();
            if (p005kotlin.jvm.internal.s.g(z23.b.b(cls), Boolean.TRUE)) {
                ?? r14 = z23.b.a().f202028b;
                arrayList = 0;
                if (r14 == 0) {
                    clsArr = null;
                } else {
                    Object objInvoke = r14.invoke(cls, null);
                    objInvoke.getClass();
                    clsArr = (Class[]) objInvoke;
                }
                if (clsArr != null) {
                    ArrayList arrayList3 = new ArrayList(clsArr.length);
                    for (Class cls2 : clsArr) {
                        arrayList3.add(dh.b.x(cls2));
                    }
                    arrayList = arrayList3;
                }
                if (arrayList == 0) {
                    arrayList = p13.j0.f134944a;
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
        }
        arrayList.getClass();
        return arrayList;
    }
}

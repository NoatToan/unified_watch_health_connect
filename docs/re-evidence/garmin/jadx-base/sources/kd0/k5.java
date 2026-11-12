package kd0;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/k5;", "Lga1/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k5 implements ga1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f104172a = o13.m.b(new j5(0));

    @Override // ga1.a
    public final fa1.a a() {
        return new fa1.a((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[Catch: Exception -> 0x0089, TRY_LEAVE, TryCatch #0 {Exception -> 0x0089, blocks: (B:3:0x0007, B:5:0x0028, B:8:0x002d, B:14:0x0042, B:16:0x0048, B:17:0x0057, B:19:0x005d, B:21:0x0073, B:26:0x0082, B:24:0x007e, B:11:0x003c, B:27:0x0086), top: B:36:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    @Override // ga1.a
    public final boolean b(ea1.b bVar, ea1.d dVar) {
        ?? arrayList;
        da1.c cVar;
        List<String> listA;
        ea1.b bVar2;
        bVar.getClass();
        dVar.getClass();
        try {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            da1.c[] cVarArr = (da1.c[]) GsonUtil.f47253b.fromJson(gh2.i.f77458c.a().f77477b.h("photo_report_entries_disable_options"), da1.c[].class);
            if (cVarArr != null) {
                int length = cVarArr.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArr[i14];
                    if (p005kotlin.jvm.internal.s.g(cVar.getUserRole(), dVar.f63652a)) {
                        break;
                    }
                    i14++;
                }
                if (cVar == null || (listA = cVar.a()) == null) {
                    arrayList = p13.j0.f134944a;
                } else {
                    arrayList = new ArrayList(p13.y.r(listA, 10));
                    for (String str : listA) {
                        ea1.b.f63638c.getClass();
                        str.getClass();
                        ea1.b[] bVarArrValues = ea1.b.values();
                        int length2 = bVarArrValues.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length2) {
                                bVar2 = null;
                                break;
                            }
                            bVar2 = bVarArrValues[i15];
                            if (p005kotlin.jvm.internal.s.g(bVar2.f63644a, str)) {
                                break;
                            }
                            i15++;
                        }
                        arrayList.add(bVar2);
                    }
                }
            } else {
                arrayList = p13.j0.f134944a;
            }
        } catch (Exception unused) {
            ((Logger) this.f104172a.getValue()).error("Error parsing remote config for disabled report image entries.");
            arrayList = p13.j0.f134944a;
        }
        return !arrayList.contains(bVar) || a().a();
    }
}

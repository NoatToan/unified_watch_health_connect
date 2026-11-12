package ei0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import p005kotlin.Metadata;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lei0/b;", "", "T", "Lyc/h3;", "", "Lli0/d0;", "startIndex", "pageSize", "<init>", "(II)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<T> extends h3<Integer, li0.d0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f64185d = new LinkedHashSet();

    public b(int i14, int i15) {
        this.f64183b = i14;
        this.f64184c = i15;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:13:0x002a, B:34:0x007c, B:38:0x00a6, B:37:0x00a0, B:18:0x0039, B:30:0x006a, B:27:0x005b), top: B:43:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object h(b bVar, h3.a aVar, v13.c cVar) {
        a aVar2;
        int iIntValue;
        b bVar2;
        int i14;
        int size;
        int i15;
        Integer num;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i16 = aVar2.f64178e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                aVar2.f64178e = i16 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(bVar, cVar);
            }
        } else {
            aVar2 = new a(bVar, cVar);
        }
        Object objG = aVar2.f64176c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = aVar2.f64178e;
        try {
            if (i17 == 0) {
                o13.r.b(objG);
                Integer num2 = (Integer) aVar.a();
                iIntValue = num2 != null ? num2.intValue() : bVar.f64183b;
                if (iIntValue == bVar.f64183b) {
                    bVar.f64185d.clear();
                }
                int i18 = bVar.f64184c;
                aVar2.f64174a = bVar;
                aVar2.f64175b = iIntValue;
                aVar2.f64178e = 1;
                objG = bVar.g(iIntValue, i18, aVar2);
                if (objG == aVar3) {
                }
                return aVar3;
            }
            if (i17 == 1) {
                int i19 = aVar2.f64175b;
                b bVar3 = aVar2.f64174a;
                o13.r.b(objG);
                iIntValue = i19;
                bVar = bVar3;
            } else {
                if (i17 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = aVar2.f64175b;
                bVar2 = aVar2.f64174a;
                o13.r.b(objG);
            }
            ArrayList arrayListD1 = p13.h0.d1((Collection) objG);
            arrayListD1.removeIf(new a73.n(new ds0.g(bVar2, 9), 8));
            size = arrayListD1.size();
            i15 = bVar2.f64184c;
            if (size < i15) {
                num = null;
            } else {
                num = new Integer(i14 + i15);
            }
            return new h3.b.c(arrayListD1, null, num);
            aVar2.f64174a = bVar;
            aVar2.f64175b = iIntValue;
            aVar2.f64178e = 2;
            objG = bVar.f((List) objG, aVar2);
            if (objG != aVar3) {
                int i24 = iIntValue;
                bVar2 = bVar;
                i14 = i24;
                ArrayList arrayListD2 = p13.h0.d1((Collection) objG);
                arrayListD2.removeIf(new a73.n(new ds0.g(bVar2, 9), 8));
                size = arrayListD2.size();
                i15 = bVar2.f64184c;
                if (size < i15) {
                    num = null;
                } else {
                    num = new Integer(i14 + i15);
                }
                return new h3.b.c(arrayListD2, null, num);
            }
            return aVar3;
        } catch (Exception e4) {
            return new h3.b.a(e4);
        }
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, li0.d0> i3Var) {
        return null;
    }

    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        return h(this, aVar, cVar);
    }

    public abstract Object f(List list, v13.c cVar);

    public abstract Object g(int i14, int i15, v13.c cVar);
}

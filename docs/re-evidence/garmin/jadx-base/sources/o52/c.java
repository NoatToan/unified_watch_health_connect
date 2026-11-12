package o52;

import com.garmin.android.apps.connectmobile.workouts.data.model.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m52.k;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p13.j0;
import pc0.j;
import r53.s;
import vb.h;
import zd0.c0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo52/c;", "", "Lpc0/j;", "devicesRepository", "Lzd0/c0;", "isStartStopWorkoutCapableDevice", "Lo52/e;", "workoutDelegate", "Lo52/d;", "isWorkoutSportTypeCapable", "<init>", "(Lpc0/j;Lzd0/c0;Lo52/e;Lo52/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f129295e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f129296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f129297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f129298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f129299d;

    static {
        j.a aVar = j.f137223i;
    }

    public c(j jVar, c0 c0Var, e eVar, d dVar) {
        jVar.getClass();
        c0Var.getClass();
        eVar.getClass();
        dVar.getClass();
        this.f129296a = jVar;
        this.f129297b = c0Var;
        this.f129298c = eVar;
        this.f129299d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final Object a(k kVar, v13.c cVar) {
        a aVar;
        ?? arrayList;
        c0 c0Var;
        ?? arrayList2;
        ?? r14;
        ?? r15;
        ?? r16;
        boolean zBooleanValue;
        Object objR;
        ?? r17;
        boolean z14;
        ?? r18;
        boolean zBooleanValue2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f129283g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f129283g = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objY = aVar.f129281e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f129283g;
        e eVar = this.f129298c;
        if (i15 == 0) {
            r.b(objY);
            pc0.c0 c0VarJ = j.j();
            aVar.f129277a = kVar;
            aVar.f129283g = 1;
            objY = s.y(c0VarJ, aVar);
            if (objY != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            kVar = aVar.f129277a;
            r.b(objY);
        } else {
            if (i15 == 2) {
                List list = aVar.f129278b;
                r.b(objY);
                r14 = list;
                arrayList = (List) objY;
                arrayList2 = r14;
                aVar.f129277a = null;
                aVar.f129278b = arrayList2;
                aVar.f129279c = arrayList;
                aVar.f129283g = 3;
                objY = eVar.o(aVar);
                if (objY != aVar2) {
                    r15 = arrayList;
                    r16 = arrayList2;
                    zBooleanValue = ((Boolean) objY).booleanValue();
                    aVar.f129277a = null;
                    aVar.f129278b = r16;
                    aVar.f129279c = r15;
                    aVar.f129280d = zBooleanValue;
                    aVar.f129283g = 4;
                    objR = eVar.r(aVar);
                    if (objR != aVar2) {
                        r17 = r15;
                        z14 = zBooleanValue;
                        objY = objR;
                        r18 = r16;
                    }
                }
                return aVar2;
            }
            if (i15 == 3) {
                List list2 = aVar.f129279c;
                List list3 = aVar.f129278b;
                r.b(objY);
                r16 = list3;
                r15 = list2;
                zBooleanValue = ((Boolean) objY).booleanValue();
                aVar.f129277a = null;
                aVar.f129278b = r16;
                aVar.f129279c = r15;
                aVar.f129280d = zBooleanValue;
                aVar.f129283g = 4;
                objR = eVar.r(aVar);
                if (objR != aVar2) {
                    r17 = r15;
                    z14 = zBooleanValue;
                    objY = objR;
                    r18 = r16;
                }
                return aVar2;
            }
            if (i15 != 4) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = aVar.f129280d;
            List list4 = aVar.f129279c;
            List list5 = aVar.f129278b;
            r.b(objY);
            r18 = list5;
            r17 = list4;
        }
        zBooleanValue2 = ((Boolean) objY).booleanValue();
        if (!r18.isEmpty() || r17.isEmpty()) {
            return (r18.isEmpty() || r17.isEmpty()) ? new y.b(r18) : new y.c(r17, z14, zBooleanValue2);
        }
        return new y.a(r17, r18, z14, zBooleanValue2);
        Iterable iterable = (List) objY;
        if (iterable == null) {
            iterable = j0.f134944a;
        }
        arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0Var = this.f129297b;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (c0Var.a((sd2.f) next)) {
                arrayList.add(next);
            }
        }
        arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (!c0Var.a((sd2.f) obj)) {
                arrayList2.add(obj);
            }
        }
        if (kVar == null) {
            aVar.f129277a = null;
            aVar.f129278b = arrayList2;
            aVar.f129279c = arrayList;
            aVar.f129283g = 3;
            objY = eVar.o(aVar);
            if (objY != aVar2) {
                r15 = arrayList;
                r16 = arrayList2;
                zBooleanValue = ((Boolean) objY).booleanValue();
                aVar.f129277a = null;
                aVar.f129278b = r16;
                aVar.f129279c = r15;
                aVar.f129280d = zBooleanValue;
                aVar.f129283g = 4;
                objR = eVar.r(aVar);
                if (objR != aVar2) {
                    r17 = r15;
                    z14 = zBooleanValue;
                    objY = objR;
                    r18 = r16;
                    zBooleanValue2 = ((Boolean) objY).booleanValue();
                    if (r18.isEmpty()) {
                    }
                    if (r18.isEmpty()) {
                    }
                }
            }
        } else {
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            b bVar2 = new b(arrayList, this, kVar, null);
            aVar.f129277a = null;
            aVar.f129278b = arrayList2;
            aVar.f129283g = 2;
            objY = ge1.b.e0(bVar, bVar2, aVar);
            if (objY != aVar2) {
                r14 = arrayList2;
                arrayList = (List) objY;
                arrayList2 = r14;
                aVar.f129277a = null;
                aVar.f129278b = arrayList2;
                aVar.f129279c = arrayList;
                aVar.f129283g = 3;
                objY = eVar.o(aVar);
                if (objY != aVar2) {
                    r15 = arrayList;
                    r16 = arrayList2;
                    zBooleanValue = ((Boolean) objY).booleanValue();
                    aVar.f129277a = null;
                    aVar.f129278b = r16;
                    aVar.f129279c = r15;
                    aVar.f129280d = zBooleanValue;
                    aVar.f129283g = 4;
                    objR = eVar.r(aVar);
                    if (objR != aVar2) {
                        r17 = r15;
                        z14 = zBooleanValue;
                        objY = objR;
                        r18 = r16;
                        zBooleanValue2 = ((Boolean) objY).booleanValue();
                        if (r18.isEmpty()) {
                        }
                        if (r18.isEmpty()) {
                        }
                    }
                }
            }
        }
        return aVar2;
    }
}

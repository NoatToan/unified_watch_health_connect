package ne0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.IllegalInstantException;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Li53/f;", "Lpe0/h;", "<anonymous>", "(Lo53/b0;)Li53/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetAllDogSummariesUseCase$invoke$2", f = "GetAllDogSummariesUseCase.kt", l = {21, 23}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super i53.f<? extends pe0.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f125502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f125503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f125504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f125504c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f125504c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super i53.f<? extends pe0.h>> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[LOOP:1: B:44:0x00c2->B:46:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x00a8 A[SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        v2 v2Var;
        v2 v2Var2;
        Map linkedHashMap;
        ArrayList arrayList;
        je0.a aVar;
        String str;
        je0.j jVar;
        int iIntValue;
        b63.u uVarU;
        String str2;
        LocalDateTime localDateTime;
        Integer num;
        ArrayList arrayList2;
        Iterator it;
        int iA;
        je0.q qVar;
        List<je0.a> list;
        je0.n nVar;
        je0.p pVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125503b;
        n nVar2 = this.f125504c;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = nVar2.f125505a;
            this.f125503b = 1;
            wVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.p(wVar, null), this);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f125502a;
            o13.r.b(obj);
        }
        v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var2).f47386a;
            arrayList2 = new ArrayList();
            it = iterable.iterator();
            while (it.hasNext()) {
                qVar = ((je0.i) it.next()).f98538c;
                if (qVar != null || (nVar = qVar.f98564a) == null || (pVar = nVar.f98558a) == null) {
                    list = null;
                } else {
                    list = pVar.f98562a;
                }
                if (list == null) {
                    list = p13.j0.f134944a;
                }
                p13.d0.v(arrayList2, list);
            }
            iA = t0.a(p13.y.r(arrayList2, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (Object obj2 : arrayList2) {
                linkedHashMap.put(((je0.a) obj2).f98470a, obj2);
            }
        } else {
            linkedHashMap = p13.k0.f134949a;
            linkedHashMap.getClass();
        }
        Iterable<je0.f> iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
        arrayList = new ArrayList(p13.y.r(iterable2, 10));
        for (je0.f fVar : iterable2) {
            aVar = (je0.a) linkedHashMap.get(new Long(fVar.f98501a));
            long j8 = fVar.f98501a;
            str = fVar.f98504d;
            if (str == null) {
                str = "";
            }
            String str3 = str;
            jVar = fVar.f98515o;
            if (jVar == null) {
                jVar = je0.j.ACTIVE;
            }
            je0.j jVar2 = jVar;
            if (aVar != null || (num = aVar.f98471b) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num.intValue();
            }
            int i15 = iIntValue;
            if (aVar != null || (str2 = aVar.f98472c) == null) {
                uVarU = null;
            } else {
                try {
                    localDateTime = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parseLocalDateTime(str2);
                    localDateTime.getClass();
                } catch (IllegalInstantException e4) {
                    e4.getMessage();
                    localDateTime = null;
                } catch (IllegalArgumentException e14) {
                    e14.getMessage();
                    localDateTime = null;
                }
                if (localDateTime != null) {
                    uVarU = g22.k.u(localDateTime);
                } else {
                    uVarU = null;
                }
            }
            arrayList.add(new pe0.h(j8, str3, jVar2, i15, uVarU, fVar.f98517q));
        }
        return i53.a.j(arrayList);
        v2 v2Var3 = (v2) obj;
        if (!(v2Var3 instanceof v2.b)) {
            q2.u("Failed to fetch dogs");
            return null;
        }
        me0.w wVar2 = nVar2.f125505a;
        v2.b bVar = (v2.b) v2Var3;
        Iterable iterable3 = (Iterable) bVar.f47386a;
        ArrayList arrayList3 = new ArrayList(p13.y.r(iterable3, 10));
        Iterator it3 = iterable3.iterator();
        while (it3.hasNext()) {
            q6.f.s(((je0.f) it3.next()).f98501a, arrayList3);
        }
        this.f125502a = bVar;
        this.f125503b = 2;
        Object objD = me0.w.d(wVar2, arrayList3, this);
        if (objD != aVar2) {
            v2Var = v2Var3;
            obj = objD;
            v2Var2 = (v2) obj;
            if (v2Var2 instanceof v2.b) {
                Iterable iterable4 = (Iterable) ((v2.b) v2Var2).f47386a;
                arrayList2 = new ArrayList();
                it = iterable4.iterator();
                while (it.hasNext()) {
                    qVar = ((je0.i) it.next()).f98538c;
                    if (qVar != null) {
                        list = null;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = p13.j0.f134944a;
                    }
                    p13.d0.v(arrayList2, list);
                }
                iA = t0.a(p13.y.r(arrayList2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                while (r15.hasNext()) {
                    linkedHashMap.put(((je0.a) obj2).f98470a, obj2);
                }
            } else {
                linkedHashMap = p13.k0.f134949a;
                linkedHashMap.getClass();
            }
            Iterable<je0.f> iterable5 = (Iterable) ((v2.b) v2Var).f47386a;
            arrayList = new ArrayList(p13.y.r(iterable5, 10));
            while (r15.hasNext()) {
                aVar = (je0.a) linkedHashMap.get(new Long(fVar.f98501a));
                long j14 = fVar.f98501a;
                str = fVar.f98504d;
                if (str == null) {
                    str = "";
                }
                String str4 = str;
                jVar = fVar.f98515o;
                if (jVar == null) {
                    jVar = je0.j.ACTIVE;
                }
                je0.j jVar3 = jVar;
                if (aVar != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                int i16 = iIntValue;
                if (aVar != null) {
                    uVarU = null;
                } else {
                    uVarU = null;
                }
                arrayList.add(new pe0.h(j14, str4, jVar3, i16, uVarU, fVar.f98517q));
            }
            return i53.a.j(arrayList);
        }
        return aVar2;
    }
}

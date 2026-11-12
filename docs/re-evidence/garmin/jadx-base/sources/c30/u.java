package c30;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc30/u;", "", "Lc30/w;", "createNewSegmentForCourseUseCase", "Lc30/g;", "addLapCoursePointsUseCase", "<init>", "(Lc30/w;Lc30/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f24037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f24038b;

    public u(w wVar, g gVar) {
        wVar.getClass();
        gVar.getClass();
        this.f24037a = wVar;
        this.f24038b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object a(u uVar, a50.g gVar, v13.c cVar) {
        s sVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        a50.g gVar2;
        List list;
        ArrayList arrayList;
        uVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f24012g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f24012g = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(uVar, cVar);
            }
        } else {
            sVar = new s(uVar, cVar);
        }
        Object obj = sVar.f24010e;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f24012g;
        if (i15 == 0) {
            o13.r.b(obj);
            w20.a aVar = gVar.f1393d;
            if (aVar == null || (eVar = aVar.f181476a) == null) {
                return null;
            }
            eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
            List listB1 = p13.h0.b1(gVar.b());
            ArrayList arrayListS = p13.y.s(listB1);
            gl.b.m(arrayListS);
            d30.b.e(arrayListS, eVar2);
            gl.b.l(eVar2);
            ArrayList arrayListB = d30.b.b(listB1, eVar2.h());
            sVar.f24006a = gVar;
            sVar.f24007b = eVar2;
            sVar.f24008c = listB1;
            sVar.f24009d = arrayListB;
            sVar.f24012g = 1;
            Object objB = uVar.b(eVar2, listB1, sVar);
            if (objB == obj2) {
                return obj2;
            }
            gVar2 = gVar;
            list = listB1;
            obj = objB;
            arrayList = arrayListB;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = sVar.f24009d;
            List list2 = sVar.f24008c;
            eVar2 = sVar.f24007b;
            a50.g gVar3 = sVar.f24006a;
            o13.r.b(obj);
            arrayList = arrayList2;
            gVar2 = gVar3;
            list = list2;
        }
        List list3 = (List) obj;
        a50.a aVarE = gVar2.e();
        long j8 = aVarE != null ? aVarE.f1243d : -1L;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar2.j();
        return uVar.f24038b.a(a50.g.a(gVar2, false, null, false, w20.a.b(gVar2.f1393d, eVar2, null, null, null, null, 62), false, p13.h0.D0(p13.h0.V(1, gVar2.f1396g), new a50.a(arrayList, list, list3, j8, listJ != null ? p13.h0.b1(listJ) : null, eVar2.G(), null)), null, null, 0, false, false, false, false, null, null, 65463));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007e -> B:23:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(com.garmin.android.apps.connectmobile.courses.model.e r13, java.util.List r14, v13.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof c30.r
            if (r0 == 0) goto L13
            r0 = r15
            c30.r r0 = (c30.r) r0
            int r1 = r0.f24004k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24004k = r1
            goto L18
        L13:
            c30.r r0 = new c30.r
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f24002i
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f24004k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L41
            if (r2 != r3) goto L3a
            int r13 = r0.f24001h
            int r14 = r0.f24000g
            int r2 = r0.f23999f
            int r5 = r0.f23998e
            int r6 = r0.f23997d
            java.util.Iterator r7 = r0.f23996c
            java.util.Collection r8 = r0.f23995b
            java.util.Collection r8 = (java.util.Collection) r8
            com.garmin.android.apps.connectmobile.courses.model.e r9 = r0.f23994a
            o13.r.b(r15)
            goto L81
        L3a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r13)
            r13 = 0
            return r13
        L41:
            java.util.ArrayList r15 = v.h.x(r15)
            java.util.Iterator r14 = r14.iterator()
            r2 = 0
            r7 = r14
            r8 = r15
            r5 = r2
            r6 = r5
            r14 = r13
            r13 = r6
        L50:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L9c
            java.lang.Object r15 = r7.next()
            int r9 = r13 + 1
            if (r13 < 0) goto L98
            java.util.List r15 = (java.util.List) r15
            r0.f23994a = r14
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10
            r0.f23995b = r10
            r0.f23996c = r7
            r0.f23997d = r6
            r0.f23998e = r5
            r0.f23999f = r2
            r0.f24000g = r9
            r0.f24001h = r13
            r0.f24004k = r3
            c30.w r10 = r12.f24037a
            java.lang.Object r15 = r10.a(r14, r15, r0)
            if (r15 != r1) goto L7e
            return r1
        L7e:
            r11 = r9
            r9 = r14
            r14 = r11
        L81:
            com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO r15 = (com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO) r15
            if (r15 == 0) goto L8f
            int r13 = r13 + r3
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r13)
            r15.k(r10)
            goto L90
        L8f:
            r15 = r4
        L90:
            if (r15 == 0) goto L95
            r8.add(r15)
        L95:
            r13 = r14
            r14 = r9
            goto L50
        L98:
            p13.x.q()
            throw r4
        L9c:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.u.b(com.garmin.android.apps.connectmobile.courses.model.e, java.util.List, v13.c):java.lang.Object");
    }
}

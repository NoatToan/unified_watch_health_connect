package n01;

import b11.s;
import b11.t;
import com.garmin.android.apps.connectmobile.v2;
import g01.c0;
import g01.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.y;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ln01/o;", "Ln01/g;", "Lm01/g;", "repository", "", "searchExpression", "Lm21/b;", "mode", "<init>", "(Lm01/g;Ljava/lang/String;Lm21/b;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01.g f122150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f122151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m21.b f122152e;

    static {
        new a(null);
    }

    public o(m01.g gVar, String str, m21.b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f122150c = gVar;
        this.f122151d = str;
        this.f122152e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        p pVar;
        int iIntValue;
        Object objO0;
        b11.d dVarA;
        List<c0> list;
        c0 c0Var;
        s sVarB;
        h3.a aVar2 = aVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f122157e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f122157e = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f122155c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f122157e;
        if (i15 == 0) {
            r.b(obj);
            Object objA = aVar2.a();
            int i16 = aVar2.f196007a;
            Integer num = (Integer) objA;
            iIntValue = num != null ? num.intValue() : 0;
            g(iIntValue == 0);
            int iF = f(iIntValue, i16);
            pVar.f122153a = aVar2;
            pVar.f122154b = iIntValue;
            pVar.f122157e = 1;
            objO0 = this.f122150c.o0(iF, i16, this.f122151d, pVar);
            if (objO0 == aVar3) {
                return aVar3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = pVar.f122154b;
            h3.a aVar4 = pVar.f122153a;
            r.b(obj);
            iIntValue = i17;
            aVar2 = aVar4;
            objO0 = obj;
        }
        v2 v2Var = (v2) objO0;
        if (v2Var instanceof v2.a) {
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        j01.d dVar = (j01.d) ((v2.b) v2Var).f47386a;
        List<g01.i> list2 = dVar.f96011a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            Object cVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            g01.i iVar = (g01.i) it.next();
            g01.o oVar = iVar.f74195a;
            if (oVar != null && (dVarA = oVar.a()) != null && (list = iVar.f74196b) != null && (c0Var = (c0) h0.d0(list)) != null && (sVarB = c0Var.b()) != null) {
                t.a aVar5 = t.f14377d;
                List list3 = iVar.f74197c;
                if (list3 == null) {
                    list3 = j0.f134944a;
                }
                u uVar = dVarA.f14257e;
                aVar5.getClass();
                cVar2 = new b11.a.c(null, 1.0d, iVar.f74198d, null, dVarA, sVarB, t.a.a(list3, uVar), 9, null);
            }
            if (cVar2 != null) {
                arrayList.add(cVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            b11.a.c cVar3 = (b11.a.c) obj2;
            m21.b bVar = this.f122152e;
            if (!(bVar instanceof m21.b.c) || v21.a.c(cVar3, ((m21.b.c) bVar).f116072b)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new g01.n.a((b11.a.c) it3.next()));
        }
        return new h3.b.c(arrayList3, iIntValue == 0 ? null : new Integer(iIntValue - 1), dVar.f96012b ? new Integer((aVar2.f196007a / 20) + iIntValue) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln01/o$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "STARTING_PAGE", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ o(m01.g gVar, String str, m21.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? null : str, bVar);
    }
}

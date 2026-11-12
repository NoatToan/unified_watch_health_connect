package sk0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsk0/f0;", "Lyc/h3;", "", "Luk0/e;", "Ljk0/o;", "sortOrder", "Lkk0/b;", "repository", "<init>", "(Ljk0/o;Lkk0/b;)V", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends h3<Integer, uk0.e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk0.o f159665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kk0.b f159666c;

    static {
        new a(null);
    }

    public f0(jk0.o oVar, kk0.b bVar) {
        oVar.getClass();
        bVar.getClass();
        this.f159665b = oVar;
        this.f159666c = bVar;
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, uk0.e> i3Var) {
        Integer num;
        Integer num2;
        Integer num3 = i3Var.f196062b;
        if (num3 == null) {
            return null;
        }
        h3.b.c<Integer, uk0.e> cVarA = i3Var.a(num3.intValue());
        if (cVarA != null && (num2 = cVarA.f196017b) != null) {
            return wr.g.m(1, num2);
        }
        if (cVarA == null || (num = cVarA.f196018c) == null) {
            return null;
        }
        return b71.i.e(1, num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        g0 g0Var;
        int iIntValue;
        Object objY;
        h3.a aVar2 = aVar;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f159671e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f159671e = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object obj = g0Var.f159669c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f159671e;
        if (i15 == 0) {
            o13.r.b(obj);
            Integer num = (Integer) aVar2.a();
            iIntValue = num != null ? num.intValue() : 0;
            int i16 = aVar2.f196007a;
            g0Var.f159667a = aVar2;
            g0Var.f159668b = iIntValue;
            g0Var.f159671e = 1;
            objY = this.f159666c.Y(iIntValue * 10, i16, this.f159665b, g0Var);
            if (objY == aVar3) {
                return aVar3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = g0Var.f159668b;
            h3.a aVar4 = g0Var.f159667a;
            o13.r.b(obj);
            iIntValue = i17;
            aVar2 = aVar4;
            objY = obj;
        }
        v2 v2Var = (v2) objY;
        if (v2Var instanceof v2.a) {
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof v2.b)) {
            lc.u0.r();
            return null;
        }
        List<jk0.k> list = (List) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (jk0.k kVar : list) {
            kVar.getClass();
            String strC = kVar.f99274c;
            if (strC == null) {
                strC = kg.f.c();
            }
            String str = kVar.f99272a;
            Long l14 = kVar.f99277f;
            arrayList.add(new uk0.b(strC, str, l14 != null ? l14.longValue() : 0L, kVar.f99273b));
        }
        return new h3.b.c(arrayList, iIntValue == 0 ? null : new Integer(iIntValue - 1), list.size() == aVar2.f196007a ? new Integer((aVar2.f196007a / 10) + iIntValue) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lsk0/f0$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "INITIAL_PAGE", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package rk0;

import java.util.List;
import p005kotlin.Metadata;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrk0/x0;", "Lyc/h3;", "", "Lwo0/a;", "Lmk0/h;", "getGearActivitiesUseCase", "", "gearUUID", "", "Lam/x0;", "typeFilter", "<init>", "(Lmk0/h;Ljava/lang/String;Ljava/util/List;)V", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 extends h3<Integer, wo0.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.h f153317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<am.x0> f153319d;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(mk0.h hVar, String str, List<? extends am.x0> list) {
        hVar.getClass();
        str.getClass();
        list.getClass();
        this.f153317b = hVar;
        this.f153318c = str;
        this.f153319d = list;
    }

    @Override // yc.h3
    public final Integer c(i3<Integer, wo0.a> i3Var) {
        Integer num;
        Integer num2;
        Integer num3 = i3Var.f196062b;
        if (num3 == null) {
            return null;
        }
        h3.b.c<Integer, wo0.a> cVarA = i3Var.a(num3.intValue());
        if (cVarA != null && (num2 = cVarA.f196017b) != null) {
            return wr.g.m(1, num2);
        }
        if (cVarA == null || (num = cVarA.f196018c) == null) {
            return null;
        }
        return b71.i.e(1, num);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        y0 y0Var;
        int iIntValue;
        Object objA;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i14 = y0Var.f153326e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y0Var.f153326e = i14 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        y0 y0Var2 = y0Var;
        Object obj = y0Var2.f153324c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = y0Var2.f153326e;
        if (i15 == 0) {
            o13.r.b(obj);
            Integer num = (Integer) aVar.a();
            iIntValue = num != null ? num.intValue() : 0;
            y0Var2.f153322a = aVar;
            y0Var2.f153323b = iIntValue;
            y0Var2.f153326e = 1;
            objA = this.f153317b.a(this.f153318c, this.f153319d, (iIntValue * 20) + 1, 20, y0Var2);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i16 = y0Var2.f153323b;
            h3.a aVar3 = y0Var2.f153322a;
            o13.r.b(obj);
            objA = ((o13.q) obj).f128597a;
            iIntValue = i16;
            aVar = aVar3;
        }
        int i17 = o13.q.f128596b;
        boolean z14 = objA instanceof o13.q.b;
        if (z14) {
            Throwable thB = o13.q.b(objA);
            if (thB == null) {
                thB = new Exception("Unknown error");
            }
            return new h3.b.a(thB);
        }
        if (z14) {
            objA = null;
        }
        List list = (List) objA;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        return new h3.b.c(list, iIntValue == 0 ? null : new Integer(iIntValue - 1), list.size() == aVar.f196007a ? new Integer((aVar.f196007a / 20) + iIntValue) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lrk0/x0$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "INITIAL_PAGE", "PAGE_INDEX_OFFSET", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

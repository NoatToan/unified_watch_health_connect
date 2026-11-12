package sk0;

import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lsk0/s0;", "Lyc/h3;", "", "Luk0/e;", "Ljk0/o;", "sortOrder", "Lc80/u;", NotificationConstants.KEY_DATA_MIME_TYPE, "Ljk0/p;", "status", "Lkk0/b;", "repository", "<init>", "(Ljk0/o;Lc80/u;Ljk0/p;Lkk0/b;)V", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 extends h3<Integer, uk0.e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk0.o f159831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c80.u f159832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jk0.p f159833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kk0.b f159834e;

    static {
        new a(null);
    }

    public s0(jk0.o oVar, c80.u uVar, jk0.p pVar, kk0.b bVar) {
        oVar.getClass();
        pVar.getClass();
        bVar.getClass();
        this.f159831b = oVar;
        this.f159832c = uVar;
        this.f159833d = pVar;
        this.f159834e = bVar;
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        t0 t0Var;
        int iIntValue;
        Object objA;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i14 = t0Var.f159843e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f159843e = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        t0 t0Var2 = t0Var;
        Object obj = t0Var2.f159841c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var2.f159843e;
        if (i15 == 0) {
            o13.r.b(obj);
            Integer num = (Integer) aVar.a();
            iIntValue = num != null ? num.intValue() : 0;
            int i16 = aVar.f196007a;
            List listC = p13.w.c(this.f159833d);
            t0Var2.f159839a = aVar;
            t0Var2.f159840b = iIntValue;
            t0Var2.f159843e = 1;
            objA = this.f159834e.a(iIntValue * 10, i16, listC, this.f159831b, this.f159832c, t0Var2);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = t0Var2.f159840b;
            h3.a aVar3 = t0Var2.f159839a;
            o13.r.b(obj);
            objA = obj;
            iIntValue = i17;
            aVar = aVar3;
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.a) {
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof v2.b)) {
            lc.u0.r();
            return null;
        }
        List list = (List) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(og2.k.N((jk0.s) it.next()));
        }
        return new h3.b.c(arrayList, iIntValue == 0 ? null : new Integer(iIntValue - 1), list.size() == aVar.f196007a ? new Integer((aVar.f196007a / 10) + iIntValue) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lsk0/s0$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "INITIAL_PAGE", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

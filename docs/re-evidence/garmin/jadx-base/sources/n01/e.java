package n01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p13.y;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ln01/e;", "Ln01/g;", "Lm01/g;", "repository", "Lm21/b;", "mode", "", "searchExpression", "<init>", "(Lm01/g;Lm21/b;Ljava/lang/String;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01.g f122119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m21.b f122120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f122121e;

    static {
        new a(null);
    }

    public e(m01.g gVar, m21.b bVar, String str) {
        gVar.getClass();
        bVar.getClass();
        this.f122119c = gVar;
        this.f122120d = bVar;
        this.f122121e = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        f fVar;
        h3.a aVar2;
        int i14;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i15 = fVar.f122126e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f122126e = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f122124c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f122126e;
        if (i16 == 0) {
            r.b(obj);
            Object objA = aVar.a();
            int i17 = aVar.f196007a;
            Integer num = (Integer) objA;
            int iIntValue = num != null ? num.intValue() : 0;
            g(iIntValue == 0);
            int iF = f(iIntValue, i17);
            fVar.f122122a = aVar;
            fVar.f122123b = iIntValue;
            fVar.f122126e = 1;
            Object objA0 = this.f122119c.A0(this.f122121e, iF, i17, fVar);
            if (objA0 == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            i14 = iIntValue;
            obj = objA0;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = fVar.f122123b;
            aVar2 = fVar.f122122a;
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            return new h3.b.a(((v2.a) v2Var).f47383a);
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        h01.c cVar2 = (h01.c) ((v2.b) v2Var).f47386a;
        List<g01.a> list = cVar2.f80642a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b11.a aVarA = ((g01.a) it.next()).a();
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            b11.a aVar4 = (b11.a) obj2;
            m21.b bVar = this.f122120d;
            if (!(bVar instanceof m21.b.a) || aVar4.b() != b11.b.MEAL) {
                if (!(bVar instanceof m21.b.c) || v21.a.c(aVar4, ((m21.b.c) bVar).f116072b)) {
                    arrayList2.add(obj2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new g01.n.a((b11.a) it3.next()));
        }
        return new h3.b.c(arrayList3, i14 == 0 ? null : new Integer(i14 - 1), cVar2.f80643b ? new Integer((aVar2.f196007a / 50) + i14) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln01/e$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "STARTING_PAGE", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(m01.g gVar, m21.b bVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, bVar, (i14 & 4) != 0 ? null : str);
    }
}

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln01/a;", "Ln01/g;", "Lm01/g;", "repository", "", "searchExpression", "<init>", "(Lm01/g;Ljava/lang/String;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01.g f122104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f122105d;

    static {
        new C2307a(null);
    }

    public a(m01.g gVar, String str) {
        gVar.getClass();
        this.f122104c = gVar;
        this.f122105d = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        b bVar;
        h3.a aVar2;
        int i14;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i15 = bVar.f122110e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f122110e = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f122108c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = bVar2.f122110e;
        if (i16 == 0) {
            r.b(obj);
            Integer num = (Integer) aVar.a();
            int iIntValue = num != null ? num.intValue() : 0;
            g(iIntValue == 0);
            int iF = f(iIntValue, aVar.f196007a);
            int i17 = aVar.f196007a;
            bVar2.f122106a = aVar;
            bVar2.f122107b = iIntValue;
            bVar2.f122110e = 1;
            Object objH = m01.g.h(this.f122104c, iF, i17, this.f122105d, null, bVar2, 8);
            if (objH == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            i14 = iIntValue;
            obj = objH;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = bVar2.f122107b;
            aVar2 = bVar2.f122106a;
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
        g01.d dVar = (g01.d) ((v2.b) v2Var).f47386a;
        List<g01.r> list = dVar.f74148a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b11.a.C0202a c0202aA = ((g01.r) it.next()).a();
            if (c0202aA != null) {
                arrayList.add(c0202aA);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new g01.n.a((b11.a.C0202a) it3.next()));
        }
        return new h3.b.c(arrayList2, i14 == 0 ? null : new Integer(i14 - 1), dVar.f74149b ? new Integer((aVar2.f196007a / 20) + i14) : null);
    }

    /* JADX INFO: renamed from: n01.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln01/a$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "STARTING_PAGE", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2307a {
        public /* synthetic */ C2307a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2307a() {
        }
    }

    public /* synthetic */ a(m01.g gVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? null : str);
    }
}

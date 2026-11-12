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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ln01/c;", "Ln01/g;", "Lm01/g;", "repository", "", "searchExpression", "Lm21/b;", "mode", "<init>", "(Lm01/g;Ljava/lang/String;Lm21/b;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m01.g f122111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f122112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m21.b f122113e;

    static {
        new a(null);
    }

    public c(m01.g gVar, String str, m21.b bVar) {
        gVar.getClass();
        bVar.getClass();
        this.f122111c = gVar;
        this.f122112d = str;
        this.f122113e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        d dVar;
        h3.a aVar2;
        int i14;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i15 = dVar.f122118e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar.f122118e = i15 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f122116c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar2.f122118e;
        if (i16 == 0) {
            r.b(obj);
            Integer num = (Integer) aVar.a();
            int iIntValue = num != null ? num.intValue() : 0;
            g(iIntValue == 0);
            int iF = f(iIntValue, aVar.f196007a);
            int i17 = aVar.f196007a;
            dVar2.f122114a = aVar;
            dVar2.f122115b = iIntValue;
            dVar2.f122118e = 1;
            Object objN = m01.g.n(this.f122111c, iF, i17, this.f122112d, null, dVar2, 8);
            if (objN == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
            i14 = iIntValue;
            obj = objN;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = dVar2.f122115b;
            aVar2 = dVar2.f122114a;
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
        g01.f fVar = (g01.f) ((v2.b) v2Var).f47386a;
        List<g01.e> list = fVar.f74176a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b11.a.b bVarA = ((g01.e) it.next()).a();
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            b11.a.b bVar = (b11.a.b) obj2;
            m21.b bVar2 = this.f122113e;
            if (!(bVar2 instanceof m21.b.c) || v21.a.c(bVar, ((m21.b.c) bVar2).f116072b)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new g01.n.a((b11.a.b) it3.next()));
        }
        return new h3.b.c(arrayList3, i14 == 0 ? null : new Integer(i14 - 1), fVar.f74177b ? new Integer((aVar2.f196007a / 20) + i14) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln01/c$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "STARTING_PAGE", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(m01.g gVar, String str, m21.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? null : str, bVar);
    }
}

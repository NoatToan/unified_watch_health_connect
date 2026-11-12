package kr2;

import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import tn2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo53/b0;", "", "Lo13/p;", "Lps2/n;", "Lo13/q;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.developer.viewmodels.DeveloperSettingViewModel$fetchFelicaSEIDs$2", f = "DeveloperSettingViewModel.kt", l = {1018}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super List<? extends o13.p<? extends ps2.n, ? extends q<? extends String>>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106370b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lps2/n;", "Lo13/q;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.developer.viewmodels.DeveloperSettingViewModel$fetchFelicaSEIDs$2$1$1", f = "DeveloperSettingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super o13.p<? extends ps2.n, ? extends q<? extends String>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f106371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ps2.n f106372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ps2.n nVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f106372b = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f106372b, dVar);
            aVar.f106371a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends ps2.n, ? extends q<? extends String>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ps2.n nVar = this.f106372b;
            try {
                int i14 = q.f128596b;
                byte[] bArr = ((w.f) new w(nVar.f140499b, nVar.f140498a).t(new w.d(true, false, false, false, false, false, false, false, false, false, 1022, null)).c()).f165719a;
                if (bArr == null) {
                    throw new IllegalArgumentException("SEID should not be null");
                }
                bVar = hb2.d.b(bArr);
                return new o13.p(nVar, q.a(bVar));
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
        }
    }

    public l(t13.d<? super l> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(dVar);
        lVar.f106370b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends o13.p<? extends ps2.n, ? extends q<? extends String>>>> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f106370b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106369a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListE = rd2.j.e();
        if (arrayListE == null) {
            vb.h.z("Failed to get device list stored in GCM");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (sd2.f fVar : arrayListE) {
            ps2.w wVar = ps2.w.f140538a;
            long unitID = fVar.getUnitID();
            wVar.getClass();
            ps2.n nVarI = ps2.w.i(unitID);
            if (nVarI != null) {
                arrayList.add(nVarI);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ps2.n) obj2).f140499b.s()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ge1.b.j(b0Var, null, null, new a((ps2.n) it.next(), null), 3));
        }
        this.f106370b = null;
        this.f106369a = 1;
        Object objO = g8.i.o(arrayList3, this);
        return objO == aVar ? aVar : objO;
    }
}

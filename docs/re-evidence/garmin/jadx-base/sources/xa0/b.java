package xa0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.j0;
import q90.c;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import rd2.f;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxa0/b;", "Landroidx/lifecycle/u1;", "Lq90/c;", "pairedDevice", "<init>", "(Lq90/c;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f189718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f189719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f189720c;

    /* JADX INFO: renamed from: xa0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lxa0/b$a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.launchpad.LaunchpadViewModel$uiState$1", f = "LaunchpadViewModel.kt", l = {25, 31}, m = "invokeSuspend", v = 2)
    public static final class C3530b extends i implements p<j<? super a>, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f189724b;

        public C3530b(d<? super C3530b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C3530b c3530b = b.this.new C3530b(dVar);
            c3530b.f189724b = obj;
            return c3530b;
        }

        @Override // e23.p
        public final Object invoke(j<? super a> jVar, d<? super Unit> dVar) {
            return ((C3530b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L21;
         */
        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.util.List<n90.b>] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object value;
            List list;
            j jVar = (j) this.f189724b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f189723a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 2) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0 r0VarS = g.s(obj);
            b bVar = b.this;
            ?? r14 = bVar.f189718a.f143495c.f111531p.f58447m;
            r0VarS.f105810a = r14;
            if (r14 == 0) {
                a aVar2 = new a(false, j0.f134944a);
                this.f189724b = null;
                this.f189723a = 1;
            } else {
                rd2.j jVar2 = f.a().f152045a;
                long j8 = bVar.f189718a.f143493a;
                jVar2.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                if (fVarI != null) {
                    if (!fVarI.i1()) {
                        Iterable iterable = (Iterable) r0VarS.f105810a;
                        ?? arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            n90.b bVar2 = (n90.b) obj2;
                            if (bVar2 != n90.b.f125019n && bVar2 != n90.b.f125020o) {
                                arrayList.add(obj2);
                            }
                        }
                        r0VarS.f105810a = arrayList;
                    }
                    p2 p2Var = bVar.f189719b;
                    do {
                        value = p2Var.getValue();
                        list = (List) r0VarS.f105810a;
                        ((a) value).getClass();
                        list.getClass();
                    } while (!p2Var.b(value, new a(false, list)));
                    return Unit.INSTANCE;
                }
                a aVar3 = new a(false, j0.f134944a);
                this.f189724b = null;
                this.f189723a = 2;
            }
            return aVar;
        }
    }

    public b(c cVar) {
        cVar.getClass();
        this.f189718a = cVar;
        p2 p2VarA = q2.a(new a(false, null, 3, null));
        this.f189719b = p2VarA;
        v vVar = new v(new C3530b(null), s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f189720c = s.K(vVar, aVarA, k2.a.f150705b, new a(true, null, 2, null));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxa0/b$a;", "", "", "isLoading", "", "Ln90/b;", "launchpadItems", "<init>", "(ZLjava/util/List;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f189721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<n90.b> f189722b;

        public a(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? j0.f134944a : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f189721a == aVar.f189721a && p005kotlin.jvm.internal.s.g(this.f189722b, aVar.f189722b);
        }

        public final int hashCode() {
            return this.f189722b.hashCode() + (Boolean.hashCode(this.f189721a) * 31);
        }

        public final String toString() {
            return "LaunchpadUiState(isLoading=" + this.f189721a + ", launchpadItems=" + this.f189722b + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z14, List<? extends n90.b> list) {
            list.getClass();
            this.f189721a = z14;
            this.f189722b = list;
        }

        public a() {
            this(false, null, 3, null);
        }
    }
}

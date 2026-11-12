package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b2;
import p3.c2;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvs1/l;", "", "Lo53/b0;", "coroutineScope", "Lss1/a0;", "reviewsRepo", "Lr53/z1;", "Lpt1/w;", "_reviewSectionStateFlow", "<init>", "(Lo53/b0;Lss1/a0;Lr53/z1;)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f179848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss1.a0 f179849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1<pt1.w> f179850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f179851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f179852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f179853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f179854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f179855h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.PagedReviewsUseCase$fetchInitialReviewsForTrail$1", f = "PagedReviewsUseCase.kt", l = {47, 58, 69, 81, 89}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179856a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f179858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f179859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Set<Long> f179860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ qs1.h f179861f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, Context context, Set<Long> set, qs1.h hVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f179858c = j8;
            this.f179859d = context;
            this.f179860e = set;
            this.f179861f = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new b(this.f179858c, this.f179859d, this.f179860e, this.f179861f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0086  */
        /* JADX WARN: Code duplicated, block: B:26:0x008e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0093  */
        /* JADX WARN: Code duplicated, block: B:29:0x0096  */
        /* JADX WARN: Code duplicated, block: B:30:0x009b  */
        /* JADX WARN: Code duplicated, block: B:32:0x009e  */
        /* JADX WARN: Code duplicated, block: B:42:0x00cd A[LOOP:0: B:40:0x00c7->B:42:0x00cd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:47:0x0119  */
        /* JADX WARN: Code duplicated, block: B:50:0x0138  */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
        
            if (r0.emit(r1, r23) == r7) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
        
            if (r0.emit(r1, r23) == r7) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0153, code lost:
        
            if (r0.emit(r1, r23) == r7) goto L52;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objW0;
            v2 v2Var;
            qs1.v vVar;
            List<qs1.u> listB;
            boolean resultsFiltered;
            ArrayList arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179856a;
            l lVar = l.this;
            if (i14 == 0) {
                o13.r.b(obj);
                z1<pt1.w> z1Var = lVar.f179850c;
                pt1.w wVarA = pt1.w.a(z1Var.getValue(), true, false, j53.l.b(), false, false, false, 36);
                this.f179856a = 1;
                if (z1Var.emit(wVarA, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                objW0 = obj;
                v2Var = (v2) objW0;
                if (v2Var instanceof v2.b) {
                    vVar = (qs1.v) ((v2.b) v2Var).f47386a;
                    if (vVar != null) {
                        listB = vVar.b();
                    } else {
                        listB = null;
                    }
                    if (vVar != null) {
                        resultsFiltered = vVar.getResultsFiltered();
                    } else {
                        resultsFiltered = false;
                    }
                    if (listB != null) {
                        boolean z14 = (resultsFiltered && listB.size() < 10) || listB.isEmpty();
                        z1<pt1.w> z1Var2 = lVar.f179850c;
                        pt1.w value = z1Var2.getValue();
                        arrayList = new ArrayList(p13.y.r(listB, 10));
                        for (qs1.u uVar : listB) {
                            lt1.j jVar = lt1.j.f114865a;
                            boolean zR = p13.h0.R(this.f179860e, uVar.getTripReportId());
                            String str = (String) lVar.f179853f.getF182175a();
                            jVar.getClass();
                            arrayList.add(lt1.j.e(uVar, this.f179859d, zR, this.f179861f, str));
                        }
                        pt1.w wVarA2 = pt1.w.a(value, false, false, i53.a.e(arrayList), z14, false, false, 102);
                        this.f179856a = 3;
                    } else {
                        z1<pt1.w> z1Var3 = lVar.f179850c;
                        pt1.w wVarA3 = pt1.w.a(z1Var3.getValue(), false, false, null, true, false, false, 110);
                        this.f179856a = 4;
                    }
                    return aVar;
                }
                z1<pt1.w> z1Var4 = lVar.f179850c;
                pt1.w wVarA4 = pt1.w.a(z1Var4.getValue(), false, false, null, false, false, true, 46);
                this.f179856a = 5;
            } else if (i14 == 3) {
                o13.r.b(obj);
                lVar.f179855h += 10;
            } else {
                if (i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            lVar.f179855h = 0;
            ss1.a0 a0Var = lVar.f179849b;
            us1.e eVar = lVar.f179850c.getValue().f140999c;
            int i15 = lVar.f179855h;
            this.f179856a = 2;
            objW0 = a0Var.w0(this.f179858c, eVar, i15, 10, this);
            if (objW0 != aVar) {
                v2Var = (v2) objW0;
                if (v2Var instanceof v2.b) {
                    vVar = (qs1.v) ((v2.b) v2Var).f47386a;
                    if (vVar != null) {
                        listB = vVar.b();
                    } else {
                        listB = null;
                    }
                    if (vVar != null) {
                        resultsFiltered = vVar.getResultsFiltered();
                    } else {
                        resultsFiltered = false;
                    }
                    if (listB != null) {
                        if (resultsFiltered) {
                        }
                        z1<pt1.w> z1Var5 = lVar.f179850c;
                        pt1.w value2 = z1Var5.getValue();
                        arrayList = new ArrayList(p13.y.r(listB, 10));
                        while (r1.hasNext()) {
                            lt1.j jVar2 = lt1.j.f114865a;
                            boolean zR2 = p13.h0.R(this.f179860e, uVar.getTripReportId());
                            String str2 = (String) lVar.f179853f.getF182175a();
                            jVar2.getClass();
                            arrayList.add(lt1.j.e(uVar, this.f179859d, zR2, this.f179861f, str2));
                        }
                        pt1.w wVarA5 = pt1.w.a(value2, false, false, i53.a.e(arrayList), z14, false, false, 102);
                        this.f179856a = 3;
                    } else {
                        z1<pt1.w> z1Var6 = lVar.f179850c;
                        pt1.w wVarA6 = pt1.w.a(z1Var6.getValue(), false, false, null, true, false, false, 110);
                        this.f179856a = 4;
                    }
                } else {
                    z1<pt1.w> z1Var7 = lVar.f179850c;
                    pt1.w wVarA7 = pt1.w.a(z1Var7.getValue(), false, false, null, false, false, true, 46);
                    this.f179856a = 5;
                }
            }
            return aVar;
        }
    }

    static {
        new a(null);
    }

    public l(o53.b0 b0Var, ss1.a0 a0Var, z1<pt1.w> z1Var) {
        b0Var.getClass();
        a0Var.getClass();
        z1Var.getClass();
        this.f179848a = b0Var;
        this.f179849b = a0Var;
        this.f179850c = z1Var;
        this.f179851d = new b2(-1L);
        this.f179852e = p3.p0.n(new qs1.h(null, null, null, null, null, 31, null));
        this.f179853f = p3.p0.n("");
        this.f179854g = z1Var;
    }

    public final void a(Context context, long j8, qs1.h hVar, String str, Set<Long> set) {
        context.getClass();
        hVar.getClass();
        str.getClass();
        set.getClass();
        this.f179851d.k(j8);
        this.f179852e.setValue(hVar);
        this.f179853f.setValue(str);
        x53.c cVar = s0.f129406a;
        ge1.b.T(this.f179848a, x53.b.f189152a, null, new b(j8, context, set, hVar, null), 2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lvs1/l$a;", "", "<init>", "()V", "", "FIRST_PAGE_PRELOAD_SIZE", "I", "PAGE_SIZE", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

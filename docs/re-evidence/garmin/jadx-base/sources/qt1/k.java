package qt1;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.z1;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqt1/k;", "Landroidx/lifecycle/u1;", "Lss1/a;", "trailsRepo", "Lss1/a0;", "reviewsRepo", "Lvs1/h;", "snackbarMessageUseCase", "Lvs1/x;", "submitTrailReviewUseCase", "Lvs1/o;", "refreshActivityDetailsUseCase", "<init>", "(Lss1/a;Lss1/a0;Lvs1/h;Lvs1/x;Lvs1/o;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {
    public final b2 A;
    public final b2 B;
    public final b2 C;
    public final z1 D;
    public final b2 E;
    public final b2 F;
    public final b2 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss1.a f147666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss1.a0 f147667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vs1.h f147668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vs1.x f147669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vs1.o f147670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bv.d f147671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qs1.d f147672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f147673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f147674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f147675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f147676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f147677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f147678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f147679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vs1.f f147680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vs1.g f147681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vs1.d f147682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vs1.l f147683r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vs1.k f147684t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final vs1.e0 f147685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vs1.h0 f147686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vs1.d0 f147687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vs1.w f147688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o53.j0 f147689z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$changeBottomSheetContentType$1", f = "TrailDetailsViewModel.kt", l = {1062, 1063}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pt1.n f147691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f147692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pt1.n nVar, k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f147691b = nVar;
            this.f147692c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f147691b, this.f147692c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147690a;
            k kVar = this.f147692c;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    p2 p2Var = kVar.f147676k;
                    pt1.a0 a0VarA = pt1.a0.a((pt1.a0) p2Var.getValue(), false, false, false, null, null, null, this.f147691b, null, null, false, false, 1983);
                    this.f147690a = 2;
                    p2Var.k(null, a0VarA);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            if (!p005kotlin.jvm.internal.s.g(this.f147691b, pt1.n.b.f140894a)) {
                p2 p2Var2 = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, this.f147691b, null, null, null, null, false, false, false, false, false, 1073217535);
                this.f147690a = 1;
                p2Var2.k(null, oVarA);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var3 = kVar.f147676k;
                    pt1.a0 a0VarA2 = pt1.a0.a((pt1.a0) p2Var3.getValue(), false, false, false, null, null, null, this.f147691b, null, null, false, false, 1983);
                    this.f147690a = 2;
                    p2Var3.k(null, a0VarA2);
                }
                return aVar;
            }
            kVar.I4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$clearContentAlreadyReportedDialog$1", f = "TrailDetailsViewModel.kt", l = {745}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147693a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147693a;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741567);
                this.f147693a = 1;
                p2Var.k(null, oVarA);
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            kVar.I4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$clearReportsRateLimitDialog$1", f = "TrailDetailsViewModel.kt", l = {738}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147695a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147695a;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741695);
                this.f147695a = 1;
                p2Var.k(null, oVarA);
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            kVar.I4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$closeBottomSheet$1", f = "TrailDetailsViewModel.kt", l = {1094, 1100}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f147698b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f147698b;
            k kVar = k.this;
            if (i15 != 0) {
                if (i15 == 1) {
                    i14 = this.f147697a;
                    o13.r.b(obj);
                    p2 p2Var = kVar.f147676k;
                    pt1.a0 a0VarA = pt1.a0.a((pt1.a0) p2Var.getValue(), false, false, false, null, null, null, pt1.n.b.f140894a, null, null, false, false, 1983);
                    this.f147697a = i14;
                    this.f147698b = 2;
                    p2Var.k(null, a0VarA);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            p2 p2Var2 = kVar.f147673h;
            p2 p2Var3 = kVar.f147673h;
            i14 = ((p005kotlin.jvm.internal.s.g(((pt1.o) p2Var2.getValue()).f140922t, pt1.n.a.f140893a) || (((pt1.o) p2Var3.getValue()).f140922t instanceof pt1.n.c)) && kVar.f147677l.getValue() != null) ? 1 : 0;
            if (i14 == 0) {
                pt1.o oVar = (pt1.o) p2Var3.getValue();
                pt1.n.b bVar = pt1.n.b.f140894a;
                pt1.o oVarA = pt1.o.a(oVar, false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, bVar, bVar, null, null, null, false, false, false, false, false, 1072168959);
                this.f147697a = i14;
                this.f147698b = 1;
                p2Var3.k(null, oVarA);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var4 = kVar.f147676k;
                    pt1.a0 a0VarA2 = pt1.a0.a((pt1.a0) p2Var4.getValue(), false, false, false, null, null, null, pt1.n.b.f140894a, null, null, false, false, 1983);
                    this.f147697a = i14;
                    this.f147698b = 2;
                    p2Var4.k(null, a0VarA2);
                }
                return aVar;
            }
            kVar.E4(pt1.n.h.f140902a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$dismissPhotoUploadFailedDialog$1", f = "TrailDetailsViewModel.kt", l = {777, 778}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147700a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f147702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z14, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f147702c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new e(this.f147702c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147700a;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 805306367);
                this.f147700a = 1;
                p2Var.k(null, oVarA);
                if (Unit.INSTANCE != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (!this.f147702c) {
                kVar.I4();
            }
            return Unit.INSTANCE;
            p2 p2Var2 = kVar.f147676k;
            pt1.a0 a0VarA = pt1.a0.a((pt1.a0) p2Var2.getValue(), false, false, false, null, null, null, null, null, null, false, false, 1023);
            this.f147700a = 2;
            p2Var2.k(null, a0VarA);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$fetchImageHelpfulState$1", f = "TrailDetailsViewModel.kt", l = {897, 900}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147703a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f147705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j8, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f147705c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new f(this.f147705c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objR2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147703a;
            long j8 = this.f147705c;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                ss1.a aVar2 = kVar.f147666a;
                this.f147703a = 1;
                objR2 = aVar2.R2(j8, this);
                if (objR2 != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objR2 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            v2 v2Var = (v2) objR2;
            if (v2Var instanceof v2.b) {
                pt1.r rVar = new pt1.r(((Boolean) ((v2.b) v2Var).f47386a).booleanValue(), false, 2, null);
                p2 p2Var = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, i53.a.g(p13.u0.i(((pt1.o) kVar.f147673h.getValue()).f140916n, new o13.p(new Long(j8), rVar))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073733631);
                this.f147703a = 2;
                p2Var.k(null, oVarA);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$getSubmitReviewState$1", f = "TrailDetailsViewModel.kt", l = {975}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147706a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f147708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f147709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f147710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Long f147711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f147712g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f147713h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, long j8, long j14, Long l14, String str, int i14, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f147708c = context;
            this.f147709d = j8;
            this.f147710e = j14;
            this.f147711f = l14;
            this.f147712g = str;
            this.f147713h = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new g(this.f147708c, this.f147709d, this.f147710e, this.f147711f, this.f147712g, this.f147713h, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147706a;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = k.this.f147674i;
                pt1.l lVar = new pt1.l(this.f147710e, this.f147711f, null, this.f147712g, this.f147713h, this.f147709d, new pi0.e(this.f147708c).a(new DateTime(this.f147709d), qi0.a.YEAR_ABBREV_MONTH_DAY), null, false, null, null, null, null, null, false, 32644, null);
                this.f147706a = 1;
                p2Var.k(null, lVar);
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$reportContent$1", f = "TrailDetailsViewModel.kt", l = {1157, 1159, 1167, 1171, 1175}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147714a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pt1.f f147716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ us1.c f147717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f147718e;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f147719a;

            static {
                int[] iArr = new int[us1.c.values().length];
                try {
                    iArr[us1.c.REVIEW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[us1.c.IMAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f147719a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(pt1.f fVar, us1.c cVar, Context context, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f147716c = fVar;
            this.f147717d = cVar;
            this.f147718e = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new h(this.f147716c, this.f147717d, this.f147718e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            if (r2 == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
        
            if (r2 == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x014f, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
        
            if (r8.K4(r46.f147718e, r46) == r1) goto L58;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objO2;
            Object objI0;
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147714a;
            k kVar = k.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    objO2 = obj;
                    v2Var = (v2) objO2;
                } else if (i14 == 2) {
                    o13.r.b(obj);
                    objI0 = obj;
                    v2Var = (v2) objI0;
                } else {
                    if (i14 != 3 && i14 != 4 && i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                kVar.Q4(false);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            kVar.Q4(true);
            ss1.a0 a0Var = kVar.f147667b;
            pt1.f fVar = this.f147716c;
            us1.b bVar = fVar.f140842b;
            long j8 = fVar.f140841a;
            String str = bVar.f172368a;
            us1.c cVar = this.f147717d;
            qs1.m mVar = new qs1.m(str, cVar.f172373a, fVar.f140843c, fVar.f140844d ? g22.n.g(kVar.f147671f.b()) : null);
            int i15 = a.f147719a[cVar.ordinal()];
            if (i15 == 1) {
                this.f147714a = 1;
                objO2 = a0Var.o2(j8, mVar, this);
            } else {
                if (i15 != 2) {
                    lc.u0.r();
                    return null;
                }
                this.f147714a = 2;
                objI0 = a0Var.I0(j8, mVar, this);
            }
            return aVar;
            if (v2Var instanceof v2.b) {
                kVar.T4(true);
                kVar.I4();
            } else {
                v2.a aVar2 = v2Var instanceof v2.a ? (v2.a) v2Var : null;
                Integer num = aVar2 != null ? aVar2.f47384b : null;
                if (num != null && num.intValue() == 429) {
                    p2 p2Var = kVar.f147673h;
                    pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, true, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741695);
                    this.f147714a = 3;
                    p2Var.k(null, oVarA);
                } else if (num != null && num.intValue() == 409) {
                    p2 p2Var2 = kVar.f147673h;
                    pt1.o oVarA2 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, true, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741567);
                    this.f147714a = 4;
                    p2Var2.k(null, oVarA2);
                } else {
                    this.f147714a = 5;
                }
            }
            kVar.Q4(false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$setLoadingState$1", f = "TrailDetailsViewModel.kt", l = {1197, 1198}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147720a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f147722c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z14, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f147722c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new i(this.f147722c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147720a;
            k kVar = k.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            p2 p2Var = kVar.f147673h;
            pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), this.f147722c, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
            this.f147720a = 1;
            p2Var.k(null, oVarA);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
            p2 p2Var2 = kVar.f147676k;
            pt1.a0 a0VarA = pt1.a0.a((pt1.a0) p2Var2.getValue(), false, this.f147722c, false, null, null, null, null, null, null, false, false, 2045);
            this.f147720a = 2;
            p2Var2.k(null, a0VarA);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$setPhotoUploadingProgress$1", f = "TrailDetailsViewModel.kt", l = {1204, 1205}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147723a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pt1.e f147725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(pt1.e eVar, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f147725c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new j(this.f147725c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147723a;
            k kVar = k.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            p2 p2Var = kVar.f147673h;
            pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, this.f147725c, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741815);
            this.f147723a = 1;
            p2Var.k(null, oVarA);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
            p2 p2Var2 = kVar.f147676k;
            pt1.a0 a0VarA = pt1.a0.a((pt1.a0) p2Var2.getValue(), false, false, false, null, null, null, null, null, this.f147725c, false, false, 1791);
            this.f147723a = 2;
            p2Var2.k(null, a0VarA);
        }
    }

    /* JADX INFO: renamed from: qt1.k$k, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$toggleImageHelpfulState$1", f = "TrailDetailsViewModel.kt", l = {919, 921, 929}, m = "invokeSuspend", v = 2)
    public static final class C2778k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f147727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f147728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f147729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ pt1.r f147730e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2778k(boolean z14, k kVar, long j8, pt1.r rVar, t13.d<? super C2778k> dVar) {
            super(2, dVar);
            this.f147727b = z14;
            this.f147728c = kVar;
            this.f147729d = j8;
            this.f147730e = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2778k(this.f147727b, this.f147728c, this.f147729d, this.f147730e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2778k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            if (r2 == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        
            if (r2 == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r1) goto L31;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objW2;
            Object objY1;
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147726a;
            boolean z14 = this.f147727b;
            long j8 = this.f147729d;
            k kVar = this.f147728c;
            if (i14 == 0) {
                o13.r.b(obj);
                if (z14) {
                    ss1.a aVar2 = kVar.f147666a;
                    this.f147726a = 1;
                    objY1 = aVar2.y1(j8, this);
                } else {
                    ss1.a aVar3 = kVar.f147666a;
                    this.f147726a = 2;
                    objW2 = aVar3.w2(j8, this);
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objY1 = obj;
                v2Var = (v2) objY1;
            } else if (i14 == 2) {
                o13.r.b(obj);
                objW2 = obj;
                v2Var = (v2) objW2;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            if (v2Var instanceof v2.b) {
                boolean z15 = !z14;
                boolean z16 = false;
                pt1.r rVar = this.f147730e;
                if (rVar != null && rVar.f140962b) {
                    z16 = true;
                }
                pt1.r rVar2 = new pt1.r(z15, !z16);
                p2 p2Var = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, i53.a.g(p13.u0.i(((pt1.o) kVar.f147673h.getValue()).f140916n, new o13.p(new Long(j8), rVar2))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073733631);
                this.f147726a = 3;
                p2Var.k(null, oVarA);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$toggleReportContentDialog$1", f = "TrailDetailsViewModel.kt", l = {1185}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147731a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f147733c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z14, t13.d<? super l> dVar) {
            super(2, dVar);
            this.f147733c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new l(this.f147733c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147731a;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = k.this.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, false, 0, false, false, null, 0, this.f147733c, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073737727);
                this.f147731a = 1;
                p2Var.k(null, oVarA);
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(ss1.a aVar, ss1.a0 a0Var, vs1.h hVar, vs1.x xVar, vs1.o oVar) {
        aVar.getClass();
        a0Var.getClass();
        hVar.getClass();
        xVar.getClass();
        oVar.getClass();
        this.f147666a = aVar;
        this.f147667b = a0Var;
        this.f147668c = hVar;
        this.f147669d = xVar;
        this.f147670e = oVar;
        this.f147671f = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
        p2 p2VarA = q2.a(new pt1.o(false, false, false, null, false, false, 0, false, false, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 1073741822, null));
        this.f147673h = p2VarA;
        p2 p2VarA2 = q2.a(new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null));
        this.f147674i = p2VarA2;
        p2 p2VarA3 = q2.a(0);
        this.f147675j = p2VarA3;
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = false;
        String str = null;
        p2 p2VarA4 = q2.a(new pt1.a0(z14, z15, z16, j53.l.b(), us1.o.RECENT_FIRST, str, pt1.n.b.f140894a, null, null, false, false, 1952, null == true ? 1 : 0));
        this.f147676k = p2VarA4;
        p2 p2VarA5 = q2.a(null);
        this.f147677l = p2VarA5;
        p2 p2VarA6 = q2.a(new pt1.w(z15, z16, us1.e.CHRONOLOGICAL, j53.l.b(), false, false, false, 96, null));
        this.f147678m = p2VarA6;
        p2 p2VarA7 = q2.a(Boolean.FALSE);
        this.f147679n = p2VarA7;
        this.f147680o = new vs1.f(a0Var, v1.a(this), p2VarA4, p2VarA7, hVar);
        this.f147681p = new vs1.g(v1.a(this), a0Var);
        this.f147682q = new vs1.d(a0Var, v1.a(this), p2VarA6, p2VarA, hVar);
        vs1.l lVar = new vs1.l(v1.a(this), a0Var, p2VarA6);
        this.f147683r = lVar;
        this.f147684t = new vs1.k(v1.a(this), a0Var, p2VarA, p2VarA6, p2VarA5);
        this.f147685v = new vs1.e0(a0Var);
        this.f147686w = new vs1.h0(v1.a(this), aVar, a0Var, hVar, p2VarA4);
        this.f147687x = new vs1.d0(v1.a(this), a0Var, hVar);
        this.f147688y = new vs1.w(v1.a(this), p2VarA, hVar);
        this.A = r53.s.d(p2VarA);
        this.B = r53.s.d(p2VarA2);
        this.C = r53.s.d(p2VarA5);
        this.D = lVar.f179854g;
        this.E = r53.s.d(p2VarA4);
        this.F = r53.s.d(p2VarA7);
        this.I = r53.s.d(p2VarA3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x016b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x0176  */
    /* JADX WARN: Code duplicated, block: B:57:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0166, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r3) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A4(k kVar, Context context, v13.c cVar) {
        o0 o0Var;
        Context context2;
        qs1.w wVar;
        Context context3;
        v2 v2Var;
        v2.a aVar;
        Long lB;
        long millis;
        String courseName;
        qs1.b coverImage;
        String strS;
        kVar.getClass();
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f147759e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f147759e = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(kVar, cVar);
            }
        } else {
            o0Var = new o0(kVar, cVar);
        }
        Object objQ0 = o0Var.f147757c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f147759e;
        boolean z14 = false;
        if (i15 == 0) {
            o13.r.b(objQ0);
            ss1.a0 a0Var = kVar.f147667b;
            context2 = context;
            o0Var.f147755a = context2;
            o0Var.f147759e = 1;
            objQ0 = a0Var.q0(o0Var);
            if (objQ0 != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            context2 = o0Var.f147755a;
            o13.r.b(objQ0);
        } else {
            if (i15 == 2) {
                wVar = o0Var.f147756b;
                context3 = o0Var.f147755a;
                o13.r.b(objQ0);
                v2Var = (v2) objQ0;
                if (v2Var instanceof v2.b) {
                    qs1.d curatedCourseDTO = ((qs1.e) ((v2.b) v2Var).f47386a).getCuratedCourseDTO();
                    lB = wVar.getActivityDateMs();
                    if (lB != null) {
                        millis = lB.longValue();
                    } else {
                        millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                    }
                    p2 p2Var = kVar.f147673h;
                    pt1.o oVar = (pt1.o) p2Var.getValue();
                    long jLongValue = wVar.getCuratedCourseId().longValue();
                    long jLongValue2 = wVar.getActivityId().longValue();
                    String strA = new pi0.e(context3).a(new DateTime(millis), qi0.a.YEAR_ABBREV_MONTH_DAY);
                    courseName = curatedCourseDTO.getCourseName();
                    if (courseName == null) {
                        courseName = "";
                    }
                    String str = courseName;
                    coverImage = curatedCourseDTO.getCoverImage();
                    if (coverImage != null) {
                        strS = oc.b.s(coverImage);
                    } else {
                        strS = null;
                    }
                    pt1.o oVarA = pt1.o.a(oVar, false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, new pt1.y(jLongValue, jLongValue2, millis, strA, str, strS), null, null, null, null, null, false, false, false, false, false, 1073479679);
                    o0Var.f147755a = null;
                    o0Var.f147756b = null;
                    o0Var.f147759e = 3;
                    p2Var.k(null, oVarA);
                } else {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GARMIN_TRAILS;
                    if (v2Var instanceof v2.a) {
                        aVar = (v2.a) v2Var;
                    } else {
                        aVar = null;
                    }
                    String str2 = "Could not get suggested trail: " + (aVar != null ? aVar.f47383a : null);
                    aVar3.getClass();
                    i2.a.e(a2Var, str2);
                }
                return Boolean.valueOf(z14);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objQ0);
        }
        z14 = true;
        return Boolean.valueOf(z14);
        v2 v2Var2 = (v2) objQ0;
        if (v2Var2 instanceof v2.b) {
            qs1.w wVar2 = (qs1.w) ((v2.b) v2Var2).f47386a;
            i2.a aVar4 = i2.f36769a;
            aVar4.getClass();
            i2.a.a(a2.GARMIN_TRAILS, "getTrailReviewSuggestion result: " + wVar2);
            if ((wVar2 != null ? wVar2.getCuratedCourseId() : null) != null && wVar2.getActivityId() != null) {
                ss1.a aVar5 = kVar.f147666a;
                long jLongValue3 = wVar2.getCuratedCourseId().longValue();
                o0Var.f147755a = context2;
                o0Var.f147756b = wVar2;
                o0Var.f147759e = 2;
                Object objH1 = aVar5.H1(jLongValue3, o0Var);
                if (objH1 != aVar2) {
                    Context context4 = context2;
                    wVar = wVar2;
                    objQ0 = objH1;
                    context3 = context4;
                    v2Var = (v2) objQ0;
                    if (v2Var instanceof v2.b) {
                        qs1.d curatedCourseDTO2 = ((qs1.e) ((v2.b) v2Var).f47386a).getCuratedCourseDTO();
                        lB = wVar.getActivityDateMs();
                        if (lB != null) {
                            millis = lB.longValue();
                        } else {
                            millis = DateTime.now().withTimeAtStartOfDay().getMillis();
                        }
                        p2 p2Var2 = kVar.f147673h;
                        pt1.o oVar2 = (pt1.o) p2Var2.getValue();
                        long jLongValue4 = wVar.getCuratedCourseId().longValue();
                        long jLongValue5 = wVar.getActivityId().longValue();
                        String strA2 = new pi0.e(context3).a(new DateTime(millis), qi0.a.YEAR_ABBREV_MONTH_DAY);
                        courseName = curatedCourseDTO2.getCourseName();
                        if (courseName == null) {
                            courseName = "";
                        }
                        String str3 = courseName;
                        coverImage = curatedCourseDTO2.getCoverImage();
                        if (coverImage != null) {
                            strS = oc.b.s(coverImage);
                        } else {
                            strS = null;
                        }
                        pt1.o oVarA2 = pt1.o.a(oVar2, false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, new pt1.y(jLongValue4, jLongValue5, millis, strA2, str3, strS), null, null, null, null, null, false, false, false, false, false, 1073479679);
                        o0Var.f147755a = null;
                        o0Var.f147756b = null;
                        o0Var.f147759e = 3;
                        p2Var2.k(null, oVarA2);
                    } else {
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var2 = a2.GARMIN_TRAILS;
                        if (v2Var instanceof v2.a) {
                            aVar = (v2.a) v2Var;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                        }
                        String str4 = "Could not get suggested trail: " + (aVar != null ? aVar.f47383a : null);
                        aVar6.getClass();
                        i2.a.e(a2Var2, str4);
                    }
                }
                return aVar2;
            }
        } else {
            i2.a aVar7 = i2.f36769a;
            a2 a2Var3 = a2.GARMIN_TRAILS;
            v2.a aVar8 = v2Var2 instanceof v2.a ? (v2.a) v2Var2 : null;
            String str5 = "Could not get trail review suggestion: " + (aVar8 != null ? aVar8.f47383a : null);
            aVar7.getClass();
            i2.a.e(a2Var3, str5);
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object B4(k kVar, v13.c cVar) {
        r0 r0Var;
        kVar.getClass();
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i14 = r0Var.f147772c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r0Var.f147772c = i14 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(kVar, cVar);
            }
        } else {
            r0Var = new r0(kVar, cVar);
        }
        Object objL = r0Var.f147770a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r0Var.f147772c;
        if (i15 == 0) {
            o13.r.b(objL);
            r0Var.f147772c = 1;
            objL = ((j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null)).l(c80.q.GARMIN_TRAILS, r0Var);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        return Boolean.valueOf(!((Boolean) objL).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r6) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C4(k kVar, long j8, v13.c cVar) {
        s0 s0Var;
        long j14;
        Long l14;
        long j15;
        long j16;
        int i14;
        Long l15;
        ms1.c cVar2;
        pt1.p pVar;
        Long l16;
        boolean z14;
        p2 p2Var = kVar.f147673h;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i15 = s0Var.f147782g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                s0Var.f147782g = i15 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(kVar, cVar);
            }
        } else {
            s0Var = new s0(kVar, cVar);
        }
        Object objR1 = s0Var.f147780e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = s0Var.f147782g;
        if (i16 == 0) {
            o13.r.b(objR1);
            ss1.a0 a0Var = kVar.f147667b;
            s0Var.f147776a = j8;
            s0Var.f147782g = 1;
            objR1 = a0Var.R1(j8, s0Var);
            if (objR1 != aVar) {
                j14 = j8;
            }
            return aVar;
        }
        if (i16 == 1) {
            j14 = s0Var.f147776a;
            o13.r.b(objR1);
        } else if (i16 == 2) {
            i14 = s0Var.f147779d;
            j16 = s0Var.f147777b;
            j15 = s0Var.f147776a;
            l14 = s0Var.f147778c;
            o13.r.b(objR1);
            l15 = l14;
            cVar2 = (ms1.c) objR1;
            pVar = ((pt1.o) p2Var.getValue()).f140912j;
            if (pVar != null) {
                pt1.o oVar = (pt1.o) p2Var.getValue();
                if (cVar2 != null) {
                    l16 = new Long(cVar2.f120481a);
                } else {
                    l16 = null;
                }
                pt1.q qVar = pVar.f140931c;
                String str = qVar.f140953a;
                String str2 = qVar.f140956d;
                String str3 = pVar.f140937i;
                if (cVar2 != null) {
                    z14 = cVar2.f120482b;
                } else {
                    z14 = false;
                }
                pt1.o oVarA = pt1.o.a(oVar, false, null, false, false, 0, false, false, null, 0, false, null, l15, l16, null, new pt1.v(str, str2, str3, z14), null, null, null, null, null, null, false, false, false, false, false, 1073561599);
                s0Var.f147778c = null;
                s0Var.f147776a = j15;
                s0Var.f147777b = j16;
                s0Var.f147779d = i14;
                s0Var.f147782g = 3;
                p2Var.k(null, oVarA);
            }
        } else {
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objR1);
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) objR1;
        if ((v2Var instanceof v2.b) && (l14 = (Long) ((v2.b) v2Var).f47386a) != null) {
            long jLongValue = l14.longValue();
            ts1.a aVar2 = (ts1.a) KoinJavaComponent.get$default(ts1.a.class, null, null, 6, null);
            long jLongValue2 = l14.longValue();
            s0Var.f147778c = l14;
            s0Var.f147776a = j14;
            s0Var.f147777b = jLongValue;
            s0Var.f147779d = 0;
            s0Var.f147782g = 2;
            Object objG = aVar2.g(jLongValue2, s0Var);
            if (objG != aVar) {
                objR1 = objG;
                j15 = j14;
                j16 = jLongValue;
                i14 = 0;
                l15 = l14;
                cVar2 = (ms1.c) objR1;
                pVar = ((pt1.o) p2Var.getValue()).f140912j;
                if (pVar != null) {
                    pt1.o oVar2 = (pt1.o) p2Var.getValue();
                    if (cVar2 != null) {
                        l16 = new Long(cVar2.f120481a);
                    } else {
                        l16 = null;
                    }
                    pt1.q qVar2 = pVar.f140931c;
                    String str4 = qVar2.f140953a;
                    String str5 = qVar2.f140956d;
                    String str6 = pVar.f140937i;
                    if (cVar2 != null) {
                        z14 = cVar2.f120482b;
                    } else {
                        z14 = false;
                    }
                    pt1.o oVarA2 = pt1.o.a(oVar2, false, null, false, false, 0, false, false, null, 0, false, null, l15, l16, null, new pt1.v(str4, str5, str6, z14), null, null, null, null, null, null, false, false, false, false, false, 1073561599);
                    s0Var.f147778c = null;
                    s0Var.f147776a = j15;
                    s0Var.f147777b = j16;
                    s0Var.f147779d = i14;
                    s0Var.f147782g = 3;
                    p2Var.k(null, oVarA2);
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[LOOP:2: B:49:0x00d3->B:133:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9 A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6 A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5 A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x010e A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0123 A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, LOOP:1: B:61:0x0105->B:66:0x0123, LOOP_END, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x012c A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0142 A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:80:0x0158 A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0169 A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f A[Catch: Exception -> 0x00cc, CancellationException -> 0x01f4, TryCatch #2 {Exception -> 0x00cc, blocks: (B:41:0x00c0, B:43:0x00c4, B:55:0x00e6, B:56:0x00ef, B:58:0x00f5, B:60:0x00fd, B:61:0x0105, B:63:0x010e, B:69:0x012c, B:71:0x0142, B:74:0x0148, B:76:0x014e, B:81:0x0161, B:83:0x0169, B:86:0x016f, B:88:0x0175, B:93:0x0188, B:92:0x017f, B:80:0x0158, B:66:0x0123, B:95:0x019c, B:96:0x019f, B:97:0x01a0, B:99:0x01b2, B:48:0x00cf, B:49:0x00d3, B:51:0x00d9, B:37:0x00b1), top: B:119:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, pt1.e] */
    public static final Object D4(k kVar, Context context, long j8, i53.c cVar, v13.c cVar2) {
        u0 u0Var;
        Context context2;
        long j14;
        i53.c cVar3;
        ArrayList arrayList;
        List list;
        Iterator it;
        boolean z14;
        ArrayList arrayListD1;
        int i14;
        int i15;
        pt1.u uVar;
        Iterator it3;
        int i16;
        boolean z15;
        int i17;
        Object obj;
        v2.b bVar;
        String imageUrl;
        Object obj2;
        v2.b bVar2;
        Long imageId;
        qs1.b bVar3;
        qs1.b bVar4;
        kVar.getClass();
        if (cVar2 instanceof u0) {
            u0Var = (u0) cVar2;
            int i18 = u0Var.f147801g;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                u0Var.f147801g = i18 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(kVar, cVar2);
            }
        } else {
            u0Var = new u0(kVar, cVar2);
        }
        u0 u0Var2 = u0Var;
        Object objC = u0Var2.f147799e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = u0Var2.f147801g;
        boolean z16 = true;
        try {
            if (i19 == 0) {
                ArrayList arrayListX = v.h.x(objC);
                for (Object obj3 : cVar) {
                    if (((pt1.u) obj3).f140987b == null) {
                        arrayListX.add(obj3);
                    }
                }
                if (arrayListX.isEmpty()) {
                    return Boolean.TRUE;
                }
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                ?? eVar = new pt1.e(0, arrayListX.size());
                r0Var.f105810a = eVar;
                kVar.R4(eVar);
                try {
                    context2 = context;
                    try {
                        o53.j0 j0VarJ = ge1.b.j(v1.a(kVar), x53.b.f189152a, null, new w0(kVar, context2, j8, arrayListX, r0Var, null), 2);
                        kVar.f147689z = j0VarJ;
                        context2 = context;
                        try {
                            u0Var2.f147795a = context2;
                            cVar3 = cVar;
                            u0Var2.f147796b = cVar3;
                            u0Var2.f147797c = arrayListX;
                            j14 = j8;
                            try {
                                u0Var2.f147798d = j14;
                                u0Var2.f147801g = 1;
                                objC = j0VarJ.C(u0Var2);
                                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                                if (objC == aVar) {
                                    return aVar;
                                }
                                arrayList = arrayListX;
                                list = (List) objC;
                                if (list == null) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z14 = false;
                                            break;
                                        }
                                        if (((v2) it.next()) instanceof v2.a) {
                                            z14 = true;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z14 = false;
                                            break;
                                        }
                                        if (((v2) it.next()) instanceof v2.a) {
                                            z14 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z14) {
                                    arrayListD1 = p13.h0.d1(cVar3);
                                    i14 = 0;
                                    for (Object obj4 : arrayList) {
                                        i15 = i14 + 1;
                                        if (i14 >= 0) {
                                            p13.x.q();
                                            throw null;
                                        }
                                        uVar = (pt1.u) obj4;
                                        it3 = arrayListD1.iterator();
                                        i16 = 0;
                                        while (true) {
                                            z15 = z16;
                                            if (it3.hasNext()) {
                                                i17 = -1;
                                                break;
                                            }
                                            if (p005kotlin.jvm.internal.s.g(((pt1.u) it3.next()).f140986a, uVar.f140986a)) {
                                                i17 = i16;
                                                break;
                                            }
                                            i16++;
                                            z16 = z15;
                                        }
                                        if (i17 != -1) {
                                            pt1.u uVar2 = (pt1.u) arrayListD1.get(i17);
                                            boolean z17 = list.get(i14) instanceof v2.a;
                                            obj = list.get(i14);
                                            if (obj instanceof v2.b) {
                                                bVar = (v2.b) obj;
                                            } else {
                                                bVar = null;
                                            }
                                            if (bVar != null) {
                                                imageUrl = ((pt1.u) arrayListD1.get(i17)).f140986a;
                                            } else {
                                                imageUrl = ((pt1.u) arrayListD1.get(i17)).f140986a;
                                            }
                                            String str = imageUrl;
                                            obj2 = list.get(i14);
                                            if (obj2 instanceof v2.b) {
                                                bVar2 = (v2.b) obj2;
                                            } else {
                                                bVar2 = null;
                                            }
                                            if (bVar2 != null) {
                                                imageId = ((pt1.u) arrayListD1.get(i17)).f140987b;
                                            } else {
                                                imageId = ((pt1.u) arrayListD1.get(i17)).f140987b;
                                            }
                                            arrayListD1.set(i17, pt1.u.b(uVar2, str, imageId, 0, z17, 60));
                                        }
                                        i14 = i15;
                                        z16 = z15;
                                    }
                                    ge1.b.T(v1.a(kVar), null, null, new a1(kVar, arrayListD1, null), 3);
                                }
                                return Boolean.valueOf(!z14);
                            } catch (Exception e4) {
                                e = e4;
                                i2.a aVar3 = i2.f36769a;
                                a2 a2Var = a2.GARMIN_TRAILS;
                                String str2 = "submitTrailReviewPhotos error: " + e.getMessage();
                                aVar3.getClass();
                                i2.a.e(a2Var, str2);
                                u0Var2.f147795a = null;
                                u0Var2.f147796b = null;
                                u0Var2.f147797c = null;
                                u0Var2.f147798d = j14;
                                u0Var2.f147801g = 2;
                                if (kVar.K4(context2, u0Var2) == aVar) {
                                    return aVar;
                                }
                                return Boolean.FALSE;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            j14 = j8;
                            i2.a aVar4 = i2.f36769a;
                            a2 a2Var2 = a2.GARMIN_TRAILS;
                            String str3 = "submitTrailReviewPhotos error: " + e.getMessage();
                            aVar4.getClass();
                            i2.a.e(a2Var2, str3);
                            u0Var2.f147795a = null;
                            u0Var2.f147796b = null;
                            u0Var2.f147797c = null;
                            u0Var2.f147798d = j14;
                            u0Var2.f147801g = 2;
                            if (kVar.K4(context2, u0Var2) == aVar) {
                                return aVar;
                            }
                            return Boolean.FALSE;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        j14 = j8;
                    }
                } catch (Exception e16) {
                    e = e16;
                    context2 = context;
                }
            } else {
                if (i19 == 1) {
                    long j15 = u0Var2.f147798d;
                    arrayList = u0Var2.f147797c;
                    i53.c cVar4 = u0Var2.f147796b;
                    Context context3 = u0Var2.f147795a;
                    try {
                        o13.r.b(objC);
                        cVar3 = cVar4;
                        list = (List) objC;
                        if (list == null && list.isEmpty()) {
                            z14 = false;
                            break;
                        }
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z14 = false;
                                break;
                            }
                            if (((v2) it.next()) instanceof v2.a) {
                                z14 = true;
                                break;
                            }
                        }
                        if (z14) {
                            arrayListD1 = p13.h0.d1(cVar3);
                            i14 = 0;
                            while (r4.hasNext()) {
                                i15 = i14 + 1;
                                if (i14 >= 0) {
                                    p13.x.q();
                                    throw null;
                                }
                                uVar = (pt1.u) obj4;
                                it3 = arrayListD1.iterator();
                                i16 = 0;
                                while (true) {
                                    z15 = z16;
                                    if (it3.hasNext()) {
                                        i17 = -1;
                                        break;
                                    }
                                    if (p005kotlin.jvm.internal.s.g(((pt1.u) it3.next()).f140986a, uVar.f140986a)) {
                                        i17 = i16;
                                        break;
                                    }
                                    i16++;
                                    z16 = z15;
                                }
                                if (i17 != -1) {
                                    pt1.u uVar3 = (pt1.u) arrayListD1.get(i17);
                                    boolean z18 = list.get(i14) instanceof v2.a;
                                    obj = list.get(i14);
                                    if (obj instanceof v2.b) {
                                        bVar = (v2.b) obj;
                                    } else {
                                        bVar = null;
                                    }
                                    if (bVar != null || (bVar4 = (qs1.b) bVar.f47386a) == null || (imageUrl = bVar4.getImageUrl()) == null) {
                                        imageUrl = ((pt1.u) arrayListD1.get(i17)).f140986a;
                                    }
                                    String str4 = imageUrl;
                                    obj2 = list.get(i14);
                                    if (obj2 instanceof v2.b) {
                                        bVar2 = (v2.b) obj2;
                                    } else {
                                        bVar2 = null;
                                    }
                                    if (bVar2 != null || (bVar3 = (qs1.b) bVar2.f47386a) == null || (imageId = bVar3.getImageId()) == null) {
                                        imageId = ((pt1.u) arrayListD1.get(i17)).f140987b;
                                    }
                                    arrayListD1.set(i17, pt1.u.b(uVar3, str4, imageId, 0, z18, 60));
                                }
                                i14 = i15;
                                z16 = z15;
                            }
                            ge1.b.T(v1.a(kVar), null, null, new a1(kVar, arrayListD1, null), 3);
                        }
                        return Boolean.valueOf(!z14);
                    } catch (Exception e17) {
                        e = e17;
                        context2 = context3;
                        j14 = j15;
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var3 = a2.GARMIN_TRAILS;
                        String str5 = "submitTrailReviewPhotos error: " + e.getMessage();
                        aVar5.getClass();
                        i2.a.e(a2Var3, str5);
                        u0Var2.f147795a = null;
                        u0Var2.f147796b = null;
                        u0Var2.f147797c = null;
                        u0Var2.f147798d = j14;
                        u0Var2.f147801g = 2;
                        if (kVar.K4(context2, u0Var2) == aVar) {
                            return aVar;
                        }
                        return Boolean.FALSE;
                    }
                }
                if (i19 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            return Boolean.FALSE;
        } catch (CancellationException unused) {
            ge1.b.T(v1.a(kVar), null, null, new p0(kVar, null), 3);
            return Boolean.TRUE;
        }
    }

    public static Object O4(k kVar, Context context, long j8, v13.i iVar) {
        String courseNameUriComponent;
        qs1.h locationDTO;
        boolean zContains = kVar.f147684t.f179847f.contains(Long.valueOf(j8));
        qs1.d dVar = kVar.f147672g;
        qs1.h hVar = (dVar == null || (locationDTO = dVar.getLocationDTO()) == null) ? new qs1.h(null, null, null, null, null, 31, null) : locationDTO;
        qs1.d dVar2 = kVar.f147672g;
        if (dVar2 == null || (courseNameUriComponent = dVar2.getCourseNameUriComponent()) == null) {
            courseNameUriComponent = "";
        }
        return kVar.N4(context, j8, zContains, hVar, courseNameUriComponent, iVar);
    }

    public static final Unit x4(k kVar) {
        kVar.f147673h.k(null, new pt1.o(false, true, false, null, false, false, 0, false, false, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 1073741308, null));
        Unit unit = Unit.INSTANCE;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return unit;
    }

    public static final void y4(k kVar, Context context) {
        qs1.d dVar = kVar.f147672g;
        Long curatedCourseId = dVar != null ? dVar.getCuratedCourseId() : null;
        qs1.d dVar2 = kVar.f147672g;
        qs1.h locationDTO = dVar2 != null ? dVar2.getLocationDTO() : null;
        qs1.d dVar3 = kVar.f147672g;
        String courseNameUriComponent = dVar3 != null ? dVar3.getCourseNameUriComponent() : null;
        vs1.l lVar = kVar.f147683r;
        long jLongValue = curatedCourseId != null ? curatedCourseId.longValue() : -1L;
        qs1.h hVar = locationDTO == null ? new qs1.h(null, null, null, null, null, 31, null) : locationDTO;
        if (courseNameUriComponent == null) {
            courseNameUriComponent = "";
        }
        lVar.a(context, jLongValue, hVar, courseNameUriComponent, kVar.f147684t.f179847f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011a, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r7) goto L40;
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [o53.d0, t13.d, t13.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z4(k kVar, Context context, pt1.x xVar, pt1.l lVar, e23.a aVar, v13.c cVar) throws Throwable {
        g0 g0Var;
        Object obj;
        e23.a aVar2;
        kVar.getClass();
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f147642d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f147642d = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(kVar, cVar);
            }
        } else {
            g0Var = new g0(kVar, cVar);
        }
        g0 g0Var2 = g0Var;
        Object objV4 = g0Var2.f147640b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var2.f147642d;
        if (i15 != 0) {
            if (i15 == 1) {
                aVar2 = g0Var2.f147639a;
                o13.r.b(objV4);
                obj = null;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = g0Var2.f147639a;
                o13.r.b(objV4);
            }
            kVar.I4();
            aVar2.invoke();
            return Unit.INSTANCE;
        }
        o13.r.b(objV4);
        long j8 = xVar.f141004a;
        i53.c<kt1.b> cVar2 = xVar.f141012i;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
        for (kt1.b bVar : cVar2) {
            String str = bVar.f106448b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new pt1.u(str, new Long(bVar.f106447a), null, null, 0.0d, bVar.f106453g, false, 92, null));
        }
        obj = null;
        i53.c<pt1.u> cVar3 = lVar.f140886m;
        ArrayList arrayList2 = new ArrayList(p13.y.r(cVar3, 10));
        int i16 = 0;
        for (pt1.u uVar : cVar3) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList2.add(pt1.u.b(uVar, null, null, i16, false, 95));
            i16 = i17;
        }
        g0Var2.f147639a = aVar;
        g0Var2.f147642d = 1;
        objV4 = kVar.V4(context, j8, arrayList, arrayList2, g0Var2);
        if (objV4 != obj2) {
            aVar2 = aVar;
        }
        return obj2;
        boolean zBooleanValue = ((Boolean) objV4).booleanValue();
        kVar.Q4(false);
        if (zBooleanValue) {
            p2 p2Var = kVar.f147674i;
            pt1.l lVar2 = new pt1.l(0L, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, false, 32767, null);
            g0Var2.f147639a = aVar2;
            g0Var2.f147642d = 2;
            p2Var.k(obj, lVar2);
        } else {
            ?? r14 = obj;
            ge1.b.T(v1.a(kVar), r14, r14, new q0(kVar, r14), 3);
        }
        return Unit.INSTANCE;
    }

    public final void E4(pt1.n nVar) {
        nVar.getClass();
        ge1.b.T(v1.a(this), null, null, new a(nVar, this, null), 3);
    }

    public final void F4(long j8) {
        Object value;
        pt1.x xVar = (pt1.x) this.f147677l.getValue();
        if (xVar == null || xVar.f141004a != j8) {
            return;
        }
        p2 p2Var = this.f147670e.f179871a;
        do {
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
    }

    public final void G4() {
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    public final void H4() {
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
    }

    public final void I4() {
        ge1.b.T(v1.a(this), null, null, new d(null), 3);
    }

    public final void J4(boolean z14) {
        ge1.b.T(v1.a(this), null, null, new e(z14, null), 3);
    }

    public final Object K4(Context context, v13.c cVar) {
        Object objA = this.f147668c.a(new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null), cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    public final void L4(long j8) {
        if (((pt1.o) this.f147673h.getValue()).f140916n.containsKey(Long.valueOf(j8))) {
            return;
        }
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new f(j8, null), 2);
    }

    public final void M4(Context context, int i14, long j8, String str, long j14, Long l14) {
        context.getClass();
        str.getClass();
        ge1.b.T(v1.a(this), null, null, new g(context, j14, j8, l14, str, i14, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object N4(Context context, long j8, boolean z14, qs1.h hVar, String str, v13.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f147530g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f147530g = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objE1 = a0Var.f147528e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f147530g;
        if (i15 == 0) {
            o13.r.b(objE1);
            a0Var.f147524a = context;
            a0Var.f147525b = hVar;
            a0Var.f147526c = str;
            a0Var.f147527d = z14;
            a0Var.f147530g = 1;
            objE1 = this.f147667b.e1(j8, a0Var);
            if (objE1 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = a0Var.f147527d;
            str = a0Var.f147526c;
            hVar = a0Var.f147525b;
            context = a0Var.f147524a;
            o13.r.b(objE1);
        }
        v2 v2Var = (v2) objE1;
        if (v2Var instanceof v2.b) {
            lt1.j jVar = lt1.j.f114865a;
            v2.b bVar = (v2.b) v2Var;
            qs1.u uVar = (qs1.u) bVar.f47386a;
            jVar.getClass();
            return new v2.b(lt1.j.e(uVar, context, z14, hVar, str), bVar.f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        lc.u0.r();
        return null;
    }

    public final void P4(Context context, us1.c cVar, pt1.f fVar) {
        context.getClass();
        cVar.getClass();
        fVar.getClass();
        w9.a aVarA = v1.a(this);
        x53.c cVar2 = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new h(fVar, cVar, context, null), 2);
    }

    public final void Q4(boolean z14) {
        ge1.b.T(v1.a(this), null, null, new i(z14, null), 3);
    }

    public final void R4(pt1.e eVar) {
        ge1.b.T(v1.a(this), null, null, new j(eVar, null), 3);
    }

    public final void S4(long j8) {
        pt1.r rVar = ((pt1.o) this.f147673h.getValue()).f140916n.get(Long.valueOf(j8));
        boolean z14 = rVar != null ? rVar.f140961a : false;
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new C2778k(z14, this, j8, rVar, null), 2);
    }

    public final void T4(boolean z14) {
        ge1.b.T(v1.a(this), null, null, new l(z14, null), 3);
    }

    public final void U4(Context context, long j8) {
        context.getClass();
        String strG = g22.n.g(this.f147671f.b());
        vs1.d0 d0Var = this.f147687x;
        d0Var.getClass();
        p2 p2Var = this.f147678m;
        p2Var.getClass();
        o53.b0 b0Var = d0Var.f179775a;
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.b0(p2Var, d0Var, j8, strG, context, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0202 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0205  */
    /* JADX WARN: Code duplicated, block: B:105:0x0209 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0215 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x034a  */
    /* JADX WARN: Code duplicated, block: B:168:0x035a  */
    /* JADX WARN: Code duplicated, block: B:169:0x035d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0341 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[LOOP:3: B:71:0x017a->B:202:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01c0 A[EDGE_INSN: B:208:0x01c0->B:86:0x01c0 BREAK  A[LOOP:5: B:81:0x01a8->B:87:0x01c2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[LOOP:6: B:34:0x00a4->B:39:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0176 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0180 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a1 A[Catch: CancellationException -> 0x0173, Exception -> 0x0238, TryCatch #3 {Exception -> 0x0238, blocks: (B:78:0x0199, B:80:0x01a1, B:81:0x01a8), top: B:178:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TRY_ENTER, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, LOOP:5: B:81:0x01a8->B:87:0x01c2, LOOP_END, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01cb A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01df A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f2 A[Catch: Exception -> 0x005d, CancellationException -> 0x0173, TryCatch #2 {Exception -> 0x005d, blocks: (B:19:0x0058, B:64:0x0167, B:66:0x016b, B:70:0x0176, B:71:0x017a, B:73:0x0180, B:75:0x018a, B:76:0x0193, B:84:0x01b0, B:90:0x01cb, B:92:0x01df, B:95:0x01e6, B:97:0x01ec, B:100:0x01fa, B:102:0x0202, B:105:0x0209, B:107:0x020f, B:110:0x021d, B:109:0x0215, B:99:0x01f2, B:87:0x01c2, B:114:0x023c, B:115:0x0241, B:116:0x0242), top: B:176:0x0058 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v8, types: [o53.d0, t13.d, t13.g] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, pt1.e] */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.content.Context, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e7 -> B:46:0x00ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f6 -> B:47:0x00f3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:80:0x01a1
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object V4(android.content.Context r23, long r24, java.util.ArrayList r26, java.util.ArrayList r27, v13.c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qt1.k.V4(android.content.Context, long, java.util.ArrayList, java.util.ArrayList, v13.c):java.lang.Object");
    }
}

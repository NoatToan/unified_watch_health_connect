package v92;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.consent.network.GdprRevokeException406;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import lc.u0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tn2.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lv92/r;", "Landroidx/lifecycle/u1;", "Lq92/f;", "consentRepository", "Lp92/a;", "consentAppDelegate", "Lq92/z;", "dispatcherProvider", "<init>", "(Lq92/f;Lp92/a;Lq92/z;)V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f176465l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q92.f f176466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p92.a f176467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q92.z f176468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s92.l f176469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f176470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f176471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<d0> f176472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<v92.a> f176473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<l> f176474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w0 f176475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w0 f176476k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$fetchConsentText$1", f = "ConsentViewModel.kt", l = {219}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y0 f176477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f176478b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q92.x f176480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f176481e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q92.x xVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f176480d = xVar;
            this.f176481e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new b(this.f176480d, this.f176481e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            y0<d0> y0Var;
            d0 aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176478b;
            r rVar = r.this;
            q92.x xVar = this.f176480d;
            if (i14 == 0) {
                o13.r.b(obj);
                y0<d0> y0Var2 = rVar.f176472g;
                q92.f fVar = rVar.f176466a;
                Locale locale = Locale.getDefault();
                locale.getClass();
                this.f176477a = y0Var2;
                this.f176478b = 1;
                fVar.getClass();
                Object objD = fVar.d(xVar.f143819a, locale, this);
                if (objD == aVar2) {
                    return aVar2;
                }
                y0Var = y0Var2;
                obj = objD;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f176477a;
                o13.r.b(obj);
            }
            q92.a0 a0Var = (q92.a0) obj;
            boolean z14 = a0Var instanceof q92.a0.b;
            boolean z15 = this.f176481e;
            if (z14) {
                aVar = new d0.e(z15, (s92.g) ((q92.a0.b) a0Var).f143609a);
            } else {
                if (!(a0Var instanceof q92.a0.a)) {
                    u0.r();
                    return null;
                }
                aVar = new d0.a(new v92.e.a(xVar, ((q92.a0.a) a0Var).f143608a), new c.e(rVar, xVar, z15, 12));
            }
            y0Var.m(aVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$fetchConsentWithText$1", f = "ConsentViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 164}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q92.v f176482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y0 f176483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f176484c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q92.x f176486e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q92.x xVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f176486e = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new c(this.f176486e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:39:0x0110  */
        /* JADX WARN: Code duplicated, block: B:41:0x0114  */
        /* JADX WARN: Code duplicated, block: B:42:0x0128  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objC;
            o13.p pVar;
            q92.v vVar;
            y0<d0> y0Var;
            d0 aVar;
            Object objD;
            y0<d0> y0Var2;
            q92.a0 a0Var;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176484c;
            final int i15 = 2;
            final int i16 = 1;
            final r rVar = r.this;
            final q92.x xVar = this.f176486e;
            if (i14 == 0) {
                o13.r.b(obj);
                q92.f fVar = rVar.f176466a;
                s92.l lVar = rVar.f176469d;
                this.f176484c = 1;
                objC = fVar.c(xVar, lVar, this);
                if (objC != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var2 = this.f176483b;
                q92.v vVar2 = this.f176482a;
                o13.r.b(obj);
                vVar = vVar2;
                objD = obj;
            }
            a0Var = (q92.a0) objD;
            if (a0Var instanceof q92.a0.b) {
                rVar.f176471f.put(xVar, vVar);
                aVar = new d0.e(q92.c.c(vVar), (s92.g) ((q92.a0.b) a0Var).f143609a);
            } else {
                if (a0Var instanceof q92.a0.a) {
                    u0.r();
                    return null;
                }
                aVar = new d0.a(new v92.e.a(xVar, ((q92.a0.a) a0Var).f143608a), new e23.a() { // from class: v92.w
                    @Override // e23.a
                    public final Object invoke() {
                        int i17 = i16;
                        q92.x xVar2 = xVar;
                        r rVar2 = rVar;
                        switch (i17) {
                            case 0:
                                int i18 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                            case 1:
                                int i19 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                            default:
                                int i24 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            y0Var = y0Var2;
            y0Var.m(aVar);
            return Unit.INSTANCE;
            q92.a0 a0Var2 = (q92.a0) objC;
            if (a0Var2 instanceof q92.a0.b) {
                s92.c cVar = (s92.c) ((q92.a0.b) a0Var2).f143609a;
                int i17 = r.f176465l;
                rVar.getClass();
                q92.y.a aVar3 = q92.y.f143821b;
                String userOption = cVar.getUserOption();
                aVar3.getClass();
                q92.y yVarA = q92.y.a.a(userOption);
                q92.u.a aVar4 = q92.u.f143774b;
                String sourceType = cVar.getSourceType();
                aVar4.getClass();
                q92.u uVarA = q92.u.a.a(sourceType);
                q92.b.a aVar5 = q92.b.f143610b;
                String consentEnforcementState = cVar.getConsentEnforcementState();
                aVar5.getClass();
                q92.b bVarA = q92.b.a.a(consentEnforcementState);
                if (bVarA == null) {
                    bVarA = q92.b.NONE;
                }
                q92.b bVar = bVarA;
                q92.a.C2709a c2709a = q92.a.f143600b;
                String deleteStatus = cVar.getDeleteStatus();
                c2709a.getClass();
                q92.a aVarA = q92.a.C2709a.a(deleteStatus);
                if (aVarA == null) {
                    aVarA = q92.a.NOT_APPLICABLE;
                }
                q92.a aVar6 = aVarA;
                if (yVarA == null) {
                    pVar = new o13.p(null, new Exception("Unknown userOption value in the ConsentDTO"));
                } else if (uVarA == null) {
                    pVar = new o13.p(null, new Exception("Unknown sourceType value in the ConsentDTO"));
                } else {
                    pVar = new o13.p(new q92.v(this.f176486e, yVarA, uVarA, bVar, aVar6, new Date(), null, q92.c.b(cVar.getUpdateDate()), 64, null), null);
                }
                vVar = (q92.v) pVar.f128594a;
                Exception exc = (Exception) pVar.f128595b;
                y0Var = rVar.f176472g;
                if (vVar != null && exc == null) {
                    q92.f fVar2 = rVar.f176466a;
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    this.f176482a = vVar;
                    this.f176483b = y0Var;
                    this.f176484c = 2;
                    fVar2.getClass();
                    objD = fVar2.d(xVar.f143819a, locale, this);
                    if (objD != aVar2) {
                        y0Var2 = y0Var;
                        a0Var = (q92.a0) objD;
                        if (a0Var instanceof q92.a0.b) {
                            rVar.f176471f.put(xVar, vVar);
                            aVar = new d0.e(q92.c.c(vVar), (s92.g) ((q92.a0.b) a0Var).f143609a);
                        } else {
                            if (a0Var instanceof q92.a0.a) {
                                u0.r();
                                return null;
                            }
                            aVar = new d0.a(new v92.e.a(xVar, ((q92.a0.a) a0Var).f143608a), new e23.a() { // from class: v92.w
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i16;
                                    q92.x xVar2 = xVar;
                                    r rVar2 = rVar;
                                    switch (i18) {
                                        case 0:
                                            int i19 = r.f176465l;
                                            rVar2.E4(xVar2);
                                            break;
                                        case 1:
                                            int i110 = r.f176465l;
                                            rVar2.E4(xVar2);
                                            break;
                                        default:
                                            int i24 = r.f176465l;
                                            rVar2.E4(xVar2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        y0Var = y0Var2;
                    }
                    return aVar2;
                }
                if (exc == null) {
                    exc = new Exception("Convert consentStatus failed");
                }
                final int i18 = 0;
                aVar = new d0.a(new v92.e.a(xVar, exc), new e23.a() { // from class: v92.w
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i18;
                        q92.x xVar2 = xVar;
                        r rVar2 = rVar;
                        switch (i19) {
                            case 0:
                                int i110 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                            case 1:
                                int i111 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                            default:
                                int i24 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                y0Var.m(aVar);
            } else {
                if (!(a0Var2 instanceof q92.a0.a)) {
                    u0.r();
                    return null;
                }
                rVar.f176472g.m(new d0.a(new v92.e.a(xVar, ((q92.a0.a) a0Var2).f143608a), new e23.a() { // from class: v92.w
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i15;
                        q92.x xVar2 = xVar;
                        r rVar2 = rVar;
                        switch (i19) {
                            case 0:
                                int i110 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                            case 1:
                                int i111 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                            default:
                                int i24 = r.f176465l;
                                rVar2.E4(xVar2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$fetchDeleteDataConfirmationScreenText$1", f = "ConsentViewModel.kt", l = {260, 262}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f176487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y0 f176488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f176489c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s92.g f176491e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$fetchDeleteDataConfirmationScreenText$1$userEmailAddress$1", f = "ConsentViewModel.kt", l = {263}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f176492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f176493b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r rVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f176493b = rVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f176493b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f176492a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                p92.a aVar2 = this.f176493b.f176467b;
                this.f176492a = 1;
                String strA = aVar2.a();
                return strA == aVar ? aVar : strA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s92.g gVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f176491e = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new d(this.f176491e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            y0<d0> y0Var;
            d0 aVar;
            y0<d0> y0Var2;
            q92.a0 a0Var;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176489c;
            s92.g gVar = this.f176491e;
            r rVar = r.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    y0Var = (y0) this.f176487a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y0Var2 = this.f176488b;
                    a0Var = (q92.a0) this.f176487a;
                    o13.r.b(obj);
                }
                aVar = new d0.g((s92.g) ((q92.a0.b) a0Var).f143609a, gVar, (String) obj);
                y0Var = y0Var2;
                y0Var.m(aVar);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            y0<d0> y0Var3 = rVar.f176472g;
            q92.f fVar = rVar.f176466a;
            q92.w wVar = q92.w.DI_CONNECT_DATA_DELETION_CONFIRMATION;
            Locale locale = Locale.getDefault();
            locale.getClass();
            this.f176487a = y0Var3;
            this.f176489c = 1;
            fVar.getClass();
            Object objD = fVar.d(wVar.f143796a, locale, this);
            if (objD != aVar2) {
                y0Var = y0Var3;
                obj = objD;
            }
            return aVar2;
            q92.a0 a0Var2 = (q92.a0) obj;
            if (a0Var2 instanceof q92.a0.b) {
                o53.z zVar = rVar.f176468c.f143828c;
                a aVar3 = new a(rVar, null);
                this.f176487a = a0Var2;
                this.f176488b = y0Var;
                this.f176489c = 2;
                Object objE0 = ge1.b.e0(zVar, aVar3, this);
                if (objE0 != aVar2) {
                    y0Var2 = y0Var;
                    a0Var = a0Var2;
                    obj = objE0;
                    aVar = new d0.g((s92.g) ((q92.a0.b) a0Var).f143609a, gVar, (String) obj);
                    y0Var = y0Var2;
                }
                return aVar2;
            }
            if (!(a0Var2 instanceof q92.a0.a)) {
                u0.r();
                return null;
            }
            aVar = new d0.a(new v92.e.a(null, ((q92.a0.a) a0Var2).f143608a), new ug2.h(22, rVar, gVar));
            y0Var.m(aVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$fetchDeleteDataScreenText$1", f = "ConsentViewModel.kt", l = {236}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y0 f176494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f176495b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            y0 y0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176495b;
            if (i14 == 0) {
                o13.r.b(obj);
                r rVar = r.this;
                y0<d0> y0Var2 = rVar.f176472g;
                this.f176494a = y0Var2;
                this.f176495b = 1;
                obj = r.x4(rVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f176494a;
                o13.r.b(obj);
            }
            y0Var.m(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$grantConsentOnlyForStorageGranted$1", f = "ConsentViewModel.kt", l = {431}, m = "invokeSuspend")
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q92.x f176497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f176498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f176499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q92.y f176500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q92.x f176501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r f176502f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s92.g f176503g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q92.y yVar, q92.x xVar, r rVar, s92.g gVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f176500d = yVar;
            this.f176501e = xVar;
            this.f176502f = rVar;
            this.f176503g = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = new f(this.f176500d, this.f176501e, this.f176502f, this.f176503g, dVar);
            fVar.f176499c = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            q92.x xVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176498b;
            final s92.g gVar = this.f176503g;
            final int i15 = 1;
            final q92.x xVar2 = this.f176501e;
            final r rVar = this.f176502f;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f176499c;
                q92.y yVar = this.f176500d;
                if (yVar != null) {
                    q92.y yVar2 = q92.y.OPT_IN;
                    if (yVar == yVar2) {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureViewModel", "grantConsentOnlyForStorageGranted -> Data Storage granted, proceed with grant consent for " + xVar2);
                        int i16 = r.f176465l;
                        rVar.I4(xVar2, yVar2, gVar, null);
                    } else {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureViewModel", "grantConsentOnlyForStorageGranted -> Data Storage revoked, request for this consent first");
                        rVar.f176472g.m(d0.f.f176345a);
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConsentFeatureViewModel", "grantConsentOnlyForStorageGranted -> Fetch Data Storage consent first");
                    q92.x xVar3 = q92.x.DI_CONNECT_UPLOAD;
                    q92.f fVar = rVar.f176466a;
                    s92.l lVar = rVar.f176469d;
                    this.f176499c = b0Var;
                    this.f176497a = xVar3;
                    this.f176498b = 1;
                    obj = fVar.c(xVar3, lVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    xVar = xVar3;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = this.f176497a;
            o13.r.b(obj);
            q92.a0 a0Var = (q92.a0) obj;
            if (a0Var instanceof q92.a0.b) {
                q92.y.a aVar2 = q92.y.f143821b;
                String userOption = ((s92.c) ((q92.a0.b) a0Var).f143609a).getUserOption();
                aVar2.getClass();
                q92.y yVarA = q92.y.a.a(userOption);
                if (yVarA != null) {
                    r.A4(rVar, xVar, yVarA);
                    q92.y yVar3 = q92.y.OPT_IN;
                    if (yVarA == yVar3) {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureViewModel", "grantConsentOnlyForStorageGranted -> Data Storage granted, proceed with grant consent for " + xVar2);
                        rVar.I4(xVar2, yVar3, gVar, null);
                    } else {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Data Storage revoked, request for this consent first");
                        rVar.f176472g.m(d0.f.f176345a);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    v92.e.a aVar3 = new v92.e.a(xVar, new Exception("Unknown userOption value in the response"));
                    final int i17 = 0;
                    new d0.a(aVar3, new e23.a() { // from class: v92.y
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    rVar.H4(xVar2, gVar);
                                    break;
                                default:
                                    rVar.H4(xVar2, gVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            } else {
                if (!(a0Var instanceof q92.a0.a)) {
                    u0.r();
                    return null;
                }
                new d0.a(new v92.e.a(xVar, ((q92.a0.a) a0Var).f143608a), new e23.a() { // from class: v92.y
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                rVar.H4(xVar2, gVar);
                                break;
                            default:
                                rVar.H4(xVar2, gVar);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$updateConsent$1", f = "ConsentViewModel.kt", l = {353, 363, 383, 396}, m = "invokeSuspend")
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y0 f176504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f176505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f176506c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q92.x f176508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q92.y f176509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s92.g f176510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Boolean f176511h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q92.x xVar, q92.y yVar, s92.g gVar, Boolean bool, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f176508e = xVar;
            this.f176509f = yVar;
            this.f176510g = gVar;
            this.f176511h = bool;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = r.this.new g(this.f176508e, this.f176509f, this.f176510g, this.f176511h, dVar);
            gVar.f176506c = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
        
            if (r0 == r6) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
        
            if (r0 == r6) goto L63;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            y0<d0> y0Var;
            Object objE;
            d0 aVar;
            Object objX4;
            Boolean bool;
            y0<d0> y0Var2;
            Object objF;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176505b;
            r rVar = r.this;
            q92.y yVar = this.f176509f;
            q92.x xVar = this.f176508e;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f176506c;
                y0Var = rVar.f176472g;
                q92.f fVar = rVar.f176466a;
                s92.l lVar = rVar.f176469d;
                this.f176506c = b0Var;
                this.f176504a = y0Var;
                this.f176505b = 1;
                objE = fVar.e(this.f176508e, this.f176509f, this.f176510g, lVar, this);
                if (objE != aVar2) {
                }
                return aVar2;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    y0<d0> y0Var3 = this.f176504a;
                    bool = (Boolean) this.f176506c;
                    o13.r.b(obj);
                    y0Var = y0Var3;
                    objF = obj;
                    q92.a0 a0Var = (q92.a0) objF;
                    if (a0Var instanceof q92.a0.b) {
                        aVar = new d0.b(xVar, yVar, bool.booleanValue() ? f0.ENABLED : f0.DISABLED);
                    } else {
                        if (!(a0Var instanceof q92.a0.a)) {
                            u0.r();
                            return null;
                        }
                        aVar = new d0.b(xVar, yVar, f0.UPDATE_FAILED);
                    }
                    y0Var.m(aVar);
                    return Unit.INSTANCE;
                }
                if (i14 == 3) {
                    y0Var2 = (y0) this.f176506c;
                    o13.r.b(obj);
                    aVar = new d0.b(xVar, yVar, f0.NO_UPDATE);
                    y0Var = y0Var2;
                    y0Var.m(aVar);
                    return Unit.INSTANCE;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0<d0> y0Var4 = (y0) this.f176506c;
                o13.r.b(obj);
                y0Var = y0Var4;
                objX4 = obj;
                aVar = (d0) objX4;
                y0Var.m(aVar);
                return Unit.INSTANCE;
            }
            y0<d0> y0Var5 = this.f176504a;
            o13.r.b(obj);
            y0Var = y0Var5;
            objE = obj;
            q92.a0 a0Var2 = (q92.a0) objE;
            if (!(a0Var2 instanceof q92.a0.b)) {
                if (!(a0Var2 instanceof q92.a0.a)) {
                    u0.r();
                    return null;
                }
                if (xVar != q92.x.DI_CONNECT_UPLOAD || yVar != q92.y.OPT_OUT || !(((q92.a0.a) a0Var2).f143608a instanceof GdprRevokeException406)) {
                    aVar = new d0.a(new v92.e.b(xVar, ((q92.a0.a) a0Var2).f143608a), new p50.d(r.this, this.f176508e, this.f176509f, this.f176510g, this.f176511h, 15));
                } else {
                    if (rVar.f176469d != null) {
                        rVar.F4(this.f176510g);
                        return Unit.INSTANCE;
                    }
                    this.f176506c = y0Var;
                    this.f176504a = null;
                    this.f176505b = 4;
                    objX4 = r.x4(rVar, this);
                }
                y0Var.m(aVar);
                return Unit.INSTANCE;
            }
            r.A4(rVar, xVar, yVar);
            q92.f fVar2 = rVar.f176466a;
            bool = yVar == q92.y.OPT_OUT ? Boolean.FALSE : this.f176511h;
            if (xVar == q92.x.DI_CONNECT_UPLOAD && rVar.f176469d == null) {
                if (bool != null) {
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConsentFeatureViewModel", "Update device upload consent, alongside " + xVar + ", new value = " + bool);
                    boolean zBooleanValue = bool.booleanValue();
                    this.f176506c = bool;
                    this.f176504a = y0Var;
                    this.f176505b = 2;
                    objF = fVar2.f(zBooleanValue, true, this);
                } else {
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConsentFeatureViewModel", "Fetch device upload consent");
                    this.f176506c = y0Var;
                    this.f176504a = null;
                    this.f176505b = 3;
                    if (ge1.b.e0(fVar2.f143631d.f143828c, new q92.n(fVar2, null), this) != aVar2) {
                        y0Var2 = y0Var;
                        aVar = new d0.b(xVar, yVar, f0.NO_UPDATE);
                        y0Var = y0Var2;
                    }
                }
                return aVar2;
            }
            aVar = new d0.b(xVar, yVar, f0.NO_UPDATE);
            y0Var.m(aVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel$updateDeviceUploadConsent$1", f = "ConsentViewModel.kt", l = {520, 529, 536, 556}, m = "invokeSuspend")
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q92.x f176512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y0 f176513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f176514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f176515d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f176517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q92.y f176518g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z14, q92.y yVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f176517f = z14;
            this.f176518g = yVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = r.this.new h(this.f176517f, this.f176518g, dVar);
            hVar.f176515d = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:44:0x0104  */
        /* JADX WARN: Code duplicated, block: B:46:0x0108  */
        /* JADX WARN: Code duplicated, block: B:47:0x011d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            y0<d0> y0Var;
            y0<d0> y0Var2;
            q92.x xVar;
            d0 d0Var;
            q92.a0 a0Var;
            d0.a aVar;
            q92.y yVarA;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176514c;
            boolean z14 = this.f176517f;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f176515d;
                y0Var = rVar.f176472g;
                if (z14) {
                    q92.y yVar = this.f176518g;
                    if (yVar == null) {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Fetch Data Storage consent first");
                        xVar = q92.x.DI_CONNECT_UPLOAD;
                        q92.f fVar = rVar.f176466a;
                        s92.l lVar = rVar.f176469d;
                        this.f176515d = b0Var;
                        this.f176512a = xVar;
                        this.f176513b = y0Var;
                        this.f176514c = 2;
                        obj = fVar.c(xVar, lVar, this);
                        if (obj != aVar2) {
                            a0Var = (q92.a0) obj;
                            if (a0Var instanceof q92.a0.b) {
                                q92.y.a aVar3 = q92.y.f143821b;
                                String userOption = ((s92.c) ((q92.a0.b) a0Var).f143609a).getUserOption();
                                aVar3.getClass();
                                yVarA = q92.y.a.a(userOption);
                                if (yVarA != null) {
                                    r.A4(rVar, xVar, yVarA);
                                    if (yVarA == q92.y.OPT_IN) {
                                        p92.y.f136664a.getClass();
                                        p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Data Storage granted, proceed with enabling Device Upload");
                                        this.f176515d = y0Var;
                                        this.f176512a = null;
                                        this.f176513b = null;
                                        this.f176514c = 3;
                                        obj = r.B4(rVar, z14, this);
                                        if (obj != aVar2) {
                                            y0Var2 = y0Var;
                                            d0Var = (d0) obj;
                                            y0Var = y0Var2;
                                        }
                                    } else {
                                        p92.y.f136664a.getClass();
                                        p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Data Storage revoked, request for this consent first");
                                        d0Var = d0.j.f176351a;
                                    }
                                } else {
                                    aVar = new d0.a(new v92.e.a(xVar, new Exception("Unknown userOption value in the response")), new q(rVar, z14, 1));
                                }
                            } else {
                                if (a0Var instanceof q92.a0.a) {
                                    u0.r();
                                    return null;
                                }
                                aVar = new d0.a(new v92.e.a(xVar, ((q92.a0.a) a0Var).f143608a), new q(rVar, z14, 2));
                            }
                            d0Var = aVar;
                        }
                    } else if (yVar == q92.y.OPT_IN) {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Data Storage granted, proceed with enabling Device Upload");
                        this.f176515d = y0Var;
                        this.f176514c = 1;
                        obj = r.B4(rVar, z14, this);
                        if (obj != aVar2) {
                            y0Var2 = y0Var;
                            d0Var = (d0) obj;
                            y0Var = y0Var2;
                        }
                    } else {
                        p92.y.f136664a.getClass();
                        p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Data Storage revoked, request for this consent first");
                        d0Var = d0.j.f176351a;
                    }
                } else {
                    this.f176515d = y0Var;
                    this.f176514c = 4;
                    obj = r.B4(rVar, z14, this);
                    if (obj != aVar2) {
                        y0Var2 = y0Var;
                        d0Var = (d0) obj;
                        y0Var = y0Var2;
                    }
                }
                return aVar2;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    y0Var = this.f176513b;
                    xVar = this.f176512a;
                    o13.r.b(obj);
                    a0Var = (q92.a0) obj;
                    if (a0Var instanceof q92.a0.b) {
                        q92.y.a aVar4 = q92.y.f143821b;
                        String userOption2 = ((s92.c) ((q92.a0.b) a0Var).f143609a).getUserOption();
                        aVar4.getClass();
                        yVarA = q92.y.a.a(userOption2);
                        if (yVarA != null) {
                            r.A4(rVar, xVar, yVarA);
                            if (yVarA == q92.y.OPT_IN) {
                                p92.y.f136664a.getClass();
                                p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Data Storage granted, proceed with enabling Device Upload");
                                this.f176515d = y0Var;
                                this.f176512a = null;
                                this.f176513b = null;
                                this.f176514c = 3;
                                obj = r.B4(rVar, z14, this);
                                if (obj != aVar2) {
                                    y0Var2 = y0Var;
                                }
                                return aVar2;
                            }
                            p92.y.f136664a.getClass();
                            p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent -> Data Storage revoked, request for this consent first");
                            d0Var = d0.j.f176351a;
                        } else {
                            aVar = new d0.a(new v92.e.a(xVar, new Exception("Unknown userOption value in the response")), new q(rVar, z14, 1));
                        }
                    } else {
                        if (a0Var instanceof q92.a0.a) {
                            u0.r();
                            return null;
                        }
                        aVar = new d0.a(new v92.e.a(xVar, ((q92.a0.a) a0Var).f143608a), new q(rVar, z14, 2));
                    }
                    d0Var = aVar;
                } else if (i14 == 3) {
                    y0Var2 = (y0) this.f176515d;
                    o13.r.b(obj);
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y0Var2 = (y0) this.f176515d;
                    o13.r.b(obj);
                    d0Var = (d0) obj;
                    y0Var = y0Var2;
                }
                d0Var = (d0) obj;
                y0Var = y0Var2;
            } else {
                y0Var2 = (y0) this.f176515d;
                o13.r.b(obj);
                d0Var = (d0) obj;
                y0Var = y0Var2;
            }
            y0Var.m(d0Var);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public r(q92.f fVar, p92.a aVar, q92.z zVar) {
        fVar.getClass();
        aVar.getClass();
        zVar.getClass();
        this.f176466a = fVar;
        this.f176467b = aVar;
        this.f176468c = zVar;
        this.f176471f = new LinkedHashMap();
        y0<d0> y0Var = new y0<>();
        this.f176472g = y0Var;
        y0<v92.a> y0Var2 = new y0<>();
        this.f176473h = y0Var2;
        this.f176474i = new y0<>();
        this.f176475j = t1.a(y0Var, new uu.o(25));
        this.f176476k = t1.a(y0Var2, new uu.o(26));
    }

    public static final void A4(r rVar, q92.x xVar, q92.y yVar) {
        LinkedHashMap linkedHashMap = rVar.f176471f;
        q92.v vVar = (q92.v) linkedHashMap.get(xVar);
        if (vVar != null) {
            q92.x xVar2 = vVar.f143783a;
            q92.u uVar = vVar.f143785c;
            q92.b bVar = vVar.f143786d;
            q92.a aVar = vVar.f143787e;
            Date date = vVar.f143788f;
            Map<String, String> map = vVar.f143789g;
            Date date2 = vVar.f143790h;
            xVar2.getClass();
            yVar.getClass();
            uVar.getClass();
            bVar.getClass();
            aVar.getClass();
            map.getClass();
            linkedHashMap.put(xVar, new q92.v(xVar2, yVar, uVar, bVar, aVar, date, map, date2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object B4(r rVar, boolean z14, v13.c cVar) {
        a0 a0Var;
        rVar.getClass();
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f176306e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f176306e = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(rVar, cVar);
            }
        } else {
            a0Var = new a0(rVar, cVar);
        }
        Object objF = a0Var.f176304c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f176306e;
        if (i15 == 0) {
            o13.r.b(objF);
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUpload(enabled[" + z14 + "])");
            q92.f fVar = rVar.f176466a;
            a0Var.f176302a = rVar;
            a0Var.f176303b = z14;
            a0Var.f176306e = 1;
            objF = fVar.f(z14, false, a0Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = a0Var.f176303b;
            rVar = a0Var.f176302a;
            o13.r.b(objF);
        }
        q92.a0 a0Var2 = (q92.a0) objF;
        if (a0Var2 instanceof q92.a0.b) {
            return new d0.c(z14);
        }
        if (a0Var2 instanceof q92.a0.a) {
            return new d0.a(new v92.e.d(((q92.a0.a) a0Var2).f143608a), new q(rVar, z14, 0));
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(r rVar, v13.c cVar) {
        s sVar;
        rVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f176522d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f176522d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(rVar, cVar);
            }
        } else {
            sVar = new s(rVar, cVar);
        }
        Object objD = sVar.f176520b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f176522d;
        if (i15 == 0) {
            o13.r.b(objD);
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentFeatureViewModel", "callDeleteDataScreenText()");
            q92.f fVar = rVar.f176466a;
            q92.w wVar = q92.w.DI_CONNECT_DATA_DELETION;
            Locale locale = Locale.getDefault();
            locale.getClass();
            sVar.f176519a = rVar;
            sVar.f176522d = 1;
            fVar.getClass();
            objD = fVar.d(wVar.f143796a, locale, sVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rVar = sVar.f176519a;
            o13.r.b(objD);
        }
        q92.a0 a0Var = (q92.a0) objD;
        if (a0Var instanceof q92.a0.b) {
            return new d0.h((s92.g) ((q92.a0.b) a0Var).f143609a);
        }
        if (a0Var instanceof q92.a0.a) {
            return new d0.a(new v92.e.a(null, ((q92.a0.a) a0Var).f143608a), new p(rVar, 0));
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(r rVar, String str, v13.c cVar) throws Throwable {
        t tVar;
        rVar.getClass();
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f176527e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f176527e = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(rVar, cVar);
            }
        } else {
            tVar = new t(rVar, cVar);
        }
        Object objE0 = tVar.f176525c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f176527e;
        if (i15 == 0) {
            o13.r.b(objE0);
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentFeatureViewModel", "checkPassword()");
            q92.f fVar = rVar.f176466a;
            tVar.f176523a = rVar;
            tVar.f176524b = str;
            tVar.f176527e = 1;
            objE0 = ge1.b.e0(fVar.f143631d.f143828c, new q92.g(fVar, str, null), tVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = tVar.f176524b;
            rVar = tVar.f176523a;
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            String str2 = (String) ((q92.a0.b) a0Var).f143609a;
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentFeatureViewModel", str2);
            return d53.u.q(str2, BooleanUtils.FALSE, true) ? d0.m.f176354a : new d0.d(str2);
        }
        if (a0Var instanceof q92.a0.a) {
            return new d0.a(new v92.e.C3293e(((q92.a0.a) a0Var).f143608a), new ug2.h(21, rVar, str));
        }
        u0.r();
        return null;
    }

    public static final void z4(r rVar, q92.x xVar, s92.g gVar, String str) {
        rVar.getClass();
        String str2 = "revokeConsent(" + xVar + " , " + q92.y.OPT_OUT + " , " + gVar + ")";
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", str2);
        rVar.f176472g.m(d0.k.f176352a);
        ge1.b.T(v1.a(rVar), null, null, new z(rVar, xVar, gVar, str, null), 3);
    }

    public final void C4(q92.x xVar, boolean z14, s92.g gVar) {
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "confirmOptOut(" + xVar + " , " + gVar + ")");
        this.f176473h.m(new v92.a.b(xVar, z14, new s0(this, 14, xVar, gVar)));
    }

    public final void D4(q92.x xVar, boolean z14) {
        xVar.getClass();
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "fetchConsentText(" + xVar + ")");
        this.f176472g.m(d0.k.f176352a);
        ge1.b.T(v1.a(this), null, null, new b(xVar, z14, null), 3);
    }

    public final void E4(q92.x xVar) {
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "fetchConsentWithText(" + xVar + ")");
        this.f176472g.m(d0.k.f176352a);
        ge1.b.T(v1.a(this), null, null, new c(xVar, null), 3);
    }

    public final void F4(s92.g gVar) {
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "fetchDeleteDataConfirmationScreenText()");
        this.f176472g.m(d0.k.f176352a);
        ge1.b.T(v1.a(this), null, null, new d(gVar, null), 3);
    }

    public final void G4() {
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "fetchDeleteDataScreenText()");
        this.f176472g.m(d0.k.f176352a);
        ge1.b.T(v1.a(this), null, null, new e(null), 3);
    }

    public final void H4(q92.x xVar, s92.g gVar) {
        xVar.getClass();
        gVar.getClass();
        q92.v vVar = (q92.v) this.f176471f.get(q92.x.DI_CONNECT_UPLOAD);
        q92.y yVar = vVar != null ? vVar.f143784b : null;
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "grantConsentOnlyForStorageGranted(consentTextDTO[" + gVar + "] , dataStorageUserOption[" + yVar + ")]");
        ge1.b.T(v1.a(this), null, null, new f(yVar, xVar, this, gVar, null), 3);
    }

    public final void I4(q92.x xVar, q92.y yVar, s92.g gVar, Boolean bool) {
        xVar.getClass();
        yVar.getClass();
        gVar.getClass();
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "updateConsent(" + xVar + " , " + yVar + " , " + gVar + " , deviceUploadEnabled[" + bool + "])");
        this.f176472g.m(d0.k.f176352a);
        ge1.b.T(v1.a(this), null, null, new g(xVar, yVar, gVar, bool, null), 3);
    }

    public final void J4(boolean z14) {
        q92.v vVar = (q92.v) this.f176471f.get(q92.x.DI_CONNECT_UPLOAD);
        q92.y yVar = vVar != null ? vVar.f143784b : null;
        p92.y.f136664a.getClass();
        p92.y.a.a("ConsentFeatureViewModel", "updateDeviceUploadConsent(enabled[" + z14 + "] , dataStorageUserOption[" + yVar + ")]");
        ge1.b.T(v1.a(this), null, null, new h(z14, yVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

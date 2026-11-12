package te2;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ltc2/d;", "<anonymous>", "(Lo53/b0;)Ltc2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.CustomerAgeManager$fetchCountryAgeRestrictions$2", f = "CustomerAgeManager.kt", l = {169, 170, 177, SyslogConstants.LOG_LOCAL7, 185}, m = "invokeSuspend")
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super tc2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f164172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f164173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f164174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f164175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f164177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f164178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f164179h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, k0 k0Var, Context context, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f164177f = str;
        this.f164178g = k0Var;
        this.f164179h = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m0(this.f164177f, this.f164178g, this.f164179h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super tc2.d> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d9 A[PHI: r2
      0x00d9: PHI (r2v10 java.lang.Object) = (r2v9 java.lang.Object), (r2v22 java.lang.Object) binds: [B:26:0x00d6, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:53:0x013f A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:54:0x0140  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        if (r2 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        String upperCase;
        Object objA;
        Object objJ;
        String str;
        String str2;
        Object objE0;
        wc2.a aVar;
        Exception exc;
        Integer num;
        Object objA2;
        wc2.a aVar2;
        Context context;
        Object objE1;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164176e;
        k0 k0Var = this.f164178g;
        String str3 = this.f164177f;
        if (i14 == 0) {
            o13.r.b(obj);
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = str3.toUpperCase(locale);
            upperCase.getClass();
            if (!new d53.k("^[A-Z]{2}$").d(upperCase)) {
                vb.h.s(am.j.m("Invalid country code [", str3, "]. Must be exactly 2 characters A-Z/a-z."));
                return null;
            }
            re2.b.f152215a.I("CustomerAgeMgr.fetchCountryAgeRestrictions");
            this.f164172a = upperCase;
            this.f164176e = 1;
            objA = k0.a(k0Var, this);
            if (objA != aVar3) {
            }
            return aVar3;
        }
        if (i14 == 1) {
            upperCase = (String) this.f164172a;
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i14 == 2) {
                String str4 = (String) this.f164173b;
                String str5 = (String) this.f164172a;
                o13.r.b(obj);
                str2 = str4;
                str = str5;
                objJ = obj;
                objJ.getClass();
                ve2.e eVar = ((ve2.d) objJ).f177690a;
                re2.b.f152215a.getClass();
                rc2.p pVar = new rc2.p(this.f164179h, eVar, str, str2, re2.b.m().d());
                this.f164172a = null;
                this.f164173b = null;
                this.f164176e = 3;
                x53.c cVar = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new rc2.q(pVar, null), this);
                if (objE0 != aVar3) {
                    aVar = (wc2.a) objE0;
                    if (aVar instanceof wc2.a.b) {
                        return (tc2.d) ((wc2.a.b) aVar).f184316a;
                    }
                    if (!(aVar instanceof wc2.a.C3415a)) {
                        lc.u0.r();
                        return null;
                    }
                    wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar;
                    exc = c3415a.f184312a;
                    num = c3415a.f184313b;
                    if (num != null) {
                        throw exc;
                    }
                    throw exc;
                }
                return aVar3;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                objE0 = obj;
                aVar = (wc2.a) objE0;
                if (aVar instanceof wc2.a.b) {
                    return (tc2.d) ((wc2.a.b) aVar).f184316a;
                }
                if (!(aVar instanceof wc2.a.C3415a)) {
                    lc.u0.r();
                    return null;
                }
                wc2.a.C3415a c3415a2 = (wc2.a.C3415a) aVar;
                exc = c3415a2.f184312a;
                num = c3415a2.f184313b;
                if (num != null || num.intValue() != 401) {
                    throw exc;
                }
                re2.b bVar = re2.b.f152215a;
                this.f164172a = aVar;
                this.f164173b = k0Var;
                Context context2 = this.f164179h;
                this.f164174c = context2;
                this.f164175d = str3;
                this.f164176e = 4;
                objA2 = re2.b.A(bVar, this);
                if (objA2 != aVar3) {
                    aVar2 = aVar;
                    context = context2;
                    if (((sc2.o) objA2) != null) {
                        this.f164172a = aVar2;
                        this.f164173b = null;
                        this.f164174c = null;
                        this.f164175d = null;
                        this.f164176e = 5;
                        k0Var.getClass();
                        x53.c cVar2 = o53.s0.f129406a;
                        objE1 = ge1.b.e0(x53.b.f189152a, new m0(str3, k0Var, context, null), this);
                    }
                    r1.q2.u("refresh IT2 credentials");
                    return null;
                }
                return aVar3;
            }
            if (i14 == 4) {
                str3 = this.f164175d;
                context = this.f164174c;
                k0Var = (k0) this.f164173b;
                wc2.a aVar4 = (wc2.a) this.f164172a;
                o13.r.b(obj);
                aVar2 = aVar4;
                objA2 = obj;
                if (((sc2.o) objA2) != null) {
                    this.f164172a = aVar2;
                    this.f164173b = null;
                    this.f164174c = null;
                    this.f164175d = null;
                    this.f164176e = 5;
                    k0Var.getClass();
                    x53.c cVar3 = o53.s0.f129406a;
                    objE1 = ge1.b.e0(x53.b.f189152a, new m0(str3, k0Var, context, null), this);
                }
                r1.q2.u("refresh IT2 credentials");
                return null;
            }
            if (i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE1 = obj;
        }
        tc2.d dVar = (tc2.d) objE1;
        if (dVar != null) {
            return dVar;
        }
        r1.q2.u("refresh IT2 credentials");
        return null;
        String str6 = (String) objA;
        re2.b bVar2 = re2.b.f152215a;
        this.f164172a = upperCase;
        this.f164173b = str6;
        this.f164176e = 2;
        bVar2.getClass();
        objJ = re2.b.j(this);
        if (objJ != aVar3) {
            str = upperCase;
            str2 = str6;
            objJ.getClass();
            ve2.e eVar2 = ((ve2.d) objJ).f177690a;
            re2.b.f152215a.getClass();
            rc2.p pVar2 = new rc2.p(this.f164179h, eVar2, str, str2, re2.b.m().d());
            this.f164172a = null;
            this.f164173b = null;
            this.f164176e = 3;
            x53.c cVar4 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.q(pVar2, null), this);
            if (objE0 != aVar3) {
                aVar = (wc2.a) objE0;
                if (aVar instanceof wc2.a.b) {
                    return (tc2.d) ((wc2.a.b) aVar).f184316a;
                }
                if (!(aVar instanceof wc2.a.C3415a)) {
                    lc.u0.r();
                    return null;
                }
                wc2.a.C3415a c3415a3 = (wc2.a.C3415a) aVar;
                exc = c3415a3.f184312a;
                num = c3415a3.f184313b;
                if (num != null) {
                    throw exc;
                }
                throw exc;
            }
        }
        return aVar3;
    }
}

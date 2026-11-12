package q92;

import com.garmin.android.consent.network.GdprRevokeException406;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$revokeConsentDeleteData$2", f = "ConsentRepository.kt", l = {153}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<b0, t13.d<? super a0<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f143723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f143724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.g f143725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f143726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s92.l f143727g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$revokeConsentDeleteData$2$1", f = "ConsentRepository.kt", l = {ModuleDescriptor.MODULE_VERSION, 157, TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f143729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f143730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s92.g f143731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f143732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s92.l f143733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b0 f143734g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, f fVar, s92.g gVar, String str, s92.l lVar, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143729b = xVar;
            this.f143730c = fVar;
            this.f143731d = gVar;
            this.f143732e = str;
            this.f143733f = lVar;
            this.f143734g = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143729b, this.f143730c, this.f143731d, this.f143732e, this.f143733f, this.f143734g, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:36:0x0122  */
        /* JADX WARN: Code duplicated, block: B:37:0x0128  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
        
            if (((z10.g0) r0).h(r11, r12) == r6) goto L31;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:23:0x0071, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:28:0x00c5, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00f4, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objB;
            c83.a0 a0Var;
            Response response;
            String str;
            Exception iOException;
            q92.a aVarA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143728a;
            s92.g gVar = this.f143731d;
            s92.l lVar = this.f143733f;
            x xVar = this.f143729b;
            if (i14 == 0) {
                o13.r.b(obj);
                p92.o.f136619a.getClass();
                p92.o.l();
                this.f143728a = 1;
                if (Unit.INSTANCE != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                objB = obj;
                a0Var = (c83.a0) objB;
                response = a0Var.f25745a;
                if (response.isSuccessful()) {
                    str = "Error updating consent " + xVar + " code[" + response.code() + "] " + response.message();
                    if (response.code() == 406) {
                        iOException = new GdprRevokeException406(str);
                    } else {
                        iOException = new IOException(str);
                    }
                    p92.y.f136664a.getClass();
                    p92.y.a.d("ConsentRepository", iOException);
                    return new a0.a(iOException);
                }
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentRepository", "revokeConsentWithToken(" + xVar + ") successfully consentText[" + gVar + "]");
                p92.o.f136619a.getClass();
                p92.o.m().a(xVar, u.CUSTOMER, lVar);
                p92.o.m().f(xVar, y.OPT_OUT, lVar);
                p92.y.a.a("ConsentRepository", "Updated cache with CUSTOMER source type and opt-out user option automatically");
                q92.a.C2709a c2709a = q92.a.f143600b;
                s92.i iVar = (s92.i) a0Var.f25746b;
                String deleteStatus = iVar != null ? iVar.getDeleteStatus() : null;
                c2709a.getClass();
                aVarA = q92.a.C2709a.a(deleteStatus);
                if (aVarA != null) {
                    p92.o.m().i(xVar, aVarA, lVar);
                    p92.y.a.a("ConsentRepository", "Updated cache with delete status " + aVarA);
                }
                p92.a aVarL = p92.o.l();
                this.f143728a = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return new a0.b(Unit.INSTANCE);
            this.f143728a = 2;
            f.a aVar2 = f.f143627e;
            f fVar = this.f143730c;
            fVar.getClass();
            s92.d dVarA = f.a(gVar, xVar.f143819a, true, lVar);
            r92.a aVar3 = fVar.f143628a;
            String str2 = xVar.f143819a;
            String str3 = this.f143732e;
            objB = lVar == null ? aVar3.b(str3, str2, true, dVarA, this) : aVar3.k(str3, str2, true, dVarA, this);
            if (objB != aVar) {
                a0Var = (c83.a0) objB;
                response = a0Var.f25745a;
                if (response.isSuccessful()) {
                    str = "Error updating consent " + xVar + " code[" + response.code() + "] " + response.message();
                    if (response.code() == 406) {
                        iOException = new GdprRevokeException406(str);
                    } else {
                        iOException = new IOException(str);
                    }
                    p92.y.f136664a.getClass();
                    p92.y.a.d("ConsentRepository", iOException);
                    return new a0.a(iOException);
                }
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentRepository", "revokeConsentWithToken(" + xVar + ") successfully consentText[" + gVar + "]");
                p92.o.f136619a.getClass();
                p92.o.m().a(xVar, u.CUSTOMER, lVar);
                p92.o.m().f(xVar, y.OPT_OUT, lVar);
                p92.y.a.a("ConsentRepository", "Updated cache with CUSTOMER source type and opt-out user option automatically");
                q92.a.C2709a c2709a2 = q92.a.f143600b;
                s92.i iVar2 = (s92.i) a0Var.f25746b;
                if (iVar2 != null) {
                }
                c2709a2.getClass();
                aVarA = q92.a.C2709a.a(deleteStatus);
                if (aVarA != null) {
                    p92.o.m().i(xVar, aVarA, lVar);
                    p92.y.a.a("ConsentRepository", "Updated cache with delete status " + aVarA);
                }
                p92.a aVarL2 = p92.o.l();
                this.f143728a = 3;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar, f fVar, s92.g gVar, String str, s92.l lVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f143723c = xVar;
        this.f143724d = fVar;
        this.f143725e = gVar;
        this.f143726f = str;
        this.f143727g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f143723c, this.f143724d, this.f143725e, this.f143726f, this.f143727g, dVar);
        qVar.f143722b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends Unit>> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143721a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143723c, this.f143724d, this.f143725e, this.f143726f, this.f143727g, (b0) this.f143722b, null);
        String str = "Error updating consent " + this.f143723c;
        this.f143721a = 1;
        Object objA = u92.b.a(aVar2, str, this);
        return objA == aVar ? aVar : objA;
    }
}

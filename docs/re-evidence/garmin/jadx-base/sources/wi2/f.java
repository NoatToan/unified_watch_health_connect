package wi2;

import ch.qos.logback.core.net.SyslogConstants;
import d53.w;
import i3.e5;
import lc.u0;
import o53.a0;
import o53.b0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalViewModel$childRegistration$1", f = "CMCPortalViewModel.kt", l = {157, SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f185659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f185660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f185659b = eVar;
        this.f185660c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f185659b, this.f185660c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[PHI: r14
      0x0094: PHI (r14v19 java.lang.String) = (r14v13 java.lang.String), (r14v17 java.lang.String), (r14v13 java.lang.String) binds: [B:25:0x0092, B:44:0x00cd, B:36:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        if (r14.h(r1, r13) == r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ri2.b bVar;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185658a;
        String str2 = this.f185660c;
        e eVar = this.f185659b;
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
            eVar.z4();
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        vi2.b bVar2 = eVar.f185642c;
        qi2.c cVar = eVar.f185640a;
        this.f185658a = 1;
        bVar2.getClass();
        x53.c cVar2 = s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a.plus(new a0("ChildRegistrationUseCase")), new vi2.a(cVar, str2, null), this);
        if (obj != aVar) {
        }
        return aVar;
        ui2.f fVar = (ui2.f) obj;
        if (fVar instanceof ui2.f.b) {
            try {
                si2.a aVar2 = eVar.f185644e;
                String str3 = ((ri2.a) ((ui2.f.b) fVar).f171440a).f152946b;
                aVar2.getClass();
                n63.o oVar = aVar2.f159438a;
                oVar.getClass();
                bVar = (ri2.b) oVar.c(ri2.b.INSTANCE.serializer(), str3);
            } catch (Exception e4) {
                eVar.f185651l.error("childRegistration: registration successful but deserialization failed\n".concat(((ri2.a) ((ui2.f.b) fVar).f171440a).f152946b), e4);
                bVar = null;
            }
            long j8 = bVar != null ? bVar.f152947a : -1L;
            String strG = "";
            if (bVar != null) {
                String str4 = bVar.f152948b;
                if (str4 == null) {
                    str4 = "";
                }
                String string = w.i0(str4).toString();
                String str5 = bVar.f152949c;
                if (str5 == null) {
                    str5 = "";
                }
                String string2 = w.i0(str5).toString();
                if (w.J(string) && w.J(string2)) {
                    str = strG;
                } else if (w.J(string2)) {
                    str = string;
                } else if (w.J(string)) {
                    str = string2;
                } else {
                    strG = e5.g(string, StringUtils.SPACE, string2);
                    str = strG;
                }
            } else {
                str = strG;
            }
            ti2.b.C3087b c3087b = new ti2.b.C3087b(this.f185660c, j8, str, bVar != null ? bVar.f152950d : null);
            int i15 = e.f185639m;
            eVar.A4(c3087b);
        } else {
            if (!(fVar instanceof ui2.f.a)) {
                u0.r();
                return null;
            }
            q53.b bVar3 = eVar.f185647h;
            ti2.c.a aVar3 = new ti2.c.a(str2);
            this.f185658a = 2;
        }
        eVar.z4();
        return Unit.INSTANCE;
    }
}

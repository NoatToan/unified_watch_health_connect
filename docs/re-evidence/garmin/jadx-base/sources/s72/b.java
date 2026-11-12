package s72;

import com.garmin.android.apps.ui.catalog.library.help.HelpActivity;
import e23.p;
import lc.m0;
import lc.v;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import r53.j;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.ui.catalog.library.help.HelpActivity$HelpContent$2$1$1$1", f = "HelpActivity.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f157855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f157856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h82.c f157857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<String> f157858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<String> f157859e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h82.c f157860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<String> f157861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<String> f157862c;

        public a(h82.c cVar, p1<String> p1Var, p1<String> p1Var2) {
            this.f157860a = cVar;
            this.f157861b = p1Var;
            this.f157862c = p1Var2;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            String str = ((v) obj).f111882b.f111773b.f144347f;
            h82.c cVar = this.f157860a;
            String strD = cVar.d(str);
            if (strD == null) {
                strD = "";
            }
            HelpActivity.a aVar = HelpActivity.f49800a;
            this.f157861b.setValue(strD);
            this.f157862c.setValue(cVar.d(str));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m0 m0Var, h82.c cVar, p1<String> p1Var, p1<String> p1Var2, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f157856b = m0Var;
        this.f157857c = cVar;
        this.f157858d = p1Var;
        this.f157859e = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f157856b, this.f157857c, this.f157858d, this.f157859e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to s72.b for r6v1 'this'  t13.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r6.f157855a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            o13.r.b(r7)
            goto L37
        Ld:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L14:
            o13.r.b(r7)
            lc.m0 r7 = r6.f157856b
            qc.h r7 = r7.f111904b
            r53.e2 r7 = r7.A
            r53.a2 r7 = r53.s.c(r7)
            s72.b$a r1 = new s72.b$a
            p3.p1<java.lang.String> r3 = r6.f157858d
            p3.p1<java.lang.String> r4 = r6.f157859e
            h82.c r5 = r6.f157857c
            r1.<init>(r5, r3, r4)
            r6.f157855a = r2
            r53.d2<T> r7 = r7.f150526a
            java.lang.Object r7 = r7.collect(r1, r6)
            if (r7 != r0) goto L37
            return r0
        L37:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

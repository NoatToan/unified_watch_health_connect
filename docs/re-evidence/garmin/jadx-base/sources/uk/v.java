package uk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$handleSetFileFlags$1", f = "VivokiGfdiEmulator.kt", l = {296, 315}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f171763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.b0 f171764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f171765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f171766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f171767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f171768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f171769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f171770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f171771i;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"com/dsi/vivoki/antble/gfdi/VivokiGfdiEmulator$handleSetFileFlags$1$status$1$1", "Ltk/g;", "", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a implements tk.g<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t13.d f171772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f171773b;

        public a(t13.d dVar, v vVar) {
            this.f171772a = dVar;
            this.f171773b = vVar;
        }

        @Override // tk.g
        public final void a(Serializable serializable) {
            ((Boolean) serializable).getClass();
            Integer numValueOf = Integer.valueOf(this.f171773b.f171769g);
            int i14 = o13.q.f128596b;
            this.f171772a.resumeWith(numValueOf);
        }

        @Override // tk.g
        public final void b(String str) {
            Integer numValueOf = Integer.valueOf(this.f171773b.f171770h);
            int i14 = o13.q.f128596b;
            this.f171772a.resumeWith(numValueOf);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k kVar, int i14, int i15, int i16, int i17, t13.d dVar) {
        super(2, dVar);
        this.f171767e = kVar;
        this.f171768f = i14;
        this.f171769g = i15;
        this.f171770h = i16;
        this.f171771i = i17;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        dVar.getClass();
        v vVar = new v(this.f171767e, this.f171768f, this.f171769g, this.f171770h, this.f171771i, dVar);
        vVar.f171763a = (o53.b0) obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (r10.b(5008, r2, r6, r9) == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171766d;
        int i15 = this.f171768f;
        k kVar = this.f171767e;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    b0Var = this.f171764b;
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
            b0Var = this.f171763a;
            this.f171764b = b0Var;
            this.f171765c = this;
            this.f171766d = 1;
            t13.i iVar = new t13.i(u13.f.b(this));
            tk.k kVar2 = kVar.f171697j;
            kVar2.f165208b.a(new tk.a(kVar2, new a(iVar, this), i15));
            obj = iVar.a();
            if (obj != aVar) {
            }
            return aVar;
            int iIntValue = ((Number) obj).intValue();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(iIntValue);
            o72.t.d0(byteArrayOutputStream, i15);
            byteArrayOutputStream.write(this.f171771i);
            c0 c0Var = kVar.f171691d;
            h hVar = h.ACK;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            this.f171764b = b0Var;
            this.f171765c = byteArrayOutputStream;
            this.f171766d = 2;
        } catch (IOException e4) {
            kVar.f171699l.error("Failed to send set file flags response", (Throwable) e4);
        }
    }
}

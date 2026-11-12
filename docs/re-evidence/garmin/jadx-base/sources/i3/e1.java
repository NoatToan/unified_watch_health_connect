package i3;

import com.google.protobuf.DescriptorProtos;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {DescriptorProtos.Edition.EDITION_PROTO2_VALUE, 1007}, m = "invokeSuspend")
public final class e1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<g6.f, s1.n> f87935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f87936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f87938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.h f87939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s1.b<g6.f, s1.n> bVar, float f14, boolean z14, f1 f1Var, a2.h hVar, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f87935b = bVar;
        this.f87936c = f14;
        this.f87937d = z14;
        this.f87938e = f1Var;
        this.f87939f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e1(this.f87935b, this.f87936c, this.f87937d, this.f87938e, this.f87939f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r10.g(r1, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (l3.w0.a(r10, r4, r6, r9.f87939f, r9) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87934a;
        if (i14 == 0) {
            o13.r.b(obj);
            s1.b<g6.f, s1.n> bVar = this.f87935b;
            float f14 = ((g6.f) bVar.f155491e.getF182175a()).f75997a;
            float f15 = this.f87936c;
            if (!g6.f.c(f14, f15)) {
                if (this.f87937d) {
                    float f16 = ((g6.f) bVar.f155491e.getF182175a()).f75997a;
                    f1 f1Var = this.f87938e;
                    a2.h bVar2 = null;
                    if (g6.f.c(f16, f1Var.f88047b)) {
                        n4.c.f123541b.getClass();
                        bVar2 = new a2.l.b(0L, null);
                    } else if (g6.f.c(f16, f1Var.f88049d)) {
                        bVar2 = new a2.e();
                    } else if (g6.f.c(f16, f1Var.f88048c)) {
                        bVar2 = new a2.b();
                    }
                    this.f87934a = 2;
                } else {
                    g6.f fVarA = g6.f.a(f15);
                    this.f87934a = 1;
                }
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

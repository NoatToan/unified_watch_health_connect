package p008y1;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.b;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3, TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 1)
public final class t1 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f193653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(n1 n1Var, d<? super t1> dVar) {
        super(2, dVar);
        this.f193653c = n1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        t1 t1Var = new t1(this.f193653c, dVar);
        t1Var.f193652b = obj;
        return t1Var;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((t1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0031, B:19:0x003b, B:23:0x004b, B:14:0x0026), top: B:30:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (p008y1.n1.a(r5, r6, r7, r8, r9, r12) == r0) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        b0 b0Var2;
        Object objG;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193651a;
        n1 n1Var = this.f193653c;
        try {
            if (i14 == 0) {
                r.b(obj);
                b0Var = (b0) this.f193652b;
                if (g8.i.P(b0Var.getF195311f())) {
                    n1Var.f193443g = null;
                    return Unit.INSTANCE;
                }
                b bVar = n1Var.f193441e;
                this.f193652b = b0Var;
                this.f193651a = 1;
                objG = bVar.g(this);
                if (objG == aVar) {
                    b0Var2 = b0Var;
                    obj = objG;
                    n1.a aVar2 = (n1.a) obj;
                    float fS0 = n1Var.f193440d.s0(m1.f193423a);
                    float fS1 = n1Var.f193440d.s0(m1.f193424b);
                    h3 h3Var = n1Var.f193437a;
                    this.f193652b = b0Var2;
                    this.f193651a = 2;
                }
                return aVar;
            }
            if (i14 == 1) {
                b0Var2 = (b0) this.f193652b;
                r.b(obj);
                n1.a aVar3 = (n1.a) obj;
                float fS2 = n1Var.f193440d.s0(m1.f193423a);
                float fS3 = n1Var.f193440d.s0(m1.f193424b);
                h3 h3Var2 = n1Var.f193437a;
                this.f193652b = b0Var2;
                this.f193651a = 2;
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var2 = (b0) this.f193652b;
                r.b(obj);
            }
            b0Var = b0Var2;
            if (g8.i.P(b0Var.getF195311f())) {
                n1Var.f193443g = null;
                return Unit.INSTANCE;
            }
            b bVar2 = n1Var.f193441e;
            this.f193652b = b0Var;
            this.f193651a = 1;
            objG = bVar2.g(this);
            if (objG == aVar) {
                b0Var2 = b0Var;
                obj = objG;
                n1.a aVar4 = (n1.a) obj;
                float fS4 = n1Var.f193440d.s0(m1.f193423a);
                float fS5 = n1Var.f193440d.s0(m1.f193424b);
                h3 h3Var3 = n1Var.f193437a;
                this.f193652b = b0Var2;
                this.f193651a = 2;
            }
            return aVar;
        } catch (Throwable th3) {
            n1Var.f193443g = null;
            throw th3;
        }
    }
}

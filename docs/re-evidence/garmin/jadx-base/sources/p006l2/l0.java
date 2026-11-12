package p006l2;

import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import w2.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1", f = "CommonContextMenuArea.kt", l = {105, 106, 107}, m = "invokeSuspend", v = 1)
public final class l0 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2 f108635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f108636c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108637a;

        static {
            int[] iArr = new int[m2.values().length];
            try {
                iArr[m2.f108656d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m2.f108657e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m2.f108658f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m2.f108659g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m2.f108660h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f108637a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m2 m2Var, n nVar, d<? super l0> dVar) {
        super(2, dVar);
        this.f108635b = m2Var;
        this.f108636c = nVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new l0(this.f108635b, this.f108636c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r1.y(r5) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r1.j(false, r5) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r1.k(r5) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108634a;
        if (i14 == 0) {
            r.b(obj);
            int i15 = a.f108637a[this.f108635b.ordinal()];
            n nVar = this.f108636c;
            if (i15 == 1) {
                this.f108634a = 1;
            } else if (i15 == 2) {
                this.f108634a = 2;
            } else if (i15 == 3) {
                this.f108634a = 3;
            } else if (i15 == 4) {
                nVar.B();
            } else {
                if (i15 != 5) {
                    u0.r();
                    return null;
                }
                e23.a<Unit> aVar2 = nVar.f181379o;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
        } else {
            if (i14 != 1 && i14 != 2 && i14 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

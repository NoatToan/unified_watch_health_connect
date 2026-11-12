package v2;

import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f174943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f174944b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.l1 f174946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f174947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o53.l1 l1Var, e0 e0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174946b = l1Var;
            this.f174947c = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174946b, this.f174947c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0062  */
        /* JADX WARN: Code duplicated, block: B:33:0x0063 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0071, B:30:0x005a, B:33:0x0063, B:14:0x0026, B:15:0x002a, B:28:0x0054, B:29:0x0059, B:23:0x0042, B:25:0x004b), top: B:40:0x000f }] */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        
            if (o53.m0.b(500, r11) == r0) goto L35;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x006e -> B:36:0x0071). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174945a;
            e0 e0Var = this.f174947c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    o53.l1 l1Var = this.f174946b;
                    if (l1Var != null) {
                        this.f174945a = 1;
                        if (g8.i.r(l1Var, this) != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        o13.r.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i14 == 3) {
                        o13.r.b(obj);
                        e0Var.f174959c.i(0.0f);
                        this.f174945a = 4;
                    } else {
                        if (i14 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    e0Var.f174959c.i(1.0f);
                    this.f174945a = 3;
                    if (o53.m0.b(500L, this) == aVar) {
                        e0Var.f174959c.i(0.0f);
                        this.f174945a = 4;
                    }
                    return aVar;
                }
                o13.r.b(obj);
                e0Var.f174959c.i(1.0f);
                if (!e0Var.f174957a) {
                    this.f174945a = 2;
                    if (o53.m0.a(this) == aVar) {
                    }
                    throw new KotlinNothingValueException();
                }
                this.f174945a = 3;
                if (o53.m0.b(500L, this) == aVar) {
                    e0Var.f174959c.i(0.0f);
                    this.f174945a = 4;
                }
                return aVar;
            } catch (Throwable th3) {
                e0Var.f174959c.i(0.0f);
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f174944b = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f174944b, dVar);
        d0Var.f174943a = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o53.b0 b0Var = (o53.b0) this.f174943a;
        e0 e0Var = this.f174944b;
        o53.l1 andSet = e0Var.f174958b.getAndSet(null);
        AtomicReference<o53.l1> atomicReference = e0Var.f174958b;
        o53.c2 c2VarT = ge1.b.T(b0Var, null, null, new a(andSet, e0Var, null), 3);
        while (!atomicReference.compareAndSet(null, c2VarT)) {
            if (atomicReference.get() != null) {
                z14 = false;
                return Boolean.valueOf(z14);
            }
        }
        z14 = true;
        return Boolean.valueOf(z14);
    }
}

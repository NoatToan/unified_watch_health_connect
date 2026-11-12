package p002j6;

import e23.p;
import m5.c;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import t13.d;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {764}, m = "invokeSuspend", v = 1)
public final class e extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f97228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n4.d f97229c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln4/d;", "invoke", "()Ln4/d;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements e23.a<n4.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n4.d f97230a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n4.d dVar) {
            super(0);
            this.f97230a = dVar;
        }

        @Override // e23.a
        public final n4.d invoke() {
            return this.f97230a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, n4.d dVar, d<? super e> dVar2) {
        super(2, dVar2);
        this.f97228b = fVar;
        this.f97229c = dVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new e(this.f97228b, this.f97229c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f97227a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f97229c);
            this.f97227a = 1;
            if (c.a(this.f97228b, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

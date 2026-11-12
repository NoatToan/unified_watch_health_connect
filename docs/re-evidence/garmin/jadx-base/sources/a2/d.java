package a2;

import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {68}, m = "invokeSuspend", v = 1)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f486c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<b> f487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f488b;

        public a(List<b> list, p1<Boolean> p1Var) {
            this.f487a = list;
            this.f488b = p1Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            h hVar = (h) obj;
            boolean z14 = hVar instanceof b;
            List<b> list = this.f487a;
            if (z14) {
                list.add((b) hVar);
            } else if (hVar instanceof c) {
                list.remove(((c) hVar).f483a);
            }
            this.f488b.setValue(Boolean.valueOf(!list.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, p1<Boolean> p1Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f485b = iVar;
        this.f486c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f485b, this.f486c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f484a;
        if (i14 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            r53.i<h> iVarC = this.f485b.c();
            a aVar2 = new a(arrayListX, this.f486c);
            this.f484a = 1;
            if (iVarC.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

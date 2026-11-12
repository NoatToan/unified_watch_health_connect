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
@v13.e(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {68}, m = "invokeSuspend", v = 1)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f492c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<e> f493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f494b;

        public a(List<e> list, p1<Boolean> p1Var) {
            this.f493a = list;
            this.f494b = p1Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            h hVar = (h) obj;
            boolean z14 = hVar instanceof e;
            List<e> list = this.f493a;
            if (z14) {
                list.add((e) hVar);
            } else if (hVar instanceof f) {
                list.remove(((f) hVar).f489a);
            }
            this.f494b.setValue(Boolean.valueOf(!list.isEmpty()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, p1<Boolean> p1Var, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f491b = iVar;
        this.f492c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f491b, this.f492c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f490a;
        if (i14 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            r53.i<h> iVarC = this.f491b.c();
            a aVar2 = new a(arrayListX, this.f492c);
            this.f490a = 1;
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

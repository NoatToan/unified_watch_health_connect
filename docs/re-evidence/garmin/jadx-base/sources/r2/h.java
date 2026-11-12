package r2;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {107, 108}, m = "invokeSuspend", v = 1)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f149443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f149444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f149445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.f f149446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g.b f149447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, long j8, s2.f fVar, g.b bVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f149444b = gVar;
        this.f149445c = j8;
        this.f149446d = fVar;
        this.f149447e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f149444b, this.f149445c, this.f149446d, this.f149447e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r6.f149446d.a(r6.f149447e, r6) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f149443a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        e23.p<? super n4.c, ? super t13.d<? super Unit>, ? extends Object> pVar = this.f149444b.f149438c;
        if (pVar != null) {
            n4.c cVarA = n4.c.a(this.f149445c);
            this.f149443a = 1;
            if (pVar.invoke(cVarA, this) != aVar) {
            }
        }
        return aVar;
        this.f149443a = 2;
    }
}

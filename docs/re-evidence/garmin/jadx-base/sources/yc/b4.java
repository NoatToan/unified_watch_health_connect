package yc;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T", "", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER}, k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", l = {604}, m = "invokeSuspend")
public final class b4 extends v13.i implements e23.q<Object, Object, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f195785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f195786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b4(e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, t13.d<? super b4> dVar) {
        super(3, dVar);
        this.f195786d = qVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, t13.d<Object> dVar) {
        b4 b4Var = new b4(this.f195786d, dVar);
        b4Var.f195784b = obj;
        b4Var.f195785c = obj2;
        return b4Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195783a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Object obj2 = this.f195784b;
        Object obj3 = this.f195785c;
        this.f195784b = null;
        this.f195783a = 1;
        Object objInvoke = this.f195786d.invoke(obj2, obj3, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}

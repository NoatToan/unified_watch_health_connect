package w5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend", v = 1)
public final class f extends v13.i implements e23.l<t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f182095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f182096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, p pVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f182095b = iVar;
        this.f182096c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f182095b, this.f182096c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Object> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182094a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f182094a = 1;
            Object objC = this.f182095b.c(this.f182096c, this);
            return objC == aVar ? aVar : objC;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

package i42;

import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.webtranslation.TranslationDAO_Impl$addTranslations$4", f = "TranslationDAO_Impl.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.webtranslation.b f91011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f91013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f91014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<e> f91015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.garmin.android.apps.connectmobile.webtranslation.b bVar, String str, String str2, String str3, List<e> list, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f91011b = bVar;
        this.f91012c = str;
        this.f91013d = str2;
        this.f91014e = str3;
        this.f91015f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f91011b, this.f91012c, this.f91013d, this.f91014e, this.f91015f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91010a;
        if (i14 == 0) {
            r.b(obj);
            this.f91010a = 1;
            com.garmin.android.apps.connectmobile.webtranslation.b.c cVar = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
            com.garmin.android.apps.connectmobile.webtranslation.b bVar = this.f91011b;
            bVar.getClass();
            if (h.j(bVar, this.f91012c, this.f91013d, this.f91014e, this.f91015f, this) == aVar) {
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

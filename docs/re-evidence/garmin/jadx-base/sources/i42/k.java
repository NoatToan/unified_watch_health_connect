package i42;

import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Li42/e;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.webtranslation.TranslationDAO_Impl$getTranslationsOnlyIfInstalled$2", f = "TranslationDAO_Impl.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super List<? extends e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.webtranslation.b f91017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f91019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f91020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.garmin.android.apps.connectmobile.webtranslation.b bVar, String str, String str2, String str3, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f91017b = bVar;
        this.f91018c = str;
        this.f91019d = str2;
        this.f91020e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f91017b, this.f91018c, this.f91019d, this.f91020e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super List<? extends e>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91016a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        this.f91016a = 1;
        com.garmin.android.apps.connectmobile.webtranslation.b.c cVar = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
        com.garmin.android.apps.connectmobile.webtranslation.b bVar = this.f91017b;
        bVar.getClass();
        Object objD = h.d(bVar, this.f91018c, this.f91019d, this.f91020e, this);
        return objD == aVar ? aVar : objD;
    }
}

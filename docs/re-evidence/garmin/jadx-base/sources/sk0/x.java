package sk0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "name", "Lzp0/f;", "image", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljk0/n;", "<anonymous>", "(Ljava/lang/String;Lzp0/f;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel$savePhotos$2", f = "AddCollectionViewModel.kt", l = {276}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.q<String, zp0.f, t13.d<? super v2<? extends jk0.n>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f159900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ zp0.f f159901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f159902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f159903e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u uVar, String str, t13.d<? super x> dVar) {
        super(3, dVar);
        this.f159902d = uVar;
        this.f159903e = str;
    }

    @Override // e23.q
    public final Object invoke(String str, zp0.f fVar, t13.d<? super v2<? extends jk0.n>> dVar) {
        x xVar = new x(this.f159902d, this.f159903e, dVar);
        xVar.f159900b = str;
        xVar.f159901c = fVar;
        return xVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f159900b;
        zp0.f fVar = this.f159901c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159899a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        kk0.b bVar = this.f159902d.f159844a;
        this.f159900b = null;
        this.f159901c = null;
        this.f159899a = 1;
        Object objF = bVar.f(this.f159903e, fVar, str, this);
        return objF == aVar ? aVar : objF;
    }
}

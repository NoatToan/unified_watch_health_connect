package sk0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "it", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Ljava/util/List;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddCollectionViewModel$savePhotos$4", f = "AddCollectionViewModel.kt", l = {282}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<List<? extends String>, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f159920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f159921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f159922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u uVar, String str, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f159921c = uVar;
        this.f159922d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f159921c, this.f159922d, dVar);
        zVar.f159920b = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(List<? extends String> list, t13.d<? super v2<? extends Unit>> dVar) {
        return ((z) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f159920b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159919a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        kk0.b bVar = this.f159921c.f159844a;
        this.f159920b = null;
        this.f159919a = 1;
        Object objH = bVar.h(this.f159922d, list, this);
        return objH == aVar ? aVar : objH;
    }
}

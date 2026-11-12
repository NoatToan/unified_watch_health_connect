package uy0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "bottomNavigationItems", "", "refreshMoreMenu", "refreshHistoricalActivities", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "<anonymous>", "(Ljava/util/List;ZZ)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetNavigationItemDataUseCase$invoke$1", f = "GetNavigationItemDataUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.r<List<? extends String>, Boolean, Boolean, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f173081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f173082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f173083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f173084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b f173085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, ty0.b bVar, t13.d<? super a0> dVar) {
        super(4, dVar);
        this.f173084e = zVar;
        this.f173085f = bVar;
    }

    @Override // e23.r
    public final Object invoke(List<? extends String> list, Boolean bool, Boolean bool2, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>> dVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        a0 a0Var = new a0(this.f173084e, this.f173085f, dVar);
        a0Var.f173081b = list;
        a0Var.f173082c = zBooleanValue;
        a0Var.f173083d = zBooleanValue2;
        return a0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f173081b;
        boolean z14 = this.f173082c;
        boolean z15 = this.f173083d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173080a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String str = "getItems: currentItem=" + this.f173085f + ", bottomNavigationItems=" + list + ", refreshMoreMenu=" + z14;
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "GetNavigationItemDataUseCase", str);
        z zVar = this.f173084e;
        if (z14) {
            zVar.f173376d.H0(false);
        }
        i iVar = zVar.f173377e;
        this.f173081b = null;
        this.f173082c = z14;
        this.f173083d = z15;
        this.f173080a = 1;
        Object objE0 = ge1.b.e0(iVar.f173208s, new h(this.f173085f, iVar, list, z15, false, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}

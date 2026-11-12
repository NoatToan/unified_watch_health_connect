package oe2;

import com.mapbox.maps.MapView;
import java.util.ArrayList;
import java.util.Iterator;
import o72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapContainer$4$1", f = "MapboxMapCompose.kt", l = {264}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ le2.b f131551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f131552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<MapView> f131553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f131554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z14, le2.b bVar, e eVar, p1<MapView> p1Var, p1<Boolean> p1Var2, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f131550b = z14;
        this.f131551c = bVar;
        this.f131552d = eVar;
        this.f131553e = p1Var;
        this.f131554f = p1Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f131550b, this.f131551c, this.f131552d, this.f131553e, this.f131554f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131549a;
        if (i14 == 0) {
            o13.r.b(obj);
            if (this.f131550b && this.f131553e.getF182175a() != null) {
                le2.b bVar = this.f131551c;
                if (!bVar.f112055b.isEmpty()) {
                    i53.c<le2.d> cVar = bVar.f112055b;
                    ArrayList arrayList = new ArrayList();
                    Iterator<le2.d> it = cVar.iterator();
                    while (it.hasNext()) {
                        p13.d0.v(arrayList, it.next().f112063b);
                    }
                    p1<Boolean> p1Var = this.f131554f;
                    f0.d(p1Var, true);
                    i3 i3Var = new i3(p1Var, 8);
                    this.f131549a = 1;
                    if (this.f131552d.c(arrayList, i3Var, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

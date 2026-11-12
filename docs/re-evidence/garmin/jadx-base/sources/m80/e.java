package m80;

import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import rd2.j;
import v13.i;
import zb0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Ln80/a;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.data.CompanionDeviceRepositoryImpl$getUnlinkedDevices$unlinkedDevices$1", f = "CompanionDeviceRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super List<? extends n80.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f117146a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f117146a = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f117146a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends n80.a>> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b bVar = this.f117146a;
        bVar.f117136c.f152045a.getClass();
        ArrayList arrayListD = j.d();
        if (arrayListD == null) {
            return j0.f134944a;
        }
        ArrayList<sd2.f> arrayList = new ArrayList();
        for (Object obj2 : arrayListD) {
            sd2.f fVar = (sd2.f) obj2;
            if (fVar.isPaired() && (oa2.a.c(fVar.d0()) || oa2.a.c(fVar.Q()))) {
                if (!bVar.e(fVar)) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (sd2.f fVar2 : arrayList) {
            fVar2.getClass();
            String strC = k.c(fVar2);
            n80.a aVar2 = strC != null ? new n80.a(strC, fVar2.getProductDisplayName(), fVar2.getProductNumber(), false, 8, null) : null;
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        return arrayList2;
    }
}

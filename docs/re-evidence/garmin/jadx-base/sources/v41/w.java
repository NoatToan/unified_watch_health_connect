package v41;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.RecalculateSplitsAndColorsUseCase$recalculateColors$2", f = "RecalculateSplitsAndColorsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f175681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f175681a = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f175681a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        List<GeoPointDTO> list;
        u41.b value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t tVar = this.f175681a;
        z1<u41.b> z1Var = tVar.f175679b;
        z1<u41.b> z1Var2 = tVar.f175679b;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = z1Var.getValue().f168609a;
        com.garmin.android.apps.connectmobile.courses.model.e value3 = tVar.f175680c.getValue();
        if (value3 == null || (list = value3.geoPoints) == null || list.isEmpty()) {
            do {
                value = z1Var2.getValue();
            } while (!z1Var2.b(value, u41.b.a(value, null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16377)));
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Collection arrayList2 = value3.geoPoints;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        List<PaceBandSplitDTO> list2 = aVar2.f39759a;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = aVar2.f39760b;
        PaceBandSplitDTO[] paceBandSplitDTOArr = (PaceBandSplitDTO[]) list2.toArray(new PaceBandSplitDTO[0]);
        t.b(tVar, arrayList, arrayList3, paceBandSplitDTOArr);
        boolean zF = bVar.f();
        ArrayList arrayListA = t.a(tVar, (int) (bVar.f39773j / (((long) bVar.f39770g) / (zF ? 1000.0d : 1609.344d))), paceBandSplitDTOArr, zF);
        do {
            value2 = z1Var2.getValue();
        } while (!z1Var2.b(value2, u41.b.a(value2, null, arrayList3, arrayListA, 0, 0, null, null, null, null, null, null, false, false, false, 16377)));
        return Unit.INSTANCE;
    }
}

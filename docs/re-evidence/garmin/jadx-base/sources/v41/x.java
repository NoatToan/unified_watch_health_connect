package v41;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import com.garmin.android.apps.connectmobile.pacepro.domain.algorithm.PaceProAlgorithm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.RecalculateSplitsAndColorsUseCase$recalculateSplitsAndColors$2", f = "RecalculateSplitsAndColorsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f175682a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f175682a = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f175682a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        PaceBandSplitDTO[] paceBandSplitDTOArrA;
        u41.b value;
        u41.b bVar;
        u41.b value2;
        u41.b bVar2;
        u41.b value3;
        u41.b bVar3;
        List<GeoPointDTO> list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t tVar = this.f175682a;
        z1<u41.b> z1Var = tVar.f175679b;
        o2<com.garmin.android.apps.connectmobile.courses.model.e> o2Var = tVar.f175680c;
        z1<u41.b> z1Var2 = tVar.f175679b;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = z1Var.getValue().f168609a;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar4 = aVar2.f39760b;
        if (bVar4.f39778o) {
            paceBandSplitDTOArrA = (PaceBandSplitDTO[]) aVar2.f39759a.toArray(new PaceBandSplitDTO[0]);
        } else {
            PaceProAlgorithm paceProAlgorithm = tVar.f175678a;
            com.garmin.android.apps.connectmobile.courses.model.e value4 = o2Var.getValue();
            paceBandSplitDTOArrA = paceProAlgorithm.a(bVar4, (value4 == null || (list = value4.geoPoints) == null) ? null : (GeoPointDTO[]) list.toArray(new GeoPointDTO[0]));
        }
        ArrayList arrayList = new ArrayList();
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar5 = aVar2.f39760b;
        long j8 = (long) bVar5.f39770g;
        long j14 = bVar5.f39773j;
        boolean zF = bVar5.f();
        int i14 = (int) (j14 / (j8 / (zF ? 1000.0d : 1609.344d)));
        com.garmin.android.apps.connectmobile.courses.model.e value5 = o2Var.getValue();
        if (value5 != null) {
            ArrayList arrayList2 = new ArrayList();
            Collection arrayList3 = value5.geoPoints;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
            }
            arrayList2.addAll(arrayList3);
            if (arrayList2.isEmpty()) {
                do {
                    value2 = z1Var2.getValue();
                    bVar2 = value2;
                } while (!z1Var2.b(value2, u41.b.a(bVar2, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(bVar2.f168609a, p13.u.i0(paceBandSplitDTOArrA), null, 2), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16376)));
            } else {
                t.b(tVar, arrayList2, arrayList, paceBandSplitDTOArrA);
                ArrayList arrayListA = t.a(tVar, i14, paceBandSplitDTOArrA, zF);
                do {
                    value3 = z1Var2.getValue();
                    bVar3 = value3;
                } while (!z1Var2.b(value3, u41.b.a(bVar3, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(bVar3.f168609a, p13.u.i0(paceBandSplitDTOArrA), null, 2), arrayList, arrayListA, 0, 0, null, null, null, null, null, null, false, false, false, 16376)));
            }
        } else {
            do {
                value = z1Var2.getValue();
                bVar = value;
            } while (!z1Var2.b(value, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(bVar.f168609a, p13.u.i0(paceBandSplitDTOArrA), null, 2), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16376)));
        }
        return Unit.INSTANCE;
    }
}

package v41;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import com.garmin.android.apps.connectmobile.pacepro.domain.algorithm.PaceProAlgorithm;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import r53.o2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.CalculatePaceLimitsUseCase$calculatePaceLimits$2", f = "CalculatePaceLimitsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f175562a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f175562a = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f175562a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        List<GeoPointDTO> list;
        List<GeoPointDTO> list2;
        List<GeoPointDTO> list3;
        List<GeoPointDTO> list4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b bVar = this.f175562a;
        z1<u41.b> z1Var = bVar.f175569b;
        PaceProAlgorithm paceProAlgorithm = bVar.f175568a;
        o2<com.garmin.android.apps.connectmobile.courses.model.e> o2Var = bVar.f175570c;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = z1Var.getValue().f168609a;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 = aVar2.f39760b;
        boolean zF = bVar2.f();
        Double d14 = bVar2.f39771h;
        double d15 = zF ? 1000.0d : 1609.344d;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVarB = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, null, null, null, 0.0d, o2Var.getValue() != null ? new Double(-2.5d) : d14, new Double(-5.0d), 0L, 0.0d, false, null, null, null, 261759);
        ArrayList arrayList = new ArrayList();
        com.garmin.android.apps.connectmobile.courses.model.e value2 = o2Var.getValue();
        GeoPointDTO[] geoPointDTOArr = null;
        PaceBandSplitDTO[] paceBandSplitDTOArrA = paceProAlgorithm.a(bVarB, (value2 == null || (list4 = value2.geoPoints) == null) ? null : (GeoPointDTO[]) list4.toArray(new GeoPointDTO[0]));
        ArrayList arrayList2 = new ArrayList(paceBandSplitDTOArrA.length);
        int length = paceBandSplitDTOArrA.length;
        int i14 = 0;
        while (true) {
            float fFloatValue = 0.0f;
            if (i14 >= length) {
                break;
            }
            PaceBandSplitDTO paceBandSplitDTO = paceBandSplitDTOArrA[i14];
            Float splitTime = paceBandSplitDTO.getSplitTime();
            if (splitTime != null) {
                fFloatValue = splitTime.floatValue();
            }
            arrayList2.add(new Integer(MathKt.b(((double) fFloatValue) / (((double) ((float) paceBandSplitDTO.getSplitDistance())) / d15))));
            i14++;
            length = length;
        }
        arrayList.addAll(arrayList2);
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVarB2 = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, null, null, null, 0.0d, o2Var.getValue() != null ? new Double(-2.5d) : d14, new Double(5.0d), 0L, 0.0d, false, null, null, null, 261759);
        com.garmin.android.apps.connectmobile.courses.model.e value3 = o2Var.getValue();
        PaceBandSplitDTO[] paceBandSplitDTOArrA2 = paceProAlgorithm.a(bVarB2, (value3 == null || (list3 = value3.geoPoints) == null) ? null : (GeoPointDTO[]) list3.toArray(new GeoPointDTO[0]));
        ArrayList arrayList3 = new ArrayList(paceBandSplitDTOArrA2.length);
        for (PaceBandSplitDTO paceBandSplitDTO2 : paceBandSplitDTOArrA2) {
            Float splitTime2 = paceBandSplitDTO2.getSplitTime();
            arrayList3.add(new Integer(MathKt.b(((double) (splitTime2 != null ? splitTime2.floatValue() : 0.0f)) / (((double) ((float) paceBandSplitDTO2.getSplitDistance())) / d15))));
        }
        arrayList.addAll(arrayList3);
        if (o2Var.getValue() != null) {
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVarB3 = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, null, null, null, 0.0d, new Double(2.5d), new Double(5.0d), 0L, 0.0d, false, null, null, null, 261759);
            com.garmin.android.apps.connectmobile.courses.model.e value4 = o2Var.getValue();
            PaceBandSplitDTO[] paceBandSplitDTOArrA3 = paceProAlgorithm.a(bVarB3, (value4 == null || (list2 = value4.geoPoints) == null) ? null : (GeoPointDTO[]) list2.toArray(new GeoPointDTO[0]));
            ArrayList arrayList4 = new ArrayList(paceBandSplitDTOArrA3.length);
            for (PaceBandSplitDTO paceBandSplitDTO3 : paceBandSplitDTOArrA3) {
                Float splitTime3 = paceBandSplitDTO3.getSplitTime();
                arrayList4.add(new Integer(MathKt.b(((double) (splitTime3 != null ? splitTime3.floatValue() : 0.0f)) / (((double) ((float) paceBandSplitDTO3.getSplitDistance())) / d15))));
            }
            arrayList.addAll(arrayList4);
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVarB4 = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, null, null, null, 0.0d, new Double(2.5d), new Double(-5.0d), 0L, 0.0d, false, null, null, null, 261759);
            com.garmin.android.apps.connectmobile.courses.model.e value5 = o2Var.getValue();
            if (value5 != null && (list = value5.geoPoints) != null) {
                geoPointDTOArr = (GeoPointDTO[]) list.toArray(new GeoPointDTO[0]);
            }
            PaceBandSplitDTO[] paceBandSplitDTOArrA4 = paceProAlgorithm.a(bVarB4, geoPointDTOArr);
            ArrayList arrayList5 = new ArrayList(paceBandSplitDTOArrA4.length);
            for (PaceBandSplitDTO paceBandSplitDTO4 : paceBandSplitDTOArrA4) {
                Float splitTime4 = paceBandSplitDTO4.getSplitTime();
                arrayList5.add(new Integer(MathKt.b(((double) (splitTime4 != null ? splitTime4.floatValue() : 0.0f)) / (((double) ((float) paceBandSplitDTO4.getSplitDistance())) / d15))));
            }
            arrayList.addAll(arrayList5);
        }
        if (aVar2.f39760b.f39778o) {
            List<PaceBandSplitDTO> list5 = aVar2.f39759a;
            ArrayList arrayList6 = new ArrayList(p13.y.r(list5, 10));
            for (PaceBandSplitDTO paceBandSplitDTO5 : list5) {
                Float splitTime5 = paceBandSplitDTO5.getSplitTime();
                arrayList6.add(new Integer(MathKt.b(((double) (splitTime5 != null ? splitTime5.floatValue() : 0.0f)) / (((double) ((float) paceBandSplitDTO5.getSplitDistance())) / d15))));
            }
            arrayList.addAll(arrayList6);
        }
        Integer num = (Integer) p13.h0.t0(arrayList);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Integer num2 = (Integer) p13.h0.o0(arrayList);
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        z1<u41.b> z1Var2 = bVar.f175569b;
        do {
            value = z1Var2.getValue();
        } while (!z1Var2.b(value, u41.b.a(value, null, null, null, iIntValue2 + 2, iIntValue - 2, null, null, null, null, null, null, false, false, false, 16359)));
        return Unit.INSTANCE;
    }
}

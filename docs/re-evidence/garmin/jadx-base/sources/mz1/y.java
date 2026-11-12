package mz1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel$setLocationAndTimeData$1$1", f = "AddTIEventViewModel.kt", l = {3351}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AddTIEventViewModel f121978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddTIEventViewModel f121980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.v f121981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AddTIEventViewModel addTIEventViewModel, ww1.v vVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f121980c = addTIEventViewModel;
        this.f121981d = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f121980c, this.f121981d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String timeZoneId;
        AddTIEventViewModel addTIEventViewModel;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121979b;
        if (i14 == 0) {
            o13.r.b(obj);
            String[] strArr = AddTIEventViewModel.V2;
            AddTIEventViewModel addTIEventViewModel2 = this.f121980c;
            ((androidx.lifecycle.y0) addTIEventViewModel2.f46421l2.getValue()).j(g3.a.c(g3.f35298f));
            ww1.v vVar = this.f121981d;
            String str = vVar.f187879c;
            if (str != null) {
                addTIEventViewModel2.J6(str);
            }
            DateTime dateTime = vVar.f187877a;
            if (dateTime != null) {
                addTIEventViewModel2.L6(dateTime);
            }
            fg0.y yVar = vVar.f187880d;
            if (yVar != null) {
                ny1.g gVar = ny1.g.IN_PERSON;
                gVar.getClass();
                addTIEventViewModel2.Q5().m(gVar);
                com.garmin.android.library.mapsdkadapter.i.b bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                androidx.lifecycle.y0<com.garmin.android.library.mapsdkadapter.f> y0VarH5 = addTIEventViewModel2.H5();
                Double lat = yVar.getLat();
                double dDoubleValue = lat != null ? lat.doubleValue() : 0.0d;
                Double lon = yVar.getLon();
                y0VarH5.m(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, lon != null ? lon.doubleValue() : 0.0d, bVar));
            }
            fg0.r rVar = vVar.f187878b;
            if (rVar != null && (timeZoneId = rVar.getTimeZoneId()) != null) {
                this.f121978a = addTIEventViewModel2;
                this.f121979b = 1;
                Object objD5 = addTIEventViewModel2.d5(timeZoneId, this);
                if (objD5 == aVar) {
                    return aVar;
                }
                addTIEventViewModel = addTIEventViewModel2;
                obj = objD5;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        addTIEventViewModel = this.f121978a;
        o13.r.b(obj);
        my1.g gVar2 = (my1.g) obj;
        if (gVar2 != null) {
            String[] strArr2 = AddTIEventViewModel.V2;
            addTIEventViewModel.R5().m(gVar2);
            ((androidx.lifecycle.y0) addTIEventViewModel.f46421l2.getValue()).j(g3.a.e(g3.f35298f));
        } else {
            String[] strArr3 = AddTIEventViewModel.V2;
            ((androidx.lifecycle.y0) addTIEventViewModel.f46421l2.getValue()).j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}

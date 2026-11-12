package qw;

import b63.o;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsViewModel$deleteChosenReading$1$1", f = "BloodPressureReportsViewModel.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f148272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pw.a f148273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, pw.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f148272b = gVar;
        this.f148273c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f148272b, this.f148273c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f148271a;
        g gVar = this.f148272b;
        pw.a aVar2 = this.f148273c;
        if (i14 == 0) {
            r.b(obj);
            lw.b bVar = gVar.f148246a;
            DateTime dateTime = new DateTime(aVar2.j());
            long version = aVar2.getVersion();
            this.f148271a = 1;
            obj = bVar.h(dateTime, version, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (((v2) obj) instanceof v2.b) {
            LocalDate localDate = new DateTime(aVar2.j(), DateTimeZone.getDefault()).toLocalDate();
            localDate.getClass();
            o oVarT = g22.k.t(localDate);
            LocalDate localDate2 = new DateTime(aVar2.j(), DateTimeZone.getDefault()).toLocalDate();
            localDate2.getClass();
            gVar.f148253h.i(new o82.a(oVarT, g22.k.t(localDate2)), true);
            gVar.f148254i.e();
            gVar.f148255j.e();
        }
        return Unit.INSTANCE;
    }
}

package bi2;

import android.app.DatePickerDialog;
import android.content.Context;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.DatePicker$showDatePicker$1", f = "DatePicker.kt", l = {34}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f18248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f18248b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f18248b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18247a;
        r rVar = this.f18248b;
        Unit unit = null;
        if (i14 == 0) {
            o13.r.b(obj);
            rVar.f18253e.getClass();
            ei2.h hVar = rVar.f18250b;
            ii2.b bVar = rVar.f18251c;
            Map<String, ? extends Object> map = rVar.f18252d;
            this.f18247a = 1;
            obj = hVar.i(bVar, map, 0);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        HashMap map2 = (HashMap) obj;
        if (map2 != null) {
            mh2.i iVar = mh2.i.DS_SELECTED_VALUE;
            if (map2.containsKey(iVar.f118617a)) {
                mh2.i iVar2 = mh2.i.DS_MAXIMUM_VALUE;
                if (map2.containsKey(iVar2.f118617a)) {
                    Object obj2 = map2.get(iVar.f118617a);
                    obj2.getClass();
                    DateTime dateTime = (DateTime) obj2;
                    DateTime dateTime2 = (DateTime) map2.get(mh2.i.DS_MINIMUM_VALUE.f118617a);
                    Object obj3 = map2.get(iVar2.f118617a);
                    obj3.getClass();
                    DateTime dateTime3 = (DateTime) obj3;
                    DatePickerDialog datePickerDialog = new DatePickerDialog(rVar.f18249a, R.style.DSLDatePickerDialogStyle, new p(rVar, 0), dateTime.getYear(), dateTime.getMonthOfYear() - 1, dateTime.getDayOfMonth());
                    if (dateTime2 != null) {
                        datePickerDialog.getDatePicker().setMinDate(dateTime2.getMillis());
                    }
                    datePickerDialog.getDatePicker().setMaxDate(dateTime3.getMillis());
                    kh2.g.a aVar2 = kh2.g.f104792a;
                    Context context = rVar.f18249a;
                    aVar2.getClass();
                    kh2.g.a.c(datePickerDialog, context);
                } else {
                    hi2.d dVar = rVar.f18253e;
                    map2.toString();
                    Logger logger = hi2.d.f83889c;
                    dVar.getClass();
                }
            } else {
                hi2.d dVar2 = rVar.f18253e;
                map2.toString();
                Logger logger2 = hi2.d.f83889c;
                dVar2.getClass();
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            hi2.d dVar3 = rVar.f18253e;
            Logger logger3 = hi2.d.f83889c;
            dVar3.getClass();
        }
        return Unit.INSTANCE;
    }
}

package md1;

import com.garmin.android.apps.connectmobile.f0;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sd1.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.reminders.domain.dayphase.GetDayPhaseRemindersUseCase$cleanUpReminders$2", f = "GetDayPhaseRemindersUseCase.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sd1.e f117922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f117923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f117925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<qd1.a> f117926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sd1.e f117927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<qd1.a> list, sd1.e eVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f117926e = list;
        this.f117927f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f117926e, this.f117927f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        sd1.e eVar;
        Iterator it;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f117925d;
        if (i15 == 0) {
            r.b(obj);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = this.f117926e.iterator();
            while (it3.hasNext()) {
                Integer num = ((qd1.a) it3.next()).f144478d;
                if (num != null) {
                    arrayList.add(num);
                }
            }
            Iterator it4 = arrayList.iterator();
            i14 = 0;
            eVar = this.f117927f;
            it = it4;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f117924c;
            it = this.f117923b;
            eVar = this.f117922a;
            r.b(obj);
        }
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            pd1.a aVar2 = pd1.a.LIFESTYLE_LOGGING;
            this.f117922a = eVar;
            this.f117923b = it;
            this.f117924c = i14;
            this.f117925d = 1;
            eVar.getClass();
            if (f0.J(eVar, new f(aVar2, iIntValue, null), this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}

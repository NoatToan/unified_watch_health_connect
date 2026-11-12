package kw1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fg0.j;
import fg0.k;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import zf0.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.domain.GetTrainablePrimaryEventUseCase$invoke$2", f = "GetTrainablePrimaryEventUseCase.kt", l = {24, 29}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super v2<? extends k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f106957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f106958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f106960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f106961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f106961e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f106961e, dVar);
        cVar.f106960d = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends k>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r11 == r1) goto L42;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object next;
        k kVar;
        j eventCustomization;
        b0 b0Var = (b0) this.f106960d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106959c;
        a aVar2 = this.f106961e;
        boolean z14 = true;
        if (i14 != 0) {
            if (i14 == 1) {
                str2 = this.f106958b;
                str = this.f106957a;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            kVar = (k) obj;
            return new v2.b(kVar, 200, null, null, 12, null);
        }
        r.b(obj);
        pu1.b.f141294c.getClass();
        LocalDate localDateNow = LocalDate.now();
        pu1.b bVar = pu1.b.FBT_PLAN;
        LocalDate localDatePlusWeeks = localDateNow.plusWeeks(bVar.f141301a);
        localDatePlusWeeks.getClass();
        String string = localDatePlusWeeks.toString("yyyy-MM-dd");
        LocalDate localDatePlusWeeks2 = LocalDate.now().plusWeeks(bVar.f141302b);
        localDatePlusWeeks2.getClass();
        String string2 = localDatePlusWeeks2.toString("yyyy-MM-dd");
        zf0.d dVar = aVar2.f106951a;
        string.getClass();
        string2.getClass();
        this.f106960d = b0Var;
        this.f106957a = string;
        this.f106958b = string2;
        this.f106959c = 1;
        Object objJ = f0.J(dVar, new v(dVar, string, string2, null), this);
        if (objJ != aVar) {
            str = string;
            obj = objJ;
            str2 = string2;
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strJ = a0.j("Error retrieving upcoming events for startDate=", str, ", endDate=", str2);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "GetTrainablePrimaryEventUseCase", strJ);
            v2.a aVar4 = (v2.a) v2Var;
            return new v2.a(aVar4.f47383a, aVar4.f47384b, aVar4.f47385c);
        }
        Iterator it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            eventCustomization = ((k) next).getEventCustomization();
        } while (!(eventCustomization != null ? s.g(eventCustomization.getIsPrimaryEvent(), Boolean.TRUE) : false));
        kVar = (k) next;
        if ((kVar != null ? kVar.getEventType() : null) == gg0.f.f77136l) {
            List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH = kVar.h();
            if (listH != null && !listH.isEmpty()) {
                z14 = false;
            }
            if (z14) {
                String shareableEventUuid = kVar.getShareableEventUuid();
                Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                this.f106960d = null;
                this.f106957a = null;
                this.f106958b = null;
                this.f106959c = 2;
                obj = a.a(aVar2, shareableEventUuid, l14, this);
            }
        }
        return new v2.b(kVar, 200, null, null, 12, null);
    }
}

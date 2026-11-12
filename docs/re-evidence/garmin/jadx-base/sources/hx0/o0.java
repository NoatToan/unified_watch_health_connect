package hx0;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lhx0/o0;", "Landroidx/lifecycle/u1;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f86110f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public db1.m f86111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f86112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f86113c = o13.m.b(new ht1.v(12));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f86114d = o13.m.b(new h62.j(this, 18));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f86115e = o13.m.b(new ht1.v(13));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx0/o0$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lo53/r;", "saveSettingsCall", "<init>", "(Lhx0/o0;Lo53/r;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o53.r<Unit> f86116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o0 f86117b;

        public b(o0 o0Var, o53.r<Unit> rVar) {
            rVar.getClass();
            this.f86117b = o0Var;
            this.f86116a = rVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            int i14 = o0.f86110f;
            this.f86117b.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            o53.r<Unit> rVar = this.f86116a;
            if (cVar == cVar2) {
                rVar.p(Unit.INSTANCE);
            } else {
                rVar.O(new Throwable());
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Unit unit) {
            eVar.getClass();
            unit.getClass();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            db1.m mVar = (db1.m) t14;
            db1.m mVar2 = (db1.m) t7;
            return r13.a.b(mVar != null ? mVar.getPregnancyCycleStart() : null, mVar2 != null ? mVar2.getPregnancyCycleStart() : null);
        }
    }

    static {
        new a(null);
    }

    public o0() {
        ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).getUserSettings();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable x4(o0 o0Var, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, v13.c cVar) {
        q0 q0Var;
        o0Var.getClass();
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f86128c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f86128c = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(o0Var, cVar);
            }
        } else {
            q0Var = new q0(o0Var, cVar);
        }
        Object obj = q0Var.f86126a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f86128c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (jSONObject == null || userSettingsDTO == null) {
                    return null;
                }
                o53.s sVarB = gl.b.b();
                ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).a(userSettingsDTO, jSONObject, new b(o0Var, sVarB));
                q0Var.f86128c = 1;
                if (sVarB.C(q0Var) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return new o13.p(Boolean.TRUE, null);
        } catch (Throwable th3) {
            a2 a2Var = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PregnancyDetailsViewModel/MCT", th3);
            return new o13.p(Boolean.FALSE, th3);
        }
    }

    public static final void y4(o0 o0Var, ArrayList arrayList) {
        Object obj;
        o0Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        tb1.c.a aVar = tb1.c.f163744a;
        i52.a.f91796a.getClass();
        ww0.a aVarL = i52.a.l();
        aVar.getClass();
        if (tb1.c.a.a(aVarL)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                db1.m mVar = (db1.m) obj2;
                if (mVar.getDeliveryDate() == null && mVar.getEndDate() == null && mVar.getDueDate() != null) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    LocalDate dueDate = ((db1.m) next).getDueDate();
                    dueDate.getClass();
                    do {
                        Object next2 = it.next();
                        LocalDate dueDate2 = ((db1.m) next2).getDueDate();
                        dueDate2.getClass();
                        if (dueDate.compareTo(dueDate2) < 0) {
                            next = next2;
                            dueDate = dueDate2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            o0Var.f86111a = (db1.m) obj;
        }
    }

    public final db1.m A4(LocalDate localDate) {
        LocalDate pregnancyCycleStart;
        LocalDate pregnancyCycleStart2;
        db1.m mVar = this.f86111a;
        if (mVar != null && (pregnancyCycleStart2 = mVar.getPregnancyCycleStart()) != null && (pregnancyCycleStart2.isBefore(localDate) || pregnancyCycleStart2.isEqual(localDate))) {
            return mVar;
        }
        ArrayList arrayList = this.f86112b;
        if (arrayList == null) {
            return null;
        }
        for (db1.m mVar2 : p13.h0.N0(arrayList, new c())) {
            if (mVar2 != null && (pregnancyCycleStart = mVar2.getPregnancyCycleStart()) != null) {
                if (!pregnancyCycleStart.isEqual(localDate)) {
                    ReadablePartial endDate = mVar2.getEndDate();
                    if (endDate == null && (endDate = mVar2.getDeliveryDate()) == null) {
                        endDate = mVar2.getDueDate();
                    }
                    if (endDate == null || (!localDate.isEqual(endDate) && (!localDate.isAfter(pregnancyCycleStart) || !localDate.isBefore(endDate)))) {
                    }
                }
                return mVar2;
            }
        }
        return null;
    }

    public final y0<fw.m<List<db1.m>>> z4() {
        return (y0) this.f86113c.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx0/o0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

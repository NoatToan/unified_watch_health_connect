package n70;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Ls80/b;", "incorrectPasscodeDevices", "lockedPasscodeDevices", "", "Lo70/m;", "<anonymous>", "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetIncorrectPasscodeDevicesUseCase$invoke$1", f = "GetIncorrectPasscodeDevicesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o2 extends v13.i implements e23.q<Set<? extends s80.b>, Set<? extends s80.b>, t13.d<? super List<? extends o70.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Set f124451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Set f124452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2 f124453c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n2 f124454a;

        public a(n2 n2Var) {
            this.f124454a = n2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            long j8 = ((o70.m) t14).f130028a;
            n2 n2Var = this.f124454a;
            return r13.a.b(Boolean.valueOf(j8 == n2Var.f124433b.s4()), Boolean.valueOf(((o70.m) t7).f130028a == n2Var.f124433b.s4()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(n2 n2Var, t13.d<? super o2> dVar) {
        super(3, dVar);
        this.f124453c = n2Var;
    }

    @Override // e23.q
    public final Object invoke(Set<? extends s80.b> set, Set<? extends s80.b> set2, t13.d<? super List<? extends o70.m>> dVar) {
        o2 o2Var = new o2(this.f124453c, dVar);
        o2Var.f124451a = set;
        o2Var.f124452b = set2;
        return o2Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Set set = this.f124451a;
        Set set2 = this.f124452b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Set<s80.b> set3 = set;
        ArrayList arrayList = new ArrayList(p13.y.r(set3, 10));
        for (s80.b bVar : set3) {
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetIncorrectPasscodeStatusUseCase", "incorrectPasscodeDevice: " + bVar);
            arrayList.add(new o70.m(bVar.f157872a, bVar.f157873b, bVar.f157874c, bVar.f157875d, bVar.f157876e, o70.l.INCORRECT_PASSCODE));
        }
        Set<s80.b> set4 = set2;
        ArrayList arrayList2 = new ArrayList(p13.y.r(set4, 10));
        for (s80.b bVar2 : set4) {
            com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar3.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "GetIncorrectPasscodeStatusUseCase", "lockedPasscodeDevice: " + bVar2);
            arrayList2.add(new o70.m(bVar2.f157872a, bVar2.f157873b, bVar2.f157874c, bVar2.f157875d, bVar2.f157876e, o70.l.LOCKED_PASSCODE));
        }
        return p13.h0.N0(p13.h0.C0(arrayList, arrayList2), new a(this.f124453c));
    }
}

package qc0;

import androidx.lifecycle.v1;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import d53.w;
import e23.p;
import g22.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lc.u0;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import r53.c2;
import r53.j;
import r53.m1;
import r53.p2;
import v13.e;
import v13.i;
import vb.h;
import zb0.k1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.devices.sensors.SensorsViewModel$getSensorsList$1", f = "SensorsViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f144361c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lsc0/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.devices.sensors.SensorsViewModel$getSensorsList$1$1", f = "SensorsViewModel.kt", l = {37, 37}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<j<? super v2<? extends List<? extends sc0.a>>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f144362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f144363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f144364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f144365d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f144365d = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f144365d, dVar);
            aVar.f144364c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(j<? super v2<? extends List<? extends sc0.a>>> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f144364c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144363b;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f144362a;
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            tc0.a aVar2 = this.f144365d.f144371b;
            this.f144364c = null;
            this.f144362a = jVar;
            this.f144363b = 1;
            obj = aVar2.b(this);
            if (obj != aVar) {
            }
            return aVar;
            this.f144364c = null;
            this.f144362a = null;
            this.f144363b = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lsc0/a;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.devices.sensors.SensorsViewModel$getSensorsList$1$2", f = "SensorsViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<v2<? extends List<? extends sc0.a>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f144367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f144368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b0 f144369d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, b0 b0Var, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f144368c = dVar;
            this.f144369d = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f144368c, this.f144369d, dVar);
            bVar.f144367b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(v2<? extends List<? extends sc0.a>> v2Var, t13.d<? super Unit> dVar) {
            return ((b) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:62:0x01af  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            fg1.b bVar;
            String strA;
            String str;
            String strA2;
            Integer num;
            v2 v2Var = (v2) this.f144367b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144366a;
            if (i14 == 0) {
                r.b(obj);
                boolean z14 = v2Var instanceof v2.b;
                d dVar = this.f144368c;
                if (z14) {
                    p2 p2Var = dVar.f144372c;
                    List list = (List) ((v2.b) v2Var).f47386a;
                    k1 k1Var = dVar.f144370a;
                    list.getClass();
                    k1Var.getClass();
                    l22.b bVar2 = k1Var.f203546a;
                    String strI = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).i();
                    ArrayList arrayList = new ArrayList(y.r(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        sc0.a aVar2 = (sc0.a) it3.next();
                        fg1.b.a aVar3 = fg1.b.f71392d;
                        String sensorType = aVar2.getSensorType();
                        fg1.b bVar3 = fg1.b.UNKNOWN;
                        aVar3.getClass();
                        bVar3.getClass();
                        fg1.b[] bVarArrValues = fg1.b.values();
                        int length = bVarArrValues.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                it = it3;
                                bVar = null;
                                break;
                            }
                            bVar = bVarArrValues[i15];
                            it = it3;
                            if (s.g(bVar.f71395a, sensorType)) {
                                break;
                            }
                            i15++;
                            it3 = it;
                        }
                        if (bVar != null) {
                            bVar3 = bVar;
                        }
                        fg1.a.C1455a c1455a = fg1.a.f71382d;
                        String batteryStatus = aVar2.getBatteryStatus();
                        c1455a.getClass();
                        fg1.a aVarA = fg1.a.C1455a.a(batteryStatus);
                        Integer batteryLevel = aVar2.getBatteryLevel();
                        String imageUrl = aVar2.getImageUrl();
                        if (imageUrl == null) {
                            imageUrl = String.format(Locale.US, "%s/images/devices/sensors/%s.png", Arrays.copyOf(new Object[]{strI, bVar3.f71397c}, 2));
                        }
                        String str2 = imageUrl;
                        String deviceName = aVar2.getDeviceName();
                        if (deviceName == null) {
                            String string = bVar2.getString(bVar3.f71396b);
                            Long serialNumber = aVar2.getSerialNumber();
                            String strValueOf = serialNumber != null ? String.valueOf(serialNumber.longValue()) : null;
                            if (strValueOf == null) {
                                strValueOf = "";
                            }
                            deviceName = w.i0(string + StringUtils.SPACE + strValueOf).toString();
                        }
                        String str3 = deviceName;
                        if (batteryLevel == null || !s.g(aVar2.getRechargeableSensorCapable(), Boolean.TRUE)) {
                            strA = aVarA != null ? bVar2.a(R.string.sensor_battery_status, bVar2.getString(aVarA.f71390b)) : null;
                        } else {
                            strA = bVar2.a(R.string.sensor_battery_status, bVar2.a(R.string.lbl_value_percent, batteryLevel));
                        }
                        String str4 = strA;
                        DateTimeFormatter dateTimeFormatter = k1Var.f203547b;
                        DateTime dateTimeE = aVar2.e();
                        if (dateTimeE == null || !k.k(dateTimeE)) {
                            DateTime dateTimeE2 = aVar2.e();
                            if (dateTimeE2 == null || !k.f(dateTimeE2, DateTime.now().minusDays(1))) {
                                if (aVar2.e() != null) {
                                    strA2 = bVar2.a(R.string.sensor_last_checked, j0.p(aVar2.e()));
                                } else {
                                    str = null;
                                }
                                if (aVarA != null) {
                                    num = aVarA.f71391c;
                                } else {
                                    num = null;
                                }
                                arrayList.add(new sc0.b(str2, str3, str4, str, num));
                                it3 = it;
                            } else {
                                DateTime dateTimeE3 = aVar2.e();
                                dateTimeFormatter.getClass();
                                strA2 = bVar2.a(R.string.sensor_last_checked_yesterday, j0.h(dateTimeE3, dateTimeFormatter));
                            }
                        } else {
                            DateTime dateTimeE4 = aVar2.e();
                            dateTimeFormatter.getClass();
                            strA2 = bVar2.a(R.string.sensor_last_checked_today, j0.h(dateTimeE4, dateTimeFormatter));
                        }
                        str = strA2;
                        if (aVarA != null) {
                            num = aVarA.f71391c;
                        } else {
                            num = null;
                        }
                        arrayList.add(new sc0.b(str2, str3, str4, str, num));
                        it3 = it;
                    }
                    p2Var.k(null, new ArrayList(arrayList));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    a2 a2Var = a2.DEVICES;
                    String strN = fb1.c.n("Error fetching sensors: ", ((v2.a) v2Var).f47385c);
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "Sensors", strN);
                }
                p2 p2Var2 = dVar.f144374e;
                Boolean bool = Boolean.FALSE;
                this.f144367b = null;
                this.f144366a = 1;
                p2Var2.k(null, bool);
                if (Unit.INSTANCE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f144361c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f144361c, dVar);
        cVar.f144360b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f144360b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144359a;
        d dVar = this.f144361c;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = dVar.f144374e;
            Boolean bool = Boolean.TRUE;
            this.f144360b = b0Var;
            this.f144359a = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        r53.s.C(new m1(new c2(new a(dVar, null)), new b(dVar, b0Var, null)), v1.a(dVar));
        return Unit.INSTANCE;
    }
}

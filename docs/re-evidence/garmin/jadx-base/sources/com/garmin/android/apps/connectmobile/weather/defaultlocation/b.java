package com.garmin.android.apps.connectmobile.weather.defaultlocation;

import android.content.Context;
import android.location.Address;
import android.location.Location;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.t1;
import c22.t3;
import c22.z1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.library.mapsdkadapter.n;
import du2.g;
import e23.p;
import fw.m;
import g42.l;
import gw.g0;
import j22.f;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s;
import o53.s0;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;
import wi1.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f47923j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f47924k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<g.d> f47925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f47926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserSettingsDTO f47927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UserSettingsDTO f47928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<m<Unit>> f47929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f47930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f47931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<Address> f47932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0 f47933i;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.weather.defaultlocation.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0933b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47934a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.ALLOWED_ALL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.ALLOWED_WHILE_USING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.DENIED_DONT_ASK_AGAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f47934a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/weather/defaultlocation/b$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.a {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47936a;

            static {
                int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f47936a = iArr;
            }
        }

        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
        public final void E(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar) {
            b.f47924k.debug("onComplete: status=[{}]", bVar.f());
            com.garmin.android.library.backgroundtaskmanagement.b.c cVarF = bVar.f();
            int i14 = cVarF == null ? -1 : a.f47936a[cVarF.ordinal()];
            b bVar2 = b.this;
            if (i14 == 1) {
                bVar2.f47929e.j(m.a.g(m.f73767e, null, 3));
                return;
            }
            y0<m<Unit>> y0Var = bVar2.f47929e;
            m.a aVar = m.f73767e;
            Exception exc = new Exception();
            aVar.getClass();
            y0Var.j(m.a.a(null, exc));
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.a
        public final void J(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            bVar.getClass();
            eVar.getClass();
            obj.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationPreferenceViewModel$saveUserSettings$1", f = "WeatherLocationPreferenceViewModel.kt", l = {187}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47937a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47937a;
            b bVar = b.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    y0<m<Unit>> y0Var = bVar.f47929e;
                    UserSettingsDTO userSettingsDTO = bVar.f47928d;
                    y0Var.j(m.a.f(m.f73767e, null, null, 3));
                    JSONObject jSONObjectB = t3.b(userSettingsDTO.t1(), bVar.f47927c.t1());
                    b.f47924k.debug("saveUserSettings: delta=[{}], starting save", jSONObjectB);
                    o53.r<UserSettingsDTO> rVarK = new g0(bVar.f47931g, userSettingsDTO, jSONObjectB).k();
                    this.f47937a = 1;
                    if (((s) rVarK).C(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Throwable th3) {
                b.f47924k.error("saveUserSettings: Caught an exception: ", th3);
                y0<m<Unit>> y0Var2 = bVar.f47929e;
                m.f73767e.getClass();
                y0Var2.j(m.a.a(null, th3));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f47924k = gt2.b.f79005a.h("WeatherLocationPreferenceViewModel");
    }

    public b() {
        y0<g.d> y0Var = new y0<>();
        this.f47925a = y0Var;
        this.f47926b = y0Var;
        this.f47927c = GCMSettingManager.s();
        this.f47928d = GCMSettingManager.s();
        y0<m<Unit>> y0Var2 = new y0<>();
        this.f47929e = y0Var2;
        this.f47930f = y0Var2;
        this.f47931g = new c();
        y0<Address> y0Var3 = new y0<>();
        this.f47932h = y0Var3;
        this.f47933i = y0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [g42.d] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final Object A4(Context context, v13.c cVar) {
        l lVar;
        Location locationC;
        ?? X4;
        g42.d dVarX4;
        Unit unit;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f75807d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f75807d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objE = lVar.f75805b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f75807d;
        Logger logger = f47924k;
        if (i15 == 0) {
            r.b(objE);
            g.f61293g.getClass();
            locationC = g.a.c(context);
            if (locationC != null) {
                z1 z1Var = z1.f23762a;
                com.garmin.android.library.mapsdkadapter.f fVar = new com.garmin.android.library.mapsdkadapter.f(locationC.getLatitude(), locationC.getLongitude(), com.garmin.android.library.mapsdkadapter.i.d.GOOGLE);
                lVar.f75804a = locationC;
                lVar.f75807d = 1;
                objE = z1Var.e(fVar, lVar);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                logger.error("populateCurrentFields: Could not get user default weather location");
                Unit unit2 = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        locationC = lVar.f75804a;
        r.b(objE);
        Address address = (Address) objE;
        y0<Address> y0Var = this.f47932h;
        if (address != null) {
            y0Var.m(address);
            dVarX4 = x4();
            if (dVarX4 != null) {
                dVarX4.f75789f = address.getPostalCode();
                dVarX4.f75788e = address.getCountryCode();
                dVarX4.f75787d = t1.b(address);
                dVarX4.f75785b = new Double(address.getLatitude());
                dVarX4.f75786c = new Double(address.getLongitude());
                logger.debug("populateCurrentFields: Successfully updated all DTO fields");
            } else {
                logger.error("populateCurrentFields: Could not find current settings");
                unit = Unit.INSTANCE;
            }
            if (X4 == 0) {
                X4 = unit;
                X4 = dVarX4;
                z1.f23762a.getClass();
                logger.error("populateCurrentFields: Could not get address from ".concat(z1.b(locationC)));
                y0Var.m(z1.d(n.c(locationC)));
                X4 = x4();
                if (X4 != 0) {
                    X4.f75785b = new Double(locationC.getLatitude());
                }
                if (X4 != 0) {
                    X4.f75786c = new Double(locationC.getLongitude());
                }
            }
        } else {
            X4 = unit;
            X4 = dVarX4;
            z1.f23762a.getClass();
            logger.error("populateCurrentFields: Could not get address from ".concat(z1.b(locationC)));
            y0Var.m(z1.d(n.c(locationC)));
            X4 = x4();
            if (X4 != 0) {
                X4.f75785b = new Double(locationC.getLatitude());
            }
            if (X4 != 0) {
                X4.f75786c = new Double(locationC.getLongitude());
            }
        }
        if (X4 == 0) {
            logger.error("populateCurrentFields: Could not get user default weather location");
            Unit unit3 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void B4() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new d(null), 2);
    }

    public final g42.d x4() {
        j jVar = this.f47928d.f43524b;
        if (jVar != null) {
            return jVar.f185558w;
        }
        return null;
    }

    public final String y4(Context context) {
        String string;
        g.d dVarD = this.f47925a.d();
        if (dVarD != null && dVarD == g.d.STATIC) {
            String string2 = context.getString(R.string.weather_location_settings_footer_text2);
            string2.getClass();
            return string2;
        }
        j22.b.f96736a.getClass();
        int i14 = C0933b.f47934a[j22.b.j(context).ordinal()];
        if (i14 == 1) {
            string = j22.b.t() ? context.getString(R.string.weather_permission_always) : context.getString(R.string.lbl_on);
        } else if (i14 == 2) {
            string = context.getString(R.string.weather_permission_while_using);
        } else {
            if (i14 != 3 && i14 != 4) {
                u0.r();
                return null;
            }
            string = j22.b.t() ? context.getString(R.string.weather_permission_never) : context.getString(R.string.lbl_off);
        }
        string.getClass();
        if (j22.b.t()) {
            String string3 = context.getString(R.string.weather_location_settings_footer_text1, string);
            string3.getClass();
            return string3;
        }
        String string4 = context.getString(R.string.weather_location_settings_footer_text1_legacy, string);
        string4.getClass();
        return string4;
    }

    public final void z4(Context context, g.d dVar) {
        dVar.getClass();
        g.a aVar = g.f61293g;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        aVar.getClass();
        g.a.f(applicationContext, dVar);
        g42.d dVarX4 = x4();
        if (dVarX4 != null) {
            dVarX4.f75784a = dVar == g.d.STATIC;
        }
        this.f47925a.j(dVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "USER_HAS_SEEN_INFO_DIALOG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, boolean z14) {
            context.getClass();
            g.f61293g.getClass();
            g.a.b(context).edit().putBoolean("key_user_has_seen_info_dialog", z14).apply();
        }

        private a() {
        }
    }
}

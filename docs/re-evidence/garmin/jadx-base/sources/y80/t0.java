package y80;

import c22.t3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ly80/t0;", "Ly80/s0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lv90/e;", "profileSetupDelegate", "<init>", "(Lv90/e;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 implements s0, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f195220b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v90.e f195221a;

    static {
        new a(null);
    }

    public t0(v90.e eVar) {
        eVar.getClass();
        this.f195221a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    public static void c(z80.l lVar, UserSettingsDTO userSettingsDTO) {
        ?? arrayList;
        Double d14 = lVar.f203072a;
        if (d14 != null) {
            userSettingsDTO.S0(d14.doubleValue());
        }
        Double d15 = lVar.f203073b;
        if (d15 != null) {
            userSettingsDTO.s1(d15.doubleValue());
        }
        z80.k kVar = lVar.f203074c;
        if (kVar != null) {
            UserSettingsDTO.c.a aVar = UserSettingsDTO.c.f43531c;
            String str = kVar.f203071a;
            aVar.getClass();
            userSettingsDTO.P0(UserSettingsDTO.c.a.a(str));
        }
        b63.o oVar = lVar.f203075d;
        if (oVar != null) {
            LocalDate localDate = oVar.f16206a;
            userSettingsDTO.L0(new org.joda.time.LocalDate(localDate.getYear(), b63.b.b(oVar.c()), localDate.getDayOfMonth()));
        }
        gg1.o0 o0Var = lVar.f203076e;
        if (o0Var != null) {
            userSettingsDTO.V0(o0Var);
        }
        z80.m mVar = lVar.f203078g;
        if (mVar != null) {
            userSettingsDTO.Z0(mVar.f203085a);
            userSettingsDTO.j1(mVar.f203086b);
        }
        Boolean bool = lVar.f203081j;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            wi1.j jVar = userSettingsDTO.f43524b;
            if (jVar != null) {
                jVar.f185559x = zBooleanValue;
            }
        }
        List<wi1.l> list = userSettingsDTO.f43526d;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (p005kotlin.jvm.internal.s.g(((wi1.l) obj).getSleepWindowFrequency(), "DAILY")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        List<z80.j> list2 = lVar.f203079h;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (z80.j jVar2 : list2) {
                List<mb0.h> list3 = jVar2.f203062a;
                ArrayList arrayList3 = new ArrayList(p13.y.r(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new wi1.l(((mb0.h) it.next()).name(), jVar2.f203063b.f16219a.toSecondOfDay(), jVar2.f203064c.f16219a.toSecondOfDay()));
                }
                p13.d0.v(arrayList2, arrayList3);
            }
            userSettingsDTO.f43526d = f(p13.h0.C0((Collection) arrayList, arrayList2));
        } else {
            List<wi1.l> list4 = userSettingsDTO.f43526d;
            userSettingsDTO.f43526d = list4 != null ? f(list4) : null;
        }
        long j8 = lVar.f203077f;
        Long lValueOf = j8 != -1 ? Long.valueOf(j8) : null;
        if (lValueOf != null) {
            userSettingsDTO.M0(lValueOf.longValue());
        }
    }

    public static UserSettingsDTO d(qd2.a aVar) throws Throwable {
        String str;
        String[] strArrD = aVar.d(qd2.a.b.USER_SETTINGS);
        if (strArrD == null || (str = strArrD[1]) == null) {
            return null;
        }
        try {
            UserSettingsDTO userSettingsDTO = new UserSettingsDTO();
            userSettingsDTO.m(str);
            return userSettingsDTO;
        } catch (JSONException e4) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "UserProfileRepository Failed to parse user settings JSON from cache", e4);
            return null;
        }
    }

    public static ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((wi1.l) obj).getSleepWindowFrequency(), "DAILY")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!p005kotlin.jvm.internal.s.g(((wi1.l) obj2).getSleepWindowFrequency(), "DAILY")) {
                arrayList2.add(obj2);
            }
        }
        return p13.h0.C0(arrayList, p13.h0.N0(arrayList2, new v0()));
    }

    @Override // y80.s0
    public final Object a(ab0.b bVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new u0(this, null), bVar);
    }

    @Override // y80.s0
    public final Object b(z80.l lVar, z80.l lVar2, Set set, ab0.c cVar) {
        UserSettingsDTO userSettingsDTOD;
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null && (userSettingsDTOD = d(aVarB)) != null) {
            UserSettingsDTO userSettingsDTOC = userSettingsDTOD.C();
            c(lVar, userSettingsDTOC);
            UserSettingsDTO userSettingsDTOC2 = userSettingsDTOD.C();
            c(lVar2, userSettingsDTOC2);
            userSettingsDTOC2.f43528f = "BIC";
            ArrayList arrayListC0 = p13.h0.C0(p13.x.m("sourceType"), set);
            t3 t3Var = t3.f23255a;
            JSONObject jSONObjectT1 = userSettingsDTOC2.t1();
            JSONObject jSONObjectT2 = userSettingsDTOC.t1();
            t3Var.getClass();
            JSONObject jSONObjectC = t3.c(jSONObjectT1, jSONObjectT2, arrayListC0);
            return jSONObjectC == null ? Boolean.TRUE : this.f195221a.a(userSettingsDTOC2, jSONObjectC, cVar);
        }
        return Boolean.FALSE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Ly80/t0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DAILY_SLEEP_WINDOW_DAY_KEY", "", "DEFAULT_SLEEP_START_TIME_SECONDS_MIDNIGHT", "I", "DEFAULT_SLEEP_WAKE_TIME_SECONDS_MIDNIGHT", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

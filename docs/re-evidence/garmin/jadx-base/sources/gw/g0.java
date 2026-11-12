package gw;

import c22.u3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.joda.time.DateTime;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class g0 extends com.garmin.android.library.backgroundtaskmanagement.e<UserSettingsDTO> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f79501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f79502n;

    public g0(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject) {
        Integer avgCycleLength;
        Integer avgPeriodLength;
        Integer avgCycleLength2;
        Integer avgPeriodLength2;
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        if (userSettingsDTO == null || jSONObject != null) {
            this.f79501m = userSettingsDTO.t1().toString();
        } else {
            u3.f23286a.getClass();
            ww0.u uVar = userSettingsDTO.f43527e;
            if (uVar != null && (((avgCycleLength = uVar.getAvgCycleLength()) != null && avgCycleLength.intValue() == -1) || (((avgPeriodLength = uVar.getAvgPeriodLength()) != null && avgPeriodLength.intValue() == -1) || p005kotlin.jvm.internal.s.g(uVar.getInactiveReportTimestamp(), new DateTime(-1L))))) {
                if (p005kotlin.jvm.internal.s.g(uVar.getInactiveReportTimestamp(), new DateTime(-1L))) {
                    if (uVar.getMenstrualCycleType() == ww0.a.INACTIVE) {
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.SETTINGS;
                        aVar2.getClass();
                        i2.a.b(a2Var, "UserSettingsUtils", "MCT: has defaults or invalid configuration , set it to null");
                        userSettingsDTO.f43527e = null;
                    } else {
                        uVar.y(null);
                        if (uVar.getMenstrualCycleType() != ww0.a.REGULAR) {
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var2 = a2.SETTINGS;
                            aVar3.getClass();
                            i2.a.b(a2Var2, "UserSettingsUtils", "MCT: REGULAR | IRREGULAR holds the -1's which is not expected , set MCT to null");
                            userSettingsDTO.f43527e = null;
                        } else {
                            i2.a aVar4 = i2.f36769a;
                            a2 a2Var3 = a2.SETTINGS;
                            aVar4.getClass();
                            i2.a.b(a2Var3, "UserSettingsUtils", "MCT: REGULAR | IRREGULAR holds the -1's which is not expected , set MCT to null");
                            userSettingsDTO.f43527e = null;
                        }
                    }
                } else if ((uVar.getMenstrualCycleType() != ww0.a.REGULAR || uVar.getMenstrualCycleType() == ww0.a.IRREGULAR) && (avgCycleLength2 = uVar.getAvgCycleLength()) != null && avgCycleLength2.intValue() == -1 && (avgPeriodLength2 = uVar.getAvgPeriodLength()) != null && avgPeriodLength2.intValue() == -1) {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.SETTINGS;
                    aVar5.getClass();
                    i2.a.b(a2Var4, "UserSettingsUtils", "MCT: REGULAR | IRREGULAR holds the -1's which is not expected , set MCT to null");
                    userSettingsDTO.f43527e = null;
                } else {
                    Integer avgCycleLength3 = uVar.getAvgCycleLength();
                    if (avgCycleLength3 != null && avgCycleLength3.intValue() == -1) {
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var5 = a2.SETTINGS;
                        aVar6.getClass();
                        i2.a.b(a2Var5, "UserSettingsUtils", "MCT:AvgCycleLength is negative");
                        uVar.k(null);
                    }
                    Integer avgPeriodLength3 = uVar.getAvgPeriodLength();
                    if (avgPeriodLength3 != null && avgPeriodLength3.intValue() == -1) {
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var6 = a2.SETTINGS;
                        aVar7.getClass();
                        i2.a.b(a2Var6, "UserSettingsUtils", "MCT:AvgPeriodLength is negative");
                        uVar.m(null);
                    }
                }
            }
            this.f79501m = userSettingsDTO.t1().toString();
        }
        if (jSONObject != null) {
            this.f79502n = jSONObject.toString();
        }
        j jVar = new j(this, 1);
        String str = this.f79502n;
        if (str != null) {
            b(new jw.z(this, str, jVar));
        } else {
            b(new jw.z(this, this.f79501m, jVar));
        }
    }

    public g0(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, UserSettingsDTO userSettingsDTO) {
        this(aVar, userSettingsDTO, null);
    }
}

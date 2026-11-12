package defpackage;

import android.text.TextUtils;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.sport.model.CourseEnvParams;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class ifk {
    public static float a(float f, int i) {
        float f2 = (f * 100.0f) / i;
        if (f2 > 100.0f) {
            return 100.0f;
        }
        return f2;
    }

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i != 3) {
            return i;
        }
        return 2;
    }

    public static float c(int i, float f) {
        return (i * f) / 100.0f;
    }

    public static boolean e(int i) {
        return i >= 40 && i <= 220;
    }

    public static List<gze> b(List<ChoreographedSingleAction> list, CourseEnvParams courseEnvParams) {
        gzf gzfVarF;
        int maxThreshold;
        boolean zJ;
        HeartZoneConf heartZoneConfA;
        if (courseEnvParams != null) {
            gzfVarF = courseEnvParams.f();
            heartZoneConfA = courseEnvParams.a();
            zJ = courseEnvParams.j();
            maxThreshold = heartZoneConfA != null ? courseEnvParams.a().getMaxThreshold() : 0;
        } else {
            gzfVarF = null;
            maxThreshold = 0;
            zJ = false;
            heartZoneConfA = null;
        }
        int size = list.size();
        int i = size + 1;
        ArrayList arrayList = new ArrayList(i);
        gzy gzyVar = new gzy();
        for (int i2 = 0; i2 < size; i2++) {
            ChoreographedSingleAction choreographedSingleAction = list.get(i2);
            if (choreographedSingleAction != null && choreographedSingleAction.getTargetConfig() != null) {
                int iB = (choreographedSingleAction.getAction() == null || choreographedSingleAction.getAction().getId() == null) ? 0 : gzyVar.b(choreographedSingleAction.getAction().getId().trim());
                if (iB != 0) {
                    choreographedSingleAction.getAction().setName(BaseApplication.getContext().getString(iB));
                }
                gze gzeVarC = c(maxThreshold, size, i2, choreographedSingleAction);
                a(gzfVarF, zJ, heartZoneConfA, choreographedSingleAction, gzeVarC);
                gzeVarC.d(choreographedSingleAction.getAction().getId());
                arrayList.add(gzeVarC);
            }
        }
        arrayList.add(new gze(BaseApplication.getContext().getResources().getString(R.string.sug_run_workout_complete), 200, 1.0f, i, i));
        return arrayList;
    }

    private static void a(gzf gzfVar, boolean z, HeartZoneConf heartZoneConf, ChoreographedSingleAction choreographedSingleAction, gze gzeVar) {
        if (choreographedSingleAction.getIntensityConfig() == null || TextUtils.isEmpty(choreographedSingleAction.getIntensityConfig().getId())) {
            return;
        }
        gzeVar.d(hcc.c(choreographedSingleAction.getIntensityConfig(), gzfVar, heartZoneConf, z));
    }

    private static gze c(int i, int i2, int i3, ChoreographedSingleAction choreographedSingleAction) {
        int i4;
        int iC = ien.c(choreographedSingleAction);
        int iJ = CommonUtil.j(choreographedSingleAction.getTargetConfig().getId());
        long millis = iC;
        if (iJ == 0) {
            i4 = 1;
        } else {
            int i5 = 0;
            if (iJ == 1) {
                millis = TimeUnit.SECONDS.toMillis(millis);
            } else if (iJ == 3) {
                iC *= 1000;
                millis = iC;
                i5 = 2;
            } else {
                if (iJ == 5 || iJ == 4) {
                    int iD = (int) UnitUtil.d((i * iC) / 100.0f, 0);
                    millis = iD;
                    iC = iD;
                }
                i4 = iJ;
            }
            i4 = i5;
        }
        return new gze(e(choreographedSingleAction, iC, iJ), i4, millis, i3 + 1, i2 + 1);
    }

    private static String e(ChoreographedSingleAction choreographedSingleAction, long j, int i) {
        String string;
        String string2;
        String string3 = "";
        if (choreographedSingleAction.getAction() == null) {
            return "";
        }
        if (i == 0) {
            if (UnitUtil.f()) {
                string3 = UnitUtil.e((long) UnitUtil.e(j, 1), 1, 0);
                string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_ft);
            } else {
                string3 = NumberFormat.getInstance().format(j);
                string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
            }
        } else {
            if (i == 1) {
                return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_share_date, choreographedSingleAction.getAction().getName(), c(j));
            }
            if (i == 3) {
                string3 = String.valueOf(j / 1000);
                string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_band_data_sport_energy_unit);
            } else {
                if (i == 5 || i == 4) {
                    string3 = new StringBuffer(" ").append(d(i, j)).toString();
                    string = BaseApplication.getContext().getResources().getString(R.string.IDS_main_watch_heart_rate_string);
                } else if (i == 255) {
                    string2 = "";
                } else {
                    string = UnitUtil.e(j, 1, 0);
                }
                String str = string3;
                string3 = string;
                string2 = str;
            }
        }
        return e(choreographedSingleAction.getAction().getName(), string3, string2);
    }

    private static String d(int i, long j) {
        if (i == 4) {
            int iD = (int) UnitUtil.d(j, 0);
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.sug_courses_heart_rate_height, iD, Integer.valueOf(iD));
        }
        int iD2 = (int) UnitUtil.d(j, 0);
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.sug_courses_heart_rate_lower, iD2, Integer.valueOf(iD2));
    }

    private static String c(long j) {
        int i = (int) j;
        int i2 = i / 3600;
        int i3 = ((int) (j % 3600)) / 60;
        int i4 = i % 60;
        NumberFormat numberFormat = NumberFormat.getInstance();
        StringBuilder sb = new StringBuilder();
        if (i2 != 0) {
            sb.append(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hour_string, i2, numberFormat.format(i2)));
        }
        if (i3 != 0) {
            sb.append(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_min, i3, numberFormat.format(i3)));
        }
        if (i4 != 0) {
            sb.append(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_second, i4, numberFormat.format(i4)));
        }
        return sb.toString();
    }

    private static String e(String str, String str2, String str3) {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_share_date, str, BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_share_date, str2, str3));
    }

    public static float d(HeartZoneConf heartZoneConf, float f) {
        if (heartZoneConf != null) {
            return (heartZoneConf.getMaxThreshold() * f) / 100.0f;
        }
        return 0.0f;
    }

    public static float e(HeartZoneConf heartZoneConf, float f) {
        if (heartZoneConf != null) {
            return c(heartZoneConf.getMaxThreshold() - heartZoneConf.getRestHeartRate(), f) + heartZoneConf.getRestHeartRate();
        }
        return 0.0f;
    }

    public static int c(HeartZoneConf heartZoneConf, int i, int i2, boolean z) {
        float fD;
        if (i != 1) {
            if (i == 4) {
                return e(heartZoneConf, i2, z, 0);
            }
            if (i != 14) {
                if (i == 17) {
                    return b(heartZoneConf, i2, z);
                }
                if (i == 7) {
                    fD = e(heartZoneConf, i2);
                } else if (i != 8) {
                    return 0;
                }
            }
            return e(heartZoneConf, i2, z, 1);
        }
        fD = d(heartZoneConf, i2);
        return (int) fD;
    }

    public static int e(HeartZoneConf heartZoneConf, int i, boolean z, int i2) {
        if (heartZoneConf == null) {
            return 0;
        }
        return heartZoneConf.getZoneValue(i - 1, z, i2);
    }

    public static int b(HeartZoneConf heartZoneConf, int i, boolean z) {
        if (heartZoneConf == null) {
            return 0;
        }
        return heartZoneConf.getZoneValue(i - 1, z);
    }
}

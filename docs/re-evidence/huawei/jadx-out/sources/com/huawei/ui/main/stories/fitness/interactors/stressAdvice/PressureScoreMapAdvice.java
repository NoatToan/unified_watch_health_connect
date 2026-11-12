package com.huawei.ui.main.stories.fitness.interactors.stressAdvice;

import com.huawei.ui.main.R;
import defpackage.ltb;
import defpackage.ugh;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class PressureScoreMapAdvice {
    public static int b(long j, int i) {
        int iC = c(j);
        int iE = e(i);
        if (iC == 1) {
            if (iE == 1) {
                return PressureAdvice.MORNING_RELAX.getAdviceRes();
            }
            if (iE == 2) {
                return PressureAdvice.MORNING_NORMAL.getAdviceRes();
            }
            if (iE == 3) {
                return PressureAdvice.MORNING_MEDIUM.getAdviceRes();
            }
            if (iE == 4) {
                return PressureAdvice.MORNING_HIGH.getAdviceRes();
            }
        }
        if (iC == 2) {
            if (iE == 1) {
                return PressureAdvice.DAYTIME_RELAX.getAdviceRes();
            }
            if (iE == 2) {
                return PressureAdvice.DAYTIME_NORMAL.getAdviceRes();
            }
            if (iE == 3) {
                return PressureAdvice.DAYTIME_MEDIUM.getAdviceRes();
            }
            if (iE == 4) {
                return PressureAdvice.DAYTIME_HIGH.getAdviceRes();
            }
        }
        if (iC == 3) {
            if (iE == 1) {
                return PressureAdvice.EVENING_RELAX.getAdviceRes();
            }
            if (iE == 2) {
                return PressureAdvice.EVENING_NORMAL.getAdviceRes();
            }
            if (iE == 3) {
                return PressureAdvice.EVENING_MEDIUM.getAdviceRes();
            }
            if (iE == 4) {
                return PressureAdvice.EVENING_HIGH.getAdviceRes();
            }
        }
        return PressureAdvice.DEFAULT.getAdviceRes();
    }

    private static int c(long j) {
        int iA = a(j);
        if (iA >= 0 && iA < 52200.0f) {
            return 1;
        }
        float f = iA;
        if (f < 52200.0f || f >= 73800.0f) {
            return (f < 73800.0f || iA >= 86400) ? 0 : 3;
        }
        return 2;
    }

    private static int e(int i) {
        if (ugh.j(i)) {
            return 1;
        }
        if (ugh.c(i)) {
            return 2;
        }
        if (ugh.e(i)) {
            return 3;
        }
        return ugh.b(i) ? 4 : 0;
    }

    private static int a(long j) {
        return ((int) (j - ltb.b(new Date(j)).getTime())) / 1000;
    }

    /* JADX INFO: loaded from: classes43.dex */
    public enum PressureAdvice {
        MORNING_RELAX(R.string.IDS_pressure_advice_1002),
        MORNING_NORMAL(R.string.IDS_pressure_advice_2004),
        MORNING_MEDIUM(R.string.IDS_pressure_advice_2006),
        MORNING_HIGH(R.string.IDS_pressure_advice_2008),
        DAYTIME_RELAX(R.string.IDS_pressure_advice_1002),
        DAYTIME_NORMAL(R.string.IDS_pressure_advice_2004),
        DAYTIME_MEDIUM(R.string.IDS_pressure_advice_2014),
        DAYTIME_HIGH(R.string.IDS_pressure_advice_2016),
        EVENING_RELAX(R.string.IDS_pressure_advice_1002),
        EVENING_NORMAL(R.string.IDS_pressure_advice_1004),
        EVENING_MEDIUM(R.string.IDS_pressure_advice_1006),
        EVENING_HIGH(R.string.IDS_pressure_advice_1008),
        DEFAULT(R.string.IDS_pressure_advice_3002);

        private final int mAdviceRes;

        PressureAdvice(int i) {
            this.mAdviceRes = i;
        }

        public int getAdviceRes() {
            return this.mAdviceRes;
        }
    }
}

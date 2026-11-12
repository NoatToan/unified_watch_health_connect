package km1;

import java.util.ArrayList;
import java.util.List;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x0177  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:158:0x020c  */
    /* JADX WARN: Code duplicated, block: B:185:0x024e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0258  */
    /* JADX WARN: Code duplicated, block: B:193:0x0262  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:90:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0144  */
    public static final List<w> a(a0 a0Var, String str, int i14, int i15, boolean z14) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        d dVar;
        if (a0Var == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        y yVar = y.f105621a;
        String sleepHistoryAdjustment = a0Var.getSleepHistoryAdjustment();
        yVar.getClass();
        if (sleepHistoryAdjustment != null) {
            switch (sleepHistoryAdjustment) {
                case "INCREASING_LOW_QUALITY":
                    eVar = e.LOW_QUALITY_SLEEP_RECENTLY;
                    break;
                case "DECREASING_HIGH_QUALITY":
                    eVar = e.HIGH_QUALITY_SLEEP_RECENTLY;
                    break;
                case "INCREASING":
                    eVar = e.PATTERN_OF_SHORT_SLEEP;
                    break;
                case "DECREASING":
                    eVar = e.GOOD_SLEEP_DURATION;
                    break;
                default:
                    eVar = null;
                    break;
            }
        } else {
            eVar = null;
        }
        if (h0.R(p13.x.k("INCREASING", "INCREASING_LOW_QUALITY"), a0Var.getSleepHistoryAdjustment())) {
            arrayList.add(new w.a(c0.SLEEP_HISTORY, eVar, d.POOR));
        }
        if (h0.R(p13.x.k("DECREASING", "DECREASING_HIGH_QUALITY"), a0Var.getSleepHistoryAdjustment())) {
            arrayList.add(new w.a(c0.SLEEP_HISTORY, eVar, d.GOOD));
        }
        if (z14) {
            f0 f0Var = f0.f105522a;
            String trainingFeedback = a0Var.getTrainingFeedback();
            f0Var.getClass();
            if (trainingFeedback != null) {
                switch (trainingFeedback) {
                    case "DAILY_ACTIVITY":
                        eVar2 = e.VERY_ACTIVE_DAY;
                        break;
                    case "DAILY_ACTIVITY_AND_TODAYS_LOAD":
                        eVar2 = e.HARD_TRAINING_TODAY;
                        break;
                    case "LOW_ACWR_BUT_CHRONIC":
                        eVar2 = e.LESS_TRAINING_BUT_STILL_CATCHING_UP;
                        break;
                    case "TODAYS_LOAD_AND_CHRONIC":
                    case "TODAYS_LOAD":
                        eVar2 = e.HARD_TRAINING_TODAY;
                        break;
                    case "HIGH_ACWR_AND_CHRONIC":
                    case "DAILY_ACTIVITY_AND_HIGH_ACWR":
                        eVar2 = e.HIGH_TRAINING_LOAD_RECENTLY;
                        break;
                    case "DAILY_ACTIVITY_AND_CHRONIC":
                    case "CHRONIC":
                        eVar2 = e.HIGH_CHRONIC_TRAINING_LOAD;
                        break;
                    case "HIGH_ACWR":
                        eVar2 = e.HIGH_TRAINING_LOAD_RECENTLY;
                        break;
                    default:
                        eVar2 = null;
                        break;
                }
            } else {
                eVar2 = null;
            }
        } else {
            f0 f0Var2 = f0.f105522a;
            String trainingFeedback2 = a0Var.getTrainingFeedback();
            f0Var2.getClass();
            if (trainingFeedback2 != null) {
                switch (trainingFeedback2) {
                    case "DAILY_ACTIVITY":
                    case "DAILY_ACTIVITY_AND_TODAYS_LOAD":
                        eVar2 = e.VERY_ACTIVE_DAY;
                        break;
                    case "LOW_ACWR_BUT_CHRONIC":
                        eVar2 = e.LESS_ACTIVE_BUT_STILL_CATCHING_UP;
                        break;
                    case "TODAYS_LOAD_AND_CHRONIC":
                    case "TODAYS_LOAD":
                        eVar2 = e.VERY_ACTIVE_DAY;
                        break;
                    case "HIGH_ACWR_AND_CHRONIC":
                        eVar2 = e.MORE_ACTIVE_RECENTLY;
                        break;
                    case "DAILY_ACTIVITY_AND_HIGH_ACWR":
                        eVar2 = e.HIGHLY_ACTIVE_RECENTLY;
                        break;
                    case "DAILY_ACTIVITY_AND_CHRONIC":
                    case "CHRONIC":
                        eVar2 = e.HIGHLY_ACTIVE_LAST_FEW_WEEKS;
                        break;
                    case "HIGH_ACWR":
                        eVar2 = e.HIGHLY_ACTIVE_RECENTLY;
                        break;
                    default:
                        eVar2 = null;
                        break;
                }
            } else {
                eVar2 = null;
            }
        }
        f0.f105522a.getClass();
        if (h0.R(p13.x.k("TODAYS_LOAD_AND_CHRONIC", "HIGH_ACWR_AND_CHRONIC", "DAILY_ACTIVITY_AND_CHRONIC", "DAILY_ACTIVITY_AND_TODAYS_LOAD", "DAILY_ACTIVITY_AND_HIGH_ACWR", "TODAYS_LOAD", "HIGH_ACWR", "CHRONIC", "DAILY_ACTIVITY", "LOW_ACWR_BUT_CHRONIC"), a0Var.getTrainingFeedback())) {
            if (z14) {
                String trainingFeedback3 = a0Var.getTrainingFeedback();
                if (trainingFeedback3 != null) {
                    switch (trainingFeedback3) {
                        case "DAILY_ACTIVITY":
                            dVar = d.ACTIVE_DAY;
                            break;
                        case "DAILY_ACTIVITY_AND_TODAYS_LOAD":
                            dVar = d.HIGH_LOAD_TODAY;
                            break;
                        case "LOW_ACWR_BUT_CHRONIC":
                            dVar = d.ACTIVE_TRAINING;
                            break;
                        case "TODAYS_LOAD_AND_CHRONIC":
                            dVar = d.HIGH_LOAD;
                            break;
                        case "TODAYS_LOAD":
                            dVar = d.HIGH_LOAD_TODAY;
                            break;
                        case "HIGH_ACWR_AND_CHRONIC":
                        case "DAILY_ACTIVITY_AND_HIGH_ACWR":
                            dVar = d.HIGH_LOAD;
                            break;
                        case "DAILY_ACTIVITY_AND_CHRONIC":
                        case "CHRONIC":
                            dVar = d.ACTIVE_TRAINING;
                            break;
                        case "HIGH_ACWR":
                            dVar = d.HIGH_LOAD;
                            break;
                        default:
                            dVar = null;
                            break;
                    }
                } else {
                    dVar = null;
                }
            } else {
                String trainingFeedback4 = a0Var.getTrainingFeedback();
                if (trainingFeedback4 != null) {
                    switch (trainingFeedback4) {
                        case "DAILY_ACTIVITY":
                            dVar = d.ACTIVE_DAY;
                            break;
                        case "DAILY_ACTIVITY_AND_TODAYS_LOAD":
                            dVar = d.HIGH_STRAIN_TODAY;
                            break;
                        case "LOW_ACWR_BUT_CHRONIC":
                            dVar = d.HIGH_LONG_TERM_STRAIN;
                            break;
                        case "TODAYS_LOAD_AND_CHRONIC":
                            dVar = d.HIGH_STRAIN;
                            break;
                        case "TODAYS_LOAD":
                            dVar = d.HIGH_STRAIN_TODAY;
                            break;
                        case "HIGH_ACWR_AND_CHRONIC":
                        case "DAILY_ACTIVITY_AND_HIGH_ACWR":
                            dVar = d.HIGH_STRAIN;
                            break;
                        case "DAILY_ACTIVITY_AND_CHRONIC":
                        case "CHRONIC":
                            dVar = d.HIGH_LONG_TERM_STRAIN;
                            break;
                        case "HIGH_ACWR":
                            dVar = d.HIGH_STRAIN;
                            break;
                        default:
                            dVar = null;
                            break;
                    }
                } else {
                    dVar = null;
                }
            }
            arrayList.add(new w.a(c0.ACTIVITY_HISTORY, eVar2, dVar));
        }
        if (h0.R(j0.f134944a, a0Var.getTrainingFeedback())) {
            arrayList.add(new w.a(c0.ACTIVITY_HISTORY, eVar2, null, 4, null));
        }
        d dVarValueOf = str != null ? d.valueOf(str) : null;
        h.f105524a.getClass();
        if (h0.R(p13.w.c("INCREASING"), a0Var.getHrvAdjustment())) {
            arrayList.add(new w.a(c0.HRV_STATUS, e.LOWER_THAN_USUAL_RECENTLY, dVarValueOf));
        }
        if (h0.R(p13.w.c("DECREASING"), a0Var.getHrvAdjustment())) {
            arrayList.add(new w.a(c0.HRV_STATUS, e.ADAPTING_WELL_TO_STRAIN, dVarValueOf));
        }
        if (i15 > 0 && i14 > 0) {
            j.f105531a.getClass();
            if (i14 != 0) {
                if (i14 != 1) {
                    eVar4 = i14 != 2 ? e.MORE_THAN_TWO_NAPS : e.TWO_NAPS;
                } else {
                    eVar4 = e.ONE_NAP;
                }
                eVar3 = eVar4;
            } else {
                eVar3 = null;
            }
            arrayList.add(new w.b(c0.NAPS, eVar3, i14, Integer.valueOf(i15), null, 16, null));
        }
        return arrayList;
    }
}

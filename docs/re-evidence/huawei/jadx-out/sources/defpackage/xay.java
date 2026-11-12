package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.FitDesign;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport;
import java.io.File;

/* JADX INFO: loaded from: classes20.dex */
public class xay {
    public static File d(HiHealthData hiHealthData, String str) {
        BaseSport baseSportD = d(hiHealthData.getSubType());
        if (baseSportD == null) {
            LogUtil.j("FitFileUtils", "generateFitFile,BaseSport is null ");
            return null;
        }
        return baseSportD.translateToFit(hiHealthData, str);
    }

    private static BaseSport d(int i) {
        LogUtil.a("FitFileUtils", "getSport,subType is", Integer.valueOf(i));
        switch (i) {
            case 194:
                return new xbk();
            case 195:
                return new xbi();
            case 199:
                return new xbb();
            case 202:
                return new xbg();
            case 203:
                return new xbh();
            case 217:
            case 218:
            case 219:
                return new xbj();
            case 227:
            case 258:
            case 264:
            case OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE /* 280 */:
                return new xbe();
            case 257:
            case 281:
            case 282:
                return new xbo();
            case 259:
            case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                return new xbf();
            case 262:
            case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                return new xbl();
            case OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE /* 274 */:
                return new xbd();
            default:
                return a(i);
        }
    }

    private static BaseSport a(int i) {
        if (i == 130) {
            return new xax(FitDesign.ActivityType.TENNIS.getTypeId(), FitDesign.SubActivityType.GENERIC.getTypeId());
        }
        if (i == 140) {
            return new xax(FitDesign.ActivityType.TRAINING.getTypeId(), FitDesign.SubActivityType.STRENGTH_TRAINING.getTypeId());
        }
        if (i == 143) {
            return new xax(FitDesign.ActivityType.HIIT.getTypeId(), FitDesign.SubActivityType.HIIT.getTypeId());
        }
        if (i == 210) {
            return new xax(FitDesign.ActivityType.ROCK_CLIMBING.getTypeId(), FitDesign.SubActivityType.GENERIC.getTypeId());
        }
        if (i == 273) {
            return new xbc();
        }
        if (i == 275) {
            return new xax(FitDesign.ActivityType.GENERIC.getTypeId(), FitDesign.SubActivityType.STAIR_CLIMBING.getTypeId());
        }
        if (i == 279) {
            return new xax(FitDesign.ActivityType.TRAINING.getTypeId(), FitDesign.SubActivityType.EXERCISE.getTypeId());
        }
        if (i == 137) {
            return new xax(FitDesign.ActivityType.TRAINING.getTypeId(), FitDesign.SubActivityType.YOGA.getTypeId());
        }
        if (i == 138) {
            return new xax(FitDesign.ActivityType.FITNESS_EQUIPMENT.getTypeId(), FitDesign.SubActivityType.PILATES.getTypeId());
        }
        LogUtil.j("FitFileUtils", "getSport,subType is error ,subType:", Integer.valueOf(i));
        return null;
    }
}

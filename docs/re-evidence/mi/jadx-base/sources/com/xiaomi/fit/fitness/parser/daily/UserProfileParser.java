package com.xiaomi.fit.fitness.parser.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.FitnessUserInfo;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/UserProfileParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "reportDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "processUserProfile", "Lcom/xiaomi/fit/fitness/parser/data/FitnessUserInfo;", "map", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "setUserInfo", "", "valueItem", "userInfo", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "UserProfileParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] reportDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, true, null, false, null, 112, null), new FitnessDataBaseParser.OneDimenDataType(2, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(4, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(6, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(7, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(8, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(9, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(10, 4, 2, true, null, false, null, 112, null), new FitnessDataBaseParser.OneDimenDataType(11, 1, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(12, 2, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(13, 2, 4, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/UserProfileParser$DataType;", "", "<init>", "()V", "height", "", "weight", MedicalIdSPContract.PREF_BIRTHDAY, "gender", "v02max", "maxHr", "historyMinHr", "historyMaxHr", "goalCalorie", "goalSteps", "maximalMet", "goalValidStand", "goalSleepDuration", "goalMHIntensity", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int birth = 2;
        public static final int gender = 3;
        public static final int goalCalorie = 8;
        public static final int goalMHIntensity = 13;
        public static final int goalSleepDuration = 12;
        public static final int goalSteps = 9;
        public static final int goalValidStand = 11;
        public static final int height = 0;
        public static final int historyMaxHr = 7;
        public static final int historyMinHr = 6;
        public static final int maxHr = 5;
        public static final int maximalMet = 10;
        public static final int v02max = 4;
        public static final int weight = 1;

        private DataType() {
        }
    }

    private final FitnessUserInfo processUserProfile(Map<Integer, FitnessDataBaseParser.DataValueItem> map) {
        FitnessUserInfo fitnessUserInfo = new FitnessUserInfo();
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.reportDataTypeArray) {
            setUserInfo(map.get(Integer.valueOf(oneDimenDataType.getType())), fitnessUserInfo);
        }
        return fitnessUserInfo;
    }

    private final void setUserInfo(FitnessDataBaseParser.DataValueItem valueItem, FitnessUserInfo userInfo) {
        if (valueItem == null || !valueItem.getValid()) {
            return;
        }
        switch (valueItem.getType()) {
            case 0:
                userInfo.setHeight(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 1:
                userInfo.setWeight(Float.valueOf(valueItem.getValue().floatValue()));
                break;
            case 2:
                userInfo.setBirth(String.valueOf(valueItem.getValue().longValue()));
                break;
            case 3:
                userInfo.setGender(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 4:
                userInfo.setVo2Max(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 5:
                userInfo.setMaxHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 6:
                userInfo.setHistoryMinHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 7:
                userInfo.setHistoryMaxHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 8:
                userInfo.setGoalCal(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 9:
                userInfo.setGoalStep(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 10:
                float fFloatValue = valueItem.getValue().floatValue();
                FitnessLogUtils.d(this.TAG, "maximalMet: " + fFloatValue);
                if (fFloatValue < 6.0f || fFloatValue > 25.0f) {
                    fFloatValue = 0.0f;
                }
                userInfo.setMaximalMet(Float.valueOf(fFloatValue));
                break;
            case 11:
                userInfo.setGoalStand(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 12:
                userInfo.setGoalSleep(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 13:
                userInfo.setGoalMhs(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            default:
                FitnessLogUtils.w(this.TAG, "no support type = " + valueItem.getType());
                break;
        }
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        FitnessDataId dataId = binaryData.getDataId();
        if (binaryData.getDataValid() == null) {
            FitnessLogUtils.w(this.TAG, "not support parse " + dataId);
            return null;
        }
        Map<Integer, FitnessDataBaseParser.DataValueItem> reportData = OneDimenDataParser.INSTANCE.parseReportData(this.reportDataTypeArray, binaryData);
        if (reportData == null || reportData.isEmpty()) {
            FitnessLogUtils.w(this.TAG, "parse failed (" + dataId + ")");
            return null;
        }
        FitnessUserInfo fitnessUserInfoProcessUserProfile = processUserProfile(reportData);
        FitnessLogUtils.i(this.TAG, "userInfo(" + fitnessUserInfoProcessUserProfile + ")");
        return new FitnessParseResult.Builder().userInfo(fitnessUserInfoProcessUserProfile).build();
    }
}

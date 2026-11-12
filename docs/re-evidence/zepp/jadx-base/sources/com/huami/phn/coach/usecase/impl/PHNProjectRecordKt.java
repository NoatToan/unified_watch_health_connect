package com.huami.phn.coach.usecase.impl;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.datepicker.UtcDates;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.koin.PhnDeviceNameDelegate;
import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.coach.usecase.impl.PHNProjectRecordKt;
import com.huami.phn.core.model.PHNCardData;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.model.RecommendState;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.MKTime;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\b\u001a\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0005H\u0082\b\u001a\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0005H\u0082\b\u001a\u0017\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0082\b\u001a\u0015\u0010\u0014\u001a\u00020\u0013*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0082\b\u001a\r\u0010\u0016\u001a\u00020\u000b*\u00020\u0015H\u0082\b\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u0005H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0000H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0011*\u00020\u000bH\u0002\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0011*\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001c\u0010\u0018\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001e\u0010\u001f\"\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%\"\u0016\u0010'\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010%\"\u0016\u0010(\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010%\"\u001a\u0010,\u001a\u00020)*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/huami/phn/core/model/PHNProjectRecord;", "Lcom/huami/phn/coach/usecase/PlanDetail;", "toPlanDetail", "Lcom/huami/phn/core/model/PHNCardData;", "toPlanCardData", "Lkotlinx/serialization/json/JsonObject;", "", BloodPressureConst.ParamKey.PLANID, "", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "getDailyAnalysis", "Ljava/util/Calendar;", z.j, "Lcom/huami/phn/coach/usecase/PlanDetail$DailyPlan;", GoogleApiAvailabilityLight.a, "date", "m", "", "index", "Lcom/huami/phn/coach/usecase/PlanDetail$TaringPlan;", "i", "Lcom/huami/phn/core/model/PHNProjectRecord$PHNProjectSetting$TimeStampAndZone;", "l", "c", "(Lkotlinx/serialization/json/JsonObject;)Ljava/lang/Integer;", "Lcom/huami/phn/core/model/RecommendState;", "h", hl.k, "g", "", "f", "(Lkotlinx/serialization/json/JsonObject;)Ljava/lang/Float;", "", "a", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "PHN_DAILY_ANALYSIS_COUNT", "PLAN_ON_GOING_TODAY_NO_PLAN", "PLAN_ON_GOING_TODAY_UN_FINISH", "Lcom/huami/phn/coach/koin/PhnDeviceNameDelegate;", "e", "(Lcom/huami/phn/core/model/PHNProjectRecord;)Lcom/huami/phn/coach/koin/PhnDeviceNameDelegate;", "deviceNameDelegate", "phn_coach_release"}, k = 2, mv = {1, 5, 1})
public final class PHNProjectRecordKt {
    public static final int PLAN_ON_GOING_TODAY_NO_PLAN = 4;
    public static final int PLAN_ON_GOING_TODAY_UN_FINISH = 7;

    @NotNull
    private static final String a = "PHNProjectRecord.toPlanDetail";
    private static final int b = 42;

    /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001d\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0014\u001a\u0004\u0018\u00010\r8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0019\u001a\u00020\u00158V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\u00020\u00158V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0018R\u001d\u0010(\u001a\u00020\u001f8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\"¨\u0006)"}, d2 = {"com/huami/phn/coach/usecase/impl/PHNProjectRecordKt$toPlanCardData$1", "Lcom/huami/phn/core/model/PHNCardData;", "", "b", "Lkotlin/Lazy;", "getTimestamp", "()J", "timestamp", "Lcom/huami/phn/core/model/PHNCardData$State;", "c", "getState", "()Lcom/huami/phn/core/model/PHNCardData$State;", "state", "Ljava/util/Calendar;", GoogleApiAvailabilityLight.a, "getStart", "()Ljava/util/Calendar;", "start", "e", "getUpdate", "update", "", "f", "getDailyPercent", "()I", "dailyPercent", "", "g", "getTsbValue", "()F", "tsbValue", "", "h", "getHasPlan", "()Z", "hasPlan", "i", "getFlag", "flag", z.j, "isRestDay", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends PHNCardData {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy timestamp = LazyKt__LazyJVMKt.lazy(new g());

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy start;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Lazy update;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Lazy dailyPercent;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final Lazy tsbValue;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private final Lazy hasPlan;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        private final Lazy flag;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        private final Lazy isRestDay;
        public final /* synthetic */ PHNProjectRecord k;

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Integer> {
            public final /* synthetic */ PHNProjectRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PHNProjectRecord pHNProjectRecord) {
                super(0);
                this.a = pHNProjectRecord;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                Object objM3845constructorimpl;
                JsonPrimitive jsonPrimitive;
                JsonObject result = this.a.getResult();
                int iIntValue = 0;
                if (result != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        JsonElement jsonElement = (JsonElement) result.get((Object) "percent_completed_daily_trimp");
                        Integer numValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Integer.valueOf(JsonElementKt.getInt(jsonPrimitive));
                        objM3845constructorimpl = Result.m3845constructorimpl(numValueOf == null ? null : Integer.valueOf(numValueOf.intValue()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getDailyPercent$2$1(thM3848exceptionOrNullimpl));
                    }
                    Integer num = (Integer) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                }
                return Integer.valueOf(iIntValue);
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Integer> {
            public final /* synthetic */ PHNProjectRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PHNProjectRecord pHNProjectRecord) {
                super(0);
                this.a = pHNProjectRecord;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                Object objM3845constructorimpl;
                JsonObject jsonObject;
                JsonElement jsonElement;
                JsonPrimitive jsonPrimitive;
                JsonObject result = this.a.getResult();
                int iIntValue = 0;
                if (result != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        JsonElement jsonElement2 = (JsonElement) result.get((Object) "exercise_recommended_info");
                        objM3845constructorimpl = Result.m3845constructorimpl((jsonElement2 == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement2)) == null || (jsonElement = (JsonElement) jsonObject.get((Object) "flag_recommended_exercise")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Integer.valueOf(JsonElementKt.getInt(jsonPrimitive)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getRecommendFlag$2$1(thM3848exceptionOrNullimpl));
                    }
                    Integer num = (Integer) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                }
                return Integer.valueOf(iIntValue);
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Boolean> {
            public final /* synthetic */ PHNProjectRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(PHNProjectRecord pHNProjectRecord) {
                super(0);
                this.a = pHNProjectRecord;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code duplicated, block: B:4:0x0014  */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Object objM3845constructorimpl;
                Object objM3845constructorimpl2;
                JsonElement jsonElement;
                JsonObject jsonObject;
                Object objM3845constructorimpl3;
                PlanDetail.DailyPlan dailyPlan;
                JsonPrimitive jsonPrimitive;
                Object objM3845constructorimpl4;
                Object objM3845constructorimpl5;
                Object objM3845constructorimpl6;
                PlanDetail.DailyPlan dailyPlan2;
                JsonPrimitive jsonPrimitive2;
                JsonPrimitive jsonPrimitive3;
                Calendar calendar;
                boolean z;
                JsonObject result = this.a.getResult();
                if (result != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        try {
                            JsonElement jsonElement2 = (JsonElement) result.get((Object) "last_update_time");
                            Long lValueOf = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive2) * ((long) 1000));
                            if (lValueOf == null) {
                                calendar = null;
                            } else {
                                long jLongValue = lValueOf.longValue();
                                JsonElement jsonElement3 = (JsonElement) result.get((Object) "last_update_time_zone");
                                TimeZone timeZoneZoneKeyToTimeZone = (jsonElement3 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive3));
                                if (timeZoneZoneKeyToTimeZone == null) {
                                    calendar = null;
                                } else {
                                    calendar = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                                    calendar.setTimeInMillis(jLongValue);
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                            objM3845constructorimpl2 = Result.m3845constructorimpl(calendar);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                            objM3845constructorimpl2 = null;
                        }
                        Calendar calendar2 = (Calendar) objM3845constructorimpl2;
                        if (calendar2 == null || (jsonElement = (JsonElement) result.get((Object) "exercise_recommended_info")) == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null) {
                            dailyPlan = null;
                        } else {
                            try {
                                Result.Companion companion3 = Result.Companion;
                                JsonElement jsonElement4 = (JsonElement) jsonObject.get((Object) "flag_recommended_exercise");
                                if ((jsonElement4 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement4)) == null || JsonElementKt.getInt(jsonPrimitive) != RecommendState.DailyGo.INSTANCE.getValue()) ? false : true) {
                                    try {
                                        objM3845constructorimpl4 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone1")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone1"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone1"))))));
                                    } catch (Throwable th2) {
                                        Result.Companion companion4 = Result.Companion;
                                        objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    ResultKt.throwOnFailure(objM3845constructorimpl4);
                                    PlanDetail.TaringPlan taringPlan = (PlanDetail.TaringPlan) objM3845constructorimpl4;
                                    try {
                                        Result.Companion companion5 = Result.Companion;
                                        objM3845constructorimpl5 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone2")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone2"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone2"))))));
                                    } catch (Throwable th3) {
                                        Result.Companion companion6 = Result.Companion;
                                        objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                                    }
                                    ResultKt.throwOnFailure(objM3845constructorimpl5);
                                    PlanDetail.TaringPlan taringPlan2 = (PlanDetail.TaringPlan) objM3845constructorimpl5;
                                    try {
                                        Result.Companion companion7 = Result.Companion;
                                        objM3845constructorimpl6 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone3")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone3"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone3"))))));
                                    } catch (Throwable th4) {
                                        Result.Companion companion8 = Result.Companion;
                                        objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                                    }
                                    ResultKt.throwOnFailure(objM3845constructorimpl6);
                                    dailyPlan2 = new PlanDetail.DailyPlan(calendar2, taringPlan, taringPlan2, (PlanDetail.TaringPlan) objM3845constructorimpl6);
                                } else {
                                    dailyPlan2 = null;
                                }
                                objM3845constructorimpl3 = Result.m3845constructorimpl(dailyPlan2);
                            } catch (Throwable th5) {
                                Result.Companion companion9 = Result.Companion;
                                objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                            }
                            ResultKt.throwOnFailure(objM3845constructorimpl3);
                            dailyPlan = (PlanDetail.DailyPlan) objM3845constructorimpl3;
                        }
                        objM3845constructorimpl = Result.m3845constructorimpl(dailyPlan);
                    } catch (Throwable th6) {
                        Result.Companion companion10 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th6));
                    }
                    Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl2 != null) {
                        HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl2, new PHNProjectRecordKt$getDailyPlan$2$1(thM3848exceptionOrNullimpl2));
                        Unit unit3 = Unit.INSTANCE;
                    }
                    z = ((PlanDetail.DailyPlan) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl)) != null;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$d */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Boolean> {
            public final /* synthetic */ PHNProjectRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(PHNProjectRecord pHNProjectRecord) {
                super(0);
                this.a = pHNProjectRecord;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Object objM3845constructorimpl;
                JsonPrimitive jsonPrimitive;
                JsonPrimitive jsonPrimitive2;
                Calendar calendar;
                JsonObject result = this.a.getResult();
                Calendar calendar2 = null;
                if (result != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        JsonElement jsonElement = (JsonElement) result.get((Object) "last_update_time");
                        Long lValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive) * ((long) 1000));
                        if (lValueOf == null) {
                            calendar = null;
                        } else {
                            long jLongValue = lValueOf.longValue();
                            JsonElement jsonElement2 = (JsonElement) result.get((Object) "last_update_time_zone");
                            TimeZone timeZoneZoneKeyToTimeZone = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive2));
                            if (timeZoneZoneKeyToTimeZone == null) {
                                calendar = null;
                            } else {
                                calendar = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                                calendar.setTimeInMillis(jLongValue);
                            }
                        }
                        objM3845constructorimpl = Result.m3845constructorimpl(calendar);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
                    }
                    calendar2 = (Calendar) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
                if (calendar2 == null) {
                    calendar2 = Calendar.getInstance();
                }
                int iK = PHNProjectRecordKt.k(calendar2);
                boolean z = false;
                for (int i : this.a.getSetting().getRestDays()) {
                    if (i == iK) {
                        z = true;
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$e */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/Calendar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Calendar> {
            public final /* synthetic */ PHNProjectRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(PHNProjectRecord pHNProjectRecord) {
                super(0);
                this.a = pHNProjectRecord;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Calendar invoke() {
                PHNProjectRecord.PHNProjectSetting.TimeStampAndZone startDate = this.a.getSetting().getStartDate();
                long timestamp = startDate.getTimestamp();
                int timezone_offset = startDate.getTimezone_offset();
                String str = timezone_offset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
                int iAbs = Math.abs(timezone_offset);
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
                calendar.setTimeInMillis(timestamp);
                return calendar;
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$f */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/core/model/PHNCardData$State;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<PHNCardData.State> {
            public final /* synthetic */ PHNProjectRecord a;
            public final /* synthetic */ AnonymousClass1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(PHNProjectRecord pHNProjectRecord, AnonymousClass1 anonymousClass1) {
                super(0);
                this.a = pHNProjectRecord;
                this.b = anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PHNCardData.State invoke() {
                PHNCardData.State.End end;
                PHNProjectRecord.PHNProjectSetting.TimeStampAndZone endDate = this.a.getSetting().getEndDate();
                if (endDate == null) {
                    end = null;
                } else {
                    endDate.getTimestamp();
                    end = PHNCardData.State.End.INSTANCE;
                }
                if (end == null) {
                    return this.a.getSetting().getStartDate().getTimestamp() <= System.currentTimeMillis() ? PHNCardData.State.OnGoing.INSTANCE : PHNCardData.State.ToBeStart.INSTANCE;
                }
                return end;
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$g */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function0<Long> {
            public g() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                return Long.valueOf(AnonymousClass1.this.getTimestamp());
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$h */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function0<Float> {
            public final /* synthetic */ PHNProjectRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(PHNProjectRecord pHNProjectRecord) {
                super(0);
                this.a = pHNProjectRecord;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                Object objM3845constructorimpl;
                JsonObject result = this.a.getResult();
                float fFloatValue = 0.0f;
                if (result != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        JsonArray jsonArray = JsonElementKt.getJsonArray((JsonElement) result.get((Object) "tsb_42_days"));
                        objM3845constructorimpl = Result.m3845constructorimpl(JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(jsonArray.get(jsonArray.size() - 1))));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getLatestTsbValue$2$1(thM3848exceptionOrNullimpl));
                    }
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                    Float f = (Float) objM3845constructorimpl;
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    }
                }
                return Float.valueOf(fFloatValue);
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanCardData$1$i */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Ljava/util/Calendar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function0<Calendar> {
            public final /* synthetic */ PHNProjectRecord a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(PHNProjectRecord pHNProjectRecord) {
                super(0);
                this.a = pHNProjectRecord;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Calendar invoke() {
                Object objM3845constructorimpl;
                JsonPrimitive jsonPrimitive;
                JsonPrimitive jsonPrimitive2;
                Calendar calendar;
                JsonObject result = this.a.getResult();
                if (result == null) {
                    return null;
                }
                try {
                    Result.Companion companion = Result.Companion;
                    JsonElement jsonElement = (JsonElement) result.get((Object) "last_update_time");
                    Long lValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive) * ((long) 1000));
                    if (lValueOf == null) {
                        calendar = null;
                    } else {
                        long jLongValue = lValueOf.longValue();
                        JsonElement jsonElement2 = (JsonElement) result.get((Object) "last_update_time_zone");
                        TimeZone timeZoneZoneKeyToTimeZone = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive2));
                        if (timeZoneZoneKeyToTimeZone == null) {
                            calendar = null;
                        } else {
                            calendar = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                            calendar.setTimeInMillis(jLongValue);
                        }
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(calendar);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
                }
                return (Calendar) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
            }
        }

        public AnonymousClass1(PHNProjectRecord pHNProjectRecord) {
            this.k = pHNProjectRecord;
            this.state = LazyKt__LazyJVMKt.lazy(new f(pHNProjectRecord, this));
            this.start = LazyKt__LazyJVMKt.lazy(new e(pHNProjectRecord));
            this.update = LazyKt__LazyJVMKt.lazy(new i(pHNProjectRecord));
            this.dailyPercent = LazyKt__LazyJVMKt.lazy(new a(pHNProjectRecord));
            this.tsbValue = LazyKt__LazyJVMKt.lazy(new h(pHNProjectRecord));
            this.hasPlan = LazyKt__LazyJVMKt.lazy(new c(pHNProjectRecord));
            this.flag = LazyKt__LazyJVMKt.lazy(new b(pHNProjectRecord));
            this.isRestDay = LazyKt__LazyJVMKt.lazy(new d(pHNProjectRecord));
        }

        @Override // com.huami.phn.core.model.PHNCardData
        public int getDailyPercent() {
            return ((Number) this.dailyPercent.getValue()).intValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        public int getFlag() {
            return ((Number) this.flag.getValue()).intValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        public boolean getHasPlan() {
            return ((Boolean) this.hasPlan.getValue()).booleanValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        @NotNull
        public Calendar getStart() {
            return (Calendar) this.start.getValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        @NotNull
        public PHNCardData.State getState() {
            return (PHNCardData.State) this.state.getValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        public long getTimestamp() {
            return ((Number) this.timestamp.getValue()).longValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        public float getTsbValue() {
            return ((Number) this.tsbValue.getValue()).floatValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        @Nullable
        public Calendar getUpdate() {
            return (Calendar) this.update.getValue();
        }

        @Override // com.huami.phn.core.model.PHNCardData
        public boolean isRestDay() {
            return ((Boolean) this.isRestDay.getValue()).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(HMDeviceSource hMDeviceSource) {
        return "";
    }

    private static final Integer c(JsonObject jsonObject) {
        Object objM3845constructorimpl;
        JsonPrimitive jsonPrimitive;
        try {
            Result.Companion companion = Result.Companion;
            JsonElement jsonElement = (JsonElement) jsonObject.get("percent_completed_daily_trimp");
            Integer numValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Integer.valueOf(JsonElementKt.getInt(jsonPrimitive));
            objM3845constructorimpl = Result.m3845constructorimpl(numValueOf == null ? null : Integer.valueOf(numValueOf.intValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error(a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getDailyPercent$2$1(thM3848exceptionOrNullimpl));
        }
        return (Integer) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private static final PlanDetail.DailyPlan d(JsonObject jsonObject) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        JsonElement jsonElement;
        JsonObject jsonObject2;
        Object objM3845constructorimpl3;
        PlanDetail.DailyPlan dailyPlan;
        JsonPrimitive jsonPrimitive;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        Object objM3845constructorimpl6;
        PlanDetail.DailyPlan dailyPlan2;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        Calendar calendar;
        try {
            Result.Companion companion = Result.Companion;
            try {
                JsonElement jsonElement2 = (JsonElement) jsonObject.get("last_update_time");
                Long lValueOf = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive2) * ((long) 1000));
                if (lValueOf == null) {
                    calendar = null;
                } else {
                    long jLongValue = lValueOf.longValue();
                    JsonElement jsonElement3 = (JsonElement) jsonObject.get("last_update_time_zone");
                    TimeZone timeZoneZoneKeyToTimeZone = (jsonElement3 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive3));
                    if (timeZoneZoneKeyToTimeZone == null) {
                        calendar = null;
                    } else {
                        calendar = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                        calendar.setTimeInMillis(jLongValue);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                objM3845constructorimpl2 = Result.m3845constructorimpl(calendar);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error(a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
                Unit unit2 = Unit.INSTANCE;
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                objM3845constructorimpl2 = null;
            }
            Calendar calendar2 = (Calendar) objM3845constructorimpl2;
            if (calendar2 == null || (jsonElement = (JsonElement) jsonObject.get("exercise_recommended_info")) == null || (jsonObject2 = JsonElementKt.getJsonObject(jsonElement)) == null) {
                dailyPlan = null;
            } else {
                try {
                    Result.Companion companion3 = Result.Companion;
                    JsonElement jsonElement4 = (JsonElement) jsonObject2.get((Object) "flag_recommended_exercise");
                    boolean z = false;
                    if (jsonElement4 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement4)) != null && JsonElementKt.getInt(jsonPrimitive) == RecommendState.DailyGo.INSTANCE.getValue()) {
                        z = true;
                    }
                    if (z) {
                        try {
                            objM3845constructorimpl4 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("hr_lower_zone1")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("hr_upper_zone1"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("duration_zone1"))))));
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.Companion;
                            objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                        }
                        ResultKt.throwOnFailure(objM3845constructorimpl4);
                        PlanDetail.TaringPlan taringPlan = (PlanDetail.TaringPlan) objM3845constructorimpl4;
                        try {
                            Result.Companion companion5 = Result.Companion;
                            objM3845constructorimpl5 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("hr_lower_zone2")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("hr_upper_zone2"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("duration_zone2"))))));
                        } catch (Throwable th3) {
                            Result.Companion companion6 = Result.Companion;
                            objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                        }
                        ResultKt.throwOnFailure(objM3845constructorimpl5);
                        PlanDetail.TaringPlan taringPlan2 = (PlanDetail.TaringPlan) objM3845constructorimpl5;
                        try {
                            Result.Companion companion7 = Result.Companion;
                            objM3845constructorimpl6 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("hr_lower_zone3")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("hr_upper_zone3"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject2.get((Object) ("duration_zone3"))))));
                        } catch (Throwable th4) {
                            Result.Companion companion8 = Result.Companion;
                            objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                        }
                        ResultKt.throwOnFailure(objM3845constructorimpl6);
                        dailyPlan2 = new PlanDetail.DailyPlan(calendar2, taringPlan, taringPlan2, (PlanDetail.TaringPlan) objM3845constructorimpl6);
                    } else {
                        dailyPlan2 = null;
                    }
                    objM3845constructorimpl3 = Result.m3845constructorimpl(dailyPlan2);
                } catch (Throwable th5) {
                    Result.Companion companion9 = Result.Companion;
                    objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                }
                ResultKt.throwOnFailure(objM3845constructorimpl3);
                dailyPlan = (PlanDetail.DailyPlan) objM3845constructorimpl3;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(dailyPlan);
        } catch (Throwable th6) {
            Result.Companion companion10 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th6));
        }
        Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl2 != null) {
            HMLog.error(a, "", thM3848exceptionOrNullimpl2, new PHNProjectRecordKt$getDailyPlan$2$1(thM3848exceptionOrNullimpl2));
            Unit unit3 = Unit.INSTANCE;
        }
        return (PlanDetail.DailyPlan) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhnDeviceNameDelegate e(PHNProjectRecord pHNProjectRecord) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((PhnDeviceNameDelegate) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(PhnDeviceNameDelegate.class), null, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = new PhnDeviceNameDelegate() { // from class: ap5
                @Override // com.huami.phn.coach.koin.PhnDeviceNameDelegate
                public final String nameForSource(HMDeviceSource hMDeviceSource) {
                    return PHNProjectRecordKt.b(hMDeviceSource);
                }
            };
        }
        return (PhnDeviceNameDelegate) objM3845constructorimpl;
    }

    private static final Float f(JsonObject jsonObject) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JsonArray jsonArray = JsonElementKt.getJsonArray((JsonElement) jsonObject.get("tsb_42_days"));
            objM3845constructorimpl = Result.m3845constructorimpl(JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(jsonArray.get(jsonArray.size() - 1))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error(a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getLatestTsbValue$2$1(thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Float) objM3845constructorimpl;
    }

    private static final Integer g(JsonObject jsonObject) {
        Object objM3845constructorimpl;
        JsonObject jsonObject2;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        try {
            Result.Companion companion = Result.Companion;
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("exercise_recommended_info");
            objM3845constructorimpl = Result.m3845constructorimpl((jsonElement2 == null || (jsonObject2 = JsonElementKt.getJsonObject(jsonElement2)) == null || (jsonElement = (JsonElement) jsonObject2.get((Object) "flag_recommended_exercise")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Integer.valueOf(JsonElementKt.getInt(jsonPrimitive)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error(a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getRecommendFlag$2$1(thM3848exceptionOrNullimpl));
        }
        return (Integer) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Nullable
    public static final List<PHNDailyAnalysisResult> getDailyAnalysis(@NotNull JsonObject jsonObject, long j) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        Calendar calendar;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        Calendar calendar2;
        try {
            Result.Companion companion = Result.Companion;
            try {
                JsonElement jsonElement = (JsonElement) jsonObject.get("last_update_time");
                Long lValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive) * ((long) 1000));
                if (lValueOf == null) {
                    calendar2 = null;
                } else {
                    long jLongValue = lValueOf.longValue();
                    JsonElement jsonElement2 = (JsonElement) jsonObject.get("last_update_time_zone");
                    TimeZone timeZoneZoneKeyToTimeZone = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive2));
                    if (timeZoneZoneKeyToTimeZone == null) {
                        calendar2 = null;
                    } else {
                        calendar2 = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                        calendar2.setTimeInMillis(jLongValue);
                    }
                }
                objM3845constructorimpl2 = Result.m3845constructorimpl(calendar2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error(a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                objM3845constructorimpl2 = null;
            }
            Calendar calendar3 = (Calendar) objM3845constructorimpl2;
            if (calendar3 == null) {
                calendar = null;
            } else {
                calendar3.add(6, -42);
                calendar = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
                calendar.set(calendar3.get(1), calendar3.get(2), calendar3.get(5), 0, 0, 0);
                calendar.set(14, 0);
            }
            if (calendar == null) {
                throw new Exception("No update time!");
            }
            PHNProjectRecordKt$getDailyAnalysis$1$createResult$1 pHNProjectRecordKt$getDailyAnalysis$1$createResult$1 = new PHNProjectRecordKt$getDailyAnalysis$1$createResult$1((-(calendar.get(15) + calendar.get(16))) / 60000, j, JsonElementKt.getJsonArray((JsonElement) jsonObject.get("trimp_42_days")), JsonElementKt.getJsonArray((JsonElement) jsonObject.get("atl_42_days")), JsonElementKt.getJsonArray((JsonElement) jsonObject.get("ctl_42_days")), JsonElementKt.getJsonArray((JsonElement) jsonObject.get("tsb_42_days")));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 42; i++) {
                arrayList.add(pHNProjectRecordKt$getDailyAnalysis$1$createResult$1.invoke(Integer.valueOf(i), Long.valueOf(calendar.getTimeInMillis())));
                calendar.add(6, 1);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(arrayList);
            Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl2 != null) {
                HMLog.error(a, "", thM3848exceptionOrNullimpl2, new PHNProjectRecordKt$getDailyAnalysis$2$1(thM3848exceptionOrNullimpl2, jsonObject));
            }
            return (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendState h(PHNProjectRecord pHNProjectRecord) {
        Boolean bool;
        boolean zBooleanValue;
        Object objM3845constructorimpl;
        Calendar calendar;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        Calendar calendar2;
        Object objM3845constructorimpl2;
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive3;
        PHNProjectRecord.PHNProjectSetting.TimeStampAndZone endDate = pHNProjectRecord.getSetting().getEndDate();
        RecommendState recommendState = null;
        if (endDate == null) {
            bool = null;
        } else {
            endDate.getTimestamp();
            bool = Boolean.FALSE;
        }
        boolean z = true;
        if (bool == null) {
            zBooleanValue = pHNProjectRecord.getSetting().getStartDate().getTimestamp() <= System.currentTimeMillis();
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (!zBooleanValue) {
            return RecommendState.Rest.INSTANCE;
        }
        JsonObject result = pHNProjectRecord.getResult();
        if (result == null) {
            calendar = null;
        } else {
            try {
                Result.Companion companion = Result.Companion;
                JsonElement jsonElement2 = (JsonElement) result.get("last_update_time");
                Long lValueOf = (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive) * ((long) 1000));
                if (lValueOf == null) {
                    calendar2 = null;
                } else {
                    long jLongValue = lValueOf.longValue();
                    JsonElement jsonElement3 = (JsonElement) result.get("last_update_time_zone");
                    TimeZone timeZoneZoneKeyToTimeZone = (jsonElement3 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive2));
                    if (timeZoneZoneKeyToTimeZone == null) {
                        calendar2 = null;
                    } else {
                        calendar2 = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                        calendar2.setTimeInMillis(jLongValue);
                    }
                }
                objM3845constructorimpl = Result.m3845constructorimpl(calendar2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error(a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            calendar = (Calendar) objM3845constructorimpl;
        }
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        int iK = k(calendar);
        int[] restDays = pHNProjectRecord.getSetting().getRestDays();
        int length = restDays.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (restDays[i] == iK) {
                break;
            }
            i++;
        }
        if (z) {
            return RecommendState.Rest.INSTANCE;
        }
        JsonObject result2 = pHNProjectRecord.getResult();
        if (result2 != null) {
            try {
                Result.Companion companion3 = Result.Companion;
                JsonElement jsonElement4 = (JsonElement) result2.get("exercise_recommended_info");
                objM3845constructorimpl2 = Result.m3845constructorimpl((jsonElement4 == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement4)) == null || (jsonElement = (JsonElement) jsonObject.get((Object) "flag_recommended_exercise")) == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Integer.valueOf(JsonElementKt.getInt(jsonPrimitive3)));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
            if (thM3848exceptionOrNullimpl2 != null) {
                HMLog.error(a, "", thM3848exceptionOrNullimpl2, new PHNProjectRecordKt$getRecommendFlag$2$1(thM3848exceptionOrNullimpl2));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                objM3845constructorimpl2 = null;
            }
            Integer num = (Integer) objM3845constructorimpl2;
            if (num != null) {
                recommendState = RecommendState.INSTANCE.toRecommendState(num.intValue());
            }
        }
        return recommendState == null ? RecommendState.Tired.INSTANCE : recommendState;
    }

    private static final PlanDetail.TaringPlan i(JsonObject jsonObject, int i) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone" + i)))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone" + i))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone" + i))))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        ResultKt.throwOnFailure(objM3845constructorimpl);
        return (PlanDetail.TaringPlan) objM3845constructorimpl;
    }

    private static final Calendar j(JsonObject jsonObject) {
        Object objM3845constructorimpl;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        Calendar calendar;
        try {
            Result.Companion companion = Result.Companion;
            JsonElement jsonElement = (JsonElement) jsonObject.get("last_update_time");
            Long lValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive) * ((long) 1000));
            if (lValueOf == null) {
                calendar = null;
            } else {
                long jLongValue = lValueOf.longValue();
                JsonElement jsonElement2 = (JsonElement) jsonObject.get("last_update_time_zone");
                TimeZone timeZoneZoneKeyToTimeZone = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive2));
                if (timeZoneZoneKeyToTimeZone == null) {
                    calendar = null;
                } else {
                    calendar = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                    calendar.setTimeInMillis(jLongValue);
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(calendar);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error(a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
        }
        return (Calendar) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(Calendar calendar) {
        int i = calendar.get(7);
        switch (i) {
            case 1:
                return 6;
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            default:
                throw new IllegalArgumentException("Unknown week " + i);
        }
    }

    private static final Calendar l(PHNProjectRecord.PHNProjectSetting.TimeStampAndZone timeStampAndZone) {
        long timestamp = timeStampAndZone.getTimestamp();
        int timezone_offset = timeStampAndZone.getTimezone_offset();
        String str = timezone_offset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
        int iAbs = Math.abs(timezone_offset);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
        calendar.setTimeInMillis(timestamp);
        return calendar;
    }

    private static final PlanDetail.DailyPlan m(JsonObject jsonObject, Calendar calendar) {
        Object objM3845constructorimpl;
        JsonPrimitive jsonPrimitive;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        PlanDetail.DailyPlan dailyPlan;
        try {
            Result.Companion companion = Result.Companion;
            JsonElement jsonElement = (JsonElement) jsonObject.get("flag_recommended_exercise");
            boolean z = false;
            if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null && JsonElementKt.getInt(jsonPrimitive) == RecommendState.DailyGo.INSTANCE.getValue()) {
                z = true;
            }
            if (z) {
                try {
                    objM3845constructorimpl2 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone1")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone1"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone1"))))));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                ResultKt.throwOnFailure(objM3845constructorimpl2);
                PlanDetail.TaringPlan taringPlan = (PlanDetail.TaringPlan) objM3845constructorimpl2;
                try {
                    Result.Companion companion3 = Result.Companion;
                    objM3845constructorimpl3 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone2")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone2"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone2"))))));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                }
                ResultKt.throwOnFailure(objM3845constructorimpl3);
                PlanDetail.TaringPlan taringPlan2 = (PlanDetail.TaringPlan) objM3845constructorimpl3;
                try {
                    Result.Companion companion5 = Result.Companion;
                    objM3845constructorimpl4 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone3")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone3"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone3"))))));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.Companion;
                    objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                }
                ResultKt.throwOnFailure(objM3845constructorimpl4);
                dailyPlan = new PlanDetail.DailyPlan(calendar, taringPlan, taringPlan2, (PlanDetail.TaringPlan) objM3845constructorimpl4);
            } else {
                dailyPlan = null;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(dailyPlan);
        } catch (Throwable th4) {
            Result.Companion companion7 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th4));
        }
        ResultKt.throwOnFailure(objM3845constructorimpl);
        return (PlanDetail.DailyPlan) objM3845constructorimpl;
    }

    @NotNull
    public static final PHNCardData toPlanCardData(@NotNull PHNProjectRecord pHNProjectRecord) {
        return new AnonymousClass1(pHNProjectRecord);
    }

    @NotNull
    public static final PlanDetail toPlanDetail(@NotNull PHNProjectRecord pHNProjectRecord) {
        return new PlanDetail() { // from class: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt.toPlanDetail.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final Lazy id;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final Lazy state;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private final Lazy recommend;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            private final Lazy rest;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @NotNull
            private final Lazy start;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @NotNull
            private final Lazy update;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @NotNull
            private final Lazy plan;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            @NotNull
            private final Lazy device;

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ PHNProjectRecord a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(PHNProjectRecord pHNProjectRecord) {
                    super(0);
                    this.a = pHNProjectRecord;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return PHNProjectRecordKt.e(this.a).nameForSource(HMDeviceSource.fromValue(this.a.getSource()));
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<Long> {
                public final /* synthetic */ PHNProjectRecord a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(PHNProjectRecord pHNProjectRecord) {
                    super(0);
                    this.a = pHNProjectRecord;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Long invoke() {
                    return Long.valueOf(this.a.getTimestamp());
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$DailyPlan;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<PlanDetail.DailyPlan> {
                public final /* synthetic */ PHNProjectRecord a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(PHNProjectRecord pHNProjectRecord) {
                    super(0);
                    this.a = pHNProjectRecord;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PlanDetail.DailyPlan invoke() {
                    Object objM3845constructorimpl;
                    Object objM3845constructorimpl2;
                    JsonElement jsonElement;
                    JsonObject jsonObject;
                    Object objM3845constructorimpl3;
                    PlanDetail.DailyPlan dailyPlan;
                    JsonPrimitive jsonPrimitive;
                    Object objM3845constructorimpl4;
                    Object objM3845constructorimpl5;
                    Object objM3845constructorimpl6;
                    PlanDetail.DailyPlan dailyPlan2;
                    JsonPrimitive jsonPrimitive2;
                    JsonPrimitive jsonPrimitive3;
                    Calendar calendar;
                    JsonObject result = this.a.getResult();
                    if (result == null) {
                        return null;
                    }
                    try {
                        Result.Companion companion = Result.Companion;
                        try {
                            JsonElement jsonElement2 = (JsonElement) result.get((Object) "last_update_time");
                            Long lValueOf = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive2) * ((long) 1000));
                            if (lValueOf == null) {
                                calendar = null;
                            } else {
                                long jLongValue = lValueOf.longValue();
                                JsonElement jsonElement3 = (JsonElement) result.get((Object) "last_update_time_zone");
                                TimeZone timeZoneZoneKeyToTimeZone = (jsonElement3 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive3));
                                if (timeZoneZoneKeyToTimeZone == null) {
                                    calendar = null;
                                } else {
                                    calendar = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                                    calendar.setTimeInMillis(jLongValue);
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                            objM3845constructorimpl2 = Result.m3845constructorimpl(calendar);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
                        if (thM3848exceptionOrNullimpl != null) {
                            HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                            objM3845constructorimpl2 = null;
                        }
                        Calendar calendar2 = (Calendar) objM3845constructorimpl2;
                        if (calendar2 == null || (jsonElement = (JsonElement) result.get((Object) "exercise_recommended_info")) == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null) {
                            dailyPlan = null;
                        } else {
                            try {
                                Result.Companion companion3 = Result.Companion;
                                JsonElement jsonElement4 = (JsonElement) jsonObject.get((Object) "flag_recommended_exercise");
                                boolean z = false;
                                if (jsonElement4 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement4)) != null && JsonElementKt.getInt(jsonPrimitive) == RecommendState.DailyGo.INSTANCE.getValue()) {
                                    z = true;
                                }
                                if (z) {
                                    try {
                                        objM3845constructorimpl4 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone1")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone1"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone1"))))));
                                    } catch (Throwable th2) {
                                        Result.Companion companion4 = Result.Companion;
                                        objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                                    }
                                    ResultKt.throwOnFailure(objM3845constructorimpl4);
                                    PlanDetail.TaringPlan taringPlan = (PlanDetail.TaringPlan) objM3845constructorimpl4;
                                    try {
                                        Result.Companion companion5 = Result.Companion;
                                        objM3845constructorimpl5 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone2")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone2"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone2"))))));
                                    } catch (Throwable th3) {
                                        Result.Companion companion6 = Result.Companion;
                                        objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                                    }
                                    ResultKt.throwOnFailure(objM3845constructorimpl5);
                                    PlanDetail.TaringPlan taringPlan2 = (PlanDetail.TaringPlan) objM3845constructorimpl5;
                                    try {
                                        Result.Companion companion7 = Result.Companion;
                                        objM3845constructorimpl6 = Result.m3845constructorimpl(new PlanDetail.TaringPlan((int) ((JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_lower_zone3")))) + JsonElementKt.getFloat(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("hr_upper_zone3"))))) / 2), JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) jsonObject.get((Object) ("duration_zone3"))))));
                                    } catch (Throwable th4) {
                                        Result.Companion companion8 = Result.Companion;
                                        objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                                    }
                                    ResultKt.throwOnFailure(objM3845constructorimpl6);
                                    dailyPlan2 = new PlanDetail.DailyPlan(calendar2, taringPlan, taringPlan2, (PlanDetail.TaringPlan) objM3845constructorimpl6);
                                } else {
                                    dailyPlan2 = null;
                                }
                                objM3845constructorimpl3 = Result.m3845constructorimpl(dailyPlan2);
                            } catch (Throwable th5) {
                                Result.Companion companion9 = Result.Companion;
                                objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                            }
                            ResultKt.throwOnFailure(objM3845constructorimpl3);
                            dailyPlan = (PlanDetail.DailyPlan) objM3845constructorimpl3;
                        }
                        objM3845constructorimpl = Result.m3845constructorimpl(dailyPlan);
                    } catch (Throwable th6) {
                        Result.Companion companion10 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th6));
                    }
                    Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl2 != null) {
                        HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl2, new PHNProjectRecordKt$getDailyPlan$2$1(thM3848exceptionOrNullimpl2));
                        Unit unit3 = Unit.INSTANCE;
                    }
                    return (PlanDetail.DailyPlan) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/core/model/RecommendState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<RecommendState> {
                public final /* synthetic */ PHNProjectRecord a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(PHNProjectRecord pHNProjectRecord) {
                    super(0);
                    this.a = pHNProjectRecord;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RecommendState invoke() {
                    return PHNProjectRecordKt.h(this.a);
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0015\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<int[]> {
                public final /* synthetic */ PHNProjectRecord a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(PHNProjectRecord pHNProjectRecord) {
                    super(0);
                    this.a = pHNProjectRecord;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final int[] invoke() {
                    return this.a.getSetting().getRestDays();
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/Calendar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function0<Calendar> {
                public final /* synthetic */ PHNProjectRecord a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(PHNProjectRecord pHNProjectRecord) {
                    super(0);
                    this.a = pHNProjectRecord;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Calendar invoke() {
                    PHNProjectRecord.PHNProjectSetting.TimeStampAndZone startDate = this.a.getSetting().getStartDate();
                    long timestamp = startDate.getTimestamp();
                    int timezone_offset = startDate.getTimezone_offset();
                    String str = timezone_offset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
                    int iAbs = Math.abs(timezone_offset);
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
                    calendar.setTimeInMillis(timestamp);
                    return calendar;
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetail$State;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function0<PlanDetail.State> {
                public final /* synthetic */ PHNProjectRecord a;
                public final /* synthetic */ C15391 b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(PHNProjectRecord pHNProjectRecord, C15391 c15391) {
                    super(0);
                    this.a = pHNProjectRecord;
                    this.b = c15391;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PlanDetail.State invoke() {
                    PlanDetail.State.End end;
                    PHNProjectRecord.PHNProjectSetting.TimeStampAndZone endDate = this.a.getSetting().getEndDate();
                    if (endDate == null) {
                        end = null;
                    } else {
                        endDate.getTimestamp();
                        end = PlanDetail.State.End.INSTANCE;
                    }
                    if (end == null) {
                        return this.a.getSetting().getStartDate().getTimestamp() <= System.currentTimeMillis() ? PlanDetail.State.OnGoing.INSTANCE : PlanDetail.State.ToBeStart.INSTANCE;
                    }
                    return end;
                }
            }

            /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.PHNProjectRecordKt$toPlanDetail$1$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Ljava/util/Calendar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function0<Calendar> {
                public final /* synthetic */ PHNProjectRecord a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(PHNProjectRecord pHNProjectRecord) {
                    super(0);
                    this.a = pHNProjectRecord;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Calendar invoke() {
                    Object objM3845constructorimpl;
                    JsonPrimitive jsonPrimitive;
                    JsonPrimitive jsonPrimitive2;
                    Calendar calendar;
                    JsonObject result = this.a.getResult();
                    if (result == null) {
                        return null;
                    }
                    try {
                        Result.Companion companion = Result.Companion;
                        JsonElement jsonElement = (JsonElement) result.get((Object) "last_update_time");
                        Long lValueOf = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : Long.valueOf(JsonElementKt.getLong(jsonPrimitive) * ((long) 1000));
                        if (lValueOf == null) {
                            calendar = null;
                        } else {
                            long jLongValue = lValueOf.longValue();
                            JsonElement jsonElement2 = (JsonElement) result.get((Object) "last_update_time_zone");
                            TimeZone timeZoneZoneKeyToTimeZone = (jsonElement2 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : MKTime.INSTANCE.zoneKeyToTimeZone(JsonElementKt.getInt(jsonPrimitive2));
                            if (timeZoneZoneKeyToTimeZone == null) {
                                calendar = null;
                            } else {
                                calendar = Calendar.getInstance(timeZoneZoneKeyToTimeZone);
                                calendar.setTimeInMillis(jLongValue);
                            }
                        }
                        objM3845constructorimpl = Result.m3845constructorimpl(calendar);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.error(PHNProjectRecordKt.a, "", thM3848exceptionOrNullimpl, new PHNProjectRecordKt$getUpdateCal$2$1(thM3848exceptionOrNullimpl));
                    }
                    return (Calendar) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }

            {
                this.id = LazyKt__LazyJVMKt.lazy(new b(this.i));
                this.state = LazyKt__LazyJVMKt.lazy(new g(this.i, this));
                this.recommend = LazyKt__LazyJVMKt.lazy(new d(this.i));
                this.rest = LazyKt__LazyJVMKt.lazy(new e(this.i));
                this.start = LazyKt__LazyJVMKt.lazy(new f(this.i));
                this.update = LazyKt__LazyJVMKt.lazy(new h(this.i));
                this.plan = LazyKt__LazyJVMKt.lazy(new c(this.i));
                this.device = LazyKt__LazyJVMKt.lazy(new a(this.i));
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            @NotNull
            public String getDevice() {
                return (String) this.device.getValue();
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            public long getId() {
                return ((Number) this.id.getValue()).longValue();
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            @Nullable
            public PlanDetail.DailyPlan getPlan() {
                return (PlanDetail.DailyPlan) this.plan.getValue();
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            @NotNull
            public RecommendState getRecommend() {
                return (RecommendState) this.recommend.getValue();
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            @NotNull
            public int[] getRest() {
                return (int[]) this.rest.getValue();
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            @NotNull
            public Calendar getStart() {
                return (Calendar) this.start.getValue();
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            @NotNull
            public PlanDetail.State getState() {
                return (PlanDetail.State) this.state.getValue();
            }

            @Override // com.huami.phn.coach.usecase.PlanDetail
            @Nullable
            public Calendar getUpdate() {
                return (Calendar) this.update.getValue();
            }
        };
    }
}

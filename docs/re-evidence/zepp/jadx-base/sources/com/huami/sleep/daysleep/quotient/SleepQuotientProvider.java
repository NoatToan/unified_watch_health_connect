package com.huami.sleep.daysleep.quotient;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.bloodoxygen.ui.view.BloodOxygenStatisticsView;
import com.huami.module.ktx.I18nKt;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.quotient.processor.BreathQualityProcessor;
import com.huami.sleep.daysleep.quotient.processor.RemProcessor;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.model.BreathQualityRiskLevel;
import com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailActivity;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailType;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.ui.breathquality.BreathQualityActivity;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.analytics.EventConst;
import com.loc.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\bH\u0002J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0002J5\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J0\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J2\u00101\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020*0/2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u00103\u001a\u000202*\u00020\u0002H\u0002J2\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u000200040\u001b2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u00106\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00109R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010;R\u0016\u0010>\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010;R\u0016\u0010?\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010;¨\u0006B"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/SleepQuotientProvider;", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientType;", "type", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientDto;", "sleepQuotient", "Lcom/huami/sleep/statistic/dto/TimeMode;", "mode", "", "o", "isStatistics", "", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/graphics/drawable/Drawable;", "b", "", "h", "f", "(Lcom/huami/sleep/daysleep/quotient/SleepQuotientType;Lcom/huami/sleep/daysleep/quotient/SleepQuotientDto;)Ljava/lang/Integer;", "quotient", "g", "(Landroid/content/Context;Lcom/huami/sleep/daysleep/quotient/SleepQuotientType;Ljava/lang/Integer;Z)Ljava/lang/String;", "result", "m", GoogleApiAvailabilityLight.b, "Lkotlin/Pair;", "range", z.j, "(Lcom/huami/sleep/daysleep/quotient/SleepQuotientType;Ljava/lang/Integer;Lkotlin/Pair;)I", "l", "(Lcom/huami/sleep/daysleep/quotient/SleepQuotientType;Ljava/lang/Integer;)Ljava/lang/String;", "trendMode", "min", "max", "value", "a", hl.k, "(Landroid/content/Context;Lcom/huami/sleep/daysleep/quotient/SleepQuotientType;Ljava/lang/Integer;)Ljava/lang/String;", "i", "Lkotlin/Function1;", "", GoogleApiAvailabilityLight.a, "userId", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "Lkotlin/Function2;", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "e", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailType;", com.google.android.exoplayer2.text.ttml.b.r, "", "getQuotientData", "tag", "Ljava/lang/String;", "", "Ljava/util/List;", "quotientTypes", LogUtil.I, "TREND_LONG_SHORT", "TREND_HIGH_LOW", "TREND_MORE", "TREND_EARLY_LATE", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepQuotientProvider {

    @NotNull
    public static final SleepQuotientProvider INSTANCE = new SleepQuotientProvider();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<SleepQuotientType> quotientTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int TREND_LONG_SHORT = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int TREND_HIGH_LOW = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int TREND_MORE = 2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int TREND_EARLY_LATE = 3;

    @NotNull
    public static final String tag = "SleepQuotientProvider";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepQuotientType.values().length];
            iArr[SleepQuotientType.REM.ordinal()] = 1;
            iArr[SleepQuotientType.BREATH_QUALITY.ordinal()] = 2;
            iArr[SleepQuotientType.FALL_ASLEEP_TIME.ordinal()] = 3;
            iArr[SleepQuotientType.WAKE_UP_TIME.ordinal()] = 4;
            iArr[SleepQuotientType.INTO_SLEEP_DURATION.ordinal()] = 5;
            iArr[SleepQuotientType.DEEP.ordinal()] = 6;
            iArr[SleepQuotientType.LIGHT.ordinal()] = 7;
            iArr[SleepQuotientType.AWAKE_COUNT.ordinal()] = 8;
            iArr[SleepQuotientType.SLEEP_DURATION.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Context, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Context context) {
            KoinExtKt.getPageNavigate().navigateToDetectSetting(context);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/Context;", EventConst.a, "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "param", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Context, SleepQuotientParam, Unit> {
        public final /* synthetic */ SleepQuotientType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SleepQuotientType sleepQuotientType) {
            super(2);
            this.a = sleepQuotientType;
        }

        public final void a(@NotNull Context context, @NotNull SleepQuotientParam sleepQuotientParam) {
            SleepIntroDetailActivity.INSTANCE.launch(context, new SleepIntroDetailVo(SleepQuotientProvider.INSTANCE.p(this.a), sleepQuotientParam.getName(), sleepQuotientParam.getValue(), sleepQuotientParam.getTrendDrawableRes(), sleepQuotientParam.getTrendInfo(), sleepQuotientParam.getRefInfo()));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Context context, SleepQuotientParam sleepQuotientParam) {
            a(context, sleepQuotientParam);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/Context;", EventConst.a, "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "param", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Context, SleepQuotientParam, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ TimeParam b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, TimeParam timeParam) {
            super(2);
            this.a = str;
            this.b = timeParam;
        }

        public final void a(@NotNull Context context, @NotNull SleepQuotientParam sleepQuotientParam) {
            if (sleepQuotientParam.getNeedDetection()) {
                KoinExtKt.getPageNavigate().navigateToDetectSetting(context);
            } else {
                BreathQualityActivity.INSTANCE.navigation(context, this.a, this.b.getMode().getValue(), this.b.getTime());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Context context, SleepQuotientParam sleepQuotientParam) {
            a(context, sleepQuotientParam);
            return Unit.INSTANCE;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        quotientTypes = arrayList;
        arrayList.add(SleepQuotientType.SLEEP_DURATION);
        arrayList.add(SleepQuotientType.DEEP);
        arrayList.add(SleepQuotientType.REM);
        arrayList.add(SleepQuotientType.AWAKE_COUNT);
        arrayList.add(SleepQuotientType.FALL_ASLEEP_TIME);
        arrayList.add(SleepQuotientType.WAKE_UP_TIME);
    }

    private SleepQuotientProvider() {
    }

    private final String a(int trendMode, int min, int max, int value, SleepQuotientType type) {
        Context appContext = KoinExtKt.getAppContext();
        if (trendMode == 0) {
            if (value > max) {
                return appContext.getString(R.string.sleep_info_long);
            }
            return value < min ? appContext.getString(R.string.sleep_info_short) : appContext.getString(R.string.sleep_info_normal);
        }
        if (trendMode == 1) {
            if (value > max) {
                return appContext.getString(R.string.sleep_info_high);
            }
            return value < min ? appContext.getString(R.string.sleep_info_low) : appContext.getString(R.string.sleep_info_normal);
        }
        if (trendMode == 2) {
            return value > max ? appContext.getString(R.string.sleep_info_more) : appContext.getString(R.string.sleep_info_normal);
        }
        if (trendMode != 3) {
            return appContext.getString(R.string.sleep_info_normal);
        }
        String strK = k(appContext, type, Integer.valueOf(value));
        return strK == null ? appContext.getString(R.string.sleep_info_normal) : strK;
    }

    private final Drawable b(Context context, SleepQuotientType type) {
        Integer numValueOf = WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 2 ? Integer.valueOf(R.drawable.ic_sleep_breath_quality_beta) : null;
        if (numValueOf == null) {
            return null;
        }
        return ContextCompat.getDrawable(context, numValueOf.intValue());
    }

    private final int c(SleepQuotientType type, boolean isStatistics) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return R.string.sleep_rem_ratio;
            case 2:
                return R.string.sleep_breath_quality;
            case 3:
                return R.string.sleep_fall_asleep;
            case 4:
                return R.string.sleep_wakeup_time;
            case 5:
                return R.string.sleep_tonality_sleep_count;
            case 6:
                return R.string.sleep_deep_ratio;
            case 7:
                return R.string.sleep_light_ratio;
            case 8:
                return R.string.sleep_night_awake_count;
            case 9:
                return R.string.sleep_night_count;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Function1<Context, Unit> d(SleepQuotientType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            return a.a;
        }
        return null;
    }

    private final Function2<Context, SleepQuotientParam, Unit> e(String userId, TimeParam timeParam, SleepQuotientType type) {
        return WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 2 ? new c(userId, timeParam) : new b(type);
    }

    private final Integer f(SleepQuotientType type, SleepQuotientDto sleepQuotient) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return Integer.valueOf(sleepQuotient.getRemRatio());
            case 2:
                return BreathQualityProcessor.INSTANCE.getVerifyScore(sleepQuotient.getOdiScoreAndCode(), sleepQuotient.isStatistics());
            case 3:
                return Integer.valueOf(sleepQuotient.getFallAsleepTime());
            case 4:
                return Integer.valueOf(sleepQuotient.getWakeUpTime());
            case 5:
                return Integer.valueOf(sleepQuotient.getIntoSleepDuration());
            case 6:
                return Integer.valueOf(sleepQuotient.getDeepRatio());
            case 7:
                return Integer.valueOf(sleepQuotient.getLightRatio());
            case 8:
                return Integer.valueOf(sleepQuotient.getWakeupCount());
            case 9:
                return Integer.valueOf(sleepQuotient.getSleepDuration());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String g(Context context, SleepQuotientType type, Integer quotient, boolean isStatistics) {
        if (isStatistics && type == SleepQuotientType.BREATH_QUALITY) {
            return "";
        }
        if (quotient == null) {
            return BloodOxygenStatisticsView.INVALID;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 6:
            case 7:
                if (isStatistics) {
                    Resources resources = context.getResources();
                    int i = R.string.sleep_day_quality_avg_ratio;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    return resources.getString(i, String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{quotient}, 1)));
                }
                Resources resources2 = context.getResources();
                int i2 = R.string.sleep_day_quality_ratio;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                return resources2.getString(i2, String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{quotient}, 1)));
            case 2:
                BreathQualityRiskLevel.Companion companion = BreathQualityRiskLevel.INSTANCE;
                return companion.getTitleDesc(context, companion.getByCodeValue(quotient.intValue()));
            case 3:
            case 4:
                return m(context, com.huami.sleep.sleepintrodetail.convert.SleepQuotientConvertKt.minutesToTime(quotient.intValue()), isStatistics);
            case 5:
            case 9:
                return m(context, ArraysKt___ArraysKt.joinToString$default(TimeShowUtilsKt.getDurationStr$default(quotient.intValue(), context, false, false, 6, null), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), isStatistics);
            case 8:
                return m(context, I18nKt.i18n(quotient.intValue()) + " " + context.getResources().getQuantityString(R.plurals.sleep_count_unit, quotient.intValue()), isStatistics);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String h(Context context, SleepQuotientType type) {
        String string = "";
        if (type == SleepQuotientType.BREATH_QUALITY) {
            return "";
        }
        String string2 = context.getString(R.string.sleep_reference);
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                string = "10-30%";
                break;
            case 3:
                string = context.getString(R.string.sleep_fall_asleep_ref);
                break;
            case 4:
                string = context.getString(R.string.sleep_wake_up_ref);
                break;
            case 5:
                string = "0 - 30 " + context.getString(R.string.unit_min_long);
                break;
            case 6:
                string = "20-60%";
                break;
            case 7:
                string = "< 55%";
                break;
            case 8:
                string = "0-2 " + context.getResources().getQuantityString(R.plurals.sleep_count_unit, 2);
                break;
            case 9:
                string = "6-10 " + context.getString(R.string.unit_hour_long);
                break;
        }
        return string2 + string;
    }

    private final Pair<Integer, Integer> i(SleepQuotientType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new Pair<>(30, 10);
            case 2:
                return new Pair<>(100, 90);
            case 3:
                return new Pair<>(Integer.valueOf(SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN), 0);
            case 4:
                return new Pair<>(360, 1440);
            case 5:
                return new Pair<>(30, 0);
            case 6:
                return new Pair<>(60, 20);
            case 7:
                return new Pair<>(55, 0);
            case 8:
                return new Pair<>(2, 0);
            case 9:
                return new Pair<>(600, 360);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final int j(SleepQuotientType type, Integer quotient, Pair<Integer, Integer> range) {
        if (e.listOf(SleepQuotientType.BREATH_QUALITY).contains(type) || quotient == null) {
            return 0;
        }
        if (type == SleepQuotientType.FALL_ASLEEP_TIME) {
            if (quotient.intValue() > 0) {
                return R.drawable.ic_sleep_quotient_down_arrow;
            }
            return 0;
        }
        if (type == SleepQuotientType.WAKE_UP_TIME) {
            if (quotient.intValue() < 360) {
                return R.drawable.ic_sleep_quotient_up_arrow;
            }
            return 0;
        }
        int iIntValue = range.getFirst().intValue();
        if (quotient.intValue() < range.getSecond().intValue()) {
            return R.drawable.ic_sleep_quotient_down_arrow;
        }
        if (quotient.intValue() > iIntValue) {
            return R.drawable.ic_sleep_quotient_up_arrow;
        }
        return 0;
    }

    private final String k(Context context, SleepQuotientType type, Integer quotient) {
        String string;
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 3) {
            if (i != 4 || quotient == null) {
                return null;
            }
            quotient.intValue();
            if (quotient.intValue() >= 360) {
                return null;
            }
            string = context.getString(R.string.sleep_wake_up_early);
        } else {
            if (quotient == null) {
                return null;
            }
            quotient.intValue();
            if (quotient.intValue() <= 0) {
                return null;
            }
            string = context.getString(R.string.sleep_fall_asleep_later);
        }
        return string;
    }

    private final String l(SleepQuotientType type, Integer quotient) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            if (quotient == null) {
                return null;
            }
            return INSTANCE.a(1, 10, 30, quotient.intValue(), type);
        }
        if (i == 3) {
            if (quotient == null) {
                return null;
            }
            return INSTANCE.a(3, SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN, 0, quotient.intValue(), type);
        }
        if (i == 4) {
            if (quotient == null) {
                return null;
            }
            return INSTANCE.a(3, 360, 1440, quotient.intValue(), type);
        }
        if (i == 5) {
            if (quotient == null) {
                return null;
            }
            return INSTANCE.a(0, 0, 30, quotient.intValue(), type);
        }
        if (i == 6) {
            if (quotient == null) {
                return null;
            }
            return INSTANCE.a(1, 20, 60, quotient.intValue(), type);
        }
        if (i == 8) {
            if (quotient == null) {
                return null;
            }
            return INSTANCE.a(2, 0, 2, quotient.intValue(), type);
        }
        if (i != 9 || quotient == null) {
            return null;
        }
        return INSTANCE.a(0, 360, 600, quotient.intValue(), type);
    }

    private final String m(Context context, String result, boolean isStatistics) {
        return isStatistics ? context.getResources().getString(R.string.sleep_day_quality_avg_data, result) : result;
    }

    private final boolean n(SleepQuotientType type, SleepQuotientDto sleepQuotient, boolean isStatistics) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return !sleepQuotient.isStatistics() && RemProcessor.INSTANCE.checkRemShowAndDetection(sleepQuotient).getSecond().booleanValue();
        }
        if (i != 2) {
            return false;
        }
        return BreathQualityProcessor.INSTANCE.needDetection(sleepQuotient.getOdiScoreAndCode(), isStatistics);
    }

    private final boolean o(SleepQuotientType type, SleepQuotientDto sleepQuotient, TimeMode mode) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                boolean zNeedHidden = BreathQualityProcessor.INSTANCE.needHidden(sleepQuotient.getOdiScoreAndCode(), sleepQuotient.isStatistics());
                if (sleepQuotient.isStatistics()) {
                    return zNeedHidden;
                }
                if (!sleepQuotient.isEarbud() && !zNeedHidden) {
                    return false;
                }
            } else if ((i != 3 && i != 4) || mode != TimeMode.YEAR) {
                return false;
            }
        } else if (sleepQuotient.isStatistics() || RemProcessor.INSTANCE.checkRemShowAndDetection(sleepQuotient).getFirst().booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepIntroDetailType p(SleepQuotientType sleepQuotientType) {
        switch (WhenMappings.$EnumSwitchMapping$0[sleepQuotientType.ordinal()]) {
            case 1:
                return SleepIntroDetailType.REM_SLEEP;
            case 2:
            default:
                return SleepIntroDetailType.DEEP_SLEEP;
            case 3:
                return SleepIntroDetailType.FALL_ASLEEP_TIME;
            case 4:
                return SleepIntroDetailType.WAKE_UP_TIME;
            case 5:
                return SleepIntroDetailType.INTO_SLEEP_COUNT;
            case 6:
                return SleepIntroDetailType.DEEP_SLEEP;
            case 7:
                return SleepIntroDetailType.LIGHT_SLEEP;
            case 8:
                return SleepIntroDetailType.NIGHT_AWAKE;
            case 9:
                return SleepIntroDetailType.SLEEP_DURATION;
        }
    }

    @WorkerThread
    @NotNull
    public final Pair<Integer, List<SleepQuotientParam>> getQuotientData(@NotNull String userId, @NotNull TimeParam timeParam, @NotNull SleepQuotientDto sleepQuotient) {
        SleepQuotientDto sleepQuotientDto = sleepQuotient;
        Context appContext = KoinExtKt.getAppContext();
        int sleepScore = sleepQuotient.getSleepScore();
        ArrayList arrayList = new ArrayList();
        for (SleepQuotientType sleepQuotientType : quotientTypes) {
            SleepQuotientProvider sleepQuotientProvider = INSTANCE;
            if (!sleepQuotientProvider.o(sleepQuotientType, sleepQuotientDto, timeParam.getMode())) {
                Integer numF = sleepQuotientProvider.f(sleepQuotientType, sleepQuotientDto);
                arrayList.add(new SleepQuotientParam(appContext.getString(sleepQuotientProvider.c(sleepQuotientType, sleepQuotient.isStatistics())), sleepQuotientProvider.b(appContext, sleepQuotientType), sleepQuotientProvider.h(appContext, sleepQuotientType), numF, sleepQuotientProvider.g(appContext, sleepQuotientType, numF, sleepQuotient.isStatistics()), sleepQuotientProvider.n(sleepQuotientType, sleepQuotientDto, sleepQuotient.isStatistics()), sleepQuotientProvider.j(sleepQuotientType, numF, sleepQuotientProvider.i(sleepQuotientType)), sleepQuotientProvider.l(sleepQuotientType, numF), sleepQuotientProvider.e(userId, timeParam, sleepQuotientType), sleepQuotientProvider.d(sleepQuotientType)));
                sleepQuotientDto = sleepQuotient;
            }
        }
        return new Pair<>(Integer.valueOf(sleepScore), arrayList);
    }
}

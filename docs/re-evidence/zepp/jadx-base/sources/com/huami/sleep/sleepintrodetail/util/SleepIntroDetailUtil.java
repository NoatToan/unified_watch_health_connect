package com.huami.sleep.sleepintrodetail.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.huami.bloodoxygen.ui.view.BloodOxygenStatisticsView;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleepintrodetail.convert.SleepQuotientConvertKt;
import com.huami.sleep.sleepintrodetail.ui.IntoSleepDetailFragment;
import com.huami.sleep.sleepintrodetail.ui.SleepIntroDetailFragment;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailType;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroItemVo;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/util/SleepIntroDetailUtil;", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailType;", "type", "", "getRefDoc", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "detailVo", "Landroidx/fragment/app/Fragment;", "getDetailFragment", "detail", "", "getIntroValue", "(Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;)[Ljava/lang/String;", "getRefValue", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroItemVo;", "getIntroItems", "", StatEvent.BF_OPERATION_STATICS_TYPE, "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepIntroDetailUtil {

    @NotNull
    public static final SleepIntroDetailUtil INSTANCE = new SleepIntroDetailUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepIntroDetailType.values().length];
            iArr[SleepIntroDetailType.SLEEP_DURATION.ordinal()] = 1;
            iArr[SleepIntroDetailType.DEEP_SLEEP.ordinal()] = 2;
            iArr[SleepIntroDetailType.LIGHT_SLEEP.ordinal()] = 3;
            iArr[SleepIntroDetailType.REM_SLEEP.ordinal()] = 4;
            iArr[SleepIntroDetailType.NIGHT_AWAKE.ordinal()] = 5;
            iArr[SleepIntroDetailType.INTO_SLEEP_COUNT.ordinal()] = 6;
            iArr[SleepIntroDetailType.FALL_ASLEEP_TIME.ordinal()] = 7;
            iArr[SleepIntroDetailType.WAKE_UP_TIME.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepIntroDetailUtil() {
    }

    @NotNull
    public final Fragment getDetailFragment(@NotNull SleepIntroDetailVo detailVo) {
        return detailVo.getType() == SleepIntroDetailType.INTO_SLEEP_COUNT ? IntoSleepDetailFragment.INSTANCE.getInstance(detailVo) : SleepIntroDetailFragment.INSTANCE.getInstance(detailVo);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public final List<SleepIntroItemVo> getIntroItems(@NotNull SleepIntroDetailType type) {
        Context appContext = KoinExtKt.getAppContext();
        ArrayList arrayList = new ArrayList();
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_duration_section_1_title), appContext.getString(R.string.sleep_intro_duration_section_1_info)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_duration_section_2_title), appContext.getString(R.string.sleep_intro_duration_section_2_info)));
                return arrayList;
            case 2:
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_deep_section_1_title), appContext.getString(R.string.sleep_intro_deep_section_1_info)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_deep_section_2_title), appContext.getString(R.string.sleep_intro_deep_section_2_info)));
                return arrayList;
            case 3:
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_light_section_1_title), appContext.getString(R.string.sleep_intro_light_section_1_info)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_light_section_2_title), appContext.getString(R.string.sleep_intro_light_section_2_info)));
                return arrayList;
            case 4:
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_rem_section_1_title), appContext.getString(R.string.sleep_intro_rem_section_1_info)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_rem_section_2_title), appContext.getString(R.string.sleep_intro_rem_section_2_info)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_rem_section_3_title), appContext.getString(R.string.sleep_intro_deep_section_2_info)));
                return arrayList;
            case 5:
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_awake_section_1_title), appContext.getString(R.string.sleep_intro_awake_section_1_info)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_awake_section_2_title), appContext.getString(R.string.sleep_intro_awake_section_2_info_new)));
                return arrayList;
            case 6:
            default:
                return arrayList;
            case 7:
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_light_section_2_title), appContext.getString(R.string.sleep_intro_light_section_2_info)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_deep_section_2_title), appContext.getString(R.string.sleep_intro_deep_section_2_info)));
                return arrayList;
            case 8:
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_awake_section_2_title), appContext.getString(R.string.sleep_intro_awake_section_2_info_new)));
                arrayList.add(new SleepIntroItemVo(appContext.getString(R.string.sleep_intro_deep_section_2_title), appContext.getString(R.string.sleep_intro_deep_section_2_info)));
                return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String[] getIntroValue(@NotNull SleepIntroDetailVo detail) {
        Context appContext = KoinExtKt.getAppContext();
        switch (WhenMappings.$EnumSwitchMapping$0[detail.getType().ordinal()]) {
            case 1:
            case 6:
                Integer value = detail.getValue();
                Object durationStr$default = value != null ? TimeShowUtilsKt.getDurationStr$default(value.intValue(), appContext, false, false, 6, null) : null;
                return durationStr$default == null ? new String[]{BloodOxygenStatisticsView.INVALID, ""} : durationStr$default;
            case 2:
            case 3:
            case 4:
                return new String[]{String.valueOf(detail.getValue()), "%"};
            case 5:
                String[] strArr = new String[2];
                strArr[0] = String.valueOf(detail.getValue());
                Resources resources = appContext.getResources();
                int i = R.plurals.sleep_count_unit;
                Integer value2 = detail.getValue();
                strArr[1] = resources.getQuantityString(i, value2 != null ? value2.intValue() : 0);
                return strArr;
            case 7:
            case 8:
                String[] strArr2 = new String[2];
                Integer value3 = detail.getValue();
                strArr2[0] = String.valueOf(value3 != null ? SleepQuotientConvertKt.minutesToTime(value3.intValue()) : null);
                strArr2[1] = "";
                return strArr2;
            default:
                return new String[0];
        }
    }

    @NotNull
    public final String getRefDoc(@NotNull SleepIntroDetailType type) {
        return KoinExtKt.getAppContext().getString(WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1 ? R.string.sleep_intro_duration_references : R.string.sleep_intro_sleep_references);
    }

    @NotNull
    public final String getRefValue(@NotNull SleepIntroDetailVo detail) {
        return detail.getRefs();
    }

    public final void statistics(@NotNull SleepIntroDetailVo detail) {
        String str;
        switch (WhenMappings.$EnumSwitchMapping$0[detail.getType().ordinal()]) {
            case 1:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_SLEEP_DURATION;
                break;
            case 2:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_DEEP;
                break;
            case 3:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_LIGHT;
                break;
            case 4:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_REM;
                break;
            case 5:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_AWAKE;
                break;
            case 6:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_INTO_SLEEP;
                break;
            case 7:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_START_SLEEP_TIME;
                break;
            case 8:
                str = SleepStatusAnalytics.EventId.SLP_DETAIL_STOP_SLEEP_TIME;
                break;
            default:
                str = "";
                break;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SleepStatusAnalytics.recordEvent(str);
    }
}

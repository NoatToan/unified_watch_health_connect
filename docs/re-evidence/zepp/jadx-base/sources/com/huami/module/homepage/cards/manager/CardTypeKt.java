package com.huami.module.homepage.cards.manager;

import android.content.Context;
import com.huami.module.homepage.R;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.tools.analytics.DbUtils;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u001a.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0000¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/module/homepage/cards/manager/CardType;", "type", "Lkotlin/Triple;", "", "", "getIconFroCardType", "a", "b", Constant.KEY_CARD_TYPE, "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class CardTypeKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.PAI.ordinal()] = 1;
            iArr[CardType.SLEEP.ordinal()] = 2;
            iArr[CardType.HEART_RATE.ordinal()] = 3;
            iArr[CardType.STRESS.ordinal()] = 4;
            iArr[CardType.SPO2.ordinal()] = 5;
            iArr[CardType.WEIGHT.ordinal()] = 6;
            iArr[CardType.SPORT_RECORD.ordinal()] = 7;
            iArr[CardType.STEP.ordinal()] = 8;
            iArr[CardType.SLEEP_BREATH.ordinal()] = 9;
            iArr[CardType.CALORIES.ordinal()] = 10;
            iArr[CardType.FEMALE_HEALTH.ordinal()] = 11;
            iArr[CardType.BALANCE.ordinal()] = 12;
            iArr[CardType.SLEEP_AID.ordinal()] = 13;
            iArr[CardType.SPORT_STATE.ordinal()] = 14;
            iArr[CardType.PRESS_SPO2.ordinal()] = 15;
            iArr[CardType.BODY_TEMPERATURE.ordinal()] = 16;
            iArr[CardType.ECG.ordinal()] = 17;
            iArr[CardType.SIGNS_STATE.ordinal()] = 18;
            iArr[CardType.MINE_TOOL.ordinal()] = 19;
            iArr[CardType.STAR_SKY.ordinal()] = 20;
            iArr[CardType.HEALTH_LABEL.ordinal()] = 21;
            iArr[CardType.PHN.ordinal()] = 22;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Triple<Integer, Integer, String> a(Context context, CardType cardType) {
        switch (cardType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                return new Triple<>(Integer.valueOf(R.drawable.ic_pai_24_mifit), 0, context.getString(R.string.homepage_item_card_pai));
            case 2:
                return new Triple<>(Integer.valueOf(R.drawable.ic_sleep_24_s24_mifit), 0, context.getString(R.string.homepage_item_card_sleep));
            case 3:
                return new Triple<>(Integer.valueOf(R.drawable.ic_heart_rate_24_s30_mifit), 0, context.getString(R.string.homepage_item_card_heart_rate));
            case 4:
                return new Triple<>(Integer.valueOf(R.drawable.ic_stress_24_s30_mifit), 0, context.getString(R.string.homepage_item_card_pressure));
            case 5:
                return new Triple<>(Integer.valueOf(R.drawable.ic_blood_glucose_24_s20_mifit), 0, context.getString(R.string.homepage_item_card_spo2));
            case 6:
                return new Triple<>(Integer.valueOf(R.drawable.ic_weight_24_s20_mifit), 0, context.getString(R.string.homepage_item_card_weight_analysis));
            case 7:
                return new Triple<>(Integer.valueOf(R.drawable.ic_sport_record_24_s20_mifit), 0, context.getString(R.string.homepage_item_card_sport_record));
            case 8:
                return new Triple<>(Integer.valueOf(R.drawable.ic_walk_24_s33_mifit), 0, context.getString(R.string.homepage_item_card_step));
            case 9:
                return new Triple<>(Integer.valueOf(R.drawable.ic_breathe_24_s25_mifit), 0, context.getString(R.string.homepage_item_card_breath_equality));
            case 10:
                return new Triple<>(Integer.valueOf(R.drawable.ic_calories_24_s30_mifit), 0, context.getString(R.string.homepage_item_card_calorie));
            case 11:
                return new Triple<>(Integer.valueOf(R.drawable.ic_women_24_s50_mifit), 0, context.getString(R.string.homepage_item_card_female_health));
            case 12:
                return new Triple<>(Integer.valueOf(R.drawable.ic_balance_24_s15_mifit), 0, context.getString(R.string.homepage_item_card_balance));
            case 13:
                return new Triple<>(Integer.valueOf(R.drawable.ic_monitor_24_s25_mifit), 0, context.getString(R.string.homepage_play_music_sleep));
            case 14:
                return new Triple<>(Integer.valueOf(R.drawable.ic_sport_state_24_s15_mifit), 0, context.getString(R.string.homepage_item_card_sport_state));
            default:
                return null;
        }
    }

    private static final Triple<Integer, Integer, String> b(Context context, CardType cardType) {
        switch (cardType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                return new Triple<>(Integer.valueOf(R.drawable.ic_pai_24), Integer.valueOf(R.color.s25), context.getString(R.string.homepage_item_card_pai));
            case 2:
                return new Triple<>(Integer.valueOf(R.drawable.ic_monitor_snoring_24), Integer.valueOf(R.color.s25), context.getString(R.string.homepage_item_card_sleep));
            case 3:
                return new Triple<>(Integer.valueOf(R.drawable.ic_heart_rate_24), Integer.valueOf(R.color.p3), context.getString(R.string.homepage_item_card_heart_rate));
            case 4:
            case 5:
            case 12:
            case 13:
            default:
                return null;
            case 6:
                return new Triple<>(Integer.valueOf(R.drawable.ic_weight_24), Integer.valueOf(R.color.s20), context.getString(R.string.homepage_item_card_weight_analysis));
            case 7:
                return new Triple<>(Integer.valueOf(R.drawable.ic_activities_24), Integer.valueOf(R.color.s15), context.getString(R.string.homepage_item_card_sport_record));
            case 8:
                return new Triple<>(Integer.valueOf(R.drawable.ic_steps_24), Integer.valueOf(R.color.s30), context.getString(R.string.homepage_item_card_step));
            case 9:
                return new Triple<>(Integer.valueOf(R.drawable.ic_stress_reliever_24), Integer.valueOf(R.color.s15), context.getString(R.string.homepage_item_card_breath_equality));
            case 10:
                return new Triple<>(Integer.valueOf(R.drawable.ic_calories_24), Integer.valueOf(R.color.p3), context.getString(R.string.homepage_item_card_calorie));
            case 11:
                return new Triple<>(Integer.valueOf(R.drawable.ic_women_s_health_24), Integer.valueOf(R.color.p3), context.getString(R.string.homepage_item_card_female_health));
            case 14:
                return new Triple<>(Integer.valueOf(R.drawable.ic_motion_state_24), Integer.valueOf(R.color.s15), context.getString(R.string.homepage_item_card_sport_state));
            case 15:
                return new Triple<>(Integer.valueOf(R.drawable.ic_stress_24), Integer.valueOf(R.color.s20), context.getString(R.string.homepage_item_card_press_spo2));
            case 16:
                return new Triple<>(Integer.valueOf(R.drawable.ic_body_temperature_24), Integer.valueOf(R.color.s25), context.getString(R.string.homepage_item_card_temperature));
            case 17:
                return new Triple<>(Integer.valueOf(R.drawable.ic_ecg_24), Integer.valueOf(R.color.p3), context.getString(R.string.homepage_item_card_ecg));
            case 18:
                return new Triple<>(Integer.valueOf(R.drawable.ic_blood_glucose_24), Integer.valueOf(R.color.p3), context.getString(R.string.homepage_item_card_blood_pressure_sugar));
            case 19:
                return new Triple<>(Integer.valueOf(R.drawable.ic_tools_24), Integer.valueOf(R.color.s20), context.getString(R.string.homepage_item_card_mine_tool));
            case 20:
                return new Triple<>(Integer.valueOf(R.drawable.ic_relax_music_24), Integer.valueOf(R.color.s25), context.getString(R.string.homepage_item_card_star_sky));
            case 21:
                return new Triple<>(Integer.valueOf(R.drawable.ic_health_label_24), Integer.valueOf(R.color.s15), context.getString(R.string.homepage_item_card_health_label));
            case 22:
                return new Triple<>(Integer.valueOf(R.drawable.ic_fitness_coach), Integer.valueOf(R.color.s15), context.getString(R.string.phn_common_title));
        }
    }

    @Nullable
    public static final CardType cardType(@NotNull String str) {
        for (CardType cardType : CardType.values()) {
            if (Intrinsics.areEqual(cardType.name(), str)) {
                return cardType;
            }
        }
        return null;
    }

    @Nullable
    public static final Triple<Integer, Integer, String> getIconFroCardType(@NotNull Context context, @Nullable CardType cardType) {
        return HomeUtils.isMifitApp() ? a(context, cardType) : b(context, cardType);
    }
}

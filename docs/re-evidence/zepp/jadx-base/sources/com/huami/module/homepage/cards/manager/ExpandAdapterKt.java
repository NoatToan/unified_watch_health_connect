package com.huami.module.homepage.cards.manager;

import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.helper.ExpandHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\"&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/huami/module/homepage/cards/manager/CardType;", "type", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "b", "", "a", "Lkotlin/Pair;", "", "", "c", "(Lcom/huami/module/homepage/cards/manager/CardType;)Lkotlin/Pair;", "recordParam", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class ExpandAdapterKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.PAI.ordinal()] = 1;
            iArr[CardType.SLEEP.ordinal()] = 2;
            iArr[CardType.HEART_RATE.ordinal()] = 3;
            iArr[CardType.PRESS_SPO2.ordinal()] = 4;
            iArr[CardType.WEIGHT.ordinal()] = 5;
            iArr[CardType.SPORT_RECORD.ordinal()] = 6;
            iArr[CardType.STEP.ordinal()] = 7;
            iArr[CardType.SLEEP_BREATH.ordinal()] = 8;
            iArr[CardType.CALORIES.ordinal()] = 9;
            iArr[CardType.ECG.ordinal()] = 10;
            iArr[CardType.SPORT_STATE.ordinal()] = 11;
            iArr[CardType.FEMALE_HEALTH.ordinal()] = 12;
            iArr[CardType.BODY_TEMPERATURE.ordinal()] = 13;
            iArr[CardType.SIGNS_STATE.ordinal()] = 14;
            iArr[CardType.MINE_TOOL.ordinal()] = 15;
            iArr[CardType.HEALTH_LABEL.ordinal()] = 16;
            iArr[CardType.EDIT_CARD.ordinal()] = 17;
            iArr[CardType.STAR_SKY.ordinal()] = 18;
            iArr[CardType.STRESS.ordinal()] = 19;
            iArr[CardType.SPO2.ordinal()] = 20;
            iArr[CardType.BALANCE.ordinal()] = 21;
            iArr[CardType.SLEEP_AID.ordinal()] = 22;
            iArr[CardType.PHN.ordinal()] = 23;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CardType cardType) {
        HomeAnalytics homeAnalytics;
        int i = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
        if (i == 1) {
            homeAnalytics = HomeAnalytics.INDEX_CARDS_PAI_EXPAND_C;
        } else if (i == 2) {
            homeAnalytics = HomeAnalytics.INDEX_CARDS_SLEEP_EXPAND_C;
        } else if (i == 3) {
            homeAnalytics = HomeAnalytics.INDEX_CARDS_HEARTRATE_EXPAND_C;
        } else if (i == 7) {
            homeAnalytics = HomeAnalytics.INDEX_CARDS_STEP_EXPAND_C;
        } else if (i != 8) {
            homeAnalytics = i != 9 ? null : HomeAnalytics.INDEX_CARDS_CALORIE_EXPAND_C;
        } else {
            homeAnalytics = HomeAnalytics.INDEX_CARDS_SLEEP_BREATH_QUALITY_EXPAND_C;
        }
        if (homeAnalytics == null) {
            return;
        }
        StatusAnalyticsKt.recordEvent(homeAnalytics, c(cardType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountEventBuilder b(CardType cardType) {
        switch (WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_PAI_V, c(cardType));
            case 2:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_SLEEP_V, c(cardType));
            case 3:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_HEARTRATE_V, c(cardType));
            case 4:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_STRESSSPO2_V, new Pair[0]);
            case 5:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_WEIGHT_V, new Pair[0]);
            case 6:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_EXERCISERECORD_V, new Pair[0]);
            case 7:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_STEP_V, c(cardType));
            case 8:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_SLEEPBEATHINGQUALITY_V, c(cardType));
            case 9:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_CALORIE_V, c(cardType));
            case 10:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_ECG_V, new Pair[0]);
            case 11:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_VO2MAXEPOC_V, new Pair[0]);
            case 12:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_WOMENSHEALTH_V, new Pair[0]);
            case 13:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_BODYTEMPERATURE_V, new Pair[0]);
            case 14:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_BPBG_V, new Pair[0]);
            case 15:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_MYTOOLS_V, new Pair[0]);
            case 16:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_TAGS_V, new Pair[0]);
            case 17:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_EDIT_V, new Pair[0]);
            case 18:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_STAR_SKY_V, TuplesKt.to("from", 0));
            case 19:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_STRESS_V, new Pair[0]);
            case 20:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_SPO2_V, new Pair[0]);
            case 21:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_BALANCE_V, new Pair[0]);
            case 22:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_AID_V, new Pair[0]);
            case 23:
                return StatusAnalyticsKt.loadCountEventBuilder(HomeAnalytics.INDEX_CARDS_PHN_V, new Pair[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Pair<String, Integer> c(CardType cardType) {
        return TuplesKt.to("status", Integer.valueOf(ExpandHelper.INSTANCE.isExpand(cardType.name()) ? 1 : 0));
    }
}

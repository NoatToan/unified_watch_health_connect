package com.huami.phn.coach.service;

import android.content.Context;
import com.huami.phn.coach.R;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.usecase.GetPHNPlanUseCase;
import com.huami.phn.core.model.PHNCardData;
import com.huami.phn.logic.PHNStateLogic;
import com.huami.phn.service.PHNCardTipsData;
import com.huami.phn.service.PHNStateEntry;
import com.huami.phn.service.PHNStateService;
import com.huami.phn.service.PHNStateType;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/phn/coach/service/PHNStateServiceImpl;", "Lcom/huami/phn/service/PHNStateService;", "", "flag", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Pair;", "Lcom/huami/phn/service/PHNStateType;", "", "c", "", "value", "a", "b", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/phn/service/PHNStateEntry;", "loadPHNStateData", "", "launchPageWithResult", "Z", "hasPlanInited", "<init>", "()V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNStateServiceImpl implements PHNStateService {

    @NotNull
    public static final String TAG = "PHNStateServiceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean hasPlanInited;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PHNStateType.values().length];
            iArr[PHNStateType.PLAN_ON_GOING_OVER_LOAD_TODAY_NO_PLAN.ordinal()] = 1;
            iArr[PHNStateType.PLAN_ON_GOING_DONE_THIS_WEEK_NO_PLAN.ordinal()] = 2;
            iArr[PHNStateType.PLAN_ON_GOING_TODAY_HAS_FINISHED.ordinal()] = 3;
            iArr[PHNStateType.PLAN_ON_GOING_TODAY_UN_FINISH.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float a(float value) {
        return new BigDecimal(String.valueOf(value)).setScale(1, 4).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, String> b(float value, Context context) {
        if (value >= 10.0f) {
            return new Pair<>(4, context.getString(R.string.phn_training_analysis_status_rest_modify));
        }
        if (value >= 5.0f && value < 10.0f) {
            return new Pair<>(3, context.getString(R.string.phn_training_analysis_status_abundant));
        }
        if (value < -5.0f || value >= 5.0f) {
            return (value < -30.0f || value >= -5.0f) ? new Pair<>(0, context.getString(R.string.phn_training_analysis_status_over)) : new Pair<>(1, context.getString(R.string.phn_training_analysis_status_optimal));
        }
        return new Pair<>(2, context.getString(R.string.phn_training_analysis_status_balance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<PHNStateType, String> c(int flag, Context context) {
        String string;
        PHNStateType pHNStateType = PHNStateType.PLAN_ON_GOING_OVER_LOAD_TODAY_NO_PLAN;
        if (!(4 <= flag && flag <= 7)) {
            HMLog.i(TAG, "Error phn card state with flag: " + flag + ", set to default state", new Object[0]);
            return new Pair<>(pHNStateType, context.getString(R.string.phn_card_suggested_rest));
        }
        PHNStateType[] pHNStateTypeArrValues = PHNStateType.values();
        ArrayList arrayList = new ArrayList(pHNStateTypeArrValues.length);
        for (PHNStateType pHNStateType2 : pHNStateTypeArrValues) {
            if (pHNStateType2.getFlag() == flag) {
                pHNStateType = pHNStateType2;
            }
            arrayList.add(Unit.INSTANCE);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[pHNStateType.ordinal()];
        if (i == 1) {
            string = context.getString(R.string.phn_card_suggested_rest);
        } else if (i == 2 || i == 3) {
            string = context.getString(R.string.phn_card_week_plan_completed);
        } else if (i != 4) {
            HMLog.i(TAG, "Error phn card  state:" + pHNStateType, new Object[0]);
            string = context.getString(R.string.phn_card_suggested_rest);
        } else {
            string = "";
        }
        return new Pair<>(pHNStateType, string);
    }

    @Override // com.huami.phn.service.PHNStateService
    public boolean launchPageWithResult(@NotNull Context context) {
        return PHNStateLogic.INSTANCE.gotoSettingOrDetailPage(context, this.hasPlanInited);
    }

    @Override // com.huami.phn.service.PHNStateService
    @NotNull
    public Flow<PHNStateEntry> loadPHNStateData(@NotNull final Context context) {
        String string = context.getString(R.string.phn_reminder_popup_tilte);
        String string2 = context.getString(R.string.phn_reminder_popup_desc_modify);
        Boolean bool = Boolean.FALSE;
        int i = R.string.phn_reminder_support_device_desc;
        String string3 = context.getString(i);
        Boolean bool2 = Boolean.TRUE;
        PHNCardTipsData pHNCardTipsData = new PHNCardTipsData(string, CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(string2, bool), new Pair(string3, bool2)}), false);
        PHNCardTipsData pHNCardTipsData2 = new PHNCardTipsData(context.getString(R.string.phn_welcome_use), e.listOf(new Pair(context.getString(R.string.phn_welcome_use_content_modify), bool)), true);
        PHNCardTipsData pHNCardTipsData3 = new PHNCardTipsData(context.getString(R.string.phn_how_to_use), e.listOf(new Pair(context.getString(R.string.phn_how_to_use_content_modify), bool)), true);
        PHNCardTipsData pHNCardTipsData4 = new PHNCardTipsData(context.getString(R.string.phn_reminder_help_support_device_title), CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(context.getString(i), bool2), new Pair(context.getString(R.string.phn_currently_supported_device_content), bool)}), true);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(pHNCardTipsData);
        arrayList.add(pHNCardTipsData2);
        arrayList.add(pHNCardTipsData3);
        arrayList.add(pHNCardTipsData4);
        final Flow<PHNCardData> flowExecute = ((GetPHNPlanUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(GetPHNPlanUseCase.class), null, null)).execute();
        return new Flow<PHNStateEntry>() { // from class: com.huami.phn.coach.service.PHNStateServiceImpl$loadPHNStateData$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull final FlowCollector<? super PHNStateEntry> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowExecute.collect(new FlowCollector<PHNCardData>() { // from class: com.huami.phn.coach.service.PHNStateServiceImpl$loadPHNStateData$$inlined$map$1.2
                    /* JADX WARN: Code duplicated, block: B:32:0x016a A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:33:0x016b  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(PHNCardData pHNCardData, @NotNull Continuation continuation2) {
                        PHNStateType pHNStateType;
                        String string4;
                        String string5;
                        String str;
                        int i2;
                        int i3;
                        long j;
                        float f;
                        Object objEmit;
                        FlowCollector flowCollector2 = flowCollector;
                        PHNCardData pHNCardData2 = pHNCardData;
                        HMLog.i(PHNStateServiceImpl.TAG, "phn-plan is: " + pHNCardData2.getState() + ", " + pHNCardData2.getUpdate(), new Object[0]);
                        PHNStateType pHNStateType2 = PHNStateType.PLAN_ON_GOING_OVER_LOAD_TODAY_NO_PLAN;
                        this.hasPlanInited = true;
                        PHNCardData.State state = pHNCardData2.getState();
                        long timeInMillis = 0;
                        if (Intrinsics.areEqual(state, PHNCardData.State.UnInit.INSTANCE)) {
                            this.hasPlanInited = false;
                            pHNStateType = PHNStateType.PLAN_UNOPENED;
                            string4 = context.getString(R.string.phn_open_new_plan);
                            str = "";
                            string5 = str;
                        } else {
                            if (!Intrinsics.areEqual(state, PHNCardData.State.ToBeStart.INSTANCE)) {
                                if (Intrinsics.areEqual(state, PHNCardData.State.OnGoing.INSTANCE)) {
                                    float fA = this.a(pHNCardData2.getTsbValue());
                                    PHNStateServiceImpl$loadPHNStateData$$inlined$map$1 pHNStateServiceImpl$loadPHNStateData$$inlined$map$1 = this;
                                    Pair pairB = this.b(fA, context);
                                    int iIntValue = ((Number) pairB.getFirst()).intValue();
                                    String str2 = (String) pairB.getSecond();
                                    int dailyPercent = pHNCardData2.getDailyPercent();
                                    Calendar update = pHNCardData2.getUpdate();
                                    timeInMillis = update != null ? update.getTimeInMillis() : 0L;
                                    if (pHNCardData2.isRestDay()) {
                                        str = str2;
                                        i2 = dailyPercent;
                                        pHNStateType = PHNStateType.PLAN_ON_GOING_REST_TODAY;
                                        i3 = iIntValue;
                                        string4 = "";
                                        j = timeInMillis;
                                        f = fA;
                                        string5 = context.getString(R.string.phn_card_today_is_rest);
                                    } else {
                                        Pair pairC = this.c(pHNCardData2.getFlag(), context);
                                        PHNStateType pHNStateType3 = (PHNStateType) pairC.getFirst();
                                        str = str2;
                                        i2 = dailyPercent;
                                        string5 = (String) pairC.getSecond();
                                        i3 = iIntValue;
                                        string4 = "";
                                        j = timeInMillis;
                                        f = fA;
                                        pHNStateType = pHNStateType3;
                                    }
                                } else {
                                    if (!Intrinsics.areEqual(state, PHNCardData.State.End.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    PHNStateType pHNStateType4 = PHNStateType.PLAN_STOPED;
                                    Calendar update2 = pHNCardData2.getUpdate();
                                    timeInMillis = update2 != null ? update2.getTimeInMillis() : 0L;
                                    pHNStateType = pHNStateType4;
                                    string4 = context.getString(R.string.phn_reopen_new_plan);
                                    string5 = context.getString(R.string.phn_plan_terminated);
                                    str = "";
                                }
                                objEmit = flowCollector2.emit(new PHNStateEntry(i3, str, f, i2, string5, string4, pHNCardData2.getLinkUrl(), pHNStateType, arrayList, j), continuation2);
                                if (objEmit == a.getCOROUTINE_SUSPENDED()) {
                                    return objEmit;
                                }
                                return Unit.INSTANCE;
                            }
                            Calendar update3 = pHNCardData2.getUpdate();
                            timeInMillis = update3 != null ? update3.getTimeInMillis() : 0L;
                            pHNStateType = PHNStateType.PLAN_NOT_START;
                            string5 = context.getString(R.string.phn_plan_not_started);
                            str = "";
                            string4 = str;
                        }
                        j = timeInMillis;
                        i3 = -1;
                        f = 0.0f;
                        i2 = -1;
                        objEmit = flowCollector2.emit(new PHNStateEntry(i3, str, f, i2, string5, string4, pHNCardData2.getLinkUrl(), pHNStateType, arrayList, j), continuation2);
                        if (objEmit == a.getCOROUTINE_SUSPENDED()) {
                            return objEmit;
                        }
                        return Unit.INSTANCE;
                    }
                }, continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}

package com.xiaomi.hm.health.sleep.koin.impl;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.huami.feedback.api.FeedbackService;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.sleep.koin.IPageNavigate;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.share.HMShareActivity;
import com.xiaomi.hm.health.share.ShareAdapter;
import com.xiaomi.hm.health.share.ShareSleep;
import com.xiaomi.hm.health.sleep.converter.DataTypeConverterKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016JK\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/PageNavigateImpl;", "Lcom/huami/sleep/koin/IPageNavigate;", "Landroid/app/Activity;", "activity", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "", "navigateToShare", "", "type", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "shareSleepVo", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "navigateToFeedBack", "mode", "", "url", "event", "", "extras", "adDoJumpAction", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "navigateToDetectSetting", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PageNavigateImpl implements IPageNavigate {
    @Override // com.huami.sleep.koin.IPageNavigate
    public void adDoJumpAction(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String event, @Nullable Map<String, String> extras) {
        HMAdManager.doJumpAction$default(context, mode, url, null, extras, null, 32, null);
    }

    @Override // com.huami.sleep.koin.IPageNavigate
    public void navigateToDetectSetting(@NotNull Context context) {
        HealthDataNavigator.INSTANCE.navigateToDetectSetting(context);
    }

    @Override // com.huami.sleep.koin.IPageNavigate
    public void navigateToFeedBack(@Nullable Context context, @NotNull FragmentManager fragmentManager) {
        if (context == null) {
            HMLog.info("feedback", new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.koin.impl.PageNavigateImpl.navigateToFeedBack.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "跳转用户反馈的context为null";
                }
            });
        } else {
            ((FeedbackService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FeedbackService.class), null, null)).feedback(null, context, fragmentManager, null);
        }
    }

    @Override // com.huami.sleep.koin.IPageNavigate
    public void navigateToShare(@Nullable Activity activity, @Nullable SleepInfo sleepInfo) {
        if (sleepInfo == null) {
            return;
        }
        DaySportData daySportData = new DaySportData(sleepInfo.getSportDay());
        daySportData.setSleepInfo(sleepInfo);
        ShareSleep shareSleep = ShareAdapter.newInstance().parse2Sleep(daySportData);
        if (sleepInfo.getRemCount() == 0 && sleepInfo.getNonRemCount() == 0) {
            shareSleep.sleepScore = 0;
        }
        if (activity == null) {
            return;
        }
        HMShareActivity.launch(activity, 1, 0, shareSleep);
    }

    @Override // com.huami.sleep.koin.IPageNavigate
    public void navigateToShare(@Nullable Activity activity, int type, @Nullable ShareSleepVo shareSleepVo) {
        if (activity == null) {
            return;
        }
        int i = 2;
        if (type != 1) {
            i = (type == 2 || type == 3) ? 3 : 1;
        }
        HMShareActivity.launch(activity, i, 0, shareSleepVo == null ? null : DataTypeConverterKt.toShareSleep(shareSleepVo, activity));
    }
}

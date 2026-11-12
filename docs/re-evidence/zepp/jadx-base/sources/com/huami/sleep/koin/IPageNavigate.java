package com.huami.sleep.koin;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J$\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH&JK\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/koin/IPageNavigate;", "", "Landroid/app/Activity;", "activity", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "", "navigateToShare", "", "type", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "shareSleepVo", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "navigateToFeedBack", "mode", "", "url", "event", "", "extras", "adDoJumpAction", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "navigateToDetectSetting", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IPageNavigate {
    void adDoJumpAction(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String event, @Nullable Map<String, String> extras);

    void navigateToDetectSetting(@NotNull Context context);

    void navigateToFeedBack(@Nullable Context context, @NotNull FragmentManager fragmentManager);

    void navigateToShare(@Nullable Activity activity, int type, @Nullable ShareSleepVo shareSleepVo);

    void navigateToShare(@Nullable Activity activity, @Nullable SleepInfo sleepInfo);
}

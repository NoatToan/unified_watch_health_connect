package com.xiaomi.hm.health.thirdbind;

import android.app.Fragment;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.third.alipay.ui.AlipayBind;
import com.huami.third.alipay.ui.LoadingView;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.BuildConfig;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/AlipayBindEntry;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "open", "", "a", "Ljava/lang/String;", "ALIPAY_BIND_LOADING_TAG", "()Ljava/lang/String;", "ALIPAY_APP_ID", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlipayBindEntry {

    @NotNull
    public static final AlipayBindEntry INSTANCE = new AlipayBindEntry();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String ALIPAY_BIND_LOADING_TAG = "wechat-bind-loading";

    private AlipayBindEntry() {
    }

    private final String a() {
        if (GlobalConfig.get().isBuildMidong()) {
            return HMServerDef.isProductUrl() ? "2017050907177868" : "2019052465393251";
        }
        return BuildConfig.ALIPAY_APP_ID;
    }

    @JvmStatic
    public static final void open(@NotNull final Context context) {
        AlipayBind.open(context, HMServerDef.getHost(), HMPersonInfo.getInstance().getUserInfo().getUserid(), INSTANCE.a(), (32 & 16) != 0 ? null : new LoadingView() { // from class: com.xiaomi.hm.health.thirdbind.AlipayBindEntry.open.1
            @Override // com.huami.third.alipay.ui.LoadingView
            public void hideLoading(@NotNull FragmentActivity activity) {
                Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(AlipayBindEntry.ALIPAY_BIND_LOADING_TAG);
                if (fragmentFindFragmentByTag != null) {
                    ((AlertDialogFragment) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                }
            }

            @Override // com.huami.third.alipay.ui.LoadingView
            public void showLoading(@NotNull FragmentActivity activity) {
                hideLoading(activity);
                AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
                if (alertDialogFragmentNewInstance == null) {
                    return;
                }
                alertDialogFragmentNewInstance.setMessage(context.getString(R.string.loading));
                alertDialogFragmentNewInstance.setCancelable(true);
                alertDialogFragmentNewInstance.show(activity.getFragmentManager(), AlipayBindEntry.ALIPAY_BIND_LOADING_TAG);
            }
        }, (32 & 32) != 0 ? null : null);
    }
}

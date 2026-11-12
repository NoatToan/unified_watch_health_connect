package com.xiaomi.fitness.sport.sporttab;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.res.preload.export.PreloadManagerExtKt;
import com.xiaomi.fitness.res.preload.export.ResPreloadManager;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import defpackage.ni4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/SportTabV4Fragment;", "Lcom/xiaomi/yrn/controller/ui/YRNCFragment;", "<init>", "()V", "dataChangedReceiver", "Lcom/xiaomi/fitness/sport/sporttab/SportTabRNPageDataChangeReceiver;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "registerDataChangedBroadcastReceiver", "unregisterChangeListeners", "onHiddenChanged", "hidden", "", LifecycleConstantKt.ON_DESTROY, "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTabV4Fragment extends Hilt_SportTabV4Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String MODULE_NAME = "sport";

    @NotNull
    public static final String SPORT_HOME_PATH = "sport/SportHome";

    @NotNull
    public static final String TAG = "SportTabFragment";

    @Nullable
    private SportTabRNPageDataChangeReceiver dataChangedReceiver;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/SportTabV4Fragment$Companion;", "", "<init>", "()V", "TAG", "", "MODULE_NAME", "SPORT_HOME_PATH", "getFixedUrl", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getFixedUrl() {
            YRNHelper.Companion companion = YRNHelper.INSTANCE;
            return YRNHelperExtKt.getInstance(companion).pageUrl(YRNHelperExtKt.getInstance(companion).appName(), SportTabV4Fragment.SPORT_HOME_PATH);
        }
    }

    private final void registerDataChangedBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        intentFilter.addAction(FitnessDataConstants.ACTION_DATA_LIST_CHANGED_BROADCAST);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.dataChangedReceiver = new SportTabRNPageDataChangeReceiver(fragmentActivityRequireActivity);
        if (Build.VERSION.SDK_INT >= 33) {
            requireActivity().registerReceiver(this.dataChangedReceiver, intentFilter, 4);
        } else {
            ni4.k(requireActivity(), this.dataChangedReceiver, intentFilter, 4);
        }
    }

    private final void unregisterChangeListeners() {
        SportTabRNPageDataChangeReceiver sportTabRNPageDataChangeReceiver = this.dataChangedReceiver;
        if (sportTabRNPageDataChangeReceiver != null) {
            requireActivity().unregisterReceiver(sportTabRNPageDataChangeReceiver);
        }
    }

    @Override // com.xiaomi.yrn.controller.ui.YRNCFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (getArguments() == null) {
            Bundle bundle = new Bundle();
            bundle.putString("appName", YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).appName());
            bundle.putString(RnReportConst.ApiReport.PARAM_MODULE, "sport");
            Companion companion = INSTANCE;
            bundle.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, companion.getFixedUrl());
            bundle.putString("url", companion.getFixedUrl());
            setArguments(bundle);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putString("appName", YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).appName());
                arguments.putString(RnReportConst.ApiReport.PARAM_MODULE, "sport");
                Companion companion2 = INSTANCE;
                arguments.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, companion2.getFixedUrl());
                arguments.putString("url", companion2.getFixedUrl());
            }
        }
        super.onCreate(savedInstanceState);
        ISportAccessApi.DefaultImpls.checkAndDownloadAudioFeedbackResourcesIfNeed$default(SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE), false, null, null, null, 15, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        unregisterChangeListeners();
    }

    @Override // com.xiaomi.yrn.controller.ui.YRNCFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        ISportAccessApi.DefaultImpls.checkAndDownloadAudioFeedbackResourcesIfNeed$default(SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE), false, null, null, null, 15, null);
        PreloadManagerExtKt.getInstance(ResPreloadManager.INSTANCE).preloadIfNeed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        registerDataChangedBroadcastReceiver();
    }
}

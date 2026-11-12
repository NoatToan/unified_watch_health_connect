package com.xiaomi.fitness.ubox_guide.ui.fragment;

import android.os.Bundle;
import androidx.navigation.NavController;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.TempManager;
import com.xiaomi.fitness.device.manager.export.TempManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import defpackage.esi;
import defpackage.lvi;
import defpackage.r8q;
import defpackage.wc0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/ubox_guide/ui/fragment/BeginnerGuideFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/ubox_guide/ui/fragment/TempViewModel;", "Lr8q;", "", "bindView", "(Lr8q;)V", "<init>", "()V", "Companion", "ubox-guide_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BeginnerGuideFragment extends BaseBindingFragment<TempViewModel, r8q> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String WEBVIEW_URL = "URL";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/ubox_guide/ui/fragment/BeginnerGuideFragment$Companion;", "", "<init>", "()V", "WEBVIEW_URL", "", "getWEBVIEW_URL", "()Ljava/lang/String;", "gotoBeginnerGuideFragment", "", "navController", "Landroidx/navigation/NavController;", "url", "ubox-guide_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getWEBVIEW_URL() {
            return BeginnerGuideFragment.WEBVIEW_URL;
        }

        public final void gotoBeginnerGuideFragment(@NotNull NavController navController, @NotNull String url) {
            Intrinsics.checkNotNullParameter(navController, "navController");
            Intrinsics.checkNotNullParameter(url, "url");
            Bundle bundle = new Bundle();
            bundle.putString(getWEBVIEW_URL(), url);
            navController.o(esi.f17023b, bundle);
        }
    }

    public BeginnerGuideFragment() {
        super(lvi.d);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull r8q r8qVar) {
        Intrinsics.checkNotNullParameter(r8qVar, "<this>");
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            getParentFragmentManager().o().w(esi.e, SettingsPageUtilExtKt.getSettingsPageUtil().newGuideWebViewPage(TempManagerExtKt.getInstance(TempManager.INSTANCE).getGuideUrl(DeviceModelExtKt.getModel(wearableDeviceModel)))).l();
        } else {
            finish();
        }
    }
}

package com.xiaomi.fitness.devicesettings.huami.weather;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.BaseWidgetBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.weather.WeatherHelpFragment;
import defpackage.eui;
import defpackage.oj6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u0005J/\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherHelpFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/BaseWidgetBindingFragment;", "Loj6;", "", "refreshUI", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "visible", "setListener", "onVisible", "", AccountInteractActivity.KEY_REQUEST_CODE, "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeatherHelpFragment extends BaseWidgetBindingFragment<oj6> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int sPermissionRequestCode = 10;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherHelpFragment$Companion;", "", "<init>", "()V", "sPermissionRequestCode", "", "getSPermissionRequestCode", "()I", "setSPermissionRequestCode", "(I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSPermissionRequestCode() {
            return WeatherHelpFragment.sPermissionRequestCode;
        }

        public final void setSPermissionRequestCode(int i) {
            WeatherHelpFragment.sPermissionRequestCode = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshUI() {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        if (LocationExtKt.isGpsEnable(mActivity)) {
            ((oj6) getMBinding()).B.setText(wzi.b2);
        } else {
            ((oj6) getMBinding()).B.setText(wzi.Z1);
        }
        if (!PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.ACCESS_COARSE_LOCATION"})) {
            ((oj6) getMBinding()).A.setText(wzi.b2);
        } else {
            ((oj6) getMBinding()).A.setText(wzi.Z1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(WeatherHelpFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.ACCESS_COARSE_LOCATION"})) {
            PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
            FragmentActivity mActivity = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity);
            permissionsUtil.requestPermissions(mActivity, new String[]{"android.permission.ACCESS_COARSE_LOCATION"});
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        FragmentActivity mActivity2 = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        intent.setData(Uri.fromParts("package", mActivity2.getPackageName(), null));
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(WeatherHelpFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.N0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == sPermissionRequestCode && (!PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.ACCESS_COARSE_LOCATION"}))) {
            refreshUI();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.g9);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        refreshUI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        ((oj6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: s8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeatherHelpFragment.setListener$lambda$0(this.f33415a, view);
            }
        });
        ((oj6) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: t8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeatherHelpFragment.setListener$lambda$1(this.f34460a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void visible() {
        super.visible();
        refreshUI();
    }
}

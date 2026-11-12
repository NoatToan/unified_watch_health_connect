package com.xiaomi.wearable.yrn.helper;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.yrn.controller.ui.YRNCFragment;
import defpackage.gsi;
import defpackage.lwr;
import defpackage.ugi;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/WearableFragmentNavigator;", "", "<init>", "()V", "TAG", "", "navigateTo", "", "currentFragment", "Landroidx/fragment/app/Fragment;", "targetFragment", "containerId", "", "addToBackStack", "", "withAnimation", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Ljava/lang/Integer;ZZ)V", "newYRNFragment", "url", PluginDeviceInfo.FDESC, "Landroid/os/Bundle;", "popBackStack", "getCurrentFragment", "act", "Landroidx/fragment/app/FragmentActivity;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearableFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableFragmentNavigator.kt\ncom/xiaomi/wearable/yrn/helper/WearableFragmentNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1#2:142\n295#3,2:143\n*S KotlinDebug\n*F\n+ 1 WearableFragmentNavigator.kt\ncom/xiaomi/wearable/yrn/helper/WearableFragmentNavigator\n*L\n135#1:143,2\n*E\n"})
public final class WearableFragmentNavigator {

    @NotNull
    public static final WearableFragmentNavigator INSTANCE = new WearableFragmentNavigator();

    @NotNull
    private static final String TAG = "WearableFragmentNavigator";

    private WearableFragmentNavigator() {
    }

    public static /* synthetic */ void navigateTo$default(WearableFragmentNavigator wearableFragmentNavigator, Fragment fragment, Fragment fragment2, Integer num, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = Integer.valueOf(gsi.common_layout);
        }
        wearableFragmentNavigator.navigateTo(fragment, fragment2, num, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2);
    }

    @Nullable
    public final Fragment getCurrentFragment(@NotNull FragmentActivity act) {
        Object next;
        Intrinsics.checkNotNullParameter(act, "act");
        List<Fragment> listY0 = act.getSupportFragmentManager().y0();
        Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
        Iterator<T> it = listY0.iterator();
        while (it.hasNext()) {
            next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isVisible() && fragment.isAdded() && !fragment.isHidden()) {
                return (Fragment) next;
            }
        }
        next = null;
        return (Fragment) next;
    }

    public final void navigateTo(@Nullable Fragment currentFragment, @NotNull Fragment targetFragment, @Nullable Integer containerId, boolean addToBackStack, boolean withAnimation) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        try {
            FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                throw new IllegalStateException("Not a FragmentActivity");
            }
            supportFragmentManager.g0();
            k kVarO = supportFragmentManager.o();
            k kVar = withAnimation ? kVarO : null;
            if (kVar != null) {
                kVar.A(ugi.c, ugi.f35741b, ugi.f35740a, ugi.d);
            }
            if (currentFragment != null) {
                kVarO.t(currentFragment);
            }
            if (!targetFragment.isAdded() && containerId != null) {
                k kVarB = kVarO.b(containerId.intValue(), targetFragment);
                if (addToBackStack) {
                    kVarB.j(Reflection.getOrCreateKotlinClass(targetFragment.getClass()).getSimpleName());
                }
            }
            kVarO.F(targetFragment);
            kVarO.m();
            Logger.d(TAG, "Navigation committed to " + Reflection.getOrCreateKotlinClass(targetFragment.getClass()).getSimpleName());
        } catch (Exception e) {
            Logger.e(TAG, "Fragment navigation failed: " + e.getMessage());
        }
    }

    @NotNull
    public final Fragment newYRNFragment(@NotNull String url, @Nullable Bundle b2) {
        Intrinsics.checkNotNullParameter(url, "url");
        YRNCFragment yRNCFragment = new YRNCFragment();
        if (b2 == null) {
            b2 = new Bundle();
        }
        String rNAppNameByUrl = lwr.b().getRNAppNameByUrl(url);
        String rNModuleByUrl = lwr.b().getRNModuleByUrl(url);
        b2.putString("appName", rNAppNameByUrl);
        b2.putString(RnReportConst.ApiReport.PARAM_MODULE, rNModuleByUrl);
        b2.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, url);
        b2.putString("url", url);
        yRNCFragment.setArguments(b2);
        if (!TextUtils.isEmpty(rNAppNameByUrl) && !TextUtils.isEmpty(rNModuleByUrl) && !TextUtils.isEmpty(url)) {
            return yRNCFragment;
        }
        Logger.e("YRNCPageOpenHelper", "YRNCPageOpenHelper.newYRNFragment error! appName is " + rNAppNameByUrl + ",module is " + rNModuleByUrl + ",url is " + url);
        return new Fragment();
    }

    public final void popBackStack() {
        FragmentManager supportFragmentManager;
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        FragmentManager fragmentManager = supportFragmentManager.s0() > 0 ? supportFragmentManager : null;
        if (fragmentManager != null) {
            fragmentManager.g1();
        }
    }
}

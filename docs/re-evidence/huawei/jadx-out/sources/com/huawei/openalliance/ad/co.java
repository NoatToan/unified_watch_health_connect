package com.huawei.openalliance.ad;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.android.app.ActionBarEx;
import com.huawei.android.app.ActivityManagerEx;
import com.huawei.android.app.HwMultiWindowEx;
import com.huawei.android.app.PackageManagerEx;
import com.huawei.android.content.pm.ApplicationInfoEx;
import com.huawei.android.fsm.HwFoldScreenManagerEx;
import com.huawei.android.provider.SettingsEx;
import com.huawei.android.view.DisplaySideRegionEx;
import com.huawei.android.view.WindowManagerEx;
import com.huawei.hms.framework.common.EmuiUtil;

/* JADX INFO: loaded from: classes12.dex */
public class co extends ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ct f18364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18365b = new byte[0];

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public boolean g() {
        return PackageManagerEx.hasHwSystemFeature("com.huawei.hardware.screen.type.eink");
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public String f() {
        return "com.huawei.android.os.BuildEx";
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public String e() {
        return EmuiUtil.BUILDEX_VERSION;
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public boolean d() {
        return HwFoldScreenManagerEx.isFoldable();
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public int c() {
        return HwFoldScreenManagerEx.getDisplayMode();
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public boolean b() {
        return HwMultiWindowEx.isInMultiWindowMode();
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public boolean a(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            return ActivityManagerEx.getActivityWindowMode(activity) == 102;
        } catch (Throwable unused) {
            hw.c("HwSysApiImpl", "isFreedomWindowMode error");
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public void a(WindowManager.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return;
        }
        new WindowManagerEx.LayoutParamsEx(layoutParams).setDisplaySideMode(1);
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public void a(ActionBar actionBar, boolean z, Drawable drawable, View.OnClickListener onClickListener) {
        ActionBarEx.setStartIcon(actionBar, true, (Drawable) null, onClickListener);
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public com.huawei.openalliance.ad.utils.bv a() {
        return new com.huawei.openalliance.ad.utils.by();
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public Rect a(WindowInsets windowInsets) {
        DisplaySideRegionEx displaySideRegion = WindowManagerEx.LayoutParamsEx.getDisplaySideRegion(windowInsets);
        if (displaySideRegion != null) {
            return displaySideRegion.getSafeInsets();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public int a(ApplicationInfo applicationInfo) {
        return new ApplicationInfoEx(applicationInfo).getHwFlags();
    }

    @Override // com.huawei.openalliance.ad.ch, com.huawei.openalliance.ad.ct
    public int a(Context context) {
        return SettingsEx.getIntForUser(context.getContentResolver(), "accessibility_screenreader_enabled", -1, ActivityManagerEx.getCurrentUser());
    }

    private static ct c(Context context) {
        ct ctVar;
        synchronized (f18365b) {
            if (f18364a == null) {
                f18364a = new co(context);
            }
            ctVar = f18364a;
        }
        return ctVar;
    }

    public static ct b(Context context) {
        return c(context);
    }

    private co(Context context) {
    }
}

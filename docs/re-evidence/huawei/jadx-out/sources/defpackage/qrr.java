package defpackage;

import android.graphics.Typeface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qrr {
    public static Typeface c() {
        return Typeface.createFromAsset(BaseApplication.b().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
    }

    public static Typeface b() {
        return Typeface.createFromAsset(BaseApplication.b().getAssets(), "font/hw_digit_medium.otf");
    }

    public static Typeface e() {
        return Typeface.create(BaseApplication.b().getResources().getString(R.string.textFontFamilyMedium), 0);
    }

    public static Typeface g() {
        return Typeface.create(BaseApplication.b().getResources().getString(R.string.textFontFamilyRegular), 0);
    }

    public static Typeface d() {
        return Typeface.createFromAsset(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getAssets(), "fonts/Harmony-Heavy.ttf");
    }

    public static Typeface a() {
        return Typeface.createFromAsset(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getAssets(), "fonts/Anton-Regular.ttf");
    }
}

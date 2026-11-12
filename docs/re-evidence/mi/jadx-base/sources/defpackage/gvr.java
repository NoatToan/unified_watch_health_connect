package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;

/* JADX INFO: loaded from: classes2.dex */
public class gvr {
    public static Bundle a(Context context, String str, String str2, Bundle bundle, int i, int i2, YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
        gur gurVarD;
        if (bundle == null) {
            return null;
        }
        float fC = hvr.c(context);
        bundle.putInt("miotstore_view_width", i);
        bundle.putInt("miotstore_view_height", i2);
        bundle.putInt("miotstore_view_width_dp", (int) ((i / fC) + 0.5f));
        bundle.putInt("miotstore_view_height_dp", (int) ((i2 / fC) + 0.5f));
        bundle.putBoolean("miotstore_is_in_fold", hvr.e());
        bundle.putBoolean("miotstore_is_fold", hvr.m());
        bundle.putBoolean("miotstore_is_pad", hvr.n());
        if (context != null) {
            bundle.putBoolean("inMultiScreenDevice", hvr.k(context));
            bundle.putDouble("ratio", hvr.f(context, str2));
        }
        bundle.putString("deviceModel", hvr.d());
        bundle.putBoolean("isLargeScreen", hvr.j(context));
        String strR = (TextUtils.isEmpty(str) || (gurVarD = vwr.g().d(str)) == null) ? "" : gurVarD.r();
        Bundle bundleB = yRNBundleInfo != null ? b(yRNBundleInfo) : new Bundle();
        bundleB.putString("rnEngineVersion", strR);
        Bundle bundleB2 = yRNBundleInfo2 != null ? b(yRNBundleInfo2) : new Bundle();
        bundleB2.putString("rnEngineVersion", strR);
        bundle.putBundle("comInfo", bundleB);
        bundle.putBundle("buzInfo", bundleB2);
        return bundle;
    }

    public static Bundle b(YRNBundleInfo yRNBundleInfo) {
        if (yRNBundleInfo == null) {
            return new Bundle();
        }
        Bundle bundle = YRNBundleInfo.toBundle(yRNBundleInfo);
        bundle.putInt("maxCommonApiLevel", bundle.getInt("maxCommonJSApiLevel"));
        bundle.putInt("memoryMode", bundle.getInt("residentMemory"));
        return bundle;
    }
}

package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.YRNDevConfigInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class byr implements d1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MMKV f4734a;

    public byr(Context context) {
        if (context != null) {
            String str = context.getCacheDir().getAbsolutePath() + File.separator + "mirn_bundles";
            if (TextUtils.isEmpty(MMKV.x())) {
                MMKV.z(context);
            }
            this.f4734a = MMKV.I("com.xiaomi.mirn.sdk.mirn_bundle", str);
        }
    }

    @Override // defpackage.d1d
    public List<YRNDevModeInfo> a(String str) {
        return i(str, YRNDevModeInfo.class);
    }

    @Override // defpackage.d1d
    public void b(String str) {
        MMKV mmkv = this.f4734a;
        if (mmkv != null) {
            mmkv.remove(str);
        }
    }

    @Override // defpackage.d1d
    public boolean c(String str, YRNBundleInfo yRNBundleInfo) {
        MMKV mmkv = this.f4734a;
        return mmkv != null && mmkv.t(str, yRNBundleInfo);
    }

    @Override // defpackage.d1d
    public YRNBundleInfo d(String str) {
        MMKV mmkv = this.f4734a;
        if (mmkv != null) {
            return (YRNBundleInfo) mmkv.h(str, YRNBundleInfo.class);
        }
        return null;
    }

    @Override // defpackage.d1d
    public YRNDevConfigInfo e(String str) {
        MMKV mmkv = this.f4734a;
        if (mmkv != null) {
            return (YRNDevConfigInfo) mmkv.h(str, YRNDevConfigInfo.class);
        }
        return null;
    }

    @Override // defpackage.d1d
    public YRNDevModeInfo f(String str) {
        MMKV mmkv = this.f4734a;
        if (mmkv != null) {
            return (YRNDevModeInfo) mmkv.h(str, YRNDevModeInfo.class);
        }
        return null;
    }

    @Override // defpackage.d1d
    public boolean g(String str, YRNDevModeInfo yRNDevModeInfo) {
        MMKV mmkv = this.f4734a;
        return mmkv != null && mmkv.t(str, yRNDevModeInfo);
    }

    @Override // defpackage.d1d
    public boolean h(String str, YRNDevConfigInfo yRNDevConfigInfo) {
        MMKV mmkv = this.f4734a;
        return mmkv != null && mmkv.t(str, yRNDevConfigInfo);
    }

    public final <T extends Parcelable> List<T> i(String str, Class<T> cls) {
        String[] strArrAllKeys;
        Parcelable parcelableH;
        MMKV mmkv = this.f4734a;
        ArrayList arrayList = null;
        if (mmkv != null && (strArrAllKeys = mmkv.allKeys()) != null && strArrAllKeys.length != 0) {
            for (String str2 : strArrAllKeys) {
                if (str2.contains(str) && (parcelableH = this.f4734a.h(str2, cls)) != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parcelableH);
                }
            }
        }
        return arrayList;
    }
}

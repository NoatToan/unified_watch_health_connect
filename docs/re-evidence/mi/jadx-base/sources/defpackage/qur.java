package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.YRNDevConfigInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qur implements j1d {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final qur f31869a = new qur();
    }

    public static qur j() {
        return b.f31869a;
    }

    @Override // defpackage.j1d
    public YRNDevModeInfo a(String str, String str2) {
        return vur.j().i(str, str2);
    }

    public void b(String str, String str2) {
        vur.j().a(str, str2);
    }

    public List<YRNDevModeInfo> c() {
        return vur.j().b();
    }

    public YRNBundleInfo d(String str, String str2) {
        return vur.j().d(str, str2);
    }

    public String e(YRNBundleInfo yRNBundleInfo, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(yRNBundleInfo.getAppName());
        sb.append(str2);
        sb.append(yRNBundleInfo.getModule());
        sb.append(str2);
        sb.append(yRNBundleInfo.getMd5());
        return sb.toString();
    }

    public final YRNBundleInfo f(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        YRNBundleInfo yRNBundleInfoE = null;
        ezr.c().f(YRNTraceEvent.newEvent(str, 11, "查询bundle缓存", null, str2));
        if (!TextUtils.isEmpty(str)) {
            yRNBundleInfoE = vur.j().e(vwr.g().f(str), str, str2);
        }
        if (yRNBundleInfoE != null) {
            ezr.c().f(YRNTraceEvent.newEvent(str, 110, "查询bundle缓存成功", yRNBundleInfoE, str2, System.currentTimeMillis() - jCurrentTimeMillis));
        } else {
            ezr.c().f(YRNTraceEvent.newEvent(str, 111, "查询bundle缓存失败", yRNBundleInfoE, str2, System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return yRNBundleInfoE;
    }

    public YRNBundleInfo g(String str, String str2, boolean z) {
        return z ? h(str, str2) : f(str, str2);
    }

    public final YRNBundleInfo h(String str, String str2) {
        return vur.j().f(str, str2);
    }

    public YRNDevConfigInfo i(String str) {
        return vur.j().g(str);
    }

    public boolean k(YRNBundleInfo yRNBundleInfo) {
        return vur.j().p(yRNBundleInfo);
    }

    public final boolean l(YRNBundleInfo yRNBundleInfo) {
        if (yRNBundleInfo == null || TextUtils.isEmpty(yRNBundleInfo.getAppName())) {
            return false;
        }
        return vur.j().q(vwr.g().f(yRNBundleInfo.getAppName()), yRNBundleInfo);
    }

    public boolean m(YRNBundleInfo yRNBundleInfo, boolean z) {
        return z ? n(yRNBundleInfo) : l(yRNBundleInfo);
    }

    public final boolean n(YRNBundleInfo yRNBundleInfo) {
        return vur.j().r(yRNBundleInfo);
    }

    public boolean o(String str, YRNDevConfigInfo yRNDevConfigInfo) {
        return vur.j().s(str, yRNDevConfigInfo);
    }

    public boolean p(YRNDevModeInfo yRNDevModeInfo) {
        return vur.j().t(yRNDevModeInfo);
    }

    public qur() {
        vur.j().o(vwr.g().a());
    }
}

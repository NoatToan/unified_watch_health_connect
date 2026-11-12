package defpackage;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.YRNDevConfigInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface d1d {
    List<YRNDevModeInfo> a(String str);

    void b(String str);

    boolean c(String str, YRNBundleInfo yRNBundleInfo);

    YRNBundleInfo d(String str);

    YRNDevConfigInfo e(String str);

    YRNDevModeInfo f(String str);

    boolean g(String str, YRNDevModeInfo yRNDevModeInfo);

    boolean h(String str, YRNDevConfigInfo yRNDevConfigInfo);
}

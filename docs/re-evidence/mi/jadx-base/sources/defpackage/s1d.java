package defpackage;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseBean;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNNetworkLoadRequest;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface s1d {
    boolean downloadBundle(YRNNetworkLoadRequest yRNNetworkLoadRequest, f1d<sur> f1dVar);

    void getNetBundleInfo(YRNBundleRequestBean yRNBundleRequestBean, f1d<YRNBundleResponseBean> f1dVar);

    List<YRNBundleInfo> parseBuiltinBundleInfoJson(String str, String str2);
}

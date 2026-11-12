package defpackage;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseBean;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface q1d {
    List<YRNBundleInfo> getAssetsBuiltinBundle(String str);

    YRNBundleResponseBean getBeanFromNetResponseStr(String str);

    String getRequestStrFromBean(YRNBundleRequestBean yRNBundleRequestBean);
}

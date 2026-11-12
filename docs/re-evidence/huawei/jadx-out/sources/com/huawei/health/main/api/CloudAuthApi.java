package com.huawei.health.main.api;

import android.content.Context;
import com.huawei.health.main.model.AppLangItem;
import defpackage.fwp;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface CloudAuthApi {
    void constructInstance(Context context, String str);

    List<AppLangItem> getAppLangItem(String str, String str2, String str3);

    String getAppLangItemUrl(String str, String str2);

    String getLang();

    fwp getScopeLangItem(String str, String str2, String str3);

    String getScopeLangItemUrl(String str, String str2);
}

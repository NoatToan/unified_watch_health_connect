package com.fitness.banner.export.v2;

import android.net.Uri;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"appendCurrentLocaleIfNeed", "", "banner-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BannerV2DataKt {
    @Nullable
    public static final String appendCurrentLocaleIfNeed(@Nullable String str) {
        return (str == null || StringsKt__StringsKt.isBlank(str)) ? str : Uri.parse(str).buildUpon().appendQueryParameter("locale", LocaleUtil.getCurrentLocale()).build().toString();
    }
}

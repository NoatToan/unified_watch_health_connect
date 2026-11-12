package com.huami.devicex.injection.basic;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/huami/devicex/injection/basic/HmConfigApi;", "", "", "getScheme", "getAppHost", "", "isLogTerminal", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface HmConfigApi {
    @Nullable
    String getAppHost();

    @Nullable
    String getScheme();

    boolean isLogTerminal();
}

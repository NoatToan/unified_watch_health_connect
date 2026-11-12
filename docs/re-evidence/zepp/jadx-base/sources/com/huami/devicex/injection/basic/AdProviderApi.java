package com.huami.devicex.injection.basic;

import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/devicex/injection/basic/AdProviderApi;", "", "", "keyToolClicked", "str", "", "saveStringMMKV", SOAP.XMLNS, "getStringMMKV", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AdProviderApi {
    @NotNull
    String getStringMMKV(@NotNull String keyToolClicked, @NotNull String s);

    void saveStringMMKV(@NotNull String keyToolClicked, @NotNull String str);
}

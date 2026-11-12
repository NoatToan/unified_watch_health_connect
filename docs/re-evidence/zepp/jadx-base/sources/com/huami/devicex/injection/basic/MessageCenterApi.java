package com.huami.devicex.injection.basic;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/devicex/injection/basic/MessageCenterApi;", "", "", "source", "jobkey", "fr", "", "mineDevicePage", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface MessageCenterApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void mineDevicePage$default(MessageCenterApi messageCenterApi, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mineDevicePage");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            messageCenterApi.mineDevicePage(str, str2, str3);
        }
    }

    void mineDevicePage(@Nullable String source, @NotNull String jobkey, @NotNull String fr);
}

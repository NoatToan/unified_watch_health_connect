package com.huami.ednetwork.api;

import com.huami.ednetwork.EdResponse;
import com.huami.ednetwork.WhiteBoxKeyEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u001c\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&¨\u0006\u000e"}, d2 = {"Lcom/huami/ednetwork/api/EncryptionDecryptionApi;", "", "", "date", "Lcom/huami/ednetwork/EdResponse;", "wbEncryption", "wbDecryption", "Lcom/huami/ednetwork/WhiteBoxKeyEntity;", "getWhiteBoxKey", "", "webKey", "hmKv", "", "upDateKey", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public interface EncryptionDecryptionApi {
    @NotNull
    EdResponse<WhiteBoxKeyEntity> getWhiteBoxKey();

    void upDateKey(@Nullable String webKey, @Nullable String hmKv);

    @NotNull
    EdResponse<byte[]> wbDecryption(@NotNull byte[] date);

    @NotNull
    EdResponse<byte[]> wbEncryption(@NotNull byte[] date);
}

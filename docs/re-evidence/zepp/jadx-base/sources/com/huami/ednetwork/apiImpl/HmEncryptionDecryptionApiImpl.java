package com.huami.ednetwork.apiImpl;

import com.huami.datavaults.crypto.Crypto;
import com.huami.ednetwork.ConstantKt;
import com.huami.ednetwork.EdResponse;
import com.huami.ednetwork.EdResponseHelperKt;
import com.huami.ednetwork.HmKeyManager;
import com.huami.ednetwork.ResultVo;
import com.huami.ednetwork.WhiteBoxKeyEntity;
import com.huami.ednetwork.api.EncryptionDecryptionApi;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/ednetwork/apiImpl/HmEncryptionDecryptionApiImpl;", "Lcom/huami/ednetwork/api/EncryptionDecryptionApi;", "Lcom/huami/ednetwork/EdResponse;", "Lcom/huami/ednetwork/WhiteBoxKeyEntity;", "getWhiteBoxKey", "", "webKey", "hmKv", "", "upDateKey", "", "date", "wbDecryption", "wbEncryption", "Lcom/huami/ednetwork/apiImpl/HmWhiteBoxKeyApiImpl;", "a", "Lkotlin/Lazy;", "()Lcom/huami/ednetwork/apiImpl/HmWhiteBoxKeyApiImpl;", "hmWhiteBoxKeyApiImpl", "<init>", "()V", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final class HmEncryptionDecryptionApiImpl implements EncryptionDecryptionApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy hmWhiteBoxKeyApiImpl = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ednetwork/apiImpl/HmWhiteBoxKeyApiImpl;", "a", "()Lcom/huami/ednetwork/apiImpl/HmWhiteBoxKeyApiImpl;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<HmWhiteBoxKeyApiImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HmWhiteBoxKeyApiImpl invoke() {
            return new HmWhiteBoxKeyApiImpl();
        }
    }

    private final HmWhiteBoxKeyApiImpl a() {
        return (HmWhiteBoxKeyApiImpl) this.hmWhiteBoxKeyApiImpl.getValue();
    }

    @Override // com.huami.ednetwork.api.EncryptionDecryptionApi
    @NotNull
    public EdResponse<WhiteBoxKeyEntity> getWhiteBoxKey() {
        return a().getWhiteBoxKey();
    }

    @Override // com.huami.ednetwork.api.EncryptionDecryptionApi
    public void upDateKey(@Nullable String webKey, @Nullable String hmKv) {
        HmKeyManager.INSTANCE.upDateKey(webKey, hmKv);
    }

    @Override // com.huami.ednetwork.api.EncryptionDecryptionApi
    @NotNull
    public EdResponse<byte[]> wbDecryption(@NotNull byte[] date) {
        Crypto crypto = Crypto.INSTANCE;
        String strMethod02 = crypto.method02(HmKeyManager.INSTANCE.getWebKey());
        Charset charset = Charsets.UTF_8;
        if (strMethod02 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bArrMethod04 = crypto.method04(date, strMethod02.getBytes(charset), ConstantKt.WBIV.getBytes(charset));
        int i = bArrMethod04.length == 0 ? 1000 : 0;
        ResultVo resultVo = new ResultVo();
        resultVo.result = bArrMethod04;
        resultVo.ret = i;
        EdResponse edResponseLogcat = EdResponseHelperKt.logcat(new EdResponse(i, "wbDecryption", resultVo));
        int code = edResponseLogcat.getCode();
        String message = edResponseLogcat.getMessage();
        ResultVo resultVo2 = (ResultVo) edResponseLogcat.getData();
        return new EdResponse<>(code, message, resultVo2 != null ? resultVo2.result : null);
    }

    @Override // com.huami.ednetwork.api.EncryptionDecryptionApi
    @NotNull
    public EdResponse<byte[]> wbEncryption(@NotNull byte[] date) {
        Crypto crypto = Crypto.INSTANCE;
        String strMethod02 = crypto.method02(HmKeyManager.INSTANCE.getWebKey());
        Charset charset = Charsets.UTF_8;
        if (strMethod02 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bArrMethod03 = crypto.method03(date, strMethod02.getBytes(charset), ConstantKt.WBIV.getBytes(charset));
        int i = bArrMethod03.length == 0 ? 1000 : 0;
        ResultVo resultVo = new ResultVo();
        resultVo.result = bArrMethod03;
        resultVo.ret = i;
        EdResponse edResponseLogcat = EdResponseHelperKt.logcat(new EdResponse(i, "wbEncryption", resultVo));
        int code = edResponseLogcat.getCode();
        String message = edResponseLogcat.getMessage();
        ResultVo resultVo2 = (ResultVo) edResponseLogcat.getData();
        return new EdResponse<>(code, message, resultVo2 != null ? resultVo2.result : null);
    }
}

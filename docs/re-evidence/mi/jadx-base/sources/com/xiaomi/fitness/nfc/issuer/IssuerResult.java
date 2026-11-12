package com.xiaomi.fitness.nfc.issuer;

import com.service.mi.entity.BaseResponse;
import com.service.mi.wallet.entity.AuthenticationMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/nfc/issuer/IssuerResult;", "Ljava/io/Serializable;", "cardType", "", "baseResponse", "Lcom/service/mi/entity/BaseResponse;", "authenticationMethodList", "", "Lcom/service/mi/wallet/entity/AuthenticationMethod;", "<init>", "(ILcom/service/mi/entity/BaseResponse;Ljava/util/List;)V", "getCardType", "()I", "getBaseResponse", "()Lcom/service/mi/entity/BaseResponse;", "getAuthenticationMethodList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IssuerResult implements Serializable {

    @NotNull
    private final List<AuthenticationMethod> authenticationMethodList;

    @NotNull
    private final BaseResponse baseResponse;
    private final int cardType;

    /* JADX WARN: Multi-variable type inference failed */
    public IssuerResult(int i, @NotNull BaseResponse baseResponse, @NotNull List<? extends AuthenticationMethod> authenticationMethodList) {
        Intrinsics.checkNotNullParameter(baseResponse, "baseResponse");
        Intrinsics.checkNotNullParameter(authenticationMethodList, "authenticationMethodList");
        this.cardType = i;
        this.baseResponse = baseResponse;
        this.authenticationMethodList = authenticationMethodList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IssuerResult copy$default(IssuerResult issuerResult, int i, BaseResponse baseResponse, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = issuerResult.cardType;
        }
        if ((i2 & 2) != 0) {
            baseResponse = issuerResult.baseResponse;
        }
        if ((i2 & 4) != 0) {
            list = issuerResult.authenticationMethodList;
        }
        return issuerResult.copy(i, baseResponse, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BaseResponse getBaseResponse() {
        return this.baseResponse;
    }

    @NotNull
    public final List<AuthenticationMethod> component3() {
        return this.authenticationMethodList;
    }

    @NotNull
    public final IssuerResult copy(int cardType, @NotNull BaseResponse baseResponse, @NotNull List<? extends AuthenticationMethod> authenticationMethodList) {
        Intrinsics.checkNotNullParameter(baseResponse, "baseResponse");
        Intrinsics.checkNotNullParameter(authenticationMethodList, "authenticationMethodList");
        return new IssuerResult(cardType, baseResponse, authenticationMethodList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IssuerResult)) {
            return false;
        }
        IssuerResult issuerResult = (IssuerResult) other;
        return this.cardType == issuerResult.cardType && Intrinsics.areEqual(this.baseResponse, issuerResult.baseResponse) && Intrinsics.areEqual(this.authenticationMethodList, issuerResult.authenticationMethodList);
    }

    @NotNull
    public final List<AuthenticationMethod> getAuthenticationMethodList() {
        return this.authenticationMethodList;
    }

    @NotNull
    public final BaseResponse getBaseResponse() {
        return this.baseResponse;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.cardType) * 31) + this.baseResponse.hashCode()) * 31) + this.authenticationMethodList.hashCode();
    }

    @NotNull
    public String toString() {
        return "IssuerResult(cardType=" + this.cardType + ", baseResponse=" + this.baseResponse + ", authenticationMethodList=" + this.authenticationMethodList + ")";
    }
}

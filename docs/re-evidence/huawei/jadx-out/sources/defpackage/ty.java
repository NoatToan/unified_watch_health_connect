package defpackage;

import com.braintreepayments.api.Authorization;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/InvalidAuthorization;", "Lcom/braintreepayments/api/Authorization;", "rawValue", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "bearer", "getBearer", "()Ljava/lang/String;", "configUrl", "getConfigUrl", "getErrorMessage", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ty extends Authorization {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49768c;
    private final String e;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(String str, String str2) {
        super(str);
        zcp.c(str, "");
        zcp.c(str2, "");
        this.e = str2;
    }

    @Override // com.braintreepayments.api.Authorization
    /* JADX INFO: renamed from: getConfigUrl, reason: from getter */
    public String getF50627c() {
        return this.f49767b;
    }

    @Override // com.braintreepayments.api.Authorization
    /* JADX INFO: renamed from: getBearer, reason: from getter */
    public String getE() {
        return this.f49768c;
    }
}

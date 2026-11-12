package com.huami.account.ui.login.state;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/login/state/ThirdPartAuthState;", "Lcom/huami/account/ui/login/state/PassportOperationState;", "", "b", "Ljava/lang/String;", "getProvider", "()Ljava/lang/String;", "provider", "c", "getAreaValue", "areaValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class ThirdPartAuthState extends PassportOperationState {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String provider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String areaValue;

    public ThirdPartAuthState(@NotNull String str, @NotNull String str2) {
        super(str, null);
        this.provider = str;
        this.areaValue = str2;
    }

    @NotNull
    public final String getAreaValue() {
        return this.areaValue;
    }

    @Override // com.huami.account.ui.login.state.PassportOperationState
    @NotNull
    public String getProvider() {
        return this.provider;
    }
}

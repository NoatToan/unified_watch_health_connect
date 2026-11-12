package com.xiaomi.fitness.account;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/account/SIDs;", "", "<init>", "()V", "MIOT_HEALTH", "", "MIOT_HEALTH_STAGING", "MIOT_HEALTH_AT", "PLATO_TO_APP_API", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SIDs {

    @NotNull
    public static final SIDs INSTANCE = new SIDs();

    @NotNull
    public static final String MIOT_HEALTH = "miothealth";

    @NotNull
    public static final String MIOT_HEALTH_AT = "miothealth-onebox";

    @NotNull
    public static final String MIOT_HEALTH_STAGING = "miothealth-staging";

    @NotNull
    public static final String PLATO_TO_APP_API = "miothealth";

    private SIDs() {
    }
}

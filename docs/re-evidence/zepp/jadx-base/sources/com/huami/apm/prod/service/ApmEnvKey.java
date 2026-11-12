package com.huami.apm.prod.service;

import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/apm/prod/service/ApmEnvKey;", "", "", "BRANCH", "Ljava/lang/String;", "VERSION_NAME", "VERSION_CODE", Constant.TARGET_CHANNEL, "<init>", "()V", "apm-prod-service_release"}, k = 1, mv = {1, 5, 1})
public final class ApmEnvKey {

    @NotNull
    public static final String BRANCH = "branch";

    @NotNull
    public static final String CHANNEL = "channel";

    @NotNull
    public static final ApmEnvKey INSTANCE = new ApmEnvKey();

    @NotNull
    public static final String VERSION_CODE = "versionCode";

    @NotNull
    public static final String VERSION_NAME = "versionName";

    private ApmEnvKey() {
    }
}

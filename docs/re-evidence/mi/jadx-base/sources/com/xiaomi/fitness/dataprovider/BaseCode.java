package com.xiaomi.fitness.dataprovider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/BaseCode;", "", "<init>", "()V", "sBase", "", "NOT_FOUND_PROVIDER", "UNKNOWN_ERROR", "UNKNOWN_CALLING_PACKAGE_ERROR", "TIMEOUT_ERROR", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseCode {

    @NotNull
    public static final BaseCode INSTANCE = new BaseCode();
    public static final int NOT_FOUND_PROVIDER = -1;
    public static final int TIMEOUT_ERROR = -4;
    public static final int UNKNOWN_CALLING_PACKAGE_ERROR = -3;
    public static final int UNKNOWN_ERROR = -2;
    private static final int sBase = -1;

    private BaseCode() {
    }
}

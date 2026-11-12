package com.huami.ecg.core.model.constant;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/ecg/core/model/constant/WearPosition;", "", "", "LEFT_HAND", "Ljava/lang/String;", "RIGHT_HAND", WearPosition.CHEST, WearPosition.NECK, "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class WearPosition {

    @NotNull
    public static final String CHEST = "CHEST";
    public static final WearPosition INSTANCE = new WearPosition();

    @NotNull
    public static final String LEFT_HAND = "LEFT_HAND";

    @NotNull
    public static final String NECK = "NECK";

    @NotNull
    public static final String RIGHT_HAND = "RIGHT_HAND";

    private WearPosition() {
    }
}

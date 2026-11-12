package com.huami.ecg.core.model.constant;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huami/ecg/core/model/constant/MeasureContentType;", "", "", "type", "", "isSupported", "isProbe", "isProbeGroup", "isProbeFragment", "getProbeGroup", "getProbeFragment", MeasureContentType.HEART, "Ljava/lang/String;", MeasureContentType.EMOTION, MeasureContentType.BIO_ID, MeasureContentType.BLOOD_PRESSURE, MeasureContentType.CHEST_HEART, MeasureContentType.CHEST_HEART_SUBTYPE, "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class MeasureContentType {

    @NotNull
    public static final String BIO_ID = "BIO_ID";

    @NotNull
    public static final String BLOOD_PRESSURE = "BLOOD_PRESSURE";

    @NotNull
    public static final String CHEST_HEART = "CHEST_HEART";

    @NotNull
    public static final String CHEST_HEART_SUBTYPE = "CHEST_HEART_SUBTYPE";

    @NotNull
    public static final String EMOTION = "EMOTION";

    @NotNull
    public static final String HEART = "HEART";
    public static final MeasureContentType INSTANCE = new MeasureContentType();

    private MeasureContentType() {
    }

    @NotNull
    public final String getProbeFragment() {
        return CHEST_HEART_SUBTYPE;
    }

    @NotNull
    public final String getProbeGroup() {
        return CHEST_HEART;
    }

    public final boolean isProbe(@NotNull String type) {
        return isProbeGroup(type) || isProbeFragment(type);
    }

    public final boolean isProbeFragment(@NotNull String type) {
        return Intrinsics.areEqual(CHEST_HEART_SUBTYPE, type);
    }

    public final boolean isProbeGroup(@NotNull String type) {
        return Intrinsics.areEqual(CHEST_HEART, type);
    }

    public final boolean isSupported(@NotNull String type) {
        return Intrinsics.areEqual(HEART, type) || Intrinsics.areEqual(EMOTION, type) || Intrinsics.areEqual(BLOOD_PRESSURE, type) || Intrinsics.areEqual(BIO_ID, type) || Intrinsics.areEqual(CHEST_HEART, type) || Intrinsics.areEqual(CHEST_HEART_SUBTYPE, type);
    }
}

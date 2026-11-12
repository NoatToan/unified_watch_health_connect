package com.xiaomi.fitness.watch.face.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseResult;", "", "license", "", "sign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLicense", "()Ljava/lang/String;", "getSign", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceDesignerLicenseResult {

    @NotNull
    private final String license;

    @NotNull
    private final String sign;

    public FaceDesignerLicenseResult(@NotNull String license, @NotNull String sign) {
        Intrinsics.checkNotNullParameter(license, "license");
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.license = license;
        this.sign = sign;
    }

    public static /* synthetic */ FaceDesignerLicenseResult copy$default(FaceDesignerLicenseResult faceDesignerLicenseResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceDesignerLicenseResult.license;
        }
        if ((i & 2) != 0) {
            str2 = faceDesignerLicenseResult.sign;
        }
        return faceDesignerLicenseResult.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLicense() {
        return this.license;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final FaceDesignerLicenseResult copy(@NotNull String license, @NotNull String sign) {
        Intrinsics.checkNotNullParameter(license, "license");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return new FaceDesignerLicenseResult(license, sign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceDesignerLicenseResult)) {
            return false;
        }
        FaceDesignerLicenseResult faceDesignerLicenseResult = (FaceDesignerLicenseResult) other;
        return Intrinsics.areEqual(this.license, faceDesignerLicenseResult.license) && Intrinsics.areEqual(this.sign, faceDesignerLicenseResult.sign);
    }

    @NotNull
    public final String getLicense() {
        return this.license;
    }

    @NotNull
    public final String getSign() {
        return this.sign;
    }

    public int hashCode() {
        return (this.license.hashCode() * 31) + this.sign.hashCode();
    }

    @NotNull
    public String toString() {
        return "FaceDesignerLicenseResult(license=" + this.license + ", sign=" + this.sign + ")";
    }
}

package com.xiaomi.hm.health.nps.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/nps/model/NpsTargetVo;", "", "", "component1", "component2", "targetUrl", "surveyId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTargetUrl", "()Ljava/lang/String;", "getSurveyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NpsTargetVo {

    @Nullable
    private final String surveyId;

    @Nullable
    private final String targetUrl;

    public NpsTargetVo(@Nullable String str, @Nullable String str2) {
        this.targetUrl = str;
        this.surveyId = str2;
    }

    public static /* synthetic */ NpsTargetVo copy$default(NpsTargetVo npsTargetVo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = npsTargetVo.targetUrl;
        }
        if ((i & 2) != 0) {
            str2 = npsTargetVo.surveyId;
        }
        return npsTargetVo.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSurveyId() {
        return this.surveyId;
    }

    @NotNull
    public final NpsTargetVo copy(@Nullable String targetUrl, @Nullable String surveyId) {
        return new NpsTargetVo(targetUrl, surveyId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsTargetVo)) {
            return false;
        }
        NpsTargetVo npsTargetVo = (NpsTargetVo) other;
        return Intrinsics.areEqual(this.targetUrl, npsTargetVo.targetUrl) && Intrinsics.areEqual(this.surveyId, npsTargetVo.surveyId);
    }

    @Nullable
    public final String getSurveyId() {
        return this.surveyId;
    }

    @Nullable
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    public int hashCode() {
        String str = this.targetUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.surveyId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NpsTargetVo(targetUrl=" + ((Object) this.targetUrl) + ", surveyId=" + ((Object) this.surveyId) + ')';
    }
}

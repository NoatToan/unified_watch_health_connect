package com.huami.nps.api;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0006R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001b\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/nps/api/AdExtension;", "", "", "component1", "", "component2", "()Ljava/lang/Long;", "component3", "Lcom/huami/nps/api/NpsSurvey;", "component4", "jsbridge_auth", "starttime", "endtime", "nps_survey", "copy", "(ZLjava/lang/Long;Ljava/lang/Long;Lcom/huami/nps/api/NpsSurvey;)Lcom/huami/nps/api/AdExtension;", "", "toString", "", "hashCode", "other", "equals", "Z", "getJsbridge_auth", "()Z", "Ljava/lang/Long;", "getStarttime", "getEndtime", "Lcom/huami/nps/api/NpsSurvey;", "getNps_survey", "()Lcom/huami/nps/api/NpsSurvey;", "<init>", "(ZLjava/lang/Long;Ljava/lang/Long;Lcom/huami/nps/api/NpsSurvey;)V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AdExtension {

    @Nullable
    private final Long endtime;
    private final boolean jsbridge_auth;

    @Nullable
    private final NpsSurvey nps_survey;

    @Nullable
    private final Long starttime;

    public AdExtension(boolean z, @Nullable Long l, @Nullable Long l2, @Nullable NpsSurvey npsSurvey) {
        this.jsbridge_auth = z;
        this.starttime = l;
        this.endtime = l2;
        this.nps_survey = npsSurvey;
    }

    public static /* synthetic */ AdExtension copy$default(AdExtension adExtension, boolean z, Long l, Long l2, NpsSurvey npsSurvey, int i, Object obj) {
        if ((i & 1) != 0) {
            z = adExtension.jsbridge_auth;
        }
        if ((i & 2) != 0) {
            l = adExtension.starttime;
        }
        if ((i & 4) != 0) {
            l2 = adExtension.endtime;
        }
        if ((i & 8) != 0) {
            npsSurvey = adExtension.nps_survey;
        }
        return adExtension.copy(z, l, l2, npsSurvey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getJsbridge_auth() {
        return this.jsbridge_auth;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStarttime() {
        return this.starttime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEndtime() {
        return this.endtime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NpsSurvey getNps_survey() {
        return this.nps_survey;
    }

    @NotNull
    public final AdExtension copy(boolean jsbridge_auth, @Nullable Long starttime, @Nullable Long endtime, @Nullable NpsSurvey nps_survey) {
        return new AdExtension(jsbridge_auth, starttime, endtime, nps_survey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdExtension)) {
            return false;
        }
        AdExtension adExtension = (AdExtension) other;
        return this.jsbridge_auth == adExtension.jsbridge_auth && Intrinsics.areEqual(this.starttime, adExtension.starttime) && Intrinsics.areEqual(this.endtime, adExtension.endtime) && Intrinsics.areEqual(this.nps_survey, adExtension.nps_survey);
    }

    @Nullable
    public final Long getEndtime() {
        return this.endtime;
    }

    public final boolean getJsbridge_auth() {
        return this.jsbridge_auth;
    }

    @Nullable
    public final NpsSurvey getNps_survey() {
        return this.nps_survey;
    }

    @Nullable
    public final Long getStarttime() {
        return this.starttime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.jsbridge_auth;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Long l = this.starttime;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endtime;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        NpsSurvey npsSurvey = this.nps_survey;
        return iHashCode2 + (npsSurvey != null ? npsSurvey.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdExtension(jsbridge_auth=" + this.jsbridge_auth + ", starttime=" + this.starttime + ", endtime=" + this.endtime + ", nps_survey=" + this.nps_survey + ")";
    }

    public /* synthetic */ AdExtension(boolean z, Long l, Long l2, NpsSurvey npsSurvey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, l, l2, npsSurvey);
    }
}

package com.huami.ai.speech.alexa.entity.payload;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001d¨\u0006("}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/Stream;", "", "", "component1", "", "component2", "Lcom/huami/ai/speech/alexa/entity/payload/ProgressReport;", "component3", "component4", "component5", "offsetInMilliseconds", "expiryTime", "progressReport", "url", "token", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getOffsetInMilliseconds", "()J", "b", "Ljava/lang/String;", "getExpiryTime", "()Ljava/lang/String;", "c", "Lcom/huami/ai/speech/alexa/entity/payload/ProgressReport;", "getProgressReport", "()Lcom/huami/ai/speech/alexa/entity/payload/ProgressReport;", GoogleApiAvailabilityLight.a, "getUrl", "e", "getToken", "<init>", "(JLjava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/ProgressReport;Ljava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Stream {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("offsetInMilliseconds")
    private final long offsetInMilliseconds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("expiryTime")
    @NotNull
    private final String expiryTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("progressReport")
    @NotNull
    private final ProgressReport progressReport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("url")
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("token")
    @NotNull
    private final String token;

    public Stream(long j, @NotNull String str, @NotNull ProgressReport progressReport, @NotNull String str2, @NotNull String str3) {
        this.offsetInMilliseconds = j;
        this.expiryTime = str;
        this.progressReport = progressReport;
        this.url = str2;
        this.token = str3;
    }

    public static /* synthetic */ Stream copy$default(Stream stream, long j, String str, ProgressReport progressReport, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = stream.offsetInMilliseconds;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = stream.expiryTime;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            progressReport = stream.progressReport;
        }
        ProgressReport progressReport2 = progressReport;
        if ((i & 8) != 0) {
            str2 = stream.url;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = stream.token;
        }
        return stream.copy(j2, str4, progressReport2, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ProgressReport getProgressReport() {
        return this.progressReport;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final Stream copy(long offsetInMilliseconds, @NotNull String expiryTime, @NotNull ProgressReport progressReport, @NotNull String url, @NotNull String token) {
        return new Stream(offsetInMilliseconds, expiryTime, progressReport, url, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stream)) {
            return false;
        }
        Stream stream = (Stream) other;
        return this.offsetInMilliseconds == stream.offsetInMilliseconds && Intrinsics.areEqual(this.expiryTime, stream.expiryTime) && Intrinsics.areEqual(this.progressReport, stream.progressReport) && Intrinsics.areEqual(this.url, stream.url) && Intrinsics.areEqual(this.token, stream.token);
    }

    @NotNull
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    public final long getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    @NotNull
    public final ProgressReport getProgressReport() {
        return this.progressReport;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((b.a(this.offsetInMilliseconds) * 31) + this.expiryTime.hashCode()) * 31) + this.progressReport.hashCode()) * 31) + this.url.hashCode()) * 31) + this.token.hashCode();
    }

    @NotNull
    public String toString() {
        return "Stream(offsetInMilliseconds=" + this.offsetInMilliseconds + ", expiryTime=" + this.expiryTime + ", progressReport=" + this.progressReport + ", url=" + this.url + ", token=" + this.token + ')';
    }
}

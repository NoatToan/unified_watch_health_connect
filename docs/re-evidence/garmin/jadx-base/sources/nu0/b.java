package nu0;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lnu0/b;", "", "<init>", "()V", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setDurationMillis", "(Ljava/lang/Long;)V", "durationMillis", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setStartDateTime", "(Ljava/lang/String;)V", "startDateTime", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "enabled", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationMillis")
    @Expose
    private Long durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDateTime")
    @Expose
    private String startDateTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStartDateTime() {
        return this.startDateTime;
    }
}

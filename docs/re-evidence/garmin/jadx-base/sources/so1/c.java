package so1;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lso1/c;", "", "", "groupPriority", "", "timeLimited", "", "stickerUrl", "stickerKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupPriority")
    private final Integer groupPriority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeLimited")
    private final Boolean timeLimited;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stickerUrl")
    private final String stickerUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stickerKey")
    private final String stickerKey;

    public /* synthetic */ c(Integer num, Boolean bool, String str, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getGroupPriority() {
        return this.groupPriority;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStickerKey() {
        return this.stickerKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStickerUrl() {
        return this.stickerUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getTimeLimited() {
        return this.timeLimited;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.groupPriority, cVar.groupPriority) && s.g(this.timeLimited, cVar.timeLimited) && s.g(this.stickerUrl, cVar.stickerUrl) && s.g(this.stickerKey, cVar.stickerKey);
    }

    public final int hashCode() {
        Integer num = this.groupPriority;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.timeLimited;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.stickerUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stickerKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.groupPriority;
        Boolean bool = this.timeLimited;
        String str = this.stickerUrl;
        String str2 = this.stickerKey;
        StringBuilder sb3 = new StringBuilder("StickerDTO(groupPriority=");
        sb3.append(num);
        sb3.append(", timeLimited=");
        sb3.append(bool);
        sb3.append(", stickerUrl=");
        return e5.h(sb3, str, ", stickerKey=", str2, ")");
    }

    public c(Integer num, Boolean bool, String str, String str2) {
        this.groupPriority = num;
        this.timeLimited = bool;
        this.stickerUrl = str;
        this.stickerKey = str2;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}

package j70;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj70/y;", "", "", "userFocus", "", "recommended", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userFocus")
    private final String userFocus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recommended")
    private final Boolean recommended;

    public y(String str, Boolean bool) {
        str.getClass();
        this.userFocus = str;
        this.recommended = bool;
    }

    public static y a(y yVar, String str) {
        Boolean bool = yVar.recommended;
        str.getClass();
        return new y(str, bool);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getRecommended() {
        return this.recommended;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUserFocus() {
        return this.userFocus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.userFocus, yVar.userFocus) && p005kotlin.jvm.internal.s.g(this.recommended, yVar.recommended);
    }

    public final int hashCode() {
        int iHashCode = this.userFocus.hashCode() * 31;
        Boolean bool = this.recommended;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "UserFocus(userFocus=" + this.userFocus + ", recommended=" + this.recommended + ")";
    }

    public /* synthetic */ y(String str, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : bool);
    }
}

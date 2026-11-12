package iu0;

import c22.t;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Liu0/a;", "", "", "alert", "", "versionNumber", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "I", "()I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("alert")
    private final String alert;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("versionNumber")
    private final int versionNumber;

    public a(String str, int i14) {
        str.getClass();
        this.alert = str;
        this.versionNumber = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlert() {
        return this.alert;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVersionNumber() {
        return this.versionNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.alert, aVar.alert) && this.versionNumber == aVar.versionNumber;
    }

    public final int hashCode() {
        return Integer.hashCode(this.versionNumber) + (this.alert.hashCode() * 31);
    }

    public final String toString() {
        return t.e(this.versionNumber, "AlertType(alert=", this.alert, ", versionNumber=", ")");
    }
}

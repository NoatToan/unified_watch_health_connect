package ue0;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lue0/i;", "", "", "_errorCode", "", "message", "<init>", "(ILjava/lang/String;)V", "a", "I", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorCode")
    private final int _errorCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lue0/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        General,
        MaximumDelegationsReached,
        MissingPrivileges,
        Unknown
    }

    public i(int i14, String str) {
        str.getClass();
        this._errorCode = i14;
        this.message = str;
    }

    public final a a() {
        int i14 = this._errorCode;
        if (i14 == 0) {
            return a.General;
        }
        if (i14 != 1) {
            return i14 != 2 ? a.Unknown : a.MissingPrivileges;
        }
        return a.MaximumDelegationsReached;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this._errorCode == iVar._errorCode && s.g(this.message, iVar.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this._errorCode) * 31);
    }

    public final String toString() {
        return o2.c.e(this._errorCode, "FamilyAccountsRequestErrorDTO(_errorCode=", ", message=", this.message, ")");
    }
}

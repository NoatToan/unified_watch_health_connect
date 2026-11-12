package we2;

import am.j;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lwe2/a;", "", "Lwe2/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "message", "confirmationText", "<init>", "(Lwe2/b;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lwe2/b;", "getType", "()Lwe2/b;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final b type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("confirmationText")
    private final String confirmationText;

    public a(b bVar, String str, String str2) {
        bVar.getClass();
        str.getClass();
        str2.getClass();
        this.type = bVar;
        this.message = str;
        this.confirmationText = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConfirmationText() {
        return this.confirmationText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.type == aVar.type && s.g(this.message, aVar.message) && s.g(this.confirmationText, aVar.confirmationText);
    }

    public final int hashCode() {
        return this.confirmationText.hashCode() + wr.g.j(this.type.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        String strName;
        b bVar = this.type;
        if (bVar == null || (strName = bVar.name()) == null) {
            strName = "";
        }
        return j.o(this.confirmationText, ")", p6.b.i("Communication(type=", strName, ", message=", this.message, ", confirmationText="));
    }
}

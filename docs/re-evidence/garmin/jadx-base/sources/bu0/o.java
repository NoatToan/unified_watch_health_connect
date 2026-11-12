package bu0;

import android.content.Intent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbu0/o;", "", "", "title", "message", "Landroid/content/Intent;", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f21222c;

    public o(String str, String str2, Intent intent) {
        str.getClass();
        str2.getClass();
        intent.getClass();
        this.f21220a = str;
        this.f21221b = str2;
        this.f21222c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f21220a.equals(oVar.f21220a) && this.f21221b.equals(oVar.f21221b) && this.f21222c.equals(oVar.f21222c);
    }

    public final int hashCode() {
        return this.f21222c.hashCode() + wr.g.j(this.f21220a.hashCode() * 31, 31, this.f21221b);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("Vo2MaxNotificationDetails(title=", this.f21220a, ", message=", this.f21221b, ", intent=");
        sbI.append(this.f21222c);
        sbI.append(")");
        return sbI.toString();
    }
}

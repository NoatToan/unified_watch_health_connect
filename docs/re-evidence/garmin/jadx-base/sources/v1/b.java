package v1;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv1/b;", "", "Landroid/net/Uri;", "linkUri", "Landroid/os/Bundle;", "extras", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f174659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f174660b;

    public b(Uri uri, Bundle bundle) {
        this.f174659a = uri;
        this.f174660b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f174659a, bVar.f174659a) && s.g(this.f174660b, bVar.f174660b);
    }

    public final int hashCode() {
        Uri uri = this.f174659a;
        return this.f174660b.hashCode() + ((uri != null ? uri.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f174659a + ", extras=" + this.f174660b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

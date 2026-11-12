package fd;

import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfd/h;", "", "Landroid/net/Uri;", "registrationUri", "", "debugKeyAllowed", "<init>", "(Landroid/net/Uri;Z)V", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70432c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f70433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70434b;

    public h(Uri uri, boolean z14) {
        uri.getClass();
        this.f70433a = uri;
        this.f70434b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f70433a.equals(hVar.f70433a) && this.f70434b == hVar.f70434b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70434b) + (this.f70433a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WebSourceParams { RegistrationUri=");
        sb3.append(this.f70433a);
        sb3.append(", DebugKeyAllowed=");
        return hb.a.k(sb3, this.f70434b, " }");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfd/h$a;", "", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

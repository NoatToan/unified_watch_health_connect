package lc;

import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\nB-\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Llc/g0;", "", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "uri", "", "action", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f111767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111769c;

    public g0(Uri uri, String str, String str2) {
        this.f111767a = uri;
        this.f111768b = str;
        this.f111769c = str2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f111767a;
        if (uri != null) {
            sb3.append(" uri=");
            sb3.append(String.valueOf(uri));
        }
        String str = this.f111768b;
        if (str != null) {
            sb3.append(" action=");
            sb3.append(str);
        }
        String str2 = this.f111769c;
        if (str2 != null) {
            sb3.append(" mimetype=");
            sb3.append(str2);
        }
        sb3.append(" }");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llc/g0$a;", "", "<init>", "()V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2143a f111770a = new C2143a(null);

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX INFO: renamed from: lc.g0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/g0$a$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2143a {
            public /* synthetic */ C2143a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2143a() {
            }
        }

        private a() {
        }
    }
}

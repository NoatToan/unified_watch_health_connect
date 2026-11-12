package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class hig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f20100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20101b;
    public final String c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f20102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20103b;
        public String c;

        public static a b(Uri uri) {
            a aVar = new a();
            aVar.c(uri);
            return aVar;
        }

        public hig a() {
            return new hig(this.f20102a, this.f20103b, this.c);
        }

        public a c(Uri uri) {
            this.f20102a = uri;
            return this;
        }
    }

    public hig(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public String a() {
        return this.f20101b;
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.f20100a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.f20100a != null) {
            sb.append(" uri=");
            sb.append(this.f20100a.toString());
        }
        if (this.f20101b != null) {
            sb.append(" action=");
            sb.append(this.f20101b);
        }
        if (this.c != null) {
            sb.append(" mimetype=");
            sb.append(this.c);
        }
        sb.append(" }");
        return sb.toString();
    }

    public hig(Uri uri, String str, String str2) {
        this.f20100a = uri;
        this.f20101b = str;
        this.c = str2;
    }
}

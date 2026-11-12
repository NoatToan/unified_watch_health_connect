package jb0;

import am.j;
import android.net.Uri;
import lc.u0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Ljb0/c;", "", "<init>", "()V", "a", "c", "b", "Ljb0/c$a;", "Ljb0/c$c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljb0/c$a;", "Ljb0/c;", "", "url", "<init>", "(Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            str.getClass();
            this.f98109a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f98109a, ((a) obj).f98109a);
        }

        public final int hashCode() {
            return this.f98109a.hashCode();
        }

        public final String toString() {
            return j.m("Avatar(url=", this.f98109a, ")");
        }
    }

    /* JADX INFO: renamed from: jb0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljb0/c$c;", "Ljb0/c;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1878c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f98110a;

        public C1878c(Uri uri) {
            super(null);
            this.f98110a = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1878c) && s.g(this.f98110a, ((C1878c) obj).f98110a);
        }

        public final int hashCode() {
            Uri uri = this.f98110a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final String toString() {
            return "Picture(uri=" + this.f98110a + ")";
        }
    }

    static {
        new b(null);
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public final String a(long j8) {
        if (this instanceof a) {
            return ((a) this).f98109a;
        }
        if (this instanceof C1878c) {
            return e.e(j8, "profile_image__");
        }
        u0.r();
        return null;
    }

    public final String b() {
        if (this instanceof a) {
            return ((a) this).f98109a;
        }
        if (!(this instanceof C1878c)) {
            u0.r();
            return null;
        }
        Uri uri = ((C1878c) this).f98110a;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljb0/c$b;", "", "<init>", "()V", "", "PICTURE_PREFIX", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    private c() {
    }
}

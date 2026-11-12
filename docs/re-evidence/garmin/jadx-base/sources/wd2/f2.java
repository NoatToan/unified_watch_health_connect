package wd2;

import ch.qos.logback.core.joran.action.Action;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lwd2/f2;", "", "", Action.KEY_ATTRIBUTE, "secondaryKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "c", JWKParameterNames.RSA_EXPONENT, "d", "b", "Lwd2/f2$a;", "Lwd2/f2$c;", "Lwd2/f2$d;", "Lwd2/f2$e;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184463b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwd2/f2$a;", "Lwd2/f2;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f184464c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super("ANONYMOUS", null, 2, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1020168564;
        }

        public final String toString() {
            return "Anonymous";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwd2/f2$c;", "Lwd2/f2;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f184465c = new c();

        private c() {
            super("EMAIL", "CONTACTS", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1855587293;
        }

        public final String toString() {
            return "Email";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwd2/f2$d;", "Lwd2/f2;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f184466c = new d();

        /* JADX WARN: Multi-variable type inference failed */
        private d() {
            super("GROUP_TRACK", null, 2, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -916599323;
        }

        public final String toString() {
            return "GroupTrack";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwd2/f2$e;", "Lwd2/f2;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends f2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f184467c = new e();

        /* JADX WARN: Multi-variable type inference failed */
        private e() {
            super("STRAVA", null, 2, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1280859308;
        }

        public final String toString() {
            return "Strava";
        }
    }

    static {
        new b(null);
    }

    public /* synthetic */ f2(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lwd2/f2$b;", "", "<init>", "()V", "", "ANONYMOUS", "Ljava/lang/String;", "EMAIL", "CONTACTS", "STRAVA", "GROUP_TRACK", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    private f2(String str, String str2) {
        this.f184462a = str;
        this.f184463b = str2;
    }

    public /* synthetic */ f2(String str, String str2, p005kotlin.jvm.internal.j jVar) {
        this(str, str2);
    }
}

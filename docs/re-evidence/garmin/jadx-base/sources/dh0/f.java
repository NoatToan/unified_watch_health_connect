package dh0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u001b\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Ldh0/f;", "", "", Action.KEY_ATTRIBUTE, "", "messageStringId", "<init>", "(Ljava/lang/String;I)V", JWKParameterNames.RSA_EXPONENT, "c", "b", "d", "a", "Ldh0/f$b;", "Ldh0/f$c;", "Ldh0/f$d;", "Ldh0/f$e;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f59583c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59585b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/f$b;", "Ldh0/f;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f59586d = new b();

        private b() {
            super("USER_EMPTY_AGE", R.string.msg_under_age_description, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 649836391;
        }

        public final String toString() {
            return "EmptyAge";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/f$c;", "Ldh0/f;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f59587d = new c();

        private c() {
            super("USER_OVER_AGE", R.string.msg_over_age_description, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1661834742;
        }

        public final String toString() {
            return "OverAge";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/f$d;", "Ldh0/f;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f59588d = new d();

        private d() {
            super("USER_PREGNANT", R.string.msg_pregnant_description, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1838758446;
        }

        public final String toString() {
            return "Pregnant";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/f$e;", "Ldh0/f;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f59589d = new e();

        private e() {
            super("USER_UNDER_AGE", R.string.msg_under_age_description, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1000076804;
        }

        public final String toString() {
            return "UnderAge";
        }
    }

    private f(String str, int i14) {
        this.f59584a = str;
        this.f59585b = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/f$a;", "", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, i14);
    }
}

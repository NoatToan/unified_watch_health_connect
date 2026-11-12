package lv0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v.e0;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: lv0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llv0/a$a;", "Llv0/a;", "", "title", "message", "positiveBtnLabel", "Lkotlin/Function0;", "", "positiveBtnAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2188a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f115038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f115039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f115040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.a<Unit> f115041d;

        public C2188a(String str, String str2, String str3, e23.a<Unit> aVar) {
            str.getClass();
            str3.getClass();
            aVar.getClass();
            this.f115038a = str;
            this.f115039b = str2;
            this.f115040c = str3;
            this.f115041d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2188a)) {
                return false;
            }
            C2188a c2188a = (C2188a) obj;
            return this.f115038a.equals(c2188a.f115038a) && s.g(this.f115039b, c2188a.f115039b) && this.f115040c.equals(c2188a.f115040c) && this.f115041d.equals(c2188a.f115041d);
        }

        public final int hashCode() {
            int iHashCode = this.f115038a.hashCode() * 31;
            String str = this.f115039b;
            return this.f115041d.hashCode() + g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f115040c);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("Confirm(title=", this.f115038a, ", message=", this.f115039b, ", positiveBtnLabel=");
            sbI.append(this.f115040c);
            sbI.append(", positiveBtnAction=");
            sbI.append(this.f115041d);
            sbI.append(")");
            return sbI.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llv0/a$b;", "Llv0/a;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f115042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f115043b;

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f115042a = str;
            this.f115043b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f115042a.equals(bVar.f115042a) && this.f115043b.equals(bVar.f115043b);
        }

        public final int hashCode() {
            return this.f115043b.hashCode() + (this.f115042a.hashCode() * 31);
        }

        public final String toString() {
            return e0.g("Info(title=", this.f115042a, ", message=", this.f115043b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llv0/a$c;", "Llv0/a;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f115044a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -204139109;
        }

        public final String toString() {
            return "None";
        }
    }
}

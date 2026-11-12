package kt;

import ch.qos.logback.core.joran.action.Action;
import ht.r;
import i3.e5;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends r {

    /* JADX INFO: renamed from: kt.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkt/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC2056a {
        Tapped
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkt/a$b;", "Lkt/a;", "Lkt/a$a;", "action", "<init>", "(Lkt/a$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC2056a f106425a;

        public b(EnumC2056a enumC2056a) {
            enumC2056a.getClass();
            this.f106425a = enumC2056a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f106425a == ((b) obj).f106425a;
        }

        @Override // kt.a
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final EnumC2056a getF106428a() {
            return this.f106425a;
        }

        public final int hashCode() {
            return this.f106425a.hashCode();
        }

        public final String toString() {
            return "DiagnosticReport(action=" + this.f106425a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkt/a$c;", "Lkt/a;", "Lkt/a$a;", "action", "<init>", "(Lkt/a$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC2056a f106426a;

        public c(EnumC2056a enumC2056a) {
            enumC2056a.getClass();
            this.f106426a = enumC2056a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f106426a == ((c) obj).f106426a;
        }

        @Override // kt.a
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final EnumC2056a getF106428a() {
            return this.f106426a;
        }

        public final int hashCode() {
            return this.f106426a.hashCode();
        }

        public final String toString() {
            return "GarminConnectSupport(action=" + this.f106426a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkt/a$d;", "Lkt/a;", "Lkt/a$a;", "action", "<init>", "(Lkt/a$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC2056a f106427a;

        public d(EnumC2056a enumC2056a) {
            enumC2056a.getClass();
            this.f106427a = enumC2056a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f106427a == ((d) obj).f106427a;
        }

        @Override // kt.a
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final EnumC2056a getF106428a() {
            return this.f106427a;
        }

        public final int hashCode() {
            return this.f106427a.hashCode();
        }

        public final String toString() {
            return "ProductSupport(action=" + this.f106427a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkt/a$e;", "Lkt/a;", "Lkt/a$a;", "action", "Lkt/a$f;", "entry", "<init>", "(Lkt/a$a;Lkt/a$f;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC2056a f106428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f106429b;

        public e(EnumC2056a enumC2056a, f fVar) {
            enumC2056a.getClass();
            fVar.getClass();
            this.f106428a = enumC2056a;
            this.f106429b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f106428a == eVar.f106428a && this.f106429b == eVar.f106429b;
        }

        @Override // kt.a
        /* JADX INFO: renamed from: getAction, reason: from getter */
        public final EnumC2056a getF106428a() {
            return this.f106428a;
        }

        public final int hashCode() {
            return this.f106429b.hashCode() + (this.f106428a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductSupportEntry(action=" + this.f106428a + ", entry=" + this.f106429b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkt/a$f;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum f {
        DEVICE("Device"),
        WEAR_AND_CARE_TIPS("WearAndCareTips");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106433a;

        f(String str) {
            this.f106433a = str;
        }
    }

    @Override // ht.r
    default zk.a a() {
        ArrayList arrayListM = x.m(new zk.e("Screen", "Help"));
        arrayListM.add(new zk.e("Action", getF106428a().name()));
        if ((this instanceof b) || (this instanceof c) || (this instanceof d)) {
            arrayListM.add(new zk.e("Type", c()));
        } else {
            if (!(this instanceof e)) {
                u0.r();
                return null;
            }
            arrayListM.add(new zk.e("Type", e5.g(c(), "_", ((e) this).f106429b.f106433a)));
        }
        return new zk.a("UserAction", arrayListM, false, 0L, 12, null);
    }

    default String c() {
        if (this instanceof c) {
            return "GarminConnectSupport";
        }
        if (this instanceof b) {
            return "DiagnosticReport";
        }
        if (this instanceof d) {
            return "ProductSupport";
        }
        if (this instanceof e) {
            return "ProductSupportEntry";
        }
        u0.r();
        return null;
    }

    /* JADX INFO: renamed from: getAction */
    EnumC2056a getF106428a();
}

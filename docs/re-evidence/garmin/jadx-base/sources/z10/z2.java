package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lz10/z2;", "", "<init>", "()V", "a", "c", "d", "b", "Lz10/z2$a;", "Lz10/z2$b;", "Lz10/z2$c;", "Lz10/z2$d;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class z2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/z2$a;", "Lz10/z2;", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends z2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f201347a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz10/z2$b;", "Lz10/z2;", "", "url", "<init>", "(Ljava/lang/String;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends z2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f201348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f201348a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f201348a, ((b) obj).f201348a);
        }

        public final int hashCode() {
            return this.f201348a.hashCode();
        }

        public final String toString() {
            return am.j.m("OpenPrivacyPolicy(url=", this.f201348a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/z2$c;", "Lz10/z2;", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends z2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f201349a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/z2$d;", "Lz10/z2;", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends z2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f201350a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ z2(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private z2() {
    }
}

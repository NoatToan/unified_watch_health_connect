package ck0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lck0/v;", "", "<init>", "()V", "b", "c", "d", "a", "Lck0/v$a;", "Lck0/v$b;", "Lck0/v$c;", "Lck0/v$d;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class v {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lck0/v$a;", "Lck0/v;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27894a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 14723627;
        }

        public final String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lck0/v$b;", "Lck0/v;", "", "disableReveal", "<init>", "(Z)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f27895a;

        public b(boolean z14) {
            super(null);
            this.f27895a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f27895a == ((b) obj).f27895a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f27895a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("Hidden(disableReveal=", ")", this.f27895a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lck0/v$c;", "Lck0/v;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27896a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1214825313;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lck0/v$d;", "Lck0/v;", "", "code", "<init>", "(Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27897a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            str.getClass();
            this.f27897a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f27897a, ((d) obj).f27897a);
        }

        public final int hashCode() {
            return this.f27897a.hashCode();
        }

        public final String toString() {
            return am.j.m("Revealed(code=", this.f27897a, ")");
        }
    }

    public /* synthetic */ v(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private v() {
    }
}

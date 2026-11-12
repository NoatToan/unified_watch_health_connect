package y92;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ly92/w;", "", "<init>", "()V", "c", "a", "b", "Ly92/w$a;", "Ly92/w$b;", "Ly92/w$c;", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly92/w$a;", "Ly92/w;", "<init>", "()V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f195387a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1648025005;
        }

        public final String toString() {
            return "DeviceLocked";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly92/w$b;", "Ly92/w;", "<init>", "()V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f195388a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1083291846;
        }

        public final String toString() {
            return "DeviceUnlocked";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly92/w$c;", "Ly92/w;", "", "retries", "<init>", "(I)V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f195389a;

        public c(int i14) {
            super(null);
            this.f195389a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f195389a == ((c) obj).f195389a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f195389a);
        }

        public final String toString() {
            return e0.f(this.f195389a, "InvalidAttempt(retries=", ")");
        }
    }

    public /* synthetic */ w(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private w() {
    }
}

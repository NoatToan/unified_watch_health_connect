package rt1;

import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lrt1/b;", "", "<init>", "()V", "c", "b", "a", "Lrt1/b$a;", "Lrt1/b$b;", "Lrt1/b$c;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: rt1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrt1/b$b;", "Lrt1/b;", "Lfg0/k;", "eventDTO", "<init>", "(Lfg0/k;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2927b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fg0.k f154515a;

        static {
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
        }

        public C2927b(fg0.k kVar) {
            super(null);
            this.f154515a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2927b) && s.g(this.f154515a, ((C2927b) obj).f154515a);
        }

        public final int hashCode() {
            fg0.k kVar = this.f154515a;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        public final String toString() {
            return "EventProcessedComplete(eventDTO=" + this.f154515a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrt1/b$c;", "Lrt1/b;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b {
        static {
            new c();
        }

        private c() {
            super(null);
        }
    }

    public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private b() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrt1/b$a;", "Lrt1/b;", "", "errorResponse", "<init>", "(Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f154514a;

        public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f154514a, ((a) obj).f154514a);
        }

        public final int hashCode() {
            String str = this.f154514a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("Error(errorResponse=", this.f154514a, ")");
        }

        public a(String str) {
            super(null);
            this.f154514a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}

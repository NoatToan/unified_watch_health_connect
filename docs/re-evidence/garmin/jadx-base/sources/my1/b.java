package my1;

import android.os.Parcelable;
import fg0.k;
import fg0.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmy1/b;", "", "<init>", "()V", "a", "b", "Lmy1/b$a;", "Lmy1/b$b;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmy1/b$a;", "Lmy1/b;", "Lfg0/k;", "eventDTO", "Lfg0/o;", "eventSearchDTO", "<init>", "(Lfg0/k;Lfg0/o;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f121478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f121479b;

        static {
            Parcelable.Creator<o> creator = o.CREATOR;
            Parcelable.Creator<k> creator2 = k.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, o oVar) {
            super(null);
            kVar.getClass();
            oVar.getClass();
            this.f121478a = kVar;
            this.f121479b = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f121478a, aVar.f121478a) && s.g(this.f121479b, aVar.f121479b);
        }

        public final int hashCode() {
            return this.f121479b.hashCode() + (this.f121478a.hashCode() * 31);
        }

        public final String toString() {
            return "GCEndpointData(eventDTO=" + this.f121478a + ", eventSearchDTO=" + this.f121479b + ")";
        }
    }

    /* JADX INFO: renamed from: my1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmy1/b$b;", "Lmy1/b;", "Lfg0/o;", "eventSearchDTO", "<init>", "(Lfg0/o;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2302b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f121480a;

        static {
            Parcelable.Creator<o> creator = o.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2302b(o oVar) {
            super(null);
            oVar.getClass();
            this.f121480a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2302b) && s.g(this.f121480a, ((C2302b) obj).f121480a);
        }

        public final int hashCode() {
            return this.f121480a.hashCode();
        }

        public final String toString() {
            return "UNIEndpointData(eventSearchDTO=" + this.f121480a + ")";
        }
    }

    public /* synthetic */ b(j jVar) {
        this();
    }

    private b() {
    }
}

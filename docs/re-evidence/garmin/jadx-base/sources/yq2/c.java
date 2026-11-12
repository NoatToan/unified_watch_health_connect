package yq2;

import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public interface c<CommonEventType, SpecificEventType> {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyq2/c$a;", "CommonEventType", "Lyq2/c;", "", "event", "<init>", "(Ljava/lang/Object;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a<CommonEventType> implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CommonEventType f198844a;

        public a(CommonEventType commoneventtype) {
            this.f198844a = commoneventtype;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f198844a, ((a) obj).f198844a);
        }

        public final int hashCode() {
            CommonEventType commoneventtype = this.f198844a;
            if (commoneventtype == null) {
                return 0;
            }
            return commoneventtype.hashCode();
        }

        public final String toString() {
            return e.f("Common(event=", ")", this.f198844a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyq2/c$b;", "CommonEventType", "SpecificEventType", "Lyq2/c;", "event", "<init>", "(Ljava/lang/Object;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<CommonEventType, SpecificEventType> implements c<CommonEventType, SpecificEventType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpecificEventType f198845a;

        public b(SpecificEventType specificeventtype) {
            this.f198845a = specificeventtype;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f198845a, ((b) obj).f198845a);
        }

        public final int hashCode() {
            SpecificEventType specificeventtype = this.f198845a;
            if (specificeventtype == null) {
                return 0;
            }
            return specificeventtype.hashCode();
        }

        public final String toString() {
            return e.f("Specific(event=", ")", this.f198845a);
        }
    }
}

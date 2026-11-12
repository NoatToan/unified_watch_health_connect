package j90;

import androidx.room.a0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lj90/m;", "", "", "messageRes", "<init>", "(Ljava/lang/Integer;)V", "b", "a", "Lj90/m$a;", "Lj90/m$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f97837a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/m$a;", "Lj90/m;", "", "messageRes", "<init>", "(Ljava/lang/Integer;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f97838b;

        public a(Integer num) {
            super(num, null);
            this.f97838b = num;
        }

        @Override // j90.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getF97837a() {
            return this.f97838b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f97838b, ((a) obj).f97838b);
        }

        public final int hashCode() {
            Integer num = this.f97838b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return a0.i("Failure(messageRes=", this.f97838b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/m$b;", "Lj90/m;", "", "messageRes", "<init>", "(Ljava/lang/Integer;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f97839b;

        public b(Integer num) {
            super(num, null);
            this.f97839b = num;
        }

        @Override // j90.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getF97837a() {
            return this.f97839b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f97839b, ((b) obj).f97839b);
        }

        public final int hashCode() {
            Integer num = this.f97839b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return a0.i("Success(messageRes=", this.f97839b, ")");
        }
    }

    private m(Integer num) {
        this.f97837a = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Integer getF97837a() {
        return this.f97837a;
    }

    public /* synthetic */ m(Integer num, p005kotlin.jvm.internal.j jVar) {
        this(num);
    }
}

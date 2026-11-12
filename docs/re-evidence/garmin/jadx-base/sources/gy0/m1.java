package gy0;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgy0/m1;", "", "<init>", "()V", "b", "a", "Lgy0/m1$a;", "Lgy0/m1$b;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m1 {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgy0/m1$a;", "Lgy0/m1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f80199a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(null);
            exc.getClass();
            this.f80199a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f80199a, ((a) obj).f80199a);
        }

        public final int hashCode() {
            return this.f80199a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f80199a, "UploadError(exception=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/m1$b;", "Lgy0/m1;", "Lcy0/o;", "epicImage", "<init>", "(Lcy0/o;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cy0.o f80200a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cy0.o oVar) {
            super(null);
            oVar.getClass();
            this.f80200a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f80200a, ((b) obj).f80200a);
        }

        public final int hashCode() {
            return this.f80200a.hashCode();
        }

        public final String toString() {
            return "UploadSuccess(epicImage=" + this.f80200a + ")";
        }
    }

    public /* synthetic */ m1(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private m1() {
    }
}

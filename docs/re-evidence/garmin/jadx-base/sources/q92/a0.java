package q92;

import com.garmin.android.apps.connectmobile.f3;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lq92/a0;", "", "T", "<init>", "()V", "b", "a", "Lq92/a0$a;", "Lq92/a0$b;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a0<T> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq92/a0$a;", "Lq92/a0;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f143608a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(null);
            exc.getClass();
            this.f143608a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f143608a, ((a) obj).f143608a);
        }

        public final int hashCode() {
            return this.f143608a.hashCode();
        }

        @Override // q92.a0
        public final String toString() {
            return f3.h(this.f143608a, "Error(exception=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq92/a0$b;", "", "T", "Lq92/a0;", "data", "<init>", "(Ljava/lang/Object;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b<T> extends a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f143609a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t7) {
            super(null);
            t7.getClass();
            this.f143609a = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f143609a, ((b) obj).f143609a);
        }

        public final int hashCode() {
            return this.f143609a.hashCode();
        }

        @Override // q92.a0
        public final String toString() {
            return org.apache.commons.lang3.e.f("Success(data=", ")", this.f143609a);
        }
    }

    public /* synthetic */ a0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public String toString() {
        if (this instanceof b) {
            return org.apache.commons.lang3.e.f("Success[data=", "]", ((b) this).f143609a);
        }
        if (this instanceof a) {
            return f3.h(((a) this).f143608a, "Error[exception=", "]");
        }
        u0.r();
        return null;
    }

    private a0() {
    }
}

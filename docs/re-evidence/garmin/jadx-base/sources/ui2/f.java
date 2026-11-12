package ui2;

import com.garmin.android.apps.connectmobile.f3;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lui2/f;", "", "T", "<init>", "()V", "b", "a", "Lui2/f$a;", "Lui2/f$b;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f<T> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lui2/f$a;", "Lui2/f;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f171439a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(null);
            exc.getClass();
            this.f171439a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f171439a, ((a) obj).f171439a);
        }

        public final int hashCode() {
            return this.f171439a.hashCode();
        }

        @Override // ui2.f
        public final String toString() {
            return f3.h(this.f171439a, "Error(exception=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lui2/f$b;", "", "T", "Lui2/f;", "data", "<init>", "(Ljava/lang/Object;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b<T> extends f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f171440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t7) {
            super(null);
            t7.getClass();
            this.f171440a = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f171440a, ((b) obj).f171440a);
        }

        public final int hashCode() {
            return this.f171440a.hashCode();
        }

        @Override // ui2.f
        public final String toString() {
            return org.apache.commons.lang3.e.f("Success(data=", ")", this.f171440a);
        }
    }

    public /* synthetic */ f(j jVar) {
        this();
    }

    public String toString() {
        if (this instanceof b) {
            return org.apache.commons.lang3.e.f("Success[data=", "]", ((b) this).f171440a);
        }
        if (this instanceof a) {
            return f3.h(((a) this).f171439a, "Error[exception=", "]");
        }
        u0.r();
        return null;
    }

    private f() {
    }
}

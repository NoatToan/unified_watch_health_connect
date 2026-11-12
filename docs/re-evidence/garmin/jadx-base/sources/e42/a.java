package e42;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sd2.f;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Le42/a;", "", "<init>", "()V", "b", "c", "a", "Le42/a$a;", "Le42/a$b;", "Le42/a$c;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: e42.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le42/a$a;", "Le42/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1324a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f62871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1324a(Exception exc) {
            super(null);
            exc.getClass();
            this.f62871a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1324a) && s.g(this.f62871a, ((C1324a) obj).f62871a);
        }

        public final int hashCode() {
            return this.f62871a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f62871a, "Error(exception=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le42/a$b;", "Le42/a;", "<init>", "()V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f62872a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 954854289;
        }

        public final String toString() {
            return "Idle";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le42/a$c;", "Le42/a;", "", "Lsd2/f;", "devices", "<init>", "(Ljava/util/List;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<f> f62873a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends f> list) {
            super(null);
            list.getClass();
            this.f62873a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f62873a, ((c) obj).f62873a);
        }

        public final int hashCode() {
            return this.f62873a.hashCode();
        }

        public final String toString() {
            return k.h("Success(devices=", ")", this.f62873a);
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}

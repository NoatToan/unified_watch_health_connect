package kd1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public interface c<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkd1/c$a;", "Lkd1/c;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f104497a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1302750331;
        }

        public final String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkd1/c$b;", "Lkd1/c;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f104498a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -371744017;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: kd1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd1/c$c;", "T", "Lkd1/c;", "reminders", "<init>", "(Ljava/lang/Object;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1998c<T> implements c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f104499a;

        public C1998c(T t7) {
            this.f104499a = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1998c) && s.g(this.f104499a, ((C1998c) obj).f104499a);
        }

        public final int hashCode() {
            T t7 = this.f104499a;
            if (t7 == null) {
                return 0;
            }
            return t7.hashCode();
        }

        public final String toString() {
            return org.apache.commons.lang3.e.f("Successful(reminders=", ")", this.f104499a);
        }
    }
}

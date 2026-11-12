package vk0;

import java.util.List;
import jk0.n;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvk0/k$a;", "Lvk0/k;", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f178577a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2042796290;
        }

        public final String toString() {
            return "Failed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvk0/k$b;", "Lvk0/k;", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f178578a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 313903969;
        }

        public final String toString() {
            return "NoChanges";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvk0/k$c;", "Lvk0/k;", "", "Ljk0/n;", "photos", "<init>", "(Ljava/util/List;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<n> f178579a;

        public c(List<n> list) {
            list.getClass();
            this.f178579a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f178579a.equals(((c) obj).f178579a);
        }

        public final int hashCode() {
            return this.f178579a.hashCode();
        }

        public final String toString() {
            return tn.k.h("Success(photos=", ")", this.f178579a);
        }
    }
}

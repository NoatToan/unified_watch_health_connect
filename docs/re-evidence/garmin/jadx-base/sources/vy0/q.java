package vy0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lvy0/q;", "", "<init>", "()V", "a", "c", "b", "Lvy0/q$a;", "Lvy0/q$b;", "Lvy0/q$c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy0/q$a;", "Lvy0/q;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.navigation.more.b> f180765a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends com.garmin.android.apps.connectmobile.navigation.more.b> list) {
            super(null);
            list.getClass();
            this.f180765a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f180765a, ((a) obj).f180765a);
        }

        public final int hashCode() {
            return this.f180765a.hashCode();
        }

        public final String toString() {
            return tn.k.h("MoreItems(items=", ")", this.f180765a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy0/q$b;", "Lvy0/q;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.navigation.more.b> f180766a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends com.garmin.android.apps.connectmobile.navigation.more.b> list) {
            super(null);
            list.getClass();
            this.f180766a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f180766a, ((b) obj).f180766a);
        }

        public final int hashCode() {
            return this.f180766a.hashCode();
        }

        public final String toString() {
            return tn.k.h("RecentSearches(items=", ")", this.f180766a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvy0/q$c;", "Lvy0/q;", "", "Lvy0/e0;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<e0> f180767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<e0> list) {
            super(null);
            list.getClass();
            this.f180767a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f180767a, ((c) obj).f180767a);
        }

        public final int hashCode() {
            return this.f180767a.hashCode();
        }

        public final String toString() {
            return tn.k.h("SearchableItems(items=", ")", this.f180767a);
        }
    }

    public /* synthetic */ q(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private q() {
    }
}

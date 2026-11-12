package fy1;

import g22.k;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfy1/a;", "", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1500a f73883a = new C1500a(null);

    /* JADX INFO: renamed from: fy1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfy1/a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1500a {
        public /* synthetic */ C1500a(j jVar) {
            this();
        }

        public static int a(int i14, DateTime dateTime, DateTime dateTime2) {
            if (dateTime2.isBefore(dateTime)) {
                return 0;
            }
            return Weeks.weeksBetween(k.o(i14, dateTime).toLocalDate(), k.o(i14, dateTime2).toLocalDate()).getWeeks() + 1;
        }

        private C1500a() {
        }
    }
}

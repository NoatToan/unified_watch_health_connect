package jp0;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljp0/e$a;", "", "<init>", "()V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f99880a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    static {
        int i14 = a.f99880a;
    }

    Double b();

    default LocalDate d() {
        DateTime dateTimeWithTimeAtStartOfDay;
        DateTime date = getDate();
        if (date == null || (dateTimeWithTimeAtStartOfDay = date.withTimeAtStartOfDay()) == null) {
            return null;
        }
        return dateTimeWithTimeAtStartOfDay.toLocalDate();
    }

    DateTime getDate();

    Double getValue();
}

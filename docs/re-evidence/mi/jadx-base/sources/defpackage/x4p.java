package defpackage;

import org.threeten.bp.DayOfWeek;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class x4p {

    public static final class b implements w4p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38697b;

        @Override // defpackage.w4p
        public s4p adjustInto(s4p s4pVar) {
            int i = s4pVar.get(ChronoField.DAY_OF_WEEK);
            int i2 = this.f38696a;
            if (i2 < 2 && i == this.f38697b) {
                return s4pVar;
            }
            if ((i2 & 1) == 0) {
                int i3 = i - this.f38697b;
                return s4pVar.plus(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
            }
            int i4 = this.f38697b - i;
            return s4pVar.minus(i4 >= 0 ? 7 - i4 : -i4, ChronoUnit.DAYS);
        }

        public b(int i, DayOfWeek dayOfWeek) {
            crd.i(dayOfWeek, "dayOfWeek");
            this.f38696a = i;
            this.f38697b = dayOfWeek.getValue();
        }
    }

    public static w4p a(DayOfWeek dayOfWeek) {
        return new b(0, dayOfWeek);
    }

    public static w4p b(DayOfWeek dayOfWeek) {
        return new b(1, dayOfWeek);
    }
}

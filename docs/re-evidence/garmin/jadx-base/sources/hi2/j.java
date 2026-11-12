package hi2;

import ch.qos.logback.classic.Logger;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lhi2/j;", "", "", "hours", "minutes", "seconds", "<init>", "(III)V", "()V", "", "totalSeconds", "(D)V", "", "(Ljava/lang/String;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f83912d;

    static {
        new a(null);
    }

    public j(double d14) {
        this();
        double d15 = DateTimeConstants.SECONDS_PER_HOUR;
        try {
            this.f83909a = (int) (d14 / d15);
            double d16 = d14 % d15;
            double d17 = 60;
            this.f83910b = (int) (d16 / d17);
            this.f83911c = (int) (d16 % d17);
        } catch (NumberFormatException unused) {
            d dVar = this.f83912d;
            Logger logger = d.f83889c;
            dVar.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f83909a == jVar.f83909a && this.f83910b == jVar.f83910b && this.f83911c == jVar.f83911c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83911c) + q2.d(this.f83910b, Integer.hashCode(this.f83909a) * 31, 31);
    }

    public final String toString() {
        x0 x0Var = x0.f105818a;
        return this.f83909a + ":" + String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f83910b)}, 1)) + ":" + String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f83911c)}, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lhi2/j$a;", "", "<init>", "()V", "", "secondsPerHour", "I", "secondsPerMinute", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j() {
        this(0, 0, 0);
    }

    public j(int i14, int i15, int i16) {
        this.f83909a = i14;
        this.f83910b = i15;
        this.f83911c = i16;
        this.f83912d = new d("TimeInterval", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        this(Double.parseDouble(str));
        str.getClass();
    }
}

package gc0;

import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgc0/d;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f76844a;

    public d(l22.b bVar) {
        bVar.getClass();
        this.f76844a = bVar;
    }

    public final String a(long j8) {
        String string;
        if (j8 == 0) {
            return "";
        }
        DateTime dateTimeNow = DateTime.now();
        DateTime dateTime = new DateTime(j8);
        l22.b bVar = this.f76844a;
        String string2 = bVar.getString(R.string.title_last_synced);
        j0.f23099a.getClass();
        if (!j0.H(dateTime, dateTimeNow)) {
            return String.format(string2, Arrays.copyOf(new Object[]{com.nimbusds.jose.shaded.gson.internal.a.i("MMM d, yyyy", dateTime)}, 1));
        }
        dateTimeNow.getClass();
        if (g22.k.f(dateTimeNow, dateTime)) {
            string = bVar.getString(R.string.challenge_leaderboard_header_today_label);
        } else if (g22.k.f(dateTimeNow.minusDays(1), dateTime)) {
            string = bVar.getString(R.string.social_elapsed_time_yesterday);
        } else if (Math.abs(Days.daysBetween(dateTimeNow, dateTime).getDays()) < 7) {
            string = dateTime.toString("EEEE");
            string.getClass();
        } else {
            string = dateTime.toString("MMM d");
            string.getClass();
        }
        String string3 = dateTime.toString(j0.z());
        string3.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{bVar.a(R.string.string_at_string_pattern, string, string3)}, 1));
    }
}

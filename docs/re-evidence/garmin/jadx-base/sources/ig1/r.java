package ig1;

import com.garmin.android.apps.connectmobile.R;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes10.dex */
public class r extends xg1.r<LocalDate> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f93395a;

    public r(s sVar) {
        this.f93395a = sVar;
    }

    @Override // xg1.r
    public final String a(LocalDate localDate) {
        LocalDate localDate2 = localDate;
        if (localDate2 != null) {
            return DateTimeFormat.mediumDate().print(localDate2);
        }
        int i14 = s.f93399e;
        return this.f93395a.b(R.string.no_value);
    }
}

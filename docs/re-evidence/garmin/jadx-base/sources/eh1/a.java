package eh1;

import android.content.Context;
import android.text.format.DateFormat;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import xg1.r;

/* JADX INFO: loaded from: classes10.dex */
public class a extends r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64039a;

    public a(Context context) {
        this.f64039a = context;
    }

    @Override // xg1.r
    public final String a(Double d14) {
        Double d15 = d14;
        Context context = this.f64039a;
        if (d15 == null) {
            return context.getString(R.string.no_value);
        }
        return (DateFormat.is24HourFormat(context) ? DateTimeFormat.forPattern("HH:mm") : DateTimeFormat.forPattern("hh:mm a")).withZone(DateTimeZone.UTC).print(new DateTime(d15.longValue() * 1000));
    }
}

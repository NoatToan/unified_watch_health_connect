package jz;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import qi0.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljz/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f101896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101897b;

    public a(l22.b bVar) {
        bVar.getClass();
        this.f101896a = bVar;
        this.f101897b = bVar.getString(R.string.no_value_card);
    }

    public static String a(DateTime dateTime, boolean z14) {
        String string;
        return (dateTime == null || (string = dateTime.toString(z14 ? "HH" : "ha")) == null) ? "" : string;
    }

    public static String d(LocalTime localTime, LocalTime localTime2, Context context) {
        context.getClass();
        return new pi0.a(context).h(localTime, localTime2, e.RELATIVE_24H_AM_PM_TIME);
    }

    public final String b(DateTime dateTime, boolean z14) {
        String string;
        return (dateTime == null || (string = dateTime.toString(z14 ? "HH:mm" : "h:mm a")) == null) ? this.f101897b : string;
    }

    public final String c(DateTime dateTime, DateTime dateTime2, boolean z14) {
        dateTime.getClass();
        return this.f101896a.a(R.string.string_short_dash_line_string_pattern, b(dateTime, z14), b(dateTime2, z14));
    }
}

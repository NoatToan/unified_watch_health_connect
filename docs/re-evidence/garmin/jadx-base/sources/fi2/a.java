package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Years;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/a;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
        this.f71775c = new hi2.d("AgeTransform", null, 2, null);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        DateTime dateTime;
        String strE = ei2.h.e(bVar, map);
        this.f71775c.getClass();
        if (strE.length() <= 0) {
            return "--";
        }
        hi2.b.f83885a.getClass();
        if (strE.length() > 0) {
            try {
                dateTime = new DateTime(hi2.b.f83887c.parse(strE));
            } catch (ParseException unused) {
                dateTime = null;
            }
        } else {
            dateTime = null;
        }
        return String.valueOf(Years.yearsBetween(dateTime, new DateTime()).getYears());
    }
}

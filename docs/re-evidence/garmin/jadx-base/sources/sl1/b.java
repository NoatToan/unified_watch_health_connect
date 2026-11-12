package sl1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsl1/b;", "Lj00/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "displayedStartDateTime", "displayedEndDateTime", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends j00.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f159979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f159980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, DateTime dateTime, DateTime dateTime2) {
        super(context);
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f159979c = dateTime;
        this.f159980d = dateTime2;
    }

    @Override // j00.e
    public final String b(DateTime dateTime) {
        return super.b(this.f159980d);
    }

    @Override // j00.e
    public final String c(DateTime dateTime) {
        return super.c(this.f159979c);
    }
}

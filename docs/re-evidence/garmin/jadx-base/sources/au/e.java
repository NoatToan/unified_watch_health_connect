package au;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/e;", "Lpi2/a;", "", "identifier", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "launchIntent", "<init>", "(ILandroid/content/Context;Landroid/content/Intent;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e extends pi2.a<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f12844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i14, Context context, Intent intent) {
        super(Integer.valueOf(i14), "AnnualReportReadyNotificationEvent");
        context.getClass();
        intent.getClass();
        this.f12842b = i14;
        this.f12843c = context;
        this.f12844d = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12842b == eVar.f12842b && s.g(this.f12843c, eVar.f12843c) && s.g(this.f12844d, eVar.f12844d);
    }

    public final int hashCode() {
        return this.f12844d.hashCode() + ((this.f12843c.hashCode() + (Integer.hashCode(this.f12842b) * 31)) * 31);
    }

    public final String toString() {
        return "AnnualReportReadyNotificationEvent(identifier=" + this.f12842b + ", context=" + this.f12843c + ", launchIntent=" + this.f12844d + ")";
    }
}

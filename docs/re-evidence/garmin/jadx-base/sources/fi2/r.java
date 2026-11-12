package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/r;", "Lei2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r extends ei2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f71804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        context.getClass();
        this.f71804d = new hi2.d("IntensityMinutesTransform", hi2.e.INTENSITY_MINUTES.f83902a);
    }

    @Override // ei2.b
    /* JADX INFO: renamed from: r, reason: from getter */
    public final hi2.d getF71804d() {
        return this.f71804d;
    }
}

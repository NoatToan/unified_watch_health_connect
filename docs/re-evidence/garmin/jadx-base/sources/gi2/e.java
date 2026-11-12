package gi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import kh2.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgi2/e;", "Lgi2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        String string = context.getString(R.string.device_action_remove_device);
        string.getClass();
        this.f77486c = string;
    }

    public abstract String s();

    /* JADX INFO: renamed from: t, reason: from getter */
    public String getF77486c() {
        return this.f77486c;
    }

    public abstract void u(j jVar);
}

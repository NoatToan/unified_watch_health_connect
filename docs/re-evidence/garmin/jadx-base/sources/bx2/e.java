package bx2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import ew2.f;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbx2/e;", "Lbx2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        String string = context.getString(R.string.device_action_remove_device);
        string.getClass();
        this.f21683b = string;
        String string2 = context.getString(R.string.lbl_common_remove);
        string2.getClass();
        this.f21684c = string2;
        String string3 = context.getString(R.string.lbl_cancel);
        string3.getClass();
        this.f21685d = string3;
    }

    @Override // bx2.c
    public final boolean k(Map<String, ? extends Object> map) {
        return true;
    }

    public abstract String l();

    /* JADX INFO: renamed from: m, reason: from getter */
    public String getF21683b() {
        return this.f21683b;
    }

    public abstract void n(f fVar);
}

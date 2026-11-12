package au1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import p005kotlin.Metadata;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau1/h;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableRow;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lwt1/q;", "atpDay", "<init>", "(Landroid/content/Context;Lwt1/q;)V", "", "enabled", "", "setEnabled", "(Z)V", "l", "Lwt1/q;", "getAtpDay", "()Lwt1/q;", "setAtpDay", "(Lwt1/q;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends GCMCheckableRow {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public q atpDay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, q qVar) {
        super(context);
        qVar.getClass();
        this.atpDay = qVar;
        getDefaultTextView().setGravity(3);
        getDefaultTextView().setTextSize(0, getResources().getDimension(R.dimen.andfont_body_1));
        if (context != null) {
            getDefaultTextView().setTextColor(a7.b.getColorStateList(context, R.color.gcm_text_primary_selector));
        }
        getDefaultTextView().setTypeface(getDefaultTextView().getTypeface(), 0);
        c(false);
        setDefaultText(this.atpDay.f187131b);
        b(false);
    }

    public final q getAtpDay() {
        return this.atpDay;
    }

    public final void setAtpDay(q qVar) {
        qVar.getClass();
        this.atpDay = qVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getDefaultTextView().setEnabled(enabled);
    }
}

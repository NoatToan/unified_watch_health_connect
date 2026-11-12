package sz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsz0/l;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f161444a = 0;

    static {
        new l();
    }

    private l() {
    }

    public static final void a(e23.a aVar, Context context) {
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_invitation_delete_title).setMessage(context.getString(R.string.lbl_invitation_delete_message_multiple_days_2, 30)).setPositiveButton(R.string.lbl_delete, new c32.a(aVar, 7)).setNegativeButton(R.string.lbl_cancel, new qh1.j(14)).show();
    }
}

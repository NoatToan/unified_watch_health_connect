package sz0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestFullListActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lsz0/w;", "Lg/a;", "", "", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends g.a<Object, Boolean> {
    @Override // g.a
    public final Intent a(Context context, Object obj) {
        return sn.a.d(context, context, InboxRequestFullListActivity.class);
    }

    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        return Boolean.valueOf(i14 == -1);
    }
}

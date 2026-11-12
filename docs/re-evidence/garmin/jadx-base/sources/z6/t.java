package z6;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class t extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<CharSequence> f202715e = new ArrayList<>();

    public t(q qVar) {
        f(qVar);
    }

    @Override // z6.w
    public final void b(y yVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(yVar.f202748b).setBigContentTitle(this.f202742b);
        if (this.f202744d) {
            bigContentTitle.setSummaryText(this.f202743c);
        }
        Iterator<CharSequence> it = this.f202715e.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    @Override // z6.w
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.textLines");
    }

    @Override // z6.w
    public final String d() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // z6.w
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList<CharSequence> arrayList = this.f202715e;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    public t() {
    }
}

package xz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestListFragment;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InboxRequestListFragment f192768b;

    public /* synthetic */ f(InboxRequestListFragment inboxRequestListFragment, int i14) {
        this.f192767a = i14;
        this.f192768b = inboxRequestListFragment;
    }

    @Override // f.b
    public final void a(Object obj) {
        int i14 = this.f192767a;
        InboxRequestListFragment inboxRequestListFragment = this.f192768b;
        switch (i14) {
            case 0:
                int i15 = InboxRequestListFragment.A;
                ((f.a) obj).getClass();
                p pVarY6 = inboxRequestListFragment.Y6();
                Context contextRequireContext = inboxRequestListFragment.requireContext();
                contextRequireContext.getClass();
                pVarY6.z4(contextRequireContext);
                break;
            default:
                int i16 = InboxRequestListFragment.A;
                ((Unit) obj).getClass();
                p pVarY7 = inboxRequestListFragment.Y6();
                Context contextRequireContext2 = inboxRequestListFragment.requireContext();
                contextRequireContext2.getClass();
                pVarY7.z4(contextRequireContext2);
                break;
        }
    }
}

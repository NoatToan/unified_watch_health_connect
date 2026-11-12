package h10;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Intent;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.connections.groups.GroupsActivity;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import q2.x;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f80751b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f80750a = i14;
        this.f80751b = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        int i14 = this.f80750a;
        Object obj = this.f80751b;
        switch (i14) {
            case 0:
                GroupsActivity groupsActivity = (GroupsActivity) obj;
                groupsActivity.f31364g.a(new Intent(groupsActivity, (Class<?>) GroupCreationActivity.class), null);
                break;
            default:
                x xVar = x.f142198a;
                q2.q qVar = q2.q.f142189a;
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                qVar.getClass();
                q2.q.a(actionIntent);
                break;
        }
        return true;
    }
}

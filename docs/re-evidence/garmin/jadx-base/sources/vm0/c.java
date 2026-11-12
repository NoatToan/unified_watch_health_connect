package vm0;

import androidx.appcompat.widget.SearchView;
import com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvm0/c;", "Landroidx/appcompat/widget/SearchView$m;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements SearchView.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupInviteActivity f178739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f178740b;

    public c(GroupInviteActivity groupInviteActivity, boolean z14) {
        this.f178739a = groupInviteActivity;
        this.f178740b = z14;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean E0(String str) {
        str.getClass();
        GroupInviteActivity.ca(this.f178739a, str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean l5(String str) {
        str.getClass();
        if (!this.f178740b) {
            return true;
        }
        GroupInviteActivity groupInviteActivity = this.f178739a;
        if (str.equals(groupInviteActivity.f36361c)) {
            return true;
        }
        GroupInviteActivity.ca(groupInviteActivity, str);
        return true;
    }
}

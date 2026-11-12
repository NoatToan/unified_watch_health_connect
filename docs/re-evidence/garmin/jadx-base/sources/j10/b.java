package j10;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.g3;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupActivityFeedTypeMainFragment f96347b;

    public /* synthetic */ b(GroupActivityFeedTypeMainFragment groupActivityFeedTypeMainFragment, int i14) {
        this.f96346a = i14;
        this.f96347b = groupActivityFeedTypeMainFragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f96346a) {
            case 0:
                g3 g3Var = (g3) obj;
                g3Var.getClass();
                GroupActivityFeedTypeMainFragment groupActivityFeedTypeMainFragment = this.f96347b;
                if (!groupActivityFeedTypeMainFragment.isAdded()) {
                    return Unit.INSTANCE;
                }
                int i14 = GroupActivityFeedTypeMainFragment.c.f31390a[g3Var.f35300a.ordinal()];
                if (i14 == 1) {
                    g22.e.l(groupActivityFeedTypeMainFragment);
                } else if (i14 == 2) {
                    g22.e.f(groupActivityFeedTypeMainFragment);
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.c(groupActivityFeedTypeMainFragment);
                    g22.e.f(groupActivityFeedTypeMainFragment);
                }
                return Unit.INSTANCE;
            default:
                GroupDTO groupDTO = (GroupDTO) obj;
                groupDTO.getClass();
                androidx.fragment.app.m mVarRequireActivity = this.f96347b.requireActivity();
                Intent intent = new Intent();
                intent.putExtra("GCM_extra_connection_group", groupDTO);
                mVarRequireActivity.setResult(-1, intent);
                mVarRequireActivity.finish();
                return Unit.INSTANCE;
        }
    }
}

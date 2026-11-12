package mm0;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.GroupNotJoinedFragment;
import ew1.h1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupNotJoinedFragment f119581b;

    public /* synthetic */ s(GroupNotJoinedFragment groupNotJoinedFragment, int i14) {
        this.f119580a = i14;
        this.f119581b = groupNotJoinedFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f119580a;
        GroupNotJoinedFragment groupNotJoinedFragment = this.f119581b;
        switch (i14) {
            case 0:
                int i15 = GroupNotJoinedFragment.Y;
                groupNotJoinedFragment.X6();
                break;
            case 1:
                int i16 = GroupNotJoinedFragment.Y;
                Context contextRequireContext = groupNotJoinedFragment.requireContext();
                contextRequireContext.getClass();
                int i17 = 0;
                new androidx.appcompat.app.e.a(contextRequireContext).setTitle(R.string.lbl_approval_required).setPositiveButton(R.string.lbl_request, new h1(new t(groupNotJoinedFragment, i17), 20)).setNegativeButton(R.string.lbl_cancel, new jm0.c(i17)).setMessage(R.string.msg_group_join_request_approval_required).show();
                break;
            case 2:
                int i18 = GroupNotJoinedFragment.Y;
                y yVar = new y();
                yVar.f119596a = new v(groupNotJoinedFragment);
                yVar.show(groupNotJoinedFragment.getParentFragmentManager(), "GroupNotJoinedFragment");
                break;
            case 3:
                int i19 = GroupNotJoinedFragment.Y;
                groupNotJoinedFragment.X6();
                break;
            default:
                int i24 = GroupNotJoinedFragment.Y;
                androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new f(groupNotJoinedFragment.K6(), null), 3);
                n0 viewLifecycleOwner = groupNotJoinedFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                dh.b.L(jVarA, viewLifecycleOwner, new GroupNotJoinedFragment.d(new u(groupNotJoinedFragment, 1)));
                break;
        }
    }
}

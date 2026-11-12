package mm0;

import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.group.details.GroupNotJoinedFragment;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupNotJoinedFragment f119583b;

    public /* synthetic */ t(GroupNotJoinedFragment groupNotJoinedFragment, int i14) {
        this.f119582a = i14;
        this.f119583b = groupNotJoinedFragment;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f119582a;
        int i15 = 10;
        GroupNotJoinedFragment groupNotJoinedFragment = this.f119583b;
        switch (i14) {
            case 0:
                int i16 = GroupNotJoinedFragment.Y;
                androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new o(groupNotJoinedFragment.K6(), null), 3);
                n0 viewLifecycleOwner = groupNotJoinedFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                dh.b.L(jVarA, viewLifecycleOwner, new iz1.g(groupNotJoinedFragment, i15));
                break;
            default:
                int i17 = GroupNotJoinedFragment.Y;
                androidx.lifecycle.j jVarA2 = androidx.lifecycle.m.a(null, new g(groupNotJoinedFragment.K6(), null), 3);
                n0 viewLifecycleOwner2 = groupNotJoinedFragment.getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                dh.b.L(jVarA2, viewLifecycleOwner2, new iz1.g(groupNotJoinedFragment, i15));
                break;
        }
        return Unit.INSTANCE;
    }
}

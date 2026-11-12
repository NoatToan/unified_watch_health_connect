package mm0;

import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.GroupNotJoinedFragment;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import p005kotlin.Unit;
import r22.q0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupNotJoinedFragment f119585b;

    public /* synthetic */ u(GroupNotJoinedFragment groupNotJoinedFragment, int i14) {
        this.f119584a = i14;
        this.f119585b = groupNotJoinedFragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f119584a;
        GroupNotJoinedFragment groupNotJoinedFragment = this.f119585b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = GroupNotJoinedFragment.Y;
                g3Var.getClass();
                int i16 = GroupNotJoinedFragment.b.f36167a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.l(groupNotJoinedFragment);
                } else if (i16 == 2) {
                    groupNotJoinedFragment.V6();
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(groupNotJoinedFragment);
                    g22.e.c(groupNotJoinedFragment);
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "joined group failed, exception: ");
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.p(a2Var, "GroupNotJoinedFragment", strD);
                }
                return Unit.INSTANCE;
            case 1:
                int i17 = GroupNotJoinedFragment.Y;
                g3Var.getClass();
                int i18 = GroupNotJoinedFragment.b.f36167a[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    g22.e.l(groupNotJoinedFragment);
                } else if (i18 == 2) {
                    if (!p005kotlin.jvm.internal.s.g(g3Var.f35301b, Boolean.TRUE)) {
                        g22.e.c(groupNotJoinedFragment);
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.p(a2Var2, "GroupNotJoinedFragment", "Accept group invitation failed, Server response False");
                    }
                    groupNotJoinedFragment.V6();
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(groupNotJoinedFragment);
                    g22.e.c(groupNotJoinedFragment);
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "Accept group invitation failed, exception: ");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.p(a2Var3, "GroupNotJoinedFragment", strD2);
                }
                return Unit.INSTANCE;
            default:
                int i19 = GroupNotJoinedFragment.Y;
                g3Var.getClass();
                int i24 = GroupNotJoinedFragment.b.f36167a[g3Var.f35300a.ordinal()];
                if (i24 != 1) {
                    if (i24 == 2) {
                        groupNotJoinedFragment.requireActivity().setResult(-1);
                        NavHostFragment.f10124e.getClass();
                        NavHostFragment.a.a(groupNotJoinedFragment).g(R.id.action_to_groupDeatilFragment, null);
                        q0.b bVar = q0.f149800b;
                        View viewRequireView = groupNotJoinedFragment.requireView();
                        viewRequireView.getClass();
                        bVar.getClass();
                        q0.b.a(viewRequireView, R.string.social_group_group_joined_message, 0).show();
                        g22.e.f(groupNotJoinedFragment);
                    } else {
                        if (i24 != 3) {
                            u0.r();
                            return null;
                        }
                        g22.e.f(groupNotJoinedFragment);
                        g22.e.c(groupNotJoinedFragment);
                        String strD3 = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "fetched group details failed, exception: ");
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.p(a2Var4, "GroupNotJoinedFragment", strD3);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}

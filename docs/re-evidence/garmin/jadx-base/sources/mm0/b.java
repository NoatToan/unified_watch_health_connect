package mm0;

import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupNotFoundException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupPrivacyException;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.i2;
import lc.j0;
import lc.m0;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailActivity f119498b;

    public /* synthetic */ b(GroupDetailActivity groupDetailActivity, int i14) {
        this.f119497a = i14;
        this.f119498b = groupDetailActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f119497a;
        GroupDetailActivity groupDetailActivity = this.f119498b;
        int i15 = 1;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj;
                GroupDetailActivity.a aVar = GroupDetailActivity.f36137j;
                g3Var.getClass();
                int i16 = GroupDetailActivity.c.f36152a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    groupDetailActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    Intent intent = new Intent();
                    intent.putExtra("Leave Group", true);
                    groupDetailActivity.setResult(-1, intent);
                    groupDetailActivity.finish();
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    groupDetailActivity.hideProgressOverlay();
                    String string = groupDetailActivity.getString(R.string.msg_leave_group_failed);
                    if (g22.n.d(string)) {
                        new androidx.appcompat.app.e.a(groupDetailActivity).setMessage(string).setNeutralButton(R.string.lbl_ok, new jm0.c(27)).show();
                    }
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(g3Var.f35303d, "leave group failed, exception: ");
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.p(a2Var, "GroupDetailsActivity", strD);
                }
                return Unit.INSTANCE;
            case 1:
                g3 g3Var2 = (g3) obj;
                GroupDetailActivity.a aVar3 = GroupDetailActivity.f36137j;
                g3Var2.getClass();
                int i17 = GroupDetailActivity.c.f36152a[g3Var2.f35300a.ordinal()];
                if (i17 == 1) {
                    groupDetailActivity.showProgressOverlay();
                } else if (i17 == 2) {
                    groupDetailActivity.hideProgressOverlay();
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var2, "GroupDetailsActivity", "delete group succeeded. Finish activity.");
                    groupDetailActivity.setResult(-1);
                    groupDetailActivity.finish();
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    groupDetailActivity.hideProgressOverlay();
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(g3Var2.f35303d, "delete group failed, exception: ");
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.p(a2Var3, "GroupDetailsActivity", strD2);
                }
                return Unit.INSTANCE;
            case 2:
                GroupDetailActivity.a aVar6 = GroupDetailActivity.f36137j;
                new androidx.appcompat.app.e.a(groupDetailActivity).setTitle(R.string.msg_group_settings_updated_title).setMessage(R.string.msg_group_privacy_auto_invite_only).setPositiveButton(R.string.lbl_ok, new jm0.c(26)).show();
                return Unit.INSTANCE;
            default:
                g3 g3Var3 = (g3) obj;
                GroupDetailActivity.a aVar7 = GroupDetailActivity.f36137j;
                int i18 = GroupDetailActivity.c.f36152a[g3Var3.f35300a.ordinal()];
                if (i18 == 1) {
                    groupDetailActivity.showProgressOverlay();
                } else if (i18 == 2) {
                    groupDetailActivity.hideProgressOverlay();
                    GroupDetailsDTO groupDetailsDTO = (GroupDetailsDTO) g3Var3.f35301b;
                    if (groupDetailsDTO != null) {
                        groupDetailActivity.f36143f = groupDetailsDTO.f31567j == GroupDTO.e.HIDDEN;
                        if (!groupDetailActivity.f36140c) {
                            m0 m0VarEa = groupDetailActivity.ea();
                            j0 j0VarB = m0VarEa.e().b(R.navigation.nav_graph_group_details);
                            jm0.e eVar = jm0.e.f99565a;
                            GroupDTO.c cVar = groupDetailsDTO.f31578w;
                            cVar.getClass();
                            eVar.getClass();
                            if (jm0.e.e(cVar)) {
                                j0VarB.p(R.id.groupDetailsFragment);
                            } else {
                                j0VarB.p(R.id.groupNotJoinedFragment);
                            }
                            m0VarEa.t(j0VarB);
                            m0VarEa.a(groupDetailActivity);
                            groupDetailActivity.f36140c = true;
                        }
                        groupDetailActivity.invalidateOptionsMenu();
                        groupDetailActivity.updateActionBarTitle(groupDetailActivity.da(groupDetailActivity.ea().f111904b.j(), null));
                        if (groupDetailActivity.f36141d) {
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var4 = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.b(a2Var4, "GroupDetailsActivity", "checkGroupAnnouncement announcement");
                            GroupDetailsDTO groupDetailsDTO2 = groupDetailActivity.fa().f119507c;
                            GroupAnnouncementDTO groupAnnouncementDTO = groupDetailsDTO2 != null ? groupDetailsDTO2.f31579x : null;
                            if ((groupAnnouncementDTO != null ? groupAnnouncementDTO.f31502a : null) == null) {
                                new androidx.appcompat.app.e.a(groupDetailActivity).setTitle(groupDetailActivity.getString(R.string.social_group_announcement_removed_title)).setCancelable(false).setMessage(groupDetailActivity.getString(R.string.social_group_announcement_removed_message)).setPositiveButton(R.string.lbl_ok, new f20.i(29)).show();
                            }
                        }
                    }
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    groupDetailActivity.hideProgressOverlay();
                    Exception exc = g3Var3.f35303d;
                    if (exc instanceof GroupNotFoundException) {
                        GroupDetailActivity.b.a aVar9 = GroupDetailActivity.b.a.f36150d;
                        ComposeView composeView = groupDetailActivity.f36142e;
                        if (composeView == null) {
                            p005kotlin.jvm.internal.s.m("errorView");
                            throw null;
                        }
                        composeView.setContent(new z3.e(1527491778, true, new c(aVar9, groupDetailActivity, i15)));
                    } else if (exc instanceof GroupPrivacyException) {
                        GroupDetailActivity.b.C0628b c0628b = GroupDetailActivity.b.C0628b.f36151d;
                        ComposeView composeView2 = groupDetailActivity.f36142e;
                        if (composeView2 == null) {
                            p005kotlin.jvm.internal.s.m("errorView");
                            throw null;
                        }
                        composeView2.setContent(new z3.e(1527491778, true, new c(c0628b, groupDetailActivity, i15)));
                    } else {
                        groupDetailActivity.finish();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}

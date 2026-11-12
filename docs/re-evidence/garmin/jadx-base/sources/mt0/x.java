package mt0;

import android.content.DialogInterface;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class x extends p005kotlin.jvm.internal.q implements e23.p<Integer, t, Unit> {
    public x(Object obj) {
        super(2, obj, com.garmin.android.apps.connectmobile.leaderboard.challenges.g.class, "updateConnectionChecked", "updateConnectionChecked(ILcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeManagePlayerData;)V", 0);
    }

    @Override // e23.p
    public final Unit invoke(Integer num, t tVar) {
        int iIntValue = num.intValue();
        t tVar2 = tVar;
        tVar2.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.g) this.receiver;
        int i14 = gVar.f37534f;
        u uVar = gVar.f37543o;
        if (uVar == null) {
            p005kotlin.jvm.internal.s.m("adapter");
            throw null;
        }
        if (uVar.A().size() + i14 < 2000) {
            v vVar = gVar.v6().f206943n;
            vVar.f120889a.set(iIntValue, tVar2);
            vVar.f120890b = true;
            u uVar2 = gVar.f37543o;
            if (uVar2 == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
            yc.f.e eVar = uVar2.f196614b.f195910h;
            eVar.getClass();
            yc.g3.f195987a.getClass();
            yc.g3.a(3);
            eVar.f195738c.a();
            boolean zA6 = gVar.A6();
            if (gVar.f37537i) {
                AppCompatButton appCompatButton = gVar.f37538j;
                if (appCompatButton == null) {
                    p005kotlin.jvm.internal.s.m("inviteButton");
                    throw null;
                }
                appCompatButton.setEnabled(zA6);
            } else {
                MenuItem menuItem = gVar.f37539k;
                if (menuItem != null) {
                    menuItem.setEnabled(zA6);
                }
            }
        } else if (gVar.getActivity() != null) {
            new androidx.appcompat.app.e.a(gVar.requireActivity()).setCancelable(true).setTitle(R.string.lbl_invitation_limit_reached_title).setMessage(R.string.msg_friends_invitation_limit_reached).setPositiveButton(R.string.lbl_close, (DialogInterface.OnClickListener) null).create().show();
        }
        return Unit.INSTANCE;
    }
}

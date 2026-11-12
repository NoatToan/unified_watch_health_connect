package sg0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import com.garmin.android.apps.connectmobile.view.privacy.PrivacySelectionActivity;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageFamilyActivity f159152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f159153c;

    public /* synthetic */ s0(ManageFamilyActivity manageFamilyActivity, Context context, int i14) {
        this.f159151a = i14;
        this.f159152b = manageFamilyActivity;
        this.f159153c = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f159151a;
        Context context = this.f159153c;
        ManageFamilyActivity manageFamilyActivity = this.f159152b;
        switch (i14) {
            case 0:
                ue0.l lVar = (ue0.l) obj;
                ManageFamilyActivity.a aVar = ManageFamilyActivity.f35178j;
                lVar.getClass();
                manageFamilyActivity.f35187i.a(manageFamilyActivity.f35181c.a(context, lVar), null);
                break;
            case 1:
                ue0.l lVar2 = (ue0.l) obj;
                ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                lVar2.getClass();
                Long userId = lVar2.getUserId();
                if (userId != null) {
                    hl.a.b bVar = new hl.a.b(userId.longValue(), lVar2.getFullName(), lVar2.A1(), null, 8, null);
                    AuthorizedViewersActivity.f34974m.getClass();
                    context.getClass();
                    Intent intent = new Intent(context, (Class<?>) AuthorizedViewersActivity.class);
                    intent.putExtra("GCM_extra_screen_access_role", bVar);
                    manageFamilyActivity.startActivity(intent);
                }
                break;
            case 2:
                ue0.l lVar3 = (ue0.l) obj;
                ManageFamilyActivity.a aVar3 = ManageFamilyActivity.f35178j;
                lVar3.getClass();
                manageFamilyActivity.startActivity(manageFamilyActivity.f35181c.f(context, lVar3));
                break;
            case 3:
                PrivacyType privacyType = (PrivacyType) obj;
                ManageFamilyActivity.a aVar4 = ManageFamilyActivity.f35178j;
                privacyType.getClass();
                f.c<Intent> cVar = manageFamilyActivity.f35183e;
                PrivacySelectionActivity.a aVar5 = PrivacySelectionActivity.f47684c;
                String string = manageFamilyActivity.getString(R.string.lbl_profile);
                string.getClass();
                PrivacyType.INSTANCE.getClass();
                List listC = p13.w.c(PrivacyType.ONLY_ME);
                aVar5.getClass();
                cVar.a(PrivacySelectionActivity.a.a(context, string, "_You choose who can see the details of your Garmin Connect profile. However, your display name, profile picture and any activities you mark ‘public’ will always be visible to everyone.", privacyType, listC), null);
                break;
            case 4:
                PrivacyType privacyType2 = (PrivacyType) obj;
                ManageFamilyActivity.a aVar6 = ManageFamilyActivity.f35178j;
                privacyType2.getClass();
                f.c<Intent> cVar2 = manageFamilyActivity.f35184f;
                PrivacySelectionActivity.a aVar7 = PrivacySelectionActivity.f47684c;
                String string2 = manageFamilyActivity.getString(R.string.concept_steps);
                string2.getClass();
                PrivacyType.INSTANCE.getClass();
                List listC2 = p13.w.c(PrivacyType.ONLY_ME);
                aVar7.getClass();
                cVar2.a(PrivacySelectionActivity.a.a(context, string2, "_Select a privacy level for your steps. Your selection will impact their visibility in leaderboards and group challenges.", privacyType2, listC2), null);
                break;
            default:
                PrivacyType privacyType3 = (PrivacyType) obj;
                ManageFamilyActivity.a aVar8 = ManageFamilyActivity.f35178j;
                privacyType3.getClass();
                f.c<Intent> cVar3 = manageFamilyActivity.f35185g;
                PrivacySelectionActivity.a aVar9 = PrivacySelectionActivity.f47684c;
                String string3 = manageFamilyActivity.getString(R.string.concept_badges);
                string3.getClass();
                PrivacyType.INSTANCE.getClass();
                List listC3 = p13.w.c(PrivacyType.ONLY_ME);
                aVar9.getClass();
                cVar3.a(PrivacySelectionActivity.a.a(context, string3, null, privacyType3, listC3), null);
                break;
        }
        return Unit.INSTANCE;
    }
}

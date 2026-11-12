package do1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.LegacyCommentsAndLikesActivity;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import zo0.a0;
import zo0.x;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60604a;

    public /* synthetic */ l(int i14) {
        this.f60604a = i14;
    }

    private final void a(View view2) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f60604a) {
            case 0:
                com.garmin.android.apps.connectmobile.social.b.a aVar = com.garmin.android.apps.connectmobile.social.b.T0;
                if (view2 != null) {
                    Object tag = view2.getTag();
                    tag.getClass();
                    ConversationCommentDTO conversationCommentDTO = ((com.garmin.android.apps.connectmobile.social.d.a) tag).f44575k;
                    if (conversationCommentDTO != null) {
                        LegacyCommentsAndLikesActivity.a aVar2 = LegacyCommentsAndLikesActivity.f44483f;
                        Context context = view2.getContext();
                        context.getClass();
                        String str = conversationCommentDTO.f44546a;
                        aVar2.getClass();
                        Intent intent = new Intent(context, (Class<?>) LegacyCommentsAndLikesActivity.class);
                        intent.putExtra("GCM_conversation_comment_id", str);
                        intent.setAction("GCM_action_view_comment_likes");
                        context.startActivity(intent);
                    }
                }
                break;
            case 1:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.f40794v;
                break;
            case 2:
                break;
            case 3:
                int i14 = zo0.u.f206196c;
                a2 a2Var = a2.TRAINING_INITIATIVE;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "OnboardingRaceEventSearchDialogHandler", "showRaceEventSearchDialog: negative button clicked, dismissing dialog");
                break;
            case 4:
                int i15 = zo0.v.f206199b;
                a2 a2Var2 = a2.SAFETY_FEATURES;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "OnboardingSafetyFeaturesDialogHandler", "showSafetyFeaturesDayOneDialog: negative button clicked, dismissing dialog");
                break;
            case 5:
                int i16 = x.f206203c;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var3, "OnboardingWeatherDialogHandler", "showWeatherLocationFollowUpDialog: positive button clicked, dismissing dialog");
                break;
            default:
                int i17 = a0.f206082d;
                break;
        }
    }
}

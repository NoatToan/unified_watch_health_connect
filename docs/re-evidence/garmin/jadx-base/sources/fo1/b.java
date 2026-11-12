package fo1;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.feed.activity.exception.DeletedActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.PrivateActivityException;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationActivity f72467b;

    public /* synthetic */ b(ConversationActivity conversationActivity, int i14) {
        this.f72466a = i14;
        this.f72467b = conversationActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f72466a;
        int i15 = 1;
        ConversationActivity conversationActivity = this.f72467b;
        switch (i14) {
            case 0:
                ConversationActivity.a aVar = ConversationActivity.f44530c;
                if (((Boolean) obj).booleanValue()) {
                    conversationActivity.displayErrorBannerNoInternetConnection();
                }
                return Unit.INSTANCE;
            case 1:
                g3 g3Var = (g3) obj;
                ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                g3Var.getClass();
                int i16 = ConversationActivity.c.f44540a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    conversationActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    conversationActivity.hideProgressOverlay();
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) g3Var.f35301b;
                    if (hVar != null) {
                        conversationActivity.ca().f72659f = hVar;
                        conversationActivity.ca().f72660g = hVar.f29451d == ((long) ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                        go1.y.D.getClass();
                        go1.y yVar = new go1.y();
                        androidx.fragment.app.v supportFragmentManager = conversationActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                        aVarB.j(R.id.conversation_content, yVar, null, 1);
                        aVarB.e();
                    } else {
                        String strN = fb1.c.n("Fetch legacy activity failed, activity id: ", conversationActivity.getIntent().getStringExtra("GCM_conversation_resource_id"));
                        i2.a aVar3 = i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "ConversationActivity", strN);
                        conversationActivity.finish();
                    }
                } else {
                    if (i16 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    conversationActivity.hideProgressOverlay();
                    Exception exc = g3Var.f35303d;
                    if ((exc instanceof PrivateActivityException) || (exc instanceof DeletedActivityException)) {
                        ConversationActivity.f44530c.getClass();
                        Intent intent = new Intent(conversationActivity, (Class<?>) ConversationActivity.class);
                        intent.setAction("action_view_comments_but_activity_not_available");
                        intent.putExtra("GCM_conversation_activity_not_available_reason", exc);
                        conversationActivity.startActivity(intent);
                    } else {
                        conversationActivity.da(exc);
                    }
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var2 = (g3) obj;
                ConversationActivity.a aVar4 = ConversationActivity.f44530c;
                g3Var2.getClass();
                Exception exc2 = g3Var2.f35303d;
                int i17 = ConversationActivity.c.f44540a[g3Var2.f35300a.ordinal()];
                if (i17 == 1) {
                    conversationActivity.showProgressOverlay();
                } else if (i17 == 2) {
                    conversationActivity.hideProgressOverlay();
                    wg0.a aVar5 = (wg0.a) g3Var2.f35301b;
                    if (aVar5 != null) {
                        conversationActivity.ca().f72659f = aVar5;
                        conversationActivity.ca().f72660g = aVar5.j();
                        go1.y.D.getClass();
                        go1.y yVar2 = new go1.y();
                        androidx.fragment.app.v supportFragmentManager2 = conversationActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                        aVarB2.j(R.id.conversation_content, yVar2, null, 1);
                        aVarB2.e();
                    } else {
                        String strN2 = fb1.c.n("Fetch activity failed, activity id: ", conversationActivity.getIntent().getStringExtra("GCM_conversation_resource_id"));
                        i2.a aVar6 = i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar6.getClass();
                        i2.a.f(a2Var2, "ConversationActivity", strN2);
                        conversationActivity.finish();
                    }
                } else {
                    if (i17 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    if (exc2 instanceof DeletedActivityException) {
                        dh.b.L(conversationActivity.ca().G4(), conversationActivity, new ConversationActivity.d(new b(conversationActivity, i15)));
                    } else {
                        conversationActivity.hideProgressOverlay();
                        conversationActivity.da(exc2);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}

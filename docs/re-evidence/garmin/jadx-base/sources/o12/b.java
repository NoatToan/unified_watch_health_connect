package o12;

import android.content.Intent;
import b.s;
import com.garmin.android.apps.connectmobile.userprofile.model.o;
import com.garmin.android.apps.connectmobile.userprofile.model.r;
import com.garmin.android.apps.connectmobile.userprofile.presentation.EditProfileActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.TaggingPrivacyActivity;
import e23.l;
import java.util.Arrays;
import m12.q;
import m12.t;
import o13.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProfileActivity f128535b;

    public /* synthetic */ b(EditProfileActivity editProfileActivity, int i14) {
        this.f128534a = i14;
        this.f128535b = editProfileActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43 */
    @Override // e23.l
    public final Object invoke(Object obj) {
        nj1.e eVar;
        r rVar;
        int i14 = this.f128534a;
        EditProfileActivity editProfileActivity = this.f128535b;
        switch (i14) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                EditProfileActivity.a aVar = EditProfileActivity.f46981h;
                if (zBooleanValue) {
                    editProfileActivity.setResult(-1, new Intent());
                }
                editProfileActivity.finish();
                return Unit.INSTANCE;
            case 1:
                return EditProfileActivity.da(editProfileActivity, (s) obj);
            default:
                com.garmin.android.apps.connectmobile.userprofile.presentation.f fVar = (com.garmin.android.apps.connectmobile.userprofile.presentation.f) obj;
                EditProfileActivity.a aVar2 = EditProfileActivity.f46981h;
                fVar.getClass();
                t f47071a = fVar.getF47071a();
                m12.r rVar2 = editProfileActivity.f46984c;
                switch (EditProfileActivity.b.f46989a[f47071a.ordinal()]) {
                    case 1:
                        if (!editProfileActivity.f46985d) {
                            f.c<Intent> cVar = editProfileActivity.f46986e;
                            ActivitiesPrivacySelectionActivity.a aVar3 = ActivitiesPrivacySelectionActivity.f47091b;
                            q qVar = (q) editProfileActivity.ea().f47032p.f150540a.getValue();
                            nj1.b activityPrivacySettings = (qVar == null || (eVar = qVar.f115857c) == null) ? null : eVar.getActivityPrivacySettings();
                            hl.a.c cVar2 = hl.a.c.f84256b;
                            aVar3.getClass();
                            cVar2.getClass();
                            Intent intent = new Intent(editProfileActivity, (Class<?>) ActivitiesPrivacySelectionActivity.class);
                            intent.putExtra("GCM_extra_privacy_type", activityPrivacySettings);
                            intent.putExtra("GCM_extra_screen_access_role", cVar2);
                            cVar.a(intent, null);
                        } else {
                            ht.a.f85464a.getClass();
                            ht.a.a(null, "ChildActivitiesPrivacyTapped");
                        }
                        break;
                    case 2:
                        editProfileActivity.startActivity(rVar2.f(editProfileActivity));
                        break;
                    case 3:
                        editProfileActivity.startActivity(rVar2.F(editProfileActivity));
                        break;
                    case 4:
                        editProfileActivity.startActivity(rVar2.a(editProfileActivity));
                        break;
                    case 5:
                        rVar2.p(editProfileActivity);
                        break;
                    case 6:
                        rVar2.z(editProfileActivity);
                        break;
                    case 7:
                        rVar2.y(editProfileActivity);
                        break;
                    case 8:
                        editProfileActivity.startActivity(rVar2.D(editProfileActivity));
                        break;
                    case 9:
                        FollowerRequestsPrivacyActivity.a aVar4 = FollowerRequestsPrivacyActivity.f47109c;
                        q qVar2 = (q) editProfileActivity.ea().f47032p.f150540a.getValue();
                        Boolean boolValueOf = qVar2 != null ? Boolean.valueOf(qVar2.f115858d) : null;
                        ?? BooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : 1;
                        aVar4.getClass();
                        Intent intent2 = new Intent(editProfileActivity, (Class<?>) FollowerRequestsPrivacyActivity.class);
                        intent2.putExtras(h7.c.a((p[]) Arrays.copyOf(new p[]{new p("require_review_requests", Integer.valueOf((int) BooleanValue))}, 1)));
                        editProfileActivity.f46988g.a(intent2, null);
                        break;
                    case 10:
                        TaggingPrivacyActivity.a aVar5 = TaggingPrivacyActivity.f47117a;
                        q qVar3 = (q) editProfileActivity.ea().f47032p.f150540a.getValue();
                        o oVarY = (qVar3 == null || (rVar = qVar3.f115856b) == null) ? null : rVar.y();
                        if (oVarY == null) {
                            oVarY = o.NONE;
                        }
                        aVar5.getClass();
                        oVarY.getClass();
                        Intent intent3 = new Intent(editProfileActivity, (Class<?>) TaggingPrivacyActivity.class);
                        intent3.putExtras(h7.c.a(new p("tagPermission", oVarY.f46938a)));
                        editProfileActivity.f46987f.a(intent3, null);
                        break;
                    default:
                        editProfileActivity.ea().x4(fVar);
                        break;
                }
                return Unit.INSTANCE;
        }
    }
}

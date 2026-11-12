package uu;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$getCompareBadges$1", f = "BadgesViewModel.kt", l = {67, 73}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.l f172764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f172765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f172766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f172767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.l>> f172768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f172769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f172770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.l>> y0Var, q qVar, String str, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f172768e = y0Var;
        this.f172769f = qVar;
        this.f172770g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f172768e, this.f172769f, this.f172770g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        com.garmin.android.apps.connectmobile.badges.service.model.l lVar;
        Integer num2;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar2;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar3;
        com.garmin.android.apps.connectmobile.badges.service.model.v userProfile;
        com.garmin.android.apps.connectmobile.badges.service.model.v vVarB;
        com.garmin.android.apps.connectmobile.badges.service.model.v connectionProfile;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        String str2;
        String str3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172767d;
        q qVar = this.f172769f;
        y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.l>> y0Var = this.f172768e;
        com.garmin.android.apps.connectmobile.badges.service.model.v vVarB2 = null;
        str = null;
        String str4 = null;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            zu.g gVar = qVar.f172738c;
            this.f172767d = 1;
            obj = gVar.a(this.f172770g, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num2 = this.f172766c;
            num = this.f172765b;
            lVar = this.f172764a;
            o13.r.b(obj);
        }
        Map map = (Map) obj;
        lVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num);
        lVar3 = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(num2);
        userProfile = lVar.getUserProfile();
        if (userProfile != null) {
            if (lVar2 != null || (profileImageUrls4 = lVar2.getProfileImageUrls()) == null) {
                str2 = null;
            } else {
                str2 = profileImageUrls4.f46878g;
            }
            if (lVar2 != null || (profileImageUrls3 = lVar2.getProfileImageUrls()) == null) {
                str3 = null;
            } else {
                str3 = profileImageUrls3.f46877f;
            }
            vVarB = com.garmin.android.apps.connectmobile.badges.service.model.v.b(userProfile, str2, str3);
        } else {
            vVarB = null;
        }
        connectionProfile = lVar.getConnectionProfile();
        if (connectionProfile != null) {
            if (lVar3 != null || (profileImageUrls2 = lVar3.getProfileImageUrls()) == null) {
                str = null;
            } else {
                str = profileImageUrls2.f46878g;
            }
            if (lVar3 != null && (profileImageUrls = lVar3.getProfileImageUrls()) != null) {
                str4 = profileImageUrls.f46877f;
            }
            vVarB2 = com.garmin.android.apps.connectmobile.badges.service.model.v.b(connectionProfile, str, str4);
        }
        com.garmin.android.apps.connectmobile.badges.service.model.l lVar4 = new com.garmin.android.apps.connectmobile.badges.service.model.l(vVarB, vVarB2);
        g3.f35298f.getClass();
        y0Var.j(g3.a.d(lVar4));
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.badges.service.model.l lVar5 = (com.garmin.android.apps.connectmobile.badges.service.model.l) ((v2.b) v2Var).f47386a;
            com.garmin.android.apps.connectmobile.badges.service.model.v userProfile2 = lVar5.getUserProfile();
            num = userProfile2 != null ? new Integer(userProfile2.getUserProfileId()) : null;
            com.garmin.android.apps.connectmobile.badges.service.model.v connectionProfile2 = lVar5.getConnectionProfile();
            Integer num3 = connectionProfile2 != null ? new Integer(connectionProfile2.getUserProfileId()) : null;
            List<String> listK = p13.x.k(String.valueOf(num), String.valueOf(num3));
            a22.i iVar = qVar.f172743h;
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK2 = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
            this.f172764a = lVar5;
            this.f172765b = num;
            this.f172766c = num3;
            this.f172767d = 2;
            Object objA = iVar.a(listK, listK2, this);
            if (objA != aVar) {
                lVar = lVar5;
                obj = objA;
                num2 = num3;
                Map map2 = (Map) obj;
                lVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.l) map2.get(num);
                lVar3 = (com.garmin.android.apps.connectmobile.userprofile.model.l) map2.get(num2);
                userProfile = lVar.getUserProfile();
                if (userProfile != null) {
                    if (lVar2 != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    if (lVar2 != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    vVarB = com.garmin.android.apps.connectmobile.badges.service.model.v.b(userProfile, str2, str3);
                } else {
                    vVarB = null;
                }
                connectionProfile = lVar.getConnectionProfile();
                if (connectionProfile != null) {
                    if (lVar3 != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (lVar3 != null) {
                        str4 = profileImageUrls.f46877f;
                    }
                    vVarB2 = com.garmin.android.apps.connectmobile.badges.service.model.v.b(connectionProfile, str, str4);
                }
                com.garmin.android.apps.connectmobile.badges.service.model.l lVar6 = new com.garmin.android.apps.connectmobile.badges.service.model.l(vVarB, vVarB2);
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(lVar6));
            }
            return aVar;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        y0Var.j(g3.a.a(g3.f35298f, aVar2.f47383a.toString(), aVar2.f47383a, null, aVar2.f47384b, 4));
        return Unit.INSTANCE;
    }
}

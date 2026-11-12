package qo1;

import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.m;
import com.google.gson.Gson;
import f12.l;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o53.s0;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lqo1/c;", "Lcom/garmin/android/apps/connectmobile/f0;", "Leo1/a;", "socialProfileApi", "Lf12/l;", "userSettingsPrefs", "Loo1/a;", "currentUserProfileImageUpdater", "<init>", "(Leo1/a;Lf12/l;Loo1/a;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f145960d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo1.a f145961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f145962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oo1.a f145963c;

    public c(eo1.a aVar, l lVar, oo1.a aVar2) {
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        this.f145961a = aVar;
        this.f145962b = lVar;
        this.f145963c = aVar2;
    }

    public static final void a(c cVar, m mVar) {
        Set<String> setG1;
        l lVar = cVar.f145962b;
        try {
            String json = new Gson().toJson(mVar);
            qd2.a aVarB = qd2.a.b();
            if (aVarB != null) {
                aVarB.g(qd2.a.b.SOCIAL_PROFILE, json);
            }
        } catch (Exception e4) {
            a2 a2Var = a2.USER;
            String strH = f3.h(e4, "cacheSocialProfile: caching failed with exception=[", "]");
            i2.f36769a.getClass();
            i2.a.p(a2Var, "SocialProfileRepo", strH);
        }
        String userName = mVar.getUserName();
        if (userName == null) {
            userName = "";
        }
        lVar.j2(userName);
        String str = mVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String();
        if (str == null) {
            str = "";
        }
        lVar.p1(str);
        Boolean nameApproved = mVar.getNameApproved();
        lVar.J1(nameApproved != null ? nameApproved.booleanValue() : false);
        Long profileId = mVar.getProfileId();
        if (profileId != null) {
            lVar.U(profileId.longValue());
        }
        String displayName = mVar.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        lVar.W3(displayName);
        String userProfileFullName = mVar.getUserProfileFullName();
        lVar.X2(userProfileFullName != null ? userProfileFullName : "");
        cVar.f145963c.a(mVar.getProfileImageUrls());
        List<String> listY = mVar.y();
        if (listY == null || (setG1 = h0.g1(h0.Z(listY))) == null) {
            setG1 = l0.f134950a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!setG1.contains("ROLE_PARTIALLY_SUSPENDED")) {
            linkedHashSet.add("ROLE_PARTIALLY_SUSPENDED");
            lVar.A0();
        }
        lVar.G3(setG1, linkedHashSet);
        s3.f23252a.getClass();
        boolean zA = s3.a("ROLE_MBTESTER");
        a2 a2Var2 = a2.USER;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("SocialProfileRepo updateFirebasePropertyValues is_mbtester[", "]", zA);
        i2.f36769a.getClass();
        i2.a.a(a2Var2, strG);
        ht.a aVar = ht.a.f85464a;
        String str2 = zA ? BooleanUtils.TRUE : BooleanUtils.FALSE;
        aVar.getClass();
        ht.a.c("is_mbtester", str2);
        Long userLevel = mVar.getUserLevel();
        lVar.m1(userLevel != null ? (int) userLevel.longValue() : 0);
        Long userPoint = mVar.getUserPoint();
        lVar.x4(userPoint != null ? (int) userPoint.longValue() : 0);
    }

    public static Object b(c cVar, v13.c cVar2) {
        w13.c cVar3 = k.f46891k;
        cVar.getClass();
        x53.c cVar4 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new e(false, cVar, cVar3, null), cVar2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lqo1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FIREBASE_USER_PROPERTY_MBTESTER", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a() {
            return (c) KoinJavaComponent.get$default(c.class, null, null, 6, null);
        }

        private a() {
        }
    }
}

package qm0;

import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import java.util.List;
import java.util.Map;
import o53.s0;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.GroupFeedFrameFragment$initCreateButton$1", f = "GroupFeedFrameFragment.kt", l = {89, 90}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f145603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserLevelImageView f145604c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.GroupFeedFrameFragment$initCreateButton$1$1", f = "GroupFeedFrameFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserLevelImageView f145605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> f145606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f145607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserLevelImageView userLevelImageView, Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f145605a = userLevelImageView;
            this.f145606b = map;
            this.f145607c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f145605a, this.f145606b, this.f145607c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(this.f145607c, this.f145606b);
            String str = (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46878g;
            f12.l.f68084a.getClass();
            this.f145605a.setProfileImageData(new b12.b(str, null, f12.u.a(f12.l.a.a().j()), null, null, 26, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(UserLevelImageView userLevelImageView, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f145604c = userLevelImageView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f145604c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (ge1.b.e0(r3, r5, r7) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int userProfilePk;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145603b;
        if (i14 != 0) {
            if (i14 == 1) {
                userProfilePk = this.f145602a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        a22.i iVar = (a22.i) KoinJavaComponent.get$default(a22.i.class, null, null, 6, null);
        userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        List<String> listC = p13.w.c(String.valueOf(userProfilePk));
        List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC2 = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE);
        this.f145602a = userProfilePk;
        this.f145603b = 1;
        obj = iVar.a(listC, listC2, this);
        if (obj != aVar) {
        }
        return aVar;
        x53.c cVar = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        a aVar2 = new a(this.f145604c, (Map) obj, userProfilePk, null);
        this.f145602a = userProfilePk;
        this.f145603b = 2;
    }
}

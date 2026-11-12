package v12;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.e2;
import r53.g2;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv12/i;", "Lv12/c;", "Lip/a;", "activityPrivacy", "Lhl/a;", "screenAccessRole", "", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyTypes", "<init>", "(Lip/a;Lhl/a;Ljava/util/List;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip.a f174740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f174741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f174742c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.PrivacySelectionSinglePastActivityViewModel$onUserEvent$1", f = "PrivacySelectionSinglePastActivityViewModel.kt", l = {39, 42, 49}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f174744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f174745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174744b = wVar;
            this.f174745c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174744b, this.f174745c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174743a;
            if (i14 == 0) {
                o13.r.b(obj);
                w wVar = this.f174744b;
                boolean z14 = wVar instanceof w.d;
                i iVar = this.f174745c;
                if (z14) {
                    p2 p2Var = iVar.f174741b;
                    k kVarA = k.a((k) p2Var.getValue(), ((w.d) wVar).f174822a, false, 47);
                    this.f174743a = 1;
                    p2Var.k(null, kVarA);
                } else if (wVar instanceof w.a) {
                    PrivacyType privacyType = ((k) iVar.f174741b.getValue()).f174751e;
                    e2 e2Var = iVar.f174742c;
                    if (privacyType != null) {
                        x.d dVar = new x.d(iVar.f174740a.f94639a, ((k) iVar.f174741b.getValue()).f174751e);
                        this.f174743a = 2;
                    } else {
                        x.a aVar2 = x.a.f174824a;
                        this.f174743a = 3;
                    }
                }
            } else {
                if (i14 != 1 && i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public i(ip.a aVar, hl.a aVar2, List<? extends PrivacyType> list) {
        aVar.getClass();
        aVar2.getClass();
        list.getClass();
        this.f174740a = aVar;
        this.f174741b = q2.a(new k(v12.a.BACK, R.string.unknown, R.string.privacy_update_past_activity_type_description, list, aVar.f94640b, false, 32, null));
        this.f174742c = g2.b(0, 0, null, 7);
    }

    @Override // v12.c
    public final d2<x> x4() {
        return r53.s.c(this.f174742c);
    }

    @Override // v12.c
    public final o2<k> y4() {
        return this.f174741b;
    }

    @Override // v12.c
    public final void z4(w wVar) {
        wVar.getClass();
        ge1.b.T(v1.a(this), null, null, new a(wVar, this, null), 3);
    }
}

package pu;

import android.os.Parcelable;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ca0.o1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import y80.p0;
import z10.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lpu/j0;", "Landroidx/lifecycle/u1;", "Lre2/b$d;", "userSignInType", "Lpu/n;", "postUserAuthenticationCaller", "Ldq1/a;", "ageActionRequestedUseCase", "Lf12/l;", "userSettings", "Lf12/b;", "userAccount", "<init>", "(Lre2/b$d;Lpu/n;Ldq1/a;Lf12/l;Lf12/b;)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f141093h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re2.b.d f141094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f141095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dq1.a f141096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f141097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f12.b f141098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f141099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f141100g;

    public interface b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpu/j0$b$a;", "Lpu/j0$b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f141101a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -771868234;
            }

            public final String toString() {
                return "AccountSuspendUser";
            }
        }

        /* JADX INFO: renamed from: pu.j0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpu/j0$b$b;", "Lpu/j0$b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2649b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2649b f141102a = new C2649b();

            private C2649b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2649b);
            }

            public final int hashCode() {
                return -231692375;
            }

            public final String toString() {
                return "CollectDob";
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpu/j0$b$c;", "Lpu/j0$b;", "Lca0/o1;", "setupFlowType", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "userSettingsDTO", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "socialProfileDTO", "<init>", "(Lca0/o1;Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;Lcom/garmin/android/apps/connectmobile/userprofile/model/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o1 f141103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UserSettingsDTO f141104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.garmin.android.apps.connectmobile.userprofile.model.m f141105c;

            static {
                Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.m> creator = com.garmin.android.apps.connectmobile.userprofile.model.m.CREATOR;
                Parcelable.Creator<UserSettingsDTO> creator2 = UserSettingsDTO.CREATOR;
            }

            public c(o1 o1Var, UserSettingsDTO userSettingsDTO, com.garmin.android.apps.connectmobile.userprofile.model.m mVar) {
                o1Var.getClass();
                userSettingsDTO.getClass();
                mVar.getClass();
                this.f141103a = o1Var;
                this.f141104b = userSettingsDTO;
                this.f141105c = mVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f141103a == cVar.f141103a && this.f141104b.equals(cVar.f141104b) && this.f141105c.equals(cVar.f141105c);
            }

            public final int hashCode() {
                return this.f141105c.hashCode() + ((this.f141104b.hashCode() + (this.f141103a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "DeviceSetup(setupFlowType=" + this.f141103a + ", userSettingsDTO=" + this.f141104b + ", socialProfileDTO=" + this.f141105c + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpu/j0$b$d;", "Lpu/j0$b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f141106a = new d();

            private d() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1086832960;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpu/j0$b$e;", "Lpu/j0$b;", "Lpu/h0;", "signInError", "<init>", "(Lpu/h0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h0 f141107a;

            public e(h0 h0Var) {
                h0Var.getClass();
                this.f141107a = h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f141107a == ((e) obj).f141107a;
            }

            public final int hashCode() {
                return this.f141107a.hashCode();
            }

            public final String toString() {
                return "PostUserAuthenticationError(signInError=" + this.f141107a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpu/j0$b$f;", "Lpu/j0$b;", "Lca0/o1;", "setupFlowType", "Ll90/d;", "qrCodePairingInfo", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "userSettingsDTO", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "socialProfileDTO", "<init>", "(Lca0/o1;Ll90/d;Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;Lcom/garmin/android/apps/connectmobile/userprofile/model/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o1 f141108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l90.d f141109b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final UserSettingsDTO f141110c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.garmin.android.apps.connectmobile.userprofile.model.m f141111d;

            static {
                Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.m> creator = com.garmin.android.apps.connectmobile.userprofile.model.m.CREATOR;
                Parcelable.Creator<UserSettingsDTO> creator2 = UserSettingsDTO.CREATOR;
                Parcelable.Creator<l90.d> creator3 = l90.d.CREATOR;
            }

            public f(o1 o1Var, l90.d dVar, UserSettingsDTO userSettingsDTO, com.garmin.android.apps.connectmobile.userprofile.model.m mVar) {
                o1Var.getClass();
                dVar.getClass();
                userSettingsDTO.getClass();
                mVar.getClass();
                this.f141108a = o1Var;
                this.f141109b = dVar;
                this.f141110c = userSettingsDTO;
                this.f141111d = mVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f141108a == fVar.f141108a && this.f141109b.equals(fVar.f141109b) && this.f141110c.equals(fVar.f141110c) && this.f141111d.equals(fVar.f141111d);
            }

            public final int hashCode() {
                return this.f141111d.hashCode() + ((this.f141110c.hashCode() + ((this.f141109b.hashCode() + (this.f141108a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "QrCodePairing(setupFlowType=" + this.f141108a + ", qrCodePairingInfo=" + this.f141109b + ", userSettingsDTO=" + this.f141110c + ", socialProfileDTO=" + this.f141111d + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpu/j0$b$g;", "Lpu/j0$b;", "", "cmcRequestId", "<init>", "(Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f141112a;

            public g(String str) {
                str.getClass();
                this.f141112a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f141112a.equals(((g) obj).f141112a);
            }

            public final int hashCode() {
                return this.f141112a.hashCode();
            }

            public final String toString() {
                return am.j.m("SetupChildAccount(cmcRequestId=", this.f141112a, ")");
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpu/j0$b$h;", "Lpu/j0$b;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "userSettingsDTO", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "socialProfileDTO", "", "", "checks", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;Lcom/garmin/android/apps/connectmobile/userprofile/model/m;Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UserSettingsDTO f141113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.garmin.android.apps.connectmobile.userprofile.model.m f141114b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List<String> f141115c;

            public h(UserSettingsDTO userSettingsDTO, com.garmin.android.apps.connectmobile.userprofile.model.m mVar, List<String> list) {
                userSettingsDTO.getClass();
                mVar.getClass();
                list.getClass();
                this.f141113a = userSettingsDTO;
                this.f141114b = mVar;
                this.f141115c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f141113a.equals(hVar.f141113a) && this.f141114b.equals(hVar.f141114b) && this.f141115c.equals(hVar.f141115c);
            }

            public final int hashCode() {
                return this.f141115c.hashCode() + ((this.f141114b.hashCode() + (this.f141113a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("StartupChecks(userSettingsDTO=");
                sb3.append(this.f141113a);
                sb3.append(", socialProfileDTO=");
                sb3.append(this.f141114b);
                sb3.append(", checks=");
                return u62.z.c(sb3, this.f141115c, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lpu/j0$b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationViewModel$postAuthenticationScreen$1", f = "PostUserAuthenticationViewModel.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super b>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141116a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return j0.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super b> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141116a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f141116a = 1;
                if (j0.x4(j0.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public j0(re2.b.d dVar, n nVar, dq1.a aVar, f12.l lVar, f12.b bVar) {
        dVar.getClass();
        nVar.getClass();
        aVar.getClass();
        lVar.getClass();
        bVar.getClass();
        this.f141094a = dVar;
        this.f141095b = nVar;
        this.f141096c = aVar;
        this.f141097d = lVar;
        this.f141098e = bVar;
        b.d dVar2 = b.d.f141106a;
        p2 p2VarA = q2.a(dVar2);
        this.f141099f = p2VarA;
        this.f141100g = r53.s.K(new r53.v(new c(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), dVar2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db A[LOOP:0: B:33:0x00db->B:70:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe A[LOOP:1: B:38:0x00fe->B:72:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0161  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x019f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0070, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x019f, please report this as an issue */
    public static final Object x4(j0 j0Var, v13.c cVar) throws Throwable {
        k0 k0Var;
        boolean z14;
        i0 i0Var;
        h0 h0Var;
        Object value;
        UserSettingsDTO userSettingsDTO;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar;
        Logger logger;
        AtomicReference<String> atomicReference;
        String str;
        Object value2;
        List listC;
        Object value3;
        Object value4;
        Object value5;
        re2.b.d dVar = j0Var.f141094a;
        p2 p2Var = j0Var.f141099f;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f141124d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f141124d = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(j0Var, cVar);
            }
        } else {
            k0Var = new k0(j0Var, cVar);
        }
        Object objE0 = k0Var.f141122b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f141124d;
        String str2 = null;
        if (i15 == 0) {
            o13.r.b(objE0);
            k0Var.f141124d = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new l0(j0Var, null), k0Var);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE0);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = k0Var.f141121a;
            o13.r.b(objE0);
        }
        i0Var = (i0) objE0;
        if (i0Var instanceof i0.b) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "PostUserAuthenticationViewModel", "Post user authentication calls successful userSignInType[" + dVar + "].");
            if (dVar == re2.b.d.IT_WEB_CREATE_ACCT) {
                j0Var.f141097d.c2(System.currentTimeMillis());
            }
            oi2.a.C2513a.a(oi2.a.f132270a, new jj0.d());
            fq1.g.a aVar3 = fq1.g.f73241b;
            f12.b bVar = j0Var.f141098e;
            aVar3.getClass();
            fq1.g.a.a(bVar);
            i0.b bVar2 = (i0.b) i0Var;
            userSettingsDTO = bVar2.f141087a;
            mVar = bVar2.f141088b;
            p0.f195200a.getClass();
            logger = p0.f195201b;
            logger.debug("getCMCRequestId");
            atomicReference = p0.f195204e;
            str = atomicReference.get();
            if (str != null) {
                logger.debug("getCMCRequestId: handling cached CMC request id deep link");
                atomicReference.set(null);
                str2 = str;
            } else {
                logger.debug("getCMCRequestId: There is no request id data cached");
            }
            if (z14) {
                do {
                    value5 = p2Var.getValue();
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var2, "PostUserAuthenticationViewModel", "User needs to provide DOB, navigate to collect DOB screen.");
                } while (!p2Var.b(value5, b.C2649b.f141102a));
            } else if (d1.f()) {
                do {
                    value4 = p2Var.getValue();
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var3, "PostUserAuthenticationViewModel", "User account is suspended, navigate to home screen.");
                } while (!p2Var.b(value4, b.a.f141101a));
            } else if (str2 == null && str2.length() != 0 && k1.f37122a.r()) {
                do {
                    value3 = p2Var.getValue();
                    String strM = am.j.m("User needs to setup child account, navigate to child account setup screen with cmcRequestId: ", str2, ".");
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var4, "PostUserAuthenticationViewModel", strM);
                } while (!p2Var.b(value3, new b.g(str2)));
            } else {
                do {
                    value2 = p2Var.getValue();
                    if (!k1.f37122a.r()) {
                        listC = p13.x.k("LOCATION_CHECK", "DI_CONNECT_PRIVACY_CHECK");
                    } else if (dVar != re2.b.d.IT_WEB_CREATE_ACCT) {
                        listC = p13.x.k("GRADUATION_CHECK", "DI_CONNECT_PRIVACY_CHECK");
                    } else {
                        listC = p13.w.c("DI_CONNECT_PRIVACY_CHECK");
                    }
                    String strH = tn.k.h("Trigger startup checks ", ".", listC);
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.b(a2Var5, "PostUserAuthenticationViewModel", strH);
                } while (!p2Var.b(value2, new b.h(userSettingsDTO, mVar, listC)));
            }
        } else {
            if (i0Var instanceof i0.a) {
                u0.r();
                return null;
            }
            h0Var = ((i0.a) i0Var).f141086a;
            i2.a aVar8 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar8.getClass();
            i2.a.b(a2Var6, "PostUserAuthenticationViewModel", "Post user authentication calls error " + h0Var + ".");
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, new b.e(h0Var)));
        }
        return Unit.INSTANCE;
        boolean zBooleanValue = ((Boolean) objE0).booleanValue();
        n nVar = j0Var.f141095b;
        k0Var.f141121a = zBooleanValue;
        k0Var.f141124d = 2;
        Object objE = nVar.e(zBooleanValue, k0Var);
        if (objE != aVar) {
            z14 = zBooleanValue;
            objE0 = objE;
            i0Var = (i0) objE0;
            if (i0Var instanceof i0.b) {
                i2.a aVar9 = i2.f36769a;
                a2 a2Var7 = a2.GENERAL;
                aVar9.getClass();
                i2.a.b(a2Var7, "PostUserAuthenticationViewModel", "Post user authentication calls successful userSignInType[" + dVar + "].");
                if (dVar == re2.b.d.IT_WEB_CREATE_ACCT) {
                    j0Var.f141097d.c2(System.currentTimeMillis());
                }
                oi2.a.C2513a.a(oi2.a.f132270a, new jj0.d());
                fq1.g.a aVar10 = fq1.g.f73241b;
                f12.b bVar3 = j0Var.f141098e;
                aVar10.getClass();
                fq1.g.a.a(bVar3);
                i0.b bVar4 = (i0.b) i0Var;
                userSettingsDTO = bVar4.f141087a;
                mVar = bVar4.f141088b;
                p0.f195200a.getClass();
                logger = p0.f195201b;
                logger.debug("getCMCRequestId");
                atomicReference = p0.f195204e;
                str = atomicReference.get();
                if (str != null) {
                    logger.debug("getCMCRequestId: handling cached CMC request id deep link");
                    atomicReference.set(null);
                    str2 = str;
                } else {
                    logger.debug("getCMCRequestId: There is no request id data cached");
                }
                if (z14) {
                    do {
                        value5 = p2Var.getValue();
                        i2.a aVar11 = i2.f36769a;
                        a2 a2Var8 = a2.GENERAL;
                        aVar11.getClass();
                        i2.a.b(a2Var8, "PostUserAuthenticationViewModel", "User needs to provide DOB, navigate to collect DOB screen.");
                    } while (!p2Var.b(value5, b.C2649b.f141102a));
                } else if (d1.f()) {
                    do {
                        value4 = p2Var.getValue();
                        i2.a aVar12 = i2.f36769a;
                        a2 a2Var9 = a2.GENERAL;
                        aVar12.getClass();
                        i2.a.b(a2Var9, "PostUserAuthenticationViewModel", "User account is suspended, navigate to home screen.");
                    } while (!p2Var.b(value4, b.a.f141101a));
                } else if (str2 == null) {
                    do {
                        value2 = p2Var.getValue();
                        if (!k1.f37122a.r()) {
                            listC = p13.x.k("LOCATION_CHECK", "DI_CONNECT_PRIVACY_CHECK");
                        } else if (dVar != re2.b.d.IT_WEB_CREATE_ACCT) {
                            listC = p13.x.k("GRADUATION_CHECK", "DI_CONNECT_PRIVACY_CHECK");
                        } else {
                            listC = p13.w.c("DI_CONNECT_PRIVACY_CHECK");
                        }
                        String strH2 = tn.k.h("Trigger startup checks ", ".", listC);
                        i2.a aVar13 = i2.f36769a;
                        a2 a2Var10 = a2.GENERAL;
                        aVar13.getClass();
                        i2.a.b(a2Var10, "PostUserAuthenticationViewModel", strH2);
                    } while (!p2Var.b(value2, new b.h(userSettingsDTO, mVar, listC)));
                } else {
                    do {
                        value2 = p2Var.getValue();
                        if (!k1.f37122a.r()) {
                            listC = p13.x.k("LOCATION_CHECK", "DI_CONNECT_PRIVACY_CHECK");
                        } else if (dVar != re2.b.d.IT_WEB_CREATE_ACCT) {
                            listC = p13.x.k("GRADUATION_CHECK", "DI_CONNECT_PRIVACY_CHECK");
                        } else {
                            listC = p13.w.c("DI_CONNECT_PRIVACY_CHECK");
                        }
                        String strH3 = tn.k.h("Trigger startup checks ", ".", listC);
                        i2.a aVar14 = i2.f36769a;
                        a2 a2Var11 = a2.GENERAL;
                        aVar14.getClass();
                        i2.a.b(a2Var11, "PostUserAuthenticationViewModel", strH3);
                    } while (!p2Var.b(value2, new b.h(userSettingsDTO, mVar, listC)));
                }
            } else {
                if (i0Var instanceof i0.a) {
                    u0.r();
                    return null;
                }
                h0Var = ((i0.a) i0Var).f141086a;
                i2.a aVar15 = i2.f36769a;
                a2 a2Var12 = a2.GENERAL;
                aVar15.getClass();
                i2.a.b(a2Var12, "PostUserAuthenticationViewModel", "Post user authentication calls error " + h0Var + ".");
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new b.e(h0Var)));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpu/j0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

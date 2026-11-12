package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureActivity;
import com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.TroubleConnectingActivity;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.apps.connectmobile.feedback.FeedbackActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.summary.HydrationActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.notifications.NotificationsActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.setup.presentation.RecordActivitySettingsActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkd0/x0;", "Ln70/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Luu0/a;", "livetrackDelegate", "Ll80/a;", "deviceDelegate", "Lpc0/n0;", "inReachSubscriptionPreferences", "<init>", "(Landroid/content/Context;Luu0/a;Ll80/a;Lpc0/n0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 implements n70.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f104416e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uu0.a f104418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.a f104419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pc0.n0 f104420d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f104422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f104423c;

        static {
            int[] iArr = new int[o70.e.values().length];
            try {
                iArr[o70.e.f129951e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.e.f129952f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.e.f129953g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.e.f129954h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o70.e.f129955i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o70.e.f129956j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o70.e.f129957k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o70.e.f129958l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f104421a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.devices.a.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.devices.a.AGGREGATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.devices.a.DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.devices.a.REALTIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.devices.a.LEGACY.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f104422b = iArr2;
            int[] iArr3 = new int[ah0.b.values().length];
            try {
                iArr3[ah0.b.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ah0.b.ADVANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ah0.b.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f104423c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lo13/p;", "", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$checkFeedbackStatus$1", f = "DashboardDelegateImpl.kt", l = {350, 353, 357, 361, 367}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super o13.p<? extends Boolean, ? extends String>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f104425b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f104425b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super o13.p<? extends Boolean, ? extends String>> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:36:0x0112  */
        /* JADX WARN: Code duplicated, block: B:38:0x0116  */
        /* JADX WARN: Code duplicated, block: B:43:0x013f  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            if (r1.emit(r3, r18) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
        
            if (r1.emit(r4, r18) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
        
            if (r1.emit(r3, r18) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0139, code lost:
        
            if (r1.emit(r3, r18) == r2) goto L40;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            com.garmin.android.apps.connectmobile.v2 v2Var;
            ah0.a aVar;
            Boolean isEnableReview;
            Boolean bool;
            r53.j jVar = (r53.j) this.f104425b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104424a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 2) {
                    o13.r.b(obj);
                    objJ = obj;
                    v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
                    if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                        String strF = b71.i.f("checkFeedbackStatus() SUCCESS -> ", v2Var);
                        com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar3.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardDelegate", strF);
                        aVar = (ah0.a) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                        isEnableReview = aVar.getIsEnableReview();
                        bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(isEnableReview, bool)) {
                            o13.p pVar = new o13.p(bool, aVar.getReviewType());
                            this.f104425b = null;
                            this.f104424a = 3;
                        } else {
                            cw.l.b().getClass();
                            GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_ready_timestamp), DateTime.now().getMillis() + 86400000).apply();
                            o13.p pVar2 = new o13.p(Boolean.FALSE, null);
                            this.f104425b = null;
                            this.f104424a = 4;
                        }
                    } else {
                        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                            lc.u0.r();
                            return null;
                        }
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "checkFeedbackStatus() ERROR -> ");
                        com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "DashboardDelegate", strD);
                        o13.p pVar3 = new o13.p(Boolean.FALSE, null);
                        this.f104425b = null;
                        this.f104424a = 5;
                    }
                } else {
                    if (i14 != 3 && i14 != 4 && i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            cw.l.b().getClass();
            if (cw.l.d()) {
                yg0.c.a aVar5 = yg0.c.f196901b;
                yg0.a aVar6 = (yg0.a) ez0.b.a(ez0.b.f67468a, ez0.c.APP_REVIEW, yg0.a.class, new c83.h.a[0], null, null, null, 120);
                aVar5.getClass();
                aVar6.getClass();
                yg0.c cVar = new yg0.c(aVar6);
                int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                this.f104425b = jVar;
                this.f104424a = 2;
                objJ = com.garmin.android.apps.connectmobile.f0.J(cVar, new yg0.d(cVar, userProfilePk, null), this);
                if (objJ != aVar2) {
                    v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
                    if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                        String strF2 = b71.i.f("checkFeedbackStatus() SUCCESS -> ", v2Var);
                        com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar7.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "DashboardDelegate", strF2);
                        aVar = (ah0.a) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                        isEnableReview = aVar.getIsEnableReview();
                        bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(isEnableReview, bool)) {
                            o13.p pVar4 = new o13.p(bool, aVar.getReviewType());
                            this.f104425b = null;
                            this.f104424a = 3;
                        } else {
                            cw.l.b().getClass();
                            GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_feedback_ready_timestamp), DateTime.now().getMillis() + 86400000).apply();
                            o13.p pVar5 = new o13.p(Boolean.FALSE, null);
                            this.f104425b = null;
                            this.f104424a = 4;
                        }
                    } else {
                        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                            lc.u0.r();
                            return null;
                        }
                        String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a, "checkFeedbackStatus() ERROR -> ");
                        com.garmin.android.apps.connectmobile.i2.a aVar8 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar8.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.f(a2Var4, "DashboardDelegate", strD2);
                        o13.p pVar6 = new o13.p(Boolean.FALSE, null);
                        this.f104425b = null;
                        this.f104424a = 5;
                    }
                }
            } else {
                o13.p pVar7 = new o13.p(Boolean.FALSE, null);
                this.f104425b = null;
                this.f104424a = 1;
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$dismissInReachBannerIfNeeded$1", f = "DashboardDelegateImpl.kt", l = {303}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f104427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f104428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0 f104429d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, x0 x0Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f104428c = j8;
            this.f104429d = x0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f104428c, this.f104429d, dVar);
            dVar2.f104427b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f104427b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104426a;
            long j8 = this.f104428c;
            if (i14 == 0) {
                o13.r.b(obj);
                ui1.l.f171314e.getClass();
                ui1.l lVarA = ui1.l.a.a();
                this.f104427b = b0Var;
                this.f104426a = 1;
                obj = lVarA.g(j8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            x0 x0Var = this.f104429d;
            x0Var.f104420d.h(zBooleanValue);
            if (zBooleanValue) {
                String strF = androidx.room.a0.f(j8, "refreshAndSuppressInReachBanner: removing device ", " from local cache because emergency contacts have been reviewed");
                com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardDelegate", strF);
                x0Var.f104420d.b(j8);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$handleEcgMfaRequired$1", f = "DashboardDelegateImpl.kt", l = {399, GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104430a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$handleEcgMfaRequired$1$1", f = "DashboardDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f104432a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f104433b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x0 x0Var, boolean z14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f104432a = x0Var;
                this.f104433b = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f104432a, this.f104433b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                new com.garmin.android.apps.connectmobile.samd.presentation.mfa.a(this.f104432a.f104417a).a(rf1.b.ECG, this.f104433b);
                return Unit.INSTANCE;
            }
        }

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x0.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (ge1.b.e0(r1, r3, r6) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104430a;
            if (i14 == 0) {
                o13.r.b(obj);
                ff0.i iVar = (ff0.i) KoinJavaComponent.get$default(ff0.i.class, null, null, 6, null);
                this.f104430a = 1;
                obj = iVar.b(this);
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
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            qu.c cVar = (qu.c) obj;
            cVar.getClass();
            x53.c cVar2 = o53.s0.f129406a;
            o53.t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(x0.this, cVar instanceof qu.c.a, null);
            this.f104430a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$navigateToPowerManagerSettings$1", f = "DashboardDelegateImpl.kt", l = {431}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f104435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f104436c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$navigateToPowerManagerSettings$1$deviceDatabaseRecord$1", f = "DashboardDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super sd2.f>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f104437a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j8, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f104437a = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f104437a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super sd2.f> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                rd2.f.a().f152045a.getClass();
                return rd2.j.i(this.f104437a, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j8, Context context, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f104435b = j8;
            this.f104436c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f104435b, this.f104436c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104434a;
            long j8 = this.f104435b;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(j8, null);
                this.f104434a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            sd2.f fVar = (sd2.f) obj;
            if (fVar != null && km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
                RTSSettingsLauncherActivity.a aVar3 = RTSSettingsLauncherActivity.f34352a;
                Context context = this.f104436c;
                context.startActivity(RTSSettingsLauncherActivity.a.b(aVar3, context, fVar, GDIRealtimeSettingsProto.WellKnownCompositionId.POWER_MANAGER_VALUE, true));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$refreshInReachEmergencyContactsStatus$1", f = "DashboardDelegateImpl.kt", l = {320}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f104439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f104440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0 f104441d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Long l14, x0 x0Var, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f104440c = l14;
            this.f104441d = x0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g gVar = new g(this.f104440c, this.f104441d, dVar);
            gVar.f104439b = obj;
            return gVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f104439b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104438a;
            Long l14 = this.f104440c;
            if (i14 == 0) {
                o13.r.b(obj);
                ui1.l.f171314e.getClass();
                ui1.l lVarA = ui1.l.a.a();
                long jLongValue = l14.longValue();
                this.f104439b = b0Var;
                this.f104438a = 1;
                obj = lVarA.g(jLongValue, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            x0 x0Var = this.f104441d;
            x0Var.f104420d.h(zBooleanValue);
            if (zBooleanValue) {
                com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardDelegate", "refreshInReachEmergencyContactsStatus: removing device " + l14 + " from local cache because emergency contacts have been reviewed");
                x0Var.f104420d.b(l14.longValue());
            } else {
                com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar3.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "DashboardDelegate", "refreshInReachEmergencyContactsStatus: emergency contacts have not been reviewed yet for device " + l14 + "; not removing it from local cache");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardDelegateImpl$shouldShowFinishInReachSetupBanner$1", f = "DashboardDelegateImpl.kt", l = {245, 252, 273, 289}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f104442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set f104443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f104445d;

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = x0.this.new h(dVar);
            hVar.f104445d = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:48:0x016b  */
        /* JADX WARN: Code duplicated, block: B:50:0x018d  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (r1.emit(r3, r17) == r2) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
        
            if (r3 == r2) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01a0, code lost:
        
            if (r53.s.v(r1, r3, r17) == r2) goto L52;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objS;
            Long l14;
            Set<Long> set;
            List list;
            Iterator<T> it;
            Object objG;
            boolean zM;
            r53.j jVar = (r53.j) this.f104445d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104444c;
            x0 x0Var = x0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                pc0.n0 n0Var = x0Var.f104420d;
                pc0.n0 n0Var2 = x0Var.f104420d;
                Long l15 = n0Var.l();
                if (l15 == null) {
                    Boolean bool = Boolean.FALSE;
                    this.f104445d = null;
                    this.f104442a = null;
                    this.f104444c = 1;
                } else if (n0Var2.f()) {
                    com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar2.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked cache is still valid; skipping refresh");
                    r53.b bVarK = x0Var.f104420d.k();
                    this.f104445d = null;
                    this.f104442a = null;
                    this.f104443b = null;
                    this.f104444c = 4;
                } else {
                    Set<Long> setI = n0Var2.i();
                    l80.a aVar3 = x0Var.f104419c;
                    this.f104445d = jVar;
                    this.f104442a = l15;
                    this.f104443b = setI;
                    this.f104444c = 2;
                    objS = aVar3.s(false, this);
                    if (objS != aVar) {
                        l14 = l15;
                        set = setI;
                        list = (List) objS;
                        com.garmin.android.apps.connectmobile.i2.a aVar4 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: activeUnitIds=" + list + ", storedUnitIds=" + set);
                        if (list != null) {
                            it = set.iterator();
                            while (it.hasNext()) {
                                long jLongValue = ((Number) it.next()).longValue();
                                pc0.n0 n0Var3 = x0Var.f104420d;
                                zM = n0Var3.m(jLongValue);
                                boolean zContains = list.contains(new Long(jLongValue));
                                n0Var3.g(jLongValue, zContains);
                                if (!zM) {
                                }
                            }
                            if (x0Var.f104420d.m(l14.longValue())) {
                            }
                            com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar5.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: skipping emergency contacts check because either the device does not have an active subscription or the emergency contacts have already been reviewed");
                            if (!x0Var.f104420d.i().isEmpty()) {
                                com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar6.getClass();
                                com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: updating inReachLastApiCheckDate to current time");
                                x0Var.f104420d.j(System.currentTimeMillis());
                            }
                            r53.b bVarK2 = x0Var.f104420d.k();
                            this.f104445d = null;
                            this.f104442a = null;
                            this.f104443b = null;
                            this.f104444c = 4;
                        } else {
                            r53.b bVarK3 = x0Var.f104420d.k();
                            this.f104445d = null;
                            this.f104442a = null;
                            this.f104443b = null;
                            this.f104444c = 4;
                        }
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                set = this.f104443b;
                Long l16 = this.f104442a;
                o13.r.b(obj);
                l14 = l16;
                objS = obj;
                list = (List) objS;
                com.garmin.android.apps.connectmobile.i2.a aVar7 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar7.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: activeUnitIds=" + list + ", storedUnitIds=" + set);
                if (list != null) {
                    it = set.iterator();
                    while (it.hasNext()) {
                        long jLongValue2 = ((Number) it.next()).longValue();
                        pc0.n0 n0Var4 = x0Var.f104420d;
                        zM = n0Var4.m(jLongValue2);
                        boolean zContains2 = list.contains(new Long(jLongValue2));
                        n0Var4.g(jLongValue2, zContains2);
                        if (!zM && !zContains2) {
                            String strF = androidx.room.a0.f(jLongValue2, "shouldShowFinishInReachSetupBannerChecked: removing device ", " from local cache because it no longer has an active subscription");
                            com.garmin.android.apps.connectmobile.i2.a aVar8 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar8.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var6, "DashboardDelegate", strF);
                            n0Var4.b(jLongValue2);
                        }
                    }
                    if (x0Var.f104420d.m(l14.longValue()) || x0Var.f104420d.n()) {
                        com.garmin.android.apps.connectmobile.i2.a aVar9 = com.garmin.android.apps.connectmobile.i2.f36769a;
                        com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                        aVar9.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var7, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: skipping emergency contacts check because either the device does not have an active subscription or the emergency contacts have already been reviewed");
                        if (!x0Var.f104420d.i().isEmpty()) {
                            com.garmin.android.apps.connectmobile.i2.a aVar10 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var8 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar10.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var8, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: updating inReachLastApiCheckDate to current time");
                            x0Var.f104420d.j(System.currentTimeMillis());
                        }
                        r53.b bVarK4 = x0Var.f104420d.k();
                        this.f104445d = null;
                        this.f104442a = null;
                        this.f104443b = null;
                        this.f104444c = 4;
                    } else {
                        ui1.l.f171314e.getClass();
                        ui1.l lVarA = ui1.l.a.a();
                        long jLongValue3 = l14.longValue();
                        this.f104445d = jVar;
                        this.f104442a = l14;
                        this.f104443b = null;
                        this.f104444c = 3;
                        objG = lVarA.g(jLongValue3, this);
                    }
                } else {
                    r53.b bVarK5 = x0Var.f104420d.k();
                    this.f104445d = null;
                    this.f104442a = null;
                    this.f104443b = null;
                    this.f104444c = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                Set set2 = this.f104443b;
                Long l17 = this.f104442a;
                o13.r.b(obj);
                l14 = l17;
                objG = obj;
                boolean zBooleanValue = ((Boolean) objG).booleanValue();
                x0Var.f104420d.h(zBooleanValue);
                com.garmin.android.apps.connectmobile.i2.a aVar11 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var9 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar11.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var9, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: hasContacts=" + zBooleanValue + " for unitId=" + l14);
                if (!x0Var.f104420d.i().isEmpty()) {
                    com.garmin.android.apps.connectmobile.i2.a aVar12 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var10 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar12.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var10, "DashboardDelegate", "shouldShowFinishInReachSetupBannerChecked: updating inReachLastApiCheckDate to current time");
                    x0Var.f104420d.j(System.currentTimeMillis());
                }
                r53.b bVarK6 = x0Var.f104420d.k();
                this.f104445d = null;
                this.f104442a = null;
                this.f104443b = null;
                this.f104444c = 4;
            } else {
                if (i14 != 4) {
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

    public x0(Context context, uu0.a aVar, l80.a aVar2, pc0.n0 n0Var) {
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        n0Var.getClass();
        this.f104417a = context;
        this.f104418b = aVar;
        this.f104419c = aVar2;
        this.f104420d = n0Var;
    }

    @Override // n70.g
    public final void A(Context context, long j8) {
        context.getClass();
        DevicePasscodeActivity.a aVar = DevicePasscodeActivity.f33744a;
        ca2.a aVar2 = ca2.a.CHANGE_PASSCODE;
        y92.e eVar = y92.e.DEVICE_SETTINGS;
        aVar.getClass();
        context.startActivity(DevicePasscodeActivity.a.a(context, j8, aVar2, eVar));
    }

    @Override // n70.g
    public final r53.i<Boolean> B() {
        r53.c2 c2Var = new r53.c2(new h(null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    @Override // n70.g
    public final boolean C() {
        return ((uf1.a) KoinJavaComponent.get$default(uf1.a.class, null, null, 6, null)).c().a();
    }

    @Override // n70.g
    public final void D(Context context) {
        context.getClass();
        context.startActivity(SafetyFeaturesActivity.a.a(SafetyFeaturesActivity.f43691f, context));
    }

    @Override // n70.g
    public final boolean E() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return com.garmin.android.apps.connectmobile.k1.f37122a.n();
    }

    @Override // n70.g
    public final void F() {
        this.f104420d.j(-1L);
    }

    @Override // n70.g
    public final void G() {
        Long l14 = this.f104420d.l();
        if (l14 != null) {
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new g(l14, this, null), 3);
        } else {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardDelegate", "refreshInReachEmergencyContactsStatus: no device found; nothing to check");
        }
    }

    @Override // n70.g
    public final void H(Context context, o70.e eVar) {
        context.getClass();
        eVar.getClass();
        ht.s sVar = ht.s.f85508a;
        zk.a aVar = new zk.a("UserAction", p13.x.k(new zk.e("Screen", "Home"), new zk.e("Action", "QuickActionSelected"), new zk.e("Type", eVar.f129963d)), false, 0L, 12, null);
        sVar.getClass();
        ht.s.b(aVar);
        switch (b.f104421a[eVar.ordinal()]) {
            case 1:
            case 2:
                RecordActivitySettingsActivity.f44210b.getClass();
                context.startActivity(new Intent(context, (Class<?>) RecordActivitySettingsActivity.class));
                break;
            case 3:
                AddWeightActivity.a aVar2 = AddWeightActivity.f48007c;
                LocalDate localDateNow = LocalDate.now();
                aVar2.getClass();
                context.startActivity(AddWeightActivity.a.a(context, localDateNow));
                break;
            case 4:
                HydrationActivity.a aVar3 = HydrationActivity.f36739o;
                DateTime dateTimeNow = DateTime.now();
                aVar3.getClass();
                context.startActivity(HydrationActivity.a.a(context, dateTimeNow, false));
                break;
            case 5:
                context.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context, null, null, new b21.l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(b63.u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                break;
            case 6:
                MenstrualCycleSymptomActivity.f38817c.getClass();
                MenstrualCycleSymptomActivity.a.c(context, null);
                break;
            case 7:
                zd1.a.f204221a.getClass();
                Intent intent = new Intent(context, (Class<?>) LifestyleLoggingActivity.class);
                new zd1.a.C3809a(intent).a(g22.l.d(b63.o.INSTANCE));
                Unit unit = Unit.INSTANCE;
                context.startActivity(intent);
                break;
            case 8:
                AddBloodPressureActivity.a aVar4 = AddBloodPressureActivity.f30909d;
                DateTime dateTimeNow2 = DateTime.now();
                aVar4.getClass();
                AddBloodPressureActivity.a.a(context, dateTimeNow2);
                break;
            default:
                lc.u0.r();
                break;
        }
    }

    @Override // n70.g
    public final void I(long j8) {
        pc0.n0 n0Var = this.f104420d;
        if (n0Var.n()) {
            n0Var.b(j8);
        } else {
            n0Var.c();
        }
    }

    @Override // n70.g
    public final r53.f J() {
        db2.d.f59098a.getClass();
        return r53.s.i(new db2.c(null));
    }

    @Override // n70.g
    public final void a(Context context) {
        context.getClass();
        Bundle bundle = new Bundle();
        bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
        Intent intent = new Intent(context, (Class<?>) MoreActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override // n70.g
    public final void b(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) TroubleConnectingActivity.class));
    }

    @Override // n70.g
    public final void c(Context context) {
        context.getClass();
        LiveTrackActivity.f38637g.c(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n70.g
    public final Object d(v13.c cVar) {
        z0 z0Var;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i14 = z0Var.f104467c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z0Var.f104467c = i14 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object objI = z0Var.f104465a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z0Var.f104467c;
        if (i15 == 0) {
            o13.r.b(objI);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            z0Var.f104467c = 1;
            objI = j1Var.i(z0Var);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        return Boolean.valueOf(objI instanceof c80.s.a);
    }

    @Override // n70.g
    public final Intent e(Context context) {
        context.getClass();
        TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
        int iOrdinal = zf0.a.CREATE_EVENT.ordinal();
        aVar.getClass();
        return TrainingInitiativeEventActivity.a.a(iOrdinal, context);
    }

    @Override // n70.g
    public final Fragment f(Long l14, com.garmin.android.apps.connectmobile.devices.a aVar) {
        if (l14 == null) {
            return hc0.k.Y6(true);
        }
        int i14 = aVar == null ? -1 : b.f104422b[aVar.ordinal()];
        if (i14 == 1) {
            long jLongValue = l14.longValue();
            Bundle bundle = new Bundle();
            bundle.putLong("GCM_deviceUnitID", jLongValue);
            com.garmin.android.apps.connectmobile.settings.devices.common.f fVar = new com.garmin.android.apps.connectmobile.settings.devices.common.f();
            fVar.setArguments(bundle);
            return fVar;
        }
        if (i14 == 2 || i14 == 3) {
            yo0.k.a aVar2 = yo0.k.f198403d;
            long jLongValue2 = l14.longValue();
            aVar2.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("GCM_deviceUnitID", jLongValue2);
            yo0.k kVar = new yo0.k();
            kVar.setArguments(bundle2);
            return kVar;
        }
        if (i14 != 4) {
            return hc0.k.Y6(true);
        }
        long jLongValue3 = l14.longValue();
        Bundle bundle3 = new Bundle();
        bundle3.putLong("GCM_deviceUnitID", jLongValue3);
        zb0.o oVar = new zb0.o();
        oVar.setArguments(bundle3);
        return oVar;
    }

    @Override // n70.g
    public final boolean g() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return com.garmin.android.apps.connectmobile.k1.f37122a.g();
    }

    @Override // n70.g
    public final void h(Context context) {
        context.getClass();
        NotificationsActivity.f39547a.getClass();
        context.startActivity(new Intent(context, (Class<?>) NotificationsActivity.class));
    }

    @Override // n70.g
    public final Object i(ps.m mVar, com.garmin.android.apps.connectmobile.dashboard.data.datasource.l lVar) throws Throwable {
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new b1(mVar, null), lVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // n70.g
    public final Intent j(Context context) {
        context.getClass();
        TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
        int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
        aVar.getClass();
        return TrainingInitiativeEventActivity.a.a(iOrdinal, context);
    }

    @Override // n70.g
    public final void k(Context context) {
        context.getClass();
        DeviceSetupActivity.f33758b.b(context, ca0.o1.ADD_DEVICE, 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    @Override // n70.g
    public final void l(mc mcVar, p3.m mVar, int i14) {
        mc mcVar2;
        p3.o0 o0VarE = mVar.E(603047240);
        int i15 = (o0VarE.B(mcVar) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(this) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new ho0.a(this, context, 17);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ho0.a(this, context, 17);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zR2 = o0VarE.r(this) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new ho0.a(this, context, 18);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ho0.a(this, context, 18);
                    o0VarE.K(objQ2);
                }
            }
            mcVar2 = mcVar;
            ug0.l.b(null, mcVar2, aVar2, (e23.a) objQ2, o0VarE, (i15 << 3) & 112);
        } else {
            mcVar2 = mcVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(this, mcVar2, i14, 8);
        }
    }

    @Override // n70.g
    public final ArrayList m(ps.c1 c1Var, ArrayList arrayList) {
        ArrayList arrayListB;
        Context context = this.f104417a;
        if (arrayList == null || arrayList.isEmpty()) {
            arrayListB = new ps.f1(context, c1Var, null, 4, null).b(true, null, null);
        } else {
            arrayListB = dh.b.y(context, c1Var, arrayList);
        }
        if (arrayListB == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            List<com.garmin.android.library.mapsdkadapter.f> list = ((com.garmin.android.library.mapsdkadapter.q) it.next()).f50328a.f93153a;
            ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((com.garmin.android.library.mapsdkadapter.f) it3.next()).f50283a);
            }
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }

    @Override // n70.g
    public final Intent n(Context context) {
        context.getClass();
        UserProfileActivity.f46494x.getClass();
        return UserProfileActivity.a.a(context);
    }

    @Override // n70.g
    public final yb1.b o(ff2.a aVar) {
        aVar.getClass();
        String offerType = aVar.getOfferType();
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String strN = fb1.c.n("Campaign offer type: ", offerType);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strN);
        if ("MODAL_POPUP_TOP".equals(offerType)) {
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "Showing Popup Top Fragment");
            return new yb1.d();
        }
        if ("MODAL_POPUP_BOTTOM".equals(offerType)) {
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "Showing Popup Bottom Fragment");
            return new yb1.c();
        }
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "Didn't match any of the POPUP PromoTypes");
        return null;
    }

    @Override // n70.g
    public final Intent p(Context context) {
        return sn.a.d(context, context, ActiveTrainingPlansActivity.class);
    }

    @Override // n70.g
    public final void q(Context context, long j8) {
        context.getClass();
        context.startActivity(DeviceDetailsActivity.ma(context, j8));
    }

    @Override // n70.g
    public final Long r() {
        return this.f104420d.l();
    }

    @Override // n70.g
    public final Object s(long j8, com.garmin.android.apps.connectmobile.dashboard.data.datasource.l lVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new y0(j8, null), lVar);
    }

    @Override // n70.g
    public final void t(long j8) {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new d(j8, this, null), 3);
    }

    @Override // n70.g
    public final void u(Context context, long j8) {
        context.getClass();
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new f(j8, context, null), 3);
    }

    @Override // n70.g
    public final void v(Context context, androidx.fragment.app.v vVar, String str) {
        ah0.b bVar;
        context.getClass();
        if (str == null) {
            bVar = ah0.b.UNDEFINED;
            break;
        }
        ah0.b[] bVarArrValues = ah0.b.values();
        int length = bVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                bVar = ah0.b.UNDEFINED;
                break;
            }
            bVar = bVarArrValues[i14];
            if (bVar.f3288a.equalsIgnoreCase(str)) {
                break;
            } else {
                i14++;
            }
        }
        int i15 = b.f104423c[bVar.ordinal()];
        if (i15 == 1) {
            new yg0.b().show(vVar, "FEEDBACK_DIALOG_TAG");
        } else if (i15 != 2 && i15 != 3) {
            lc.u0.r();
        } else {
            int i16 = FeedbackActivity.f35205a;
            androidx.room.a0.r(context, FeedbackActivity.class);
        }
    }

    @Override // n70.g
    public final void w() {
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new e(null), 3);
    }

    @Override // n70.g
    public final r53.i<o13.p<Boolean, String>> x() {
        r53.c2 c2Var = new r53.c2(new c(null));
        x53.c cVar = o53.s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }

    @Override // n70.g
    public final void y(Context context) {
        context.getClass();
        LiveTrackActivity.f38637g.c(context, bv0.a.t.INSTANCE);
    }

    @Override // n70.g
    public final s53.k z() {
        return r53.s.D(androidx.lifecycle.v.a(wd2.m.b()), new a1(this, null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lkd0/x0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FEEDBACK_DIALOG_TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

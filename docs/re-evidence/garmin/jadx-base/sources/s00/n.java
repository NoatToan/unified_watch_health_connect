package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.CoachConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import com.garmin.android.apps.connectmobile.consent.InsightsConsentActivity;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/n;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends j {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155323a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.ADMIN_GRANTED_CONSENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.ADMIN_REVOKED_CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.ADMIN_APPROVAL_REQUEST_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n00.c.CHILD_REVOKED_CONSENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n00.c.ADMIN_EMERGENCY_CONTACT_ACCEPT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n00.c.ADMIN_EMERGENCY_CONTACT_SMS_OPTOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n00.c.ADMIN_EMERGENCY_CONTACT_DECLINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n00.c.ADMIN_EMERGENCY_CONTACT_REMOVAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n00.c.ADMIN_LIVETRACK_CONTACT_REMOVAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[n00.c.ADMIN_LIVETRACK_CONTACT_ACCEPT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[n00.c.ADMIN_LIVETRACK_CONTACT_DECLINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[n00.c.CHILD_DELETED_CONTACT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[n00.c.CHILD_DELETED_EMERGENCY_SERVICE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[n00.c.ADMIN_EMERGENCY_CALLING_CONTACT_REMOVAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[n00.c.ADMIN_CHILD_EMERGENCY_CONTACT_UNREACHABLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[n00.c.ADMIN_CHILD_LIVETRACK_CONTACT_UNREACHABLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f155323a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.ChildAccountsPushNotificationHandler$handleAdminApprovalRequestRequired$1", f = "ChildAccountsPushNotificationHandler.kt", l = {347}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f155324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f155325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f155326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f155327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f155328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n f155329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f155330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<String> f155331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f155332i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Intent> f155333j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<sz0.e> f155334k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f155335l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n00.c f155336m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f155337n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, n nVar, String str3, p005kotlin.jvm.internal.r0<String> r0Var, Context context, p005kotlin.jvm.internal.r0<Intent> r0Var2, p005kotlin.jvm.internal.r0<sz0.e> r0Var3, int i14, n00.c cVar, String str4, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f155327d = str;
            this.f155328e = str2;
            this.f155329f = nVar;
            this.f155330g = str3;
            this.f155331h = r0Var;
            this.f155332i = context;
            this.f155333j = r0Var2;
            this.f155334k = r0Var3;
            this.f155335l = i14;
            this.f155336m = cVar;
            this.f155337n = str4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f155327d, this.f155328e, this.f155329f, this.f155330g, this.f155331h, this.f155332i, this.f155333j, this.f155334k, this.f155335l, this.f155336m, this.f155337n, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v14, types: [T, android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v15, types: [T, sz0.e] */
        /* JADX WARN: Type inference failed for: r1v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v19, types: [T, android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v20, types: [T, sz0.e] */
        /* JADX WARN: Type inference failed for: r1v22, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v24, types: [T, android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v25, types: [T, sz0.e] */
        /* JADX WARN: Type inference failed for: r1v27, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v28, types: [T, android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v29, types: [T, sz0.e] */
        /* JADX WARN: Type inference failed for: r1v31, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v33, types: [T, android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v34, types: [T, sz0.e] */
        /* JADX WARN: Type inference failed for: r1v36, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v38, types: [T, android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v39, types: [T, sz0.e] */
        /* JADX WARN: Type inference failed for: r1v48, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v50, types: [T, android.content.Intent] */
        /* JADX WARN: Type inference failed for: r1v51, types: [T, sz0.e] */
        /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.String] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            Object objF;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155326c;
            n nVar = this.f155329f;
            String str2 = this.f155328e;
            if (i14 == 0) {
                o13.r.b(obj);
                String str3 = this.f155327d;
                j8 = Long.parseLong(str3);
                this.f155325b = str2;
                this.f155324a = j8;
                this.f155326c = 1;
                objF = n.f(nVar, str3, this);
                if (objF == aVar) {
                    return aVar;
                }
                str = str2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j14 = this.f155324a;
                String str4 = this.f155325b;
                o13.r.b(obj);
                j8 = j14;
                str = str4;
                objF = obj;
            }
            hl.a.b bVar = new hl.a.b(j8, str, (String) objF, null, 8, null);
            String str5 = this.f155330g;
            boolean zG = p005kotlin.jvm.internal.s.g(str5, "DI_CONNECT_LIVETRACK");
            p005kotlin.jvm.internal.r0<sz0.e> r0Var = this.f155334k;
            p005kotlin.jvm.internal.r0<Intent> r0Var2 = this.f155333j;
            p005kotlin.jvm.internal.r0<String> r0Var3 = this.f155331h;
            Context context = this.f155332i;
            if (zG) {
                r0Var3.f105810a = context.getString(R.string.title_live_track);
                LiveTrackActivity.a aVar2 = LiveTrackActivity.f38637g;
                bv0.a.q qVar = bv0.a.q.INSTANCE;
                aVar2.getClass();
                r0Var2.f105810a = LiveTrackActivity.a.a(context, qVar, bVar);
                r0Var.f105810a = sz0.e.f161376o;
            } else if (p005kotlin.jvm.internal.s.g(str5, "DI_CONNECT_ADAPTIVE_TRAINING_PLAN")) {
                r0Var3.f105810a = context.getString(R.string.lbl_adaptive_training_plan);
                r0Var2.f105810a = CoachConsentActivity.a.a(CoachConsentActivity.f32153p, context, bVar, 4);
                r0Var.f105810a = sz0.e.f161382w;
            } else if (p005kotlin.jvm.internal.s.g(str5, "DI_CONNECT_UPLOAD")) {
                r0Var3.f105810a = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                DataConsentActivity.f32169h.getClass();
                r0Var2.f105810a = DataConsentActivity.a.a(context, bVar);
                r0Var.f105810a = sz0.e.P0;
            } else if (p005kotlin.jvm.internal.s.g(str5, "DI_CONNECT_INSIGHTS")) {
                r0Var3.f105810a = context.getString(R.string.title_insights);
                r0Var2.f105810a = ConsentActivity.a.b(ConsentActivity.f32155r, this.f155332i, q92.x.DI_CONNECT_INSIGHTS, false, bVar, 8);
                r0Var.f105810a = sz0.e.P0;
            } else if (p005kotlin.jvm.internal.s.g(str5, "DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE")) {
                r0Var3.f105810a = context.getString(R.string.gdpr_product_improvement);
                r0Var2.f105810a = ProductImprovementConsentActivity.a.a(ProductImprovementConsentActivity.f32230h, context, bVar, 4);
                r0Var.f105810a = sz0.e.P0;
            } else if (p005kotlin.jvm.internal.s.g(str5, "DI_CONNECT_AUTO_ACTIVITY_DETECTION")) {
                r0Var3.f105810a = context.getString(R.string.lbl_auto_activity_detection);
                DataConsentActivity.f32169h.getClass();
                r0Var2.f105810a = DataConsentActivity.a.a(context, bVar);
                r0Var.f105810a = sz0.e.P0;
            } else {
                q92.x xVar = q92.x.DI_CONNECT_CIQ_PRIVACY;
                if (p005kotlin.jvm.internal.s.g(str5, xVar.f143819a)) {
                    r0Var3.f105810a = context.getString(R.string.lbl_connect_iq_privacy_policy);
                    PrivacyPolicyConsentActivity.f32218d.getClass();
                    r0Var2.f105810a = PrivacyPolicyConsentActivity.a.a(context, bVar, xVar, false);
                    r0Var.f105810a = sz0.e.P0;
                }
            }
            String string = context.getString(this.f155335l, str2, r0Var3.f105810a);
            string.getClass();
            Intent intent = r0Var2.f105810a;
            nVar.getClass();
            PendingIntent pendingIntentC = j.c(context, intent);
            j.e(this.f155332i, r0Var.f105810a, nVar.d(this.f155336m), this.f155337n, string, pendingIntentC);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.ChildAccountsPushNotificationHandler$handleAdminAssistanceContactNotification$1", f = "ChildAccountsPushNotificationHandler.kt", l = {202}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f155338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f155339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f155340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f155341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f155342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n f155343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f155344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f155345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f155346i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ pj1.l f155347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f155348k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f155349l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n00.c f155350m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, n nVar, Context context, String str3, long j8, pj1.l lVar, int i14, String str4, n00.c cVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f155341d = str;
            this.f155342e = str2;
            this.f155343f = nVar;
            this.f155344g = context;
            this.f155345h = str3;
            this.f155346i = j8;
            this.f155347j = lVar;
            this.f155348k = i14;
            this.f155349l = str4;
            this.f155350m = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f155341d, this.f155342e, this.f155343f, this.f155344g, this.f155345h, this.f155346i, this.f155347j, this.f155348k, this.f155349l, this.f155350m, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            Object objF;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155340c;
            n nVar = this.f155343f;
            String str2 = this.f155342e;
            if (i14 == 0) {
                o13.r.b(obj);
                String str3 = this.f155341d;
                j8 = Long.parseLong(str3);
                this.f155339b = str2;
                this.f155338a = j8;
                this.f155340c = 1;
                objF = n.f(nVar, str3, this);
                if (objF == aVar) {
                    return aVar;
                }
                str = str2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j14 = this.f155338a;
                String str4 = this.f155339b;
                o13.r.b(obj);
                j8 = j14;
                str = str4;
                objF = obj;
            }
            hl.a.b bVar = new hl.a.b(j8, str, (String) objF, null, 8, null);
            Intent intentC = SafetyFeaturesActivity.f43691f.c(this.f155344g, this.f155345h, this.f155346i, this.f155347j, bVar);
            Object[] objArr = {this.f155349l, str2};
            Context context = this.f155344g;
            String string = context.getString(this.f155348k, objArr);
            string.getClass();
            sz0.e eVar = sz0.e.f161371k;
            int iD = nVar.d(this.f155350m);
            String string2 = context.getString(R.string.incident_detection_assistance_contact);
            nVar.getClass();
            j.e(this.f155344g, eVar, iD, string2, string, j.c(context, intentC));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.ChildAccountsPushNotificationHandler$handleAdminEmergencyNotification$1", f = "ChildAccountsPushNotificationHandler.kt", l = {258}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f155351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f155352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f155353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f155354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f155355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n f155356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f155357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n00.c f155358h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f155359i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f155360j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, n nVar, Context context, n00.c cVar, String str3, String str4, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f155354d = str;
            this.f155355e = str2;
            this.f155356f = nVar;
            this.f155357g = context;
            this.f155358h = cVar;
            this.f155359i = str3;
            this.f155360j = str4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f155354d, this.f155355e, this.f155356f, this.f155357g, this.f155358h, this.f155359i, this.f155360j, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155353c;
            n nVar = this.f155356f;
            if (i14 == 0) {
                o13.r.b(obj);
                String str2 = this.f155354d;
                j8 = Long.parseLong(str2);
                String str3 = this.f155355e;
                this.f155352b = str3;
                this.f155351a = j8;
                this.f155353c = 1;
                obj = n.f(nVar, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
                str = str3;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j14 = this.f155351a;
                String str4 = this.f155352b;
                o13.r.b(obj);
                j8 = j14;
                str = str4;
            }
            hl.a.b bVar = new hl.a.b(j8, str, (String) obj, null, 8, null);
            SafetyFeaturesActivity.f43691f.getClass();
            Context context = this.f155357g;
            Intent intentB = SafetyFeaturesActivity.a.b(context, false, bVar);
            sz0.e eVar = sz0.e.f161371k;
            int iD = nVar.d(this.f155358h);
            nVar.getClass();
            j.e(this.f155357g, eVar, iD, this.f155359i, this.f155360j, j.c(context, intentB));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public static final Object f(n nVar, String str, v13.i iVar) {
        nVar.getClass();
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new o(str, null), iVar);
    }

    public static String g(String str, String str2, Bundle bundle) {
        String string = bundle.getString(str);
        if (string == null) {
            string = "";
        }
        String string2 = d53.w.i0(string).toString();
        String string3 = bundle.getString(str2);
        return d53.w.i0(string2 + StringUtils.SPACE + d53.w.i0(string3 != null ? string3 : "").toString()).toString();
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        a2 a2Var = a2.CHILD_ACCOUNTS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ChildAccountsPushNotificationHandler", "Received child notification " + bundle);
        switch (b.f155323a[cVar.ordinal()]) {
            case 1:
                l(garminConnectMobileApp, bundle, cVar);
                break;
            case 2:
                l(garminConnectMobileApp, bundle, cVar);
                break;
            case 3:
                String string = bundle.getString("approvalAssetName");
                h(garminConnectMobileApp, bundle, cVar, d53.w.i0(string != null ? string : "").toString(), R.string.pn_permission_requested_title, R.string.pn_permission_requested);
                break;
            case 4:
                String string2 = bundle.getString("consentType");
                h(garminConnectMobileApp, bundle, cVar, d53.w.i0(string2 != null ? string2 : "").toString(), R.string.pn_permission_revoked_title, R.string.pn_permission_child_revoked);
                break;
            case 5:
                i(garminConnectMobileApp, bundle, cVar, pj1.l.ACCEPT, R.string.pn_admin_assistance_contact_accept);
                break;
            case 6:
            case 7:
                i(garminConnectMobileApp, bundle, cVar, pj1.l.DECLINE, R.string.pn_admin_assistance_contact_decline);
                break;
            case 8:
                String string3 = bundle.getString("contact-uuid");
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = d53.w.i0(string3).toString();
                String strG = g("ec-first-name", "ec-last-name", bundle);
                String string5 = bundle.getString("contact-info-pk");
                long j8 = string5 != null ? Long.parseLong(string5) : 0L;
                String strG2 = g("child-first-name", "child-last-name", bundle);
                String string6 = bundle.getString("child-user-profile-pk");
                String string7 = d53.w.i0(string6 != null ? string6 : "").toString();
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new p(string7, strG2, this, garminConnectMobileApp, string4, j8, strG, cVar, null), 3);
                break;
            case 9:
                k(garminConnectMobileApp, bundle, cVar, R.string.pn_livetrack_child_contact_removed, R.string.pn_livetrack_recipient_removed_title);
                break;
            case 10:
                k(garminConnectMobileApp, bundle, cVar, R.string.pn_contact_accepted_livetrack, R.string.pn_livetrack_contact_accept_title);
                break;
            case 11:
                k(garminConnectMobileApp, bundle, cVar, R.string.pn_contact_declined_livetrack, R.string.pn_livetrack_contact_decline_title);
                break;
            case 12:
                String strG3 = g("contact-first-name", "contact-last-name", bundle);
                String strG4 = g("child-first-name", "child-last-name", bundle);
                String string8 = bundle.getString("child-user-profile-pk");
                String string9 = d53.w.i0(string8 != null ? string8 : "").toString();
                String string10 = garminConnectMobileApp.getString(R.string.pn_contact_removed_title);
                string10.getClass();
                String string11 = garminConnectMobileApp.getString(R.string.pn_contact_removed, strG4, strG3, strG3);
                string11.getClass();
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new q(string9, strG4, this, garminConnectMobileApp, cVar, string10, string11, null), 3);
                break;
            case 13:
                String strG5 = g("child-first-name", "child-last-name", bundle);
                String string12 = bundle.getString("child-user-profile-pk");
                String string13 = d53.w.i0(string12 != null ? string12 : "").toString();
                String string14 = garminConnectMobileApp.getString(R.string.pn_emergency_services_removed_title);
                string14.getClass();
                String string15 = garminConnectMobileApp.getString(R.string.pn_emergency_services_removed, strG5);
                string15.getClass();
                j(garminConnectMobileApp, cVar, strG5, string13, string14, string15);
                break;
            case 14:
                String strG6 = g("contact-first-name", "contact-last-name", bundle);
                String strG7 = g("child-first-name", "child-last-name", bundle);
                String string16 = bundle.getString("child-user-profile-pk");
                String string17 = d53.w.i0(string16 != null ? string16 : "").toString();
                String string18 = garminConnectMobileApp.getString(R.string.pn_emergency_calling_contact_removed_title);
                string18.getClass();
                String string19 = garminConnectMobileApp.getString(R.string.pn_emergency_calling_contact_removed, strG7, strG6);
                string19.getClass();
                j(garminConnectMobileApp, cVar, strG7, string17, string18, string19);
                break;
            case 15:
                String strG8 = g("child-first-name", "child-last-name", bundle);
                String string20 = bundle.getString("child-user-profile-pk");
                String string21 = d53.w.i0(string20 != null ? string20 : "").toString();
                String string22 = garminConnectMobileApp.getString(R.string.assistance_contacts_channel_name);
                string22.getClass();
                String string23 = garminConnectMobileApp.getString(R.string.pn_assistance_contacts_list_for_child_needs_attention, strG8);
                string23.getClass();
                j(garminConnectMobileApp, cVar, strG8, string21, string22, string23);
                break;
            case 16:
                String strG9 = g("child-first-name", "child-last-name", bundle);
                String string24 = bundle.getString("child-user-profile-pk");
                String string25 = d53.w.i0(string24 != null ? string24 : "").toString();
                String string26 = garminConnectMobileApp.getString(R.string.pn_livetrack_recipients_list_for_child_needs_attention, strG9);
                string26.getClass();
                String string27 = garminConnectMobileApp.getString(R.string.live_track_recipients);
                string27.getClass();
                x53.c cVar4 = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new r(string25, strG9, this, garminConnectMobileApp, cVar, string27, string26, null), 3);
                break;
            default:
                i2.a.b(a2Var, "ChildAccountsPushNotificationHandler", "Unknown push notification type");
                break;
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.ADMIN_GRANTED_CONSENT, n00.c.ADMIN_REVOKED_CONSENT, n00.c.ADMIN_APPROVAL_REQUEST_RECEIVED, n00.c.CHILD_REVOKED_CONSENT, n00.c.ADMIN_EMERGENCY_CONTACT_ACCEPT, n00.c.ADMIN_EMERGENCY_CONTACT_DECLINE, n00.c.ADMIN_EMERGENCY_CONTACT_REMOVAL, n00.c.ADMIN_LIVETRACK_CONTACT_REMOVAL, n00.c.ADMIN_LIVETRACK_CONTACT_ACCEPT, n00.c.ADMIN_LIVETRACK_CONTACT_DECLINE, n00.c.CHILD_DELETED_CONTACT, n00.c.CHILD_DELETED_EMERGENCY_SERVICE, n00.c.ADMIN_EMERGENCY_CALLING_CONTACT_REMOVAL, n00.c.ADMIN_CHILD_EMERGENCY_CONTACT_UNREACHABLE, n00.c.ADMIN_CHILD_LIVETRACK_CONTACT_UNREACHABLE};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.content.Intent] */
    public final void h(Context context, Bundle bundle, n00.c cVar, String str, int i14, int i15) {
        String string = bundle.getString("childId");
        if (string == null) {
            string = "";
        }
        String string2 = d53.w.i0(string).toString();
        String string3 = bundle.getString("childName");
        String string4 = d53.w.i0(string3 != null ? string3 : "").toString();
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        r0Var.f105810a = new Intent();
        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
        p005kotlin.jvm.internal.r0 r0Var3 = new p005kotlin.jvm.internal.r0();
        String string5 = context.getString(i14);
        string5.getClass();
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new c(string2, string4, this, str, r0Var2, context, r0Var, r0Var3, i15, cVar, string5, null), 3);
    }

    public final void i(Context context, Bundle bundle, n00.c cVar, pj1.l lVar, int i14) {
        String string = bundle.getString("contact-uuid");
        if (string == null) {
            string = "";
        }
        String string2 = d53.w.i0(string).toString();
        String strG = g("ec-first-name", "ec-last-name", bundle);
        String string3 = bundle.getString("contact-info-pk");
        long j8 = string3 != null ? Long.parseLong(string3) : 0L;
        String strG2 = g("child-first-name", "child-last-name", bundle);
        String string4 = bundle.getString("child-user-profile-pk");
        String string5 = d53.w.i0(string4 != null ? string4 : "").toString();
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new d(string5, strG2, this, context, string2, j8, lVar, i14, strG, cVar, null), 3);
    }

    public final void j(Context context, n00.c cVar, String str, String str2, String str3, String str4) {
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new e(str2, str, this, context, cVar, str3, str4, null), 3);
    }

    public final void k(Context context, Bundle bundle, n00.c cVar, int i14, int i15) {
        String strG = g("lt-first-name", "lt-last-name", bundle);
        String strG2 = g("child-first-name", "child-last-name", bundle);
        String string = bundle.getString("child-user-profile-pk");
        if (string == null) {
            string = "";
        }
        String string2 = d53.w.i0(string).toString();
        String string3 = cVar == n00.c.ADMIN_LIVETRACK_CONTACT_REMOVAL ? context.getString(i14, strG2, strG) : context.getString(i14, strG, strG2);
        String strD = p6.b.d(context, i15, string3);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new r(string2, strG2, this, context, cVar, strD, string3, null), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void l(Context context, Bundle bundle, n00.c cVar) {
        sz0.e eVar;
        Intent intent;
        String string;
        Intent intent2 = new Intent();
        String string2 = bundle.getString("consentType");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = d53.w.i0(string2).toString();
        String string4 = bundle.getString("adminName");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = d53.w.i0(string4).toString();
        int[] iArr = b.f155323a;
        int i14 = iArr[cVar.ordinal()];
        o13.p pVar = i14 != 1 ? i14 != 2 ? new o13.p("", 0) : new o13.p(context.getString(R.string.pn_permission_revoked_title), Integer.valueOf(R.string.pn_permission_revoked)) : new o13.p(context.getString(R.string.pn_permission_granted_title), Integer.valueOf(R.string.pn_permission_granted));
        A a14 = pVar.f128594a;
        a14.getClass();
        String str = (String) a14;
        int iIntValue = ((Number) pVar.f128595b).intValue();
        switch (string3) {
            case "DI_CONNECT_ADAPTIVE_TRAINING_PLAN":
                string = context.getString(R.string.lbl_adaptive_training_plan);
                intent = new Intent(context, (Class<?>) ActiveTrainingPlansActivity.class);
                eVar = sz0.e.f161382w;
                break;
            case "DI_CONNECT_LIVETRACK":
                string = context.getString(R.string.title_live_track);
                intent = new Intent(context, (Class<?>) LiveTrackActivity.class);
                eVar = sz0.e.f161376o;
                break;
            case "DI_CONNECT_AUTO_ACTIVITY_DETECTION":
                string = context.getString(R.string.lbl_auto_activity_detection);
                DataConsentActivity.a aVar = DataConsentActivity.f32169h;
                hl.a.c cVar2 = hl.a.c.f84256b;
                aVar.getClass();
                intent = DataConsentActivity.a.a(context, cVar2);
                eVar = sz0.e.P0;
                if (cVar == n00.c.ADMIN_GRANTED_CONSENT) {
                    iIntValue = R.string.pn_aad_permission_granted;
                }
                break;
            case "DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE":
                string = context.getString(R.string.gdpr_product_improvement);
                intent = new Intent(context, (Class<?>) ProductImprovementConsentActivity.class);
                intent.putExtra("extra_insights_redirect", 1);
                eVar = sz0.e.P0;
                break;
            case "DI_CONNECT_INSIGHTS":
                String string6 = context.getString(R.string.title_insights);
                int i15 = iArr[cVar.ordinal()];
                if (i15 == 1) {
                    intent2 = new Intent(context, (Class<?>) InsightsConsentActivity.class);
                    intent2.putExtra("extra_insights_redirect", 1).getClass();
                } else if (i15 != 2) {
                    a2 a2Var = a2.CHILD_ACCOUNTS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "ChildAccountsPushNotificationHandler", "Push Notification type is unknown");
                } else {
                    DataConsentActivity.a aVar2 = DataConsentActivity.f32169h;
                    hl.a.c cVar3 = hl.a.c.f84256b;
                    aVar2.getClass();
                    intent2 = DataConsentActivity.a.a(context, cVar3);
                }
                eVar = sz0.e.P0;
                intent = intent2;
                string = string6;
                break;
            case "DI_CONNECT_UPLOAD":
                string = context.getString(R.string.golf_lbl_storage_processing_consent_title);
                DataConsentActivity.a aVar3 = DataConsentActivity.f32169h;
                hl.a.c cVar4 = hl.a.c.f84256b;
                aVar3.getClass();
                intent = DataConsentActivity.a.a(context, cVar4);
                eVar = sz0.e.P0;
                break;
            default:
                eVar = null;
                intent = intent2;
                string = null;
                break;
        }
        String string7 = context.getString(iIntValue, string5, string);
        string7.getClass();
        PendingIntent pendingIntentC = j.c(context, intent);
        if (string3.equals("DI_CONNECT_AUTO_ACTIVITY_DETECTION") || (string3.equals("DI_CONNECT_UPLOAD") && cVar == n00.c.ADMIN_REVOKED_CONSENT)) {
            yr1.e.b("ChildAccountsPushNotificationHandler");
        }
        j.e(context, eVar, d(cVar), str, string7, pendingIntentC);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Ls00/n$a;", "", "<init>", "()V", "", "CHILD_ID", "Ljava/lang/String;", "CHILD_NAME", "ADMIN_NAME", "APPROVAL_ASSET_TYPE", "CONSENT_TYPE", "CONTACT_UUID", "EC_FIRST_NAME", "EC_LAST_NAME", "LT_FIRST_NAME", "LT_LAST_NAME", "CONTACT_INFO_PK", "CHILD_FIRST_NAME", "CHILD_LAST_NAME", "CHILD_USER_PROFILE_PK", "CONTACT_FIRST_NAME", "CONTACT_LAST_NAME", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

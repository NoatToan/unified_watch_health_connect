package z10;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.widget.TextView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz10/d1;", "", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f200951a = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q92.x[] f200952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q92.x[] f200953c;

    public interface a {
        void a();
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f200955b;

        static {
            int[] iArr = new int[q92.x.values().length];
            try {
                iArr[q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q92.x.DI_CONNECT_PRIVACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q92.x.DI_CONNECT_INSIGHTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q92.x.DI_CONNECT_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q92.x.DI_CONNECT_AI.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q92.x.DI_CONNECT_LIVETRACK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q92.x.DI_CONNECT_LIVETRACK_STRAVA_BEACON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f200954a = iArr;
            int[] iArr2 = new int[q92.b.values().length];
            try {
                iArr2[q92.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[q92.b.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[q92.b.HARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f200955b = iArr2;
        }
    }

    static {
        q92.x xVar = q92.x.DI_CONNECT_MYFITNESSPAL;
        f200952b = new q92.x[]{xVar, q92.x.DI_CONNECT_STRAVA};
        f200953c = new q92.x[]{q92.x.DI_CONNECT_UPLOAD, q92.x.DI_CONNECT_INSIGHTS, q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN, xVar, q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION};
    }

    private d1() {
    }

    public static final boolean a(q92.x xVar) {
        xVar.getClass();
        return f() && p13.u.z(f200953c, xVar);
    }

    public static final void b(Context context, a aVar) {
        context.getClass();
        if (!((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).A()) {
            aVar.a();
            return;
        }
        f200951a.getClass();
        androidx.fragment.app.m mVarC = c(context);
        if (mVarC == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ConsentUtil", "find activity and show consent dialog");
        u0.a aVar3 = u0.f201262b;
        androidx.fragment.app.v supportFragmentManager = mVarC.getSupportFragmentManager();
        supportFragmentManager.getClass();
        aVar3.getClass();
        u0 u0Var = new u0();
        u0Var.f201263a = aVar;
        u0Var.show(supportFragmentManager, "ConsentDialogFragment");
    }

    public static androidx.fragment.app.m c(Context context) {
        if (context instanceof androidx.fragment.app.m) {
            return (androidx.fragment.app.m) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return c(baseContext);
    }

    public static d20.c d(String str) {
        str.getClass();
        d20.c cVar = new d20.c();
        cVar.com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String = str;
        cVar.f();
        cVar.g(((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).getUserProfilePk());
        return cVar;
    }

    public static n0 e(Context context, q92.x xVar, hl.a aVar) {
        String string;
        String string2;
        context.getClass();
        xVar.getClass();
        aVar.getClass();
        int i14 = b.f200954a[xVar.ordinal()];
        if (i14 == 5) {
            String string3 = context.getString(R.string.title_are_you_sure);
            string3.getClass();
            if (aVar instanceof hl.a.b) {
                string = context.getString(R.string.msg_consent_data_storage_revoke_confirmation);
            } else {
                if (!aVar.equals(hl.a.c.f84256b)) {
                    lc.u0.r();
                    return null;
                }
                string = s3.b() ? context.getString(R.string.msg_consent_data_storage_revoke_confirmation) : context.getString(R.string.consent_data_storage_revoke_confirmation_msg);
            }
            String strD = p6.b.d(context, R.string.lbl_common_continue, string);
            String string4 = context.getString(R.string.lbl_cancel);
            string4.getClass();
            return new n0(string3, string, strD, string4);
        }
        if (i14 != 6) {
            if (i14 != 7) {
                return null;
            }
            String string5 = context.getString(R.string.title_are_you_sure);
            String strD2 = p6.b.d(context, R.string.we_cant_enable_active_intelligence_without_permission, string5);
            String string6 = context.getString(R.string.im_sure);
            return new n0(string5, strD2, string6, p6.b.d(context, R.string.lbl_cancel, string6));
        }
        String string7 = context.getString(R.string.msg_revoke_dialog_title);
        string7.getClass();
        if (aVar instanceof hl.a.b) {
            string2 = context.getString(R.string.msg_admin_revoke_child_consent_dialog);
        } else {
            if (!aVar.equals(hl.a.c.f84256b)) {
                lc.u0.r();
                return null;
            }
            string2 = context.getString(R.string.msg_revoke_dialog_message);
        }
        String strD3 = p6.b.d(context, R.string.lbl_common_continue, string2);
        String string8 = context.getString(R.string.lbl_cancel);
        string8.getClass();
        return new n0(string7, string2, strD3, string8);
    }

    public static final boolean f() {
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        lVarA.getClass();
        return lVarA.N().contains("ROLE_PARTIALLY_SUSPENDED");
    }

    public static boolean g(d20.a aVar) {
        if (aVar == null || aVar.getRequestedDateTimeUtc() == null) {
            return false;
        }
        DateTime dateTimeB = aVar.getRequestedDateTimeUtc();
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        dateTimeB.getClass();
        return Math.abs(Hours.hoursBetween(dateTimeB, dateTimeNow).getHours()) < 24;
    }

    public static final boolean h(q92.x xVar, boolean z14) {
        xVar.getClass();
        p92.o.f136619a.getClass();
        q92.v vVarN = p92.o.n(xVar);
        if (vVarN == null) {
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.p(com.garmin.android.apps.connectmobile.a2.CONSENT, "ConsentUtil", "isFeatureEnabled(" + xVar + ") -> ConsentStatus is null; returning default value " + z14);
            return z14;
        }
        int i14 = b.f200955b[vVarN.f143786d.ordinal()];
        if (i14 != 1) {
            if (i14 != 2 && i14 != 3) {
                lc.u0.r();
                return false;
            }
            if (q92.c.c(vVarN)) {
                return false;
            }
        } else if (!vVarN.b() && vVarN.f143785c == q92.u.CUSTOMER) {
            return false;
        }
        return true;
    }

    public static final boolean i(q92.x xVar) {
        xVar.getClass();
        p92.o.f136619a.getClass();
        q92.v vVarN = p92.o.n(xVar);
        return vVarN == null || vVarN.b();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[RETURN] */
    public static final boolean j(q92.x xVar) {
        xVar.getClass();
        if (f()) {
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.CONSENT, "ConsentUtil", "shouldPromptForConsent(" + xVar + ") -> ACCOUNT SUSPENDED return false");
            return false;
        }
        p92.o.f136619a.getClass();
        q92.v vVarN = p92.o.n(xVar);
        if (vVarN != null) {
            q92.u uVar = vVarN.f143785c;
            int i14 = b.f200955b[vVarN.f143786d.ordinal()];
            if (i14 != 1) {
                if (i14 != 2 && i14 != 3) {
                    lc.u0.r();
                    return false;
                }
                boolean z14 = !vVarN.b() && uVar == q92.u.DEFAULT;
                boolean z15 = !vVarN.b() && uVar == q92.u.ALERT;
                int i15 = b.f200954a[xVar.ordinal()];
                if (i15 == 2) {
                    List listK = p13.x.k(Locale.CHINA.getCountry(), Locale.KOREA.getCountry());
                    String upperCase = c22.b0.b(null).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    boolean zContains = listK.contains(upperCase);
                    boolean z16 = uVar == q92.u.EXPIRED;
                    if (zContains && z16) {
                        return true;
                    }
                } else if (i15 == 3) {
                    v0.f201271b.getClass();
                    long jB = v0.a.a().b(xVar);
                    if ((z15 || q92.c.d(vVarN)) && System.currentTimeMillis() - jB > 86400000) {
                        return true;
                    }
                } else if (i15 != 4) {
                    if (i15 != 5) {
                        return z14;
                    }
                    if (z14 || q92.c.d(vVarN)) {
                        return true;
                    }
                } else if (z14 && i(q92.x.DI_CONNECT_UPLOAD)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean k() {
        p92.o.f136619a.getClass();
        Boolean boolH = p92.o.m().h();
        return !(boolH != null ? boolH.booleanValue() : true);
    }

    public static void l(e23.a aVar, Context context) {
        context.getClass();
        f12.l.f68084a.getClass();
        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
        String str = gVarW0 != null ? gVarW0.f46858b : null;
        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.lbl_access_recently_requested));
        if (str == null) {
            str = "";
        }
        title.setMessage(context.getString(R.string.msg_access_recently_requested, str)).setPositiveButton(R.string.lbl_ok, new c32.a(aVar, 17)).create().show();
    }

    public static /* synthetic */ void m(d1 d1Var, Context context) {
        yx2.b bVar = new yx2.b(21);
        d1Var.getClass();
        l(bVar, context);
    }

    public static final void n(Context context, DialogInterface.OnClickListener onClickListener) {
        context.getClass();
        new androidx.appcompat.app.e.a(context).setCancelable(false).setTitle(R.string.title_try_again_later).setMessage(context.getString(R.string.msg_child_consent_unavailable_during_data_deletion)).setPositiveButton(context.getString(R.string.lbl_ok), onClickListener).create().show();
        bv.b.f21239a.getClass();
        ((kd0.m) bv.b.a()).r();
    }

    public static final void o(Context context, DialogInterface.OnClickListener onClickListener) {
        context.getClass();
        new androidx.appcompat.app.e.a(context).setCancelable(false).setTitle(R.string.title_try_again_later).setMessage(context.getString(R.string.consent_feature_action_unavailable_during_data_deletion)).setPositiveButton(context.getString(R.string.lbl_ok), onClickListener).create().show();
        bv.b.f21239a.getClass();
        ((kd0.m) bv.b.a()).r();
    }

    public static final void q(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        context.getClass();
        new androidx.appcompat.app.e.a(context).setCancelable(false).setTitle(R.string.gdpr_device_upload_alert_title).setMessage(context.getString(R.string.gdpr_device_upload_alert_msg)).setPositiveButton(context.getString(R.string.lbl_allow), onClickListener).setNegativeButton(context.getString(R.string.not_now_lbl), onClickListener2).create().show();
    }

    public static final boolean r() {
        if (k()) {
            v0.f201271b.getClass();
            if (v0.a.a().f201273a.getBoolean("gcm_consent_hide_my_day_key", false)) {
                return true;
            }
        }
        return false;
    }

    public static final void s(Context context) {
        context.getClass();
        new androidx.appcompat.app.e.a(context).setCancelable(false).setTitle(context.getString(R.string.lbl_reenter_password)).setMessage(context.getString(R.string.msg_something_went_wrong_reenter_password)).setPositiveButton(context.getString(R.string.lbl_ok), new xk1.v(15)).create().show();
    }

    public static void t(Context context, v92.i.b bVar, hl.a aVar) {
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        n0 n0VarE = e(context, bVar.f176395a, aVar);
        if (n0VarE != null) {
            new androidx.appcompat.app.e.a(context).setCancelable(false).setTitle(n0VarE.f201169a).setMessage(n0VarE.f201170b).setPositiveButton(n0VarE.f201171c, new xg1.l(bVar, 15)).setNegativeButton(n0VarE.f201172d, new xk1.v(16)).create().show();
        } else {
            bVar.f176397c.invoke(Boolean.TRUE);
        }
    }

    public static /* synthetic */ void u(d1 d1Var, Context context, v92.i.b bVar) {
        hl.a.c cVar = hl.a.c.f84256b;
        d1Var.getClass();
        t(context, bVar, cVar);
    }

    public static void v(e23.a aVar, Context context) {
        context.getClass();
        f12.l.f68084a.getClass();
        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
        String str = gVarW0 != null ? gVarW0.f46858b : null;
        TextView textView = new TextView(context);
        int dimensionPixelOffset = textView.getResources().getDimensionPixelOffset(R.dimen.spacing_large);
        int dimensionPixelOffset2 = textView.getResources().getDimensionPixelOffset(R.dimen.spacing_normal);
        textView.setText(context.getString(R.string.lbl_admin_consent_required));
        textView.setTextAppearance(R.style.Text_Title3);
        textView.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, 0);
        androidx.appcompat.app.e.a customTitle = new androidx.appcompat.app.e.a(context).setCustomTitle(textView);
        if (str == null) {
            str = "";
        }
        customTitle.setMessage(context.getString(R.string.msg_admin_consent_required, str)).setPositiveButton(context.getString(R.string.lbl_request_access), new c32.a(aVar, 15)).setNegativeButton(R.string.common_cancel, new xk1.v(13)).create().show();
    }

    public static final void w(Context context) {
        new androidx.appcompat.app.e.a(context).setCancelable(false).setTitle(context.getString(R.string.pregnancy_something_went_wrong)).setMessage(context.getString(R.string.msg_sorry_something_went_wrong)).setPositiveButton(context.getString(R.string.lbl_ok), new xk1.v(17)).create().show();
    }

    public static final void x(com.garmin.android.apps.connectmobile.c cVar, e23.a aVar) {
        cVar.getClass();
        aVar.getClass();
        new androidx.appcompat.app.e.a(cVar).setCancelable(false).setTitle(cVar.getString(R.string.pregnancy_something_went_wrong)).setMessage(cVar.getString(R.string.msg_too_many_retries_child_consent)).setPositiveButton(cVar.getString(R.string.lbl_close), new c32.a(aVar, 16)).create().show();
    }
}

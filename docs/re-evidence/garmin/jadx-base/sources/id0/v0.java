package id0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacySelectionActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lid0/v0;", "Lve0/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 implements ve0.b {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92953a;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177704d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177705e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92953a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // ve0.b
    public final Intent a(Context context, ue0.l lVar) {
        context.getClass();
        lVar.getClass();
        PrivacyPolicyConsentActivity.a aVar = PrivacyPolicyConsentActivity.f32218d;
        Long userId = lVar.getUserId();
        return PrivacyPolicyConsentActivity.a.b(aVar, context, new hl.a.b(userId != null ? userId.longValue() : 0L, lVar.getFullName(), lVar.A1(), null, 8, null), 12);
    }

    @Override // ve0.b
    public final void b(Activity activity) {
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a7.b.getColor(activity, R.color.gcm_text_primary) & FlexItem.MAX_SIZE)}, 1));
        LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, activity, 0, lc2.a.GARMIN_CONNECT_PRIVACY_POLICY, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, am.j.o(str, " !important;\n}", p6.b.i("body {\n    color: ", str, ";\n    background-color: ", String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & a7.b.getColor(activity, R.color.gcm_background_hero))}, 1)), ";\n }\np span {\n  color: ")), false, activity.getString(R.string.legal_host_app_name), 80);
    }

    @Override // ve0.b
    public final void c(Activity activity, ue0.l lVar) {
        lVar.getClass();
        ContactActivity.a aVar = ContactActivity.T;
        Long userId = lVar.getUserId();
        activity.startActivity(ContactActivity.a.a(aVar, activity, false, 0, null, 50, false, new hl.a.b(userId != null ? userId.longValue() : 0L, lVar.getFullName(), lVar.A1(), null, 8, null), 42));
    }

    @Override // ve0.b
    public final com.garmin.android.apps.connectmobile.l d() {
        com.garmin.android.apps.connectmobile.l lVarG = com.garmin.android.apps.connectmobile.l.g();
        lVarG.getClass();
        return lVarG;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e A[EDGE_INSN: B:70:0x013e->B:76:0x015a BREAK  A[LOOP:1: B:72:0x0144->B:91:?]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:89:0x013e A[SYNTHETIC] */
    @Override // ve0.b
    public final Object e(long j8, v13.c cVar) throws Throwable {
        w0 w0Var;
        p005kotlin.jvm.internal.m0 m0Var;
        p005kotlin.jvm.internal.m0 m0Var2;
        Object objM;
        p005kotlin.jvm.internal.m0 m0Var3;
        p005kotlin.jvm.internal.m0 m0Var4;
        boolean z14;
        boolean z15;
        List list;
        ArrayList arrayList;
        Iterator it;
        q92.x xVar;
        long j14 = j8;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f92969f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f92969f = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object obj = w0Var.f92967d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f92969f;
        boolean z16 = true;
        boolean z17 = false;
        if (i15 == 0) {
            o13.r.b(obj);
            m0Var = new p005kotlin.jvm.internal.m0();
            m0Var2 = new p005kotlin.jvm.internal.m0();
            re0.o oVar = (re0.o) KoinJavaComponent.get$default(re0.o.class, null, null, 6, null);
            w0Var.f92965b = m0Var;
            w0Var.f92966c = m0Var2;
            w0Var.f92964a = j14;
            w0Var.f92969f = 1;
            objM = oVar.m(j14, w0Var);
            if (objM != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j14 = w0Var.f92964a;
            m0Var2 = w0Var.f92966c;
            p005kotlin.jvm.internal.m0 m0Var5 = w0Var.f92965b;
            o13.r.b(obj);
            objM = obj;
            m0Var = m0Var5;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var4 = w0Var.f92966c;
            m0Var3 = w0Var.f92965b;
            o13.r.b(obj);
        }
        list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                xVar = ((q92.v) obj2).f143783a;
                if (xVar == q92.x.DI_CONNECT_LIVETRACK || m0Var3.f105804a) {
                    if (xVar == q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION || m0Var4.f105804a) {
                        arrayList.add(obj2);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                z16 = false;
                break;
            }
            it = arrayList.iterator();
            do {
                if (it.hasNext()) {
                    z16 = false;
                    break;
                }
            } while (!com.garmin.android.apps.connectmobile.consent.e.f32282a.contains(((q92.v) it.next()).f143783a));
            z17 = z16;
        }
        return Boolean.valueOf(z17);
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objM;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            Iterable iterable = (Iterable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            boolean z18 = iterable instanceof Collection;
            if (z18 && ((Collection) iterable).isEmpty()) {
                z14 = false;
            } else {
                Iterator it3 = iterable.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        ue0.h hVar = (ue0.h) it3.next();
                        Boolean liveTrackCapable = hVar.getLiveTrackCapable();
                        Boolean bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(liveTrackCapable, bool) || p005kotlin.jvm.internal.s.g(hVar.getIncidentDetectionCapable(), bool)) {
                            z14 = true;
                        }
                    } else {
                        z14 = false;
                    }
                }
            }
            m0Var.f105804a = z14;
            if (!z18 || !((Collection) iterable).isEmpty()) {
                Iterator it4 = iterable.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z15 = false;
                        break;
                    }
                    if (p005kotlin.jvm.internal.s.g(((ue0.h) it4.next()).getPendingActivityCapable(), Boolean.TRUE)) {
                        z15 = true;
                        break;
                    }
                }
            } else {
                z15 = false;
                break;
            }
            m0Var2.f105804a = z15;
        } else if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
            lc.u0.r();
            return null;
        }
        p92.o oVar2 = p92.o.f136619a;
        s92.l lVar = new s92.l(String.valueOf(j14));
        w0Var.f92965b = m0Var;
        w0Var.f92966c = m0Var2;
        w0Var.f92964a = j14;
        w0Var.f92969f = 2;
        Object objJ = oVar2.j(true, lVar, w0Var);
        if (objJ != aVar) {
            m0Var3 = m0Var;
            obj = objJ;
            m0Var4 = m0Var2;
            list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    xVar = ((q92.v) obj2).f143783a;
                    if (xVar == q92.x.DI_CONNECT_LIVETRACK) {
                    }
                    if (xVar == q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION) {
                    }
                    arrayList.add(obj2);
                }
                if (arrayList.isEmpty()) {
                    z16 = false;
                    break;
                }
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        z16 = false;
                        break;
                    }
                } while (!com.garmin.android.apps.connectmobile.consent.e.f32282a.contains(((q92.v) it.next()).f143783a));
                z17 = z16;
            }
            return Boolean.valueOf(z17);
        }
        return aVar;
    }

    @Override // ve0.b
    public final Intent f(Context context, ue0.l lVar) {
        context.getClass();
        lVar.getClass();
        LiveTrackActivity.a aVar = LiveTrackActivity.f38637g;
        bv0.a.q qVar = bv0.a.q.INSTANCE;
        Long userId = lVar.getUserId();
        hl.a.b bVar = new hl.a.b(userId != null ? userId.longValue() : 0L, lVar.getFullName(), lVar.A1(), null, 8, null);
        aVar.getClass();
        return LiveTrackActivity.a.a(context, qVar, bVar);
    }

    @Override // ve0.b
    public final Intent g(Context context, ue0.l lVar) {
        lVar.getClass();
        DataConsentActivity.a aVar = DataConsentActivity.f32169h;
        Long userId = lVar.getUserId();
        hl.a.b bVar = new hl.a.b(userId != null ? userId.longValue() : 0L, lVar.getFullName(), lVar.A1(), null, 8, null);
        aVar.getClass();
        return DataConsentActivity.a.a(context, bVar);
    }

    @Override // ve0.b
    public final Intent h(Context context, hl.a.b bVar) {
        context.getClass();
        ChildConsentsFlowActivity.f32139f.getClass();
        Intent intent = new Intent(context, (Class<?>) ChildConsentsFlowActivity.class);
        intent.putExtra("GCM_extra_screen_access_role", bVar);
        return intent;
    }

    @Override // ve0.b
    public final Intent i(Activity activity, ue0.l lVar) {
        lVar.getClass();
        SafetyFeatureSetupWizardActivity.a aVar = SafetyFeatureSetupWizardActivity.f43851k;
        Long userId = lVar.getUserId();
        hl.a.b bVar = new hl.a.b(userId != null ? userId.longValue() : 0L, lVar.getFullName(), lVar.A1(), null, 8, null);
        aVar.getClass();
        return SafetyFeatureSetupWizardActivity.a.a(activity, bVar);
    }

    @Override // ve0.b
    public final Intent j(Context context, nj1.b bVar, ue0.l lVar) {
        context.getClass();
        lVar.getClass();
        ActivitiesPrivacySelectionActivity.a aVar = ActivitiesPrivacySelectionActivity.f47091b;
        Long userId = lVar.getUserId();
        hl.a.b bVar2 = new hl.a.b(userId != null ? userId.longValue() : 0L, lVar.getFullName(), lVar.A1(), null, 8, null);
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) ActivitiesPrivacySelectionActivity.class);
        intent.putExtra("GCM_extra_privacy_type", bVar);
        intent.putExtra("GCM_extra_screen_access_role", bVar2);
        return intent;
    }

    @Override // ve0.b
    public final String k() {
        int i14 = b.f92953a[((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? "https://www.dev.garmin.com/en-US/account/profile/family" : "https://www-dev.china.garmin.com/en-US/account/profile/family";
        }
        return "https://www.garmin.com/en-US/account/profile/family";
    }

    @Override // ve0.b
    public final void l(Activity activity) {
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a7.b.getColor(activity, R.color.gcm_text_primary) & FlexItem.MAX_SIZE)}, 1));
        LegalGatewayActivity.a.b(LegalGatewayActivity.f49928n, activity, 0, lc2.a.APP_EULA, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, am.j.o(str, " !important;\n}", p6.b.i("body {\n    color: ", str, ";\n    background-color: ", String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & a7.b.getColor(activity, R.color.gcm_background_hero))}, 1)), ";\n }\np span {\n  color: ")), false, activity.getString(R.string.legal_page_eula), 80);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ve0.b
    public final Object m(long j8, String str, v13.c cVar) {
        x0 x0Var;
        Object next;
        aq1.a aVar;
        String strName;
        String upperCase;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f92981d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f92981d = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objK = x0Var.f92979b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f92981d;
        if (i15 == 0) {
            o13.r.b(objK);
            if (str == null || str.length() == 0) {
                return Boolean.FALSE;
            }
            w13.c cVar2 = aq1.a.f12344b;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
                strName = ((aq1.a) next).name();
                upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } while (!p005kotlin.jvm.internal.s.g(strName, upperCase));
            aq1.a aVar3 = (aq1.a) next;
            if (aVar3 == null) {
                return Boolean.FALSE;
            }
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_PRIVACY;
            s92.l lVar = new s92.l(String.valueOf(j8));
            x0Var.f92978a = aVar3;
            x0Var.f92981d = 1;
            objK = oVar.k(xVar, lVar, x0Var);
            if (objK == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = x0Var.f92978a;
            o13.r.b(objK);
        }
        q92.v vVar = (q92.v) objK;
        return vVar == null ? Boolean.FALSE : Boolean.valueOf(aVar.b(vVar));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lid0/v0$a;", "", "<init>", "()V", "", "ACCOUNT_ADMINISTRATION_URL_PROD", "Ljava/lang/String;", "ACCOUNT_ADMINISTRATION_URL_CHINA", "ACCOUNT_ADMINISTRATION_URL_DEV", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

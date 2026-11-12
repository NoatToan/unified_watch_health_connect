package af2;

import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.library.mobileauth.ui.DeleteAccountActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity;
import o53.f0;
import o53.s0;
import r22.p0;
import re2.g0;
import te2.j2;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3114b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f3113a = i14;
        this.f3114b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i14 = this.f3113a;
        Object obj = this.f3114b;
        switch (i14) {
            case 0:
                c cVar = (c) obj;
                c.Companion companion = c.INSTANCE;
                g0.c(new a03.e(cVar, 4), cVar);
                break;
            case 1:
                ((BLEScanningActivity) obj).f34423m = null;
                break;
            case 2:
                MenstrualCycleDetailsActivity.a aVar = MenstrualCycleDetailsActivity.f38784t;
                ((MenstrualCycleDetailsActivity) obj).ua();
                break;
            case 3:
                SafetyFeaturesActivity.a aVar2 = SafetyFeaturesActivity.f43691f;
                ((p0) obj).dismissAllowingStateLoss();
                break;
            case 4:
                Context context = (Context) obj;
                j2 j2Var = j2.f164115a;
                context.getClass();
                j2Var.getClass();
                j2.j(context);
                break;
            case 5:
                int i15 = DeleteAccountActivity.f50391q;
                ((DeleteAccountActivity) obj).W9(0);
                break;
            case 6:
                MobileAuthAbstractWebFrag.showWebViewError$lambda$15$lambda$14((MobileAuthAbstractWebFrag) obj, dialogInterface);
                break;
            case 7:
                com.garmin.android.library.mobileauth.ui.mfa.a aVar3 = (com.garmin.android.library.mobileauth.ui.mfa.a) obj;
                i0 i0VarW = f0.w(aVar3);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(i0VarW, o.f168762a, null, new ze2.a.C3812a(aVar3, null), 2);
                break;
            default:
                MFAPortalFlowActivity mFAPortalFlowActivity = (MFAPortalFlowActivity) obj;
                i0 i0VarW2 = f0.w(mFAPortalFlowActivity);
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(i0VarW2, o.f168762a, null, new MFAPortalFlowActivity.b.a(mFAPortalFlowActivity, null), 2);
                break;
        }
    }
}

package z10;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrivacyPolicyConsentActivity f201125b;

    public /* synthetic */ l2(PrivacyPolicyConsentActivity privacyPolicyConsentActivity, int i14) {
        this.f201124a = i14;
        this.f201125b = privacyPolicyConsentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        q92.x xVar;
        int i14 = this.f201124a;
        Object obj = null;
        PrivacyPolicyConsentActivity privacyPolicyConsentActivity = this.f201125b;
        switch (i14) {
            case 0:
                PrivacyPolicyConsentActivity.a aVar = PrivacyPolicyConsentActivity.f32218d;
                privacyPolicyConsentActivity.setResult(-1);
                privacyPolicyConsentActivity.onBackPressed();
                return Unit.INSTANCE;
            case 1:
                PrivacyPolicyConsentActivity.a aVar2 = PrivacyPolicyConsentActivity.f32218d;
                Bundle extras = privacyPolicyConsentActivity.getIntent().getExtras();
                if (extras != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                    } else {
                        Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                        parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                    }
                    hl.a aVar3 = (hl.a) parcelable;
                    if (aVar3 != null) {
                        return aVar3;
                    }
                }
                return hl.a.c.f84256b;
            case 2:
                PrivacyPolicyConsentActivity.a aVar4 = PrivacyPolicyConsentActivity.f32218d;
                for (Object obj2 : q92.x.C) {
                    q92.x xVar2 = (q92.x) obj2;
                    Bundle extras2 = privacyPolicyConsentActivity.getIntent().getExtras();
                    if (p005kotlin.jvm.internal.s.g(extras2 != null ? extras2.getString("consentType") : null, xVar2.name())) {
                        obj = obj2;
                        xVar = (q92.x) obj;
                        if (xVar == null) {
                            return q92.x.DI_CONNECT_PRIVACY;
                        }
                        return xVar;
                    }
                }
                xVar = (q92.x) obj;
                if (xVar == null) {
                    return q92.x.DI_CONNECT_PRIVACY;
                }
                return xVar;
            default:
                PrivacyPolicyConsentActivity.a aVar5 = PrivacyPolicyConsentActivity.f32218d;
                Intent intent = new Intent();
                intent.putExtra("GCM_extra_privacy_policy_declined", true);
                privacyPolicyConsentActivity.setResult(0, intent);
                privacyPolicyConsentActivity.onBackPressed();
                return Unit.INSTANCE;
        }
    }
}

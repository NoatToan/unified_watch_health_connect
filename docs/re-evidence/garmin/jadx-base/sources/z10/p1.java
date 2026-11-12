package z10;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataConsentActivity f201202b;

    public /* synthetic */ p1(DataConsentActivity dataConsentActivity, int i14) {
        this.f201201a = i14;
        this.f201202b = dataConsentActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        Object serializableExtra;
        int i14 = this.f201201a;
        Object obj = null;
        DataConsentActivity dataConsentActivity = this.f201202b;
        switch (i14) {
            case 0:
                DataConsentActivity.a aVar = DataConsentActivity.f32169h;
                Bundle extras = dataConsentActivity.getIntent().getExtras();
                if (extras != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                    } else {
                        Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                        parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                    }
                    hl.a aVar2 = (hl.a) parcelable;
                    if (aVar2 != null) {
                        return aVar2;
                    }
                }
                return hl.a.c.f84256b;
            case 1:
                DataConsentActivity.a aVar3 = DataConsentActivity.f32169h;
                Intent intent = dataConsentActivity.getIntent();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent != null ? intent.getSerializableExtra("extra_direct_consent_type", String.class) : null;
                } else {
                    Object serializableExtra2 = intent != null ? intent.getSerializableExtra("extra_direct_consent_type") : null;
                    if (!(serializableExtra2 instanceof String)) {
                        serializableExtra2 = null;
                    }
                    serializableExtra = (String) serializableExtra2;
                }
                String str = (String) serializableExtra;
                if (str == null) {
                    return null;
                }
                com.garmin.android.apps.connectmobile.consent.d.f32264f.getClass();
                for (Object obj2 : com.garmin.android.apps.connectmobile.consent.d.f32276r) {
                    if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.consent.d) obj2).f32277a, str)) {
                        obj = obj2;
                        return (com.garmin.android.apps.connectmobile.consent.d) obj;
                    }
                }
                return (com.garmin.android.apps.connectmobile.consent.d) obj;
            default:
                DataConsentActivity.a aVar4 = DataConsentActivity.f32169h;
                dataConsentActivity.onBackPressed();
                return Unit.INSTANCE;
        }
    }
}

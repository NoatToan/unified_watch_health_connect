package com.huami.watch.companion.agreement;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.huami.watch.companion.agreement.bean.AgreementType;
import com.huami.watch.companion.agreement.bean.AgreementVersion;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AgreementManager {
    private static final String a = "Agreement-Manager";

    public static void clear() {
        Log.d(a, "clear all agreement version data", new Object[0]);
        for (AgreementType agreementType : AgreementType.values()) {
            Box.removeAgreementVersion(agreementType.getType());
        }
    }

    public static AgreementVersion get(AgreementType agreementType) {
        String agreementVersion = Box.getAgreementVersion(agreementType.getType());
        Log.d(a, "Get Agreement <" + agreementType + "> : " + agreementVersion, new Object[0]);
        if (TextUtils.isEmpty(agreementVersion)) {
            return null;
        }
        try {
            return (AgreementVersion) new Gson().fromJson(agreementVersion, AgreementVersion.class);
        } catch (Exception e) {
            Log.e(a, "GetAgreementErr", e, new Object[0]);
            return null;
        }
    }

    public static String getAgreementCountry(AgreementType agreementType) {
        AgreementVersion agreementVersion = get(agreementType);
        String country = agreementVersion == null ? "" : agreementVersion.getCountry();
        Log.d(a, "agreement country <" + country + "> :" + agreementType, new Object[0]);
        return country;
    }

    public static boolean isAgree(AgreementType agreementType) {
        AgreementVersion agreementVersion = get(agreementType);
        boolean z = agreementVersion != null && agreementVersion.isAgree();
        Log.d(a, "Is <" + agreementType + "> Agree : " + agreementType, new Object[0]);
        return z;
    }

    public static void save(AgreementVersion agreementVersion) {
        Log.d(a, "Save Agreement : " + agreementVersion, new Object[0]);
        if (agreementVersion == null) {
            return;
        }
        Box.putAgreementVersion(agreementVersion.getType(), agreementVersion.toString());
    }

    public static void saveAll(@NonNull List<AgreementVersion> list) {
        Iterator<AgreementVersion> it2 = list.iterator();
        while (it2.hasNext()) {
            save(it2.next());
        }
    }

    public static void save(@NonNull AgreementVersion agreementVersion, boolean z) {
        Object[] objArr = new Object[2];
        objArr[0] = z ? "agree" : "reject";
        objArr[1] = agreementVersion.getType();
        Log.d(a, "user %s %s", objArr);
        agreementVersion.setSynced(false);
        agreementVersion.setAgree(z);
        save(agreementVersion);
    }
}

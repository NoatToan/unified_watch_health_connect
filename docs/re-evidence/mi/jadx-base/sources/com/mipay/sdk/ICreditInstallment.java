package com.mipay.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface ICreditInstallment {
    void pay(Activity activity, String str, Bundle bundle);

    void pay(Fragment fragment, String str, Bundle bundle);
}

package com.miui.tsmclient.util;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class NfcFeatureImpl implements INfcFeature {
    public NfcFeatureImpl(Context context) {
    }

    @Override // com.miui.tsmclient.util.INfcFeature
    public boolean isSupportNfc() {
        return true;
    }
}

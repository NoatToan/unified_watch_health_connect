package com.miui.tsmclient.sesdk.easycard;

import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.sesdk.easycard.net.EasyCardTsmAuthManager;

/* JADX INFO: loaded from: classes6.dex */
public class EasyCardClient extends f {
    public EasyCardClient() {
        this.mSeiTsmAuthManager = new EasyCardTsmAuthManager();
    }
}

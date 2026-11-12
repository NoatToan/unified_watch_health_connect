package com.xiaomi.ai;

import com.xiaomi.ai.mibrain.GetAnonymousAuthorizationInterface;

/* JADX INFO: loaded from: classes18.dex */
class h implements GetAnonymousAuthorizationInterface {
    public final /* synthetic */ c a;

    public h(c cVar) {
        this.a = cVar;
    }

    @Override // com.xiaomi.ai.mibrain.GetAnonymousAuthorizationInterface
    public void onGetAnonymousAuthorization(String str) {
        this.a.v = str;
    }
}

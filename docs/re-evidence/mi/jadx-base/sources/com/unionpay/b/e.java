package com.unionpay.b;

import com.unionpay.UPSEInfoResp;
import com.unionpay.tsmservice.mini.UPTsmAddonMini;

/* JADX INFO: loaded from: classes6.dex */
final class e implements UPTsmAddonMini.UPTsmConnectionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f10758a;

    public e(b bVar) {
        this.f10758a = bVar;
    }

    @Override // com.unionpay.tsmservice.mini.UPTsmAddonMini.UPTsmConnectionListener
    public final void onTsmConnected() {
        com.unionpay.utils.j.c("uppay", "TsmService connected.");
        this.f10758a.b();
    }

    @Override // com.unionpay.tsmservice.mini.UPTsmAddonMini.UPTsmConnectionListener
    public final void onTsmDisconnected() {
        com.unionpay.utils.j.c("uppay", "TsmService disconnected.");
        b bVar = this.f10758a;
        bVar.a(bVar.d, this.f10758a.e, UPSEInfoResp.ERROR_NONE, "Tsm service disconnect");
    }
}

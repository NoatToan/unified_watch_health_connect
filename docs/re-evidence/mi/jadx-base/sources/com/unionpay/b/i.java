package com.unionpay.b;

import com.unionpay.UPSEInfoResp;
import com.unionpay.tsmservice.mi.mini.UPTsmAddonMini;

/* JADX INFO: loaded from: classes6.dex */
final class i implements UPTsmAddonMini.UPTsmConnectionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f10763a;

    public i(g gVar) {
        this.f10763a = gVar;
    }

    @Override // com.unionpay.tsmservice.mi.mini.UPTsmAddonMini.UPTsmConnectionListener
    public final void onTsmConnected() {
        com.unionpay.utils.j.c("uppay", "mi TsmService connected.");
        this.f10763a.b();
    }

    @Override // com.unionpay.tsmservice.mi.mini.UPTsmAddonMini.UPTsmConnectionListener
    public final void onTsmDisconnected() {
        com.unionpay.utils.j.c("uppay", "mi TsmService disconnected.");
        g gVar = this.f10763a;
        gVar.a(gVar.d, this.f10763a.e, UPSEInfoResp.ERROR_NONE, "Tsm service disconnect");
    }
}

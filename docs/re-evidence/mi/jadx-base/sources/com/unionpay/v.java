package com.unionpay;

import com.unionpay.utils.UPUtils;

/* JADX INFO: loaded from: classes6.dex */
final class v implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10820a;

    public v(UPPayWapActivity uPPayWapActivity) {
        this.f10820a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        String strA = UPUtils.a(this.f10820a, str);
        if (afVar != null) {
            afVar.a(UPPayWapActivity.b("0", "success", strA));
        }
    }
}

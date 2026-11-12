package com.unionpay;

import com.unionpay.utils.UPUtils;

/* JADX INFO: loaded from: classes6.dex */
final class w implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10821a;

    public w(UPPayWapActivity uPPayWapActivity) {
        this.f10821a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        UPUtils.b(this.f10821a, str);
        if (afVar != null) {
            afVar.a(UPPayWapActivity.b("0", "success", (String) null));
        }
    }
}

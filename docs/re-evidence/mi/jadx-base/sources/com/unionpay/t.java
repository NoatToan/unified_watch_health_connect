package com.unionpay;

/* JADX INFO: loaded from: classes6.dex */
final class t implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10784a;

    public t(UPPayWapActivity uPPayWapActivity) {
        this.f10784a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        String strA = UPPayAssistEx.a(this.f10784a);
        if (afVar != null) {
            afVar.a(UPPayWapActivity.b("0", "success", strA));
        }
    }
}

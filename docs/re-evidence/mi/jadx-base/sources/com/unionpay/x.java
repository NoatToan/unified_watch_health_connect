package com.unionpay;

/* JADX INFO: loaded from: classes6.dex */
final class x implements ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f10822a;

    public x(UPPayWapActivity uPPayWapActivity) {
        this.f10822a = uPPayWapActivity;
    }

    @Override // com.unionpay.ae
    public final void a(String str, af afVar) {
        UPPayWapActivity.a(this.f10822a, Boolean.parseBoolean(str));
        if (afVar != null) {
            afVar.a(UPPayWapActivity.b("0", "success", (String) null));
        }
    }
}

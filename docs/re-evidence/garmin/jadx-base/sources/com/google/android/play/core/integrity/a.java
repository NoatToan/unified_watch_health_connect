package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes14.dex */
final class a extends ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f53272b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f53272b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f53271a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f53271a;
        if (str != null && (yVar = this.f53272b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.f53271a == null) {
            sb3.append(" token");
        }
        if (this.f53272b == null) {
            sb3.append(" integrityDialogWrapper");
        }
        vb.h.z("Missing required properties:".concat(sb3.toString()));
        return null;
    }
}

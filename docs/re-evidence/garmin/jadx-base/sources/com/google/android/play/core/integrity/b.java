package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes14.dex */
final class b extends bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f53325b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f53325b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str != null) {
            this.f53324a = str;
            return this;
        }
        j20.x.l("Null token");
        return null;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f53324a;
        if (str != null && (yVar = this.f53325b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.f53324a == null) {
            sb3.append(" token");
        }
        if (this.f53325b == null) {
            sb3.append(" integrityDialogWrapper");
        }
        vb.h.z("Missing required properties:".concat(sb3.toString()));
        return null;
    }
}

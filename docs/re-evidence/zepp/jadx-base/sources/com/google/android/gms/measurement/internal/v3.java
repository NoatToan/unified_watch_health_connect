package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class v3 implements q {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzks b;

    public v3(zzks zzksVar, String str) {
        this.b = zzksVar;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.q
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.j(i, th, bArr, this.a);
    }
}

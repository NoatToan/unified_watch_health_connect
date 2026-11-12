package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class nht extends xdt {
    public long d;
    public int e;

    public nht(long j, int i) {
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.HR;
    }

    public String toString() {
        return "HrData{timestamp=" + this.d + ", hr=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}

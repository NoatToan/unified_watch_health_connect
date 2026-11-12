package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class rbc implements uzc, iwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32377b;
    public int c;

    @Override // defpackage.iwc
    public float b() {
        return this.c;
    }

    @Override // defpackage.uzc
    public long getTimestamp() {
        return this.f32376a;
    }

    public String toString() {
        return "HrData{timestamp=" + this.f32376a + ", hrm=" + this.f32377b + ", x=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}

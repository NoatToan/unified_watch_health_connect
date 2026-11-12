package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class bht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4235b;
    public int c;
    public int d;

    public bht(int i, int i2) {
        this.c = 0;
        this.d = 1;
        this.f4234a = i;
        this.f4235b = i2;
    }

    public String toString() {
        return "HMSpeechEvent{type=" + this.f4234a + ", ctrl=" + this.f4235b + ", id=" + this.c + ", result=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public bht(int i, int i2, int i3) {
        this.f4235b = 1;
        this.f4234a = i;
        this.c = i2;
        this.d = i3;
    }
}

package defpackage;

import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class f4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Calendar f17406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17407b;
    public int c;
    public byte[] d;

    public f4s() {
        this.f17406a = Calendar.getInstance();
        this.f17407b = 0;
        this.c = 1;
    }

    public int a() {
        int i = this.c;
        if (i == 1) {
            return 0;
        }
        if (i == 7) {
            return 5;
        }
        if (i == 48) {
            return 6;
        }
        return i == 49 ? 7 : 100;
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        byte[] bArr = this.d;
        return (bArr == null || bArr.length == 0 || bArr[0] != 1) ? false : true;
    }

    public boolean d() {
        return this.c == 1;
    }

    public String toString() {
        return "DataHeader{calendar=" + this.f17406a.getTime().toString() + ", size=" + this.f17407b + ", error=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public f4s(int i) {
        this.f17406a = Calendar.getInstance();
        this.f17407b = 0;
        this.c = i;
    }
}

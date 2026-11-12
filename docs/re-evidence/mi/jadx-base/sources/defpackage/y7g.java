package defpackage;

import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class y7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39891b;
    public int c;

    public y7g(Calendar calendar) {
        this.f39890a = calendar.get(1);
        this.f39891b = calendar.get(2);
        this.c = calendar.getActualMaximum(5);
    }

    public int a() {
        return this.f39891b;
    }

    public int b() {
        return this.f39890a;
    }

    public String toString() {
        return "MonthInfo{mYear=" + this.f39890a + ", mMonth=" + this.f39891b + ", mDayNum=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}

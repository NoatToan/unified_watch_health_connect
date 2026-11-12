package defpackage;

import com.google.typography.font.sfntly.table.core.FontHeaderTable;

/* JADX INFO: loaded from: classes5.dex */
public class q9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final apr f31259a = apr.C(54);

    public jgj a() {
        return this.f31259a;
    }

    public void b(FontHeaderTable fontHeaderTable) {
        if (fontHeaderTable == null) {
            throw new IllegalArgumentException("source table must not be null");
        }
        fontHeaderTable.f().A(0, 54).j(this.f31259a);
    }
}

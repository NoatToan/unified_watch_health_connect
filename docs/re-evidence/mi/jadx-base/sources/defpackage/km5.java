package defpackage;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class km5 implements Comparable<km5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23979b;
    public int c;
    public String d;
    public int e;
    public DailyBasicReport h;
    public SportBasicReport i;
    public int f = 0;
    public int g = 1;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23980k = 0;
    public boolean l = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(km5 km5Var) {
        int i = this.e - km5Var.e;
        return i == 0 ? km5Var.f - this.f : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        km5 km5Var = (km5) obj;
        return this.f23978a == km5Var.f23978a && this.f23979b == km5Var.f23979b && this.c == km5Var.c && this.e == km5Var.e && this.f == km5Var.f && this.g == km5Var.g && this.f23980k == km5Var.f23980k && this.l == km5Var.l && this.d.equals(km5Var.d) && this.h.equals(km5Var.h) && this.i.equals(km5Var.i);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f23978a), Integer.valueOf(this.f23979b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), this.h, this.i, Integer.valueOf(this.f23980k), Boolean.valueOf(this.l));
    }

    public String toString() {
        return "DataModel{type=" + this.f23979b + ", dataSortId=" + this.e + ", report " + this.h + ", sportReport" + this.i + ", todayHealthValue" + this.j + AbstractJsonLexerKt.END_OBJ;
    }
}

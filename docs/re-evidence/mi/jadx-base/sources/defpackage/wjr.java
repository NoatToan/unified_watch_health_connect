package defpackage;

import com.xiaomi.fitness.devicesettings.utils.SportInfoUtil;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public final class wjr implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38042b;
    public boolean c;
    public int d = -1;
    public int e = -1;
    public int f;

    public wjr() {
        b();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wjr clone() throws CloneNotSupportedException {
        return (wjr) super.clone();
    }

    public void b() {
        this.f = -1;
        this.f38041a = -1;
        this.c = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wjr.class != obj.getClass()) {
            return false;
        }
        wjr wjrVar = (wjr) obj;
        return this.f38041a == wjrVar.f38041a && this.f == wjrVar.f;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f38041a), Integer.valueOf(this.f));
    }

    public String toString() {
        return "WidgetSportListEntity{sportType=" + this.f38041a + ", title='" + this.f38042b + "', isAdded=" + this.c + ", widgetItemStyle=" + this.d + ", widgetItemIndex=" + this.e + ", subType=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    public wjr(int i, int i2) {
        this.f = i;
        this.f38041a = i2;
        this.f38042b = SportInfoUtil.getName(i2);
    }
}

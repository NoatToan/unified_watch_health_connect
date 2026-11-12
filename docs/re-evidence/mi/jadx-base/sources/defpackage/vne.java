package defpackage;

import android.os.LocaleList;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class vne {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vne f37061b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wne f37062a;

    @RequiresApi(24)
    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public vne(wne wneVar) {
        this.f37062a = wneVar;
    }

    public static vne a(Locale... localeArr) {
        return e(a.a(localeArr));
    }

    @Size(min = 1)
    public static vne c() {
        return e(a.c());
    }

    @RequiresApi(24)
    public static vne e(LocaleList localeList) {
        return new vne(new xne(localeList));
    }

    public Locale b(int i) {
        return this.f37062a.get(i);
    }

    @IntRange(from = 0)
    public int d() {
        return this.f37062a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof vne) && this.f37062a.equals(((vne) obj).f37062a);
    }

    public int hashCode() {
        return this.f37062a.hashCode();
    }

    public String toString() {
        return this.f37062a.toString();
    }
}

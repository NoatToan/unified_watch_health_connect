package defpackage;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class wsh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f38311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f38312b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    @RequiresApi(22)
    public static class a {
        public static wsh a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString(SportRecordBundleKey.BUNDLE_PARAM_URI)).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).d(persistableBundle.getBoolean("isImportant")).a();
        }

        public static PersistableBundle b(wsh wshVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = wshVar.f38311a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, wshVar.c);
            persistableBundle.putString("key", wshVar.d);
            persistableBundle.putBoolean("isBot", wshVar.e);
            persistableBundle.putBoolean("isImportant", wshVar.f);
            return persistableBundle;
        }
    }

    @RequiresApi(28)
    public static class b {
        public static wsh a(Person person) {
            return new c().f(person.getName()).c(person.getIcon() != null ? IconCompat.b(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        public static Person b(wsh wshVar) {
            return new Person.Builder().setName(wshVar.c()).setIcon(wshVar.a() != null ? wshVar.a().u() : null).setUri(wshVar.d()).setKey(wshVar.b()).setBot(wshVar.e()).setImportant(wshVar.f()).build();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f38313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f38314b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;

        public wsh a() {
            return new wsh(this);
        }

        public c b(boolean z) {
            this.e = z;
            return this;
        }

        public c c(IconCompat iconCompat) {
            this.f38314b = iconCompat;
            return this;
        }

        public c d(boolean z) {
            this.f = z;
            return this;
        }

        public c e(String str) {
            this.d = str;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.f38313a = charSequence;
            return this;
        }

        public c g(String str) {
            this.c = str;
            return this;
        }
    }

    public wsh(c cVar) {
        this.f38311a = cVar.f38313a;
        this.f38312b = cVar.f38314b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
    }

    public IconCompat a() {
        return this.f38312b;
    }

    public String b() {
        return this.d;
    }

    public CharSequence c() {
        return this.f38311a;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof wsh)) {
            return false;
        }
        wsh wshVar = (wsh) obj;
        String strB = b();
        String strB2 = wshVar.b();
        if (strB == null && strB2 == null) {
            return Objects.equals(Objects.toString(c()), Objects.toString(wshVar.c())) && Objects.equals(d(), wshVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(wshVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(wshVar.f()));
        }
        return Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String g() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.f38311a == null) {
            return "";
        }
        return "name:" + ((Object) this.f38311a);
    }

    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Person h() {
        return b.b(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f38311a);
        IconCompat iconCompat = this.f38312b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.t() : null);
        bundle.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle j() {
        return a.b(this);
    }
}

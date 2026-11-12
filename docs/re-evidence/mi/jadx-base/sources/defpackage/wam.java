package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class wam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f37774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37775b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public wsh[] i;
    public Set<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public soe f37776k;
    public boolean l;
    public int m;
    public PersistableBundle n;
    public boolean o = true;
    public int p;

    @RequiresApi(33)
    public static class a {
        public static void a(ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wam f37777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37778b;
        public Set<String> c;
        public Map<String, Map<String, List<String>>> d;
        public Uri e;

        public b(Context context, String str) {
            wam wamVar = new wam();
            this.f37777a = wamVar;
            wamVar.f37774a = context;
            wamVar.f37775b = str;
        }

        public wam a() {
            if (TextUtils.isEmpty(this.f37777a.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            wam wamVar = this.f37777a;
            Intent[] intentArr = wamVar.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f37778b) {
                if (wamVar.f37776k == null) {
                    wamVar.f37776k = new soe(wamVar.f37775b);
                }
                this.f37777a.l = true;
            }
            if (this.c != null) {
                wam wamVar2 = this.f37777a;
                if (wamVar2.j == null) {
                    wamVar2.j = new HashSet();
                }
                this.f37777a.j.addAll(this.c);
            }
            if (this.d != null) {
                wam wamVar3 = this.f37777a;
                if (wamVar3.n == null) {
                    wamVar3.n = new PersistableBundle();
                }
                for (String str : this.d.keySet()) {
                    Map<String, List<String>> map = this.d.get(str);
                    this.f37777a.n.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f37777a.n.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.e != null) {
                wam wamVar4 = this.f37777a;
                if (wamVar4.n == null) {
                    wamVar4.n = new PersistableBundle();
                }
                this.f37777a.n.putString("extraSliceUri", fdq.a(this.e));
            }
            return this.f37777a;
        }

        public b b(IconCompat iconCompat) {
            this.f37777a.h = iconCompat;
            return this;
        }

        public b c(Intent intent) {
            return d(new Intent[]{intent});
        }

        public b d(Intent[] intentArr) {
            this.f37777a.c = intentArr;
            return this;
        }

        public b e(int i) {
            this.f37777a.m = i;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f37777a.e = charSequence;
            return this;
        }
    }

    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final PersistableBundle a() {
        if (this.n == null) {
            this.n = new PersistableBundle();
        }
        wsh[] wshVarArr = this.i;
        if (wshVarArr != null && wshVarArr.length > 0) {
            this.n.putInt("extraPersonCount", wshVarArr.length);
            int i = 0;
            while (i < this.i.length) {
                PersistableBundle persistableBundle = this.n;
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.i[i].j());
                i = i2;
            }
        }
        soe soeVar = this.f37776k;
        if (soeVar != null) {
            this.n.putString("extraLocusId", soeVar.a());
        }
        this.n.putBoolean("extraLongLived", this.l);
        return this.n;
    }

    public String b() {
        return this.f37775b;
    }

    public int c() {
        return this.m;
    }

    public boolean d(int i) {
        return (i & this.p) != 0;
    }

    @RequiresApi(25)
    public ShortcutInfo e() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f37774a, this.f37775b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.v(this.f37774a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        PersistableBundle persistableBundle = this.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            wsh[] wshVarArr = this.i;
            if (wshVarArr != null && wshVarArr.length > 0) {
                int length = wshVarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.i[i].h();
                }
                intents.setPersons(personArr);
            }
            soe soeVar = this.f37776k;
            if (soeVar != null) {
                intents.setLocusId(soeVar.c());
            }
            intents.setLongLived(this.l);
        } else {
            intents.setExtras(a());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.p);
        }
        return intents.build();
    }
}

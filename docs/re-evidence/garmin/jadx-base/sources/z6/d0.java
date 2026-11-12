package z6;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f202600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconCompat f202601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f202602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f202603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f202604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f202605f;

    public d0(a aVar) {
        this.f202600a = aVar.f202606a;
        this.f202601b = aVar.f202607b;
        this.f202602c = aVar.f202608c;
        this.f202603d = aVar.f202609d;
        this.f202604e = aVar.f202610e;
        this.f202605f = aVar.f202611f;
    }

    public static d0 a(Person person) {
        IconCompat iconCompatA;
        a aVar = new a();
        aVar.f202606a = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.f6391k;
            iconCompatA = IconCompat.a.a(icon);
        } else {
            iconCompatA = null;
        }
        aVar.f202607b = iconCompatA;
        aVar.f202608c = person.getUri();
        aVar.f202609d = person.getKey();
        aVar.f202610e = person.isBot();
        aVar.f202611f = person.isImportant();
        return new d0(aVar);
    }

    public static d0 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        a aVar = new a();
        aVar.f202606a = bundle.getCharSequence("name");
        aVar.f202607b = bundle2 != null ? IconCompat.b(bundle2) : null;
        aVar.f202608c = bundle.getString("uri");
        aVar.f202609d = bundle.getString(Action.KEY_ATTRIBUTE);
        aVar.f202610e = bundle.getBoolean("isBot");
        aVar.f202611f = bundle.getBoolean("isImportant");
        return new d0(aVar);
    }

    public final Person c() {
        Person.Builder name = new Person.Builder().setName(this.f202600a);
        IconCompat iconCompat = this.f202601b;
        return name.setIcon(iconCompat != null ? iconCompat.f(null) : null).setUri(this.f202602c).setKey(this.f202603d).setBot(this.f202604e).setImportant(this.f202605f).build();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        String str = d0Var.f202603d;
        String str2 = this.f202603d;
        if (str2 == null && str == null) {
            return Objects.equals(Objects.toString(this.f202600a), Objects.toString(d0Var.f202600a)) && Objects.equals(this.f202602c, d0Var.f202602c) && Boolean.valueOf(this.f202604e).equals(Boolean.valueOf(d0Var.f202604e)) && Boolean.valueOf(this.f202605f).equals(Boolean.valueOf(d0Var.f202605f));
        }
        return Objects.equals(str2, str);
    }

    public final int hashCode() {
        String str = this.f202603d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f202600a, this.f202602c, Boolean.valueOf(this.f202604e), Boolean.valueOf(this.f202605f));
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f202606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f202607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f202608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f202609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f202610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f202611f;

        public a(d0 d0Var) {
            this.f202606a = d0Var.f202600a;
            this.f202607b = d0Var.f202601b;
            this.f202608c = d0Var.f202602c;
            this.f202609d = d0Var.f202603d;
            this.f202610e = d0Var.f202604e;
            this.f202611f = d0Var.f202605f;
        }

        public a() {
        }
    }
}

package defpackage;

import com.airbnb.lottie.model.KeyPathElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fo f34302a = new fo("COMPOSITION");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f34303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private KeyPathElement f34304c;

    public fo(String... strArr) {
        this.f34303b = Arrays.asList(strArr);
    }

    private fo(fo foVar) {
        this.f34303b = new ArrayList(foVar.f34303b);
        this.f34304c = foVar.f34304c;
    }

    public fo c(String str) {
        fo foVar = new fo(this);
        foVar.f34303b.add(str);
        return foVar;
    }

    public fo e(KeyPathElement keyPathElement) {
        fo foVar = new fo(this);
        foVar.f34304c = keyPathElement;
        return foVar;
    }

    public KeyPathElement d() {
        return this.f34304c;
    }

    public boolean b(String str, int i) {
        if (a(str)) {
            return true;
        }
        if (i >= this.f34303b.size()) {
            return false;
        }
        return this.f34303b.get(i).equals(str) || this.f34303b.get(i).equals("**") || this.f34303b.get(i).equals("*");
    }

    public int a(String str, int i) {
        if (a(str)) {
            return 0;
        }
        if (this.f34303b.get(i).equals("**")) {
            return (i != this.f34303b.size() - 1 && this.f34303b.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean e(String str, int i) {
        if (i >= this.f34303b.size()) {
            return false;
        }
        boolean z = i == this.f34303b.size() - 1;
        String str2 = this.f34303b.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f34303b.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f34303b.get(i + 1).equals(str)) {
            return i == this.f34303b.size() + (-2) || (i == this.f34303b.size() + (-3) && b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f34303b.size() - 1) {
            return false;
        }
        return this.f34303b.get(i2).equals(str);
    }

    public boolean c(String str, int i) {
        return "__container".equals(str) || i < this.f34303b.size() - 1 || this.f34303b.get(i).equals("**");
    }

    private boolean a(String str) {
        return "__container".equals(str);
    }

    private boolean b() {
        List<String> list = this.f34303b;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fo foVar = (fo) obj;
            if (!this.f34303b.equals(foVar.f34303b)) {
                return false;
            }
            KeyPathElement keyPathElement = this.f34304c;
            KeyPathElement keyPathElement2 = foVar.f34304c;
            if (keyPathElement != null) {
                return keyPathElement.equals(keyPathElement2);
            }
            if (keyPathElement2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f34303b.hashCode();
        KeyPathElement keyPathElement = this.f34304c;
        return (iHashCode * 31) + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f34303b);
        sb.append(",resolved=");
        sb.append(this.f34304c != null);
        sb.append('}');
        return sb.toString();
    }
}

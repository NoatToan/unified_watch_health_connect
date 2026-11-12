package defpackage;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class neh implements jeh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27855a;

    @RequiresApi(21)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Surface> f27856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Size f27857b;
        public final int c;
        public final int d;
        public String e;
        public boolean f;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f27857b.equals(aVar.f27857b) || this.c != aVar.c || this.d != aVar.d || this.f != aVar.f || !Objects.equals(this.e, aVar.e)) {
                return false;
            }
            int iMin = Math.min(this.f27856a.size(), aVar.f27856a.size());
            for (int i = 0; i < iMin; i++) {
                if (this.f27856a.get(i) != aVar.f27856a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int iHashCode = this.f27856a.hashCode() ^ 31;
            int i = this.d ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f27857b.hashCode() ^ ((i << 5) - i);
            int i2 = this.c ^ ((iHashCode2 << 5) - iHashCode2);
            int i3 = (this.f ? 1 : 0) ^ ((i2 << 5) - i2);
            int i4 = (i3 << 5) - i3;
            String str = this.e;
            return (str == null ? 0 : str.hashCode()) ^ i4;
        }
    }

    public neh(Object obj) {
        this.f27855a = obj;
    }

    @Override // jeh.a
    public Surface a() {
        List<Surface> list = ((a) this.f27855a).f27856a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // jeh.a
    public String b() {
        return ((a) this.f27855a).e;
    }

    @Override // jeh.a
    public void c(String str) {
        ((a) this.f27855a).e = str;
    }

    @Override // jeh.a
    public Object d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof neh) {
            return Objects.equals(this.f27855a, ((neh) obj).f27855a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27855a.hashCode();
    }
}

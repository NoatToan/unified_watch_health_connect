package rd;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;
import k63.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import sd.i;
import sd.j;
import sd.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrd/f;", "Ll63/a;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Lrd/d;", "configuration", "<init>", "(Landroid/os/Bundle;Lrd/d;)V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends l63.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f151998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f151999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f152000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152001e;

    public f(Bundle bundle, d dVar) {
        bundle.getClass();
        dVar.getClass();
        this.f151998b = bundle;
        this.f151999c = dVar;
        this.f152000d = "";
    }

    @Override // l63.a, l63.e
    public final boolean D() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return !nd.b.k(bundle, this.f152000d);
    }

    @Override // l63.e, l63.c
    /* JADX INFO: renamed from: a */
    public final p63.e getF129870c() {
        return this.f151999c.f151994a;
    }

    @Override // l63.a, l63.e
    public final l63.c c(k63.e eVar) {
        eVar.getClass();
        if (s.g(this.f152000d, "")) {
            return this;
        }
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return new f(nd.b.g(bundle, this.f152000d), this.f151999c);
    }

    @Override // l63.c
    public final int e(k63.e eVar) {
        int size;
        eVar.getClass();
        boolean zG = s.g(eVar.getF103234b(), m.b.f103254a);
        Bundle bundle = this.f151998b;
        if (zG || s.g(eVar.getF103234b(), m.c.f103255a)) {
            bundle.getClass();
            size = bundle.size();
        } else {
            size = eVar.getF103235c();
        }
        while (true) {
            int i14 = this.f152001e;
            if (i14 >= size) {
                return -1;
            }
            String strD = eVar.d(i14);
            if (!eVar.i(this.f152001e) || kg.f.v(strD, strD, bundle)) {
                this.f152000d = strD;
                int i15 = this.f152001e;
                this.f152001e = i15 + 1;
                return i15;
            }
            this.f152001e++;
        }
    }

    @Override // l63.a, l63.e
    public final double f() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return nd.b.b(bundle, this.f152000d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l63.e
    public final <T> T h(i63.b<? extends T> bVar) {
        T t7;
        bVar.getClass();
        k63.e descriptor = bVar.getF158591b();
        if (s.g(descriptor, c.f151978a)) {
            sd.c.f158569a.getClass();
            t7 = (T) sd.c.a(this);
        } else if (s.g(descriptor, c.f151979b)) {
            t7 = (T) sd.e.f158572b.deserialize(this);
        } else if (s.g(descriptor, c.f151980c)) {
            t7 = (T) sd.d.f158571b.deserialize(this);
        } else if (s.g(descriptor, c.f151981d)) {
            sd.f.f158573a.getClass();
            t7 = (T) sd.f.a(this);
        } else if (s.g(descriptor, c.f151986i) || s.g(descriptor, c.f151987j)) {
            sd.a.f158565a.getClass();
            t7 = (T) sd.a.a(this);
        } else if (s.g(descriptor, c.f151988k) || s.g(descriptor, c.f151989l)) {
            t7 = (T) sd.b.f158567a.deserialize(this);
        } else if (s.g(descriptor, c.f151982e)) {
            i.f158578a.getClass();
            Parcelable[] parcelableArrA = i.a(this);
            T tDeserialize = bVar.deserialize(a.f151967b);
            tDeserialize.getClass();
            t7 = (T) Arrays.copyOf(parcelableArrA, parcelableArrA.length, dh.b.u(s0.f105811a.b(tDeserialize.getClass())));
        } else if (s.g(descriptor, c.f151983f)) {
            i.f158578a.getClass();
            t7 = (T) i.a(this);
        } else if (s.g(descriptor, c.f151984g) || s.g(descriptor, c.f151985h)) {
            t7 = (T) j.f158580a.deserialize(this);
        } else {
            t7 = (s.g(descriptor, c.f151990m) || s.g(descriptor, c.f151991n) || s.g(descriptor, c.f151992o)) ? (T) q.f158597a.deserialize(this) : null;
        }
        if (t7 != null) {
            return t7;
        }
        k63.e descriptor2 = bVar.getF158591b();
        boolean zG = s.g(descriptor2, b.f151969a);
        Bundle bundle = this.f151998b;
        if (zG) {
            bundle.getClass();
            String str = this.f152000d;
            str.getClass();
            T t14 = (T) bundle.getIntegerArrayList(str);
            if (t14 != null) {
                return t14;
            }
            gg.b.J(str);
            throw null;
        }
        if (s.g(descriptor2, b.f151970b)) {
            bundle.getClass();
            return (T) nd.b.j(bundle, this.f152000d);
        }
        if (s.g(descriptor2, b.f151971c)) {
            bundle.getClass();
            String str2 = this.f152000d;
            str2.getClass();
            T t15 = (T) bundle.getBooleanArray(str2);
            if (t15 != null) {
                return t15;
            }
            gg.b.J(str2);
            throw null;
        }
        if (s.g(descriptor2, b.f151972d)) {
            bundle.getClass();
            String str3 = this.f152000d;
            str3.getClass();
            T t16 = (T) bundle.getCharArray(str3);
            if (t16 != null) {
                return t16;
            }
            gg.b.J(str3);
            throw null;
        }
        if (s.g(descriptor2, b.f151973e)) {
            bundle.getClass();
            String str4 = this.f152000d;
            str4.getClass();
            T t17 = (T) bundle.getDoubleArray(str4);
            if (t17 != null) {
                return t17;
            }
            gg.b.J(str4);
            throw null;
        }
        if (s.g(descriptor2, b.f151974f)) {
            bundle.getClass();
            String str5 = this.f152000d;
            str5.getClass();
            T t18 = (T) bundle.getFloatArray(str5);
            if (t18 != null) {
                return t18;
            }
            gg.b.J(str5);
            throw null;
        }
        if (s.g(descriptor2, b.f151975g)) {
            bundle.getClass();
            return (T) nd.b.e(bundle, this.f152000d);
        }
        if (!s.g(descriptor2, b.f151976h)) {
            if (!s.g(descriptor2, b.f151977i)) {
                return bVar.deserialize(this);
            }
            bundle.getClass();
            return (T) nd.b.i(bundle, this.f152000d);
        }
        bundle.getClass();
        String str6 = this.f152000d;
        str6.getClass();
        T t19 = (T) bundle.getLongArray(str6);
        if (t19 != null) {
            return t19;
        }
        gg.b.J(str6);
        throw null;
    }

    @Override // l63.a, l63.e
    public final byte m() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return (byte) nd.b.d(bundle, this.f152000d);
    }

    @Override // l63.a, l63.e
    public final long o() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return nd.b.f(bundle, this.f152000d);
    }

    @Override // l63.a, l63.e
    public final short p() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return (short) nd.b.d(bundle, this.f152000d);
    }

    @Override // l63.a, l63.e
    public final char q() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        String str = this.f152000d;
        str.getClass();
        char c14 = bundle.getChar(str, (char) 0);
        if (c14 != 0 || bundle.getChar(str, (char) 65535) != 65535) {
            return c14;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // l63.a, l63.e
    public final String s() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return nd.b.h(bundle, this.f152000d);
    }

    @Override // l63.a, l63.e
    public final int u() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return nd.b.d(bundle, this.f152000d);
    }

    @Override // l63.a, l63.e
    public final float x() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return nd.b.c(bundle, this.f152000d);
    }

    @Override // l63.a, l63.e
    public final boolean y() {
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return nd.b.a(bundle, this.f152000d);
    }

    @Override // l63.a, l63.e
    public final int z(k63.e eVar) {
        eVar.getClass();
        Bundle bundle = this.f151998b;
        bundle.getClass();
        return nd.b.d(bundle, this.f152000d);
    }
}

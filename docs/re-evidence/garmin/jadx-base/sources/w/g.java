package w;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f180967a;

    public interface c {
        InputConfiguration a();
    }

    public g(int i14, int i15, int i16) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f180967a = new b(i14, i15, i16);
        } else {
            this.f180967a = new a(i14, i15, i16);
        }
    }

    public static g a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new g(new b(obj)) : new g(new a(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f180967a.equals(((g) obj).f180967a);
    }

    public final int hashCode() {
        return this.f180967a.hashCode();
    }

    public final String toString() {
        return this.f180967a.toString();
    }

    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }

        public b(int i14, int i15, int i16) {
            super(i14, i15, i16);
        }
    }

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputConfiguration f180968a;

        public a(int i14, int i15, int i16) {
            this(new InputConfiguration(i14, i15, i16));
        }

        @Override // w.g.c
        public final InputConfiguration a() {
            return this.f180968a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f180968a, ((c) obj).a());
        }

        public final int hashCode() {
            return this.f180968a.hashCode();
        }

        public final String toString() {
            return this.f180968a.toString();
        }

        public a(Object obj) {
            this.f180968a = (InputConfiguration) obj;
        }
    }

    private g(c cVar) {
        this.f180967a = cVar;
    }
}

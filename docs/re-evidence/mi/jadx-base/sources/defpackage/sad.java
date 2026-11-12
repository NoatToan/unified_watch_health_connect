package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class sad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f33456a;

    @RequiresApi(23)
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputConfiguration f33457a;

        public a(Object obj) {
            this.f33457a = (InputConfiguration) obj;
        }

        @Override // sad.c
        public Object a() {
            return this.f33457a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f33457a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f33457a.hashCode();
        }

        public String toString() {
            return this.f33457a.toString();
        }
    }

    @RequiresApi(31)
    public static final class b extends a {
        public b(Object obj) {
            super(obj);
        }
    }

    public interface c {
        Object a();
    }

    public sad(c cVar) {
        this.f33456a = cVar;
    }

    public static sad b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new sad(new b(obj)) : new sad(new a(obj));
    }

    public Object a() {
        return this.f33456a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof sad) {
            return this.f33456a.equals(((sad) obj).f33456a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33456a.hashCode();
    }

    public String toString() {
        return this.f33456a.toString();
    }
}

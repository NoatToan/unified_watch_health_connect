package androidx.camera.core.impl;

import android.util.Size;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface f1 {

    @AutoValue
    public static abstract class a {
        public abstract int a();

        public abstract int b();

        public abstract int c();

        public abstract String d();

        public abstract int e();

        public abstract int f();
    }

    @AutoValue
    public static abstract class b implements f1 {
        public static j e(int i14, int i15, List list, List list2) {
            return new j(i14, i15, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    @AutoValue
    public static abstract class c {
        public abstract int a();

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract String h();

        public abstract int i();

        public final Size j() {
            return new Size(k(), g());
        }

        public abstract int k();
    }

    int a();

    List<a> b();

    int c();

    List<c> d();
}

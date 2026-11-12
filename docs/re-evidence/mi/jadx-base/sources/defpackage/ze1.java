package defpackage;

import android.annotation.SuppressLint;
import android.view.Menu;
import androidx.navigation.e;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ze1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Integer> f41175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fbh f41176b;
    public final c c;

    public interface c {
        boolean onNavigateUp();
    }

    public c a() {
        return this.c;
    }

    public fbh b() {
        return this.f41176b;
    }

    public Set<Integer> c() {
        return this.f41175a;
    }

    public ze1(Set<Integer> set, fbh fbhVar, c cVar) {
        this.f41175a = set;
        this.f41176b = fbhVar;
        this.c = cVar;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Integer> f41177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public fbh f41178b;
        public c c;

        public b(e eVar) {
            HashSet hashSet = new HashSet();
            this.f41177a = hashSet;
            hashSet.add(Integer.valueOf(sig.b(eVar).m()));
        }

        @SuppressLint({"SyntheticAccessor"})
        public ze1 a() {
            return new ze1(this.f41177a, this.f41178b, this.c);
        }

        public b b(c cVar) {
            this.c = cVar;
            return this;
        }

        public b c(fbh fbhVar) {
            this.f41178b = fbhVar;
            return this;
        }

        public b(Menu menu) {
            this.f41177a = new HashSet();
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                this.f41177a.add(Integer.valueOf(menu.getItem(i).getItemId()));
            }
        }

        public b(Set<Integer> set) {
            HashSet hashSet = new HashSet();
            this.f41177a = hashSet;
            hashSet.addAll(set);
        }
    }
}

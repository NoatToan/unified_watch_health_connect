package defpackage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.p004activity.ComponentActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xx5 {

    public interface a {
        c a();
    }

    public interface b {
        c a();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, Boolean> f39546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final fvq f39547b;

        public c(Map<Class<?>, Boolean> map, fvq fvqVar) {
            this.f39546a = map;
            this.f39547b = fvqVar;
        }

        public ViewModelProvider.Factory a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return c(factory);
        }

        public ViewModelProvider.Factory b(Fragment fragment, ViewModelProvider.Factory factory) {
            return c(factory);
        }

        public final ViewModelProvider.Factory c(ViewModelProvider.Factory factory) {
            return new s7c(this.f39546a, (ViewModelProvider.Factory) e6i.b(factory), this.f39547b);
        }
    }

    public static ViewModelProvider.Factory a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((a) hc8.a(componentActivity, a.class)).a().a(componentActivity, factory);
    }

    public static ViewModelProvider.Factory b(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((b) hc8.a(fragment, b.class)).a().b(fragment, factory);
    }
}

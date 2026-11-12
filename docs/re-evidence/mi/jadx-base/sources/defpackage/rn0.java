package defpackage;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.p004activity.ComponentActivity;
import dagger.hilt.android.EntryPointAccessors;

/* JADX INFO: loaded from: classes2.dex */
public final class rn0 implements sxa<pn0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewModelStoreOwner f32712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f32713b;
    public volatile pn0 c;
    public final Object d = new Object();

    public class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f32714a;

        public a(Context context) {
            this.f32714a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends dvq> T create(Class<T> cls, CreationExtras creationExtras) {
            u9l u9lVar = new u9l(creationExtras);
            return new c(((b) EntryPointAccessors.fromApplication(this.f32714a, b.class)).f().a(u9lVar).build(), u9lVar);
        }
    }

    public interface b {
        qn0 f();
    }

    public static final class c extends dvq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pn0 f32716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u9l f32717b;

        public c(pn0 pn0Var, u9l u9lVar) {
            this.f32716a = pn0Var;
            this.f32717b = u9lVar;
        }

        public pn0 a() {
            return this.f32716a;
        }

        public u9l b() {
            return this.f32717b;
        }

        @Override // defpackage.dvq
        public void onCleared() {
            super.onCleared();
            ((dtk) ((d) hc8.a(this.f32716a, d.class)).b()).a();
        }
    }

    public interface d {
        tn0 b();
    }

    public static abstract class e {
        public static tn0 a() {
            return new dtk();
        }
    }

    public rn0(ComponentActivity componentActivity) {
        this.f32712a = componentActivity;
        this.f32713b = componentActivity;
    }

    public final pn0 a() {
        return ((c) d(this.f32712a, this.f32713b).get(c.class)).a();
    }

    @Override // defpackage.sxa
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pn0 generatedComponent() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public u9l c() {
        return ((c) d(this.f32712a, this.f32713b).get(c.class)).b();
    }

    public final ViewModelProvider d(ViewModelStoreOwner viewModelStoreOwner, Context context) {
        return new ViewModelProvider(viewModelStoreOwner, new a(context));
    }
}

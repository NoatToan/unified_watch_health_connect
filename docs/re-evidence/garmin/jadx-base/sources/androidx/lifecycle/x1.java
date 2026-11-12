package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.util.MimeTypes;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.reflect.InvocationTargetException;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/x1;", "", "Lw9/f;", "impl", "<init>", "(Lw9/f;)V", "Landroidx/lifecycle/y1;", "store", "Landroidx/lifecycle/x1$c;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultCreationExtras", "(Landroidx/lifecycle/y1;Landroidx/lifecycle/x1$c;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/x1$c;)V", "c", JWKParameterNames.RSA_EXPONENT, "d", "a", "b", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8070b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f8071c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.f f8072a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/x1$e;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class e {
        public void a(u1 u1Var) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/x1$f", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements CreationExtras.c<String> {
    }

    static {
        int i14 = CreationExtras.f8054b;
        f8071c = new f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x1(ViewModelStoreOwner viewModelStoreOwner) {
        viewModelStoreOwner.getClass();
        y1 viewModelStore = viewModelStoreOwner.getViewModelStore();
        w9.g.f183576a.getClass();
        boolean z14 = viewModelStoreOwner instanceof y;
        this(viewModelStore, z14 ? ((y) viewModelStoreOwner).getDefaultViewModelProviderFactory() : w9.b.f183566a, z14 ? ((y) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c);
    }

    public final <T extends u1> T a(Class<T> cls) {
        return (T) b(p005kotlin.jvm.internal.s0.f105811a.b(cls));
    }

    public final <T extends u1> T b(k23.d<T> dVar) {
        dVar.getClass();
        w9.g.f183576a.getClass();
        String strW = dVar.getF16141b();
        if (strW != null) {
            return (T) this.f8072a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strW), dVar);
        }
        vb.h.s("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\nB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/x1$a;", "Landroidx/lifecycle/x1$d;", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "a", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0113a f8073d = new C0113a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static a f8074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f8075f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Application f8076c;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/x1$a$b", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements CreationExtras.c<Application> {
        }

        static {
            int i14 = CreationExtras.f8054b;
            f8075f = new b();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            application.getClass();
        }

        public final <T extends u1> T a(Class<T> cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                tNewInstance.getClass();
                return tNewInstance;
            } catch (IllegalAccessException e4) {
                q2.v(androidx.core.view.j.h(cls, "Cannot create an instance of "), e4);
                return null;
            } catch (InstantiationException e14) {
                q2.v(androidx.core.view.j.h(cls, "Cannot create an instance of "), e14);
                return null;
            } catch (NoSuchMethodException e15) {
                q2.v(androidx.core.view.j.h(cls, "Cannot create an instance of "), e15);
                return null;
            } catch (InvocationTargetException e16) {
                q2.v(androidx.core.view.j.h(cls, "Cannot create an instance of "), e16);
                return null;
            }
        }

        @Override // androidx.lifecycle.x1.d, androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls, CreationExtras creationExtras) {
            if (this.f8076c != null) {
                return (T) create(cls);
            }
            Application application = (Application) creationExtras.a(f8075f);
            if (application != null) {
                return (T) a(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                vb.h.s("CreationExtras must have an application by `APPLICATION_KEY`");
                return null;
            }
            w9.c.f183567a.getClass();
            return (T) w9.c.a(cls);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.x1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/x1$a$a;", "", "<init>", "()V", "Landroidx/lifecycle/x1$a;", "_instance", "Landroidx/lifecycle/x1$a;", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "Landroid/app/Application;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0113a {
            public /* synthetic */ C0113a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0113a() {
            }
        }

        public a() {
            this(null, 0);
        }

        private a(Application application, int i14) {
            this.f8076c = application;
        }

        @Override // androidx.lifecycle.x1.d, androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            Application application = this.f8076c;
            if (application != null) {
                return (T) a(cls, application);
            }
            org.apache.commons.lang3.e.w("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/x1$d;", "Landroidx/lifecycle/x1$c;", "<init>", "()V", "a", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8078a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static d f8079b;

        static {
            b bVar = x1.f8070b;
        }

        @Override // androidx.lifecycle.x1.c
        public <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            w9.c.f183567a.getClass();
            return (T) w9.c.a(cls);
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/x1$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/x1$d;", "_instance", "Landroidx/lifecycle/x1$d;", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.x1.c
        public <T extends u1> T create(Class<T> cls, CreationExtras creationExtras) {
            return (T) create(cls);
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(k23.d<T> dVar, CreationExtras creationExtras) {
            dVar.getClass();
            return (T) create(dh.b.u(dVar), creationExtras);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/x1$b;", "", "<init>", "()V", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static x1 a(y1 y1Var, c cVar, CreationExtras creationExtras) {
            y1Var.getClass();
            cVar.getClass();
            creationExtras.getClass();
            return new x1(y1Var, cVar, creationExtras);
        }

        public static /* synthetic */ x1 b(b bVar, y1 y1Var, c cVar) {
            CreationExtras.b bVar2 = CreationExtras.b.f8056c;
            bVar.getClass();
            return a(y1Var, cVar, bVar2);
        }

        public static x1 c(b bVar, ViewModelStoreOwner viewModelStoreOwner, c cVar, int i14) {
            if ((i14 & 2) != 0) {
                w9.g.f183576a.getClass();
                cVar = viewModelStoreOwner instanceof y ? ((y) viewModelStoreOwner).getDefaultViewModelProviderFactory() : w9.b.f183566a;
            }
            w9.g.f183576a.getClass();
            CreationExtras defaultViewModelCreationExtras = viewModelStoreOwner instanceof y ? ((y) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
            bVar.getClass();
            cVar.getClass();
            defaultViewModelCreationExtras.getClass();
            return new x1(viewModelStoreOwner.getViewModelStore(), cVar, defaultViewModelCreationExtras);
        }

        private b() {
        }
    }

    public interface c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/x1$c$a;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f8077a = 0;

            static {
                new a();
            }

            private a() {
            }
        }

        static {
            int i14 = a.f8077a;
        }

        default <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            w9.g.f183576a.getClass();
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        default <T extends u1> T create(Class<T> cls, CreationExtras creationExtras) {
            cls.getClass();
            creationExtras.getClass();
            return (T) create(cls);
        }

        default <T extends u1> T create(k23.d<T> dVar, CreationExtras creationExtras) {
            dVar.getClass();
            return (T) create(dh.b.u(dVar), creationExtras);
        }
    }

    private x1(w9.f fVar) {
        this.f8072a = fVar;
    }

    public /* synthetic */ x1(y1 y1Var, c cVar, CreationExtras creationExtras, int i14, p005kotlin.jvm.internal.j jVar) {
        this(y1Var, cVar, (i14 & 4) != 0 ? CreationExtras.b.f8056c : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, c cVar, CreationExtras creationExtras) {
        this(new w9.f(y1Var, cVar, creationExtras));
        y1Var.getClass();
        cVar.getClass();
        creationExtras.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, c cVar) {
        this(y1Var, cVar, null, 4, null);
        y1Var.getClass();
        cVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x1(ViewModelStoreOwner viewModelStoreOwner, c cVar) {
        CreationExtras defaultViewModelCreationExtras;
        viewModelStoreOwner.getClass();
        cVar.getClass();
        y1 viewModelStore = viewModelStoreOwner.getViewModelStore();
        w9.g.f183576a.getClass();
        if (viewModelStoreOwner instanceof y) {
            defaultViewModelCreationExtras = ((y) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.b.f8056c;
        }
        this(viewModelStore, cVar, defaultViewModelCreationExtras);
    }
}

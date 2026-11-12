package e32;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import androidx.lifecycle.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.m0;
import e32.p;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Le32/a;", "Data", "Le32/p;", "ViewBinder", "NavigatorDestination", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "a", "b", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<Data, ViewBinder extends p<Data>, NavigatorDestination> extends m0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f62769j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewBinder f62770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l<NavigatorDestination> f62771i;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b¤\u0004\u0018\u0000*\u0004\b\u0003\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le32/a$b;", "T", "Le32/e;", "Lfw/m;", "<init>", "(Le32/a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class b<T> extends e<fw.m<? extends T>> {

        /* JADX INFO: renamed from: e32.a$b$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1319a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f62773a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f62773a = iArr;
            }
        }

        public b() {
        }

        @Override // e32.e
        public final void a(Object obj) {
            fw.m mVar = (fw.m) obj;
            int i14 = C1319a.f62773a[mVar.f73769b.ordinal()];
            if (i14 == 1) {
                int i15 = a.f62769j;
                a<Data, ViewBinder, NavigatorDestination> aVar = a.this;
                if (aVar.z6()) {
                    return;
                }
                aVar.G6();
                return;
            }
            if (i14 == 2) {
                c(mVar.f73770c);
            } else if (i14 == 3) {
                b(mVar.f73771d);
            } else {
                u0.r();
            }
        }

        public void b(fw.c cVar) {
            a<Data, ViewBinder, NavigatorDestination> aVar = a.this;
            aVar.w6();
            Context context = aVar.getContext();
            if (context == null || cVar == null || (cVar instanceof fw.h) || (cVar instanceof fw.o)) {
                return;
            }
            Toast.makeText(context, R.string.txt_error_occurred, 0).show();
        }

        public abstract void c(T t7);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"e32/a$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<Data, ViewBinder, NavigatorDestination> f62774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f62775b;

        public c(a<Data, ViewBinder, NavigatorDestination> aVar, View view2) {
            this.f62774a = aVar;
            this.f62775b = view2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a<Data, ViewBinder, NavigatorDestination> aVar = this.f62774a;
            if (aVar.getView() != null) {
                aVar.I6().f(aVar.getViewLifecycleOwner(), new e32.b(aVar));
            }
            this.f62775b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static {
        new C1318a(null);
    }

    public abstract s0<fw.m<Data>> I6();

    public final ViewBinder J6() {
        ViewBinder viewbinder = this.f62770h;
        if (viewbinder != null) {
            return viewbinder;
        }
        s.m("viewBinder");
        throw null;
    }

    public abstract ViewBinder K6(View view2, l<NavigatorDestination> lVar);

    public void M6(Data data) {
        J6().c(data);
        w6();
    }

    public boolean S6() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f62771i = (l) context;
        } catch (ClassCastException unused) {
            String strConcat = "Activity should implement ".concat(l.class.getSimpleName());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "BaseSummaryFragment", strConcat);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        I6().k(new e32.b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        l<NavigatorDestination> lVar = this.f62771i;
        if (lVar == null) {
            s.m("navigator");
            throw null;
        }
        this.f62770h = (ViewBinder) K6(view2, lVar);
        J6().a();
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new c(this, view2));
    }

    /* JADX INFO: renamed from: e32.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le32/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1318a {
        public /* synthetic */ C1318a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1318a() {
        }
    }
}

package o4;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lo4/e;", "Lo4/q0;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "c", "d", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f128834f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f128835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f128836b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s4.b f128837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f128838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f128839e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o4/e$a", "Landroid/content/ComponentCallbacks2;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ComponentCallbacks2 {
        public a() {
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i14) {
            if (i14 >= 40) {
                boolean z14 = e.f128834f;
                e.this.getClass();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"o4/e$b", "Landroid/view/View$OnAttachStateChangeListener;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            Context context = view2.getContext();
            boolean z14 = e.f128834f;
            e eVar = e.this;
            if (eVar.f128838d) {
                return;
            }
            context.getApplicationContext().registerComponentCallbacks(eVar.f128839e);
            eVar.f128838d = true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
            Context context = view2.getContext();
            e eVar = e.this;
            if (eVar.f128838d) {
                context.getApplicationContext().unregisterComponentCallbacks(eVar.f128839e);
                eVar.f128838d = false;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/e$d;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f128842a = 0;

        static {
            new d();
        }

        private d() {
        }
    }

    static {
        new c(null);
        f128834f = true;
    }

    public e(ViewGroup viewGroup) {
        this.f128835a = viewGroup;
        a aVar = new a();
        this.f128839e = aVar;
        if (viewGroup.isAttachedToWindow()) {
            Context context = viewGroup.getContext();
            if (!this.f128838d) {
                context.getApplicationContext().registerComponentCallbacks(aVar);
                this.f128838d = true;
            }
        }
        viewGroup.addOnAttachStateChangeListener(new b());
    }

    @Override // o4.q0
    public final r4.c a() {
        long uniqueDrawingId;
        r4.d iVar;
        s4.b bVar;
        s4.b bVar2;
        r4.c cVar;
        synchronized (this.f128836b) {
            try {
                ViewGroup viewGroup = this.f128835a;
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 29) {
                    int i15 = d.f128842a;
                    uniqueDrawingId = viewGroup.getUniqueDrawingId();
                } else {
                    uniqueDrawingId = -1;
                }
                long j8 = uniqueDrawingId;
                if (i14 >= 29) {
                    iVar = new r4.h(j8, null, null, 6, null);
                } else if (f128834f) {
                    try {
                        iVar = new r4.f(this.f128835a, j8, null, null, 12, null);
                    } catch (Throwable unused) {
                        f128834f = false;
                        ViewGroup viewGroup2 = this.f128835a;
                        s4.b bVar3 = this.f128837c;
                        if (bVar3 == null) {
                            s4.b bVar4 = new s4.b(viewGroup2.getContext());
                            viewGroup2.addView(bVar4);
                            this.f128837c = bVar4;
                            bVar = bVar4;
                        } else {
                            bVar = bVar3;
                        }
                        iVar = new r4.i(bVar, j8, null, null, 12, null);
                    }
                } else {
                    ViewGroup viewGroup3 = this.f128835a;
                    s4.b bVar5 = this.f128837c;
                    if (bVar5 == null) {
                        s4.b bVar6 = new s4.b(viewGroup3.getContext());
                        viewGroup3.addView(bVar6);
                        this.f128837c = bVar6;
                        bVar2 = bVar6;
                    } else {
                        bVar2 = bVar5;
                    }
                    iVar = new r4.i(bVar2, j8, null, null, 12, null);
                }
                cVar = new r4.c(iVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }

    @Override // o4.q0
    public final void b(r4.c cVar) {
        synchronized (this.f128836b) {
            if (!cVar.f150159s) {
                cVar.f150159s = true;
                cVar.b();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/e$c;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}

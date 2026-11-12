package kotlin;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.c1;
import androidx.lifecycle.n0;
import c53.q;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import oe2.f;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
public interface w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91617a = a.f91618a;

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/w3$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f91618a = new a();

        private a() {
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/w3$b;", "Li5/w3;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements w3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f91619b = new b();

        @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends w implements e23.a<p005kotlin.Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.a f91620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewOnAttachStateChangeListenerC1751b f91621b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.a aVar, ViewOnAttachStateChangeListenerC1751b viewOnAttachStateChangeListenerC1751b) {
                super(0);
                this.f91620a = aVar;
                this.f91621b = viewOnAttachStateChangeListenerC1751b;
            }

            @Override // e23.a
            public final p005kotlin.Unit invoke() {
                this.f91620a.removeOnAttachStateChangeListener(this.f91621b);
                return p005kotlin.Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: i5.w3$b$b, reason: collision with other inner class name */
        @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/w3$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ViewOnAttachStateChangeListenerC1751b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.a f91622a;

            public ViewOnAttachStateChangeListenerC1751b(kotlin.a aVar) {
                this.f91622a = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                this.f91622a.disposeComposition();
            }
        }

        private b() {
        }

        @Override // kotlin.w3
        public final e23.a<p005kotlin.Unit> a(kotlin.a aVar) {
            ViewOnAttachStateChangeListenerC1751b viewOnAttachStateChangeListenerC1751b = new ViewOnAttachStateChangeListenerC1751b(aVar);
            aVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1751b);
            return new a(aVar, viewOnAttachStateChangeListenerC1751b);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/w3$c;", "Li5/w3;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements w3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f91623b = new c();

        @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends w implements e23.a<p005kotlin.Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.a f91624a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f91625b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r7.a f91626c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.a aVar, b bVar, r7.a aVar2) {
                super(0);
                this.f91624a = aVar;
                this.f91625b = bVar;
                this.f91626c = aVar2;
            }

            @Override // e23.a
            public final p005kotlin.Unit invoke() {
                b bVar = this.f91625b;
                kotlin.a aVar = this.f91624a;
                aVar.removeOnAttachStateChangeListener(bVar);
                r7.a aVar2 = this.f91626c;
                aVar2.getClass();
                f.v(aVar).f151034a.remove(aVar2);
                return p005kotlin.Unit.INSTANCE;
            }
        }

        @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/w3$c$b", "Landroid/view/View$OnAttachStateChangeListener;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.a f91627a;

            public b(kotlin.a aVar) {
                this.f91627a = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                boolean z14;
                kotlin.a aVar = this.f91627a;
                aVar.getClass();
                Iterator it = q.e(c1.f6410a, aVar.getParent()).iterator();
                while (true) {
                    z14 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object obj = (ViewParent) it.next();
                    if (obj instanceof View) {
                        View view3 = (View) obj;
                        view3.getClass();
                        Object tag = view3.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            z14 = true;
                            break;
                        }
                    }
                }
                if (z14) {
                    return;
                }
                aVar.disposeComposition();
            }
        }

        private c() {
        }

        @Override // kotlin.w3
        public final e23.a<p005kotlin.Unit> a(final kotlin.a aVar) {
            b bVar = new b(aVar);
            aVar.addOnAttachStateChangeListener(bVar);
            r7.a aVar2 = new r7.a() { // from class: i5.x3
                @Override // r7.a
                public final void a() {
                    w3.c cVar = w3.c.f91623b;
                    aVar.disposeComposition();
                }
            };
            f.v(aVar).f151034a.add(aVar2);
            return new a(aVar, bVar, aVar2);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/w3$d;", "Li5/w3;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements w3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f91628b = new d();

        @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends w implements e23.a<p005kotlin.Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.a f91629a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f91630b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.a aVar, c cVar) {
                super(0);
                this.f91629a = aVar;
                this.f91630b = cVar;
            }

            @Override // e23.a
            public final p005kotlin.Unit invoke() {
                this.f91629a.removeOnAttachStateChangeListener(this.f91630b);
                return p005kotlin.Unit.INSTANCE;
            }
        }

        @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class b extends w implements e23.a<p005kotlin.Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0<e23.a<p005kotlin.Unit>> f91631a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r0<e23.a<p005kotlin.Unit>> r0Var) {
                super(0);
                this.f91631a = r0Var;
            }

            @Override // e23.a
            public final p005kotlin.Unit invoke() {
                this.f91631a.f105810a.invoke();
                return p005kotlin.Unit.INSTANCE;
            }
        }

        @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/w3$d$c", "Landroid/view/View$OnAttachStateChangeListener;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.a f91632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0<e23.a<p005kotlin.Unit>> f91633b;

            public c(kotlin.a aVar, r0<e23.a<p005kotlin.Unit>> r0Var) {
                this.f91632a = aVar;
                this.f91633b = r0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, i5.y3] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                kotlin.a aVar = this.f91632a;
                n0 n0VarR = xy2.b.r(aVar);
                if (n0VarR != null) {
                    this.f91633b.f105810a = z3.a(aVar, n0VarR.getF158016a());
                    aVar.removeOnAttachStateChangeListener(this);
                    return;
                }
                e5.a.c("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
                o2.c.f();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
            }
        }

        private d() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, i5.w3$d$a] */
        @Override // kotlin.w3
        public final e23.a<p005kotlin.Unit> a(kotlin.a aVar) {
            if (!aVar.isAttachedToWindow()) {
                r0 r0Var = new r0();
                c cVar = new c(aVar, r0Var);
                aVar.addOnAttachStateChangeListener(cVar);
                r0Var.f105810a = new a(aVar, cVar);
                return new b(r0Var);
            }
            n0 n0VarR = xy2.b.r(aVar);
            if (n0VarR != null) {
                return z3.a(aVar, n0VarR.getF158016a());
            }
            e5.a.c("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
            o2.c.f();
            return null;
        }
    }

    e23.a<p005kotlin.Unit> a(kotlin.a aVar);
}

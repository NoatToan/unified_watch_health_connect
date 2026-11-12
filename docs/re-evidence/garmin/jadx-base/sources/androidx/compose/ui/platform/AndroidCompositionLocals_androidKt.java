package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.n0;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.a0;
import p3.j0;
import p3.m2;
import p3.u;
import p3.v;
import p3.y3;
import s9.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lp3/m2;", "Landroidx/lifecycle/n0;", "getLocalLifecycleOwner", "()Lp3/m2;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f6041a = v.c(a.f6047a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y3 f6042b = new y3(b.f6048a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f6043c = new a0(e.f6051a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y3 f6044d = new y3(c.f6049a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y3 f6045e = new y3(d.f6050a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y3 f6046f = new y3(f.f6052a);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/Configuration;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements e23.a<Configuration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6047a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.a("LocalConfiguration");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements e23.a<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6048a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.a("LocalContext");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln5/b;", "invoke", "()Ln5/b;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends w implements e23.a<n5.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f6049a = new c();

        public c() {
            super(0);
        }

        @Override // e23.a
        public final n5.b invoke() {
            AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln5/d;", "invoke", "()Ln5/d;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends w implements e23.a<n5.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f6050a = new d();

        public d() {
            super(0);
        }

        @Override // e23.a
        public final n5.d invoke() {
            AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/u;", "Landroid/content/res/Resources;", "invoke", "(Lp3/u;)Landroid/content/res/Resources;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends w implements l<u, Resources> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f6051a = new e();

        public e() {
            super(1);
        }

        @Override // e23.l
        public final Resources invoke(u uVar) {
            u uVar2 = uVar;
            uVar2.f(AndroidCompositionLocals_androidKt.f6041a);
            return ((Context) uVar2.f(AndroidCompositionLocals_androidKt.f6042b)).getResources();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends w implements e23.a<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f6052a = new f();

        public f() {
            super(0);
        }

        @Override // e23.a
        public final View invoke() {
            AndroidCompositionLocals_androidKt.a("LocalView");
            throw null;
        }
    }

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final m2<n0> getLocalLifecycleOwner() {
        return j.f158018a;
    }
}

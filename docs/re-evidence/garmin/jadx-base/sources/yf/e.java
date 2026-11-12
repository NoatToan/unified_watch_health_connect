package yf;

import android.content.Context;
import e23.l;
import lf.g;
import lf.h;
import lf.o;
import o53.i1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wf.m;
import xn.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0014\u0015BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0016"}, d2 = {"Lyf/e;", "Llf/h;", "Llf/o;", "source", "Lwf/m;", "options", "Lyf/c;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Llf/o;Lwf/m;Lyf/c;Le23/l;ZZ)V", "scaleToDensity", "(Llf/o;Lwf/m;ZZZ)V", "b", "a", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ya1.h f196844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ya1.h f196845h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f196846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f196847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f196848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Context, Float> f196849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f196850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f196851f;

    static {
        new a(null);
        f196844g = new ya1.h(7);
        f196845h = new ya1.h(8);
    }

    public /* synthetic */ e(o oVar, m mVar, c cVar, l lVar, boolean z14, boolean z15, int i14, j jVar) {
        this(oVar, mVar, (i14 & 4) != 0 ? c.F0 : cVar, (i14 & 8) != 0 ? f196844g : lVar, (i14 & 16) != 0 ? true : z14, (i14 & 32) != 0 ? true : z15);
    }

    @Override // lf.h
    public final Object a(t13.d<? super lf.f> dVar) {
        return ge1.b.e0(t13.h.f161748a, new i1(new r(this, 19), null), (v13.c) dVar);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lyf/e$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "NO_DENSITY", "Le23/l;", "PLATFORM_DENSITY", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB'\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyf/e$b;", "Llf/h$a;", "Lyf/c;", "parser", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "density", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "<init>", "(Lyf/c;Le23/l;ZZ)V", "scaleToDensity", "(ZZZ)V", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f196852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<Context, Float> f196853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f196854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f196855d;

        public /* synthetic */ b(c cVar, l lVar, boolean z14, boolean z15, int i14, j jVar) {
            this((i14 & 1) != 0 ? c.F0 : cVar, (i14 & 2) != 0 ? e.f196844g : lVar, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? true : z15);
        }

        @Override // lf.h.a
        public final h a(nf.o oVar, m mVar) {
            if (!s.g(oVar.f125763b, "image/svg+xml")) {
                g gVar = g.f112092a;
                w63.g gVarSource = oVar.f125762a.source();
                if (!gVarSource.F3(0L, yf.a.f196836b) || gVarSource.o3(1024L, yf.a.f196835a) == -1) {
                    return null;
                }
            }
            return new e(oVar.f125762a, mVar, this.f196852a, this.f196853b, this.f196854c, this.f196855d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(c cVar, l<? super Context, Float> lVar, boolean z14, boolean z15) {
            this.f196852a = cVar;
            this.f196853b = lVar;
            this.f196854c = z14;
            this.f196855d = z15;
        }

        public b() {
            this(null, null, false, false, 15, null);
        }

        public /* synthetic */ b(boolean z14, boolean z15, boolean z16, int i14, j jVar) {
            this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? false : z16);
        }

        public b(boolean z14, boolean z15, boolean z16) {
            this(c.F0, z16 ? e.f196845h : e.f196844g, z14, z15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(o oVar, m mVar, c cVar, l<? super Context, Float> lVar, boolean z14, boolean z15) {
        this.f196846a = oVar;
        this.f196847b = mVar;
        this.f196848c = cVar;
        this.f196849d = lVar;
        this.f196850e = z14;
        this.f196851f = z15;
    }

    public /* synthetic */ e(o oVar, m mVar, boolean z14, boolean z15, boolean z16, int i14, j jVar) {
        this(oVar, mVar, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? true : z15, (i14 & 16) != 0 ? false : z16);
    }

    public e(o oVar, m mVar, boolean z14, boolean z15, boolean z16) {
        this(oVar, mVar, c.F0, z16 ? f196845h : f196844g, z14, z15);
    }
}

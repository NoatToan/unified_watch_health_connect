package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class bxh extends AbstractDraweeControllerBuilder<bxh, ImageRequest, w14<u14>, p4d> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j5d f4705r;
    public final dxh s;
    public ImmutableList<m47> t;
    public y4d u;
    public d5d v;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4706a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.CacheLevel.values().length];
            f4706a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4706a[AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4706a[AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bxh(Context context, dxh dxhVar, j5d j5dVar, Set<uj4> set) {
        super(context, set);
        this.f4705r = j5dVar;
        this.s = dxhVar;
    }

    public static ImageRequest.RequestLevel E(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i = a.f4706a[cacheLevel.ordinal()];
        if (i == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
    }

    public final c93 F() {
        ImageRequest imageRequestM = m();
        f93 f93VarJ = this.f4705r.j();
        if (f93VarJ == null || imageRequestM == null) {
            return null;
        }
        return imageRequestM.g() != null ? f93VarJ.a(imageRequestM, f()) : f93VarJ.c(imageRequestM, f());
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public cp5<w14<u14>> i(g57 g57Var, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        return this.f4705r.f(imageRequest, obj, E(cacheLevel), H(g57Var));
    }

    public ook H(g57 g57Var) {
        if (g57Var instanceof axh) {
            return ((axh) g57Var).W();
        }
        return null;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public axh u() {
        if (epa.d()) {
            epa.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            g57 g57VarN = n();
            String strE = AbstractDraweeControllerBuilder.e();
            axh axhVarC = g57VarN instanceof axh ? (axh) g57VarN : this.s.c();
            axhVarC.Y(v(axhVarC, strE), strE, F(), f(), this.t, this.u);
            axhVarC.Z(this.v);
            return axhVarC;
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    @Override // defpackage.scm
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public bxh a(Uri uri) {
        return uri == null ? (bxh) super.A(null) : (bxh) super.A(ImageRequestBuilder.r(uri).D(jxk.b()).a());
    }
}

package wf;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import p13.k0;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00044567Bµ\u0002\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103¨\u00068"}, d2 = {"Lwf/f;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "data", "Lag/a;", "target", "Lwf/f$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "memoryCacheKey", "", "memoryCacheKeyExtras", "diskCacheKey", "Lw63/l;", "fileSystem", "Lo13/p;", "Lnf/j$a;", "Lk23/d;", "fetcherFactory", "Llf/h$a;", "decoderFactory", "Lt13/g;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lwf/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lrf/b$b;", "placeholderMemoryCacheKey", "Lkotlin/Function1;", "Lhf/h;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lxf/h;", "sizeResolver", "Lxf/f;", "scale", "Lxf/c;", "precision", "Lhf/f;", "extras", "Lwf/f$c;", "defined", "Lwf/f$b;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lag/a;Lwf/f$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lw63/l;Lo13/p;Llf/h$a;Lt13/g;Lt13/g;Lt13/g;Lwf/c;Lwf/c;Lwf/c;Lrf/b$b;Le23/l;Le23/l;Le23/l;Lxf/h;Lxf/f;Lxf/c;Lhf/f;Lwf/f$c;Lwf/f$b;)V", "d", "c", "b", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f184902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f184903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag.a f184904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f184905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f184906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f184907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f184908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w63.l f184909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.p<nf.j.a<?>, k23.d<?>> f184910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lf.h.a f184911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t13.g f184912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t13.g f184913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t13.g f184914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wf.c f184915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wf.c f184916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wf.c f184917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rf.b.C2864b f184918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e23.l<f, hf.h> f184919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e23.l<f, hf.h> f184920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e23.l<f, hf.h> f184921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final xf.h f184922u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final xf.f f184923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xf.c f184924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hf.f f184925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f184926y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f184927z;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwf/f$c;", "", "Lw63/l;", "fileSystem", "Lt13/g;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lwf/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lwf/f;", "Lhf/h;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lxf/h;", "sizeResolver", "Lxf/f;", "scale", "Lxf/c;", "precision", "<init>", "(Lw63/l;Lt13/g;Lt13/g;Lt13/g;Lwf/c;Lwf/c;Lwf/c;Le23/l;Le23/l;Le23/l;Lxf/h;Lxf/f;Lxf/c;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w63.l f184968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t13.g f184969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t13.g f184970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t13.g f184971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final wf.c f184972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final wf.c f184973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final wf.c f184974g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e23.l<f, hf.h> f184975h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e23.l<f, hf.h> f184976i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final e23.l<f, hf.h> f184977j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final xf.h f184978k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final xf.f f184979l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final xf.c f184980m;

        /* JADX WARN: Multi-variable type inference failed */
        public c(w63.l lVar, t13.g gVar, t13.g gVar2, t13.g gVar3, wf.c cVar, wf.c cVar2, wf.c cVar3, e23.l<? super f, ? extends hf.h> lVar2, e23.l<? super f, ? extends hf.h> lVar3, e23.l<? super f, ? extends hf.h> lVar4, xf.h hVar, xf.f fVar, xf.c cVar4) {
            this.f184968a = lVar;
            this.f184969b = gVar;
            this.f184970c = gVar2;
            this.f184971d = gVar3;
            this.f184972e = cVar;
            this.f184973f = cVar2;
            this.f184974g = cVar3;
            this.f184975h = lVar2;
            this.f184976i = lVar3;
            this.f184977j = lVar4;
            this.f184978k = hVar;
            this.f184979l = fVar;
            this.f184980m = cVar4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f184968a, cVar.f184968a) && p005kotlin.jvm.internal.s.g(this.f184969b, cVar.f184969b) && p005kotlin.jvm.internal.s.g(this.f184970c, cVar.f184970c) && p005kotlin.jvm.internal.s.g(this.f184971d, cVar.f184971d) && this.f184972e == cVar.f184972e && this.f184973f == cVar.f184973f && this.f184974g == cVar.f184974g && p005kotlin.jvm.internal.s.g(this.f184975h, cVar.f184975h) && p005kotlin.jvm.internal.s.g(this.f184976i, cVar.f184976i) && p005kotlin.jvm.internal.s.g(this.f184977j, cVar.f184977j) && p005kotlin.jvm.internal.s.g(this.f184978k, cVar.f184978k) && this.f184979l == cVar.f184979l && this.f184980m == cVar.f184980m;
        }

        public final int hashCode() {
            w63.l lVar = this.f184968a;
            int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            t13.g gVar = this.f184969b;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            t13.g gVar2 = this.f184970c;
            int iHashCode3 = (iHashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
            t13.g gVar3 = this.f184971d;
            int iHashCode4 = (iHashCode3 + (gVar3 == null ? 0 : gVar3.hashCode())) * 31;
            wf.c cVar = this.f184972e;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            wf.c cVar2 = this.f184973f;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            wf.c cVar3 = this.f184974g;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            e23.l<f, hf.h> lVar2 = this.f184975h;
            int iHashCode8 = (iHashCode7 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
            e23.l<f, hf.h> lVar3 = this.f184976i;
            int iHashCode9 = (iHashCode8 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
            e23.l<f, hf.h> lVar4 = this.f184977j;
            int iHashCode10 = (iHashCode9 + (lVar4 == null ? 0 : lVar4.hashCode())) * 31;
            xf.h hVar = this.f184978k;
            int iHashCode11 = (iHashCode10 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            xf.f fVar = this.f184979l;
            int iHashCode12 = (iHashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            xf.c cVar4 = this.f184980m;
            return iHashCode12 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        public final String toString() {
            return "Defined(fileSystem=" + this.f184968a + ", interceptorCoroutineContext=" + this.f184969b + ", fetcherCoroutineContext=" + this.f184970c + ", decoderCoroutineContext=" + this.f184971d + ", memoryCachePolicy=" + this.f184972e + ", diskCachePolicy=" + this.f184973f + ", networkCachePolicy=" + this.f184974g + ", placeholderFactory=" + this.f184975h + ", errorFactory=" + this.f184976i + ", fallbackFactory=" + this.f184977j + ", sizeResolver=" + this.f184978k + ", scale=" + this.f184979l + ", precision=" + this.f184980m + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public interface d {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(Context context, Object obj, ag.a aVar, d dVar, String str, Map<String, String> map, String str2, w63.l lVar, o13.p<? extends nf.j.a<?>, ? extends k23.d<?>> pVar, lf.h.a aVar2, t13.g gVar, t13.g gVar2, t13.g gVar3, wf.c cVar, wf.c cVar2, wf.c cVar3, rf.b.C2864b c2864b, e23.l<? super f, ? extends hf.h> lVar2, e23.l<? super f, ? extends hf.h> lVar3, e23.l<? super f, ? extends hf.h> lVar4, xf.h hVar, xf.f fVar, xf.c cVar4, hf.f fVar2, c cVar5, b bVar) {
        this.f184902a = context;
        this.f184903b = obj;
        this.f184904c = aVar;
        this.f184905d = dVar;
        this.f184906e = str;
        this.f184907f = map;
        this.f184908g = str2;
        this.f184909h = lVar;
        this.f184910i = pVar;
        this.f184911j = aVar2;
        this.f184912k = gVar;
        this.f184913l = gVar2;
        this.f184914m = gVar3;
        this.f184915n = cVar;
        this.f184916o = cVar2;
        this.f184917p = cVar3;
        this.f184918q = c2864b;
        this.f184919r = lVar2;
        this.f184920s = lVar3;
        this.f184921t = lVar4;
        this.f184922u = hVar;
        this.f184923v = fVar;
        this.f184924w = cVar4;
        this.f184925x = fVar2;
        this.f184926y = cVar5;
        this.f184927z = bVar;
    }

    public static a a(f fVar) {
        Context context = fVar.f184902a;
        fVar.getClass();
        return new a(fVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f184902a, fVar.f184902a) && p005kotlin.jvm.internal.s.g(this.f184903b, fVar.f184903b) && p005kotlin.jvm.internal.s.g(this.f184904c, fVar.f184904c) && p005kotlin.jvm.internal.s.g(this.f184905d, fVar.f184905d) && p005kotlin.jvm.internal.s.g(this.f184906e, fVar.f184906e) && p005kotlin.jvm.internal.s.g(this.f184907f, fVar.f184907f) && p005kotlin.jvm.internal.s.g(this.f184908g, fVar.f184908g) && p005kotlin.jvm.internal.s.g(this.f184909h, fVar.f184909h) && p005kotlin.jvm.internal.s.g(this.f184910i, fVar.f184910i) && p005kotlin.jvm.internal.s.g(this.f184911j, fVar.f184911j) && p005kotlin.jvm.internal.s.g(this.f184912k, fVar.f184912k) && p005kotlin.jvm.internal.s.g(this.f184913l, fVar.f184913l) && p005kotlin.jvm.internal.s.g(this.f184914m, fVar.f184914m) && this.f184915n == fVar.f184915n && this.f184916o == fVar.f184916o && this.f184917p == fVar.f184917p && p005kotlin.jvm.internal.s.g(this.f184918q, fVar.f184918q) && p005kotlin.jvm.internal.s.g(this.f184919r, fVar.f184919r) && p005kotlin.jvm.internal.s.g(this.f184920s, fVar.f184920s) && p005kotlin.jvm.internal.s.g(this.f184921t, fVar.f184921t) && p005kotlin.jvm.internal.s.g(this.f184922u, fVar.f184922u) && this.f184923v == fVar.f184923v && this.f184924w == fVar.f184924w && p005kotlin.jvm.internal.s.g(this.f184925x, fVar.f184925x) && p005kotlin.jvm.internal.s.g(this.f184926y, fVar.f184926y) && p005kotlin.jvm.internal.s.g(this.f184927z, fVar.f184927z);
    }

    public final int hashCode() {
        int iHashCode = (this.f184903b.hashCode() + (this.f184902a.hashCode() * 31)) * 31;
        ag.a aVar = this.f184904c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.f184905d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f184906e;
        int iB = am.j.b(this.f184907f, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f184908g;
        int iHashCode4 = (this.f184909h.hashCode() + ((iB + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        o13.p<nf.j.a<?>, k23.d<?>> pVar = this.f184910i;
        int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        lf.h.a aVar2 = this.f184911j;
        int iHashCode6 = (this.f184917p.hashCode() + ((this.f184916o.hashCode() + ((this.f184915n.hashCode() + ((this.f184914m.hashCode() + ((this.f184913l.hashCode() + ((this.f184912k.hashCode() + ((iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        rf.b.C2864b c2864b = this.f184918q;
        return this.f184927z.hashCode() + ((this.f184926y.hashCode() + am.j.b(this.f184925x.f83559a, (this.f184924w.hashCode() + ((this.f184923v.hashCode() + ((this.f184922u.hashCode() + q6.f.h(q6.f.h(q6.f.h((iHashCode6 + (c2864b != null ? c2864b.hashCode() : 0)) * 31, this.f184919r, 31), this.f184920s, 31), this.f184921t, 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f184902a + ", data=" + this.f184903b + ", target=" + this.f184904c + ", listener=" + this.f184905d + ", memoryCacheKey=" + this.f184906e + ", memoryCacheKeyExtras=" + this.f184907f + ", diskCacheKey=" + this.f184908g + ", fileSystem=" + this.f184909h + ", fetcherFactory=" + this.f184910i + ", decoderFactory=" + this.f184911j + ", interceptorCoroutineContext=" + this.f184912k + ", fetcherCoroutineContext=" + this.f184913l + ", decoderCoroutineContext=" + this.f184914m + ", memoryCachePolicy=" + this.f184915n + ", diskCachePolicy=" + this.f184916o + ", networkCachePolicy=" + this.f184917p + ", placeholderMemoryCacheKey=" + this.f184918q + ", placeholderFactory=" + this.f184919r + ", errorFactory=" + this.f184920s + ", fallbackFactory=" + this.f184921t + ", sizeResolver=" + this.f184922u + ", scale=" + this.f184923v + ", precision=" + this.f184924w + ", extras=" + this.f184925x + ", defined=" + this.f184926y + ", defaults=" + this.f184927z + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lwf/f$b;", "", "Lw63/l;", "fileSystem", "Lt13/g;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lwf/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lwf/f;", "Lhf/h;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lxf/h;", "sizeResolver", "Lxf/f;", "scale", "Lxf/c;", "precision", "Lhf/f;", "extras", "<init>", "(Lw63/l;Lt13/g;Lt13/g;Lt13/g;Lwf/c;Lwf/c;Lwf/c;Le23/l;Le23/l;Le23/l;Lxf/h;Lxf/f;Lxf/c;Lhf/f;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f184953o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w63.l f184954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t13.g f184955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t13.g f184956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t13.g f184957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final wf.c f184958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final wf.c f184959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final wf.c f184960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e23.l<f, hf.h> f184961h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e23.l<f, hf.h> f184962i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final e23.l<f, hf.h> f184963j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final xf.h f184964k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final xf.f f184965l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final xf.c f184966m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final hf.f f184967n;

        static {
            new a(null);
            f184953o = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(w63.l lVar, t13.g gVar, t13.g gVar2, t13.g gVar3, wf.c cVar, wf.c cVar2, wf.c cVar3, e23.l lVar2, e23.l lVar3, e23.l lVar4, xf.h hVar, xf.f fVar, xf.c cVar4, hf.f fVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            t13.g gVar4;
            t13.g gVar5;
            lVar = (i14 & 1) != 0 ? w63.l.f183387a : lVar;
            t13.g gVar6 = (i14 & 2) != 0 ? t13.h.f161748a : gVar;
            if ((i14 & 4) != 0) {
                x53.c cVar5 = s0.f129406a;
                gVar4 = x53.b.f189152a;
            } else {
                gVar4 = gVar2;
            }
            if ((i14 & 8) != 0) {
                x53.c cVar6 = s0.f129406a;
                gVar5 = x53.b.f189152a;
            } else {
                gVar5 = gVar3;
            }
            this(lVar, gVar6, gVar4, gVar5, (i14 & 16) != 0 ? wf.c.ENABLED : cVar, (i14 & 32) != 0 ? wf.c.ENABLED : cVar2, (i14 & 64) != 0 ? wf.c.ENABLED : cVar3, (i14 & 128) != 0 ? dg.t.f59501a : lVar2, (i14 & 256) != 0 ? dg.t.f59501a : lVar3, (i14 & 512) != 0 ? dg.t.f59501a : lVar4, (i14 & 1024) != 0 ? xf.h.E0 : hVar, (i14 & 2048) != 0 ? xf.f.FIT : fVar, (i14 & 4096) != 0 ? xf.c.EXACT : cVar4, (i14 & 8192) != 0 ? hf.f.f83558b : fVar2);
        }

        public static b a(b bVar, wf.c cVar, wf.c cVar2, hf.f fVar, int i14) {
            w63.l lVar = bVar.f184954a;
            t13.g gVar = bVar.f184955b;
            t13.g gVar2 = bVar.f184956c;
            t13.g gVar3 = bVar.f184957d;
            wf.c cVar3 = (i14 & 16) != 0 ? bVar.f184958e : cVar;
            wf.c cVar4 = (i14 & 32) != 0 ? bVar.f184959f : cVar2;
            wf.c cVar5 = bVar.f184960g;
            wf.c cVar6 = cVar3;
            wf.c cVar7 = cVar4;
            e23.l<f, hf.h> lVar2 = bVar.f184961h;
            e23.l<f, hf.h> lVar3 = bVar.f184962i;
            e23.l<f, hf.h> lVar4 = bVar.f184963j;
            xf.h hVar = bVar.f184964k;
            xf.f fVar2 = bVar.f184965l;
            xf.c cVar8 = bVar.f184966m;
            hf.f fVar3 = (i14 & 8192) != 0 ? bVar.f184967n : fVar;
            bVar.getClass();
            return new b(lVar, gVar, gVar2, gVar3, cVar6, cVar7, cVar5, lVar2, lVar3, lVar4, hVar, fVar2, cVar8, fVar3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f184954a, bVar.f184954a) && p005kotlin.jvm.internal.s.g(this.f184955b, bVar.f184955b) && p005kotlin.jvm.internal.s.g(this.f184956c, bVar.f184956c) && p005kotlin.jvm.internal.s.g(this.f184957d, bVar.f184957d) && this.f184958e == bVar.f184958e && this.f184959f == bVar.f184959f && this.f184960g == bVar.f184960g && p005kotlin.jvm.internal.s.g(this.f184961h, bVar.f184961h) && p005kotlin.jvm.internal.s.g(this.f184962i, bVar.f184962i) && p005kotlin.jvm.internal.s.g(this.f184963j, bVar.f184963j) && p005kotlin.jvm.internal.s.g(this.f184964k, bVar.f184964k) && this.f184965l == bVar.f184965l && this.f184966m == bVar.f184966m && p005kotlin.jvm.internal.s.g(this.f184967n, bVar.f184967n);
        }

        public final int hashCode() {
            return this.f184967n.f83559a.hashCode() + ((this.f184966m.hashCode() + ((this.f184965l.hashCode() + ((this.f184964k.hashCode() + q6.f.h(q6.f.h(q6.f.h((this.f184960g.hashCode() + ((this.f184959f.hashCode() + ((this.f184958e.hashCode() + ((this.f184957d.hashCode() + ((this.f184956c.hashCode() + ((this.f184955b.hashCode() + (this.f184954a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.f184961h, 31), this.f184962i, 31), this.f184963j, 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Defaults(fileSystem=" + this.f184954a + ", interceptorCoroutineContext=" + this.f184955b + ", fetcherCoroutineContext=" + this.f184956c + ", decoderCoroutineContext=" + this.f184957d + ", memoryCachePolicy=" + this.f184958e + ", diskCachePolicy=" + this.f184959f + ", networkCachePolicy=" + this.f184960g + ", placeholderFactory=" + this.f184961h + ", errorFactory=" + this.f184962i + ", fallbackFactory=" + this.f184963j + ", sizeResolver=" + this.f184964k + ", scale=" + this.f184965l + ", precision=" + this.f184966m + ", extras=" + this.f184967n + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwf/f$b$a;", "", "<init>", "()V", "Lwf/f$b;", "DEFAULT", "Lwf/f$b;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }

        public b() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(w63.l lVar, t13.g gVar, t13.g gVar2, t13.g gVar3, wf.c cVar, wf.c cVar2, wf.c cVar3, e23.l<? super f, ? extends hf.h> lVar2, e23.l<? super f, ? extends hf.h> lVar3, e23.l<? super f, ? extends hf.h> lVar4, xf.h hVar, xf.f fVar, xf.c cVar4, hf.f fVar2) {
            this.f184954a = lVar;
            this.f184955b = gVar;
            this.f184956c = gVar2;
            this.f184957d = gVar3;
            this.f184958e = cVar;
            this.f184959f = cVar2;
            this.f184960g = cVar3;
            this.f184961h = lVar2;
            this.f184962i = lVar3;
            this.f184963j = lVar4;
            this.f184964k = hVar;
            this.f184965l = fVar;
            this.f184966m = cVar4;
            this.f184967n = fVar2;
        }
    }

    public /* synthetic */ f(Context context, Object obj, ag.a aVar, d dVar, String str, Map map, String str2, w63.l lVar, o13.p pVar, lf.h.a aVar2, t13.g gVar, t13.g gVar2, t13.g gVar3, wf.c cVar, wf.c cVar2, wf.c cVar3, rf.b.C2864b c2864b, e23.l lVar2, e23.l lVar3, e23.l lVar4, xf.h hVar, xf.f fVar, xf.c cVar4, hf.f fVar2, c cVar5, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(context, obj, aVar, dVar, str, map, str2, lVar, pVar, aVar2, gVar, gVar2, gVar3, cVar, cVar2, cVar3, c2864b, lVar2, lVar3, lVar4, hVar, fVar, cVar4, fVar2, cVar5, bVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lwf/f$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lwf/f;", "request", "(Lwf/f;Landroid/content/Context;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f184928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f184929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f184930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ag.a f184931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f184932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f184933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map f184934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f184935h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final w63.l f184936i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o13.p<? extends nf.j.a<?>, ? extends k23.d<?>> f184937j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public lf.h.a f184938k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public t13.g f184939l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public t13.g f184940m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public t13.g f184941n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public wf.c f184942o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public wf.c f184943p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final wf.c f184944q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final rf.b.C2864b f184945r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public e23.l<? super f, ? extends hf.h> f184946s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final e23.l<? super f, ? extends hf.h> f184947t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final e23.l<? super f, ? extends hf.h> f184948u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public xf.h f184949v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public xf.f f184950w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public xf.c f184951x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f184952y;

        public a(f fVar, Context context) {
            this.f184928a = context;
            this.f184929b = fVar.f184927z;
            this.f184930c = fVar.f184903b;
            this.f184931d = fVar.f184904c;
            this.f184932e = fVar.f184905d;
            this.f184933f = fVar.f184906e;
            this.f184934g = fVar.f184907f;
            this.f184935h = fVar.f184908g;
            c cVar = fVar.f184926y;
            this.f184936i = cVar.f184968a;
            this.f184937j = fVar.f184910i;
            this.f184938k = fVar.f184911j;
            this.f184939l = cVar.f184969b;
            this.f184940m = cVar.f184970c;
            this.f184941n = cVar.f184971d;
            this.f184942o = cVar.f184972e;
            this.f184943p = cVar.f184973f;
            this.f184944q = cVar.f184974g;
            this.f184945r = fVar.f184918q;
            this.f184946s = cVar.f184975h;
            this.f184947t = cVar.f184976i;
            this.f184948u = cVar.f184977j;
            this.f184949v = cVar.f184978k;
            this.f184950w = cVar.f184979l;
            this.f184951x = cVar.f184980m;
            this.f184952y = fVar.f184925x;
        }

        public final f a() {
            hf.f fVarA;
            Object obj = this.f184930c;
            if (obj == null) {
                obj = k.f184994a;
            }
            Object obj2 = obj;
            ag.a aVar = this.f184931d;
            String str = this.f184933f;
            Boolean bool = Boolean.FALSE;
            Map mapB = this.f184934g;
            if (p005kotlin.jvm.internal.s.g(mapB, bool)) {
                mapB.getClass();
                mapB = dg.b.b(y0.c(mapB));
            } else if (mapB == null) {
                e0.l();
                return null;
            }
            Map map = mapB;
            map.getClass();
            String str2 = this.f184935h;
            w63.l lVar = this.f184936i;
            if (lVar == null) {
                lVar = this.f184929b.f184954a;
            }
            w63.l lVar2 = lVar;
            lf.h.a aVar2 = this.f184938k;
            wf.c cVar = this.f184942o;
            if (cVar == null) {
                cVar = this.f184929b.f184958e;
            }
            wf.c cVar2 = cVar;
            wf.c cVar3 = this.f184943p;
            if (cVar3 == null) {
                cVar3 = this.f184929b.f184959f;
            }
            wf.c cVar4 = cVar3;
            wf.c cVar5 = this.f184944q;
            if (cVar5 == null) {
                cVar5 = this.f184929b.f184960g;
            }
            wf.c cVar6 = cVar5;
            t13.g gVar = this.f184939l;
            if (gVar == null) {
                gVar = this.f184929b.f184955b;
            }
            t13.g gVar2 = gVar;
            t13.g gVar3 = this.f184940m;
            if (gVar3 == null) {
                gVar3 = this.f184929b.f184956c;
            }
            t13.g gVar4 = gVar3;
            t13.g gVar5 = this.f184941n;
            if (gVar5 == null) {
                gVar5 = this.f184929b.f184957d;
            }
            t13.g gVar6 = gVar5;
            e23.l lVar3 = this.f184946s;
            if (lVar3 == null) {
                lVar3 = this.f184929b.f184961h;
            }
            e23.l lVar4 = lVar3;
            e23.l lVar5 = this.f184947t;
            if (lVar5 == null) {
                lVar5 = this.f184929b.f184962i;
            }
            e23.l lVar6 = lVar5;
            e23.l lVar7 = this.f184948u;
            if (lVar7 == null) {
                lVar7 = this.f184929b.f184963j;
            }
            e23.l lVar8 = lVar7;
            xf.h hVar = this.f184949v;
            if (hVar == null) {
                hVar = this.f184929b.f184964k;
            }
            xf.h hVar2 = hVar;
            xf.f fVar = this.f184950w;
            if (fVar == null) {
                fVar = this.f184929b.f184965l;
            }
            xf.f fVar2 = fVar;
            xf.c cVar7 = this.f184951x;
            if (cVar7 == null) {
                cVar7 = this.f184929b.f184966m;
            }
            xf.c cVar8 = cVar7;
            Object obj3 = this.f184952y;
            if (obj3 instanceof hf.f.a) {
                fVarA = ((hf.f.a) obj3).a();
            } else {
                if (!(obj3 instanceof hf.f)) {
                    e0.l();
                    return null;
                }
                fVarA = (hf.f) obj3;
            }
            hf.f fVar3 = fVarA;
            t13.g gVar7 = this.f184939l;
            t13.g gVar8 = this.f184940m;
            t13.g gVar9 = this.f184941n;
            e23.l<? super f, ? extends hf.h> lVar9 = this.f184946s;
            wf.c cVar9 = this.f184942o;
            wf.c cVar10 = this.f184943p;
            xf.h hVar3 = this.f184949v;
            xf.f fVar4 = this.f184950w;
            xf.c cVar11 = this.f184951x;
            return new f(this.f184928a, obj2, aVar, this.f184932e, str, map, str2, lVar2, this.f184937j, aVar2, gVar2, gVar4, gVar6, cVar2, cVar4, cVar6, this.f184945r, lVar4, lVar6, lVar8, hVar2, fVar2, cVar8, fVar3, new c(this.f184936i, gVar7, gVar8, gVar9, cVar9, cVar10, this.f184944q, lVar9, this.f184947t, this.f184948u, hVar3, fVar4, cVar11), this.f184929b, null);
        }

        public final hf.f.a b() {
            Object obj = this.f184952y;
            if (obj instanceof hf.f.a) {
                return (hf.f.a) obj;
            }
            if (!(obj instanceof hf.f)) {
                e0.l();
                return null;
            }
            hf.f.a aVar = new hf.f.a((hf.f) obj);
            this.f184952y = aVar;
            return aVar;
        }

        public final void c(xf.g gVar) {
            this.f184949v = new xf.d(gVar);
        }

        public a(f fVar, Context context, int i14, p005kotlin.jvm.internal.j jVar) {
            this(fVar, (i14 & 2) != 0 ? fVar.f184902a : context);
        }

        public a(Context context) {
            this.f184928a = context;
            this.f184929b = b.f184953o;
            this.f184930c = null;
            this.f184931d = null;
            this.f184932e = null;
            this.f184933f = null;
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            this.f184934g = k0Var;
            this.f184935h = null;
            this.f184936i = null;
            this.f184937j = null;
            this.f184938k = null;
            this.f184939l = null;
            this.f184940m = null;
            this.f184941n = null;
            this.f184942o = null;
            this.f184943p = null;
            this.f184944q = null;
            this.f184945r = null;
            dg.t.a aVar = dg.t.f59501a;
            this.f184946s = aVar;
            this.f184947t = aVar;
            this.f184948u = aVar;
            this.f184949v = null;
            this.f184950w = null;
            this.f184951x = null;
            this.f184952y = hf.f.f83558b;
        }

        public a(f fVar) {
            this(fVar, null, 2, null);
        }
    }
}

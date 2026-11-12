package hf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import coil3.request.NullRequestDataException;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o53.b0;
import o53.c0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lhf/n;", "Lhf/j;", "Lhf/n$a;", "options", "<init>", "(Lhf/n$a;)V", "Lh53/a;", "shutdown", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f83577f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f83578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f83579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wf.a f83580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f83581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile /* synthetic */ int f83582e;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhf/n$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", MimeTypes.BASE_TYPE_APPLICATION, "Lwf/f$b;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lo13/l;", "Lt13/g;", "mainCoroutineContextLazy", "Lrf/b;", "memoryCacheLazy", "Lmf/a;", "diskCacheLazy", "Lhf/e$c;", "eventListenerFactory", "Lhf/c;", "componentRegistry", "Ldg/l;", "logger", "<init>", "(Landroid/content/Context;Lwf/f$b;Lo13/l;Lo13/l;Lo13/l;Lhf/e$c;Lhf/c;Ldg/l;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f83583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wf.f.b f83584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.l<t13.g> f83585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o13.l<rf.b> f83586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o13.l<mf.a> f83587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e.c f83588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f83589g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, wf.f.b bVar, o13.l<? extends t13.g> lVar, o13.l<? extends rf.b> lVar2, o13.l<? extends mf.a> lVar3, e.c cVar, c cVar2, dg.l lVar4) {
            this.f83583a = context;
            this.f83584b = bVar;
            this.f83585c = lVar;
            this.f83586d = lVar2;
            this.f83587e = lVar3;
            this.f83588f = cVar;
            this.f83589g = cVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f83583a, aVar.f83583a) && p005kotlin.jvm.internal.s.g(this.f83584b, aVar.f83584b) && p005kotlin.jvm.internal.s.g(this.f83585c, aVar.f83585c) && p005kotlin.jvm.internal.s.g(this.f83586d, aVar.f83586d) && p005kotlin.jvm.internal.s.g(this.f83587e, aVar.f83587e) && p005kotlin.jvm.internal.s.g(this.f83588f, aVar.f83588f) && p005kotlin.jvm.internal.s.g(this.f83589g, aVar.f83589g) && p005kotlin.jvm.internal.s.g(null, null);
        }

        public final int hashCode() {
            return ((this.f83589g.hashCode() + ((this.f83588f.hashCode() + ((this.f83587e.hashCode() + ((this.f83586d.hashCode() + ((this.f83585c.hashCode() + ((this.f83584b.hashCode() + (this.f83583a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + 0;
        }

        public final String toString() {
            return "Options(application=" + this.f83583a + ", defaults=" + this.f83584b + ", mainCoroutineContextLazy=" + this.f83585c + ", memoryCacheLazy=" + this.f83586d + ", diskCacheLazy=" + this.f83587e + ", eventListenerFactory=" + this.f83588f + ", componentRegistry=" + this.f83589g + ", logger=" + ((Object) null) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwf/i;", "<anonymous>", "(Lo53/b0;)Lwf/i;"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {67}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super wf.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83590a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wf.f f83592c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wf.f fVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f83592c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return n.this.new b(this.f83592c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super wf.i> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83590a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f83590a = 1;
            int i15 = n.f83577f;
            Object objF = n.this.f(this.f83592c, 0, this);
            return objF == aVar ? aVar : objF;
        }
    }

    static {
        AtomicIntegerFieldUpdater.newUpdater(n.class, JWKParameterNames.RSA_EXPONENT);
    }

    public n(a aVar) {
        this.f83578a = aVar;
        aVar.getClass();
        this.f83579b = c0.a(t13.g.a.C3052a.d(new r(CoroutineExceptionHandler.f105965e0, null), ge1.b.h()));
        dg.a aVar2 = new dg.a(this);
        wf.a aVar3 = new wf.a(this, aVar2, null);
        this.f83580c = aVar3;
        c cVar = aVar.f83589g;
        cVar.getClass();
        c.a aVar4 = new c.a(cVar);
        f.c<Boolean> cVar2 = k.f83572a;
        wf.f.b bVar = aVar.f83584b;
        f fVar = bVar.f184967n;
        f.c<Boolean> cVar3 = k.f83572a;
        Object obj = fVar.f83559a.get(cVar3);
        boolean zBooleanValue = ((Boolean) (obj == null ? cVar3.f83562a : obj)).booleanValue();
        ArrayList arrayList = aVar4.f83552e;
        if (zBooleanValue) {
            aVar4.f83551d.add(new ha0.a(4));
            arrayList.add(new ha0.a(5));
        }
        qf.a aVar5 = new qf.a();
        t0 t0Var = s0.f105811a;
        aVar4.b(aVar5, t0Var.b(Uri.class));
        aVar4.b(new qf.e(), t0Var.b(Integer.class));
        o13.p pVar = new o13.p(new pf.a(), t0Var.b(y.class));
        ArrayList arrayList2 = aVar4.f83550c;
        arrayList2.add(pVar);
        aVar4.a(new nf.a.C2419a(), t0Var.b(y.class));
        aVar4.a(new nf.f.a(), t0Var.b(y.class));
        aVar4.a(new nf.n.a(), t0Var.b(y.class));
        aVar4.a(new nf.h.a(), t0Var.b(Drawable.class));
        aVar4.a(new nf.b.a(), t0Var.b(Bitmap.class));
        f.c<Integer> cVar4 = l.f83573a;
        f fVar2 = bVar.f184967n;
        f.c<Integer> cVar5 = l.f83573a;
        Object obj2 = fVar2.f83559a.get(cVar5);
        z53.g gVarA = z53.h.a(((Number) (obj2 == null ? cVar5.f83562a : obj2)).intValue());
        if (Build.VERSION.SDK_INT >= 29) {
            f fVar3 = bVar.f184967n;
            f.c<Boolean> cVar6 = l.f83575c;
            Object obj3 = fVar3.f83559a.get(cVar6);
            if (((Boolean) (obj3 == null ? cVar6.f83562a : obj3)).booleanValue()) {
                f fVar4 = bVar.f184967n;
                f.c<lf.l> cVar7 = l.f83574b;
                Object obj4 = fVar4.f83559a.get(cVar7);
                if (p005kotlin.jvm.internal.s.g((lf.l) (obj4 == null ? cVar7.f83562a : obj4), lf.l.f112099a)) {
                    arrayList.add(new dg.s(new lf.t.a(gVarA), 2));
                }
            }
        }
        f fVar5 = bVar.f184967n;
        f.c<lf.l> cVar8 = l.f83574b;
        Object obj5 = fVar5.f83559a.get(cVar8);
        arrayList.add(new dg.s(new lf.b.c(gVarA, (lf.l) (obj5 == null ? cVar8.f83562a : obj5)), 2));
        aVar4.b(new qf.b(), t0Var.b(File.class));
        aVar4.a(new nf.m.a(), t0Var.b(y.class));
        aVar4.a(new nf.d.a(), t0Var.b(ByteBuffer.class));
        aVar4.b(new qf.f(), t0Var.b(String.class));
        aVar4.b(new qf.d(), t0Var.b(w63.y.class));
        arrayList2.add(new o13.p(new pf.b(), t0Var.b(y.class)));
        arrayList2.add(new o13.p(new pf.d(), t0Var.b(y.class)));
        aVar4.a(new nf.k.a(), t0Var.b(y.class));
        aVar4.a(new nf.c.a(), t0Var.b(byte[].class));
        aVar4.a(new nf.g.b(), t0Var.b(y.class));
        aVar4.f83548a.add(new of.a(this, aVar2, aVar3, null));
        this.f83581d = aVar4.c();
    }

    @Override // hf.j
    public final Object a(wf.f fVar, v13.c cVar) {
        return ((fVar.f184904c instanceof ag.b) || (fVar.f184922u instanceof xf.k) || ((androidx.lifecycle.b0) g.a(fVar, wf.h.f184989e)) != null) ? c0.e(new o(this, fVar, null), cVar) : f(fVar, 1, cVar);
    }

    @Override // hf.j
    public final mf.a b() {
        return this.f83578a.f83587e.getValue();
    }

    @Override // hf.j
    public final wf.d c(wf.f fVar) {
        return u.a(fVar, ge1.b.j(this.f83579b, this.f83578a.f83585c.getValue(), null, new b(fVar, null), 2));
    }

    @Override // hf.j
    public final rf.b d() {
        return this.f83578a.f83586d.getValue();
    }

    @Override // hf.j
    public final wf.f.b e() {
        return this.f83578a.f83584b;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0189  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01da A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01e4 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:137:0x020b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0238  */
    /* JADX WARN: Code duplicated, block: B:146:0x0242 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0250  */
    /* JADX WARN: Code duplicated, block: B:149:0x0251 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0263  */
    /* JADX WARN: Code duplicated, block: B:152:0x0264 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0270 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0274 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0280 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:144:0x023c, B:146:0x0242, B:153:0x026a, B:149:0x0251, B:152:0x0264, B:154:0x0270, B:156:0x0274, B:159:0x0280, B:160:0x0285, B:28:0x006c, B:118:0x01c0, B:120:0x01c4, B:122:0x01ca, B:124:0x01d0, B:126:0x01d4, B:129:0x01da, B:131:0x01e4, B:133:0x01f0, B:134:0x01f3), top: B:178:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0298 A[Catch: all -> 0x02a5, TRY_LEAVE, TryCatch #1 {all -> 0x02a5, blocks: (B:167:0x0294, B:169:0x0298, B:174:0x02a7, B:175:0x02af), top: B:179:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x02a7 A[Catch: all -> 0x02a5, TRY_ENTER, TryCatch #1 {all -> 0x02a5, blocks: (B:167:0x0294, B:169:0x0298, B:174:0x02a7, B:175:0x02af), top: B:179:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b7, code lost:
    
        if (r1.a(r9) == r10) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [hf.n] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v30, types: [wf.f] */
    /* JADX WARN: Type inference failed for: r3v12, types: [hf.e, hf.e$a] */
    /* JADX WARN: Type inference failed for: r3v27, types: [hf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [wf.f] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [hf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v4, types: [hf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [wf.f] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, wf.f] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [hf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [wf.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [wf.f] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v0, types: [wf.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [wf.n] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(wf.f fVar, int i14, v13.c cVar) {
        p pVar;
        ?? A;
        wf.n jVar;
        wf.n nVar;
        xf.c cVar2;
        xf.f fVar2;
        ImageView.ScaleType scaleType;
        ?? r14;
        ?? r15;
        rf.b.C2864b c2864b;
        h hVar;
        ag.a aVar;
        Object objA;
        ?? r16;
        ?? r17;
        wf.n nVar2;
        h hVar2;
        h hVar3;
        rf.b bVarD;
        rf.b.c cVarA;
        ?? r18;
        ?? r19;
        Object objE0;
        ?? r24;
        wf.n nVar3;
        ?? r25;
        wf.i iVar;
        wf.p pVar2;
        ag.a aVar2;
        wf.f fVar3;
        cg.d dVarA;
        int i15;
        ?? r26 = fVar;
        int i16 = i14;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            i15 = pVar.f83607h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                int i17 = i15 - Integer.MIN_VALUE;
                pVar.f83607h = i17;
                A = i17;
            } else {
                pVar = new p(this, cVar);
                A = i15;
            }
        } else {
            pVar = new p(this, cVar);
            A = i15;
        }
        p pVar3 = pVar;
        Object obj = pVar3.f83605f;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        ?? r27 = pVar3.f83607h;
        a aVar4 = this.f83578a;
        try {
            if (r27 == 0) {
                o13.r.b(obj);
                l1 l1VarG = g8.i.G(pVar3.getF157466b());
                boolean z14 = i16 == 0;
                wf.a aVar5 = this.f83580c;
                aVar5.getClass();
                ag.a aVar6 = r26.f184904c;
                if (aVar6 instanceof ag.b) {
                    androidx.lifecycle.b0 b0VarD = (androidx.lifecycle.b0) g.a(r26, wf.h.f184989e);
                    if (b0VarD == null) {
                        b0VarD = wf.a.d(r26);
                    }
                    aVar5 = aVar5;
                    jVar = new wf.r(aVar5.f184891a, r26, (ag.b) aVar6, b0VarD, l1VarG);
                } else {
                    androidx.lifecycle.b0 b0VarD2 = (androidx.lifecycle.b0) g.a(r26, wf.h.f184989e);
                    if (b0VarD2 == null) {
                        b0VarD2 = z14 ? wf.a.d(r26) : null;
                    }
                    jVar = b0VarD2 != null ? new wf.j(b0VarD2, l1VarG) : wf.b.c(l1VarG);
                }
                jVar.b();
                wf.f.a aVarA = wf.f.a(r26);
                ag.a aVar7 = r26.f184904c;
                aVarA.f184929b = aVar5.f184891a.e();
                wf.f.c cVar3 = r26.f184926y;
                xf.h eVar = cVar3.f184978k;
                if (eVar == null) {
                    if (aVar7 instanceof ag.b) {
                        View view2 = ((ag.b) aVar7).getView();
                        eVar = ((view2 instanceof ImageView) && ((scaleType = ((ImageView) view2).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? xf.h.E0 : new xf.e(view2, true);
                    } else {
                        eVar = xf.h.E0;
                    }
                    aVarA.f184949v = eVar;
                }
                if (cVar3.f184979l == null) {
                    ag.b bVar = aVar7 instanceof ag.b ? (ag.b) aVar7 : null;
                    View view3 = bVar != null ? bVar.getView() : null;
                    ImageView imageView = view3 instanceof ImageView ? (ImageView) view3 : null;
                    if (imageView != null) {
                        Bitmap.Config[] configArr = dg.u.f59504a;
                        ImageView.ScaleType scaleType2 = imageView.getScaleType();
                        int i18 = scaleType2 == null ? -1 : dg.u.a.f59506a[scaleType2.ordinal()];
                        fVar2 = (i18 == 1 || i18 == 2 || i18 == 3 || i18 == 4) ? xf.f.FIT : xf.f.FILL;
                    } else {
                        fVar2 = r26.f184923v;
                    }
                    aVarA.f184950w = fVar2;
                }
                if (cVar3.f184980m == null) {
                    if (cVar3.f184978k == null && p005kotlin.jvm.internal.s.g(eVar, xf.h.E0)) {
                        cVar2 = xf.c.INEXACT;
                    } else if ((aVar7 instanceof ag.b) && (eVar instanceof xf.k)) {
                        ag.b bVar2 = (ag.b) aVar7;
                        if ((bVar2.getView() instanceof ImageView) && bVar2.getView() == ((xf.k) eVar).getView()) {
                            cVar2 = xf.c.INEXACT;
                        } else {
                            cVar2 = xf.c.EXACT;
                        }
                    } else {
                        cVar2 = xf.c.EXACT;
                    }
                    aVarA.f184951x = cVar2;
                }
                A = aVarA.a();
                ((hb.a) aVar4.f83588f).getClass();
                r27 = e.f83555a;
                try {
                    if (p005kotlin.jvm.internal.s.g(A.f184903b, wf.k.f184994a)) {
                        throw new NullRequestDataException();
                    }
                    jVar.start();
                    if (i16 == 0) {
                        pVar3.f83600a = jVar;
                        pVar3.f83601b = A;
                        pVar3.f83602c = r27;
                        pVar3.f83604e = i16;
                        pVar3.f83607h = 1;
                    }
                    nVar = jVar;
                    r15 = r27;
                    r14 = A;
                    c2864b = r14.f184918q;
                    if (c2864b != null) {
                        hVar = null;
                    } else {
                        hVar = null;
                    }
                    aVar = r14.f184904c;
                    if (aVar != null) {
                        if (hVar == null) {
                            hVar3 = (h) r14.f184919r.invoke(r14);
                            if (hVar3 == null) {
                                hVar3 = (h) r14.f184927z.f184961h.invoke(r14);
                            }
                        } else {
                            hVar3 = hVar;
                        }
                        aVar.a(hVar3);
                    }
                    r15.getClass();
                    xf.h hVar4 = r14.f184922u;
                    pVar3.f83600a = nVar;
                    pVar3.f83601b = r14;
                    pVar3.f83602c = r15;
                    pVar3.f83603d = hVar;
                    pVar3.f83604e = i16;
                    pVar3.f83607h = 2;
                    objA = hVar4.a(pVar3);
                    if (objA != aVar3) {
                        r16 = r14;
                        r17 = r15;
                        nVar2 = nVar;
                        hVar2 = hVar;
                        obj = objA;
                        r18 = r16;
                        int i19 = i16;
                        xf.g gVar = (xf.g) obj;
                        r17.getClass();
                        t13.g gVar2 = r18.f184912k;
                        r19 = r18;
                        q qVar = new q(r19, this, gVar, r17, hVar2, null);
                        pVar3.f83600a = nVar2;
                        pVar3.f83601b = r19;
                        pVar3.f83602c = r17;
                        pVar3.f83603d = null;
                        pVar3.f83604e = i19;
                        pVar3.f83607h = 3;
                        objE0 = ge1.b.e0(gVar2, qVar, pVar3);
                        if (objE0 != aVar3) {
                            r24 = r17;
                            nVar3 = nVar2;
                            r25 = r19;
                            obj = objE0;
                            iVar = (wf.i) obj;
                            if (iVar instanceof wf.p) {
                                pVar2 = (wf.p) iVar;
                                aVar2 = r25.f184904c;
                                fVar3 = pVar2.f185007b;
                                aVar4.getClass();
                                if (aVar2 instanceof cg.e) {
                                    dVarA = ((cg.d.a) g.a(fVar3, wf.h.f184985a)).a((cg.e) aVar2, pVar2);
                                    if (!(dVarA instanceof cg.c)) {
                                        r24.getClass();
                                        dVarA.a();
                                    }
                                }
                                r24.getClass();
                                wf.f.d dVar = fVar3.f184905d;
                            } else {
                                if (!(iVar instanceof wf.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g((wf.e) iVar, r25.f184904c, r24);
                            }
                            nVar3.complete();
                            return iVar;
                        }
                    }
                    return aVar3;
                } catch (Throwable th3) {
                    th = th3;
                    r26 = jVar;
                    if (th instanceof CancellationException) {
                        aVar4.getClass();
                        r27.getClass();
                        wf.f.d dVar2 = A.f184905d;
                        throw th;
                    }
                    wf.e eVarA = dg.t.a(A, th);
                    g(eVarA, A.f184904c, r27);
                    r26.complete();
                    return eVarA;
                }
            }
            if (r27 == 1) {
                i16 = pVar3.f83604e;
                e eVar2 = pVar3.f83602c;
                wf.f fVar4 = pVar3.f83601b;
                nVar = pVar3.f83600a;
                o13.r.b(obj);
                r15 = eVar2;
                r14 = fVar4;
                c2864b = r14.f184918q;
                if (c2864b != null || (bVarD = d()) == null || (cVarA = bVarD.a(c2864b)) == null) {
                    hVar = null;
                } else {
                    hVar = cVarA.f152367a;
                }
                aVar = r14.f184904c;
                if (aVar != null) {
                    if (hVar == null) {
                        hVar3 = (h) r14.f184919r.invoke(r14);
                        if (hVar3 == null) {
                            hVar3 = (h) r14.f184927z.f184961h.invoke(r14);
                        }
                    } else {
                        hVar3 = hVar;
                    }
                    aVar.a(hVar3);
                }
                r15.getClass();
                xf.h hVar5 = r14.f184922u;
                pVar3.f83600a = nVar;
                pVar3.f83601b = r14;
                pVar3.f83602c = r15;
                pVar3.f83603d = hVar;
                pVar3.f83604e = i16;
                pVar3.f83607h = 2;
                objA = hVar5.a(pVar3);
                if (objA != aVar3) {
                    r16 = r14;
                    r17 = r15;
                    nVar2 = nVar;
                    hVar2 = hVar;
                    obj = objA;
                    r18 = r16;
                    int i110 = i16;
                    xf.g gVar3 = (xf.g) obj;
                    r17.getClass();
                    t13.g gVar4 = r18.f184912k;
                    r19 = r18;
                    q qVar2 = new q(r19, this, gVar3, r17, hVar2, null);
                    pVar3.f83600a = nVar2;
                    pVar3.f83601b = r19;
                    pVar3.f83602c = r17;
                    pVar3.f83603d = null;
                    pVar3.f83604e = i110;
                    pVar3.f83607h = 3;
                    objE0 = ge1.b.e0(gVar4, qVar2, pVar3);
                    if (objE0 != aVar3) {
                        r24 = r17;
                        nVar3 = nVar2;
                        r25 = r19;
                        obj = objE0;
                        iVar = (wf.i) obj;
                        if (iVar instanceof wf.p) {
                            pVar2 = (wf.p) iVar;
                            aVar2 = r25.f184904c;
                            fVar3 = pVar2.f185007b;
                            aVar4.getClass();
                            if (aVar2 instanceof cg.e) {
                                dVarA = ((cg.d.a) g.a(fVar3, wf.h.f184985a)).a((cg.e) aVar2, pVar2);
                                if (!(dVarA instanceof cg.c)) {
                                    r24.getClass();
                                    dVarA.a();
                                }
                            }
                            r24.getClass();
                            wf.f.d dVar3 = fVar3.f184905d;
                        } else {
                            if (!(iVar instanceof wf.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            g((wf.e) iVar, r25.f184904c, r24);
                        }
                        nVar3.complete();
                        return iVar;
                    }
                }
                return aVar3;
            }
            if (r27 == 2) {
                i16 = pVar3.f83604e;
                h hVar6 = pVar3.f83603d;
                e eVar3 = pVar3.f83602c;
                wf.f fVar5 = pVar3.f83601b;
                wf.n nVar4 = pVar3.f83600a;
                try {
                    o13.r.b(obj);
                    r16 = fVar5;
                    hVar2 = hVar6;
                    nVar2 = nVar4;
                    r17 = eVar3;
                    r18 = r16;
                    int i111 = i16;
                    try {
                        xf.g gVar5 = (xf.g) obj;
                        r17.getClass();
                        t13.g gVar6 = r18.f184912k;
                        r19 = r18;
                        try {
                            q qVar3 = new q(r19, this, gVar5, r17, hVar2, null);
                            pVar3.f83600a = nVar2;
                            pVar3.f83601b = r19;
                            pVar3.f83602c = r17;
                            pVar3.f83603d = null;
                            pVar3.f83604e = i111;
                            pVar3.f83607h = 3;
                            objE0 = ge1.b.e0(gVar6, qVar3, pVar3);
                            if (objE0 != aVar3) {
                                r24 = r17;
                                nVar3 = nVar2;
                                r25 = r19;
                                obj = objE0;
                            }
                            return aVar3;
                        } catch (Throwable th4) {
                            th = th4;
                            r27 = r17;
                            r26 = nVar2;
                            A = r19;
                            try {
                                if (th instanceof CancellationException) {
                                    wf.e eVarA2 = dg.t.a(A, th);
                                    g(eVarA2, A.f184904c, r27);
                                    r26.complete();
                                    return eVarA2;
                                }
                                aVar4.getClass();
                                r27.getClass();
                                wf.f.d dVar4 = A.f184905d;
                                throw th;
                            } catch (Throwable th5) {
                                r26.complete();
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r19 = r18;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r27 = eVar3;
                    A = fVar5;
                    r26 = nVar4;
                    if (th instanceof CancellationException) {
                        wf.e eVarA3 = dg.t.a(A, th);
                        g(eVarA3, A.f184904c, r27);
                        r26.complete();
                        return eVarA3;
                    }
                    aVar4.getClass();
                    r27.getClass();
                    wf.f.d dVar5 = A.f184905d;
                    throw th;
                }
            } else {
                if (r27 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e eVar4 = pVar3.f83602c;
                wf.f fVar6 = pVar3.f83601b;
                nVar3 = pVar3.f83600a;
                o13.r.b(obj);
                r24 = eVar4;
                r25 = fVar6;
            }
            iVar = (wf.i) obj;
            if (iVar instanceof wf.p) {
                pVar2 = (wf.p) iVar;
                aVar2 = r25.f184904c;
                fVar3 = pVar2.f185007b;
                aVar4.getClass();
                if (aVar2 instanceof cg.e) {
                    dVarA = ((cg.d.a) g.a(fVar3, wf.h.f184985a)).a((cg.e) aVar2, pVar2);
                    if (!(dVarA instanceof cg.c)) {
                        r24.getClass();
                        dVarA.a();
                    }
                }
                r24.getClass();
                wf.f.d dVar6 = fVar3.f184905d;
            } else {
                if (!(iVar instanceof wf.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                g((wf.e) iVar, r25.f184904c, r24);
            }
            nVar3.complete();
            return iVar;
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final void g(wf.e eVar, ag.a aVar, e eVar2) {
        wf.f fVar = eVar.f184900b;
        this.f83578a.getClass();
        if (aVar instanceof cg.e) {
            cg.d dVarA = ((cg.d.a) g.a(fVar, wf.h.f184985a)).a((cg.e) aVar, eVar);
            if (!(dVarA instanceof cg.c)) {
                eVar2.getClass();
                dVarA.a();
            }
        }
        eVar2.getClass();
        wf.f.d dVar = fVar.f184905d;
    }

    @Override // hf.j
    /* JADX INFO: renamed from: getComponents, reason: from getter */
    public final c getF83581d() {
        return this.f83581d;
    }
}

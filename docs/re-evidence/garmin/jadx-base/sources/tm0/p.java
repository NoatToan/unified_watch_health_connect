package tm0;

import android.content.Context;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.s0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.n0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostViewModel$tryUploadImagesAgain$1", f = "CreatePostViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<t0<g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f165412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<ef0.b> f165413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f165414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f165415e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostViewModel$tryUploadImagesAgain$1$1", f = "CreatePostViewModel.kt", l = {90, 104, 105}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f165416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f165417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection f165418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f165419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f165420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f165421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f165422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f165423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f165424i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<ef0.b> f165425j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t0<g3<Unit>> f165426k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l f165427l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f165428m;

        /* JADX INFO: renamed from: tm0.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljo1/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostViewModel$tryUploadImagesAgain$1$1$2$1", f = "CreatePostViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
        public static final class C3109a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends jo1.f>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f165429a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f165430b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f165431c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MultipartBody.Part f165432d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3109a(l lVar, MultipartBody.Part part, t13.d<? super C3109a> dVar) {
                super(2, dVar);
                this.f165431c = lVar;
                this.f165432d = part;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3109a c3109a = new C3109a(this.f165431c, this.f165432d, dVar);
                c3109a.f165430b = obj;
                return c3109a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends jo1.f>> dVar) {
                return ((C3109a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var = (b0) this.f165430b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f165429a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    ym0.a aVar2 = this.f165431c.f165396b;
                    this.f165430b = b0Var;
                    this.f165429a = 1;
                    aVar2.getClass();
                    obj = f0.J(aVar2, new n0(aVar2, this.f165432d, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                v2 v2Var = (v2) obj;
                if (!(v2Var instanceof v2.a)) {
                    if (v2Var instanceof v2.b) {
                        return v2Var;
                    }
                    u0.r();
                    return null;
                }
                a2 a2Var = a2.GENERAL;
                Exception exc = ((v2.a) v2Var).f47383a;
                i2.f36769a.getClass();
                i2.a.g(a2Var, "CreatePostViewModel", exc);
                return v2Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<ef0.b> list, t0<g3<Unit>> t0Var, l lVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f165425j = list;
            this.f165426k = t0Var;
            this.f165427l = lVar;
            this.f165428m = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f165425j, this.f165426k, this.f165427l, this.f165428m, dVar);
            aVar.f165424i = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0060  */
        /* JADX WARN: Code duplicated, block: B:22:0x0081  */
        /* JADX WARN: Code duplicated, block: B:23:0x0082 A[Catch: Exception -> 0x0041, PHI: r0 r9 r10 r11 r12 r13 r14 r15
          0x0082: PHI (r0v12 java.lang.Object) = (r0v10 java.lang.Object), (r0v19 java.lang.Object) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r9v7 int) = (r9v4 int), (r9v8 int) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r10v4 int) = (r10v2 int), (r10v5 int) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r11v5 int) = (r11v3 int), (r11v6 int) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r12v4 java.util.Iterator) = (r12v2 java.util.Iterator), (r12v5 java.util.Iterator) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r13v5 java.util.Collection) = (r13v2 java.util.Collection), (r13v7 java.util.Collection) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r14v4 android.content.Context) = (r14v2 android.content.Context), (r14v5 android.content.Context) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0082: PHI (r15v4 tm0.l) = (r15v2 tm0.l), (r15v5 tm0.l) binds: [B:21:0x007f, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:12:0x003b, B:23:0x0082, B:20:0x0066), top: B:41:0x003b }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007f -> B:23:0x0082). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tm0.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List<ef0.b> list, l lVar, Context context, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f165413c = list;
        this.f165414d = lVar;
        this.f165415e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f165413c, this.f165414d, this.f165415e, dVar);
        pVar.f165412b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((p) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f165412b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165411a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f165413c, t0Var, this.f165414d, this.f165415e, null);
            this.f165412b = null;
            this.f165411a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

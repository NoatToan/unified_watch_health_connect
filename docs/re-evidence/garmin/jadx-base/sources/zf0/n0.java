package zf0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$fetchEventImageUrlsAsync$1", f = "RaceAndEventBaseViewModel.kt", l = {196}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f204444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f204445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f204446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f204447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f204448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f204449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f204450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f204451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f204452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f204453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f204454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<fg0.k> f204455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<Boolean> f204456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j0 f204457n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$fetchEventImageUrlsAsync$1$1$1$1", f = "RaceAndEventBaseViewModel.kt", l = {196}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f204459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fg0.k f204460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, fg0.k kVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f204459b = j0Var;
            this.f204460c = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f204459b, this.f204460c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204458a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f204458a = 1;
                Object objL4 = this.f204459b.L4(this.f204460c, this);
                return objL4 == aVar ? aVar : objL4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(List<fg0.k> list, androidx.lifecycle.y0<Boolean> y0Var, j0 j0Var, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f204455l = list;
        this.f204456m = y0Var;
        this.f204457n = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f204455l, this.f204456m, this.f204457n, dVar);
        n0Var.f204454k = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a8 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x005c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

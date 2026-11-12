package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import e23.p;
import o13.r;
import p1.t0;
import q53.k;
import r53.j;
import r53.o2;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {119, 121}, m = "invokeSuspend", v = 1)
public final class q4 extends i implements p<j<? super Float>, d<? super p005kotlin.Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f91400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f91402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f91403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f91404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r4 f91405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q53.i<p005kotlin.Unit> f91406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f91407h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(ContentResolver contentResolver, Uri uri, r4 r4Var, q53.i<p005kotlin.Unit> iVar, Context context, d<? super q4> dVar) {
        super(2, dVar);
        this.f91403d = contentResolver;
        this.f91404e = uri;
        this.f91405f = r4Var;
        this.f91406g = iVar;
        this.f91407h = context;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        q4 q4Var = new q4(this.f91403d, this.f91404e, this.f91405f, this.f91406g, this.f91407h, dVar);
        q4Var.f91402c = obj;
        return q4Var;
    }

    @Override // e23.p
    public final Object invoke(j<? super Float> jVar, d<? super p005kotlin.Unit> dVar) {
        return ((q4) create(jVar, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0041, B:22:0x0051, B:24:0x0059, B:14:0x002a, B:17:0x003b), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar;
        k<p005kotlin.Unit> it;
        j jVar2;
        Object objA;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f91401b;
        r4 r4Var = this.f91405f;
        ContentResolver contentResolver = this.f91403d;
        try {
            if (i14 == 0) {
                r.b(obj);
                jVar = (j) this.f91402c;
                contentResolver.registerContentObserver(this.f91404e, false, r4Var);
                it = this.f91406g.iterator();
                this.f91402c = jVar;
                this.f91400a = it;
                this.f91401b = 1;
                objA = it.a(this);
                if (objA == aVar) {
                    jVar2 = jVar;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        contentResolver.unregisterContentObserver(r4Var);
                        return p005kotlin.Unit.INSTANCE;
                    }
                    it.next();
                    Context context = this.f91407h;
                    t0<Context, o2<Float>> t0Var = s4.f91480a;
                    Float f14 = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    this.f91402c = jVar2;
                    this.f91400a = it;
                    this.f91401b = 2;
                }
                return aVar;
            }
            if (i14 == 1) {
                it = this.f91400a;
                jVar2 = (j) this.f91402c;
                r.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(r4Var);
                    return p005kotlin.Unit.INSTANCE;
                }
                it.next();
                Context context2 = this.f91407h;
                t0<Context, o2<Float>> t0Var2 = s4.f91480a;
                Float f15 = new Float(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f91402c = jVar2;
                this.f91400a = it;
                this.f91401b = 2;
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = this.f91400a;
                jVar2 = (j) this.f91402c;
                r.b(obj);
            }
            jVar = jVar2;
            this.f91402c = jVar;
            this.f91400a = it;
            this.f91401b = 1;
            objA = it.a(this);
            if (objA == aVar) {
                jVar2 = jVar;
                obj = objA;
                if (!((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(r4Var);
                    return p005kotlin.Unit.INSTANCE;
                }
                it.next();
                Context context3 = this.f91407h;
                t0<Context, o2<Float>> t0Var3 = s4.f91480a;
                Float f16 = new Float(Settings.Global.getFloat(context3.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f91402c = jVar2;
                this.f91400a = it;
                this.f91401b = 2;
            }
            return aVar;
        } catch (Throwable th3) {
            contentResolver.unregisterContentObserver(r4Var);
            throw th3;
        }
    }
}

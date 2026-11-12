package tm0;

import android.content.Context;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import ym0.n0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lef0/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostViewModel$uploadImage$1", f = "CreatePostViewModel.kt", l = {43, 44, 45, 46, 49, 53}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<t0<g3<? extends ef0.b>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f165434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f165435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f165436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ef0.b f165437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, Context context, ef0.b bVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f165435c = lVar;
        this.f165436d = context;
        this.f165437e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f165435c, this.f165436d, this.f165437e, dVar);
        qVar.f165434b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends ef0.b>> t0Var, t13.d<? super Unit> dVar) {
        return ((q) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: Exception -> 0x0022, PHI: r13
      0x0058: PHI (r13v10 java.lang.Object) = (r13v9 java.lang.Object), (r13v0 java.lang.Object) binds: [B:19:0x0054, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0027, B:24:0x0070, B:26:0x0076, B:29:0x0091, B:31:0x0095, B:34:0x00b6, B:35:0x00bb, B:11:0x002b, B:21:0x0058, B:12:0x002f, B:18:0x0049, B:15:0x0036), top: B:41:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: Exception -> 0x0022, PHI: r13
      0x0070: PHI (r13v13 java.lang.Object) = (r13v12 java.lang.Object), (r13v0 java.lang.Object) binds: [B:22:0x006d, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0027, B:24:0x0070, B:26:0x0076, B:29:0x0091, B:31:0x0095, B:34:0x00b6, B:35:0x00bb, B:11:0x002b, B:21:0x0058, B:12:0x002f, B:18:0x0049, B:15:0x0036), top: B:41:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0027, B:24:0x0070, B:26:0x0076, B:29:0x0091, B:31:0x0095, B:34:0x00b6, B:35:0x00bb, B:11:0x002b, B:21:0x0058, B:12:0x002f, B:18:0x0049, B:15:0x0036), top: B:41:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0027, B:24:0x0070, B:26:0x0076, B:29:0x0091, B:31:0x0095, B:34:0x00b6, B:35:0x00bb, B:11:0x002b, B:21:0x0058, B:12:0x002f, B:18:0x0049, B:15:0x0036), top: B:41:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0027, B:24:0x0070, B:26:0x0076, B:29:0x0091, B:31:0x0095, B:34:0x00b6, B:35:0x00bb, B:11:0x002b, B:21:0x0058, B:12:0x002f, B:18:0x0049, B:15:0x0036), top: B:41:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0027, B:24:0x0070, B:26:0x0076, B:29:0x0091, B:31:0x0095, B:34:0x00b6, B:35:0x00bb, B:11:0x002b, B:21:0x0058, B:12:0x002f, B:18:0x0049, B:15:0x0036), top: B:41:0x000e }] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        if (r1.emit(r13, r12) == r2) goto L38;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        v2 v2Var;
        g3 g3VarD;
        g3 g3VarA;
        t0 t0Var = (t0) this.f165434b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165433a;
        l lVar = this.f165435c;
        ef0.b bVar = this.f165437e;
        try {
            switch (i14) {
                case 0:
                    o13.r.b(obj);
                    g3 g3VarC = g3.a.c(g3.f35298f);
                    this.f165434b = t0Var;
                    this.f165433a = 1;
                    if (t0Var.emit(g3VarC, this) != aVar) {
                        Context context = this.f165436d;
                        this.f165434b = t0Var;
                        this.f165433a = 2;
                        obj = l.x4(lVar, context, bVar, this);
                        if (obj == aVar) {
                            ym0.a aVar2 = lVar.f165396b;
                            this.f165434b = t0Var;
                            this.f165433a = 3;
                            aVar2.getClass();
                            obj = f0.J(aVar2, new n0(aVar2, (MultipartBody.Part) obj, null), this);
                            if (obj != aVar) {
                                v2Var = (v2) obj;
                                if (v2Var instanceof v2.a) {
                                    g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                    this.f165434b = t0Var;
                                    this.f165433a = 4;
                                    if (t0Var.emit(g3VarA, this) == aVar) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (v2Var instanceof v2.b) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                T t7 = ((v2.b) v2Var).f47386a;
                                bVar.getClass();
                                t7.getClass();
                                bVar.f63941c = t7;
                                g3.f35298f.getClass();
                                g3VarD = g3.a.d(bVar);
                                this.f165434b = t0Var;
                                this.f165433a = 5;
                                if (t0Var.emit(g3VarD, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return aVar;
                case 1:
                    o13.r.b(obj);
                    Context context2 = this.f165436d;
                    this.f165434b = t0Var;
                    this.f165433a = 2;
                    obj = l.x4(lVar, context2, bVar, this);
                    if (obj == aVar) {
                        ym0.a aVar3 = lVar.f165396b;
                        this.f165434b = t0Var;
                        this.f165433a = 3;
                        aVar3.getClass();
                        obj = f0.J(aVar3, new n0(aVar3, (MultipartBody.Part) obj, null), this);
                        if (obj != aVar) {
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.a) {
                                g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                this.f165434b = t0Var;
                                this.f165433a = 4;
                                if (t0Var.emit(g3VarA, this) == aVar) {
                                }
                                return Unit.INSTANCE;
                            }
                            if (v2Var instanceof v2.b) {
                                throw new NoWhenBranchMatchedException();
                            }
                            T t14 = ((v2.b) v2Var).f47386a;
                            bVar.getClass();
                            t14.getClass();
                            bVar.f63941c = t14;
                            g3.f35298f.getClass();
                            g3VarD = g3.a.d(bVar);
                            this.f165434b = t0Var;
                            this.f165433a = 5;
                            if (t0Var.emit(g3VarD, this) == aVar) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar;
                case 2:
                    o13.r.b(obj);
                    ym0.a aVar4 = lVar.f165396b;
                    this.f165434b = t0Var;
                    this.f165433a = 3;
                    aVar4.getClass();
                    obj = f0.J(aVar4, new n0(aVar4, (MultipartBody.Part) obj, null), this);
                    if (obj != aVar) {
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.a) {
                            g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                            this.f165434b = t0Var;
                            this.f165433a = 4;
                            if (t0Var.emit(g3VarA, this) == aVar) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (v2Var instanceof v2.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        T t15 = ((v2.b) v2Var).f47386a;
                        bVar.getClass();
                        t15.getClass();
                        bVar.f63941c = t15;
                        g3.f35298f.getClass();
                        g3VarD = g3.a.d(bVar);
                        this.f165434b = t0Var;
                        this.f165433a = 5;
                        if (t0Var.emit(g3VarD, this) == aVar) {
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar;
                case 3:
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.a) {
                        g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                        this.f165434b = t0Var;
                        this.f165433a = 4;
                        if (t0Var.emit(g3VarA, this) == aVar) {
                            return aVar;
                        }
                        return Unit.INSTANCE;
                    }
                    if (v2Var instanceof v2.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T t16 = ((v2.b) v2Var).f47386a;
                    bVar.getClass();
                    t16.getClass();
                    bVar.f63941c = t16;
                    g3.f35298f.getClass();
                    g3VarD = g3.a.d(bVar);
                    this.f165434b = t0Var;
                    this.f165433a = 5;
                    if (t0Var.emit(g3VarD, this) == aVar) {
                        return aVar;
                    }
                    return Unit.INSTANCE;
                case 4:
                case 5:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 6:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e4) {
            g3 g3VarA2 = g3.a.a(g3.f35298f, null, e4, null, null, 13);
            this.f165434b = null;
            this.f165433a = 6;
        }
    }
}

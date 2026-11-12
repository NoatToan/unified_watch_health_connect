package ed0;

import e23.p;
import java.util.Collection;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.sharing.DeviceSharingUtil$reconcilePairedDevices$1", f = "DeviceSharingUtil.kt", l = {228, 230, 231, 232, 236, 237, 238}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f63860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f63861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f63863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<Void> f63864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, lm2.i.b<Void> bVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f63863d = str;
        this.f63864e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f63863d, this.f63864e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3 A[Catch: all -> 0x0043, PHI: r10
      0x00a3: PHI (r10v20 java.lang.Object) = (r10v19 java.lang.Object), (r10v0 java.lang.Object) binds: [B:24:0x009f, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:10:0x003e, B:33:0x00ca, B:15:0x004b, B:29:0x00b6, B:16:0x004f, B:26:0x00a3, B:17:0x0053, B:23:0x0077, B:20:0x005a), top: B:49:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:10:0x003e, B:33:0x00ca, B:15:0x004b, B:29:0x00b6, B:16:0x004f, B:26:0x00a3, B:17:0x0053, B:23:0x0077, B:20:0x005a), top: B:49:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:10:0x003e, B:33:0x00ca, B:15:0x004b, B:29:0x00b6, B:16:0x004f, B:26:0x00a3, B:17:0x0053, B:23:0x0077, B:20:0x005a), top: B:49:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0112 A[PHI: r1
      0x0112: PHI (r1v3 java.lang.Throwable) = (r1v2 java.lang.Throwable), (r1v21 java.lang.Throwable) binds: [B:39:0x010f, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Throwable th3;
        Collection collection;
        l80.a aVar;
        Throwable th4;
        Collection collection2;
        l80.a aVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f63862c;
        lm2.i.b<Void> bVar = this.f63864e;
        String str = this.f63863d;
        try {
            switch (i14) {
                case 0:
                    r.b(obj);
                    an2.a aVarA = a.a(a.f63825a);
                    this.f63862c = 1;
                    aVarA.getClass();
                    x53.c cVar = s0.f129406a;
                    if (ge1.b.e0(x53.b.f189152a, new an2.k(aVarA, null), this) != aVar3) {
                        a.f63825a.getClass();
                        a.g().info("DeviceSharingUtil - " + str + ".reconcilePairedDevices complete");
                        a.c cVarE = a.e();
                        this.f63862c = 2;
                        obj = cVarE.c();
                        if (obj == aVar3) {
                            collection2 = (Collection) obj;
                            a aVar4 = a.f63825a;
                            this.f63860a = collection2;
                            this.f63862c = 3;
                            aVar4.getClass();
                            if (a.n(collection2, this) != aVar3) {
                                aVar2 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                                this.f63860a = null;
                                this.f63862c = 4;
                                if (aVar2.O(this) == aVar3) {
                                }
                                if (bVar != null) {
                                    bVar.a(null);
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return aVar3;
                case 1:
                    r.b(obj);
                    a.f63825a.getClass();
                    a.g().info("DeviceSharingUtil - " + str + ".reconcilePairedDevices complete");
                    a.c cVarE2 = a.e();
                    this.f63862c = 2;
                    obj = cVarE2.c();
                    if (obj == aVar3) {
                        collection2 = (Collection) obj;
                        a aVar5 = a.f63825a;
                        this.f63860a = collection2;
                        this.f63862c = 3;
                        aVar5.getClass();
                        if (a.n(collection2, this) != aVar3) {
                            aVar2 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                            this.f63860a = null;
                            this.f63862c = 4;
                            if (aVar2.O(this) == aVar3) {
                            }
                            if (bVar != null) {
                                bVar.a(null);
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar3;
                case 2:
                    r.b(obj);
                    collection2 = (Collection) obj;
                    a aVar6 = a.f63825a;
                    this.f63860a = collection2;
                    this.f63862c = 3;
                    aVar6.getClass();
                    if (a.n(collection2, this) != aVar3) {
                        aVar2 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                        this.f63860a = null;
                        this.f63862c = 4;
                        if (aVar2.O(this) == aVar3) {
                        }
                        if (bVar != null) {
                            bVar.a(null);
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar3;
                case 3:
                    r.b(obj);
                    aVar2 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                    this.f63860a = null;
                    this.f63862c = 4;
                    if (aVar2.O(this) == aVar3) {
                        return aVar3;
                    }
                    if (bVar != null) {
                        bVar.a(null);
                        break;
                    }
                    return Unit.INSTANCE;
                case 4:
                    r.b(obj);
                    if (bVar != null) {
                        bVar.a(null);
                        break;
                    }
                    return Unit.INSTANCE;
                case 5:
                    th3 = (Throwable) this.f63860a;
                    r.b(obj);
                    collection = (Collection) obj;
                    a aVar7 = a.f63825a;
                    this.f63860a = th3;
                    this.f63861b = collection;
                    this.f63862c = 6;
                    aVar7.getClass();
                    if (a.n(collection, this) != aVar3) {
                        aVar = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                        this.f63860a = th3;
                        this.f63861b = null;
                        this.f63862c = 7;
                        if (aVar.O(this) != aVar3) {
                            th4 = th3;
                            if (bVar != null) {
                                bVar.onFailure(th4);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar3;
                case 6:
                    Collection collection3 = this.f63861b;
                    th3 = (Throwable) this.f63860a;
                    r.b(obj);
                    aVar = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                    this.f63860a = th3;
                    this.f63861b = null;
                    this.f63862c = 7;
                    if (aVar.O(this) != aVar3) {
                        th4 = th3;
                        if (bVar != null) {
                            bVar.onFailure(th4);
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar3;
                case 7:
                    Collection collection4 = this.f63861b;
                    th4 = (Throwable) this.f63860a;
                    r.b(obj);
                    if (bVar != null) {
                        bVar.onFailure(th4);
                    }
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th5) {
            th3 = th5;
            a.f63825a.getClass();
            a.g().error("DeviceSharingUtil - " + str + ".reconcilePairedDevices failed", th3);
            a.c cVarE3 = a.e();
            this.f63860a = th3;
            this.f63862c = 5;
            obj = cVarE3.c();
            if (obj != aVar3) {
                collection = (Collection) obj;
                a aVar8 = a.f63825a;
                this.f63860a = th3;
                this.f63861b = collection;
                this.f63862c = 6;
                aVar8.getClass();
                if (a.n(collection, this) != aVar3) {
                    aVar = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                    this.f63860a = th3;
                    this.f63861b = null;
                    this.f63862c = 7;
                    if (aVar.O(this) != aVar3) {
                        th4 = th3;
                        if (bVar != null) {
                            bVar.onFailure(th4);
                        }
                    }
                }
            }
        }
    }
}

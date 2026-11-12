package jx2;

import android.os.SystemClock;
import androidx.room.a0;
import com.garmin.samd.exception.NetworkException;
import com.garmin.samd.exception.NullAppDelegateException;
import o53.b0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDAccountManager$isDeviceHealthFeatureEnabled$2", f = "SaMDAccountManager.kt", l = {201}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f101540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f101541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kx2.a f101542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gx2.a f101543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f101544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f101545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f101546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kx2.a f101547h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j8, b bVar, kx2.a aVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f101545f = j8;
        this.f101546g = bVar;
        this.f101547h = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f101545f, this.f101546g, this.f101547h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x010a A[Catch: Exception -> 0x00f7, TryCatch #1 {Exception -> 0x00f7, blocks: (B:33:0x00ae, B:35:0x00db, B:52:0x010a, B:54:0x010f, B:42:0x00ee, B:47:0x00f9, B:50:0x0102, B:53:0x010d), top: B:74:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010d A[Catch: Exception -> 0x00f7, TryCatch #1 {Exception -> 0x00f7, blocks: (B:33:0x00ae, B:35:0x00db, B:52:0x010a, B:54:0x010f, B:42:0x00ee, B:47:0x00f9, B:50:0x0102, B:53:0x010d), top: B:74:0x00ae }] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r7) <= jx2.b.f101512c) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        r0 r0Var;
        T tValueOf;
        gx2.a aVar;
        b bVar;
        kx2.a aVar2;
        T t7;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101544e;
        if (i14 == 0) {
            o13.r.b(obj);
            b.a aVar4 = b.f101511b;
            long j8 = this.f101545f;
            aVar4.getClass();
            b.f101512c = j8;
            r0Var = new r0();
            this.f101546g.getClass();
            qx2.a aVar5 = qx2.a.f148445a;
            kx2.a aVar6 = this.f101547h;
            synchronized (aVar5) {
                aVar6.getClass();
                tValueOf = !qx2.a.f().contains(aVar6.f107121a) ? 0 : Boolean.valueOf(qx2.a.f().getBoolean(aVar6.f107121a, false));
            }
            r0Var.f105810a = tValueOf;
            if (tValueOf != 0 && !tValueOf.equals(Boolean.FALSE)) {
                this.f101546g.getClass();
                long j14 = b.f101513d.get();
                if (j14 > -1) {
                }
            }
            this.f101546g.getClass();
            gx2.a aVarC = a.c();
            if (aVarC == null) {
                throw new NullAppDelegateException();
            }
            b bVar2 = this.f101546g;
            kx2.a aVar7 = this.f101547h;
            this.f101540a = r0Var;
            this.f101541b = bVar2;
            this.f101542c = aVar7;
            this.f101543d = aVarC;
            this.f101544e = 1;
            String strG = aVarC.g();
            if (strG == aVar3) {
                return aVar3;
            }
            aVar = aVarC;
            obj = strG;
            bVar = bVar2;
            aVar2 = aVar7;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = this.f101543d;
            aVar2 = this.f101542c;
            bVar = this.f101541b;
            r0Var = this.f101540a;
            o13.r.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            try {
                bVar.h("isDeviceHealthFeatureEnabled(" + aVar2.name() + ")");
                lx2.b.a aVar8 = lx2.b.f115277c;
                lx2.c cVarD = og.a.D(aVar2, aVar.f(), str);
                aVar8.getClass();
                String str2 = lx2.b.a.a(cVarD).f115279b;
                if (str2 == null) {
                    t7 = Boolean.FALSE;
                } else {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 48) {
                        if (iHashCode != 66658563) {
                            if (iHashCode == 97196323 && str2.equals(BooleanUtils.FALSE)) {
                                t7 = Boolean.FALSE;
                            } else {
                                t7 = Boolean.TRUE;
                            }
                        } else if (str2.equals("FALSE")) {
                            t7 = Boolean.FALSE;
                        } else {
                            t7 = Boolean.TRUE;
                        }
                    } else if (str2.equals("0")) {
                        t7 = Boolean.FALSE;
                    } else {
                        t7 = Boolean.TRUE;
                    }
                }
                r0Var.f105810a = t7;
                b.f101511b.getClass();
                b.f101513d.set(SystemClock.elapsedRealtime());
                qx2.a aVar9 = qx2.a.f148445a;
                T t14 = r0Var.f105810a;
                t14.getClass();
                aVar9.h(aVar2, ((Boolean) t14).booleanValue());
            } catch (Exception e4) {
                if (!(e4 instanceof NetworkException)) {
                    bVar.e("isDeviceHealthFeatureEnabled(" + aVar2.name() + ")", e4);
                    throw e4;
                }
                bVar.f(null, a0.j("isDeviceHealthFeatureEnabled(", aVar2.name(), "): ", e4.getMessage()));
                Unit unit = Unit.INSTANCE;
            }
        } else {
            bVar.f(null, "isDeviceHealthFeatureEnabled(" + aVar2.name() + "): null oAuth2DIBearerToken");
        }
        Boolean bool = (Boolean) r0Var.f105810a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        this.f101546g.d().debug("isDeviceHealthFeatureEnabled(" + this.f101547h.name() + "): " + zBooleanValue);
        return boolValueOf;
    }
}

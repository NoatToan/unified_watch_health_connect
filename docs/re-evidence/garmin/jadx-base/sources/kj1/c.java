package kj1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f12.l;
import lc.u0;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.base.BaseDeviceViewModel$handleUpdatePrimaryDevice$1$1", f = "BaseDeviceViewModel.kt", l = {50, 55, 76, 90}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<gj1.c>> f104970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gj1.c f104971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.a f104972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f104973e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104974a;

        static {
            int[] iArr = new int[ej1.b.values().length];
            try {
                iArr[ej1.b.WEARABLE_TRAINING_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ej1.b.WEARABLE_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ej1.b.TRAINING_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104974a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y0<g3<gj1.c>> y0Var, gj1.c cVar, kj1.a aVar, long j8, d<? super c> dVar) {
        super(2, dVar);
        this.f104970b = y0Var;
        this.f104971c = cVar;
        this.f104972d = aVar;
        this.f104973e = j8;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f104970b, this.f104971c, this.f104972d, this.f104973e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01db  */
    /* JADX WARN: Code duplicated, block: B:62:0x0215  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r2 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        if (r2 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0180, code lost:
    
        if (r2 == r1) goto L48;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x01db, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objC2;
        Object objB;
        v2 v2Var;
        Object objB2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104969a;
        kj1.a aVar2 = this.f104972d;
        gj1.c cVar = this.f104971c;
        long j8 = this.f104973e;
        y0<g3<gj1.c>> y0Var = this.f104970b;
        if (i14 == 0) {
            r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            int i15 = a.f104974a[cVar.f77652a.ordinal()];
            if (i15 == 1) {
                int i16 = kj1.a.f104963c;
                fj1.b bVarX4 = aVar2.x4();
                this.f104969a = 1;
                objC = bVarX4.c(j8, this);
                if (objC != aVar) {
                    v2Var = (v2) objC;
                    if (v2Var instanceof v2.b) {
                        l.f68084a.getClass();
                        l.a.a().s1(j8);
                        int i17 = kj1.a.f104963c;
                        fj1.b bVarX5 = aVar2.x4();
                        gj1.d dVar = new gj1.d(new Long(j8));
                        this.f104969a = 2;
                        objB2 = bVarX5.b(dVar, this);
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.DEVICES;
                        v2.a aVar4 = (v2.a) v2Var;
                        String str = "- Error in updating the Primary Wearable " + aVar4.f47385c + StringUtils.SPACE + aVar4.f47384b;
                        aVar3.getClass();
                        i2.a.f(a2Var, "DevicesDashboardFragment", str);
                        y0Var.j(g3.a.a(g3.f35298f, aVar4.f47385c, null, null, null, 14));
                    }
                }
            } else if (i15 == 2) {
                int i18 = kj1.a.f104963c;
                fj1.b bVarX6 = aVar2.x4();
                this.f104969a = 3;
                objC2 = bVarX6.c(j8, this);
            } else if (i15 != 3) {
                y0Var.j(g3.a.d(cVar));
            } else {
                int i19 = kj1.a.f104963c;
                fj1.b bVarX7 = aVar2.x4();
                gj1.d dVar2 = new gj1.d(new Long(j8));
                this.f104969a = 4;
                objB = bVarX7.b(dVar2, this);
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            objC = obj;
            v2Var = (v2) objC;
            if (v2Var instanceof v2.b) {
                l.f68084a.getClass();
                l.a.a().s1(j8);
                int i110 = kj1.a.f104963c;
                fj1.b bVarX8 = aVar2.x4();
                gj1.d dVar3 = new gj1.d(new Long(j8));
                this.f104969a = 2;
                objB2 = bVarX8.b(dVar3, this);
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.DEVICES;
                v2.a aVar6 = (v2.a) v2Var;
                String str2 = "- Error in updating the Primary Wearable " + aVar6.f47385c + StringUtils.SPACE + aVar6.f47384b;
                aVar5.getClass();
                i2.a.f(a2Var2, "DevicesDashboardFragment", str2);
                y0Var.j(g3.a.a(g3.f35298f, aVar6.f47385c, null, null, null, 14));
            }
        } else if (i14 == 2) {
            r.b(obj);
            objB2 = obj;
        } else if (i14 == 3) {
            r.b(obj);
            objC2 = obj;
            v2 v2Var2 = (v2) objC2;
            if (v2Var2 instanceof v2.b) {
                l.f68084a.getClass();
                l.a.a().s1(j8);
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(cVar));
            } else {
                if (!(v2Var2 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                i2.a aVar7 = i2.f36769a;
                a2 a2Var3 = a2.DEVICES;
                v2.a aVar8 = (v2.a) v2Var2;
                String str3 = "- Error in updating the Primary Wearable " + aVar8.f47385c + StringUtils.SPACE + aVar8.f47384b;
                aVar7.getClass();
                i2.a.f(a2Var3, "DevicesDashboardFragment", str3);
                y0Var.j(g3.a.a(g3.f35298f, aVar8.f47385c, null, null, null, 14));
            }
        } else {
            if (i14 != 4) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objB = obj;
            v2 v2Var3 = (v2) objB;
            if (v2Var3 instanceof v2.b) {
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(cVar));
            } else {
                if (!(v2Var3 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                i2.a aVar9 = i2.f36769a;
                a2 a2Var4 = a2.DEVICES;
                v2.a aVar10 = (v2.a) v2Var3;
                String str4 = "- Error in updating the Primary Wearable " + aVar10.f47385c + StringUtils.SPACE + aVar10.f47384b;
                aVar9.getClass();
                i2.a.f(a2Var4, "DevicesDashboardFragment", str4);
                y0Var.j(g3.a.a(g3.f35298f, aVar10.f47385c, null, null, null, 14));
            }
        }
        v2 v2Var4 = (v2) objB2;
        if (v2Var4 instanceof v2.b) {
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(cVar));
        } else {
            if (!(v2Var4 instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar11 = i2.f36769a;
            a2 a2Var5 = a2.DEVICES;
            v2.a aVar12 = (v2.a) v2Var4;
            String str5 = "- Error in updating the Primary Wearable " + aVar12.f47385c + StringUtils.SPACE + aVar12.f47384b;
            aVar11.getClass();
            i2.a.f(a2Var5, "DevicesDashboardFragment", str5);
            y0Var.j(g3.a.a(g3.f35298f, aVar12.f47385c, null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}

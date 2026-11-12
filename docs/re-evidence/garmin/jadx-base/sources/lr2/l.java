package lr2;

import bm.y;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity$verifyBTConnectivity$1", f = "DeviceSettingsActivity.kt", l = {546, 547}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hs2.e.a f114402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivity f114404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f114405d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114406a;

        static {
            int[] iArr = new int[br2.d.values().length];
            try {
                iArr[br2.d.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[br2.d.NFC_NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[br2.d.NOT_CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f114406a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DeviceSettingsActivity deviceSettingsActivity, e23.a<Unit> aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f114404c = deviceSettingsActivity;
        this.f114405d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f114404c, this.f114405d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        hs2.e.a aVar;
        hs2.e.a aVar2;
        mr2.d dVar;
        int i14;
        br2.c cVar;
        mr2.d dVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f114403b;
        DeviceSettingsActivity deviceSettingsActivity = this.f114404c;
        if (i15 == 0) {
            o13.r.b(obj);
            mr2.d dVar3 = deviceSettingsActivity.f51997i;
            if (dVar3 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            this.f114403b = 1;
            obj = dVar3.Y0(this);
            if (obj != aVar3) {
            }
            return aVar3;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = this.f114402a;
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            aVar = aVar2;
            if (aVar == hs2.e.a.NFC_STACK_FAILED) {
                DeviceSettingsActivity.a aVar4 = DeviceSettingsActivity.f51993w;
                deviceSettingsActivity.getClass();
                br2.c.f19585a.l(deviceSettingsActivity);
            } else {
                this.f114405d.invoke();
            }
        } else {
            dVar = deviceSettingsActivity.f51997i;
            if (dVar != null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            i14 = a.f114406a[dVar.h4().f19602d.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    br2.c.f19585a.k(deviceSettingsActivity);
                } else if (i14 == 3) {
                    cVar = br2.c.f19585a;
                    dVar2 = deviceSettingsActivity.f51997i;
                    if (dVar2 != null) {
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    }
                    cVar.d(deviceSettingsActivity, dVar2.getDeviceName(), new y(15));
                }
            }
        }
        return Unit.INSTANCE;
        aVar = (hs2.e.a) obj;
        if (aVar == null) {
            mr2.d dVar4 = deviceSettingsActivity.f51997i;
            if (dVar4 == null) {
                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                throw null;
            }
            this.f114402a = aVar;
            this.f114403b = 2;
            Object objN = dVar4.N(this);
            if (objN != aVar3) {
                aVar2 = aVar;
                obj = objN;
                if (((Boolean) obj).booleanValue()) {
                    dVar = deviceSettingsActivity.f51997i;
                    if (dVar != null) {
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    }
                    i14 = a.f114406a[dVar.h4().f19602d.ordinal()];
                    if (i14 != 1) {
                        if (i14 != 2) {
                            br2.c.f19585a.k(deviceSettingsActivity);
                        } else if (i14 == 3) {
                            cVar = br2.c.f19585a;
                            dVar2 = deviceSettingsActivity.f51997i;
                            if (dVar2 != null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            cVar.d(deviceSettingsActivity, dVar2.getDeviceName(), new y(15));
                        }
                    }
                } else {
                    aVar = aVar2;
                    if (aVar == hs2.e.a.NFC_STACK_FAILED) {
                        DeviceSettingsActivity.a aVar5 = DeviceSettingsActivity.f51993w;
                        deviceSettingsActivity.getClass();
                        br2.c.f19585a.l(deviceSettingsActivity);
                    } else {
                        this.f114405d.invoke();
                    }
                }
            }
            return aVar3;
        }
        if (aVar == hs2.e.a.NFC_STACK_FAILED) {
            DeviceSettingsActivity.a aVar6 = DeviceSettingsActivity.f51993w;
            deviceSettingsActivity.getClass();
            br2.c.f19585a.l(deviceSettingsActivity);
        } else {
            this.f114405d.invoke();
        }
        return Unit.INSTANCE;
    }
}

package et2;

import com.garmin.gfdi.GfdiException;
import d53.n;
import e23.p;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.i0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.v;
import t13.d;
import us2.f;
import v13.e;
import v13.i;
import zs2.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.gfdi.settings.SetDeviceSettingsManager$sendSettings$2", f = "SetDeviceSettingsManager.kt", l = {131, 132}, m = "invokeSuspend")
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f66032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ et2.a f66033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f66034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f66035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f66036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f66037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f66038h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.gfdi.settings.SetDeviceSettingsManager$sendSettings$2$connectivity$1", f = "SetDeviceSettingsManager.kt", l = {119}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ et2.a f66040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f66041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f66042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f66043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f66044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f66045g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(et2.a aVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, d<? super a> dVar) {
            super(2, dVar);
            this.f66040b = aVar;
            this.f66041c = z14;
            this.f66042d = z15;
            this.f66043e = z16;
            this.f66044f = z17;
            this.f66045g = z18;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f66040b, this.f66041c, this.f66042d, this.f66043e, this.f66044f, this.f66045g, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66039a;
            if (i14 == 0) {
                r.b(obj);
                h hVar = this.f66040b.f66029d;
                if (hVar == null) {
                    s.m("fitHandler");
                    throw null;
                }
                this.f66039a = 1;
                if (hVar.b(this.f66041c, this.f66042d, this.f66043e, this.f66044f, this.f66045g, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: et2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)[B"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.gfdi.settings.SetDeviceSettingsManager$sendSettings$2$settings$1", f = "SetDeviceSettingsManager.kt", l = {91}, m = "invokeSuspend")
    public static final class C1387b extends i implements p<b0, d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ et2.a f66047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteArrayOutputStream f66048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1387b(et2.a aVar, ByteArrayOutputStream byteArrayOutputStream, d<? super C1387b> dVar) {
            super(2, dVar);
            this.f66047b = aVar;
            this.f66048c = byteArrayOutputStream;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C1387b(this.f66047b, this.f66048c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super byte[]> dVar) {
            return ((C1387b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f66046a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            v vVar = this.f66047b.f66028c;
            if (vVar == null) {
                s.m("messenger");
                throw null;
            }
            byte[] byteArray = this.f66048c.toByteArray();
            byteArray.getClass();
            this.f66046a = 1;
            Object objB = vVar.b(5026, byteArray, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(et2.a aVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, d<? super b> dVar) {
        super(2, dVar);
        this.f66033c = aVar;
        this.f66034d = z14;
        this.f66035e = z15;
        this.f66036f = z16;
        this.f66037g = z17;
        this.f66038h = z18;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f66033c, this.f66034d, this.f66035e, this.f66036f, this.f66037g, this.f66038h, dVar);
        bVar.f66032b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
    
        if (r2.await(r25) == r0) goto L53;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws GfdiException {
        boolean z14;
        i0 i0VarJ;
        Object obj2;
        i0 i0VarJ2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66031a;
        et2.a aVar2 = this.f66033c;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    i0VarJ2 = (i0) this.f66032b;
                    r.b(obj);
                    obj2 = null;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            b0 b0Var = (b0) this.f66032b;
            f fVar = aVar2.f66030e;
            if (fVar == null) {
                s.m("deviceInfo");
                throw null;
            }
            boolean z15 = fVar.f172504l;
            boolean z16 = this.f66036f;
            boolean z17 = this.f66035e;
            boolean z18 = this.f66034d;
            if (z15) {
                z14 = false;
                o53.s sVar = new o53.s(null);
                sVar.g0(new byte[0]);
                i0VarJ = sVar;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(3);
                byteArrayOutputStream.write(6);
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write((z18 ? 1 : 0) & 255);
                byteArrayOutputStream.write(7);
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write((z17 ? 1 : 0) & 255);
                byteArrayOutputStream.write(8);
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write((z16 ? 1 : 0) & 255);
                Logger logger = aVar2.f66027b;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Send settings via 5026: autoUpload=", ", weatherConditions=", ", weatherAlerts=", z18, z17);
                sbM.append(z16);
                logger.debug(sbM.toString());
                i0VarJ = ge1.b.j(b0Var, null, null, new C1387b(aVar2, byteArrayOutputStream, null), 3);
                z14 = false;
            }
            f fVar2 = aVar2.f66030e;
            if (fVar2 == null) {
                s.m("deviceInfo");
                throw null;
            }
            Set<Integer> set = fVar2.f172500h;
            boolean z19 = (set.contains(new Integer(22)) || set.contains(new Integer(23)) || set.contains(new Integer(24)) || set.contains(new Integer(25))) ? true : z14;
            f fVar3 = aVar2.f66030e;
            if (fVar3 == null) {
                s.m("deviceInfo");
                throw null;
            }
            boolean z24 = fVar3.f172504l;
            if (z24 || z19) {
                Logger logger2 = aVar2.f66027b;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                StringBuilder sbM2 = com.airbnb.lottie.animation.keyframe.a.m("\n                Send settings via 5011/5012\n                deviceUsesFitForConfig=", "\n                supportsLiveTrack=", "\n                autoUpload=", z24, z19);
                kg.f.q("\n                liveTrackEnabled=", "\n                liveTrackAutoStartEnabled=", sbM2, z18, this.f66037g);
                kg.f.q("\n                weatherCondition=", "\n                weatherAlerts=", sbM2, this.f66038h, z17);
                sbM2.append(z16);
                sbM2.append("\n            ");
                logger2.debug(n.c(sbM2.toString()));
                obj2 = null;
                i0VarJ2 = ge1.b.j(b0Var, null, null, new a(this.f66033c, this.f66034d, this.f66037g, this.f66038h, this.f66036f, this.f66035e, null), 3);
            } else {
                Unit unit = Unit.INSTANCE;
                o53.s sVar2 = new o53.s(null);
                sVar2.g0(unit);
                i0VarJ2 = sVar2;
                obj2 = null;
            }
            this.f66032b = i0VarJ2;
            this.f66031a = 1;
            if (i0VarJ.await(this) == aVar) {
            }
            return aVar;
            this.f66032b = obj2;
            this.f66031a = 2;
        } catch (Exception e4) {
            Logger logger3 = aVar2.f66027b;
            if (logger3 == null) {
                s.m("logger");
                throw null;
            }
            logger3.error("Failed to send device settings", (Throwable) e4);
            throw new GfdiException("Failed to send device settings", e4);
        }
    }
}

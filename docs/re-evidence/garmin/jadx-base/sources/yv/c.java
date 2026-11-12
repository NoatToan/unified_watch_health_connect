package yv;

import androidx.lifecycle.v;
import d53.u;
import e23.p;
import fw.m;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate.SensorSettingsViewModel$fetchFirmwareUpdate$1", f = "SensorsFirmwareUpdateViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f199814b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f199815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yv.a f199816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sd2.f f199817c;

        /* JADX INFO: renamed from: yv.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3740a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f199818a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f199818a = iArr;
            }
        }

        public a(d dVar, yv.a aVar, sd2.f fVar) {
            this.f199815a = dVar;
            this.f199816b = aVar;
            this.f199817c = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007b  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            yv.a aVarB;
            m mVar = (m) obj;
            fw.p pVar = mVar.f73769b;
            uv.e eVar = (uv.e) mVar.f73770c;
            p2 p2Var = this.f199815a.f199822d;
            int i14 = C3740a.f199818a[pVar.ordinal()];
            if (i14 == 1) {
                aVarB = yv.a.b(this.f199816b, true, false, false, null, null, null, 2044);
            } else if (i14 != 2) {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                aVarB = yv.a.b(this.f199816b, false, true, false, null, null, null, 2044);
            } else if (eVar == null) {
                aVarB = yv.a.b(this.f199816b, false, true, false, null, null, null, 2044);
            } else if (eVar.a()) {
                sd2.f fVar = this.f199817c;
                String softwareVersion = fVar != null ? fVar.getSoftwareVersion() : null;
                String str = eVar.f172884a;
                if (s.g(softwareVersion, str != null ? u.v(str, ".", "", false) : null)) {
                    aVarB = yv.a.b(this.f199816b, false, false, true, null, null, null, 2042);
                } else {
                    aVarB = yv.a.b(this.f199816b, false, false, false, eVar.f172884a, eVar.f172885b, eVar.f172886c, 1144);
                }
            } else {
                aVarB = yv.a.b(this.f199816b, false, false, true, null, null, null, 2042);
            }
            p2Var.k(null, aVarB);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f199814b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f199814b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String softwareVersion;
        String productDisplayName;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199813a;
        if (i14 == 0) {
            r.b(obj);
            d dVar = this.f199814b;
            long j8 = dVar.f199819a;
            uv.d dVar2 = dVar.f199821c;
            long j14 = dVar.f199819a;
            if (j8 != -1) {
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI = rd2.j.i(j14, null);
                long j15 = dVar.f199819a;
                if (fVarI == null || (softwareVersion = fVarI.getSoftwareVersion()) == null) {
                    softwareVersion = "";
                }
                String str = softwareVersion;
                if (fVarI != null) {
                    String displayName = fVarI.getDisplayName();
                    productDisplayName = (displayName == null || displayName.length() == 0) ? fVarI.getProductDisplayName() : fVarI.getDisplayName();
                } else {
                    productDisplayName = null;
                }
                yv.a aVar2 = new yv.a(false, false, false, j15, fVarI != null ? fVarI.getProductNumber() : null, productDisplayName, str, null, null, null, dVar.f199820b, 903, null);
                dVar2.a(j14);
                r53.i iVarA = v.a(dVar2.f172881b);
                a aVar3 = new a(dVar, aVar2, fVarI);
                this.f199813a = 1;
                if (iVarA.collect(aVar3, this) == aVar) {
                    return aVar;
                }
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

package p90;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import bd0.d0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.pairing.PairingException;
import com.google.mlkit.common.MlKitException;
import ds.e0;
import gg1.v0;
import o13.r;
import o53.b0;
import o53.l1;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import q53.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lq90/b;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.pairing.BluetoothClassicDevicePairUseCase$startPairing$1", f = "BluetoothClassicDevicePairUseCase.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<t<? super q90.b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f136520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q90.d.b f136521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f136522d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p90/j$a", "Lrm2/b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements rm2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0<l1> f136523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<q90.b> f136524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<l90.b> f136525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<Long> f136526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r0<String> f136527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ yl2.b f136528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i f136529g;

        /* JADX INFO: renamed from: p90.j$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2591a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f136530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f136531b;

            static {
                int[] iArr = new int[qm2.k.values().length];
                try {
                    iArr[qm2.k.AUTHENTICATING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[qm2.k.AUTHENTICATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[qm2.k.CONNECTING_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[qm2.k.RETRIEVING_GARMIN_DEVICE_XML_SUCCESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[qm2.k.REGISTERING_DEVICE_SUCCESS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f136530a = iArr;
                int[] iArr2 = new int[yl2.e.values().length];
                try {
                    iArr2[yl2.e.ABORTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                f136531b = iArr2;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.pairing.BluetoothClassicDevicePairUseCase$startPairing$1$deviceSetupListener$1$eventProgress$1", f = "BluetoothClassicDevicePairUseCase.kt", l = {81}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f136532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f136533b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f136534c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f136535d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f136536e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ t<q90.b> f136537f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ r0<l90.b> f136538g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(t<? super q90.b> tVar, r0<l90.b> r0Var, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f136537f = tVar;
                this.f136538g = r0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(this.f136537f, this.f136538g, dVar);
                bVar.f136536e = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0036  */
            /* JADX WARN: Code duplicated, block: B:12:0x003c  */
            /* JADX WARN: Code duplicated, block: B:13:0x0049  */
            /* JADX WARN: Code duplicated, block: B:15:0x005b A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:16:0x005c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = r9.f136536e
                    o53.b0 r0 = (o53.b0) r0
                    u13.a r1 = u13.a.COROUTINE_SUSPENDED
                    int r2 = r9.f136535d
                    java.lang.String r3 = "BluetoothClassicDevicePairUseCase"
                    r4 = 1
                    if (r2 == 0) goto L20
                    if (r2 != r4) goto L19
                    int r2 = r9.f136534c
                    int r5 = r9.f136533b
                    int r6 = r9.f136532a
                    o13.r.b(r10)
                    goto L5c
                L19:
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r10)
                    r10 = 0
                    return r10
                L20:
                    o13.r.b(r10)
                    com.garmin.android.apps.connectmobile.a2 r10 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP
                    com.garmin.android.apps.connectmobile.i2$a r2 = com.garmin.android.apps.connectmobile.i2.f36769a
                    r2.getClass()
                    java.lang.String r2 = "Start showing simulated progress"
                    com.garmin.android.apps.connectmobile.i2.a.b(r10, r3, r2)
                    r10 = 0
                    r2 = 10
                    r6 = r10
                    r5 = r4
                L34:
                    if (r6 >= r2) goto L7b
                    boolean r10 = o53.c0.g(r0)
                    if (r10 != 0) goto L49
                    com.garmin.android.apps.connectmobile.a2 r10 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP
                    com.garmin.android.apps.connectmobile.i2$a r0 = com.garmin.android.apps.connectmobile.i2.f36769a
                    r0.getClass()
                    java.lang.String r0 = "Simulated progress canceled"
                    com.garmin.android.apps.connectmobile.i2.a.b(r10, r3, r0)
                    goto L7b
                L49:
                    r9.f136536e = r0
                    r9.f136532a = r6
                    r9.f136533b = r5
                    r9.f136534c = r2
                    r9.f136535d = r4
                    r7 = 2000(0x7d0, double:9.88E-321)
                    java.lang.Object r10 = o53.m0.b(r7, r9)
                    if (r10 != r1) goto L5c
                    return r1
                L5c:
                    int r6 = r6 + r5
                    com.garmin.android.apps.connectmobile.a2 r10 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP
                    java.lang.String r7 = "Simulated progress: "
                    java.lang.String r8 = "/"
                    java.lang.String r7 = tn.k.e(r6, r2, r7, r8)
                    com.garmin.android.apps.connectmobile.i2$a r8 = com.garmin.android.apps.connectmobile.i2.f36769a
                    r8.getClass()
                    com.garmin.android.apps.connectmobile.i2.a.b(r10, r3, r7)
                    r10 = 1073741824(0x40000000, float:2.0)
                    float r7 = (float) r6
                    float r7 = r7 + r10
                    q53.t<q90.b> r10 = r9.f136537f
                    kotlin.jvm.internal.r0<l90.b> r8 = r9.f136538g
                    p90.j.a(r10, r8, r7)
                    goto L34
                L7b:
                    kotlin.Unit r10 = p005kotlin.Unit.INSTANCE
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p90.j.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(r0<l1> r0Var, t<? super q90.b> tVar, r0<l90.b> r0Var2, r0<Long> r0Var3, r0<String> r0Var4, yl2.b bVar, i iVar) {
            this.f136523a = r0Var;
            this.f136524b = tVar;
            this.f136525c = r0Var2;
            this.f136526d = r0Var3;
            this.f136527e = r0Var4;
            this.f136528f = bVar;
            this.f136529g = iVar;
        }

        @Override // rm2.a
        public final void B(BluetoothDevice bluetoothDevice) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = fb1.c.n("eventBluetoothDeviceBonding() - device = ", bluetoothDevice.getAddress());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", strN);
        }

        @Override // rm2.d
        public final void C(PairingException pairingException) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "BluetoothClassicDevicePairUseCase", "onSetupFailure() - " + pairingException);
            this.f136529g.f136518c.p("BluetoothClassicDevicePairUseCase", false);
            int i14 = C2591a.f136531b[pairingException.getPairingFailure().ordinal()];
            r0<l90.b> r0Var = this.f136525c;
            t<q90.b> tVar = this.f136524b;
            if (i14 == 1) {
                tVar.i(new q90.b.a(r0Var.f105810a));
                tVar.q(null);
            } else {
                tVar.i(new q90.b.C2705b(pairingException, r0Var.f105810a));
                tVar.q(null);
            }
        }

        @Override // rm2.b
        public final void K(bm2.d dVar) {
            dVar.getClass();
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "BluetoothClassicDevicePairUseCase", "onRegistrationSuccessful() - deviceInfoDTO = " + dVar);
            i iVar = this.f136529g;
            Context context = iVar.f136516a;
            Context context2 = iVar.f136516a;
            hk0.e eVarF = hk0.e.f(context);
            String strF = dVar.f();
            eVarF.getClass();
            if (TextUtils.isEmpty(strF)) {
                eVarF.c("isAtLeastOneConnectIQCapabilitySupported");
            } else if ((hk0.e.h(strF, SupportedCapability.CONNECTIQ_DATA_FIELD_DOWNLOAD) || hk0.e.h(strF, SupportedCapability.CONNECTIQ_WATCH_APP_DOWNLOAD) || hk0.e.h(strF, SupportedCapability.CONNECTIQ_WATCH_FACE_DOWNLOAD) || hk0.e.h(strF, SupportedCapability.CONNECTIQ_WIDGET_DOWNLOAD)) && !yj2.b.c(dVar.getF92744h(), context2)) {
                v0.T.getClass();
                yj2.b.b(context2, v0.a.b().f77335a);
            }
            ed0.a.m("BluetoothClassicDevicePairUseCase", null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r6v11, types: [T, l90.b] */
        @Override // rm2.b
        public final void W(bm2.d dVar, bm2.f fVar) {
            yl2.b bVar;
            ?? A;
            dVar.getClass();
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", "onHandshakeComplete() - deviceInfoDTO = " + dVar + ", deviceDto = " + fVar);
            this.f136526d.f105810a = Long.valueOf(dVar.getF92746j());
            this.f136527e.f105810a = dVar.getF92743g() ? dVar.d() : dVar.f();
            yl2.b bVar2 = (yl2.b) yl2.b.B6.get(String.valueOf(dVar.getF92744h()));
            if (bVar2 == null || bVar2 == (bVar = this.f136528f)) {
                return;
            }
            i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", "Device connected (" + bVar2 + ") does not match expected (" + bVar + ")");
            bm2.c cVar = fVar instanceof bm2.c ? (bm2.c) fVar : null;
            if (cVar == null || (A = this.f136529g.f136517b.a(cVar)) == 0) {
                return;
            }
            i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", "Updated device info with connected device type");
            this.f136525c.f105810a = A;
        }

        @Override // rm2.c
        public final void a(long j8, long j14) {
            if (j8 <= 0 || j14 <= 0) {
                return;
            }
            a2 a2Var = a2.DEVICE_SETUP;
            StringBuilder sbK = e0.k(j8, "onXmlReadProgress() - bytesTransferred = ", ", fileSize = ");
            sbK.append(j14);
            String string = sbK.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", string);
            j.a(this.f136524b, this.f136525c, (((int) ((j8 * ((long) 100)) / j14)) / 5) + 14.0f);
        }

        @Override // rm2.a
        public final void j(BluetoothDevice bluetoothDevice) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strN = fb1.c.n("eventBluetoothDeviceBonded() - device = ", bluetoothDevice.getAddress());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", strN);
        }

        /* JADX WARN: Type inference failed for: r10v6, types: [T, o53.c2] */
        @Override // rm2.c
        public final void m(qm2.k kVar, yl2.e eVar, String str) {
            kVar.getClass();
            int i14 = C2591a.f136530a[kVar.ordinal()];
            t<q90.b> tVar = this.f136524b;
            r0<l90.b> r0Var = this.f136525c;
            if (i14 == 1) {
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", "eventProgress() - AUTHENTICATING");
                j.a(tVar, r0Var, 1.0f);
                return;
            }
            r0<l1> r0Var2 = this.f136523a;
            if (i14 == 2) {
                a2 a2Var2 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "BluetoothClassicDevicePairUseCase", "eventProgress() - AUTHENTICATED");
                j.a(tVar, r0Var, 2.0f);
                r0Var2.f105810a = ge1.b.T(tVar, null, null, new b(tVar, r0Var, null), 3);
                return;
            }
            if (i14 == 3) {
                a2 a2Var3 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "BluetoothClassicDevicePairUseCase", "eventProgress() - CONNECTING_SUCCESS");
                l1 l1Var = r0Var2.f105810a;
                if (l1Var != null) {
                    l1Var.c(null);
                }
                j.a(tVar, r0Var, 13.0f);
                return;
            }
            if (i14 == 4) {
                a2 a2Var4 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "BluetoothClassicDevicePairUseCase", "eventProgress() - RETRIEVING_GARMIN_DEVICE_XML_SUCCESS");
                j.a(tVar, r0Var, 34.0f);
                return;
            }
            if (i14 == 5) {
                a2 a2Var5 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var5, "BluetoothClassicDevicePairUseCase", "eventProgress() - REGISTERING_DEVICE_SUCCESS");
                tVar.i(new q90.b.c(0.9722222f, r0Var.f105810a, true));
                return;
            }
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "BluetoothClassicDevicePairUseCase", "eventProgress() - eventType = " + kVar + ", failureType = " + eVar + ", failureCode = " + str);
        }

        @Override // rm2.c
        public final /* bridge */ void t(long j8) {
        }

        @Override // rm2.c
        public final void v(qm2.k kVar) {
            kVar.getClass();
            m(kVar, null, null);
        }

        @Override // rm2.d
        public final void x(boolean z14) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strH = com.airbnb.lottie.animation.keyframe.a.h("onSetupSuccess() - shouldSync = ", z14);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BluetoothClassicDevicePairUseCase", strH);
            this.f136529g.f136518c.p("BluetoothClassicDevicePairUseCase", false);
            Long l14 = this.f136526d.f105810a;
            long jLongValue = l14 != null ? l14.longValue() : -1L;
            String str = this.f136527e.f105810a;
            if (str == null) {
                str = "";
            }
            q90.b.d dVar = new q90.b.d(jLongValue, str, this.f136525c.f105810a, z14);
            t<q90.b> tVar = this.f136524b;
            tVar.i(dVar);
            tVar.q(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q90.d.b bVar, i iVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f136521c = bVar;
        this.f136522d = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(t tVar, r0 r0Var, float f14) {
        tVar.i(new q90.b.c(f14 / 36.0f, (l90.b) r0Var.f105810a, false));
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f136521c, this.f136522d, dVar);
        jVar.f136520b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super q90.b> tVar, t13.d<? super Unit> dVar) {
        return ((j) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, l90.b] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException {
        t tVar = (t) this.f136520b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f136519a;
        if (i14 == 0) {
            r.b(obj);
            BluetoothDevice bluetoothDevice = this.f136521c.f143508a;
            r0 r0Var = new r0();
            ?? r14 = this.f136521c.f143510c;
            r0Var.f105810a = r14;
            yl2.b bVar = (yl2.b) yl2.b.B6.get(r14.f111522g);
            r0 r0Var2 = new r0();
            r0 r0Var3 = new r0();
            r0 r0Var4 = new r0();
            a aVar2 = new a(r0Var4, tVar, r0Var, r0Var2, r0Var3, bVar, this.f136522d);
            a(tVar, r0Var, 1.0f);
            this.f136522d.f136518c.p("BluetoothClassicDevicePairUseCase", true);
            qm2.b.a aVar3 = qm2.b.A;
            Context context = this.f136522d.f136516a;
            aVar3.getClass();
            qm2.b bVar2 = new qm2.b(context, aVar2);
            q90.e eVarQ = og2.k.Q((l90.b) r0Var.f105810a);
            BluetoothDevice bluetoothDevice2 = bVar2.f145670o;
            boolean z14 = bluetoothDevice2 != null && s.g(bluetoothDevice2.getAddress(), bluetoothDevice.getAddress());
            bVar2.f145663h = z14;
            bVar2.f145670o = bluetoothDevice;
            bVar2.f145671p = bVar;
            if (bVar2.f145672q == null) {
                bVar2.f145672q = eVarQ;
            }
            bVar2.f145659d = true;
            String str = this.f136521c.f143509b;
            if (str != null && !bVar2.f145678w) {
                int i15 = z14 ? 15000 : DateTimeConstants.MILLIS_PER_MINUTE;
                cm2.b.f27972d.getClass();
                if (cm2.b.a.a(i15, str)) {
                    ((d0) lm2.h.c()).b(str, new cm2.b.a.C0429a(str, i15, null, null, 12, null));
                }
            }
            if (bVar2.f145670o == null) {
                com.nimbusds.jose.shaded.gson.internal.a.t("Attempting to start BTC without providing BluetoothDevice");
                return null;
            }
            synchronized (bVar2.f145661f) {
                bVar2.f145662g = qm2.b.EnumC2745b.RUNNING;
                bVar2.m(qm2.k.INVALID);
                synchronized (bVar2.f145661f) {
                    bVar2.f145665j = false;
                    bVar2.f145664i = 0;
                    Unit unit = Unit.INSTANCE;
                }
                bVar2.j(bVar2.f145656a);
            }
            Logger logger = qm2.b.B;
            BluetoothDevice bluetoothDevice3 = bVar2.f145670o;
            String name = bluetoothDevice3 != null ? bluetoothDevice3.getName() : null;
            BluetoothDevice bluetoothDevice4 = bVar2.f145670o;
            String address = bluetoothDevice4 != null ? bluetoothDevice4.getAddress() : null;
            boolean z15 = bVar2.f145663h;
            StringBuilder sbI = p6.b.i("***** BTC PAIRING START ***** ", name, "/", address, " isRetry ");
            sbI.append(z15);
            logger.info(sbI.toString());
            bVar2.p(!bVar2.f145678w);
            nw0.p pVar = new nw0.p(this.f136522d, 21, r0Var4, bVar2);
            this.f136520b = null;
            this.f136519a = 1;
            if (q53.r.a(tVar, pVar, this) == aVar) {
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

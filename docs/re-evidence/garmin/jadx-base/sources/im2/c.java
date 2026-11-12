package im2;

import android.text.TextUtils;
import bd0.c0;
import c83.b0;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.PairingException;
import com.garmin.device.sharing.management.dtos.BluetoothConnectionType;
import com.garmin.device.sharing.management.dtos.ConnectionInfoDto;
import com.garmin.device.sharing.management.dtos.GarminBondingInfo;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import d53.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.s0;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lim2/c;", "Llm2/i;", "Lim2/c$c;", "networkServiceFactory", "<init>", "(Lim2/c$c;)V", "a", "b", "c", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c implements lm2.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f94215e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PairingException f94216f = new PairingException(yl2.e.NETWORK);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1797c f94217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f94218b = LoggerFactory.getLogger("PAIR#RetroServerDelegate");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f94219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<? extends bm2.c> f94220d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lim2/c$b;", "", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        ACTIVE(AppMeasurementSdk.ConditionalUserProperty.ACTIVE),
        /* JADX INFO: Fake field, exist only in values array */
        ACTIVE_OFF("active_activity_tracking_off"),
        /* JADX INFO: Fake field, exist only in values array */
        RETIRED("retired");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94223a;

        b(String str) {
            this.f94223a = str;
        }
    }

    /* JADX INFO: renamed from: im2.c$c, reason: collision with other inner class name */
    public interface InterfaceC1797c {
        zi2.a a();

        b0 b(String str);
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94224a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.CHINA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94224a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$registerDevice$job$1", f = "PairingRetrofitServerDelegate.kt", l = {459}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94225a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lm2.i.a f94227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RequestBody f94228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f94229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<c83.d<?>> f94230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m0 f94231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<vm2.g> f94232h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ m0 f94233i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lm2.i.a aVar, RequestBody requestBody, HashMap<String, String> map, List<c83.d<?>> list, m0 m0Var, lm2.i.b<vm2.g> bVar, m0 m0Var2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f94227c = aVar;
            this.f94228d = requestBody;
            this.f94229e = map;
            this.f94230f = list;
            this.f94231g = m0Var;
            this.f94232h = bVar;
            this.f94233i = m0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        public static final Object a(c cVar, lm2.i.a aVar, RequestBody requestBody, HashMap map, List list, m0 m0Var, lm2.i.b bVar, m0 m0Var2, v13.c cVar2) {
            j jVar;
            RequestBody requestBody2;
            List list2;
            lm2.i.b bVar2;
            m0 m0Var3;
            c cVar3;
            HashMap map2;
            m0 m0Var4;
            lm2.i.a aVar2;
            if (cVar2 instanceof j) {
                jVar = (j) cVar2;
                int i14 = jVar.f94304j;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    jVar.f94304j = i14 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(cVar2);
                }
            } else {
                jVar = new j(cVar2);
            }
            Object obj = jVar.f94303i;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i15 = jVar.f94304j;
            if (i15 == 0) {
                r.b(obj);
                jVar.f94295a = cVar;
                jVar.f94296b = aVar;
                jVar.f94297c = requestBody;
                jVar.f94298d = map;
                jVar.f94299e = list;
                jVar.f94300f = m0Var;
                jVar.f94301g = bVar;
                jVar.f94302h = m0Var2;
                jVar.f94304j = 1;
                cVar.getClass();
                Object objF = c.f(cVar, jVar);
                if (objF == aVar3) {
                    return aVar3;
                }
                requestBody2 = requestBody;
                obj = objF;
                list2 = list;
                bVar2 = bVar;
                m0Var3 = m0Var2;
                cVar3 = cVar;
                map2 = map;
                m0Var4 = m0Var;
                aVar2 = aVar;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m0 m0Var5 = jVar.f94302h;
                lm2.i.b bVar3 = jVar.f94301g;
                m0 m0Var6 = jVar.f94300f;
                List list3 = jVar.f94299e;
                HashMap map3 = jVar.f94298d;
                RequestBody requestBody3 = jVar.f94297c;
                aVar2 = jVar.f94296b;
                c cVar4 = jVar.f94295a;
                r.b(obj);
                m0Var3 = m0Var5;
                bVar2 = bVar3;
                m0Var4 = m0Var6;
                list2 = list3;
                map2 = map3;
                requestBody2 = requestBody3;
                cVar3 = cVar4;
            }
            c83.d<ResponseBody> dVarB = ((jm2.b) obj).b(requestBody2, map2);
            list2.add(dVarB);
            dVarB.q0(new k(dVarB, cVar3, aVar2, map2, m0Var4, bVar2, m0Var3, requestBody2, list2));
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new e(this.f94227c, this.f94228d, this.f94229e, this.f94230f, this.f94231g, this.f94232h, this.f94233i, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94225a;
            if (i14 == 0) {
                r.b(obj);
                this.f94225a = 1;
                if (a(c.this, this.f94227c, this.f94228d, this.f94229e, this.f94230f, this.f94231g, this.f94232h, this.f94233i, this) == aVar) {
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

    public c(InterfaceC1797c interfaceC1797c) {
        this.f94217a = interfaceC1797c;
        x53.c cVar = s0.f129406a;
        this.f94219c = zl.a.e("RetroServerDelegate", x53.b.f189152a.plus(ge1.b.h()));
    }

    public static final void b(c cVar, long j8, Collection collection) {
        cVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        ((fm2.c) lm2.h.c()).d(j8, str, true);
                    }
                } catch (Exception e4) {
                    cVar.f94218b.error(v.h.u(j8, "Failed to disconnect ", StringUtils.SPACE, str), (Throwable) e4);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object f(c cVar, v13.c cVar2) {
        h hVar;
        b0 b0VarB;
        if (cVar2 instanceof h) {
            hVar = (h) cVar2;
            int i14 = hVar.f94286d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f94286d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(cVar, cVar2);
            }
        } else {
            hVar = new h(cVar, cVar2);
        }
        Object objT = hVar.f94284b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f94286d;
        if (i15 == 0) {
            r.b(objT);
            InterfaceC1797c interfaceC1797c = cVar.f94217a;
            if (interfaceC1797c == null) {
                vb.h.s("networkServiceFactory is null and getGcService isn't overridden");
                return null;
            }
            zi2.a aVarA = interfaceC1797c.a();
            b0VarB = interfaceC1797c.b(aVarA != null ? aVarA.f204881b : null);
            Call.Factory factory = b0VarB.f25755b;
            OkHttpClient okHttpClient = factory instanceof OkHttpClient ? (OkHttpClient) factory : null;
            if (okHttpClient != null) {
                hVar.f94283a = b0VarB;
                hVar.f94286d = 1;
                objT = gg.b.T(okHttpClient, hVar);
                if (objT == aVar) {
                    return aVar;
                }
            }
            Object objB = b0VarB.b(jm2.b.class);
            objB.getClass();
            return objB;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b0VarB = hVar.f94283a;
        r.b(objT);
        Object objB2 = b0VarB.b(jm2.b.class);
        objB2.getClass();
        return objB2;
    }

    public final im2.a c(lm2.i.a aVar, lm2.i.b bVar) {
        aVar.getClass();
        byte[] f197838b = aVar.getF197838b();
        if (f197838b == null) {
            if (bVar != null) {
                bVar.a(null);
            }
            return null;
        }
        String f197656b = aVar.getF197656b();
        boolean z14 = false;
        if (f197656b != null) {
            try {
                DeviceProfile deviceProfileH = ((fm2.c) lm2.h.c()).h(f197656b);
                if (deviceProfileH != null && deviceProfileH.getConfigurationFlags().contains(20)) {
                    z14 = true;
                }
            } catch (Throwable unused) {
            }
        }
        boolean z15 = z14;
        RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, MediaType.INSTANCE.parse("application/xml; charset=utf-8"), f197838b, 0, 0, 12, (Object) null);
        ArrayList arrayList = new ArrayList();
        return new im2.a(arrayList, ge1.b.T(getF17560h(), null, null, new im2.d(this, aVar, requestBodyCreate$default, z15, arrayList, bVar, null), 3), 2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public u53.d getF17560h() {
        return this.f94219c;
    }

    public final im2.a e(String str, String str2, lm2.i.b bVar) {
        str.getClass();
        String strA = hb2.e.a(((c0) lm2.h.d()).f17547a);
        strA.getClass();
        if (this.f94220d != null) {
            bVar.a(i(str, str2, strA));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        return new im2.a(arrayList, ge1.b.T(getF17560h(), null, null, new g(this, arrayList, bVar, str, str2, strA, null), 3), 0);
    }

    public String g() {
        return BooleanUtils.TRUE;
    }

    public final void h(ResponseBody responseBody, Integer num, lm2.i.b<vm2.g> bVar) {
        jm2.e error;
        Integer subcode;
        bVar.getClass();
        String string = null;
        String strString = responseBody != null ? responseBody.string() : null;
        this.f94218b.error("registerDevice error code: " + num + " message: " + strString);
        if (num == null || num.intValue() != 409) {
            bVar.onFailure(f94216f);
            return;
        }
        jm2.d dVar = (jm2.d) new Gson().fromJson(strString, jm2.d.class);
        if (dVar != null && (error = dVar.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String()) != null && (subcode = error.getSubcode()) != null) {
            string = subcode.toString();
        }
        bVar.onFailure(new PairingException(yl2.e.HTTP_CONFLICT_409, string));
    }

    public final bm2.c i(String str, String str2, String str3) {
        List<? extends bm2.c> list = this.f94220d;
        if (list == null) {
            return null;
        }
        for (bm2.c cVar : list) {
            if (TextUtils.isEmpty(cVar.f18938v) || !cVar.f18938v.contains(str3)) {
                if (TextUtils.isEmpty(cVar.f18935t) || cVar.f18935t.contains(str3)) {
                    String str4 = cVar.f18899b;
                    if (str4 != null && str4.length() >= 9 && u.q(str, str4.substring(5, 9), true) && (str2 == null || str2.length() == 0 || u.q(str2, cVar.f18897a, true))) {
                        return cVar;
                    }
                }
            }
        }
        return null;
    }

    public void j(long j8, Collection<String> collection) {
        collection.getClass();
    }

    public vm2.b k(lm2.i.a aVar, lm2.i.b<vm2.g> bVar) {
        aVar.getClass();
        m0 m0Var = new m0();
        if (aVar instanceof yl2.d) {
            Boolean bool = ((yl2.d) aVar).f197847i;
            bool.getClass();
            m0Var.f105804a = bool.booleanValue();
        }
        byte[] f197838b = aVar.getF197838b();
        if (f197838b == null) {
            vb.h.s("Device XML must be supplied to register");
            return null;
        }
        String strC = hb2.h.c(((c0) lm2.h.d()).f17547a);
        RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, MediaType.INSTANCE.parse("application/xml; charset=utf-8"), f197838b, 0, 0, 12, (Object) null);
        HashMap map = new HashMap();
        if (strC != null) {
            map.put("UserLocale", strC);
        }
        HashMap map2 = new HashMap();
        map2.put("Override", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        map.putAll(map2);
        bm2.d f197837a = aVar.getF197837a();
        if (f197837a != null) {
            f197837a.getF92744h();
        }
        ArrayList arrayList = new ArrayList();
        return new im2.a(arrayList, ge1.b.T(getF17560h(), null, null, new e(aVar, requestBodyCreate$default, map, arrayList, m0Var, bVar, new m0(), null), 3), 1);
    }

    public final l l(long j8, boolean z14, lm2.i.b bVar) {
        yl2.a aVar = new yl2.a(j8, null, 2, null);
        ArrayList arrayList = new ArrayList();
        m0 m0Var = new m0();
        m0Var.f105804a = true;
        return new l(arrayList, ge1.b.T(getF17560h(), null, null, new n(this, aVar, aVar.f197655a, arrayList, m0Var, bVar, z14, null), 3), m0Var);
    }

    public final im2.a m(lm2.i.a aVar, String str, boolean z14, String str2, String str3, String str4, lm2.i.b bVar) {
        aVar.getClass();
        String f197656b = aVar.getF197656b();
        if (f197656b == null) {
            bVar.a(null);
            return null;
        }
        ConnectionInfoDto connectionInfoDto = new ConnectionInfoDto(f197656b, str, (str2 == null || str3 == null || str4 == null) ? null : new GarminBondingInfo(str2, str3, str4), (BluetoothConnectionType) null, 8, (p005kotlin.jvm.internal.j) null);
        BluetoothConnectionType bluetoothConnectionType = z14 ? BluetoothConnectionType.LOW_ENERGY : BluetoothConnectionType.CLASSIC;
        ArrayList arrayList = new ArrayList();
        return new im2.a(arrayList, ge1.b.T(getF17560h(), null, null, new p(connectionInfoDto, this, aVar, bluetoothConnectionType, arrayList, bVar, null), 3), 3);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lim2/c$a;", "", "<init>", "()V", "", "NEW_REGISTRATION", "Ljava/lang/String;", "DEVICE_STATUS", "DELETE_GARMINPAY_WALLET_DEFAULT", "Lcom/garmin/device/pairing/PairingException;", "PAIRING_NETWORK_EXCEPTION", "Lcom/garmin/device/pairing/PairingException;", "", "DELTA_SOFTWARE_UPDATE_FILES_CAPABILITY", "I", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static dn2.d a() {
            InterfaceC1797c interfaceC1797c = ((c) lm2.h.f()).f94217a;
            if (interfaceC1797c != null) {
                return new dn2.d(interfaceC1797c instanceof dn2.d.InterfaceC1284d ? (dn2.d.InterfaceC1284d) interfaceC1797c : new im2.b(interfaceC1797c), new tm2.a());
            }
            vb.h.s("PairingRetrofitServerDelegate does not have networkServiceFactory");
            return null;
        }

        private a() {
        }
    }
}

package dn2;

import c83.a0;
import com.garmin.device.sharing.management.dtos.BluetoothConnectionType;
import com.garmin.device.sharing.management.dtos.ConnectionInfoDto;
import com.garmin.device.sharing.management.dtos.DeviceConnectionInfoDto;
import com.garmin.device.sharing.management.dtos.GarminBondingInfo;
import com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto;
import com.garmin.device.sharing.management.dtos.RegisteredDeviceDtoJsonParser;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.j0;
import p13.l0;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/device/sharing/management/dtos/SharedDeviceInfo;", "<anonymous>", "(Lo53/b0;)Ljava/util/Collection;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.device.sharing.management.devices.GCDeviceRetriever$getKnownDevices$2", f = "GCDeviceRetriever.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
public final class g extends v13.i implements p<b0, t13.d<? super Collection<? extends SharedDeviceInfo>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownLatch f60556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f60557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f60558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Collection<Integer> f60560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f60561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Collection<String> f60562g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dn2/g$a", "Ldn2/d$c;", "shared-device-management-retrofit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0<JSONArray> f60563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f60564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<Throwable> f60565c;

        public a(r0<JSONArray> r0Var, CountDownLatch countDownLatch, r0<Throwable> r0Var2) {
            this.f60563a = r0Var;
            this.f60564b = countDownLatch;
            this.f60565c = r0Var2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dn2.d.c
        public final void a(JSONArray jSONArray) {
            this.f60563a.f105810a = jSONArray;
            this.f60564b.countDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dn2.d.c
        public final void onFailure(Throwable th3) {
            this.f60565c.f105810a = th3;
            this.f60564b.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Collection<Integer> collection, d dVar, Collection<String> collection2, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f60560e = collection;
        this.f60561f = dVar;
        this.f60562g = collection2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f60560e, this.f60561f, this.f60562g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Collection<? extends SharedDeviceInfo>> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01db  */
    /* JADX WARN: Code duplicated, block: B:128:0x0293  */
    /* JADX WARN: Code duplicated, block: B:130:0x029b  */
    /* JADX WARN: Code duplicated, block: B:133:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5 A[Catch: all -> 0x0139, TRY_ENTER, TryCatch #4 {all -> 0x0139, blocks: (B:31:0x00a8, B:38:0x00b7, B:43:0x00ca, B:45:0x00db, B:48:0x00e2, B:49:0x00e6, B:51:0x00ec, B:53:0x00f8, B:56:0x00ff, B:57:0x0107, B:59:0x010d, B:61:0x0130, B:66:0x013e, B:37:0x00b5), top: B:139:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b1, blocks: (B:33:0x00ac, B:40:0x00bf), top: B:133:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec A[Catch: all -> 0x0139, TryCatch #4 {all -> 0x0139, blocks: (B:31:0x00a8, B:38:0x00b7, B:43:0x00ca, B:45:0x00db, B:48:0x00e2, B:49:0x00e6, B:51:0x00ec, B:53:0x00f8, B:56:0x00ff, B:57:0x0107, B:59:0x010d, B:61:0x0130, B:66:0x013e, B:37:0x00b5), top: B:139:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    /* JADX WARN: Code duplicated, block: B:84:0x0199  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Throwable] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        r0 r0Var;
        CountDownLatch countDownLatch;
        r0 r0Var2;
        r0 r0Var3;
        Object objC;
        CountDownLatch countDownLatch2;
        r0 r0Var4;
        Object objA;
        ?? th3;
        List<DeviceConnectionInfoDto> list;
        Throwable th4;
        JSONArray jSONArray;
        int length;
        int i14;
        IRegisteredDeviceDto iRegisteredDeviceDtoFromJSONObject;
        String partNumberPartial;
        a0 a0Var;
        Integer num;
        List<ConnectionInfoDto> bluetoothConnections;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f60559d;
        Collection<Integer> collection = this.f60560e;
        d dVar = this.f60561f;
        List list2 = null;
        try {
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r0Var3 = this.f60558c;
                    r0Var2 = this.f60557b;
                    countDownLatch = this.f60556a;
                    try {
                        r.b(obj);
                        countDownLatch2 = countDownLatch;
                        objA = obj;
                        try {
                            a0Var = (a0) objA;
                            if (a0Var != null) {
                                try {
                                    list = (List) a0Var.f25746b;
                                } catch (Throwable th5) {
                                    th3 = th5;
                                    countDownLatch = countDownLatch2;
                                    d.a aVar2 = d.f60543e;
                                    dVar.e().error("getBtConnectionInfo failed", (Throwable) th3);
                                    r0Var3.f105810a = th3;
                                    countDownLatch.countDown();
                                    countDownLatch2 = countDownLatch;
                                    list = list2;
                                    countDownLatch2.await(10L, TimeUnit.SECONDS);
                                    th4 = (Throwable) r0Var3.f105810a;
                                    if (th4 != null) {
                                        throw th4;
                                    }
                                    if (countDownLatch2.getCount() > 0) {
                                        throw new TimeoutException("no response to network calls, network or threading issues likely");
                                    }
                                    jSONArray = (JSONArray) r0Var2.f105810a;
                                    dVar.getClass();
                                    Collection<String> collection2 = this.f60562g;
                                    collection2.getClass();
                                    collection.getClass();
                                    HashSet hashSet = new HashSet();
                                    if (jSONArray != null) {
                                        length = jSONArray.length();
                                        for (i14 = 0; i14 < length; i14++) {
                                            JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                            RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser = dVar.f60544a;
                                            jSONObject.getClass();
                                            iRegisteredDeviceDtoFromJSONObject = registeredDeviceDtoJsonParser.fromJSONObject(jSONObject);
                                            if (iRegisteredDeviceDtoFromJSONObject != null) {
                                                if (iRegisteredDeviceDtoFromJSONObject.getF143511a() != -1) {
                                                    Logger loggerE = dVar.e();
                                                    String displayName = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                                                    long deviceUnitId = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                                                    String partNumber = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                                                    StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId, "ignoring device ", displayName, StringUtils.SPACE);
                                                    sbJ.append(" [");
                                                    sbJ.append(partNumber);
                                                    sbJ.append("]");
                                                    loggerE.warn(sbJ.toString());
                                                } else {
                                                    Logger loggerE2 = dVar.e();
                                                    String displayName2 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                                                    long deviceUnitId2 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                                                    String partNumber2 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                                                    StringBuilder sbJ2 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId2, "ignoring device ", displayName2, StringUtils.SPACE);
                                                    sbJ2.append(" [");
                                                    sbJ2.append(partNumber2);
                                                    sbJ2.append("]");
                                                    loggerE2.warn(sbJ2.toString());
                                                }
                                            }
                                        }
                                    }
                                    z.i("total devices/connections: ", hashSet.size(), dVar.e());
                                    return hashSet;
                                }
                            } else {
                                list = j0.f134944a;
                            }
                            d.a aVar3 = d.f60543e;
                            Logger loggerE3 = dVar.e();
                            if (list != null) {
                                num = new Integer(list.size());
                            } else {
                                num = null;
                            }
                            loggerE3.debug("getBtConnectionInfo success, device count " + num);
                            if (list != null && !list.isEmpty()) {
                                for (DeviceConnectionInfoDto deviceConnectionInfoDto : list) {
                                    bluetoothConnections = deviceConnectionInfoDto.getBluetoothConnections();
                                    if (bluetoothConnections == null && !bluetoothConnections.isEmpty()) {
                                        for (ConnectionInfoDto connectionInfoDto : deviceConnectionInfoDto.getBluetoothConnections()) {
                                            Logger loggerE4 = dVar.e();
                                            Long l14 = new Long(deviceConnectionInfoDto.getDeviceId());
                                            String macAddress = connectionInfoDto.getMacAddress();
                                            BluetoothConnectionType connectionType = connectionInfoDto.getConnectionType();
                                            GarminBondingInfo bondingInfo = connectionInfoDto.getBondingInfo();
                                            loggerE4.trace("connection device: {} {} {} GAuth:{}", l14, macAddress, connectionType, bondingInfo != null ? Boolean.valueOf(bondingInfo.hasInfo()) : null);
                                        }
                                    }
                                }
                            }
                            try {
                                countDownLatch2.countDown();
                            } catch (Throwable th6) {
                                th3 = th6;
                                list2 = list;
                                countDownLatch = countDownLatch2;
                                d.a aVar4 = d.f60543e;
                                dVar.e().error("getBtConnectionInfo failed", (Throwable) th3);
                                r0Var3.f105810a = th3;
                                countDownLatch.countDown();
                                countDownLatch2 = countDownLatch;
                                list = list2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            countDownLatch = countDownLatch2;
                            th3 = th;
                            list2 = null;
                        }
                    } catch (Throwable th8) {
                        th3 = th8;
                    }
                    countDownLatch2.await(10L, TimeUnit.SECONDS);
                    th4 = (Throwable) r0Var3.f105810a;
                    if (th4 != null) {
                        throw th4;
                    }
                    if (countDownLatch2.getCount() > 0) {
                        throw new TimeoutException("no response to network calls, network or threading issues likely");
                    }
                    jSONArray = (JSONArray) r0Var2.f105810a;
                    dVar.getClass();
                    Collection<String> collection3 = this.f60562g;
                    collection3.getClass();
                    collection.getClass();
                    HashSet hashSet2 = new HashSet();
                    if (jSONArray != null) {
                        length = jSONArray.length();
                        while (i14 < length) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                            RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser2 = dVar.f60544a;
                            jSONObject2.getClass();
                            iRegisteredDeviceDtoFromJSONObject = registeredDeviceDtoJsonParser2.fromJSONObject(jSONObject2);
                            if (iRegisteredDeviceDtoFromJSONObject != null) {
                                if (iRegisteredDeviceDtoFromJSONObject.getF143511a() != -1 || (partNumberPartial = iRegisteredDeviceDtoFromJSONObject.getF143517g()) == null || partNumberPartial.length() == 0 || !(collection3.isEmpty() || h0.R(collection3, iRegisteredDeviceDtoFromJSONObject.getF143517g()))) {
                                    Logger loggerE5 = dVar.e();
                                    String displayName3 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                                    long deviceUnitId3 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                                    String partNumber3 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                                    StringBuilder sbJ3 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId3, "ignoring device ", displayName3, StringUtils.SPACE);
                                    sbJ3.append(" [");
                                    sbJ3.append(partNumber3);
                                    sbJ3.append("]");
                                    loggerE5.warn(sbJ3.toString());
                                } else {
                                    HashSet hashSet3 = new HashSet();
                                    if (list == null) {
                                        hashSet3.add(new SharedDeviceInfo.Builder(iRegisteredDeviceDtoFromJSONObject, (ConnectionInfoDto) null).build());
                                        break;
                                    }
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            hashSet3.add(new SharedDeviceInfo.Builder(iRegisteredDeviceDtoFromJSONObject, (ConnectionInfoDto) null).build());
                                            break;
                                        }
                                        DeviceConnectionInfoDto deviceConnectionInfoDto2 = (DeviceConnectionInfoDto) it.next();
                                        if (deviceConnectionInfoDto2.getDeviceId() == iRegisteredDeviceDtoFromJSONObject.getF143511a()) {
                                            for (ConnectionInfoDto connectionInfoDto2 : deviceConnectionInfoDto2.getBluetoothConnections()) {
                                                Collection<Integer> collection4 = collection;
                                                BluetoothConnectionType connectionType2 = connectionInfoDto2.getConnectionType();
                                                if (h0.R(collection4, connectionType2 != null ? Integer.valueOf(connectionType2.getConnectionType()) : null)) {
                                                    hashSet3.add(new SharedDeviceInfo.Builder(iRegisteredDeviceDtoFromJSONObject, connectionInfoDto2).build());
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    if (!hashSet3.isEmpty()) {
                                        hashSet2.addAll(hashSet3);
                                    }
                                }
                            }
                        }
                    }
                    z.i("total devices/connections: ", hashSet2.size(), dVar.e());
                    return hashSet2;
                }
                r0Var4 = this.f60558c;
                r0 r0Var5 = this.f60557b;
                CountDownLatch countDownLatch3 = this.f60556a;
                try {
                    r.b(obj);
                    countDownLatch2 = countDownLatch3;
                    r0Var = r0Var5;
                    objC = obj;
                } catch (Throwable th9) {
                    th3 = th9;
                    r0Var3 = r0Var4;
                    r0Var2 = r0Var5;
                    countDownLatch = countDownLatch3;
                }
                d.a aVar5 = d.f60543e;
                dVar.e().error("getBtConnectionInfo failed", (Throwable) th3);
                r0Var3.f105810a = th3;
                countDownLatch.countDown();
                countDownLatch2 = countDownLatch;
                list = list2;
                countDownLatch2.await(10L, TimeUnit.SECONDS);
                th4 = (Throwable) r0Var3.f105810a;
                if (th4 != null) {
                    throw th4;
                }
                if (countDownLatch2.getCount() > 0) {
                    throw new TimeoutException("no response to network calls, network or threading issues likely");
                }
                jSONArray = (JSONArray) r0Var2.f105810a;
                dVar.getClass();
                Collection<String> collection5 = this.f60562g;
                collection5.getClass();
                collection.getClass();
                HashSet hashSet4 = new HashSet();
                if (jSONArray != null) {
                    length = jSONArray.length();
                    while (i14 < length) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i14);
                        RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser3 = dVar.f60544a;
                        jSONObject3.getClass();
                        iRegisteredDeviceDtoFromJSONObject = registeredDeviceDtoJsonParser3.fromJSONObject(jSONObject3);
                        if (iRegisteredDeviceDtoFromJSONObject != null) {
                            if (iRegisteredDeviceDtoFromJSONObject.getF143511a() != -1) {
                                Logger loggerE6 = dVar.e();
                                String displayName4 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                                long deviceUnitId4 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                                String partNumber4 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                                StringBuilder sbJ4 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId4, "ignoring device ", displayName4, StringUtils.SPACE);
                                sbJ4.append(" [");
                                sbJ4.append(partNumber4);
                                sbJ4.append("]");
                                loggerE6.warn(sbJ4.toString());
                            } else {
                                Logger loggerE7 = dVar.e();
                                String displayName5 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                                long deviceUnitId5 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                                String partNumber5 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                                StringBuilder sbJ5 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId5, "ignoring device ", displayName5, StringUtils.SPACE);
                                sbJ5.append(" [");
                                sbJ5.append(partNumber5);
                                sbJ5.append("]");
                                loggerE7.warn(sbJ5.toString());
                            }
                        }
                    }
                }
                z.i("total devices/connections: ", hashSet4.size(), dVar.e());
                return hashSet4;
            }
            r.b(obj);
            if (collection.isEmpty()) {
                d.a aVar6 = d.f60543e;
                dVar.e().warn("'getKnownDevices' called without supplying types");
                return l0.f134950a;
            }
            d.a aVar7 = d.f60543e;
            dVar.e().debug("getKnownDevices");
            CountDownLatch countDownLatch4 = new CountDownLatch(2);
            r0Var = new r0();
            r0 r0Var6 = new r0();
            dVar.d(new a(r0Var, countDownLatch4, r0Var6));
            try {
                this.f60556a = countDownLatch4;
                this.f60557b = r0Var;
                this.f60558c = r0Var6;
                this.f60559d = 1;
                objC = dVar.c(this);
                if (objC != aVar) {
                    countDownLatch2 = countDownLatch4;
                    r0Var4 = r0Var6;
                }
                return aVar;
            } catch (Throwable th10) {
                countDownLatch = countDownLatch4;
                r0Var2 = r0Var;
                r0Var3 = r0Var6;
                th3 = th10;
                list2 = null;
            }
            en2.a aVar8 = (en2.a) ((c83.b0) objC).b(en2.a.class);
            this.f60556a = countDownLatch2;
            this.f60557b = r0Var;
            this.f60558c = r0Var4;
            this.f60559d = 2;
            objA = aVar8.a(this);
            if (objA != aVar) {
                r0Var3 = r0Var4;
                r0Var2 = r0Var;
                a0Var = (a0) objA;
                if (a0Var != null) {
                    list = (List) a0Var.f25746b;
                } else {
                    list = j0.f134944a;
                }
                d.a aVar9 = d.f60543e;
                Logger loggerE8 = dVar.e();
                if (list != null) {
                    num = new Integer(list.size());
                } else {
                    num = null;
                }
                loggerE8.debug("getBtConnectionInfo success, device count " + num);
                if (list != null) {
                    while (r0.hasNext()) {
                        bluetoothConnections = deviceConnectionInfoDto.getBluetoothConnections();
                        if (bluetoothConnections == null) {
                        }
                    }
                }
                countDownLatch2.countDown();
                countDownLatch2.await(10L, TimeUnit.SECONDS);
                th4 = (Throwable) r0Var3.f105810a;
                if (th4 != null) {
                    throw th4;
                }
                if (countDownLatch2.getCount() > 0) {
                    throw new TimeoutException("no response to network calls, network or threading issues likely");
                }
                jSONArray = (JSONArray) r0Var2.f105810a;
                dVar.getClass();
                Collection<String> collection6 = this.f60562g;
                collection6.getClass();
                collection.getClass();
                HashSet hashSet5 = new HashSet();
                if (jSONArray != null) {
                    length = jSONArray.length();
                    while (i14 < length) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i14);
                        RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser4 = dVar.f60544a;
                        jSONObject4.getClass();
                        iRegisteredDeviceDtoFromJSONObject = registeredDeviceDtoJsonParser4.fromJSONObject(jSONObject4);
                        if (iRegisteredDeviceDtoFromJSONObject != null) {
                            if (iRegisteredDeviceDtoFromJSONObject.getF143511a() != -1) {
                                Logger loggerE9 = dVar.e();
                                String displayName6 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                                long deviceUnitId6 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                                String partNumber6 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                                StringBuilder sbJ6 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId6, "ignoring device ", displayName6, StringUtils.SPACE);
                                sbJ6.append(" [");
                                sbJ6.append(partNumber6);
                                sbJ6.append("]");
                                loggerE9.warn(sbJ6.toString());
                            } else {
                                Logger loggerE10 = dVar.e();
                                String displayName7 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                                long deviceUnitId7 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                                String partNumber7 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                                StringBuilder sbJ7 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId7, "ignoring device ", displayName7, StringUtils.SPACE);
                                sbJ7.append(" [");
                                sbJ7.append(partNumber7);
                                sbJ7.append("]");
                                loggerE10.warn(sbJ7.toString());
                            }
                        }
                    }
                }
                z.i("total devices/connections: ", hashSet5.size(), dVar.e());
                return hashSet5;
            }
            return aVar;
        } catch (Throwable th11) {
            th = th11;
            r0Var3 = r0Var4;
            r0Var2 = r0Var;
            countDownLatch = countDownLatch2;
            th3 = th;
            list2 = null;
            d.a aVar10 = d.f60543e;
            dVar.e().error("getBtConnectionInfo failed", (Throwable) th3);
            r0Var3.f105810a = th3;
            countDownLatch.countDown();
            countDownLatch2 = countDownLatch;
            list = list2;
            countDownLatch2.await(10L, TimeUnit.SECONDS);
            th4 = (Throwable) r0Var3.f105810a;
            if (th4 != null) {
                throw th4;
            }
            if (countDownLatch2.getCount() > 0) {
                throw new TimeoutException("no response to network calls, network or threading issues likely");
            }
            jSONArray = (JSONArray) r0Var2.f105810a;
            dVar.getClass();
            Collection<String> collection7 = this.f60562g;
            collection7.getClass();
            collection.getClass();
            HashSet hashSet6 = new HashSet();
            if (jSONArray != null) {
                length = jSONArray.length();
                while (i14 < length) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i14);
                    RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser5 = dVar.f60544a;
                    jSONObject5.getClass();
                    iRegisteredDeviceDtoFromJSONObject = registeredDeviceDtoJsonParser5.fromJSONObject(jSONObject5);
                    if (iRegisteredDeviceDtoFromJSONObject != null) {
                        if (iRegisteredDeviceDtoFromJSONObject.getF143511a() != -1) {
                            Logger loggerE11 = dVar.e();
                            String displayName8 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                            long deviceUnitId8 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                            String partNumber8 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                            StringBuilder sbJ8 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId8, "ignoring device ", displayName8, StringUtils.SPACE);
                            sbJ8.append(" [");
                            sbJ8.append(partNumber8);
                            sbJ8.append("]");
                            loggerE11.warn(sbJ8.toString());
                        } else {
                            Logger loggerE12 = dVar.e();
                            String displayName9 = iRegisteredDeviceDtoFromJSONObject.getDisplayName();
                            long deviceUnitId9 = iRegisteredDeviceDtoFromJSONObject.getF143511a();
                            String partNumber9 = iRegisteredDeviceDtoFromJSONObject.getPartNumber();
                            StringBuilder sbJ9 = com.nimbusds.jose.shaded.gson.internal.a.j(deviceUnitId9, "ignoring device ", displayName9, StringUtils.SPACE);
                            sbJ9.append(" [");
                            sbJ9.append(partNumber9);
                            sbJ9.append("]");
                            loggerE12.warn(sbJ9.toString());
                        }
                    }
                }
            }
            z.i("total devices/connections: ", hashSet6.size(), dVar.e());
            return hashSet6;
        }
    }
}

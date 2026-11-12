package dn2;

import c83.a0;
import c83.b0;
import com.garmin.device.sharing.management.dtos.BluetoothConnectionType;
import com.garmin.device.sharing.management.dtos.ConnectionInfoDto;
import com.garmin.device.sharing.management.dtos.RegisteredDeviceDtoJsonParser;
import com.garmin.device.sharing.management.dtos.SimpleDeviceDtoJsonParser;
import e23.l;
import java.util.Collection;
import n63.p;
import o13.m;
import o13.r;
import o13.t;
import o53.s0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB%\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0019\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Ldn2/d;", "Ldn2/j;", "Ldn2/d$b;", "delegate", "Lcom/garmin/device/sharing/management/dtos/RegisteredDeviceDtoJsonParser;", "parser", "Ldn2/d$d;", "networkServiceFactory", "<init>", "(Ldn2/d$b;Lcom/garmin/device/sharing/management/dtos/RegisteredDeviceDtoJsonParser;Ldn2/d$d;)V", "(Ldn2/d$b;Lcom/garmin/device/sharing/management/dtos/RegisteredDeviceDtoJsonParser;)V", "(Ldn2/d$d;Lcom/garmin/device/sharing/management/dtos/RegisteredDeviceDtoJsonParser;)V", "a", "b", "c", "d", "shared-device-management-retrofit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class d implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f60543e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegisteredDeviceDtoJsonParser f60544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1284d f60545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f60546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f60547d;

    public interface b extends ed2.a, xc2.a<zi2.a> {
    }

    public interface c {
        void a(JSONArray jSONArray);

        void onFailure(Throwable th3);
    }

    /* JADX INFO: renamed from: dn2.d$d, reason: collision with other inner class name */
    @o13.e
    public interface InterfaceC1284d {
        zi2.a a();

        b0 b(String str);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln63/e;", "", "invoke", "(Ln63/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends w implements l<n63.e, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f60548a = new e();

        public e() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(n63.e eVar) {
            n63.e eVar2 = eVar;
            eVar2.getClass();
            eVar2.f123904c = true;
            eVar2.f123902a = true;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f60549a = new f();

        public f() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            an2.l.f4589a.getClass();
            return LoggerFactory.getLogger("DM#".concat("GCRetriever"));
        }
    }

    public d(b bVar, RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser, InterfaceC1284d interfaceC1284d) {
        registeredDeviceDtoJsonParser.getClass();
        this.f60544a = registeredDeviceDtoJsonParser;
        this.f60545b = interfaceC1284d;
        if (interfaceC1284d == null) {
            vb.h.s("networkServiceFactory or delegate must be provided");
            throw null;
        }
        x53.c cVar = s0.f129406a;
        this.f60546c = zl.a.e("GCDeviceRetriever", x53.b.f189152a.plus(ge1.b.h()));
        this.f60547d = m.b(f.f60549a);
        p.a(e.f60548a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object f(d dVar, long j8, ConnectionInfoDto connectionInfoDto, v13.c cVar) {
        h hVar;
        Throwable th3;
        en2.a aVar;
        String urlParam;
        long j14;
        RequestBody requestBodyCreate;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f60571f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f60571f = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar, cVar);
            }
        } else {
            hVar = new h(dVar, cVar);
        }
        h hVar2 = hVar;
        Object objC = hVar2.f60569d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar2.f60571f;
        try {
            try {
                try {
                    try {
                        if (i15 == 0) {
                            r.b(objC);
                            hVar2.f60566a = dVar;
                            hVar2.f60567b = connectionInfoDto;
                            hVar2.f60568c = j8;
                            hVar2.f60571f = 1;
                            objC = dVar.c(hVar2);
                            if (objC != aVar2) {
                            }
                            return aVar2;
                        }
                        if (i15 == 1) {
                            j8 = hVar2.f60568c;
                            connectionInfoDto = hVar2.f60567b;
                            dVar = hVar2.f60566a;
                            r.b(objC);
                        } else {
                            if (i15 != 2) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j8 = hVar2.f60568c;
                            dVar = hVar2.f60566a;
                            r.b(objC);
                        }
                        dVar.e().debug("uploadNewDeviceInfo " + j8 + " completed, http response " + ((a0) objC).f25745a.code());
                        return Unit.INSTANCE;
                        objC = aVar.b(j14, urlParam, requestBodyCreate, hVar2);
                        if (objC != aVar2) {
                            j8 = j14;
                            dVar.e().debug("uploadNewDeviceInfo " + j8 + " completed, http response " + ((a0) objC).f25745a.code());
                            return Unit.INSTANCE;
                        }
                        return aVar2;
                    } catch (Throwable th4) {
                        th3 = th4;
                        j8 = j14;
                        dVar.e().error(androidx.room.a0.f(j8, "uploadNewDeviceInfo ", " failed"), th3);
                    }
                    f60543e.getClass();
                    requestBodyCreate = RequestBody.INSTANCE.create(connectionInfoDto.toJSON(), MediaType.INSTANCE.parse("application/json"));
                    hVar2.f60566a = dVar;
                    hVar2.f60567b = null;
                    hVar2.f60568c = j8;
                    hVar2.f60571f = 2;
                    j14 = j8;
                } catch (Throwable th5) {
                    j14 = j8;
                    th3 = th5;
                }
                aVar = (en2.a) ((b0) objC).b(en2.a.class);
                BluetoothConnectionType connectionType = connectionInfoDto.getConnectionType();
                connectionType.getClass();
                urlParam = connectionType.getUrlParam();
            } catch (Throwable th6) {
                th = th6;
                th3 = th;
                dVar.e().error(androidx.room.a0.f(j8, "uploadNewDeviceInfo ", " failed"), th3);
                return Unit.INSTANCE;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // dn2.j
    public final Object a(Collection collection, Collection collection2, an2.d dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new g(collection2, this, collection, null), dVar);
    }

    @Override // dn2.j
    public final Object b(long j8, ConnectionInfoDto connectionInfoDto, an2.a.f fVar) {
        return f(this, j8, connectionInfoDto, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final b0 c(v13.c cVar) {
        dn2.e eVar;
        if (cVar instanceof dn2.e) {
            eVar = (dn2.e) cVar;
            int i14 = eVar.f60552c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f60552c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new dn2.e(this, cVar);
            }
        } else {
            eVar = new dn2.e(this, cVar);
        }
        Object obj = eVar.f60550a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f60552c;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            new b0.b();
            throw null;
        }
        r.b(obj);
        InterfaceC1284d interfaceC1284d = this.f60545b;
        if (interfaceC1284d != null) {
            zi2.a aVarA = interfaceC1284d.a();
            return interfaceC1284d.b(aVarA != null ? aVarA.f204881b : null);
        }
        vb.h.z("no delegate or factory provided");
        return null;
    }

    public final void d(c cVar) {
        ge1.b.T(this.f60546c, null, null, new dn2.f(this, cVar, null), 3);
    }

    public final Logger e() {
        return (Logger) this.f60547d.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldn2/d$a;", "", "<init>", "()V", "shared-device-management-retrofit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(b bVar, RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser) {
        this(bVar, registeredDeviceDtoJsonParser, null);
        bVar.getClass();
        registeredDeviceDtoJsonParser.getClass();
    }

    public /* synthetic */ d(b bVar, RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new SimpleDeviceDtoJsonParser(false, 1, null) : registeredDeviceDtoJsonParser);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public d(InterfaceC1284d interfaceC1284d, RegisteredDeviceDtoJsonParser registeredDeviceDtoJsonParser) {
        this(null, registeredDeviceDtoJsonParser, interfaceC1284d);
        interfaceC1284d.getClass();
        registeredDeviceDtoJsonParser.getClass();
    }
}

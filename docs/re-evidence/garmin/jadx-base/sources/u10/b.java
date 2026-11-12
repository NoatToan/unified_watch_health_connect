package u10;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.garmin.proto.generated.GDIConnectIQHTTPExtension;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import d53.u;
import java.util.HashMap;
import java.util.Map;
import o13.r;
import o53.s0;
import o53.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import vt2.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lu10/b;", "", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lo53/z;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f167726b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f167727a;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(zVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ConnectIQOAuthRequest connectIQOAuthRequest, v13.c cVar) {
        c cVar2;
        HashMap map;
        p0 p0Var;
        HashMap map2;
        p0 p0Var2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f167732e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f167732e = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f167730c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f167732e;
        if (i15 == 0) {
            r.b(obj);
            map = new HashMap();
            p0Var = new p0();
            p0Var.f105807a = 500;
            Uri uri = Uri.parse(str);
            for (Map.Entry<String, String> entry : connectIQOAuthRequest.getResultKeys().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String queryParameter = uri.getQueryParameter(key);
                if (queryParameter != null) {
                    map.put(value, queryParameter);
                }
            }
            String string = uri.toString();
            string.getClass();
            if (u.y(string, "http", false)) {
                d dVar = new d(str, p0Var, null);
                cVar2.f167728a = map;
                cVar2.f167729b = p0Var;
                cVar2.f167732e = 1;
                if (ge1.b.e0(this.f167727a, dVar, cVar2) == aVar) {
                    return aVar;
                }
                map2 = map;
                p0Var2 = p0Var;
            } else {
                p0Var.f105807a = 200;
            }
            return new h(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.OK, p0Var.f105807a, map);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p0Var2 = cVar2.f167729b;
        map2 = cVar2.f167728a;
        r.b(obj);
        p0Var = p0Var2;
        map = map2;
        return new h(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.OK, p0Var.f105807a, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ConnectIQOAuthRequest connectIQOAuthRequest, v13.c cVar) {
        e eVar;
        p0 p0Var;
        HashMap map;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f167740e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f167740e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f167738c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f167740e;
        if (i15 == 0) {
            r.b(obj);
            HashMap map2 = new HashMap();
            p0 p0Var2 = new p0();
            p0Var2.f105807a = 500;
            f fVar = new f(str, p0Var2, connectIQOAuthRequest, map2, null);
            eVar.f167736a = map2;
            eVar.f167737b = p0Var2;
            eVar.f167740e = 1;
            if (ge1.b.e0(this.f167727a, fVar, eVar) == aVar) {
                return aVar;
            }
            p0Var = p0Var2;
            map = map2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p0Var = eVar.f167737b;
            map = eVar.f167736a;
            r.b(obj);
        }
        return new h(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.OK, p0Var.f105807a, map);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005e  */
    public final Object c(long j8, byte[] bArr, GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus responseStatus, int i14, HashMap map, v13.i iVar) throws Throwable {
        byte[] bArrB;
        String str = "CIQ AUTH respons to device: unitId:" + j8 + ", responseAppUuid" + bArr + ", responseStatus:" + responseStatus + ", responseHttpStatus:" + i14 + ", responseResult:" + map + StringUtils.SPACE;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ConnectIQOAuthRepo", str);
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    bArrB = null;
                } else {
                    bArrB = p.b(map);
                }
            } catch (Exception e4) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "CIQ respondToOAuth Serializer.serialize(result): ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var2, "ConnectIQOAuthRepo", strD);
            }
        } else {
            bArrB = null;
        }
        GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.newBuilder();
        builderNewBuilder.setAppUuid(ByteString.copyFrom(bArr));
        builderNewBuilder.setStatus(responseStatus);
        builderNewBuilder.setHttpStatusCode(i14);
        if (bArrB != null) {
            builderNewBuilder.setData(ByteString.copyFrom(bArrB));
            builderNewBuilder.setEncrypted(false);
            builderNewBuilder.setCompressed(false);
        }
        GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builderNewBuilder2 = GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder();
        builderNewBuilder2.setConnectIqOauthCompleteRequest(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDIConnectIQHTTPExtension.connectIqHttpService, builderNewBuilder2.build());
        Object objE0 = ge1.b.e0(this.f167727a, new g(builderNewBuilder3, j8, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu10/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(z zVar) {
        zVar.getClass();
        this.f167727a = zVar;
    }

    public b() {
        this(null, 1, null);
    }
}

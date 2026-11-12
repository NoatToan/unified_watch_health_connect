package bc2;

import android.content.Context;
import androidx.core.view.j;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.sync.UploadConfigurationLoader;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import wb2.g0;
import wb2.n0;
import wb2.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbc2/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "connect-device-sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f17423d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile e f17424e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f17426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UploadConfigurationLoader f17427c;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17428a;

        static {
            int[] iArr = new int[UploadConfigurationLoader.UploadConfigurationException.a.values().length];
            try {
                iArr[UploadConfigurationLoader.UploadConfigurationException.a.JSON_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadConfigurationLoader.UploadConfigurationException.a.EMPTY_SERVER_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UploadConfigurationLoader.UploadConfigurationException.a.OMT_EXCEPTION_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UploadConfigurationLoader.UploadConfigurationException.a.INVALID_SERVER_ENDPOINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UploadConfigurationLoader.UploadConfigurationException.a.REMOTE_DEVICE_EXCEPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UploadConfigurationLoader.UploadConfigurationException.a.UNEXPECTED_SERVER_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UploadConfigurationLoader.UploadConfigurationException.a.NO_RESPONSE_ON_UPLOAD_CONFIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f17428a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.lib.connectdevicesync.cloudtarget.UploadEndpointConfiguration$getUploadEndpoint$1", f = "UploadEndpointConfiguration.kt", l = {141}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f17430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte f17431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f17432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g0 f17433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ byte f17434f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, byte b14, e eVar, g0 g0Var, byte b15, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f17430b = j8;
            this.f17431c = b14;
            this.f17432d = eVar;
            this.f17433e = g0Var;
            this.f17434f = b15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f17430b, this.f17431c, this.f17432d, this.f17433e, this.f17434f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f17429a;
            e eVar = this.f17432d;
            byte b14 = this.f17431c;
            long j8 = this.f17430b;
            if (i14 == 0) {
                r.b(obj);
                if (j8 > -1 && b14 != t0.f184140q) {
                    String strD = null;
                    for (DeviceProfile deviceProfile : da2.d.c(eVar.f17425a).f58886a.f111646e.a(j8)) {
                        strD = ((n0) this.f17433e).d(deviceProfile.getMacAddress(), b14);
                        if (strD != null) {
                            break;
                        }
                    }
                    if (strD != null && strD.length() != 0) {
                        UploadConfigurationLoader uploadConfigurationLoader = eVar.f17427c;
                        this.f17429a = 1;
                        obj = uploadConfigurationLoader.e(j8, strD, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                }
                return null;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            String str = (String) obj;
            Logger logger = eVar.f17426b;
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "getUploadEndpoint: ", str, " for device ID [");
            j.m(this.f17434f, b14, "], aFileType [", "], aFileSubType [", sbJ);
            sbJ.append("]");
            logger.debug(sbJ.toString());
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bc2/e$d", "Lcom/garmin/sync/UploadConfigurationLoader$a;", "connect-device-sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements UploadConfigurationLoader.a {
        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final String d() {
            my2.a.c cVar;
            ec2.e.b();
            hy2.d dVar = il2.e.l().f60322o;
            my2.a aVar = dVar instanceof my2.a ? (my2.a) dVar : null;
            if (aVar == null || (cVar = aVar.f121526a) == null) {
                return null;
            }
            return cVar.d();
        }

        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final boolean e() {
            return ((il2.e) ec2.e.b()).o();
        }

        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final String f() {
            return "ConnectMobile";
        }

        @Override // com.garmin.sync.UploadConfigurationLoader.a
        public final zi2.a g() {
            zi2.a aVarN = ((il2.e) ec2.e.b()).n();
            aVarN.getClass();
            return aVarN;
        }
    }

    private e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f17425a = applicationContext;
        int i14 = gt2.c.f79010a;
        this.f17426b = gt2.b.f79005a.i("SYNC#UploadEndpointConfig");
        d dVar = new d();
        applicationContext.getClass();
        this.f17427c = new UploadConfigurationLoader("SYNC#", dVar, applicationContext);
    }

    public static final e a(Context context) {
        a aVar = f17423d;
        aVar.getClass();
        context.getClass();
        if (f17424e == null) {
            synchronized (aVar) {
                try {
                    if (f17424e == null) {
                        f17424e = new e(context, null);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        e eVar = f17424e;
        eVar.getClass();
        return eVar;
    }

    public final String b(g0 g0Var, long j8, byte b14, byte b15) {
        g0Var.getClass();
        return (String) ge1.b.W(t13.h.f161748a, new c(j8, b15, this, g0Var, b14, null));
    }

    public final wb2.h c(long j8) {
        UploadConfigurationLoader.UploadConfigurationException uploadConfigurationException = this.f17427c.f52788e.get(Long.valueOf(j8));
        UploadConfigurationLoader.UploadConfigurationException.a type = uploadConfigurationException != null ? uploadConfigurationException.getType() : null;
        switch (type == null ? -1 : b.f17428a[type.ordinal()]) {
            case 1:
                wb2.h hVar = wb2.h.JSON_EXCEPTION;
                hVar.f184020c = uploadConfigurationException.getMessage();
                return hVar;
            case 2:
                wb2.h hVar2 = wb2.h.EMPTY_SERVER_RESPONSE;
                hVar2.f184020c = uploadConfigurationException.getMessage();
                return hVar2;
            case 3:
                wb2.h hVar3 = wb2.h.OMT_EXCEPTION_MESSAGE;
                hVar3.f184020c = uploadConfigurationException.getMessage();
                return hVar3;
            case 4:
                wb2.h hVar4 = wb2.h.INVALID_SERVER_ENDPOINT;
                hVar4.f184020c = uploadConfigurationException.getMessage();
                return hVar4;
            case 5:
                wb2.h hVar5 = wb2.h.REMOTE_DEVICE_EXCEPTION;
                hVar5.f184020c = uploadConfigurationException.getMessage();
                return hVar5;
            case 6:
                wb2.h hVar6 = wb2.h.UNEXPECTED_SERVER_RESPONSE;
                hVar6.f184020c = uploadConfigurationException.getMessage();
                return hVar6;
            case 7:
                wb2.h hVar7 = wb2.h.NO_RESPONSE_ON_UPLOAD_CONFIG;
                hVar7.f184020c = uploadConfigurationException.getMessage();
                return hVar7;
            default:
                return null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbc2/e$a;", "", "<init>", "()V", "", "INVALID_VALUE", "J", "", "TAG", "Ljava/lang/String;", "Lbc2/e;", "instance", "Lbc2/e;", "connect-device-sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(Context context, p005kotlin.jvm.internal.j jVar) {
        this(context);
    }
}

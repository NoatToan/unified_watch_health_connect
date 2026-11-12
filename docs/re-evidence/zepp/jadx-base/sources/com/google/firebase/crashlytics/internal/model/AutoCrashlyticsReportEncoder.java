package com.google.firebase.crashlytics.internal.model;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.tencent.connect.common.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.IOException;
import org.cybergarage.upnp.device.ST;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoCrashlyticsReportEncoder();

    public static final class a implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {
        public static final a a = new a();
        private static final FieldDescriptor b = FieldDescriptor.of(DTransferConstants.PID);
        private static final FieldDescriptor c = FieldDescriptor.of("processName");
        private static final FieldDescriptor d = FieldDescriptor.of("reasonCode");
        private static final FieldDescriptor e = FieldDescriptor.of("importance");
        private static final FieldDescriptor f = FieldDescriptor.of("pss");
        private static final FieldDescriptor g = FieldDescriptor.of("rss");
        private static final FieldDescriptor h = FieldDescriptor.of("timestamp");
        private static final FieldDescriptor i = FieldDescriptor.of("traceFile");

        private a() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, applicationExitInfo.getPid());
            objectEncoderContext.add(c, applicationExitInfo.getProcessName());
            objectEncoderContext.add(d, applicationExitInfo.getReasonCode());
            objectEncoderContext.add(e, applicationExitInfo.getImportance());
            objectEncoderContext.add(f, applicationExitInfo.getPss());
            objectEncoderContext.add(g, applicationExitInfo.getRss());
            objectEncoderContext.add(h, applicationExitInfo.getTimestamp());
            objectEncoderContext.add(i, applicationExitInfo.getTraceFile());
        }
    }

    public static final class b implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {
        public static final b a = new b();
        private static final FieldDescriptor b = FieldDescriptor.of("key");
        private static final FieldDescriptor c = FieldDescriptor.of("value");

        private b() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, customAttribute.getKey());
            objectEncoderContext.add(c, customAttribute.getValue());
        }
    }

    public static final class c implements ObjectEncoder<CrashlyticsReport> {
        public static final c a = new c();
        private static final FieldDescriptor b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        private static final FieldDescriptor c = FieldDescriptor.of("gmpAppId");
        private static final FieldDescriptor d = FieldDescriptor.of(Constants.PARAM_PLATFORM);
        private static final FieldDescriptor e = FieldDescriptor.of("installationUuid");
        private static final FieldDescriptor f = FieldDescriptor.of("buildVersion");
        private static final FieldDescriptor g = FieldDescriptor.of("displayVersion");
        private static final FieldDescriptor h = FieldDescriptor.of(com.google.firebase.crashlytics.internal.settings.b.c);
        private static final FieldDescriptor i = FieldDescriptor.of("ndkPayload");

        private c() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, crashlyticsReport.getSdkVersion());
            objectEncoderContext.add(c, crashlyticsReport.getGmpAppId());
            objectEncoderContext.add(d, crashlyticsReport.getPlatform());
            objectEncoderContext.add(e, crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add(f, crashlyticsReport.getBuildVersion());
            objectEncoderContext.add(g, crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add(h, crashlyticsReport.getSession());
            objectEncoderContext.add(i, crashlyticsReport.getNdkPayload());
        }
    }

    public static final class d implements ObjectEncoder<CrashlyticsReport.FilesPayload> {
        public static final d a = new d();
        private static final FieldDescriptor b = FieldDescriptor.of("files");
        private static final FieldDescriptor c = FieldDescriptor.of("orgId");

        private d() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, filesPayload.getFiles());
            objectEncoderContext.add(c, filesPayload.getOrgId());
        }
    }

    public static final class e implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {
        public static final e a = new e();
        private static final FieldDescriptor b = FieldDescriptor.of(FileDownloadModel.FILENAME);
        private static final FieldDescriptor c = FieldDescriptor.of("contents");

        private e() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, file.getFilename());
            objectEncoderContext.add(c, file.getContents());
        }
    }

    public static final class f implements ObjectEncoder<CrashlyticsReport.Session.Application> {
        public static final f a = new f();
        private static final FieldDescriptor b = FieldDescriptor.of("identifier");
        private static final FieldDescriptor c = FieldDescriptor.of("version");
        private static final FieldDescriptor d = FieldDescriptor.of("displayVersion");
        private static final FieldDescriptor e = FieldDescriptor.of("organization");
        private static final FieldDescriptor f = FieldDescriptor.of("installationUuid");
        private static final FieldDescriptor g = FieldDescriptor.of("developmentPlatform");
        private static final FieldDescriptor h = FieldDescriptor.of("developmentPlatformVersion");

        private f() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, application.getIdentifier());
            objectEncoderContext.add(c, application.getVersion());
            objectEncoderContext.add(d, application.getDisplayVersion());
            objectEncoderContext.add(e, application.getOrganization());
            objectEncoderContext.add(f, application.getInstallationUuid());
            objectEncoderContext.add(g, application.getDevelopmentPlatform());
            objectEncoderContext.add(h, application.getDevelopmentPlatformVersion());
        }
    }

    public static final class g implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {
        public static final g a = new g();
        private static final FieldDescriptor b = FieldDescriptor.of("clsId");

        private g() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, organization.getClsId());
        }
    }

    public static final class h implements ObjectEncoder<CrashlyticsReport.Session.Device> {
        public static final h a = new h();
        private static final FieldDescriptor b = FieldDescriptor.of("arch");
        private static final FieldDescriptor c = FieldDescriptor.of("model");
        private static final FieldDescriptor d = FieldDescriptor.of("cores");
        private static final FieldDescriptor e = FieldDescriptor.of("ram");
        private static final FieldDescriptor f = FieldDescriptor.of("diskSpace");
        private static final FieldDescriptor g = FieldDescriptor.of("simulator");
        private static final FieldDescriptor h = FieldDescriptor.of("state");
        private static final FieldDescriptor i = FieldDescriptor.of("manufacturer");
        private static final FieldDescriptor j = FieldDescriptor.of("modelClass");

        private h() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, device.getArch());
            objectEncoderContext.add(c, device.getModel());
            objectEncoderContext.add(d, device.getCores());
            objectEncoderContext.add(e, device.getRam());
            objectEncoderContext.add(f, device.getDiskSpace());
            objectEncoderContext.add(g, device.isSimulator());
            objectEncoderContext.add(h, device.getState());
            objectEncoderContext.add(i, device.getManufacturer());
            objectEncoderContext.add(j, device.getModelClass());
        }
    }

    public static final class i implements ObjectEncoder<CrashlyticsReport.Session> {
        public static final i a = new i();
        private static final FieldDescriptor b = FieldDescriptor.of("generator");
        private static final FieldDescriptor c = FieldDescriptor.of("identifier");
        private static final FieldDescriptor d = FieldDescriptor.of("startedAt");
        private static final FieldDescriptor e = FieldDescriptor.of("endedAt");
        private static final FieldDescriptor f = FieldDescriptor.of("crashed");
        private static final FieldDescriptor g = FieldDescriptor.of("app");
        private static final FieldDescriptor h = FieldDescriptor.of("user");
        private static final FieldDescriptor i = FieldDescriptor.of(com.xiaomi.market.sdk.Constants.JSON_VERSION);
        private static final FieldDescriptor j = FieldDescriptor.of("device");
        private static final FieldDescriptor k = FieldDescriptor.of("events");
        private static final FieldDescriptor l = FieldDescriptor.of("generatorType");

        private i() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, session.getGenerator());
            objectEncoderContext.add(c, session.getIdentifierUtf8Bytes());
            objectEncoderContext.add(d, session.getStartedAt());
            objectEncoderContext.add(e, session.getEndedAt());
            objectEncoderContext.add(f, session.isCrashed());
            objectEncoderContext.add(g, session.getApp());
            objectEncoderContext.add(h, session.getUser());
            objectEncoderContext.add(i, session.getOs());
            objectEncoderContext.add(j, session.getDevice());
            objectEncoderContext.add(k, session.getEvents());
            objectEncoderContext.add(l, session.getGeneratorType());
        }
    }

    public static final class j implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {
        public static final j a = new j();
        private static final FieldDescriptor b = FieldDescriptor.of("execution");
        private static final FieldDescriptor c = FieldDescriptor.of("customAttributes");
        private static final FieldDescriptor d = FieldDescriptor.of("internalKeys");
        private static final FieldDescriptor e = FieldDescriptor.of("background");
        private static final FieldDescriptor f = FieldDescriptor.of("uiOrientation");

        private j() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, application.getExecution());
            objectEncoderContext.add(c, application.getCustomAttributes());
            objectEncoderContext.add(d, application.getInternalKeys());
            objectEncoderContext.add(e, application.getBackground());
            objectEncoderContext.add(f, application.getUiOrientation());
        }
    }

    public static final class k implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        public static final k a = new k();
        private static final FieldDescriptor b = FieldDescriptor.of("baseAddress");
        private static final FieldDescriptor c = FieldDescriptor.of("size");
        private static final FieldDescriptor d = FieldDescriptor.of("name");
        private static final FieldDescriptor e = FieldDescriptor.of(ST.UUID_DEVICE);

        private k() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, binaryImage.getBaseAddress());
            objectEncoderContext.add(c, binaryImage.getSize());
            objectEncoderContext.add(d, binaryImage.getName());
            objectEncoderContext.add(e, binaryImage.getUuidUtf8Bytes());
        }
    }

    public static final class l implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {
        public static final l a = new l();
        private static final FieldDescriptor b = FieldDescriptor.of("threads");
        private static final FieldDescriptor c = FieldDescriptor.of(io.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION);
        private static final FieldDescriptor d = FieldDescriptor.of("appExitInfo");
        private static final FieldDescriptor e = FieldDescriptor.of("signal");
        private static final FieldDescriptor f = FieldDescriptor.of("binaries");

        private l() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, execution.getThreads());
            objectEncoderContext.add(c, execution.getException());
            objectEncoderContext.add(d, execution.getAppExitInfo());
            objectEncoderContext.add(e, execution.getSignal());
            objectEncoderContext.add(f, execution.getBinaries());
        }
    }

    public static final class m implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        public static final m a = new m();
        private static final FieldDescriptor b = FieldDescriptor.of("type");
        private static final FieldDescriptor c = FieldDescriptor.of("reason");
        private static final FieldDescriptor d = FieldDescriptor.of("frames");
        private static final FieldDescriptor e = FieldDescriptor.of("causedBy");
        private static final FieldDescriptor f = FieldDescriptor.of("overflowCount");

        private m() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, exception.getType());
            objectEncoderContext.add(c, exception.getReason());
            objectEncoderContext.add(d, exception.getFrames());
            objectEncoderContext.add(e, exception.getCausedBy());
            objectEncoderContext.add(f, exception.getOverflowCount());
        }
    }

    public static final class n implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        public static final n a = new n();
        private static final FieldDescriptor b = FieldDescriptor.of("name");
        private static final FieldDescriptor c = FieldDescriptor.of("code");
        private static final FieldDescriptor d = FieldDescriptor.of(IntegrityManager.INTEGRITY_TYPE_ADDRESS);

        private n() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, signal.getName());
            objectEncoderContext.add(c, signal.getCode());
            objectEncoderContext.add(d, signal.getAddress());
        }
    }

    public static final class o implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        public static final o a = new o();
        private static final FieldDescriptor b = FieldDescriptor.of("name");
        private static final FieldDescriptor c = FieldDescriptor.of("importance");
        private static final FieldDescriptor d = FieldDescriptor.of("frames");

        private o() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, thread.getName());
            objectEncoderContext.add(c, thread.getImportance());
            objectEncoderContext.add(d, thread.getFrames());
        }
    }

    public static final class p implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        public static final p a = new p();
        private static final FieldDescriptor b = FieldDescriptor.of("pc");
        private static final FieldDescriptor c = FieldDescriptor.of("symbol");
        private static final FieldDescriptor d = FieldDescriptor.of("file");
        private static final FieldDescriptor e = FieldDescriptor.of("offset");
        private static final FieldDescriptor f = FieldDescriptor.of("importance");

        private p() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, frame.getPc());
            objectEncoderContext.add(c, frame.getSymbol());
            objectEncoderContext.add(d, frame.getFile());
            objectEncoderContext.add(e, frame.getOffset());
            objectEncoderContext.add(f, frame.getImportance());
        }
    }

    public static final class q implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {
        public static final q a = new q();
        private static final FieldDescriptor b = FieldDescriptor.of("batteryLevel");
        private static final FieldDescriptor c = FieldDescriptor.of("batteryVelocity");
        private static final FieldDescriptor d = FieldDescriptor.of("proximityOn");
        private static final FieldDescriptor e = FieldDescriptor.of("orientation");
        private static final FieldDescriptor f = FieldDescriptor.of("ramUsed");
        private static final FieldDescriptor g = FieldDescriptor.of("diskUsed");

        private q() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, device.getBatteryLevel());
            objectEncoderContext.add(c, device.getBatteryVelocity());
            objectEncoderContext.add(d, device.isProximityOn());
            objectEncoderContext.add(e, device.getOrientation());
            objectEncoderContext.add(f, device.getRamUsed());
            objectEncoderContext.add(g, device.getDiskUsed());
        }
    }

    public static final class r implements ObjectEncoder<CrashlyticsReport.Session.Event> {
        public static final r a = new r();
        private static final FieldDescriptor b = FieldDescriptor.of("timestamp");
        private static final FieldDescriptor c = FieldDescriptor.of("type");
        private static final FieldDescriptor d = FieldDescriptor.of("app");
        private static final FieldDescriptor e = FieldDescriptor.of("device");
        private static final FieldDescriptor f = FieldDescriptor.of("log");

        private r() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, event.getTimestamp());
            objectEncoderContext.add(c, event.getType());
            objectEncoderContext.add(d, event.getApp());
            objectEncoderContext.add(e, event.getDevice());
            objectEncoderContext.add(f, event.getLog());
        }
    }

    public static final class s implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {
        public static final s a = new s();
        private static final FieldDescriptor b = FieldDescriptor.of("content");

        private s() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, log.getContent());
        }
    }

    public static final class t implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {
        public static final t a = new t();
        private static final FieldDescriptor b = FieldDescriptor.of(Constants.PARAM_PLATFORM);
        private static final FieldDescriptor c = FieldDescriptor.of("version");
        private static final FieldDescriptor d = FieldDescriptor.of("buildVersion");
        private static final FieldDescriptor e = FieldDescriptor.of("jailbroken");

        private t() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, operatingSystem.getPlatform());
            objectEncoderContext.add(c, operatingSystem.getVersion());
            objectEncoderContext.add(d, operatingSystem.getBuildVersion());
            objectEncoderContext.add(e, operatingSystem.isJailbroken());
        }
    }

    public static final class u implements ObjectEncoder<CrashlyticsReport.Session.User> {
        public static final u a = new u();
        private static final FieldDescriptor b = FieldDescriptor.of("identifier");

        private u() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, user.getIdentifier());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        c cVar = c.a;
        encoderConfig.registerEncoder(CrashlyticsReport.class, cVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.a.class, cVar);
        i iVar = i.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, iVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.f.class, iVar);
        f fVar = f.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, fVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.g.class, fVar);
        g gVar = g.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, gVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.h.class, gVar);
        u uVar = u.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, uVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.u.class, uVar);
        t tVar = t.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, tVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.t.class, tVar);
        h hVar = h.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, hVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.i.class, hVar);
        r rVar = r.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, rVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.j.class, rVar);
        j jVar = j.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, jVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.k.class, jVar);
        l lVar = l.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, lVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.l.class, lVar);
        o oVar = o.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, oVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.p.class, oVar);
        p pVar = p.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, pVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.q.class, pVar);
        m mVar = m.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, mVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.n.class, mVar);
        a aVar = a.a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, aVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.b.class, aVar);
        n nVar = n.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, nVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.o.class, nVar);
        k kVar = k.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, kVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.m.class, kVar);
        b bVar = b.a;
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, bVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.c.class, bVar);
        q qVar = q.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, qVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.r.class, qVar);
        s sVar = s.a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, sVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.s.class, sVar);
        d dVar = d.a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, dVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.d.class, dVar);
        e eVar = e.a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, eVar);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.model.e.class, eVar);
    }
}

package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoBatchedLogRequestEncoder();

    public static final class a implements ObjectEncoder<AndroidClientInfo> {
        public static final a a = new a();
        private static final FieldDescriptor b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        private static final FieldDescriptor c = FieldDescriptor.of("model");
        private static final FieldDescriptor d = FieldDescriptor.of(StatEvent.Key.HARDWARE);
        private static final FieldDescriptor e = FieldDescriptor.of("device");
        private static final FieldDescriptor f = FieldDescriptor.of("product");
        private static final FieldDescriptor g = FieldDescriptor.of("osBuild");
        private static final FieldDescriptor h = FieldDescriptor.of("manufacturer");
        private static final FieldDescriptor i = FieldDescriptor.of("fingerprint");
        private static final FieldDescriptor j = FieldDescriptor.of("locale");
        private static final FieldDescriptor k = FieldDescriptor.of("country");
        private static final FieldDescriptor l = FieldDescriptor.of("mccMnc");
        private static final FieldDescriptor m = FieldDescriptor.of("applicationBuild");

        private a() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(c, androidClientInfo.getModel());
            objectEncoderContext.add(d, androidClientInfo.getHardware());
            objectEncoderContext.add(e, androidClientInfo.getDevice());
            objectEncoderContext.add(f, androidClientInfo.getProduct());
            objectEncoderContext.add(g, androidClientInfo.getOsBuild());
            objectEncoderContext.add(h, androidClientInfo.getManufacturer());
            objectEncoderContext.add(i, androidClientInfo.getFingerprint());
            objectEncoderContext.add(j, androidClientInfo.getLocale());
            objectEncoderContext.add(k, androidClientInfo.getCountry());
            objectEncoderContext.add(l, androidClientInfo.getMccMnc());
            objectEncoderContext.add(m, androidClientInfo.getApplicationBuild());
        }
    }

    public static final class b implements ObjectEncoder<BatchedLogRequest> {
        public static final b a = new b();
        private static final FieldDescriptor b = FieldDescriptor.of("logRequest");

        private b() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, batchedLogRequest.getLogRequests());
        }
    }

    public static final class c implements ObjectEncoder<ClientInfo> {
        public static final c a = new c();
        private static final FieldDescriptor b = FieldDescriptor.of("clientType");
        private static final FieldDescriptor c = FieldDescriptor.of("androidClientInfo");

        private c() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, clientInfo.getClientType());
            objectEncoderContext.add(c, clientInfo.getAndroidClientInfo());
        }
    }

    public static final class d implements ObjectEncoder<LogEvent> {
        public static final d a = new d();
        private static final FieldDescriptor b = FieldDescriptor.of("eventTimeMs");
        private static final FieldDescriptor c = FieldDescriptor.of("eventCode");
        private static final FieldDescriptor d = FieldDescriptor.of("eventUptimeMs");
        private static final FieldDescriptor e = FieldDescriptor.of("sourceExtension");
        private static final FieldDescriptor f = FieldDescriptor.of("sourceExtensionJsonProto3");
        private static final FieldDescriptor g = FieldDescriptor.of("timezoneOffsetSeconds");
        private static final FieldDescriptor h = FieldDescriptor.of("networkConnectionInfo");

        private d() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, logEvent.getEventTimeMs());
            objectEncoderContext.add(c, logEvent.getEventCode());
            objectEncoderContext.add(d, logEvent.getEventUptimeMs());
            objectEncoderContext.add(e, logEvent.getSourceExtension());
            objectEncoderContext.add(f, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(g, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(h, logEvent.getNetworkConnectionInfo());
        }
    }

    public static final class e implements ObjectEncoder<LogRequest> {
        public static final e a = new e();
        private static final FieldDescriptor b = FieldDescriptor.of("requestTimeMs");
        private static final FieldDescriptor c = FieldDescriptor.of("requestUptimeMs");
        private static final FieldDescriptor d = FieldDescriptor.of("clientInfo");
        private static final FieldDescriptor e = FieldDescriptor.of("logSource");
        private static final FieldDescriptor f = FieldDescriptor.of("logSourceName");
        private static final FieldDescriptor g = FieldDescriptor.of("logEvent");
        private static final FieldDescriptor h = FieldDescriptor.of("qosTier");

        private e() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, logRequest.getRequestTimeMs());
            objectEncoderContext.add(c, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(d, logRequest.getClientInfo());
            objectEncoderContext.add(e, logRequest.getLogSource());
            objectEncoderContext.add(f, logRequest.getLogSourceName());
            objectEncoderContext.add(g, logRequest.getLogEvents());
            objectEncoderContext.add(h, logRequest.getQosTier());
        }
    }

    public static final class f implements ObjectEncoder<NetworkConnectionInfo> {
        public static final f a = new f();
        private static final FieldDescriptor b = FieldDescriptor.of("networkType");
        private static final FieldDescriptor c = FieldDescriptor.of("mobileSubtype");

        private f() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(c, networkConnectionInfo.getMobileSubtype());
        }
    }

    private AutoBatchedLogRequestEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        b bVar = b.a;
        encoderConfig.registerEncoder(BatchedLogRequest.class, bVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.b.class, bVar);
        e eVar = e.a;
        encoderConfig.registerEncoder(LogRequest.class, eVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.e.class, eVar);
        c cVar = c.a;
        encoderConfig.registerEncoder(ClientInfo.class, cVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.c.class, cVar);
        a aVar = a.a;
        encoderConfig.registerEncoder(AndroidClientInfo.class, aVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.a.class, aVar);
        d dVar = d.a;
        encoderConfig.registerEncoder(LogEvent.class, dVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.d.class, dVar);
        f fVar = f.a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, fVar);
        encoderConfig.registerEncoder(g.class, fVar);
    }
}

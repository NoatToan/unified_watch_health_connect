package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    public static final class a implements ObjectEncoder<ClientMetrics> {
        public static final a a = new a();
        private static final FieldDescriptor b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();
        private static final FieldDescriptor d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();
        private static final FieldDescriptor e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        private a() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, clientMetrics.getWindowInternal());
            objectEncoderContext.add(c, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(d, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(e, clientMetrics.getAppNamespace());
        }
    }

    public static final class b implements ObjectEncoder<GlobalMetrics> {
        public static final b a = new b();
        private static final FieldDescriptor b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private b() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, globalMetrics.getStorageMetricsInternal());
        }
    }

    public static final class c implements ObjectEncoder<LogEventDropped> {
        public static final c a = new c();
        private static final FieldDescriptor b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        private c() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(c, logEventDropped.getReason());
        }
    }

    public static final class d implements ObjectEncoder<LogSourceMetrics> {
        public static final d a = new d();
        private static final FieldDescriptor b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private d() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, logSourceMetrics.getLogSource());
            objectEncoderContext.add(c, logSourceMetrics.getLogEventDroppedList());
        }
    }

    public static final class e implements ObjectEncoder<ProtoEncoderDoNotUse> {
        public static final e a = new e();
        private static final FieldDescriptor b = FieldDescriptor.of("clientMetrics");

        private e() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    public static final class f implements ObjectEncoder<StorageMetrics> {
        public static final f a = new f();
        private static final FieldDescriptor b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private f() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(c, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    public static final class g implements ObjectEncoder<TimeWindow> {
        public static final g a = new g();
        private static final FieldDescriptor b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private g() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, timeWindow.getStartMs());
            objectEncoderContext.add(c, timeWindow.getEndMs());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, e.a);
        encoderConfig.registerEncoder(ClientMetrics.class, a.a);
        encoderConfig.registerEncoder(TimeWindow.class, g.a);
        encoderConfig.registerEncoder(LogSourceMetrics.class, d.a);
        encoderConfig.registerEncoder(LogEventDropped.class, c.a);
        encoderConfig.registerEncoder(GlobalMetrics.class, b.a);
        encoderConfig.registerEncoder(StorageMetrics.class, f.a);
    }
}

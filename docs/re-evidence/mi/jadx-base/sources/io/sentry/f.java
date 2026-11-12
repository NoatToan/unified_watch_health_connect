package io.sentry;

import defpackage.eyc;
import defpackage.fsd;
import defpackage.fvl;
import defpackage.jtd;
import defpackage.jul;
import defpackage.ltd;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Device;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebInteractionEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements eyc {
    public static final Charset c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, fsd<?>> f21711b;

    public f(@NotNull SentryOptions sentryOptions) {
        this.f21710a = sentryOptions;
        HashMap map = new HashMap();
        this.f21711b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.protocol.a.C0970a());
        map.put(a.class, new a.C0967a());
        map.put(io.sentry.protocol.b.class, new io.sentry.protocol.b.a());
        map.put(Contexts.class, new Contexts.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(io.sentry.protocol.c.class, new io.sentry.protocol.c.a());
        map.put(Device.class, new Device.a());
        map.put(Device.DeviceOrientation.class, new Device.DeviceOrientation.a());
        map.put(io.sentry.protocol.e.class, new io.sentry.protocol.e.a());
        map.put(io.sentry.protocol.f.class, new io.sentry.protocol.f.a());
        map.put(io.sentry.protocol.g.class, new io.sentry.protocol.g.a());
        map.put(io.sentry.protocol.h.class, new io.sentry.protocol.h.a());
        map.put(io.sentry.protocol.i.class, new io.sentry.protocol.i.a());
        map.put(io.sentry.protocol.j.class, new io.sentry.protocol.j.a());
        map.put(j.class, new j.b());
        map.put(k.class, new k.a());
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.profilemeasurements.a.C0969a());
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.profilemeasurements.b.a());
        map.put(io.sentry.protocol.k.class, new io.sentry.protocol.k.a());
        map.put(l.class, new l.b());
        map.put(io.sentry.rrweb.a.class, new io.sentry.rrweb.a.C0971a());
        map.put(RRWebEventType.class, new RRWebEventType.a());
        map.put(RRWebInteractionEvent.class, new RRWebInteractionEvent.a());
        map.put(io.sentry.rrweb.c.class, new io.sentry.rrweb.c.a());
        map.put(io.sentry.rrweb.d.class, new io.sentry.rrweb.d.a());
        map.put(io.sentry.rrweb.e.class, new io.sentry.rrweb.e.a());
        map.put(io.sentry.rrweb.f.class, new io.sentry.rrweb.f.a());
        map.put(io.sentry.protocol.m.class, new io.sentry.protocol.m.a());
        map.put(io.sentry.protocol.n.class, new io.sentry.protocol.n.a());
        map.put(q.class, new q.a());
        map.put(r.class, new r.a());
        map.put(s.class, new s.a());
        map.put(io.sentry.protocol.o.class, new io.sentry.protocol.o.a());
        map.put(SentryItemType.class, new SentryItemType.a());
        map.put(SentryLevel.class, new SentryLevel.a());
        map.put(t.class, new t.a());
        map.put(io.sentry.protocol.q.class, new io.sentry.protocol.q.a());
        map.put(io.sentry.protocol.r.class, new io.sentry.protocol.r.a());
        map.put(SentryReplayEvent.class, new SentryReplayEvent.a());
        map.put(io.sentry.protocol.s.class, new io.sentry.protocol.s.a());
        map.put(io.sentry.protocol.t.class, new io.sentry.protocol.t.a());
        map.put(io.sentry.protocol.u.class, new io.sentry.protocol.u.a());
        map.put(n.class, new n.a());
        map.put(io.sentry.protocol.v.class, new io.sentry.protocol.v.a());
        map.put(io.sentry.protocol.w.class, new io.sentry.protocol.w.a());
        map.put(Session.class, new Session.a());
        map.put(v.class, new v.a());
        map.put(w.class, new w.a());
        map.put(SpanStatus.class, new SpanStatus.a());
        map.put(io.sentry.protocol.y.class, new io.sentry.protocol.y.a());
        map.put(io.sentry.protocol.d.class, new io.sentry.protocol.d.a());
        map.put(b0.class, new b0.a());
        map.put(io.sentry.clientreport.c.class, new io.sentry.clientreport.c.a());
        map.put(io.sentry.protocol.a0.class, new io.sentry.protocol.a0.a());
        map.put(io.sentry.protocol.z.class, new io.sentry.protocol.z.a());
    }

    @Override // defpackage.eyc
    public <T> void a(@NotNull T t, @NotNull Writer writer) throws IOException {
        io.sentry.util.p.c(t, "The entity is required.");
        io.sentry.util.p.c(writer, "The Writer object is required.");
        ILogger logger = this.f21710a.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        if (logger.d(sentryLevel)) {
            this.f21710a.getLogger().c(sentryLevel, "Serializing object: %s", h(t, this.f21710a.isEnablePrettySerializationOutput()));
        }
        new ltd(writer, this.f21710a.getMaxDepth()).j(this.f21710a.getLogger(), t);
        writer.flush();
    }

    @Override // defpackage.eyc
    @Nullable
    public <T> T b(@NotNull Reader reader, @NotNull Class<T> cls) {
        try {
            jtd jtdVar = new jtd(reader);
            try {
                fsd<?> fsdVar = this.f21711b.get(cls);
                if (fsdVar != null) {
                    T tCast = cls.cast(fsdVar.a(jtdVar, this.f21710a.getLogger()));
                    jtdVar.close();
                    return tCast;
                }
                if (!g(cls)) {
                    jtdVar.close();
                    return null;
                }
                T t = (T) jtdVar.q0();
                jtdVar.close();
                return t;
            } catch (Throwable th) {
                try {
                    jtdVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            this.f21710a.getLogger().a(SentryLevel.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // defpackage.eyc
    @Nullable
    public <T, R> T c(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable fsd<R> fsdVar) {
        try {
            jtd jtdVar = new jtd(reader);
            try {
                if (!Collection.class.isAssignableFrom(cls)) {
                    T t = (T) jtdVar.q0();
                    jtdVar.close();
                    return t;
                }
                if (fsdVar == null) {
                    T t2 = (T) jtdVar.q0();
                    jtdVar.close();
                    return t2;
                }
                T t3 = (T) jtdVar.C(this.f21710a.getLogger(), fsdVar);
                jtdVar.close();
                return t3;
            } catch (Throwable th) {
                try {
                    jtdVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f21710a.getLogger().a(SentryLevel.ERROR, "Error when deserializing", th3);
            return null;
        }
    }

    @Override // defpackage.eyc
    public void d(@NotNull jul julVar, @NotNull OutputStream outputStream) throws Exception {
        io.sentry.util.p.c(julVar, "The SentryEnvelope object is required.");
        io.sentry.util.p.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c));
        try {
            julVar.b().serialize(new ltd(bufferedWriter, this.f21710a.getMaxDepth()), this.f21710a.getLogger());
            bufferedWriter.write("\n");
            for (fvl fvlVar : julVar.c()) {
                try {
                    byte[] bArrE = fvlVar.E();
                    fvlVar.F().serialize(new ltd(bufferedWriter, this.f21710a.getMaxDepth()), this.f21710a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrE);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    this.f21710a.getLogger().a(SentryLevel.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    @Override // defpackage.eyc
    @Nullable
    public jul e(@NotNull InputStream inputStream) {
        io.sentry.util.p.c(inputStream, "The InputStream object is required.");
        try {
            return this.f21710a.getEnvelopeReader().a(inputStream);
        } catch (IOException e) {
            this.f21710a.getLogger().a(SentryLevel.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // defpackage.eyc
    @NotNull
    public String f(@NotNull Map<String, Object> map) throws Exception {
        return h(map, false);
    }

    public final <T> boolean g(@NotNull Class<T> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    @NotNull
    public final String h(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        ltd ltdVar = new ltd(stringWriter, this.f21710a.getMaxDepth());
        if (z) {
            ltdVar.s("\t");
        }
        ltdVar.j(this.f21710a.getLogger(), obj);
        return stringWriter.toString();
    }
}

package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class c implements ObjectEncoderContext {
    private static final Charset f = Charset.forName("UTF-8");
    private static final FieldDescriptor g = FieldDescriptor.builder("key").withProperty(AtProtobuf.builder().tag(1).build()).build();
    private static final FieldDescriptor h = FieldDescriptor.builder("value").withProperty(AtProtobuf.builder().tag(2).build()).build();
    private static final ObjectEncoder<Map.Entry<Object, Object>> i = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.b
        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.a
        public final void a(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            c.r((Map.Entry) obj, objectEncoderContext);
        }
    };
    private OutputStream a;
    private final Map<Class<?>, ObjectEncoder<?>> b;
    private final Map<Class<?>, ValueEncoder<?>> c;
    private final ObjectEncoder<Object> d;
    private final d e = new d(this);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = objectEncoder;
    }

    private static ByteBuffer k(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long l(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
        try {
            OutputStream outputStream = this.a;
            this.a = aVar;
            try {
                objectEncoder.a(t, this);
                this.a = outputStream;
                long jA = aVar.a();
                aVar.close();
                return jA;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> c m(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        long jL = l(objectEncoder, t);
        if (z && jL == 0) {
            return this;
        }
        s((q(fieldDescriptor) << 3) | 2);
        t(jL);
        objectEncoder.a(t, this);
        return this;
    }

    private <T> c n(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        this.e.b(fieldDescriptor, z);
        valueEncoder.a(t, this.e);
        return this;
    }

    private static Protobuf p(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int q(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(g, entry.getKey());
        objectEncoderContext.add(h, entry.getValue());
    }

    private void s(int i2) throws IOException {
        while ((i2 & com.alipay.sdk.m.n.a.g) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    private void t(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }

    public ObjectEncoderContext b(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        s((q(fieldDescriptor) << 3) | 1);
        this.a.write(k(8).putDouble(d).array());
        return this;
    }

    public ObjectEncoderContext c(@NonNull FieldDescriptor fieldDescriptor, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        s((q(fieldDescriptor) << 3) | 5);
        this.a.write(k(4).putFloat(f2).array());
        return this;
    }

    public ObjectEncoderContext d(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            s((q(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            s(bytes.length);
            this.a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it2 = ((Collection) obj).iterator();
            while (it2.hasNext()) {
                d(fieldDescriptor, it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                m(i, fieldDescriptor, (Map.Entry) it3.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return b(fieldDescriptor, ((Double) obj).doubleValue(), z);
        }
        if (obj instanceof Float) {
            return c(fieldDescriptor, ((Float) obj).floatValue(), z);
        }
        if (obj instanceof Number) {
            return h(fieldDescriptor, ((Number) obj).longValue(), z);
        }
        if (obj instanceof Boolean) {
            return j(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            s((q(fieldDescriptor) << 3) | 2);
            s(bArr.length);
            this.a.write(bArr);
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.b.get(obj.getClass());
        if (objectEncoder != null) {
            return m(objectEncoder, fieldDescriptor, obj, z);
        }
        ValueEncoder<?> valueEncoder = this.c.get(obj.getClass());
        if (valueEncoder != null) {
            return n(valueEncoder, fieldDescriptor, obj, z);
        }
        if (obj instanceof ProtoEnum) {
            return add(fieldDescriptor, ((ProtoEnum) obj).getNumber());
        }
        return obj instanceof Enum ? add(fieldDescriptor, ((Enum) obj).ordinal()) : m(this.d, fieldDescriptor, obj, z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c add(@NonNull FieldDescriptor fieldDescriptor, int i2) throws IOException {
        return f(fieldDescriptor, i2, true);
    }

    public c f(@NonNull FieldDescriptor fieldDescriptor, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        Protobuf protobufP = p(fieldDescriptor);
        int i3 = a.a[protobufP.intEncoding().ordinal()];
        if (i3 == 1) {
            s(protobufP.tag() << 3);
            s(i2);
        } else if (i3 == 2) {
            s(protobufP.tag() << 3);
            s((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            s((protobufP.tag() << 3) | 5);
            this.a.write(k(4).putInt(i2).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        return h(fieldDescriptor, j, true);
    }

    public c h(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        Protobuf protobufP = p(fieldDescriptor);
        int i2 = a.a[protobufP.intEncoding().ordinal()];
        if (i2 == 1) {
            s(protobufP.tag() << 3);
            t(j);
        } else if (i2 == 2) {
            s(protobufP.tag() << 3);
            t((j >> 63) ^ (j << 1));
        } else if (i2 == 3) {
            s((protobufP.tag() << 3) | 1);
            this.a.write(k(8).putLong(j).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return j(fieldDescriptor, z, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return o(obj);
    }

    public c j(@NonNull FieldDescriptor fieldDescriptor, boolean z, boolean z2) throws IOException {
        return f(fieldDescriptor, z ? 1 : 0, z2);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }

    public c o(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        return add(FieldDescriptor.of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        return add(FieldDescriptor.of(str), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, int i2) throws IOException {
        return add(FieldDescriptor.of(str), i2);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        return add(FieldDescriptor.of(str), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, boolean z) throws IOException {
        return add(FieldDescriptor.of(str), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return d(fieldDescriptor, obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        return b(fieldDescriptor, d, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f2) throws IOException {
        return c(fieldDescriptor, f2, true);
    }
}

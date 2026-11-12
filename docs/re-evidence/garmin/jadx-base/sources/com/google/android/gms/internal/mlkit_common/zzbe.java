package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.measurement.a;
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

/* JADX INFO: loaded from: classes14.dex */
final class zzbe implements ObjectEncoderContext {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final FieldDescriptor zzb = a.d(1, FieldDescriptor.builder(Action.KEY_ATTRIBUTE));
    private static final FieldDescriptor zzc = a.d(2, FieldDescriptor.builder("value"));
    private static final ObjectEncoder zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_common.zzbd
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            zzbe.zzg((Map.Entry) obj, objectEncoderContext);
        }
    };
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ObjectEncoder zzh;
    private final zzbi zzi = new zzbi(this);

    public zzbe(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        zzbc zzbcVar = (zzbc) fieldDescriptor.getProperty(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(ObjectEncoder objectEncoder, Object obj) throws IOException {
        zzaz zzazVar = new zzaz();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzazVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzazVar.zza();
                zzazVar.close();
                return jZza;
            } catch (Throwable th3) {
                this.zze = outputStream;
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                zzazVar.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private static zzbc zzj(FieldDescriptor fieldDescriptor) {
        zzbc zzbcVar = (zzbc) fieldDescriptor.getProperty(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzbe zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z14) throws IOException {
        long jZzi = zzi(objectEncoder, obj);
        if (z14 && jZzi == 0) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(jZzi);
        objectEncoder.encode(obj, this);
        return this;
    }

    private final zzbe zzl(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z14) {
        this.zzi.zza(fieldDescriptor, z14);
        valueEncoder.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i14) {
        return ByteBuffer.allocate(i14).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i14) throws IOException {
        while (true) {
            long j8 = i14 & (-128);
            int i15 = i14 & 127;
            OutputStream outputStream = this.zze;
            if (j8 == 0) {
                outputStream.write(i15);
                return;
            } else {
                outputStream.write(i15 | 128);
                i14 >>>= 7;
            }
        }
    }

    private final void zzo(long j8) throws IOException {
        while (true) {
            long j14 = (-128) & j8;
            int i14 = ((int) j8) & 127;
            OutputStream outputStream = this.zze;
            if (j14 == 0) {
                outputStream.write(i14);
                return;
            } else {
                outputStream.write(i14 | 128);
                j8 >>>= 7;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d14) throws IOException {
        zza(FieldDescriptor.of(str), d14, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        zzf(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.of(str));
    }

    public final ObjectEncoderContext zza(FieldDescriptor fieldDescriptor, double d14, boolean z14) throws IOException {
        if (z14 && d14 == 0.0d) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d14).array());
        return this;
    }

    public final ObjectEncoderContext zzb(FieldDescriptor fieldDescriptor, float f14, boolean z14) throws IOException {
        if (z14 && f14 == 0.0f) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f14).array());
        return this;
    }

    public final ObjectEncoderContext zzc(FieldDescriptor fieldDescriptor, Object obj, boolean z14) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z14 || charSequence.length() != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it3 = ((Map) obj).entrySet().iterator();
                while (it3.hasNext()) {
                    zzk(zzd, fieldDescriptor, (Map.Entry) it3.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(fieldDescriptor, ((Double) obj).doubleValue(), z14);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(fieldDescriptor, ((Float) obj).floatValue(), z14);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(fieldDescriptor, ((Number) obj).longValue(), z14);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z14);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
                    if (objectEncoder != null) {
                        zzk(objectEncoder, fieldDescriptor, obj, z14);
                        return this;
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.zzg.get(obj.getClass());
                    if (valueEncoder != null) {
                        zzl(valueEncoder, fieldDescriptor, obj, z14);
                        return this;
                    }
                    if (obj instanceof zzba) {
                        zzd(fieldDescriptor, ((zzba) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, fieldDescriptor, obj, z14);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z14 || bArr.length != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzbe zzd(FieldDescriptor fieldDescriptor, int i14, boolean z14) throws IOException {
        if (!z14 || i14 != 0) {
            zzbc zzbcVarZzj = zzj(fieldDescriptor);
            int iOrdinal = zzbcVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzbcVarZzj.zza() << 3);
                zzn(i14);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzbcVarZzj.zza() << 3);
                zzn((i14 + i14) ^ (i14 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzbcVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i14).array());
                return this;
            }
        }
        return this;
    }

    public final zzbe zze(FieldDescriptor fieldDescriptor, long j8, boolean z14) throws IOException {
        if (!z14 || j8 != 0) {
            zzbc zzbcVarZzj = zzj(fieldDescriptor);
            int iOrdinal = zzbcVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzbcVarZzj.zza() << 3);
                zzo(j8);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzbcVarZzj.zza() << 3);
                zzo((j8 >> 63) ^ (j8 + j8));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzbcVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j8).array());
                return this;
            }
        }
        return this;
    }

    public final zzbe zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f14) throws IOException {
        zzb(fieldDescriptor, f14, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i14) throws IOException {
        zzd(fieldDescriptor, i14, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j8) throws IOException {
        zze(fieldDescriptor, j8, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        zzc(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z14) throws IOException {
        zzd(fieldDescriptor, z14 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d14) throws IOException {
        zza(fieldDescriptor, d14, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i14) throws IOException {
        zzd(FieldDescriptor.of(str), i14, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j8) throws IOException {
        zze(FieldDescriptor.of(str), j8, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) throws IOException {
        zzc(FieldDescriptor.of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z14) throws IOException {
        zzd(FieldDescriptor.of(str), z14 ? 1 : 0, true);
        return this;
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzjx;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzjt<MessageType extends zzjx<MessageType, BuilderType>, BuilderType extends zzjt<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    private final MessageType a;
    public MessageType zza;
    public boolean zzb = false;

    public zzjt(MessageType messagetype) {
        this.a = messagetype;
        this.zza = (MessageType) messagetype.zzl(4, null, null);
    }

    private static final void a(MessageType messagetype, MessageType messagetype2) {
        x3.a().b(messagetype.getClass()).f(messagetype, messagetype2);
    }

    public final MessageType zzaA() {
        MessageType messagetype = (MessageType) zzaC();
        boolean z = true;
        byte bByteValue = ((Byte) messagetype.zzl(1, null, null)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                z = false;
            } else {
                boolean zA = x3.a().b(messagetype.getClass()).a(messagetype);
                messagetype.zzl(2, true != zA ? null : messagetype, null);
                z = zA;
            }
        }
        if (z) {
            return messagetype;
        }
        throw new zzma(messagetype);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
    public MessageType zzaC() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        x3.a().b(messagetype.getClass()).b(messagetype);
        this.zzb = true;
        return this.zza;
    }

    public void zzaE() {
        MessageType messagetype = (MessageType) this.zza.zzl(4, null, null);
        a(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* synthetic */ zzig zzar(zzih zzihVar) {
        zzay((zzjx) zzihVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzas(byte[] bArr, int i, int i2) throws zzkh {
        zzaz(bArr, 0, i2, zzjj.zza());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzat(byte[] bArr, int i, int i2, zzjj zzjjVar) throws zzkh {
        zzaz(bArr, 0, i2, zzjjVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzig
    /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final BuilderType zzaq() {
        BuilderType buildertype = (BuilderType) this.a.zzl(5, null, null);
        buildertype.zzay(zzaC());
        return buildertype;
    }

    public final BuilderType zzay(MessageType messagetype) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        a(this.zza, messagetype);
        return this;
    }

    public final BuilderType zzaz(byte[] bArr, int i, int i2, zzjj zzjjVar) throws zzkh {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        try {
            x3.a().b(this.zza.getClass()).e(this.zza, bArr, 0, i2, new g2(zzjjVar));
            return this;
        } catch (zzkh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.g();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final /* synthetic */ zzlc zzbL() {
        return this.a;
    }
}

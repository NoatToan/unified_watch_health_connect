package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final com.google.android.play.core.splitcompat.zzs zze;

    public zzak(Context context, Executor executor, zzam zzamVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = zzsVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer numZze = zzakVar.zze(list);
        if (numZze == null) {
            return;
        }
        if (numZze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(numZze.intValue());
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                zzfVar.zza();
            } else {
                zzfVar.zzb(-12);
            }
        } catch (Exception unused) {
            zzfVar.zzb(-12);
        }
    }

    @SplitInstallErrorCode
    private final Integer zze(List list) {
        FileLock fileLockTryLock;
        int i14;
        try {
            FileChannel channel = new RandomAccessFile(this.zzb.zzd(), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    try {
                        Iterator it = list.iterator();
                        while (true) {
                            i14 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.zza.getContentResolver().openAssetFileDescriptor(intent.getData(), JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
                            try {
                                File fileZze = this.zzb.zze(stringExtra);
                                if ((fileZze.exists() && fileZze.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileZze.exists()) {
                                    if (!this.zzb.zzg(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileZze);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i15 = bufferedInputStream.read(bArr);
                                                    if (i15 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i15);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th3) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th4) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th5) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th6) {
                                            bufferedInputStream.close();
                                            throw th6;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th7) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th8) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                                    }
                                }
                                throw th7;
                            }
                        }
                        File[] fileArrListFiles = this.zzb.zzb().listFiles();
                        try {
                            if (this.zzc.zzc(fileArrListFiles) && this.zzc.zza(fileArrListFiles)) {
                                File[] fileArrListFiles2 = this.zzb.zzb().listFiles();
                                Arrays.sort(fileArrListFiles2);
                                int length = fileArrListFiles2.length;
                                while (true) {
                                    length--;
                                    if (length < 0) {
                                        break;
                                    }
                                    com.google.android.play.core.splitcompat.zze.zzm(fileArrListFiles2[length]);
                                    File file = fileArrListFiles2[length];
                                    file.renameTo(this.zzb.zzf(file));
                                }
                            } else {
                                i14 = -11;
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (IOException | Exception unused3) {
                        i14 = -13;
                    }
                    numValueOf = Integer.valueOf(i14);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th9) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th10) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th10);
                    }
                }
                throw th9;
            }
        } catch (Exception unused4) {
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (SplitCompat.zze()) {
            this.zzd.execute(new zzaj(this, list, zzfVar));
        } else {
            h.z("Ingestion should only be called in SplitCompat mode.");
        }
    }
}

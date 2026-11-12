package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
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

/* JADX INFO: loaded from: classes5.dex */
public final class xht implements hjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bjt f39146b;
    public final ait c;
    public final Executor d;
    public final ekt e;

    public xht(Context context, Executor executor, ait aitVar, bjt bjtVar, ekt ektVar) {
        this.f39145a = context;
        this.f39146b = bjtVar;
        this.c = aitVar;
        this.d = executor;
        this.e = ektVar;
    }

    public static /* bridge */ /* synthetic */ void c(xht xhtVar, List list, cjt cjtVar) {
        Integer numE = xhtVar.e(list);
        if (numE == null) {
            return;
        }
        if (numE.intValue() == 0) {
            cjtVar.zzc();
        } else {
            cjtVar.a(numE.intValue());
        }
    }

    public static /* bridge */ /* synthetic */ void d(xht xhtVar, cjt cjtVar) {
        try {
            if (f7n.d(vit.a(xhtVar.f39145a))) {
                cjtVar.zza();
            } else {
                cjtVar.a(-12);
            }
        } catch (Exception unused) {
            cjtVar.a(-12);
        }
    }

    @Override // defpackage.hjt
    public final void a(List list, cjt cjtVar) {
        if (!f7n.e()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.d.execute(new wht(this, list, cjtVar));
    }

    public final Integer e(List list) {
        FileLock fileLockTryLock;
        int i;
        try {
            FileChannel channel = new RandomAccessFile(this.f39146b.d(), "rw").getChannel();
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
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f39145a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                File fileE = this.f39146b.e(stringExtra);
                                if ((fileE.exists() && fileE.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileE.exists()) {
                                    if (!this.f39146b.g(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i2 = bufferedInputStream.read(bArr);
                                                    if (i2 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i2);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th3) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th4) {
                                            bufferedInputStream.close();
                                            throw th4;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th5) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th6) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                    }
                                }
                                throw th5;
                            }
                        }
                        File[] fileArrListFiles = this.f39146b.b().listFiles();
                        try {
                            if (this.c.c(fileArrListFiles) && this.c.a(fileArrListFiles)) {
                                File[] fileArrListFiles2 = this.f39146b.b().listFiles();
                                Arrays.sort(fileArrListFiles2);
                                int length = fileArrListFiles2.length;
                                while (true) {
                                    length--;
                                    if (length < 0) {
                                        break;
                                    }
                                    bjt.m(fileArrListFiles2[length]);
                                    File file = fileArrListFiles2[length];
                                    file.renameTo(this.f39146b.f(file));
                                }
                            } else {
                                i = -11;
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (IOException | Exception unused3) {
                        i = -13;
                    }
                    numValueOf = Integer.valueOf(i);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th7) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th8) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                    }
                }
                throw th7;
            }
        } catch (Exception unused4) {
            return -13;
        }
    }
}

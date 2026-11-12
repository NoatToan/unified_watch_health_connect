package defpackage;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class bgs {
    public static final pbt g = new pbt("ExtractChunkTaskHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4196a = new byte[8192];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tbs f4197b;
    public final ihs c;
    public final xns d;
    public final i7s e;
    public final i7s f;

    public bgs(tbs tbsVar, i7s i7sVar, i7s i7sVar2, ihs ihsVar, xns xnsVar) {
        this.f4197b = tbsVar;
        this.e = i7sVar;
        this.f = i7sVar2;
        this.c = ihsVar;
        this.d = xnsVar;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    public final void a(xfs xfsVar) {
        InputStream sequenceInputStream;
        ups upsVarB;
        File fileC;
        long length;
        int iMin;
        int iMax;
        long j;
        tbs tbsVar = this.f4197b;
        String str = xfsVar.f26969b;
        int i = xfsVar.c;
        long j2 = xfsVar.d;
        String str2 = xfsVar.f;
        gps gpsVar = new gps(tbsVar, str, i, j2, str2);
        File fileA = tbsVar.A(str, i, j2, str2);
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        try {
            InputStream inputStream = xfsVar.l;
            InputStream gZIPInputStream = xfsVar.g != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                if (xfsVar.h > 0) {
                    eps epsVarB = gpsVar.b();
                    int iB = epsVarB.b();
                    int i2 = xfsVar.h;
                    if (iB != i2 - 1) {
                        throw new ugs(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i2), Integer.valueOf(epsVarB.b())), xfsVar.f26968a);
                    }
                    int iA = epsVarB.a();
                    if (iA == 1) {
                        g.a("Resuming zip entry from last chunk during file %s.", epsVarB.e());
                        File file = new File(epsVarB.e());
                        if (!file.exists()) {
                            throw new ugs("Partial file specified in checkpoint does not exist. Corrupt directory.", xfsVar.f26968a);
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.seek(epsVarB.c());
                        long jD = epsVarB.d();
                        while (true) {
                            iMin = (int) Math.min(jD, 8192L);
                            iMax = Math.max(gZIPInputStream.read(this.f4196a, 0, iMin), 0);
                            if (iMax > 0) {
                                randomAccessFile.write(this.f4196a, 0, iMax);
                            }
                            j = jD - ((long) iMax);
                            if (j <= 0 || iMax <= 0) {
                                break;
                                break;
                            }
                            jD = j;
                        }
                        long length2 = randomAccessFile.length();
                        randomAccessFile.close();
                        if (iMax != iMin) {
                            g.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                            gpsVar.g(file.getCanonicalPath(), length2, j, xfsVar.h);
                        } else {
                            sequenceInputStream = gZIPInputStream;
                        }
                    } else if (iA == 2) {
                        g.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                        File fileY = this.f4197b.y(xfsVar.f26969b, xfsVar.c, xfsVar.d, xfsVar.f);
                        if (!fileY.exists()) {
                            throw new ugs("Checkpoint extension file not found.", xfsVar.f26968a);
                        }
                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileY), gZIPInputStream);
                    } else {
                        if (iA != 3) {
                            throw new ugs(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(epsVarB.a())), xfsVar.f26968a);
                        }
                        g.a("Resuming central directory from last chunk.", new Object[0]);
                        gpsVar.d(gZIPInputStream, epsVarB.c());
                        if (!xfsVar.a()) {
                            throw new ugs("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", xfsVar.f26968a);
                        }
                    }
                    sequenceInputStream = null;
                } else {
                    sequenceInputStream = gZIPInputStream;
                }
                if (sequenceInputStream != null) {
                    pds pdsVar = new pds(sequenceInputStream);
                    File fileB = b(xfsVar);
                    do {
                        upsVarB = pdsVar.b();
                        if (!upsVarB.e() && !pdsVar.c()) {
                            if (!upsVarB.h() || upsVarB.g()) {
                                gpsVar.k(upsVarB.f(), pdsVar);
                            } else {
                                gpsVar.j(upsVarB.f());
                                File file2 = new File(fileB, upsVarB.c());
                                file2.getParentFile().mkdirs();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                int i3 = pdsVar.read(this.f4196a, 0, 8192);
                                while (i3 > 0) {
                                    fileOutputStream.write(this.f4196a, 0, i3);
                                    i3 = pdsVar.read(this.f4196a, 0, 8192);
                                }
                                fileOutputStream.close();
                            }
                        }
                        if (pdsVar.d()) {
                            break;
                        }
                    } while (!pdsVar.c());
                    if (pdsVar.c()) {
                        g.a("Writing central directory metadata.", new Object[0]);
                        gpsVar.k(upsVarB.f(), sequenceInputStream);
                    }
                    if (!xfsVar.a()) {
                        if (upsVarB.e()) {
                            g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            gpsVar.h(upsVarB.f(), xfsVar.h);
                        } else if (pdsVar.c()) {
                            g.a("Writing slice checkpoint for central directory.", new Object[0]);
                            gpsVar.f(xfsVar.h);
                        } else {
                            if (upsVarB.a() == 0) {
                                g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileC = new File(b(xfsVar), upsVarB.c());
                                length = upsVarB.b() - pdsVar.a();
                                if (fileC.length() != length) {
                                    throw new ugs("Partial file is of unexpected size.");
                                }
                            } else {
                                g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileC = gpsVar.c();
                                length = fileC.length();
                            }
                            gpsVar.g(fileC.getCanonicalPath(), length, pdsVar.a(), xfsVar.h);
                        }
                    }
                }
                gZIPInputStream.close();
                if (xfsVar.a()) {
                    try {
                        gpsVar.i(xfsVar.h);
                    } catch (IOException e) {
                        g.b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                        throw new ugs("Writing extraction finished checkpoint failed.", e, xfsVar.f26968a);
                    }
                }
                g.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(xfsVar.h), xfsVar.f, xfsVar.f26969b, Integer.valueOf(xfsVar.f26968a));
                ((vgt) this.e.a()).f(xfsVar.f26968a, xfsVar.f26969b, xfsVar.f, xfsVar.h);
                try {
                    xfsVar.l.close();
                } catch (IOException unused) {
                    g.e("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(xfsVar.h), xfsVar.f, xfsVar.f26969b);
                }
                if (xfsVar.f39086k == 3) {
                    was wasVar = (was) this.f.a();
                    String str3 = xfsVar.f26969b;
                    long j3 = xfsVar.j;
                    wasVar.h(AssetPackState.a(str3, 3, 0, j3, j3, this.c.b(str3, xfsVar), 1, xfsVar.e, this.d.a(xfsVar.f26969b)));
                }
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            g.b("IOException during extraction %s.", e2.getMessage());
            throw new ugs(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(xfsVar.h), xfsVar.f, xfsVar.f26969b, Integer.valueOf(xfsVar.f26968a)), e2, xfsVar.f26968a);
        }
    }

    public final File b(xfs xfsVar) {
        File fileB = this.f4197b.B(xfsVar.f26969b, xfsVar.c, xfsVar.d, xfsVar.f);
        if (!fileB.exists()) {
            fileB.mkdirs();
        }
        return fileB;
    }
}

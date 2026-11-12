package com.google.android.play.core.splitinstall.internal;

import am.j;
import android.util.Pair;
import com.garmin.proto.generated.a;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.lang3.e;
import r1.q2;
import tn.k;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzi {
    public static X509Certificate[][] zza(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        try {
            Pair pairZzc = zzj.zzc(randomAccessFile2);
            try {
                if (pairZzc == null) {
                    throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
                long jLongValue = ((Long) pairZzc.second).longValue();
                long j8 = jLongValue - 20;
                if (j8 >= 0) {
                    randomAccessFile2.seek(j8);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                long jZza = zzj.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new zzf("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (zzj.zzb(byteBuffer) + jZza != jLongValue) {
                    throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jZza - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzf("No APK Signing Block before ZIP Central Directory");
                }
                long j14 = byteBufferAllocate.getLong(0);
                if (j14 < byteBufferAllocate.capacity() || j14 > 2147483639) {
                    throw new zzf("APK Signing Block size out of range: " + j14);
                }
                int i14 = (int) (8 + j14);
                long j15 = jZza - ((long) i14);
                if (j15 < 0) {
                    throw new zzf("APK Signing Block offset out of range: " + j15);
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i14);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j15);
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                randomAccessFile = randomAccessFile2;
                long j16 = byteBufferAllocate2.getLong(0);
                if (j16 != j14) {
                    throw new zzf("APK Signing Block sizes in header and footer do not match: " + j16 + " vs " + j14);
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j15));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                if (iCapacity < 8) {
                    throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i15 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i15++;
                        if (byteBufferSlice.remaining() < 8) {
                            throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i15);
                        }
                        long j17 = byteBufferSlice.getLong();
                        if (j17 < 4 || j17 > 2147483647L) {
                            throw new zzf("APK Signing Block entry #" + i15 + " size out of range: " + j17);
                        }
                        int i16 = (int) j17;
                        int iPosition2 = byteBufferSlice.position() + i16;
                        if (i16 > byteBufferSlice.remaining()) {
                            throw new zzf("APK Signing Block entry #" + i15 + " size out of range: " + i16 + ", available: " + byteBufferSlice.remaining());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new zze(zze(byteBufferSlice, i16 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrZzl;
                        }
                        long j18 = jLongValue2;
                        long j19 = jZza;
                        long j24 = jLongValue;
                        byteBufferSlice.position(iPosition2);
                        jLongValue = j24;
                        jZza = j19;
                        jLongValue2 = j18;
                    }
                    throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th3) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static int zzb(int i14) {
        if (i14 == 1) {
            return 32;
        }
        if (i14 == 2) {
            return 64;
        }
        h.s(j.h(i14, "Unknown content digest algorthm: "));
        return 0;
    }

    private static int zzc(int i14) {
        if (i14 == 513) {
            return 1;
        }
        if (i14 == 514) {
            return 2;
        }
        if (i14 == 769) {
            return 1;
        }
        switch (i14) {
            case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                h.s("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i14))));
                return 0;
        }
    }

    private static String zzd(int i14) {
        if (i14 == 1) {
            return MessageDigestAlgorithms.SHA_256;
        }
        if (i14 == 2) {
            return MessageDigestAlgorithms.SHA_512;
        }
        h.s(j.h(i14, "Unknown content digest algorthm: "));
        return null;
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i14) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i15 = i14 + iPosition;
        if (i15 < iPosition || i15 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i15);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i15);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            h.C(j.h(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
            return null;
        }
        int i14 = byteBuffer.getInt();
        if (i14 < 0) {
            h.s("Negative length");
            return null;
        }
        if (i14 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i14);
        }
        h.C(k.e(i14, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
        return null;
    }

    private static void zzg(int i14, byte[] bArr, int i15) {
        bArr[1] = (byte) (i14 & 255);
        bArr[2] = (byte) ((i14 >>> 8) & 255);
        bArr[3] = (byte) ((i14 >>> 16) & 255);
        bArr[4] = (byte) (i14 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j8, long j14, long j15, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            a.h("No digests provided");
            return;
        }
        zzc zzcVar = new zzc(fileChannel, 0L, j8);
        zzc zzcVar2 = new zzc(fileChannel, j14, j15 - j14);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzj.zzd(byteBufferDuplicate, j8);
        zza zzaVar = new zza(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            iArr[i14] = ((Integer) it.next()).intValue();
            i14++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
            for (int i15 = 0; i15 < size; i15++) {
                int i16 = iArr[i15];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i16)), bArrZzk[i15])) {
                    a.h(zzd(i16).concat(" digest of contents did not verify"));
                    return;
                }
            }
        } catch (DigestException e4) {
            throw new SecurityException("Failed to compute digest(s) of contents", e4);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i14 = byteBuffer.getInt();
        if (i14 < 0) {
            h.C("Negative length");
            return null;
        }
        if (i14 > byteBuffer.remaining()) {
            h.C(k.e(i14, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
            return null;
        }
        byte[] bArr = new byte[i14];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i14 = -1;
        int i15 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i15++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i16 = byteBufferZzf3.getInt();
                arrayList.add(Integer.valueOf(i16));
                if (i16 != 513 && i16 != 514 && i16 != 769) {
                    switch (i16) {
                        case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i14 != -1) {
                    int iZzc = zzc(i16);
                    int iZzc2 = zzc(i14);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i14 = i16;
            } catch (IOException e4) {
                e = e4;
                throw new SecurityException(j.h(i15, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e14) {
                e = e14;
                throw new SecurityException(j.h(i15, "Failed to parse signature record #"), e);
            }
        }
        if (i14 == -1) {
            if (i15 == 0) {
                a.h("No signatures found");
                return null;
            }
            a.h("No supported signatures found");
            return null;
        }
        if (i14 == 513 || i14 == 514) {
            str = "EC";
        } else if (i14 != 769) {
            switch (i14) {
                case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    h.s("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i14))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i14 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i14 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i14 != 769) {
            switch (i14) {
                case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec(MessageDigestAlgorithms.SHA_256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec(MessageDigestAlgorithms.SHA_512, "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    h.s("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i14))));
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                a.h(String.valueOf(str2).concat(" signature did not verify"));
                return null;
            }
            byteBufferZzf.clear();
            ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            ArrayList arrayList2 = new ArrayList();
            int i17 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i17++;
                try {
                    ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i18 = byteBufferZzf5.getInt();
                    arrayList2.add(Integer.valueOf(i18));
                    if (i18 == i14) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (IOException e15) {
                    e = e15;
                    h.u(j.h(i17, "Failed to parse digest record #"), e);
                    return null;
                } catch (BufferUnderflowException e16) {
                    e = e16;
                    h.u(j.h(i17, "Failed to parse digest record #"), e);
                    return null;
                }
            }
            if (!arrayList.equals(arrayList2)) {
                a.h("Signature algorithms don't match between digests and signatures records");
                return null;
            }
            int iZzc3 = zzc(i14);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                a.h(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
                return null;
            }
            ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            ArrayList arrayList3 = new ArrayList();
            int i19 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i19++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                } catch (CertificateException e17) {
                    throw new SecurityException(j.h(i19, "Failed to decode certificate #"), e17);
                }
            }
            if (arrayList3.isEmpty()) {
                a.h("No certificates listed");
                return null;
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            a.h("Public key mismatch between certificate and signature record");
            return null;
        } catch (InvalidAlgorithmParameterException e18) {
            e = e18;
            throw new SecurityException(j.m("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e19) {
            e = e19;
            throw new SecurityException(j.m("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e24) {
            e = e24;
            throw new SecurityException(j.m("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e25) {
            e = e25;
            throw new SecurityException(j.m("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e26) {
            e = e26;
            throw new SecurityException(j.m("Failed to verify ", str2, " signature"), e);
        }
    }

    private static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) throws DigestException {
        long j8;
        int i14;
        int length;
        char c14;
        int i15;
        String str;
        int i16 = 0;
        int i17 = 0;
        long jZza = 0;
        while (true) {
            j8 = 1048576;
            i14 = 3;
            if (i17 >= 3) {
                break;
            }
            jZza += (zzbVarArr[i17].zza() + 1048575) / 1048576;
            i17++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(e.e(jZza, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i18 = 0;
        while (true) {
            length = iArr.length;
            c14 = 5;
            i15 = 1;
            if (i18 >= length) {
                break;
            }
            int i19 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i18]) * i19) + 5];
            bArr2[0] = 90;
            zzg(i19, bArr2, 1);
            bArr[i18] = bArr2;
            i18++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i24 = 0;
        while (true) {
            str = " digest not supported";
            if (i24 >= iArr.length) {
                break;
            }
            String strZzd = zzd(iArr[i24]);
            try {
                messageDigestArr[i24] = MessageDigest.getInstance(strZzd);
                i24++;
            } catch (NoSuchAlgorithmException e4) {
                q2.v(strZzd.concat(" digest not supported"), e4);
                return null;
            }
        }
        int i25 = 0;
        int i26 = 0;
        while (i25 < i14) {
            zzb zzbVar = zzbVarArr[i25];
            int i27 = i25;
            long jZza2 = zzbVar.zza();
            byte[][] bArr4 = bArr;
            long j14 = 0;
            while (jZza2 > 0) {
                int i28 = i26;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j8);
                zzg(iMin, bArr3, i15);
                for (int i29 = 0; i29 < length; i29++) {
                    messageDigestArr[i29].update(bArr3);
                }
                try {
                    zzbVar.zzb(messageDigestArr, j14, iMin);
                    int i30 = 0;
                    while (i30 < iArr.length) {
                        int i34 = iArr[i30];
                        byte[] bArr5 = bArr4[i30];
                        int iZzb = zzb(i34);
                        char c15 = c14;
                        MessageDigest messageDigest = messageDigestArr[i30];
                        int iDigest = messageDigest.digest(bArr5, (i28 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i30++;
                        c14 = c15;
                    }
                    long j15 = iMin;
                    j14 += j15;
                    jZza2 -= j15;
                    i26 = i28 + 1;
                    str = str2;
                    j8 = 1048576;
                    i15 = 1;
                } catch (IOException e14) {
                    throw new DigestException(k.e(i28, i16, "Failed to digest chunk #", " of section #"), e14);
                }
            }
            i16++;
            i25 = i27 + 1;
            bArr = bArr4;
            j8 = 1048576;
            i14 = 3;
            i15 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i35 = 0; i35 < iArr.length; i35++) {
            int i36 = iArr[i35];
            byte[] bArr8 = bArr6[i35];
            String strZzd2 = zzd(i36);
            try {
                bArr7[i35] = MessageDigest.getInstance(strZzd2).digest(bArr8);
            } catch (NoSuchAlgorithmException e15) {
                q2.v(strZzd2.concat(str3), e15);
                return null;
            }
        }
        return bArr7;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzf = zzf(zzeVar.zza);
                int i14 = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i14++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e4) {
                        throw new SecurityException(e0.f(i14, "Failed to parse/verify signer #", " block"), e4);
                    }
                }
                if (i14 <= 0) {
                    a.h("No signers found");
                    return null;
                }
                if (map.isEmpty()) {
                    a.h("No content digests found");
                    return null;
                }
                zzh(map, fileChannel, zzeVar.zzb, zzeVar.zzc, zzeVar.zzd, zzeVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e14) {
                throw new SecurityException("Failed to read list of signers", e14);
            }
        } catch (CertificateException e15) {
            q2.v("Failed to obtain X.509 CertificateFactory", e15);
            return null;
        }
    }
}

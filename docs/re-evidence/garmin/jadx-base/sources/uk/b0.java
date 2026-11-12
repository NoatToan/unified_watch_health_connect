package uk;

import androidx.media3.common.PlaybackException;
import com.garmin.io.cobs.CobsDecodeException;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f171630a;

    public b0(a0 a0Var) {
        this.f171630a = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0364  */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int iU;
        h hVar;
        byte b14;
        while (true) {
            a0 a0Var = this.f171630a;
            AtomicBoolean atomicBoolean = a0Var.f171614c;
            it2.d dVar = a0Var.f171613b;
            if (!atomicBoolean.get()) {
                return;
            }
            Logger logger = a0Var.f171612a;
            try {
                byte[] bArrA = dVar.a();
                if (bArrA.length < 6) {
                    logger.error("Failed to read message: not enough bytes");
                    k.a aVar = a0Var.f171616e;
                    if (aVar == null) {
                        p005kotlin.jvm.internal.s.m("delegate");
                        throw null;
                    }
                    aVar.a(d.INVALID_LENGTH);
                } else {
                    int iU2 = o72.t.U(0, bArrA);
                    if (bArrA.length < iU2) {
                        logger.error("Failed to read message: invalid length in header");
                        k.a aVar2 = a0Var.f171616e;
                        if (aVar2 == null) {
                            p005kotlin.jvm.internal.s.m("delegate");
                            throw null;
                        }
                        aVar2.a(d.INVALID_LENGTH);
                    } else {
                        int i14 = iU2 - 2;
                        if (o72.t.U(i14, bArrA) != o72.t.r(i14, bArrA)) {
                            logger.error("Failed to read message: CRC check failed");
                            k.a aVar3 = a0Var.f171616e;
                            if (aVar3 == null) {
                                p005kotlin.jvm.internal.s.m("delegate");
                                throw null;
                            }
                            aVar3.a(d.CRC_ERROR);
                        } else {
                            if ((bArrA[3] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                                iU = (bArrA[2] & UnsignedBytes.MAX_VALUE) + 5000;
                                new j(Integer.valueOf(bArrA[3] & Ascii.US));
                            } else {
                                iU = o72.t.U(2, bArrA);
                                new j(null);
                            }
                            if (iU != 5000) {
                                byte[] bArrK = p13.s.k(4, i14, bArrA);
                                logger.info("Received " + iU + " request");
                                k.a aVar4 = a0Var.f171616e;
                                if (aVar4 == null) {
                                    p005kotlin.jvm.internal.s.m("delegate");
                                    throw null;
                                }
                                k kVar = k.this;
                                if (iU == 5007) {
                                    k.b bVar = k.f171687m;
                                    kVar.getClass();
                                    Byte bF = p13.u.F(bArrK);
                                    kVar.f171692e = (bF == null || bF.byteValue() != 3) ? (byte) 0 : (byte) 3;
                                    u53.d dVar2 = kVar.f171688a;
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(dVar2, x53.b.f189152a, null, new s(kVar, null), 2);
                                } else if (iU == 5008) {
                                    k.b bVar2 = k.f171687m;
                                    kVar.getClass();
                                    int iU3 = o72.t.U(0, bArrK);
                                    int i15 = bArrK[2] & UnsignedBytes.MAX_VALUE;
                                    u53.d dVar3 = kVar.f171688a;
                                    x53.c cVar2 = s0.f129406a;
                                    ge1.b.T(dVar3, x53.b.f189152a, null, new v(kVar, iU3, 0, 1, i15, null), 2);
                                } else if (iU == 5026) {
                                    k.b bVar3 = k.f171687m;
                                    kVar.getClass();
                                    if (h0.R(p13.u.m0(new Byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5}), p13.u.F(bArrK))) {
                                        kVar.f171697j.f();
                                    }
                                    u53.d dVar4 = kVar.f171688a;
                                    x53.c cVar3 = s0.f129406a;
                                    ge1.b.T(dVar4, x53.b.f189152a, null, new r(kVar, null), 2);
                                } else if (iU == 5050) {
                                    u53.d dVar5 = kVar.f171688a;
                                    x53.c cVar4 = s0.f129406a;
                                    ge1.b.T(dVar5, x53.b.f189152a, null, new p(kVar, null), 2);
                                } else if (iU == 5030) {
                                    tk.k kVar2 = kVar.f171697j;
                                    Byte bF2 = p13.u.F(bArrK);
                                    Integer numValueOf = bF2 != null ? Integer.valueOf(bF2.byteValue()) : null;
                                    if (numValueOf != null) {
                                        if (numValueOf.intValue() == 0) {
                                            kVar2.j(i.FINISHED_WITH_SUCCESS);
                                        } else if (numValueOf.intValue() == 1) {
                                            kVar2.j(i.FINISHED_WITH_FAILURE);
                                        } else if (numValueOf.intValue() == 2) {
                                            kVar2.f165208b.a(new tk.d(kVar2));
                                        } else {
                                            b14 = (numValueOf.intValue() == 3 || numValueOf.intValue() == 4 || numValueOf.intValue() == 5 || numValueOf.intValue() == 6 || numValueOf.intValue() == 7) ? (byte) 0 : (byte) 1;
                                        }
                                    }
                                    u53.d dVar6 = kVar.f171688a;
                                    x53.c cVar5 = s0.f129406a;
                                    ge1.b.T(dVar6, x53.b.f189152a, null, new x(kVar, b14, null), 2);
                                } else if (iU != 5031) {
                                    switch (iU) {
                                        case 5002:
                                            k.b bVar4 = k.f171687m;
                                            kVar.getClass();
                                            int iU4 = o72.t.U(0, bArrK);
                                            u53.d dVar7 = kVar.f171688a;
                                            x53.c cVar6 = s0.f129406a;
                                            ge1.b.T(dVar7, x53.b.f189152a, null, new t(kVar, iU4, null), 2);
                                            break;
                                        case PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED /* 5003 */:
                                            k.b bVar5 = k.f171687m;
                                            kVar.getClass();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            if (kVar.f171694g == null) {
                                                byteArrayOutputStream.write(5);
                                            } else {
                                                byteArrayOutputStream.write(0);
                                                o72.t.e0(byteArrayOutputStream, 0);
                                                o72.t.e0(byteArrayOutputStream, Integer.MAX_VALUE);
                                                o72.t.d0(byteArrayOutputStream, 0);
                                            }
                                            u53.d dVar8 = kVar.f171688a;
                                            x53.c cVar7 = s0.f129406a;
                                            ge1.b.T(dVar8, x53.b.f189152a, null, new z(kVar, byteArrayOutputStream, null), 2);
                                            break;
                                        case PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED /* 5004 */:
                                            u53.d dVar9 = kVar.f171688a;
                                            x53.c cVar8 = s0.f129406a;
                                            ge1.b.T(dVar9, x53.b.f189152a, null, new u(kVar, bArrK, null), 2);
                                            break;
                                        case 5005:
                                            k.b bVar6 = k.f171687m;
                                            kVar.getClass();
                                            byte b15 = (byte) (bArrK[4] & UnsignedBytes.MAX_VALUE);
                                            byte b16 = (byte) (bArrK[5] & UnsignedBytes.MAX_VALUE);
                                            int iU5 = o72.t.U(6, bArrK);
                                            kVar.f171694g = new k.c(b15, b16);
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                            byteArrayOutputStream2.write(0);
                                            o72.t.d0(byteArrayOutputStream2, 101);
                                            byteArrayOutputStream2.write(b15);
                                            byteArrayOutputStream2.write(b16);
                                            o72.t.d0(byteArrayOutputStream2, iU5);
                                            u53.d dVar10 = kVar.f171688a;
                                            x53.c cVar9 = s0.f129406a;
                                            ge1.b.T(dVar10, x53.b.f189152a, null, new q(kVar, byteArrayOutputStream2, null), 2);
                                            break;
                                        default:
                                            kVar.f171699l.info("Received unexpected message type " + iU);
                                            u53.d dVar11 = kVar.f171688a;
                                            x53.c cVar10 = s0.f129406a;
                                            ge1.b.T(dVar11, x53.b.f189152a, null, new y(kVar, iU, null), 2);
                                            break;
                                    }
                                } else {
                                    k.b bVar7 = k.f171687m;
                                    kVar.getClass();
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    byteArrayOutputStream3.write(2);
                                    byteArrayOutputStream3.write(128);
                                    byteArrayOutputStream3.write(4);
                                    Charset charset = d53.c.f57666b;
                                    byte[] bytes = "FIT_TYPE_4".getBytes(charset);
                                    bytes.getClass();
                                    byteArrayOutputStream3.write(bytes.length);
                                    byteArrayOutputStream3.write(bytes);
                                    byteArrayOutputStream3.write(128);
                                    byteArrayOutputStream3.write(32);
                                    byte[] bytes2 = "FIT_TYPE_32".getBytes(charset);
                                    bytes2.getClass();
                                    byteArrayOutputStream3.write(bytes2.length);
                                    byteArrayOutputStream3.write(bytes2);
                                    u53.d dVar12 = kVar.f171688a;
                                    x53.c cVar11 = s0.f129406a;
                                    ge1.b.T(dVar12, x53.b.f189152a, null, new w(kVar, byteArrayOutputStream3, null), 2);
                                }
                            } else if (bArrA.length < 9) {
                                logger.error("Failed to decode response: not enough bytes");
                                k.a aVar5 = a0Var.f171616e;
                                if (aVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("delegate");
                                    throw null;
                                }
                                aVar5.a(d.INVALID_LENGTH);
                            } else {
                                int iU6 = o72.t.U(4, bArrA);
                                h.a aVar6 = h.f171680i;
                                byte b17 = bArrA[6];
                                aVar6.getClass();
                                if (b17 == 0) {
                                    hVar = h.ACK;
                                } else if (b17 == 1) {
                                    hVar = h.NAK;
                                } else if (b17 == 2) {
                                    hVar = h.UNKNOWN_OR_NOT_SUPPORTED;
                                } else if (b17 == 3) {
                                    hVar = h.COBS_DECODER_ERROR;
                                } else if (b17 != 4) {
                                    hVar = b17 != 5 ? h.NAK : h.LENGTH_ERROR;
                                } else {
                                    hVar = h.CRC_ERROR;
                                }
                                byte[] bArrK2 = p13.s.k(7, i14, bArrA);
                                u62.z.i("Received response for ", iU6, logger);
                                k.a aVar7 = a0Var.f171616e;
                                if (aVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("delegate");
                                    throw null;
                                }
                                k kVar3 = k.this;
                                hVar.getClass();
                                if (iU6 == 5004) {
                                    b bVar8 = kVar3.f171695h;
                                    if (bVar8 != null) {
                                        Logger logger2 = bVar8.f171624h;
                                        Byte bF3 = p13.u.F(bArrK2);
                                        byte bByteValue = bF3 != null ? bF3.byteValue() : (byte) 2;
                                        if (bByteValue != 0) {
                                            logger2.warn("File transfer failed: status=" + ((int) bByteValue));
                                            t.a aVar8 = bVar8.f171617a;
                                            if (aVar8 == null) {
                                                p005kotlin.jvm.internal.s.m("completion");
                                                throw null;
                                            }
                                            aVar8.invoke();
                                        } else if (((int) o72.t.V(1, bArrK2)) == bVar8.f171620d.length) {
                                            logger2.debug("File chunking complete");
                                            t.a aVar9 = bVar8.f171617a;
                                            if (aVar9 == null) {
                                                p005kotlin.jvm.internal.s.m("completion");
                                                throw null;
                                            }
                                            aVar9.invoke();
                                        } else {
                                            bVar8.a();
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (iU6 == 5024) {
                                    c cVar12 = kVar3.f171693f;
                                    cVar12.getClass();
                                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    byteArrayOutputStream4.write(2);
                                    o72.t.d0(byteArrayOutputStream4, 4868);
                                    a aVar10 = cVar12.f171633c;
                                    byte[] byteArray = byteArrayOutputStream4.toByteArray();
                                    byteArray.getClass();
                                    aVar10.a(5027, byteArray);
                                } else if (iU6 != 5027) {
                                    kVar3.f171699l.info("Received response for message type " + iU6);
                                } else {
                                    c cVar13 = kVar3.f171693f;
                                    cVar13.getClass();
                                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                    byteArrayOutputStream5.write(4);
                                    o72.t.e0(byteArrayOutputStream5, 536870920L);
                                    a aVar11 = cVar13.f171633c;
                                    byte[] byteArray2 = byteArrayOutputStream5.toByteArray();
                                    byteArray2.getClass();
                                    aVar11.a(5050, byteArray2);
                                }
                            }
                        }
                    }
                }
            } catch (CobsDecodeException e4) {
                logger.error("Failed to decode message: COBS decode failure", (Throwable) e4);
                k.a aVar12 = a0Var.f171616e;
                if (aVar12 == null) {
                    p005kotlin.jvm.internal.s.m("delegate");
                    throw null;
                }
                aVar12.a(d.COBS_DECODE_ERROR);
            } catch (IOException unused) {
                if (a0Var.f171614c.compareAndSet(true, false)) {
                    Thread thread = a0Var.f171615d;
                    if (thread == null) {
                        p005kotlin.jvm.internal.s.m("thread");
                        throw null;
                    }
                    thread.interrupt();
                    dVar.close();
                    k.a aVar13 = a0Var.f171616e;
                    if (aVar13 == null) {
                        p005kotlin.jvm.internal.s.m("delegate");
                        throw null;
                    }
                    k kVar4 = k.this;
                    sk.h hVar2 = kVar4.f171698k.f159507a;
                    String str = kVar4.f171697j.f165236a;
                    hVar2.f159545g = true;
                    CountDownLatch countDownLatch = hVar2.f159544f;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                    hVar2.f159540b.post(new sk.k(hVar2, str));
                } else {
                    continue;
                }
            }
        }
    }
}

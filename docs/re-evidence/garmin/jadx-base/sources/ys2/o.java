package ys2;

import androidx.media3.common.PlaybackException;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.gfdi.file.FileException;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import o13.r;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import rs2.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lys2/o;", "", "Lrs2/v;", "messenger", "Lys2/e;", "fileData", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "identifier", "", "pathOnDevice", "", "bigFileIdentifier", "", "useCompression", "Lkotlin/Function2;", "", "progress", "<init>", "(Lrs2/v;Lys2/e;I[BLjava/lang/String;JZLe23/p;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f199244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f199245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f199247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f199248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f199249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.p<Integer, Integer, Unit> f199250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger f199251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u53.d f199252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f199253j;

    /* JADX WARN: Multi-variable type inference failed */
    public o(v vVar, e eVar, int i14, byte[] bArr, String str, long j8, boolean z14, e23.p<? super Integer, ? super Integer, Unit> pVar) {
        vVar.getClass();
        eVar.getClass();
        bArr.getClass();
        this.f199244a = vVar;
        this.f199245b = eVar;
        this.f199246c = i14;
        this.f199247d = bArr;
        this.f199248e = str;
        this.f199249f = j8;
        this.f199250g = pVar;
        rs2.d.f154380a.getClass();
        this.f199251h = LoggerFactory.getLogger(rs2.d.a("FileSenderTask", -1L, this, null));
        this.f199252i = zl.a.e("FileSenderTask", s0.f129406a.plus(ge1.b.h()));
        this.f199253j = z14 ? 15 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r8 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) throws FileException {
        i iVar;
        ByteArrayOutputStream byteArrayOutputStream;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f199227d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f199227d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f199225b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f199227d;
        try {
            if (i15 == 0) {
                r.b(objB);
                byteArrayOutputStream = new ByteArrayOutputStream();
                x53.c cVar2 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                j jVar = new j(byteArrayOutputStream, this, null);
                iVar.f199224a = byteArrayOutputStream;
                iVar.f199227d = 1;
                if (ge1.b.e0(bVar, jVar, iVar) != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                byteArrayOutputStream = iVar.f199224a;
                r.b(objB);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            byte[] bArr = (byte[]) objB;
            Byte bF = u.F(bArr);
            if (bF == null) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr.length, "Create file response is too short: "));
            }
            byte bByteValue = bF.byteValue();
            if (bByteValue == 0 || bByteValue == 1) {
                if (bArr.length >= 3) {
                    return new Integer(jg.b.K(1, bArr));
                }
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr.length, "Create file response is too short: "));
            }
            if (bByteValue == 2) {
                throw new FileException(FileException.a.NOT_ENOUGH_SPACE);
            }
            if (bByteValue == 3) {
                throw new FileException(FileException.a.NOT_SUPPORTED);
            }
            if (bByteValue == 4) {
                throw new FileException(FileException.a.NO_SLOTS_FOR_TYPE);
            }
            if (bByteValue != 5) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bByteValue, "Invalid create file response status: "));
            }
            throw new FileException(FileException.a.NOT_ENOUGH_SPACE_FOR_FILE_TYPE);
            v vVar = this.f199244a;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            iVar.f199224a = null;
            iVar.f199227d = 2;
            objB = vVar.b(5005, byteArray, iVar);
        } catch (Exception e4) {
            throw new FileException(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f A[Catch: ResponseStatusException -> 0x0031, FileException -> 0x0034, CancellationException -> 0x00a0, TRY_ENTER, TryCatch #1 {FileException -> 0x0034, blocks: (B:12:0x002b, B:25:0x0060, B:22:0x004f), top: B:39:0x002b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[Catch: CancellationException -> 0x00a0, TryCatch #0 {CancellationException -> 0x00a0, blocks: (B:12:0x002b, B:25:0x0060, B:26:0x0062, B:28:0x0078, B:29:0x007f, B:22:0x004f, B:30:0x0089, B:31:0x0096, B:32:0x0097, B:33:0x009f), top: B:38:0x0025, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005d -> B:25:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(int r15, int r16, boolean r17, ys2.g r18, v13.c r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof ys2.k
            if (r1 == 0) goto L15
            r1 = r0
            ys2.k r1 = (ys2.k) r1
            int r2 = r1.f199233d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f199233d = r2
            goto L1a
        L15:
            ys2.k r1 = new ys2.k
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.f199231b
            u13.a r2 = u13.a.COROUTINE_SUSPENDED
            int r3 = r1.f199233d
            r4 = 3
            u53.d r5 = r14.f199252i
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L3e
            if (r3 != r7) goto L37
            ys2.g r15 = r1.f199230a
            o13.r.b(r0)     // Catch: com.garmin.gfdi.ResponseStatusException -> L31 com.garmin.gfdi.file.FileException -> L34 java.util.concurrent.CancellationException -> La0
            r8 = r15
            r13 = r1
            goto L60
        L31:
            r0 = move-exception
            r15 = r0
            goto L89
        L34:
            r0 = move-exception
            r15 = r0
            goto L97
        L37:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r15)
            r15 = 0
            return r15
        L3e:
            o13.r.b(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r15)
            r10 = r16
            r11 = r17
            r8 = r18
            r13 = r1
        L4d:
            if (r0 == 0) goto Lb0
            int r9 = r0.intValue()     // Catch: com.garmin.gfdi.ResponseStatusException -> L31 com.garmin.gfdi.file.FileException -> L34 java.util.concurrent.CancellationException -> La0
            e23.p<java.lang.Integer, java.lang.Integer, kotlin.Unit> r12 = r14.f199250g     // Catch: com.garmin.gfdi.ResponseStatusException -> L31 com.garmin.gfdi.file.FileException -> L34 java.util.concurrent.CancellationException -> La0
            r13.f199230a = r8     // Catch: com.garmin.gfdi.ResponseStatusException -> L31 com.garmin.gfdi.file.FileException -> L34 java.util.concurrent.CancellationException -> La0
            r13.f199233d = r7     // Catch: com.garmin.gfdi.ResponseStatusException -> L31 com.garmin.gfdi.file.FileException -> L34 java.util.concurrent.CancellationException -> La0
            java.io.Serializable r0 = r8.c(r9, r10, r11, r12, r13)     // Catch: com.garmin.gfdi.ResponseStatusException -> L31 com.garmin.gfdi.file.FileException -> L34 java.util.concurrent.CancellationException -> La0
            if (r0 != r2) goto L60
            return r2
        L60:
            o13.u r0 = (o13.u) r0     // Catch: com.garmin.gfdi.ResponseStatusException -> L31 com.garmin.gfdi.file.FileException -> L34 java.util.concurrent.CancellationException -> La0
            A r15 = r0.f128605a     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.util.concurrent.CancellationException -> La0
            B r1 = r0.f128606b     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.util.concurrent.CancellationException -> La0
            int r10 = r1.intValue()     // Catch: java.util.concurrent.CancellationException -> La0
            C r0 = r0.f128607c     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.util.concurrent.CancellationException -> La0
            boolean r11 = r0.booleanValue()     // Catch: java.util.concurrent.CancellationException -> La0
            if (r11 == 0) goto L7f
            org.slf4j.Logger r0 = r14.f199251h     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.String r1 = "sendFileChunk returned successfully but is still requesting restart flag"
            r0.warn(r1)     // Catch: java.util.concurrent.CancellationException -> La0
        L7f:
            ys2.l r0 = new ys2.l     // Catch: java.util.concurrent.CancellationException -> La0
            r0.<init>(r14, r15, r6)     // Catch: java.util.concurrent.CancellationException -> La0
            ge1.b.T(r5, r6, r6, r0, r4)     // Catch: java.util.concurrent.CancellationException -> La0
            r0 = r15
            goto L4d
        L89:
            ys2.h r0 = new ys2.h     // Catch: java.util.concurrent.CancellationException -> La0
            r0.<init>(r14, r6)     // Catch: java.util.concurrent.CancellationException -> La0
            ge1.b.T(r5, r6, r6, r0, r4)     // Catch: java.util.concurrent.CancellationException -> La0
            com.garmin.gfdi.file.FileException r0 = new com.garmin.gfdi.file.FileException     // Catch: java.util.concurrent.CancellationException -> La0
            r0.<init>(r15)     // Catch: java.util.concurrent.CancellationException -> La0
            throw r0     // Catch: java.util.concurrent.CancellationException -> La0
        L97:
            ys2.h r0 = new ys2.h     // Catch: java.util.concurrent.CancellationException -> La0
            r0.<init>(r14, r6)     // Catch: java.util.concurrent.CancellationException -> La0
            ge1.b.T(r5, r6, r6, r0, r4)     // Catch: java.util.concurrent.CancellationException -> La0
            throw r15     // Catch: java.util.concurrent.CancellationException -> La0
        La0:
            ys2.h r15 = new ys2.h
            r15.<init>(r14, r6)
            ge1.b.T(r5, r6, r6, r15, r4)
            com.garmin.gfdi.file.FileException r15 = new com.garmin.gfdi.file.FileException
            com.garmin.gfdi.file.FileException$a r0 = com.garmin.gfdi.file.FileException.a.CANCELLED_BY_APP
            r15.<init>(r0)
            throw r15
        Lb0:
            kotlin.Unit r15 = p005kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ys2.o.b(int, int, boolean, ys2.g, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if (r12 == r2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(v13.c cVar) throws Exception {
        m mVar;
        long jCurrentTimeMillis;
        long j8;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f199239d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f199239d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objC = mVar.f199237b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f199239d;
        Logger logger = this.f199251h;
        e eVar = this.f199245b;
        try {
            try {
                try {
                    if (i15 == 0) {
                        r.b(objC);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        mVar.f199236a = jCurrentTimeMillis;
                        mVar.f199239d = 1;
                        objC = a(mVar);
                        if (objC == obj) {
                        }
                        return obj;
                    }
                    if (i15 == 1) {
                        jCurrentTimeMillis = mVar.f199236a;
                        r.b(objC);
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r.b(objC);
                            eVar.close();
                            return objC;
                        }
                        j8 = mVar.f199236a;
                        r.b(objC);
                    }
                    int iIntValue = ((Number) objC).intValue();
                    logger.info("Success sending file to device. " + eVar.getSize() + " bytes sent.");
                    ws2.l lVar = new ws2.l((long) iIntValue, System.currentTimeMillis() - j8);
                    eVar.close();
                    return lVar;
                    int iIntValue2 = ((Number) objC).intValue();
                    mVar.f199236a = jCurrentTimeMillis;
                    mVar.f199239d = 2;
                    objC = d(iIntValue2, mVar);
                    if (objC == obj) {
                        return obj;
                    }
                    j8 = jCurrentTimeMillis;
                    int iIntValue3 = ((Number) objC).intValue();
                    logger.info("Success sending file to device. " + eVar.getSize() + " bytes sent.");
                    ws2.l lVar2 = new ws2.l((long) iIntValue3, System.currentTimeMillis() - j8);
                    eVar.close();
                    return lVar2;
                } catch (Exception e4) {
                    if (e4 instanceof FileException) {
                        throw e4;
                    }
                    throw new FileException(e4);
                }
            } catch (FileException e14) {
                if (e14.getReason() != FileException.a.COMPRESSION_ERROR) {
                    throw e14;
                }
                logger.error("Device failed to decompress data. Retry sendFile as uncompressed");
                eVar.b(0);
                this.f199253j = 0;
                mVar.f199239d = 3;
                objC = c(mVar);
            } catch (CancellationException e15) {
                throw new FileException(FileException.a.CANCELLED_BY_APP, e15);
            }
        } catch (Throwable th3) {
            eVar.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(int i14, v13.c cVar) throws FileException {
        n nVar;
        g pVar;
        int i15;
        g gVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i16 = nVar.f199243d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                nVar.f199243d = i16 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        n nVar2 = nVar;
        Object objB = nVar2.f199241b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = nVar2.f199243d;
        v vVar = this.f199244a;
        e eVar = this.f199245b;
        boolean z14 = true;
        try {
            if (i17 != 0) {
                if (i17 == 1) {
                    r.b(objB);
                } else {
                    if (i17 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gVar = nVar2.f199240a;
                    r.b(objB);
                }
                return new Integer(gVar.getF199188h());
            }
            r.b(objB);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            lg.d.P(byteArrayOutputStream, i14);
            lg.d.Q(byteArrayOutputStream, eVar.getSize());
            lg.d.Q(byteArrayOutputStream, 0);
            lg.d.P(byteArrayOutputStream, 0);
            int i18 = this.f199253j;
            if (i18 != 0) {
                byteArrayOutputStream.write(i18 & 255);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            nVar2.f199243d = 1;
            objB = vVar.b(PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED, byteArray, nVar2);
            if (objB == obj) {
            }
            return obj;
            byte[] bArr = (byte[]) objB;
            Byte bF = u.F(bArr);
            if (bF == null) {
                throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr.length, "Upload request response is too short "));
            }
            byte bByteValue = bF.byteValue();
            switch (bByteValue) {
                case 0:
                    if (bArr.length < 11) {
                        throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bArr.length, "Upload request response is too short "));
                    }
                    int iL = (int) jg.b.L(1, bArr);
                    int iL2 = (int) jg.b.L(5, bArr);
                    int iK = jg.b.K(9, bArr);
                    if (this.f199253j != 0) {
                        int i19 = bArr.length >= 12 ? bArr[11] & UnsignedBytes.MAX_VALUE : 0;
                        this.f199253j = i19;
                        if (i19 != 0) {
                            a.f199179i.getClass();
                            if (9 > i19 || i19 >= 16) {
                                this.f199251h.warn("Ignoring invalid windowBits " + this.f199253j);
                                this.f199253j = 0;
                            }
                        }
                    }
                    if (eVar.getSize() > iL2) {
                        throw new FileException(FileException.a.NOT_ENOUGH_SPACE);
                    }
                    if (this.f199253j != 0) {
                        pVar = new a(this.f199244a, this.f199245b, this.f199253j, 0, 8, null);
                    } else {
                        pVar = new p(vVar, eVar);
                    }
                    if (iL >= eVar.getSize()) {
                        iL = 0;
                        i15 = 0;
                    } else if (pVar.a(iL) != iK) {
                        eVar.b(0);
                        iL = 0;
                        i15 = 0;
                    } else {
                        z14 = false;
                        i15 = iK;
                    }
                    nVar2.f199240a = pVar;
                    nVar2.f199243d = 2;
                    g gVar2 = pVar;
                    if (b(iL, i15, z14, gVar2, nVar2) != obj) {
                        gVar = gVar2;
                        return new Integer(gVar.getF199188h());
                    }
                    return obj;
                case 1:
                    throw new FileException(FileException.a.FILE_INDEX_DOES_NOT_EXIST);
                case 2:
                    throw new FileException(FileException.a.FILE_INDEX_NOT_WRITABLE);
                case 3:
                    throw new FileException(FileException.a.NOT_ENOUGH_SPACE);
                case 4:
                    throw new FileException(FileException.a.INVALID_REQUEST);
                case 5:
                    throw new FileException(FileException.a.NOT_READY);
                case 6:
                    throw new FileException(FileException.a.CRC_MISMATCH);
                default:
                    throw new FileException(FileException.a.MALFORMED_GFDI_MESSAGE, am.j.h(bByteValue, "Invalid upload request status "));
            }
        } catch (Exception e4) {
            throw new FileException(e4);
        }
    }

    public /* synthetic */ o(v vVar, e eVar, int i14, byte[] bArr, String str, long j8, boolean z14, e23.p pVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(vVar, eVar, i14, bArr, str, j8, (i15 & 64) != 0 ? true : z14, (i15 & 128) != 0 ? null : pVar);
    }
}

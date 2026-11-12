package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import androidx.camera.core.impl.x2;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.room.a0;
import com.garmin.proto.generated.GDISimpleSetup;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import g1.c0;
import g1.h;
import g1.i;
import g1.j;
import g1.r;
import g1.v;
import g1.w;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35737e;

    public /* synthetic */ g(Uploader uploader, TransportContext transportContext, int i14, Runnable runnable) {
        this.f35733a = 1;
        this.f35735c = uploader;
        this.f35736d = transportContext;
        this.f35734b = i14;
        this.f35737e = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:156:0x0306  */
    /* JADX WARN: Code duplicated, block: B:162:0x0319  */
    /* JADX WARN: Code duplicated, block: B:171:0x032c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0331  */
    /* JADX WARN: Code duplicated, block: B:174:0x0336  */
    /* JADX WARN: Code duplicated, block: B:180:0x0357  */
    /* JADX WARN: Code duplicated, block: B:183:0x0372  */
    /* JADX WARN: Code duplicated, block: B:186:0x037b  */
    /* JADX WARN: Code duplicated, block: B:187:0x037d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0383  */
    /* JADX WARN: Code duplicated, block: B:190:0x0385  */
    /* JADX WARN: Code duplicated, block: B:211:0x0404  */
    /* JADX WARN: Code duplicated, block: B:246:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[LOOP:2: B:100:0x0218->B:249:?, LOOP_END, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        r rVar;
        j jVar;
        Executor executor;
        long j8;
        Iterator it;
        boolean z14;
        boolean z15;
        r rVar2;
        boolean z16;
        r rVar3;
        long j14;
        long j15;
        boolean z17;
        boolean z18;
        long j16;
        long j17;
        long j18;
        boolean z19;
        MediaCodec.BufferInfo bufferInfo;
        h hVar;
        boolean z24;
        Executor executor2;
        j jVar2;
        Range range;
        boolean z25;
        x2 x2Var;
        switch (this.f35733a) {
            case 0:
                SimpleSetupProtoManager.AnonymousClass1.onResponseReceived$lambda$0((SimpleSetupProtoManager) this.f35735c, (GDISimpleSetup.SupportedFeaturesListResponse) this.f35736d, (SimpleSetupProtoManager.AnonymousClass1) this.f35737e, this.f35734b);
                return;
            case 1:
                ((Uploader) this.f35735c).lambda$upload$1((TransportContext) this.f35736d, this.f35734b, (Runnable) this.f35737e);
                return;
            case 2:
                j jVar3 = (j) this.f35735c;
                int i14 = this.f35734b;
                String str = (String) this.f35736d;
                Throwable th3 = (Throwable) this.f35737e;
                Range<Long> range2 = r.H;
                jVar3.c(new EncodeException(i14, str, th3));
                return;
            case 3:
                r rVar4 = (r) this.f35735c;
                int i15 = this.f35734b;
                String str2 = (String) this.f35736d;
                Throwable th4 = (Throwable) this.f35737e;
                Range<Long> range3 = r.H;
                rVar4.e(i15, str2, th4);
                return;
            default:
                r.d dVar = (r.d) this.f35735c;
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f35736d;
                MediaCodec mediaCodec = (MediaCodec) this.f35737e;
                int i16 = this.f35734b;
                boolean z26 = dVar.f74778j;
                r rVar5 = r.this;
                if (z26) {
                    String str3 = rVar5.f74727a;
                    return;
                }
                switch (rVar5.f74749w) {
                    case CONFIGURED:
                    case ERROR:
                    case RELEASED:
                        return;
                    case STARTED:
                    case PAUSED:
                    case STOPPING:
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                    case PENDING_RELEASE:
                        synchronized (r.this.f74728b) {
                            rVar = r.this;
                            jVar = rVar.f74747u;
                            executor = rVar.f74748v;
                            break;
                        }
                        if (rVar.f74729c && rVar.c()) {
                            bufferInfo2.presentationTimeUs = r.this.q(bufferInfo2.presentationTimeUs);
                        }
                        if (!dVar.f74771c) {
                            dVar.f74771c = true;
                            try {
                                Objects.requireNonNull(jVar);
                                executor.execute(new v(jVar, 0));
                            } catch (RejectedExecutionException unused) {
                                String str4 = r.this.f74727a;
                            }
                            break;
                        }
                        if (!dVar.f74773e && bufferInfo2.size > 0 && (bufferInfo2.flags & 2) == 0) {
                            i1.f fVar = dVar.f74769a;
                            if (fVar != null) {
                                long j19 = bufferInfo2.presentationTimeUs;
                                c0 c0Var = fVar.f86991a;
                                if (fVar.f86995e == null) {
                                    x2 x2Var2 = fVar.f86992b;
                                    if (fVar.f86993c == null) {
                                        z25 = c0Var.a() - c0Var.b() > 3000000;
                                        fVar.f86995e = x2Var2;
                                    }
                                    x2 x2Var3 = Math.abs(j19 - c0Var.a()) < Math.abs(j19 - c0Var.b()) ? x2.REALTIME : x2.UPTIME;
                                    if (!z25 || x2Var3 == x2Var2) {
                                        x2Var = x2Var3;
                                        Objects.toString(x2Var);
                                    } else {
                                        int i17 = Build.VERSION.SDK_INT;
                                        x2Var = x2Var3;
                                        String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i17), i17 >= 31 ? ", SOC: " + Build.SOC_MODEL : "", fVar.f86992b, x2Var);
                                    }
                                    x2Var2 = x2Var;
                                    fVar.f86995e = x2Var2;
                                }
                                int i18 = i1.f.a.f86996a[fVar.f86995e.ordinal()];
                                if (i18 == 1) {
                                    if (fVar.f86994d == -1) {
                                        long j24 = Long.MAX_VALUE;
                                        long j25 = 0;
                                        for (int i19 = 0; i19 < 3; i19++) {
                                            long jB = c0Var.b();
                                            long jA = c0Var.a();
                                            long jB2 = c0Var.b();
                                            long j26 = jB2 - jB;
                                            if (i19 == 0 || j26 < j24) {
                                                j25 = jA - ((jB + jB2) >> 1);
                                                j24 = j26;
                                            }
                                        }
                                        fVar.f86994d = Math.max(0L, j25);
                                    }
                                    j19 -= fVar.f86994d;
                                } else if (i18 != 2) {
                                    o2.c.l(fVar.f86995e, "Unknown timebase: ");
                                    return;
                                }
                                bufferInfo2.presentationTimeUs = j19;
                            }
                            long j27 = bufferInfo2.presentationTimeUs;
                            try {
                                if (j27 > dVar.f74774f) {
                                    dVar.f74774f = j27;
                                    boolean zContains = r.this.f74750x.contains(Long.valueOf(j27));
                                    r rVar6 = r.this;
                                    if (zContains) {
                                        long j28 = bufferInfo2.presentationTimeUs;
                                        ArrayDeque arrayDeque = rVar6.f74742p;
                                        while (!arrayDeque.isEmpty()) {
                                            Range range4 = (Range) arrayDeque.getFirst();
                                            if (j28 > ((Long) range4.getUpper()).longValue()) {
                                                arrayDeque.removeFirst();
                                                long jLongValue = (((Long) range4.getUpper()).longValue() - ((Long) range4.getLower()).longValue()) + rVar6.f74751y;
                                                rVar6.f74751y = jLongValue;
                                                b1.d.b(jLongValue);
                                            } else {
                                                r rVar7 = r.this;
                                                j8 = bufferInfo2.presentationTimeUs;
                                                it = rVar7.f74742p.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        range = (Range) it.next();
                                                        if (range.contains(Long.valueOf(j8))) {
                                                            z14 = true;
                                                        } else if (j8 < ((Long) range.getLower()).longValue()) {
                                                        }
                                                    }
                                                    z14 = false;
                                                }
                                                z15 = dVar.f74776h;
                                                if (z15 && z14) {
                                                    r rVar8 = r.this;
                                                    String str5 = rVar8.f74727a;
                                                    dVar.f74776h = true;
                                                    synchronized (rVar8.f74728b) {
                                                        r rVar9 = r.this;
                                                        executor2 = rVar9.f74748v;
                                                        jVar2 = rVar9.f74747u;
                                                        break;
                                                    }
                                                    Objects.requireNonNull(jVar2);
                                                    executor2.execute(new v(jVar2, 0));
                                                    r rVar10 = r.this;
                                                    if (rVar10.f74749w == r.c.PAUSED && ((rVar10.f74729c || e1.a.f61851a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!r.this.f74729c || e1.a.f61851a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                                                        i.b bVar = r.this.f74733g;
                                                        if (bVar instanceof r.b) {
                                                            ((r.b) bVar).f(false);
                                                        }
                                                        r rVar11 = r.this;
                                                        rVar11.getClass();
                                                        Bundle bundle = new Bundle();
                                                        bundle.putInt("drop-input-frames", 1);
                                                        rVar11.f74732f.setParameters(bundle);
                                                    }
                                                    r.this.A = Long.valueOf(bufferInfo2.presentationTimeUs);
                                                    r rVar12 = r.this;
                                                    if (rVar12.f74752z) {
                                                        ScheduledFuture scheduledFuture = rVar12.B;
                                                        if (scheduledFuture != null) {
                                                            scheduledFuture.cancel(true);
                                                        }
                                                        r.this.m();
                                                        r.this.f74752z = false;
                                                    }
                                                } else if (z15 && !z14) {
                                                    rVar2 = r.this;
                                                    String str6 = rVar2.f74727a;
                                                    dVar.f74776h = false;
                                                    if (rVar2.f74729c && (bufferInfo2.flags & 1) == 0) {
                                                        dVar.f74777i = true;
                                                    }
                                                }
                                                z16 = dVar.f74776h;
                                                rVar3 = r.this;
                                                if (!z16) {
                                                    String str7 = rVar3.f74727a;
                                                } else {
                                                    j14 = rVar3.f74751y;
                                                    j15 = bufferInfo2.presentationTimeUs;
                                                    if (j14 > 0) {
                                                        j15 -= j14;
                                                    }
                                                    if (j15 > dVar.f74775g) {
                                                        String str8 = rVar3.f74727a;
                                                        if (rVar3.f74729c && (bufferInfo2.flags & 1) != 0) {
                                                            dVar.f74777i = true;
                                                        }
                                                    } else {
                                                        z17 = true;
                                                        z18 = dVar.f74772d;
                                                        if (!z18 && !dVar.f74777i && rVar3.f74729c) {
                                                            dVar.f74777i = true;
                                                        }
                                                        if (dVar.f74777i) {
                                                            if ((bufferInfo2.flags & 1) != 0) {
                                                                z24 = false;
                                                                String str9 = rVar3.f74727a;
                                                                rVar3.i();
                                                                r.this.f74732f.releaseOutputBuffer(i16, z24);
                                                            } else {
                                                                dVar.f74777i = false;
                                                                z17 = true;
                                                            }
                                                        }
                                                        if (!z18) {
                                                            dVar.f74772d = z17;
                                                            String str10 = rVar3.f74727a;
                                                            Objects.toString(rVar3.f74743q);
                                                            SystemClock.uptimeMillis();
                                                            SystemClock.elapsedRealtime();
                                                        }
                                                        j16 = r.this.f74751y;
                                                        j17 = bufferInfo2.presentationTimeUs;
                                                        if (j16 > 0) {
                                                            j17 -= j16;
                                                        }
                                                        j18 = j17;
                                                        if (bufferInfo2.presentationTimeUs == j18) {
                                                            bufferInfo = bufferInfo2;
                                                        } else {
                                                            if (j18 > dVar.f74775g) {
                                                                z19 = true;
                                                            } else {
                                                                z19 = false;
                                                            }
                                                            k7.h.f(z19, null);
                                                            MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
                                                            bufferInfo3.set(bufferInfo2.offset, bufferInfo2.size, j18, bufferInfo2.flags);
                                                            bufferInfo = bufferInfo3;
                                                        }
                                                        dVar.f74775g = bufferInfo.presentationTimeUs;
                                                        try {
                                                            hVar = new h(mediaCodec, i16, bufferInfo);
                                                            r rVar13 = r.this;
                                                            rVar13.f74741o.add(hVar);
                                                            l0.j.a(l0.j.f(hVar.f74711e), new w(dVar, hVar), rVar13.f74735i);
                                                            try {
                                                                executor.execute(new df.d(20, jVar, hVar));
                                                            } catch (RejectedExecutionException unused2) {
                                                                hVar.close();
                                                            }
                                                        } catch (MediaCodec.CodecException e4) {
                                                            r rVar14 = r.this;
                                                            rVar14.getClass();
                                                            rVar14.b(1, e4.getMessage(), e4);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        r rVar15 = r.this;
                                        j8 = bufferInfo2.presentationTimeUs;
                                        it = rVar15.f74742p.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                range = (Range) it.next();
                                                if (range.contains(Long.valueOf(j8))) {
                                                    z14 = true;
                                                } else if (j8 < ((Long) range.getLower()).longValue()) {
                                                }
                                            }
                                            z14 = false;
                                        }
                                        z15 = dVar.f74776h;
                                        if (z15) {
                                            if (z15) {
                                                rVar2 = r.this;
                                                String str11 = rVar2.f74727a;
                                                dVar.f74776h = false;
                                                if (rVar2.f74729c) {
                                                    dVar.f74777i = true;
                                                }
                                            }
                                        } else if (z15) {
                                            rVar2 = r.this;
                                            String str12 = rVar2.f74727a;
                                            dVar.f74776h = false;
                                            if (rVar2.f74729c) {
                                                dVar.f74777i = true;
                                            }
                                        }
                                        z16 = dVar.f74776h;
                                        rVar3 = r.this;
                                        if (!z16) {
                                            j14 = rVar3.f74751y;
                                            j15 = bufferInfo2.presentationTimeUs;
                                            if (j14 > 0) {
                                                j15 -= j14;
                                            }
                                            if (j15 > dVar.f74775g) {
                                                z17 = true;
                                                z18 = dVar.f74772d;
                                                if (!z18) {
                                                    dVar.f74777i = true;
                                                }
                                                if (dVar.f74777i) {
                                                    if ((bufferInfo2.flags & 1) != 0) {
                                                        z24 = false;
                                                        String str13 = rVar3.f74727a;
                                                        rVar3.i();
                                                        r.this.f74732f.releaseOutputBuffer(i16, z24);
                                                    } else {
                                                        dVar.f74777i = false;
                                                        z17 = true;
                                                    }
                                                }
                                                if (!z18) {
                                                    dVar.f74772d = z17;
                                                    String str14 = rVar3.f74727a;
                                                    Objects.toString(rVar3.f74743q);
                                                    SystemClock.uptimeMillis();
                                                    SystemClock.elapsedRealtime();
                                                }
                                                j16 = r.this.f74751y;
                                                j17 = bufferInfo2.presentationTimeUs;
                                                if (j16 > 0) {
                                                    j17 -= j16;
                                                }
                                                j18 = j17;
                                                if (bufferInfo2.presentationTimeUs == j18) {
                                                    bufferInfo = bufferInfo2;
                                                } else {
                                                    if (j18 > dVar.f74775g) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    k7.h.f(z19, null);
                                                    MediaCodec.BufferInfo bufferInfo4 = new MediaCodec.BufferInfo();
                                                    bufferInfo4.set(bufferInfo2.offset, bufferInfo2.size, j18, bufferInfo2.flags);
                                                    bufferInfo = bufferInfo4;
                                                }
                                                dVar.f74775g = bufferInfo.presentationTimeUs;
                                                hVar = new h(mediaCodec, i16, bufferInfo);
                                                r rVar16 = r.this;
                                                rVar16.f74741o.add(hVar);
                                                l0.j.a(l0.j.f(hVar.f74711e), new w(dVar, hVar), rVar16.f74735i);
                                                executor.execute(new df.d(20, jVar, hVar));
                                                break;
                                            } else {
                                                String str15 = rVar3.f74727a;
                                                if (rVar3.f74729c) {
                                                    dVar.f74777i = true;
                                                }
                                            }
                                        } else {
                                            String str16 = rVar3.f74727a;
                                        }
                                    } else {
                                        String str17 = rVar6.f74727a;
                                        if (rVar6.f74752z && bufferInfo2.presentationTimeUs >= ((Long) rVar6.f74750x.getUpper()).longValue()) {
                                            ScheduledFuture scheduledFuture2 = r.this.B;
                                            if (scheduledFuture2 != null) {
                                                scheduledFuture2.cancel(true);
                                            }
                                            r.this.A = Long.valueOf(bufferInfo2.presentationTimeUs);
                                            r.this.m();
                                            r.this.f74752z = false;
                                        }
                                    }
                                } else {
                                    String str18 = r.this.f74727a;
                                }
                                r.this.f74732f.releaseOutputBuffer(i16, z24);
                            } catch (MediaCodec.CodecException e14) {
                                r rVar17 = r.this;
                                rVar17.getClass();
                                rVar17.b(1, e14.getMessage(), e14);
                                return;
                            }
                            z24 = false;
                            break;
                        } else {
                            String str19 = r.this.f74727a;
                            z24 = false;
                            r.this.f74732f.releaseOutputBuffer(i16, z24);
                            break;
                        }
                        if (!dVar.f74773e) {
                            Range<Long> range5 = r.H;
                            if ((bufferInfo2.flags & 4) != 0 && (!dVar.f74779k || e1.a.f61851a.b(PrematureEndOfStreamVideoQuirk.class) == null)) {
                                dVar.a();
                            } else if (dVar.f74770b) {
                                r rVar18 = r.this;
                                if (rVar18.F && bufferInfo2.presentationTimeUs > ((Long) rVar18.f74750x.getUpper()).longValue()) {
                                    dVar.a();
                                }
                            }
                        }
                        if (dVar.f74779k) {
                            dVar.f74779k = false;
                            return;
                        }
                        return;
                    default:
                        a0.s(r.this.f74749w, "Unknown state: ");
                        return;
                }
        }
    }

    public /* synthetic */ g(Object obj, int i14, String str, Throwable th3, int i15) {
        this.f35733a = i15;
        this.f35735c = obj;
        this.f35734b = i14;
        this.f35736d = str;
        this.f35737e = th3;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f35733a = i15;
        this.f35735c = obj;
        this.f35736d = obj2;
        this.f35737e = obj3;
        this.f35734b = i14;
    }
}

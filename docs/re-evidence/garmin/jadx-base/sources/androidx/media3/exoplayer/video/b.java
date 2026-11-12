package androidx.media3.exoplayer.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d0;
import androidx.media3.common.i;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.firebase.messaging.Constants;
import fa.k;
import fa.n;
import fa.s;
import fa.z;
import j20.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import mt0.b2;
import org.joda.time.DateTimeConstants;
import za.j;

/* JADX INFO: loaded from: classes.dex */
public class b extends MediaCodecRenderer implements androidx.media3.exoplayer.video.d.b {

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final int[] f9780j2 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static boolean f9781k2;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static boolean f9782l2;
    public final boolean A1;
    public final f.a B1;
    public final int C1;
    public final boolean D1;
    public final androidx.media3.exoplayer.video.d E1;
    public final androidx.media3.exoplayer.video.d.a F1;
    public d G1;
    public boolean H1;
    public boolean I1;
    public VideoSink J1;
    public boolean K1;
    public List<Object> L1;
    public Surface M1;
    public za.b N1;
    public s O1;
    public boolean P1;
    public int Q1;
    public int R1;
    public long S1;
    public int T1;
    public int U1;
    public int V1;
    public long W1;
    public int X1;
    public long Y1;
    public k0 Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public k0 f9783a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public int f9784b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public boolean f9785c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public int f9786d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public e f9787e2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public za.f f9788f2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public long f9789g2;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public long f9790h2;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public boolean f9791i2;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final Context f9792z1;

    public class a implements VideoSink.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void a() {
            b bVar = b.this;
            Surface surface = bVar.M1;
            if (surface != null) {
                f.a aVar = bVar.B1;
                Handler handler = aVar.f9869a;
                if (handler != null) {
                    handler.post(new bd0.d(aVar, surface, SystemClock.elapsedRealtime(), 5));
                }
                bVar.P1 = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void b() {
            b bVar = b.this;
            if (bVar.M1 != null) {
                bVar.A0(0, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.b$b, reason: collision with other inner class name */
    public class C0131b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.exoplayer.mediacodec.c f9794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9795b;

        public C0131b(androidx.media3.exoplayer.mediacodec.c cVar, int i14, long j8) {
            this.f9794a = cVar;
            this.f9795b = i14;
        }
    }

    public static final class c {
        private c() {
        }

        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i14 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i14 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9799c;

        public d(int i14, int i15, int i16) {
            this.f9797a = i14;
            this.f9798b = i15;
            this.f9799c = i16;
        }
    }

    public final class e implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9800a;

        public e(androidx.media3.exoplayer.mediacodec.c cVar) {
            Handler handlerM = z.m(this);
            this.f9800a = handlerM;
            cVar.c(this, handlerM);
        }

        public final void a(long j8) {
            Surface surface;
            b bVar = b.this;
            if (this != bVar.f9787e2 || bVar.H0 == null) {
                return;
            }
            if (j8 == Long.MAX_VALUE) {
                bVar.f9230s1 = true;
                return;
            }
            try {
                f.a aVar = bVar.B1;
                bVar.p0(j8);
                k0 k0Var = bVar.Z1;
                if (!k0Var.equals(k0.f8334d) && !k0Var.equals(bVar.f9783a2)) {
                    bVar.f9783a2 = k0Var;
                    aVar.a(k0Var);
                }
                bVar.f9233u1.f8959e++;
                androidx.media3.exoplayer.video.d dVar = bVar.E1;
                boolean z14 = dVar.f9849e != 3;
                dVar.f9849e = 3;
                dVar.f9851g = z.O(dVar.f9856l.elapsedRealtime());
                if (z14 && (surface = bVar.M1) != null) {
                    Handler handler = aVar.f9869a;
                    if (handler != null) {
                        handler.post(new bd0.d(aVar, surface, SystemClock.elapsedRealtime(), 5));
                    }
                    bVar.P1 = true;
                }
                bVar.W(j8);
            } catch (ExoPlaybackException e4) {
                bVar.f9232t1 = e4;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i14 = message.arg1;
            int i15 = message.arg2;
            int i16 = z.f70071a;
            a(((((long) i14) & 4294967295L) << 32) | (4294967295L & ((long) i15)));
            return true;
        }
    }

    public b(Context context, androidx.media3.exoplayer.mediacodec.c.b bVar, androidx.media3.exoplayer.mediacodec.f fVar, long j8, boolean z14, Handler handler, f fVar2, int i14, float f14, VideoSink videoSink) {
        super(2, bVar, fVar, z14, f14);
        Context applicationContext = context.getApplicationContext();
        this.f9792z1 = applicationContext;
        this.C1 = i14;
        this.J1 = videoSink;
        this.B1 = new f.a(handler, fVar2);
        this.A1 = videoSink == null;
        this.E1 = new androidx.media3.exoplayer.video.d(applicationContext, this, j8);
        this.F1 = new androidx.media3.exoplayer.video.d.a();
        this.D1 = "NVIDIA".equals(z.f70073c);
        this.O1 = s.f70057c;
        this.Q1 = 1;
        this.R1 = 0;
        this.Z1 = k0.f8334d;
        this.f9786d2 = 0;
        this.f9783a2 = null;
        this.f9784b2 = -1000;
        this.f9789g2 = C.TIME_UNSET;
        this.f9790h2 = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean q0(String str) {
        String str2;
        byte b14;
        String str3;
        byte b15;
        boolean z14 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (b.class) {
            try {
                if (!f9781k2) {
                    int i14 = z.f70071a;
                    byte b16 = Ascii.FS;
                    if (i14 <= 28) {
                        String str4 = z.f70072b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b15 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b15 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b15 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b15 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b15 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b15 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b15 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b15 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b15 = -1;
                                break;
                        }
                        switch (b15) {
                            default:
                                if (i14 <= 27 || !"HWEML".equals(z.f70072b)) {
                                    str2 = z.f70074d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b14 = 0;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b14 = 1;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b14 = 2;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b14 = 3;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b14 = 4;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b14 = 5;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b14 = 6;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b14 = 7;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b14 = 8;
                                            } else {
                                                b14 = -1;
                                            }
                                            break;
                                        default:
                                            b14 = -1;
                                            break;
                                    }
                                    switch (b14) {
                                        default:
                                            if (i14 <= 26) {
                                                str3 = z.f70072b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b16 = 0;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b16 = 1;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b16 = 2;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b16 = 3;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b16 = 4;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b16 = 5;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b16 = 6;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b16 = 7;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b16 = 8;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b16 = 9;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b16 = 10;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b16 = Ascii.VT;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b16 = Ascii.FF;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b16 = Ascii.CR;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b16 = Ascii.SO;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b16 = Ascii.SI;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b16 = Ascii.DLE;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b16 = 17;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b16 = Ascii.DC2;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b16 = 19;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b16 = Ascii.DC4;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b16 = Ascii.NAK;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b16 = Ascii.SYN;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b16 = Ascii.ETB;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b16 = Ascii.CAN;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b16 = Ascii.EM;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b16 = 26;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b16 = 27;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b16 = Ascii.GS;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b16 = Ascii.RS;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b16 = Ascii.US;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b16 = 32;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b16 = 33;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b16 = 34;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b16 = 35;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b16 = 36;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b16 = 37;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b16 = 38;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b16 = 39;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b16 = 40;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b16 = 41;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b16 = 42;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b16 = 43;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b16 = 44;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b16 = 45;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b16 = 46;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b16 = 47;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b16 = 48;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b16 = 49;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b16 = 50;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b16 = 51;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b16 = 52;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b16 = 53;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b16 = 54;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b16 = 55;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b16 = 56;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b16 = 57;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b16 = 58;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b16 = 59;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b16 = 60;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b16 = 61;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b16 = 62;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b16 = 63;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b16 = SignedBytes.MAX_POWER_OF_TWO;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b16 = 65;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b16 = 66;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b16 = 67;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b16 = 68;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b16 = 69;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b16 = 70;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b16 = 71;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b16 = 72;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b16 = 73;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b16 = 74;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b16 = 75;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b16 = 76;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b16 = 77;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b16 = 78;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b16 = 79;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b16 = 80;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b16 = 81;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b16 = 82;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b16 = 83;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b16 = 84;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b16 = 85;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b16 = 86;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b16 = 87;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b16 = 88;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b16 = 89;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b16 = 90;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b16 = 91;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b16 = 92;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b16 = 93;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b16 = 94;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b16 = 95;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b16 = 96;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b16 = 97;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b16 = 98;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b16 = 99;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b16 = 100;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b16 = 101;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b16 = 102;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b16 = 103;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b16 = 104;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b16 = 105;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b16 = 106;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b16 = 107;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b16 = 108;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b16 = 109;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b16 = 110;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b16 = 111;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b16 = 112;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b16 = 113;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b16 = 114;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b16 = 115;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b16 = 116;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b16 = 117;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b16 = 118;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b16 = 119;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b16 = 120;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b16 = 121;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b16 = 122;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b16 = 123;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b16 = 124;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b16 = 125;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b16 = 126;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b16 = Ascii.DEL;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b16 = UnsignedBytes.MAX_POWER_OF_TWO;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b16 = 129;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b16 = 130;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b16 = 131;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b16 = 132;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b16 = 133;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b16 = 134;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b16 = 135;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b16 = 136;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b16 = 137;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b16 = 138;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b16 = 139;
                                                        } else {
                                                            b16 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b16 = -1;
                                                        break;
                                                }
                                                switch (b16) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                                    case 137:
                                                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                                    case 139:
                                                        z14 = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z14 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z14 = true;
                                break;
                        }
                    } else if (i14 <= 27) {
                        str2 = z.f70074d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b14 = 0;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b14 = 1;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b14 = 2;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b14 = 3;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b14 = 4;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b14 = 5;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b14 = 6;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b14 = 7;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b14 = 8;
                                } else {
                                    b14 = -1;
                                }
                                break;
                            default:
                                b14 = -1;
                                break;
                        }
                        switch (b14) {
                            default:
                                if (i14 <= 26) {
                                    str3 = z.f70072b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b16 = 0;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b16 = 1;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b16 = 2;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b16 = 3;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b16 = 4;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b16 = 5;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b16 = 6;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b16 = 7;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b16 = 8;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b16 = 9;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b16 = 10;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b16 = Ascii.VT;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b16 = Ascii.FF;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b16 = Ascii.CR;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b16 = Ascii.SO;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b16 = Ascii.SI;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b16 = Ascii.DLE;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b16 = 17;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b16 = Ascii.DC2;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b16 = 19;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b16 = Ascii.DC4;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b16 = Ascii.NAK;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b16 = Ascii.SYN;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b16 = Ascii.ETB;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b16 = Ascii.CAN;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b16 = Ascii.EM;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b16 = 26;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b16 = 27;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b16 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b16 = Ascii.GS;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b16 = Ascii.RS;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b16 = Ascii.US;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b16 = 32;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b16 = 33;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b16 = 34;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b16 = 35;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b16 = 36;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b16 = 37;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b16 = 38;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b16 = 39;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b16 = 40;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b16 = 41;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b16 = 42;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b16 = 43;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b16 = 44;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b16 = 45;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b16 = 46;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b16 = 47;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b16 = 48;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b16 = 49;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b16 = 50;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b16 = 51;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b16 = 52;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b16 = 53;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b16 = 54;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b16 = 55;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b16 = 56;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b16 = 57;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b16 = 58;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b16 = 59;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b16 = 60;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b16 = 61;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b16 = 62;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b16 = 63;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b16 = SignedBytes.MAX_POWER_OF_TWO;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b16 = 65;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b16 = 66;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b16 = 67;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b16 = 68;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b16 = 69;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b16 = 70;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b16 = 71;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b16 = 72;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b16 = 73;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b16 = 74;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b16 = 75;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b16 = 76;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b16 = 77;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b16 = 78;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b16 = 79;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b16 = 80;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b16 = 81;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b16 = 82;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b16 = 83;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b16 = 84;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b16 = 85;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b16 = 86;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b16 = 87;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b16 = 88;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b16 = 89;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b16 = 90;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b16 = 91;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b16 = 92;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b16 = 93;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b16 = 94;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b16 = 95;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b16 = 96;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b16 = 97;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b16 = 98;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b16 = 99;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b16 = 100;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b16 = 101;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b16 = 102;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b16 = 103;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b16 = 104;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b16 = 105;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b16 = 106;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b16 = 107;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b16 = 108;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b16 = 109;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b16 = 110;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b16 = 111;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b16 = 112;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b16 = 113;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b16 = 114;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b16 = 115;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b16 = 116;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b16 = 117;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b16 = 118;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b16 = 119;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b16 = 120;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b16 = 121;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b16 = 122;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b16 = 123;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b16 = 124;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b16 = 125;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b16 = 126;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b16 = Ascii.DEL;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b16 = UnsignedBytes.MAX_POWER_OF_TWO;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b16 = 129;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b16 = 130;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b16 = 131;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b16 = 132;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b16 = 133;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b16 = 134;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b16 = 135;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b16 = 136;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b16 = 137;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b16 = 138;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b16 = 139;
                                            } else {
                                                b16 = -1;
                                            }
                                            break;
                                        default:
                                            b16 = -1;
                                            break;
                                    }
                                    switch (b16) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                        case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                        case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                        case 137:
                                        case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                        case 139:
                                            z14 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z14 = true;
                                break;
                        }
                    } else {
                        str2 = z.f70074d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b14 = -1;
                                } else {
                                    b14 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b14 = -1;
                                } else {
                                    b14 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b14 = -1;
                                } else {
                                    b14 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b14 = -1;
                                } else {
                                    b14 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b14 = -1;
                                } else {
                                    b14 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b14 = -1;
                                } else {
                                    b14 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b14 = -1;
                                } else {
                                    b14 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b14 = -1;
                                } else {
                                    b14 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b14 = -1;
                                } else {
                                    b14 = 8;
                                }
                                break;
                            default:
                                b14 = -1;
                                break;
                        }
                        switch (b14) {
                            default:
                                if (i14 <= 26) {
                                    str3 = z.f70072b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.VT;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.FF;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.CR;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.SO;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.SI;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.DLE;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.DC2;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.DC4;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.NAK;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.SYN;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.ETB;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.CAN;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.EM;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b16 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.GS;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.RS;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.US;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b16 = -1;
                                            } else {
                                                b16 = SignedBytes.MAX_POWER_OF_TWO;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b16 = -1;
                                            } else {
                                                b16 = Ascii.DEL;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b16 = -1;
                                            } else {
                                                b16 = UnsignedBytes.MAX_POWER_OF_TWO;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b16 = -1;
                                            } else {
                                                b16 = 139;
                                            }
                                            break;
                                        default:
                                            b16 = -1;
                                            break;
                                    }
                                    switch (b16) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                        case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                        case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                        case 137:
                                        case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                        case 139:
                                            z14 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z14 = true;
                                break;
                        }
                    }
                    f9782l2 = z14;
                    f9781k2 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f9782l2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int r0(androidx.media3.exoplayer.mediacodec.d dVar, q qVar) {
        int iIntValue;
        int i14 = qVar.f8393u;
        int i15 = qVar.f8394v;
        if (i14 != -1 && i15 != -1) {
            String str = qVar.f8386n;
            str.getClass();
            if (MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
                Pair<Integer, Integer> pairD = MediaCodecUtil.d(qVar);
                str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264;
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i14 * i15) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i14 * i15) * 3) / 4);
                case "video/avc":
                    String str2 = z.f70074d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(z.f70073c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !dVar.f9275f)))) {
                        return ((z.f(i15, 16) * z.f(i14, 16)) * ViewUtils.EDGE_TO_EDGE_FLAGS) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i14 * i15) * 3) / 8;
            }
        }
        return -1;
    }

    public static List<androidx.media3.exoplayer.mediacodec.d> s0(Context context, androidx.media3.exoplayer.mediacodec.f fVar, q qVar, boolean z14, boolean z15) {
        String str = qVar.f8386n;
        if (str == null) {
            return ImmutableList.of();
        }
        if (z.f70071a >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !c.a(context)) {
            String strB = MediaCodecUtil.b(qVar);
            List<androidx.media3.exoplayer.mediacodec.d> listOf = strB == null ? ImmutableList.of() : fVar.getDecoderInfos(strB, z14, z15);
            if (!listOf.isEmpty()) {
                return listOf;
            }
        }
        return MediaCodecUtil.g(fVar, qVar, z14, z15);
    }

    public static int t0(androidx.media3.exoplayer.mediacodec.d dVar, q qVar) {
        int i14 = qVar.f8387o;
        List<byte[]> list = qVar.f8389q;
        if (i14 == -1) {
            return r0(dVar, qVar);
        }
        int size = list.size();
        int length = 0;
        for (int i15 = 0; i15 < size; i15++) {
            length += list.get(i15).length;
        }
        return qVar.f8387o + length;
    }

    public final void A0(int i14, int i15) {
        g gVar = this.f9233u1;
        gVar.f8962h += i14;
        int i16 = i14 + i15;
        gVar.f8961g += i16;
        this.T1 += i16;
        int i17 = this.U1 + i16;
        this.U1 = i17;
        gVar.f8963i = Math.max(i17, gVar.f8963i);
        int i18 = this.C1;
        if (i18 <= 0 || this.T1 < i18) {
            return;
        }
        v0();
    }

    public final void B0(long j8) {
        g gVar = this.f9233u1;
        gVar.f8965k += j8;
        gVar.f8966l++;
        this.W1 += j8;
        this.X1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int F(DecoderInputBuffer decoderInputBuffer) {
        return (z.f70071a < 34 || !this.f9785c2 || decoderInputBuffer.f8633f >= this.f8932l) ? 0 : 32;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean G() {
        return this.f9785c2 && z.f70071a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float H(float f14, q[] qVarArr) {
        float fMax = -1.0f;
        for (q qVar : qVarArr) {
            float f15 = qVar.f8395w;
            if (f15 != -1.0f) {
                fMax = Math.max(fMax, f15);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f14;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList I(androidx.media3.exoplayer.mediacodec.f fVar, q qVar, boolean z14) {
        List<androidx.media3.exoplayer.mediacodec.d> listS0 = s0(this.f9792z1, fVar, qVar, z14, this.f9785c2);
        HashMap<MediaCodecUtil.b, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f9248a;
        ArrayList arrayList = new ArrayList(listS0);
        Collections.sort(arrayList, new a61.c(new b2(qVar, 27), 15));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x013a, please report this as an issue */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final androidx.media3.exoplayer.mediacodec.c.a K(androidx.media3.exoplayer.mediacodec.d dVar, q qVar, MediaCrypto mediaCrypto, float f14) {
        int i14;
        d dVar2;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        byte b14;
        boolean z14;
        Pair<Integer, Integer> pairD;
        int iR0;
        String str = dVar.f9272c;
        q[] qVarArr = this.f8930j;
        qVarArr.getClass();
        int i15 = qVar.f8393u;
        float f15 = qVar.f8395w;
        i iVar = qVar.B;
        int i16 = qVar.f8394v;
        int iT0 = t0(dVar, qVar);
        if (qVarArr.length == 1) {
            if (iT0 != -1 && (iR0 = r0(dVar, qVar)) != -1) {
                iT0 = Math.min((int) (iT0 * 1.5f), iR0);
            }
            dVar2 = new d(i15, i16, iT0);
            iVar = iVar;
            i14 = i16;
        } else {
            int length = qVarArr.length;
            int iMax = i15;
            int iMax2 = i16;
            int i17 = 0;
            boolean z15 = false;
            while (i17 < length) {
                q qVarA = qVarArr[i17];
                q[] qVarArr2 = qVarArr;
                if (iVar != null && qVarA.B == null) {
                    q.b bVarA = qVarA.a();
                    bVarA.A = iVar;
                    qVarA = bVarA.a();
                }
                h hVarB = dVar.b(qVar, qVarA);
                int i18 = length;
                int i19 = qVarA.f8394v;
                if (hVarB.f8979d != 0) {
                    int i24 = qVarA.f8393u;
                    b14 = -1;
                    z15 |= i24 == -1 || i19 == -1;
                    iMax = Math.max(iMax, i24);
                    iMax2 = Math.max(iMax2, i19);
                    iT0 = Math.max(iT0, t0(dVar, qVarA));
                } else {
                    b14 = -1;
                }
                length = i18;
                i17++;
                qVarArr = qVarArr2;
            }
            if (z15) {
                k.g("Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z16 = i16 > i15;
                int i25 = z16 ? i16 : i15;
                int i26 = z16 ? i15 : i16;
                boolean z17 = z16;
                float f16 = i26 / i25;
                int i27 = 0;
                while (true) {
                    if (i27 < 9) {
                        int i28 = f9780j2[i27];
                        int i29 = i27;
                        int i30 = (int) (i28 * f16);
                        if (i28 > i25 && i30 > i26) {
                            if (z17) {
                                i28 = i30;
                            }
                            if (z17) {
                                i30 = i28;
                            }
                            int i34 = i25;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = dVar.f9273d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point2 = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point2 = new Point(z.f(i28, widthAlignment) * widthAlignment, z.f(i30, heightAlignment) * heightAlignment);
                            }
                            if (point2 != null) {
                                point = point2;
                                i14 = i16;
                                if (dVar.f(point2.x, point2.y, f15)) {
                                }
                            } else {
                                i14 = i16;
                            }
                            i27 = i29 + 1;
                            i16 = i14;
                            i25 = i34;
                            iVar = iVar;
                            i26 = i26;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            q.b bVarA2 = qVar.a();
                            bVarA2.f8418t = iMax;
                            bVarA2.f8419u = iMax2;
                            iT0 = Math.max(iT0, r0(dVar, bVarA2.a()));
                            k.g("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    iVar = iVar;
                    i14 = i16;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        q.b bVarA3 = qVar.a();
                        bVarA3.f8418t = iMax;
                        bVarA3.f8419u = iMax2;
                        iT0 = Math.max(iT0, r0(dVar, bVarA3.a()));
                        k.g("Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                iVar = iVar;
                i14 = i16;
            }
            dVar2 = new d(iMax, iMax2, iT0);
        }
        this.G1 = dVar2;
        int i35 = this.f9785c2 ? this.f9786d2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i15);
        mediaFormat.setInteger("height", i14);
        n.b(mediaFormat, qVar.f8389q);
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        n.a(mediaFormat, "rotation-degrees", qVar.f8396x);
        if (iVar != null) {
            i iVar2 = iVar;
            n.a(mediaFormat, "color-transfer", iVar2.f8317c);
            n.a(mediaFormat, "color-standard", iVar2.f8315a);
            n.a(mediaFormat, "color-range", iVar2.f8316b);
            byte[] bArr = iVar2.f8318d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(qVar.f8386n) && (pairD = MediaCodecUtil.d(qVar)) != null) {
            n.a(mediaFormat, Scopes.PROFILE, ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar2.f9797a);
        mediaFormat.setInteger("max-height", dVar2.f9798b);
        n.a(mediaFormat, "max-input-size", dVar2.f9799c);
        int i36 = z.f70071a;
        if (i36 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f14 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f14);
            }
        }
        if (this.D1) {
            z14 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z14 = true;
        }
        if (i35 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z14);
            mediaFormat.setInteger("audio-session-id", i35);
        }
        if (i36 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f9784b2));
        }
        Surface surfaceU0 = u0(dVar);
        if (this.J1 != null && !z.J(this.f9792z1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return androidx.media3.exoplayer.mediacodec.c.a.b(dVar, mediaFormat, qVar, surfaceU0, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public final void L(DecoderInputBuffer decoderInputBuffer) {
        if (this.I1) {
            ByteBuffer byteBuffer = decoderInputBuffer.f8634g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b14 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s14 = byteBuffer.getShort();
                byte b15 = byteBuffer.get();
                byte b16 = byteBuffer.get();
                byteBuffer.position(0);
                if (b14 == -75 && s8 == 60 && s14 == 1 && b15 == 4) {
                    if (b16 == 0 || b16 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
                        cVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        cVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Q(Exception exc) {
        k.d("Video codec error", exc);
        f.a aVar = this.B1;
        Handler handler = aVar.f9869a;
        if (handler != null) {
            handler.post(new vg1.d(29, aVar, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void R(long j8, long j14, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        f.a aVar = this.B1;
        Handler handler = aVar.f9869a;
        if (handler != null) {
            str2 = str;
            handler.post(new com.google.android.exoplayer2.audio.b(aVar, str2, j8, j14, 3));
        } else {
            str2 = str;
        }
        this.H1 = q0(str2);
        androidx.media3.exoplayer.mediacodec.d dVar = this.O0;
        dVar.getClass();
        boolean z14 = false;
        if (z.f70071a >= 29 && MimeTypes.VIDEO_VP9.equals(dVar.f9271b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = dVar.f9273d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z14 = true;
                    break;
                }
            }
        }
        this.I1 = z14;
        w0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void S(String str) {
        f.a aVar = this.B1;
        Handler handler = aVar.f9869a;
        if (handler != null) {
            handler.post(new j(0, aVar, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final h T(a0 a0Var) {
        h hVarT = super.T(a0Var);
        q qVar = a0Var.f8667b;
        qVar.getClass();
        f.a aVar = this.B1;
        Handler handler = aVar.f9869a;
        if (handler != null) {
            handler.post(new uj2.b(aVar, 13, qVar, hVarT));
        }
        return hVarT;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void U(q qVar, MediaFormat mediaFormat) {
        int integer;
        int i14;
        androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
        if (cVar != null) {
            cVar.setVideoScalingMode(this.Q1);
        }
        if (this.f9785c2) {
            i14 = qVar.f8393u;
            integer = qVar.f8394v;
        } else {
            mediaFormat.getClass();
            boolean z14 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z14 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z14 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i14 = integer2;
        }
        float f14 = qVar.f8397y;
        int i15 = qVar.f8396x;
        if (i15 == 90 || i15 == 270) {
            f14 = 1.0f / f14;
            int i16 = integer;
            integer = i14;
            i14 = i16;
        }
        this.Z1 = new k0(i14, integer, f14);
        VideoSink videoSink = this.J1;
        if (videoSink == null || !this.f9791i2) {
            this.E1.g(qVar.f8395w);
        } else {
            q.b bVarA = qVar.a();
            bVarA.f8418t = i14;
            bVarA.f8419u = integer;
            bVarA.f8422x = f14;
            videoSink.l(bVarA.a());
        }
        this.f9791i2 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void W(long j8) {
        super.W(j8);
        if (this.f9785c2) {
            return;
        }
        this.V1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void X() {
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            MediaCodecRenderer.c cVar = this.f9235v1;
            videoSink.f(cVar.f9245b, cVar.f9246c, -this.f9789g2, this.f8932l);
        } else {
            this.E1.d(2);
        }
        this.f9791i2 = true;
        w0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Y(DecoderInputBuffer decoderInputBuffer) {
        Surface surface;
        boolean z14 = this.f9785c2;
        if (!z14) {
            this.V1++;
        }
        if (z.f70071a >= 23 || !z14) {
            return;
        }
        long j8 = decoderInputBuffer.f8633f;
        p0(j8);
        k0 k0Var = this.Z1;
        boolean zEquals = k0Var.equals(k0.f8334d);
        f.a aVar = this.B1;
        if (!zEquals && !k0Var.equals(this.f9783a2)) {
            this.f9783a2 = k0Var;
            aVar.a(k0Var);
        }
        this.f9233u1.f8959e++;
        androidx.media3.exoplayer.video.d dVar = this.E1;
        boolean z15 = dVar.f9849e != 3;
        dVar.f9849e = 3;
        dVar.f9851g = z.O(dVar.f9856l.elapsedRealtime());
        if (z15 && (surface = this.M1) != null) {
            Handler handler = aVar.f9869a;
            if (handler != null) {
                handler.post(new bd0.d(aVar, surface, SystemClock.elapsedRealtime(), 5));
            }
            this.P1 = true;
        }
        W(j8);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Z(q qVar) throws ExoPlaybackException {
        VideoSink videoSink = this.J1;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.J1.h(qVar);
        } catch (VideoSink.VideoSinkException e4) {
            throw l(e4, qVar, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean b0(long j8, long j14, androidx.media3.exoplayer.mediacodec.c cVar, ByteBuffer byteBuffer, int i14, int i15, int i16, long j15, boolean z14, boolean z15, q qVar) throws ExoPlaybackException {
        cVar.getClass();
        MediaCodecRenderer.c cVar2 = this.f9235v1;
        long j16 = j15 - cVar2.f9246c;
        VideoSink videoSink = this.J1;
        if (videoSink == null) {
            int iA = this.E1.a(j15, j8, j14, cVar2.f9245b, z15, this.F1);
            if (iA != 4) {
                if (z14 && !z15) {
                    z0(cVar, i14);
                    return true;
                }
                Surface surface = this.M1;
                androidx.media3.exoplayer.video.d.a aVar = this.F1;
                if (surface == null) {
                    if (aVar.f9857a < 30000) {
                        z0(cVar, i14);
                        B0(aVar.f9857a);
                        return true;
                    }
                } else {
                    if (iA == 0) {
                        fa.c cVar3 = this.f8927g;
                        cVar3.getClass();
                        long jNanoTime = cVar3.nanoTime();
                        za.f fVar = this.f9788f2;
                        if (fVar != null) {
                            fVar.a(j16, jNanoTime, qVar, this.J0);
                        }
                        x0(cVar, i14, jNanoTime);
                        B0(aVar.f9857a);
                        return true;
                    }
                    if (iA == 1) {
                        long j17 = aVar.f9858b;
                        long j18 = aVar.f9857a;
                        if (j17 == this.Y1) {
                            z0(cVar, i14);
                        } else {
                            za.f fVar2 = this.f9788f2;
                            if (fVar2 != null) {
                                fVar2.a(j16, j17, qVar, this.J0);
                            }
                            x0(cVar, i14, j17);
                        }
                        B0(j18);
                        this.Y1 = j17;
                        return true;
                    }
                    if (iA == 2) {
                        Trace.beginSection("dropVideoBuffer");
                        cVar.d(i14);
                        Trace.endSection();
                        A0(0, 1);
                        B0(aVar.f9857a);
                        return true;
                    }
                    if (iA == 3) {
                        z0(cVar, i14);
                        B0(aVar.f9857a);
                        return true;
                    }
                    if (iA != 5) {
                        vb.h.z(String.valueOf(iA));
                        return false;
                    }
                }
            }
            return false;
        }
        try {
            try {
                return videoSink.o(j15 + (-this.f9789g2), z15, j8, j14, new C0131b(cVar, i14, j16));
            } catch (VideoSink.VideoSinkException e4) {
                e = e4;
                throw l(e, e.format, false, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        } catch (VideoSink.VideoSinkException e14) {
            e = e14;
        }
    }

    @Override // androidx.media3.exoplayer.t0
    public final void c() {
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            videoSink.c();
            return;
        }
        androidx.media3.exoplayer.video.d dVar = this.E1;
        if (dVar.f9849e == 0) {
            dVar.f9849e = 1;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void f0() {
        super.f0();
        this.V1 = 0;
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f, androidx.media3.exoplayer.r0.b
    public final void handleMessage(int i14, Object obj) {
        Handler handler;
        androidx.media3.exoplayer.video.d dVar = this.E1;
        if (i14 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.M1;
            f.a aVar = this.B1;
            if (surface2 == surface) {
                if (surface != null) {
                    k0 k0Var = this.f9783a2;
                    if (k0Var != null) {
                        aVar.a(k0Var);
                    }
                    Surface surface3 = this.M1;
                    if (surface3 == null || !this.P1 || (handler = aVar.f9869a) == null) {
                        return;
                    }
                    handler.post(new bd0.d(aVar, surface3, SystemClock.elapsedRealtime(), 5));
                    return;
                }
                return;
            }
            this.M1 = surface;
            if (this.J1 == null) {
                dVar.h(surface);
            }
            this.P1 = false;
            int i15 = this.f8928h;
            androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
            if (cVar != null && this.J1 == null) {
                androidx.media3.exoplayer.mediacodec.d dVar2 = this.O0;
                dVar2.getClass();
                Surface surface4 = this.M1;
                boolean z14 = (surface4 != null && surface4.isValid()) || (z.f70071a >= 35 && dVar2.f9277h) || y0(dVar2);
                int i16 = z.f70071a;
                if (i16 < 23 || !z14 || this.H1) {
                    d0();
                    O();
                } else {
                    Surface surfaceU0 = u0(dVar2);
                    if (i16 >= 23 && surfaceU0 != null) {
                        cVar.setOutputSurface(surfaceU0);
                    } else {
                        if (i16 < 35) {
                            x.h();
                            return;
                        }
                        cVar.f();
                    }
                }
            }
            if (surface != null) {
                k0 k0Var2 = this.f9783a2;
                if (k0Var2 != null) {
                    aVar.a(k0Var2);
                }
                if (i15 == 2) {
                    VideoSink videoSink = this.J1;
                    if (videoSink != null) {
                        videoSink.n(true);
                    } else {
                        dVar.c(true);
                    }
                }
            } else {
                this.f9783a2 = null;
                VideoSink videoSink2 = this.J1;
                if (videoSink2 != null) {
                    videoSink2.u();
                }
            }
            w0();
            return;
        }
        if (i14 == 7) {
            obj.getClass();
            za.f fVar = (za.f) obj;
            this.f9788f2 = fVar;
            VideoSink videoSink3 = this.J1;
            if (videoSink3 != null) {
                videoSink3.j(fVar);
                return;
            }
            return;
        }
        if (i14 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f9786d2 != iIntValue) {
                this.f9786d2 = iIntValue;
                if (this.f9785c2) {
                    d0();
                    return;
                }
                return;
            }
            return;
        }
        if (i14 == 16) {
            obj.getClass();
            this.f9784b2 = ((Integer) obj).intValue();
            androidx.media3.exoplayer.mediacodec.c cVar2 = this.H0;
            if (cVar2 != null && z.f70071a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f9784b2));
                cVar2.setParameters(bundle);
                return;
            }
            return;
        }
        if (i14 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.Q1 = iIntValue2;
            androidx.media3.exoplayer.mediacodec.c cVar3 = this.H0;
            if (cVar3 != null) {
                cVar3.setVideoScalingMode(iIntValue2);
                return;
            }
            return;
        }
        if (i14 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.R1 = iIntValue3;
            VideoSink videoSink4 = this.J1;
            if (videoSink4 != null) {
                videoSink4.m(iIntValue3);
                return;
            }
            za.g gVar = dVar.f9846b;
            if (gVar.f203202j == iIntValue3) {
                return;
            }
            gVar.f203202j = iIntValue3;
            gVar.d(true);
            return;
        }
        if (i14 == 13) {
            obj.getClass();
            List<Object> list = (List) obj;
            this.L1 = list;
            VideoSink videoSink5 = this.J1;
            if (videoSink5 != null) {
                videoSink5.q(list);
                return;
            }
            return;
        }
        if (i14 != 14) {
            super.handleMessage(i14, obj);
            return;
        }
        obj.getClass();
        s sVar = (s) obj;
        if (sVar.f70058a == 0 || sVar.f70059b == 0) {
            return;
        }
        this.O1 = sVar;
        VideoSink videoSink6 = this.J1;
        if (videoSink6 != null) {
            Surface surface5 = this.M1;
            fa.a.f(surface5);
            videoSink6.e(surface5, sVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f, androidx.media3.exoplayer.t0
    public final boolean isEnded() {
        if (!this.f9227q1) {
            return false;
        }
        VideoSink videoSink = this.J1;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public final boolean isReady() {
        boolean zIsReady = super.isReady();
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            return videoSink.r(zIsReady);
        }
        if (zIsReady && (this.H0 == null || this.M1 == null || this.f9785c2)) {
            return true;
        }
        return this.E1.b(zIsReady);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean j0(androidx.media3.exoplayer.mediacodec.d dVar) {
        Surface surface = this.M1;
        if (surface == null || !surface.isValid()) {
            return (z.f70071a >= 35 && dVar.f9277h) || y0(dVar);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean k0(DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.b(67108864) && !hasReadStreamToEnd() && !decoderInputBuffer.b(536870912)) {
            long j8 = this.f9790h2;
            if (j8 != C.TIME_UNSET && j8 - (decoderInputBuffer.f8633f - this.f9235v1.f9246c) > 100000 && !decoderInputBuffer.b(1073741824) && decoderInputBuffer.f8633f < this.f8932l) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void m() {
        g gVar;
        f.a aVar = this.B1;
        this.f9783a2 = null;
        this.f9790h2 = C.TIME_UNSET;
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            videoSink.t();
        } else {
            this.E1.d(0);
        }
        w0();
        this.P1 = false;
        this.f9787e2 = null;
        try {
            super.m();
            gVar = this.f9233u1;
            aVar.getClass();
            synchronized (gVar) {
            }
        } finally {
            gVar = this.f9233u1;
            aVar.getClass();
            synchronized (gVar) {
                Handler handler = aVar.f9869a;
                if (handler != null) {
                    handler.post(new za.i(aVar, gVar, 1));
                }
                aVar.a(k0.f8334d);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int m0(androidx.media3.exoplayer.mediacodec.f fVar, q qVar) {
        boolean z14;
        int i14 = 0;
        if (!androidx.media3.common.x.m(qVar.f8386n)) {
            return u0.h(0, 0, 0, 0);
        }
        boolean z15 = qVar.f8390r != null;
        Context context = this.f9792z1;
        List<androidx.media3.exoplayer.mediacodec.d> listS0 = s0(context, fVar, qVar, z15, false);
        if (z15 && listS0.isEmpty()) {
            listS0 = s0(context, fVar, qVar, false, false);
        }
        if (listS0.isEmpty()) {
            return u0.h(1, 0, 0, 0);
        }
        int i15 = qVar.L;
        if (i15 != 0 && i15 != 2) {
            return u0.h(2, 0, 0, 0);
        }
        androidx.media3.exoplayer.mediacodec.d dVar = listS0.get(0);
        boolean zD = dVar.d(qVar);
        if (!zD) {
            int i16 = 1;
            while (true) {
                if (i16 >= listS0.size()) {
                    z14 = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.d dVar2 = listS0.get(i16);
                if (dVar2.d(qVar)) {
                    z14 = false;
                    zD = true;
                    dVar = dVar2;
                    break;
                }
                i16++;
            }
        } else {
            z14 = true;
            break;
        }
        int i17 = zD ? 4 : 3;
        int i18 = dVar.e(qVar) ? 16 : 8;
        int i19 = dVar.f9276g ? 64 : 0;
        int i24 = z14 ? 128 : 0;
        if (z.f70071a >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(qVar.f8386n) && !c.a(context)) {
            i24 = 256;
        }
        if (zD) {
            List<androidx.media3.exoplayer.mediacodec.d> listS1 = s0(context, fVar, qVar, z15, true);
            if (!listS1.isEmpty()) {
                HashMap<MediaCodecUtil.b, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f9248a;
                ArrayList arrayList = new ArrayList(listS1);
                Collections.sort(arrayList, new a61.c(new b2(qVar, 27), 15));
                androidx.media3.exoplayer.mediacodec.d dVar3 = (androidx.media3.exoplayer.mediacodec.d) arrayList.get(0);
                if (dVar3.d(qVar) && dVar3.e(qVar)) {
                    i14 = 32;
                }
            }
        }
        return i17 | i18 | i14 | i19 | i24;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void n(boolean z14, boolean z15) {
        super.n(z14, z15);
        v0 v0Var = this.f8924d;
        v0Var.getClass();
        boolean z16 = v0Var.f9775b;
        fa.a.d((z16 && this.f9786d2 == 0) ? false : true);
        if (this.f9785c2 != z16) {
            this.f9785c2 = z16;
            d0();
        }
        g gVar = this.f9233u1;
        f.a aVar = this.B1;
        Handler handler = aVar.f9869a;
        if (handler != null) {
            handler.post(new za.i(aVar, gVar, 0));
        }
        boolean z17 = this.K1;
        androidx.media3.exoplayer.video.d dVar = this.E1;
        if (!z17) {
            if (this.L1 != null && this.J1 == null) {
                androidx.media3.exoplayer.video.c.b bVar = new androidx.media3.exoplayer.video.c.b(this.f9792z1, dVar);
                fa.c cVar = this.f8927g;
                cVar.getClass();
                bVar.f9823f = cVar;
                fa.a.d(!bVar.f9824g);
                androidx.media3.exoplayer.video.c.a aVar2 = null;
                if (bVar.f9821d == null) {
                    if (bVar.f9820c == null) {
                        bVar.f9820c = new androidx.media3.exoplayer.video.c.f();
                    }
                    bVar.f9821d = new androidx.media3.exoplayer.video.c.g(bVar.f9820c);
                }
                androidx.media3.exoplayer.video.c cVar2 = new androidx.media3.exoplayer.video.c(bVar);
                bVar.f9824g = true;
                this.J1 = cVar2.f9804b;
            }
            this.K1 = true;
        }
        VideoSink videoSink = this.J1;
        if (videoSink == null) {
            fa.c cVar3 = this.f8927g;
            cVar3.getClass();
            dVar.f9856l = cVar3;
            dVar.f9849e = z15 ? 1 : 0;
            return;
        }
        videoSink.p(new a(), MoreExecutors.directExecutor());
        za.f fVar = this.f9788f2;
        if (fVar != null) {
            this.J1.j(fVar);
        }
        if (this.M1 != null && !this.O1.equals(s.f70057c)) {
            this.J1.e(this.M1, this.O1);
        }
        this.J1.m(this.R1);
        this.J1.setPlaybackSpeed(this.Z);
        List<Object> list = this.L1;
        if (list != null) {
            this.J1.q(list);
        }
        this.J1.i(z15);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void o(long j8, boolean z14) {
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            videoSink.v(true);
            VideoSink videoSink2 = this.J1;
            MediaCodecRenderer.c cVar = this.f9235v1;
            videoSink2.f(cVar.f9245b, cVar.f9246c, -this.f9789g2, this.f8932l);
            this.f9791i2 = true;
        }
        super.o(j8, z14);
        VideoSink videoSink3 = this.J1;
        androidx.media3.exoplayer.video.d dVar = this.E1;
        if (videoSink3 == null) {
            za.g gVar = dVar.f9846b;
            gVar.f203205m = 0L;
            gVar.f203208p = -1L;
            gVar.f203206n = -1L;
            dVar.f9852h = C.TIME_UNSET;
            dVar.f9850f = C.TIME_UNSET;
            dVar.d(1);
            dVar.f9853i = C.TIME_UNSET;
        }
        if (z14) {
            VideoSink videoSink4 = this.J1;
            if (videoSink4 != null) {
                videoSink4.n(false);
            } else {
                dVar.c(false);
            }
        }
        w0();
        this.U1 = 0;
    }

    @Override // androidx.media3.exoplayer.f
    public final void p() {
        VideoSink videoSink = this.J1;
        if (videoSink == null || !this.A1) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void q() {
        try {
            super.q();
        } finally {
            this.K1 = false;
            this.f9789g2 = C.TIME_UNSET;
            za.b bVar = this.N1;
            if (bVar != null) {
                bVar.release();
                this.N1 = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void r() {
        this.T1 = 0;
        fa.c cVar = this.f8927g;
        cVar.getClass();
        this.S1 = cVar.elapsedRealtime();
        this.W1 = 0L;
        this.X1 = 0;
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            videoSink.s();
        } else {
            this.E1.e();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public final void render(long j8, long j14) throws ExoPlaybackException {
        super.render(j8, j14);
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            try {
                videoSink.render(j8, j14);
            } catch (VideoSink.VideoSinkException e4) {
                throw l(e4, e4.format, false, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void s() {
        v0();
        int i14 = this.X1;
        if (i14 != 0) {
            long j8 = this.W1;
            f.a aVar = this.B1;
            Handler handler = aVar.f9869a;
            if (handler != null) {
                handler.post(new za.h(aVar, j8, i14));
            }
            this.W1 = 0L;
            this.X1 = 0;
        }
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            videoSink.g();
        } else {
            this.E1.f();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public final void setPlaybackSpeed(float f14, float f15) {
        super.setPlaybackSpeed(f14, f15);
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f14);
        } else {
            this.E1.i(f14);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void t(q[] qVarArr, long j8, long j14, androidx.media3.exoplayer.source.j.b bVar) {
        super.t(qVarArr, j8, j14, bVar);
        if (this.f9789g2 == C.TIME_UNSET) {
            this.f9789g2 = j8;
        }
        d0 d0Var = this.f8936p;
        if (d0Var.p()) {
            this.f9790h2 = C.TIME_UNSET;
        } else {
            bVar.getClass();
            this.f9790h2 = d0Var.g(bVar.f9519a, new d0.b()).f8190d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface u0(androidx.media3.exoplayer.mediacodec.d dVar) {
        boolean z14;
        za.b.HandlerThreadC3792b handlerThreadC3792b;
        int i14;
        RuntimeException runtimeException;
        Error error;
        VideoSink videoSink = this.J1;
        if (videoSink != null) {
            return videoSink.d();
        }
        Surface surface = this.M1;
        if (surface != null) {
            return surface;
        }
        if (z.f70071a >= 35 && dVar.f9277h) {
            return null;
        }
        fa.a.d(y0(dVar));
        za.b bVar = this.N1;
        if (bVar != null && bVar.f203169a != dVar.f9275f && bVar != null) {
            bVar.release();
            this.N1 = null;
        }
        if (this.N1 == null) {
            Context context = this.f9792z1;
            boolean z15 = dVar.f9275f;
            boolean z16 = false;
            if (z15) {
                if (!za.b.b(context)) {
                    z14 = false;
                }
                fa.a.d(z14);
                handlerThreadC3792b = new za.b.HandlerThreadC3792b();
                if (z15) {
                    i14 = za.b.f203167d;
                } else {
                    i14 = 0;
                }
                handlerThreadC3792b.start();
                Handler handler = new Handler(handlerThreadC3792b.getLooper(), handlerThreadC3792b);
                handlerThreadC3792b.f203173b = handler;
                handlerThreadC3792b.f203172a = new androidx.media3.common.util.a(handler);
                synchronized (handlerThreadC3792b) {
                    handlerThreadC3792b.f203173b.obtainMessage(1, i14, 0).sendToTarget();
                    while (handlerThreadC3792b.f203176e == null && handlerThreadC3792b.f203175d == null && handlerThreadC3792b.f203174c == null) {
                        try {
                            handlerThreadC3792b.wait();
                        } catch (InterruptedException unused) {
                            z16 = true;
                        }
                    }
                }
                if (z16) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC3792b.f203175d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC3792b.f203174c;
                if (error == null) {
                    throw error;
                }
                za.b bVar2 = handlerThreadC3792b.f203176e;
                bVar2.getClass();
                this.N1 = bVar2;
            } else {
                int i15 = za.b.f203167d;
            }
            z14 = true;
            fa.a.d(z14);
            handlerThreadC3792b = new za.b.HandlerThreadC3792b();
            if (z15) {
                i14 = za.b.f203167d;
            } else {
                i14 = 0;
            }
            handlerThreadC3792b.start();
            Handler handler2 = new Handler(handlerThreadC3792b.getLooper(), handlerThreadC3792b);
            handlerThreadC3792b.f203173b = handler2;
            handlerThreadC3792b.f203172a = new androidx.media3.common.util.a(handler2);
            synchronized (handlerThreadC3792b) {
                handlerThreadC3792b.f203173b.obtainMessage(1, i14, 0).sendToTarget();
                while (handlerThreadC3792b.f203176e == null) {
                    handlerThreadC3792b.wait();
                }
                if (z16) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = handlerThreadC3792b.f203175d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = handlerThreadC3792b.f203174c;
                if (error == null) {
                    throw error;
                }
                za.b bVar3 = handlerThreadC3792b.f203176e;
                bVar3.getClass();
                this.N1 = bVar3;
            }
        }
        return this.N1;
    }

    public final void v0() {
        if (this.T1 > 0) {
            fa.c cVar = this.f8927g;
            cVar.getClass();
            long jElapsedRealtime = cVar.elapsedRealtime();
            long j8 = jElapsedRealtime - this.S1;
            int i14 = this.T1;
            f.a aVar = this.B1;
            Handler handler = aVar.f9869a;
            if (handler != null) {
                handler.post(new za.h(aVar, i14, j8));
            }
            this.T1 = 0;
            this.S1 = jElapsedRealtime;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final h w(androidx.media3.exoplayer.mediacodec.d dVar, q qVar, q qVar2) {
        h hVarB = dVar.b(qVar, qVar2);
        int i14 = hVarB.f8980e;
        d dVar2 = this.G1;
        dVar2.getClass();
        if (qVar2.f8393u > dVar2.f9797a || qVar2.f8394v > dVar2.f9798b) {
            i14 |= 256;
        }
        if (t0(dVar, qVar2) > dVar2.f9799c) {
            i14 |= 64;
        }
        int i15 = i14;
        return new h(dVar.f9270a, qVar, qVar2, i15 != 0 ? 0 : hVarB.f8979d, i15);
    }

    public final void w0() {
        int i14;
        androidx.media3.exoplayer.mediacodec.c cVar;
        if (!this.f9785c2 || (i14 = z.f70071a) < 23 || (cVar = this.H0) == null) {
            return;
        }
        this.f9787e2 = new e(cVar);
        if (i14 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            cVar.setParameters(bundle);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException x(IllegalStateException illegalStateException, androidx.media3.exoplayer.mediacodec.d dVar) {
        return new MediaCodecVideoDecoderException(illegalStateException, dVar, this.M1);
    }

    public final void x0(androidx.media3.exoplayer.mediacodec.c cVar, int i14, long j8) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        cVar.releaseOutputBuffer(i14, j8);
        Trace.endSection();
        this.f9233u1.f8959e++;
        this.U1 = 0;
        if (this.J1 == null) {
            k0 k0Var = this.Z1;
            boolean zEquals = k0Var.equals(k0.f8334d);
            f.a aVar = this.B1;
            if (!zEquals && !k0Var.equals(this.f9783a2)) {
                this.f9783a2 = k0Var;
                aVar.a(k0Var);
            }
            androidx.media3.exoplayer.video.d dVar = this.E1;
            boolean z14 = dVar.f9849e != 3;
            dVar.f9849e = 3;
            dVar.f9851g = z.O(dVar.f9856l.elapsedRealtime());
            if (!z14 || (surface = this.M1) == null) {
                return;
            }
            Handler handler = aVar.f9869a;
            if (handler != null) {
                handler.post(new bd0.d(aVar, surface, SystemClock.elapsedRealtime(), 5));
            }
            this.P1 = true;
        }
    }

    public final boolean y0(androidx.media3.exoplayer.mediacodec.d dVar) {
        if (z.f70071a < 23 || this.f9785c2 || q0(dVar.f9270a)) {
            return false;
        }
        return !dVar.f9275f || za.b.b(this.f9792z1);
    }

    public final void z0(androidx.media3.exoplayer.mediacodec.c cVar, int i14) {
        Trace.beginSection("skipVideoBuffer");
        cVar.d(i14);
        Trace.endSection();
        this.f9233u1.f8960f++;
    }

    public b(Context context, androidx.media3.exoplayer.mediacodec.f fVar, long j8) {
        this(context, fVar, j8, null, null, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, androidx.media3.exoplayer.mediacodec.f fVar, long j8, Handler handler, f fVar2, int i14) {
        this(context, new androidx.media3.exoplayer.mediacodec.b(context), fVar, j8, false, handler, fVar2, i14, 30.0f);
        int i15 = androidx.media3.exoplayer.mediacodec.c.b.f9269a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, androidx.media3.exoplayer.mediacodec.f fVar, long j8, boolean z14, Handler handler, f fVar2, int i14) {
        this(context, new androidx.media3.exoplayer.mediacodec.b(context), fVar, j8, z14, handler, fVar2, i14, 30.0f);
        int i15 = androidx.media3.exoplayer.mediacodec.c.b.f9269a;
    }

    public b(Context context, androidx.media3.exoplayer.mediacodec.c.b bVar, androidx.media3.exoplayer.mediacodec.f fVar, long j8, boolean z14, Handler handler, f fVar2, int i14) {
        this(context, bVar, fVar, j8, z14, handler, fVar2, i14, 30.0f);
    }

    public b(Context context, androidx.media3.exoplayer.mediacodec.c.b bVar, androidx.media3.exoplayer.mediacodec.f fVar, long j8, boolean z14, Handler handler, f fVar2, int i14, float f14) {
        this(context, bVar, fVar, j8, z14, handler, fVar2, i14, f14, (VideoSink) null);
    }

    @Deprecated
    public b(Context context, androidx.media3.exoplayer.mediacodec.c.b bVar, androidx.media3.exoplayer.mediacodec.f fVar, long j8, boolean z14, Handler handler, f fVar2, int i14, float f14, za.k kVar) {
        this(context, bVar, fVar, j8, z14, handler, fVar2, i14, f14, kVar == null ? null : ((androidx.media3.exoplayer.video.c) kVar).f9804b);
    }

    public b(Context context, androidx.media3.exoplayer.mediacodec.f fVar) {
        this(context, fVar, 0L);
    }
}

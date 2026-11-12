package com.google.android.exoplayer2.audio;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService;
import fa.z;
import hc0.k;
import java.util.HashSet;
import java.util.Iterator;
import jn2.u;
import nu.h;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.s;
import sz0.i0;
import wr2.j;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f52973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52974c;

    public /* synthetic */ d(long j8, rl2.a aVar) {
        this.f52972a = 3;
        this.f52973b = j8;
        this.f52974c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f52972a;
        long j8 = this.f52973b;
        Object obj = this.f52974c;
        switch (i14) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$positionAdvancing$3(j8);
                return;
            case 1:
                AudioPromptsService.e eVar = ((com.garmin.android.apps.connectmobile.audioprompts.b) obj).f30224b;
                if (eVar != null) {
                    h hVar = AudioPromptsService.this.f30197d;
                    if (hVar != null) {
                        hVar.e(j8);
                        return;
                    } else {
                        s.m("tts");
                        throw null;
                    }
                }
                return;
            case 2:
                hc0.b bVar = ((k) obj).f83255x;
                if (bVar != null) {
                    bVar.a(j8);
                    return;
                }
                return;
            case 3:
                rl2.a aVar = (rl2.a) obj;
                HashSet hashSet = u.f99682c;
                hs2.a aVarC = u.f99685f.c(j8);
                Logger logger = u.f99681b;
                logger.debug("handleNfcFailed(" + j8 + "): reason " + aVar);
                int i15 = u.a.f99688b[aVar.ordinal()];
                if (i15 != 1 && i15 != 2 && i15 != 3) {
                    if (i15 != 4) {
                        logger.warn(v.h.u(j8, "handleNfcFailed(", "): Unknown failure reason ", aVar.name()));
                        return;
                    }
                    logger.warn("handleNfcFailed(" + j8 + "): firmware not capable, notifying listeners...");
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((hs2.e) it.next()).d(j8, hs2.e.a.FIRMWARE_MISSING_REQUIRED_CMDS);
                        j.f186862a.getClass();
                        j.c("firmwareUpdateNeeded");
                    }
                    return;
                }
                if (aVarC != null) {
                    u.f99680a.getClass();
                    u.c(aVarC, j8);
                    return;
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((hs2.e) it3.next()).d(j8, hs2.e.a.NFC_STACK_FAILED);
                    int i16 = u.a.f99688b[aVar.ordinal()];
                    if (i16 == 1) {
                        j.f186862a.getClass();
                        j.c("invalidCapStatus");
                    } else if (i16 == 2) {
                        j.f186862a.getClass();
                        j.c("invalidNfcCapabilities(timeout)");
                    } else if (i16 != 3) {
                        logger.warn(v.h.u(j8, "handleNfcFailed(", "): Unknown failure reason ", aVar.name()));
                    } else {
                        j.f186862a.getClass();
                        j.c(PrivacyUpdateRequestError.UNKNOWN);
                    }
                }
                return;
            case 4:
                androidx.media3.exoplayer.audio.b bVar2 = ((androidx.media3.exoplayer.audio.b.a) obj).f8767b;
                int i17 = z.f70071a;
                bVar2.onAudioPositionAdvancing(j8);
                return;
            default:
                int i18 = sz0.u.E;
                i0 i0VarD7 = ((sz0.u) obj).d7();
                int i19 = i0.f161413r;
                i0VarD7.z4(j8, false);
                return;
        }
    }

    public /* synthetic */ d(Object obj, long j8, int i14) {
        this.f52972a = i14;
        this.f52974c = obj;
        this.f52973b = j8;
    }
}

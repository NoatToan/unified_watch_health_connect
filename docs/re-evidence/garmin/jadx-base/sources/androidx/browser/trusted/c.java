package androidx.browser.trusted;

import android.content.pm.ProviderInfo;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.x0;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityScreenListActivity;
import com.garmin.android.apps.connectmobile.settings.devices.DefaultScreenListActivity;
import com.garmin.android.apps.connectmobile.settings.devices.ReordableActivityScreenListActivity;
import com.garmin.android.apps.connectmobile.settings.devices.ReordableDefaultScreenListActivity;
import com.github.mikephil.chartingv2.data.Entry;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import d53.u;
import d53.y;
import f20.o;
import g2.t0;
import h5.e0;
import j23.l;
import java.io.File;
import java.util.Comparator;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.input.BOMInputStream;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.jvm.internal.s;
import p1.c0;
import p3.w0;
import wd2.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5317a;

    public /* synthetic */ c(int i14) {
        this.f5317a = i14;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5317a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr != bArr2) {
                    if (bArr == null) {
                        return -1;
                    }
                    if (bArr2 == null) {
                        return 1;
                    }
                    for (int i14 = 0; i14 < Math.min(bArr.length, bArr2.length); i14++) {
                        byte b14 = bArr[i14];
                        byte b15 = bArr2[i14];
                        if (b14 != b15) {
                            return b14 - b15;
                        }
                    }
                    if (bArr.length != bArr2.length) {
                        return bArr.length - bArr2.length;
                    }
                }
                return 0;
            case 1:
                c cVar = a2.O;
                return ((x0.a) obj).b().compareTo(((x0.a) obj2).b());
            case 2:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            case 3:
                return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            case 4:
                return ((Double) obj).compareTo((Double) obj2);
            case 5:
                return CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
            case 6:
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            case 7:
                dk2.h hVar = (dk2.h) obj;
                dk2.h hVar2 = (dk2.h) obj2;
                dk2.d.a aVar = dk2.d.f60235m;
                if (hVar.getF60246j() == hVar2.getF60246j()) {
                    return 0;
                }
                if (hVar.getF60246j() == null) {
                    return -1;
                }
                if (hVar2.getF60246j() == null) {
                    return 1;
                }
                return r13.a.b(hVar2.getF60246j(), hVar.getF60246j());
            case 8:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                Character chQ0 = y.q0(oVar.f68408d);
                boolean z14 = chQ0 != null && Character.isLetter(chQ0.charValue());
                Character chQ1 = y.q0(oVar2.f68408d);
                boolean z15 = chQ1 != null && Character.isLetter(chQ1.charValue());
                if ((z14 && z15) || (!z14 && !z15)) {
                    return u.l(oVar.f68408d, oVar2.f68408d);
                }
                if (!z14 || z15) {
                    return (z14 || !z15) ? 0 : 1;
                }
                return -1;
            case 9:
                o oVar3 = (o) obj;
                o oVar4 = (o) obj2;
                Character chQ2 = y.q0(oVar3.f68408d);
                boolean z16 = chQ2 != null && Character.isLetter(chQ2.charValue());
                Character chQ3 = y.q0(oVar4.f68408d);
                boolean z17 = chQ3 != null && Character.isLetter(chQ3.charValue());
                if ((z16 && z17) || (!z16 && !z17)) {
                    return u.l(oVar3.f68408d, oVar4.f68408d);
                }
                if (!z16 || z17) {
                    return (z16 || !z17) ? 0 : 1;
                }
                return -1;
            case 10:
                g2.a.C1514a c1514a = g2.a.f75012h;
                return s.h(((g2.a2) obj2).f75027a, ((g2.a2) obj).f75027a);
            case 11:
                return s.h(((t0) obj).getIndex(), ((t0) obj2).getIndex());
            case 12:
                return Integer.compare(((gc.e.b) obj).f76806a.f76809b, ((gc.e.b) obj2).f76806a.f76809b);
            case 13:
                return Long.compare(((gc.d) obj).f76799b, ((gc.d) obj2).f76799b);
            case 14:
                e0 e0Var = (e0) obj;
                e0 e0Var2 = (e0) obj2;
                e0.d dVar = e0.N0;
                float f14 = e0Var.T.f81853p.P;
                float f15 = e0Var2.T.f81853p.P;
                return f14 == f15 ? s.h(e0Var.L(), e0Var2.L()) : Float.compare(f14, f15);
            case 15:
                byte[] bArr3 = (byte[]) obj;
                byte[] bArr4 = (byte[]) obj2;
                c0<i7.d.b, ProviderInfo> c0Var = i7.d.f91905a;
                if (bArr3.length != bArr4.length) {
                    return bArr3.length - bArr4.length;
                }
                for (int i15 = 0; i15 < bArr3.length; i15++) {
                    byte b16 = bArr3[i15];
                    byte b17 = bArr4[i15];
                    if (b16 != b17) {
                        return b16 - b17;
                    }
                }
                return 0;
            case 16:
                androidx.media3.ui.d.c cVar2 = (androidx.media3.ui.d.c) obj;
                androidx.media3.ui.d.c cVar3 = (androidx.media3.ui.d.c) obj2;
                int iCompare = Integer.compare(cVar3.f10112b, cVar2.f10112b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = cVar2.f10113c.compareTo(cVar3.f10113c);
                return iCompareTo != 0 ? iCompareTo : cVar2.f10114d.compareTo(cVar3.f10114d);
            case 17:
                androidx.media3.ui.d.c cVar4 = (androidx.media3.ui.d.c) obj;
                androidx.media3.ui.d.c cVar5 = (androidx.media3.ui.d.c) obj2;
                int iCompare2 = Integer.compare(cVar5.f10111a, cVar4.f10111a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = cVar5.f10113c.compareTo(cVar4.f10113c);
                return iCompareTo2 != 0 ? iCompareTo2 : cVar5.f10114d.compareTo(cVar4.f10114d);
            case 18:
                ev0.b bVar = (ev0.b) obj;
                ev0.b bVar2 = (ev0.b) obj2;
                z1 z1Var = bVar.f66150k;
                DateTime dateTime = z1Var != null ? z1Var.f184695c : null;
                z1 z1Var2 = bVar2.f66150k;
                boolean z18 = bVar2.f66143d;
                DateTime dateTime2 = z1Var2 != null ? z1Var2.f184695c : null;
                if (bVar.a() && !bVar2.a()) {
                    return -1;
                }
                if (bVar.a() || !bVar2.a()) {
                    if (dateTime != null && dateTime2 != null) {
                        return dateTime.compareTo((ReadableInstant) dateTime2);
                    }
                    boolean z19 = bVar.f66143d;
                    if (z19 && !z18) {
                        return -1;
                    }
                    if (z19 || !z18) {
                        return 0;
                    }
                }
                return 1;
            case 19:
                int i16 = ActivityScreenListActivity.f41771j;
                return ((com.garmin.android.apps.connectmobile.devices.model.y) obj).f34329b - ((com.garmin.android.apps.connectmobile.devices.model.y) obj2).f34329b;
            case 20:
                int i17 = DefaultScreenListActivity.f41955j;
                return ((com.garmin.android.apps.connectmobile.devices.model.y) obj).f34329b - ((com.garmin.android.apps.connectmobile.devices.model.y) obj2).f34329b;
            case 21:
                int i18 = ReordableActivityScreenListActivity.f42164i;
                return ((com.garmin.android.apps.connectmobile.devices.model.y) obj).f34329b - ((com.garmin.android.apps.connectmobile.devices.model.y) obj2).f34329b;
            case 22:
                int i19 = ReordableDefaultScreenListActivity.f42165i;
                return ((com.garmin.android.apps.connectmobile.devices.model.y) obj).f34329b - ((com.garmin.android.apps.connectmobile.devices.model.y) obj2).f34329b;
            case 23:
                return Rule.Phoneme.lambda$static$0((Rule.Phoneme) obj, (Rule.Phoneme) obj2);
            case 24:
                return BOMInputStream.lambda$static$0((ByteOrderMark) obj, (ByteOrderMark) obj2);
            case 25:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 26:
                return s.h(((w0) obj).f135366b, ((w0) obj2).f135366b);
            case 27:
                return ((Entry) obj).getXIndex() - ((Entry) obj2).getXIndex();
            case 28:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            default:
                l lVar = (l) obj;
                l lVar2 = (l) obj2;
                return (lVar.f96797b - lVar.f96796a) - (lVar2.f96797b - lVar2.f96796a);
        }
    }
}

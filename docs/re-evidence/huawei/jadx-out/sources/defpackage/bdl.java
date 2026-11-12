package defpackage;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.generator.WatchFaceClock;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes23.dex */
public class bdl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Random f1044c = new Random();

    public static WatchFaceClock e(Pattern pattern, ColorResult colorResult, bfz.d dVar) throws bdo {
        WatchFaceClock watchFaceClock;
        bfz.c cVarA = a(colorResult, dVar);
        if (bdn.d().equals(new Locale(MLAsrConstants.LAN_ZH, "", "").getLanguage())) {
            watchFaceClock = new WatchFaceClock(cVarA.b(), cVarA.d());
        } else {
            watchFaceClock = new WatchFaceClock(cVarA.b(), cVarA.a());
        }
        if (cVarA.e() != null && bdn.h()) {
            cVarA.e().process(watchFaceClock, colorResult, pattern.getFinalColors());
        }
        return watchFaceClock;
    }

    private static bfz.c a(final ColorResult colorResult, bfz.d dVar) throws bdo {
        if (dVar.c().isEmpty()) {
            throw new bdo("clock is not configured");
        }
        List list = (List) dVar.c().stream().filter(new Predicate() { // from class: bds
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bdl.e(colorResult, (bfz.c) obj);
            }
        }).collect(Collectors.toList());
        if (list.isEmpty()) {
            throw new bdo("clock is not configured");
        }
        return (bfz.c) list.get(f1044c.nextInt(list.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(ColorResult colorResult, bfz.c cVar) {
        if (bdn.h()) {
            return cVar.c() == null;
        }
        if (bgf.b(colorResult.getMainColors()).c() <= 0.7f) {
            return CervicalMucusRecord.Sensation.LIGHT.equals(cVar.c()) || "dark|light".equals(cVar.c());
        }
        return "dark".equals(cVar.c()) || "dark|light".equals(cVar.c());
    }
}

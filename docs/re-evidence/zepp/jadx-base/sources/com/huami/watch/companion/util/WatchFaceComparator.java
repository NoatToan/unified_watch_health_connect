package com.huami.watch.companion.util;

import com.huami.watch.companion.watchface.WatchFace;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceComparator implements Comparator<Object> {
    private static final String b = "com.huami.watch.watchface.analogyellow";
    private static final String[] c = {"com.huami.watch.watchface.DigitalWatchFaceSportOne", "com.huami.watch.watchface.DigitalWatchFaceSportTwo", "com.huami.watch.watchface.DigitalWatchFaceSportFive", "com.huami.watch.watchface.DigitalWatchFaceSportEight", "com.huami.watch.watchface.DigitalWatchFaceSportSeven", "com.huami.watch.watchface.DigitalWatchFaceSportThree", "com.huami.watch.watchface.DigitalSport4WatchFace", "com.huami.watch.watchface.DigitalWatchFaceSportSix", "com.huami.watch.watchface.SunriseDigitalWatchFace", "com.huami.watch.watchface.CubeDigitalWatchFace", "com.huami.watch.watchface.GreenAnalogWatchFace", "com.huami.watch.watchface.AnalogWatchFaceNine", "com.huami.watch.watchface.AnalogWatchFaceTen", "com.huami.watch.watchface.AnalogWatchFaceEleven", "com.huami.watch.watchface.DigitalWatchFaceSportTwelve", "com.huami.watch.watchface.AnalogWatchFaceThirteen", "com.huami.watch.watchface.AnalogWatchFaceFourteen"};
    private ConcurrentHashMap<String, Integer> a = null;

    public WatchFaceComparator() {
        a();
    }

    private void a() {
        int length = c.length;
        this.a = new ConcurrentHashMap<>(length);
        int i = 0;
        while (i < length) {
            i++;
            this.a.put("com.huami.watch.watchface.analogyellow_" + c[i], Integer.valueOf(i));
        }
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? 0 : 1;
        }
        if (obj2 == null) {
            return -1;
        }
        if (!(obj instanceof WatchFace)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        WatchFace watchFace = (WatchFace) obj;
        sb.append(watchFace.packageName);
        sb.append("_");
        sb.append(watchFace.serviceName);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        WatchFace watchFace2 = (WatchFace) obj2;
        sb2.append(watchFace2.packageName);
        sb2.append("_");
        sb2.append(watchFace2.serviceName);
        String string2 = sb2.toString();
        Integer num = this.a.get(string);
        Integer num2 = this.a.get(string2);
        if (num == null) {
            return num2 == null ? 0 : 1;
        }
        if (num2 == null) {
            return -1;
        }
        return num.intValue() - num2.intValue();
    }
}

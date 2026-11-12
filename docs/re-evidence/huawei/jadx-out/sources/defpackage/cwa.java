package defpackage;

import android.text.TextUtils;
import com.huawei.featureuserprofile.route.hwgpxmodel.Gpx;
import com.huawei.featureuserprofile.route.hwgpxmodel.Track;
import com.huawei.featureuserprofile.route.hwgpxmodel.TrackSegment;
import com.huawei.featureuserprofile.route.hwgpxmodel.xmlparser.Obj2XmlSerializer;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.health.userprofilemgr.api.RouteApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.HeartInfo;
import com.huawei.route.LbsInfo;
import com.huawei.route.Point;
import com.huawei.route.RouteType;
import com.huawei.route.TrackInfo;
import com.huawei.wearengine.sensor.DataResult;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes23.dex */
@ApiDefine(uri = RouteApi.class)
@Singleton
public class cwa implements RouteApi {
    private NavigationFileParser d;

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public int startParser(InputStream inputStream, String str) throws XmlPullParserException, IOException {
        NavigationFileParser navigationFileParser = new NavigationFileParser();
        this.d = navigationFileParser;
        try {
            return navigationFileParser.navigationParser(inputStream, str);
        } catch (ParseException unused) {
            LogUtil.a("RouteImpl", "startParser parseException");
            return 0;
        }
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public List<Point> getPoints() {
        NavigationFileParser navigationFileParser = this.d;
        if (navigationFileParser != null) {
            return navigationFileParser.getPoints();
        }
        return new ArrayList(0);
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public String getSportType() {
        NavigationFileParser navigationFileParser = this.d;
        if (navigationFileParser != null) {
            return navigationFileParser.getSportType();
        }
        return "";
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public int getRouteType() {
        NavigationFileParser navigationFileParser = this.d;
        if (navigationFileParser != null) {
            return navigationFileParser.getRouteType();
        }
        return RouteType.DEFAULT.routeType();
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public double getSportTotalDistance() {
        NavigationFileParser navigationFileParser = this.d;
        if (navigationFileParser != null) {
            return navigationFileParser.getSportTotalDistance();
        }
        return 0.0d;
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public double getSportTotalTime() {
        NavigationFileParser navigationFileParser = this.d;
        if (navigationFileParser != null) {
            return navigationFileParser.getSportTotalTime();
        }
        return 0.0d;
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public double getCumulativeClimb() {
        NavigationFileParser navigationFileParser = this.d;
        if (navigationFileParser != null) {
            return navigationFileParser.getCumulativeClimb();
        }
        return 0.0d;
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public double getCumulativeDecrease() {
        NavigationFileParser navigationFileParser = this.d;
        if (navigationFileParser != null) {
            return navigationFileParser.getCumulativeDecrease();
        }
        return 0.0d;
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public File generateGpxFile(HiHealthData hiHealthData, String str, String str2, Map<String, Object> map, TrackInfo trackInfo) throws XmlPullParserException, IOException {
        LbsInfo lbsInfo = trackInfo.getLbsInfo();
        if (TextUtils.isEmpty(str2) || lbsInfo == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        Date date = new Date();
        Gpx gpx = new Gpx();
        date.setTime(hiHealthData.getStartTime());
        gpx.addMetadata("time", simpleDateFormat.format(date));
        TrackSegment trackSegment = new TrackSegment();
        if (njy.e(trackInfo.getHeartInfoList())) {
            e(trackInfo, simpleDateFormat, date, trackSegment);
        } else {
            a(trackInfo, simpleDateFormat, date, trackSegment);
        }
        Track track = new Track();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                track.addExtension(entry.getKey(), entry.getValue());
            }
        }
        track.setType(str);
        track.addTrackSegment(trackSegment);
        gpx.addTrack(track);
        Obj2XmlSerializer obj2XmlSerializer = new Obj2XmlSerializer();
        File file = new File(str2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                obj2XmlSerializer.toXml(gpx, bufferedOutputStream);
                bufferedOutputStream.close();
                fileOutputStream.close();
                return file;
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static void a(TrackInfo trackInfo, SimpleDateFormat simpleDateFormat, Date date, TrackSegment trackSegment) {
        List<HeartInfo> heartInfoList = trackInfo.getHeartInfoList();
        double[] lats = trackInfo.getLbsInfo().getLats();
        double[] lons = trackInfo.getLbsInfo().getLons();
        long[] times = trackInfo.getLbsInfo().getTimes();
        if (trackInfo.getLbsInfo().isValid()) {
            int i = 0;
            int i2 = 0;
            while (i < trackInfo.getLbsInfo().getRealSize()) {
                while (true) {
                    if (i2 < heartInfoList.size()) {
                        int i3 = i + 1;
                        long j = i3 < trackInfo.getLbsInfo().getRealSize() ? times[i3] : times[i];
                        long time = heartInfoList.get(i2).getTime();
                        long j2 = times[i];
                        if (time < j2) {
                            i2++;
                        } else if (j2 <= heartInfoList.get(i2).getTime() && heartInfoList.get(i2).getTime() < j) {
                            date.setTime(times[i]);
                            trackSegment.addTrackPoint(lats[i], lons[i], simpleDateFormat.format(date), heartInfoList.get(i2).getHeartRate());
                            i2++;
                            i = i3;
                        }
                    }
                    if (i < times.length) {
                        date.setTime(times[i]);
                        trackSegment.addTrackPoint(lats[i], lons[i], simpleDateFormat.format(date));
                    } else {
                        LogUtil.a("RouteImpl", "index isOutOfBounds");
                    }
                    i++;
                }
            }
        }
    }

    private static void e(TrackInfo trackInfo, SimpleDateFormat simpleDateFormat, Date date, TrackSegment trackSegment) {
        double[] lats = trackInfo.getLbsInfo().getLats();
        double[] lons = trackInfo.getLbsInfo().getLons();
        long[] times = trackInfo.getLbsInfo().getTimes();
        if (trackInfo.getLbsInfo().isValid()) {
            for (int i = 0; i < trackInfo.getLbsInfo().getRealSize(); i++) {
                if (i < times.length) {
                    date.setTime(times[i]);
                    trackSegment.addTrackPoint(lats[i], lons[i], simpleDateFormat.format(date));
                } else {
                    LogUtil.a("RouteImpl", "index isOutOfBounds");
                }
            }
            return;
        }
        LogUtil.a("RouteImpl", "lbsInfo is invalid");
    }

    @Override // com.huawei.health.userprofilemgr.api.RouteApi
    public File generateGpxFile(HiHealthData hiHealthData, String str, String str2, Map<String, Object> map, LbsInfo lbsInfo) throws XmlPullParserException, IOException {
        TrackInfo trackInfo = new TrackInfo();
        trackInfo.setLbsInfo(lbsInfo);
        return generateGpxFile(hiHealthData, str, str2, map, trackInfo);
    }
}

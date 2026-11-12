package com.huawei.openalliance.ad;

import android.text.TextUtils;
import android.util.Xml;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.vast.ClickThrough;
import com.huawei.openalliance.ad.beans.vast.Creative;
import com.huawei.openalliance.ad.beans.vast.Impression;
import com.huawei.openalliance.ad.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.beans.vast.NonLinear;
import com.huawei.openalliance.ad.beans.vast.NonLinearAds;
import com.huawei.openalliance.ad.beans.vast.StaticResource;
import com.huawei.openalliance.ad.beans.vast.Tracking;
import com.huawei.openalliance.ad.beans.vast.VastContent;
import com.huawei.openalliance.ad.beans.vast.VastIcon;
import com.huawei.openalliance.ad.beans.vast.VastMediaFile;
import com.huawei.openalliance.ad.beans.vast.VideoClicks;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.constant.MimeType;
import com.huawei.openalliance.ad.constant.VastTag;
import com.huawei.openalliance.ad.constant.VastVersion;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.inter.HiAd;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public class qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, EventType> f20123a;

    private static List<ImageInfo> c(NonLinearAds nonLinearAds) {
        List<NonLinear> listB;
        ImageInfo imageInfoA;
        if (nonLinearAds == null || (listB = nonLinearAds.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NonLinear nonLinear : listB) {
            if (nonLinear != null && (imageInfoA = a(nonLinear.a())) != null) {
                arrayList.add(imageInfoA);
            }
        }
        return arrayList;
    }

    private static String c(LinearCreative linearCreative) {
        VideoClicks videoClicksE;
        ClickThrough clickThroughA;
        if (linearCreative == null || (videoClicksE = linearCreative.e()) == null || (clickThroughA = videoClicksE.a()) == null) {
            return null;
        }
        return clickThroughA.a();
    }

    private static List<Monitor> b(ContentRecord contentRecord) {
        EncryptionField<List<Monitor>> encryptionFieldM;
        if (contentRecord == null || (encryptionFieldM = contentRecord.M()) == null) {
            return null;
        }
        return encryptionFieldM.a(HiAd.a().d());
    }

    private static List<ImageInfo> b(LinearCreative linearCreative) {
        if (linearCreative == null) {
            return null;
        }
        List<VastIcon> listD = linearCreative.d();
        if (com.huawei.openalliance.ad.utils.bm.a(listD)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VastIcon vastIcon : listD) {
            ImageInfo imageInfoA = a(vastIcon.c());
            if (imageInfoA != null) {
                imageInfoA.b(vastIcon.a());
                imageInfoA.a(vastIcon.b());
                arrayList.add(imageInfoA);
            }
        }
        return arrayList;
    }

    private static String b(NonLinearAds nonLinearAds) {
        NonLinear nonLinear;
        if (nonLinearAds == null) {
            return null;
        }
        List<NonLinear> listB = nonLinearAds.b();
        if (com.huawei.openalliance.ad.utils.bm.a(listB) || (nonLinear = listB.get(0)) == null) {
            return null;
        }
        return nonLinear.b();
    }

    private static MediaFile b(VastMediaFile vastMediaFile, MetaData metaData) {
        if (vastMediaFile == null) {
            return null;
        }
        MediaFile mediaFile = metaData.v() == null ? new MediaFile() : metaData.v();
        mediaFile.b(vastMediaFile.d());
        mediaFile.b(vastMediaFile.c());
        mediaFile.a(vastMediaFile.b());
        mediaFile.e(2);
        return mediaFile;
    }

    private static boolean a(NonLinearAds nonLinearAds) {
        if (!com.huawei.openalliance.ad.utils.bm.a(nonLinearAds.b())) {
            return true;
        }
        hw.b("VastAdapter", "no nonlinear ads in nonlinear creative, skip parse vastInfo.");
        return false;
    }

    private static boolean a(LinearCreative linearCreative, NonLinearAds nonLinearAds) {
        return a(linearCreative) && a(nonLinearAds);
    }

    private static boolean a(LinearCreative linearCreative) {
        if (!com.huawei.openalliance.ad.utils.bm.a(linearCreative.b())) {
            return true;
        }
        hw.b("VastAdapter", "no media file in linear creative, skip parse vastInfo.");
        return false;
    }

    private static boolean a(int i, int i2, LinearCreative linearCreative) {
        if (i != 3) {
            return i == 7 && com.huawei.openalliance.ad.utils.bi.f(i2);
        }
        if (9 == i2 || 12 == i2 || 106 == i2 || 6 == i2) {
            return true;
        }
        return linearCreative != null && a(linearCreative);
    }

    private static void a(Map<String, Monitor> map, List<Monitor> list) {
        if (com.huawei.openalliance.ad.utils.bm.a(list) || map == null) {
            return;
        }
        for (Monitor monitor : list) {
            if (monitor != null) {
                String strA = monitor.a();
                Monitor monitor2 = map.get(strA);
                if (monitor2 != null) {
                    HashSet hashSet = new HashSet(monitor2.b());
                    hashSet.addAll(monitor.b());
                    monitor2.a(new ArrayList(hashSet));
                    map.put(strA, monitor2);
                } else {
                    map.put(monitor.a(), monitor);
                }
            }
        }
    }

    private static void a(List<Monitor> list, Map<String, List<Tracking>> map, String str, EventType eventType) {
        if (list == null || com.huawei.openalliance.ad.utils.br.a(map) || TextUtils.isEmpty(str) || eventType == null || !map.containsKey(str)) {
            return;
        }
        List<Tracking> list2 = map.get(str);
        if (com.huawei.openalliance.ad.utils.bm.a(list2)) {
            return;
        }
        list.add(a(list2, eventType));
    }

    public static void a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        MetaData metaDataJ = contentRecord.j();
        int iF = contentRecord.f();
        VastContent vastContentA = a(metaDataJ, iF, contentRecord.F());
        a(metaDataJ, vastContentA, iF);
        contentRecord.b(com.huawei.openalliance.ad.utils.bk.b(metaDataJ));
        a(vastContentA, contentRecord);
    }

    private static void a(VastContent vastContent, ContentRecord contentRecord) {
        List<ImageInfo> listP;
        int iE;
        if (vastContent == null || contentRecord == null) {
            return;
        }
        contentRecord.d(true);
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ != null) {
            contentRecord.k(metaDataJ.h());
        }
        List<Monitor> listA = a(vastContent);
        if (hw.a()) {
            hw.a("VastAdapter", "monitors from vast: %s", com.huawei.openalliance.ad.utils.ds.a(com.huawei.openalliance.ad.utils.bk.b(listA)));
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
            List<Monitor> listB = b(contentRecord);
            if (!com.huawei.openalliance.ad.utils.bm.a(listB)) {
                listA = a(listB, listA);
            }
            contentRecord.c(listA);
        }
        VideoInfo videoInfoT = contentRecord.T();
        if (videoInfoT != null) {
            Float fM = videoInfoT.m();
            if (fM == null) {
                return;
            }
            iE = (int) ((720 * 1.0f) / fM.floatValue());
            contentRecord.f(720);
        } else {
            if (metaDataJ == null || (listP = metaDataJ.p()) == null || listP.size() <= 0) {
                return;
            }
            ImageInfo imageInfo = listP.get(0);
            contentRecord.i(imageInfo.c());
            contentRecord.f(imageInfo.d());
            iE = imageInfo.e();
        }
        contentRecord.g(iE);
    }

    public static void a(MetaData metaData, VastContent vastContent, int i, boolean z) {
        if (metaData == null || vastContent == null) {
            return;
        }
        List<Creative> listE = vastContent.e();
        if (com.huawei.openalliance.ad.utils.bm.a(listE)) {
            return;
        }
        Creative creative = listE.get(0);
        if (creative == null) {
            hw.b("VastAdapter", "vast creative empty, skip merge.");
            return;
        }
        hw.a("VastAdapter", "merge metadata.");
        a(metaData, creative.b());
        a(metaData, i, creative.a());
        if (!TextUtils.isEmpty(vastContent.c())) {
            metaData.c(vastContent.c());
        }
        if (!TextUtils.isEmpty(vastContent.f())) {
            metaData.e(vastContent.f());
        }
        if (!TextUtils.isEmpty(vastContent.b())) {
            metaData.b(vastContent.b());
        }
        if (z) {
            metaData.q(null);
        }
    }

    public static void a(MetaData metaData, VastContent vastContent, int i) {
        a(metaData, vastContent, i, true);
    }

    private static void a(MetaData metaData, NonLinearAds nonLinearAds) {
        List<ImageInfo> listC = c(nonLinearAds);
        if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
            Iterator<ImageInfo> it = listC.iterator();
            while (it.hasNext()) {
                it.next().d(1);
            }
            metaData.b(listC);
        }
        String strB = b(nonLinearAds);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        metaData.d(strB);
    }

    private static void a(MetaData metaData, int i, LinearCreative linearCreative) {
        VideoInfo videoInfoA;
        MediaFile mediaFileB;
        VastMediaFile vastMediaFileA = a(linearCreative.b());
        if (vastMediaFileA != null && 60 == i && (mediaFileB = b(vastMediaFileA, metaData)) != null) {
            metaData.a(mediaFileB);
            if (linearCreative.a() > 0) {
                metaData.c(linearCreative.a());
            }
        }
        if (vastMediaFileA != null && 60 != i && (videoInfoA = a(vastMediaFileA, metaData)) != null) {
            metaData.a(videoInfoA);
            if (linearCreative.a() > 0) {
                videoInfoA.a(linearCreative.a());
                metaData.c(linearCreative.a());
            }
        }
        String strC = c(linearCreative);
        if (!TextUtils.isEmpty(strC)) {
            metaData.d(strC);
        }
        List<ImageInfo> listB = b(linearCreative);
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return;
        }
        metaData.a(listB);
    }

    private static XmlPullParser a(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        xmlPullParserNewPullParser.nextTag();
        xmlPullParserNewPullParser.require(2, VastTag.NAMESPACE, VastTag.VAST);
        return xmlPullParserNewPullParser;
    }

    public static List<Monitor> a(List<Monitor> list, List<Monitor> list2) {
        HashMap map = new HashMap();
        a(map, list);
        a(map, list2);
        return com.huawei.openalliance.ad.utils.br.a(map) ? Collections.EMPTY_LIST : new ArrayList(map.values());
    }

    public static List<Monitor> a(VastContent vastContent) {
        ArrayList arrayList = null;
        if (vastContent == null) {
            return null;
        }
        List<Creative> listE = vastContent.e();
        if (!com.huawei.openalliance.ad.utils.bm.a(listE) && listE.size() <= 1) {
            Creative creative = listE.get(0);
            if (creative == null) {
                return null;
            }
            arrayList = new ArrayList();
            List<Impression> listD = vastContent.d();
            if (!com.huawei.openalliance.ad.utils.bm.a(listD)) {
                Monitor monitor = new Monitor();
                monitor.a(EventType.SHOW.value());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Impression> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().a());
                }
                monitor.a(arrayList2);
                arrayList.add(monitor);
            }
            if (creative.a() != null && creative.a().e() != null) {
                List<Tracking> listB = creative.a().e().b();
                if (!com.huawei.openalliance.ad.utils.bm.a(listB)) {
                    arrayList.add(a(listB, EventType.CLICK));
                }
            }
            HashMap map = new HashMap();
            if (creative.a() != null && !com.huawei.openalliance.ad.utils.br.a(creative.a().c())) {
                map.putAll(creative.a().c());
            }
            if (creative.b() != null && !com.huawei.openalliance.ad.utils.br.a(creative.b().a())) {
                map.putAll(creative.b().a());
            }
            if (!com.huawei.openalliance.ad.utils.br.a(map)) {
                for (Map.Entry<String, EventType> entry : f20123a.entrySet()) {
                    a(arrayList, map, entry.getKey(), entry.getValue());
                }
            }
        }
        return arrayList;
    }

    private static VastVersion a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(VastTag.NAMESPACE, "version");
        if (com.huawei.openalliance.ad.utils.dg.b(attributeValue)) {
            hw.d("VastAdapter", "Required version attribute in VAST tag");
        }
        return VastVersion.getVerFromStr(attributeValue);
    }

    private static VastMediaFile a(List<VastMediaFile> list) {
        VastMediaFile next;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return null;
        }
        Iterator<VastMediaFile> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && "video/mp4".equalsIgnoreCase(next.a())) {
                break;
            }
        }
        if (next != null && !TextUtils.isEmpty(next.d()) && next.c() != 0 && next.b() != 0) {
            return next;
        }
        hw.b("VastAdapter", "vast mediaFile missing required attribute.");
        return null;
    }

    public static VastContent a(MetaData metaData, int i, int i2) {
        ByteArrayInputStream byteArrayInputStream;
        if (metaData == null) {
            return null;
        }
        String strK = metaData.K();
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        if (hw.a()) {
            hw.a("VastAdapter", "parse vastInfo.");
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(strK.getBytes("UTF-8"));
            try {
                XmlPullParser xmlPullParserA = a(byteArrayInputStream);
                ru.a(a(xmlPullParserA));
                List<VastContent> listA = ru.a().a(xmlPullParserA);
                if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
                    hw.b("VastAdapter", "parse vast info but vast content is empty");
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    return null;
                }
                if (listA.size() > 1) {
                    hw.b("VastAdapter", "multi vast content, skip parse vastInfo.");
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    return null;
                }
                VastContent vastContent = listA.get(0);
                List<Creative> listE = vastContent.e();
                if (com.huawei.openalliance.ad.utils.bm.a(listE)) {
                    hw.b("VastAdapter", "vast creatives empty, skip parse vastInfo.");
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    return null;
                }
                if (listE.size() > 1) {
                    hw.b("VastAdapter", "multi vast creative, skip parse vastInfo.");
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    return null;
                }
                Creative creative = listE.get(0);
                if (creative == null) {
                    hw.b("VastAdapter", "creative null, skip parse vastInfo.");
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    return null;
                }
                LinearCreative linearCreativeA = creative.a();
                NonLinearAds nonLinearAdsB = creative.b();
                if (a(i, i2, linearCreativeA)) {
                    if (linearCreativeA != null && nonLinearAdsB != null) {
                        if (!a(linearCreativeA, nonLinearAdsB)) {
                            hw.b("VastAdapter", "check ads with linear and nonlinear failed, skip parse vastInfo.");
                            com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                            return null;
                        }
                    }
                    hw.b("VastAdapter", "need both linear and nonlinear ad, skip parse vastInfo.");
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    return null;
                }
                if (!a(linearCreativeA)) {
                    hw.b("VastAdapter", "not valid linear creative, skip parse vastInfo.");
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    return null;
                }
                com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                return vastContent;
            } catch (Throwable th) {
                th = th;
                try {
                    hw.c("VastAdapter", "parseVastInfo error: %s", th.getClass().getSimpleName());
                    return null;
                } finally {
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
        }
    }

    private static VideoInfo a(VastMediaFile vastMediaFile, MetaData metaData) {
        if (vastMediaFile == null) {
            return null;
        }
        VideoInfo videoInfo = metaData.d() == null ? new VideoInfo() : metaData.d();
        videoInfo.a(vastMediaFile.d());
        if (vastMediaFile.c() != 0) {
            videoInfo.a(Float.valueOf(vastMediaFile.b() / vastMediaFile.c()));
        }
        videoInfo.e(1);
        videoInfo.b(0);
        return videoInfo;
    }

    private static Monitor a(List<Tracking> list, EventType eventType) {
        if (com.huawei.openalliance.ad.utils.bm.a(list) || eventType == null) {
            return null;
        }
        Monitor monitor = new Monitor();
        monitor.a(eventType.value());
        ArrayList arrayList = new ArrayList();
        Iterator<Tracking> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        monitor.a(arrayList);
        return monitor;
    }

    private static ImageInfo a(StaticResource staticResource) {
        if (staticResource == null || TextUtils.isEmpty(staticResource.b())) {
            return null;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.c(staticResource.b());
        imageInfo.b(MimeType.GIF.equalsIgnoreCase(staticResource.a()) ? MetaCreativeType.GIF : "img");
        imageInfo.d(1);
        return imageInfo;
    }

    static {
        HashMap map = new HashMap();
        f20123a = map;
        map.put("mute", EventType.SOUNDCLICKOFF);
        f20123a.put("complete", EventType.VASTPLAYCOMPLETE);
        f20123a.put("start", EventType.VASTPLAYSTART);
        f20123a.put("unmute", EventType.SOUNDCLICKON);
        f20123a.put("skip", EventType.CLOSE);
        f20123a.put("firstQuartile", EventType.VASTFIRSTQURAT);
        f20123a.put("midpoint", EventType.VASTMIDPOINT);
        f20123a.put("thirdQuartile", EventType.VASTTHIRDQUART);
    }
}

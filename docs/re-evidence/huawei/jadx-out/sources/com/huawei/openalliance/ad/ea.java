package com.huawei.openalliance.ad;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.StringVector;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.AdTypeEvent;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.AudioInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.beans.metadata.FlowControl;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.InstallConfig;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.NegativeFb;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.beans.metadata.Permission;
import com.huawei.openalliance.ad.beans.metadata.Precontent;
import com.huawei.openalliance.ad.beans.metadata.PromoteInfo;
import com.huawei.openalliance.ad.beans.metadata.ShareInfo;
import com.huawei.openalliance.ad.beans.metadata.Skip;
import com.huawei.openalliance.ad.beans.metadata.TextState;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateV3;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Data;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Image;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.ImageExt;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Title;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Video;
import com.huawei.openalliance.ad.constant.LabelPosition;
import com.huawei.openalliance.ad.inter.data.DeviceAiParam;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ea {
    public static int a(int i, int i2) {
        return i == -1111 ? i2 : i;
    }

    private static long a(long j, long j2) {
        return j == -1111 ? j2 : j;
    }

    public static List<ImpEX> b(xg.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(b(aVar.a(i)));
        }
        return arrayList;
    }

    public static ImpEX b(xg xgVar) {
        if (xgVar == null) {
            return null;
        }
        ImpEX impEX = new ImpEX();
        impEX.a(xgVar.a());
        impEX.b(xgVar.b());
        return impEX;
    }

    public static int b(int i) {
        return a(i, 0);
    }

    public static float b(float f) {
        if (com.huawei.openalliance.ad.utils.bs.a(f, -1111.0f)) {
            return 0.0f;
        }
        return f;
    }

    private static boolean a(BaseVector baseVector) {
        return baseVector == null || baseVector.length() == 0;
    }

    public static Map<String, String> a(wr.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        HashMap map = new HashMap();
        for (int i = 0; i < length; i++) {
            wr wrVarA = aVar.a(i);
            map.put(wrVarA.a(), wrVarA.b());
        }
        return map;
    }

    private static List<TextState> a(xx.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<TemplateV3> a(xw.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<Precontent> a(xr.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    private static List<Permission> a(xq.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = aVar.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<NegativeFb> a(xo.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<MotionData> a(xn.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<Monitor> a(xm.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<MediaFile> a(xk.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<Om> a(xj.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<ContentExt> a(xg.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<ImageInfo> a(xf.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<ImpEX> a(xb.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<Content> a(wx.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<Asset> a(wu.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<AdTypeEvent> a(ws.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    private static List<AdSource> a(wq.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<Ad30> a(wo.a aVar) {
        if (a((BaseVector) aVar)) {
            return null;
        }
        int length = aVar.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(aVar.a(i)));
        }
        return arrayList;
    }

    public static List<String> a(StringVector stringVector) {
        if (a((BaseVector) stringVector)) {
            return null;
        }
        int length = stringVector.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(stringVector.get(i));
        }
        return arrayList;
    }

    public static List<Integer> a(IntVector intVector) {
        if (a((BaseVector) intVector)) {
            return null;
        }
        int length = intVector.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(b(intVector.get(i))));
        }
        return arrayList;
    }

    public static Integer a(int i) {
        if (i == -1111) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static Float a(float f) {
        if (com.huawei.openalliance.ad.utils.bs.a(f, -1111.0f)) {
            return null;
        }
        return Float.valueOf(f);
    }

    public static RewardItem a(xt xtVar) {
        if (xtVar == null) {
            return null;
        }
        RewardItem rewardItem = new RewardItem();
        rewardItem.setType(xtVar.a());
        rewardItem.setAmount(b(xtVar.b()));
        return rewardItem;
    }

    public static DeviceAiParam a(xa xaVar) {
        if (xaVar == null) {
            return null;
        }
        DeviceAiParam deviceAiParam = new DeviceAiParam();
        deviceAiParam.a(xaVar.b());
        deviceAiParam.b(xaVar.c());
        deviceAiParam.c(xaVar.d());
        deviceAiParam.d(xaVar.a());
        deviceAiParam.e(xaVar.e());
        deviceAiParam.f(xaVar.f());
        return deviceAiParam;
    }

    public static Video a(xz xzVar) {
        if (xzVar == null) {
            return null;
        }
        Video video = new Video();
        video.a(xzVar.a());
        video.a(b(xzVar.d()));
        video.b(b(xzVar.e()));
        video.a(a(xzVar.g()));
        video.b(b(xzVar.c()));
        video.b(xzVar.b());
        video.c(xzVar.f());
        video.d(xzVar.h());
        return video;
    }

    public static Title a(xy xyVar) {
        if (xyVar == null) {
            return null;
        }
        Title title = new Title();
        title.a(xyVar.a());
        title.a(b(xyVar.b()));
        return title;
    }

    public static ImageExt a(xd xdVar) {
        if (xdVar == null) {
            return null;
        }
        ImageExt imageExt = new ImageExt();
        imageExt.a(a(xdVar.b()));
        imageExt.a(xdVar.a());
        imageExt.b(xdVar.c());
        imageExt.a(b(xdVar.d()));
        return imageExt;
    }

    private static Image a(xe xeVar) {
        if (xeVar == null) {
            return null;
        }
        Image image = new Image();
        image.a(xeVar.a());
        image.a(b(xeVar.b()));
        image.b(b(xeVar.c()));
        image.a(a(xeVar.d()));
        return image;
    }

    public static Data a(wy wyVar) {
        if (wyVar == null) {
            return null;
        }
        Data data = new Data();
        data.a(b(wyVar.a()));
        data.a(wyVar.c());
        data.b(b(wyVar.b()));
        return data;
    }

    public static TemplateV3 a(xw xwVar) {
        if (xwVar == null) {
            return null;
        }
        TemplateV3 templateV3 = new TemplateV3();
        templateV3.a(xwVar.a());
        templateV3.a(a(xwVar.c()));
        templateV3.b(xwVar.b());
        templateV3.c(xwVar.d());
        templateV3.d(xwVar.e());
        return templateV3;
    }

    public static TemplateData a(xv xvVar) {
        if (xvVar == null) {
            return null;
        }
        TemplateData templateData = new TemplateData();
        templateData.a(xvVar.a());
        templateData.b(xvVar.b());
        templateData.a(a(xvVar.c()));
        templateData.c(xvVar.d());
        return templateData;
    }

    public static MotionData a(xn xnVar) {
        if (xnVar == null) {
            return null;
        }
        MotionData motionData = new MotionData();
        motionData.a(a(xnVar.a()));
        motionData.b(xnVar.b());
        motionData.a(b(xnVar.c()));
        motionData.b(b(xnVar.d()));
        motionData.a(xnVar.e());
        motionData.c(b(xnVar.f()));
        motionData.c(xnVar.g());
        motionData.d(b(xnVar.h()));
        return motionData;
    }

    public static Asset a(wu wuVar) {
        if (wuVar == null) {
            return null;
        }
        Asset asset = new Asset();
        asset.a(b((int) wuVar.a()));
        asset.a(wuVar.b());
        asset.c(wuVar.g());
        asset.a(a(wuVar.f()));
        asset.a(a(wuVar.d()));
        asset.a(a(wuVar.e()));
        asset.a(a(wuVar.c()));
        return asset;
    }

    public static VideoInfo a(ya yaVar) {
        if (yaVar == null) {
            return null;
        }
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.a(yaVar.a());
        videoInfo.a(b((int) yaVar.b()));
        videoInfo.b(b((int) yaVar.c()));
        videoInfo.b(yaVar.d() == null ? "y" : yaVar.d());
        videoInfo.c(yaVar.e() == null ? "n" : yaVar.e());
        videoInfo.c(a(yaVar.f(), 200));
        videoInfo.d(yaVar.g());
        videoInfo.e(b(yaVar.i()));
        videoInfo.d(a(yaVar.h(), 1));
        videoInfo.a(a(yaVar.j()));
        videoInfo.b(a(yaVar.k()));
        videoInfo.f(a(yaVar.l(), 0));
        videoInfo.a(a(yaVar.m()));
        videoInfo.e(yaVar.n() != null ? yaVar.n() : "y");
        videoInfo.a(b(yaVar.o()));
        videoInfo.g(b(yaVar.p()));
        videoInfo.f(yaVar.q());
        return videoInfo;
    }

    public static TextState a(xx xxVar) {
        if (xxVar == null) {
            return null;
        }
        TextState textState = new TextState();
        textState.a(b(xxVar.a()));
        textState.b(b(xxVar.b()));
        textState.a(xxVar.c());
        textState.b(xxVar.d());
        textState.c(b(xxVar.e()));
        return textState;
    }

    public static Skip a(ww wwVar) {
        if (wwVar == null) {
            return null;
        }
        Skip skip = new Skip();
        skip.a(wwVar.a());
        skip.a(b(wwVar.b()));
        skip.b(b(wwVar.c()));
        return skip;
    }

    private static ShareInfo a(xu xuVar) {
        if (xuVar == null) {
            return null;
        }
        ShareInfo shareInfo = new ShareInfo();
        shareInfo.a(xuVar.a());
        shareInfo.b(xuVar.b());
        shareInfo.c(xuVar.c());
        shareInfo.d(xuVar.d());
        return shareInfo;
    }

    private static PromoteInfo a(xs xsVar) {
        if (xsVar == null) {
            return null;
        }
        PromoteInfo promoteInfo = new PromoteInfo();
        promoteInfo.a(b(xsVar.a()));
        promoteInfo.a(xsVar.b());
        return promoteInfo;
    }

    public static Precontent a(xr xrVar) {
        if (xrVar == null) {
            return null;
        }
        Precontent precontent = new Precontent();
        precontent.a(xrVar.a());
        precontent.b(xrVar.b());
        precontent.a(b(xrVar.c()));
        precontent.a(a(xrVar.d()));
        precontent.a(a(xrVar.g()));
        precontent.c(xrVar.e());
        precontent.b(a(xrVar.f()));
        precontent.a(a(xrVar.h()));
        precontent.b(a(xrVar.m()));
        precontent.c(a(xrVar.j()));
        precontent.a(a(xrVar.i()));
        precontent.d(a(xrVar.l()));
        precontent.c(a(xrVar.k()));
        return precontent;
    }

    private static Permission a(xq xqVar) {
        if (xqVar == null) {
            return null;
        }
        Permission permission = new Permission();
        permission.a(xqVar.a());
        permission.b(xqVar.b());
        return permission;
    }

    private static ParamFromServer a(xp xpVar) {
        if (xpVar == null) {
            return null;
        }
        ParamFromServer paramFromServer = new ParamFromServer();
        paramFromServer.b(xpVar.a());
        paramFromServer.a(xpVar.c());
        paramFromServer.c(xpVar.b());
        return paramFromServer;
    }

    public static Om a(xj xjVar) {
        if (xjVar == null) {
            return null;
        }
        Om om = new Om();
        om.a(xjVar.a());
        om.b(xjVar.b());
        om.c(xjVar.c());
        return om;
    }

    public static NegativeFb a(xo xoVar) {
        if (xoVar == null) {
            return null;
        }
        NegativeFb negativeFb = new NegativeFb();
        negativeFb.a(a(xoVar.a()));
        negativeFb.a(xoVar.b());
        negativeFb.a(b(xoVar.c()));
        return negativeFb;
    }

    public static Monitor a(xm xmVar) {
        if (xmVar == null) {
            return null;
        }
        Monitor monitor = new Monitor();
        monitor.a(xmVar.a());
        monitor.a(a(xmVar.b()));
        monitor.a(a(xmVar.c(), 1));
        return monitor;
    }

    private static MetaData a(xl xlVar) {
        if (xlVar == null) {
            return null;
        }
        MetaData metaData = new MetaData();
        metaData.b(xlVar.c());
        metaData.b(xlVar.d());
        metaData.c(xlVar.e());
        metaData.g(a(xlVar.f()));
        metaData.a(a(xlVar.g()));
        metaData.b(a(xlVar.h()));
        metaData.a(xlVar.i());
        metaData.d(xlVar.j());
        metaData.a(a(xlVar.k(), 500L));
        metaData.b(a(xlVar.M(), 0L));
        metaData.a(xlVar.l());
        metaData.a(a(xlVar.F()));
        metaData.b(a(xlVar.G()));
        metaData.a(a(xlVar.m()));
        metaData.e(xlVar.n());
        metaData.f(xlVar.o());
        metaData.g(xlVar.p());
        metaData.h(xlVar.q());
        metaData.a(a(xlVar.r()));
        metaData.a(a(xlVar.s()));
        metaData.a(a(xlVar.t()));
        metaData.a(a(xlVar.u()));
        metaData.a(a(xlVar.L()));
        metaData.i(xlVar.v());
        metaData.c(a(xlVar.w()));
        metaData.a(a(xlVar.x()));
        metaData.c(b(xlVar.E()));
        metaData.o(xlVar.I());
        metaData.p(xlVar.H());
        metaData.q(xlVar.a());
        metaData.f(a(xlVar.J()));
        metaData.c(a(xlVar.b()));
        metaData.j(xlVar.y());
        metaData.k(xlVar.z());
        metaData.l(xlVar.A());
        metaData.m(xlVar.B());
        metaData.e(a(xlVar.C()));
        metaData.c(a(xlVar.D()));
        metaData.d(a(xlVar.K()));
        return metaData;
    }

    public static MediaFile a(xk xkVar) {
        if (xkVar == null) {
            return null;
        }
        MediaFile mediaFile = new MediaFile();
        mediaFile.a(xkVar.a() == null ? "video/mp4" : xkVar.a());
        mediaFile.a(b(xkVar.b()));
        mediaFile.b(b(xkVar.c()));
        mediaFile.a(a(xkVar.d()));
        mediaFile.b(xkVar.e());
        mediaFile.c(xkVar.f());
        mediaFile.c(a(xkVar.g(), 0));
        mediaFile.d(a(xkVar.h(), 0));
        mediaFile.e(a(xkVar.i(), 1));
        return mediaFile;
    }

    public static InteractCfg a(xi xiVar) {
        if (xiVar == null) {
            return null;
        }
        InteractCfg interactCfg = new InteractCfg();
        interactCfg.a(a(xiVar.a()));
        interactCfg.b(a(xiVar.l()));
        interactCfg.d(a(xiVar.b()));
        interactCfg.e(a(xiVar.c()));
        interactCfg.f(a(xiVar.d()));
        interactCfg.c(a(xiVar.e()));
        interactCfg.g(a(xiVar.f()));
        interactCfg.a(xiVar.g());
        interactCfg.b(xiVar.h());
        interactCfg.c(xiVar.i());
        interactCfg.d(xiVar.j());
        interactCfg.e(xiVar.k());
        return interactCfg;
    }

    private static InstallConfig a(xh xhVar) {
        if (xhVar == null) {
            return null;
        }
        InstallConfig installConfig = new InstallConfig();
        installConfig.b(xhVar.a());
        installConfig.a(xhVar.b());
        installConfig.c(xhVar.c());
        return installConfig;
    }

    public static ImpEX a(xb xbVar) {
        if (xbVar == null) {
            return null;
        }
        ImpEX impEX = new ImpEX();
        impEX.a(xbVar.a());
        impEX.b(xbVar.b());
        return impEX;
    }

    public static ImageInfo a(xf xfVar) {
        if (xfVar == null) {
            return null;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.c(xfVar.a());
        imageInfo.a(b(xfVar.b()));
        imageInfo.b(b(xfVar.c()));
        imageInfo.a(xfVar.d());
        imageInfo.b(xfVar.f() == null ? "img" : xfVar.f());
        imageInfo.c(b((int) xfVar.e()));
        imageInfo.d(b(xfVar.g()));
        return imageInfo;
    }

    public static FlowControl a(xc xcVar) {
        if (xcVar == null) {
            return null;
        }
        FlowControl flowControl = new FlowControl();
        flowControl.a(b(xcVar.a()));
        flowControl.a(a(xcVar.b()));
        return flowControl;
    }

    public static DefaultTemplate a(wz wzVar) {
        if (wzVar == null) {
            return null;
        }
        DefaultTemplate defaultTemplate = new DefaultTemplate();
        defaultTemplate.a(wzVar.a());
        defaultTemplate.a(a(wzVar.b()));
        return defaultTemplate;
    }

    public static ContentExt a(xg xgVar) {
        if (xgVar == null) {
            return null;
        }
        ContentExt contentExt = new ContentExt();
        contentExt.a(xgVar.a());
        contentExt.b(xgVar.b());
        return contentExt;
    }

    public static Content a(wx wxVar) {
        if (wxVar == null) {
            return null;
        }
        Content content = new Content();
        content.c(wxVar.a());
        content.d(wxVar.i());
        content.b(a(wxVar.h(), 1));
        content.a(a(wxVar.b()));
        content.b(a(wxVar.j(), -1L));
        content.c(a(wxVar.c(), 0));
        content.a(a(wxVar.d(), 1));
        content.e(com.huawei.openalliance.ad.utils.bk.b(a(wxVar.e())));
        content.a(wxVar.g());
        content.g(wxVar.o() == null ? "tr" : wxVar.o());
        content.a(a(wxVar.p()));
        content.i(0);
        content.g(b(wxVar.H()));
        content.b(com.huawei.openalliance.ad.utils.bk.b(a(wxVar.f())));
        content.u(com.huawei.openalliance.ad.utils.bk.b(a(wxVar.Y())));
        content.b(a(wxVar.k()));
        content.c(a(wxVar.l()));
        content.d(a(wxVar.m()));
        content.f(wxVar.q() == null ? "" : wxVar.q());
        content.h(wxVar.r() == null ? LabelPosition.LOWER_LEFT : wxVar.r());
        content.d(b(wxVar.s()));
        content.e(a(wxVar.t()));
        content.i(wxVar.u());
        content.j(wxVar.v());
        content.e(b(wxVar.x()));
        content.f(a(wxVar.w()));
        content.k(wxVar.y());
        content.l(wxVar.z());
        content.a(a(wxVar.C()));
        content.m(wxVar.B());
        content.n(wxVar.D());
        content.b(a(wxVar.J()));
        content.c(a(wxVar.K()));
        content.o(wxVar.M());
        content.h(b(wxVar.E()));
        content.p(wxVar.A());
        content.g(a(wxVar.N()));
        content.h(a(wxVar.I()));
        content.a(a(wxVar.n()));
        content.q(wxVar.L());
        content.a(a(wxVar.O()));
        content.i(a(wxVar.P()));
        content.d(a(wxVar.S()));
        content.j(a(wxVar.R()));
        content.a(a(wxVar.Q()));
        content.r(wxVar.T());
        content.s(wxVar.U());
        content.t(wxVar.W());
        content.a(a(wxVar.V()));
        content.a(a(wxVar.X()));
        content.v(wxVar.Z());
        content.w(wxVar.aa());
        content.x(wxVar.ab());
        content.y(wxVar.G());
        content.a(a(wxVar.F()));
        content.z(wxVar.ac());
        content.A(wxVar.ad());
        content.a(Integer.valueOf(wxVar.ae()));
        content.B(wxVar.af());
        return content;
    }

    private static AudioInfo a(wv wvVar) {
        if (wvVar == null) {
            return null;
        }
        AudioInfo audioInfo = new AudioInfo();
        audioInfo.a(wvVar.b());
        audioInfo.a(b((int) wvVar.c()));
        audioInfo.b(b((int) wvVar.a()));
        audioInfo.b(wvVar.d());
        audioInfo.c(wvVar.e());
        return audioInfo;
    }

    private static ApkInfo a(wt wtVar) {
        if (wtVar == null) {
            return null;
        }
        ApkInfo apkInfo = new ApkInfo();
        apkInfo.i(wtVar.g());
        apkInfo.r(wtVar.t());
        apkInfo.d(wtVar.a());
        apkInfo.f(wtVar.f());
        apkInfo.g(wtVar.Q());
        apkInfo.h(wtVar.R());
        apkInfo.b(wtVar.b());
        apkInfo.c(wtVar.o());
        apkInfo.a(a(wtVar.c()));
        apkInfo.e(wtVar.d());
        apkInfo.a(wtVar.e());
        apkInfo.a(a(wtVar.h()));
        apkInfo.j(wtVar.j());
        apkInfo.m(wtVar.P());
        apkInfo.a(a(wtVar.k()));
        apkInfo.n(wtVar.m() == null ? "1" : wtVar.m());
        apkInfo.o(wtVar.n() == null ? "0" : wtVar.n());
        apkInfo.a(b(wtVar.v()));
        apkInfo.q(wtVar.q());
        apkInfo.b(b(wtVar.r()));
        apkInfo.s(wtVar.s());
        apkInfo.c(b(wtVar.u()));
        apkInfo.p(wtVar.z());
        apkInfo.t(wtVar.x());
        apkInfo.u(wtVar.y());
        apkInfo.d(a(wtVar.w(), 1));
        apkInfo.e(b(wtVar.E()));
        apkInfo.v(wtVar.F());
        apkInfo.w(wtVar.I());
        apkInfo.f(a(wtVar.J(), 1));
        apkInfo.x(wtVar.A());
        apkInfo.y(wtVar.B());
        apkInfo.z(wtVar.p());
        apkInfo.a(a(wtVar.i()));
        apkInfo.A(wtVar.D());
        apkInfo.B(wtVar.l());
        apkInfo.C(wtVar.C());
        apkInfo.g(a(wtVar.G(), 1));
        apkInfo.h(b(wtVar.K()));
        apkInfo.b(a(wtVar.H()));
        apkInfo.D(wtVar.M());
        apkInfo.E(wtVar.N());
        apkInfo.F(wtVar.N());
        apkInfo.G(wtVar.O());
        apkInfo.H(wtVar.L());
        apkInfo.i(b(wtVar.S()));
        apkInfo.I(wtVar.T());
        apkInfo.k(wtVar.U());
        apkInfo.a(Long.valueOf(wtVar.V()));
        apkInfo.b(Long.valueOf(wtVar.W()));
        apkInfo.l(wtVar.X());
        apkInfo.J(wtVar.Y());
        return apkInfo;
    }

    public static AdTypeEvent a(ws wsVar) {
        if (wsVar == null) {
            return null;
        }
        AdTypeEvent adTypeEvent = new AdTypeEvent();
        adTypeEvent.a(b(wsVar.b()));
        adTypeEvent.a(a(wsVar.a()));
        return adTypeEvent;
    }

    private static AdSource a(wq wqVar) {
        if (wqVar == null) {
            return null;
        }
        AdSource adSource = new AdSource();
        adSource.a(wqVar.a());
        adSource.b(wqVar.b());
        adSource.a(b(wqVar.c()));
        return adSource;
    }

    public static Ad30 a(wo woVar) {
        if (woVar == null) {
            return null;
        }
        Ad30 ad30 = new Ad30();
        ad30.a(woVar.a());
        ad30.a(a(woVar.b(), -1));
        ad30.a(a(woVar.d()));
        ad30.b(a(woVar.f(), -1));
        ad30.b(woVar.c());
        ad30.b(b(woVar.e()));
        ad30.c(com.huawei.openalliance.ad.utils.bk.b(a(woVar.g())));
        ad30.a(a(woVar.h()));
        return ad30;
    }

    private static long a(long j) {
        return a(j, 0L);
    }
}

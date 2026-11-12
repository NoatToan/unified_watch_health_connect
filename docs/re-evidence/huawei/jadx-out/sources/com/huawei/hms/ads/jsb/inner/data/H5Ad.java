package com.huawei.hms.ads.jsb.inner.data;

import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.inter.data.AdvertiserInfo;
import com.huawei.openalliance.ad.inter.data.BaseRewardItem;
import com.huawei.openalliance.ad.inter.data.d;
import com.huawei.openalliance.ad.inter.data.e;
import com.huawei.openalliance.ad.inter.data.h;
import com.huawei.openalliance.ad.inter.data.i;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class H5Ad {
    private String abilityDetailInfo;
    private String adChoiceUrl;
    private int adType;
    private List<AdvertiserInfo> advertiserInfos;
    private int apiVer;
    private App app;
    private String bannerRefSetting;
    private String clickBtnTxt;
    private String contentId;
    private int creativeType;
    private CtrlExt ctrlExt;
    private String desc;
    private String dspLogo;
    private String dspName;
    private long endTime;
    private Map<String, String> ext;
    private ImageInfo icon;
    private List<ImageInfo> imgList;
    private int interactionType;
    private boolean isGaussianBlur;
    private boolean isSilentReserve;
    private List<String> keywords;
    private String label;
    private String logo2Text;
    private MediaFile mediaFile;
    private int minEffectiveShowRatio;
    private long minEffectiveShowTime;
    private String requestId;
    private BaseRewardItem rewardItem;
    private int sequence;
    private boolean showAppElement;
    private String showId;
    private String slotId;
    private String source;
    private String styleId;
    private String taskId;
    private String templateId;
    private String title;
    private boolean transparencyOpen;
    private boolean transparencySwitch;
    private String transparencyTplUrl;
    private String uniqueId;
    private Video video;

    public void a(BaseRewardItem baseRewardItem) {
        this.rewardItem = baseRewardItem;
    }

    public int a() {
        return this.adType;
    }

    public H5Ad(i iVar) {
        this.apiVer = 2;
        if (iVar == null) {
            return;
        }
        this.requestId = iVar.f();
        this.uniqueId = iVar.getUniqueId();
        this.showId = iVar.getShowId();
        this.slotId = iVar.W();
        this.contentId = iVar.getContentId();
        this.taskId = iVar.getTaskId();
        this.rewardItem = iVar.getRewardItem();
        this.ctrlExt = iVar.d();
        this.showAppElement = iVar.isShowAppElement();
        this.transparencyOpen = iVar.isTransparencyOpen();
        this.transparencyTplUrl = iVar.getTransparencyTplUrl();
        this.transparencySwitch = iVar.z();
        this.abilityDetailInfo = iVar.getAbilityDetailInfo();
        if (!bm.a(iVar.getCompliance())) {
            this.advertiserInfos = iVar.getCompliance();
        }
        this.apiVer = iVar.aq() != null ? iVar.aq().intValue() : 2;
        this.templateId = iVar.am();
        this.styleId = iVar.an();
    }

    public H5Ad(h hVar) {
        this.apiVer = 2;
        if (hVar == null) {
            return;
        }
        this.requestId = hVar.f();
        this.uniqueId = hVar.getUniqueId();
        this.showId = hVar.getShowId();
        this.slotId = hVar.M();
        this.contentId = hVar.getContentId();
        this.taskId = hVar.getTaskId();
        this.adType = hVar.e();
        this.creativeType = hVar.getCreativeType();
        this.interactionType = hVar.getInterActionType();
        this.endTime = hVar.getEndTime();
        this.minEffectiveShowTime = hVar.getMinEffectiveShowTime();
        this.minEffectiveShowRatio = hVar.getMinEffectiveShowRatio();
        this.source = hVar.getLabel();
        this.clickBtnTxt = hVar.getCta();
        this.sequence = hVar.getSequence();
        this.adChoiceUrl = hVar.getAdChoiceUrl();
        this.ctrlExt = hVar.d();
        this.showAppElement = hVar.isShowAppElement();
        this.transparencyOpen = hVar.isTransparencyOpen();
        this.transparencyTplUrl = hVar.getTransparencyTplUrl();
        this.transparencySwitch = hVar.z();
        this.abilityDetailInfo = hVar.getAbilityDetailInfo();
        if (hVar.getAppInfo() != null) {
            this.app = new App(hVar.getAppInfo());
        }
        if (hVar.getMediaFile() != null) {
            this.mediaFile = new MediaFile(hVar.getMediaFile());
        }
        if (bm.a(hVar.getAdvertiserInfo())) {
            return;
        }
        this.advertiserInfos = hVar.getAdvertiserInfo();
    }

    public H5Ad(e eVar) {
        this.apiVer = 2;
        if (eVar == null) {
            return;
        }
        this.isSilentReserve = pa.F(eVar.getCtrlSwitchs());
        this.requestId = eVar.f();
        this.uniqueId = eVar.getUniqueId();
        this.showId = eVar.getShowId();
        this.slotId = eVar.getSlotId();
        this.contentId = eVar.getContentId();
        this.taskId = eVar.getTaskId();
        this.adType = eVar.e();
        this.creativeType = eVar.getCreativeType();
        this.interactionType = eVar.getInterActionType();
        this.endTime = eVar.getEndTime();
        this.minEffectiveShowTime = eVar.getMinEffectiveShowTime();
        this.minEffectiveShowRatio = eVar.getMinEffectiveShowRatio();
        this.desc = dg.f(eVar.getDescription());
        this.title = dg.f(eVar.getTitle());
        this.dspName = dg.f(eVar.getDspName());
        this.dspLogo = eVar.getDspLogo();
        this.logo2Text = dg.f(eVar.u());
        this.label = dg.f(eVar.getLabel());
        this.source = dg.f(eVar.getLabel());
        this.clickBtnTxt = dg.f(eVar.getCta());
        this.adChoiceUrl = eVar.getAdChoiceUrl();
        this.ctrlExt = eVar.d();
        this.showAppElement = eVar.isShowAppElement();
        this.transparencyOpen = eVar.isTransparencyOpen();
        this.transparencyTplUrl = eVar.getTransparencyTplUrl();
        this.transparencySwitch = eVar.z();
        this.abilityDetailInfo = eVar.getAbilityDetailInfo();
        if (!bm.a(eVar.getAdCloseKeyWords())) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = eVar.getAdCloseKeyWords().iterator();
            while (it.hasNext()) {
                arrayList.add(dg.f(it.next()));
            }
            this.keywords = arrayList;
        }
        this.isGaussianBlur = eVar.isUseGaussianBlur();
        this.bannerRefSetting = eVar.aq();
        if (eVar.getAppInfo() != null) {
            this.app = new App(eVar.getAppInfo());
        }
        this.icon = new ImageInfo(eVar.getIcon());
        if (eVar.getVideoInfo() != null) {
            this.video = new Video(eVar.getVideoInfo());
        }
        if (!bm.a(eVar.getImageInfos())) {
            ArrayList arrayList2 = new ArrayList();
            for (com.huawei.openalliance.ad.inter.data.ImageInfo imageInfo : eVar.getImageInfos()) {
                if (imageInfo != null) {
                    arrayList2.add(new ImageInfo(imageInfo));
                }
            }
            this.imgList = arrayList2;
        }
        List<ImpEX> listAr = eVar.ar();
        HashMap map = new HashMap();
        if (!bm.a(listAr)) {
            for (ImpEX impEX : listAr) {
                map.put(impEX.a(), impEX.b());
            }
        }
        this.ext = map;
        if (bm.a(eVar.getAdvertiserInfo())) {
            return;
        }
        this.advertiserInfos = eVar.getAdvertiserInfo();
    }

    public H5Ad(d dVar) {
        this.apiVer = 2;
        if (dVar == null) {
            return;
        }
        this.requestId = dVar.f();
        this.uniqueId = dVar.getUniqueId();
        this.showId = dVar.getShowId();
        this.slotId = dVar.V();
        this.contentId = dVar.getContentId();
        this.taskId = dVar.getTaskId();
        this.rewardItem = dVar.I();
        this.ctrlExt = dVar.d();
        this.showAppElement = dVar.isShowAppElement();
        this.transparencyOpen = dVar.isTransparencyOpen();
        this.transparencyTplUrl = dVar.getTransparencyTplUrl();
        this.transparencySwitch = dVar.z();
        this.abilityDetailInfo = dVar.getAbilityDetailInfo();
        if (!bm.a(dVar.getCompliance())) {
            this.advertiserInfos = dVar.getCompliance();
        }
        this.apiVer = dVar.ac() != null ? dVar.ac().intValue() : 2;
        this.templateId = dVar.ad();
    }

    public H5Ad() {
        this.apiVer = 2;
    }
}

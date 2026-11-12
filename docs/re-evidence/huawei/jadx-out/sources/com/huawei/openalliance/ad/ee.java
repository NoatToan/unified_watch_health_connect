package com.huawei.openalliance.ad;

import com.google.flatbuffers.FlatBufferBuilder;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.InstallConfig;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.beans.metadata.PromoteInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.MotionData;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Data;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Image;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.ImageExt;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Title;
import com.huawei.openalliance.ad.beans.metadata.v3.openrtb.Video;
import com.huawei.openalliance.ad.inter.data.AdvertiserInfo;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.AudioInfo;
import com.huawei.openalliance.ad.inter.data.BiddingInfo;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.inter.data.fb.AdSourceFb;
import com.huawei.openalliance.ad.inter.data.fb.AdvertiserInfoFb;
import com.huawei.openalliance.ad.inter.data.fb.AppInfoFb;
import com.huawei.openalliance.ad.inter.data.fb.AssetFb;
import com.huawei.openalliance.ad.inter.data.fb.AudioInfoFb;
import com.huawei.openalliance.ad.inter.data.fb.BiddingInfoFb;
import com.huawei.openalliance.ad.inter.data.fb.ContentExtFb;
import com.huawei.openalliance.ad.inter.data.fb.DataFb;
import com.huawei.openalliance.ad.inter.data.fb.DefaultTemplateFb;
import com.huawei.openalliance.ad.inter.data.fb.FeedbackInfoFb;
import com.huawei.openalliance.ad.inter.data.fb.ImageExtFb;
import com.huawei.openalliance.ad.inter.data.fb.ImageFb;
import com.huawei.openalliance.ad.inter.data.fb.ImageInfoFb;
import com.huawei.openalliance.ad.inter.data.fb.ImpEXFb;
import com.huawei.openalliance.ad.inter.data.fb.InstallConfigFb;
import com.huawei.openalliance.ad.inter.data.fb.MonitorFb;
import com.huawei.openalliance.ad.inter.data.fb.MotionDataFb;
import com.huawei.openalliance.ad.inter.data.fb.OmFb;
import com.huawei.openalliance.ad.inter.data.fb.PermissionEntityFb;
import com.huawei.openalliance.ad.inter.data.fb.PromoteInfoFb;
import com.huawei.openalliance.ad.inter.data.fb.TemplateDataFb;
import com.huawei.openalliance.ad.inter.data.fb.TitleFb;
import com.huawei.openalliance.ad.inter.data.fb.VideoFb;
import com.huawei.openalliance.ad.inter.data.fb.VideoInfoFb;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class ee {
    public static int[] k(List<AdSource> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                AdSource adSource = list.get(i);
                if (adSource != null) {
                    iArr[i] = AdSourceFb.createAdSourceFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(adSource.a())), flatBufferBuilder.createString(ef.a(adSource.b())), adSource.c());
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] j(List<Om> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                Om om = list.get(i);
                if (om != null) {
                    iArr[i] = OmFb.createOmFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(om.a())), flatBufferBuilder.createString(ef.a(om.b())), flatBufferBuilder.createString(ef.a(om.c())));
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] i(List<AdvertiserInfo> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                AdvertiserInfo advertiserInfo = list.get(i);
                if (advertiserInfo != null) {
                    iArr[i] = AdvertiserInfoFb.createAdvertiserInfoFb(flatBufferBuilder, advertiserInfo.getSeq().intValue(), flatBufferBuilder.createString(ef.a(advertiserInfo.getKey())), flatBufferBuilder.createString(ef.a(advertiserInfo.getValue())));
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] h(List<ImageInfo> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = a(list.get(i), flatBufferBuilder);
            }
        }
        return ef.a(iArr);
    }

    public static int[] g(List<PermissionEntity> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                PermissionEntity permissionEntity = list.get(i);
                if (permissionEntity != null) {
                    iArr[i] = PermissionEntityFb.createPermissionEntityFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(permissionEntity.getName())), permissionEntity.getType());
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] f(List<ImpEX> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                ImpEX impEX = list.get(i);
                if (impEX != null) {
                    iArr[i] = ImpEXFb.createImpEXFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(impEX.a())), flatBufferBuilder.createString(ef.a(impEX.b())));
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] e(List<ContentExt> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                ContentExt contentExt = list.get(i);
                if (contentExt != null) {
                    iArr[i] = ContentExtFb.createContentExtFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(contentExt.a())), flatBufferBuilder.createString(ef.a(contentExt.b())));
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] d(List<FeedbackInfo> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                FeedbackInfo feedbackInfo = list.get(i);
                if (feedbackInfo != null) {
                    iArr[i] = FeedbackInfoFb.createFeedbackInfoFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(feedbackInfo.getLabel())), feedbackInfo.getType(), feedbackInfo.a());
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] c(List<Asset> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                Asset asset = list.get(i);
                if (asset != null) {
                    iArr[i] = AssetFb.createAssetFb(flatBufferBuilder, asset.a(), flatBufferBuilder.createString(ef.a(asset.b())), flatBufferBuilder.createString(ef.a(asset.h())), a(asset.c(), flatBufferBuilder), a(asset.d(), flatBufferBuilder), a(asset.e(), flatBufferBuilder), a(asset.f(), flatBufferBuilder), flatBufferBuilder.createString(ef.a(asset.g())));
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] b(List<MotionData> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                MotionData motionData = list.get(i);
                if (motionData != null) {
                    iArr[i] = MotionDataFb.createMotionDataFb(flatBufferBuilder, motionData.a(), flatBufferBuilder.createString(ef.a(motionData.g())), motionData.b(), motionData.c(), flatBufferBuilder.createString(ef.a(motionData.d())), motionData.e(), flatBufferBuilder.createString(ef.a(motionData.h())), motionData.f(), flatBufferBuilder.createString(ef.a(motionData.i())));
                }
            }
        }
        return ef.a(iArr);
    }

    public static int[] a(List<Monitor> list, FlatBufferBuilder flatBufferBuilder) {
        int[] iArr;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            iArr = null;
        } else {
            int size = list.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                Monitor monitor = list.get(i);
                if (monitor != null) {
                    iArr[i] = MonitorFb.createMonitorFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(monitor.a())), MonitorFb.createUrlVector(flatBufferBuilder, ef.a(monitor.b(), flatBufferBuilder)), monitor.c());
                }
            }
        }
        return ef.a(iArr);
    }

    public static int a(VideoInfo videoInfo, FlatBufferBuilder flatBufferBuilder) {
        if (videoInfo == null) {
            return 0;
        }
        return VideoInfoFb.createVideoInfoFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(videoInfo.getVideoDownloadUrl())), flatBufferBuilder.createString(ef.a(videoInfo.g())), videoInfo.getVideoDuration(), videoInfo.getVideoFileSize(), flatBufferBuilder.createString(ef.a(videoInfo.getVideoAutoPlay())), videoInfo.getAutoPlayNetwork(), flatBufferBuilder.createString(ef.a(videoInfo.getVideoAutoPlayWithSound())), videoInfo.getTimeBeforeVideoAutoPlay(), flatBufferBuilder.createString(ef.a(videoInfo.getSha256())), videoInfo.b(), flatBufferBuilder.createString(ef.a(videoInfo.getSoundSwitch())), videoInfo.getVideoPlayMode(), videoInfo.isCheckSha256(), videoInfo.c(), videoInfo.isBackFromFullScreen(), videoInfo.getAutoPlayAreaRatio(), videoInfo.getAutoStopPlayAreaRatio(), videoInfo.getDownloadNetwork(), videoInfo.getVideoRatio().floatValue(), videoInfo.e(), videoInfo.f(), videoInfo.d(), videoInfo.h(), flatBufferBuilder.createString(ef.a(videoInfo.i())), videoInfo.j(), flatBufferBuilder.createString(ef.a(videoInfo.k())));
    }

    public static int a(ImageInfo imageInfo, FlatBufferBuilder flatBufferBuilder) {
        if (imageInfo == null) {
            return 0;
        }
        return ImageInfoFb.createImageInfoFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(imageInfo.getUrl())), flatBufferBuilder.createString(ef.a(imageInfo.getOriginalUrl())), imageInfo.getWidth(), imageInfo.getHeight(), imageInfo.getFileSize(), flatBufferBuilder.createString(ef.a(imageInfo.getSha256())), imageInfo.isCheckSha256(), flatBufferBuilder.createString(ef.a(imageInfo.getImageType())));
    }

    public static int a(BiddingInfo biddingInfo, FlatBufferBuilder flatBufferBuilder) {
        if (biddingInfo == null) {
            return 0;
        }
        return BiddingInfoFb.createBiddingInfoFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(biddingInfo.getCur())), a(biddingInfo.getPrice()), flatBufferBuilder.createString(ef.a(biddingInfo.getLurl())), flatBufferBuilder.createString(ef.a(biddingInfo.getNurl())));
    }

    public static int a(AudioInfo audioInfo, FlatBufferBuilder flatBufferBuilder) {
        if (audioInfo == null) {
            return 0;
        }
        return AudioInfoFb.createAudioInfoFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(audioInfo.getUrl())), audioInfo.getDuration(), audioInfo.getFileSize(), flatBufferBuilder.createString(ef.a(audioInfo.getSha256())), flatBufferBuilder.createString(ef.a(audioInfo.getMime())));
    }

    public static int a(AppInfo appInfo, FlatBufferBuilder flatBufferBuilder) {
        if (appInfo == null) {
            return 0;
        }
        int[] iArrG = g(appInfo.getPermissions(), flatBufferBuilder);
        return AppInfoFb.createAppInfoFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(appInfo.getAppName())), flatBufferBuilder.createString(ef.a(appInfo.getPackageName())), flatBufferBuilder.createString(ef.a(appInfo.getVersionCode())), flatBufferBuilder.createString(ef.a(appInfo.getVersionName())), flatBufferBuilder.createString(ef.a(appInfo.getIconUrl())), flatBufferBuilder.createString(ef.a(appInfo.getDownloadUrl())), flatBufferBuilder.createString(ef.a(appInfo.getSafeDownloadUrl())), appInfo.getFileSize(), flatBufferBuilder.createString(ef.a(appInfo.getSha256())), appInfo.isCheckSha256(), flatBufferBuilder.createString(ef.a(appInfo.getIntentUri())), AppInfoFb.createPermissionsVector(flatBufferBuilder, iArrG), flatBufferBuilder.createString(ef.a(appInfo.getPriorInstallWay())), a(appInfo.b(), flatBufferBuilder), appInfo.isPermPromptForCard(), appInfo.isPermPromptForLanding(), appInfo.e(), flatBufferBuilder.createString(ef.a(appInfo.g())), appInfo.h(), flatBufferBuilder.createString(ef.a(appInfo.getUniqueId())), flatBufferBuilder.createString(ef.a(appInfo.getAppDesc())), appInfo.i(), appInfo.j(), flatBufferBuilder.createString(ef.a(appInfo.f())), flatBufferBuilder.createString(ef.a(appInfo.k())), flatBufferBuilder.createString(ef.a(appInfo.l())), flatBufferBuilder.createString(ef.a(appInfo.t())), flatBufferBuilder.createString(ef.a(appInfo.u())), appInfo.o(), appInfo.p(), flatBufferBuilder.createString(ef.a(appInfo.q())), flatBufferBuilder.createString(ef.a(appInfo.r())), appInfo.s(), appInfo.isAllowedNonWifiNetwork(), appInfo.K() != null ? appInfo.K().intValue() : 0, flatBufferBuilder.createString(ef.a(appInfo.x())), flatBufferBuilder.createString(ef.a(appInfo.y())), flatBufferBuilder.createString(ef.a(appInfo.getDeveloperName())), flatBufferBuilder.createString(ef.a(appInfo.v())), flatBufferBuilder.createString(ef.a(appInfo.z())), flatBufferBuilder.createString(ef.a(appInfo.A())), appInfo.B(), appInfo.C(), appInfo.D(), appInfo.E(), flatBufferBuilder.createString(ef.a(appInfo.F())), flatBufferBuilder.createString(ef.a(appInfo.G())), flatBufferBuilder.createString(ef.a(appInfo.H())), flatBufferBuilder.createString(ef.a(appInfo.I())), flatBufferBuilder.createString(ef.a(appInfo.J())), flatBufferBuilder.createString(ef.a(appInfo.getPermissionUrl())), flatBufferBuilder.createString(ef.a(appInfo.getAppDetailUrl())), flatBufferBuilder.createString(ef.a(appInfo.L())), flatBufferBuilder.createString(ef.a(appInfo.a())), appInfo.c(), flatBufferBuilder.createString(ef.a(appInfo.d())), flatBufferBuilder.createString(ef.a(appInfo.getHot())), appInfo.getRateNum() == null ? -1L : appInfo.getRateNum().longValue(), appInfo.getDownloadNum() == null ? -1L : appInfo.getDownloadNum().longValue(), flatBufferBuilder.createString(ef.a(appInfo.getDownCountDesc())), flatBufferBuilder.createString(ef.a(appInfo.getAppDetailDesc())));
    }

    public static int a(Video video, FlatBufferBuilder flatBufferBuilder) {
        if (video == null) {
            return 0;
        }
        return VideoFb.createVideoFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(video.a())), video.b(), video.c(), video.d(), video.e(), flatBufferBuilder.createString(ef.a(video.f())), flatBufferBuilder.createString(ef.a(video.g())), video.h(), flatBufferBuilder.createString(ef.a(video.i())), video.j());
    }

    public static int a(Title title, FlatBufferBuilder flatBufferBuilder) {
        if (title == null) {
            return 0;
        }
        return TitleFb.createTitleFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(title.a())), title.b());
    }

    public static int a(ImageExt imageExt, FlatBufferBuilder flatBufferBuilder) {
        if (imageExt == null) {
            return 0;
        }
        return ImageExtFb.createImageExtFb(flatBufferBuilder, imageExt.a(), flatBufferBuilder.createString(ef.a(imageExt.b())), flatBufferBuilder.createString(ef.a(imageExt.c())), imageExt.d());
    }

    public static int a(Image image, FlatBufferBuilder flatBufferBuilder) {
        if (image == null) {
            return 0;
        }
        return ImageFb.createImageFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(image.a())), image.b(), image.c(), a(image.d(), flatBufferBuilder), flatBufferBuilder.createString(ef.a(image.e())));
    }

    public static int a(Data data, FlatBufferBuilder flatBufferBuilder) {
        if (data == null) {
            return 0;
        }
        return DataFb.createDataFb(flatBufferBuilder, data.a(), flatBufferBuilder.createString(ef.a(data.b())), data.c());
    }

    public static int a(TemplateData templateData, FlatBufferBuilder flatBufferBuilder) {
        if (templateData == null) {
            return 0;
        }
        return TemplateDataFb.createTemplateDataFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(templateData.a())), flatBufferBuilder.createString(ef.a(templateData.b())), TemplateDataFb.createMotionDataVector(flatBufferBuilder, b(templateData.c(), flatBufferBuilder)), flatBufferBuilder.createString(ef.a(templateData.d())), flatBufferBuilder.createString(ef.a(templateData.e())));
    }

    public static int a(PromoteInfo promoteInfo, FlatBufferBuilder flatBufferBuilder) {
        if (promoteInfo == null) {
            return 0;
        }
        return PromoteInfoFb.createPromoteInfoFb(flatBufferBuilder, promoteInfo.getType(), flatBufferBuilder.createString(ef.a(promoteInfo.getName())));
    }

    public static int a(InstallConfig installConfig, FlatBufferBuilder flatBufferBuilder) {
        if (installConfig == null) {
            return 0;
        }
        return InstallConfigFb.createInstallConfigFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(installConfig.a())), flatBufferBuilder.createString(ef.a(installConfig.b())), flatBufferBuilder.createString(ef.a(installConfig.c())));
    }

    public static int a(DefaultTemplate defaultTemplate, FlatBufferBuilder flatBufferBuilder) {
        if (defaultTemplate == null) {
            return 0;
        }
        return DefaultTemplateFb.createDefaultTemplateFb(flatBufferBuilder, flatBufferBuilder.createString(ef.a(defaultTemplate.a())), defaultTemplate.b() != null ? defaultTemplate.b().intValue() : 0);
    }

    public static float a(Float f) {
        if (f == null) {
            return -1111.0f;
        }
        return f.floatValue();
    }
}

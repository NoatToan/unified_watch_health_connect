package com.xiaomi.hm.health.traininglib.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudio;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.BgMusic;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.traininglib.model.DownloadInfo;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public class MediaFileUtils {
    @NonNull
    private static Set<DownloadInfo> a(@Nullable List<ActionContent> list) {
        HashMap map = new HashMap();
        if (list != null) {
            TrainerInfo trainerInfo = TrainerInfo.get();
            for (ActionContent actionContent : list) {
                List<ActionVideo> list2 = actionContent.videos;
                if (list2 != null && list2.size() > 0) {
                    ActionVideo actionVideo = actionContent.videos.get(0);
                    if (actionContent.videos.size() == 2 && trainerInfo != null && actionVideo.gender.intValue() != trainerInfo.gender) {
                        actionVideo = actionContent.videos.get(1);
                    }
                    if (getMedialFromCacheByUri(actionVideo.url, actionVideo.size.longValue()) == null) {
                        String str = actionVideo.url;
                        map.put(str, DownloadInfo.create(str, actionVideo.size.longValue()));
                    }
                }
                ActionAudio actionAudio = actionContent.audio;
                if (actionAudio != null && getMedialFromCacheByUri(actionAudio.url, actionAudio.size.longValue()) == null) {
                    ActionAudio actionAudio2 = actionContent.audio;
                    String str2 = actionAudio2.url;
                    map.put(str2, DownloadInfo.create(str2, actionAudio2.size.longValue()));
                }
            }
        }
        return new HashSet(map.values());
    }

    @Nullable
    private static DownloadInfo b(TrainingDetail trainingDetail) {
        BgMusic bgMusic;
        if (trainingDetail == null || (bgMusic = trainingDetail.bgMusic) == null || TextUtils.isEmpty(bgMusic.getUrl()) || trainingDetail.bgMusic.getSize() <= 0) {
            return null;
        }
        return DownloadInfo.create(trainingDetail.bgMusic.getUrl(), trainingDetail.bgMusic.getSize());
    }

    public static File getMedialFromCacheByUri(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            return null;
        }
        File file = new File(FileUtils.getTrainingDir().getAbsolutePath(), lastPathSegment);
        if (!file.isFile() || !file.exists()) {
            return null;
        }
        if (file.length() == j) {
            return file;
        }
        file.deleteOnExit();
        return null;
    }

    public static int getTotalMediaSize(Set<DownloadInfo> set) {
        int i = 0;
        if (set != null) {
            Iterator<DownloadInfo> it2 = set.iterator();
            while (it2.hasNext()) {
                i = (int) (((long) i) + it2.next().size);
            }
        }
        return i;
    }

    @NonNull
    public static Set<DownloadInfo> getUnDownloadContent(TrainingDetail trainingDetail) {
        Set<DownloadInfo> setA = trainingDetail != null ? a(trainingDetail.content) : null;
        if (setA == null) {
            setA = new HashSet<>();
        }
        DownloadInfo downloadInfoB = b(trainingDetail);
        if (downloadInfoB != null && getMedialFromCacheByUri(downloadInfoB.url, downloadInfoB.size) == null) {
            setA.add(downloadInfoB);
        }
        return setA;
    }

    public static File newMedialPathByUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (!TextUtils.isEmpty(lastPathSegment)) {
                return new File(FileUtils.getTrainingDir().getAbsolutePath(), lastPathSegment);
            }
        }
        return null;
    }

    public static boolean trainingCanPlay(TrainingDetail trainingDetail) {
        if (trainingDetail != null) {
            TrainerInfo trainerInfo = TrainerInfo.get();
            if (ParseJsonUtil.getLongByGender(trainingDetail.time, trainerInfo) == 0) {
                return false;
            }
            List<ActionContent> list = trainingDetail.content;
            if (list != null && list.size() > 0) {
                for (ActionContent actionContent : list) {
                    if (ParseJsonUtil.getLongByGender(actionContent.duration, trainerInfo) == 0) {
                        return false;
                    }
                    if ("COUNT".equals(actionContent.type) && actionContent.repeatNumber.intValue() == 0) {
                        return false;
                    }
                    List<ActionVideo> list2 = actionContent.videos;
                    if (list2.size() > 0) {
                        ActionVideo actionVideo = list2.get(0);
                        if (list2.size() == 2 && actionVideo.gender.intValue() != trainerInfo.gender) {
                            actionVideo = list2.get(1);
                        }
                        File medialFromCacheByUri = getMedialFromCacheByUri(actionVideo.url, actionVideo.size.longValue());
                        ActionAudio actionAudio = actionContent.audio;
                        File medialFromCacheByUri2 = getMedialFromCacheByUri(actionAudio.url, actionAudio.size.longValue());
                        if (actionVideo.time.intValue() == 0 || actionVideo.singleActionTime.longValue() == 0 || medialFromCacheByUri == null || !medialFromCacheByUri.exists() || medialFromCacheByUri2 == null || !medialFromCacheByUri2.exists()) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}

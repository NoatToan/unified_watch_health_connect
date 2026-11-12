package com.huami.sleepassistant.apilib.utils.ext;

import com.huami.sleepassistant.apilib.bean.UpdateCollection;
import com.huami.sleepassistant.apilib.db.po.LiveMusic;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import com.huami.sleepassistant.apilib.vo.MusicVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0003¨\u0006\b"}, d2 = {"Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "Lcom/huami/sleepassistant/apilib/db/po/Music;", "toMusic", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "Lcom/huami/sleepassistant/apilib/db/po/LiveMusic;", "toLiveMusic", "Lcom/huami/sleepassistant/apilib/bean/UpdateCollection;", "toUpdateCollection", "apilib_release"}, k = 2, mv = {1, 5, 1})
public final class VoToPoExKt {
    @NotNull
    public static final LiveMusic toLiveMusic(@NotNull LiveMusicVo liveMusicVo) {
        String sid = liveMusicVo.getSid();
        String userId = liveMusicVo.getUserId();
        String str = userId == null ? "" : userId;
        String name = liveMusicVo.getName();
        String str2 = name == null ? "" : name;
        String description = liveMusicVo.getDescription();
        String str3 = description == null ? "" : description;
        int playTime = liveMusicVo.getPlayTime();
        String itemImgUrl = liveMusicVo.getItemImgUrl();
        return new LiveMusic(sid, str, str2, str3, playTime, itemImgUrl == null ? "" : itemImgUrl, liveMusicVo.isDown(), liveMusicVo.getProgress());
    }

    @NotNull
    public static final Music toMusic(@NotNull MusicVo musicVo) {
        return new Music(musicVo.getId(), musicVo.getWhetherPay(), musicVo.getGoodsId(), musicVo.getScIntroduction(), musicVo.getSupportDevices(), musicVo.getDeliveryApps(), musicVo.getDeliveryTime(), musicVo.getExpiredTime(), musicVo.getLanguages(), musicVo.getSimpleChinese(), musicVo.getBigImgUrl(), musicVo.getSmallImgUrl(), musicVo.getAudioUrl(), musicVo.getSort(), 0, musicVo.getPlayAddress(), 0, 0, 212992, null);
    }

    @NotNull
    public static final UpdateCollection toUpdateCollection(@NotNull LiveMusicVo liveMusicVo) {
        return new UpdateCollection(liveMusicVo.getSid(), liveMusicVo.getName(), liveMusicVo.getPlayTime(), liveMusicVo.getItemImgUrl());
    }
}

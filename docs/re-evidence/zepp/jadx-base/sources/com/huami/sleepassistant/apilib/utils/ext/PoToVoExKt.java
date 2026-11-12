package com.huami.sleepassistant.apilib.utils.ext;

import com.huami.sleepassistant.apilib.bean.AudioResources;
import com.huami.sleepassistant.apilib.db.po.LiveMusic;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import com.huami.sleepassistant.apilib.vo.MusicVo;
import com.huami.watch.wififtp.FileManagerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\b*\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/huami/sleepassistant/apilib/db/po/Music;", "Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "toMusicVo", "Lcom/huami/sleepassistant/apilib/bean/AudioResources;", "toAudioResources", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "toMusicControlVo", "Lcom/huami/sleepassistant/apilib/db/po/LiveMusic;", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "apilib_release"}, k = 2, mv = {1, 5, 1})
public final class PoToVoExKt {
    @NotNull
    public static final AudioResources toAudioResources(@NotNull Music music) {
        return new AudioResources(music.getAudioUrl(), music.getId(), music.getBigImgUrl(), music.getSmallImgUrl());
    }

    @NotNull
    public static final MusicControlVo toMusicControlVo(@NotNull Music music) {
        return new MusicControlVo(music.getId(), music.getSimpleChinese(), WebBeanToPoExKt.getPlayAddress(Intrinsics.stringPlus(music.getId(), FileManagerFragment.FILE_TYPE_MUSIC)), music.getBigImgUrl(), music.getSmallImgUrl());
    }

    @NotNull
    public static final MusicVo toMusicVo(@NotNull Music music) {
        return new MusicVo(music.getId(), music.getWhetherPay(), music.getGoodsId(), music.getScIntroduction(), music.getSupportDevices(), music.getDeliveryApps(), music.getDeliveryTime(), music.getExpiredTime(), music.getLanguages(), music.getSimpleChinese(), music.getBigImgUrl(), music.getAudioUrl(), music.getSort(), WebBeanToPoExKt.getPlayAddress(Intrinsics.stringPlus(music.getId(), FileManagerFragment.FILE_TYPE_MUSIC)), music.getSmallImgUrl(), music.getProgress());
    }

    @NotNull
    public static final LiveMusicVo toMusicVo(@NotNull LiveMusic liveMusic) {
        return new LiveMusicVo(liveMusic.getSid(), liveMusic.getUserId(), liveMusic.getName(), liveMusic.getDescription(), liveMusic.getPlayTime(), liveMusic.getItemImgUrl(), liveMusic.isDown(), liveMusic.getProgress());
    }
}

package com.huami.sleepassistant.apilib.utils.ext;

import com.huami.sleepassistant.apilib.bean.SleepMusicBean;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.vo.MusicControlVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0000\u001a*\u0010\u0003\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/SleepMusicBean;", "Lcom/huami/sleepassistant/apilib/db/po/Music;", "toMusic", "toSleepMusicBean", "Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "toMusicControlVo2", "toMusicControlVo", "", "status", "", "currentTime", "", "isCollection", "collectionId", "apilib_release"}, k = 2, mv = {1, 5, 1})
public final class SleepBeanToPoExKt {
    @NotNull
    public static final Music toMusic(@NotNull SleepMusicBean sleepMusicBean) {
        return new Music(sleepMusicBean.getId(), 0, "", null, null, null, null, "", null, sleepMusicBean.getTitle(), sleepMusicBean.getBgSrc(), sleepMusicBean.getLogoSrc(), sleepMusicBean.getUrl(), 0, 0, "", 0, 0, 196608, null);
    }

    @NotNull
    public static final MusicControlVo toMusicControlVo(@NotNull SleepMusicBean sleepMusicBean) {
        return new MusicControlVo(sleepMusicBean.getId(), sleepMusicBean.getTitle(), sleepMusicBean.getUrl(), sleepMusicBean.getBgSrc(), sleepMusicBean.getLogoSrc());
    }

    @NotNull
    public static final MusicControlVo toMusicControlVo2(@NotNull Music music) {
        return new MusicControlVo(music.getId(), music.getSimpleChinese(), music.getAudioUrl(), music.getBigImgUrl(), music.getSmallImgUrl());
    }

    @NotNull
    public static final SleepMusicBean toSleepMusicBean(@NotNull Music music) {
        String id = music.getId();
        String simpleChinese = music.getSimpleChinese();
        String str = simpleChinese == null ? "" : simpleChinese;
        String audioUrl = music.getAudioUrl();
        String str2 = audioUrl == null ? "" : audioUrl;
        String bigImgUrl = music.getBigImgUrl();
        String str3 = bigImgUrl == null ? "" : bigImgUrl;
        String smallImgUrl = music.getSmallImgUrl();
        if (smallImgUrl == null) {
            smallImgUrl = "";
        }
        return new SleepMusicBean(id, str, str2, str3, smallImgUrl, 0L, "0", false, "");
    }

    @NotNull
    public static final SleepMusicBean toSleepMusicBean(@NotNull MusicControlVo musicControlVo, @NotNull String str, long j, boolean z, @NotNull String str2) {
        String id = musicControlVo.getId();
        String simpleChinese = musicControlVo.getSimpleChinese();
        String str3 = simpleChinese == null ? "" : simpleChinese;
        String playAddress = musicControlVo.getPlayAddress();
        String str4 = playAddress == null ? "" : playAddress;
        String bigImgUrl = musicControlVo.getBigImgUrl();
        String str5 = bigImgUrl == null ? "" : bigImgUrl;
        String itemImageUrl = musicControlVo.getItemImageUrl();
        return new SleepMusicBean(id, str3, str4, str5, itemImageUrl == null ? "" : itemImageUrl, j, str, z, str2);
    }
}

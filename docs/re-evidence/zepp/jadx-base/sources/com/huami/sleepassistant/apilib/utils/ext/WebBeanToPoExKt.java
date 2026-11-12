package com.huami.sleepassistant.apilib.utils.ext;

import com.huami.sleepassistant.apilib.bean.LiveMusicBean;
import com.huami.sleepassistant.apilib.bean.MusicBean;
import com.huami.sleepassistant.apilib.db.po.LiveMusic;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.utils.MediaFileUtils;
import com.huami.watch.wififtp.FileManagerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\n\u001a\u00020\t*\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "Lcom/huami/sleepassistant/apilib/db/po/Music;", "toMusic", "", "id", "", "getIsPresence", "getPlayAddress", "Lcom/huami/sleepassistant/apilib/bean/LiveMusicBean;", "Lcom/huami/sleepassistant/apilib/db/po/LiveMusic;", "toLiveMusic", "apilib_release"}, k = 2, mv = {1, 5, 1})
public final class WebBeanToPoExKt {
    public static final int getIsPresence(@NotNull String str) {
        return MediaFileUtils.INSTANCE.newInstance().getDirFiles().contains(str) ? 1 : 0;
    }

    @NotNull
    public static final String getPlayAddress(@NotNull String str) {
        return getIsPresence(str) == 1 ? Intrinsics.stringPlus(MediaFileUtils.INSTANCE.getBaseDirSleepAssistantPath(), str) : "";
    }

    @NotNull
    public static final LiveMusic toLiveMusic(@NotNull LiveMusicBean liveMusicBean) {
        return new LiveMusic(liveMusicBean.getSid(), liveMusicBean.getUserId(), liveMusicBean.getName(), liveMusicBean.getDescription(), liveMusicBean.getPlayTime(), liveMusicBean.getItemImgUrl(), false, 0, 192, null);
    }

    @NotNull
    public static final Music toMusic(@NotNull MusicBean musicBean) {
        String id = musicBean.getId();
        int whetherPay = musicBean.getWhetherPay();
        String scIntroduction = musicBean.getScIntroduction();
        String supportDevices = musicBean.getSupportDevices();
        String deliveryTime = musicBean.getDeliveryTime();
        return new Music(id, whetherPay, "", scIntroduction, supportDevices, musicBean.getDeliveryApps(), deliveryTime, "", musicBean.getLanguages(), musicBean.getSimpleChinese(), musicBean.getBigImgUrl(), musicBean.getSmallImgUrl(), musicBean.getAudioUrl(), musicBean.getSort(), getIsPresence(Intrinsics.stringPlus(musicBean.getId(), FileManagerFragment.FILE_TYPE_MUSIC)), getPlayAddress(Intrinsics.stringPlus(musicBean.getId(), FileManagerFragment.FILE_TYPE_MUSIC)), 0, 0, 196608, null);
    }
}

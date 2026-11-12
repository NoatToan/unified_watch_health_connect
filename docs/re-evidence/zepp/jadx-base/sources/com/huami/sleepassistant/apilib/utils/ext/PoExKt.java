package com.huami.sleepassistant.apilib.utils.ext;

import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleepassistant.apilib.db.po.LiveMusic;
import com.huami.sleepassistant.apilib.db.po.Music;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/sleepassistant/apilib/db/po/Music;", WebConstant.QueryParam.TYPE_MUSIC, "combine", "Lcom/huami/sleepassistant/apilib/db/po/LiveMusic;", "liveMusic", "apilib_release"}, k = 2, mv = {1, 5, 1})
public final class PoExKt {
    @NotNull
    public static final Music combine(@NotNull Music music, @NotNull Music music2) {
        return !Intrinsics.areEqual(music.getId(), music2.getId()) ? music : music.copy((262142 & 1) != 0 ? music.id : music.getId(), (262142 & 2) != 0 ? music.whetherPay : 0, (262142 & 4) != 0 ? music.goodsId : null, (262142 & 8) != 0 ? music.scIntroduction : null, (262142 & 16) != 0 ? music.supportDevices : null, (262142 & 32) != 0 ? music.deliveryApps : null, (262142 & 64) != 0 ? music.deliveryTime : null, (262142 & 128) != 0 ? music.expiredTime : null, (262142 & 256) != 0 ? music.languages : null, (262142 & 512) != 0 ? music.simpleChinese : null, (262142 & 1024) != 0 ? music.bigImgUrl : null, (262142 & 2048) != 0 ? music.smallImgUrl : null, (262142 & 4096) != 0 ? music.audioUrl : null, (262142 & 8192) != 0 ? music.sort : 0, (262142 & 16384) != 0 ? music.ispresence : 0, (262142 & 32768) != 0 ? music.playAddress : null, (262142 & 65536) != 0 ? music.isPlay : 0, (262142 & 131072) != 0 ? music.progress : 0);
    }

    @NotNull
    public static final LiveMusic combine(@NotNull LiveMusic liveMusic, @NotNull LiveMusic liveMusic2) {
        if (Intrinsics.areEqual(liveMusic.getSid(), liveMusic2.getSid())) {
            return liveMusic.copy((254 & 1) != 0 ? liveMusic.sid : liveMusic.getSid(), (254 & 2) != 0 ? liveMusic.userId : null, (254 & 4) != 0 ? liveMusic.name : null, (254 & 8) != 0 ? liveMusic.description : null, (254 & 16) != 0 ? liveMusic.playTime : 0, (254 & 32) != 0 ? liveMusic.itemImgUrl : null, (254 & 64) != 0 ? liveMusic.isDown : false, (254 & 128) != 0 ? liveMusic.progress : 0);
        }
        return liveMusic;
    }
}

package com.xiaomi.hm.health.play.card.intelligence.watchface;

import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinInfo;
import com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBean;
import com.xiaomi.hm.health.play.bean.Metas;
import com.xiaomi.hm.health.play.bean.WatchFaceData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002*j\u0010\r\"2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u000522\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinInfo;", "a", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "b", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/ParameterName;", "name", "holder", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "ItemClickListener", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class WatchFaceCardAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchSkinInfo a(WatchFaceData watchFaceData) {
        WatchSkinInfo watchSkinInfo = new WatchSkinInfo();
        watchSkinInfo.id = watchFaceData.getId();
        watchSkinInfo.skinBin = watchFaceData.getDownLoadUrl();
        watchSkinInfo.name = watchFaceData.getName();
        Integer size = watchFaceData.getSize();
        watchSkinInfo.skinSize = size == null ? null : size.toString();
        String[] strArr = new String[1];
        Metas metas = watchFaceData.getMetas();
        String gif = metas == null ? null : metas.getGif();
        if (gif == null) {
            gif = watchFaceData.getImage();
        }
        strArr[0] = gif;
        watchSkinInfo.thumbnails = strArr;
        Metas metas2 = watchFaceData.getMetas();
        watchSkinInfo.fwVersion = metas2 != null ? metas2.getMinFwVersion() : null;
        return watchSkinInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchSkinBean b(WatchFaceData watchFaceData) {
        WatchSkinBean watchSkinBean = new WatchSkinBean();
        watchSkinBean.setId(Integer.valueOf(watchFaceData.getId()));
        watchSkinBean.setName(watchFaceData.getName());
        Integer size = watchFaceData.getSize();
        watchSkinBean.setSize(size == null ? 0 : size.intValue());
        watchSkinBean.setImage(watchFaceData.getImage());
        watchSkinBean.setDownloadUrl(watchFaceData.getDownLoadUrl());
        com.xiaomi.hm.health.device.watchskinnew.bean.Metas metas = new com.xiaomi.hm.health.device.watchskinnew.bean.Metas();
        Metas metas2 = watchFaceData.getMetas();
        metas.setMinimumFirmwareVersion(metas2 == null ? null : metas2.getMinFwVersion());
        Metas metas3 = watchFaceData.getMetas();
        metas.setGif(metas3 == null ? null : metas3.getGif());
        Metas metas4 = watchFaceData.getMetas();
        metas.setTransparentBg(metas4 != null ? metas4.getTransparentBg() : null);
        Unit unit = Unit.INSTANCE;
        watchSkinBean.setMetas(metas);
        return watchSkinBean;
    }
}

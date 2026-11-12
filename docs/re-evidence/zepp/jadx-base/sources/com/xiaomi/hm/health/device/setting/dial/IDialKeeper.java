package com.xiaomi.hm.health.device.setting.dial;

import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J$\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004`\tH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/dial/IDialKeeper;", "", "", "sn", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", LargeWatchSkinActivity.KEY_BEAN, "", "addDialBean", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getAllDialBean", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IDialKeeper {
    void addDialBean(@NotNull String sn, @NotNull MyWatchFaceBean bean);

    @NotNull
    HashMap<String, MyWatchFaceBean> getAllDialBean();
}

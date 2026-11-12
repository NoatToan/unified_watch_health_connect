package com.xiaomi.hm.health.ui.smartplay.appnotify;

import androidx.p008lifecycle.ViewModel;
import com.huami.devicex.R;
import com.xiaomi.hm.health.ui.smartplay.appnotify.data.AppSupportReplyInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyViewModel;", "Landroidx/lifecycle/ViewModel;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/data/AppSupportReplyInfo;", "Lkotlin/collections/ArrayList;", "getAppsSupportReply", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppsSupportReplyViewModel extends ViewModel {
    @NotNull
    public final ArrayList<AppSupportReplyInfo> getAppsSupportReply() {
        return CollectionsKt__CollectionsKt.arrayListOf(new AppSupportReplyInfo(R.drawable.ic_whatsapp, R.string.app_whatsapp), new AppSupportReplyInfo(R.drawable.ic_telegram, R.string.app_telegram), new AppSupportReplyInfo(R.drawable.ic_line, R.string.app_line), new AppSupportReplyInfo(R.drawable.ic_skype, R.string.app_skype));
    }
}

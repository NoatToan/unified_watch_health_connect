package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/IListDialog;", "", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListItemData;", "itemData", "", "setData", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/ItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "refreshView", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IListDialog {
    void refreshView();

    void setData(@NotNull List<ListItemData> itemData);

    void setOnItemClickListener(@NotNull ItemClickListener listener);
}

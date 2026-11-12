package com.xiaomi.fitness.sport.view;

import com.xiaomi.fitness.sport.bean.BaseSportItemBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "DATA", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "", "setData", "", "data", "(Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportTabItemData<DATA extends BaseSportItemBean> {
    void setData(@NotNull DATA data);
}

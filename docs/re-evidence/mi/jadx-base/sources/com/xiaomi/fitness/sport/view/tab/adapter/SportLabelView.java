package com.xiaomi.fitness.sport.view.tab.adapter;

import android.content.Context;
import com.xiaomi.fitness.sport.bean.SportLabelBean;
import com.xiaomi.fitness.sport.view.BaseSportItemView;
import com.xiaomi.fitness.sport.view.ISportTabItemData;
import defpackage.dvi;
import defpackage.ywq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/view/tab/adapter/SportLabelView;", "Lcom/xiaomi/fitness/sport/view/BaseSportItemView;", "Lywq;", "Lcom/xiaomi/fitness/sport/bean/SportLabelBean;", "Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "", "getLayoutId", "()I", "data", "", "setDataToView", "(Lcom/xiaomi/fitness/sport/bean/SportLabelBean;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportLabelView extends BaseSportItemView<ywq, SportLabelBean> implements ISportTabItemData<SportLabelBean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportLabelView(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public int getLayoutId() {
        return dvi.P1;
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public void setDataToView(@NotNull SportLabelBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ywq binding = getBinding();
        if (binding != null) {
            binding.A0(data.getLabel());
        }
    }
}

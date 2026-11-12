package com.huami.device.feature.health.ui.adapter;

import androidx.fragment.app.Fragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.device.feature.health.ui.R;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.lib.rainbow.ListTile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/device/feature/health/ui/adapter/HrDetectAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huami/device/feature/health/ui/item/SettingItem;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convert", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function1;", "settingFunc", "<init>", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HrDetectAdapter extends BaseQuickAdapter<SettingItem, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<Function0<Boolean>, Unit> settingFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public HrDetectAdapter(@NotNull Fragment fragment, @NotNull Function1<? super Function0<Boolean>, Unit> function1) {
        super(R.layout.item_hr_detect, null);
        this.fragment = fragment;
        this.settingFunc = function1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull SettingItem item) {
        item.bindItemView(this.fragment, (ListTile) helper.itemView, null, this.settingFunc);
    }
}

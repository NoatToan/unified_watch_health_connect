package com.huami.sky.ui.setting;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR9\u0010\u000b\u001a%\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002j\u0004\u0018\u0001`\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/ui/setting/AlarmItem;", "Lcom/huami/sky/ui/setting/SettingItemType;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sky/ui/setting/SkySettingNavigation;", "getNavigation", "()Lkotlin/jvm/functions/Function1;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AlarmItem extends SettingItemType {

    @NotNull
    public static final AlarmItem INSTANCE = new AlarmItem();

    private AlarmItem() {
        super(null);
    }

    @Override // com.huami.sky.ui.setting.SettingItemType
    @Nullable
    public Function1<Context, Unit> getNavigation() {
        Pair<String, Function1<Context, Unit>> titleAndNavigationByItemType = getDeviceNavigation().getTitleAndNavigationByItemType(this);
        if (titleAndNavigationByItemType == null) {
            return null;
        }
        return titleAndNavigationByItemType.getSecond();
    }
}

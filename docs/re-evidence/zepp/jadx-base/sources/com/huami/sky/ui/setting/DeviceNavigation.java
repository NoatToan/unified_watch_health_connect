package com.huami.sky.ui.setting;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\r\u001a/\u0012\u0004\u0012\u00020\u0005\u0012#\u0012!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/ui/setting/DeviceNavigation;", "", "Lcom/huami/sky/ui/setting/SettingItemType;", "itemType", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sky/ui/setting/SkySettingNavigation;", "getTitleAndNavigationByItemType", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceNavigation {
    @Nullable
    Pair<String, Function1<Context, Unit>> getTitleAndNavigationByItemType(@NotNull SettingItemType itemType);
}

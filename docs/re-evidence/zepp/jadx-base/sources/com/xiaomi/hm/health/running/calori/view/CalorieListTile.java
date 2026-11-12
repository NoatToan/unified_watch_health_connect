package com.xiaomi.hm.health.running.calori.view;

import android.content.Context;
import android.util.AttributeSet;
import com.huami.lib.rainbow.ListTile;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/view/CalorieListTile;", "Lcom/huami/lib/rainbow/ListTile;", "", Configs.Params.RESET, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CalorieListTile extends ListTile {
    public /* synthetic */ CalorieListTile(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.lib.rainbow.ListTile
    public void reset() {
    }

    public CalorieListTile(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

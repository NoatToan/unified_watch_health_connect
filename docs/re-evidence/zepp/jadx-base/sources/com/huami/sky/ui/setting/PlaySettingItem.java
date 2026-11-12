package com.huami.sky.ui.setting;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR;\u0010\r\u001a!\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/ui/setting/PlaySettingItem;", "Lcom/huami/sky/ui/setting/SettingItemType;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/sky/ui/setting/SkySettingNavigation;", "c", "Lkotlin/jvm/functions/Function1;", "getNavigation", "()Lkotlin/jvm/functions/Function1;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class PlaySettingItem extends SettingItemType {

    @NotNull
    public static final PlaySettingItem INSTANCE = new PlaySettingItem();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Function1<Context, Unit> navigation = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Context, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) SkyPlaySettingActivity.class));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Context context) {
            a(context);
            return Unit.INSTANCE;
        }
    }

    private PlaySettingItem() {
        super(null);
    }

    @Override // com.huami.sky.ui.setting.SettingItemType
    @NotNull
    public Function1<Context, Unit> getNavigation() {
        return navigation;
    }
}

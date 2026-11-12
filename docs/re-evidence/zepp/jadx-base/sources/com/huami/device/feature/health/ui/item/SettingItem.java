package com.huami.device.feature.health.ui.item;

import androidx.fragment.app.Fragment;
import com.huami.lib.rainbow.ListTile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010JC\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/device/feature/health/ui/item/SettingItem;", "Lcom/huami/device/feature/health/ui/item/ViewItem;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/huami/lib/rainbow/ListTile;", "itemView", "", "cornerStyle", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "", "settingFunc", "bindItemView", "(Landroidx/fragment/app/Fragment;Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getItemType", "Companion", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public interface SettingItem extends ViewItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String KEY_STR_DIALOG_CANCEL = "dialogCancel";

    @NotNull
    public static final String KEY_STR_DIALOG_CONTENT = "dialogContent";

    @NotNull
    public static final String KEY_STR_DIALOG_OK = "dialogOk";

    @NotNull
    public static final String KEY_STR_DIALOG_TITLE = "dialogTitle";

    @NotNull
    public static final String KEY_STR_SUBTITLE = "subTitle";

    @NotNull
    public static final String KEY_STR_SUBTITLE_DISABLE = "subTitleDisable";

    @NotNull
    public static final String KEY_STR_TIP = "tip";

    @NotNull
    public static final String KEY_STR_TITLE = "title";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/device/feature/health/ui/item/SettingItem$Companion;", "", "", "KEY_STR_TITLE", "Ljava/lang/String;", "KEY_STR_SUBTITLE", "KEY_STR_SUBTITLE_DISABLE", "KEY_STR_TIP", "KEY_STR_DIALOG_TITLE", "KEY_STR_DIALOG_CONTENT", "KEY_STR_DIALOG_OK", "KEY_STR_DIALOG_CANCEL", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String KEY_STR_DIALOG_CANCEL = "dialogCancel";

        @NotNull
        public static final String KEY_STR_DIALOG_CONTENT = "dialogContent";

        @NotNull
        public static final String KEY_STR_DIALOG_OK = "dialogOk";

        @NotNull
        public static final String KEY_STR_DIALOG_TITLE = "dialogTitle";

        @NotNull
        public static final String KEY_STR_SUBTITLE = "subTitle";

        @NotNull
        public static final String KEY_STR_SUBTITLE_DISABLE = "subTitleDisable";

        @NotNull
        public static final String KEY_STR_TIP = "tip";

        @NotNull
        public static final String KEY_STR_TITLE = "title";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static int getItemType(@NotNull SettingItem settingItem) {
            return 2;
        }
    }

    void bindItemView(@NotNull Fragment fragment, @NotNull ListTile itemView, @Nullable Integer cornerStyle, @NotNull Function1<? super Function0<Boolean>, Unit> settingFunc);

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    int getMyItemType();
}

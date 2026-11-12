package com.huami.account.userinfo.usecase;

import com.huami.account.ui.view.ItemView;
import com.huami.lib.rainbow.ListTile;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.baseutil.Language;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/huami/account/userinfo/usecase/DisplayDefaultFieldUseCase;", "", "Lcom/huami/account/ui/view/ItemView;", "itemView", "", "fieldKey", "", Constant.METHOD_EXECUTE, "Lcom/huami/lib/rainbow/ListTile;", "tips", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class DisplayDefaultFieldUseCase {

    @NotNull
    public static final DisplayDefaultFieldUseCase INSTANCE = new DisplayDefaultFieldUseCase();

    private DisplayDefaultFieldUseCase() {
    }

    @JvmStatic
    public static final void execute(@NotNull ItemView itemView, @NotNull String fieldKey) {
        if (DetectDefaultFieldUseCase.execute(fieldKey) && Language.isSimplifiedChinese()) {
            String string = itemView.getmValueTv().getText().toString();
            if (m.endsWith$default(string, "（默认）", false, 2, null)) {
                return;
            }
            itemView.setValue(Intrinsics.stringPlus(string, "（默认）"));
        }
    }

    @JvmStatic
    public static final void execute(@NotNull ListTile itemView, @NotNull String fieldKey) {
        if (DetectDefaultFieldUseCase.execute(fieldKey) && Language.isSimplifiedChinese()) {
            String string = itemView.getTips().toString();
            if (m.endsWith$default(string, "（默认）", false, 2, null)) {
                return;
            }
            itemView.setTips(Intrinsics.stringPlus(string, "（默认）"));
        }
    }

    @JvmStatic
    public static final void execute(@NotNull ListTile itemView, @NotNull String tips, @NotNull String fieldKey) {
        if (DetectDefaultFieldUseCase.execute(fieldKey) && Language.isSimplifiedChinese() && !m.endsWith$default(tips, "（默认）", false, 2, null)) {
            itemView.setTips(Intrinsics.stringPlus(tips, "（默认）"));
        }
    }
}

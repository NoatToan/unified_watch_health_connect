package com.huami.device.feature.health.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.huami.device.feature.health.HealthUi;
import com.huami.device.feature.health.res.IAppRes;
import com.huami.device.feature.health.ui.R;
import com.huami.device.feature.health.util.HealthViewExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.analytics.DbUtils;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\n\u001a\n\u0010\f\u001a\u00020\u0003*\u00020\n\u001a\n\u0010\r\u001a\u00020\u0003*\u00020\n\u001a$\u0010\u0013\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\b¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "", "isVisible", "", "setVisible", "Lcom/huami/device/feature/health/res/IAppRes;", "getAppRes", "", "", "sortZeroMax", "Lcom/huami/lib/rainbow/ListTile;", "enableArrow", "disableArrow", "disableSwitch", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "title", "icon", "setTitleAndTipIcon", "health-ui_release"}, k = 2, mv = {1, 5, 1})
public final class HealthViewExtKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(Integer num, Integer num2) {
        if (num != null && num.intValue() == 0) {
            num = Integer.MAX_VALUE;
        }
        if (num2 != null && num2.intValue() == 0) {
            num2 = Integer.MAX_VALUE;
        }
        return Intrinsics.compare(num.intValue(), num2.intValue());
    }

    public static final void disableArrow(@NotNull ListTile listTile) {
        listTile.setTrailing((Drawable) null);
    }

    public static final void disableSwitch(@NotNull ListTile listTile) {
        setVisible(listTile.findViewById(R.id.rainbow_tile_switch), false);
    }

    public static final void enableArrow(@NotNull ListTile listTile) {
        listTile.setTrailing(R.drawable.ic_arrow_forward_20_2x);
    }

    @NotNull
    public static final IAppRes getAppRes() {
        return HealthUi.INSTANCE.getSAppRes();
    }

    public static final void setTitleAndTipIcon(@NotNull ListTile listTile, @NotNull Context context, @NotNull String str, @DrawableRes int i) {
        if (i == -1) {
            listTile.setTitle(str);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + "[img]");
        spannableStringBuilder.setSpan(new ImageSpan(context, i), str.length(), str.length() + 5, 17);
        listTile.setTitle(spannableStringBuilder);
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    @NotNull
    public static final List<Integer> sortZeroMax(@NotNull List<Integer> list) {
        return CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: zx3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HealthViewExtKt.b((Integer) obj, (Integer) obj2);
            }
        });
    }
}

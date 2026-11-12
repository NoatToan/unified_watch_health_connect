package com.xiaomi.hm.health.fragment;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0007J\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/fragment/DateUnselectedHelper;", "", "Lcom/huami/widget/wheelview/WheelView;", "wheelYear", "wheelMonth", "Landroid/widget/TextView;", "saveButton", "", "updateSaveButtonStateBySelected", "", "isEnable", "updateSaveButtonState", "wheelView", "isCurrentAtUnselectedValue", "monthPicker", "Lkotlin/Function0;", "onScrollFinished", "observeMonthPicker", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DateUnselectedHelper {

    @NotNull
    public static final DateUnselectedHelper INSTANCE = new DateUnselectedHelper();

    private DateUnselectedHelper() {
    }

    @JvmStatic
    public static final boolean isCurrentAtUnselectedValue(@NotNull WheelView wheelView) {
        WheelViewAdapter viewAdapter = wheelView.getViewAdapter();
        return (viewAdapter instanceof PickAdapter) && ((PickAdapter) viewAdapter).isContainUnselectedValue() && wheelView.getCurrentItem() == viewAdapter.getBASE_BUNDLE() - 1;
    }

    @JvmStatic
    public static final void observeMonthPicker(@NotNull WheelView monthPicker, @NotNull final Function0<Unit> onScrollFinished) {
        monthPicker.addScrollingListener(new OnWheelScrollListener() { // from class: com.xiaomi.hm.health.fragment.DateUnselectedHelper.observeMonthPicker.1
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                onScrollFinished.invoke();
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
    }

    @JvmStatic
    public static final void updateSaveButtonState(@NotNull TextView saveButton, boolean isEnable) {
        Context context = saveButton.getContext();
        int color = ContextCompat.getColor(context, R.color.s1);
        int color2 = ContextCompat.getColor(context, R.color.s2);
        if (isEnable) {
            saveButton.setEnabled(true);
            saveButton.setTextColor(color);
        } else {
            saveButton.setEnabled(false);
            saveButton.setTextColor(color2);
        }
    }

    @JvmStatic
    public static final void updateSaveButtonStateBySelected(@NotNull WheelView wheelYear, @NotNull WheelView wheelMonth, @NotNull TextView saveButton) {
        if (isCurrentAtUnselectedValue(wheelYear) || isCurrentAtUnselectedValue(wheelMonth)) {
            updateSaveButtonState(saveButton, false);
        } else {
            updateSaveButtonState(saveButton, true);
        }
    }
}

package com.huami.hmchartui.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.PluralsRes;
import androidx.fragment.app.Fragment;
import com.baidu.ocr.sdk.model.GeneralParams;
import com.huami.hmchartui.R;
import com.huami.hmchartui.model.CommonCompareData;
import com.huami.module.ktx.I18nKt;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H'J\b\u0010\f\u001a\u00020\u0004H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/hmchartui/ui/CommonCompareFragment;", "Landroidx/fragment/app/Fragment;", "", "isLast", "", "b", "", GeneralParams.GRANULARITY_SMALL, "bigger", "a", "getTimeType", "getUnitStringId", "getCompareTitle", "current", "last", "getCompareDesc", "Landroid/graphics/drawable/Drawable;", "getProgressDrawable", "Lcom/huami/hmchartui/model/CommonCompareData;", "data", "", "setViewData", "<init>", "()V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public abstract class CommonCompareFragment extends Fragment {
    public CommonCompareFragment() {
        super(R.layout.fragment_common_compare);
    }

    private final int a(int small, int bigger) {
        return c.roundToInt((small / bigger) * 100);
    }

    private final String b(boolean isLast) {
        Calendar calendar = Calendar.getInstance();
        if (isLast) {
            calendar.add(2, -1);
        }
        return requireActivity().getResources().getStringArray(R.array.common_month_list)[calendar.get(2)];
    }

    public static /* synthetic */ String c(CommonCompareFragment commonCompareFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWeekDes");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return commonCompareFragment.b(z);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract String getCompareDesc(int current, int last);

    @NotNull
    public abstract String getCompareTitle();

    @Nullable
    public abstract Drawable getProgressDrawable();

    public abstract int getTimeType();

    @PluralsRes
    public abstract int getUnitStringId();

    public final void setViewData(@Nullable CommonCompareData data) {
        View view = getView();
        ((ProgressBar) (view == null ? null : view.findViewById(R.id.pb_compare_last))).setProgressDrawable(getProgressDrawable());
        View view2 = getView();
        ((ProgressBar) (view2 == null ? null : view2.findViewById(R.id.pb_compare_this))).setProgressDrawable(getProgressDrawable());
        if (data == null) {
            return;
        }
        if (getTimeType() == 18) {
            View view3 = getView();
            ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.tv_compare_last_title))).setText(b(true));
            View view4 = getView();
            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.tv_compare_this_title))).setText(c(this, false, 1, null));
        } else {
            View view5 = getView();
            ((TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.tv_compare_last_title))).setText(R.string.common_last_week);
            View view6 = getView();
            ((TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.tv_compare_this_title))).setText(R.string.common_this_week);
        }
        View view7 = getView();
        ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.tv_compare_title))).setText(getCompareTitle());
        View view8 = getView();
        ((TypefaceTextView) (view8 == null ? null : view8.findViewById(R.id.tv_compare_desc))).setText(getCompareDesc(data.getCurrent(), data.getLast()));
        if (data.getCurrent() < data.getLast()) {
            View view9 = getView();
            ((ProgressBar) (view9 == null ? null : view9.findViewById(R.id.pb_compare_last))).setProgress(100);
            View view10 = getView();
            ((ProgressBar) (view10 == null ? null : view10.findViewById(R.id.pb_compare_this))).setProgress(a(data.getCurrent(), data.getLast()));
        } else if (data.getCurrent() != data.getLast()) {
            View view11 = getView();
            ((ProgressBar) (view11 == null ? null : view11.findViewById(R.id.pb_compare_this))).setProgress(100);
            View view12 = getView();
            ((ProgressBar) (view12 == null ? null : view12.findViewById(R.id.pb_compare_last))).setProgress(a(data.getLast(), data.getCurrent()));
        } else if (data.getCurrent() == 0) {
            View view13 = getView();
            ((ProgressBar) (view13 == null ? null : view13.findViewById(R.id.pb_compare_last))).setProgress(0);
            View view14 = getView();
            ((ProgressBar) (view14 == null ? null : view14.findViewById(R.id.pb_compare_this))).setProgress(0);
        } else {
            View view15 = getView();
            ((ProgressBar) (view15 == null ? null : view15.findViewById(R.id.pb_compare_last))).setProgress(100);
            View view16 = getView();
            ((ProgressBar) (view16 == null ? null : view16.findViewById(R.id.pb_compare_this))).setProgress(100);
        }
        View view17 = getView();
        ((TypefaceTextView) (view17 == null ? null : view17.findViewById(R.id.tv_compare_this))).setText(I18nKt.i18n(data.getCurrent()));
        View view18 = getView();
        ((TypefaceTextView) (view18 == null ? null : view18.findViewById(R.id.tv_compare_this_unit))).setText(getResources().getQuantityText(getUnitStringId(), data.getCurrent()));
        View view19 = getView();
        ((TypefaceTextView) (view19 == null ? null : view19.findViewById(R.id.tv_compare_last))).setText(I18nKt.i18n(data.getLast()));
        View view20 = getView();
        ((TypefaceTextView) (view20 != null ? view20.findViewById(R.id.tv_compare_last_unit) : null)).setText(getResources().getQuantityText(getUnitStringId(), data.getLast()));
    }
}

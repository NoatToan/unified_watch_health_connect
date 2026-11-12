package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.huami.calendarview.CalendarView;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0004¨\u0006\u0018"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/MyStatueView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "desc", "setStatusDesc", "time", "setStatusTime", "refresh", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class MyStatueView extends CardView {
    private static final int a;
    private static final float b;

    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        a = (int) resourceHelper.dp2px(170.0f);
        b = resourceHelper.dp2px(10.0f);
    }

    public MyStatueView(@NotNull Context context) {
        this(context, null);
    }

    private final void a(Context context) {
        Resources resources = context.getResources();
        setRadius(resources.getDimension(R.dimen.fh_base_card_view_corner_radius));
        setCardElevation(resources.getDimension(R.dimen.fh_base_card_view_ele));
        setPreventCornerOverlap(false);
        setUseCompatPadding(true);
        setCardBackgroundColor(ExtKt.getResColor(context, R.color.s38));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(a, 1073741824));
    }

    public final void refresh() {
        int i = R.id.calendar_week;
        ((CalendarView) findViewById(i)).getMonthViewPager().invalidate();
        int childCount = ((CalendarView) findViewById(i)).getWeekViewPager().getChildCount();
        if (childCount < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            View childAt = ((CalendarView) findViewById(R.id.calendar_week)).getWeekViewPager().getChildAt(i2);
            if (childAt != null) {
                childAt.invalidate();
            }
            if (i2 == childCount) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public final void setStatusDesc(@NotNull String desc) {
        ((TextView) findViewById(R.id.tv_card_dur)).setText(desc);
    }

    public final void setStatusTime(@NotNull String time) {
        ((TextView) findViewById(R.id.tv_card_date)).setText(time);
    }

    public MyStatueView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public MyStatueView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.fh_view_status_card, (ViewGroup) this, true);
        a(context);
    }
}

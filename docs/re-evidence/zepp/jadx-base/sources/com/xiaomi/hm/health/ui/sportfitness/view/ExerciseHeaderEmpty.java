package com.xiaomi.hm.health.ui.sportfitness.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseHeaderEmpty extends LinearLayout {
    private LinearLayout a;
    private ExerciseTimeFilterType b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ExerciseTimeFilterType.values().length];
            a = iArr;
            try {
                iArr[ExerciseTimeFilterType.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ExerciseTimeFilterType.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ExerciseTimeFilterType.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ExerciseTimeFilterType.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ExerciseHeaderEmpty(Context context) {
        super(context);
    }

    private void a() {
        this.a = (LinearLayout) findViewById(R.id.ll_empty);
        hideEmptyView();
    }

    private void b() {
        setOrientation(1);
        setBackgroundResource(R.color.s38);
        LayoutInflater.from(getContext()).inflate(R.layout.exercise_header_empty, (ViewGroup) this, true);
        a();
    }

    public void hideEmptyView() {
        this.a.setVisibility(8);
    }

    public void showEmptyOrException(boolean isEmpty) {
        String string;
        this.a.getChildAt(0).setBackgroundResource(isEmpty ? R.drawable.img_nodata : R.drawable.img_refresh);
        this.a.getChildAt(0).setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.s3)));
        if (!isEmpty) {
            ((TextView) this.a.getChildAt(1)).setText(R.string.running_history_exception_prompt);
            return;
        }
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            string = getResources().getString(R.string.this_year_no_activities);
        } else if (i == 2) {
            string = getResources().getString(R.string.this_month_no_activities);
        } else if (i != 3) {
            string = i != 4 ? "" : getResources().getString(R.string.exer_data_empty);
        } else {
            string = getResources().getString(R.string.this_week_no_activities);
        }
        ((TextView) this.a.getChildAt(1)).setText(string);
    }

    public void showEmptyView() {
        this.a.setVisibility(0);
    }

    public ExerciseHeaderEmpty(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ExerciseHeaderEmpty(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ExerciseHeaderEmpty(Context context, ExerciseTimeFilterType filterType) {
        super(context);
        this.b = filterType;
        b();
    }
}

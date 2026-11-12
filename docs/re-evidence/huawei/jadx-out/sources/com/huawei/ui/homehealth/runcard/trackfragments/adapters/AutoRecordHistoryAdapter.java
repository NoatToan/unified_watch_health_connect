package com.huawei.ui.homehealth.runcard.trackfragments.adapters;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import defpackage.der;
import defpackage.izn;
import defpackage.nkw;
import defpackage.qqf;
import defpackage.vqt;
import defpackage.vrg;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class AutoRecordHistoryAdapter extends BaseRecyclerAdapter<vqt> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<Integer, BitmapDrawable> f25961c;

    public AutoRecordHistoryAdapter(List<vqt> list, Context context) {
        super(list, R.layout.layout_sport_history_child_item);
        this.f25961c = new HashMap<>(16);
        this.f25960b = context;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, vqt vqtVar) {
        RelativeLayout relativeLayout = (RelativeLayout) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_layout);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, 20, 0, 20);
            relativeLayout.setLayoutParams(layoutParams2);
        }
        HealthDivider healthDivider = (HealthDivider) recyclerHolder.itemView.findViewById(R.id.hw_show_main_layout_sport_bottom_image_interval);
        if (i == 0) {
            healthDivider.setVisibility(8);
        } else {
            healthDivider.setVisibility(0);
        }
        d(vqtVar, (ImageView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_left_img), (ImageView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_left_bg));
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_chief_sport_type_text)).setText(vrg.e(vqtVar.m(), this.f25960b));
        ((ImageView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_track_type_img)).setVisibility(8);
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_left_date_text)).setText(b(0, vqtVar.o()));
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_date)).setText(b(2, vqtVar.o()));
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_center_text)).setText(b(1, vqtVar.j()));
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_chief_sport_data_text)).setText(c(0, ((double) vqtVar.e()) / 1000.0d));
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_chief_sport_data_unit)).setText(der.d(this.f25960b, vqtVar.e()));
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_show_health_running_history_child_item_right_text)).setText(c(1, vqtVar.d()));
        ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.hw_health_sport_item_accessory_sport_data_unit)).setText(der.e(this.f25960b));
    }

    private void d(vqt vqtVar, ImageView imageView, ImageView imageView2) {
        Drawable drawableA = vqtVar.a(this.f25960b);
        Drawable drawableB = der.b(this.f25960b, drawableA, vqtVar.m());
        Drawable drawableC = qqf.c(drawableA, this.f25960b.getColor(R.color.common_color_white));
        Drawable drawableC2 = qqf.c(ContextCompat.getDrawable(this.f25960b, R.drawable.icon_bg), this.f25960b.getColor(R.color.common_colorAccent));
        der.c(imageView, drawableB, drawableC);
        imageView.setVisibility(0);
        imageView2.setBackground(drawableC2);
    }

    private String d(int i, double d) {
        if (d != 0.0d && !der.e(d)) {
            return null;
        }
        if (i == 0) {
            return UnitUtil.e(0.0d, 1, 2);
        }
        return UnitUtil.e(0.0d, 1, 0);
    }

    private String b(int i, long j) {
        String strD = d(i, j);
        if (strD != null) {
            LogUtil.a("Track_AutoRecordHistoryAdapter", "getFormatTimeData formattedZero is ", strD);
            return strD;
        }
        if (i == 0) {
            return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "HH:mm")).format(Long.valueOf(j));
        }
        if (i == 1) {
            return UnitUtil.e((int) (j / 1000));
        }
        if (i == 2) {
            return DateUtils.formatDateTime(this.f25960b, j, 24);
        }
        return "--";
    }

    private String c(int i, double d) {
        String strD = d(i, d);
        if (strD != null) {
            LogUtil.a("Track_AutoRecordHistoryAdapter", "getFormattedData formattedZero is ", strD);
            return strD;
        }
        if (i == 0) {
            return b(d);
        }
        if (i != 1) {
            if (i != 2) {
                return "--";
            }
            return der.b(d);
        }
        if (d > 360000.0d || d <= 3.6d) {
            return "--";
        }
        return izn.a((float) nkw.d(true, 3, d));
    }

    private String b(double d) {
        LogUtil.a("Track_AutoRecordHistoryAdapter", "getDistanceData sportData is ", Double.valueOf(d));
        if (!UnitUtil.f()) {
            return d < 0.005d ? "--" : der.d(d, 2);
        }
        double dE = UnitUtil.e(d, 3);
        return dE < 0.005d ? "--" : der.d(dE, 2);
    }
}

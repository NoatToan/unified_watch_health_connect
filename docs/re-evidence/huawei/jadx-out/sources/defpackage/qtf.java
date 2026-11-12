package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class qtf {
    public static final int d = Color.argb(255, 139, MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY, 191);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46794c = Color.argb(255, 251, 101, 34);
    public static final int i = Color.argb(255, 179, 124, 111);
    public static final int g = Color.argb(255, 127, 224, 227);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f46792a = Color.argb(255, 31, CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, 255);
    public static final int j = Color.argb(255, 138, 187, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f46793b = Color.argb(255, 180, 204, 61);
    public static final int e = Color.argb(255, 251, 101, 34);
    public static final int h = Color.argb(51, 0, 0, 0);

    static /* synthetic */ boolean c(int i2, int i3, int i4) {
        return false;
    }

    public static HwHealthLineDataSet i(ArrayList<HwHealthBaseEntry> arrayList, Context context, TrackLineChartHolder.c cVar) {
        qny qnyVar = new qny(arrayList, context.getResources().getString(R.string.IDS_bolt_vertical_amplitude), context.getResources().getString(R.string.IDS_bolt_vertical_amplitude), context.getResources().getString(UnitUtil.f() ? R.string.IDS_ins : R.string.IDS_cm));
        a(qnyVar);
        qnyVar.setColor(g);
        return qnyVar;
    }

    public static void e(HwHealthLineDataSet hwHealthLineDataSet) {
        hwHealthLineDataSet.e(new HwHealthLineDataSet.NodeDrawStyle() { // from class: qtf.4
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i2) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return Utils.convertDpToPixel(4.0f);
            }
        });
    }

    public static HwHealthLineDataSet a(ArrayList<HwHealthBaseEntry> arrayList, Context context, TrackLineChartHolder.c cVar) {
        qny qnyVar = new qny(arrayList, context.getResources().getString(R.string.IDS_bolt_balance_left_right_touches), context.getResources().getString(R.string.IDS_bolt_balance_left_right_touches), "");
        a(qnyVar);
        qnyVar.setColor(d);
        return qnyVar;
    }

    public static HwHealthLineDataSet e(ArrayList<HwHealthBaseEntry> arrayList, Context context, TrackLineChartHolder.c cVar) {
        qny qnyVar = new qny(arrayList, context.getResources().getString(R.string.IDS_running_posture_ground_contact_time), context.getResources().getString(R.string.IDS_running_posture_ground_contact_time), context.getResources().getString(R.string.IDS_msec_unit));
        a(qnyVar);
        qnyVar.setColor(f46792a);
        return qnyVar;
    }

    public static HwHealthLineDataSet f(ArrayList<HwHealthBaseEntry> arrayList, Context context, TrackLineChartHolder.c cVar) {
        qny qnyVar = new qny(arrayList, context.getResources().getString(R.string.IDS_bolt_vertical_stride_rate), context.getResources().getString(R.string.IDS_bolt_vertical_stride_rate), "%");
        a(qnyVar);
        qnyVar.setColor(i);
        return qnyVar;
    }

    public static HwHealthLineDataSet d(ArrayList<HwHealthBaseEntry> arrayList, Context context, TrackLineChartHolder.c cVar) {
        qny qnyVar = new qny(arrayList, context.getResources().getString(R.string.IDS_aw_version2_duration_of_passage), context.getResources().getString(R.string.IDS_aw_version2_duration_of_passage), context.getResources().getString(R.string.IDS_msec_unit));
        a(qnyVar);
        qnyVar.setColor(j);
        return qnyVar;
    }

    private static void a(qny qnyVar) {
        qnyVar.setCircleRadius(5.0f);
        qnyVar.setNodeCircleBackground(false);
        qnyVar.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: qti
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i2, int i3, int i4) {
                return qtf.c(i2, i3, i4);
            }
        });
    }

    public static HwHealthLineDataSet b(ArrayList<HwHealthBaseEntry> arrayList, Context context, TrackLineChartHolder.c cVar) {
        qny qnyVar = new qny(arrayList, context.getResources().getString(R.string.IDS_bolt_shock_peak), context.getResources().getString(R.string.IDS_bolt_shock_peak), context.getResources().getString(R.string.IDS_bolt_shock_peak_unit));
        a(qnyVar);
        qnyVar.setColor(f46794c);
        return qnyVar;
    }

    public static HwHealthLineDataSet c(ArrayList<HwHealthBaseEntry> arrayList, Context context, TrackLineChartHolder.c cVar) {
        qny qnyVar = new qny(arrayList, context.getResources().getString(R.string.IDS_motiontrack_ground_to_air_ratio), context.getResources().getString(R.string.IDS_motiontrack_ground_to_air_ratio), "");
        a(qnyVar);
        qnyVar.setColor(f46793b);
        return qnyVar;
    }

    public static int b(int i2) {
        int i3 = h;
        if (i2 == 7) {
            i3 = f46792a;
        }
        if (i2 == 8) {
            i3 = e;
        }
        if (i2 == 16) {
            i3 = j;
        }
        if (i2 == 17) {
            i3 = f46793b;
        }
        if (i2 == 19) {
            i3 = d;
        }
        if (i2 == 18) {
            i3 = g;
        }
        if (i2 == 20) {
            i3 = i;
        }
        return i2 == 21 ? f46794c : i3;
    }
}

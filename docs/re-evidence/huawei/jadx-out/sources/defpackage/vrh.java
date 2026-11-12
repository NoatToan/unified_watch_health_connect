package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.interval.Interval;
import com.huawei.ui.commonui.interval.IntervalData;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;

/* JADX INFO: loaded from: classes19.dex */
public class vrh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f51524a = {R.color.pwr_zone_one, R.color.pwr_zone_two, R.color.pwr_zone_three, R.color.pwr_zone_four, R.color.pwr_zone_five, R.color.pwr_zone_six, R.color.pwr_zone_seven, R.color.pwr_zone_eight, R.color.pwr_zone_nine};
    private static final int[] d = {R.color.pwr_zone_one_start, R.color.pwr_zone_two_start, R.color.pwr_zone_three_start, R.color.pwr_zone_four_start, R.color.pwr_zone_five_start, R.color.pwr_zone_six_start, R.color.pwr_zone_seven_start, R.color.pwr_zone_eight_start, R.color.pwr_zone_nine_start};
    private static final int[] e = {R.color.pwr_zone_one_end, R.color.pwr_zone_two_end, R.color.pwr_zone_three_end, R.color.pwr_zone_four_end, R.color.pwr_zone_five_end, R.color.pwr_zone_six_end, R.color.pwr_zone_seven_end, R.color.pwr_zone_eight_end, R.color.pwr_zone_nine_end};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f51525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f51526c;
    private LinearLayout f;
    private Interval g;
    private HealthTextView h;
    private volatile boolean i;
    private FrameLayout j;

    public vrh(Context context, View view, LinearLayout linearLayout) {
        if (view == null || context == null) {
            return;
        }
        this.f51525b = context;
        this.j = (FrameLayout) view.findViewById(R.id.item_ftp_entry);
        this.h = (HealthTextView) view.findViewById(R.id.ftp_value);
        this.f51526c = (HealthTextView) view.findViewById(R.id.ftp_desc);
        this.g = (Interval) view.findViewById(R.id.ftp_interval);
        this.f = linearLayout;
        this.j.setOnClickListener(new View.OnClickListener() { // from class: vrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f51530a.a(view2);
            }
        });
    }

    /* synthetic */ void a(View view) {
        HealthDatasActivity.d(ppv.f45787b, 1);
        ppv.e(this.f51525b, 1);
    }

    public void d() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: vrm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51531c.d();
                }
            });
            return;
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void c() {
        ReleaseLogUtil.d("Track_FtpRecordViewHolder", "updateFtpRecordView mHasFitRecord:", Boolean.valueOf(this.i));
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: vri
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c();
                }
            });
            return;
        }
        if (this.j == null) {
            LogUtil.a("Track_FtpRecordViewHolder", "mFtpValueView == null");
            return;
        }
        if (this.i) {
            this.j.setVisibility(0);
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        this.j.setVisibility(8);
    }

    public void e() {
        ReleaseLogUtil.d("Track_FtpRecordViewHolder", "requestFtpData");
        ppv.d().d(new a(this));
    }

    static class a implements ResultCallback<pqd> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<vrh> f51527c;

        a(vrh vrhVar) {
            this.f51527c = new WeakReference<>(vrhVar);
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(pqd pqdVar) {
            vrh vrhVar = this.f51527c.get();
            if (vrhVar == null) {
                LogUtil.a("Track_FtpRecordViewHolder", "FtpDataRspResultCallback mWeakReference == null");
                return;
            }
            if (pqdVar == null) {
                ReleaseLogUtil.d("Track_FtpRecordViewHolder", "requestFtpData data == null");
                vrhVar.i = false;
                vrhVar.d();
                return;
            }
            pqe pqeVarD = pqdVar.d();
            if (pqeVarD == null) {
                ReleaseLogUtil.d("Track_FtpRecordViewHolder", "requestFtpData ftpRecord == null");
                vrhVar.i = false;
                vrhVar.d();
            } else {
                ppv.e();
                List<pqf> listE = pqdVar.e();
                if (!njy.e(listE)) {
                    vrh.d(pqeVarD, listE, vrhVar);
                } else {
                    ReleaseLogUtil.d("Track_FtpRecordViewHolder", "pwrLevelConfigList null");
                }
            }
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            ReleaseLogUtil.e("Track_FtpRecordViewHolder", "requestFtpData onFailure", ExceptionUtils.c(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(pqe pqeVar, List<pqf> list, final vrh vrhVar) {
        final int iRound = (int) Math.round(pqeVar.d());
        double dC = pqeVar.c();
        final String strA = pqeVar.a();
        list.sort(Comparator.comparingDouble(new ToDoubleFunction() { // from class: vrl
            @Override // java.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                return ((pqf) obj).b();
            }
        }));
        final List<IntervalData> listB = b(list, vrhVar, pqeVar.e(), dC);
        HandlerExecutor.c(new Runnable() { // from class: vrj
            @Override // java.lang.Runnable
            public final void run() {
                vrh.b(this.f51528a, iRound, strA, listB);
            }
        });
    }

    static /* synthetic */ void b(vrh vrhVar, int i, String str, List list) {
        if (vrhVar.h == null || vrhVar.f51526c == null || vrhVar.g == null) {
            LogUtil.a("Track_FtpRecordViewHolder", "dealFtpData view null");
            return;
        }
        vrhVar.i = true;
        vrhVar.c();
        vrhVar.h.setText(vrhVar.c(i));
        vrhVar.f51526c.setText(str);
        vrhVar.g.setIntervalDataList(list);
    }

    private static List<IntervalData> b(List<pqf> list, vrh vrhVar, String str, double d2) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            pqf pqfVar = list.get(i4);
            if (pqfVar != null) {
                String strC = pqfVar.c();
                if (TextUtils.isEmpty(strC)) {
                    ReleaseLogUtil.d("Track_FtpRecordViewHolder", "findIndexByKey ftpLeve null");
                } else {
                    IntervalData intervalData = new IntervalData();
                    if (strC.equals(str)) {
                        d(vrhVar, d2, pqfVar, intervalData);
                    }
                    int size = list.size();
                    int[] iArr = f51524a;
                    if (size > iArr.length) {
                        i = iArr[i4 % list.size()];
                        i2 = d[i4 % list.size()];
                        i3 = e[i4 % list.size()];
                    } else {
                        i = iArr[i4];
                        i2 = d[i4];
                        i3 = e[i4];
                    }
                    intervalData.c(i);
                    intervalData.d(i2);
                    intervalData.b(i3);
                    if (i4 == 0) {
                        intervalData.d(IntervalData.RoundCornerType.EDGE_START);
                    } else if (i4 == list.size() - 1) {
                        intervalData.d(IntervalData.RoundCornerType.EDGE_END);
                    }
                    arrayList.add(intervalData);
                }
            }
        }
        return arrayList;
    }

    private static void d(vrh vrhVar, double d2, pqf pqfVar, IntervalData intervalData) {
        String strE = pqfVar.e();
        qlm qlmVar = new qlm();
        qlmVar.b(true);
        qlmVar.e(qre.d(vrhVar.f51525b, R.drawable.ftp_triangle_down));
        float fC = vrhVar.c(pqfVar.b(), pqfVar.a(), d2);
        ReleaseLogUtil.d("Track_FtpRecordViewHolder", "buildIntervalData position:", Float.valueOf(fC));
        qlmVar.c(fC);
        intervalData.e(qlmVar);
        qlq qlqVar = new qlq();
        qlqVar.a(strE);
        qlqVar.c(R.color.textColorSecondary);
        qlqVar.a(R.dimen.health_common_10dp);
        intervalData.b(qlqVar);
    }

    float c(double d2, double d3, double d4) {
        double d5 = d3 - d2;
        if (CommonUtil.b(d5)) {
            return 0.0f;
        }
        float fMax = (float) ((Math.max(d2, Math.min(d3, d4)) - d2) / d5);
        if (CommonUtil.b(1.0f - fMax)) {
            return 1.0f;
        }
        if (CommonUtil.b(fMax)) {
            return 0.0f;
        }
        return fMax;
    }

    private SpannableString c(int i) {
        return UnitUtil.b(this.f51525b, "\\d", qre.e(R.plurals.IDS_track_ftp_unit, i, Integer.valueOf(i)), R.style.health_ftp_value, R.style.health_ftp_unit);
    }
}

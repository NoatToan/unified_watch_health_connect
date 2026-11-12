package com.xiaomi.hm.health.ui.sportfitness.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.manager.AvatarManager;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.training.ui.widget.GridLayoutDecoration;
import com.xiaomi.hm.health.ui.sportfitness.adapter.ExerciseHistoryHeaderSportAdapter;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;
import com.xiaomi.hm.health.ui.sportfitness.event.EventUpdateStatUI;
import com.xiaomi.hm.health.ui.sportfitness.fragment.ExerciseChartFragment;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseTypeChooseManager;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatSportCountData;
import de.greenrobot.event.EventBus;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseHeaderCount extends LinearLayout {
    public static final int STAT_PAGE_INDEX_COST = 1;
    public static final int STAT_PAGE_INDEX_DIS = 0;
    public static final int TYPE_MAIN_DATA_COST = 1;
    public static final int TYPE_MAIN_DATA_DIS = 0;
    public static float screenWidthDp;
    private String A;
    private String B;
    private String C;
    private TextView D;
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private Space m;
    private ViewGroup n;
    private ViewGroup o;
    private ViewGroup p;
    private ViewGroup q;
    private ViewGroup r;
    private RecyclerView s;
    private ExerciseHistoryHeaderSportAdapter t;
    private long u;
    private long v;
    private float w;
    private float x;
    private ExerciseTimeFilterType y;
    private FragmentManager z;

    public ExerciseHeaderCount(Context context) {
        super(context);
    }

    private void a() {
        this.a = (TextView) findViewById(R.id.stat_main_data);
        this.e = (TextView) findViewById(R.id.stat_main_data_unit);
        this.b = (TextView) findViewById(R.id.stat_sub_data_first);
        this.c = (TextView) findViewById(R.id.stat_sub_data_second);
        this.d = (TextView) findViewById(R.id.stat_sub_data_third);
        this.f = (TextView) findViewById(R.id.stat_sub_data_first_unit);
        this.g = (TextView) findViewById(R.id.stat_sub_data_second_unit);
        this.h = (TextView) findViewById(R.id.stat_sub_data_third_unit);
        this.i = (ImageView) findViewById(R.id.iv_running_stat_bg);
        this.m = (Space) findViewById(R.id.exec_chart_space);
        this.n = (ViewGroup) findViewById(R.id.chart_area);
        this.j = (ImageView) findViewById(R.id.stat_view_avatar);
        this.k = (TextView) findViewById(R.id.stat_view_nickname);
        this.l = (TextView) findViewById(R.id.stat_view_sport_des);
        this.s = (RecyclerView) findViewById(R.id.stat_sport_count_view);
        this.p = (ViewGroup) findViewById(R.id.stat_sport_count_container);
        this.o = (ViewGroup) findViewById(R.id.stat_user_info_container);
        this.q = (ViewGroup) findViewById(R.id.stat_data_layout);
        this.r = (ViewGroup) findViewById(R.id.stat_share_end);
        this.D = (TextView) findViewById(R.id.tv_date_range);
        c();
        f();
    }

    private void b() {
        String str = this.A;
        if (str == null || this.n == null) {
            return;
        }
        this.z.beginTransaction().replace(R.id.chart_area, ExerciseChartFragment.newInstance(this.y, str)).commitAllowingStateLoss();
    }

    private void c() {
        this.s.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.s.addItemDecoration(new GridLayoutDecoration(getContext(), R.dimen.divider_size_dp_half, R.dimen.divider_size_dp12, R.color.s38));
        this.s.setHasFixedSize(true);
        ExerciseHistoryHeaderSportAdapter exerciseHistoryHeaderSportAdapter = new ExerciseHistoryHeaderSportAdapter();
        this.t = exerciseHistoryHeaderSportAdapter;
        exerciseHistoryHeaderSportAdapter.bindToRecyclerView(this.s);
        this.s.setAdapter(this.t);
    }

    private void d() {
        LayoutInflater.from(getContext()).inflate(R.layout.exercise_header_count, (ViewGroup) this, true);
        if (screenWidthDp == 0.0f) {
            screenWidthDp = getContext().getResources().getDisplayMetrics().widthPixels / ViewUtils.getDensityValue(getContext());
        }
        a();
        e();
    }

    private void e() {
        if (this.y == ExerciseTimeFilterType.ALL) {
            this.m.setVisibility(0);
            this.n.setVisibility(8);
        } else {
            this.m.setVisibility(8);
            this.n.setVisibility(0);
        }
    }

    private void f() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.k.setText(hMPersonInfo.getUserInfo().getNickname());
        AvatarManager.updateAvatarUI(getContext(), this.j, hMPersonInfo.getUserInfo().getAvatarPath(), hMPersonInfo.getUserInfo().getAvatar(), hMPersonInfo.getUserInfo().getNickname());
        this.l.setText(this.B);
        this.D.setText(this.C);
    }

    public Bitmap getShareBitmap() {
        Bitmap viewBitmap = BitmapUtils.getViewBitmap(this.o);
        Bitmap viewBitmap2 = BitmapUtils.getViewBitmap(this.q);
        Bitmap bitmapJoinConnectBitmap = BitmapUtils.joinConnectBitmap(viewBitmap, viewBitmap2, true, 0, viewBitmap.getHeight());
        viewBitmap.recycle();
        viewBitmap2.recycle();
        if (this.n.getVisibility() == 0) {
            Bitmap viewBitmap3 = BitmapUtils.getViewBitmap(this.n);
            bitmapJoinConnectBitmap = BitmapUtils.joinConnectBitmap(bitmapJoinConnectBitmap, viewBitmap3, true, 0, bitmapJoinConnectBitmap.getHeight() + ((int) ViewUtils.dp2px(getContext(), 15.0f)), ContextCompat.getColor(getContext(), R.color.s38));
            viewBitmap3.recycle();
        }
        if (this.t.getData().size() > 0) {
            Bitmap viewBitmap4 = BitmapUtils.getViewBitmap(this.p);
            bitmapJoinConnectBitmap = BitmapUtils.joinConnectBitmap(bitmapJoinConnectBitmap, viewBitmap4, true, 0, bitmapJoinConnectBitmap.getHeight());
            viewBitmap4.recycle();
        }
        Bitmap viewBitmap5 = BitmapUtils.getViewBitmap(this.r);
        Bitmap bitmapJoinConnectBitmap2 = BitmapUtils.joinConnectBitmap(bitmapJoinConnectBitmap, viewBitmap5, true, 0, bitmapJoinConnectBitmap.getHeight());
        viewBitmap5.recycle();
        return bitmapJoinConnectBitmap2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        EventBus.getDefault().register(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventUpdateStatUI event) {
        resetStatUI(this.u, this.v, this.w, this.x);
    }

    public void resetStatUI() {
        resetStatUI(0L, 0L, 0.0f, 0.0f);
    }

    public void updateSportCount(List<ExerciseStatSportCountData> dataList) {
        this.t.setNewData(dataList);
        this.s.postInvalidate();
    }

    public ExerciseHeaderCount(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void resetStatUI(long costTime, long exerciseCount, float distance, float calories) {
        this.u = costTime;
        this.v = exerciseCount;
        this.w = distance;
        this.x = calories;
        long j = costTime / 60;
        if (ExerciseTypeChooseManager.getInstance().getHeaderMainDataType() == 0) {
            boolean zIsMetric = UnitManager.getInstance().isMetric();
            float fConvertMeterToKmOrMile = RunDataConversion.convertMeterToKmOrMile(distance, zIsMetric);
            this.e.setText(zIsMetric ? R.string.exercise_history_stat_unit_km : R.string.exercise_history_stat_unit_mile);
            this.a.setText(DataFormatter.parseRawKilometerToFormatKilometer(fConvertMeterToKmOrMile));
            this.c.setText(String.valueOf(j));
            this.g.setText(R.string.exercise_history_stat_unit_time);
            this.d.setText(String.valueOf((int) calories));
            this.h.setText(R.string.exercise_history_stat_unit_calory);
        } else {
            this.a.setText(String.valueOf(j));
            this.e.setText(R.string.exercise_history_stat_unit_time);
            this.c.setText(String.valueOf((int) calories));
            this.g.setText(R.string.exercise_history_stat_unit_calory);
        }
        this.b.setText(String.valueOf(this.v));
        this.f.setText(R.string.exercise_history_stat_unit_count);
        this.i.setImageResource(ExerciseTypeChooseManager.getInstance().getHeaderBg());
    }

    public ExerciseHeaderCount(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ExerciseHeaderCount(Context context, FragmentManager fragmentManager, ExerciseTimeFilterType filterType, String dateRange, String sportHisDes, String dateRangeDes) {
        super(context);
        this.z = fragmentManager;
        this.y = filterType;
        this.A = dateRange;
        this.B = sportHisDes;
        this.C = dateRangeDes;
        d();
    }
}

package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.jpq;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class BasketballScoreView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDivider f11234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f11236c;
    private String[] d;
    private int e;
    private HealthTextView f;
    private RadarView g;
    private LinearLayout h;
    private int[] i;
    private ImageView j;
    private String[] k;
    private HealthTextView o;

    public BasketballScoreView(Context context) {
        super(context);
        this.f11235b = 0;
        d(context);
    }

    public BasketballScoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11235b = 0;
        d(context);
    }

    public BasketballScoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11235b = 0;
        d(context);
    }

    private void d(final Context context) {
        if (context == null) {
            LogUtil.e("Track_BasketballScoreView", "context is null");
            return;
        }
        View.inflate(context, R.layout.track_detail_basketball_score, this);
        this.d = new String[]{context.getString(R.string.IDS_aw_version2_jumping), context.getString(R.string.IDS_aw_version2_explosiveness), context.getString(R.string.IDS_aw_version2_sprint), context.getString(R.string.IDS_aw_version2_movement), context.getString(R.string.IDS_aw_version2_max_acceleration)};
        this.k = new String[]{context.getString(R.string.IDS_aw_version2_lower_body_explosive_power), context.getString(R.string.IDS_aw_version2_leg_strength), context.getString(R.string.IDS_aw_version2_fast_attack_consciousness), context.getString(R.string.IDS_aw_version2_running_around), context.getString(R.string.IDS_aw_version2_variable_speed_capability)};
        this.g = (RadarView) findViewById(R.id.radar_view);
        this.o = (HealthTextView) findViewById(R.id.total_performance_with_unit);
        this.f11236c = (ImageView) findViewById(R.id.level_ward);
        this.h = (LinearLayout) findViewById(R.id.total_performance_layout);
        this.j = (ImageView) findViewById(R.id.basketball_performance);
        this.f11234a = (HealthDivider) findViewById(R.id.performance_divider);
        this.f = (HealthTextView) findViewById(R.id.performance_score_info);
        this.o.setText(context.getResources().getString(R.string.IDS_aw_version2_overall_score_title));
        if (qrs.af(getContext()) && (this.f11236c.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11236c.getLayoutParams();
            layoutParams.setMargins(0, 0, qrs.d(context, 100.0f), 0);
            this.f11236c.setLayoutParams(layoutParams);
        }
        this.j.setOnClickListener(new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.view.BasketballScoreView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jpq.b(7, context);
            }
        });
    }

    public void setBasketballStamp(boolean z) {
        if (z && LanguageUtil.l(getContext())) {
            int iA = jpq.a(this.f11235b, this.i);
            if (iA == 0) {
                this.f11236c.setVisibility(8);
                return;
            } else {
                this.f11236c.setImageDrawable(getContext().getResources().getDrawable(iA));
                return;
            }
        }
        this.f11236c.setVisibility(8);
    }

    public void setActiveTime(int i) {
        this.f11235b = i;
    }

    public void setRadarScore(int[] iArr) {
        if (iArr == null) {
            LogUtil.e("Track_BasketballScoreView", "score is null");
            return;
        }
        this.g.setPercentOfMap(iArr);
        this.i = (int[]) iArr.clone();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(Integer.valueOf(getResources().getColor(R.color.basketball_radar_color_first)));
        arrayList.add(Integer.valueOf(getResources().getColor(R.color.basketball_radar_color_second)));
        arrayList.add(Integer.valueOf(getResources().getColor(R.color.basketball_radar_color_third)));
        arrayList.add(Integer.valueOf(getResources().getColor(R.color.basketball_radar_color_fourth)));
        this.g.setColorList(arrayList);
    }

    public void setAverageScore(int i) {
        this.g.setAverageScore(i);
        this.e = i;
    }

    public void setTotalScoreGone() {
        this.h.setVisibility(8);
        this.f.setVisibility(8);
        this.f11234a.setVisibility(8);
    }

    public void setScoreInfoText(Context context) {
        int[] iArr;
        if (context == null || (iArr = this.i) == null || iArr.length != 5) {
            LogUtil.a("Track_BasketballScoreView", "setScoreInfoText context == null || mScores == null || mScores.length != 5");
            return;
        }
        if (Utils.o() || !LanguageUtil.l(context)) {
            LogUtil.a("Track_BasketballScoreView", "setScoreInfoText isOversea and not chineseSimplified");
            this.f.setVisibility(8);
            this.f11234a.setVisibility(8);
            return;
        }
        HashMap map = new HashMap(5);
        int i = 0;
        while (true) {
            int[] iArr2 = this.i;
            if (i >= iArr2.length) {
                break;
            }
            int i2 = iArr2[i];
            if (i2 < 80) {
                map.put(Integer.valueOf(i), Integer.valueOf(i2));
            }
            i++;
        }
        if (map.size() == 0) {
            this.f.setText(context.getString(R.string.IDS_aw_version2_show_score_level5));
            LogUtil.a("Track_BasketballScoreView", "setScoreInfoText scoresMap.size() == 0");
        } else {
            ArrayList arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.view.BasketballScoreView.3
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(Map.Entry<Integer, Integer> entry, Map.Entry<Integer, Integer> entry2) {
                    return entry.getValue().compareTo(entry2.getValue());
                }
            });
            a(context, arrayList);
        }
    }

    private void a(Context context, List<Map.Entry<Integer, Integer>> list) {
        String strE;
        int size = list.size();
        int i = this.e;
        if (i >= 80) {
            strE = context.getString(R.string.IDS_aw_version2_show_score_level5);
        } else if (i >= 70) {
            if (size >= 3) {
                strE = b(list, context.getString(R.string.IDS_aw_version2_show_score_level4_3));
            } else if (size == 2) {
                strE = d(list, context.getString(R.string.IDS_aw_version2_show_score_level4_2));
            } else {
                strE = e(list, context.getString(R.string.IDS_aw_version2_show_score_level4_1));
            }
        } else if (i >= 60) {
            if (size >= 3) {
                strE = b(list, context.getString(R.string.IDS_aw_version2_show_score_level3_3));
            } else if (size == 2) {
                strE = d(list, context.getString(R.string.IDS_aw_version2_show_score_level3_2));
            } else {
                strE = e(list, context.getString(R.string.IDS_aw_version2_show_score_level3_1));
            }
        } else if (i >= 50) {
            if (size >= 3) {
                strE = b(list, context.getString(R.string.IDS_aw_version2_show_score_level2_3));
            } else if (size == 2) {
                strE = d(list, context.getString(R.string.IDS_aw_version2_show_score_level2_2));
            } else {
                strE = e(list, context.getString(R.string.IDS_aw_version2_show_score_level2_1));
            }
        } else if (size >= 3) {
            strE = b(list, context.getString(R.string.IDS_aw_version2_show_score_level1_3));
        } else if (size == 2) {
            strE = d(list, context.getString(R.string.IDS_aw_version2_show_score_level1_2));
        } else {
            strE = e(list, context.getString(R.string.IDS_aw_version2_show_score_level1_1));
        }
        this.f.setText(strE);
    }

    private String b(List<Map.Entry<Integer, Integer>> list, String str) {
        int iIntValue = list.get(0).getKey().intValue();
        int iIntValue2 = list.get(1).getKey().intValue();
        int iIntValue3 = list.get(2).getKey().intValue();
        int iMin = Math.min(iIntValue, Math.min(iIntValue2, iIntValue3));
        int iMax = Math.max(iIntValue, Math.max(iIntValue2, iIntValue3));
        int i = (((iIntValue + iIntValue2) + iIntValue3) - iMin) - iMax;
        String[] strArr = this.d;
        String str2 = strArr[iMin];
        String str3 = strArr[i];
        String str4 = strArr[iMax];
        String[] strArr2 = this.k;
        return String.format(str, str2, str3, str4, strArr2[iMin], strArr2[i], strArr2[iMax]);
    }

    private String d(List<Map.Entry<Integer, Integer>> list, String str) {
        int iIntValue = list.get(0).getKey().intValue();
        int iIntValue2 = list.get(1).getKey().intValue();
        if (iIntValue > iIntValue2) {
            iIntValue = iIntValue2;
            iIntValue2 = iIntValue;
        }
        String[] strArr = this.d;
        String str2 = strArr[iIntValue];
        String str3 = strArr[iIntValue2];
        String[] strArr2 = this.k;
        return String.format(str, str2, str3, strArr2[iIntValue], strArr2[iIntValue2]);
    }

    private String e(List<Map.Entry<Integer, Integer>> list, String str) {
        int iIntValue = list.get(0).getKey().intValue();
        return String.format(str, this.d[iIntValue], this.k[iIntValue]);
    }
}

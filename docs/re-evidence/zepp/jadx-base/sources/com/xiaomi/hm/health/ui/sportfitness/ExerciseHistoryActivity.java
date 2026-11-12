package com.xiaomi.hm.health.ui.sportfitness;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.chenenyu.router.annotation.Route;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import com.xiaomi.hm.health.eventbus.EventDetailBack;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper;
import com.xiaomi.hm.health.ui.sportfitness.ExerciseHistoryActivity;
import com.xiaomi.hm.health.ui.sportfitness.adapter.ExerciseHistoryPagerAdapter;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;
import com.xiaomi.hm.health.ui.sportfitness.fragment.ExerciseChooseTypeFragment;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseInfoManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseTypeChooseManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatData;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryDateUtils;
import com.xiaomi.hm.health.utils.AppRateDialogHelper;
import com.xiaomi.hm.health.utils.GlobalTitleStyle;
import de.greenrobot.event.EventBus;
import defpackage.u6;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes22.dex */
@Route({RouterHelper.EXERCISE_HISTORY})
public class ExerciseHistoryActivity extends BaseTitleActivity {
    public static final String CATEGORY = "category";
    public static final String EXTRA_BUNDLE = "bundle";
    private static final String K = "ExerciseHistoryActivity";
    private static final String L = "req_stat_data";
    private static final String M = "latest_sport_time";
    private static final String N = "into_exact_sport_type";
    public static final String TYPE = "type";
    private ExerciseTypeChooseManager C;
    private ExerciseInfoManager D;
    private TextView x;
    private ViewPager y;
    private Map<ExerciseTimeFilterType, TextView> z = new HashMap();
    private Map<ExerciseTimeFilterType, ImageView> A = new HashMap();
    private ExerciseTimeFilterType B = ExerciseTimeFilterType.ALL;
    private Context E = null;
    private boolean F = false;
    private long G = 0;
    private int H = -1;
    private boolean I = true;
    private boolean J = false;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ExerciseTimeFilterType.values().length];
            a = iArr;
            try {
                iArr[ExerciseTimeFilterType.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ExerciseTimeFilterType.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ExerciseTimeFilterType.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ExerciseTimeFilterType.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void A() {
        TrainingHistoryHelper.getInstance().cancelSyncRecords();
        PostRunningDataToServer.cancelSyncRunningData();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    private void B() {
        int i = this.H;
        if (i == 0) {
            HMKeeper.setChooseExerciseType(106);
        } else if (i != 1) {
            if (i != 2001 && i != 2002) {
                switch (i) {
                    case 6:
                        HMKeeper.setChooseExerciseType(103);
                        break;
                    case 7:
                    case 8:
                        HMKeeper.setChooseExerciseType(101);
                        break;
                    case 9:
                    case 10:
                        HMKeeper.setChooseExerciseType(102);
                        break;
                    case 11:
                        HMKeeper.setChooseExerciseType(105);
                        break;
                    case 12:
                    case 16:
                        HMKeeper.setChooseExerciseType(108);
                        break;
                    case 13:
                        HMKeeper.setChooseExerciseType(104);
                        break;
                    case 14:
                    case 15:
                        HMKeeper.setChooseExerciseType(107);
                        break;
                    case 17:
                    case 18:
                        HMKeeper.setChooseExerciseType(110);
                        break;
                    default:
                        switch (i) {
                            case 21:
                                HMKeeper.setChooseExerciseType(112);
                                break;
                            case 22:
                                HMKeeper.setChooseExerciseType(104);
                                break;
                            case 23:
                            case 24:
                                HMKeeper.setChooseExerciseType(108);
                                break;
                            case 25:
                            case 26:
                                HMKeeper.setChooseExerciseType(101);
                                break;
                            default:
                                switch (i) {
                                    case 40:
                                        HMKeeper.setChooseExerciseType(103);
                                        break;
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                        HMKeeper.setChooseExerciseType(105);
                                        break;
                                    case 47:
                                    case 48:
                                        HMKeeper.setChooseExerciseType(102);
                                        break;
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                        HMKeeper.setChooseExerciseType(108);
                                        break;
                                    default:
                                        switch (i) {
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                                HMKeeper.setChooseExerciseType(108);
                                                break;
                                            case 62:
                                            case 65:
                                            case 68:
                                                HMKeeper.setChooseExerciseType(113);
                                                break;
                                            case 63:
                                            case 64:
                                            case 66:
                                            case 67:
                                            case 69:
                                            case 70:
                                                HMKeeper.setChooseExerciseType(104);
                                                break;
                                            case 71:
                                            case 72:
                                            case 73:
                                            case 74:
                                            case 75:
                                                HMKeeper.setChooseExerciseType(109);
                                                break;
                                            default:
                                                switch (i) {
                                                    case 77:
                                                        HMKeeper.setChooseExerciseType(109);
                                                        break;
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                        HMKeeper.setChooseExerciseType(110);
                                                        break;
                                                    case 93:
                                                    case 94:
                                                        HMKeeper.setChooseExerciseType(112);
                                                        break;
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                        HMKeeper.setChooseExerciseType(111);
                                                        break;
                                                    case 105:
                                                        HMKeeper.setChooseExerciseType(105);
                                                        break;
                                                    case 106:
                                                        HMKeeper.setChooseExerciseType(113);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 108:
                                                            case 109:
                                                            case 111:
                                                            case 114:
                                                            case 130:
                                                                HMKeeper.setChooseExerciseType(108);
                                                                break;
                                                            case 110:
                                                                HMKeeper.setChooseExerciseType(101);
                                                                break;
                                                            case 112:
                                                            case 113:
                                                                HMKeeper.setChooseExerciseType(109);
                                                                break;
                                                            case 115:
                                                            case 116:
                                                            case 117:
                                                            case 118:
                                                            case 119:
                                                            case 120:
                                                                HMKeeper.setChooseExerciseType(114);
                                                                break;
                                                            case 121:
                                                            case 122:
                                                                HMKeeper.setChooseExerciseType(110);
                                                                break;
                                                            case 123:
                                                            case 124:
                                                                HMKeeper.setChooseExerciseType(113);
                                                                break;
                                                            case 125:
                                                            case 126:
                                                            case 127:
                                                            case 128:
                                                                HMKeeper.setChooseExerciseType(105);
                                                                break;
                                                            case 129:
                                                                HMKeeper.setChooseExerciseType(104);
                                                                break;
                                                            case 131:
                                                                HMKeeper.setChooseExerciseType(103);
                                                                break;
                                                            case 132:
                                                                HMKeeper.setChooseExerciseType(112);
                                                                break;
                                                            case 133:
                                                                HMKeeper.setChooseExerciseType(115);
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 136:
                                                                    case DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING /* 178 */:
                                                                        HMKeeper.setChooseExerciseType(105);
                                                                        break;
                                                                    case 137:
                                                                        HMKeeper.setChooseExerciseType(104);
                                                                        break;
                                                                    case 138:
                                                                    case 139:
                                                                    case 140:
                                                                    case 141:
                                                                    case 157:
                                                                    case 172:
                                                                        HMKeeper.setChooseExerciseType(113);
                                                                        break;
                                                                    case 142:
                                                                    case 145:
                                                                    case 151:
                                                                    case 152:
                                                                    case 153:
                                                                    case 154:
                                                                    case 158:
                                                                    case 162:
                                                                    case 164:
                                                                    case 169:
                                                                    case 170:
                                                                    case 171:
                                                                        HMKeeper.setChooseExerciseType(110);
                                                                        break;
                                                                    case 143:
                                                                    case 149:
                                                                    case 150:
                                                                    case 167:
                                                                    case 183:
                                                                        HMKeeper.setChooseExerciseType(108);
                                                                        break;
                                                                    case 144:
                                                                    case 159:
                                                                    case 160:
                                                                    case 161:
                                                                    case 163:
                                                                    case DataTypeSource.SPORT_TYPE_SHOOT /* 179 */:
                                                                        HMKeeper.setChooseExerciseType(114);
                                                                        break;
                                                                    case 146:
                                                                    case 165:
                                                                    case 166:
                                                                    case 168:
                                                                        HMKeeper.setChooseExerciseType(109);
                                                                        break;
                                                                    case 147:
                                                                    case 148:
                                                                        HMKeeper.setChooseExerciseType(111);
                                                                        break;
                                                                    case 155:
                                                                    case 156:
                                                                        HMKeeper.setChooseExerciseType(107);
                                                                        break;
                                                                    case DataTypeSource.SPORT_TYPE_CHESS /* 173 */:
                                                                    case DataTypeSource.SPORT_TYPE_CHECKERS /* 174 */:
                                                                    case 175:
                                                                    case DataTypeSource.SPORT_TYPE_BRIDGE /* 176 */:
                                                                    case 177:
                                                                        HMKeeper.setChooseExerciseType(116);
                                                                        break;
                                                                    case 180:
                                                                    case DataTypeSource.SPORT_TYPE_DOWNHILL /* 181 */:
                                                                    case DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING /* 182 */:
                                                                        HMKeeper.setChooseExerciseType(115);
                                                                        break;
                                                                    case DataTypeSource.SPORT_TYPE_BOULDERING /* 184 */:
                                                                    case DataTypeSource.SPORT_TYPE_MODERN_DANCE /* 185 */:
                                                                    case DataTypeSource.SPORT_TYPE_DISCO /* 186 */:
                                                                    case DataTypeSource.SPORT_TYPE_TAP_DANCE /* 187 */:
                                                                    case 188:
                                                                    case 189:
                                                                    case 190:
                                                                    case DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER /* 191 */:
                                                                    default:
                                                                        switch (i) {
                                                                            case DataTypeSource.SPORT_TYPE_MODERN_DANCE /* 185 */:
                                                                            case DataTypeSource.SPORT_TYPE_DISCO /* 186 */:
                                                                            case DataTypeSource.SPORT_TYPE_TAP_DANCE /* 187 */:
                                                                                HMKeeper.setChooseExerciseType(109);
                                                                                break;
                                                                            case 188:
                                                                                HMKeeper.setChooseExerciseType(110);
                                                                                break;
                                                                            case 189:
                                                                                HMKeeper.setChooseExerciseType(114);
                                                                                break;
                                                                            case 190:
                                                                                HMKeeper.setChooseExerciseType(104);
                                                                                break;
                                                                            default:
                                                                                HMKeeper.setChooseExerciseType(this.C.getDefaultExerType());
                                                                                break;
                                                                        }
                                                                        break;
                                                                    case 192:
                                                                        HMKeeper.setChooseExerciseType(101);
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                HMKeeper.setChooseExerciseType(112);
            }
        } else {
            HMKeeper.setChooseExerciseType(101);
        }
        long j = this.G;
        if (j > 0) {
            this.B = ExerciseHistoryDateUtils.getProperTimeFilterTypeByLatestSportTime(j);
        }
        if (this.F) {
            HistoryRecordManager.getInstance().getStatInfoInRx().observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: hu1
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.G((ExerciseStatData) obj);
                }
            }, u6.a);
        } else {
            a0();
        }
    }

    private ExerciseTimeFilterType C(@IdRes int id) {
        if (id == R.id.query_by_month) {
            return ExerciseTimeFilterType.MONTH;
        }
        if (id == R.id.query_by_week) {
            return ExerciseTimeFilterType.WEEK;
        }
        return id == R.id.query_by_year ? ExerciseTimeFilterType.YEAR : ExerciseTimeFilterType.ALL;
    }

    private void D() {
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("type");
            HMLog.i(K, "type:" + stringExtra, new Object[0]);
            if (!TextUtils.isEmpty(stringExtra)) {
                if ("all".equals(stringExtra)) {
                    this.B = ExerciseTimeFilterType.ALL;
                } else if ("week".equals(stringExtra)) {
                    this.B = ExerciseTimeFilterType.WEEK;
                } else if ("month".equals(stringExtra)) {
                    this.B = ExerciseTimeFilterType.MONTH;
                } else if ("year".equals(stringExtra)) {
                    this.B = ExerciseTimeFilterType.YEAR;
                }
            }
            HMLog.i(K, "111 mTimeFilterType:" + this.B, new Object[0]);
        }
    }

    private void E() {
        this.E = getApplicationContext();
        this.D = ExerciseInfoManager.getInstance();
        ExerciseTypeChooseManager exerciseTypeChooseManager = ExerciseTypeChooseManager.getInstance();
        this.C = exerciseTypeChooseManager;
        exerciseTypeChooseManager.initChooseType(this.E);
    }

    private void F() {
        GlobalTitleStyle.setSportUnifyTitleStyle(this, true, getString(R.string.running_history_title));
        TextView titleTextView = getTitleTextView();
        this.x = titleTextView;
        titleTextView.setTextColor(getResources().getColor(R.color.s1));
        if (GlobalConfig.get().isBuildMidong()) {
            this.x.setTextSize(17.0f);
            this.x.setCompoundDrawablePadding(5);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.width = -2;
        this.x.setLayoutParams(layoutParams);
        if (getRightImage().getVisibility() == 0) {
            getRightImage().setOnClickListener(new View.OnClickListener() { // from class: au1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.M(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(ExerciseStatData exerciseStatData) {
        a0();
        this.F = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        ExerciseTimeFilterType exerciseTimeFilterTypeC = C(view.getId());
        HMLog.i(K, "clickedType :: " + exerciseTimeFilterTypeC + "    mTimeFilterType" + this.B, new Object[0]);
        if (this.B != exerciseTimeFilterTypeC) {
            W(exerciseTimeFilterTypeC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: bu1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(ViewGroup viewGroup) {
        ExerciseTimeFilterType exerciseTimeFilterTypeC = C(viewGroup.getId());
        this.A.put(exerciseTimeFilterTypeC, (ImageView) viewGroup.getChildAt(0));
        this.z.put(exerciseTimeFilterTypeC, (TextView) viewGroup.getChildAt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(Throwable th) {
        HMLog.error(K, "", th, new Function0() { // from class: eu1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExerciseHistoryActivity.K();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(View view) {
        ExerciseHistoryFragment exerciseHistoryFragment;
        Z(this.B, SportAnalytics.EVENT_SHARE_EXERCISE_RECORD_C, "tp");
        ViewPager viewPager = this.y;
        if (viewPager == null || viewPager.getAdapter() == null || (exerciseHistoryFragment = (ExerciseHistoryFragment) ((ExerciseHistoryPagerAdapter) this.y.getAdapter()).getItemAt(this.y.getCurrentItem())) == null) {
            return;
        }
        exerciseHistoryFragment.S1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(View view) {
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(View view) {
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean P(Long l) {
        return Boolean.valueOf((isFinishing() || isDestroyed()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(String str) {
        int[] iArr = this.C.filterExerciseType(true)[1];
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.run_title_arrow_down);
        drawable.setTint(getResources().getColor(R.color.s1));
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        if (iArr.length == 1) {
            this.x.setCompoundDrawables(null, null, null, null);
            this.x.setOnClickListener(null);
        } else {
            this.x.setCompoundDrawables(null, null, drawable, null);
        }
        this.x.setText(str);
        String exerTypes = this.C.getExerTypes();
        HMLog.i(K, "newExerTypes::" + exerTypes, new Object[0]);
        if (exerTypes.equals(HistoryRecordManager.getInstance().getExerTypes())) {
            return;
        }
        HistoryRecordManager.getInstance().setExerTypes(exerTypes);
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(Long l) {
        ExerciseChooseTypeFragment exerciseChooseTypeFragment = new ExerciseChooseTypeFragment();
        exerciseChooseTypeFragment.setDialogDismissListener(new ExerciseChooseTypeFragment.DialogDismissListener() { // from class: cu1
            @Override // com.xiaomi.hm.health.ui.sportfitness.fragment.ExerciseChooseTypeFragment.DialogDismissListener
            public final void onDismiss(String str) {
                this.a.Q(str);
            }
        });
        getSupportFragmentManager().beginTransaction().add(exerciseChooseTypeFragment, "chooseType").commit();
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.run_title_arrow_up);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.x.setCompoundDrawables(null, null, drawable, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(Throwable th) {
        HMLog.error(K, "", th, new Function0() { // from class: du1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ExerciseHistoryActivity.S();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(ExerciseTimeFilterType exerciseTimeFilterType, ColorStateList colorStateList, ColorStateList colorStateList2, ExerciseTimeFilterType exerciseTimeFilterType2) {
        int i;
        if (exerciseTimeFilterType2 == ExerciseTimeFilterType.WEEK) {
            i = R.drawable.ic_query_by_week;
        } else if (exerciseTimeFilterType2 == ExerciseTimeFilterType.MONTH) {
            i = R.drawable.ic_query_by_month;
        } else {
            i = exerciseTimeFilterType2 == ExerciseTimeFilterType.YEAR ? R.drawable.ic_query_by_year : R.drawable.ic_query_by_list;
        }
        Drawable drawable = ContextCompat.getDrawable(this.E, i);
        TextView textView = this.z.get(exerciseTimeFilterType2);
        ImageView imageView = this.A.get(exerciseTimeFilterType2);
        if (exerciseTimeFilterType2 == exerciseTimeFilterType) {
            imageView.setImageDrawable(TintUtils.tintDrawable(drawable.mutate(), colorStateList));
            textView.setTextColor(colorStateList);
        } else {
            imageView.setImageDrawable(drawable);
            textView.setTextColor(colorStateList2);
        }
    }

    private void V() {
        Y(true);
    }

    private void W(ExerciseTimeFilterType clickedType) {
        HMLog.i(K, "onFilterTabClicked :: " + clickedType, new Object[0]);
        this.B = clickedType;
        c0(clickedType);
        this.D.deInitChartData();
        Y(false);
        Z(clickedType, SportAnalytics.EVENT_EXERCISE_HISTORY_OP, "pos");
    }

    private void X() {
        if (getIntent() != null) {
            Bundle bundleExtra = getIntent().getBundleExtra("bundle");
            if (bundleExtra != null) {
                this.F = bundleExtra.getBoolean(L, false);
                this.G = bundleExtra.getLong(M, 0L);
                this.H = bundleExtra.getInt(N, -1);
            }
            String stringExtra = getIntent().getStringExtra("category");
            HMLog.i(K, "category:" + stringExtra, new Object[0]);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            if (!"all".equals(stringExtra)) {
                if ("ride".equals(stringExtra)) {
                    this.H = 9;
                } else if ("walk".equals(stringExtra)) {
                    this.H = 6;
                } else if (NavigateContent.APP_GOTO_RECOR_INDOOR_FLAG.equals(stringExtra)) {
                    this.H = 24;
                } else if ("course".equals(stringExtra)) {
                    this.H = 0;
                }
            }
            this.J = true;
        }
    }

    private void Y(boolean keepPage) {
        int currentItem = (!keepPage || this.B == ExerciseTimeFilterType.ALL) ? 0 : this.y.getCurrentItem();
        ExerciseHistoryPagerAdapter exerciseHistoryPagerAdapter = new ExerciseHistoryPagerAdapter(getSupportFragmentManager(), this.B);
        this.y.setAdapter(exerciseHistoryPagerAdapter);
        if (!keepPage || this.B == ExerciseTimeFilterType.ALL) {
            this.y.setCurrentItem(exerciseHistoryPagerAdapter.getPagerCount() - 1);
        } else {
            this.y.setCurrentItem(currentItem);
        }
    }

    private void Z(ExerciseTimeFilterType filterType, String eventID, String paramName) {
        String str;
        int i = a.a[filterType.ordinal()];
        if (i == 1) {
            str = "Week";
        } else if (i != 2) {
            str = i != 3 ? "Total" : SportAnalytics.Params.VALUE_YEAR;
        } else {
            str = "Month";
        }
        Analytics.recordEvent(new CountEventBuilder(eventID).addExtra(paramName, str));
    }

    private void a0() {
        int[] iArr = this.C.filterExerciseType(true)[1];
        if (this.J) {
            this.J = false;
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.run_title_arrow_down);
            drawable.setTint(getResources().getColor(R.color.s1));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.x.setCompoundDrawables(null, null, drawable, null);
            this.x.setText(this.C.getTypeString());
            this.x.setOnClickListener(new View.OnClickListener() { // from class: zt1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.N(view);
                }
            });
        } else if (iArr.length == 1) {
            this.x.setText(iArr[0]);
            HMKeeper.setChooseExerciseType(this.C.getDefaultExerType());
            this.x.setCompoundDrawables(null, null, null, null);
        } else {
            Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.run_title_arrow_down);
            drawable2.setTint(getResources().getColor(R.color.s1));
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.x.setCompoundDrawables(null, null, drawable2, null);
            int indexByExerType = this.C.getIndexByExerType(HMKeeper.getChooseExerciseType());
            if (indexByExerType < 0) {
                this.x.setText(iArr[0]);
                HMKeeper.setChooseExerciseType(this.C.getDefaultExerType());
            } else {
                this.x.setText(iArr[indexByExerType]);
            }
            this.x.setOnClickListener(new View.OnClickListener() { // from class: st1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.O(view);
                }
            });
        }
        HistoryRecordManager.getInstance().setExerTypes(this.C.getExerTypes());
    }

    private void b0() {
        Observable.timer(50L, TimeUnit.MILLISECONDS).filter(new Func1() { // from class: yt1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.P((Long) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: tt1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.R((Long) obj);
            }
        }, u6.a);
    }

    private void c0(final ExerciseTimeFilterType selectedType) {
        final ColorStateList colorStateList = ContextCompat.getColorStateList(this, R.color.theme_sporting_orange_zepp);
        final ColorStateList colorStateList2 = ContextCompat.getColorStateList(this, R.color.s2);
        Observable.from(ExerciseTimeFilterType.values()).subscribe(new Action1() { // from class: ut1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.U(selectedType, colorStateList, colorStateList2, (ExerciseTimeFilterType) obj);
            }
        }, new Action1() { // from class: vt1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExerciseHistoryActivity.T((Throwable) obj);
            }
        });
    }

    private void findViews() {
        this.y = (ViewPager) findViewById(R.id.view_pager);
        Observable.just(Integer.valueOf(R.id.query_by_all), Integer.valueOf(R.id.query_by_year), Integer.valueOf(R.id.query_by_month), Integer.valueOf(R.id.query_by_week)).map(new Func1() { // from class: xt1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return (ViewGroup) this.a.findViewById(((Integer) obj).intValue());
            }
        }).doOnNext(new Action1() { // from class: fu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.I((ViewGroup) obj);
            }
        }).subscribe(new Action1() { // from class: gu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.J((ViewGroup) obj);
            }
        }, new Action1() { // from class: wt1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExerciseHistoryActivity.L((Throwable) obj);
            }
        });
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_history);
        A();
        X();
        findViews();
        E();
        F();
        B();
        D();
        HMLog.i(K, "onCreate :: " + this.B, new Object[0]);
        W(this.B);
        RunningManager.setOrUpdateRunnerData();
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_RECORD_VIEW_NUM));
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.I) {
            EventBus.getDefault().post(new EventDetailBack(EventDetailBack.SPORT));
        }
        HistoryRecordManager.getInstance().reset();
        TrackDataManager.getInstance().clearData();
        A();
        ExerciseTypeChooseManager.deInit();
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEventMainThread(EventDetailBack event) {
        if (event.getStatus() == EventDetailBack.SPORT_DETAIL) {
            AppRateDialogHelper.showWhenActivityStart(this);
        }
    }

    public void setHasData(boolean hasData) {
        this.I = hasData;
    }
}

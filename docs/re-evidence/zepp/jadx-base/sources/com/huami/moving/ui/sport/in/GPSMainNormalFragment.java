package com.huami.moving.ui.sport.in;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.moving.R;
import com.huami.moving.datacenter.SportConfigDbClient;
import com.huami.moving.datacenter.SportDataType;
import com.huami.moving.device.SportUsingDeviceHandler;
import com.huami.moving.maps.GPSSportController;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.moving.ui.animator.SportingAnimationProvider;
import com.huami.moving.ui.sport.in.GPSMainNormalFragment;
import com.huami.moving.ui.sport.in.SportDataCenter;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.ui.view.GpsSignalView;
import com.huami.moving.ui.view.SportingDataView;
import com.huami.moving.ui.view.progresslayout.CustomRoundProgressBar;
import com.huami.moving.utils.Utils;
import com.huami.tools.log.HMLog;
import com.kogitune.activity_transition.fragment.FragmentTransitionLauncher;
import com.xiaomi.hm.health.databases.model.Runconfig;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class GPSMainNormalFragment extends Fragment {
    private static final String N = "GPSMainNormalFragment";
    private static final String O = "frag_gps_map";
    private static final String P = "frag_data_switcher";
    private static final String Q = "frag_indoor_distance_verify";
    private static final int R = R.id.tagSportDataType;
    private static final String S = "re_sport_type";
    private static final long T = 300;
    private static final long U = 800;
    private static final int V = 1000;
    private static final int W = 4;
    private static final int X = 1000;
    private SportDataFormatter A;
    private StateListener B;
    private int C;
    private String D;
    private BroadcastReceiver E;
    private boolean F;
    private Runconfig G;
    private boolean H;
    private GPSMainMapFragment M;
    private View a;
    private GpsSignalView b;
    private TextView c;
    private ImageView d;
    private View e;
    private View f;
    private View g;
    private CustomRoundProgressBar h;
    private TextView i;
    private View j;
    private View k;
    private CustomRoundProgressBar l;
    private View m;
    private LinearLayout n;
    private ImageView o;
    private View p;
    private View q;
    private View r;
    private Map<SportDataType, List<SportingDataView>> t;
    private SportingAnimationProvider u;
    private Animation v;
    private ObjectAnimator w;
    private GPSSportController x;
    private SportDataCenter y;
    private SportDataCenter.DataObserver z;
    private List<SportingDataView> s = new ArrayList();
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private long L = 0;

    public interface StateListener {
        void onContinue();

        void onFinish();

        void onPause();

        void onSettingsClicked();
    }

    public class a implements m {
        public a() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.removeListener(this);
            GPSMainNormalFragment.this.h.setProgress(0);
            GPSMainNormalFragment.this.E0();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeListener(this);
            GPSMainNormalFragment.this.h.setProgress(0);
            GPSMainNormalFragment.this.D0();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GPSMainNormalFragment.this.i.setVisibility(0);
        }
    }

    public class b implements m {
        public b() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.removeListener(this);
            GPSMainNormalFragment.this.l.setProgress(0);
            GPSMainNormalFragment.this.L0();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeListener(this);
            GPSMainNormalFragment.this.l.setProgress(0);
            GPSMainNormalFragment.this.K0();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GPSMainNormalFragment.this.m.setVisibility(0);
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            HMLog.d(GPSMainNormalFragment.N, "action : " + action, new Object[0]);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 12) {
                    String formatData = GPSMainNormalFragment.this.A.getFormatData(SportDataType.HEART_RATE, GPSMainNormalFragment.this.y);
                    GPSMainNormalFragment gPSMainNormalFragment = GPSMainNormalFragment.this;
                    gPSMainNormalFragment.c1(formatData, gPSMainNormalFragment.y.getCom.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE java.lang.String());
                } else if (intExtra == 10) {
                    GPSMainNormalFragment gPSMainNormalFragment2 = GPSMainNormalFragment.this;
                    gPSMainNormalFragment2.c1(gPSMainNormalFragment2.getString(R.string.running_num_unknown), GPSMainNormalFragment.this.y.getCom.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE java.lang.String());
                }
            }
        }
    }

    public class d implements n {
        public d() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.n
        public void onCancel() {
            GPSMainNormalFragment.this.Z();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.n
        public void onStart() {
            GPSMainNormalFragment.this.T0();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.n, android.view.View.OnTouchListener
        public /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
            return com.huami.moving.ui.sport.in.b.a(this, view, motionEvent);
        }
    }

    public class e implements n {
        public e() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.n
        public void onCancel() {
            GPSMainNormalFragment.this.b0();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.n
        public void onStart() {
            GPSMainNormalFragment.this.W0();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.n, android.view.View.OnTouchListener
        public /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
            return com.huami.moving.ui.sport.in.b.a(this, view, motionEvent);
        }
    }

    public class f implements SportingDataView.ActionListener {
        public f() {
        }

        @Override // com.huami.moving.ui.view.SportingDataView.ActionListener
        public void onDataClick(@NotNull SportingDataView sportingDataView) {
            if (GPSMainNormalFragment.this.J) {
                return;
            }
            GPSMainNormalFragment.this.C0(sportingDataView);
        }

        @Override // com.huami.moving.ui.view.SportingDataView.ActionListener
        public void onWarningClick(@NotNull SportingDataView.Warning warning) {
            if (GPSMainNormalFragment.this.J) {
                return;
            }
            if (warning == SportingDataView.Warning.HR_DEVICE_LOOSEN) {
                GPSMainNormalFragment.this.Q0();
            } else if (warning == SportingDataView.Warning.HR_DEVICE_LOW_POWER) {
                GPSMainNormalFragment.this.R0();
            }
        }
    }

    public class g implements m {
        public g() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationCancel(Animator animator) {
            com.huami.moving.ui.sport.in.a.a(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GPSMainNormalFragment.this.e.setVisibility(0);
            GPSMainNormalFragment.this.u.resetView(SportingAnimationProvider.Mode.MAP);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GPSMainNormalFragment.this.c.setTextColor(-16777216);
            GPSMainNormalFragment.this.b.setTextColor(-16777216);
            GPSMainNormalFragment.this.e.setVisibility(4);
            GPSMainNormalFragment.this.d.setVisibility(8);
            GPSMainNormalFragment.this.r.setVisibility(8);
            GPSMainNormalFragment.this.i.setVisibility(8);
            GPSMainNormalFragment.this.X0(false);
        }
    }

    public class h implements m {
        public h() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationCancel(Animator animator) {
            com.huami.moving.ui.sport.in.a.a(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GPSMainNormalFragment.this.c.setTextColor(-1);
            GPSMainNormalFragment.this.b.setTextColor(-1);
            GPSMainNormalFragment.this.r.setVisibility(0);
            GPSMainNormalFragment.this.d.setVisibility(0);
            GPSMainNormalFragment.this.u.resetView(SportingAnimationProvider.Mode.DATA);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GPSMainNormalFragment.this.d.setVisibility(4);
            GPSMainNormalFragment.this.e.setVisibility(8);
        }
    }

    public class i implements m {
        public final /* synthetic */ boolean a;

        public i(boolean z) {
            this.a = z;
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationCancel(Animator animator) {
            com.huami.moving.ui.sport.in.a.a(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GPSMainNormalFragment.this.j.setVisibility(8);
            GPSMainNormalFragment.this.f.setVisibility(8);
            GPSMainNormalFragment.this.k.setVisibility(8);
            GPSMainNormalFragment.this.u.resetView(SportingAnimationProvider.Status.PAUSED);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GPSMainNormalFragment.this.I = true;
            GPSMainNormalFragment.this.g1();
            GPSMainNormalFragment.this.h.setVisibility(0);
            GPSMainNormalFragment.this.g.setVisibility(0);
            if (this.a) {
                GPSMainNormalFragment.this.B.onPause();
            }
        }
    }

    public class j implements m {
        public final /* synthetic */ boolean a;

        public j(boolean z) {
            this.a = z;
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationCancel(Animator animator) {
            com.huami.moving.ui.sport.in.a.a(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GPSMainNormalFragment.this.h.setVisibility(8);
            GPSMainNormalFragment.this.g.setVisibility(8);
            GPSMainNormalFragment.this.u.resetView(SportingAnimationProvider.Status.RESUMED);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GPSMainNormalFragment.this.I = false;
            GPSMainNormalFragment.this.g1();
            GPSMainNormalFragment.this.j.setVisibility(0);
            GPSMainNormalFragment.this.f.setVisibility(0);
            GPSMainNormalFragment.this.k.setVisibility(0);
            if (this.a) {
                GPSMainNormalFragment.this.B.onContinue();
            }
            GPSMainNormalFragment.this.i.setVisibility(8);
        }
    }

    public class k implements m {
        public k() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationCancel(Animator animator) {
            com.huami.moving.ui.sport.in.a.a(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GPSMainNormalFragment.this.J = true;
            GPSMainNormalFragment.this.j.setVisibility(8);
            GPSMainNormalFragment.this.f.setVisibility(8);
            GPSMainNormalFragment.this.k.setVisibility(8);
            GPSMainNormalFragment.this.l.setVisibility(0);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationStart(Animator animator) {
            com.huami.moving.ui.sport.in.a.d(this, animator);
        }
    }

    public class l implements m {
        public l() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationCancel(Animator animator) {
            com.huami.moving.ui.sport.in.a.a(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GPSMainNormalFragment.this.J = false;
            GPSMainNormalFragment.this.u.resetView(GPSMainNormalFragment.this.I ? SportingAnimationProvider.Status.PAUSED : SportingAnimationProvider.Status.RESUMED);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public /* synthetic */ void onAnimationRepeat(Animator animator) {
            com.huami.moving.ui.sport.in.a.c(this, animator);
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.m, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            GPSMainNormalFragment.this.l.setVisibility(8);
            GPSMainNormalFragment.this.m.setVisibility(8);
            if (GPSMainNormalFragment.this.I) {
                GPSMainNormalFragment.this.g.setVisibility(0);
                GPSMainNormalFragment.this.h.setVisibility(0);
            } else {
                GPSMainNormalFragment.this.j.setVisibility(0);
                GPSMainNormalFragment.this.f.setVisibility(0);
                GPSMainNormalFragment.this.k.setVisibility(0);
            }
        }
    }

    public interface m extends Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        void onAnimationCancel(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationEnd(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationRepeat(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationStart(Animator animator);
    }

    public interface n extends View.OnTouchListener {
        void onCancel();

        void onStart();

        @Override // android.view.View.OnTouchListener
        boolean onTouch(View view, MotionEvent motionEvent);
    }

    private void A0() {
        S0(300L, new h(), this.u.closeMapAnimation());
        Y(SportAnalytics.EVENT_RUNNING_MAP_EXIT_CLICK, new Map[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(SportDataType sportDataType, SportDataCenter sportDataCenter) {
        HMLog.i(N, "onDataChanged:" + sportDataType, new Object[0]);
        String formatData = this.A.getFormatData(sportDataType, sportDataCenter);
        if (sportDataType == SportDataType.HEART_RATE) {
            NotificationForSporting.getInstance().setHrFmtValue(formatData);
            c1(formatData, sportDataCenter.getCom.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE java.lang.String());
            return;
        }
        SportDataType sportDataType2 = SportDataType.PACE;
        if (sportDataType == sportDataType2) {
            if (this.C == 9) {
                NotificationForSporting.getInstance().setSpeedFmtValue(formatData);
                Z0(SportDataType.SPEED, formatData);
                return;
            } else {
                NotificationForSporting.getInstance().setPaceFmtValue(formatData);
                Z0(sportDataType2, formatData);
                return;
            }
        }
        SportDataType sportDataType3 = SportDataType.AVG_PACE;
        if (sportDataType == sportDataType3) {
            if (this.C == 9) {
                sportDataType3 = SportDataType.AVG_SPEED;
            }
            Z0(sportDataType3, formatData);
            return;
        }
        if (sportDataType == SportDataType.ALTITUDE) {
            NotificationForSporting.getInstance().setAltitudeFmtValue(formatData);
        } else if (sportDataType == SportDataType.DISTANCE) {
            NotificationForSporting.getInstance().setDistanceFmtValue(formatData);
        } else if (sportDataType == SportDataType.STEP_FREQ) {
            NotificationForSporting.getInstance().setStepFreqFmtValue(formatData);
            d1(sportDataType, formatData);
            return;
        } else if (sportDataType == SportDataType.STEPS) {
            NotificationForSporting.getInstance().setStepValue(sportDataCenter.getSteps());
            d1(sportDataType, formatData);
            return;
        } else if (sportDataType == SportDataType.TIME) {
            NotificationForSporting.getInstance().setTimeCostFmtValue(formatData);
            NotificationForSporting.getInstance().updateNotification(getActivity(), this.C, this.F, j0());
        } else if (sportDataType == SportDataType.CLIMB) {
            Y0(formatData);
            return;
        }
        Z0(sportDataType, formatData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(final SportingDataView sportingDataView) {
        final SportDataType sportDataTypeH0 = h0(sportingDataView);
        if (sportDataTypeH0 == null) {
            return;
        }
        SportDataSwitcherFragment sportDataSwitcherFragmentNewInstance = SportDataSwitcherFragment.newInstance(this.C, sportDataTypeH0, sportingDataView.getDataTextView().getText().toString());
        sportDataSwitcherFragmentNewInstance.setSportDataCenter(this.y);
        sportDataSwitcherFragmentNewInstance.setSportDataFormatter(this.A);
        sportDataSwitcherFragmentNewInstance.setActionListener(new SportDataSwitcherFragment.ActionListener() { // from class: zc2
            @Override // com.huami.moving.ui.sport.in.SportDataSwitcherFragment.ActionListener
            public final void onSportDataChanged(SportDataType sportDataType) {
                this.a.p0(sportDataTypeH0, sportingDataView, sportDataType);
            }
        });
        FragmentTransitionLauncher.with(sportingDataView.getContext()).from(sportingDataView.getDataTextView()).prepare(sportDataSwitcherFragmentNewInstance);
        getChildFragmentManager().beginTransaction().add(sportDataSwitcherFragmentNewInstance, P).addToBackStack(null).commitAllowingStateLoss();
        HashMap map = new HashMap();
        map.put(SportAnalytics.ParamKey.DATA_POSITION, String.valueOf((Integer) sportingDataView.getTag()));
        Y(SportAnalytics.EVENT_RUNNING_DATA_CHANGE_CLICK, map);
        X0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        this.B.onFinish();
        Y(SportAnalytics.EVENT_RUNNING_END_CLICK, new Map[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
    }

    private void F0() {
        S0(300L, new k(), this.u.lockAnimation());
        Y(SportAnalytics.EVENT_RUNNING_LOCK_CLICK, new Map[0]);
    }

    private void G0() {
        if (this.J) {
            return;
        }
        S0(300L, new g(), this.u.openMapAnimation());
        Y(SportAnalytics.EVENT_RUNNING_MAP_BTN_CLICK, new Map[0]);
    }

    private void H0(boolean z) {
        if (z0(z)) {
            return;
        }
        S0(300L, new i(z), this.u.pauseAnimation());
        Y(SportAnalytics.EVENT_RUNNING_PAUSE_CLICK, new Map[0]);
    }

    private void I0(boolean z) {
        if (z0(z)) {
            return;
        }
        S0(300L, new j(z), this.u.resumeAnimation());
        Y(SportAnalytics.EVENT_RUNNING_CONTINUE_CLICK, new Map[0]);
    }

    private void J0() {
        StateListener stateListener = this.B;
        if (stateListener == null) {
            return;
        }
        stateListener.onSettingsClicked();
        HashMap map = new HashMap();
        map.put(SportAnalytics.ParamKey.SPORTS_STATUS, this.I ? SportAnalytics.ParamValue.SportingStatus.WAITING : SportAnalytics.ParamValue.SportingStatus.DOING);
        Y(SportAnalytics.EVENT_RUNNING_SETTING_CLICK, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        S0(300L, new l(), this.u.unlockAnimation(this.I));
        Y(SportAnalytics.EVENT_RUNNING_UNLOCK_CLICK, new Map[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
    }

    private void M0() {
        this.E = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        getActivity().registerReceiver(this.E, intentFilter);
    }

    private void N0() {
        ArrayList arrayList = new ArrayList();
        Iterator<SportingDataView> it2 = this.s.iterator();
        while (it2.hasNext()) {
            SportDataType sportDataTypeH0 = h0(it2.next());
            if (sportDataTypeH0 != null) {
                arrayList.add(sportDataTypeH0.getId());
            }
        }
        SportConfigDbClient.setConfigDataItems(arrayList, this.C);
    }

    private void O0() {
        if (this.I) {
            this.c.setText(getString(R.string.sporting_paused, this.D));
        } else {
            this.c.setText(this.D);
        }
    }

    private void P0(String str) {
        new AlertDialogFragment.Builder(getActivity()).setCancelable(true).setMessage(str).setNeutralButton(getString(R.string.gps_main_pop_knowed), new DialogInterface.OnClickListener() { // from class: yc2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0() {
        P0(getString(R.string.gps_main_pop_tight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        P0(getString(R.string.gps_main_pop_band_battery_low));
    }

    private void S0(long j2, @Nullable Animator.AnimatorListener animatorListener, Animator... animatorArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.setDuration(j2).playTogether(animatorArr);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        if (this.w.isStarted()) {
            return;
        }
        V0(this.h, new a());
    }

    private void U0() {
        if (this.v == null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.25f);
            this.v = alphaAnimation;
            alphaAnimation.setDuration(1000L);
            this.v.setRepeatCount(-1);
            this.v.setRepeatMode(2);
            this.v.setInterpolator(new LinearInterpolator());
        }
        this.q.startAnimation(this.v);
    }

    private void V0(View view, Animator.AnimatorListener animatorListener) {
        this.w.setTarget(view);
        this.w.setIntValues(0, 1000);
        this.w.addListener(animatorListener);
        this.w.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        if (this.w.isStarted()) {
            return;
        }
        V0(this.l, new b());
    }

    private void X(String str, String str2) {
        Analytics.recordEvent(new CountEventBuilder(str).setValue(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(boolean z) {
        if (z) {
            if (SportUIKeeper.getSportingChooseDataItemTip(getContext()).booleanValue()) {
                this.n.setVisibility(0);
            }
        } else {
            SportUIKeeper.setSportingChooseDataItemTip(getContext(), false);
            if (this.n.getVisibility() == 0) {
                this.n.setVisibility(8);
            }
        }
    }

    private void Y(String str, Map<String, String>... mapArr) {
        String str2;
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        HashMap map = new HashMap();
        int i2 = this.C;
        if (i2 == 1) {
            str2 = SportAnalytics.ParamValue.SportType.OUTDOOR_RUNNING;
        } else if (i2 == 8) {
            str2 = SportAnalytics.ParamValue.SportType.TREADMILL;
        } else if (i2 == 6) {
            str2 = "Walking";
        } else {
            str2 = i2 == 9 ? SportAnalytics.ParamValue.SportType.OUTDOOR_CYCLING : "";
        }
        map.put(SportAnalytics.ParamKey.SPORTS_PAGE, str2);
        countEventBuilder.putExtras(map);
        if (mapArr != null && mapArr.length > 0) {
            if (mapArr[0].containsKey(SportAnalytics.ParamKey.SPORTS_STATUS)) {
                map.put(SportAnalytics.ParamKey.SPORTS_STATUS, mapArr[0].get(SportAnalytics.ParamKey.SPORTS_STATUS));
            } else if (mapArr[0].containsKey(SportAnalytics.ParamKey.DATA_POSITION)) {
                map.put(SportAnalytics.ParamKey.DATA_POSITION, mapArr[0].get(SportAnalytics.ParamKey.DATA_POSITION));
            }
        }
        Analytics.recordEvent(countEventBuilder);
    }

    private void Y0(String str) {
        a1(SportDataType.CLIMB, str, d0(), SportingDataView.Warning.NO_WARNING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        a0();
    }

    private void Z0(SportDataType sportDataType, String str) {
        a1(sportDataType, str, SportingDataView.Tips.NO_TIPS, SportingDataView.Warning.NO_WARNING);
    }

    private void a0() {
        if (this.w.isStarted()) {
            this.w.cancel();
        }
    }

    private void a1(SportDataType sportDataType, String str, SportingDataView.Tips tips, SportingDataView.Warning warning) {
        List<SportingDataView> list = this.t.get(sportDataType);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (SportingDataView sportingDataView : list) {
            sportingDataView.showTips(tips);
            sportingDataView.showWarning(warning);
            sportingDataView.updateDataInfo(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        int height = ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).bottomMargin + ((ViewUtils.getHeight(this.r) - ViewUtils.getHeight(this.h)) >> 2);
        ((ViewGroup.MarginLayoutParams) this.i.getLayoutParams()).setMarginEnd((((ViewUtils.getWidth(this.a) >> 1) - ViewUtils.getWidth(this.i)) * 2) / 3);
        ((ViewGroup.MarginLayoutParams) this.i.getLayoutParams()).bottomMargin = height + ViewUtils.getHeight(this.h);
        this.i.requestLayout();
    }

    private List<SportDataType> c0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SportDataType.DISTANCE);
        arrayList.add(SportDataType.TIME);
        arrayList.add(this.C == 9 ? SportDataType.SPEED : SportDataType.PACE);
        arrayList.add(SportDataType.HEART_RATE);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str, SportDataCenter.HeartRate heartRate) {
        int iHeartRateState = SportUsingDeviceHandler.getInstance().heartRateState(heartRate.getStatus());
        if (iHeartRateState == 3) {
            X(SportAnalytics.EVENT_RUNNING_HR_FAILURE, SportAnalytics.Params.VALUE_LO);
        } else if (iHeartRateState == 4) {
            X(SportAnalytics.EVENT_RUNNING_HR_FAILURE, SportAnalytics.Params.VALUE_UNTIGHTEN);
        }
        a1(SportDataType.HEART_RATE, str, e0(heartRate), f0(heartRate));
    }

    private SportingDataView.Tips d0() {
        return SportUsingDeviceHandler.getInstance().hasBaroMeter() ? SportingDataView.Tips.NO_TIPS : SportingDataView.Tips.DEVICE_NOT_SUPPORT;
    }

    private void d1(SportDataType sportDataType, String str) {
        a1(sportDataType, str, i0(), SportingDataView.Warning.NO_WARNING);
    }

    private SportingDataView.Tips e0(SportDataCenter.HeartRate heartRate) {
        int iHeartRateState = SportUsingDeviceHandler.getInstance().heartRateState(heartRate.getStatus());
        if (!j0()) {
            return SportingDataView.Tips.NO_HEART_RATE_DEVICE;
        }
        if (n0()) {
            return (!o0() || iHeartRateState == 2) ? SportingDataView.Tips.DEVICE_DISCONNECTED : SportingDataView.Tips.NO_TIPS;
        }
        return SportingDataView.Tips.BLUETOOTH_NO_ON;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        int width = ViewUtils.getWidth(this.i);
        int width2 = ViewUtils.getWidth(this.a) >> 1;
        if (width > width2) {
            this.i.setMaxWidth(width2);
            this.i.post(new Runnable() { // from class: bd2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b1();
                }
            });
        } else {
            b1();
        }
        f1();
    }

    private SportingDataView.Warning f0(SportDataCenter.HeartRate heartRate) {
        int status = heartRate.getStatus();
        int iHeartRateState = SportUsingDeviceHandler.getInstance().heartRateState(status);
        int heartRate2 = heartRate.getHeartRate();
        if ((iHeartRateState == 1 || status == 43) && heartRate2 < 0) {
            return SportingDataView.Warning.HR_DEVICE_LOOSEN;
        }
        if (iHeartRateState == 3) {
            return SportingDataView.Warning.HR_DEVICE_LOW_POWER;
        }
        return iHeartRateState == 4 ? SportingDataView.Warning.HR_DEVICE_LOOSEN : SportingDataView.Warning.NO_WARNING;
    }

    private void f1() {
        int height = ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).bottomMargin + ((ViewUtils.getHeight(this.r) - ViewUtils.getHeight(this.l)) >> 2);
        ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).bottomMargin = height + ViewUtils.getHeight(this.l);
        this.m.requestLayout();
    }

    private List<SportDataType> g0() {
        List<String> configDataItems = SportConfigDbClient.getConfigDataItems(this.C);
        ArrayList arrayList = new ArrayList();
        if (configDataItems != null && !configDataItems.isEmpty()) {
            Iterator<String> it2 = configDataItems.iterator();
            while (it2.hasNext()) {
                SportDataType sportDataTypeValueOfID = SportDataType.valueOfID(it2.next());
                if (sportDataTypeValueOfID != null) {
                    arrayList.add(sportDataTypeValueOfID);
                    if (arrayList.size() == 4) {
                        return arrayList;
                    }
                }
            }
        }
        if (arrayList.size() < 4) {
            for (SportDataType sportDataType : c0()) {
                if (!arrayList.contains(sportDataType)) {
                    arrayList.add(sportDataType);
                    if (arrayList.size() == 4) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1() {
        O0();
        if (this.I) {
            this.b.setAlpha(0.5f);
            this.c.setAlpha(0.5f);
            this.d.setAlpha(0.5f);
            U0();
            return;
        }
        this.b.setAlpha(1.0f);
        this.c.setAlpha(1.0f);
        this.d.setAlpha(1.0f);
        this.q.clearAnimation();
    }

    private SportDataType h0(SportingDataView sportingDataView) {
        Object tag = sportingDataView.getTag(R);
        if (tag instanceof SportDataType) {
            return (SportDataType) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1() {
        double height = ViewUtils.getHeight(this.a);
        int i2 = (int) (0.156d * height);
        new AnimatorViewWrapper(this.q).setTopMargin(i2);
        this.u.setDataTopMargin(i2);
        if (!DataTypeSource.isIndoorSport(this.C)) {
            int i3 = (int) (0.77d * height);
            new AnimatorViewWrapper(this.p).setHeight(i3);
            this.u.setMapContainerHeight(i3);
        }
        this.u.resetView(SportingAnimationProvider.Status.RESUMED);
        ((ViewGroup.MarginLayoutParams) this.r.getLayoutParams()).bottomMargin = (int) (height * 0.125d);
        this.r.requestLayout();
        this.r.post(new Runnable() { // from class: cd2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e1();
            }
        });
    }

    private SportingDataView.Tips i0() {
        return !this.K ? SportingDataView.Tips.DEVICE_NOT_SUPPORT : SportingDataView.Tips.NO_TIPS;
    }

    private boolean j0() {
        return SportUsingDeviceHandler.getInstance().isValidHrDevices();
    }

    private void k0(SportingDataView sportingDataView, SportDataType sportDataType) {
        List<SportingDataView> arrayList = this.t.get(sportDataType);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.t.put(sportDataType, arrayList);
        }
        if (!arrayList.contains(sportingDataView)) {
            arrayList.add(sportingDataView);
        }
        sportingDataView.setTag(R, sportDataType);
        sportingDataView.getDataTextView().setText(this.A.getFormatData(sportDataType, this.y));
        TextView descTextView = sportingDataView.getDescTextView();
        descTextView.setText(sportDataType.getNameResId());
        if (sportDataType != SportDataType.DISTANCE) {
            return;
        }
        descTextView.setText(sportDataType.unit(sportingDataView.getContext(), this.F));
    }

    private void l0() {
        if (this.M == null && isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (this.M == null) {
                this.M = new GPSMainMapFragment();
                childFragmentManager.beginTransaction().add(R.id.map_container, this.M, O).commit();
            }
            this.M.setSportType(this.C);
            this.M.setUseAmap(this.H);
            this.M.setController(this.x);
        }
    }

    private void m0() {
        f fVar = new f();
        this.t = new HashMap();
        List<SportDataType> listG0 = g0();
        int size = listG0.size();
        int i2 = 0;
        int i3 = 0;
        for (SportingDataView sportingDataView : this.s) {
            i2++;
            sportingDataView.setTag(Integer.valueOf(i2));
            sportingDataView.setActionListener(fVar);
            if (i3 < size) {
                k0(sportingDataView, listG0.get(i3));
                i3++;
            }
        }
        if (j0() && o0()) {
            return;
        }
        c1(getString(R.string.running_num_unknown), this.y.getCom.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE java.lang.String());
    }

    private boolean n0() {
        try {
            return BluetoothAdapter.getDefaultAdapter() != null && BluetoothAdapter.getDefaultAdapter().isEnabled();
        } catch (SecurityException unused) {
            return false;
        }
    }

    private boolean o0() {
        return SportUsingDeviceHandler.getInstance().isHrDeviceConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(SportDataType sportDataType, SportingDataView sportingDataView, SportDataType sportDataType2) {
        this.t.get(sportDataType).remove(sportingDataView);
        k0(sportingDataView, sportDataType2);
        if (sportDataType2 == SportDataType.HEART_RATE) {
            SportDataCenter.HeartRate heartRate = this.y.getCom.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE java.lang.String();
            sportingDataView.showTips(e0(heartRate));
            sportingDataView.showWarning(f0(heartRate));
        } else if (sportDataType2 == SportDataType.STEP_FREQ || sportDataType2 == SportDataType.STEPS) {
            sportingDataView.showTips(i0());
        }
        N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(View view) {
        G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(View view) {
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(View view) {
        H0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(View view) {
        I0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(View view) {
        J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(View view) {
        F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(View view) {
        X0(false);
    }

    private boolean z0(boolean z) {
        if (!z) {
            return false;
        }
        if (this.L == 0) {
            this.L = System.currentTimeMillis();
            return false;
        }
        if (System.currentTimeMillis() - this.L <= 1000) {
            return true;
        }
        this.L = System.currentTimeMillis();
        return false;
    }

    public void initSportVoice() {
        Runconfig runconfig = this.G;
        if (runconfig == null || runconfig.getVoicePlayEnable().booleanValue()) {
            return;
        }
        RunningPlayer.getInstance().cancel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.C = bundle.getInt(S);
        }
        this.F = RunnerData.getRunner().isMetric();
        this.A = new SportDataFormatter(getContext(), this.C, this.F);
        this.z = new SportDataCenter.DataObserver() { // from class: ld2
            @Override // com.huami.moving.ui.sport.in.SportDataCenter.DataObserver
            public final void onDataChanged(SportDataType sportDataType, SportDataCenter sportDataCenter) {
                this.a.B0(sportDataType, sportDataCenter);
            }
        };
        this.K = SportUsingDeviceHandler.getInstance().isSupportStep(getContext());
        M0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_running_gps_main_normal, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.E != null) {
            getActivity().unregisterReceiver(this.E);
            this.E = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        this.y.unregisterDataObserver(this.z);
        if (this.G != null) {
            this.G = null;
        }
        super.onDestroyView();
    }

    public void onEventMainThread(GPSMainActivity.d dVar) {
        int i2 = dVar.a;
        if (i2 == 1) {
            if (this.I) {
                return;
            }
            if (!this.J) {
                H0(false);
                return;
            } else {
                this.I = true;
                g1();
                return;
            }
        }
        if (i2 == 2 && this.I) {
            if (!this.J) {
                I0(false);
            } else {
                this.I = false;
                g1();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.G == null) {
            this.G = SportConfigDbClient.getConfig(this.C);
        }
        l0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(S, this.C);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        int i2;
        this.G = SportConfigDbClient.getConfig(this.C);
        View viewFindViewById = view.findViewById(R.id.title_container);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.topMargin = ViewUtils.getStatusBarHeight(getContext());
        viewFindViewById.setLayoutParams(marginLayoutParams);
        this.a = view.findViewById(R.id.root);
        this.b = (GpsSignalView) view.findViewById(R.id.gps_signal);
        this.c = (TextView) view.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_btn_map);
        this.d = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: fd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.q0(view2);
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.btn_close_map);
        this.e = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: hd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.r0(view2);
            }
        });
        this.f = view.findViewById(R.id.btn_pause);
        if (!Utils.isMidong()) {
            this.f.setBackgroundResource(R.drawable.btn_bg_running_pause);
        }
        this.f.setOnClickListener(new View.OnClickListener() { // from class: ed2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.s0(view2);
            }
        });
        View viewFindViewById3 = view.findViewById(R.id.btn_resume);
        this.g = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: id2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.t0(view2);
            }
        });
        this.h = (CustomRoundProgressBar) view.findViewById(R.id.btn_done);
        this.i = (TextView) view.findViewById(R.id.tv_done_tips);
        this.h.setTotal(1000);
        this.h.setOnTouchListener(new d());
        View viewFindViewById4 = view.findViewById(R.id.btn_settings);
        this.j = viewFindViewById4;
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: dd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.u0(view2);
            }
        });
        View viewFindViewById5 = view.findViewById(R.id.btn_lock);
        this.k = viewFindViewById5;
        viewFindViewById5.setOnClickListener(new View.OnClickListener() { // from class: gd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.v0(view2);
            }
        });
        this.l = (CustomRoundProgressBar) view.findViewById(R.id.btn_unlock);
        this.m = view.findViewById(R.id.tv_unlock_tips);
        this.l.setTotal(1000);
        this.l.setOnTouchListener(new e());
        this.p = view.findViewById(R.id.map_container);
        this.q = view.findViewById(R.id.data_display_container);
        View viewFindViewById6 = view.findViewById(R.id.data_container);
        viewFindViewById6.setOnTouchListener(new View.OnTouchListener() { // from class: kd2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return GPSMainNormalFragment.w0(view2, motionEvent);
            }
        });
        this.r = view.findViewById(R.id.btn_container);
        if (DataTypeSource.isIndoorSport(this.C)) {
            this.p.setVisibility(8);
            this.b.setVisibility(4);
            this.d.setVisibility(4);
        }
        this.n = (LinearLayout) view.findViewById(R.id.choose_data_item_tips_layout);
        this.o = (ImageView) view.findViewById(R.id.choose_data_item_tips_close);
        X0(true);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: jd2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.x0(view2);
            }
        });
        View viewFindViewById7 = view.findViewById(R.id.data_margin);
        SportingDataView sportingDataView = (SportingDataView) view.findViewById(R.id.sport_data_1);
        SportingDataView sportingDataView2 = (SportingDataView) view.findViewById(R.id.sport_data_2);
        SportingDataView sportingDataView3 = (SportingDataView) view.findViewById(R.id.sport_data_3);
        SportingDataView sportingDataView4 = (SportingDataView) view.findViewById(R.id.sport_data_4);
        sportingDataView.getDataTextView().setMaxLines(1);
        this.s.add(sportingDataView);
        this.s.add(sportingDataView2);
        this.s.add(sportingDataView3);
        this.s.add(sportingDataView4);
        this.u = new SportingAnimationProvider(view.getContext(), this.r, this.j, this.f, this.g, this.h, this.k, viewFindViewById6, this.q, viewFindViewById7, sportingDataView.getDataTextView(), sportingDataView2.getDataTextView(), sportingDataView3.getDataTextView(), sportingDataView4.getDataTextView(), sportingDataView.getDescTextView(), sportingDataView2.getDescTextView(), sportingDataView3.getDescTextView(), sportingDataView4.getDescTextView());
        ObjectAnimator objectAnimator = new ObjectAnimator();
        this.w = objectAnimator;
        objectAnimator.setPropertyName("progress");
        this.w.setDuration(U);
        this.w.setInterpolator(new DecelerateInterpolator());
        int i3 = this.C;
        if (i3 == 8) {
            i2 = R.string.runnings_sport_type_treadmill;
        } else if (i3 == 9) {
            i2 = R.string.sports_type_bike_ride;
        } else {
            i2 = i3 == 6 ? R.string.running_sports_type_walking : R.string.running_sports_type_running;
        }
        this.D = getString(i2);
        O0();
        viewFindViewById.post(new Runnable() { // from class: ad2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h1();
            }
        });
        m0();
        this.y.registerDataObserver(this.z);
        EventBus.getDefault().register(this);
    }

    public void setGPSSportController(GPSSportController gPSSportController) {
        this.x = gPSSportController;
    }

    public void setSportDataCenter(SportDataCenter sportDataCenter) {
        this.y = sportDataCenter;
    }

    public void setSportType(int i2) {
        this.C = i2;
    }

    public void setStateListener(StateListener stateListener) {
        this.B = stateListener;
    }

    public void setUseAmap(boolean z) {
        this.H = z;
    }

    public void updateGpsSignalLevel(int i2) {
        GpsSignalView gpsSignalView = this.b;
        if (gpsSignalView == null) {
            return;
        }
        gpsSignalView.updateSignalLevel(i2);
    }
}

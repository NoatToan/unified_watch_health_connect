package com.xiaomi.fitness.common.calendar;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.k;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fitness.baseui.calendar.view.DataTitleBarView;
import com.xiaomi.fitness.baseui.calendar.view.StatusTableLayout;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.util.HealthBundleKey;
import defpackage.a4a;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.v84;
import java.lang.ref.WeakReference;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Route(path = "/common/calendar/CalendarActivity")
public class CalendarActivity extends BaseActivity implements BaseCalendarFragment.OnCalendarSelectChangedListener, DataTitleBarView.g {
    public DataTitleBarView h;
    public FrameLayout i;
    public WeakReference<BaseCalendarFragment> j;
    public LocalDate l;
    public int m;
    public boolean n;
    public boolean o;
    public a4a v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11788k = -1;
    public int p = -1;
    public int q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11789r = false;
    public boolean s = false;
    public boolean t = false;
    public String u = "";

    public class a implements StatusTableLayout.a {
        public a() {
        }

        @Override // com.xiaomi.fitness.baseui.calendar.view.StatusTableLayout.a
        public void a(int i) {
            if (i == 2) {
                CalendarActivity.this.u(CalendarMonthFragment.class, "CalendarMonthFragment", 2);
                return;
            }
            if (i == 1) {
                CalendarActivity.this.u(CalendarWeekFragment.class, "CalendarWeekFragment", 1);
                return;
            }
            if (i == 0) {
                CalendarActivity calendarActivity = CalendarActivity.this;
                if (calendarActivity.o) {
                    calendarActivity.u(CalendarThreeCircleFragment.class, "CalendarThreeCircleFragment", 0);
                } else {
                    calendarActivity.u(CalendarDayFragment.class, "CalendarDayFragment", 0);
                }
            }
        }

        @Override // com.xiaomi.fitness.baseui.calendar.view.StatusTableLayout.a
        public void b(int i) {
        }
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.DataTitleBarView.g
    public void c() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.DataTitleBarView.g
    public void d() {
        this.j.get().scrollToCurrent();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.G;
    }

    public void initContentView() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Logger.d("CalendarTag", "initContentView invoke!! before get the mPosition " + this.f11788k);
                int calendar_fragment_position = HealthPrefer.INSTANCE.getCALENDAR_FRAGMENT_POSITION();
                this.f11788k = calendar_fragment_position;
                if (calendar_fragment_position == -1) {
                    this.f11788k = extras.getInt("position", 0);
                }
                Logger.d("CalendarTag", "initContentView invoke!! get the mPosition " + this.f11788k);
                this.l = (LocalDate) extras.getSerializable("local_date");
                this.u = extras.getString("show_switch_title");
            } else {
                this.f11788k = 0;
            }
            this.m = extras.getInt(HealthBundleKey.BUNDLE_PARAMS_EXTEND_VALUE);
            this.n = extras.getBoolean("switch_day_week_month");
            this.t = extras.getBoolean("calendar_show_future");
            this.f11789r = extras.getBoolean("from_activity", false);
            if (this.n) {
                this.h.k(true);
            } else {
                this.h.k(false);
            }
            this.s = extras.getBoolean("only_day", false);
            this.p = extras.getInt("sport_type", -1);
            this.o = extras.getBoolean(HealthBundleKey.BUNDLE_PARAMS_CALENDAR_THREE_CIRCLE_FLAG, false);
            this.q = extras.getInt("data_come_from", 0);
            if (this.s) {
                Logger.d("CalendarTag", "initContentView invoke!! onlyDayTab branch " + this.f11788k);
                u(q(0), r(0), this.f11788k);
                this.h.f.setCurrentTab(0);
            } else {
                u(q(this.f11788k), r(this.f11788k), this.f11788k);
                this.h.f.setCurrentTab(this.f11788k);
            }
        }
        setListener();
        t();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = getResources().getConfiguration().uiMode & 48;
        Logger.d("CalendarTag", "onConfigurationChanged invoke!!" + i);
        AppCompatDelegate.H(i == 16 ? 1 : 2);
        recreate();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            Logger.d("CalendarTag", "savedInstanceState is not null!!");
        }
        a4a a4aVarA0 = a4a.A0(getLayoutInflater());
        this.v = a4aVarA0;
        setContentView(a4aVarA0.getRoot());
        a4a a4aVar = this.v;
        this.h = a4aVar.B;
        this.i = a4aVar.A;
        Logger.d("CalendarTag", "onCreate invoke!!");
        initContentView();
        setActionBarDisplayable(false);
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment.OnCalendarSelectChangedListener
    public void onDayChanged(LocalDate localDate) {
        this.h.d(localDate, 0);
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment.OnCalendarSelectChangedListener
    public void onMonthChanged(LocalDate localDate) {
        this.h.d(localDate, 2);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        HealthPrefer.INSTANCE.setCALENDAR_FRAGMENT_POSITION(this.f11788k);
        Logger.d("CalendarTag", "onSaveInstanceState invoke!!");
    }

    @Override // com.xiaomi.fitness.baseui.calendar.view.DataTitleBarView.g
    public void onShowCalendar() {
    }

    @Override // com.xiaomi.fitness.common.calendar.BaseCalendarFragment.OnCalendarSelectChangedListener
    public void onWeekChanged(LocalDate localDate) {
        this.h.d(TimeDateUtil.getWeekMonday(localDate), 1);
    }

    public final Class q(int i) {
        if (this.o) {
            return CalendarThreeCircleFragment.class;
        }
        if (i == 2) {
            return CalendarMonthFragment.class;
        }
        return i == 1 ? CalendarWeekFragment.class : CalendarDayFragment.class;
    }

    public final String r(int i) {
        if (this.o) {
            return "CalendarThreeCircleFragment";
        }
        if (i == 2) {
            return "CalendarMonthFragment";
        }
        return i == 1 ? "CalendarWeekFragment" : "CalendarDayFragment";
    }

    public final /* synthetic */ void s(View view) {
        c();
    }

    public void setListener() {
        this.h.f.setOnTabSelectListener(new a());
        this.h.setOnTitleBarClickListener(this);
        this.h.f11595a.setOnClickListener(new View.OnClickListener() { // from class: n93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27676a.s(view);
            }
        });
    }

    public void t() {
        v84.i(this.h, 0, DisplayUtil.getStatusBarHeight(), 0, 0);
        this.h.f11595a.setVisibility(0);
        if (TextUtils.isEmpty(this.u)) {
            this.h.setTitle(getString(c0j.x4));
        } else {
            this.h.setTitle(this.u);
        }
        this.h.j();
        this.h.setBackgroundResource(iji.u);
        this.h.h();
    }

    public void u(Class cls, String str, int i) {
        this.f11788k = i;
        k kVarO = getSupportFragmentManager().o();
        BaseCalendarFragment baseCalendarFragment = (BaseCalendarFragment) getSupportFragmentManager().l0(str);
        Intent intent = getIntent();
        Bundle extras = intent == null ? null : intent.getExtras();
        if (intent == null) {
            extras = new Bundle();
        }
        WeakReference<BaseCalendarFragment> weakReference = this.j;
        if (weakReference != null && weakReference.get() != null) {
            kVarO.t(this.j.get());
        }
        extras.putInt("sport_type", this.p);
        extras.putInt("position", i);
        extras.putBoolean("from_activity", this.f11789r);
        extras.putSerializable("calendar_date", this.l);
        extras.putBoolean(HealthBundleKey.BUNDLE_PARAMS_CALENDAR_THREE_CIRCLE_FLAG, this.o);
        extras.putInt("data_come_from", this.q);
        extras.putBoolean("calendar_show_future", this.t);
        if (baseCalendarFragment == null) {
            try {
                BaseCalendarFragment baseCalendarFragment2 = (BaseCalendarFragment) cls.newInstance();
                try {
                    kVarO.c(eri.V1, baseCalendarFragment2, str);
                    baseCalendarFragment2.setArguments(extras);
                    baseCalendarFragment2.setOnCalendarSelectChangedListener(this);
                    baseCalendarFragment = baseCalendarFragment2;
                } catch (IllegalAccessException e) {
                    e = e;
                    baseCalendarFragment = baseCalendarFragment2;
                    e.printStackTrace();
                } catch (InstantiationException e2) {
                    e = e2;
                    baseCalendarFragment = baseCalendarFragment2;
                    e.printStackTrace();
                }
            } catch (IllegalAccessException e3) {
                e = e3;
            } catch (InstantiationException e4) {
                e = e4;
            }
            kVarO.m();
        } else {
            kVarO.F(baseCalendarFragment);
            baseCalendarFragment.setArguments(extras);
            kVarO.m();
        }
        this.j = new WeakReference<>(baseCalendarFragment);
    }
}

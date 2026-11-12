package com.garmin.android.apps.connectmobile.training.atp.schedule;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.training.atp.schedule.WorkoutScheduleActivity;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import f12.l;
import g22.k;
import hu1.f;
import hu1.h;
import hu1.i;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r22.w0;
import xw1.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/schedule/WorkoutScheduleActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lhu1/a;", "<init>", "()V", "a", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutScheduleActivity extends com.garmin.android.apps.connectmobile.c implements hu1.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f45445f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f45446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f45447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f45448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InfiniteViewPager f45449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45450e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/schedule/WorkoutScheduleActivity$b;", "", "", "count", "<init>", "(Lcom/garmin/android/apps/connectmobile/training/atp/schedule/WorkoutScheduleActivity;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f45452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f45453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f45454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f45455e;

        public b(int i14) {
            this.f45451a = i14;
            View viewFindViewById = WorkoutScheduleActivity.this.findViewById(R.id.forward_arrow);
            viewFindViewById.getClass();
            this.f45452b = (ImageView) viewFindViewById;
            View viewFindViewById2 = WorkoutScheduleActivity.this.findViewById(R.id.backward_arrow);
            viewFindViewById2.getClass();
            this.f45453c = (ImageView) viewFindViewById2;
            View viewFindViewById3 = WorkoutScheduleActivity.this.findViewById(R.id.week_txt);
            viewFindViewById3.getClass();
            this.f45454d = (TextView) viewFindViewById3;
            View viewFindViewById4 = WorkoutScheduleActivity.this.findViewById(R.id.date_txt);
            viewFindViewById4.getClass();
            this.f45455e = (TextView) viewFindViewById4;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/schedule/WorkoutScheduleActivity$c", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements ViewPager.j {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            a aVar = WorkoutScheduleActivity.f45445f;
            WorkoutScheduleActivity.this.ca();
        }
    }

    @Override // hu1.a
    public final void I1(long j8, String str) {
        ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).e(this, j8, str);
    }

    public final void ca() {
        DateTimeFormatter dateTimeFormatterForPattern;
        f fVar = this.f45446a;
        if (fVar != null) {
            DateTime dateTime = fVar.f149589q;
            DateTime dateTimePlusDays = dateTime.plusDays(fVar.f149911h * 7);
            dateTimePlusDays.getClass();
            DateTime dateTimePlusDays2 = dateTime.plusDays(fVar.f149911h * 7);
            dateTimePlusDays2.getClass();
            DateTime dateTimePlusDays3 = dateTimePlusDays2.plusDays(6);
            dateTimePlusDays3.getClass();
            int i14 = fVar.f149911h;
            b bVar = this.f45448c;
            if (bVar == null) {
                s.m("headerViewHolder");
                throw null;
            }
            int i15 = bVar.f45451a;
            ImageView imageView = bVar.f45453c;
            Context context = imageView.getContext();
            imageView.setEnabled(true);
            imageView.setImageResource(R.drawable.chevron_left);
            imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
            ImageView imageView2 = bVar.f45452b;
            imageView2.setEnabled(true);
            imageView2.setImageResource(R.drawable.chevron_right);
            imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
            if (i14 == 0) {
                imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_secondary)));
                imageView.setEnabled(false);
            }
            if (i14 == i15 - 1) {
                imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_secondary)));
                imageView2.setEnabled(false);
            }
            TextView textView = bVar.f45455e;
            DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern("MMM d-");
            if (Integer.valueOf(dateTimePlusDays.getMonthOfYear()).equals(Integer.valueOf(dateTimePlusDays3.getMonthOfYear()))) {
                dateTimeFormatterForPattern = DateTimeFormat.forPattern("d, YYYY");
                dateTimeFormatterForPattern.getClass();
            } else {
                dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM d, YYYY");
                dateTimeFormatterForPattern.getClass();
            }
            dateTimeFormatterForPattern2.getClass();
            textView.setText(j0.h(dateTimePlusDays, dateTimeFormatterForPattern2).concat(j0.h(dateTimePlusDays3, dateTimeFormatterForPattern)));
            bVar.f45454d.setText(WorkoutScheduleActivity.this.getString(R.string.lbl_current_week, String.valueOf(i14 + 1), String.valueOf(i15)));
        }
    }

    @Override // hu1.a
    public final void l2(long j8, boolean z14, boolean z15) {
        ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).r(this, j8, z14, z15, 46);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 46 && i15 == -1) {
            i iVar = this.f45447b;
            if (iVar != null) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "WorkoutSchedulePresenter", "clearCache");
                iVar.f85734d.clear();
            }
            f fVar = this.f45446a;
            if (fVar != null) {
                SparseArray<Fragment> sparseArray = fVar.f85719w;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    Fragment fragment = sparseArray.get(sparseArray.keyAt(i16));
                    if (fragment != null && (fragment instanceof h)) {
                        ((h) fragment).I6();
                    }
                }
            }
            this.f45450e = true;
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f45450e) {
            setResult(-1);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_workout_schedule);
        initActionBar(true, R.string.lbl_workout_schedule);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("ATHLETE_PLAN_EXTRA", d.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("ATHLETE_PLAN_EXTRA") : null;
            if (!(parcelableExtra instanceof d)) {
                parcelableExtra = null;
            }
            parcelable = (d) parcelableExtra;
        }
        d dVar = (d) parcelable;
        if (dVar == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "WorkoutScheduleActivity", "Missing required parameter: athlete plan");
            finish();
            return;
        }
        DateTime dateTimeS = dVar.s();
        DateTime dateTimeR = dVar.r();
        if (dateTimeS != null && dateTimeR != null) {
            View viewFindViewById = findViewById(R.id.infinite_view_pager);
            viewFindViewById.getClass();
            this.f45449d = (InfiniteViewPager) viewFindViewById;
            int i14 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c;
            this.f45447b = new i(dVar, this);
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            f fVar = new f(supportFragmentManager, k.o(i14, dateTimeS), k.b(i14, dateTimeR));
            this.f45446a = fVar;
            this.f45448c = new b(fVar.f149591t);
            fVar.f85718v = this.f45447b;
            InfiniteViewPager infiniteViewPager = this.f45449d;
            if (infiniteViewPager == null) {
                s.m("pager");
                throw null;
            }
            infiniteViewPager.setAdapter((w0) fVar);
            InfiniteViewPager infiniteViewPager2 = this.f45449d;
            if (infiniteViewPager2 == null) {
                s.m("pager");
                throw null;
            }
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            infiniteViewPager2.setDefaultPosition(fVar.c(dateTimeNow));
            ca();
            InfiniteViewPager infiniteViewPager3 = this.f45449d;
            if (infiniteViewPager3 == null) {
                s.m("pager");
                throw null;
            }
            infiniteViewPager3.c(new c());
        }
        b bVar = this.f45448c;
        if (bVar == null) {
            s.m("headerViewHolder");
            throw null;
        }
        final int i15 = 0;
        bVar.f45452b.setOnClickListener(new View.OnClickListener(this) { // from class: hu1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutScheduleActivity f85721b;

            {
                this.f85721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        WorkoutScheduleActivity workoutScheduleActivity = this.f85721b;
                        f fVar2 = workoutScheduleActivity.f45446a;
                        if (fVar2 != null) {
                            InfiniteViewPager infiniteViewPager4 = workoutScheduleActivity.f45449d;
                            if (infiniteViewPager4 != null) {
                                infiniteViewPager4.setCurrentItem(fVar2.f149911h + 1);
                                return;
                            } else {
                                s.m("pager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        WorkoutScheduleActivity workoutScheduleActivity2 = this.f85721b;
                        f fVar3 = workoutScheduleActivity2.f45446a;
                        if (fVar3 != null) {
                            InfiniteViewPager infiniteViewPager5 = workoutScheduleActivity2.f45449d;
                            if (infiniteViewPager5 != null) {
                                infiniteViewPager5.setCurrentItem(fVar3.f149911h - 1);
                                return;
                            } else {
                                s.m("pager");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        b bVar2 = this.f45448c;
        if (bVar2 == null) {
            s.m("headerViewHolder");
            throw null;
        }
        final int i16 = 1;
        bVar2.f45453c.setOnClickListener(new View.OnClickListener(this) { // from class: hu1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutScheduleActivity f85721b;

            {
                this.f85721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        WorkoutScheduleActivity workoutScheduleActivity = this.f85721b;
                        f fVar2 = workoutScheduleActivity.f45446a;
                        if (fVar2 != null) {
                            InfiniteViewPager infiniteViewPager4 = workoutScheduleActivity.f45449d;
                            if (infiniteViewPager4 != null) {
                                infiniteViewPager4.setCurrentItem(fVar2.f149911h + 1);
                                return;
                            } else {
                                s.m("pager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        WorkoutScheduleActivity workoutScheduleActivity2 = this.f85721b;
                        f fVar3 = workoutScheduleActivity2.f45446a;
                        if (fVar3 != null) {
                            InfiniteViewPager infiniteViewPager5 = workoutScheduleActivity2.f45449d;
                            if (infiniteViewPager5 != null) {
                                infiniteViewPager5.setCurrentItem(fVar3.f149911h - 1);
                                return;
                            } else {
                                s.m("pager");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.training_workout_schedule_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.menu_item_calendar) {
            ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).o(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_calendar)) != null) {
            oc.b.G(menuItemFindItem, this, R.color.gcm_icon_primary_action);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        i iVar = this.f45447b;
        if (iVar != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(iVar.f85733c);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/schedule/WorkoutScheduleActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ATHLETE_PLAN_EXTRA", "DATE_FORMAT_MONTH_DAY_SHORT", "DATE_FORMAT_WITH_YEAR", "DATE_FORMAT_DAY_MONTH_YEAR", "", "WORKOUT_REQUEST_CODE", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

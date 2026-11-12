package com.garmin.android.apps.connectmobile.workouts.presentation.msn;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.view.view_3_0.CircularViewPager;
import com.garmin.android.apps.connectmobile.workouts.data.model.m;
import com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutExerciseActivity;
import d53.w;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/MSNWorkoutExerciseActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MSNWorkoutExerciseActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f49450e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CircularViewPager f49451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<m> f49452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f49453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f49454d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/MSNWorkoutExerciseActivity$b;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/v;", "fm", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/MSNWorkoutExerciseActivity;Landroidx/fragment/app/v;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends e0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ MSNWorkoutExerciseActivity f49455h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MSNWorkoutExerciseActivity mSNWorkoutExerciseActivity, v vVar) {
            super(vVar);
            vVar.getClass();
            this.f49455h = mSNWorkoutExerciseActivity;
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF44034e() {
            ArrayList<m> arrayList = this.f49455h.f49452b;
            if (arrayList != null) {
                return arrayList.size();
            }
            s.m("exercises");
            throw null;
        }

        @Override // androidx.fragment.app.e0
        public final Fragment getItem(int i14) {
            MSNWorkoutExerciseActivity mSNWorkoutExerciseActivity = this.f49455h;
            ArrayList<m> arrayList = mSNWorkoutExerciseActivity.f49452b;
            if (arrayList == null) {
                s.m("exercises");
                throw null;
            }
            String str = arrayList.get(i14).f48256a;
            ArrayList<m> arrayList2 = mSNWorkoutExerciseActivity.f49452b;
            if (arrayList2 == null) {
                s.m("exercises");
                throw null;
            }
            String str2 = arrayList2.get(i14).f48257b;
            String string = mSNWorkoutExerciseActivity.getString(R.string.exercise_category_name_pattern, str, str2);
            string.getClass();
            String str3 = mSNWorkoutExerciseActivity.f49454d;
            boolean z14 = str3 != null ? w.z(str3, string, false) : true;
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.a.P.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.a aVar = new com.garmin.android.apps.connectmobile.workouts.presentation.msn.a();
            Bundle bundleD = k.d("GCM_workout_exercise_category", str, "GCM_workout_exercise_name", str2);
            bundleD.putBoolean("GCM_workout_exercise_has_details", z14);
            aVar.setArguments(bundleD);
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/msn/MSNWorkoutExerciseActivity$c", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            MSNWorkoutExerciseActivity mSNWorkoutExerciseActivity = MSNWorkoutExerciseActivity.this;
            if (mSNWorkoutExerciseActivity.getResources().getConfiguration().orientation == 1) {
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = mSNWorkoutExerciseActivity.f49453c;
                if (cVar == null) {
                    s.m("exercisesListDTO");
                    throw null;
                }
                ArrayList<m> arrayList = mSNWorkoutExerciseActivity.f49452b;
                if (arrayList == null) {
                    s.m("exercises");
                    throw null;
                }
                String str = arrayList.get(i14).f48256a;
                ArrayList<m> arrayList2 = mSNWorkoutExerciseActivity.f49452b;
                if (arrayList2 != null) {
                    mSNWorkoutExerciseActivity.initActionBar(true, cVar.G(str, arrayList2.get(i14).f48257b));
                } else {
                    s.m("exercises");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0056  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList<m> parcelableArrayList;
        Parcelable parcelable;
        String string;
        String string2;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_activity_msn_workout_exercise);
        final int i14 = 0;
        ((Button) findViewById(R.id.msn_exercise_previous_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: i62.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MSNWorkoutExerciseActivity f91829b;

            {
                this.f91829b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        CircularViewPager circularViewPager = this.f91829b.f49451a;
                        if (circularViewPager != null) {
                            circularViewPager.H();
                            return;
                        } else {
                            s.m("viewPager");
                            throw null;
                        }
                    default:
                        CircularViewPager circularViewPager2 = this.f91829b.f49451a;
                        if (circularViewPager2 != null) {
                            circularViewPager2.G();
                            return;
                        } else {
                            s.m("viewPager");
                            throw null;
                        }
                }
            }
        });
        final int i15 = 1;
        ((Button) findViewById(R.id.msn_exercise_next_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: i62.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MSNWorkoutExerciseActivity f91829b;

            {
                this.f91829b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        CircularViewPager circularViewPager = this.f91829b.f49451a;
                        if (circularViewPager != null) {
                            circularViewPager.H();
                            return;
                        } else {
                            s.m("viewPager");
                            throw null;
                        }
                    default:
                        CircularViewPager circularViewPager2 = this.f91829b.f49451a;
                        if (circularViewPager2 != null) {
                            circularViewPager2.G();
                            return;
                        } else {
                            s.m("viewPager");
                            throw null;
                        }
                }
            }
        });
        View viewFindViewById = findViewById(R.id.msn_exercise_pager);
        viewFindViewById.getClass();
        this.f49451a = (CircularViewPager) viewFindViewById;
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 33) {
            if (bundleA != null) {
                parcelableArrayList = bundleA.getParcelableArrayList("GCM_workout_exercise_step_list", m.class);
            } else {
                parcelableArrayList = null;
            }
        } else if (bundleA != null) {
            parcelableArrayList = bundleA.getParcelableArrayList("GCM_workout_exercise_step_list");
        } else {
            parcelableArrayList = null;
        }
        if (parcelableArrayList == null) {
            h.s("Step list is null");
            return;
        }
        this.f49452b = parcelableArrayList;
        if (i16 >= 33) {
            parcelable = bundleA != null ? (Parcelable) bundleA.getParcelable("GCM_workout_exercise_list", com.garmin.android.apps.connectmobile.repcounting.model.c.class) : null;
        } else {
            Parcelable parcelable2 = bundleA != null ? bundleA.getParcelable("GCM_workout_exercise_list") : null;
            if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c)) {
                parcelable2 = null;
            }
            parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable2;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable;
        if (cVar == null) {
            h.s("Exercise list is null");
            return;
        }
        this.f49453c = cVar;
        String str = "";
        if (bundleA == null || (string = bundleA.getString("GCM_workout_exercise_category")) == null) {
            string = "";
        }
        if (bundleA != null && (string2 = bundleA.getString("GCM_workout_exercise_name")) != null) {
            str = string2;
        }
        this.f49454d = bundleA != null ? bundleA.getString("GCM_workout_exercise_details_list") : null;
        View viewFindViewById2 = findViewById(R.id.msn_exercise_navigation_btn_container);
        int i17 = getResources().getConfiguration().orientation;
        if (i17 == 1) {
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar2 = this.f49453c;
            if (cVar2 == null) {
                s.m("exercisesListDTO");
                throw null;
            }
            initActionBar(true, cVar2.G(string, str));
            viewFindViewById2.setVisibility(0);
            CircularViewPager circularViewPager = this.f49451a;
            if (circularViewPager == null) {
                s.m("viewPager");
                throw null;
            }
            circularViewPager.setPagingEnabled(true);
        } else if (i17 == 2) {
            hideActionBar();
            viewFindViewById2.setVisibility(8);
            CircularViewPager circularViewPager2 = this.f49451a;
            if (circularViewPager2 == null) {
                s.m("viewPager");
                throw null;
            }
            circularViewPager2.setPagingEnabled(false);
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        b bVar = new b(this, supportFragmentManager);
        CircularViewPager circularViewPager3 = this.f49451a;
        if (circularViewPager3 == null) {
            s.m("viewPager");
            throw null;
        }
        circularViewPager3.setAdapter(bVar);
        CircularViewPager circularViewPager4 = this.f49451a;
        if (circularViewPager4 == null) {
            s.m("viewPager");
            throw null;
        }
        circularViewPager4.c(new c());
        CircularViewPager circularViewPager5 = this.f49451a;
        if (circularViewPager5 == null) {
            s.m("viewPager");
            throw null;
        }
        ArrayList<m> arrayList = this.f49452b;
        if (arrayList != null) {
            circularViewPager5.setCurrentItem(arrayList.indexOf(new m(string, str)));
        } else {
            s.m("exercises");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/MSNWorkoutExerciseActivity$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

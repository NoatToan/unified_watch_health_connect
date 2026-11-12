package com.garmin.android.apps.connectmobile.activity.details.presentation;

import am.c2;
import am.x0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import aq.n2;
import aq.u2;
import c22.b3;
import c22.g2;
import c22.n1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.charts.TankPressureFullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activities.manual.ActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.activities.map.ActivityMapActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.l0;
import com.garmin.android.apps.connectmobile.activities.photos.PhotoManagementActivity;
import com.garmin.android.apps.connectmobile.activities.photos.ViewImageActivity;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.activities.stats.DragWCdAHelpActivity;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesActivity;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectActivity;
import com.garmin.android.apps.connectmobile.activities.stats.ebike.EBikePerformanceChartsActivity;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.DetailedMuscleMapActivity;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetsActivity;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import ei0.q0;
import gg1.v0;
import im.d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.w3;
import lc.u0;
import lc.y;
import nr.a0;
import nr.h0;
import nr.w0;
import nr.y0;
import o13.r;
import o13.t;
import o4.f0;
import o53.b0;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import ps.s0;
import ps.x1;
import qr.o6;
import qs.x;
import r22.e0;
import r22.k0;
import r22.m0;
import r53.p2;
import xk1.v;
import z10.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "<init>", "()V", "a", "b", "c", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityDetailsFragment extends Fragment implements SwipeRefreshLayout.f {
    public static final /* synthetic */ int I = 0;
    public final f.c<Intent> A;
    public final f.c<Intent> B;
    public final f.c<Intent> C;
    public final f.c<Intent> D;
    public final f.c<Intent> E;
    public boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeRefreshLayout f29991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager2 f29992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComposeView f29993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TabLayout f29994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f29995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m0 f29996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f29997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f29998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f29999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<f.j> f30000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.c<f.j> f30001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.c<String[]> f30002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f.c<Intent> f30003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f.c<Intent> f30004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.c<Intent> f30005r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.c<Intent> f30006t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f.c<Intent> f30007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f.c<Intent> f30008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f.c<Intent> f30009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f.c<Intent> f30010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f.c<Intent> f30011z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsFragment$a;", "Lhe/a;", "Landroidx/fragment/app/Fragment;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsFragment;Landroidx/fragment/app/Fragment;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends he.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Fragment f30012j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f30013k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ArrayList<nr.k> f30014l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ActivityDetailsFragment f30015m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActivityDetailsFragment activityDetailsFragment, Fragment fragment) {
            super(fragment);
            fragment.getClass();
            this.f30015m = activityDetailsFragment;
            this.f30012j = fragment;
            this.f30013k = -1L;
            this.f30014l = new ArrayList<>();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f30014l.size();
        }

        @Override // he.a, androidx.recyclerview.widget.RecyclerView.h
        public final long getItemId(int i14) {
            return this.f30014l.get(i14).ordinal();
        }

        @Override // he.a
        public final boolean t(long j8) {
            ArrayList<nr.k> arrayList = this.f30014l;
            if (arrayList != null && arrayList.isEmpty()) {
                return false;
            }
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((nr.k) it.next()).ordinal() == j8) {
                    return true;
                }
            }
            return false;
        }

        @Override // he.a
        public final Fragment u(int i14) {
            nr.k kVar = this.f30014l.get(i14);
            long j8 = this.f30013k;
            am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            kVar.getClass();
            dVar.getClass();
            switch (nr.l.f127249a[kVar.ordinal()]) {
                case 1:
                    return new rr.f();
                case 2:
                case 3:
                    return new ur.a();
                case 4:
                    return dVar.Z();
                case 5:
                    return new xr.c();
                case 6:
                    return new hs.a();
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return new wr.b();
                case 13:
                    wr.a.f186636i.getClass();
                    wr.a aVar = new wr.a();
                    Bundle bundle = new Bundle(1);
                    bundle.putLong("GCM_extra_activity_id", j8);
                    aVar.setArguments(bundle);
                    return aVar;
                case 14:
                    wr.e.f186713g.getClass();
                    wr.e eVar = new wr.e();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putLong("GCM_extra_activity_id", j8);
                    eVar.setArguments(bundle2);
                    return eVar;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    return wr.k.a.b(wr.k.f186755l, j8, uq.k.READ_ONLY, false);
                case 23:
                    return wr.k.a.b(wr.k.f186755l, j8, uq.k.ALTERNATE, false);
                default:
                    u0.r();
                    return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsFragment$b;", "Landroidx/recyclerview/widget/o$b;", "", "Lnr/k;", "oldList", "newList", "<init>", "(Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsFragment;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends androidx.recyclerview.widget.o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<nr.k> f30016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<nr.k> f30017b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ActivityDetailsFragment activityDetailsFragment, List<? extends nr.k> list, List<? extends nr.k> list2) {
            list.getClass();
            list2.getClass();
            this.f30016a = list;
            this.f30017b = list2;
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean a(int i14, int i15) {
            return b(i14, i15);
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean b(int i14, int i15) {
            return this.f30016a.get(i14).ordinal() == this.f30017b.get(i15).ordinal();
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: d */
        public final int getF196150e() {
            return this.f30017b.size();
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: e */
        public final int getF196149d() {
            return this.f30016a.size();
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f30020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f30021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f30022e;

        static {
            int[] iArr = new int[nr.k.values().length];
            try {
                iArr[nr.k.GEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30018a = iArr;
            int[] iArr2 = new int[rr.k.values().length];
            try {
                iArr2[rr.k.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[rr.k.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f30019b = iArr2;
            int[] iArr3 = new int[n2.b.values().length];
            try {
                iArr3[n2.b.f12115i.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[n2.b.f12116j.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[n2.b.f12117k.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f30020c = iArr3;
            int[] iArr4 = new int[a0.values().length];
            try {
                iArr4[a0.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[a0.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[a0.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f30021d = iArr4;
            int[] iArr5 = new int[h0.values().length];
            try {
                iArr5[h0.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[h0.IMAGE_TOO_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f30022e = iArr5;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public e(Object obj) {
            super(0, obj, qr.t.class, "startRestoreActivity", "startRestoreActivity()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((qr.t) this.receiver).R5();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$2", f = "ActivityDetailsFragment.kt", l = {398}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30023a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30025c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$2$1", f = "ActivityDetailsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f30026a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f30027b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsFragment$f$a$a", "Landroidx/viewpager2/widget/ViewPager2$h;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C0463a extends ViewPager2.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ActivityDetailsFragment f30028a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f30029b;

                public C0463a(ActivityDetailsFragment activityDetailsFragment, boolean z14) {
                    this.f30028a = activityDetailsFragment;
                    this.f30029b = z14;
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0041  */
                @Override // androidx.viewpager2.widget.ViewPager2.h
                public final void onPageSelected(int i14) {
                    boolean z14;
                    TextView textView;
                    int i15 = ActivityDetailsFragment.I;
                    ActivityDetailsFragment activityDetailsFragment = this.f30028a;
                    activityDetailsFragment.z6().D1 = i14;
                    activityDetailsFragment.d7();
                    activityDetailsFragment.z6().f146557s2.k(null, Boolean.FALSE);
                    TabLayout tabLayout = activityDetailsFragment.f29994g;
                    if (tabLayout != null) {
                        if (this.f30029b && (textView = activityDetailsFragment.f29995h) != null && textView.getVisibility() == 8) {
                            a aVar = activityDetailsFragment.f29997j;
                            if (aVar == null) {
                                s.m("tabAdapter");
                                throw null;
                            }
                            z14 = aVar.f30014l.size() > 1;
                        }
                        v22.e.v(tabLayout, z14);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityDetailsFragment activityDetailsFragment, boolean z14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f30026a = activityDetailsFragment;
                this.f30027b = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f30026a, this.f30027b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                ViewPager2 viewPager2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                final ActivityDetailsFragment activityDetailsFragment = this.f30026a;
                ViewPager2 viewPager3 = activityDetailsFragment.f29992e;
                if ((viewPager3 != null ? viewPager3.getAdapter() : null) == null && (viewPager2 = activityDetailsFragment.f29992e) != null) {
                    a aVar2 = activityDetailsFragment.f29997j;
                    if (aVar2 == null) {
                        s.m("tabAdapter");
                        throw null;
                    }
                    viewPager2.setAdapter(aVar2);
                }
                ViewPager2 viewPager4 = activityDetailsFragment.f29992e;
                final boolean z14 = this.f30027b;
                if (viewPager4 != null) {
                    viewPager4.setUserInputEnabled(z14);
                }
                ViewPager2 viewPager5 = activityDetailsFragment.f29992e;
                if (viewPager5 != null) {
                    viewPager5.f11339c.f11374a.add(new C0463a(activityDetailsFragment, z14));
                }
                final ViewPager2 viewPager6 = activityDetailsFragment.f29992e;
                TabLayout tabLayout = activityDetailsFragment.f29994g;
                if (tabLayout != null && viewPager6 != null) {
                    new TabLayoutMediator(tabLayout, viewPager6, true, false, new qr.g(activityDetailsFragment)).attach();
                    ViewPager2 viewPager7 = activityDetailsFragment.f29992e;
                    if (viewPager7 != null) {
                        viewPager7.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: qr.k
                            /* JADX WARN: Code duplicated, block: B:12:0x0019  */
                            @Override // android.view.View.OnScrollChangeListener
                            public final void onScrollChange(View view2, int i14, int i15, int i16, int i17) {
                                boolean z15;
                                ActivityDetailsFragment activityDetailsFragment2 = activityDetailsFragment;
                                if (z14) {
                                    SwipeRefreshLayout swipeRefreshLayout = activityDetailsFragment2.f29991d;
                                    z15 = true;
                                    if ((swipeRefreshLayout == null || !swipeRefreshLayout.f11021c) && viewPager6.getScrollState() != 0) {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = false;
                                }
                                int i18 = ActivityDetailsFragment.I;
                                SwipeRefreshLayout swipeRefreshLayout2 = activityDetailsFragment2.f29991d;
                                if (swipeRefreshLayout2 != null) {
                                    swipeRefreshLayout2.setEnabled(z15);
                                }
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z14, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f30025c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivityDetailsFragment.this.new f(this.f30025c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30023a;
            if (i14 == 0) {
                r.b(obj);
                ActivityDetailsFragment activityDetailsFragment = ActivityDetailsFragment.this;
                n0 viewLifecycleOwner = activityDetailsFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
                a aVar2 = new a(activityDetailsFragment, this.f30025c, null);
                this.f30023a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$3", f = "ActivityDetailsFragment.kt", l = {428}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30030a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30032c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$3$1", f = "ActivityDetailsFragment.kt", l = {429}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f30033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f30034b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f30035c;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0464a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ActivityDetailsFragment f30036a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f30037b;

                public C0464a(ActivityDetailsFragment activityDetailsFragment, boolean z14) {
                    this.f30036a = activityDetailsFragment;
                    this.f30037b = z14;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0 */
                /* JADX WARN: Type inference failed for: r12v1, types: [android.os.Bundle, com.garmin.android.apps.connectmobile.activities.newmodel.l0, e23.a, fw.c, java.lang.CharSequence, java.lang.Integer, java.lang.Object, java.lang.String, nr.p0$a, org.koin.core.qualifier.Qualifier, z6.b] */
                /* JADX WARN: Type inference failed for: r12v5 */
                /* JADX WARN: Type inference failed for: r13v14 */
                /* JADX WARN: Type inference failed for: r13v15, types: [android.view.View, androidx.compose.ui.platform.ComposeView, i5.a] */
                /* JADX WARN: Type inference failed for: r13v18 */
                /* JADX WARN: Type inference failed for: r15v0 */
                /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v0, types: [androidx.fragment.app.Fragment, com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v101, types: [lc.y] */
                /* JADX WARN: Type inference failed for: r5v110, types: [lc.y] */
                /* JADX WARN: Type inference failed for: r5v196, types: [android.content.Intent, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v37 */
                /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v92 */
                /* JADX WARN: Type inference failed for: r9v0, types: [f.c, f.c<android.content.Intent>] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) throws JSONException {
                    int i14;
                    TextView textView;
                    t tVar;
                    Iterator<T> it;
                    boolean z14;
                    String str;
                    fz.c cVar;
                    ?? r14;
                    ComposeView composeView;
                    String string;
                    nr.i iVar = (nr.i) obj;
                    boolean z15 = iVar.f127192b;
                    List<w0> list = iVar.f127194d;
                    ?? r15 = this.f30036a;
                    if (z15) {
                        SwipeRefreshLayout swipeRefreshLayout = r15.f29991d;
                        if (swipeRefreshLayout != null && !swipeRefreshLayout.f11021c) {
                            g22.e.l(r15);
                        }
                    } else {
                        ?? r16 = 0;
                        if (iVar.f127193c) {
                            g22.e.f(r15);
                            g22.e.a(r15, null);
                        } else {
                            ?? r17 = 0;
                            boolean z16 = true;
                            if (list.isEmpty()) {
                                g22.e.f(r15);
                                SwipeRefreshLayout swipeRefreshLayout2 = r15.f29991d;
                                if (swipeRefreshLayout2 != null) {
                                    swipeRefreshLayout2.setRefreshing(false);
                                }
                                nr.t.f fVar = (nr.t.f) iVar.f127191a;
                                androidx.fragment.app.m activity = r15.getActivity();
                                if (activity != null) {
                                    activity.invalidateOptionsMenu();
                                }
                                List<nr.k> list2 = fVar != null ? fVar.f127338c : null;
                                if (list2 == null) {
                                    list2 = j0.f134944a;
                                }
                                TabLayout tabLayout = r15.f29994g;
                                if (tabLayout != null) {
                                    v22.e.v(tabLayout, this.f30037b && list2.size() > 1 && (textView = r15.f29995h) != null && textView.getVisibility() == 8);
                                }
                                a aVar = r15.f29997j;
                                if (aVar == null) {
                                    s.m("tabAdapter");
                                    throw null;
                                }
                                long j8 = fVar != null ? fVar.f127336a : -1L;
                                list2.getClass();
                                ActivityDetailsFragment activityDetailsFragment = aVar.f30015m;
                                ArrayList<nr.k> arrayList = aVar.f30014l;
                                androidx.recyclerview.widget.o.e eVarA = androidx.recyclerview.widget.o.a(new b(activityDetailsFragment, arrayList, list2));
                                aVar.f30013k = j8;
                                arrayList.clear();
                                arrayList.addAll(list2);
                                eVarA.b(new androidx.recyclerview.widget.b(aVar));
                                ViewPager2 viewPager2 = r15.f29992e;
                                if (viewPager2 != null) {
                                    i14 = 0;
                                    viewPager2.c(r15.z6().D1, false);
                                } else {
                                    i14 = 0;
                                }
                                if (list2.isEmpty()) {
                                    return Unit.INSTANCE;
                                }
                                ComposeView composeView2 = r15.f29993f;
                                if (composeView2 != null) {
                                    composeView2.setContent(new z3.e(1640716957, true, new qr.l(fVar, i14)));
                                }
                            } else {
                                g22.e.f(r15);
                                t tVar2 = r15.f29998k;
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    w0 w0Var = (w0) it3.next();
                                    f.c<Intent> cVar2 = r15.f30006t;
                                    f.c<Intent> cVar3 = r15.f30005r;
                                    f.c<f.j> cVar4 = r15.f30001n;
                                    f.c<f.j> cVar5 = r15.f30000m;
                                    ?? r18 = r15.f30003p;
                                    if (w0Var instanceof w0.a) {
                                        Context context = r15.getContext();
                                        if (context != null) {
                                            d1.o(context, new v(12));
                                        }
                                    } else if (w0Var instanceof w0.d) {
                                        w0.d dVar2 = (w0.d) w0Var;
                                        int i15 = d.f30021d[dVar2.f127426c.ordinal()];
                                        if (i15 == z16) {
                                            r15.z6().I4();
                                        } else if (i15 == 2) {
                                            ActivityDetailsFragment.w6(r15, R.string.msg_activity_could_not_be_deleted);
                                        } else {
                                            if (i15 != 3) {
                                                u0.r();
                                                return r16;
                                            }
                                            String str2 = dVar2.f127425b;
                                            if (str2 == null || (string = r15.getString(R.string.delete_activity_with_event_confirmation, str2)) == null) {
                                                string = dVar2.f127424a;
                                            }
                                            e0 e0VarA = e0.a.a(e0.f149637b, r16, string, new q42.d(r15, 16), 9);
                                            androidx.fragment.app.v parentFragmentManager = r15.getParentFragmentManager();
                                            parentFragmentManager.getClass();
                                            e0VarA.show(parentFragmentManager, "DeleteActivityDialogFragment");
                                        }
                                    } else if (w0Var instanceof w0.h) {
                                        int i16 = d.f30022e[((w0.h) w0Var).f127455a.ordinal()];
                                        if (i16 == z16) {
                                            ActivityDetailsFragment.w6(r15, R.string.upload_photo_error);
                                            Unit unit = Unit.INSTANCE;
                                        } else {
                                            if (i16 != 2) {
                                                u0.r();
                                                return r16;
                                            }
                                            Context contextRequireContext = r15.requireContext();
                                            contextRequireContext.getClass();
                                            String string2 = r15.getString(R.string.lbl_image_upload_error);
                                            string2.getClass();
                                            String string3 = r15.getString(R.string.msg_image_size_restriction, "10 MB");
                                            string3.getClass();
                                            new k0(contextRequireContext, new k0.a(string2, string3, true, false, null, null, r15.getString(R.string.lbl_ok), null, null, null, null, null, 4024, null));
                                        }
                                    } else if (w0Var instanceof w0.j) {
                                        nr.h hVar = ((w0.j) w0Var).f127465a;
                                        x0 x0Var = hVar.f127183b;
                                        long j14 = hVar.f127182a;
                                        if (x0Var != null) {
                                            aq.b bVar = new aq.b();
                                            bVar.f11827f = x0Var.f4358a;
                                            bVar.f11823b = j14;
                                            am.h hVar2 = am.h.VIEW_EDIT;
                                            if (hVar2 != null) {
                                                bVar.f11824c = hVar2;
                                            }
                                            bVar.f11825d = r17;
                                            ?? A = bVar.a(r15.getActivity());
                                            A.setFlags(r17);
                                            r18.a(A, r16);
                                        }
                                    } else if (w0Var instanceof w0.k) {
                                        am.g gVar = ((w0.k) w0Var).f127470a;
                                        f.c<Intent> cVar6 = r15.E;
                                        ActivitiesListActivity.a aVar2 = ActivitiesListActivity.f29099d;
                                        Context contextRequireContext2 = r15.requireContext();
                                        contextRequireContext2.getClass();
                                        aVar2.getClass();
                                        cVar6.a(ActivitiesListActivity.a.a(contextRequireContext2, gVar, r16, r16, r16), r16);
                                    } else if (w0Var instanceof w0.e2) {
                                        w0.e2 e2Var = (w0.e2) w0Var;
                                        long j15 = e2Var.f127436a;
                                        b63.o oVar = e2Var.f127437b;
                                        x0 x0Var2 = e2Var.f127438c;
                                        Context context2 = r15.getContext();
                                        if (context2 != null) {
                                            r15.D.a(((am.d) tVar2.getValue()).h0(context2, oVar, r15.z6().f146562u2.f25296b.getValue(), j15, x0Var2), r16);
                                        }
                                    } else if (w0Var instanceof w0.m) {
                                        int i17 = ((w0.m) w0Var).f127485a;
                                        am.d dVar3 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                        Context contextRequireContext3 = r15.requireContext();
                                        contextRequireContext3.getClass();
                                        dVar3.j(i17, contextRequireContext3);
                                    } else if (w0Var instanceof y0) {
                                        String str3 = ((y0) w0Var).f127594a;
                                        v0.a aVar3 = v0.T;
                                        String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, r16, r16, 6, r16)).h().name();
                                        aVar3.getClass();
                                        v0 v0VarA = v0.a.a(strName);
                                        Context contextRequireContext4 = r15.requireContext();
                                        contextRequireContext4.getClass();
                                        new en.c(contextRequireContext4, str3, fb1.c.n("https://", v0VarA.f77342h)).execute();
                                    } else if (w0Var instanceof nr.x0) {
                                        Context contextRequireContext5 = r15.requireContext();
                                        contextRequireContext5.getClass();
                                        nr.x0 x0Var3 = (nr.x0) w0Var;
                                        new en.d(contextRequireContext5, x0Var3.f127586a, x0Var3.f127587b).execute();
                                    } else if (w0Var instanceof w0.n) {
                                        w0.n nVar = (w0.n) w0Var;
                                        List<x1> list3 = nVar.f127493a;
                                        ActivityDetailChartDTO activityDetailChartDTO = nVar.f127494b;
                                        yo1.f fVar2 = nVar.f127495c;
                                        String str4 = nVar.f127496d;
                                        boolean z17 = nVar.f127497e;
                                        if (list3 != null) {
                                            p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
                                            m0Var.f105804a = z16;
                                            View view2 = r15.getView();
                                            if (view2 != null) {
                                                composeView = (ComposeView) view2.findViewById(R.id.climb_list_composable_container);
                                            } else {
                                                r14 = r16;
                                            }
                                            if (r14 != 0) {
                                                r14 = composeView;
                                                r14.setVisibility(r17);
                                            }
                                            if (r14 != 0) {
                                                r14.setViewCompositionStrategy(w3.b.f91619b);
                                                r14.setContent(new z3.e(1601601298, z16, new e11.n(m0Var, (Object) r14, list3, activityDetailChartDTO, fVar2, str4, z17, (Object) r14, 11)));
                                            }
                                        }
                                    } else if (w0Var instanceof w0.o) {
                                        w0.o oVar2 = (w0.o) w0Var;
                                        wg0.a aVar4 = oVar2.f127500a;
                                        boolean z18 = oVar2.f127501b;
                                        ConversationActivity.a aVar5 = ConversationActivity.f44530c;
                                        Context contextRequireContext6 = r15.requireContext();
                                        contextRequireContext6.getClass();
                                        c2 c2Var = c2.ACTIVITY;
                                        String strValueOf = String.valueOf(aVar4.f185042a);
                                        boolean zJ = aVar4.j();
                                        aVar5.getClass();
                                        r15.f30007v.a(ConversationActivity.a.c(contextRequireContext6, c2Var, strValueOf, aVar4, zJ, z18, false), r16);
                                    } else if (w0Var instanceof w0.p) {
                                        w0.p pVar = (w0.p) w0Var;
                                        String str5 = pVar.f127505a;
                                        int i18 = pVar.f127506b;
                                        am.d dVar4 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                        Context contextRequireContext7 = r15.requireContext();
                                        contextRequireContext7.getClass();
                                        dVar4.b0(contextRequireContext7, i18, str5);
                                    } else if (w0Var instanceof w0.q) {
                                        w0.q qVar = (w0.q) w0Var;
                                        com.garmin.android.apps.connectmobile.activities.newmodel.o oVar3 = qVar.f127514a;
                                        im.n nVar2 = qVar.f127515b;
                                        if (oVar3 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.a) {
                                            Bundle bundleA = h7.c.a(new o13.p("extra_cycling_dynamics_dto", oVar3));
                                            HelpActivity.a aVar6 = HelpActivity.f36653a;
                                            Context contextRequireContext8 = r15.requireContext();
                                            ro0.l lVar = ro0.l.PLATFORM_CENTER_OFFSET;
                                            aVar6.getClass();
                                            HelpActivity.a.d(contextRequireContext8, lVar, r16, bundleA);
                                        } else if (oVar3 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.b) {
                                            Bundle bundleA2 = h7.c.a(new o13.p("extra_cycling_position_mode", nVar2.name()));
                                            HelpActivity.a aVar7 = HelpActivity.f36653a;
                                            Context contextRequireContext9 = r15.requireContext();
                                            ro0.l lVar2 = ro0.l.CYCLING_DYNAMICS_POSITION;
                                            aVar7.getClass();
                                            HelpActivity.a.d(contextRequireContext9, lVar2, r16, bundleA2);
                                        } else if (oVar3 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.c) {
                                            Bundle bundleA3 = h7.c.a(new o13.p("extra_cycling_dynamics_dto", oVar3));
                                            HelpActivity.a aVar8 = HelpActivity.f36653a;
                                            Context contextRequireContext10 = r15.requireContext();
                                            ro0.l lVar3 = ro0.l.CYCLING_DYNAMICS_POWER_PHASE;
                                            aVar8.getClass();
                                            HelpActivity.a.d(contextRequireContext10, lVar3, r16, bundleA3);
                                        } else if (oVar3 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.d) {
                                            Bundle bundleA4 = h7.c.a(new o13.p("extra_cycling_position_mode", nVar2.name()));
                                            HelpActivity.a aVar9 = HelpActivity.f36653a;
                                            Context contextRequireContext11 = r15.requireContext();
                                            ro0.l lVar4 = ro0.l.CYCLING_DYNAMICS_TIME_IN_POSITION;
                                            aVar9.getClass();
                                            HelpActivity.a.d(contextRequireContext11, lVar4, r16, bundleA4);
                                        }
                                    } else if (w0Var instanceof w0.t) {
                                        androidx.fragment.app.m mVarRequireActivity = r15.requireActivity();
                                        int i19 = DragWCdAHelpActivity.f29762c;
                                        if (mVarRequireActivity != null) {
                                            mVarRequireActivity.startActivity(new Intent(mVarRequireActivity, (Class<?>) DragWCdAHelpActivity.class));
                                        }
                                    } else if (w0Var instanceof w0.u) {
                                        w0.u uVar = (w0.u) w0Var;
                                        ps.r rVar = uVar.f127543a;
                                        ActivityDetailChartDTO activityDetailChartDTO2 = uVar.f127544b;
                                        EBikePerformanceChartsActivity.a aVar10 = EBikePerformanceChartsActivity.f29816a;
                                        androidx.fragment.app.m mVarRequireActivity2 = r15.requireActivity();
                                        mVarRequireActivity2.getClass();
                                        int i24 = d.f30019b[((rr.k) r15.z6().Q1.getValue()).ordinal()];
                                        if (i24 == z16) {
                                            cVar = fz.c.TIME;
                                        } else {
                                            if (i24 != 2) {
                                                u0.r();
                                                return r16;
                                            }
                                            cVar = fz.c.DISTANCE;
                                        }
                                        aVar10.getClass();
                                        rVar.getClass();
                                        activityDetailChartDTO2.getClass();
                                        cVar.getClass();
                                        Intent intent = new Intent(mVarRequireActivity2, (Class<?>) EBikePerformanceChartsActivity.class);
                                        Bundle bundle = new Bundle();
                                        bundle.putParcelable("GCM_extra_activity_summary", rVar);
                                        bundle.putParcelable("GCM_extra_activity_chart_detail", activityDetailChartDTO2);
                                        bundle.putParcelable("GCM_extra_activity_x_axis_type", cVar);
                                        l2.f37135b.getClass();
                                        l2.a.b().a(intent, bundle);
                                        mVarRequireActivity2.startActivity(intent);
                                    } else if (w0Var instanceof w0.c0) {
                                        w0.c0 c0Var = (w0.c0) w0Var;
                                        r15.J6(c0Var.f127416a, c0Var.f127417b, c0Var.f127418c, r16);
                                    } else if (w0Var instanceof w0.c1) {
                                        w0.c1 c1Var = (w0.c1) w0Var;
                                        r15.J6(c1Var.f127419a, c1Var.f127420b, c1Var.f127421c, c1Var.f127422d);
                                    } else if (w0Var instanceof w0.b0) {
                                        w0.b0 b0Var = (w0.b0) w0Var;
                                        Long l14 = b0Var.f127404a;
                                        String str6 = b0Var.f127405b;
                                        boolean z19 = b0Var.f127406c;
                                        os.b bVar2 = b0Var.f127407d;
                                        ie2.c cVar7 = b0Var.f127408e;
                                        if (l14 != null) {
                                            ActivityMapActivity.la(r15.requireActivity(), bVar2, null, l14.longValue(), true, true, null, str6, Boolean.valueOf(((nr.t.b) r15.z6().W1.getValue()).f127326b), Boolean.valueOf(z19), ((nr.t.b) r15.z6().W1.getValue()).f127327c, cVar7);
                                        }
                                    } else if (w0Var instanceof w0.i0) {
                                        int i25 = ((w0.i0) w0Var).f127462a;
                                        if (i25 <= 0) {
                                            Toast.makeText(r15.requireContext(), r15.getString(R.string.activities_photo_limit_message), z16 ? 1 : 0).show();
                                        } else if (Build.VERSION.SDK_INT > 29) {
                                            ActivityDetailsFragment.C6(i25, cVar5, cVar4);
                                        } else {
                                            j22.b bVar3 = j22.b.f96736a;
                                            j22.a[] aVarArr = {j22.a.f96721j};
                                            bVar3.getClass();
                                            if (j22.b.k(aVarArr)) {
                                                ActivityDetailsFragment.C6(i25, cVar5, cVar4);
                                            } else {
                                                r15.f30002o.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, r16);
                                            }
                                        }
                                    } else if (w0Var instanceof w0.k0) {
                                        long j16 = ((w0.k0) w0Var).f127471a;
                                        ConversationActivity.a aVar11 = ConversationActivity.f44530c;
                                        androidx.fragment.app.m mVarRequireActivity3 = r15.requireActivity();
                                        mVarRequireActivity3.getClass();
                                        c2 c2Var2 = c2.ACTIVITY;
                                        String strValueOf2 = String.valueOf(j16);
                                        aVar11.getClass();
                                        r15.requireActivity().startActivity(ConversationActivity.a.h(mVarRequireActivity3, c2Var2, strValueOf2));
                                    } else if (w0Var instanceof w0.o0) {
                                        w0.o0 o0Var = (w0.o0) w0Var;
                                        x0 x0Var4 = o0Var.f127502a;
                                        Long l15 = o0Var.f127503b;
                                        am.d dVar5 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                        Context contextRequireContext12 = r15.requireContext();
                                        contextRequireContext12.getClass();
                                        cVar3.a(dVar5.v(contextRequireContext12, x0Var4, l15), r16);
                                    } else if (w0Var instanceof w0.n0) {
                                        q91.d dVar6 = ((w0.n0) w0Var).f127498a;
                                        am.d dVar7 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                        Context contextRequireContext13 = r15.requireContext();
                                        contextRequireContext13.getClass();
                                        cVar3.a(dVar7.y(contextRequireContext13, dVar6), r16);
                                    } else if (w0Var instanceof w0.r0) {
                                        w0.r0 r0Var = (w0.r0) w0Var;
                                        x0 x0Var5 = r0Var.f127519a;
                                        x0 x0Var6 = r0Var.f127520b;
                                        DateTime dateTime = r0Var.f127521c;
                                        ActivityReportsActivity.a aVar12 = ActivityReportsActivity.f29758a;
                                        androidx.fragment.app.m mVarRequireActivity4 = r15.requireActivity();
                                        mVarRequireActivity4.getClass();
                                        ActivityReportsActivity.a.a(aVar12, mVarRequireActivity4, x0Var5, x0Var6, dateTime, null, 16);
                                    } else if (w0Var instanceof w0.s0) {
                                        ro0.l lVar5 = ro0.l.RUNNING_DYNAMICS;
                                        Bundle bundle2 = new Bundle();
                                        w0.s0 s0Var = (w0.s0) w0Var;
                                        bundle2.putInt("extra_chart_type", s0Var.f127527a);
                                        bundle2.putBoolean("EXTRA_POD_DEVICE_DATA", s0Var.f127529c);
                                        bundle2.putString("extra_activity_type", s0Var.f127528b);
                                        bundle2.putBoolean("EXTRA_RUN_CADENCE", s0Var.f127530d);
                                        bundle2.putBoolean("EXTRA_VERTICAL_OSCILLATION", s0Var.f127531e);
                                        bundle2.putBoolean("EXTRA_VERTICAL_RATIO", s0Var.f127532f);
                                        bundle2.putBoolean("EXTRA_GROUND_CONTACT_TIME", s0Var.f127533g);
                                        bundle2.putBoolean("EXTRA_GC_TIME_BALANCE", s0Var.f127534h);
                                        bundle2.putBoolean("EXTRA_STEP_SPEED_LOSS", s0Var.f127535i);
                                        bundle2.putBoolean("EXTRA_STEP_SPEED_LOSS_PERCENT", s0Var.f127536j);
                                        Unit unit2 = Unit.INSTANCE;
                                        ActivityDetailsFragment.M6(r15, lVar5, r16, bundle2, 2);
                                    } else if (w0Var instanceof w0.v0) {
                                        NavHostFragment.f10124e.getClass();
                                        ?? A2 = NavHostFragment.a.a(r15);
                                        lc.h0 h0VarJ = A2.f111904b.j();
                                        if (h0VarJ != null && h0VarJ.f111773b.f144346e == R.id.activityDetailsFragment) {
                                            A2.g(R.id.action_activityDetailsFragment_to_editRatingBottomSheet, r16);
                                        }
                                    } else if (w0Var instanceof w0.h0) {
                                        w0.h0 h0Var = (w0.h0) w0Var;
                                        ActivityDetailsFragment.M6(r15, h0Var.f127456a, h0Var.f127457b, r16, 4);
                                    } else if (w0Var instanceof w0.u0) {
                                        w0.u0 u0Var = (w0.u0) w0Var;
                                        ActivityMapActivity.pa(r15.requireActivity(), os.b.ACTIVITY_SEGMENTS_MAP, fr.a.g(u0Var.f127545a, u0Var.f127546b));
                                    } else if (s.g(w0Var, w0.x0.f127570a)) {
                                        NavHostFragment.f10124e.getClass();
                                        ?? A3 = NavHostFragment.a.a(r15);
                                        lc.h0 h0VarJ2 = A3.f111904b.j();
                                        if (h0VarJ2 != null && h0VarJ2.f111773b.f144346e == R.id.activityDetailsFragment) {
                                            A3.g(R.id.action_activityDetailsFragment_to_selectRatioFragment, r16);
                                        }
                                    } else if (w0Var instanceof w0.e1) {
                                        ps.p pVar2 = ((w0.e1) w0Var).f127435a;
                                        TimingGatesActivity.a aVar13 = TimingGatesActivity.f29952c;
                                        Context contextRequireContext14 = r15.requireContext();
                                        contextRequireContext14.getClass();
                                        boolean z24 = ((nr.t.b) r15.z6().W1.getValue()).f127326b;
                                        String str7 = ((nr.t.b) r15.z6().W1.getValue()).f127327c;
                                        aVar13.getClass();
                                        Intent intent2 = new Intent(contextRequireContext14, (Class<?>) TimingGatesActivity.class);
                                        Bundle bundle3 = new Bundle(z16 ? 1 : 0);
                                        bundle3.putParcelable("ACTIVITY_SPLITS_INTENT_KEY", pVar2);
                                        bundle3.putBoolean("FIVE_HZ_DATA_INTENT_KEY", z24);
                                        bundle3.putString("DEVICE_NAME_INTENT_KEY", str7);
                                        l2.f37135b.getClass();
                                        l2.a.b().a(intent2, bundle3);
                                        contextRequireContext14.startActivity(intent2);
                                    } else {
                                        if (w0Var instanceof w0.z0) {
                                            w0.z0 z0Var = (w0.z0) w0Var;
                                            String str8 = z0Var.f127579a;
                                            String str9 = z0Var.f127580b;
                                            x0 x0Var7 = z0Var.f127581c;
                                            am.d dVar8 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                            String strP = dVar8.P(str8);
                                            Context contextRequireContext15 = r15.requireContext();
                                            contextRequireContext15.getClass();
                                            String strI = dVar8.I(contextRequireContext15, x0Var7, str8);
                                            String string4 = r15.getString(R.string.social_share_web_link);
                                            string4.getClass();
                                            js.c cVar8 = js.c.f100592a;
                                            Context contextRequireContext16 = r15.requireContext();
                                            contextRequireContext16.getClass();
                                            cVar8.getClass();
                                            r15.f29999l.a(js.c.b(contextRequireContext16, string4, strP, strI, str9), r16);
                                            r15.z6().J5();
                                        } else {
                                            if (w0Var instanceof w0.d1) {
                                                w0.d1 d1Var = (w0.d1) w0Var;
                                                ro0.l lVar6 = d1Var.f127428a;
                                                Bundle bundle4 = new Bundle();
                                                Long l16 = d1Var.f127429b;
                                                if (l16 != null) {
                                                    bundle4.putLong("GCM_deviceUnitID", l16.longValue());
                                                }
                                                bundle4.putString("GCM_extra_activity_type", d1Var.f127430c);
                                                bundle4.putBoolean("GCM_extra_activity_owner", d1Var.f127431d);
                                                Unit unit3 = Unit.INSTANCE;
                                                r15.K6(lVar6, "DEFAULT_ACTION", bundle4);
                                            } else if (w0Var instanceof w0.y) {
                                                w0.y yVar = (w0.y) w0Var;
                                                ro0.l lVar7 = yVar.f127573a;
                                                Bundle bundle5 = new Bundle();
                                                bundle5.putString("GCM_extra_activity_type", yVar.f127574b);
                                                Unit unit4 = Unit.INSTANCE;
                                                r15.K6(lVar7, "DEFAULT_ACTION", bundle5);
                                            } else if (w0Var instanceof w0.m0) {
                                                w0.m0 m0Var2 = (w0.m0) w0Var;
                                                ro0.l lVar8 = m0Var2.f127486a;
                                                Bundle bundle6 = new Bundle();
                                                bundle6.putString("GCM_extra_activity_type", m0Var2.f127487b);
                                                Unit unit5 = Unit.INSTANCE;
                                                r15.K6(lVar8, "DEFAULT_ACTION", bundle6);
                                            } else if (w0Var instanceof w0.g0) {
                                                w0.g0 g0Var = (w0.g0) w0Var;
                                                ro0.l lVar9 = g0Var.f127445a;
                                                Bundle bundle7 = new Bundle();
                                                Long l17 = g0Var.f127446b;
                                                if (l17 != null) {
                                                    bundle7.putLong("GCM_deviceUnitID", l17.longValue());
                                                }
                                                bundle7.putString("GCM_extra_activity_type", g0Var.f127447c);
                                                bundle7.putBoolean("GCM_extra_activity_owner", g0Var.f127448d);
                                                Unit unit6 = Unit.INSTANCE;
                                                r15.K6(lVar9, "DEFAULT_ACTION", bundle7);
                                            } else if (w0Var instanceof w0.f1) {
                                                List<ps.w0> list4 = ((w0.f1) w0Var).f127443a;
                                                NavHostFragment.f10124e.getClass();
                                                NavHostFragment.a.a(r15).g(R.id.action_activityDetailsFragment_to_activityDetailsJumpMetricFragment, h7.c.a(new o13.p("JUMP_METRIC", list4 != null ? new ArrayList(list4) : r16)));
                                            } else if (w0Var instanceof w0.h1) {
                                                w0.h1 h1Var = (w0.h1) w0Var;
                                                d0 d0Var = h1Var.f127458a;
                                                d0 d0Var2 = h1Var.f127459b;
                                                String str10 = h1Var.f127460c;
                                                am.d dVar9 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                                androidx.fragment.app.m mVarRequireActivity5 = r15.requireActivity();
                                                mVarRequireActivity5.getClass();
                                                dVar9.q(mVarRequireActivity5, str10, d0Var2, d0Var);
                                            } else if (w0Var instanceof w0.j1) {
                                                w0.j1 j1Var = (w0.j1) w0Var;
                                                String str11 = j1Var.f127468b;
                                                String str12 = j1Var.f127469c;
                                                String str13 = j1Var.f127467a;
                                                am.d dVar10 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                                androidx.fragment.app.m mVarRequireActivity6 = r15.requireActivity();
                                                mVarRequireActivity6.getClass();
                                                r18.a(dVar10.d(mVarRequireActivity6, str11, str12, str13), r16);
                                            } else if (w0Var instanceof w0.p0) {
                                                w0.p0 p0Var = (w0.p0) w0Var;
                                                ps.q qVar2 = p0Var.f127507a;
                                                List<ps.j> list5 = p0Var.f127508b;
                                                boolean z25 = p0Var.f127509c;
                                                String str14 = p0Var.f127510d;
                                                String str15 = p0Var.f127511e;
                                                PhotoManagementActivity.a aVar14 = PhotoManagementActivity.f29713t;
                                                androidx.fragment.app.m mVarRequireActivity7 = r15.requireActivity();
                                                mVarRequireActivity7.getClass();
                                                ArrayList arrayList2 = new ArrayList(list5);
                                                aVar14.getClass();
                                                cVar2.a(PhotoManagementActivity.a.a(mVarRequireActivity7, qVar2, arrayList2, z25, str14, str15), r16);
                                            } else if (w0Var instanceof w0.t0) {
                                                w0.t0 t0Var = (w0.t0) w0Var;
                                                x0 x0Var8 = t0Var.f127539a;
                                                Long l18 = t0Var.f127540b;
                                                List<x1> list6 = t0Var.f127541c;
                                                if (x0Var8 == null || l18 == null) {
                                                    g22.e.a(r15, r16);
                                                } else {
                                                    am.d dVar11 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                                    androidx.fragment.app.m mVarRequireActivity8 = r15.requireActivity();
                                                    mVarRequireActivity8.getClass();
                                                    dVar11.H(mVarRequireActivity8, x0Var8, l18.longValue(), list6);
                                                }
                                            } else {
                                                if (w0Var instanceof w0.b1) {
                                                    w0.b1 b1Var = (w0.b1) w0Var;
                                                    tVar = tVar2;
                                                    it = it3;
                                                    ((am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16)).o(r15.requireActivity(), b1Var.f127409a, b1Var.f127410b, b1Var.f127411c, b1Var.f127412d);
                                                } else {
                                                    tVar = tVar2;
                                                    it = it3;
                                                    if (w0Var instanceof w0.k1) {
                                                        w0.k1 k1Var = (w0.k1) w0Var;
                                                        ps.q qVar3 = k1Var.f127472a;
                                                        List<ps.j> list7 = k1Var.f127473b;
                                                        int i26 = k1Var.f127474c;
                                                        boolean z26 = k1Var.f127475d;
                                                        ViewImageActivity.a aVar15 = ViewImageActivity.f29734o;
                                                        androidx.fragment.app.m mVarRequireActivity9 = r15.requireActivity();
                                                        mVarRequireActivity9.getClass();
                                                        ArrayList arrayList3 = new ArrayList(list7);
                                                        aVar15.getClass();
                                                        cVar2.a(ViewImageActivity.a.a(mVarRequireActivity9, qVar3, arrayList3, i26, z26), r16);
                                                    } else if (w0Var instanceof w0.l1) {
                                                        wg0.k kVar = ((w0.l1) w0Var).f127484a;
                                                        VideoPlayerActivity.a aVar16 = VideoPlayerActivity.f44499a;
                                                        Context contextRequireContext17 = r15.requireContext();
                                                        contextRequireContext17.getClass();
                                                        aVar16.getClass();
                                                        r15.A.a(VideoPlayerActivity.a.a(contextRequireContext17, kVar), r16);
                                                    } else if (w0Var instanceof w0.m1) {
                                                        w0.m1 m1Var = (w0.m1) w0Var;
                                                        ro1.e eVar = m1Var.f127488a;
                                                        Intent intent3 = m1Var.f127489b;
                                                        String str16 = m1Var.f127490c;
                                                        String str17 = m1Var.f127491d;
                                                        am.d dVar12 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                                        androidx.fragment.app.m mVarRequireActivity10 = r15.requireActivity();
                                                        mVarRequireActivity10.getClass();
                                                        ActivityInfo activityInfo = eVar.f153929a;
                                                        intent3.setClassName(activityInfo.packageName, activityInfo.name);
                                                        intent3.putExtra("android.intent.extra.TEXT", str16);
                                                        intent3.putExtra("EXTRA_WEB_LINK", str17);
                                                        Unit unit7 = Unit.INSTANCE;
                                                        dVar12.R(mVarRequireActivity10, intent3);
                                                        qr.t tVarZ6 = r15.z6();
                                                        String str18 = eVar.f153929a.packageName;
                                                        str18.getClass();
                                                        qr.t.I5(tVarZ6, str18, r16, 6);
                                                    } else if (w0Var instanceof w0.n1) {
                                                        ActivityDetailsFragment.w6(r15, R.string.privacy_setting_updated);
                                                    } else if (w0Var instanceof w0.o1) {
                                                        if (d.f30021d[((w0.o1) w0Var).f127504a.ordinal()] == 1) {
                                                            ActivityDetailsFragment.w6(r15, R.string.lbl_rating_submitted);
                                                        } else {
                                                            ActivityDetailsFragment.w6(r15, R.string.txt_something_went_wrong_try_again);
                                                        }
                                                    } else if (w0Var instanceof w0.i) {
                                                        if (((w0.i) w0Var).f127461a == a0.FAIL) {
                                                            g22.e.c(r15);
                                                        } else {
                                                            String string5 = r15.getString(R.string.trail_match_snackbar_text);
                                                            string5.getClass();
                                                            r15.v6(string5, r16, r16);
                                                        }
                                                    } else if (w0Var instanceof w0.c2) {
                                                        a0 a0Var = ((w0.c2) w0Var).f127423a;
                                                        if (a0Var == a0.IN_PROGRESS) {
                                                            Context contextRequireContext18 = r15.requireContext();
                                                            contextRequireContext18.getClass();
                                                            String string6 = r15.getString(R.string.unlink_trail_dialog_title);
                                                            string6.getClass();
                                                            String string7 = r15.getString(R.string.unlink_trail_dialog_body);
                                                            string7.getClass();
                                                            new k0(contextRequireContext18, new k0.a(string6, string7, true, false, Integer.valueOf(R.style.Text_Title3_Medium_Primary), null, r15.getString(R.string.lbl_remove), Integer.valueOf(a7.b.getColor(r15.requireContext(), R.color.danger_action)), new qr.d(r15, 3), r15.getString(R.string.lbl_cancel), null, null, 3104, null)).show();
                                                        } else if (a0Var == a0.FAIL) {
                                                            g22.e.c(r15);
                                                        }
                                                    } else if (w0Var instanceof w0.q1) {
                                                        f.c<Intent> cVar9 = r15.f30010y;
                                                        am.d dVar13 = (am.d) KoinJavaComponent.get$default(am.d.class, r16, r16, 6, r16);
                                                        androidx.fragment.app.m mVarRequireActivity11 = r15.requireActivity();
                                                        mVarRequireActivity11.getClass();
                                                        cVar9.a(dVar13.B(mVarRequireActivity11), r16);
                                                    } else if (w0Var instanceof w0.z1) {
                                                        ro1.b0.f153913b.getClass();
                                                        ro1.b0 b0Var2 = new ro1.b0();
                                                        b0Var2.show(r15.getParentFragmentManager(), b0Var2.getTag());
                                                    } else if (w0Var instanceof w0.a2) {
                                                        Context contextRequireContext19 = r15.requireContext();
                                                        contextRequireContext19.getClass();
                                                        String string8 = r15.getString(R.string.social_change_activity_privacy_title);
                                                        string8.getClass();
                                                        String string9 = r15.getString(R.string.social_change_activity_privacy_share_msg);
                                                        string9.getClass();
                                                        new k0(contextRequireContext19, new k0.a(string8, string9, true, false, null, null, r15.getString(R.string.lbl_ok), null, new qr.d(r15, 2), r15.getString(R.string.lbl_cancel), null, null, 3256, null)).show();
                                                    } else if (w0Var instanceof w0.b2) {
                                                        w0.b2 b2Var = (w0.b2) w0Var;
                                                        int i27 = d.f30021d[b2Var.f127414b.ordinal()];
                                                        if (i27 == 1) {
                                                            r15.v6(b2Var.f127413a, r16, r16);
                                                        } else if (i27 == 2) {
                                                            g22.e.c(r15);
                                                        }
                                                    } else if (w0Var instanceof w0.i1) {
                                                        ro0.l lVar10 = ro0.l.TRAINING_EFFECT;
                                                        Bundle bundle8 = new Bundle();
                                                        w0.i1 i1Var = (w0.i1) w0Var;
                                                        bundle8.putSerializable("help_mode_key", i1Var.f127463a);
                                                        bundle8.putBoolean("has_primary_benefit", i1Var.f127464b);
                                                        Unit unit8 = Unit.INSTANCE;
                                                        r15.K6(lVar10, "DEFAULT_ACTION", bundle8);
                                                    } else if (w0Var instanceof w0.d0) {
                                                        Context context3 = r15.getContext();
                                                        if (context3 != null) {
                                                            r15.f30009x.a(((am.d) tVar.getValue()).L(context3), r16);
                                                        }
                                                    } else if (w0Var instanceof w0.v) {
                                                        w0.v vVar = (w0.v) w0Var;
                                                        ps.r rVar2 = vVar.f127548a;
                                                        s0 s0Var2 = vVar.f127549b;
                                                        ps.p pVar3 = vVar.f127550c;
                                                        boolean z27 = vVar.f127551d;
                                                        boolean z28 = vVar.f127552e;
                                                        boolean z29 = vVar.f127553f;
                                                        boolean z34 = vVar.f127554g;
                                                        boolean z35 = vVar.f127555h;
                                                        String str19 = vVar.f127556i;
                                                        Intent intent4 = new Intent(r15.requireContext(), (Class<?>) ActivitiesEditActivity.class);
                                                        intent4.addFlags(67108864);
                                                        Bundle bundle9 = new Bundle();
                                                        bundle9.putBoolean("GCM_supports_advanced_leg_editing", z34);
                                                        bundle9.putBoolean("GCM_extra_has_trim_chart_data", z35);
                                                        bundle9.putBoolean("GCM_extra_has_trim_time_fragment", z29);
                                                        bundle9.putBoolean("GCM_extra_has_trim_distance_fragment", z28);
                                                        bundle9.putBoolean("GCM_has_device_info", z27);
                                                        Long parentId = rVar2.getParentId();
                                                        bundle9.putLong("GCM_extra_activity_parent_id", parentId != null ? parentId.longValue() : -1L);
                                                        bundle9.putParcelable("GCM_workout_exercise_set", s0Var2);
                                                        bundle9.putParcelable("GCM_extra_activity_summary", rVar2);
                                                        bundle9.putParcelable("GCM_extra_activity_splits", pVar3);
                                                        bundle9.putString("GCM_extra_activity_parent_type_key", str19);
                                                        com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent4, bundle9);
                                                        r15.f30008w.a(intent4, null);
                                                    } else if (w0Var instanceof w0.e0) {
                                                        n2.b bVar4 = ((w0.e0) w0Var).f127434a;
                                                        r15.getClass();
                                                        int i28 = d.f30020c[bVar4.ordinal()];
                                                        if (i28 == 1) {
                                                            str = "GRIT";
                                                        } else if (i28 == 2) {
                                                            str = "FLOW";
                                                        } else if (i28 == 3) {
                                                            str = "JUMP";
                                                        } else {
                                                            u0.r();
                                                        }
                                                        HelpActivity.a.e(HelpActivity.f36653a, r15.requireContext(), ro0.l.GRIT_FLOW, str, null, 8);
                                                    } else if (w0Var instanceof w0.b) {
                                                        w0.b bVar5 = (w0.b) w0Var;
                                                        x0 x0Var9 = bVar5.f127402a;
                                                        long j17 = bVar5.f127403b;
                                                        r15.getClass();
                                                        ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).M().a(r15.requireContext(), x0Var9, j17);
                                                        r15.z6().I4();
                                                    } else if (w0Var instanceof w0.x1) {
                                                        w0.x1 x1Var = (w0.x1) w0Var;
                                                        String str20 = x1Var.f127571a;
                                                        boolean z36 = x1Var.f127572b;
                                                        String string10 = r15.getString(R.string.aae_edited_legs_activity_list_key);
                                                        string10.getClass();
                                                        boolean zU6 = r15.u6(str20, R.string.activities_legs_edited_message, string10, z36, false);
                                                        String string11 = r15.getString(R.string.aae_trimmed_activity_list_key);
                                                        string11.getClass();
                                                        r15.u6(str20, R.string.activities_trimmed_message, string11, z36, zU6);
                                                    } else {
                                                        if (w0Var instanceof w0.y1) {
                                                            w0.y1 y1Var = (w0.y1) w0Var;
                                                            x0 x0Var10 = y1Var.f127576a;
                                                            String str21 = y1Var.f127577b;
                                                            r15.getClass();
                                                            if (g22.n.d(str21)) {
                                                                com.garmin.android.apps.connectmobile.courses.model.i.f32968g.getClass();
                                                                com.garmin.android.apps.connectmobile.courses.model.i iVarA = com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0Var10);
                                                                Context contextRequireContext20 = r15.requireContext();
                                                                contextRequireContext20.getClass();
                                                                String strA = iVarA.a(contextRequireContext20);
                                                                String string12 = r15.getString(R.string.courses_send_to_device_message, str21);
                                                                string12.getClass();
                                                                m0 m0VarB = m0.a.b(m0.f149759e, strA, string12, 376);
                                                                m0VarB.show(r15.requireActivity().getSupportFragmentManager(), "SEND_TO_DEVICE_SUCCESS_MESSAGE");
                                                                z16 = true;
                                                                new Handler(Looper.getMainLooper()).postDelayed(new b50.e(m0VarB, 1), 1500L);
                                                            } else {
                                                                z16 = true;
                                                            }
                                                        } else {
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            z16 = true;
                                                            if (w0Var instanceof w0.w1) {
                                                                w0.w1 w1Var = (w0.w1) w0Var;
                                                                r15.c7(w1Var.f127565a, w1Var.f127566b, w1Var.f127567c, w1Var.f127568d);
                                                            } else if (w0Var instanceof w0.s1) {
                                                                r15.X6(((w0.s1) w0Var).f127537a);
                                                            } else if (w0Var instanceof w0.v1) {
                                                                r15.Y6(((w0.v1) w0Var).f127558a);
                                                            } else if (w0Var instanceof w0.g) {
                                                                r15.y6(false);
                                                            } else if (w0Var instanceof w0.a0) {
                                                                w0.a0 a0Var2 = (w0.a0) w0Var;
                                                                r15.I6(a0Var2.f127398a, a0Var2.f127399b);
                                                            } else if (w0Var instanceof w0.t1) {
                                                                b3.c(r15.requireContext());
                                                            } else if (w0Var instanceof w0.l0) {
                                                                r15.S6(((w0.l0) w0Var).f127483b);
                                                            } else if (w0Var instanceof w0.q0) {
                                                                r15.T6(((w0.q0) w0Var).f127516a);
                                                            } else if (w0Var instanceof w0.l) {
                                                                w0.l lVar11 = (w0.l) w0Var;
                                                                r15.F6(lVar11.f127478a, lVar11.f127479b, lVar11.f127480c, lVar11.f127481d);
                                                            } else if (w0Var instanceof w0.w) {
                                                                w0.w wVar = (w0.w) w0Var;
                                                                r15.H6(wVar.f127559a, wVar.f127560b, wVar.f127561c, wVar.f127562d, wVar.getF127563e());
                                                            } else if (w0Var instanceof w0.f0) {
                                                                String f127442a = ((w0.f0) w0Var).getF127442a();
                                                                am.d dVar14 = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
                                                                Context contextRequireContext21 = r15.requireContext();
                                                                contextRequireContext21.getClass();
                                                                r15.B.a(dVar14.i0(contextRequireContext21, f127442a), null);
                                                            } else if (w0Var instanceof w0.u1) {
                                                                ActivityDetailsFragment.w6(r15, R.string.lbl_removed_groupride);
                                                            } else if (w0Var instanceof w0.r) {
                                                                Context contextRequireContext22 = r15.requireContext();
                                                                contextRequireContext22.getClass();
                                                                new en.f(contextRequireContext22, ((w0.r) w0Var).getF127518a()).execute();
                                                            } else if (w0Var instanceof w0.a1) {
                                                                Context contextRequireContext23 = r15.requireContext();
                                                                contextRequireContext23.getClass();
                                                                new en.m(contextRequireContext23).execute();
                                                            } else if (w0Var instanceof w0.z) {
                                                                am.d dVar15 = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
                                                                Context contextRequireContext24 = r15.requireContext();
                                                                contextRequireContext24.getClass();
                                                                dVar15.d0(contextRequireContext24, ((w0.z) w0Var).getF127578a());
                                                            } else if (w0Var instanceof w0.j0) {
                                                                Context contextRequireContext25 = r15.requireContext();
                                                                contextRequireContext25.getClass();
                                                                new n1(contextRequireContext25, ((w0.j0) w0Var).getF127466a()).a();
                                                            } else {
                                                                if (w0Var instanceof w0.g1) {
                                                                    w0.g1 g1Var = (w0.g1) w0Var;
                                                                    z14 = true;
                                                                    r15.U6(g1Var.getF127449a(), g1Var.getF127450b(), g1Var.getF127451c(), g1Var.getF127452d(), g1Var.getF127453e(), g1Var.getF127454f());
                                                                } else {
                                                                    z14 = true;
                                                                    if (w0Var instanceof w0.C2448w0) {
                                                                        NavHostFragment.f10124e.getClass();
                                                                        NavHostFragment.a.a(r15).j();
                                                                    } else if (w0Var instanceof w0.x) {
                                                                        ElectronicShiftingDataActivity.a aVar17 = ElectronicShiftingDataActivity.f29955b;
                                                                        androidx.fragment.app.m mVarRequireActivity12 = r15.requireActivity();
                                                                        mVarRequireActivity12.getClass();
                                                                        long f127569a = ((w0.x) w0Var).getF127569a();
                                                                        aVar17.getClass();
                                                                        ElectronicShiftingDataActivity.a.a(mVarRequireActivity12, f127569a);
                                                                    } else if (w0Var instanceof w0.s) {
                                                                        r15.G6(((w0.s) w0Var).getF127526a());
                                                                    }
                                                                }
                                                                r15.z6().M5(w0Var);
                                                            }
                                                        }
                                                        z14 = z16;
                                                        r15.z6().M5(w0Var);
                                                    }
                                                }
                                                z14 = true;
                                                r15.z6().M5(w0Var);
                                            }
                                            tVar = tVar2;
                                            it = it3;
                                            z14 = true;
                                            r15.z6().M5(w0Var);
                                        }
                                        z16 = z14;
                                        tVar2 = tVar;
                                        it3 = it;
                                        r16 = 0;
                                        r17 = 0;
                                    }
                                    tVar = tVar2;
                                    it = it3;
                                    z14 = z16;
                                    r15.z6().M5(w0Var);
                                    z16 = z14;
                                    tVar2 = tVar;
                                    it3 = it;
                                    r16 = 0;
                                    r17 = 0;
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityDetailsFragment activityDetailsFragment, boolean z14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f30034b = activityDetailsFragment;
                this.f30035c = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f30034b, this.f30035c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f30033a;
                if (i14 == 0) {
                    r.b(obj);
                    int i15 = ActivityDetailsFragment.I;
                    ActivityDetailsFragment activityDetailsFragment = this.f30034b;
                    p2 p2Var = activityDetailsFragment.z6().L1;
                    C0464a c0464a = new C0464a(activityDetailsFragment, this.f30035c);
                    this.f30033a = 1;
                    if (p2Var.collect(c0464a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z14, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f30032c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivityDetailsFragment.this.new g(this.f30032c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30030a;
            if (i14 == 0) {
                r.b(obj);
                ActivityDetailsFragment activityDetailsFragment = ActivityDetailsFragment.this;
                n0 viewLifecycleOwner = activityDetailsFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(activityDetailsFragment, this.f30032c, null);
                this.f30030a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$4", f = "ActivityDetailsFragment.kt", l = {477}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30038a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$4$1", f = "ActivityDetailsFragment.kt", l = {478}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f30040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f30041b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0465a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ActivityDetailsFragment f30042a;

                public C0465a(ActivityDetailsFragment activityDetailsFragment) {
                    this.f30042a = activityDetailsFragment;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    nr.t.d dVar2 = (nr.t.d) obj;
                    if (dVar2.f127329a) {
                        String str = dVar2.f127330b;
                        int i14 = ActivityDetailsFragment.I;
                        ActivityDetailsFragment activityDetailsFragment = this.f30042a;
                        Fragment fragmentG = activityDetailsFragment.getParentFragmentManager().G("GCMFeatureInfoDialog");
                        if (fragmentG != null && (fragmentG instanceof androidx.fragment.app.i)) {
                            ((androidx.fragment.app.i) fragmentG).dismiss();
                        }
                        m0 m0VarC = m0.a.c(m0.f149759e, activityDetailsFragment.getString(R.string.lbl_groupride_dialog_title), activityDetailsFragment.getString(R.string.lbl_groupride_dialog_description), R.string.lbl_dialog_view_activity, new qr.e(activityDetailsFragment, 0), R.string.lbl_dialog_view_privacy, new qr.f(activityDetailsFragment, str, 0), 192);
                        activityDetailsFragment.f29996i = m0VarC;
                        m0VarC.setCancelable(false);
                        m0 m0Var = activityDetailsFragment.f29996i;
                        if (m0Var != null) {
                            m0Var.show(activityDetailsFragment.getParentFragmentManager(), "GCMFeatureInfoDialog");
                        }
                        qr.t tVarZ6 = activityDetailsFragment.z6();
                        tVarZ6.U1.k(null, new nr.t.d(false, str));
                        tVarZ6.f146547p.D2();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityDetailsFragment activityDetailsFragment, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f30041b = activityDetailsFragment;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f30041b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f30040a;
                if (i14 == 0) {
                    r.b(obj);
                    int i15 = ActivityDetailsFragment.I;
                    ActivityDetailsFragment activityDetailsFragment = this.f30041b;
                    p2 p2Var = activityDetailsFragment.z6().U1;
                    C0465a c0465a = new C0465a(activityDetailsFragment);
                    this.f30040a = 1;
                    if (p2Var.collect(c0465a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivityDetailsFragment.this.new h(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30038a;
            if (i14 == 0) {
                r.b(obj);
                ActivityDetailsFragment activityDetailsFragment = ActivityDetailsFragment.this;
                n0 viewLifecycleOwner = activityDetailsFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(activityDetailsFragment, null);
                this.f30038a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$5", f = "ActivityDetailsFragment.kt", l = {487}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30043a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$5$1", f = "ActivityDetailsFragment.kt", l = {488}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f30045a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f30046b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0466a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ActivityDetailsFragment f30047a;

                public C0466a(ActivityDetailsFragment activityDetailsFragment) {
                    this.f30047a = activityDetailsFragment;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    nr.t.b bVar = (nr.t.b) obj;
                    if (bVar.f127325a) {
                        String str = bVar.f127327c;
                        int i14 = ActivityDetailsFragment.I;
                        ActivityDetailsFragment activityDetailsFragment = this.f30047a;
                        Fragment fragmentG = activityDetailsFragment.getParentFragmentManager().G("GCMFeatureInfoDialog");
                        if (fragmentG != null && (fragmentG instanceof androidx.fragment.app.i)) {
                            ((androidx.fragment.app.i) fragmentG).dismiss();
                        }
                        int i15 = activityDetailsFragment.requireContext().getResources().getConfiguration().uiMode & 48;
                        int iJ = f0.j(((i15 == 0 || i15 == 16) ? j92.a.b() : j92.a.a()).f().b());
                        Drawable drawable = a7.b.getDrawable(activityDetailsFragment.requireContext(), R.drawable.fivehz);
                        if (drawable != null) {
                            drawable.setTint(iJ);
                        }
                        m0 m0VarD = m0.a.d(m0.f149759e, R.drawable.fivehz, activityDetailsFragment.getString(R.string.lbl_five_hertz_dialog_title), activityDetailsFragment.getString(R.string.lbl_five_hertz_dialog, str), R.string.power_curve_view_activity_label, new qr.e(activityDetailsFragment, 1), R.string.common_learn_more, new qr.f(activityDetailsFragment, str, 1), null, 1920);
                        activityDetailsFragment.f29996i = m0VarD;
                        m0VarD.setCancelable(false);
                        m0 m0Var = activityDetailsFragment.f29996i;
                        if (m0Var != null) {
                            m0Var.show(activityDetailsFragment.getParentFragmentManager(), "GCMFeatureInfoDialog");
                        }
                        qr.t tVarZ6 = activityDetailsFragment.z6();
                        tVarZ6.W1.k(null, new nr.t.b(false, true, str));
                        tVarZ6.f146547p.t0();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityDetailsFragment activityDetailsFragment, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f30046b = activityDetailsFragment;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f30046b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f30045a;
                if (i14 == 0) {
                    r.b(obj);
                    int i15 = ActivityDetailsFragment.I;
                    ActivityDetailsFragment activityDetailsFragment = this.f30046b;
                    p2 p2Var = activityDetailsFragment.z6().W1;
                    C0466a c0466a = new C0466a(activityDetailsFragment);
                    this.f30045a = 1;
                    if (p2Var.collect(c0466a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivityDetailsFragment.this.new i(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30043a;
            if (i14 == 0) {
                r.b(obj);
                ActivityDetailsFragment activityDetailsFragment = ActivityDetailsFragment.this;
                n0 viewLifecycleOwner = activityDetailsFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(activityDetailsFragment, null);
                this.f30043a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$6", f = "ActivityDetailsFragment.kt", l = {497}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30048a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$onViewCreated$6$1", f = "ActivityDetailsFragment.kt", l = {498}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f30050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f30051b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0467a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ActivityDetailsFragment f30052a;

                public C0467a(ActivityDetailsFragment activityDetailsFragment) {
                    this.f30052a = activityDetailsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    Object value;
                    String str = (String) obj;
                    if (str != null) {
                        int i14 = ActivityDetailsFragment.I;
                        ActivityDetailsFragment activityDetailsFragment = this.f30052a;
                        qr.t.I5(activityDetailsFragment.z6(), str, null, 6);
                        p2 p2Var = activityDetailsFragment.z6().N0;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, null));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityDetailsFragment activityDetailsFragment, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f30051b = activityDetailsFragment;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f30051b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$j$a for r5v1 'this'  t13.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r5.f30050a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L14
                    if (r1 == r3) goto L10
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r6)
                    return r2
                L10:
                    o13.r.b(r6)
                    goto L31
                L14:
                    o13.r.b(r6)
                    int r6 = com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment.I
                    com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment r6 = r5.f30051b
                    qr.t r1 = r6.z6()
                    r53.b2 r1 = r1.O0
                    com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$j$a$a r4 = new com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment$j$a$a
                    r4.<init>(r6)
                    r5.f30050a = r3
                    r53.o2<T> r6 = r1.f150540a
                    java.lang.Object r6 = r6.collect(r4, r5)
                    if (r6 != r0) goto L31
                    return r0
                L31:
                    o2.c.f()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public j(t13.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivityDetailsFragment.this.new j(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f30048a;
            if (i14 == 0) {
                r.b(obj);
                ActivityDetailsFragment activityDetailsFragment = ActivityDetailsFragment.this;
                n0 viewLifecycleOwner = activityDetailsFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(activityDetailsFragment, null);
                this.f30048a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30053a;

        public k(e23.l lVar) {
            lVar.getClass();
            this.f30053a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30053a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30053a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30054a;

        public l(Fragment fragment) {
            this.f30054a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f30054a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<qr.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30059e;

        public m(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30055a = fragment;
            this.f30056b = qualifier;
            this.f30057c = aVar;
            this.f30058d = aVar2;
            this.f30059e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final qr.t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30057c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30055a;
            e23.a aVar = this.f30058d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(qr.t.class), f189591b, null, defaultViewModelCreationExtras, this.f30056b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30059e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30060a;

        public n(Fragment fragment) {
            this.f30060a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f30060a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class o implements e23.a<o6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30065e;

        public o(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30061a = fragment;
            this.f30062b = qualifier;
            this.f30063c = aVar;
            this.f30064d = aVar2;
            this.f30065e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.o6] */
        @Override // e23.a
        public final o6 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30063c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30061a;
            e23.a aVar = this.f30064d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(o6.class), f189591b, null, defaultViewModelCreationExtras, this.f30062b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30065e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30066a;

        public p(Fragment fragment) {
            this.f30066a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f30066a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class q implements e23.a<u2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30071e;

        public q(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30067a = fragment;
            this.f30068b = qualifier;
            this.f30069c = aVar;
            this.f30070d = aVar2;
            this.f30071e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, aq.u2] */
        @Override // e23.a
        public final u2 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f30069c.invoke()).getF189591b();
            Fragment fragment = this.f30067a;
            e23.a aVar = this.f30070d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(u2.class), f189591b, null, defaultViewModelCreationExtras, this.f30068b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30071e, 4, null);
        }
    }

    static {
        new c(null);
    }

    public ActivityDetailsFragment() {
        super(R.layout.activity_details_main);
        l lVar = new l(this);
        o13.n nVar = o13.n.NONE;
        this.f29988a = o13.m.a(nVar, new m(this, null, lVar, null, null));
        this.f29989b = o13.m.a(nVar, new q(this, null, new p(this), null, null));
        this.f29990c = o13.m.a(nVar, new o(this, null, new n(this), null, null));
        this.f29998k = o13.m.b(new qn0.m(9));
        final int i14 = 4;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i15 = i14;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i15) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i16 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i17 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i18 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i19 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i24 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i25 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i26 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i27 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i28 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f29999l = cVarRegisterForActivityResult;
        final int i15 = 5;
        f.c<f.j> cVarRegisterForActivityResult2 = registerForActivityResult(new g.d(0, 1, null), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i16 = i15;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i16) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i17 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i18 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i19 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i110 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i24 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i25 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i26 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i27 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i28 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f30000m = cVarRegisterForActivityResult2;
        final int i16 = 6;
        f.c<f.j> cVarRegisterForActivityResult3 = registerForActivityResult(new g.e(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i17 = i16;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i17) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i18 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i19 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i110 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i24 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i25 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i26 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i27 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i28 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult3.getClass();
        this.f30001n = cVarRegisterForActivityResult3;
        final int i17 = 7;
        f.c<String[]> cVarRegisterForActivityResult4 = registerForActivityResult(new g.f(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i18 = i17;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i18) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i19 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i110 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i24 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i25 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i26 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i27 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i28 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult4.getClass();
        this.f30002o = cVarRegisterForActivityResult4;
        final int i18 = 8;
        f.c<Intent> cVarRegisterForActivityResult5 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i19 = i18;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i19) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i110 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i24 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i25 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i26 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i27 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i28 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult5.getClass();
        this.f30003p = cVarRegisterForActivityResult5;
        final int i19 = 9;
        f.c<Intent> cVarRegisterForActivityResult6 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i19;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i24 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i25 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i26 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i27 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i28 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult6.getClass();
        this.f30004q = cVarRegisterForActivityResult6;
        final int i24 = 10;
        f.c<Intent> cVarRegisterForActivityResult7 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i24;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i25 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i26 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i27 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i28 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult7.getClass();
        this.f30005r = cVarRegisterForActivityResult7;
        final int i25 = 11;
        registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i25;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i26 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i27 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i28 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i29 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i211 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        }).getClass();
        final int i26 = 12;
        f.c<Intent> cVarRegisterForActivityResult8 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i26;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i27 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i28 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i29 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i210 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i211 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i212 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult8.getClass();
        this.f30006t = cVarRegisterForActivityResult8;
        final int i27 = 13;
        f.c<Intent> cVarRegisterForActivityResult9 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i27;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i28 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i29 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i210 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i211 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i212 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i213 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult9.getClass();
        this.f30007v = cVarRegisterForActivityResult9;
        final int i28 = 14;
        f.c<Intent> cVarRegisterForActivityResult10 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i28;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i29 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i210 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i211 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i212 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i213 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult10.getClass();
        this.f30008w = cVarRegisterForActivityResult10;
        final int i29 = 15;
        f.c<Intent> cVarRegisterForActivityResult11 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i29;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i30 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i38 = aVar12.f67585a;
                        if (i38 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i38 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult11.getClass();
        this.f30009x = cVarRegisterForActivityResult11;
        final int i30 = 16;
        f.c<Intent> cVarRegisterForActivityResult12 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i30;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i34 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i38 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i39 = aVar12.f67585a;
                        if (i39 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i39 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i310 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult12.getClass();
        this.f30010y = cVarRegisterForActivityResult12;
        final int i34 = 17;
        f.c<Intent> cVarRegisterForActivityResult13 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i34;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i35 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i38 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i310 = aVar12.f67585a;
                        if (i310 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i310 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i311 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult13.getClass();
        this.f30011z = cVarRegisterForActivityResult13;
        final int i35 = 18;
        f.c<Intent> cVarRegisterForActivityResult14 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i35;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i36 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i38 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i310 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i311 = aVar12.f67585a;
                        if (i311 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i311 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i312 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult14.getClass();
        this.A = cVarRegisterForActivityResult14;
        final int i36 = 0;
        f.c<Intent> cVarRegisterForActivityResult15 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i36;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i37 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i38 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i310 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i311 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i312 = aVar12.f67585a;
                        if (i312 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i312 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i313 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult15.getClass();
        this.B = cVarRegisterForActivityResult15;
        final int i37 = 1;
        f.c<Intent> cVarRegisterForActivityResult16 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i37;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i38 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i310 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i311 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i312 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i313 = aVar12.f67585a;
                        if (i313 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i313 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i314 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult16.getClass();
        this.C = cVarRegisterForActivityResult16;
        final int i38 = 2;
        f.c<Intent> cVarRegisterForActivityResult17 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i38;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i39 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i310 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i311 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i312 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i313 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i314 = aVar12.f67585a;
                        if (i314 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i314 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i315 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult17.getClass();
        this.D = cVarRegisterForActivityResult17;
        final int i39 = 3;
        f.c<Intent> cVarRegisterForActivityResult18 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qr.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsFragment f146124b;

            {
                this.f146124b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Parcelable parcelable2;
                ps.r value;
                ps.r rVar;
                ps.a1 metadataDTO;
                int i110 = i39;
                ActivityDetailsFragment activityDetailsFragment = this.f146124b;
                switch (i110) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        int i111 = ActivityDetailsFragment.I;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            ActivityDetailsFragment.w6(activityDetailsFragment, R.string.lbl_removed_groupride);
                            t tVarZ6 = activityDetailsFragment.z6();
                            tVarZ6.X4(tVarZ6.f146575z);
                            tVarZ6.C5();
                        }
                        break;
                    case 1:
                        f.a aVar2 = (f.a) obj;
                        int i112 = ActivityDetailsFragment.I;
                        aVar2.getClass();
                        if (aVar2.f67585a == -1) {
                            activityDetailsFragment.M7();
                        }
                        break;
                    case 2:
                        f.a aVar3 = (f.a) obj;
                        int i113 = ActivityDetailsFragment.I;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                            String string = activityDetailsFragment.getString(R.string.gear_successfully_updated);
                            string.getClass();
                            activityDetailsFragment.v6(string, null, null);
                        }
                        break;
                    case 3:
                        f.a aVar4 = (f.a) obj;
                        int i114 = ActivityDetailsFragment.I;
                        aVar4.getClass();
                        if (aVar4.f67585a == -1) {
                            t tVarZ7 = activityDetailsFragment.z6();
                            tVarZ7.X4(tVarZ7.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 4:
                        f.a aVar5 = (f.a) obj;
                        int i210 = ActivityDetailsFragment.I;
                        aVar5.getClass();
                        if (aVar5.f67585a == 0) {
                            t tVarZ8 = activityDetailsFragment.z6();
                            js.b bVar = (js.b) tVarZ8.M0.getValue();
                            boolean z14 = bVar.f100591d.get();
                            bVar.a();
                            if (!z14) {
                                tVarZ8.F5("ActivityShareTemplateCancelled", null, false, false);
                            }
                        }
                        break;
                    case 5:
                        List list = (List) obj;
                        int i211 = ActivityDetailsFragment.I;
                        list.getClass();
                        Context context = activityDetailsFragment.getContext();
                        if (context != null) {
                            activityDetailsFragment.E6(context, list);
                        }
                        break;
                    case 6:
                        Uri uri = (Uri) obj;
                        int i212 = ActivityDetailsFragment.I;
                        Context context2 = activityDetailsFragment.getContext();
                        if (context2 != null) {
                            activityDetailsFragment.E6(context2, p13.w.c(uri));
                        }
                        break;
                    case 7:
                        Map map = (Map) obj;
                        int i213 = ActivityDetailsFragment.I;
                        map.getClass();
                        if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                            ActivityDetailsFragment.C6(10, activityDetailsFragment.f30000m, activityDetailsFragment.f30001n);
                        }
                        break;
                    case 8:
                        f.a aVar6 = (f.a) obj;
                        int i214 = ActivityDetailsFragment.I;
                        aVar6.getClass();
                        if (aVar6.f67585a == -1) {
                            t tVarZ9 = activityDetailsFragment.z6();
                            tVarZ9.X4(tVarZ9.f146575z);
                        }
                        break;
                    case 9:
                        f.a aVar7 = (f.a) obj;
                        int i215 = ActivityDetailsFragment.I;
                        aVar7.getClass();
                        if (aVar7.f67585a == -1) {
                            t tVarZ10 = activityDetailsFragment.z6();
                            long j8 = tVarZ10.f146575z;
                            tVarZ10.R4(j8);
                            t.O4(tVarZ10, null, 3);
                            tVarZ10.P4(j8);
                            tVarZ10.D5();
                            tVarZ10.J4();
                        }
                        break;
                    case 10:
                        f.a aVar8 = (f.a) obj;
                        int i310 = ActivityDetailsFragment.I;
                        aVar8.getClass();
                        if (aVar8.f67585a == -1) {
                            t tVarZ11 = activityDetailsFragment.z6();
                            tVarZ11.X4(tVarZ11.f146575z);
                            activityDetailsFragment.z6().H1 = true;
                        }
                        break;
                    case 11:
                        f.a aVar9 = (f.a) obj;
                        int i311 = ActivityDetailsFragment.I;
                        aVar9.getClass();
                        if (aVar9.f67585a == -1 && (intent = aVar9.f67586b) != null) {
                            ArrayList<bq0.k> parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", bq0.k.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra == null) {
                                parcelableArrayListExtra = new ArrayList<>();
                            }
                            activityDetailsFragment.z6().c6(parcelableArrayListExtra);
                            break;
                        }
                        break;
                    case 12:
                        f.a aVar10 = (f.a) obj;
                        int i312 = ActivityDetailsFragment.I;
                        aVar10.getClass();
                        Intent intent2 = aVar10.f67586b;
                        if (aVar10.f67585a == -1 && intent2 != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            List<ps.j> parcelableArrayListExtra2 = Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data");
                            if (parcelableArrayListExtra2 == null) {
                                parcelableArrayListExtra2 = p13.j0.f134944a;
                            }
                            activityDetailsFragment.z6().Y5(parcelableArrayListExtra2);
                            break;
                        }
                        break;
                    case 13:
                        f.a aVar11 = (f.a) obj;
                        int i313 = ActivityDetailsFragment.I;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1 && intent3 != null) {
                            int intExtra = intent3.getIntExtra("GCM_conversation_comments_edited_count", 0);
                            if (Boolean.valueOf(intent3.getBooleanExtra("GCM_conversation_like_modified", false)).equals(Boolean.TRUE)) {
                                t tVarZ12 = activityDetailsFragment.z6();
                                long j14 = tVarZ12.f146575z;
                                tVarZ12.d5(j14);
                                tVarZ12.c5(j14);
                            }
                            if (intExtra != 0) {
                                t tVarZ13 = activityDetailsFragment.z6();
                                mo1.d dVar = tVarZ13.f146523h1;
                                if (dVar != null) {
                                    tVarZ13.f146523h1 = mo1.d.b(dVar, dVar.getNumberOfComments() + intExtra);
                                }
                                tVarZ13.s5().setValue(tVarZ13.T4(tVarZ13.f146523h1, tVarZ13.f146526i1));
                            }
                            break;
                        }
                        break;
                    case 14:
                        f.a aVar12 = (f.a) obj;
                        int i314 = ActivityDetailsFragment.I;
                        aVar12.getClass();
                        Intent intent4 = aVar12.f67586b;
                        int i315 = aVar12.f67585a;
                        if (i315 == -1 && intent4 != null && intent4.getExtras() != null) {
                            if (intent4.hasExtra("GCM_extra_activity_summary") || intent4.hasExtra("GCM_extra_activity_splits")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent4.getParcelableExtra("GCM_extra_activity_summary", ps.r.class);
                                } else {
                                    Parcelable parcelableExtra = intent4.getParcelableExtra("GCM_extra_activity_summary");
                                    if (!(parcelableExtra instanceof ps.r)) {
                                        parcelableExtra = null;
                                    }
                                    parcelable = (ps.r) parcelableExtra;
                                }
                                ps.r rVar2 = (ps.r) parcelable;
                                t tVarZ14 = activityDetailsFragment.z6();
                                am.x0 x0VarH = rVar2 != null ? rVar2.h() : null;
                                tVarZ14.H1 = true;
                                if (x0VarH != null) {
                                    tVarZ14.F4(x0VarH);
                                }
                                tVarZ14.D5();
                                tVarZ14.X4(tVarZ14.f146575z);
                            }
                            if (intent4.hasExtra("GCM_extra_activity_splits")) {
                                ActivityDetailsFragment.w6(activityDetailsFragment, R.string.interval_types_changes_saved);
                            }
                        } else if (i315 == 1) {
                            t tVarZ15 = activityDetailsFragment.z6();
                            tVarZ15.H1 = true;
                            tVarZ15.I4();
                        }
                        break;
                    case 15:
                        f.a aVar13 = (f.a) obj;
                        int i316 = ActivityDetailsFragment.I;
                        aVar13.getClass();
                        if (aVar13.f67585a == -1) {
                            activityDetailsFragment.z6().l5();
                        }
                        break;
                    case 16:
                        f.a aVar14 = (f.a) obj;
                        int i44 = ActivityDetailsFragment.I;
                        aVar14.getClass();
                        if (aVar14.f67585a == -1) {
                            t tVarZ16 = activityDetailsFragment.z6();
                            long jH = tVarZ16.f146544o.h();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f6(tVarZ16, null), new r53.c2(new e6(tVarZ16, jH, null))), new g6(jH, tVarZ16, null)), new h6(null)), new i6(tVarZ16, null)), androidx.lifecycle.v1.a(tVarZ16));
                        }
                        break;
                    case 17:
                        f.a aVar15 = (f.a) obj;
                        int i45 = ActivityDetailsFragment.I;
                        aVar15.getClass();
                        Intent intent5 = aVar15.f67586b;
                        if (aVar15.f67585a == -1 && intent5 != null) {
                            t tVarZ17 = activityDetailsFragment.z6();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra2 = intent5.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                parcelable2 = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra2 : null);
                            }
                            tVarZ17.K5((com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable2);
                            break;
                        }
                        break;
                    default:
                        f.a aVar16 = (f.a) obj;
                        int i46 = ActivityDetailsFragment.I;
                        aVar16.getClass();
                        if (aVar16.f67585a == -1) {
                            t tVarZ18 = activityDetailsFragment.z6();
                            tVarZ18.H1 = true;
                            ps.r value2 = tVarZ18.W4().getValue();
                            ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, false, null, null, null, null, -1, 524031);
                            r53.z1<ps.r> z1VarW4 = tVarZ18.W4();
                            do {
                                value = z1VarW4.getValue();
                                rVar = value;
                            } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
                            tVarZ18.D5();
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult18.getClass();
        this.E = cVarRegisterForActivityResult18;
    }

    public static void C6(int i14, f.c cVar, f.c cVar2) {
        if (i14 > 1) {
            cVar.a(f.k.a(g.e.d.f74074a, i14, 12), null);
        } else {
            cVar2.a(f.k.a(g.e.d.f74074a, 0, 14), null);
        }
    }

    public static /* synthetic */ void M6(ActivityDetailsFragment activityDetailsFragment, ro0.l lVar, String str, Bundle bundle, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        if ((i14 & 4) != 0) {
            bundle = null;
        }
        activityDetailsFragment.K6(lVar, str, bundle);
    }

    public static void V6(ActivityDetailsFragment activityDetailsFragment, Menu menu, int i14, boolean z14) {
        activityDetailsFragment.getClass();
        MenuItem menuItemFindItem = menu.findItem(i14);
        menuItemFindItem.setEnabled(true);
        menuItemFindItem.setVisible(z14);
    }

    public static void w6(ActivityDetailsFragment activityDetailsFragment, int i14) {
        String string = activityDetailsFragment.requireContext().getString(i14);
        string.getClass();
        activityDetailsFragment.v6(string, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final u2 A6() {
        return (u2) this.f29989b.getValue();
    }

    public final void E6(Context context, List list) {
        ContentResolver contentResolver;
        ArrayList<bq0.k> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                if (Build.VERSION.SDK_INT > 29 && (contentResolver = context.getContentResolver()) != null) {
                    contentResolver.takePersistableUriPermission(uri, 1);
                }
                String string = uri.toString();
                string.getClass();
                arrayList.add(new bq0.k(uri, string, "jpg", 0.0d));
            } else {
                Toast.makeText(requireContext(), R.string.social_upload_failed_message, 0).show();
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        z6().c6(arrayList);
    }

    public final void F6(String str, String str2, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, x0 x0Var) {
        NewSelectExerciseActivity.a aVar = NewSelectExerciseActivity.f29823c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f30011z.a(NewSelectExerciseActivity.a.a(aVar, contextRequireContext, cVar, null, str, false, str2, hq.j.d(x0Var), hq.j.c(x0Var), false, 276), null);
    }

    public final void G6(long j8) {
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        am.d dVar = (am.d) this.f29998k.getValue();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        mVarRequireActivity.startActivity(dVar.e(contextRequireContext, j8));
    }

    public final void H6(ps.r rVar, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, s0 s0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.d dVar) throws JSONException {
        Intent intent;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVarG = fr.a.g(rVar, s0Var);
        ArrayList arrayList = hVarG.f29464q;
        if ((arrayList != null ? ss.l.c(arrayList, x.WORKOUT_ROUND) : null) == null || fVar == null) {
            ExerciseSetsDTO exerciseSetsDTOQ = s0Var != null ? dh.b.Q(s0Var) : null;
            long j8 = exerciseSetsDTOQ != null ? exerciseSetsDTOQ.f41090b : hVarG.f29448a;
            if (am.z0.W(hVarG.C().f4358a)) {
                EditExercisesMultiSelectActivity.a aVar = EditExercisesMultiSelectActivity.f29784b;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                x0 x0VarC = hVarG.C();
                x0VarC.getClass();
                aVar.getClass();
                intent = new Intent(contextRequireContext, (Class<?>) EditExercisesMultiSelectActivity.class);
                com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, h7.c.a(new o13.p("EXTRA_EXERCISE_SETS", exerciseSetsDTOQ), new o13.p("EXTRA_EXERCISE_LIST", cVar), new o13.p("EXTRA_ACTIVITY_ID", Long.valueOf(j8)), new o13.p("EXTRA_ACTIVITY_TYPE", x0VarC), new o13.p("EXTRA_ADDED_EXERCISE", dVar)));
            } else {
                EditExercisesActivity.a aVar2 = EditExercisesActivity.f29765m;
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                x0 x0VarC2 = hVarG.C();
                boolean zG = s.g(hVarG.f29459l.getIsWheelchair(), Boolean.TRUE);
                aVar2.getClass();
                intent = new Intent(contextRequireContext2, (Class<?>) EditExercisesActivity.class);
                l2.a aVar3 = l2.f37135b;
                o13.p pVar = new o13.p("EXTRA_EXERCISE_SETS", exerciseSetsDTOQ);
                o13.p pVar2 = new o13.p("EXTRA_EXERCISE_LIST", cVar);
                o13.p pVar3 = new o13.p("EXTRA_ACTIVITY_ID", Long.valueOf(j8));
                x0VarC2.getClass();
                com.airbnb.lottie.animation.keyframe.a.q(aVar3, intent, h7.c.a(pVar, pVar2, pVar3, new o13.p("EXTRA_ACTIVITY_TYPE", x0VarC2), new o13.p("EXTRA_ADDED_EXERCISE", dVar), new o13.p("EXTRA_IS_WHEELCHAIR", Boolean.valueOf(zG))));
            }
        } else {
            EditExerciseSetsActivity.a aVar4 = EditExerciseSetsActivity.f29937e;
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            aVar4.getClass();
            intent = new Intent(contextRequireContext3, (Class<?>) EditExerciseSetsActivity.class);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, h7.c.a(new o13.p("GCM_extra_activity_summary", hVarG), new o13.p("EXTRA_ROUNDS", fVar)));
        }
        this.f30004q.a(intent, null);
    }

    public final void I6(Long l14, String str) {
        if (l14 == null && str == null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            q0.b(contextRequireContext);
        } else {
            am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            dVar.V(contextRequireContext2, l14, str);
        }
    }

    public final void J6(im.b bVar, List<? extends im.b> list, SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray, l0 l0Var) {
        fz.c cVar;
        if (bVar == null || list == null || list.isEmpty()) {
            return;
        }
        im.e eVar = new im.e(bVar.getB1(), bVar.K0(), sparseArray);
        if (bVar.getB1() != 45 || l0Var == null) {
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            ArrayList arrayList = new ArrayList(list);
            Boolean bool = Boolean.TRUE;
            int i14 = d.f30019b[((rr.k) z6().Q1.getValue()).ordinal()];
            if (i14 == 1) {
                cVar = fz.c.TIME;
            } else {
                if (i14 != 2) {
                    u0.r();
                    return;
                }
                cVar = fz.c.DISTANCE;
            }
            FullscreenChartActivity.pa(mVarRequireActivity, arrayList, eVar, bool, cVar);
            return;
        }
        TankPressureFullscreenChartActivity.a aVar = TankPressureFullscreenChartActivity.f28951t;
        androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(list);
        aVar.getClass();
        if (mVarRequireActivity2 != null) {
            Intent intent = new Intent(mVarRequireActivity2, (Class<?>) TankPressureFullscreenChartActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_chart_data_list", arrayList2);
            bundle.putParcelable("extra_activity_chart_type", eVar);
            bundle.putParcelable("extra_tank_pressures", l0Var);
            l2.f37135b.getClass();
            l2.a.b().a(intent, bundle);
            mVarRequireActivity2.startActivity(intent);
        }
    }

    public final void K6(ro0.l lVar, String str, Bundle bundle) {
        HelpActivity.a aVar = HelpActivity.f36653a;
        Context contextRequireContext = requireContext();
        aVar.getClass();
        HelpActivity.a.d(contextRequireContext, lVar, str, bundle);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        SwipeRefreshLayout swipeRefreshLayout = this.f29991d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        z6().B5();
    }

    public final void S6(ExerciseSetsDTO exerciseSetsDTO) {
        DetailedMuscleMapActivity.a aVar = DetailedMuscleMapActivity.f29817b;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        Intent intent = new Intent(contextRequireContext, (Class<?>) DetailedMuscleMapActivity.class);
        intent.putExtra("VISIBLE_EXERCISE_SET_KEY", exerciseSetsDTO);
        contextRequireContext.startActivity(intent);
    }

    public final void T6(PrivacyType privacyType) {
        NavHostFragment.f10124e.getClass();
        y yVarA = NavHostFragment.a.a(this);
        lc.h0 h0VarJ = yVarA.f111904b.j();
        if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.activityDetailsFragment) {
            return;
        }
        yVarA.g(R.id.action_activityDetailsFragment_to_activityPrivacyBottomSheet, h7.c.a(new o13.p("current_privacy_type", privacyType)));
    }

    public final void U6(long j8, Long l14, Long l15, Long l16, Integer num, boolean z14) {
        Intent intentW;
        if (z14) {
            am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            intentW = dVar.f(contextRequireContext, l16);
        } else {
            am.d dVar2 = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            intentW = dVar2.w(contextRequireContext2, j8, l14, l15, num, l16);
        }
        this.C.a(intentW, null);
    }

    public final void X6(long j8) {
        q1.b bVar = q1.f41066b;
        c22.x0.f23314a.getClass();
        String str = c22.x0.f23562od;
        str.getClass();
        String strF = g2.f(str);
        String str2 = c22.x0.f23596qd;
        str2.getClass();
        String strF2 = g2.f(str2);
        a73.b bVar2 = new a73.b(this, j8, 2);
        bVar.getClass();
        q1 q1VarC = q1.b.c(strF, strF2, R.string.common_confirm, R.string.lbl_cancel, bVar2);
        androidx.fragment.app.v parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        q1VarC.v6(parentFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    public final void Y6(boolean z14) {
        String string;
        TextView textView = this.f29995h;
        if (textView != null) {
            if (z14) {
                SwipeRefreshLayout swipeRefreshLayout = this.f29991d;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setEnabled(false);
                }
                string = getString(R.string.activities_missing_activity_message);
            } else {
                string = getString(R.string.string_space_string_pattern, getString(R.string.msg_activity_load_error), getString(R.string.msg_common_pull_to_refresh));
            }
            textView.setText(string);
        }
        y6(true);
    }

    public final void c7(final long j8, final x0 x0Var, final boolean z14, final boolean z15) {
        q1.b bVar = q1.f41066b;
        String string = getString(R.string.activities_restore_original_question);
        string.getClass();
        String string2 = getString(R.string.activities_delete_changes);
        string2.getClass();
        q1.a aVar = new q1.a() { // from class: qr.h
            @Override // com.garmin.android.apps.connectmobile.q1.a
            public final void g(boolean z16) {
                int i14 = ActivityDetailsFragment.I;
                if (z16) {
                    ActivityDetailsFragment activityDetailsFragment = this.f146226a;
                    aq.u2 u2VarA6 = activityDetailsFragment.A6();
                    long j14 = j8;
                    am.x0 x0Var2 = x0Var;
                    u2VarA6.z4(j14, x0Var2, z14, z15).f(activityDetailsFragment.getViewLifecycleOwner(), new ActivityDetailsFragment.k(new i(activityDetailsFragment, j14, x0Var2)));
                }
            }
        };
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.activities_restore_activity, R.string.lbl_cancel, aVar);
        androidx.fragment.app.v parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        q1VarC.v6(parentFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    public final void d7() {
        ViewPager2 viewPager2 = this.f29992e;
        Integer numValueOf = viewPager2 != null ? Integer.valueOf(viewPager2.getCurrentItem()) : null;
        a aVar = this.f29997j;
        if (aVar == null) {
            s.m("tabAdapter");
            throw null;
        }
        int size = aVar.f30014l.size();
        if (numValueOf == null || size <= 0) {
            return;
        }
        a aVar2 = this.f29997j;
        if (aVar2 == null) {
            s.m("tabAdapter");
            throw null;
        }
        boolean z14 = aVar2.f30014l.get(numValueOf.intValue()).f127239c;
        a aVar3 = this.f29997j;
        if (aVar3 == null) {
            s.m("tabAdapter");
            throw null;
        }
        boolean z15 = aVar3.f30014l.get(numValueOf.intValue()).f127238b;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        int i14 = 1;
        if (z15 && (!this.F || !z14)) {
            i14 = -1;
        }
        mVarRequireActivity.setRequestedOrientation(i14);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A6().f12260b.f(this, new k(new qr.d(this, 0)));
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        TextView textView;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f29997j = new a(this, this);
        ((o6) this.f29990c.getValue()).f146411a.f(this, new k(new qr.d(this, 1)));
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new qr.m(this), getViewLifecycleOwner());
        this.f29994g = (TabLayout) view2.findViewById(R.id.activity_details_tab_layout);
        this.f29993f = (ComposeView) view2.findViewById(R.id.promotion_container);
        this.f29992e = (ViewPager2) view2.findViewById(R.id.activity_details_view_pager);
        this.f29995h = (TextView) view2.findViewById(R.id.activity_no_data_state_message);
        boolean z14 = false;
        boolean z15 = getResources().getConfiguration().orientation == 1;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view2.findViewById(R.id.swipe_refresh_root_view);
        this.f29991d = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f29991d;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnChildScrollUpCallback(new qr.g(this));
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.f29991d;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.setEnabled(z15);
        }
        TabLayout tabLayout = this.f29994g;
        if (tabLayout != null) {
            if (z15) {
                a aVar = this.f29997j;
                if (aVar == null) {
                    s.m("tabAdapter");
                    throw null;
                }
                if (aVar.f30014l.size() > 1 && (textView = this.f29995h) != null && textView.getVisibility() == 8) {
                    z14 = true;
                }
            }
            v22.e.v(tabLayout, z14);
        }
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(o53.f0.w(viewLifecycleOwner), null, null, new f(z15, null), 3);
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ge1.b.T(o53.f0.w(viewLifecycleOwner2), null, null, new g(z15, null), 3);
        n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        ge1.b.T(o53.f0.w(viewLifecycleOwner3), null, null, new h(null), 3);
        n0 viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        ge1.b.T(o53.f0.w(viewLifecycleOwner4), null, null, new i(null), 3);
        n0 viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        ge1.b.T(o53.f0.w(viewLifecycleOwner5), null, null, new j(null), 3);
    }

    public final boolean u6(String str, int i14, String str2, boolean z14, boolean z15) {
        boolean z16 = false;
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences(getString(R.string.aae_trimmed_or_edited_legs_activity_set_key), 0);
        Set<String> stringSet = sharedPreferences.getStringSet(str2, null);
        Set<String> set = stringSet;
        if (set != null && !set.isEmpty() && stringSet.contains(str)) {
            if (!z15 && z14) {
                A6().f12260b.m(new w61.f<>(Integer.valueOf(i14)));
                z16 = true;
            }
            HashSet hashSet = new HashSet(set);
            hashSet.remove(str);
            sharedPreferences.edit().putStringSet(str2, hashSet).apply();
        }
        return z16;
    }

    public final void v6(String str, CharSequence charSequence, e23.a<Unit> aVar) {
        r22.q0.b bVar = r22.q0.f149800b;
        View viewRequireView = requireView();
        viewRequireView.getClass();
        r22.q0 q0VarC = r22.q0.b.c(bVar, viewRequireView, str, null, 12);
        if (charSequence != null) {
            q0VarC.c(charSequence, new aq.q1(aVar, 18));
        }
        q0VarC.show();
    }

    public final void y6(boolean z14) {
        boolean z15 = false;
        boolean z16 = getResources().getConfiguration().orientation == 1;
        TextView textView = this.f29995h;
        if (textView != null) {
            v22.e.v(textView, z14);
        }
        TabLayout tabLayout = this.f29994g;
        if (tabLayout != null) {
            if (!z14 && z16) {
                z15 = true;
            }
            v22.e.v(tabLayout, z15);
        }
        ViewPager2 viewPager2 = this.f29992e;
        if (viewPager2 != null) {
            v22.e.v(viewPager2, !z14);
        }
        ComposeView composeView = this.f29993f;
        if (composeView != null) {
            v22.e.v(composeView, !z14);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f29991d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(z16);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final qr.t z6() {
        return (qr.t) this.f29988a.getValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsFragment$c;", "", "<init>", "()V", "", "CAPTURED_IMAGE_EXTENSION", "Ljava/lang/String;", "", "MAX_PHOTOS_COUNT", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}

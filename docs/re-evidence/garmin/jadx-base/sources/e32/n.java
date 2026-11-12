package e32;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.SwipeViewPager;
import com.garmin.android.apps.connectmobile.view.pager.PagerTitleNavigationStrip;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Le32/n;", "NavigatorDestination", "Lx22/d;", "Le32/l;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class n<NavigatorDestination> extends x22.d implements l<NavigatorDestination> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f62802m = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f62803l = o13.m.b(new cq0.g(this, 28));

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g32.b.f75709a.getClass();
        g32.b.a.f75711b.m(Unit.INSTANCE);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // x22.d
    public final e0 ma() {
        DateTime dateTime;
        LocalDate localDate;
        Object serializable;
        Bundle extras = getIntent().getExtras();
        DateTime dateTimeAtStartOfDay = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Object serializable2 = extras.getSerializable("EXTRA_INITIAL_DATE");
                if (!(serializable2 instanceof DateTime)) {
                    serializable2 = null;
                }
                serializable = (DateTime) serializable2;
            }
            dateTime = (DateTime) serializable;
        } else {
            dateTime = null;
        }
        if (dateTime != null && (localDate = dateTime.toLocalDate()) != null) {
            dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        }
        return sa(dateTimeAtStartOfDay);
    }

    @Override // x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getResources().getConfiguration().orientation == 1) {
            initActionBar(true, ta());
        }
        o oVar = (o) this.f62803l.getValue();
        int i14 = 0;
        if (oVar != null) {
            j jVar = (j) oa();
            ra(jVar != null ? u.M(jVar.f62798j, oVar) : 0);
        }
        j jVar2 = (j) oa();
        if (jVar2 != null) {
            int length = jVar2.f62798j.length;
            if (length == 2) {
                i14 = R.dimen.two_tab_width;
            } else if (length == 3) {
                i14 = R.dimen.three_tab_width;
            }
            if (i14 > 0) {
                pa().getLayoutParams().width = getResources().getDimensionPixelSize(i14);
            }
        }
        SwipeViewPager swipeViewPagerQa = qa();
        j jVar3 = (j) oa();
        swipeViewPagerQa.setOffscreenPageLimit(jVar3 != null ? jVar3.f62798j.length - 1 : 3);
    }

    public void p4(o oVar, DateTime dateTime) {
        dateTime.getClass();
        oVar.getClass();
        j jVar = (j) oa();
        if (jVar != null) {
            o[] oVarArr = jVar.f62798j;
            ra(u.M(oVarArr, oVar));
            int iM = u.M(oVarArr, oVar);
            if (iM >= 0) {
                Fragment fragment = jVar.f62800l.get(iM);
                if (fragment instanceof h) {
                    h hVar = (h) fragment;
                    hVar.w6().setDefaultPosition(hVar.v6().c(dateTime));
                    PagerTitleNavigationStrip pagerTitleNavigationStrip = hVar.f188528c;
                    if (pagerTitleNavigationStrip != null) {
                        v22.e.a(pagerTitleNavigationStrip.f47676a);
                    } else {
                        s.m("pagerTitleStrip");
                        throw null;
                    }
                }
            }
        }
    }

    public abstract j sa(DateTime dateTime);

    public abstract String ta();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Le32/n$a;", "", "<init>", "()V", "", "DEFAULT_OFFSCREEN_PAGE_LIMIT", "I", "", "EXTRA_SELECTED_SUMMARY_TIME_INTERVAL", "Ljava/lang/String;", "EXTRA_INITIAL_DATE", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Intent intent, DateTime dateTime, o oVar) {
            intent.putExtra("EXTRA_INITIAL_DATE", dateTime);
            intent.putExtra("EXTRA_SUMMARY_TIME_INTERVAL", oVar);
        }

        private a() {
        }
    }
}

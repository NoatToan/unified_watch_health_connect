package com.garmin.android.apps.connectmobile.powerguide.create;

import ab1.g;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import fg0.k;
import j82.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import s52.e;
import tn2.t;
import ua1.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/create/ScheduledEventsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScheduledEventsActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40379d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<k> f40380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<g> f40381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f40382c;

    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    public final List<ab1.m> ca() {
        Long l14;
        Boolean boolD;
        Object next;
        ArrayList<k> arrayList = this.f40380a;
        ArrayList arrayList2 = null;
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
            for (k kVar : arrayList) {
                Long courseId = kVar.getCourseId();
                long jLongValue = courseId != null ? courseId.longValue() : 0L;
                boolean zBooleanValue = false;
                String strR = kVar.r(false);
                if (strR == null) {
                    strR = "";
                }
                String str = strR;
                double dA = sa1.y.a(kVar.getCompletionTarget());
                LocalDate date = kVar.getDate();
                if (date == null) {
                    date = LocalDate.now();
                }
                LocalDate localDate = date;
                localDate.getClass();
                ArrayList<g> arrayList4 = this.f40381b;
                if (arrayList4 != null) {
                    Iterator<T> it = arrayList4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Long l15 = ((g) next).f2570c;
                        if (l15 != null && l15.longValue() == jLongValue) {
                            break;
                        }
                    }
                    g gVar = (g) next;
                    if (gVar != null) {
                        l14 = gVar.f2568a;
                    } else {
                        l14 = null;
                    }
                } else {
                    l14 = null;
                }
                fg0.c eventPrivacy = kVar.getEventPrivacy();
                if (eventPrivacy != null && (boolD = eventPrivacy.getIsShareable()) != null) {
                    zBooleanValue = boolD.booleanValue();
                }
                arrayList3.add(new ab1.m(str, dA, localDate, jLongValue, l14, Boolean.valueOf(zBooleanValue)));
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? j0.f134944a : arrayList2;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if ("android.intent.action.DELETE".equals(intent != null ? intent.getAction() : null)) {
                Bundle extras = intent.getExtras();
                long j8 = extras != null ? extras.getLong("GCM_extra_power_guide_id_to_remove", -1L) : -1L;
                ArrayList<g> arrayList = this.f40381b;
                if (arrayList != null) {
                    arrayList.removeIf(new e(new d(j8, 22), 5));
                }
                m mVar = this.f40382c;
                if (mVar == null) {
                    s.m("scheduledEventsAdapter");
                    throw null;
                }
                List<ab1.m> listCa = ca();
                listCa.getClass();
                ArrayList arrayList2 = mVar.f169656d;
                arrayList2.clear();
                arrayList2.addAll(listCa);
                mVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList<k> parcelableArrayList;
        ArrayList<g> parcelableArrayList2;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_layout);
        initActionBar(true, R.string.lbl_scheduled_events);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundleA.getParcelableArrayList("GCM_extra_events_for_power_guide", k.class) : bundleA.getParcelableArrayList("GCM_extra_events_for_power_guide");
        } else {
            parcelableArrayList = null;
        }
        this.f40380a = parcelableArrayList;
        if (bundleA != null) {
            parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundleA.getParcelableArrayList("GCM_extra_power_guide_list", g.class) : bundleA.getParcelableArrayList("GCM_extra_power_guide_list");
        } else {
            parcelableArrayList2 = null;
        }
        this.f40381b = parcelableArrayList2;
        m mVar = new m(new t(this, 23));
        TextView textView = new TextView(new ContextThemeWrapper(this, R.style.PowerGuideFooterText), null, 0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        String string = getString(((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).y() ? R.string.lbl_power_guide_course_metric_limit : R.string.lbl_power_guide_course_statute_limit);
        string.getClass();
        textView.setText(string);
        mVar.r(textView);
        List<ab1.m> listCa = ca();
        listCa.getClass();
        ArrayList arrayList = mVar.f169656d;
        arrayList.clear();
        arrayList.addAll(listCa);
        mVar.notifyDataSetChanged();
        this.f40382c = mVar;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getResources().getDimensionPixelSize(R.dimen.spacing_large), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        m mVar2 = this.f40382c;
        if (mVar2 != null) {
            recyclerView.setAdapter(mVar2);
        } else {
            s.m("scheduledEventsAdapter");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/create/ScheduledEventsActivity$a;", "", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

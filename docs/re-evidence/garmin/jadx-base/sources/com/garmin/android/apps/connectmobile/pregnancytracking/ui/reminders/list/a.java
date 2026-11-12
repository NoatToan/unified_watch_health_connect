package com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bv2.j;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l;
import f12.b;
import gh2.i;
import hy.d;
import java.util.ArrayList;
import java.util.List;
import jd1.f;
import o13.p;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.w;
import p13.x;
import pd1.c;
import v22.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/reminders/list/a;", "Ljd1/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0772a f40930t = new C0772a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f40931r;

    @Override // jd1.f
    public final long C6() {
        l.g().getClass();
        return i.f77458c.a().f77477b.g("pregnancy_reminders_max");
    }

    @Override // jd1.f
    public final pd1.a F6() {
        return pd1.a.PREGNANCY;
    }

    @Override // jd1.f
    public final int G6() {
        return R.layout.pregnancy_reminder_list_item;
    }

    @Override // jd1.f
    public final void I6(View view2) {
        BubbleLayout bubbleLayout = (BubbleLayout) view2.findViewById(R.id.tool_tip_container);
        TextView textView = (TextView) view2.findViewById(R.id.tool_tip_label);
        View viewFindViewById = view2.findViewById(R.id.full_screen_click_view);
        i52.a aVar = i52.a.f91796a;
        SharedPreferences sharedPreferences = i52.a.f91797b;
        aVar.getClass();
        if (sharedPreferences.getBoolean(i52.a.c(R.string.key_pregnancy_show_tool_tip), true)) {
            A6().debug("Showing pregnancy tooltip");
            Paint paint = new Paint();
            paint.setTextSize(14 * getResources().getDisplayMetrics().density);
            paint.setStyle(Paint.Style.FILL);
            String string = requireContext().getString(R.string.pregnancy_edit_reminder_tooltip);
            string.getClass();
            textView.setText(string);
            float dimension = bubbleLayout.getResources().getDimension(R.dimen.spacing_small) + paint.measureText(string);
            bubbleLayout.b();
            bubbleLayout.f28584f = dimension;
            bubbleLayout.a();
            bubbleLayout.setVisibility(0);
            bubbleLayout.bringToFront();
            viewFindViewById.bringToFront();
            e.f(viewFindViewById, string);
            viewFindViewById.setOnClickListener(new j(this, 19, bubbleLayout, viewFindViewById));
        }
    }

    @Override // jd1.f
    public final void J6(View view2) {
        A6().debug("initViews: ");
        View viewFindViewById = view2.findViewById(R.id.reminder_refresh_layout);
        viewFindViewById.getClass();
        this.f98427g = (SwipeRefreshLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.reminders_rv);
        viewFindViewById2.getClass();
        this.f40931r = (RecyclerView) viewFindViewById2;
        m activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = this.f40931r;
            if (recyclerView == null) {
                s.m("remindersRecyclerView");
                throw null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(activity));
            RecyclerView recyclerView2 = this.f40931r;
            if (recyclerView2 == null) {
                s.m("remindersRecyclerView");
                throw null;
            }
            recyclerView2.setAdapter(this.f98424d);
        }
        E6().setOnRefreshListener(new d(this, 21));
        super.J6(view2);
    }

    @Override // jd1.f
    @SuppressLint({"StringFormatMatches"})
    public final void M6() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.f.d(c22.f.f23050a, contextRequireContext, contextRequireContext.getString(R.string.pregnancy_reminder_limit_reached), contextRequireContext.getString(R.string.pregnancy_reminder_limit_reached_message, Long.valueOf(C6())), new p(contextRequireContext.getString(R.string.lbl_ok), new l71.i(13)), null, null, false, 112).show();
    }

    @Override // jd1.f
    public final void S6(Context context, c cVar) {
        cVar.getClass();
        new nb1.a().o(context, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_reminders, viewGroup, false);
    }

    @Override // jd1.f
    public final c w6() {
        A6().debug("generateDefaultReminders");
        int userProfilePk = ((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).getUserProfilePk();
        DateTime dateTimeNow = DateTime.now();
        wd1.a[] aVarArrValues = wd1.a.values();
        ArrayList arrayList = new ArrayList(aVarArrValues.length);
        for (wd1.a aVar : aVarArrValues) {
            arrayList.add(Integer.valueOf(aVar.f184373b));
        }
        String str = pd1.a.PREGNANCY.f137376a;
        Integer numValueOf = Integer.valueOf(userProfilePk);
        List listC = w.c(Integer.valueOf(new DateTime().withTime(8, 0, 0, 0).getMinuteOfDay()));
        String strK = bm.m.k(requireContext(), R.string.pregnancy_take_prenatal_vitamins);
        Boolean bool = Boolean.FALSE;
        return new c(str, x.k(new pd1.b(null, numValueOf, "PREGNANCY", "WEEKLY", arrayList, listC, strK, bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(10, 0, 0, 0).getMinuteOfDay())), bm.m.k(requireContext(), R.string.pregnancy_drink_more_water), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(20, 0, 0, 0).getMinuteOfDay())), bm.m.k(requireContext(), R.string.pregnancy_practice_kegels), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(18, 0, 0, 0).getMinuteOfDay())), bm.m.k(requireContext(), R.string.pregnancy_log_symptoms), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(10, 0, 0, 0).getMinuteOfDay())), bm.m.k(requireContext(), R.string.pregnancy_record_baby_movement), bool, dateTimeNow, dateTimeNow), new pd1.b(null, Integer.valueOf(userProfilePk), "PREGNANCY", "WEEKLY", arrayList, w.c(Integer.valueOf(new DateTime().withTime(12, 0, 0, 0).getMinuteOfDay())), bm.m.k(requireContext(), R.string.pregnancy_log_blood_glucose), bool, dateTimeNow, dateTimeNow)), null, 4, null);
    }

    @Override // jd1.f
    public final String y6() {
        String string = getString(R.string.pregnancy_edit_reminder);
        string.getClass();
        return string;
    }

    @Override // jd1.f
    public final String z6() {
        String string = getString(R.string.mct_reminders);
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/reminders/list/a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0772a {
        public /* synthetic */ C0772a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0772a() {
        }
    }
}

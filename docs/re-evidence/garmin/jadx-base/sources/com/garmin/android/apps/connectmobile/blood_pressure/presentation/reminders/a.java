package com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import java.util.List;
import jd1.f;
import o13.p;
import og2.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ro0.l;
import xg0.v;
import xm0.h;
import xp0.d;
import xw.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/a;", "Ljd1/f;", "<init>", "()V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0494a f30928x = new C0494a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xw.a f30929r = new xw.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView f30930t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f30931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f30932w;

    @Override // jd1.f
    public final long C6() {
        return 8L;
    }

    @Override // jd1.f
    public final pd1.a F6() {
        return pd1.a.BLOOD_PRESSURE;
    }

    @Override // jd1.f
    public final int G6() {
        return R.layout.blood_pressure_reminder_list_item;
    }

    @Override // jd1.f
    public final void J6(View view2) {
        View viewFindViewById = view2.findViewById(R.id.ll_no_data_container);
        viewFindViewById.getClass();
        this.f30931v = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.reminders_limit);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(getString(R.string.msg_reminders_limit, 8L));
        View viewFindViewById3 = view2.findViewById(R.id.btn_add_reminder);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f30932w = button;
        button.setOnClickListener(new d(this, 4));
        View viewFindViewById4 = view2.findViewById(R.id.reminder_refresh_layout);
        viewFindViewById4.getClass();
        this.f98427g = (SwipeRefreshLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.reminders_rv);
        viewFindViewById5.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f30930t = recyclerView;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        int color = a7.b.getColor(contextRequireContext, R.color.gcm_surface_danger_action);
        Drawable drawable = a7.b.getDrawable(contextRequireContext, R.drawable.discard);
        if (drawable != null) {
            k.F(R.color.gcm_icon_on_color, contextRequireContext, drawable);
        }
        new s(new c(color, drawable, this)).e(recyclerView);
        m activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView2 = this.f30930t;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("remindersRecyclerView");
                throw null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(activity));
            RecyclerView recyclerView3 = this.f30930t;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("remindersRecyclerView");
                throw null;
            }
            recyclerView3.setAdapter(this.f98424d);
        }
        E6().setOnRefreshListener(new xw.b(this, 0));
        super.J6(view2);
    }

    @Override // jd1.f
    public final void M6() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.f.d(c22.f.f23050a, contextRequireContext, contextRequireContext.getString(R.string.pregnancy_reminder_limit_reached), contextRequireContext.getString(R.string.pregnancy_reminder_limit_reached_message, 8L), new p(contextRequireContext.getString(R.string.lbl_ok), new v(24)), null, null, false, 112).show();
    }

    @Override // jd1.f
    public final void S6(Context context, pd1.c cVar) {
        TextView textView;
        cVar.getClass();
        List<pd1.b> listF = cVar.f();
        if (listF == null || listF.isEmpty()) {
            Button button = this.f30932w;
            if (button == null) {
                p005kotlin.jvm.internal.s.m("addRemindersBtn");
                throw null;
            }
            button.setVisibility(0);
            LinearLayout linearLayout = this.f30931v;
            if (linearLayout == null) {
                p005kotlin.jvm.internal.s.m("noDataContainer");
                throw null;
            }
            linearLayout.setVisibility(0);
            E6().setVisibility(8);
            K6(false);
            d3 d3Var = this.f98428h;
            if (d3Var != null) {
                d3Var.updateActionBar(z6(), 2);
                return;
            }
            return;
        }
        Button button2 = this.f30932w;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("addRemindersBtn");
            throw null;
        }
        button2.setVisibility(8);
        LinearLayout linearLayout2 = this.f30931v;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("noDataContainer");
            throw null;
        }
        linearLayout2.setVisibility(8);
        E6().setVisibility(0);
        View view2 = getView();
        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.reminders_limit)) != null) {
            textView.setVisibility(0);
        }
        this.f30929r.o(context, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.blood_pressure_reminders, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (getActivity() == null) {
            return true;
        }
        HelpActivity.a.e(HelpActivity.f36653a, getActivity(), l.BLOOD_PRESSURE_REMINDERS, null, null, 12);
        return true;
    }

    @Override // jd1.f
    public final void u6(pd1.b bVar, Integer num) {
        bVar.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c22.f.d(c22.f.f23050a, contextRequireContext, "", contextRequireContext.getString(R.string.lbl_delete_reminder_question), new p(getString(R.string.lbl_ok), new h(8, this, bVar)), new p(getString(R.string.lbl_cancel), new h(9, this, num)), null, false, 96).show();
    }

    @Override // jd1.f
    public final void v6(Menu menu) {
        List<pd1.b> listF;
        menu.getClass();
        if (this.f98426f) {
            MenuInflater menuInflater = requireActivity().getMenuInflater();
            menuInflater.getClass();
            pd1.c cVarD = H6().C4().d();
            if (((cVarD == null || (listF = cVarD.f()) == null) ? 0 : listF.size()) == 0) {
                menuInflater.inflate(R.menu.menu_help, menu);
            } else {
                menu.add(0, R.id.menu_item_help, 0, R.string.lbl_help);
            }
        }
    }

    @Override // jd1.f
    public final String y6() {
        String string = getString(R.string.lbl_blood_pressure_reminders);
        string.getClass();
        return string;
    }

    @Override // jd1.f
    public final String z6() {
        String string = getString(R.string.lbl_blood_pressure_reminders);
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/a$a;", "", "<init>", "()V", "", "REMINDERS_LIMIT", "J", "", "MENU_ITEM_ITEM_HELP", "I", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0494a {
        public /* synthetic */ C0494a(j jVar) {
            this();
        }

        private C0494a() {
        }
    }
}

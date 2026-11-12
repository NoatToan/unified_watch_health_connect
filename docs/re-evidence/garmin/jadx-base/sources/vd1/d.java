package vd1;

import am.j;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lo.n;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p13.c0;
import p13.h0;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvd1/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends Fragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f177451k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f177453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vd1.b f177454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d3 f177455d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pd1.b f177458g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f177460i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f177452a = m.b(new vd1.c(0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f177456e = View.generateViewId();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f177457f = View.generateViewId();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f177459h = y6();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3316d f177461j = new C3316d();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((Integer) t7, (Integer) t14);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vd1/d$c", "Landroidx/core/view/s;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            int i14 = d.f177451k;
            d dVar = d.this;
            dVar.w6().debug("onCreateOptionsMenu: isEditing=[" + dVar.f177460i + "]");
            if (dVar.f177460i) {
                menuInflater.inflate(R.menu.menu_done, menu);
                menu.findItem(R.id.menu_item_done).setEnabled(true);
                return;
            }
            int i15 = dVar.f177456e;
            Context context = dVar.getContext();
            menu.add(0, i15, 1, context != null ? context.getString(R.string.pregnancy_add_time) : null);
            int i16 = dVar.f177457f;
            Context context2 = dVar.getContext();
            menu.add(0, i16, 2, context2 != null ? context2.getString(R.string.pregnancy_edit_time) : null);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            d dVar = d.this;
            if (itemId == dVar.f177456e) {
                dVar.w6().debug("onOptionsItemSelected: addTimeID pressed");
                dVar.v6();
                return true;
            }
            if (itemId == dVar.f177457f) {
                dVar.w6().debug("onOptionsItemSelected: editTimeID pressed");
                d.u6(dVar, true);
                d3 d3Var = dVar.f177455d;
                if (d3Var != null) {
                    Context context = dVar.getContext();
                    d3Var.updateActionBar(context != null ? context.getString(R.string.pregnancy_edit_time) : null, 1);
                }
                Button button = dVar.f177453b;
                if (button != null) {
                    button.setVisibility(8);
                    return true;
                }
                p005kotlin.jvm.internal.s.m("reminderTimesAddButton");
                throw null;
            }
            if (itemId != R.id.menu_item_done) {
                dVar.w6().debug("onOptionsItemSelected: not handling this event");
                return false;
            }
            dVar.w6().debug("onOptionsItemSelected: menu_item_done pressed");
            d.u6(dVar, false);
            d3 d3Var2 = dVar.f177455d;
            if (d3Var2 != null) {
                Context context2 = dVar.getContext();
                d3Var2.updateActionBar(context2 != null ? context2.getString(R.string.lbl_time) : null, 2);
            }
            Button button2 = dVar.f177453b;
            if (button2 != null) {
                button2.setVisibility(0);
                return true;
            }
            p005kotlin.jvm.internal.s.m("reminderTimesAddButton");
            throw null;
        }
    }

    /* JADX INFO: renamed from: vd1.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vd1/d$d", "Lvd1/a;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3316d implements vd1.a {

        /* JADX INFO: renamed from: vd1.d$d$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b((Integer) t7, (Integer) t14);
            }
        }

        public C3316d() {
        }

        @Override // vd1.a
        public final void a(Integer num) {
            d dVar = d.this;
            List<Integer> listH = dVar.A6().h();
            Set setF1 = listH != null ? h0.f1(listH) : new LinkedHashSet();
            setF1.remove(num);
            dVar.A6().s(h0.b1(setF1));
            dVar.z6().notifyDataSetChanged();
        }

        @Override // vd1.a
        public final void b(DateTime dateTime) {
            final List<Integer> listH;
            int i14 = d.f177451k;
            final d dVar = d.this;
            dVar.w6().debug("editReminderTime: ");
            final p0 p0Var = new p0();
            p0Var.f105807a = dateTime.getMinuteOfHour() + (dateTime.getHourOfDay() * 60);
            if (!dVar.f177460i || (listH = dVar.A6().h()) == null || listH.isEmpty()) {
                return;
            }
            dVar.w6().debug(j.g(dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), "input hour=[", "], input minute=[", "]"));
            Context context = dVar.getContext();
            TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: vd1.e
                @Override // android.app.TimePickerDialog.OnTimeSetListener
                public final void onTimeSet(TimePicker timePicker, int i15, int i16) {
                    int i17 = (i15 * 60) + i16;
                    Integer numValueOf = Integer.valueOf(i17);
                    List list = listH;
                    boolean zContains = list.contains(numValueOf);
                    d.C3316d c3316d = this;
                    if (zContains) {
                        d.this.E6();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    p0 p0Var2 = p0Var;
                    arrayList.remove(Integer.valueOf(p0Var2.f105807a));
                    arrayList.add(Integer.valueOf(i17));
                    if (arrayList.size() > 1) {
                        c0.u(arrayList, new d.C3316d.a());
                    }
                    c3316d.a(Integer.valueOf(p0Var2.f105807a));
                    d dVar2 = dVar;
                    dVar2.w6().debug("addReminderTime: new list size=[" + arrayList.size() + "]");
                    dVar2.A6().s(h0.b1(arrayList));
                    dVar2.z6().notifyDataSetChanged();
                }
            };
            int hourOfDay = dateTime.getHourOfDay();
            int minuteOfHour = dateTime.getMinuteOfHour();
            j0.f23099a.getClass();
            TimePickerDialog timePickerDialog = new TimePickerDialog(context, R.style.GCMTimePicker, onTimeSetListener, hourOfDay, minuteOfHour, j0.D());
            timePickerDialog.show();
            Context contextRequireContext = dVar.requireContext();
            contextRequireContext.getClass();
            og.a.W(timePickerDialog, contextRequireContext);
            Context contextRequireContext2 = dVar.requireContext();
            contextRequireContext2.getClass();
            og.a.w(timePickerDialog, contextRequireContext2);
        }
    }

    static {
        new a(null);
    }

    public static final void u6(d dVar, boolean z14) {
        dVar.f177460i = z14;
        dVar.w6().debug("isInEditingMode now == " + z14);
        vd1.b bVarZ6 = dVar.z6();
        g.y("updateIsEditing: ", z14, bVarZ6.f177448d);
        bVarZ6.f177449e = z14;
        bVarZ6.notifyDataSetChanged();
        dVar.requireActivity().invalidateOptionsMenu();
    }

    public final pd1.b A6() {
        pd1.b bVar = this.f177458g;
        if (bVar != null) {
            return bVar;
        }
        p005kotlin.jvm.internal.s.m("userReminderDTO");
        throw null;
    }

    public abstract void C6();

    public abstract void E6();

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        d3 d3Var;
        pd1.b bVar;
        pd1.b bVar2;
        Parcelable parcelable;
        context.getClass();
        super.onAttach(context);
        try {
            a7.e activity = getActivity();
            activity.getClass();
            d3Var = (d3) activity;
        } catch (Exception unused) {
            d3Var = null;
        }
        this.f177455d = d3Var;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("USER_REMINDER_BUNDLE_KET", pd1.b.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("USER_REMINDER_BUNDLE_KET");
                parcelable = (pd1.b) (parcelable2 instanceof pd1.b ? parcelable2 : null);
            }
            bVar2 = (pd1.b) parcelable;
            if (bVar2 == null) {
                bVar = new pd1.b(null, null, null, null, null, null, null, null, null, null, 1023, null);
            }
            this.f177458g = bVar2;
        }
        bVar = new pd1.b(null, null, null, null, null, null, null, null, null, null, 1023, null);
        bVar2 = bVar;
        this.f177458g = bVar2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d3 d3Var = this.f177455d;
        if (d3Var != null) {
            Context context = getContext();
            d3Var.updateActionBar(context != null ? context.getString(R.string.lbl_time) : null, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new c(), getViewLifecycleOwner(), b0.b.RESUMED);
    }

    public final void v6() {
        w6().debug("addReminderTime: ");
        List<Integer> listH = A6().h();
        if (listH == null) {
            w6().error("Reminder times are null");
            return;
        }
        if (listH.size() >= this.f177459h) {
            C6();
            return;
        }
        DateTime dateTimeNow = DateTime.now();
        w6().debug(j.g(dateTimeNow.getHourOfDay(), dateTimeNow.getMinuteOfHour(), "Current hour=[", "], current minute=[", "]"));
        Context context = getContext();
        n nVar = new n(2, listH, this);
        int hourOfDay = dateTimeNow.getHourOfDay();
        int minuteOfHour = dateTimeNow.getMinuteOfHour();
        j0.f23099a.getClass();
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, R.style.GCMTimePicker, nVar, hourOfDay, minuteOfHour, j0.D());
        timePickerDialog.show();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        og.a.W(timePickerDialog, contextRequireContext);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        og.a.w(timePickerDialog, contextRequireContext2);
    }

    public final Logger w6() {
        return (Logger) this.f177452a.getValue();
    }

    public abstract long y6();

    public final vd1.b z6() {
        vd1.b bVar = this.f177454c;
        if (bVar != null) {
            return bVar;
        }
        p005kotlin.jvm.internal.s.m("timesAdapter");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvd1/d$a;", "", "<init>", "()V", "", "USER_REMINDER_BUNDLE_KET", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

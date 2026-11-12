package com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import wd1.c;
import wv2.h;
import xg0.v;
import xp0.d;
import xw.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/b;", "Ltd1/b;", "<init>", "()V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends td1.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f30933m = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DateTime f30934j = DateTime.now();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f30935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f30936l;

    @Override // td1.b
    public final String C6() {
        EditText editText = this.f30936l;
        if (editText != null) {
            return editText.getText().toString();
        }
        s.m("messageEditText");
        throw null;
    }

    @Override // td1.b
    public final pd1.a F6() {
        return pd1.a.BLOOD_PRESSURE;
    }

    @Override // td1.b
    public final boolean G6(pd1.b bVar) {
        boolean z14;
        bVar.getClass();
        String reminderText = bVar.getReminderText();
        boolean z15 = reminderText == null || reminderText.length() != 0;
        if (z15) {
            List<Integer> listF = bVar.f();
            if (listF == null) {
                listF = j0.f134944a;
            }
            z14 = (listF.size() == 1 && listF.contains(0) && !s.g(E6().getOccurrence(), "DAILY")) ? false : true;
            if (!z14) {
                H6(R.string.lbl_no_days_selected, R.string.msg_select_days);
            }
        } else {
            H6(R.string.lbl_no_message_entered, R.string.msg_enter_message_for_reminder);
            z14 = false;
        }
        return z15 && z14;
    }

    public final void H6(int i14, int i15) {
        f fVar = f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        f.c(fVar, contextRequireContext, i14, i15, new p(getString(R.string.lbl_continue_editing), new v(25)), new p(getString(R.string.lbl_cancel), new v(26)), 96).show();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.blood_pressure_add_reminder_layout, viewGroup, false);
    }

    @Override // td1.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String strA;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.reminder_message_tv);
        viewFindViewById.getClass();
        this.f30936l = (EditText) viewFindViewById;
        TextView textView = (TextView) view2.findViewById(R.id.reminder_character_limit_tv);
        TextView textView2 = (TextView) view2.findViewById(R.id.reminder_time_tv);
        EditText editText = this.f30936l;
        if (editText == null) {
            s.m("messageEditText");
            throw null;
        }
        editText.setText(E6().getReminderText());
        p0 p0Var = new p0();
        EditText editText2 = this.f30936l;
        if (editText2 == null) {
            s.m("messageEditText");
            throw null;
        }
        int length = editText2.getText().length();
        p0Var.f105807a = length;
        textView.setText(getString(R.string.lbl_character_limit, String.valueOf(47 - length)));
        EditText editText3 = this.f30936l;
        if (editText3 == null) {
            s.m("messageEditText");
            throw null;
        }
        editText3.setOnFocusChangeListener(new c32.f(this, 16));
        EditText editText4 = this.f30936l;
        if (editText4 == null) {
            s.m("messageEditText");
            throw null;
        }
        editText4.setSingleLine();
        EditText editText5 = this.f30936l;
        if (editText5 == null) {
            s.m("messageEditText");
            throw null;
        }
        editText5.addTextChangedListener(new e(p0Var, this, textView));
        EditText editText6 = this.f30936l;
        if (editText6 == null) {
            s.m("messageEditText");
            throw null;
        }
        editText6.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(47)});
        List<Integer> listH = E6().h();
        if (listH == null || listH.isEmpty()) {
            strA = DateFormat.getTimeFormat(requireContext()).format(this.f30934j.toDate());
        } else {
            c.a aVar = c.f184378a;
            List<Integer> listH2 = E6().h();
            aVar.getClass();
            strA = c.a.a(listH2);
        }
        strA.getClass();
        textView2.setText(strA);
        textView2.setOnClickListener(new h(9, this, textView2));
        View viewFindViewById2 = view2.findViewById(R.id.btn_delete_reminder);
        viewFindViewById2.getClass();
        TextView textView3 = (TextView) viewFindViewById2;
        this.f30935k = textView3;
        textView3.setVisibility(this.f163887c ? 0 : 8);
        TextView textView4 = this.f30935k;
        if (textView4 == null) {
            s.m("deleteReminderButton");
            throw null;
        }
        textView4.setOnClickListener(new d(this, 5));
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.new_reminder_frequency_rv);
        this.f163888d = new td1.a(E6());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        td1.a aVar2 = this.f163888d;
        if (aVar2 != null) {
            recyclerView.setAdapter(aVar2);
        } else {
            s.m("daysOfWeekAdapter");
            throw null;
        }
    }

    @Override // td1.b
    public final int v6() {
        return R.menu.save_menu;
    }

    @Override // td1.b
    public final String w6() {
        String string = getString(R.string.lbl_add_reminder);
        string.getClass();
        return string;
    }

    @Override // td1.b
    public final String y6() {
        String string = getString(R.string.lbl_blood_pressure_take_reading);
        string.getClass();
        return string;
    }

    @Override // td1.b
    public final List<Integer> z6() {
        return w.c(Integer.valueOf((this.f30934j.getHourOfDay() * 60) + this.f30934j.getMinuteOfHour()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/reminders/b$a;", "", "<init>", "()V", "", "MAX_CHARACTER_COUNT", "I", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

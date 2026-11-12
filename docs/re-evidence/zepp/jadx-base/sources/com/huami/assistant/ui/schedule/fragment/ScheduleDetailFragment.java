package com.huami.assistant.ui.schedule.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.assistant.R;
import com.huami.assistant.arch.ScheduleRepeatViewModel;
import com.huami.assistant.arch.UpdatesViewModel;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.ui.schedule.activity.ScheduleEditActivity;
import com.huami.assistant.ui.schedule.viewmodel.ScheduleEditViewModel;
import com.huami.assistant.util.EventUtils;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.companion.ui.view.ActionbarLayout;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleDetailFragment extends Fragment {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private ScheduleEditViewModel g;
    private UpdatesViewModel h;
    private ScheduleRepeatViewModel i;
    private Update j;
    private long k;
    private ActionbarLayout l;

    private EventRecurrence f(String rrule, long startTime) {
        if (TextUtils.isEmpty(rrule)) {
            return null;
        }
        Time time = new Time();
        time.set(startTime);
        EventRecurrence eventRecurrence = new EventRecurrence();
        eventRecurrence.parse(rrule);
        eventRecurrence.setStartDate(time);
        return eventRecurrence;
    }

    private String g(String rrule, long startTime) {
        return EventUtils.getRepeatString(getActivity(), getResources(), f(rrule, startTime), true);
    }

    private int h(boolean isAllDay) {
        return isAllDay ? 20 : 149;
    }

    private void i() {
        long j = getArguments().getLong("UpdateId", -1L);
        if (j > -1) {
            this.j = UpdatesManager.getManager().get(j);
            long j2 = getArguments().getLong("startTime", 0L);
            this.k = j2;
            if (j2 > 0) {
                this.j.startTime = j2;
            }
        }
    }

    private void initView(View view) {
        j(view);
        this.a = (TextView) view.findViewById(R.id.et_schedule_title);
        this.b = (TextView) view.findViewById(R.id.reminder_desc);
        this.c = (TextView) view.findViewById(R.id.tv_schedule_start);
        this.d = (TextView) view.findViewById(R.id.tv_schedule_end);
        this.f = (TextView) view.findViewById(R.id.tv_schedule_reminder_type);
        this.e = (TextView) view.findViewById(R.id.tv_schedule_reminder_min);
        Event event = UpdateParser.toEvent(this.j.data);
        if (event != null) {
            this.g.setEvent(event);
            this.a.setText(event.title);
            this.b.setText(event.description);
            this.b.setVisibility(TextUtils.isEmpty(event.description) ? 8 : 0);
        }
    }

    private void j(View view) {
        ActionbarLayout actionbarLayout = (ActionbarLayout) view.findViewById(R.id.action_bar);
        this.l = actionbarLayout;
        actionbarLayout.setTitleText(getString(this.j == null ? R.string.add_schedule : R.string.edit_schedule));
        this.l.disableBackArrow();
        this.l.setBackText(getString(R.string.cancel));
        this.l.setBackTextClickListener(new View.OnClickListener() { // from class: ph6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.k(view2);
            }
        });
        this.l.setRightText(getString(R.string.edit));
        this.l.setRightTextClickListener(new View.OnClickListener() { // from class: qh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.l(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        ScheduleEditActivity.to(getActivity(), this.j, this.k);
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Event event) {
        if (event == null) {
            return;
        }
        long j = event.allDay ? event.endMillis - 86400000 : event.endMillis;
        this.c.setText(DateUtils.formatDateTime(getActivity(), event.startMillis, h(event.allDay)));
        this.d.setText(DateUtils.formatDateTime(getActivity(), j, h(event.allDay)));
        this.f.setText(g(event.rrule, event.startMillis));
        this.e.setText(EventUtils.formatReminderMinute(getActivity(), event.reminderMinutes, event.allDay ? event.startMillis : 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(EventRecurrence eventRecurrence) {
        this.g.setRrule(eventRecurrence == null ? "" : eventRecurrence.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Boolean bool) {
        this.l.setRightTextVisibility(bool.booleanValue() ? 0 : 8);
    }

    private void p() {
        this.g.getEvent().observe(getViewLifecycleOwner(), new Observer() { // from class: rh6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.m((Event) obj);
            }
        });
        this.i.eventRecu.observe(getActivity(), new Observer() { // from class: sh6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.n((EventRecurrence) obj);
            }
        });
        this.g.canEdit().observe(requireActivity(), new Observer() { // from class: th6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.o((Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        this.g = (ScheduleEditViewModel) ViewModelProviders.of(this).get(ScheduleEditViewModel.class);
        this.h = (UpdatesViewModel) ViewModelProviders.of(this).get(UpdatesViewModel.class);
        this.i = (ScheduleRepeatViewModel) ViewModelProviders.of(this).get(ScheduleRepeatViewModel.class);
        i();
        initView(view);
        p();
    }
}

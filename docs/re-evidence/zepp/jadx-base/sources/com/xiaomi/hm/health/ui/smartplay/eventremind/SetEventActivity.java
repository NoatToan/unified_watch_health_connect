package com.xiaomi.hm.health.ui.smartplay.eventremind;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.event.Event12HourUpdate;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.ui.smartplay.eventremind.SetEventActivity;
import de.greenrobot.event.EventBus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;
import rx.Observer;

/* JADX INFO: loaded from: classes22.dex */
public class SetEventActivity extends AppCompatActivity {
    public static final String EXTRA = "event";
    public static final int REMIND_CUSTOM = 5;
    public static final int REMIND_DAILY = 1;
    public static final int REMIND_MONTHLY = 3;
    public static final int REMIND_ONCE = 0;
    public static final int REMIND_WEEKLY = 2;
    public static final int REMIND_YEARLY = 4;
    private static final String s = "SetEventActivity";
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 42;
    private WheelView a;
    private WheelView b;
    private WheelView c;
    private WheelView d;
    private boolean e;
    private PickAdapter f;
    private EditText g;
    private TextView h;
    private TextView i;
    private RainbowTitleBar j;
    private String[] k;
    private Calendar o;
    private Reminder p;
    private int l = 0;
    private boolean[] m = new boolean[7];
    private String n = "";
    public boolean q = ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME);
    private final Lazy<DeviceUtilsApi> r = KoinJavaComponent.inject(DeviceUtilsApi.class);

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (EventRemindManager.isEmpty(editable)) {
                SetEventActivity.this.j.setMenuEnable(0, false);
                SetEventActivity.this.j.setMenuTint(R.color.p5);
            } else {
                SetEventActivity.this.j.setMenuEnable(0, true);
                SetEventActivity.this.j.setMenuTint(R.color.p4);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (EventRemindManager.isEmpty(charSequence)) {
                return;
            }
            SetEventActivity.this.j.setMenuEnable(0, true);
            SetEventActivity.this.j.setMenuTint(R.color.p4);
        }
    }

    public class b implements OnWheelScrollListener {
        public b() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            SetEventActivity.this.Q();
            SetEventActivity.this.P();
            SetEventActivity.this.N();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class c implements OnWheelScrollListener {
        public c() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            SetEventActivity.this.Q();
            SetEventActivity.this.P();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class d implements OnWheelScrollListener {
        public d() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            SetEventActivity.this.Q();
            SetEventActivity.this.P();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class e implements OnWheelScrollListener {
        public e() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            SetEventActivity.this.Q();
            SetEventActivity.this.P();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class f implements LoadingDialog.OnAnimEndListener {
        public final /* synthetic */ List a;

        public f(List list) {
            this.a = list;
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            EventBus.getDefault().post(new ReminderModifiedEvent(this.a));
            SetEventActivity.this.finish();
        }
    }

    public class g implements Observer<Boolean> {
        public final /* synthetic */ List a;

        public g(List list) {
            this.a = list;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            HMLog.i(SetEventActivity.s, "save for server: " + bool, new Object[0]);
            if (bool.booleanValue()) {
                return;
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((Reminder) it2.next()).setStatus(0);
            }
            HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(this.a);
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(LoadingDialog loadingDialog, List list, boolean z) {
        HMLog.i(s, "save for device result: " + z, new Object[0]);
        if (!z) {
            loadingDialog.dismiss();
            IconToast.showError(DeviceXFunctionsKt.getContext(), getString(R.string.event_remind_save_fail));
        } else {
            HMDaoManager.getInstance().getReminderDao().insertOrReplaceInTx(list);
            EventBus.getDefault().post(new ReminderChangedEvent(2));
            loadingDialog.setSuccess(getString(R.string.event_remind_saved), new f(list));
            EventRemindAPI.uploadReminder(list).compose(RxUtil.ioToMain()).subscribe(new g(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(DialogInterface dialogInterface, int i) {
        Analytics.event(this, com.xiaomi.hm.health.ui.smartplay.eventremind.a.h, "Cancle2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(DialogInterface dialogInterface, int i) {
        Analytics.event(this, com.xiaomi.hm.health.ui.smartplay.eventremind.a.h, "Confirm");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(boolean[] zArr, DialogInterface dialogInterface, int i, boolean z) {
        zArr[i] = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(boolean[] zArr, DialogInterface dialogInterface, int i) {
        this.m = zArr;
        int i2 = 0;
        for (boolean z : zArr) {
            if (z) {
                i2++;
            }
        }
        if (i2 == 7) {
            this.l = 1;
        } else if (i2 == 0) {
            this.l = 0;
            N();
        } else if (i2 == 1) {
            this.l = 2;
            p();
        } else {
            this.l = 5;
        }
        P();
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(DialogInterface dialogInterface, int i) {
        if (i != 5) {
            this.l = i;
        }
        P();
        Q();
        if (i == 5) {
            K();
        }
    }

    private boolean H() {
        if (this.p == null) {
            return this.l != 0;
        }
        return !TextUtils.equals(EventRemindManager.p(this.l, this.m, this.o), this.p.getLoop());
    }

    private void I() {
        boolean z;
        Analytics.event(this, com.xiaomi.hm.health.ui.smartplay.eventremind.a.h, "Save");
        if (this.l == 0 && !t().after(Calendar.getInstance())) {
            IconToast.showError(this, R.string.event_remind_time_before);
            return;
        }
        Reminder reminder = this.p;
        int enableIndex = (reminder == null || EventRemindManager.w(reminder)) ? EventRemindManager.getInstance().getEnableIndex() : this.p.getEventId().intValue();
        if (enableIndex == -1) {
            IconToast.showError(this, R.string.event_remind_full);
            HMLog.i(s, "cannot modify event as no available id.", new Object[0]);
            return;
        }
        EventRemindManager.getInstance();
        String str = EventRemindManager.getDateFormat().format(t().getTime());
        String string = this.g.getText().toString();
        String strP = EventRemindManager.p(this.l, this.m, t());
        Reminder reminder2 = this.p;
        if (reminder2 != null && TextUtils.equals(reminder2.getStartDate(), str) && TextUtils.equals(this.p.getBody(), string) && TextUtils.equals(this.p.getLoop(), strP)) {
            HMLog.i(s, "reminder not change.", new Object[0]);
            finish();
            return;
        }
        final LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.event_remind_saving));
        loadingDialogShowDialog.setCancelable(false);
        final ArrayList arrayList = new ArrayList();
        Reminder reminder3 = new Reminder();
        Reminder reminder4 = this.p;
        reminder3.setTime(Long.valueOf(reminder4 != null ? reminder4.getTime().longValue() : System.currentTimeMillis()));
        reminder3.setOp(1);
        reminder3.setStartDate(str);
        reminder3.setStopDate(null);
        reminder3.setFr(0);
        reminder3.setTitle("");
        reminder3.setLoop(strP);
        reminder3.setEventId(Integer.valueOf(enableIndex));
        reminder3.setBody(string);
        reminder3.setStatus(-1);
        reminder3.setIconId(-1);
        arrayList.add(reminder3);
        if (this.l == 5) {
            int iQ = EventRemindManager.getInstance().q(enableIndex);
            if (iQ != -1) {
                int iF = EventRemindManager.f(t().get(7));
                int i = 0;
                while (true) {
                    if (i >= 7) {
                        z = true;
                        break;
                    } else {
                        if (this.m[i] && iF == i + 1) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
                if (z) {
                    Reminder reminder5 = new Reminder();
                    reminder5.setTime(Long.valueOf(System.currentTimeMillis() + 1));
                    reminder5.setOp(1);
                    EventRemindManager.getInstance();
                    reminder5.setStartDate(EventRemindManager.getDateFormat().format(t().getTime()));
                    reminder5.setStopDate(null);
                    reminder5.setFr(0);
                    reminder5.setTitle("");
                    reminder5.setLoop("10");
                    reminder5.setEventId(Integer.valueOf(iQ));
                    reminder5.setBody(this.g.getText().toString());
                    reminder5.setStatus(-1);
                    reminder5.setIconId(-1);
                    arrayList.add(reminder5);
                }
            } else {
                HMLog.i(s, "cannot create once event as no available id.", new Object[0]);
            }
        }
        HMLog.i(s, "save reminder: " + this.r.getValue().getGson().toJson(EventRemindManager.g(arrayList)), new Object[0]);
        EventRemindManager.saveEvent2Device(arrayList, new EventRemindManager.CallBack() { // from class: mp6
            @Override // com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager.CallBack
            public final void onFinish(boolean z2) {
                this.a.B(loadingDialogShowDialog, arrayList, z2);
            }
        });
    }

    private void J() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.cancel_save_tips).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: gp6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.C(dialogInterface, i);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: fp6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.D(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void K() {
        AlertDialogFragment.ChoiceItems itemsChecked = new AlertDialogFragment.ChoiceItems().setItemsEnable(new boolean[]{true, true, true, true, true, true, true}).setItemsChecked(this.m);
        int i = R.array.weeks;
        AlertDialogFragment.ChoiceItems items = itemsChecked.setItems(i);
        items.setItemsSummary(i);
        final boolean[] zArr = (boolean[]) this.m.clone();
        new AlertDialogFragment.Builder(this).setTitle(R.string.event_remind_custom).setMultiChoiceItems(items, new DialogInterface.OnMultiChoiceClickListener() { // from class: ip6
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                SetEventActivity.E(zArr, dialogInterface, i2, z);
            }
        }).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: hp6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.F(zArr, dialogInterface, i2);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager());
    }

    private void L() {
        AlertDialogFragment.ChoiceItems itemChoice = new AlertDialogFragment.ChoiceItems().setItems(R.array.event_remind_periods).setItemChoice(this.l);
        if (this.l == 5) {
            itemChoice.setItemsTips(5, q());
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.event_remind_period).setSingleChoiceItems(itemChoice, new DialogInterface.OnClickListener() { // from class: ep6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.G(dialogInterface, i);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    private void M(int i) {
        WheelView wheelView = this.b;
        if (wheelView == null || this.e) {
            return;
        }
        wheelView.setCurrentItem(i >= 12 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.l != 5) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, this.a.getCurrentItem() - 10000000);
            boolean[] zArr = new boolean[7];
            this.m = zArr;
            zArr[EventRemindManager.f(calendar.get(7)) - 1] = true;
        }
    }

    private void O(int i) {
        if (this.e) {
            return;
        }
        int currentItem = this.c.getCurrentItem();
        if (i == 0) {
            if (currentItem >= 12) {
                currentItem -= 12;
            }
        } else if (currentItem < 12) {
            currentItem += 12;
        }
        this.c.setCurrentItemLooped(currentItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        String strQ;
        int i = this.l;
        if (i == 0 || i == 1) {
            strQ = this.k[i];
        } else if (i == 2) {
            strQ = getResources().getStringArray(R.array.event_remind_weeks)[EventRemindManager.f(t().get(7)) - 1];
        } else if (i == 3) {
            strQ = getString(R.string.event_remind_every_month) + getString(R.string.event_remind_day_of_month, new Object[]{Integer.valueOf(t().get(5))});
        } else if (i == 4) {
            strQ = getString(R.string.event_remind_every_year) + TimeUtils.formatDate_no_y((Context) DeviceXFunctionsKt.getContext(), t().getTime(), false);
        } else {
            strQ = i == 5 ? q() : null;
        }
        this.i.setText(strQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        boolean z;
        Calendar calendarT = t();
        if (this.l == 0 && !calendarT.after(Calendar.getInstance())) {
            this.h.setText(R.string.event_remind_time_before);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Reminder reminder = new Reminder();
        EventRemindManager.getInstance();
        reminder.setStartDate(EventRemindManager.getDateFormat().format(calendarT.getTime()));
        reminder.setLoop(EventRemindManager.p(this.l, this.m, t()));
        if (this.l == 5) {
            int iF = EventRemindManager.f(t().get(7));
            int i = 0;
            while (true) {
                if (i >= 7) {
                    z = true;
                    break;
                } else {
                    if (this.m[i] && iF == i + 1) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            Calendar calendarT2 = t();
            calendarT2.set(13, 0);
            calendarT2.set(14, 0);
            Calendar calendar = Calendar.getInstance();
            calendar.set(13, 0);
            calendar.set(14, 0);
            if (z && !calendarT2.before(calendar)) {
                reminder.setLoop(EventRemindManager.p(0, null, null));
            }
        }
        arrayList.add(new ComparableReminder(reminder));
        EventRemindManager.getInstance().categorizeReminders(arrayList);
        this.h.setText(getString(R.string.event_remind_time, new Object[]{TimeUtils.formatDateTime_y(this, ((ComparableReminder) arrayList.get(0)).b().getTime())}));
    }

    private void initViews() {
        this.k = getResources().getStringArray(R.array.event_remind_periods);
        findViewById(R.id.period_container).setOnClickListener(new View.OnClickListener() { // from class: jp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A(view);
            }
        });
        EditText editText = (EditText) findViewById(R.id.remind_title_edit);
        this.g = editText;
        if (this.q) {
            editText.setHint(R.string.input_schedule_title);
        }
        this.g.setText(this.n);
        if (TextUtils.isEmpty(this.g.getText())) {
            this.j.setMenuEnable(0, false);
            this.j.setMenuTint(R.color.p5);
        } else {
            this.j.setMenuEnable(0, true);
            this.j.setMenuTint(R.color.p4);
        }
        this.g.addTextChangedListener(new a());
        this.h = (TextView) findViewById(R.id.time_tv);
        this.i = (TextView) findViewById(R.id.period_tv);
    }

    private void p() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 7) {
                i = 0;
                break;
            } else {
                if (this.m[i3]) {
                    i = i3 + 1;
                    break;
                }
                i3++;
            }
        }
        Calendar calendarT = t();
        while (EventRemindManager.f(calendarT.get(7)) != i) {
            calendarT.add(7, 1);
            i2++;
        }
        WheelView wheelView = this.a;
        wheelView.setCurrentItemLooped(wheelView.getCurrentItem() + i2);
    }

    private String q() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 7; i3++) {
            if (this.m[i3]) {
                i++;
                i2 = i3;
            }
        }
        if (i == 1) {
            return getString(R.string.event_remind_every_week) + getResources().getStringArray(R.array.weeks_short)[i2];
        }
        String[] stringArray = Language.isChinese() ? getResources().getStringArray(R.array.weeks) : getResources().getStringArray(R.array.weeks_short);
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 7; i4++) {
            if (this.m[i4]) {
                sb.append(stringArray[i4]);
                sb.append(" ");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    private int r() {
        return this.o.get(11);
    }

    private int s() {
        return this.o.get(12);
    }

    private Calendar t() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, this.a.getCurrentItem() - 10000000);
        calendar.set(11, this.c.getCurrentItem());
        calendar.set(12, this.d.getCurrentItem());
        return calendar;
    }

    private void u() {
        Calendar calendar = Calendar.getInstance();
        this.o = calendar;
        calendar.add(12, 1);
        Reminder reminder = (Reminder) getIntent().getSerializableExtra("event");
        this.p = reminder;
        if (reminder == null) {
            return;
        }
        HMLog.i(s, "event time: " + this.p.getTime(), new Object[0]);
        this.n = this.p.getBody();
        String loop = this.p.getLoop();
        loop.hashCode();
        switch (loop) {
            case "0":
                this.l = 1;
                break;
            case "8":
                this.l = 3;
                break;
            case "9":
                this.l = 4;
                break;
            case "10":
                this.l = 0;
                break;
            default:
                boolean[] zArrI = EventRemindManager.i(this.p.getLoop().split(","));
                this.m = zArrI;
                int i = 0;
                for (boolean z : zArrI) {
                    if (z) {
                        i++;
                    }
                }
                HMLog.i(s, "enable count: " + i, new Object[0]);
                if (i == 1) {
                    this.l = 2;
                    break;
                } else {
                    this.l = 5;
                    break;
                }
                break;
        }
        try {
            this.o.setTime(EventRemindManager.getDateFormat().parse(this.p.getStartDate()));
        } catch (Exception e2) {
            HMLog.i(s, "parse start date exception: " + e2.getMessage(), new Object[0]);
        }
    }

    private void updateUI() {
        this.d.setCurrentItemLooped(s());
        this.c.setCurrentItemLooped(r());
        boolean zIs24HourFormat = DateFormat.is24HourFormat(this);
        this.e = zIs24HourFormat;
        if (zIs24HourFormat) {
            this.b.setVisibility(8);
            findViewById(R.id.divider_1).setVisibility(8);
            this.f.setMode(9);
            this.c.setViewAdapter(this.f);
            this.c.setCurrentItemLooped(r());
        } else {
            this.b.setVisibility(0);
            findViewById(R.id.divider_1).setVisibility(0);
            this.f.setMode(16);
            this.c.setViewAdapter(this.f);
            if (r() >= 12) {
                this.b.setCurrentItem(1);
            } else {
                this.b.setCurrentItem(0);
            }
        }
        Q();
    }

    private void v() {
        this.j = (RainbowTitleBar) findViewById(R.id.rainbowTitleBar);
        this.j.setTitle(getString(this.q ? R.string.add_schedule : R.string.event_remind_add_event));
        this.j.setNavigationOnClickListener(new View.OnClickListener() { // from class: kp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y(view);
            }
        });
        this.j.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: lp6
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                this.a.z(view, i);
            }
        });
    }

    private void w() {
        this.a = (WheelView) findViewById(R.id.date_wheel);
        this.b = (WheelView) findViewById(R.id.ap_pm_wheel);
        this.c = (WheelView) findViewById(R.id.hour_wheel);
        this.d = (WheelView) findViewById(R.id.minute_wheel);
        WheelView wheelView = this.a;
        int i = R.color.p4;
        int color = ContextCompat.getColor(this, i);
        int i2 = R.color.s1;
        int color2 = ContextCompat.getColor(this, i2);
        int i3 = R.color.s2;
        PickAdapter pickAdapter = new PickAdapter(this, 0, Integer.MAX_VALUE, wheelView, color, color2, ContextCompat.getColor(this, i3), true, 42, 15, 12, 11, 1, 3);
        pickAdapter.setMode(24);
        WheelView visibleItems = this.a.setVisibleItems(5);
        int i4 = R.drawable.shape_wheel_view_center;
        visibleItems.setCenterDrawable(i4).setCenterStyle("", i, 8, 10.0f, -1.0f).setViewAdapter(pickAdapter).setCenterBgColor(-1);
        this.a.addScrollingListener(new b());
        this.a.setCurrentItemLooped(TimeUtils.getDeltaDayCount(Calendar.getInstance(), this.o) + 10000000);
        PickAdapter pickAdapter2 = new PickAdapter(this, 0, 1, this.b, ContextCompat.getColor(this, i), ContextCompat.getColor(this, i2), -2003199591, false, 42, 14, 10, 21, 1);
        pickAdapter2.setMode(17);
        this.b.setVisibleItems(2).setCenterDrawable(i4).setCenterStyle("", 18.0f).setViewAdapter(pickAdapter2).setCenterBgColor(-1);
        this.b.addScrollingListener(new c());
        this.f = new PickAdapter(this, 0, 23, this.c, ContextCompat.getColor(this, i), ContextCompat.getColor(this, i2), ContextCompat.getColor(this, i3), true, 42, 15, 12, 11, 1, 3);
        this.c.setVisibleItems(5).setCenterDrawable(i4).setCenterStyle(getResources().getString(R.string.unit_hour), i, 8, 10.0f, -1.0f).setViewAdapter(this.f).setCenterBgColor(-1);
        this.c.addScrollingListener(new d());
        this.d.setVisibleItems(5).setCenterDrawable(i4).setCenterStyle(getResources().getString(R.string.unit_min), i, 8, 10.0f, -1.0f).setViewAdapter(new PickAdapter(this, 0, 59, this.d, ContextCompat.getColor(this, i), ContextCompat.getColor(this, i2), ContextCompat.getColor(this, i3), true, 42, 15, 12, 11, 1, 3)).setCenterBgColor(-1);
        this.d.addScrollingListener(new e());
    }

    private boolean x() {
        if (!this.g.getText().toString().equals(this.n) || H()) {
            return true;
        }
        EventRemindManager.getInstance();
        SimpleDateFormat dateFormat = EventRemindManager.getDateFormat();
        return !dateFormat.format(this.o.getTime()).equals(dateFormat.format(t().getTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        if (x()) {
            J();
        } else {
            Analytics.event(this, com.xiaomi.hm.health.ui.smartplay.eventremind.a.h, "Cancle1");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view, int i) {
        if (i == 0) {
            I();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_event);
        v();
        u();
        initViews();
        w();
        updateUI();
        N();
        P();
        Analytics.event(this, com.xiaomi.hm.health.ui.smartplay.eventremind.a.g);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEvent(EventAmPmUpdate eventAmPmUpdate) {
        O(eventAmPmUpdate.getAmPm());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (x()) {
                J();
                return true;
            }
            Analytics.event(this, com.xiaomi.hm.health.ui.smartplay.eventremind.a.h, "Cancle1");
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onEvent(Event12HourUpdate event12HourUpdate) {
        M(event12HourUpdate.getHour());
    }
}

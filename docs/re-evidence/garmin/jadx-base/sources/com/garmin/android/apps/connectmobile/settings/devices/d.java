package com.garmin.android.apps.connectmobile.settings.devices;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import c22.j0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import g62.d0;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\t\n\u000bB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/d;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/devices/model/i;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/settings/devices/d$b;", "mListener", "<init>", "(Landroid/app/Activity;Lcom/garmin/android/apps/connectmobile/settings/devices/d$b;)V", "b", "c", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ArrayAdapter<i> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f42886f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f42887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f42888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<i> f42891e;

    public interface b {
        void C7(int i14, i iVar);

        void Y6(int i14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/d$c;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GCMComplexTwoLineButton f42892a;
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, b bVar) {
        super(activity, R.layout.simple_list_item_2);
        activity.getClass();
        this.f42887a = bVar;
        Object systemService = activity.getSystemService("layout_inflater");
        systemService.getClass();
        this.f42888b = (LayoutInflater) systemService;
        this.f42891e = new ArrayList(0);
    }

    public final void a(int i14) {
        if (i14 < 0 || i14 >= this.f42891e.size()) {
            return;
        }
        this.f42891e.remove(i14);
        d(this.f42891e);
        this.f42890d = true;
    }

    public final void c(ArrayList arrayList, boolean z14) {
        int size = arrayList.size();
        if (size == 2 && arrayList.contains(com.garmin.android.apps.connectmobile.devices.model.a.SATURDAY.f34086a) && arrayList.contains(com.garmin.android.apps.connectmobile.devices.model.a.SUNDAY.f34086a)) {
            arrayList.clear();
            arrayList.add(getContext().getString(com.garmin.android.apps.connectmobile.devices.model.b.WEEKENDS.f34102a));
            return;
        }
        if (size == 5 && !arrayList.contains(com.garmin.android.apps.connectmobile.devices.model.a.SATURDAY.f34086a) && !arrayList.contains(com.garmin.android.apps.connectmobile.devices.model.a.SUNDAY.f34086a)) {
            arrayList.clear();
            arrayList.add(getContext().getString(com.garmin.android.apps.connectmobile.devices.model.b.WEEKDAYS.f34102a));
            return;
        }
        if (size == 7) {
            arrayList.clear();
            arrayList.add(getContext().getString(com.garmin.android.apps.connectmobile.devices.model.b.DAILY.f34102a));
            return;
        }
        if (size == 1) {
            String str = (String) arrayList.get(0);
            arrayList.clear();
            Context context = getContext();
            com.garmin.android.apps.connectmobile.devices.model.a.f34075c.getClass();
            arrayList.add(context.getString(com.garmin.android.apps.connectmobile.devices.model.a.C0576a.a(str).f34087b));
            return;
        }
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.getDefault());
        String[] weekdays = z14 ? dateFormatSymbols.getWeekdays() : dateFormatSymbols.getShortWeekdays();
        com.garmin.android.apps.connectmobile.devices.model.a aVar = com.garmin.android.apps.connectmobile.devices.model.a.MONDAY;
        if (arrayList.contains(aVar.f34086a)) {
            arrayList.remove(aVar.f34086a);
            arrayList.add(weekdays[2]);
        }
        com.garmin.android.apps.connectmobile.devices.model.a aVar2 = com.garmin.android.apps.connectmobile.devices.model.a.TUESDAY;
        if (arrayList.contains(aVar2.f34086a)) {
            arrayList.remove(aVar2.f34086a);
            arrayList.add(weekdays[3]);
        }
        com.garmin.android.apps.connectmobile.devices.model.a aVar3 = com.garmin.android.apps.connectmobile.devices.model.a.WEDNESDAY;
        if (arrayList.contains(aVar3.f34086a)) {
            arrayList.remove(aVar3.f34086a);
            arrayList.add(weekdays[4]);
        }
        com.garmin.android.apps.connectmobile.devices.model.a aVar4 = com.garmin.android.apps.connectmobile.devices.model.a.THURSDAY;
        if (arrayList.contains(aVar4.f34086a)) {
            arrayList.remove(aVar4.f34086a);
            arrayList.add(weekdays[5]);
        }
        com.garmin.android.apps.connectmobile.devices.model.a aVar5 = com.garmin.android.apps.connectmobile.devices.model.a.FRIDAY;
        if (arrayList.contains(aVar5.f34086a)) {
            arrayList.remove(aVar5.f34086a);
            arrayList.add(weekdays[6]);
        }
        com.garmin.android.apps.connectmobile.devices.model.a aVar6 = com.garmin.android.apps.connectmobile.devices.model.a.SATURDAY;
        if (arrayList.contains(aVar6.f34086a)) {
            arrayList.remove(aVar6.f34086a);
            arrayList.add(weekdays[7]);
        }
        com.garmin.android.apps.connectmobile.devices.model.a aVar7 = com.garmin.android.apps.connectmobile.devices.model.a.SUNDAY;
        if (arrayList.contains(aVar7.f34086a)) {
            arrayList.remove(aVar7.f34086a);
            arrayList.add(weekdays[1]);
        }
    }

    public final void d(List<i> list) {
        list.getClass();
        clear();
        addAll(list);
        this.f42891e = list;
    }

    public final void e(int i14, i iVar) {
        if (i14 < 0 || i14 >= getCount()) {
            return;
        }
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2.SETTINGS, "DeviceAlarmListAdapter", "updateDeviceAlarm " + i14);
        i iVar2 = this.f42891e.get(i14);
        iVar2.f34182b = iVar.f34182b;
        iVar2.f34181a = iVar.f34181a;
        iVar2.f34183c = iVar.f34183c;
        iVar2.f34184d = iVar.f34184d;
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVar;
        viewGroup.getClass();
        if (view2 == null) {
            view2 = this.f42888b.inflate(com.garmin.android.apps.connectmobile.R.layout.gcm3_alarm_settings_row, viewGroup, false);
            cVar = new c();
            View viewFindViewById = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.alarm_setting_row);
            viewFindViewById.getClass();
            GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById;
            cVar.f42892a = gCMComplexTwoLineButton;
            gCMComplexTwoLineButton.f(true);
            view2.setTag(cVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            cVar = (c) tag;
        }
        i item = getItem(i14);
        l3.a aVar = l3.f23124b;
        item.getClass();
        int i15 = item.f34182b;
        aVar.getClass();
        String strD1 = l3.a.d1(i15);
        if (this.f42889c) {
            strD1 = j0.u(item.f34182b);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = cVar.f42892a;
        gCMComplexTwoLineButton2.getClass();
        gCMComplexTwoLineButton2.setButtonTopLabel(strD1);
        ArrayList arrayList = new ArrayList(item.f34183c);
        ArrayList arrayList2 = new ArrayList(item.f34183c);
        c(arrayList, false);
        c(arrayList2, true);
        String strJoin = TextUtils.join(", ", arrayList);
        String strJoin2 = TextUtils.join(", ", arrayList2);
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = cVar.f42892a;
        gCMComplexTwoLineButton3.getClass();
        gCMComplexTwoLineButton3.b(strJoin, strJoin2);
        com.garmin.android.apps.connectmobile.devices.model.c.a aVar2 = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
        String str = item.f34181a;
        aVar2.getClass();
        boolean z14 = com.garmin.android.apps.connectmobile.devices.model.c.a.a(str) != com.garmin.android.apps.connectmobile.devices.model.c.OFF;
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = cVar.f42892a;
        gCMComplexTwoLineButton4.getClass();
        gCMComplexTwoLineButton4.g(z14);
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = cVar.f42892a;
        if (z14) {
            gCMComplexTwoLineButton5.getClass();
            gCMComplexTwoLineButton5.setButtonTopLabelTextColor(com.garmin.android.apps.connectmobile.R.color.gcm_text_primary);
            GCMComplexTwoLineButton gCMComplexTwoLineButton6 = cVar.f42892a;
            gCMComplexTwoLineButton6.getClass();
            gCMComplexTwoLineButton6.setButtonBottomLeftLabelTextColor(com.garmin.android.apps.connectmobile.R.color.gcm_text_primary);
        } else {
            gCMComplexTwoLineButton5.getClass();
            gCMComplexTwoLineButton5.setButtonTopLabelTextColor(com.garmin.android.apps.connectmobile.R.color.gcm_text_primary_disabled);
            GCMComplexTwoLineButton gCMComplexTwoLineButton7 = cVar.f42892a;
            gCMComplexTwoLineButton7.getClass();
            gCMComplexTwoLineButton7.setButtonBottomLeftLabelTextColor(com.garmin.android.apps.connectmobile.R.color.gcm_text_primary_disabled);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = cVar.f42892a;
        gCMComplexTwoLineButton8.getClass();
        gCMComplexTwoLineButton8.setOnCheckedChangeListener(new lg1.c(item, 1, this, cVar));
        view2.setOnClickListener(new d0(this, i14, item, 5));
        view2.setOnLongClickListener(new jr2.a(this, i14, 1));
        return view2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

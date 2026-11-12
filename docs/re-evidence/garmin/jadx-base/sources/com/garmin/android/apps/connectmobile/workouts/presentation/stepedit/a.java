package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p13.p0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0010\u0011B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/a;", "Landroidx/appcompat/app/e;", "Landroid/widget/NumberPicker$OnValueChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "ftp", "", "selTargetValueOne", "selTargetValueTwo", "Lm52/h;", "selTargetValueUnit", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;IDDLm52/h;Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/a$a;)V", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"InflateParams"})
public final class a extends androidx.appcompat.app.e implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f49605m = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f49607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f49608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m52.h f49609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0979a f49610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f49613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f49614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f49615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RadioGroup f49616l;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a$a, reason: collision with other inner class name */
    public interface InterfaceC0979a {
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/a$b;", "", "Landroid/view/View;", "rootView", "", "selTargetValueOne", "selTargetValueTwo", "", "", "displayValues", "minValue", "maxValue", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/a;Landroid/view/View;II[Ljava/lang/String;II)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f49617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NumberPicker f49618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NumberPicker f49619c;

        public b(a aVar, View view2, int i14, int i15, String[] strArr, int i16, int i17) {
            view2.getClass();
            strArr.getClass();
            this.f49617a = view2;
            NumberPicker numberPicker = (NumberPicker) view2.findViewById(R.id.target_value_one_picker);
            this.f49618b = numberPicker;
            NumberPicker numberPicker2 = (NumberPicker) view2.findViewById(R.id.target_value_two_picker);
            this.f49619c = numberPicker2;
            numberPicker.setWrapSelectorWheel(true);
            numberPicker.setMinValue(i16);
            numberPicker.setMaxValue(i17);
            numberPicker.setValue(i14);
            numberPicker.setDisplayedValues(strArr);
            numberPicker.setOnValueChangedListener(aVar);
            numberPicker2.setWrapSelectorWheel(true);
            numberPicker2.setMinValue(i16);
            numberPicker2.setMaxValue(i17);
            numberPicker2.setValue(i15);
            numberPicker2.setDisplayedValues(strArr);
            numberPicker2.setOnValueChangedListener(aVar);
            try {
                Field declaredField = NumberPicker.class.getDeclaredField("mInputText");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(numberPicker);
                obj.getClass();
                ((EditText) obj).setFilters(new InputFilter[0]);
                Object obj2 = declaredField.get(numberPicker2);
                obj2.getClass();
                ((EditText) obj2).setFilters(new InputFilter[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i14, double d14, double d15, m52.h hVar, InterfaceC0979a interfaceC0979a) {
        int iP;
        int i15;
        int iO;
        int i16;
        super(context, R.style.CustomPowerTargetDialogStyle);
        context.getClass();
        interfaceC0979a.getClass();
        this.f49606b = i14;
        this.f49607c = d14;
        this.f49608d = d15;
        this.f49609e = hVar;
        this.f49610f = interfaceC0979a;
        this.f49611g = 1;
        this.f49612h = 1000;
        this.f49613i = 1.0d;
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.gcm4_custom_power_step_target_dialog_view, (ViewGroup) null);
        i(viewInflate);
        m52.h hVar2 = this.f49609e;
        m52.h hVar3 = m52.h.PERCENT;
        double d16 = this.f49607c;
        if (hVar2 == hVar3) {
            int iO2 = gl1.d.o(d16, i14);
            iO = gl1.d.o(this.f49608d, i14);
            i15 = iO2;
            i16 = (int) this.f49607c;
            iP = (int) this.f49608d;
        } else {
            int i17 = (int) d16;
            int i18 = (int) this.f49608d;
            int iP2 = gl1.d.p(d16, i14);
            iP = gl1.d.p(this.f49608d, i14);
            i15 = i17;
            iO = i18;
            i16 = iP2;
        }
        j23.l lVar = new j23.l(1, 1000);
        ArrayList arrayList = new ArrayList(y.r(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (((j23.k) it).f96801c) {
            arrayList.add(String.valueOf(((p0) it).nextInt()));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        View viewFindViewById = viewInflate.findViewById(R.id.wattage_container);
        viewFindViewById.getClass();
        this.f49614j = new b(this, viewFindViewById, i15, iO, strArr, this.f49611g, this.f49612h);
        int iP3 = gl1.d.p(this.f49611g, this.f49606b);
        int iP4 = gl1.d.p(this.f49612h, this.f49606b);
        j23.l lVar2 = new j23.l(iP3, iP4);
        ArrayList arrayList2 = new ArrayList(y.r(lVar2, 10));
        Iterator<Integer> it3 = lVar2.iterator();
        while (((j23.k) it3).f96801c) {
            int iNextInt = ((p0) it3).nextInt();
            arrayList2.add(context.getString(R.string.lbl_value_percent, String.valueOf(iNextInt)) + " (" + gl1.d.o(iNextInt, this.f49606b) + StringUtils.SPACE + context.getString(R.string.lbl_watts) + ")");
            viewInflate = viewInflate;
        }
        View view2 = viewInflate;
        String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
        View viewFindViewById2 = view2.findViewById(R.id.ftp_container);
        viewFindViewById2.getClass();
        this.f49615k = new b(this, viewFindViewById2, i16, iP, strArr2, iP3, iP4);
        View viewFindViewById3 = view2.findViewById(R.id.units_radio_group);
        viewFindViewById3.getClass();
        RadioGroup radioGroup = (RadioGroup) viewFindViewById3;
        this.f49616l = radioGroup;
        final RadioButton radioButton = (RadioButton) view2.findViewById(R.id.watts_radio_btn);
        final RadioButton radioButton2 = (RadioButton) view2.findViewById(R.id.percent_ftp_radio_btn);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o62.d
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i19) {
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a aVar = this.f129653a;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a.b bVar = aVar.f49615k;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a.b bVar2 = aVar.f49614j;
                int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a.f49605m;
                radioGroup2.getClass();
                if (i19 == R.id.watts_radio_btn) {
                    aVar.f49607c = bVar2.f49618b.getValue();
                    aVar.f49608d = bVar2.f49619c.getValue();
                    aVar.f49609e = null;
                    radioButton.setChecked(true);
                    bVar2.f49617a.setVisibility(0);
                    bVar.f49617a.setVisibility(8);
                    return;
                }
                if (i19 == R.id.percent_ftp_radio_btn) {
                    aVar.f49607c = bVar.f49618b.getValue();
                    aVar.f49608d = bVar.f49619c.getValue();
                    aVar.f49609e = m52.h.PERCENT;
                    radioButton2.setChecked(true);
                    bVar2.f49617a.setVisibility(8);
                    bVar.f49617a.setVisibility(0);
                }
            }
        });
        if (this.f49609e == m52.h.PERCENT) {
            radioGroup.check(R.id.percent_ftp_radio_btn);
        } else {
            radioGroup.check(R.id.watts_radio_btn);
        }
        g(-1, context.getString(R.string.lbl_ok), new ew1.k(this, radioButton, iP3, 4));
        g(-2, context.getString(R.string.lbl_cancel), null);
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        m52.h hVar = this.f49609e;
        m52.h hVar2 = m52.h.PERCENT;
        b bVar = this.f49614j;
        b bVar2 = this.f49615k;
        int i16 = this.f49606b;
        if (hVar == hVar2) {
            this.f49607c = bVar2.f49618b.getValue();
            this.f49608d = bVar2.f49619c.getValue();
            int iO = gl1.d.o(this.f49607c, i16);
            int iO2 = gl1.d.o(this.f49608d, i16);
            bVar.f49618b.setValue(iO);
            bVar.f49619c.setValue(iO2);
            return;
        }
        this.f49607c = bVar.f49618b.getValue();
        this.f49608d = bVar.f49619c.getValue();
        int iP = gl1.d.p(this.f49607c, i16);
        int iP2 = gl1.d.p(this.f49608d, i16);
        bVar2.f49618b.setValue(iP);
        bVar2.f49619c.setValue(iP2);
    }
}

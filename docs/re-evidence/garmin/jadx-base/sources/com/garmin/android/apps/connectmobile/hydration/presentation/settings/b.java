package com.garmin.android.apps.connectmobile.hydration.presentation.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.appcompat.app.e;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.EditTextPicker;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jp0.c;
import org.apache.commons.lang3.text.WordUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import u20.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0015\u0016B]\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/b;", "Landroidx/appcompat/app/e;", "Landroid/content/DialogInterface$OnClickListener;", "Lcom/garmin/android/apps/connectmobile/view/EditTextPicker$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "", "volume", "minVolume", "", "Lq22/b;", "maxVolumes", "", "measurementUnitList", "measurementUnit", "Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/b$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Ljava/lang/String;DDLjava/util/Map;Ljava/util/List;Lq22/b;Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/b$b;)V", "b", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends e implements DialogInterface.OnClickListener, EditTextPicker.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<q22.b, Double> f36733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q22.b> f36734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q22.b f36735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0653b f36736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f36737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EditTextPicker f36738h;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.hydration.presentation.settings.b$b, reason: collision with other inner class name */
    public interface InterfaceC0653b {
        void a(double d14, q22.b bVar);
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, String str, double d14, double d15, Map<q22.b, Double> map, List<? extends q22.b> list, q22.b bVar, InterfaceC0653b interfaceC0653b) {
        super(context);
        context.getClass();
        str.getClass();
        map.getClass();
        list.getClass();
        bVar.getClass();
        interfaceC0653b.getClass();
        this.f36732b = str;
        this.f36733c = map;
        this.f36734d = list;
        this.f36735e = bVar;
        this.f36736f = interfaceC0653b;
        this.f36737g = 1.0d;
        q22.b bVar2 = q22.b.MILLILITER;
        double dA = q22.a.a(d15, bVar2, bVar);
        this.f36737g = dA;
        Double d16 = map.get(this.f36735e);
        double dA2 = q22.a.a(d16 != null ? d16.doubleValue() : 3000.0d, bVar2, this.f36735e);
        setTitle(j(context, str, dA, dA2, this.f36735e));
        g(-1, context.getText(R.string.lbl_done), this);
        g(-2, context.getText(R.string.lbl_cancel), null);
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.gcm_text_view_picker_dialog, (ViewGroup) null);
        i(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.textViewPicker);
        viewFindViewById.getClass();
        EditTextPicker editTextPicker = (EditTextPicker) viewFindViewById;
        this.f36738h = editTextPicker;
        editTextPicker.setOnFieldChangeListener(this);
        EditText editTextNumber = editTextPicker.getEditTextNumber();
        wp0.a aVar = new wp0.a(new l22.a(context));
        q22.b bVar3 = this.f36735e;
        bVar3.getClass();
        wp0.a.f186524b.getClass();
        DecimalFormat decimalFormatA = wp0.a.C3469a.a(bVar3);
        decimalFormatA.setGroupingUsed(false);
        String strB = aVar.b(q22.a.a(d14, bVar2, bVar3), bVar3, false, decimalFormatA, false);
        decimalFormatA.setGroupingUsed(true);
        if (strB.length() != 0) {
            editTextNumber.setText(strB);
            editTextNumber.setSelection(strB.length());
        }
        editTextNumber.setFilters(new f[]{new f(Math.floor(dA), Math.floor(dA2), "(([0-9]+)?)")});
        editTextNumber.setInputType(2);
        if (list.isEmpty()) {
            NumberPicker firstPicker = editTextPicker.getFirstPicker();
            firstPicker.getClass();
            firstPicker.setVisibility(8);
            return;
        }
        Object[] objArrCopyOf = new String[0];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strCapitalize = WordUtils.capitalize(getContext().getString(((q22.b) it.next()).f142313b));
            int length = objArrCopyOf.length;
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + 1);
            objArrCopyOf[length] = strCapitalize;
        }
        String[] strArr = (String[]) objArrCopyOf;
        int iIndexOf = this.f36734d.indexOf(this.f36735e);
        iIndexOf = iIndexOf == -1 ? 0 : iIndexOf;
        EditTextPicker editTextPicker2 = this.f36738h;
        NumberPicker numberPicker = editTextPicker2.f47407e;
        int length2 = strArr.length;
        if (length2 <= 0) {
            editTextPicker2.f47404b = -1;
            numberPicker.setVisibility(8);
            return;
        }
        editTextPicker2.f47404b = (iIndexOf < 0 || iIndexOf >= length2) ? 0 : iIndexOf;
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(length2 - 1);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setValue(editTextPicker2.f47404b);
    }

    public static String j(Context context, String str, double d14, double d15, q22.b bVar) {
        String string = context.getString(R.string.string_line_string_pattern, String.valueOf((int) d14), String.valueOf((int) d15));
        string.getClass();
        String string2 = context.getString(bVar.f142315d);
        string2.getClass();
        String string3 = context.getString(R.string.string_space_string_pattern, string, string2);
        string3.getClass();
        String string4 = context.getString(R.string.string_space_string_bracket_pattern, str, string3);
        string4.getClass();
        return string4;
    }

    @Override // com.garmin.android.apps.connectmobile.view.EditTextPicker.c
    public final void a(EditTextPicker editTextPicker, int i14, Number number) {
        editTextPicker.getClass();
        number.getClass();
        EditText editTextNumber = this.f36738h.getEditTextNumber();
        q22.b bVar = this.f36735e;
        List<q22.b> list = this.f36734d;
        q22.b bVar2 = list.isEmpty() ? bVar : list.get(i14);
        double dA = q22.a.a(number.doubleValue(), bVar, bVar2);
        int i15 = c.f99873k;
        if (dA < 1.0d) {
            dA = 1.0d;
        }
        String strValueOf = String.valueOf((int) dA);
        Double d14 = this.f36733c.get(bVar2);
        double dA2 = q22.a.a(d14 != null ? d14.doubleValue() : 3000.0d, q22.b.MILLILITER, bVar2);
        Context context = getContext();
        context.getClass();
        String strJ = j(context, this.f36732b, this.f36737g, dA2, bVar2);
        this.f36735e = bVar2;
        setTitle(strJ);
        editTextNumber.setFilters(new f[]{new f(Math.floor(this.f36737g), Math.floor(dA2), "(([0-9]+)?)")});
        editTextNumber.setText(strValueOf);
        editTextNumber.setSelection(strValueOf.length());
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        dialogInterface.getClass();
        EditTextPicker editTextPicker = this.f36738h;
        editTextPicker.clearFocus();
        double dDoubleValue = editTextPicker.getEditTextValue().doubleValue();
        int firstValue = editTextPicker.getFirstValue();
        List<q22.b> list = this.f36734d;
        q22.b bVar = (list.isEmpty() || firstValue == -1) ? this.f36735e : list.get(firstValue);
        this.f36736f.a(q22.a.a(dDoubleValue, bVar, q22.b.MILLILITER), bVar);
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        double d14 = bundle.getDouble("VOLUME");
        int i14 = bundle.getInt("MEASUREMENT_UNIT");
        EditTextPicker editTextPicker = this.f36738h;
        editTextPicker.getEditTextNumber().setText(String.valueOf(d14));
        editTextPicker.getFirstPicker().setValue(i14);
    }

    @Override // b.i, android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        EditTextPicker editTextPicker = this.f36738h;
        bundleOnSaveInstanceState.putInt("MEASUREMENT_UNIT", editTextPicker.getFirstValue());
        bundleOnSaveInstanceState.putDouble("VOLUME", editTextPicker.getEditTextValue().doubleValue());
        return bundleOnSaveInstanceState;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/settings/b$a;", "", "<init>", "()V", "", "MEASUREMENT_UNIT", "Ljava/lang/String;", "VOLUME", "REGEXP_INTEGER", "", "DEFAULT_MIN_VOLUME", "D", "DEFAULT_MAX_VOLUME", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(Context context, String str, double d14, double d15, Map map, List list, q22.b bVar, InterfaceC0653b interfaceC0653b, int i14, j jVar) {
        this(context, str, d14, d15, map, (i14 & 32) != 0 ? new ArrayList() : list, (i14 & 64) != 0 ? q22.b.MILLILITER : bVar, interfaceC0653b);
    }
}

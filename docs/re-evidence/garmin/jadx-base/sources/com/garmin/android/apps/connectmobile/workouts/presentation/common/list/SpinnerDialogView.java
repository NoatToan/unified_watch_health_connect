package com.garmin.android.apps.connectmobile.workouts.presentation.common.list;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TableRow;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import com.google.android.material.timepicker.TimeModel;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.n;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.j0;
import p13.u;
import xg1.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0015\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0006789:;<B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u000b2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$R$\u0010+\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006="}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/ListItemView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mSpinnerCount", "", "setSpinnerCount", "(I)V", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$d;", "mOnSpinnerValuesChangeListener", "setOnSpinnerValuesChangeListener", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$d;)V", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$b;", "mOnListRowClickListener", "setOnSpinnerListRowClickListener", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$b;)V", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$c;", "mOnSpinnerDialogButtonClickListener", "setOnSpinnerDialogButtonClickListener", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$c;)V", "", "charSequence", "setDialogTitle", "(Ljava/lang/CharSequence;)V", "", "", "delimiters", "setDelimiters", "(Ljava/util/List;)V", "getDelimiterListSize", "()I", "o", "Ljava/lang/String;", "getDescriptionMessage", "()Ljava/lang/String;", "setDescriptionMessage", "(Ljava/lang/String;)V", "descriptionMessage", "p", "Ljava/lang/Integer;", "getDescriptionMessageSpinnerIndex", "()Ljava/lang/Integer;", "setDescriptionMessageSpinnerIndex", "(Ljava/lang/Integer;)V", "descriptionMessageSpinnerIndex", "", "getCurrentSpinnerData", "()[I", "currentSpinnerData", "f", "d", "b", "c", JWKParameterNames.RSA_EXPONENT, "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpinnerDialogView extends ListItemView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f48419r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48420t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f48421v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f48424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f48425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f48426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f48427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f48428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f48429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray<e> f48430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.appcompat.app.e f48431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f48432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public String descriptionMessage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public Integer descriptionMessageSpinnerIndex;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f48435q;

    public interface b {
    }

    public interface c {
        boolean a(DialogInterface dialogInterface, int i14, int[] iArr);
    }

    public interface d {
        void j(SpinnerDialogView spinnerDialogView, int[] iArr);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$e;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String[] f48439d;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$f;", "Landroid/widget/NumberPicker$Formatter;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements NumberPicker.Formatter {
        @Override // android.widget.NumberPicker.Formatter
        public final String format(int i14) {
            x0 x0Var = x0.f105818a;
            return String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
        }
    }

    static {
        new a(null);
        f48419r = new f();
        f48420t = R.id.field_value;
        f48421v = R.id.field_unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerDialogView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f48422d = 1;
        this.f48424f = j0.f134944a;
        this.f48429k = new ArrayList();
        this.f48430l = new SparseArray<>();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k52.f.f102950b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.f48422d = typedArrayObtainStyledAttributes.getInt(0, this.f48422d);
        this.f48423e = typedArrayObtainStyledAttributes.getInt(1, this.f48423e);
        String string = typedArrayObtainStyledAttributes.getString(2);
        setTitle(string == null ? "" : string);
        typedArrayObtainStyledAttributes.recycle();
        setOnClickListener(new y52.e(this, 0));
        this.f48435q = new l(this, 8);
    }

    public static void b(SpinnerDialogView spinnerDialogView, DialogInterface dialogInterface, int i14) {
        dialogInterface.getClass();
        c cVar = spinnerDialogView.f48428j;
        if (cVar == null) {
            int[] currentSpinnerData = spinnerDialogView.getCurrentSpinnerData();
            d dVar = spinnerDialogView.f48426h;
            if (dVar != null) {
                dVar.j(spinnerDialogView, currentSpinnerData);
            }
            androidx.appcompat.app.e eVar = spinnerDialogView.f48431m;
            if (eVar != null) {
                eVar.dismiss();
                return;
            } else {
                s.m("dialog");
                throw null;
            }
        }
        if (cVar.a(dialogInterface, i14, spinnerDialogView.getCurrentSpinnerData())) {
            int[] currentSpinnerData2 = spinnerDialogView.getCurrentSpinnerData();
            d dVar2 = spinnerDialogView.f48426h;
            if (dVar2 != null) {
                dVar2.j(spinnerDialogView, currentSpinnerData2);
            }
            androidx.appcompat.app.e eVar2 = spinnerDialogView.f48431m;
            if (eVar2 != null) {
                eVar2.dismiss();
            } else {
                s.m("dialog");
                throw null;
            }
        }
    }

    private final int[] getCurrentSpinnerData() {
        ArrayList arrayList = this.f48429k;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = ((NumberPicker) ((View) arrayList.get(i14)).findViewById(f48420t)).getValue();
        }
        return iArr;
    }

    public final void c(NumberPicker numberPicker, TextView textView, e eVar, final int i14, final TableRow tableRow) {
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setTag(Integer.valueOf(i14));
        numberPicker.setMinValue(eVar.f48437b);
        numberPicker.setMaxValue(eVar.f48436a);
        numberPicker.setDisplayedValues(eVar.f48439d);
        numberPicker.setValue(eVar.f48438c);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: y52.f
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker2, int i15, int i16) {
                Integer num;
                TableRow tableRow2;
                SpinnerDialogView.f fVar = SpinnerDialogView.f48419r;
                numberPicker2.getClass();
                SpinnerDialogView spinnerDialogView = this.f194543a;
                if (!n.d(spinnerDialogView.descriptionMessage) || (num = spinnerDialogView.descriptionMessageSpinnerIndex) == null) {
                    return;
                }
                if (i14 != num.intValue() || (tableRow2 = tableRow) == null) {
                    return;
                }
                tableRow2.setVisibility(0);
            }
        });
        textView.setVisibility(8);
        try {
            Field declaredField = NumberPicker.class.getDeclaredField("mInputText");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(numberPicker);
            EditText editText = obj instanceof EditText ? (EditText) obj : null;
            if (editText != null) {
                editText.setFilters(new InputFilter[0]);
            }
        } catch (Exception e4) {
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "SpinnerDialogView", e4);
        }
    }

    public final void d(int i14, int i15, int i16, int i17, NumberPicker.Formatter formatter) {
        String[] strArr;
        if (formatter != null) {
            strArr = new String[(i16 - i15) + 1];
            if (i15 <= i16) {
                int i18 = i15;
                while (true) {
                    strArr[i18 - i15] = formatter.format(i18);
                    if (i18 == i16) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
        } else {
            strArr = null;
        }
        String[] strArr2 = strArr != null ? (String[]) u.C(strArr).toArray(new String[0]) : null;
        if (this.f48422d > i14) {
            e eVar = new e();
            eVar.f48437b = i15;
            eVar.f48436a = i16;
            eVar.f48438c = i17;
            eVar.f48439d = strArr2;
            this.f48430l.put(i14, eVar);
            this.f48425g = null;
        }
    }

    public final void e(int i14, String[] strArr, int i15) {
        strArr.getClass();
        int length = strArr.length - 1;
        if (this.f48422d > i14) {
            e eVar = new e();
            eVar.f48437b = 0;
            eVar.f48436a = length;
            eVar.f48438c = i15;
            eVar.f48439d = strArr;
            this.f48430l.put(i14, eVar);
            this.f48425g = null;
        }
    }

    public final int getDelimiterListSize() {
        int i14 = 0;
        if (!this.f48424f.isEmpty()) {
            Iterator<String> it = this.f48424f.iterator();
            while (it.hasNext()) {
                if (it.next().length() > 0) {
                    i14++;
                }
            }
        }
        return i14;
    }

    public final String getDescriptionMessage() {
        return this.descriptionMessage;
    }

    public final Integer getDescriptionMessageSpinnerIndex() {
        return this.descriptionMessageSpinnerIndex;
    }

    public final void setDelimiters(List<String> delimiters) {
        if (delimiters == null) {
            delimiters = j0.f134944a;
        }
        this.f48424f = delimiters;
    }

    public final void setDescriptionMessage(String str) {
        this.descriptionMessage = str;
    }

    public final void setDescriptionMessageSpinnerIndex(Integer num) {
        this.descriptionMessageSpinnerIndex = num;
    }

    public final void setDialogTitle(CharSequence charSequence) {
        this.f48432n = charSequence;
        androidx.appcompat.app.e eVar = this.f48431m;
        if (eVar != null) {
            if (eVar != null) {
                eVar.setTitle(charSequence);
            } else {
                s.m("dialog");
                throw null;
            }
        }
    }

    public final void setOnSpinnerDialogButtonClickListener(c mOnSpinnerDialogButtonClickListener) {
        this.f48428j = mOnSpinnerDialogButtonClickListener;
    }

    public final void setOnSpinnerListRowClickListener(b mOnListRowClickListener) {
        this.f48427i = mOnListRowClickListener;
    }

    public final void setOnSpinnerValuesChangeListener(d mOnSpinnerValuesChangeListener) {
        this.f48426h = mOnSpinnerValuesChangeListener;
    }

    public final void setSpinnerCount(int mSpinnerCount) {
        this.f48422d = mSpinnerCount;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$f;", "TWO_DIGITAL_FORMATTER", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/common/list/SpinnerDialogView$f;", "", "HORIZONTAL", "I", "VERTICAL", "NUMBER_PICKER_ID", "TEXT_VIEW_ID", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinnerDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinnerDialogView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SpinnerDialogView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}

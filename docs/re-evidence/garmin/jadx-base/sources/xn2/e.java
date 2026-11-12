package xn2;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.textfield.TextInputLayout;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import xn2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxn2/e;", "Lxn2/w;", "T", "Lxn2/a;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e<T extends w> extends xn2.a<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f191693i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f191694j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextInputLayout f191695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextInputLayout f191696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextInputLayout f191697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextInputLayout f191698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextInputLayout f191699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pn2.u f191700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f191701h;

    static {
        int i14 = gt2.c.f79010a;
        f191694j = gt2.b.f79005a.h("PAY#FN#BasicUserInfoFrag");
    }

    public static void E6(TextInputLayout textInputLayout, String str, boolean z14, boolean z15) {
        if (z15) {
            textInputLayout.requestFocus();
        }
        textInputLayout.setError(str);
        textInputLayout.setErrorEnabled(z14);
    }

    public final void A6(DateTime dateTime) {
        if (dateTime != null) {
            TextInputLayout textInputLayout = this.f191697d;
            if (textInputLayout == null) {
                p005kotlin.jvm.internal.s.m("birthday");
                throw null;
            }
            EditText editText = textInputLayout.getEditText();
            editText.getClass();
            editText.setText(DateTimeFormat.mediumDate().print(dateTime));
        } else {
            dateTime = null;
        }
        this.f191701h = dateTime;
    }

    public final void C6() {
        DateTime dateTimeMinusYears;
        Context context = getContext();
        if (context == null) {
            f191694j.trace("Context is null");
            return;
        }
        DateTime dateTimeNow = this.f191701h;
        if (dateTimeNow == null) {
            dateTimeNow = DateTime.now();
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, R.style.Gcm_Dialog_DatePicker, new bi2.p(this, 2), dateTimeNow.getYear(), dateTimeNow.getMonthOfYear() - 1, dateTimeNow.getDayOfMonth());
        DatePicker datePicker = datePickerDialog.getDatePicker();
        DateTime dateTimeNow2 = DateTime.now();
        dateTimeNow2.getClass();
        DateTime dateTimeWithTimeAtStartOfDay = dateTimeNow2.withTimeAtStartOfDay();
        DateTime dateTimeWithDayOfMonth = dateTimeWithTimeAtStartOfDay.withMonthOfYear(4).withDayOfMonth(2);
        if (dateTimeWithTimeAtStartOfDay.isBefore(dateTimeWithDayOfMonth)) {
            dateTimeMinusYears = dateTimeWithDayOfMonth.minusDays(1).minusYears(13);
            dateTimeMinusYears.getClass();
        } else {
            dateTimeMinusYears = dateTimeWithDayOfMonth.minusDays(1).minusYears(12);
            dateTimeMinusYears.getClass();
        }
        datePicker.setMaxDate(dateTimeMinusYears.getMillis());
        datePickerDialog.getDatePicker().setMinDate(new DateTime(1900, 1, 2, 0, 0).getMillis());
        datePickerDialog.show();
    }

    public final void k0() {
        TextInputLayout textInputLayout = this.f191695b;
        if (textInputLayout == null) {
            p005kotlin.jvm.internal.s.m("lastName");
            throw null;
        }
        E6(textInputLayout, null, false, false);
        TextInputLayout textInputLayout2 = this.f191696c;
        if (textInputLayout2 == null) {
            p005kotlin.jvm.internal.s.m("firstName");
            throw null;
        }
        E6(textInputLayout2, null, false, false);
        TextInputLayout textInputLayout3 = this.f191697d;
        if (textInputLayout3 == null) {
            p005kotlin.jvm.internal.s.m("birthday");
            throw null;
        }
        E6(textInputLayout3, null, false, false);
        TextInputLayout textInputLayout4 = this.f191698e;
        if (textInputLayout4 == null) {
            p005kotlin.jvm.internal.s.m("gender");
            throw null;
        }
        E6(textInputLayout4, null, false, false);
        TextInputLayout textInputLayout5 = this.f191699f;
        if (textInputLayout5 != null) {
            E6(textInputLayout5, null, false, false);
        } else {
            p005kotlin.jvm.internal.s.m("phoneNumber");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        DateTime dateTime;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.last_name);
        viewFindViewById.getClass();
        this.f191695b = (TextInputLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.first_name);
        viewFindViewById2.getClass();
        this.f191696c = (TextInputLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.birthday);
        viewFindViewById3.getClass();
        this.f191697d = (TextInputLayout) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.gender);
        viewFindViewById4.getClass();
        this.f191698e = (TextInputLayout) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.phone_number);
        viewFindViewById5.getClass();
        this.f191699f = (TextInputLayout) viewFindViewById5;
        pn2.t tVarW6 = w6();
        String lastNameKana = tVarW6 != null ? tVarW6.getLastNameKana() : null;
        TextInputLayout textInputLayout = this.f191695b;
        if (textInputLayout == null) {
            p005kotlin.jvm.internal.s.m("lastName");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        editText.getClass();
        editText.setText(lastNameKana);
        editText.addTextChangedListener(new f(new b(this, 2)));
        pn2.t tVarW7 = w6();
        String firstNameKana = tVarW7 != null ? tVarW7.getFirstNameKana() : null;
        TextInputLayout textInputLayout2 = this.f191696c;
        if (textInputLayout2 == null) {
            p005kotlin.jvm.internal.s.m("firstName");
            throw null;
        }
        EditText editText2 = textInputLayout2.getEditText();
        editText2.getClass();
        editText2.setText(firstNameKana);
        editText2.addTextChangedListener(new f(new b(this, 0)));
        pn2.t tVarW8 = w6();
        if (tVarW8 != null) {
            dateTime = DateTime.parse(tVarW8.getBirthday(), DateTimeFormat.forPattern("yyyyMMdd"));
            dateTime.getClass();
        } else {
            dateTime = null;
        }
        TextInputLayout textInputLayout3 = this.f191697d;
        if (textInputLayout3 == null) {
            p005kotlin.jvm.internal.s.m("birthday");
            throw null;
        }
        final EditText editText3 = textInputLayout3.getEditText();
        editText3.getClass();
        A6(dateTime);
        editText3.setKeyListener(null);
        final int i14 = 0;
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xn2.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                int i15 = i14;
                e eVar = this;
                EditText editText4 = editText3;
                switch (i15) {
                    case 0:
                        e.a aVar = e.f191693i;
                        if (!z14) {
                            Editable text = editText4.getText();
                            if (text == null || text.length() == 0) {
                                editText4.setHint(editText4.getContext().getString(R.string.wallet_hint_select_a_date));
                            }
                        } else {
                            editText4.setHint(editText4.getContext().getString(R.string.wallet_label_suica_birth_date));
                            eVar.y6(editText4);
                            eVar.C6();
                        }
                        break;
                    default:
                        e.a aVar2 = e.f191693i;
                        if (!z14) {
                            Editable text2 = editText4.getText();
                            if (text2 == null || text2.length() == 0) {
                                editText4.setHint(editText4.getContext().getString(R.string.wallet_hint_select_a_gender));
                            }
                        } else {
                            editText4.setHint(eVar.getString(R.string.lbl_gender));
                            eVar.Z5(new b(eVar, 3));
                        }
                        break;
                }
            }
        });
        editText3.setOnClickListener(new View.OnClickListener() { // from class: xn2.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                EditText editText4 = editText3;
                e eVar = this;
                switch (i15) {
                    case 0:
                        e.a aVar = e.f191693i;
                        eVar.y6(editText4);
                        eVar.C6();
                        break;
                    default:
                        e.a aVar2 = e.f191693i;
                        eVar.y6(editText4);
                        eVar.z6();
                        eVar.Z5(new b(eVar, 3));
                        break;
                }
            }
        });
        pn2.t tVarW9 = w6();
        pn2.u uVarE = tVarW9 != null ? oi0.c.E(tVarW9) : pn2.u.MALE;
        TextInputLayout textInputLayout4 = this.f191698e;
        if (textInputLayout4 == null) {
            p005kotlin.jvm.internal.s.m("gender");
            throw null;
        }
        final EditText editText4 = textInputLayout4.getEditText();
        editText4.getClass();
        if (uVarE != null) {
            TextInputLayout textInputLayout5 = this.f191698e;
            if (textInputLayout5 == null) {
                p005kotlin.jvm.internal.s.m("gender");
                throw null;
            }
            EditText editText5 = textInputLayout5.getEditText();
            editText5.getClass();
            editText5.setText(uVarE.f138812b);
        } else {
            uVarE = null;
        }
        this.f191700g = uVarE;
        y6(editText4);
        editText4.setKeyListener(null);
        final int i15 = 1;
        editText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xn2.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view3, boolean z14) {
                int i16 = i15;
                e eVar = this;
                EditText editText6 = editText4;
                switch (i16) {
                    case 0:
                        e.a aVar = e.f191693i;
                        if (!z14) {
                            Editable text = editText6.getText();
                            if (text == null || text.length() == 0) {
                                editText6.setHint(editText6.getContext().getString(R.string.wallet_hint_select_a_date));
                            }
                        } else {
                            editText6.setHint(editText6.getContext().getString(R.string.wallet_label_suica_birth_date));
                            eVar.y6(editText6);
                            eVar.C6();
                        }
                        break;
                    default:
                        e.a aVar2 = e.f191693i;
                        if (!z14) {
                            Editable text2 = editText6.getText();
                            if (text2 == null || text2.length() == 0) {
                                editText6.setHint(editText6.getContext().getString(R.string.wallet_hint_select_a_gender));
                            }
                        } else {
                            editText6.setHint(eVar.getString(R.string.lbl_gender));
                            eVar.Z5(new b(eVar, 3));
                        }
                        break;
                }
            }
        });
        editText4.setOnClickListener(new View.OnClickListener() { // from class: xn2.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                EditText editText6 = editText4;
                e eVar = this;
                switch (i16) {
                    case 0:
                        e.a aVar = e.f191693i;
                        eVar.y6(editText6);
                        eVar.C6();
                        break;
                    default:
                        e.a aVar2 = e.f191693i;
                        eVar.y6(editText6);
                        eVar.z6();
                        eVar.Z5(new b(eVar, 3));
                        break;
                }
            }
        });
        pn2.t tVarW10 = w6();
        String mobilePhoneNumber = tVarW10 != null ? tVarW10.getMobilePhoneNumber() : null;
        TextInputLayout textInputLayout6 = this.f191699f;
        if (textInputLayout6 == null) {
            p005kotlin.jvm.internal.s.m("phoneNumber");
            throw null;
        }
        EditText editText6 = textInputLayout6.getEditText();
        editText6.getClass();
        editText6.setText(mobilePhoneNumber);
        editText6.addTextChangedListener(new f(new b(this, 1)));
    }

    public final void q3(int i14, String str, boolean z14) {
        if (i14 == R.id.last_name) {
            TextInputLayout textInputLayout = this.f191695b;
            if (textInputLayout != null) {
                E6(textInputLayout, str, true, z14);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("lastName");
                throw null;
            }
        }
        if (i14 == R.id.first_name) {
            TextInputLayout textInputLayout2 = this.f191696c;
            if (textInputLayout2 != null) {
                E6(textInputLayout2, str, true, z14);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("firstName");
                throw null;
            }
        }
        if (i14 == R.id.birthday) {
            TextInputLayout textInputLayout3 = this.f191697d;
            if (textInputLayout3 != null) {
                E6(textInputLayout3, str, true, z14);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("birthday");
                throw null;
            }
        }
        if (i14 == R.id.gender) {
            TextInputLayout textInputLayout4 = this.f191698e;
            if (textInputLayout4 != null) {
                E6(textInputLayout4, str, true, z14);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("gender");
                throw null;
            }
        }
        if (i14 != R.id.phone_number) {
            f191694j.trace("Developer miss some input error event");
            return;
        }
        TextInputLayout textInputLayout5 = this.f191699f;
        if (textInputLayout5 != null) {
            E6(textInputLayout5, str, true, z14);
        } else {
            p005kotlin.jvm.internal.s.m("phoneNumber");
            throw null;
        }
    }

    public final pn2.t w6() {
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) arguments.getParcelable("extra.initial_user_info", pn2.t.class);
        } else {
            Parcelable parcelable2 = arguments.getParcelable("extra.initial_user_info");
            parcelable = (pn2.t) (parcelable2 instanceof pn2.t ? parcelable2 : null);
        }
        return (pn2.t) parcelable;
    }

    public final void y6(View view2) {
        Context context = getContext();
        if (context == null) {
            f191694j.trace("Context is null");
            return;
        }
        Object systemService = context.getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
    }

    public void z6() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lxn2/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "EXTRA_INITIAL_USER_INFO", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

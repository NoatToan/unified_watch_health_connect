package com.huawei.ui.main.stories.health.bloodpressure;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.edittext.HealthErrorTipTextLayout;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.bloodpressure.BloodPressureMeasureActionManager;
import com.huawei.uikit.phone.hwedittext.widget.HwIconTextLayout;
import defpackage.njy;
import defpackage.qle;
import defpackage.qpx;
import defpackage.uwu;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureMeasureActionManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f27812c;
    private HealthFlowLayout d;
    private boolean f;
    private int h;
    private CustomActionChangeListener i;
    private int e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27810a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27811b = "";
    private List<uwu> j = new ArrayList(0);

    public interface CustomActionChangeListener {
        void onAddAction(String str);
    }

    public static /* synthetic */ void e(DialogInterface dialogInterface, int i) {
    }

    public BloodPressureMeasureActionManager(Context context) {
        this.f27812c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        View viewInflate = LayoutInflater.from(this.f27812c).inflate(R.layout.item_blood_pressure_custom_action, (ViewGroup) null);
        HealthErrorTipTextLayout healthErrorTipTextLayout = (HealthErrorTipTextLayout) viewInflate.findViewById(R.id.error_tip_bubble);
        final EditText editText = healthErrorTipTextLayout.getEditText();
        e(editText, healthErrorTipTextLayout);
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this.f27812c).a(viewInflate).d(R.string.IDS_custom).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: usz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f50527c.b(editText, dialogInterface, i);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: usy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureMeasureActionManager.e(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builderA.b();
        builderA.c().setTextColor(this.f27812c.getColor(R.color.blood_pressure_subtab_item_text));
        builderA.a().setTextColor(this.f27812c.getColor(R.color.blood_pressure_subtab_item_text));
        customAlertDialogB.setCanceledOnTouchOutside(false);
        customAlertDialogB.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ute
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f50531c.b(editText, dialogInterface);
            }
        });
        customAlertDialogB.setOnShowListener(new DialogInterface.OnShowListener() { // from class: utf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f50532c.d(editText, dialogInterface);
            }
        });
        customAlertDialogB.show();
    }

    public /* synthetic */ void b(EditText editText, DialogInterface dialogInterface, int i) {
        String strTrim = editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        b(strTrim);
    }

    public /* synthetic */ void b(EditText editText, DialogInterface dialogInterface) {
        ((InputMethodManager) this.f27812c.getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(editText.getWindowToken(), 2);
        editText.clearFocus();
    }

    public /* synthetic */ void d(final EditText editText, DialogInterface dialogInterface) {
        editText.postDelayed(new Runnable() { // from class: usw
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(editText);
            }
        }, 100L);
    }

    public /* synthetic */ void a(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) this.f27812c.getSystemService(InputMethodManager.class)).showSoftInput(editText, 0);
    }

    private void e(final EditText editText, final HealthErrorTipTextLayout healthErrorTipTextLayout) {
        final String string = this.f27812c.getString(R.string.IDS_custom_remind_1);
        final HwIconTextLayout hwIconTextLayout = (HwIconTextLayout) healthErrorTipTextLayout.findViewById(R.id.icon_text_bubble);
        hwIconTextLayout.setOnIconClickListener(new View.OnClickListener() { // from class: utb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                editText.setText("");
            }
        });
        editText.addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.main.stories.health.bloodpressure.BloodPressureMeasureActionManager.5
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                editText.removeTextChangedListener(this);
                int i = LanguageUtil.f(BaseApplication.getContext()) ? 12 : 16;
                String string2 = editable.toString();
                String str = string2.getBytes(StandardCharsets.UTF_8).length <= i ? string2 : BloodPressureMeasureActionManager.this.f27811b;
                BloodPressureMeasureActionManager.this.f27811b = str;
                if (!string2.equals(str)) {
                    editText.setText(str);
                    editText.setSelection(str.length());
                    healthErrorTipTextLayout.setError(string);
                } else {
                    healthErrorTipTextLayout.setError("");
                }
                if (!TextUtils.isEmpty(string2)) {
                    hwIconTextLayout.setIcon(ContextCompat.getDrawable(BloodPressureMeasureActionManager.this.f27812c, R.drawable.ic_appbar_cancle));
                } else {
                    hwIconTextLayout.setIcon(null);
                }
                editText.addTextChangedListener(this);
            }
        });
    }

    private void c(List<uwu> list) {
        ArrayList<qle> arrayListE = e(list);
        this.d.d(arrayListE, false);
        for (int i = 0; i < arrayListE.size(); i++) {
            b(this.d.getChildAt(i), i);
        }
    }

    private void b(View view, final int i) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.bloodpressure.BloodPressureMeasureActionManager.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (BloodPressureMeasureActionManager.this.f) {
                    if (i == BloodPressureMeasureActionManager.this.j.size()) {
                        BloodPressureMeasureActionManager.this.g();
                        return;
                    }
                    BloodPressureMeasureActionManager.this.b(i);
                    if (njy.e(BloodPressureMeasureActionManager.this.j, i)) {
                        LogUtil.a("MeasureActionManager", "setItemBackground isOutOfBounds");
                        return;
                    }
                    if (!(view2 instanceof TextView)) {
                        LogUtil.d("MeasureActionManager", "view is not TextView");
                        return;
                    }
                    TextView textView = (TextView) view2;
                    if (((uwu) BloodPressureMeasureActionManager.this.j.get(i)).g()) {
                        textView.setBackgroundResource(R.drawable.blood_measure_card_select);
                        textView.setTextColor(ContextCompat.getColor(BloodPressureMeasureActionManager.this.f27812c, com.huawei.ui.commonui.R.color.textColorPrimaryInverse));
                    } else {
                        textView.setBackgroundResource(R.drawable.blood_measure_card_normal);
                        textView.setTextColor(ContextCompat.getColor(BloodPressureMeasureActionManager.this.f27812c, com.huawei.ui.commonui.R.color.textColorSecondary));
                    }
                }
            }
        });
    }

    private ArrayList<qle> e(List<uwu> list) {
        ArrayList<qle> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            uwu uwuVar = list.get(i);
            qle qleVar = new qle(i, uwuVar.b(), 1);
            qleVar.b(uwuVar.g());
            arrayList.add(qleVar);
        }
        if (this.e == 1 && this.f) {
            arrayList.add(new qle(arrayList.size(), "+ " + this.f27812c.getString(R.string.IDS_custom), 1));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (njy.e(this.j, i)) {
            LogUtil.a("MeasureActionManager", "clickActionSelected isOutOfBounds");
            return;
        }
        uwu uwuVar = this.j.get(i);
        if (b(uwuVar)) {
            return;
        }
        if (njy.c(this.j, this.f27810a) && this.j.get(this.f27810a).g()) {
            this.j.get(this.f27810a).a(false);
            a();
        }
        if (uwuVar.g()) {
            a(uwuVar);
        } else {
            d(uwuVar);
        }
    }

    private boolean b(uwu uwuVar) {
        if (!uwuVar.c()) {
            return false;
        }
        if (uwuVar.g()) {
            return true;
        }
        f();
        return true;
    }

    private void a(uwu uwuVar) {
        a();
        if (b()) {
            e();
        } else {
            uwuVar.a(!uwuVar.g());
        }
    }

    private void d(uwu uwuVar) {
        e();
        if (b()) {
            a();
            String strE = UnitUtil.e(10.0d, 1, 0);
            Context context = this.f27812c;
            qpx.e(context, context.getString(R.string.IDS_custom_max_remind, strE));
            return;
        }
        uwuVar.a(!uwuVar.g());
    }

    private boolean b() {
        int i = this.h;
        return i < 0 || i > 10;
    }

    private void a() {
        this.h--;
    }

    private void e() {
        this.h++;
    }

    private void h() {
        this.h = 0;
    }

    private void f() {
        h();
        for (uwu uwuVar : this.j) {
            if (uwuVar.c()) {
                uwuVar.a(true);
                e();
            } else {
                uwuVar.a(false);
            }
        }
    }

    private void b(String str) {
        for (int i = 0; i < this.j.size(); i++) {
            uwu uwuVar = this.j.get(i);
            if (uwuVar.b().equals(str)) {
                if (uwuVar.g()) {
                    return;
                }
                b(i);
                c(this.j);
                return;
            }
        }
        CustomActionChangeListener customActionChangeListener = this.i;
        if (customActionChangeListener != null) {
            customActionChangeListener.onAddAction(str);
        }
        uwu uwuVar2 = new uwu(str);
        uwuVar2.d(true);
        this.j.add(uwuVar2);
        c();
        c(this.j);
    }

    private void c() {
        for (int i = 0; i < this.j.size(); i++) {
            uwu uwuVar = this.j.get(i);
            if (!uwuVar.d() && uwuVar.a()) {
                if (this.j.size() - i < 30) {
                    break;
                }
                this.e = 0;
            }
        }
        if (this.f) {
            this.e = 1;
            return;
        }
        this.e = 0;
    }

    public void d(HealthFlowLayout healthFlowLayout) {
        this.d = healthFlowLayout;
        this.d.setTextViewBuilder(new BloodPressureTagTextViewBuilder(BaseApplication.getContext()));
    }

    public void d(List<uwu> list) {
        if (list == null) {
            return;
        }
        this.j = new ArrayList(list.size());
        h();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            uwu uwuVar = list.get(i2);
            if (uwuVar.f()) {
                if (uwuVar.g()) {
                    e();
                }
                if (uwuVar.c()) {
                    this.f27810a = i;
                }
                this.j.add(uwuVar);
                i++;
            }
        }
        c();
        c(this.j);
    }

    public List<uwu> d() {
        return this.j;
    }

    public void a(boolean z) {
        this.f = z;
        c();
        c(this.j);
    }

    public void e(CustomActionChangeListener customActionChangeListener) {
        this.i = customActionChangeListener;
    }
}

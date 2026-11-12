package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes19.dex */
public class vqj extends BaseDialog {
    public vqj(Context context, int i) {
        super(context, i);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f51455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f51456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f51457c;
        private EditText d;
        private HealthTextView e;
        private Toast f;
        private HealthButton g;
        private String h;
        private String j = null;
        private int i = 0;

        public d(Context context, Handler handler) {
            this.f51457c = context;
            this.f51455a = handler;
        }

        public vqj d() {
            LogUtil.a("Track_InputHistoryDataSportDistanceDialog", "InputHistoryDataSportDistanceDialog is create");
            Object systemService = this.f51457c.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                LogUtil.a("Track_InputHistoryDataSportDistanceDialog", "create ", "object is invalid type");
                return null;
            }
            final vqj vqjVar = new vqj(this.f51457c, R.style.TrackDialog);
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.track_dialog_custom_target_item_emui9, (ViewGroup) null);
            b(viewInflate);
            ((HealthButton) viewInflate.findViewById(R.id.cancel)).setOnClickListener(new View.OnClickListener() { // from class: vqj.d.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    vqjVar.dismiss();
                }
            });
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.ok);
            this.g = healthButton;
            healthButton.setEnabled(false);
            b();
            d(vqjVar);
            vqjVar.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
            vqjVar.setContentView(viewInflate);
            return vqjVar;
        }

        public void d(int i) {
            this.i = i;
        }

        private void d(final vqj vqjVar) {
            this.g.setOnClickListener(new View.OnClickListener() { // from class: vqj.d.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    double d;
                    d dVar = d.this;
                    dVar.j = dVar.d.getText().toString();
                    if (vqjVar == null) {
                        return;
                    }
                    if (TextUtils.isEmpty(d.this.j)) {
                        d = 0.0d;
                    } else {
                        try {
                            d = Double.parseDouble(d.this.j);
                        } catch (NumberFormatException unused) {
                            LogUtil.e("Track_InputHistoryDataSportDistanceDialog", "setOkButtonListener exception");
                            d = 0.0d;
                        }
                    }
                    if (d.this.b(d)) {
                        return;
                    }
                    d.this.f51455a.sendMessage(d.this.f51455a.obtainMessage(10002, (int) Math.round(d * 100.0d), 0, d.this.h));
                    vqjVar.dismiss();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(double d) {
            int i;
            int i2;
            String string = this.f51457c.getResources().getString(R.string.IDS_hwh_input_history_data_incorrext_distance_toast);
            double d2 = 25.0d;
            double dE = 0.1d;
            if (UnitUtil.f()) {
                int i3 = this.i;
                if (i3 == 262 || i3 == 266) {
                    dE = UnitUtil.e(25.0d, 2);
                    i2 = 300000;
                } else {
                    i2 = 300;
                    if (d < 0.1d || d > 300) {
                        e(String.format(string, Double.valueOf(0.1d), 300, this.h), this.f51457c);
                        return true;
                    }
                }
                if (d >= dE && d <= i2) {
                    return false;
                }
                e(String.format(string, Double.valueOf(dE), Integer.valueOf(i2), this.h), this.f51457c);
                return true;
            }
            int i4 = this.i;
            if (i4 == 262 || i4 == 266) {
                i = 500000;
            } else {
                i = 500;
                d2 = 0.1d;
            }
            if (d >= d2 && d <= i) {
                return false;
            }
            e(String.format(string, Double.valueOf(d2), Integer.valueOf(i), this.h), this.f51457c);
            return true;
        }

        private void b() {
            this.d.addTextChangedListener(new TextWatcher() { // from class: vqj.d.1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (editable.length() == 1 && ".".equals(editable.toString())) {
                        d.this.d.setText("");
                        d.this.g.setEnabled(false);
                    } else if (TextUtils.isEmpty(editable.toString())) {
                        d.this.g.setEnabled(false);
                    } else {
                        d.this.g.setEnabled(true);
                    }
                    if (editable.length() > 1 && d.this.d.getText().toString().indexOf(".") >= 0 && d.this.d.getText().toString().indexOf(".", d.this.d.getText().toString().indexOf(".") + 1) > 0) {
                        d.this.d.setText(d.this.d.getText().toString().substring(0, d.this.d.getText().toString().length() - 1));
                        d.this.d.setSelection(d.this.d.getText().toString().length());
                    }
                    String string = editable.toString();
                    int iIndexOf = string.indexOf(".");
                    if (iIndexOf > 0 && (string.length() - iIndexOf) - 1 > 2) {
                        editable.delete(iIndexOf + 3, iIndexOf + 4);
                    }
                }
            });
        }

        private void b(View view) {
            int i;
            EditText editText = (EditText) view.findViewById(R.id.custom_target_editText);
            this.d = editText;
            editText.setInputType(8194);
            this.f51456b = (ImageView) view.findViewById(R.id.custom_target_under_line);
            this.d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: vqj.d.2
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view2, boolean z) {
                    if (d.this.f51457c != null) {
                        d.this.f51456b.setBackgroundColor(d.this.f51457c.getResources().getColor(R.color.listDivider));
                    }
                }
            });
            new Timer("Track_InputHistoryDataSportDistanceDialog").schedule(new TimerTask() { // from class: vqj.d.4
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Object systemService = d.this.d.getContext().getSystemService("input_method");
                    if (systemService instanceof InputMethodManager) {
                        ((InputMethodManager) systemService).showSoftInput(d.this.d, 0);
                    }
                }
            }, 300L);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.custom_target_unit);
            healthTextView.setVisibility(0);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.custom_target_tip);
            this.e = healthTextView2;
            healthTextView2.setVisibility(8);
            int i2 = this.i;
            if (i2 == 262 || i2 == 266) {
                if (!UnitUtil.f()) {
                    String string = this.f51457c.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
                    this.h = string;
                    healthTextView.setText(string);
                } else {
                    String quantityString = this.f51457c.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, 0);
                    this.h = quantityString;
                    healthTextView.setText(quantityString);
                }
                i = 9;
            } else {
                if (UnitUtil.f()) {
                    String string2 = this.f51457c.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
                    this.h = string2;
                    healthTextView.setText(string2);
                } else {
                    String string3 = this.f51457c.getResources().getString(R.string.IDS_band_data_sport_distance_unit);
                    this.h = string3;
                    healthTextView.setText(string3);
                }
                i = 6;
            }
            this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }

        private void e(String str, Context context) {
            Toast toast = this.f;
            if (toast == null) {
                this.f = Toast.makeText(context.getApplicationContext(), str, 1);
            } else {
                toast.setText(str);
                this.f.setDuration(1);
            }
            this.f.show();
        }
    }
}

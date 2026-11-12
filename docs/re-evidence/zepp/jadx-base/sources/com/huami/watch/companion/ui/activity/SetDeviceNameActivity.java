package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.ToastWithIcon;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes16.dex */
public class SetDeviceNameActivity extends Activity {
    private static final String f = "SetDeviceNameActivity";
    private EditText b;
    private View c;
    private String d;
    private final int a = 30;
    private TextWatcher e = new a();

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int selectionStart = SetDeviceNameActivity.this.b.getSelectionStart();
            long jG = SetDeviceNameActivity.this.g();
            if (jG == 0 && SetDeviceNameActivity.this.c.isEnabled()) {
                SetDeviceNameActivity.this.c.setEnabled(false);
                return;
            }
            if (jG >= 0 && !SetDeviceNameActivity.this.c.isEnabled()) {
                SetDeviceNameActivity.this.c.setEnabled(true);
            }
            if (jG > 30) {
                editable.delete(30, (int) jG);
                SetDeviceNameActivity.this.b.setText(editable);
                if (selectionStart <= editable.length()) {
                    SetDeviceNameActivity.this.b.setSelection(selectionStart);
                } else {
                    SetDeviceNameActivity.this.b.setSelection(editable.length());
                }
                SetDeviceNameActivity setDeviceNameActivity = SetDeviceNameActivity.this;
                ToastWithIcon.show(setDeviceNameActivity, setDeviceNameActivity.getString(R.string.userinfo_nickname_too_long), R.drawable.popup_warning_icon, 0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SetDeviceNameActivity setDeviceNameActivity = SetDeviceNameActivity.this;
            setDeviceNameActivity.i(setDeviceNameActivity.d, SetDeviceNameActivity.this.b.getText().toString());
            SetDeviceNameActivity.this.finish();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SetDeviceNameActivity.this.onBackPressed();
        }
    }

    private String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = UserSettings.get(getContentResolver(), UserSettingsKeys.KEY_DEVICE_NAME);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return new JSONObject(str2).optString(str, "");
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        return this.b.getText().toString().length();
    }

    private void h() {
        int i = R.id.image_commit;
        this.c = findViewById(i);
        int i2 = R.id.nickname_edit_box;
        this.b = (EditText) findViewById(i2);
        String stringExtra = getIntent().getStringExtra("device_id");
        this.d = stringExtra;
        String strF = f(stringExtra);
        this.c = findViewById(i);
        this.b = (EditText) findViewById(i2);
        if (TextUtils.isEmpty(strF)) {
            this.b.setHint(getString(R.string.plz_input_nickname));
            this.c.setEnabled(false);
        } else {
            this.b.setText(strF);
        }
        this.c.setOnClickListener(new b());
        this.b.addTextChangedListener(this.e);
        EditText editText = this.b;
        editText.setSelection(editText.getText().length());
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.watch_name_info));
        actionbarLayout.setBackArrowClickListener(new c());
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.b, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, String str2) {
        ContentResolver contentResolver = getContentResolver();
        String str3 = UserSettings.get(contentResolver, UserSettingsKeys.KEY_DEVICE_NAME);
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        String string = MessageFormatter.c;
        if (zIsEmpty) {
            str3 = MessageFormatter.c;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            jSONObject.put(str, str2);
            string = jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d(f, "saveDeviceName : " + string, new Object[0]);
        UserSettings.put(contentResolver, UserSettingsKeys.KEY_DEVICE_NAME, string);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_set_device_name);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        h();
    }
}

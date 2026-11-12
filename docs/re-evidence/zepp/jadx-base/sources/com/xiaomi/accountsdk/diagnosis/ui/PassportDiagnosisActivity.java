package com.xiaomi.accountsdk.diagnosis.ui;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.xiaomi.accountsdk.diagnosis.DiagnosisController;
import com.xiaomi.accountsdk.diagnosis.R;

/* JADX INFO: loaded from: classes18.dex */
public class PassportDiagnosisActivity extends AppCompatActivity {
    private ScrollView a;
    private View b;
    private View c;
    private ProgressDialog e;
    private CompoundButton.OnCheckedChangeListener d = new a();
    private volatile boolean f = false;
    private View.OnClickListener g = new b();

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.xiaomi.accountsdk.diagnosis.e.a.a(DiagnosisController.getApplicationContext(), z);
            PassportDiagnosisActivity.this.e(z);
        }
    }

    public class b implements View.OnClickListener {

        public class a implements com.xiaomi.accountsdk.diagnosis.c.a.InterfaceC0766a {
            public a() {
            }

            @Override // com.xiaomi.accountsdk.diagnosis.c.a.InterfaceC0766a
            public void onFinished(boolean z, String str) {
                PassportDiagnosisActivity.this.f = false;
                if (PassportDiagnosisActivity.this.e != null) {
                    PassportDiagnosisActivity.this.e.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(PassportDiagnosisActivity.this);
                builder.setMessage((!z || TextUtils.isEmpty(str)) ? PassportDiagnosisActivity.this.getString(R.string.diagnosis_log_send_failed) : PassportDiagnosisActivity.this.getString(R.string.diagnosis_log_sent_format, new Object[]{str}));
                builder.setNeutralButton(R.string.ok, (DialogInterface.OnClickListener) null);
                builder.setCancelable(false);
                builder.show();
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PassportDiagnosisActivity.this.f) {
                return;
            }
            PassportDiagnosisActivity.this.e = new ProgressDialog(PassportDiagnosisActivity.this);
            PassportDiagnosisActivity.this.e.setMessage(PassportDiagnosisActivity.this.getString(R.string.sending));
            PassportDiagnosisActivity.this.e.setCancelable(false);
            PassportDiagnosisActivity.this.e.getWindow().setGravity(80);
            PassportDiagnosisActivity.this.e.show();
            PassportDiagnosisActivity.this.f = true;
            new com.xiaomi.accountsdk.diagnosis.c.a(new a(), false).execute(new Void[0]);
        }
    }

    public class c implements com.xiaomi.accountsdk.diagnosis.c.b.a {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                PassportDiagnosisActivity.this.a.fullScroll(130);
            }
        }

        public c() {
        }

        @Override // com.xiaomi.accountsdk.diagnosis.c.b.a
        public void onReadLog(String str) {
            ((TextView) PassportDiagnosisActivity.this.findViewById(R.id.tv_log)).setText(str);
            PassportDiagnosisActivity.this.a.post(new a());
        }
    }

    public static class d implements com.xiaomi.accountsdk.diagnosis.c {
        public final /* synthetic */ Context a;

        public d(Context context) {
            this.a = context;
        }

        @Override // com.xiaomi.accountsdk.diagnosis.c
        public void onError() {
            Toast.makeText(this.a, R.string.temporary_not_available, 0).show();
        }

        @Override // com.xiaomi.accountsdk.diagnosis.c
        public void onLaunch() {
            this.a.startActivity(new Intent(this.a, (Class<?>) PassportDiagnosisActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        int i = z ? 0 : 8;
        this.a.setVisibility(i);
        this.b.setVisibility(i);
        this.c.setVisibility(i);
    }

    private static boolean f() {
        return com.xiaomi.accountsdk.diagnosis.e.a.a(DiagnosisController.getApplicationContext());
    }

    private void i() {
        new com.xiaomi.accountsdk.diagnosis.c.b(this, new c(), 512).execute(new Void[0]);
    }

    public static void start(Context context) {
        DiagnosisController.get().checkStart(new d(context));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.passport_diagnosis);
        this.a = (ScrollView) findViewById(R.id.log_scroller);
        this.c = findViewById(R.id.upload_diagnosis);
        this.b = findViewById(R.id.footer);
        CompoundButton compoundButton = (CompoundButton) findViewById(R.id.switch_diagnosis);
        compoundButton.setChecked(f());
        compoundButton.setOnCheckedChangeListener(this.d);
        this.c.setOnClickListener(this.g);
        i();
        e(f());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

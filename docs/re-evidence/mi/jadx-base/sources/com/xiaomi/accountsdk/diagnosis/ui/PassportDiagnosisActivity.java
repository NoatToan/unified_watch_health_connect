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
import com.xiaomi.accountsdk.diagnosis.c;
import com.xiaomi.accountsdk.diagnosis.c.b;
import com.xiaomi.accountsdk.diagnosis.e.a;

/* JADX INFO: loaded from: classes6.dex */
public class PassportDiagnosisActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScrollView f10851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f10852b;
    private View c;
    private ProgressDialog e;
    private CompoundButton.OnCheckedChangeListener d = new CompoundButton.OnCheckedChangeListener() { // from class: com.xiaomi.accountsdk.diagnosis.ui.PassportDiagnosisActivity.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            a.a(DiagnosisController.getApplicationContext(), z);
            PassportDiagnosisActivity.this.a(z);
        }
    };
    private volatile boolean f = false;
    private View.OnClickListener g = new View.OnClickListener() { // from class: com.xiaomi.accountsdk.diagnosis.ui.PassportDiagnosisActivity.2
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
            new com.xiaomi.accountsdk.diagnosis.c.a(new com.xiaomi.accountsdk.diagnosis.c.a.InterfaceC0343a() { // from class: com.xiaomi.accountsdk.diagnosis.ui.PassportDiagnosisActivity.2.1
                @Override // com.xiaomi.accountsdk.diagnosis.c.a.InterfaceC0343a
                public void onFinished(boolean z, String str) {
                    PassportDiagnosisActivity.this.f = false;
                    if (PassportDiagnosisActivity.this.e != null) {
                        PassportDiagnosisActivity.this.e.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(PassportDiagnosisActivity.this);
                    builder.setMessage((!z || TextUtils.isEmpty(str)) ? PassportDiagnosisActivity.this.getString(R.string.diagnosis_log_send_failed) : PassportDiagnosisActivity.this.getString(R.string.diagnosis_log_sent_format, str));
                    builder.setNeutralButton(R.string.ok, (DialogInterface.OnClickListener) null);
                    builder.setCancelable(false);
                    builder.show();
                }
            }, false).execute(new Void[0]);
        }
    };

    public static void start(final Context context) {
        DiagnosisController.get().checkStart(new c() { // from class: com.xiaomi.accountsdk.diagnosis.ui.PassportDiagnosisActivity.4
            @Override // com.xiaomi.accountsdk.diagnosis.c
            public void onError() {
                Toast.makeText(context, R.string.temporary_not_available, 0).show();
            }

            @Override // com.xiaomi.accountsdk.diagnosis.c
            public void onLaunch() {
                context.startActivity(new Intent(context, (Class<?>) PassportDiagnosisActivity.class));
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.passport_diagnosis);
        this.f10851a = (ScrollView) findViewById(R.id.log_scroller);
        this.c = findViewById(R.id.upload_diagnosis);
        this.f10852b = findViewById(R.id.footer);
        CompoundButton compoundButton = (CompoundButton) findViewById(R.id.switch_diagnosis);
        compoundButton.setChecked(a());
        compoundButton.setOnCheckedChangeListener(this.d);
        this.c.setOnClickListener(this.g);
        b();
        a(a());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    private void b() {
        new b(this, new b.a() { // from class: com.xiaomi.accountsdk.diagnosis.ui.PassportDiagnosisActivity.3
            @Override // com.xiaomi.accountsdk.diagnosis.c.b.a
            public void onReadLog(String str) {
                ((TextView) PassportDiagnosisActivity.this.findViewById(R.id.tv_log)).setText(str);
                PassportDiagnosisActivity.this.f10851a.post(new Runnable() { // from class: com.xiaomi.accountsdk.diagnosis.ui.PassportDiagnosisActivity.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PassportDiagnosisActivity.this.f10851a.fullScroll(130);
                    }
                });
            }
        }, 512).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        int i = z ? 0 : 8;
        this.f10851a.setVisibility(i);
        this.f10852b.setVisibility(i);
        this.c.setVisibility(i);
    }

    private static boolean a() {
        return a.a(DiagnosisController.getApplicationContext());
    }
}

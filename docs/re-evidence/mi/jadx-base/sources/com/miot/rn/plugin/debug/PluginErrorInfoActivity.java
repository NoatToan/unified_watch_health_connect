package com.miot.rn.plugin.debug;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.smarthome.library.common.util.DisplayUtils;
import defpackage.lsi;
import defpackage.svi;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes5.dex */
public class PluginErrorInfoActivity extends FragmentActivity {
    public static void k(Context context, Throwable th) {
        Intent intent = new Intent(context, (Class<?>) PluginErrorInfoActivity.class);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        intent.putExtra("info", stringWriter.toString());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        DisplayUtils.fixScreenOrientationIfNeeded(this);
        super.onCreate(bundle);
        setContentView(svi.c);
        ((TextView) findViewById(lsi.c)).setText(getIntent().getStringExtra("info"));
    }
}

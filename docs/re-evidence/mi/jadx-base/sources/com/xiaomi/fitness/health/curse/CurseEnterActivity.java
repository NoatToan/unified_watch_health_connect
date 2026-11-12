package com.xiaomi.fitness.health.curse;

import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import defpackage.c0j;
import kotlin.Metadata;
import miuix.appcompat.app.AppCompatActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseEnterActivity;", "Lmiuix/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseEnterActivity extends AppCompatActivity {
    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!CurseExtKt.curseReady()) {
            ToastExtKt.toast$default(this, c0j.common_hint_network_unavailable, 0, 0, 0L, 14, null);
            finish();
            return;
        }
        CurseSetting setting = new CurseManager().readSetting();
        Logger.i("CurseEnterActivity", "onCreate: " + setting);
        Intent intent = new Intent(this, (Class<?>) (CurseExtKt.isSettingMiss(setting) ? CurseResetActivity.class : CurseMainActivity.class));
        intent.putExtra("origin", getIntent().getStringExtra("origin"));
        startActivity(intent);
        finish();
    }
}

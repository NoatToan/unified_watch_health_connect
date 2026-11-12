package com.xiaomi.fitness.userinfo.medicalid.view;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.userinfo.medicalid.util.PermissionManager;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdLockShowSolveActivity;
import defpackage.hsi;
import defpackage.nvi;
import defpackage.o1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/view/MedicalIdLockShowSolveActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalIdLockShowSolveActivity extends BaseActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MedicalIdLockShowSolveActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionManager.INSTANCE.openPermissionEditorPage(this$0);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return nvi.v;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(o1j.m0);
        ((TextView) findViewById(hsi.w1)).setOnClickListener(new View.OnClickListener() { // from class: nnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedicalIdLockShowSolveActivity.onCreate$lambda$0(this.f28089a, view);
            }
        });
    }
}

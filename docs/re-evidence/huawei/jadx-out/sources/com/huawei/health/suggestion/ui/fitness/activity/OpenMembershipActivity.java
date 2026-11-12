package com.huawei.health.suggestion.ui.fitness.activity;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.h5pro.CourseControlManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.pcd;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes9.dex */
public class OpenMembershipActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setGravity(80);
        window.setBackgroundDrawable(ContextCompat.getDrawable(this, R.color.transparent));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.huawei.health.suggestion.ui.fitness.activity.OpenMembershipActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.d.a((ActivityResult) obj);
            }
        });
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.d(), Class.forName("com.huawei.ui.main.stories.member.MemberTypeSelectActivity").getName());
            intent.putExtra("MEMBER_TYPE_SELECT_INDEX", 0);
            activityResultLauncherRegisterForActivityResult.launch(intent);
        } catch (ClassNotFoundException e) {
            LogUtil.e("OpenMembershipActivity", "ClassNotFoundException:", ExceptionUtils.c(e));
            finish();
        }
    }

    /* synthetic */ void a(ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        LogUtil.a("OpenMembershipActivity", "registerForActivityResult resultCode:", Integer.valueOf(resultCode));
        if (resultCode == -1) {
            a();
        }
        finish();
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("OpenMembershipActivity", "intent is null");
            return;
        }
        String stringExtra = intent.getStringExtra("long_coach_video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("OpenMembershipActivity", "videoUrl isEmpty");
            return;
        }
        AbstractMap.SimpleEntry<FitWorkout, pcd> fitAndJumpMap = CourseControlManager.getFitAndJumpMap();
        if (fitAndJumpMap == null) {
            LogUtil.j("OpenMembershipActivity", "fitAndJumpMap is null");
            return;
        }
        pcd value = fitAndJumpMap.getValue();
        if (value == null) {
            LogUtil.j("OpenMembershipActivity", "parameter null");
        } else if (!stringExtra.equals(value.j())) {
            LogUtil.j("OpenMembershipActivity", "videoUrl is not equals");
        } else {
            CourseControlManager.startLongCoachActivity(this, fitAndJumpMap.getKey(), value);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

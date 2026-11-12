package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.soical.BaseSocialFragment;
import com.huawei.ui.main.stories.soical.NewSocialFragment;
import com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi;
import com.huawei.ui.main.stories.soical.activity.FunctionMenuActivity;
import com.huawei.ui.main.stories.soical.activity.SocialAssessmentActivity;
import com.huawei.ui.main.stories.soical.store.StoreDemoNewSocialFragment;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = SocialFragmentFactoryApi.class)
@Singleton
public class woh implements SocialFragmentFactoryApi {
    @Override // com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi
    public Fragment getStoreDemoNewSocialFragment() {
        return new StoreDemoNewSocialFragment();
    }

    @Override // com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi
    public BaseSocialFragment getNewSocialFragment() {
        return new NewSocialFragment();
    }

    @Override // com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi
    public void goFunctionMenu(Context context, int i) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) FunctionMenuActivity.class);
        intent.putExtra("contentType", i);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("SocialFragmentFactoryImpl", e.getMessage());
        }
    }

    @Override // com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi
    public void goHealthEvaluation(Context context) {
        if (context == null) {
            return;
        }
        try {
            context.startActivity(new Intent(context, (Class<?>) SocialAssessmentActivity.class));
        } catch (ActivityNotFoundException e) {
            LogUtil.e("goHealthEvaluation exception", e.getMessage());
        }
    }

    @Override // com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi
    public boolean isValidResource(long j, long j2) {
        return wvg.a(j, j2);
    }
}

package defpackage;

import android.content.Context;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.ui.main.stories.about.AboutApi;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = AboutApi.class)
@Singleton
public class tqr implements AboutApi {
    @Override // com.huawei.ui.main.stories.about.AboutApi
    public String getAw70HelpUrl(int i, Context context) {
        return tqu.e().d(i, context);
    }

    @Override // com.huawei.ui.main.stories.about.AboutApi
    public String adaptUrlInMessageCenter(Context context, int i, String str) {
        return tqu.e().a(context, i, str);
    }
}

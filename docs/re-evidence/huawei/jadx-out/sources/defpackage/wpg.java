package defpackage;

import android.text.TextUtils;
import com.huawei.ui.main.stories.template.BaseParser;

/* JADX INFO: loaded from: classes19.dex */
public class wpg {
    public static BaseParser a(String str) {
        if (TextUtils.equals(str, "HealthDetailCommonTemplate")) {
            return new wql();
        }
        if (TextUtils.equals(str, "SportTabConstructor")) {
            return new wqi();
        }
        if (TextUtils.equals(str, "PrivacyDetailTemplate")) {
            return new wid();
        }
        return null;
    }
}

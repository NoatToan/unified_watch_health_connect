package defpackage;

import android.text.TextUtils;
import com.huawei.picture.security.account.bean.AuthErrorBean;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class oqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<AuthErrorBean> f44386a;

    private oqy() {
        this.f44386a = new CopyOnWriteArrayList();
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final oqy f44387b = new oqy();
    }

    public static oqy a() {
        return b.f44387b;
    }

    public boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ork.a("AuthErrorHelper", "isNeedRefreshToken url empty: " + TextUtils.isEmpty(str) + " ;result empty: " + TextUtils.isEmpty(str2));
            return false;
        }
        try {
            String path = new URL(str).getPath();
            JSONObject jSONObject = new JSONObject(str2);
            for (AuthErrorBean authErrorBean : this.f44386a) {
                if (path.equals(authErrorBean.getPath()) && jSONObject.optString(authErrorBean.getCodeKey()).equals(authErrorBean.getCodeValue()) && (TextUtils.isEmpty(authErrorBean.getMsgKey()) || TextUtils.isEmpty(authErrorBean.getMsgValue()) || jSONObject.optString(authErrorBean.getMsgKey()).equals(authErrorBean.getMsgValue()))) {
                    return true;
                }
            }
        } catch (Exception e) {
            ork.a("AuthErrorHelper", "isNeedRefreshToken Exception: ", e);
        }
        return false;
    }

    public void e(List<AuthErrorBean> list) {
        b();
        if (ord.e(list)) {
            return;
        }
        ork.a("AuthErrorHelper", "updateAuthErrorList authErrorStrList " + list.size());
        for (AuthErrorBean authErrorBean : list) {
            if (authErrorBean != null) {
                this.f44386a.add(authErrorBean);
            }
        }
    }

    private void b() {
        this.f44386a.clear();
    }
}

package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.tencent.open.SocialOperation;
import health.compact.a.LogAnonymous;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mna {
    public static mmz e(String str) {
        mmz mmzVar = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ParseSonyJson", "parseJsonToEphemerisUrlBean jsonString is empty");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                LogUtil.j("ParseSonyJson", "parseJsonToEphemerisUrlBean jsonArray length is zero");
                return null;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            mmz mmzVar2 = new mmz();
            try {
                if (jSONObject.has(RecommendConstants.DOWNLOAD_URL)) {
                    mmzVar2.b(jSONObject.getString(RecommendConstants.DOWNLOAD_URL));
                } else {
                    mmzVar2.b(null);
                }
                if (jSONObject.has(RecommendConstants.VER)) {
                    mmzVar2.d(jSONObject.getString(RecommendConstants.VER));
                } else {
                    mmzVar2.d(null);
                }
                if (jSONObject.has(SocialOperation.GAME_SIGNATURE)) {
                    mmzVar2.a(jSONObject.getString(SocialOperation.GAME_SIGNATURE));
                } else {
                    mmzVar2.a(null);
                }
                if (jSONObject.has(RecommendConstants.FILE_ID)) {
                    mmzVar2.c(jSONObject.getString(RecommendConstants.FILE_ID));
                    return mmzVar2;
                }
                mmzVar2.c(null);
                return mmzVar2;
            } catch (JSONException e) {
                e = e;
                mmzVar = mmzVar2;
                LogUtil.e("ParseSonyJson", "EphemerisUrlSonyEntity exception : ", LogAnonymous.b(e));
                return mmzVar;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }
}

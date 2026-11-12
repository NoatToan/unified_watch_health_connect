package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.ads.fund.util.StringUtils;
import com.huawei.openalliance.ad.constant.AdConfigMapKey;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class aym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f796a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static aym f797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f798c;

    public int j(String str) {
        return h(str).getInt(AdConfigMapKey.DUPLICATE_TIME, 1);
    }

    public int g(String str) {
        return h(str).getInt(AdConfigMapKey.RECOMMEND_STRATEGY, 0);
    }

    public int a(String str) {
        return h(str).getInt(AdConfigMapKey.RECALL_STRATEGY, 0);
    }

    public int b(String str) {
        return h(str).getInt("rankStrategy", 4);
    }

    public int d(String str) {
        return h(str).getInt(AdConfigMapKey.FEEDBACK_ENABLED, 1);
    }

    public int e(String str) {
        return h(str).getInt(AdConfigMapKey.RECALL_RANK_ENABLED, 0);
    }

    public void a(String str, JSONObject jSONObject, ayc aycVar) {
        SharedPreferences.Editor editorEdit = h(str).edit();
        Integer integer = StringUtils.toInteger(jSONObject.optString(AdConfigMapKey.RECALL_STRATEGY));
        editorEdit.putInt(AdConfigMapKey.RECALL_STRATEGY, integer != null ? integer.intValue() : 0);
        Integer integer2 = StringUtils.toInteger(jSONObject.optString(AdConfigMapKey.RECOMMEND_STRATEGY));
        editorEdit.putInt(AdConfigMapKey.RECOMMEND_STRATEGY, integer2 != null ? integer2.intValue() : 0);
        Integer integer3 = StringUtils.toInteger(jSONObject.optString(AdConfigMapKey.DUPLICATE_TIME));
        editorEdit.putInt(AdConfigMapKey.DUPLICATE_TIME, integer3 != null ? integer3.intValue() : 1);
        Integer integer4 = StringUtils.toInteger(jSONObject.optString(AdConfigMapKey.IMP_MAX_COUNT));
        editorEdit.putInt(AdConfigMapKey.IMP_MAX_COUNT, integer4 != null ? integer4.intValue() : 2);
        Integer integer5 = StringUtils.toInteger(jSONObject.optString(AdConfigMapKey.FEEDBACK_ENABLED));
        editorEdit.putInt(AdConfigMapKey.FEEDBACK_ENABLED, integer5 != null ? integer5.intValue() : 1);
        editorEdit.putString(AdConfigMapKey.RECOMMEND_TASK_LIST, jSONObject.optString(AdConfigMapKey.RECOMMEND_TASK_LIST, "2,3"));
        Integer integer6 = StringUtils.toInteger(jSONObject.optString(AdConfigMapKey.RECALL_RANK_ENABLED));
        editorEdit.putInt(AdConfigMapKey.RECALL_RANK_ENABLED, integer6 != null ? integer6.intValue() : 0);
        Integer integer7 = StringUtils.toInteger(jSONObject.optString("rankStrategy"));
        editorEdit.putInt("rankStrategy", integer7 != null ? integer7.intValue() : 4);
        Integer integer8 = StringUtils.toInteger(jSONObject.optString("reqMaxCount"));
        Integer integer9 = StringUtils.toInteger(jSONObject.optString("extraAdCount"));
        if (aycVar != null) {
            aycVar.c(str, integer8);
            aycVar.e(str, integer9);
        }
        editorEdit.apply();
    }

    public int c(String str) {
        return h(str).getInt(AdConfigMapKey.IMP_MAX_COUNT, 2);
    }

    private SharedPreferences h(String str) {
        return this.f798c.getSharedPreferences("hiad_rec_slot_cfg_" + str, 0);
    }

    private static aym d(Context context) {
        aym aymVar;
        synchronized (f796a) {
            if (f797b == null) {
                f797b = new aym(context);
            }
            aymVar = f797b;
        }
        return aymVar;
    }

    public static aym b(Context context) {
        return d(context);
    }

    private aym(Context context) {
        this.f798c = ayp.b(context);
    }
}

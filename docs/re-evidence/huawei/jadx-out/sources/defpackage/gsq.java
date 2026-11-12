package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.receiver.GprsBloodSugarPushReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gsq implements IpushBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f35991b;

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("3001");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            ReleaseLogUtil.a("DEVMGR_GprsAdapterPushReceiver", "processPushMsg message is null return.");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_GprsAdapterPushReceiver", "processPushMsg message:", str);
        this.f35991b = context;
        b(str);
    }

    private void b(String str) {
        try {
            e eVar = new e();
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString(CommonUtil.MSG_CONTENT));
            eVar.d = jSONObject.getInt("pointCount");
            eVar.f35993b = jSONObject.getString("dataType");
            JSONArray jSONArray = jSONObject.getJSONArray("endTimeList");
            eVar.f35992a = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                eVar.f35992a.add(Long.valueOf(jSONArray.getLong(i)));
            }
            d(eVar);
        } catch (NumberFormatException | JSONException unused) {
            LogUtil.e("GprsAdapterPushReceiver", "messageJson parse exception.");
        }
    }

    private void d(e eVar) {
        int i = Integer.parseInt(eVar.f35993b);
        if (i == 4) {
            LogUtil.a("GprsAdapterPushReceiver", "Start processing blood sugar data");
            new GprsBloodSugarPushReceiver().processPushMsg(this.f35991b, eVar);
        } else if (i == 5) {
            LogUtil.a("GprsAdapterPushReceiver", "Start processing blood pressure data");
            new gso().processPushMsg(this.f35991b, eVar);
        } else if (i == 700012) {
            LogUtil.a("GprsAdapterPushReceiver", "Start processing ventilator data");
            new gsv().processPushMsg(this.f35991b, eVar);
        } else {
            LogUtil.a("GprsAdapterPushReceiver", "Other data, dataType = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Long> f35992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f35993b;
        int d;

        e() {
        }
    }
}

package defpackage;

import android.content.Context;
import com.alipay.sdk.m.j0.a;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f40182a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f40183c;

    public void a(Context context) {
        new Thread(new lk(this)).start();
    }

    public final void e() {
        synchronized (this) {
            File file = this.f40183c;
            if (file == null) {
                return;
            }
            if (file.exists() && this.f40183c.isDirectory() && this.f40183c.list().length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f40183c.list()) {
                    arrayList.add(str);
                }
                Collections.sort(arrayList);
                String str2 = (String) arrayList.get(arrayList.size() - 1);
                int size = arrayList.size();
                if (str2.equals(b())) {
                    if (arrayList.size() < 2) {
                        return;
                    }
                    str2 = (String) arrayList.get(arrayList.size() - 2);
                    size--;
                }
                if (!this.f40182a.logCollect(b(kl.e(this.f40183c.getAbsolutePath(), str2)))) {
                    size--;
                }
                for (int i = 0; i < size; i++) {
                    new File(this.f40183c, (String) arrayList.get(i)).delete();
                }
            }
        }
    }

    public static String b() {
        return new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log";
    }

    public static String b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put(VastAttribute.ERROR, str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public li(String str, a aVar) {
        this.f40183c = null;
        this.f40182a = null;
        this.f40183c = new File(str);
        this.f40182a = aVar;
    }
}

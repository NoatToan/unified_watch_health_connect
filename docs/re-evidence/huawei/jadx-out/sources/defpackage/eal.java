package defpackage;

import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class eal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<eaj> f32579a;
    private String e;

    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public ArrayList<eaj> e() {
        return this.f32579a;
    }

    public void b(ArrayList<eaj> arrayList) {
        this.f32579a = arrayList;
    }

    public void d(eaj eajVar) {
        if (this.f32579a == null) {
            this.f32579a = new ArrayList<>(16);
        }
        this.f32579a.add(eajVar);
    }

    public void e(String str, String str2, String str3) {
        if (this.f32579a == null) {
            this.f32579a = new ArrayList<>(16);
        }
        eaj eajVar = new eaj();
        eajVar.c(str);
        eajVar.b(str2);
        eajVar.d(str3);
        this.f32579a.add(eajVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DeviceUserInfo{mDeviceId ='");
        String str = this.e;
        String string = Constants.NULL;
        stringBuffer.append(str == null ? Constants.NULL : dyg.b(str)).append("'mUsers ='");
        ArrayList<eaj> arrayList = this.f32579a;
        if (arrayList != null) {
            string = arrayList.toString();
        }
        stringBuffer.append(string).append("'}");
        return stringBuffer.toString();
    }

    public boolean b() {
        ArrayList<eaj> arrayList;
        return TextUtils.isEmpty(this.e) || (arrayList = this.f32579a) == null || arrayList.size() <= 0;
    }
}

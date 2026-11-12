package lg;

import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import o72.t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f112149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rg.a f112150b;

    public b(String str, rg.a aVar) {
        this.f112149a = null;
        this.f112150b = null;
        this.f112149a = new File(str);
        this.f112150b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    public static void a(b bVar) {
        String string;
        BugTrackMessageService bugTrackMessageService;
        String strLogCollect;
        boolean zBooleanValue;
        synchronized (bVar) {
            try {
                File file = bVar.f112149a;
                if (file == null) {
                    return;
                }
                if (file.exists() && bVar.f112149a.isDirectory() && bVar.f112149a.list().length != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : bVar.f112149a.list()) {
                        arrayList.add(str);
                    }
                    Collections.sort(arrayList);
                    String str2 = (String) arrayList.get(arrayList.size() - 1);
                    int size = arrayList.size();
                    if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                        if (arrayList.size() < 2) {
                            return;
                        }
                        str2 = (String) arrayList.get(arrayList.size() - 2);
                        size--;
                    }
                    String strJ = t.j(bVar.f112149a.getAbsolutePath(), str2);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(NotificationConstants.KEY_DATA_MIME_TYPE, TtmlNode.ATTR_ID);
                        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, strJ);
                        string = jSONObject.toString();
                    } catch (Exception unused) {
                        string = "";
                    }
                    ((rg.b) bVar.f112150b).getClass();
                    mg.b bVar2 = rg.b.f152502b;
                    bVar2.getClass();
                    if (oi0.c.g(string) || (bugTrackMessageService = bVar2.f118361a) == null) {
                        zBooleanValue = false;
                    } else {
                        try {
                            strLogCollect = bugTrackMessageService.logCollect(oi0.c.p(string));
                        } catch (Throwable unused2) {
                            strLogCollect = null;
                        }
                        if (oi0.c.g(strLogCollect)) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
                        }
                    }
                    if (!zBooleanValue) {
                        size--;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        new File(bVar.f112149a, (String) arrayList.get(i14)).delete();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerImpl;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class rr3 extends w7r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f32816b = Arrays.asList("/pay_result", "/manager", "issue_mi", "delete");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NfcManager f32817a = new NfcManagerImpl();

    @Override // defpackage.w7r
    public String authority() {
        return "card";
    }

    @Override // defpackage.w7r
    public void doProcess(Context context, Uri uri) {
        String path = uri.getPath();
        if ("/pay_result".equals(path)) {
            this.f32817a.gotoRechargeActivity(context);
            return;
        }
        if ("/manager".equals(path)) {
            this.f32817a.gotoCardManagerPage(context, false);
            return;
        }
        if ("/issue_mi".equals(path)) {
            String queryParameter = uri.getQueryParameter("token");
            this.f32817a.gotoIssueActivityByUri(context, Uri.parse("miwear://card?action=issue&type=MIFARE_ENTRANCE&source_channel=MiEr&product_id=59012-40001&did=" + queryParameter.substring(queryParameter.lastIndexOf(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR) + 1) + "&token=" + queryParameter));
            return;
        }
        if ("/delete".equals(path)) {
            String queryParameter2 = uri.getQueryParameter("did");
            if (TextUtils.isEmpty(queryParameter2)) {
                this.f32817a.gotoCardManagerPage(context, true);
                return;
            }
            this.f32817a.gotoIssueActivityByUri(context, Uri.parse("miwear://card?action=delete&type=MIFARE_ENTRANCE&source_channel=MiEr&did=" + queryParameter2));
        }
    }
}

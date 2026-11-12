package x10;

import android.webkit.ValueCallback;
import androidx.appcompat.app.e;
import androidx.lifecycle.v1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.settings.ConnectIQAppSettingsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.google.maps.android.BuildConfig;
import d53.w;
import i3.e5;
import java.util.Locale;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.text.StringEscapeUtils;
import p005kotlin.jvm.internal.s;
import vu1.k;
import y10.f;
import y10.g;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectIQAppSettingsActivity f188371b;

    public /* synthetic */ a(ConnectIQAppSettingsActivity connectIQAppSettingsActivity, int i14) {
        this.f188370a = i14;
        this.f188371b = connectIQAppSettingsActivity;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i14 = this.f188370a;
        ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188371b;
        int i15 = 0;
        String str = (String) obj;
        switch (i14) {
            case 0:
                ConnectIQAppSettingsActivity.a aVar = ConnectIQAppSettingsActivity.f32003k;
                if (!s.g(str, BooleanUtils.TRUE)) {
                    new e.a(connectIQAppSettingsActivity).setCancelable(false).setTitle(R.string.lbl_exit_settings_question).setMessage(R.string.lbl_exit_settings_message_question).setPositiveButton(R.string.lbl_exit, new b(connectIQAppSettingsActivity, i15)).setNegativeButton(R.string.lbl_cancel, new k(11)).show();
                }
                break;
            default:
                ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                String strUnescapeJson = StringEscapeUtils.unescapeJson(str);
                strUnescapeJson.getClass();
                String strJ0 = w.j0(strUnescapeJson, CoreConstants.DOUBLE_QUOTE_CHAR);
                if (connectIQAppSettingsActivity.f32008e != null && connectIQAppSettingsActivity.f32011h != null && connectIQAppSettingsActivity.f32009f != null && !s.g(str, BuildConfig.TRAVIS)) {
                    String strG = e5.g(Locale.getDefault().getLanguage(), "-", Locale.getDefault().getCountry());
                    f fVarEa = connectIQAppSettingsActivity.ea();
                    String str2 = connectIQAppSettingsActivity.f32008e;
                    String str3 = str2 == null ? "" : str2;
                    String str4 = connectIQAppSettingsActivity.f32009f;
                    String str5 = str4 == null ? "" : str4;
                    String str6 = connectIQAppSettingsActivity.f32011h;
                    String str7 = str6 == null ? "" : str6;
                    strJ0.getClass();
                    fVarEa.f193827f.m(g3.a.c(g3.f35298f));
                    ge1.b.T(v1.a(fVarEa), null, null, new g(fVarEa, strG, str3, str5, str7, strJ0, null), 3);
                    break;
                }
                break;
        }
    }
}

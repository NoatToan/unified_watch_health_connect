package vi1;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import f12.l;
import i3.e5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvi1/c;", "Lvi1/b;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f178430a;

    static {
        new a(null);
    }

    public c(l lVar) {
        lVar.getClass();
        this.f178430a = lVar;
    }

    @Override // vi1.b
    public final void a(boolean z14) {
        this.f178430a.O2("keyPrimaryPhoneIsValidMyInformation", z14);
    }

    @Override // vi1.b
    public final Boolean b() {
        String strA0 = this.f178430a.a0("key_user_geos_supported");
        if (strA0.length() == 0) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(strA0));
    }

    @Override // vi1.b
    public final Boolean c() {
        return Boolean.valueOf(this.f178430a.W2("keyPrimaryPhoneIsValidMyInformation", false));
    }

    @Override // vi1.b
    public final void d(boolean z14) {
        this.f178430a.O2("keySecondaryPhoneIsValidMyInformation", z14);
    }

    @Override // vi1.b
    public final boolean e() {
        return this.f178430a.W2("key_user_has_seen_lte_my_information_screen", false);
    }

    @Override // vi1.b
    public final void f(String str, String str2) {
        str.getClass();
        str2.getClass();
        HashMap mapH = h();
        if (mapH.isEmpty()) {
            mapH = new HashMap();
            mapH.put(str, str2);
        } else {
            mapH.put(str, str2);
        }
        this.f178430a.S("key_lte_subscription_transfer_devices", GsonUtil.a(mapH));
    }

    @Override // vi1.b
    public final Boolean g() {
        return Boolean.valueOf(this.f178430a.W2("keySecondaryPhoneIsValidMyInformation", false));
    }

    @Override // vi1.b
    public final LinkedHashMap h() {
        String strA0 = this.f178430a.a0("key_lte_subscription_transfer_devices");
        return strA0.length() == 0 ? new LinkedHashMap() : u0.n((Map) GsonUtil.f47253b.fromJson(strA0, Map.class));
    }

    @Override // vi1.b
    public final void i(boolean z14) {
        this.f178430a.O2("key_user_lte_billing_info_retrieved", z14);
    }

    @Override // vi1.b
    public final boolean j() {
        return this.f178430a.W2("key_user_lte_billing_info_retrieved", false);
    }

    @Override // vi1.b
    public final boolean k(long j8) {
        return this.f178430a.W2(e.e(j8, "key_lte_webview_activation_finished_device_"), false);
    }

    @Override // vi1.b
    public final boolean l() {
        return this.f178430a.W2("key_user_has_seen_emergency_contacts", false);
    }

    @Override // vi1.b
    public final void m(Boolean bool) {
        l lVar = this.f178430a;
        if (bool != null) {
            lVar.S("key_user_geos_supported", String.valueOf(bool.booleanValue()));
        } else {
            lVar.S("key_user_geos_supported", "");
        }
    }

    @Override // vi1.b
    public final void n(boolean z14) {
        this.f178430a.O2("key_user_has_seen_lte_my_information_screen", z14);
    }

    @Override // vi1.b
    public final void o(boolean z14) {
        this.f178430a.O2("key_user_has_seen_emergency_contacts", z14);
    }

    @Override // vi1.b
    public final void p(long j8, boolean z14) {
        this.f178430a.O2(e.e(j8, "key_lte_webview_activation_finished_device_"), z14);
    }

    @Override // vi1.b
    public final void q(String str) {
        str.getClass();
        LinkedHashMap linkedHashMapH = h();
        if (linkedHashMapH.containsKey(str)) {
            linkedHashMapH.remove(str);
            this.f178430a.S("key_lte_subscription_transfer_devices", GsonUtil.a(linkedHashMapH));
        }
    }

    public final void r(String str, String str2) {
        this.f178430a.S("key_show_non_supported_dialog", e5.g(str, ",", str2));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lvi1/c$a;", "", "<init>", "()V", "", "WEB_VIEW_ACTIVATION_FINISHED", "Ljava/lang/String;", "SHOW_COUNTRY_NON_SUPPORTED_DIALOG", "KEY_USER_HAS_SEEN_EMERGENCY_CONTACTS", "USER_HAS_SEEN_LTE_MY_INFORMATION_SCREEN", "USER_HAS_SEEN_MY_INFORMATION_SCREEN", "PRIMARY_PHONE_IS_VALID_MY_INFORMATION", "SECONDARY_PHONE_IS_VALID_MY_INFORMATION", "USER_LTE_BILLING_INFO_RETRIEVED", "KEY_SUB_TRANSFER_DEVICE_INFO", "KEY_USER_COUNTRY_GEOS_SUPPORTED", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

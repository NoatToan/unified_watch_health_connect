package com.braintreepayments.api;

import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import defpackage.tj;
import defpackage.tw;
import defpackage.ty;
import defpackage.uw;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zeu;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/Authorization;", "", "rawValue", "", "(Ljava/lang/String;)V", "bearer", "getBearer", "()Ljava/lang/String;", "configUrl", "getConfigUrl", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Authorization {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String rawValue;

    /* JADX INFO: renamed from: getBearer */
    public abstract String getE();

    /* JADX INFO: renamed from: getConfigUrl */
    public abstract String getF50627c();

    public Authorization(String str) {
        zcp.c(str, "");
        this.rawValue = str;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getRawValue() {
        return this.rawValue;
    }

    /* JADX INFO: renamed from: com.braintreepayments.api.Authorization$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/Authorization$Companion;", "", "()V", "fromString", "Lcom/braintreepayments/api/Authorization;", "authorizationString", "", "isClientToken", "", "clientToken", "isTokenizationKey", "tokenizationKey", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final boolean c(String str) {
            return new zeu("^[a-zA-Z0-9]+_[a-zA-Z0-9]+_[a-zA-Z0-9_]+$").e(str);
        }

        private final boolean b(String str) {
            return new zeu("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)").e(str);
        }

        @JvmStatic
        public final Authorization d(String str) {
            String string;
            if (str != null) {
                String str2 = str;
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = zcp.d((int) str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                string = str2.subSequence(i, length + 1).toString();
            } else {
                string = null;
            }
            if (string == null || TextUtils.isEmpty(str)) {
                String str3 = "Authorization provided is invalid: " + string;
                if (string == null) {
                    string = Constants.NULL;
                }
                return new ty(string, str3);
            }
            try {
                if (c(string)) {
                    return new uw(string);
                }
                if (b(string)) {
                    return new tj(string);
                }
                return new ty(string, "Authorization provided is invalid: " + string);
            } catch (tw e) {
                String message = e.getMessage();
                zcp.e((Object) message);
                return new ty(string, message);
            }
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final Authorization fromString(String str) {
        return INSTANCE.d(str);
    }
}

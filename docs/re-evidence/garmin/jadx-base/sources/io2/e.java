package io2;

import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio2/e;", "", "", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum e {
    PUSH_PROV_VISA_TAG("VISA"),
    PUSH_PROV_MCC_MASTER_CARD_CREDIT_TAG("MCC"),
    PUSH_PROV_DMC_MASTER_CARD_DEBIT_TAG("DMC"),
    PUSH_PROV_MSI_MAESTRO_TAG("MSI"),
    PUSH_PROV_PVL_PRIVATE_LABEL_TAG("PVL");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f94628b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94635a;

    e(String str) {
        this.f94635a = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio2/e$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

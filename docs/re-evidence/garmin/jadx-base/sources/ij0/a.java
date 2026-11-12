package ij0;

import com.garmin.device.nfc.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lij0/a;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93807a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h[] f93808b = {new h(h.c.TAG_CARD_IMAGE, new byte[]{0}), new h(h.c.TAG_CARD_IMAGE_HASH, new byte[]{0, 0, 0, 0, 0, 0, 0, 0}), h.g(0)};

    /* JADX INFO: renamed from: ij0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lij0/a$a;", "", "", "link", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC1792a {
        GARMINPAY_PRIVACY_POLICY(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).l().concat("/%1$s/privacy/garminpay/")),
        GARMINPAY_TERMS_CONDITION("https://webapp.fit-pay.com/terms");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93812a;

        EnumC1792a(String str) {
            this.f93812a = str;
        }
    }

    private a() {
    }
}

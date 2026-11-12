package pn2;

import android.util.Base64;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpn2/c;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f138766a = new c();

    private c() {
    }

    public static String a(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(d53.c.f57666b);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 11);
        strEncodeToString.getClass();
        return strEncodeToString;
    }
}

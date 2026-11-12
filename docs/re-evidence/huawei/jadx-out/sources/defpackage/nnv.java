package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class nnv extends nns {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nnv f43339b;

    public nnv(Context context, String str) {
        super(context, str);
    }

    public static nnv a(Context context) {
        nnv nnvVar;
        synchronized (nnv.class) {
            if (f43339b == null) {
                f43339b = new nnv(context, "HwIDAuthInfo");
            }
            nnvVar = f43339b;
        }
        return nnvVar;
    }
}

package se;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lse/i;", "Lse/g;", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f158733b = new i();

    private i() {
    }

    @Override // se.g
    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}

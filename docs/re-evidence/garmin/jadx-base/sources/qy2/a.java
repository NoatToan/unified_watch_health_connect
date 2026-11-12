package qy2;

import android.content.Intent;
import p005kotlin.Metadata;
import sy2.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqy2/a;", "", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f148592a = new a();

    private a() {
    }

    public static void a(a aVar, Intent intent, int i14) {
        boolean z14 = (i14 & 1) != 0;
        aVar.getClass();
        intent.putExtra("extra.synthesize.ui_review_config", new j(z14, true));
    }
}

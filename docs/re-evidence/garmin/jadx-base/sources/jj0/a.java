package jj0;

import android.content.Intent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pi2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljj0/a;", "Lpi2/f;", "Landroid/content/Intent;", "initializationData", "<init>", "(Landroid/content/Intent;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f98947a;

    public a(Intent intent) {
        super("FeatureInitializationFinishedEvent", null, 0, 0L, 14, null);
        this.f98947a = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(Intent intent, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : intent);
    }
}

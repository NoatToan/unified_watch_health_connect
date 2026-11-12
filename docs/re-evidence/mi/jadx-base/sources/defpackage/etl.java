package defpackage;

import com.xiaomi.continuity.channel.SendResultCallback;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class etl extends ayc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendResultCallback f17060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17061b;

    public etl(SendResultCallback sendResultCallback, Executor executor) {
        Objects.requireNonNull(sendResultCallback, "invalid null lListener");
        this.f17060a = sendResultCallback;
        this.f17061b = executor;
    }

    public final /* synthetic */ void h4(int i, String str) {
        this.f17060a.onResult(i, str);
    }

    @Override // defpackage.ayc
    public void onResult(final int i, final String str) {
        this.f17061b.execute(new Runnable() { // from class: dtl
            @Override // java.lang.Runnable
            public final void run() {
                this.f15923a.h4(i, str);
            }
        });
    }
}

package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class xft extends hft {
    public final /* synthetic */ Runnable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xft(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.d = runnable;
    }

    @Override // defpackage.hft
    public void a(Context context) {
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }
}

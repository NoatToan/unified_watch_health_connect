package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends ContextWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5240b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f5241a;

    private t0(Context context) {
        super(context);
        int i14 = b1.f5036c;
        this.f5241a = new v0(this, context.getResources());
    }

    public static void a(Context context) {
        if ((context instanceof t0) || (context.getResources() instanceof v0) || (context.getResources() instanceof b1)) {
            return;
        }
        int i14 = b1.f5036c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.f5241a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.f5241a;
    }
}

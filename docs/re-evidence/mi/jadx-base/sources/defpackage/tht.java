package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class tht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjt f34721a;

    public tht(bjt bjtVar) {
        this.f34721a = bjtVar;
    }

    public static final int b(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) uit.d(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("addAssetPath completed with ");
        sb.append(iIntValue);
        return iIntValue;
    }

    public final synchronized void a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b(assets, (File) it.next());
        }
    }
}

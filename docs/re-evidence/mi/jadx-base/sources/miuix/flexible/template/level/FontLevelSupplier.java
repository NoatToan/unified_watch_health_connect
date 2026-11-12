package miuix.flexible.template.level;

import android.content.Context;
import defpackage.s6g;

/* JADX INFO: loaded from: classes3.dex */
public class FontLevelSupplier implements LevelSupplier {
    public static final int LEVEL_LARGE = 2;
    public static final int LEVEL_NORMAL = 1;
    private final Context mContext;

    public FontLevelSupplier(Context context) {
        this.mContext = context;
    }

    @Override // miuix.flexible.template.level.LevelSupplier
    public int getLevel() {
        return s6g.f(this.mContext) == 1 ? 1 : 2;
    }
}

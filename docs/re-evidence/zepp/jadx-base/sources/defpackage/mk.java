package defpackage;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class mk implements Function {
    public static final /* synthetic */ mk a = new mk();

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).yieldIfContendedSafely());
    }
}

package com.xiaomi.fitness.dataprovider;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/DataUtils;", "", "<init>", "()V", "obtainEmptyCursor", "Landroid/database/Cursor;", "code", "", "extras", "Landroid/os/Bundle;", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataUtils {

    @NotNull
    public static final DataUtils INSTANCE = new DataUtils();

    private DataUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Cursor obtainEmptyCursor(int code, @Nullable Bundle extras) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[0], 0);
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putInt("code", code);
        matrixCursor.setExtras(extras);
        return matrixCursor;
    }
}

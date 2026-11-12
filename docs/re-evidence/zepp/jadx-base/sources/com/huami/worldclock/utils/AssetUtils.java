package com.huami.worldclock.utils;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/worldclock/utils/AssetUtils;", "", "", "fileName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "readAssetsFile", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class AssetUtils {

    @NotNull
    public static final AssetUtils INSTANCE = new AssetUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AssetUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    private AssetUtils() {
    }

    @Nullable
    public final String readAssetsFile(@NotNull String fileName, @NotNull Context context) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(fileName)));
            String strStringPlus = "";
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                strStringPlus = Intrinsics.stringPlus(strStringPlus, line);
            }
            return strStringPlus;
        } catch (Exception e) {
            HMLog.info(TAG, new a(e));
            return null;
        }
    }
}

package com.huami.nfc.applet.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/nfc/applet/di/KeeperCache;", "Lcom/huami/nfc/applet/di/CplcCache;", "", "key", "value", "", "b", "cplc", "putCplc", "getCplc", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;", "()Landroid/content/SharedPreferences;", "sp", "<init>", "(Landroid/content/Context;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class KeeperCache implements CplcCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy sp = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SharedPreferences> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return KeeperCache.this.context.getSharedPreferences("nfc_cplc", 0);
        }
    }

    public KeeperCache(@NotNull Context context) {
        this.context = context;
    }

    private final SharedPreferences a() {
        return (SharedPreferences) this.sp.getValue();
    }

    private final void b(String key, String value) {
        a().edit().putString(key, value).apply();
    }

    @Override // com.huami.nfc.applet.di.CplcCache
    @Nullable
    public String getCplc(@NotNull String key) {
        return a().getString(key, "");
    }

    @Override // com.huami.nfc.applet.di.CplcCache
    public void putCplc(@NotNull String key, @NotNull String cplc) {
        b(key, cplc);
    }
}

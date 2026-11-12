package com.huami.nfc.applet.di;

import android.content.Context;
import com.huami.dev.Logcat;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/nfc/applet/di/MemoryCache;", "Lcom/huami/nfc/applet/di/CplcCache;", "", "key", "cplc", "", "putCplc", "getCplc", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/util/Map;", "deviceCache", "Lcom/huami/nfc/applet/di/KeeperCache;", "c", "Lkotlin/Lazy;", "()Lcom/huami/nfc/applet/di/KeeperCache;", HMKeeperConstant.KEEP_XML, "<init>", "(Landroid/content/Context;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class MemoryCache implements CplcCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, String> deviceCache = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeper = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/applet/di/KeeperCache;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<KeeperCache> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KeeperCache invoke() {
            return new KeeperCache(MemoryCache.this.context);
        }
    }

    public MemoryCache(@NotNull Context context) {
        this.context = context;
    }

    private final KeeperCache a() {
        return (KeeperCache) this.keeper.getValue();
    }

    @Override // com.huami.nfc.applet.di.CplcCache
    @Nullable
    public String getCplc(@NotNull String key) {
        String cplc = this.deviceCache.get(key);
        boolean z = false;
        if (cplc == null || cplc.length() == 0) {
            cplc = a().getCplc(key);
            if (cplc != null) {
                if (cplc.length() > 0) {
                    z = true;
                }
            }
            if (z) {
                this.deviceCache.put(key, cplc);
            }
            Logcat.i("sn is " + key + ", cplc is " + ((Object) cplc));
        }
        return cplc;
    }

    @Override // com.huami.nfc.applet.di.CplcCache
    public void putCplc(@NotNull String key, @NotNull String cplc) {
        this.deviceCache.put(key, cplc);
        a().putCplc(key, cplc);
        Logcat.i("sn is " + key + ", cplc is " + cplc);
    }
}

package com.huami.ednetwork;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\t\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/ednetwork/HmKeyManager;", "", "", "getWebKey", "getHmKv", "webKey", "hmKv", "", "upDateKey", "a", "Ljava/lang/String;", "PREF_NAME", "b", "PREF_KEY_WEB_KEY", "c", "PREF_KEY_HM_KV", GoogleApiAvailabilityLight.a, "KEY", "e", "HM_KV", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "f", "Lkotlin/Lazy;", "()Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvkit", "<init>", "()V", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final class HmKeyManager {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String KEY = "Nqvk+0fJ1bunqWW9X7FWhw==";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String HM_KV = "1";
    public static final HmKeyManager INSTANCE = new HmKeyManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String PREF_NAME = "huami_network_key";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String PREF_KEY_WEB_KEY = "weKey";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String PREF_KEY_HM_KV = "hm_ekv";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final Lazy kvkit = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "()Lcom/huami/utils/persistence/kvkit/KvPersistence;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<KvPersistence> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KvPersistence invoke() {
            return KvKit.getKvPersistence(HmKeyManager.access$getPREF_NAME$p(HmKeyManager.INSTANCE), false);
        }
    }

    private HmKeyManager() {
    }

    private final KvPersistence a() {
        return (KvPersistence) kvkit.getValue();
    }

    public static final /* synthetic */ String access$getPREF_NAME$p(HmKeyManager hmKeyManager) {
        return PREF_NAME;
    }

    @NotNull
    public final String getHmKv() {
        return (String) a().getValue(PREF_KEY_HM_KV, "1");
    }

    @NotNull
    public final String getWebKey() {
        return (String) a().getValue(PREF_KEY_WEB_KEY, KEY);
    }

    public final void upDateKey(@Nullable String webKey, @Nullable String hmKv) {
        a().setValue(PREF_KEY_WEB_KEY, webKey);
        a().setValue(PREF_KEY_HM_KV, hmKv);
    }
}

package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import com.huami.passport.Configs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.logger.Level;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002J)\u0010\f\u001a\u00020\u0005\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u001d\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005R\u001c\u0010\u0016\u001a\u00020\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "", "", "", Configs.Params.PROPERTIES, "", "saveProperties", ExifInterface.GPS_DIRECTION_TRUE, "key", "value", "saveProperty$koin_core", "(Ljava/lang/String;Ljava/lang/Object;)V", "saveProperty", "deleteProperty", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "close", "Lorg/koin/core/Koin;", "a", "Lorg/koin/core/Koin;", "get_koin$koin_core", "()Lorg/koin/core/Koin;", "_koin", "", "b", "Ljava/util/Map;", "_values", "<init>", "(Lorg/koin/core/Koin;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class PropertyRegistry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Koin _koin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Object> _values = KoinPlatformTools.INSTANCE.safeHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<String, Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "load " + this.a.size() + " properties";
        }
    }

    public PropertyRegistry(@NotNull Koin koin) {
        this._koin = koin;
    }

    public final void close() {
        this._values.clear();
    }

    public final void deleteProperty(@NotNull String key) {
        this._values.remove(key);
    }

    @Nullable
    public final <T> T getProperty(@NotNull String key) {
        return (T) this._values.get(key);
    }

    @NotNull
    /* JADX INFO: renamed from: get_koin$koin_core, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    public final void saveProperties(@NotNull Map<String, ? extends Object> properties) {
        this._koin.getLogger().log(Level.DEBUG, new a(properties));
        this._values.putAll(properties);
    }

    public final <T> void saveProperty$koin_core(@NotNull String key, @NotNull T value) {
        this._values.put(key, value);
    }
}

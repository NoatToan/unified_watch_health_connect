package com.huami.bluetooth.profile.channel.module;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bt.debug.Debug;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ChannelModuleProvider;", "", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "moduleClass", "get", "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "key", "modelClass", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;", "a", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;", DataCacher.o, "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStore;", "b", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStore;", "store", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelModuleProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "ChannelModuleProvider";

    @NotNull
    private static final String d = "com.huami.bluetooth.profile.channel.module.DefaultKey";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ChannelModuleStoreOwner owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final ChannelModuleStore store;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ChannelModuleProvider$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;", DataCacher.o, "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleProvider;", "of", "", "DEFAULT_KEY", "Ljava/lang/String;", "TAG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChannelModuleProvider of(@NotNull ChannelModuleStoreOwner owner) {
            return new ChannelModuleProvider(owner);
        }
    }

    public ChannelModuleProvider(@NotNull ChannelModuleStoreOwner channelModuleStoreOwner) {
        this.owner = channelModuleStoreOwner;
        this.store = channelModuleStoreOwner.getChannelModuleStore();
    }

    @Nullable
    public final <T extends BaseModule> T get(@NotNull Class<T> moduleClass) {
        String canonicalName = moduleClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) get(Intrinsics.stringPlus("com.huami.bluetooth.profile.channel.module.DefaultKey:", canonicalName), moduleClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be Module");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final <T extends BaseModule> T get(@NotNull String key, @NotNull Class<T> modelClass) {
        ChannelModuleStore channelModuleStore = this.store;
        if (channelModuleStore == null) {
            return null;
        }
        T t = (T) channelModuleStore.get(key);
        if (t != null && modelClass.isInstance(t)) {
            return t;
        }
        if (t != null) {
            Debug.fi(c, "ERROR: wrong module class");
        }
        ChannelModuleFactory channelModuleFactory = this.owner.getChannelModuleFactory();
        if (channelModuleFactory == null) {
            Debug.fi(c, "ERROR: Module factory is null");
            return null;
        }
        T t2 = (T) channelModuleFactory.create(modelClass);
        this.store.put$bluetooth_release(key, t2);
        return t2;
    }
}

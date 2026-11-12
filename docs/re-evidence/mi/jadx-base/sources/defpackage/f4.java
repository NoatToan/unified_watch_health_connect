package defpackage;

import com.miui.tsmclient.entity.CardInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\u0010"}, d2 = {"Lf4;", "", "Lcom/huami/bluetooth/profile/channel/module/a;", "T", "Ljava/lang/Class;", "moduleClass", PluginDeviceInfo.FMODEL, "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/a;", "", "key", "modelClass", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/a;", "Lh4;", CardInfo.KEY_OWNER, "<init>", "(Lh4;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class f4 {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h4 f17377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final g4 f17378b;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lf4$a;", "", "Lh4;", CardInfo.KEY_OWNER, "Lf4;", PluginDeviceInfo.FMODEL, "", "DEFAULT_KEY", "Ljava/lang/String;", "TAG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f4 a(@NotNull h4 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new f4(owner);
        }
    }

    public f4(@NotNull h4 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f17377a = owner;
        this.f17378b = owner.b();
    }

    @Nullable
    public final <T extends com.huami.bluetooth.profile.channel.module.a> T a(@NotNull Class<T> moduleClass) {
        Intrinsics.checkNotNullParameter(moduleClass, "moduleClass");
        String canonicalName = moduleClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be Module");
        }
        return (T) a("com.huami.bluetooth.profile.channel.module.DefaultKey:" + canonicalName, moduleClass);
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
    public final <T extends com.huami.bluetooth.profile.channel.module.a> T a(@NotNull String key, @NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        g4 g4Var = this.f17378b;
        if (g4Var == null) {
            return null;
        }
        T t = (T) g4Var.a(key);
        if (t != null && modelClass.isInstance(t)) {
            return t;
        }
        if (t != null) {
            t5t.d("ChannelModuleProvider", "ERROR: wrong module class");
        }
        e4 e4VarI = this.f17377a.i();
        if (e4VarI == null) {
            t5t.d("ChannelModuleProvider", "ERROR: Module factory is null");
            return null;
        }
        T t2 = (T) e4VarI.a(modelClass);
        this.f17378b.a(key, t2);
        return t2;
    }
}

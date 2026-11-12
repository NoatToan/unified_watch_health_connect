package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import com.squareup.picasso.u;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 l2\u00020\u0001:\u0001lJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\t\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u0004H'J\b\u0010\u000b\u001a\u00020\u0004H'J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0014\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\u0004H'J\b\u0010\u0016\u001a\u00020\u0004H'J\u001c\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H'J\b\u0010\u001b\u001a\u00020\u0004H'J\b\u0010\u001c\u001a\u00020\u0004H'J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\u001e\u001a\u00020\u0004H'J\b\u0010\u001f\u001a\u00020\u0004H'J\b\u0010 \u001a\u00020\u0004H'JB\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010!\"\u0004\b\u0001\u0010\u00172\u0006\u0010\"\u001a\u00028\u00002\u001d\u0010%\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b$H'¢\u0006\u0004\b&\u0010'J\u001c\u0010*\u001a\u00020\u00012\b\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0001H'J\n\u0010+\u001a\u0004\u0018\u00010\u0001H'J\u0012\u0010,\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001H'J\u0012\u0010.\u001a\u00020-2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H'J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020-H\u0017J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020/H\u0017J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u000200H\u0017J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u000201H\u0017J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u00020\u0002H\u0017J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u000202H\u0017J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u000203H\u0017J\u0010\u0010.\u001a\u00020-2\u0006\u0010\"\u001a\u000204H\u0017J\u0010\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u000205H'J\u0016\u00109\u001a\u00020\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H'J#\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000:H'¢\u0006\u0004\b;\u0010<J#\u0010@\u001a\u00020\u00042\u0012\u0010?\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030>0=H'¢\u0006\u0004\b@\u0010AJ\b\u0010B\u001a\u00020\u0004H'J\b\u0010C\u001a\u00020\u0004H'J\b\u0010E\u001a\u00020DH'R \u0010K\u001a\u0006\u0012\u0002\b\u00030F8&@'X§\u0004¢\u0006\f\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010HR\u001c\u0010O\u001a\u00020-8&@'X§\u0004¢\u0006\f\u0012\u0004\bN\u0010J\u001a\u0004\bL\u0010MR\u001c\u0010R\u001a\u00020-8&@'X§\u0004¢\u0006\f\u0012\u0004\bQ\u0010J\u001a\u0004\bP\u0010MR\u001c\u0010U\u001a\u00020-8&@'X§\u0004¢\u0006\f\u0012\u0004\bT\u0010J\u001a\u0004\bS\u0010MR\u001e\u0010Y\u001a\u0004\u0018\u0001058&@'X§\u0004¢\u0006\f\u0012\u0004\bX\u0010J\u001a\u0004\bV\u0010WR\u001c\u0010]\u001a\u00020\u00028&@'X§\u0004¢\u0006\f\u0012\u0004\b\\\u0010J\u001a\u0004\bZ\u0010[R\u001c\u0010b\u001a\u00020^8&@'X§\u0004¢\u0006\f\u0012\u0004\ba\u0010J\u001a\u0004\b_\u0010`R\u001c\u0010g\u001a\u00020c8f@'X§\u0004¢\u0006\f\u0012\u0004\bf\u0010J\u001a\u0004\bd\u0010eR\u0016\u0010k\u001a\u00020h8f@&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006m"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "", "startReplaceableGroup", "endReplaceableGroup", "dataKey", "startMovableGroup", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "", "sourceInformation", "sourceInformationMarkerStart", "sourceInformationMarkerEnd", "skipToGroupEnd", "skipCurrentGroup", "startNode", "startReusableNode", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "factory", "createNode", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "V", "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "joinKey", "rememberedValue", "updateRememberedValue", "", u.q, "", "", "", "", "", "", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", GetWatermarkAPI.KEY_NAME_CONSUME, "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "()V", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData$annotations", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1})
public interface Composer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0002\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            @NotNull
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @NotNull
        public final Object getEmpty() {
            return Empty;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, boolean z) {
            return composer.changed(z);
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getApplier$annotations() {
        }

        @InternalComposeApi
        public static /* synthetic */ void getApplyCoroutineContext$annotations() {
        }

        @InternalComposeApi
        public static /* synthetic */ void getCompositionData$annotations() {
        }

        @InternalComposeApi
        public static /* synthetic */ void getCompoundKeyHash$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getDefaultsInvalid$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getInserting$annotations() {
        }

        @InternalComposeApi
        public static /* synthetic */ void getRecomposeScope$annotations() {
        }

        @ComposeCompilerApi
        public static /* synthetic */ void getSkipping$annotations() {
        }

        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, char c) {
            return composer.changed(c);
        }

        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, byte b) {
            return composer.changed(b);
        }

        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, short s) {
            return composer.changed(s);
        }

        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, int i) {
            return composer.changed(i);
        }

        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, float f) {
            return composer.changed(f);
        }

        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, long j) {
            return composer.changed(j);
        }

        @ComposeCompilerApi
        public static boolean changed(@NotNull Composer composer, double d) {
            return composer.changed(d);
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V value, @NotNull Function2<? super T, ? super V, Unit> block);

    @InternalComposeApi
    @NotNull
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(byte value);

    @ComposeCompilerApi
    boolean changed(char value);

    @ComposeCompilerApi
    boolean changed(double value);

    @ComposeCompilerApi
    boolean changed(float value);

    @ComposeCompilerApi
    boolean changed(int value);

    @ComposeCompilerApi
    boolean changed(long value);

    @ComposeCompilerApi
    boolean changed(@Nullable Object value);

    @ComposeCompilerApi
    boolean changed(short value);

    @ComposeCompilerApi
    boolean changed(boolean value);

    @InternalComposeApi
    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(@NotNull CompositionLocal<T> key);

    @ComposeCompilerApi
    <T> void createNode(@NotNull Function0<? extends T> factory);

    @ComposeCompilerApi
    void disableReusing();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    @Nullable
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @NotNull
    Applier<?> getApplier();

    @NotNull
    CoroutineContext getApplyCoroutineContext();

    @NotNull
    ControlledComposition getComposition();

    @NotNull
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @Nullable
    RecomposeScope getRecomposeScope();

    boolean getSkipping();

    @ComposeCompilerApi
    @NotNull
    Object joinKey(@Nullable Object left, @Nullable Object right);

    @InternalComposeApi
    void recordSideEffect(@NotNull Function0<Unit> effect);

    @InternalComposeApi
    void recordUsed(@NotNull RecomposeScope scope);

    @ComposeCompilerApi
    @Nullable
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@NotNull String sourceInformation);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int key, @NotNull String sourceInformation);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int key, @Nullable Object dataKey);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProviders(@NotNull ProvidedValue<?>[] values);

    @ComposeCompilerApi
    void startReplaceableGroup(int key);

    @ComposeCompilerApi
    @NotNull
    Composer startRestartGroup(int key);

    @ComposeCompilerApi
    void startReusableGroup(int key, @Nullable Object dataKey);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@Nullable Object value);

    @ComposeCompilerApi
    void useNode();
}

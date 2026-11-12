package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.login.a;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.twitter.sdk.android.tweetcomposer.g;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bL\u0010#J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015J\u0006\u0010\u0019\u001a\u00020\u0005J\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\rR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R*\u00104\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000303\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010:\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010=\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u0013\u0010?\u001a\u00020\u00178F@\u0006¢\u0006\u0006\u001a\u0004\b>\u00107R$\u0010B\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00107\"\u0004\bA\u00109R$\u0010E\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00107\"\u0004\bD\u00109R$\u0010H\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00107\"\u0004\bG\u00109R$\u0010K\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u00107\"\u0004\bJ\u00109¨\u0006M"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/Composer;", g.c, "", "compose", "", "value", "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "invalidate", "Lkotlin/Function2;", "", TransportUri.ACTION_BLOCK, "updateScope", "token", "start", "scopeSkipped", DefaultSettingsSpiCall.n, "recordRead", "Landroidx/compose/runtime/collection/IdentityArraySet;", "instances", "", "isInvalidFor", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "Landroidx/compose/runtime/CompositionImpl;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "setComposition", "(Landroidx/compose/runtime/CompositionImpl;)V", DataCacher.j, LogUtil.I, "Landroidx/compose/runtime/Anchor;", XmPlayerService.TYPE_RANK_ANCHOR, "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "Lkotlin/jvm/functions/Function2;", "currentToken", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "trackedInstances", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/DerivedState;", "trackedDependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "getRereading", "()Z", "setRereading", "(Z)V", "rereading", "getSkipped$runtime_release", "setSkipped", a.g, "getValid", "valid", "getUsed", "setUsed", "used", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "<init>", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    @Nullable
    private Anchor anchor;

    @Nullable
    private Function2<? super Composer, ? super Integer, Unit> block;

    @Nullable
    private CompositionImpl composition;
    private int currentToken;
    private int flags;

    @Nullable
    private IdentityArrayMap<DerivedState<?>, Object> trackedDependencies;

    @Nullable
    private IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(@Nullable CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        if (z) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z) {
        if (z) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void compose(@NotNull Composer composer) {
        Unit unit;
        Function2<? super Composer, ? super Integer, Unit> function2 = this.block;
        if (function2 == null) {
            unit = null;
        } else {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    @Nullable
    public final Function1<Composition, Unit> end(final int token) {
        final IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        int size = identityArrayIntMap.getSize();
        boolean z = true;
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Objects.requireNonNull(identityArrayIntMap.getKeys()[i], "null cannot be cast to non-null type kotlin.Any");
                if (!(identityArrayIntMap.getValues()[i] != token)) {
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            return new Function1<Composition, Unit>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
                    invoke2(composition);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Composition composition) {
                    IdentityArrayMap identityArrayMap;
                    if (this.this$0.currentToken == token && Intrinsics.areEqual(identityArrayIntMap, this.this$0.trackedInstances) && (composition instanceof CompositionImpl)) {
                        IdentityArrayIntMap identityArrayIntMap2 = identityArrayIntMap;
                        int i3 = token;
                        RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                        int size2 = identityArrayIntMap2.getSize();
                        int i4 = 0;
                        if (size2 > 0) {
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                int i7 = i5 + 1;
                                Object obj = identityArrayIntMap2.getKeys()[i5];
                                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
                                int i8 = identityArrayIntMap2.getValues()[i5];
                                boolean z2 = i8 != i3;
                                if (z2) {
                                    ((CompositionImpl) composition).removeObservation$runtime_release(obj, recomposeScopeImpl);
                                    DerivedState derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                                    if (derivedState != null && (identityArrayMap = recomposeScopeImpl.trackedDependencies) != null) {
                                        identityArrayMap.remove(derivedState);
                                        if (identityArrayMap.getSize() == 0) {
                                            recomposeScopeImpl.trackedDependencies = null;
                                        }
                                    }
                                }
                                if (!z2) {
                                    if (i6 != i5) {
                                        identityArrayIntMap2.getKeys()[i6] = obj;
                                        identityArrayIntMap2.getValues()[i6] = i8;
                                    }
                                    i6++;
                                }
                                if (i7 >= size2) {
                                    break;
                                } else {
                                    i5 = i7;
                                }
                            }
                            i4 = i6;
                        }
                        int size3 = identityArrayIntMap2.getSize();
                        if (i4 < size3) {
                            int i9 = i4;
                            while (true) {
                                int i10 = i9 + 1;
                                identityArrayIntMap2.getKeys()[i9] = null;
                                if (i10 >= size3) {
                                    break;
                                } else {
                                    i9 = i10;
                                }
                            }
                        }
                        identityArrayIntMap2.setSize(i4);
                        if (identityArrayIntMap.getSize() == 0) {
                            this.this$0.trackedInstances = null;
                        }
                    }
                }
            };
        }
        return null;
    }

    @Nullable
    public final Anchor getAnchor() {
        return this.anchor;
    }

    @Nullable
    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if (this.composition == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        return anchor == null ? false : anchor.getValid();
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null) {
            return;
        }
        compositionImpl.invalidate(this, null);
    }

    @NotNull
    public final InvalidationResult invalidateForResult(@Nullable Object value) {
        CompositionImpl compositionImpl = this.composition;
        InvalidationResult invalidationResultInvalidate = compositionImpl == null ? null : compositionImpl.invalidate(this, value);
        return invalidationResultInvalidate == null ? InvalidationResult.IGNORED : invalidationResultInvalidate;
    }

    public final boolean isInvalidFor(@Nullable IdentityArraySet<Object> instances) {
        IdentityArrayMap<DerivedState<?>, Object> identityArrayMap;
        boolean z;
        if (instances != null && (identityArrayMap = this.trackedDependencies) != null && instances.isNotEmpty()) {
            if (instances.isEmpty()) {
                z = true;
            } else {
                for (Object obj : instances) {
                    if (!((obj instanceof DerivedState) && Intrinsics.areEqual(identityArrayMap.get((DerivedState<?>) obj), ((DerivedState) obj).getValue()))) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    public final void recordRead(@NotNull Object instance) {
        if (getRereading()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null) {
            identityArrayIntMap = new IdentityArrayIntMap();
            this.trackedInstances = identityArrayIntMap;
        }
        identityArrayIntMap.add(instance, this.currentToken);
        if (instance instanceof DerivedState) {
            IdentityArrayMap<DerivedState<?>, Object> identityArrayMap = this.trackedDependencies;
            if (identityArrayMap == null) {
                identityArrayMap = new IdentityArrayMap<>(0, 1, null);
                this.trackedDependencies = identityArrayMap;
            }
            identityArrayMap.set(instance, ((DerivedState) instance).getCurrentValue());
        }
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null || (identityArrayIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            int size = identityArrayIntMap.getSize();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj = identityArrayIntMap.getKeys()[i];
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    int i3 = identityArrayIntMap.getValues()[i];
                    compositionImpl.recordReadOf(obj);
                    if (i2 >= size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
        } finally {
            setRereading(false);
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(@Nullable Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setComposition(@Nullable CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void start(int token) {
        this.currentToken = token;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> block) {
        this.block = block;
    }
}

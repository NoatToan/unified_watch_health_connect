package org.koin.core.scope;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.time.MeasureKt;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010O\u001a\u00020\u0003\u0012\n\u0010P\u001a\u000609j\u0002`:\u0012\b\b\u0002\u0010Q\u001a\u00020\u001a\u0012\u0006\u0010R\u001a\u000207¢\u0006\u0005\b\u007f\u0010\u0080\u0001JA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0006\u0010\u001b\u001a\u00020\u001aJ\u001d\u0010 \u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00182\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000!\"\u00020\u0000¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00182\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000!\"\u00020\u0000¢\u0006\u0004\b%\u0010$JL\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000JN\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000(\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000JC\u0010+\u001a\u00028\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b-\u0010.JE\u0010/\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010,JE\u0010/\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0004\b/\u0010\u0015JC\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0004\b+\u0010\u0015J7\u00101\u001a\u00020\u0018\"\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u00100\u001a\u00028\u0000¢\u0006\u0004\b1\u00102JJ\u00105\u001a\u00020\u0018\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u00100\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001c2\b\b\u0002\u00104\u001a\u00020\u001aH\u0086\b¢\u0006\u0004\b5\u00106J\u0006\u00108\u001a\u000207J\u0012\u0010<\u001a\u00020\u00002\n\u0010;\u001a\u000609j\u0002`:J\u000e\u0010?\u001a\u00020\u00182\u0006\u0010>\u001a\u00020=J\u001b\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0086\bJ\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005J'\u0010C\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00028\u0000¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010A\u001a\u000209¢\u0006\u0004\bE\u0010FJ\u001f\u0010C\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010A\u001a\u000209¢\u0006\u0004\bC\u0010FJ\u0006\u0010G\u001a\u00020\u0018J\b\u0010H\u001a\u000209H\u0016J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\r\u0010J\u001a\u000609j\u0002`:HÆ\u0003J\t\u0010K\u001a\u00020\u001aHÆ\u0003J\u0010\u0010N\u001a\u000207HÀ\u0003¢\u0006\u0004\bL\u0010MJ5\u0010S\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\u00032\f\b\u0002\u0010P\u001a\u000609j\u0002`:2\b\b\u0002\u0010Q\u001a\u00020\u001a2\b\b\u0002\u0010R\u001a\u000207HÆ\u0001J\t\u0010U\u001a\u00020THÖ\u0001J\u0013\u0010W\u001a\u00020\u001a2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010O\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\bY\u0010ZR\u001d\u0010P\u001a\u000609j\u0002`:8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010Q\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010^\u001a\u0004\bQ\u0010_R\"\u0010R\u001a\u0002078\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010`\u0012\u0004\bb\u0010c\u001a\u0004\ba\u0010MR&\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u00000dj\b\u0012\u0004\u0012\u00020\u0000`e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010fR*\u0010m\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010h\u0012\u0004\bl\u0010c\u001a\u0004\bi\u0010.\"\u0004\bj\u0010kR&\u0010o\u001a\u0012\u0012\u0004\u0012\u00020=0dj\b\u0012\u0004\u0012\u00020=`e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010fR(\u0010v\u001a\b\u0012\u0004\u0012\u00020\b0p8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u0010c\u001a\u0004\bs\u0010tR\u0016\u0010x\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010^R\u0013\u0010z\u001a\u00020\u001a8F@\u0006¢\u0006\u0006\u001a\u0004\by\u0010_R\u0013\u0010~\u001a\u00020{8F@\u0006¢\u0006\u0006\u001a\u0004\b|\u0010}\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0081\u0001"}, d2 = {"Lorg/koin/core/scope/Scope;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameterDef", GoogleApiAvailabilityLight.a, "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lorg/koin/core/instance/InstanceContext;", "instanceContext", "e", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/instance/InstanceContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "c", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "parameters", "b", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "f", "", "a", "", "isNotClosed", "", "links", "create$koin_core", "(Ljava/util/List;)V", "create", "", "scopes", "linkTo", "([Lorg/koin/core/scope/Scope;)V", "unlink", "Lkotlin/LazyThreadSafetyMode;", "mode", "Lkotlin/Lazy;", "inject", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getSource", "()Ljava/lang/Object;", "getOrNull", DefaultSettingsSpiCall.n, "refreshScopeInstance", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Ljava/lang/Object;)V", "secondaryTypes", "allowOverride", "declare", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "Lorg/koin/core/Koin;", "getKoin", "", "Lorg/koin/core/scope/ScopeID;", "scopeID", "getScope", "Lorg/koin/core/scope/ScopeCallback;", "callback", "registerCallback", "getAll", "key", "defaultValue", "getProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "(Ljava/lang/String;)Ljava/lang/Object;", "close", "toString", "component1", "component2", "component3", "component4$koin_core", "()Lorg/koin/core/Koin;", "component4", "scopeQualifier", "id", "isRoot", "_koin", "copy", "", "hashCode", "other", "equals", "Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "()Z", "Lorg/koin/core/Koin;", "get_koin", "get_koin$annotations", "()V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "linkedScopes", "Ljava/lang/Object;", "get_source", "set_source", "(Ljava/lang/Object;)V", "get_source$annotations", "_source", "g", "_callbacks", "Lkotlin/collections/ArrayDeque;", "h", "Lkotlin/collections/ArrayDeque;", "get_parameterStack", "()Lkotlin/collections/ArrayDeque;", "get_parameterStack$annotations", "_parameterStack", "i", "_closed", "getClosed", "closed", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "logger", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Ljava/lang/String;ZLorg/koin/core/Koin;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Scope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Qualifier scopeQualifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isRoot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Koin _koin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Scope> linkedScopes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Object _source;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<ScopeCallback> _callbacks;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayDeque<ParametersHolder> _parameterStack;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean _closed;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Scope.this._closed = true;
            Scope.this.a();
            Scope.this.get_koin().getScopeRegistry().deleteScope$koin_core(Scope.this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ KClass<?> c;
        public final /* synthetic */ Function0<ParametersHolder> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Qualifier qualifier, KClass<?> kClass, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.b = qualifier;
            this.c = kClass;
            this.d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) Scope.this.d(this.b, this.c, this.d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ParametersHolder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ParametersHolder parametersHolder) {
            super(0);
            this.a = parametersHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "| put parameters on stack " + this.a + StringUtil.SPACE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "| remove parameters from stack";
        }
    }

    /* JADX INFO: renamed from: org.koin.core.scope.Scope$declare$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ T b;
        public final /* synthetic */ Qualifier c;
        public final /* synthetic */ List<KClass<?>> d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(T t, Qualifier qualifier, List<? extends KClass<?>> list, boolean z) {
            super(0);
            this.b = t;
            this.c = qualifier;
            this.d = list;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InstanceRegistry instanceRegistry = Scope.this.get_koin().getInstanceRegistry();
            final T t = this.b;
            Qualifier qualifier = this.c;
            List<KClass<?>> list = this.d;
            boolean z = this.e;
            Qualifier scopeQualifier = Scope.this.getScopeQualifier();
            Kind kind = Kind.Scoped;
            Intrinsics.needClassReification();
            Function2<Scope, ParametersHolder, T> function2 = new Function2<Scope, ParametersHolder, T>() { // from class: org.koin.core.scope.Scope$declare$1$invoke$$inlined$declareInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final T invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return (T) t;
                }
            };
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list);
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            InstanceRegistry.saveMapping$default(instanceRegistry, z, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
            Iterator<T> it2 = beanDefinition.getSecondaryTypes().iterator();
            while (it2.hasNext()) {
                InstanceRegistry.saveMapping$default(instanceRegistry, z, BeanDefinitionKt.indexKey((KClass) it2.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ KClass<?> a;
        public final /* synthetic */ Qualifier b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(KClass<?> kClass, Qualifier qualifier) {
            super(0);
            this.a = kClass;
            this.b = qualifier;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "- lookup? t:'" + KClassExtKt.getFullName(this.a) + "' - q:'" + this.b + "' look in injected parameters";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ KClass<?> a;
        public final /* synthetic */ Qualifier b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(KClass<?> kClass, Qualifier qualifier) {
            super(0);
            this.a = kClass;
            this.b = qualifier;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "- lookup? t:'" + KClassExtKt.getFullName(this.a) + "' - q:'" + this.b + "' look at scope source";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ KClass<?> a;
        public final /* synthetic */ Qualifier b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(KClass<?> kClass, Qualifier qualifier) {
            super(0);
            this.a = kClass;
            this.b = qualifier;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "- lookup? t:'" + KClassExtKt.getFullName(this.a) + "' - q:'" + this.b + "' look in other scopes";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "| clear parameter stack";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$inject$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C16561<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ParametersHolder> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16561(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.b = qualifier;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            Scope scope = Scope.this;
            Qualifier qualifier = this.b;
            Function0<ParametersHolder> function0 = this.c;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$injectOrNull$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C16571<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ParametersHolder> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16571(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.b = qualifier;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            Scope scope = Scope.this;
            Qualifier qualifier = this.b;
            Function0<ParametersHolder> function0 = this.c;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    public Scope(@NotNull Qualifier qualifier, @NotNull String str, boolean z, @NotNull Koin koin) {
        this.scopeQualifier = qualifier;
        this.id = str;
        this.isRoot = z;
        this._koin = koin;
        this.linkedScopes = new ArrayList<>();
        this._callbacks = new ArrayList<>();
        this._parameterStack = new ArrayDeque<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this._source = null;
        if (this._koin.getLogger().isAt(Level.DEBUG)) {
            this._koin.getLogger().info("closing scope:'" + this.id + '\'');
        }
        Iterator<T> it2 = this._callbacks.iterator();
        while (it2.hasNext()) {
            ((ScopeCallback) it2.next()).onScopeClose(this);
        }
        this._callbacks.clear();
    }

    private final <T> T b(KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Iterator<Scope> it2 = this.linkedScopes.iterator();
        T t = null;
        while (it2.hasNext() && (t = (T) it2.next().getOrNull(clazz, qualifier, parameters)) == null) {
        }
        return t;
    }

    private final <T> T c(KClass<?> clazz) {
        if (clazz.isInstance(this._source)) {
            return (T) this._source;
        }
        return null;
    }

    public static /* synthetic */ Scope copy$default(Scope scope, Qualifier qualifier, String str, boolean z, Koin koin, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = scope.scopeQualifier;
        }
        if ((i & 2) != 0) {
            str = scope.id;
        }
        if ((i & 4) != 0) {
            z = scope.isRoot;
        }
        if ((i & 8) != 0) {
            koin = scope._koin;
        }
        return scope.copy(qualifier, str, z, koin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T d(Qualifier qualifier, KClass<?> clazz, Function0<? extends ParametersHolder> parameterDef) throws ClosedScopeException {
        if (this._closed) {
            throw new ClosedScopeException("Scope '" + this.id + "' is closed");
        }
        ParametersHolder parametersHolderInvoke = parameterDef == null ? null : parameterDef.invoke();
        if (parametersHolderInvoke != null) {
            this._koin.getLogger().log(Level.DEBUG, new c(parametersHolderInvoke));
            this._parameterStack.addFirst(parametersHolderInvoke);
        }
        T t = (T) e(qualifier, clazz, new InstanceContext(this._koin, this, parametersHolderInvoke), parameterDef);
        if (parametersHolderInvoke != null) {
            this._koin.getLogger().log(Level.DEBUG, d.a);
            this._parameterStack.removeFirstOrNull();
        }
        return t;
    }

    public static /* synthetic */ void declare$default(Scope scope, Object obj, Qualifier qualifier, List list, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List list2 = list;
        boolean z2 = (i & 8) != 0 ? true : z;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m4495synchronized(scope, scope.new AnonymousClass1(obj, qualifier2, list2, z2));
    }

    private final <T> T e(Qualifier qualifier, KClass<?> clazz, InstanceContext instanceContext, Function0<? extends ParametersHolder> parameterDef) throws NoBeanDefFoundException {
        Object orNull = (T) this._koin.getInstanceRegistry().resolveInstance$koin_core(qualifier, clazz, this.scopeQualifier, instanceContext);
        if (orNull == null) {
            Logger logger = get_koin().getLogger();
            Level level = Level.DEBUG;
            logger.log(level, new e(clazz, qualifier));
            ParametersHolder parametersHolderFirstOrNull = get_parameterStack().firstOrNull();
            Object obj = null;
            orNull = parametersHolderFirstOrNull == null ? (T) null : parametersHolderFirstOrNull.getOrNull(clazz);
            if (orNull == null) {
                get_koin().getLogger().log(level, new f(clazz, qualifier));
                Object obj2 = get_source();
                if (obj2 != null && clazz.isInstance(obj2)) {
                    obj = get_source();
                }
                orNull = (T) obj;
                if (orNull == null) {
                    get_koin().getLogger().log(level, new g(clazz, qualifier));
                    orNull = (T) b(clazz, qualifier, parameterDef);
                    if (orNull == null) {
                        get_parameterStack().clear();
                        get_koin().getLogger().log(level, h.a);
                        f(qualifier, clazz);
                        throw new KotlinNothingValueException();
                    }
                }
            }
        }
        return (T) orNull;
    }

    private final Void f(Qualifier qualifier, KClass<?> clazz) throws NoBeanDefFoundException {
        String str = "";
        if (qualifier != null) {
            String str2 = " & qualifier:'" + qualifier + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        throw new NoBeanDefFoundException("|- No definition found for class:'" + KClassExtKt.getFullName(clazz) + '\'' + str + ". Check your definitions!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    @PublishedApi
    public static /* synthetic */ void get_koin$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void get_parameterStack$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void get_source$annotations() {
    }

    public static /* synthetic */ Lazy inject$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) scope.new C16561(qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) scope.new C16571(qualifier, function0));
    }

    public static /* synthetic */ void refreshScopeInstance$default(Scope scope, KClass kClass, Qualifier qualifier, Object obj, int i, Object obj2) throws ClosedScopeException {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        scope.refreshScopeInstance(kClass, qualifier, obj);
    }

    public final void close() {
        KoinPlatformTools.INSTANCE.m4495synchronized(this, new a());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @NotNull
    /* JADX INFO: renamed from: component4$koin_core, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    @NotNull
    public final Scope copy(@NotNull Qualifier scopeQualifier, @NotNull String id, boolean isRoot, @NotNull Koin _koin) {
        return new Scope(scopeQualifier, id, isRoot, _koin);
    }

    public final void create$koin_core(@NotNull List<Scope> links) {
        this.linkedScopes.addAll(links);
    }

    public final /* synthetic */ <T> void declare(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride) {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m4495synchronized(this, new AnonymousClass1(instance, qualifier, secondaryTypes, allowOverride));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) other;
        return Intrinsics.areEqual(this.scopeQualifier, scope.scopeQualifier) && Intrinsics.areEqual(this.id, scope.id) && this.isRoot == scope.isRoot && Intrinsics.areEqual(this._koin, scope._koin);
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    public final /* synthetic */ <T> List<T> getAll() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    /* JADX INFO: renamed from: getClosed, reason: from getter */
    public final boolean get_closed() {
        return this._closed;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Koin getKoin() {
        return this._koin;
    }

    @NotNull
    public final Logger getLogger() {
        return this._koin.getLogger();
    }

    public final /* synthetic */ <T> T getOrNull(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    @NotNull
    public final <T> T getProperty(@NotNull String key, @NotNull T defaultValue) {
        return (T) this._koin.getProperty(key, defaultValue);
    }

    @Nullable
    public final <T> T getPropertyOrNull(@NotNull String key) {
        return (T) this._koin.getProperty(key);
    }

    @NotNull
    public final Scope getScope(@NotNull String scopeID) {
        return getKoin().getScope(scopeID);
    }

    @NotNull
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    @Deprecated(message = "No need to use getSource(). You can an use get() directly.", replaceWith = @ReplaceWith(expression = "get()", imports = {}))
    public final /* synthetic */ <T> T getSource() {
        T t = (T) get_source();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }

    @NotNull
    public final Koin get_koin() {
        return this._koin;
    }

    @NotNull
    public final ArrayDeque<ParametersHolder> get_parameterStack() {
        return this._parameterStack;
    }

    @Nullable
    public final Object get_source() {
        return this._source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((this.scopeQualifier.hashCode() * 31) + this.id.hashCode()) * 31;
        boolean z = this.isRoot;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this._koin.hashCode();
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new C16561(qualifier, parameters));
    }

    public final /* synthetic */ <T> Lazy<T> injectOrNull(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new C16571(qualifier, parameters));
    }

    public final boolean isNotClosed() {
        return !get_closed();
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final void linkTo(@NotNull Scope... scopes) {
        if (this.isRoot) {
            throw new IllegalStateException("Can't add scope link to a root scope".toString());
        }
        kotlin.collections.h.addAll(this.linkedScopes, scopes);
    }

    public final <T> void refreshScopeInstance(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @NotNull T instance) throws ClosedScopeException {
        if (this._closed) {
            throw new ClosedScopeException("Scope '" + this.id + "' is closed");
        }
        InstanceFactory<?> instanceFactoryResolveDefinition$koin_core = this._koin.getInstanceRegistry().resolveDefinition$koin_core(clazz, qualifier, this.scopeQualifier);
        ScopedInstanceFactory scopedInstanceFactory = instanceFactoryResolveDefinition$koin_core instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactoryResolveDefinition$koin_core : null;
        if (scopedInstanceFactory == null) {
            return;
        }
        get_koin().getLogger().debug("|- '" + KClassExtKt.getFullName(clazz) + "' refresh with " + instance);
        scopedInstanceFactory.refreshInstance(getId(), instance);
    }

    public final void registerCallback(@NotNull ScopeCallback callback) {
        this._callbacks.add(callback);
    }

    public final void set_source(@Nullable Object obj) {
        this._source = obj;
    }

    @NotNull
    public String toString() {
        return "['" + this.id + "']";
    }

    public final void unlink(@NotNull Scope... scopes) {
        if (this.isRoot) {
            throw new IllegalStateException("Can't remove scope link to a root scope".toString());
        }
        kotlin.collections.h.removeAll(this.linkedScopes, scopes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.get(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return scope.getOrNull(kClass, qualifier, function0);
    }

    public final <T> T get(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        if (!this._koin.getLogger().isAt(Level.DEBUG)) {
            return (T) d(qualifier, clazz, parameters);
        }
        String str = "";
        if (qualifier != null) {
            String str2 = " with qualifier '" + qualifier + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        this._koin.getLogger().debug("+- '" + KClassExtKt.getFullName(clazz) + '\'' + str);
        Pair pairMeasureDurationForResult = MeasureKt.measureDurationForResult(new b(qualifier, clazz, parameters));
        T t = (T) pairMeasureDurationForResult.component1();
        double dDoubleValue = ((Number) pairMeasureDurationForResult.component2()).doubleValue();
        this._koin.getLogger().debug("|- '" + KClassExtKt.getFullName(clazz) + "' in " + dDoubleValue + " ms");
        return t;
    }

    @NotNull
    public final <T> List<T> getAll(@NotNull KClass<?> clazz) {
        List<T> all$koin_core = this._koin.getInstanceRegistry().getAll$koin_core(clazz, new InstanceContext(this._koin, this, null, 4, null));
        ArrayList<Scope> arrayList = this.linkedScopes;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(arrayList2, ((Scope) it2.next()).getAll(clazz));
        }
        return CollectionsKt___CollectionsKt.plus((Collection) all$koin_core, (Iterable) arrayList2);
    }

    @Nullable
    public final <T> T getOrNull(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        try {
            return (T) get(clazz, qualifier, parameters);
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().debug("|- Scope closed - no instance found for " + KClassExtKt.getFullName(clazz) + " on scope " + this);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            this._koin.getLogger().debug("|- No instance found for " + KClassExtKt.getFullName(clazz) + " on scope " + this);
            return null;
        }
    }

    @NotNull
    public final <T> T getProperty(@NotNull String key) throws MissingPropertyException {
        T t = (T) this._koin.getProperty(key);
        if (t != null) {
            return t;
        }
        throw new MissingPropertyException("Property '" + key + "' not found");
    }

    public /* synthetic */ Scope(Qualifier qualifier, String str, boolean z, Koin koin, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier, str, (i & 4) != 0 ? false : z, koin);
    }
}

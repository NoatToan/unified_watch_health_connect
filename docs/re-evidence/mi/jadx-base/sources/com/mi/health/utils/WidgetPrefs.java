package com.mi.health.utils;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mi/health/utils/WidgetPrefs;", "", "<init>", "()V", "STORE_NAME", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "DEFAULT_STEP_WIDGET_ID", "", "getCurStepsSync", "context", "widgetId", "(Landroid/content/Context;Ljava/lang/Integer;)I", "setCurStepsSync", "steps", "(Landroid/content/Context;Ljava/lang/Integer;I)Landroidx/datastore/preferences/core/Preferences;", "widgetStepKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetPrefs {
    private static final int DEFAULT_STEP_WIDGET_ID = 1;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(WidgetPrefs.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    @NotNull
    public static final WidgetPrefs INSTANCE = new WidgetPrefs();

    @NotNull
    private static final String STORE_NAME = "widget_prefs";

    /* JADX INFO: renamed from: dataStore$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty dataStore = PreferenceDataStoreDelegateKt.preferencesDataStore$default(STORE_NAME, null, null, null, 14, null);

    /* JADX INFO: renamed from: com.mi.health.utils.WidgetPrefs$getCurStepsSync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.WidgetPrefs$getCurStepsSync$1", f = "WidgetPrefs.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Integer $widgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Integer num, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$widgetId = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$widgetId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow data = WidgetPrefs.INSTANCE.getDataStore(this.$context).getData();
                this.label = 1;
                obj = FlowKt.first(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Preferences preferences = (Preferences) obj;
            WidgetPrefs widgetPrefs = WidgetPrefs.INSTANCE;
            Integer num = this.$widgetId;
            Integer num2 = (Integer) preferences.get(widgetPrefs.widgetStepKey(num != null ? num.intValue() : 1));
            return Boxing.boxInt(num2 != null ? num2.intValue() : 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.utils.WidgetPrefs$setCurStepsSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.WidgetPrefs$setCurStepsSync$1", f = "WidgetPrefs.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Preferences>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $steps;
        final /* synthetic */ Integer $widgetId;
        int label;

        /* JADX INFO: renamed from: com.mi.health.utils.WidgetPrefs$setCurStepsSync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.utils.WidgetPrefs$setCurStepsSync$1$1", f = "WidgetPrefs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03081 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $steps;
            final /* synthetic */ Integer $widgetId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03081(Integer num, int i, Continuation<? super C03081> continuation) {
                super(2, continuation);
                this.$widgetId = num;
                this.$steps = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03081 c03081 = new C03081(this.$widgetId, this.$steps, continuation);
                c03081.L$0 = obj;
                return c03081;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((C03081) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                WidgetPrefs widgetPrefs = WidgetPrefs.INSTANCE;
                Integer num = this.$widgetId;
                mutablePreferences.set(widgetPrefs.widgetStepKey(num != null ? num.intValue() : 1), Boxing.boxInt(this.$steps));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14981(Context context, Integer num, int i, Continuation<? super C14981> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$widgetId = num;
            this.$steps = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14981(this.$context, this.$widgetId, this.$steps, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = WidgetPrefs.INSTANCE.getDataStore(this.$context);
                C03081 c03081 = new C03081(this.$widgetId, this.$steps, null);
                this.label = 1;
                obj = PreferencesKt.edit(dataStore, c03081, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Preferences> continuation) {
            return ((C14981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.utils.WidgetPrefs$setCurStepsSync$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.utils.WidgetPrefs$setCurStepsSync$2", f = "WidgetPrefs.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Preferences>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $steps;
        int label;

        /* JADX INFO: renamed from: com.mi.health.utils.WidgetPrefs$setCurStepsSync$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.utils.WidgetPrefs$setCurStepsSync$2$1", f = "WidgetPrefs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $steps;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$steps = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$steps, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.L$0).set(WidgetPrefs.INSTANCE.widgetStepKey(1), Boxing.boxInt(this.$steps));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$steps = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$steps, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = WidgetPrefs.INSTANCE.getDataStore(this.$context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$steps, null);
                this.label = 1;
                obj = PreferencesKt.edit(dataStore, anonymousClass1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Preferences> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private WidgetPrefs() {
    }

    public static /* synthetic */ int getCurStepsSync$default(WidgetPrefs widgetPrefs, Context context, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = 1;
        }
        return widgetPrefs.getCurStepsSync(context, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataStore<Preferences> getDataStore(Context context) {
        return (DataStore) dataStore.getValue(context, $$delegatedProperties[0]);
    }

    public static /* synthetic */ Preferences setCurStepsSync$default(WidgetPrefs widgetPrefs, Context context, Integer num, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = 1;
        }
        return widgetPrefs.setCurStepsSync(context, num, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Preferences.Key<Integer> widgetStepKey(int widgetId) {
        return PreferencesKeys.intKey("cur_steps_" + widgetId);
    }

    public final int getCurStepsSync(@NotNull Context context, @Nullable Integer widgetId) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ((Number) BuildersKt.runBlocking(Dispatchers.getIO(), new AnonymousClass1(context, widgetId, null))).intValue();
    }

    @NotNull
    public final Preferences setCurStepsSync(@NotNull Context context, @Nullable Integer widgetId, int steps) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Preferences) BuildersKt.runBlocking(Dispatchers.getIO(), new C14981(context, widgetId, steps, null));
    }

    @NotNull
    public final Preferences setCurStepsSync(@NotNull Context context, int steps) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Preferences) BuildersKt.runBlocking(Dispatchers.getIO(), new AnonymousClass2(context, steps, null));
    }
}

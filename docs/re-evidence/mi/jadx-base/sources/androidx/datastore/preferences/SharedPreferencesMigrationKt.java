package androidx.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a2\u0010\u000f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a:\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"MIGRATE_ALL_KEYS", "", "", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "SharedPreferencesMigration", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "produceSharedPreferences", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "keysToMigrate", "context", "Landroid/content/Context;", "sharedPreferencesName", "getMigrationFunction", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "Lkotlin/coroutines/Continuation;", "", "()Lkotlin/jvm/functions/Function3;", "getShouldRunMigration", "Lkotlin/Function2;", "", "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class SharedPreferencesMigrationKt {

    @NotNull
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "sharedPrefs", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentData"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull SharedPreferencesView sharedPreferencesView, @NotNull Preferences preferences, @Nullable Continuation<? super Preferences> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = sharedPreferencesView;
            anonymousClass1.L$1 = preferences;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
            Preferences preferences = (Preferences) this.L$1;
            Set<Preferences.Key<?>> setKeySet = preferences.asMap().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            Map<String, Object> all = sharedPreferencesView.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (Boxing.boxBoolean(!arrayList.contains(entry.getKey())).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof Float) {
                    mutablePreferences.set(PreferencesKeys.floatKey(str), value);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(PreferencesKeys.intKey(str), value);
                } else if (value instanceof Long) {
                    mutablePreferences.set(PreferencesKeys.longKey(str), value);
                } else if (value instanceof String) {
                    mutablePreferences.set(PreferencesKeys.stringKey(str), value);
                } else if (value instanceof Set) {
                    Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                    mutablePreferences.set(keyStringSetKey, (Set) value);
                } else {
                    continue;
                }
            }
            return mutablePreferences.toPreferences();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/Preferences;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C11971 extends SuspendLambda implements Function2<Preferences, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Set<String> $keysToMigrate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11971(Set<String> set, Continuation<? super C11971> continuation) {
            super(2, continuation);
            this.$keysToMigrate = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C11971 c11971 = new C11971(this.$keysToMigrate, continuation);
            c11971.L$0 = obj;
            return c11971;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Preferences preferences, @Nullable Continuation<? super Boolean> continuation) {
            return ((C11971) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Set<Preferences.Key<?>> setKeySet = ((Preferences) this.L$0).asMap().keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            boolean z = true;
            if (this.$keysToMigrate != SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
                Set<String> set = this.$keysToMigrate;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (Boxing.boxBoolean(!arrayList.contains((String) it2.next())).booleanValue()) {
                        }
                    }
                    z = false;
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Function0 function0, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration((Function0<? extends SharedPreferences>) function0, (Set<String>) set);
    }

    @NotNull
    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }

    private static final Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> getMigrationFunction() {
        return new AnonymousClass1(null);
    }

    private static final Function2<Preferences, Continuation<? super Boolean>, Object> getShouldRunMigration(Set<String> set) {
        return new C11971(set, null);
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences) {
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate) {
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(produceSharedPreferences, (Set) null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 2, (DefaultConstructorMarker) null);
        }
        return new SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Context context, String str, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(context, sharedPreferencesName, null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 4, null);
        }
        return new SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }
}

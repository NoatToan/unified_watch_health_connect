package com.xiaomi.wearable.yrn.components.calendar;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.yrn.components.calendar.YRNCalendarModule;
import defpackage.u1j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012H\u0002J\u001c\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u001a\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u001c\u0010\u001c\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\"\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001f\u0010\u000b\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\f0\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "permissions", "", "[Ljava/lang/String;", "permissionDescArray", "Lkotlin/jvm/internal/EnhancedNullability;", "getPermissionDescArray", "()[Ljava/lang/String;", "calendarPermissionAction", "", "action", "Lkotlin/Function1;", "", "addCalendarEvents", "calendarEventArray", "Lcom/facebook/react/bridge/ReadableArray;", "callback", "Lcom/facebook/react/bridge/Callback;", "deleteAllCalendarEvent", "deleteEventByTag", "eventTag", "deleteEventsByTitle", "getEventsByTimeRange", "startTime", "endTime", "Companion", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNCalendarModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNCalendarModule.kt\ncom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1863#2,2:137\n1863#2,2:139\n1863#2,2:141\n*S KotlinDebug\n*F\n+ 1 YRNCalendarModule.kt\ncom/xiaomi/wearable/yrn/components/calendar/YRNCalendarModule\n*L\n62#1:137,2\n104#1:139,2\n126#1:141,2\n*E\n"})
public final class YRNCalendarModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String TAG = "YRNCalendarModule";

    @NotNull
    private final String[] permissions;

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.calendar.YRNCalendarModule$calendarPermissionAction$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.calendar.YRNCalendarModule$calendarPermissionAction$1", f = "YRNCalendarModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $action;
        final /* synthetic */ FragmentActivity $currentActivity;
        int label;
        final /* synthetic */ YRNCalendarModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(FragmentActivity fragmentActivity, YRNCalendarModule yRNCalendarModule, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentActivity = fragmentActivity;
            this.this$0 = yRNCalendarModule;
            this.$action = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(final Function1 function1, MultiplePermissionsBuilder multiplePermissionsBuilder) {
            multiplePermissionsBuilder.allGranted(new Function0() { // from class: com.xiaomi.wearable.yrn.components.calendar.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return YRNCalendarModule.AnonymousClass1.invokeSuspend$lambda$2$lambda$0(function1);
                }
            });
            multiplePermissionsBuilder.denied(new Function1() { // from class: com.xiaomi.wearable.yrn.components.calendar.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return YRNCalendarModule.AnonymousClass1.invokeSuspend$lambda$2$lambda$1(function1, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$0(Function1 function1) {
            Logger.i(YRNCalendarModule.TAG, "Calender allGranted");
            function1.invoke2(Boolean.TRUE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1(Function1 function1, List list) {
            Logger.i(YRNCalendarModule.TAG, "Calender denied");
            function1.invoke2(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$currentActivity, this.this$0, this.$action, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FragmentActivity fragmentActivity = this.$currentActivity;
            String[] strArr = this.this$0.permissions;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            String[] permissionDescArray = this.this$0.getPermissionDescArray();
            final Function1<Boolean, Unit> function1 = this.$action;
            PermissionExtKt.permissions(fragmentActivity, strArr2, permissionDescArray, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: com.xiaomi.wearable.yrn.components.calendar.c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return YRNCalendarModule.AnonymousClass1.invokeSuspend$lambda$2(function1, (MultiplePermissionsBuilder) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNCalendarModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.permissions = new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addCalendarEvents$lambda$1(ReadableArray readableArray, FragmentActivity currentActivity, Callback callback, boolean z) {
        Intrinsics.checkNotNullParameter(currentActivity, "$currentActivity");
        if (z) {
            ArrayList<YRNCalendarModuleUtils.CalendarEvent> arrayList = new ArrayList<>();
            Intrinsics.checkNotNull(readableArray);
            Iterator<Integer> it = RangesKt___RangesKt.until(0, readableArray.size()).iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                YRNCalendarModuleUtils yRNCalendarModuleUtils = YRNCalendarModuleUtils.INSTANCE;
                ReadableMap map = readableArray.getMap(iNextInt);
                Intrinsics.checkNotNull(map);
                arrayList.add(yRNCalendarModuleUtils.calendarMapToEvent(map));
            }
            boolean zAddCalendarEvents = YRNCalendarModuleUtils.INSTANCE.addCalendarEvents(currentActivity, arrayList);
            if (callback != null) {
                callback.invoke(Boolean.valueOf(zAddCalendarEvents));
            }
        } else if (callback != null) {
            callback.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    private final void calendarPermissionAction(Function1<? super Boolean, Unit> action) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        AnyExtKt.main$default(null, new AnonymousClass1(fragmentActivity, this, action, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteAllCalendarEvent$lambda$2(Callback callback, FragmentActivity currentActivity, boolean z) {
        Intrinsics.checkNotNullParameter(currentActivity, "$currentActivity");
        if (z) {
            if (callback != null) {
                callback.invoke(Boolean.valueOf(YRNCalendarModuleUtils.INSTANCE.deleteAllCalendarEvent(currentActivity)));
            }
        } else if (callback != null) {
            callback.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteEventByTag$lambda$3(Callback callback, FragmentActivity currentActivity, String eventTag, boolean z) {
        Intrinsics.checkNotNullParameter(currentActivity, "$currentActivity");
        Intrinsics.checkNotNullParameter(eventTag, "$eventTag");
        if (z) {
            if (callback != null) {
                callback.invoke(Boolean.valueOf(YRNCalendarModuleUtils.INSTANCE.deleteEventByTag(currentActivity, eventTag)));
            }
        } else if (callback != null) {
            callback.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteEventsByTitle$lambda$6(ReadableArray readableArray, FragmentActivity currentActivity, Callback callback, boolean z) {
        Intrinsics.checkNotNullParameter(currentActivity, "$currentActivity");
        if (z) {
            ArrayList arrayList = new ArrayList();
            Intrinsics.checkNotNull(readableArray);
            Iterator<Integer> it = RangesKt___RangesKt.until(0, readableArray.size()).iterator();
            while (it.hasNext()) {
                ReadableMap map = readableArray.getMap(((IntIterator) it).nextInt());
                Intrinsics.checkNotNull(map);
                String string = map.getString("title");
                String str = "";
                if (string == null) {
                    string = "";
                }
                String string2 = map.getString("desc");
                if (string2 != null) {
                    str = string2;
                }
                arrayList.add(TuplesKt.to(string, str));
            }
            boolean zDeleteEventsByTitleDescriptionSet = YRNCalendarModuleUtils.INSTANCE.deleteEventsByTitleDescriptionSet(currentActivity, arrayList);
            if (callback != null) {
                callback.invoke(Boolean.valueOf(zDeleteEventsByTitleDescriptionSet));
            }
        } else if (callback != null) {
            callback.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEventsByTimeRange$lambda$8(FragmentActivity currentActivity, String startTime, String endTime, Callback callback, boolean z) {
        Intrinsics.checkNotNullParameter(currentActivity, "$currentActivity");
        Intrinsics.checkNotNullParameter(startTime, "$startTime");
        Intrinsics.checkNotNullParameter(endTime, "$endTime");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (z) {
            YRNCalendarModuleUtils yRNCalendarModuleUtils = YRNCalendarModuleUtils.INSTANCE;
            Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(startTime);
            long j = 1000;
            long jLongValue = (longOrNull != null ? longOrNull.longValue() : 0L) * j;
            Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(endTime);
            Iterator<T> it = yRNCalendarModuleUtils.getEventsByTimeRange(currentActivity, jLongValue, (longOrNull2 != null ? longOrNull2.longValue() : 0L) * j).iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap(YRNCalendarModuleUtils.INSTANCE.calendarEventToRNMap((YRNCalendarModuleUtils.CalendarEvent) it.next()));
            }
            if (callback != null) {
                callback.invoke(writableArrayCreateArray);
            }
        } else if (callback != null) {
            callback.invoke(writableArrayCreateArray);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] getPermissionDescArray() {
        return new String[]{ApplicationExtKt.getApplication().getString(u1j.f35278b), " "};
    }

    @ReactMethod
    public final void addCalendarEvents(@Nullable final ReadableArray calendarEventArray, @Nullable final Callback callback) {
        if (calendarEventArray == null || calendarEventArray.size() == 0) {
            return;
        }
        AppManager.Companion companion = AppManager.INSTANCE;
        if (companion.getInstance().getCurrentActivity() == null) {
            return;
        }
        Activity currentActivity = companion.getInstance().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        final FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
        calendarPermissionAction(new Function1() { // from class: awr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YRNCalendarModule.addCalendarEvents$lambda$1(calendarEventArray, fragmentActivity, callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    @ReactMethod
    public final void deleteAllCalendarEvent(@Nullable final Callback callback) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        final FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        calendarPermissionAction(new Function1() { // from class: wvr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YRNCalendarModule.deleteAllCalendarEvent$lambda$2(callback, fragmentActivity, ((Boolean) obj).booleanValue());
            }
        });
    }

    @ReactMethod
    public final void deleteEventByTag(@NotNull final String eventTag, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(eventTag, "eventTag");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        final FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        calendarPermissionAction(new Function1() { // from class: yvr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YRNCalendarModule.deleteEventByTag$lambda$3(callback, fragmentActivity, eventTag, ((Boolean) obj).booleanValue());
            }
        });
    }

    @ReactMethod
    public final void deleteEventsByTitle(@Nullable final ReadableArray calendarEventArray, @Nullable final Callback callback) {
        if (calendarEventArray == null || calendarEventArray.size() == 0) {
            return;
        }
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        final FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        calendarPermissionAction(new Function1() { // from class: xvr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YRNCalendarModule.deleteEventsByTitle$lambda$6(calendarEventArray, fragmentActivity, callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    @ReactMethod
    public final void getEventsByTimeRange(@NotNull final String startTime, @NotNull final String endTime, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        final FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        calendarPermissionAction(new Function1() { // from class: zvr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YRNCalendarModule.getEventsByTimeRange$lambda$8(fragmentActivity, startTime, endTime, callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return TAG;
    }
}

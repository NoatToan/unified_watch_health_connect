package com.xiaomi.wearable.yrn.components.permission;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.wearable.yrn.components.YRNComponentsExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/permission/YRNPermissionModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "check", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "callback", "Lcom/facebook/react/bridge/Callback;", "request", "openSettings", "getPermissionStatus", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "permission", "getName", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNPermissionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNPermissionModule.kt\ncom/xiaomi/wearable/yrn/components/permission/YRNPermissionModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1863#2,2:181\n*S KotlinDebug\n*F\n+ 1 YRNPermissionModule.kt\ncom/xiaomi/wearable/yrn/components/permission/YRNPermissionModule\n*L\n51#1:181,2\n*E\n"})
public final class YRNPermissionModule extends ReactContextBaseJavaModule {

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.permission.YRNPermissionModule$openSettings$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.permission.YRNPermissionModule$openSettings$2", f = "YRNPermissionModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ WritableMap $errorMap;
        final /* synthetic */ WritableMap $map;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity, WritableMap writableMap, Callback callback, WritableMap writableMap2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentActivity = activity;
            this.$map = writableMap;
            this.$callback = callback;
            this.$errorMap = writableMap2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$currentActivity, this.$map, this.$callback, this.$errorMap, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PermissionsUtil.INSTANCE.toPermissionSetting(this.$currentActivity);
            WritableMap writableMap = this.$map;
            WritableMap writableMap2 = this.$errorMap;
            writableMap2.putInt("code", 0);
            writableMap2.putString("message", "跳转成功");
            Unit unit = Unit.INSTANCE;
            writableMap.putMap("error", writableMap2);
            this.$callback.invoke(this.$map);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.permission.YRNPermissionModule$request$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.permission.YRNPermissionModule$request$2", f = "YRNPermissionModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nYRNPermissionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNPermissionModule.kt\ncom/xiaomi/wearable/yrn/components/permission/YRNPermissionModule$request$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n37#2:181\n36#2,3:182\n37#2:185\n36#2,3:186\n1863#3,2:189\n1863#3,2:191\n*S KotlinDebug\n*F\n+ 1 YRNPermissionModule.kt\ncom/xiaomi/wearable/yrn/components/permission/YRNPermissionModule$request$2\n*L\n89#1:181\n89#1:182,3\n90#1:185\n90#1:186,3\n105#1:189,2\n125#1:191,2\n*E\n"})
    public static final class C34862 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ FragmentActivity $currentActivity;
        final /* synthetic */ List<String> $descriptions;
        final /* synthetic */ WritableMap $errorMap;
        final /* synthetic */ Ref.BooleanRef $hasCompletedRequest;
        final /* synthetic */ WritableMap $map;
        final /* synthetic */ List<String> $permissions;
        final /* synthetic */ WritableMap $resultMap;
        int label;
        final /* synthetic */ YRNPermissionModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34862(FragmentActivity fragmentActivity, List<String> list, List<String> list2, Ref.BooleanRef booleanRef, WritableMap writableMap, Callback callback, WritableMap writableMap2, WritableMap writableMap3, YRNPermissionModule yRNPermissionModule, Continuation<? super C34862> continuation) {
            super(2, continuation);
            this.$currentActivity = fragmentActivity;
            this.$permissions = list;
            this.$descriptions = list2;
            this.$hasCompletedRequest = booleanRef;
            this.$map = writableMap;
            this.$callback = callback;
            this.$errorMap = writableMap2;
            this.$resultMap = writableMap3;
            this.this$0 = yRNPermissionModule;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$10(final Ref.BooleanRef booleanRef, final WritableMap writableMap, final Callback callback, final WritableMap writableMap2, final WritableMap writableMap3, final List list, final YRNPermissionModule yRNPermissionModule, final FragmentActivity fragmentActivity, MultiplePermissionsBuilder multiplePermissionsBuilder) {
            multiplePermissionsBuilder.allGranted(new Function0() { // from class: com.xiaomi.wearable.yrn.components.permission.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return YRNPermissionModule.C34862.invokeSuspend$lambda$10$lambda$4(booleanRef, writableMap, callback, writableMap2, writableMap3, list);
                }
            });
            multiplePermissionsBuilder.denied(new Function1() { // from class: com.xiaomi.wearable.yrn.components.permission.c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return YRNPermissionModule.C34862.invokeSuspend$lambda$10$lambda$9(booleanRef, writableMap, callback, writableMap2, writableMap3, list, yRNPermissionModule, fragmentActivity, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$10$lambda$4(Ref.BooleanRef booleanRef, WritableMap writableMap, Callback callback, WritableMap writableMap2, WritableMap writableMap3, List list) {
            if (booleanRef.element) {
                System.out.println((Object) "YRNPermissionModule: 请求已完成，忽略重复的allGranted回调");
                return Unit.INSTANCE;
            }
            booleanRef.element = true;
            writableMap2.putInt("code", 0);
            writableMap2.putString("message", "成功");
            Unit unit = Unit.INSTANCE;
            writableMap.putMap("error", writableMap2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writableMap3.putString((String) it.next(), "granted");
            }
            Unit unit2 = Unit.INSTANCE;
            writableMap.putMap("result", writableMap3);
            callback.invoke(writableMap);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$10$lambda$9(Ref.BooleanRef booleanRef, WritableMap writableMap, Callback callback, WritableMap writableMap2, WritableMap writableMap3, List list, YRNPermissionModule yRNPermissionModule, FragmentActivity fragmentActivity, List list2) {
            if (booleanRef.element) {
                System.out.println((Object) "YRNPermissionModule: 请求已完成，忽略重复的denied回调");
                return Unit.INSTANCE;
            }
            booleanRef.element = true;
            writableMap2.putInt("code", -2);
            writableMap2.putString("message", "部分成功");
            Unit unit = Unit.INSTANCE;
            writableMap.putMap("error", writableMap2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                writableMap3.putString(str, yRNPermissionModule.getPermissionStatus(fragmentActivity, str));
            }
            Unit unit2 = Unit.INSTANCE;
            writableMap.putMap("result", writableMap3);
            callback.invoke(writableMap);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34862(this.$currentActivity, this.$permissions, this.$descriptions, this.$hasCompletedRequest, this.$map, this.$callback, this.$errorMap, this.$resultMap, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FragmentActivity fragmentActivity = this.$currentActivity;
            String[] strArr = (String[]) this.$permissions.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            String[] strArr3 = (String[]) this.$descriptions.toArray(new String[0]);
            final Ref.BooleanRef booleanRef = this.$hasCompletedRequest;
            final WritableMap writableMap = this.$map;
            final Callback callback = this.$callback;
            final WritableMap writableMap2 = this.$errorMap;
            final WritableMap writableMap3 = this.$resultMap;
            final List<String> list = this.$permissions;
            final YRNPermissionModule yRNPermissionModule = this.this$0;
            final FragmentActivity fragmentActivity2 = this.$currentActivity;
            PermissionExtKt.permissions(fragmentActivity, strArr2, strArr3, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: com.xiaomi.wearable.yrn.components.permission.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return YRNPermissionModule.C34862.invokeSuspend$lambda$10(booleanRef, writableMap, callback, writableMap2, writableMap3, list, yRNPermissionModule, fragmentActivity2, (MultiplePermissionsBuilder) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNPermissionModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPermissionStatus(Activity activity, String permission) {
        if (PermissionExtKt.isPermissionGranted(activity, permission)) {
            return "granted";
        }
        if (androidx.core.app.a.z(activity, permission)) {
            return "denied";
        }
        return !PermissionExtKt.isPermissionDeniedForever(activity, permission) ? "blocked" : "unavailable";
    }

    @ReactMethod
    public final void check(@NotNull ReadableArray readableArray, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(readableArray, "readableArray");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            writableMapCreateMap2.putInt("code", -1);
            writableMapCreateMap2.putString("message", "没有可用的Activity");
            Unit unit = Unit.INSTANCE;
            writableMapCreateMap.putMap("error", writableMapCreateMap2);
            callback.invoke(writableMapCreateMap);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                arrayList.add(string);
            }
        }
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("message", "成功");
        Unit unit2 = Unit.INSTANCE;
        writableMapCreateMap.putMap("error", writableMapCreateMap2);
        for (String str : arrayList) {
            writableMapCreateMap3.putString(str, getPermissionStatus(currentActivity, str));
        }
        Unit unit3 = Unit.INSTANCE;
        writableMapCreateMap.putMap("result", writableMapCreateMap3);
        callback.invoke(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "YRNPermissionModule";
    }

    @ReactMethod
    public final void openSettings(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            AnyExtKt.main$default(null, new AnonymousClass2(currentActivity, writableMapCreateMap, callback, writableMapCreateMap2, null), 1, null);
            return;
        }
        writableMapCreateMap2.putInt("code", -1);
        writableMapCreateMap2.putString("message", "没有可用的Activity");
        Unit unit = Unit.INSTANCE;
        writableMapCreateMap.putMap("error", writableMapCreateMap2);
        callback.invoke(writableMapCreateMap);
    }

    @ReactMethod
    public final void request(@NotNull ReadableArray readableArray, @NotNull Callback callback) {
        String strSafeGetString$default;
        Intrinsics.checkNotNullParameter(readableArray, "readableArray");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        FragmentActivity fragmentActivity = (FragmentActivity) AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (fragmentActivity == null) {
            writableMapCreateMap2.putInt("code", -1);
            writableMapCreateMap2.putString("message", "没有可用的Activity");
            Unit unit = Unit.INSTANCE;
            writableMapCreateMap.putMap("error", writableMapCreateMap2);
            callback.invoke(writableMapCreateMap);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            if (map != null && (strSafeGetString$default = YRNComponentsExtKt.safeGetString$default(map, "permission", null, 2, null)) != null) {
                String strSafeGetString$default2 = YRNComponentsExtKt.safeGetString$default(map, "description", null, 2, null);
                if (strSafeGetString$default2 == null) {
                    strSafeGetString$default2 = "";
                }
                arrayList.add(strSafeGetString$default);
                arrayList2.add(strSafeGetString$default2);
            }
        }
        AnyExtKt.main$default(null, new C34862(fragmentActivity, arrayList, arrayList2, new Ref.BooleanRef(), writableMapCreateMap, callback, writableMapCreateMap2, writableMapCreateMap3, this, null), 1, null);
    }
}

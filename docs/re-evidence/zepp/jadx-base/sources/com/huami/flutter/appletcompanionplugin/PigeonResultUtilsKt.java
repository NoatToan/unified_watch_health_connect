package com.huami.flutter.appletcompanionplugin;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.m.l.c;
import com.huami.applet.bluetooth.store.Callback;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aS\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\u0007\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0010\"\u0016\u0010\u0014\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", c.n, "Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$Result;", "result", "defaultValue", "Lcom/huami/applet/bluetooth/store/Callback;", "handleResultCallback", "(Ljava/lang/String;Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$Result;Ljava/lang/Object;)Lcom/huami/applet/bluetooth/store/Callback;", "R", "Lkotlin/Function1;", SportAnalytics.ParamValue.MapButtonType.MAP, "(Ljava/lang/String;Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$Result;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/huami/applet/bluetooth/store/Callback;", "value", "", "postSuccess", "(Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$Result;Ljava/lang/String;Ljava/lang/Object;)V", "catchFailed", "a", "Ljava/lang/String;", "TAG", "applet_companion_plugin_release"}, k = 2, mv = {1, 5, 1})
public final class PigeonResultUtilsKt {

    @NotNull
    private static final String a = "PigeonAppletCompanionChannelApi";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.flutter.appletcompanionplugin.PigeonResultUtilsKt$catchFailed$1", f = "PigeonResultUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PigeonAppletCompanionChannel.Result<T> b;
        public final /* synthetic */ T c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: com.huami.flutter.appletcompanionplugin.PigeonResultUtilsKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0425a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ T b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0425a(String str, T t) {
                super(0);
                this.a = str;
                this.b = t;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a + " failed, return default value: " + this.b + '.';
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ T b;
            public final /* synthetic */ Exception c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, T t, Exception exc) {
                super(0);
                this.a = str;
                this.b = t;
                this.c = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a + " failed, An exception occurred while sending " + this.b + " > " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PigeonAppletCompanionChannel.Result<T> result, T t, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = result;
            this.c = t;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                this.b.success(this.c);
                HMLog.error$default(PigeonResultUtilsKt.a, null, null, new C0425a(this.d, this.c), 6, null);
            } catch (Exception e) {
                HMLog.error$default(PigeonResultUtilsKt.a, null, null, new b(this.d, this.c, e), 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.flutter.appletcompanionplugin.PigeonResultUtilsKt$postSuccess$1", f = "PigeonResultUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PigeonAppletCompanionChannel.Result<T> b;
        public final /* synthetic */ T c;
        public final /* synthetic */ String d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ T b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, T t) {
                super(0);
                this.a = str;
                this.b = t;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a + " success! data is " + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.flutter.appletcompanionplugin.PigeonResultUtilsKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0426b extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ T b;
            public final /* synthetic */ Exception c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0426b(String str, T t, Exception exc) {
                super(0);
                this.a = str;
                this.b = t;
                this.c = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a + " success! An exception occurred while sending " + this.b + " > " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PigeonAppletCompanionChannel.Result<T> result, T t, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = result;
            this.c = t;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                this.b.success(this.c);
                HMLog.info(PigeonResultUtilsKt.a, new a(this.d, this.c));
            } catch (Exception e) {
                HMLog.error$default(PigeonResultUtilsKt.a, null, null, new C0426b(this.d, this.c, e), 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> void catchFailed(@NotNull PigeonAppletCompanionChannel.Result<T> result, @NotNull String str, T t) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(result, t, str, null), 3, null);
    }

    @NotNull
    public static final <T> Callback<T> handleResultCallback(@NotNull final String str, @NotNull final PigeonAppletCompanionChannel.Result<T> result, final T t) {
        return new Callback<T>() { // from class: com.huami.flutter.appletcompanionplugin.PigeonResultUtilsKt.handleResultCallback.1
            @Override // com.huami.applet.bluetooth.store.Callback
            public void failed(@NotNull Throwable e) {
                PigeonResultUtilsKt.catchFailed(result, str, t);
            }

            @Override // com.huami.applet.bluetooth.store.Callback
            public void success(T response) {
                PigeonResultUtilsKt.postSuccess(result, str, response);
            }
        };
    }

    public static final <T> void postSuccess(@NotNull PigeonAppletCompanionChannel.Result<T> result, @NotNull String str, T t) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(result, t, str, null), 3, null);
    }

    @NotNull
    public static final <T, R> Callback<T> handleResultCallback(@NotNull final String str, @NotNull final PigeonAppletCompanionChannel.Result<R> result, final T t, @NotNull final Function1<? super T, ? extends R> function1) {
        return new Callback<T>() { // from class: com.huami.flutter.appletcompanionplugin.PigeonResultUtilsKt.handleResultCallback.2
            @Override // com.huami.applet.bluetooth.store.Callback
            public void failed(@NotNull Throwable e) {
                PigeonResultUtilsKt.catchFailed(result, str, function1.invoke(t));
            }

            @Override // com.huami.applet.bluetooth.store.Callback
            public void success(T response) {
                PigeonResultUtilsKt.postSuccess(result, str, function1.invoke(response));
            }
        };
    }
}

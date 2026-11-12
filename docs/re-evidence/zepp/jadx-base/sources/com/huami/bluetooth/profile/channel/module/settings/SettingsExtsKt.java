package com.huami.bluetooth.profile.channel.module.settings;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a3\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a0\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "type", "", "needDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "query", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "querySync", ExifInterface.GPS_DIRECTION_TRUE, "queryWithType", "querySyncWithType", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Z)Ljava/lang/Object;", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SettingsExtsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsExtsKt", f = "SettingsExts.kt", i = {0}, l = {10}, m = "query", n = {"type"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return SettingsExtsKt.query(null, null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsExtsKt$querySync$1", f = "SettingsExts.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        public int a;
        public final /* synthetic */ SettingsModule b;
        public final /* synthetic */ SettingsGroupType c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = settingsModule;
            this.c = settingsGroupType;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Settings> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = this.b;
                SettingsGroupType settingsGroupType = this.c;
                boolean z = this.d;
                this.a = 1;
                obj = SettingsExtsKt.query(settingsModule, settingsGroupType, z, this);
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
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.SettingsExtsKt$querySyncWithType$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsExtsKt$querySyncWithType$1", f = "SettingsExts.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        public int a;
        public final /* synthetic */ SettingsModule b;
        public final /* synthetic */ SettingsGroupType c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = settingsModule;
            this.c = settingsGroupType;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super T> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = this.b;
                SettingsGroupType settingsGroupType = this.c;
                boolean z = this.d;
                this.a = 1;
                obj = SettingsExtsKt.query(settingsModule, settingsGroupType, z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
            return obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object query(@NotNull SettingsModule settingsModule, @NotNull SettingsGroupType settingsGroupType, boolean z, @NotNull Continuation<? super Settings> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQuerySettings = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuerySettings);
            aVar.a = settingsGroupType;
            aVar.c = 1;
            objQuerySettings = settingsModule.querySettings(z, new SettingsGroupType[]{settingsGroupType}, aVar);
            if (objQuerySettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsGroupType = (SettingsGroupType) aVar.a;
            ResultKt.throwOnFailure(objQuerySettings);
        }
        HashMap map = (HashMap) objQuerySettings;
        if (map == null) {
            return null;
        }
        return (Settings) map.get(settingsGroupType);
    }

    public static /* synthetic */ Object query$default(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return query(settingsModule, settingsGroupType, z, continuation);
    }

    @Nullable
    public static final Settings querySync(@NotNull SettingsModule settingsModule, @NotNull SettingsGroupType settingsGroupType, boolean z) {
        return (Settings) d.b(null, new b(settingsModule, settingsGroupType, z, null), 1, null);
    }

    public static /* synthetic */ Settings querySync$default(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return querySync(settingsModule, settingsGroupType, z);
    }

    public static final /* synthetic */ <T> T querySyncWithType(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z) {
        Intrinsics.needClassReification();
        return (T) d.b(null, new AnonymousClass1(settingsModule, settingsGroupType, z, null), 1, null);
    }

    public static /* synthetic */ Object querySyncWithType$default(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        Intrinsics.needClassReification();
        return d.b(null, new AnonymousClass1(settingsModule, settingsGroupType, z, null), 1, null);
    }

    public static final /* synthetic */ <T> Object queryWithType(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object objQuery = query(settingsModule, settingsGroupType, z, continuation);
        InlineMarker.mark(1);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return objQuery;
    }

    public static /* synthetic */ Object queryWithType$default(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        InlineMarker.mark(0);
        Object objQuery = query(settingsModule, settingsGroupType, z, continuation);
        InlineMarker.mark(1);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return objQuery;
    }
}

package com.xiaomi.fitness.devicesettings.export;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.onetrack.b.m;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/LanguageUtil;", "", "<init>", "()V", "sHuamiCN", "", "sHuamiTW", "sHuamiEN", "getDefaultLang", "", "huaMiDevice", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "(Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHuaMiLanguageStrByTag", "language", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LanguageUtil {

    @NotNull
    public static final LanguageUtil INSTANCE = new LanguageUtil();
    public static final int sHuamiCN = 0;
    public static final int sHuamiEN = 2;
    public static final int sHuamiTW = 1;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.export.LanguageUtil$getDefaultLang$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.export.LanguageUtil", f = "LanguageUtil.kt", i = {0, 0}, l = {21}, m = "getDefaultLang", n = {"currentLocale", "languageList"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LanguageUtil.this.getDefaultLang(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.export.LanguageUtil$getDefaultLang$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.export.LanguageUtil$getDefaultLang$2", f = "LanguageUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $huaMiDevice;
        final /* synthetic */ Ref.ObjectRef<List<HMLanguage>> $languageList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<List<HMLanguage>> objectRef, HuamiApiCaller huamiApiCaller, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$languageList = objectRef;
            this.$huaMiDevice = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$languageList, this.$huaMiDevice, continuation);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$languageList.element = this.$huaMiDevice.getLanguages();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private LanguageUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.Locale] */
    @Nullable
    public final Object getDefaultLang(@Nullable HuamiApiCaller huamiApiCaller, @NotNull Continuation<? super String> continuation) {
        AnonymousClass1 anonymousClass1;
        Locale locale;
        Ref.ObjectRef objectRef;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Locale locale2 = Locale.getDefault();
            if (huamiApiCaller == null) {
                return "en";
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(objectRef2, huamiApiCaller, null);
            anonymousClass1.L$0 = locale2;
            anonymousClass1.L$1 = objectRef2;
            anonymousClass1.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass2, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            locale = locale2;
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) anonymousClass1.L$1;
            locale = (Locale) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        List<HMLanguage> list = (List) objectRef.element;
        if (list == null || !(!list.isEmpty())) {
            return "en";
        }
        for (HMLanguage hMLanguage : list) {
            if (hMLanguage != null) {
                ?? locale3 = HuamiDevice.getLocale(hMLanguage.getLanguage());
                objectRef3.element = locale3;
                if (locale3 != 0 && locale3.getLanguage().equals(locale.getLanguage())) {
                    Logger.i("DeviceHuaMi:currentLocale:" + locale.getLanguage() + " deviceLanguage:" + hMLanguage, new Object[0]);
                    return INSTANCE.getHuaMiLanguageStrByTag(hMLanguage.getLanguage());
                }
            }
        }
        return "en";
    }

    @NotNull
    public final String getHuaMiLanguageStrByTag(int language) {
        switch (language) {
            case 0:
                return "zh_cn";
            case 1:
                return "zh_tw";
            case 2:
            case 24:
            case 25:
            default:
                return "en";
            case 3:
                return "es";
            case 4:
                return "ru";
            case 5:
                return "ko";
            case 6:
                return "fr";
            case 7:
                return "de";
            case 8:
                return "in";
            case 9:
                return "pl";
            case 10:
                return "it";
            case 11:
                return "ja";
            case 12:
                return "th";
            case 13:
                return "ar";
            case 14:
                return "vi";
            case 15:
                return "pt";
            case 16:
                return "nl";
            case 17:
                return "tr";
            case 18:
                return "uk";
            case 19:
                return "he";
            case 20:
                return "br";
            case 21:
                return Language.RO;
            case 22:
                return Language.CS;
            case 23:
                return Language.EL;
            case 26:
                return "fi";
            case 27:
                return "no";
            case 28:
                return "da";
            case 29:
                return m.e;
        }
    }
}

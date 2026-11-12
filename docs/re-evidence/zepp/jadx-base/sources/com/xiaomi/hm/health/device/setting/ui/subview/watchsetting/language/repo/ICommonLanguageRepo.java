package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo.CommonLanguageConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&R\u0016\u0010\u0011\u001a\u00020\u000e8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/repo/ICommonLanguageRepo;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "queryLanguageConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "languageConfig", "", "setLanguageConfig", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "removeListener", "", "getName", "()Ljava/lang/String;", "name", "Lkotlin/Function1;", "", "getToDesc", "()Lkotlin/jvm/functions/Function1;", "toDesc", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ICommonLanguageRepo {
    void addListener(@NotNull ChangeListener listener);

    @NotNull
    String getName();

    @NotNull
    Function1<Integer, String> getToDesc();

    @Nullable
    Object queryLanguageConfig(@NotNull Continuation<? super CommonLanguageConfig> continuation);

    void removeListener(@NotNull ChangeListener listener);

    @Nullable
    Object setLanguageConfig(@NotNull CommonLanguageConfig commonLanguageConfig, @NotNull Continuation<? super Boolean> continuation);
}

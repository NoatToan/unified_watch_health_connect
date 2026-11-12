package com.huami.bluetooth.profile.channel.module.todo;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.bgt;
import defpackage.d4;
import defpackage.r3;
import defpackage.wu;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/TodoModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lbgt;", "loadApi", "()Lbgt;", "", "init", "()V", "Lwu;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lwu;", "api", "Lr3;", "channelController", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 18)
public final class TodoModule extends com.huami.bluetooth.profile.channel.module.a {

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwu;", PluginDeviceInfo.FMODEL, "()Lwu;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<wu> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wu invoke() {
            return new wu(TodoModule.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.api = LazyKt__LazyJVMKt.lazy(new a());
        init();
    }

    private final wu getApi() {
        return (wu) this.api.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        getApi().initCallback$bluetooth_release();
    }

    @NotNull
    public final bgt loadApi() {
        return getApi();
    }
}

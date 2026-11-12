package com.huami.bluetooth.profile.channel.module.call_reply;

import com.huami.bluetooth.profile.channel.module.a;
import com.huami.bluetooth.profile.channel.module.call_reply.impl.CallReplyImpl;
import defpackage.d4;
import defpackage.r3;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "loadApi", "", "init", "Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/CallReplyImpl;", "api", "Lr3;", "channelController", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 19)
public final class CallReplyModule extends a {

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallReplyModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.api = LazyKt__LazyJVMKt.lazy(new Function0<CallReplyImpl>() { // from class: com.huami.bluetooth.profile.channel.module.call_reply.CallReplyModule$api$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CallReplyImpl invoke() {
                return new CallReplyImpl(this.this$0);
            }
        });
        init();
    }

    private final CallReplyImpl getApi() {
        return (CallReplyImpl) this.api.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        getApi().initCallback$bluetooth_release();
    }

    @NotNull
    public final CallReplyApi loadApi() {
        return getApi();
    }
}

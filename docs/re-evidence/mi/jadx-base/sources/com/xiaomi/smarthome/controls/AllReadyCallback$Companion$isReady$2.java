package com.xiaomi.smarthome.controls;

import com.xiaomi.smarthome.IReadyCallback;
import com.xiaomi.smarthome.utils.Watcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "ready", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class AllReadyCallback$Companion$isReady$2 extends Lambda implements Function1<Integer, Boolean> {
    final /* synthetic */ int $autoRequest;
    final /* synthetic */ String $hexIndex;
    final /* synthetic */ AllReadyCallback.InstanceHolder $holder;
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllReadyCallback$Companion$isReady$2(AllReadyCallback.InstanceHolder instanceHolder, String str, int i, int i2) {
        super(1);
        this.$holder = instanceHolder;
        this.$hexIndex = str;
        this.$autoRequest = i;
        this.$index = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m840invoke$lambda0(String hexIndex, AllReadyCallback.InstanceHolder instanceHolder, int i, Integer itemReady) {
        Intrinsics.checkNotNullParameter(hexIndex, "$hexIndex");
        if (itemReady != null && itemReady.intValue() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("end index ");
            sb.append(hexIndex);
            sb.append(' ');
            sb.append(itemReady);
            Intrinsics.checkNotNullExpressionValue(itemReady, "itemReady");
            instanceHolder.setReadyCallback(itemReady.intValue());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("end index ");
        sb2.append(hexIndex);
        sb2.append(" fail ");
        sb2.append(itemReady);
        sb2.append(" error code ");
        sb2.append(itemReady);
        instanceHolder.setReadyCallback(i);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Boolean invoke2(Integer num) {
        return invoke(num.intValue());
    }

    @NotNull
    public final Boolean invoke(int i) {
        if (i == 0) {
            IReadyCallback iReadyCallbackInvoke = this.$holder.getCreater().invoke();
            StringBuilder sb = new StringBuilder();
            sb.append("start index ");
            sb.append(this.$hexIndex);
            sb.append(' ');
            sb.append(iReadyCallbackInvoke);
            sb.append(" autoRequest ");
            sb.append(this.$autoRequest);
            boolean zIsAutoRequest = AllReadyCallback.INSTANCE.isAutoRequest(this.$holder.getType(), this.$autoRequest);
            final String str = this.$hexIndex;
            final AllReadyCallback.InstanceHolder instanceHolder = this.$holder;
            final int i2 = this.$index;
            iReadyCallbackInvoke.isReadyListener(zIsAutoRequest, new Watcher() { // from class: com.xiaomi.smarthome.controls.a
                @Override // com.xiaomi.smarthome.utils.Watcher
                public final void accept(Object obj) {
                    AllReadyCallback$Companion$isReady$2.m840invoke$lambda0(str, instanceHolder, i2, (Integer) obj);
                }
            });
        } else {
            this.$holder.setReadyCallback(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("end index ");
            sb2.append(this.$hexIndex);
            sb2.append(" dep fail ");
            sb2.append(i);
        }
        return Boolean.TRUE;
    }
}

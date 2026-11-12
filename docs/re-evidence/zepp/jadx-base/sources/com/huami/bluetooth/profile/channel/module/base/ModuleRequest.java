package com.huami.bluetooth.profile.channel.module.base;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.Request;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u0000 12\u00020\u0001:\u00011B7\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\"\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0013\u0010.\u001a\u00020&8F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "", "", "isTimeout", "Lcom/huami/bluetooth/profile/Request$Command;", "a", "Lcom/huami/bluetooth/profile/Request$Command;", "getCommand", "()Lcom/huami/bluetooth/profile/Request$Command;", "command", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "b", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "getPrediction", "()Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "prediction", "", "c", "J", "getTimeout", "()J", "setTimeout", "(J)V", "timeout", "Ljava/util/UUID;", GoogleApiAvailabilityLight.a, "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "id", "e", "Z", "getNeedTailReply", "()Z", "needTailReply", "f", ParamKey.createTime, "Lkotlinx/coroutines/channels/Channel;", "", "g", "Lkotlinx/coroutines/channels/Channel;", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "channel", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(Lcom/huami/bluetooth/profile/Request$Command;Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;JLjava/util/UUID;Z)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ModuleRequest {
    private static final long h = 5000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Request.Command command;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ResponsePredict prediction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long timeout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final UUID id;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean needTailReply;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long createTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Channel<byte[]> channel;

    public ModuleRequest(@NotNull Request.Command command, @NotNull ResponsePredict responsePredict, long j, @NotNull UUID uuid, boolean z) {
        this.command = command;
        this.prediction = responsePredict;
        this.timeout = j;
        this.id = uuid;
        this.needTailReply = z;
        this.createTime = System.currentTimeMillis();
        this.channel = ChannelKt.Channel$default(0, 1, null);
    }

    @NotNull
    public final byte[] getBytes() {
        return this.command.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
    }

    @NotNull
    public final Channel<byte[]> getChannel() {
        return this.channel;
    }

    @NotNull
    public final Request.Command getCommand() {
        return this.command;
    }

    @NotNull
    public final UUID getId() {
        return this.id;
    }

    public final boolean getNeedTailReply() {
        return this.needTailReply;
    }

    @NotNull
    public final ResponsePredict getPrediction() {
        return this.prediction;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final boolean isTimeout() {
        return System.currentTimeMillis() - this.createTime >= this.timeout;
    }

    public final void setTimeout(long j) {
        this.timeout = j;
    }

    public /* synthetic */ ModuleRequest(Request.Command command, ResponsePredict responsePredict, long j, UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(command, (i & 2) != 0 ? DefaultPredict.INSTANCE : responsePredict, (i & 4) != 0 ? 5000L : j, (i & 8) != 0 ? UUID.randomUUID() : uuid, (i & 16) != 0 ? true : z);
    }
}

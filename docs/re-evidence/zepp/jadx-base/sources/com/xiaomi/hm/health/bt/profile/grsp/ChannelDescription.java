package com.xiaomi.hm.health.bt.profile.grsp;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/grsp/ChannelDescription;", "", "", "toString", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/grsp/ChannelDataType;", "a", "Ljava/util/ArrayList;", "getChannelDescriptions", "()Ljava/util/ArrayList;", "channelDescriptions", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelDescription {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<ChannelDataType> channelDescriptions = new ArrayList<>();

    @NotNull
    public final ArrayList<ChannelDataType> getChannelDescriptions() {
        return this.channelDescriptions;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = this.channelDescriptions.iterator();
        while (it2.hasNext()) {
            sb.append((ChannelDataType) it2.next());
        }
        return sb.toString();
    }
}

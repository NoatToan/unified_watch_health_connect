package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dv, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB#\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Ldv;", "", "", PluginDeviceInfo.FDESC, "", "toString", "", "hashCode", "other", "equals", MediaStoreUtil.MediaInfo.SIZE, "I", PluginDeviceInfo.FMODEL, "()I", b.M, "receivedData", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TransferContinueResponse {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int retry;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int receivedData;

    /* JADX INFO: renamed from: dv$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ldv$a;", "", "", "RETRY", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TransferContinueResponse(int i, int i2, int i3) {
        this.size = i;
        this.retry = i2;
        this.receivedData = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean b() {
        return this.retry == 1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferContinueResponse)) {
            return false;
        }
        TransferContinueResponse transferContinueResponse = (TransferContinueResponse) other;
        return this.size == transferContinueResponse.size && this.retry == transferContinueResponse.retry && this.receivedData == transferContinueResponse.receivedData;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.size) * 31) + Integer.hashCode(this.retry)) * 31) + Integer.hashCode(this.receivedData);
    }

    @NotNull
    public String toString() {
        return "TransferContinueResponse(size=" + this.size + ", retry=" + this.retry + ", receivedData=" + this.receivedData + ')';
    }
}

package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lbw;", "Loq;", "Lhn;", "", "Lol;", "originResponse", PluginDeviceInfo.FMODEL, "value", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class bw implements oq<NotificationVersion, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f4663a = "NotificationHuamiOS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4664b = 1;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;
        public final /* synthetic */ int u;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3) {
            super(0);
            this.t = i;
            this.u = i2;
            this.v = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "decode type:" + this.t + " version: " + this.u + " max: " + this.v;
        }
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull NotificationVersion value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new byte[0];
    }

    @Override // defpackage.oq
    @NotNull
    public ol<NotificationVersion> a(@NotNull ol<byte[]> originResponse) {
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        return C3622pq.a(this, originResponse);
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NotificationVersion decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        w2 w2Var = new w2(value, 0, 2, null);
        int iC = w2Var.c();
        int iC2 = w2Var.c();
        int iE = w2Var.e();
        le.c(this.f4663a, new a(iC, iC2, iE));
        if (iC2 == 1 || iC2 == 2) {
            return new NotificationVersion(iC2, iE, false, false, null, 28, null);
        }
        if (iC2 != 3) {
            boolean z = w2Var.c() == this.f4664b;
            boolean z2 = w2Var.c() == this.f4664b;
            ArrayList arrayList = new ArrayList();
            if (z2) {
                int iE2 = w2Var.e();
                for (int i = 0; i < iE2; i++) {
                    arrayList.add(Integer.valueOf(w2Var.c()));
                }
            }
            return new NotificationVersion(iC2, iE, z, z2, arrayList);
        }
        return new NotificationVersion(iC2, iE, w2Var.c() == this.f4664b, false, null, 24, null);
    }
}

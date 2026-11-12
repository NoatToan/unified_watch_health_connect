package defpackage;

import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lo8;", "", "", "cmd", "", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f28839a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lo8$a;", "", "", "FLAG_CARD_ID", "I", "FLAG_VERSION", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final List<DisplayBean> a(@NotNull byte[] cmd) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        try {
            Result.Companion companion = Result.Companion;
            ByteBuffer byteBuffer = ByteBuffer.wrap(cmd);
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            int iT = z2.t(byteBuffer);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = RangesKt___RangesKt.until(0, iT).iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                String strQ = z2.q(byteBuffer);
                int iW = z2.w(byteBuffer);
                int iW2 = z2.w(byteBuffer);
                byte b2 = byteBuffer.get();
                arrayList.add(new DisplayBean(iW, b2, iW2, strQ, (b2 & 2) != 0 ? z2.q(byteBuffer) : null, (b2 & 4) != 0 ? z2.q(byteBuffer) : null));
            }
            objM886constructorimpl = Result.m886constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("DisplayParser", "parse error: " + thM889exceptionOrNullimpl);
        }
        return (List) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
    }
}

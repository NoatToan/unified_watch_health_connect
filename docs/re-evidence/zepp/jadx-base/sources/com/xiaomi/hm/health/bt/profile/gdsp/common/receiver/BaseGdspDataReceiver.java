package com.xiaomi.hm.health.bt.profile.gdsp.common.receiver;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/BaseGdspDataReceiver;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/receiver/IGdspDataReceiver;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "header", "", "receiveHeader", "getDataHeader", "", "data", "receiveData", "getAllByteData", "Ljava/util/Calendar;", "cal", "getDataFooter", "(Ljava/util/Calendar;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onProgress", "registerProgress", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "mDataHeader", "Ljava/io/ByteArrayOutputStream;", "b", "Lkotlin/Lazy;", "getMDataStream", "()Ljava/io/ByteArrayOutputStream;", "mDataStream", "c", "Lkotlin/jvm/functions/Function1;", "mProgressCallback", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseGdspDataReceiver<T> implements IGdspDataReceiver<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private DataHeader mDataHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataStream = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Progress, Unit> mProgressCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/ByteArrayOutputStream;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ByteArrayOutputStream> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteArrayOutputStream invoke() {
            return new ByteArrayOutputStream();
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @NotNull
    public byte[] getAllByteData() {
        return getMDataStream().toByteArray();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @Nullable
    public T getDataFooter(@NotNull Calendar cal) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    @Nullable
    /* JADX INFO: renamed from: getDataHeader, reason: from getter */
    public DataHeader getMDataHeader() {
        return this.mDataHeader;
    }

    @NotNull
    public ByteArrayOutputStream getMDataStream() {
        return (ByteArrayOutputStream) this.mDataStream.getValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void onFinish(@NotNull GDSPErrorCode gDSPErrorCode) {
        IGdspDataReceiver.DefaultImpls.onFinish(this, gDSPErrorCode);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void receiveData(@NotNull byte[] data) {
        getMDataStream().write(data);
        Function1<? super Progress, Unit> function1 = this.mProgressCallback;
        if (function1 == null) {
            return;
        }
        DataHeader dataHeader = this.mDataHeader;
        function1.invoke(new Progress(dataHeader == null ? 100 : dataHeader.size, getMDataStream().size()));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void receiveHeader(@Nullable DataHeader header) {
        this.mDataHeader = header;
        getMDataStream().reset();
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.receiver.IGdspDataReceiver
    public void registerProgress(@NotNull Function1<? super Progress, Unit> onProgress) {
        this.mProgressCallback = onProgress;
    }
}

package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummaryParserFactory;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u001b"}, d2 = {"Lzb;", "Lf1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "Lf4s;", "header", "data", "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "(Lf4s;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;)Ljava/util/Calendar;", "", "isLoop", "Z", Constant.KeyValue.KEY_COLUMN, "()Z", "setLoop", "(Z)V", "Lbi;", "dataReceiver", "Lbi;", "()Lbi;", "startTime", "Lqd;", "source", "", "version", "<init>", "(Ljava/util/Calendar;Lqd;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class zb extends f1<SportSummary> {

    @NotNull
    public static final a j = new a(null);
    public boolean h;

    @NotNull
    public final bi<SportSummary> i;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lzb$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0004"}, d2 = {"zb$b", "Le1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends e1<SportSummary> {
        public final /* synthetic */ qd w;

        public b(qd qdVar) {
            this.w = qdVar;
        }

        @Override // defpackage.bi
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SportSummary b() {
            Object objM886constructorimpl;
            f4s v = getV();
            if (v == null) {
                return null;
            }
            if (v.f17407b <= 0) {
                v = null;
            }
            if (v == null) {
                return null;
            }
            boolean z = v.f17407b == d().size();
            if (!z) {
                t5t.d("gps.HMSyncGpsDataTask", "get size is not match target size<" + v.f17407b + ',' + d().size() + Typography.greater);
            }
            if (!z) {
                v = null;
            }
            if (v == null) {
                return null;
            }
            qd qdVar = this.w;
            try {
                Result.Companion companion = Result.Companion;
                byte[] summaryBytes = d().toByteArray();
                StringBuilder sb = new StringBuilder();
                sb.append("summary data: 00 ");
                Intrinsics.checkNotNullExpressionValue(summaryBytes, "summaryBytes");
                sb.append(y2.c(summaryBytes));
                t5t.d("gps.HMSyncGpsDataTask", sb.toString());
                int i = ((summaryBytes[1] & 255) << 8) | (summaryBytes[0] & 255);
                byte[] bArr = new byte[summaryBytes.length - 2];
                System.arraycopy(summaryBytes, 2, bArr, 0, summaryBytes.length - 2);
                SportSummary rVar = SportSummaryParserFactory.INSTANCE.createSummaryParser(HMDeviceFeature.TIMEX_DEVICE.contains(qdVar), i).parser(bArr);
                if (rVar == null) {
                    return null;
                }
                rVar.setTimezone(ProfileUtils.getTimezoneKey(v.f17406a.getTimeZone()));
                long endTime = rVar.getEndTime() - rVar.getStartTime();
                rVar.setStartTime(v.f17406a.getTimeInMillis());
                rVar.setEndTime(rVar.getStartTime() + endTime);
                objM886constructorimpl = Result.m886constructorimpl(rVar);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d("gps.HMSyncGpsDataTask", "同步Summary数据异常:" + thM889exceptionOrNullimpl);
            }
            return (SportSummary) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(@NotNull Calendar startTime, @NotNull qd source, int i) {
        super(startTime, (HMDeviceFeature.TIMEX_DEVICE.contains(source) ? 14 : 5) & 255, i);
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(source, "source");
        this.i = new b(source);
    }

    @Override // defpackage.f1
    @Nullable
    public Calendar a(@Nullable f4s header, @Nullable SportSummary data) {
        return null;
    }

    @Override // defpackage.f1
    /* JADX INFO: renamed from: k, reason: from getter */
    public boolean getH() {
        return this.h;
    }

    @Override // defpackage.f1
    @NotNull
    public bi<SportSummary> a() {
        return this.i;
    }
}

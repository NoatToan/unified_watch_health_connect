package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationRecord;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "", PluginDeviceInfo.FDESC, "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class kl {
    @NotNull
    public static final byte[] a(@NotNull MenstruationTotalRecord menstruationTotalRecord) throws IOException {
        Intrinsics.checkNotNullParameter(menstruationTotalRecord, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(menstruationTotalRecord.getVersion());
        byteArrayOutputStream.write(menstruationTotalRecord.getCyclePeriodDays());
        byteArrayOutputStream.write(menstruationTotalRecord.getMenstruationPeriodDays());
        byteArrayOutputStream.write(tet.p((int) menstruationTotalRecord.getLastPeriodBeginDay()));
        byteArrayOutputStream.write(tet.p((int) menstruationTotalRecord.getLastPeriodEndDay()));
        byteArrayOutputStream.write(tet.p((int) menstruationTotalRecord.getRecordBeginDay()));
        byteArrayOutputStream.write(tet.s((short) menstruationTotalRecord.getRecordCount()));
        for (MenstruationRecord menstruationRecord : menstruationTotalRecord.getRecords()) {
            byteArrayOutputStream.write(menstruationRecord.getMenstruationState().getValue());
            byteArrayOutputStream.write(tet.p((int) menstruationRecord.getModifyTimeStamp()));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    public static final boolean b(@NotNull MenstruationTotalRecord menstruationTotalRecord) {
        Intrinsics.checkNotNullParameter(menstruationTotalRecord, "<this>");
        if (menstruationTotalRecord.getRecordCount() != menstruationTotalRecord.getRecords().size()) {
            t5t.d("MenstruationDataParser", "record count not match!");
            return false;
        }
        if (menstruationTotalRecord.getMenstruationPeriodDays() <= 0) {
            t5t.d("MenstruationDataParser", "menstruationPeriodDays <= 0");
            return false;
        }
        if (menstruationTotalRecord.getLastPeriodBeginDay() < 0 || menstruationTotalRecord.getLastPeriodEndDay() < 0 || menstruationTotalRecord.getRecordBeginDay() < 0) {
            t5t.d("MenstruationDataParser", "timeStamp invalid");
            return false;
        }
        if (menstruationTotalRecord.getLastPeriodEndDay() >= menstruationTotalRecord.getLastPeriodBeginDay()) {
            return true;
        }
        t5t.d("MenstruationDataParser", "end < begin");
        return false;
    }
}

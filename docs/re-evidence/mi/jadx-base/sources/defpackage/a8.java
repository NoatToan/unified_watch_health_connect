package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.onetrack.api.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0010"}, d2 = {"La8;", "Ls7;", "", "", "dialIds", "", PluginDeviceInfo.FMODEL, "dialId", "", "imageSize", PluginDeviceInfo.FDESC, "Lf8;", "Lz8;", "ecfCmdProvider", "<init>", "(Lz8;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class a8 implements s7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f747b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final z8 f748a;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"La8$a;", "", "", "ECF_CMD", c.f13755a, "", "ECF_CMD_WATCH_FACE", "I", "ECF_CMD_WATCH_FACE_READ_ALL", "ECF_COMMAND_DELETE_DIAL", "ECF_COMMAND_REPLACE_DIAL", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a8(@NotNull z8 ecfCmdProvider) {
        Intrinsics.checkNotNullParameter(ecfCmdProvider, "ecfCmdProvider");
        this.f748a = ecfCmdProvider;
    }

    @Override // defpackage.s7
    @Nullable
    public DialVersion a() {
        return null;
    }

    @Override // defpackage.s7
    @NotNull
    public List<Integer> b() {
        ArrayList arrayList = new ArrayList();
        tss tssVarA = this.f748a.a(new gks(3));
        byte[] bArrB = (tssVarA == null || !tssVarA.d()) ? null : tssVarA.b();
        t5t.d("DialDefaultImpl", "getAllWatchFaceIds:ResponseData:" + wns.a(bArrB));
        int length = bArrB != null ? bArrB.length : 0;
        if (length <= 1) {
            return arrayList;
        }
        int i = length - 1;
        byte[] bArr = new byte[i];
        System.arraycopy(bArrB, 1, bArr, 0, i);
        int i2 = i / 4;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 4;
            if (i5 > i) {
                break;
            }
            arrayList.add(Integer.valueOf(c3.a(bArr, 0, i4, 1, null)));
            i3++;
            i4 = i5;
        }
        return arrayList;
    }

    @Override // defpackage.s7
    public boolean a(@NotNull List<Integer> dialIds) {
        Intrinsics.checkNotNullParameter(dialIds, "dialIds");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(63);
            byteArrayOutputStream.write(new DialsInfo(dialIds).a());
        } catch (IOException e) {
            e.printStackTrace();
            t5t.d("DialDefaultImpl", "deleteDial:Exception:" + e);
        }
        return this.f748a.c(byteArrayOutputStream.toByteArray(), 2);
    }

    @Override // defpackage.s7
    public boolean a(int dialId, long imageSize) {
        StringBuilder sb = new StringBuilder();
        sb.append("getStorageState:");
        sb.append(dialId);
        sb.append(",imageSize:");
        sb.append(imageSize);
        sb.append(',');
        int i = (int) imageSize;
        sb.append(i);
        t5t.d("DialDefaultImpl", sb.toString());
        byte[] bArr = new byte[10];
        bArr[0] = HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT;
        bArr[1] = 0;
        System.arraycopy(tet.p(i), 0, bArr, 2, 4);
        System.arraycopy(tet.p(dialId), 0, bArr, 6, 4);
        qe qeVarB = this.f748a.b(bArr);
        if (qeVarB != null) {
            t5t.d("DialDefaultImpl", qeVarB.toString());
        }
        return qeVarB != null && qeVarB.d(HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT);
    }
}

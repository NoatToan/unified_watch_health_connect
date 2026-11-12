package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lsg;", "Lyg;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfData;", "Ltg;", PluginDeviceInfo.FICONON, "", "dataType", "I", PluginDeviceInfo.FMODEL, "()I", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class sg extends yg<List<? extends HmAfData>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f33602b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33603a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lsg$a;", "", "", "BYTES_PER_AF_RESULT", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public sg(int i) {
        super(false);
        this.f33603a = i;
    }

    @Override // defpackage.yg
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getF33603a() {
        return this.f33603a;
    }

    @Override // defpackage.yg
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<HmAfData> b(@NotNull HmGdspRawData hmGdspRawData) {
        Intrinsics.checkNotNullParameter(hmGdspRawData, "<this>");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 5;
            if (i2 > hmGdspRawData.getRawData().length) {
                return arrayList;
            }
            arrayList.add(new HmAfData(tet.v(hmGdspRawData.getRawData(), i, 4) * ((long) 1000), hmGdspRawData.getRawData()[i + 4] & 255));
            i = i2;
        }
    }
}

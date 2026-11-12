package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Loj;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "", "checkValid", "", "value", "I", "getValue", "()I", "setValue", "(I)V", "min", "Ljava/lang/Integer;", "getMin", "()Ljava/lang/Integer;", "setMin", "(Ljava/lang/Integer;)V", VibrateModeSetFragment.MAX, "getMax", "setMax", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class oj implements IPrimaryData {

    @Nullable
    private Integer max;

    @Nullable
    private Integer min;
    private int value;

    public oj(int i, @Nullable Integer num, @Nullable Integer num2) {
        this.value = i;
        this.min = num;
        this.max = num2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        int value;
        Integer min = getMin();
        Integer max = getMax();
        if (getContainDesc()) {
            return min != null && max != null && min.intValue() <= (value = getValue()) && value <= max.intValue();
        }
        return true;
    }

    @Nullable
    public Integer getMax() {
        return this.max;
    }

    @Nullable
    public Integer getMin() {
        return this.min;
    }

    public int getValue() {
        return this.value;
    }

    public void setMax(@Nullable Integer num) {
        this.max = num;
    }

    public void setMin(@Nullable Integer num) {
        this.min = num;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public /* synthetic */ oj(int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
    }
}

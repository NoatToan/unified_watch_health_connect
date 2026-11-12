package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v9, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lv9;", "", "", "toString", "", "id", "J", PluginDeviceInfo.FBLUETOOTHPAIR, "()J", "memberId", "h", "", "avatarId", "I", PluginDeviceInfo.FMODEL, "()I", "gender", PluginDeviceInfo.FICONOFF, "height", PluginDeviceInfo.FICONOFFLINE, "measureMode", PluginDeviceInfo.FLOCALIZATIONS, "birthDayYear", PluginDeviceInfo.FICONON, "birthDayMonth", PluginDeviceInfo.FDESC, "", "nickName", "[B", "i", "()[B", "", "weight", "F", "j", "()F", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class FamilyMemberInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final long memberId;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int avatarId;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int gender;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int height;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int measureMode;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final int birthDayYear;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final int birthDayMonth;

    /* JADX INFO: renamed from: i, reason: from toString */
    @NotNull
    public final byte[] nickName;

    /* JADX INFO: renamed from: j, reason: from toString */
    public final float weight;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAvatarId() {
        return this.avatarId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBirthDayMonth() {
        return this.birthDayMonth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBirthDayYear() {
        return this.birthDayYear;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMeasureMode() {
        return this.measureMode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getMemberId() {
        return this.memberId;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final byte[] getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FamilyMemberInfo(id=");
        sb.append(this.id);
        sb.append(", memberId=");
        sb.append(this.memberId);
        sb.append(", avatarId=");
        sb.append(this.avatarId);
        sb.append(", gender=");
        sb.append(this.gender);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", measureMode=");
        sb.append(this.measureMode);
        sb.append(", birthDayYear=");
        sb.append(this.birthDayYear);
        sb.append(", birthDayMonth=");
        sb.append(this.birthDayMonth);
        sb.append(", nickName=");
        String string = Arrays.toString(this.nickName);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }
}

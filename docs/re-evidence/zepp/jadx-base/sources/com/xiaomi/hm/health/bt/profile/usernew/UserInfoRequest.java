package com.xiaomi.hm.health.bt.profile.usernew;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b3\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\n¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoRequest;", "", "", "toBleByte", "", "a", "Z", "getBirth", "()Z", "setBirth", "(Z)V", "birth", "b", "getGender", "setGender", "gender", "c", "getHeight", "setHeight", "height", GoogleApiAvailabilityLight.a, "getWeight", "setWeight", "weight", "e", "getStepGoal", "setStepGoal", "stepGoal", "f", "getLocation", "setLocation", "location", "g", "getUid", "setUid", "uid", "h", "getBloodPressure", "setBloodPressure", "bloodPressure", "i", "getRegisterRegion", "setRegisterRegion", "registerRegion", z.j, "getIdc", "setIdc", "idc", hl.k, "getNickName", "setNickName", "nickName", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoRequest {

    @NotNull
    private static final String l = "UserInfoRequest";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean birth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean gender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean height;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean stepGoal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean location;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean uid;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean bloodPressure;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean registerRegion;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean idc;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean nickName;

    public final boolean getBirth() {
        return this.birth;
    }

    public final boolean getBloodPressure() {
        return this.bloodPressure;
    }

    public final boolean getGender() {
        return this.gender;
    }

    public final boolean getHeight() {
        return this.height;
    }

    public final boolean getIdc() {
        return this.idc;
    }

    public final boolean getLocation() {
        return this.location;
    }

    public final boolean getNickName() {
        return this.nickName;
    }

    public final boolean getRegisterRegion() {
        return this.registerRegion;
    }

    public final boolean getStepGoal() {
        return this.stepGoal;
    }

    public final boolean getUid() {
        return this.uid;
    }

    public final boolean getWeight() {
        return this.weight;
    }

    public final void setBirth(boolean z) {
        this.birth = z;
    }

    public final void setBloodPressure(boolean z) {
        this.bloodPressure = z;
    }

    public final void setGender(boolean z) {
        this.gender = z;
    }

    public final void setHeight(boolean z) {
        this.height = z;
    }

    public final void setIdc(boolean z) {
        this.idc = z;
    }

    public final void setLocation(boolean z) {
        this.location = z;
    }

    public final void setNickName(boolean z) {
        this.nickName = z;
    }

    public final void setRegisterRegion(boolean z) {
        this.registerRegion = z;
    }

    public final void setStepGoal(boolean z) {
        this.stepGoal = z;
    }

    public final void setUid(boolean z) {
        this.uid = z;
    }

    public final void setWeight(boolean z) {
        this.weight = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Nullable
    public final byte[] toBleByte() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            boolean z = this.birth;
            ?? r1 = z;
            if (this.gender) {
                r1 = (z ? 1 : 0) | 2;
            }
            ?? r2 = r1;
            if (this.height) {
                r2 = (r1 == true ? 1 : 0) | 4;
            }
            ?? r3 = r2;
            if (this.weight) {
                r3 = (r2 == true ? 1 : 0) | 8;
            }
            ?? r4 = r3;
            if (this.stepGoal) {
                r4 = (r3 == true ? 1 : 0) | 16;
            }
            ?? r5 = r4;
            if (this.location) {
                r5 = (r4 == true ? 1 : 0) | 32;
            }
            ?? r6 = r5;
            if (this.uid) {
                r6 = (r5 == true ? 1 : 0) | 64;
            }
            ?? r7 = r6;
            if (this.bloodPressure) {
                r7 = (r6 == true ? 1 : 0) | 128;
            }
            ?? r8 = r7;
            if (this.registerRegion) {
                r8 = (r7 == true ? 1 : 0) | 256;
            }
            ?? r9 = r8;
            if (this.idc) {
                r9 = (r8 == true ? 1 : 0) | 512;
            }
            int i = r9;
            if (this.nickName) {
                i = (r9 == true ? 1 : 0) | 1024;
            }
            byteArrayOutputStream.write(GattUtils.intToBytes(i));
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Debug.fi(l, Intrinsics.stringPlus("exception: ", e));
            return null;
        }
    }
}

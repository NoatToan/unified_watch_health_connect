package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rv, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012\"\u0004\b\r\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\r\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\r\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b\r\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b\r\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\r\u00100R$\u00101\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010*R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b3\u00107\"\u0004\b\r\u00108R$\u00109\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\f\"\u0004\b3\u0010\u000eR$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b\r\u0010@¨\u0006C"}, d2 = {"Lrv;", "", "", "toString", "", "hashCode", "other", "", "equals", "nickName", "Ljava/lang/String;", PluginDeviceInfo.FLOCALIZATIONS, "()Ljava/lang/String;", PluginDeviceInfo.FMODEL, "(Ljava/lang/String;)V", "Ls1;", MedicalIdSPContract.PREF_BIRTHDAY, "Ls1;", "()Ls1;", "(Ls1;)V", "Lmc;", "gender", "Lmc;", PluginDeviceInfo.FICONON, "()Lmc;", "(Lmc;)V", "height", "Ljava/lang/Integer;", PluginDeviceInfo.FICONOFF, "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "", "weight", "Ljava/lang/Float;", Constant.KeyValue.KEY_COLUMN, "()Ljava/lang/Float;", "(Ljava/lang/Float;)V", "", "stepGoal", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "Lkk;", "location", "Lkk;", PluginDeviceInfo.FBLUETOOTHPAIR, "()Lkk;", "(Lkk;)V", "uid", "j", PluginDeviceInfo.FDESC, "Lm2;", "bloodPressure", "Lm2;", "()Lm2;", "(Lm2;)V", "registerRegion", "h", "", "idc", "Ljava/lang/Short;", PluginDeviceInfo.FICONOFFLINE, "()Ljava/lang/Short;", "(Ljava/lang/Short;)V", "<init>", "(Ljava/lang/String;Ls1;Lmc;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Long;Lkk;Ljava/lang/Long;Lm2;Ljava/lang/String;Ljava/lang/Short;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class UserInfoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @Nullable
    public String nickName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public s1 birth;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public mc gender;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public Integer height;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public Float weight;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public Long stepGoal;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public kk location;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public Long uid;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public m2 bloodPressure;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public String registerRegion;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from toString */
    @Nullable
    public Short idc;

    public UserInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final void a(@Nullable String str) {
        this.nickName = str;
    }

    public final void b(@Nullable Long l) {
        this.uid = l;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final mc getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Short getIdc() {
        return this.idc;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoDto)) {
            return false;
        }
        UserInfoDto userInfoDto = (UserInfoDto) other;
        return Intrinsics.areEqual(this.nickName, userInfoDto.nickName) && Intrinsics.areEqual(this.birth, userInfoDto.birth) && this.gender == userInfoDto.gender && Intrinsics.areEqual(this.height, userInfoDto.height) && Intrinsics.areEqual((Object) this.weight, (Object) userInfoDto.weight) && Intrinsics.areEqual(this.stepGoal, userInfoDto.stepGoal) && Intrinsics.areEqual(this.location, userInfoDto.location) && Intrinsics.areEqual(this.uid, userInfoDto.uid) && Intrinsics.areEqual(this.bloodPressure, userInfoDto.bloodPressure) && Intrinsics.areEqual(this.registerRegion, userInfoDto.registerRegion) && Intrinsics.areEqual(this.idc, userInfoDto.idc);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final kk getLocation() {
        return this.location;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRegisterRegion() {
        return this.registerRegion;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        s1 s1Var = this.birth;
        int iHashCode2 = (iHashCode + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        mc mcVar = this.gender;
        int iHashCode3 = (iHashCode2 + (mcVar == null ? 0 : mcVar.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.weight;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Long l = this.stepGoal;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        kk kkVar = this.location;
        int iHashCode7 = (iHashCode6 + (kkVar == null ? 0 : kkVar.hashCode())) * 31;
        Long l2 = this.uid;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        m2 m2Var = this.bloodPressure;
        int iHashCode9 = (iHashCode8 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        String str2 = this.registerRegion;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Short sh = this.idc;
        return iHashCode10 + (sh != null ? sh.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getStepGoal() {
        return this.stepGoal;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    @NotNull
    public String toString() {
        return "UserInfoDto(nickName=" + this.nickName + ", birth=" + this.birth + ", gender=" + this.gender + ", height=" + this.height + ", weight=" + this.weight + ", stepGoal=" + this.stepGoal + ", location=" + this.location + ", uid=" + this.uid + ", bloodPressure=" + this.bloodPressure + ", registerRegion=" + this.registerRegion + ", idc=" + this.idc + ')';
    }

    public UserInfoDto(@Nullable String str, @Nullable s1 s1Var, @Nullable mc mcVar, @Nullable Integer num, @Nullable Float f, @Nullable Long l, @Nullable kk kkVar, @Nullable Long l2, @Nullable m2 m2Var, @Nullable String str2, @Nullable Short sh) {
        this.nickName = str;
        this.birth = s1Var;
        this.gender = mcVar;
        this.height = num;
        this.weight = f;
        this.stepGoal = l;
        this.location = kkVar;
        this.uid = l2;
        this.bloodPressure = m2Var;
        this.registerRegion = str2;
        this.idc = sh;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final s1 getBirth() {
        return this.birth;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final m2 getBloodPressure() {
        return this.bloodPressure;
    }

    public final void a(@Nullable s1 s1Var) {
        this.birth = s1Var;
    }

    public final void b(@Nullable String str) {
        this.registerRegion = str;
    }

    public final void a(@Nullable mc mcVar) {
        this.gender = mcVar;
    }

    public final void a(@Nullable Integer num) {
        this.height = num;
    }

    public final void a(@Nullable Float f) {
        this.weight = f;
    }

    public final void a(@Nullable Long l) {
        this.stepGoal = l;
    }

    public final void a(@Nullable kk kkVar) {
        this.location = kkVar;
    }

    public final void a(@Nullable m2 m2Var) {
        this.bloodPressure = m2Var;
    }

    public final void a(@Nullable Short sh) {
        this.idc = sh;
    }

    public /* synthetic */ UserInfoDto(String str, s1 s1Var, mc mcVar, Integer num, Float f, Long l, kk kkVar, Long l2, m2 m2Var, String str2, Short sh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : s1Var, (i & 4) != 0 ? null : mcVar, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : kkVar, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : m2Var, (i & 512) != 0 ? null : str2, (i & 1024) == 0 ? sh : null);
    }
}

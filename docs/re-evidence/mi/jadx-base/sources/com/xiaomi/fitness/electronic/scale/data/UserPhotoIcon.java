package com.xiaomi.fitness.electronic.scale.data;

import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u00101\"\u0004\b2\u00103R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u00101\"\u0004\b8\u00103R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;", "Lcom/xiaomi/fitness/electronic/scale/data/Icon;", "did", "", "userId", "virtualId", "drawableId", "", "url", "nickName", "heartRate", "sex", "age", "height", "zK", "", "isVirtual", "", "creationTime", "", "isLast", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIII[SZJZLcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getVirtualId", "setVirtualId", "getUrl", "setUrl", "getNickName", "setNickName", "getHeartRate", "()I", "setHeartRate", "(I)V", "getSex", "setSex", "getAge", "setAge", "getHeight", "setHeight", "getZK", "()[S", "setZK", "([S)V", "()Z", "setVirtual", "(Z)V", "getCreationTime", "()J", "setCreationTime", "(J)V", "setLast", "getVirtualAccount", "()Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "setVirtualAccount", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserPhotoIcon extends Icon {
    private int age;
    private long creationTime;
    private int heartRate;
    private int height;
    private boolean isLast;
    private boolean isVirtual;

    @Nullable
    private String nickName;
    private int sex;

    @NotNull
    private String url;

    @NotNull
    private String userId;

    @Nullable
    private VirtualAccount virtualAccount;

    @NotNull
    private String virtualId;

    @Nullable
    private short[] zK;

    public /* synthetic */ UserPhotoIcon(String str, String str2, String str3, int i, String str4, String str5, int i2, int i3, int i4, int i5, short[] sArr, boolean z, long j, boolean z2, VirtualAccount virtualAccount, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, str4, str5, i2, i3, i4, i5, sArr, z, (i6 & 4096) != 0 ? 0L : j, (i6 & 8192) != 0 ? false : z2, (i6 & 16384) != 0 ? null : virtualAccount);
    }

    public final int getAge() {
        return this.age;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final int getSex() {
        return this.sex;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final VirtualAccount getVirtualAccount() {
        return this.virtualAccount;
    }

    @NotNull
    public final String getVirtualId() {
        return this.virtualId;
    }

    @Nullable
    public final short[] getZK() {
        return this.zK;
    }

    /* JADX INFO: renamed from: isLast, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    /* JADX INFO: renamed from: isVirtual, reason: from getter */
    public final boolean getIsVirtual() {
        return this.isVirtual;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setHeartRate(int i) {
        this.heartRate = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setLast(boolean z) {
        this.isLast = z;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setVirtual(boolean z) {
        this.isVirtual = z;
    }

    public final void setVirtualAccount(@Nullable VirtualAccount virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public final void setVirtualId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.virtualId = str;
    }

    public final void setZK(@Nullable short[] sArr) {
        this.zK = sArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoIcon(@NotNull String did, @NotNull String userId, @NotNull String virtualId, int i, @NotNull String url, @Nullable String str, int i2, int i3, int i4, int i5, @Nullable short[] sArr, boolean z, long j, boolean z2, @Nullable VirtualAccount virtualAccount) {
        super(did, i, str);
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(virtualId, "virtualId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNull(str);
        this.userId = userId;
        this.virtualId = virtualId;
        this.url = url;
        this.nickName = str;
        this.heartRate = i2;
        this.sex = i3;
        this.age = i4;
        this.height = i5;
        this.zK = sArr;
        this.isVirtual = z;
        this.creationTime = j;
        this.isLast = z2;
        this.virtualAccount = virtualAccount;
    }
}

package com.huami.sleepassistant.apilib.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JC\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u0018\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0019¨\u0006\""}, d2 = {"Lcom/huami/sleepassistant/apilib/vo/MusicControlVo;", "", "", "component1", "component2", "component3", "component4", "component5", "id", "simpleChinese", "playAddress", "bigImgUrl", "itemImageUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getSimpleChinese", "setSimpleChinese", "(Ljava/lang/String;)V", "getPlayAddress", "setPlayAddress", "getBigImgUrl", "setBigImgUrl", "getItemImageUrl", "setItemImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicControlVo {

    @Nullable
    private String bigImgUrl;

    @NotNull
    private final String id;

    @Nullable
    private String itemImageUrl;

    @Nullable
    private String playAddress;

    @Nullable
    private String simpleChinese;

    public MusicControlVo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.id = str;
        this.simpleChinese = str2;
        this.playAddress = str3;
        this.bigImgUrl = str4;
        this.itemImageUrl = str5;
    }

    public static /* synthetic */ MusicControlVo copy$default(MusicControlVo musicControlVo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicControlVo.id;
        }
        if ((i & 2) != 0) {
            str2 = musicControlVo.simpleChinese;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = musicControlVo.playAddress;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = musicControlVo.bigImgUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = musicControlVo.itemImageUrl;
        }
        return musicControlVo.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSimpleChinese() {
        return this.simpleChinese;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlayAddress() {
        return this.playAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemImageUrl() {
        return this.itemImageUrl;
    }

    @NotNull
    public final MusicControlVo copy(@NotNull String id, @Nullable String simpleChinese, @Nullable String playAddress, @Nullable String bigImgUrl, @Nullable String itemImageUrl) {
        return new MusicControlVo(id, simpleChinese, playAddress, bigImgUrl, itemImageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicControlVo)) {
            return false;
        }
        MusicControlVo musicControlVo = (MusicControlVo) other;
        return Intrinsics.areEqual(this.id, musicControlVo.id) && Intrinsics.areEqual(this.simpleChinese, musicControlVo.simpleChinese) && Intrinsics.areEqual(this.playAddress, musicControlVo.playAddress) && Intrinsics.areEqual(this.bigImgUrl, musicControlVo.bigImgUrl) && Intrinsics.areEqual(this.itemImageUrl, musicControlVo.itemImageUrl);
    }

    @Nullable
    public final String getBigImgUrl() {
        return this.bigImgUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getItemImageUrl() {
        return this.itemImageUrl;
    }

    @Nullable
    public final String getPlayAddress() {
        return this.playAddress;
    }

    @Nullable
    public final String getSimpleChinese() {
        return this.simpleChinese;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.simpleChinese;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.playAddress;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bigImgUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itemImageUrl;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBigImgUrl(@Nullable String str) {
        this.bigImgUrl = str;
    }

    public final void setItemImageUrl(@Nullable String str) {
        this.itemImageUrl = str;
    }

    public final void setPlayAddress(@Nullable String str) {
        this.playAddress = str;
    }

    public final void setSimpleChinese(@Nullable String str) {
        this.simpleChinese = str;
    }

    @NotNull
    public String toString() {
        return "MusicControlVo(id=" + this.id + ", simpleChinese=" + ((Object) this.simpleChinese) + ", playAddress=" + ((Object) this.playAddress) + ", bigImgUrl=" + ((Object) this.bigImgUrl) + ", itemImageUrl=" + ((Object) this.itemImageUrl) + ')';
    }

    public /* synthetic */ MusicControlVo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}

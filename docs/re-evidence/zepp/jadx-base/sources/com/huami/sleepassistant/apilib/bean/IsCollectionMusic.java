package com.huami.sleepassistant.apilib.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B%\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+BC\b\u0017\u0012\u0006\u0010,\u001a\u00020\f\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0015\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010$\u0012\u0004\b)\u0010\u001d\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00062"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/IsCollectionMusic;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "", "component1", "", "component2", "", "component3", WebConst.QueryParam.AUDIOS, WebConst.QueryParam.PLAY_TIME, "userId", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getAudios", "()Ljava/util/List;", "getAudios$annotations", "()V", LogUtil.I, "getPlayTime", "()I", "setPlayTime", "(I)V", "getPlayTime$annotations", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getUserId$annotations", "<init>", "(Ljava/util/List;ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class IsCollectionMusic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Long> audios;
    private int playTime;

    @NotNull
    private String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/IsCollectionMusic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/IsCollectionMusic;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<IsCollectionMusic> serializer() {
            return IsCollectionMusic$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IsCollectionMusic(int i, @SerialName(WebConst.QueryParam.AUDIOS) List list, @SerialName(WebConst.QueryParam.PLAY_TIME) int i2, @SerialName("userId") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, IsCollectionMusic$$serializer.INSTANCE.getDescriptor());
        }
        this.audios = list;
        this.playTime = i2;
        this.userId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsCollectionMusic copy$default(IsCollectionMusic isCollectionMusic, List list, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = isCollectionMusic.audios;
        }
        if ((i2 & 2) != 0) {
            i = isCollectionMusic.playTime;
        }
        if ((i2 & 4) != 0) {
            str = isCollectionMusic.userId;
        }
        return isCollectionMusic.copy(list, i, str);
    }

    @SerialName(WebConst.QueryParam.AUDIOS)
    public static /* synthetic */ void getAudios$annotations() {
    }

    @SerialName(WebConst.QueryParam.PLAY_TIME)
    public static /* synthetic */ void getPlayTime$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull IsCollectionMusic self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(LongSerializer.INSTANCE), self.audios);
        output.encodeIntElement(serialDesc, 1, self.playTime);
        output.encodeStringElement(serialDesc, 2, self.userId);
    }

    @NotNull
    public final List<Long> component1() {
        return this.audios;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final IsCollectionMusic copy(@NotNull List<Long> audios, int playTime, @NotNull String userId) {
        return new IsCollectionMusic(audios, playTime, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsCollectionMusic)) {
            return false;
        }
        IsCollectionMusic isCollectionMusic = (IsCollectionMusic) other;
        return Intrinsics.areEqual(this.audios, isCollectionMusic.audios) && this.playTime == isCollectionMusic.playTime && Intrinsics.areEqual(this.userId, isCollectionMusic.userId);
    }

    @NotNull
    public final List<Long> getAudios() {
        return this.audios;
    }

    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.audios.hashCode() * 31) + this.playTime) * 31) + this.userId.hashCode();
    }

    public final void setPlayTime(int i) {
        this.playTime = i;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "IsCollectionMusic(audios=" + this.audios + ", playTime=" + this.playTime + ", userId=" + this.userId + ')';
    }

    public IsCollectionMusic(@NotNull List<Long> list, int i, @NotNull String str) {
        this.audios = list;
        this.playTime = i;
        this.userId = str;
    }
}

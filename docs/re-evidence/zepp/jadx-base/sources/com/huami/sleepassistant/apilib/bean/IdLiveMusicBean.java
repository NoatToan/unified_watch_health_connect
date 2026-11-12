package com.huami.sleepassistant.apilib.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBU\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b<\u0010=Bi\b\u0017\u0012\u0006\u0010>\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\b<\u0010AJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J^\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u000eHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010!\u0012\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010!\u0012\u0004\b*\u0010'\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R*\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010!\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R*\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010!\u0012\u0004\b0\u0010'\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R*\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u00101\u0012\u0004\b5\u0010'\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u00104R0\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u00106\u0012\u0004\b;\u0010'\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006D"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/IdLiveMusicBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "", "Lcom/huami/sleepassistant/apilib/bean/AudioResources;", "component6", "sid", "userId", "name", "description", WebConst.QueryParam.PLAY_TIME, "audioResources", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/huami/sleepassistant/apilib/bean/IdLiveMusicBean;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "getSid$annotations", "()V", "getUserId", "setUserId", "getUserId$annotations", "getName", "setName", "getName$annotations", "getDescription", "setDescription", "getDescription$annotations", "Ljava/lang/Integer;", "getPlayTime", "setPlayTime", "(Ljava/lang/Integer;)V", "getPlayTime$annotations", "Ljava/util/List;", "getAudioResources", "()Ljava/util/List;", "setAudioResources", "(Ljava/util/List;)V", "getAudioResources$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "apilib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class IdLiveMusicBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<AudioResources> audioResources;

    @Nullable
    private String description;

    @Nullable
    private String name;

    @Nullable
    private Integer playTime;

    @Nullable
    private String sid;

    @Nullable
    private String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/IdLiveMusicBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/sleepassistant/apilib/bean/IdLiveMusicBean;", "serializer", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<IdLiveMusicBean> serializer() {
            return IdLiveMusicBean$$serializer.INSTANCE;
        }
    }

    public IdLiveMusicBean() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IdLiveMusicBean(int i, @SerialName("sid") String str, @SerialName("userId") String str2, @SerialName("name") String str3, @SerialName("description") String str4, @SerialName(WebConst.QueryParam.PLAY_TIME) Integer num, @SerialName("audioResources") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, IdLiveMusicBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.sid = null;
        } else {
            this.sid = str;
        }
        if ((i & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.playTime = null;
        } else {
            this.playTime = num;
        }
        if ((i & 32) == 0) {
            this.audioResources = null;
        } else {
            this.audioResources = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdLiveMusicBean copy$default(IdLiveMusicBean idLiveMusicBean, String str, String str2, String str3, String str4, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idLiveMusicBean.sid;
        }
        if ((i & 2) != 0) {
            str2 = idLiveMusicBean.userId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = idLiveMusicBean.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = idLiveMusicBean.description;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            num = idLiveMusicBean.playTime;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            list = idLiveMusicBean.audioResources;
        }
        return idLiveMusicBean.copy(str, str5, str6, str7, num2, list);
    }

    @SerialName("audioResources")
    public static /* synthetic */ void getAudioResources$annotations() {
    }

    @SerialName("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName(WebConst.QueryParam.PLAY_TIME)
    public static /* synthetic */ void getPlayTime$annotations() {
    }

    @SerialName("sid")
    public static /* synthetic */ void getSid$annotations() {
    }

    @SerialName("userId")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull IdLiveMusicBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.sid != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.sid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.userId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.playTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.playTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.audioResources != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, new ArrayListSerializer(AudioResources$$serializer.INSTANCE), self.audioResources);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPlayTime() {
        return this.playTime;
    }

    @Nullable
    public final List<AudioResources> component6() {
        return this.audioResources;
    }

    @NotNull
    public final IdLiveMusicBean copy(@Nullable String sid, @Nullable String userId, @Nullable String name, @Nullable String description, @Nullable Integer playTime, @Nullable List<AudioResources> audioResources) {
        return new IdLiveMusicBean(sid, userId, name, description, playTime, audioResources);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdLiveMusicBean)) {
            return false;
        }
        IdLiveMusicBean idLiveMusicBean = (IdLiveMusicBean) other;
        return Intrinsics.areEqual(this.sid, idLiveMusicBean.sid) && Intrinsics.areEqual(this.userId, idLiveMusicBean.userId) && Intrinsics.areEqual(this.name, idLiveMusicBean.name) && Intrinsics.areEqual(this.description, idLiveMusicBean.description) && Intrinsics.areEqual(this.playTime, idLiveMusicBean.playTime) && Intrinsics.areEqual(this.audioResources, idLiveMusicBean.audioResources);
    }

    @Nullable
    public final List<AudioResources> getAudioResources() {
        return this.audioResources;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getPlayTime() {
        return this.playTime;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.sid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.playTime;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<AudioResources> list = this.audioResources;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final void setAudioResources(@Nullable List<AudioResources> list) {
        this.audioResources = list;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPlayTime(@Nullable Integer num) {
        this.playTime = num;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "IdLiveMusicBean(sid=" + ((Object) this.sid) + ", userId=" + ((Object) this.userId) + ", name=" + ((Object) this.name) + ", description=" + ((Object) this.description) + ", playTime=" + this.playTime + ", audioResources=" + this.audioResources + ')';
    }

    public IdLiveMusicBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable List<AudioResources> list) {
        this.sid = str;
        this.userId = str2;
        this.name = str3;
        this.description = str4;
        this.playTime = num;
        this.audioResources = list;
    }

    public /* synthetic */ IdLiveMusicBean(String str, String str2, String str3, String str4, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list);
    }
}

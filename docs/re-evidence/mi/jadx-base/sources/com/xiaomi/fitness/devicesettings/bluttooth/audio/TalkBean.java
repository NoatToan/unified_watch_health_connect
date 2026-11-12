package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.mibi.sdk.common.CommonConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;", "", "speakerId", "", CommonConstants.KEY_USER_NAME, "", "msgList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MessageBean;", "userNameTranslation", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getSpeakerId", "()I", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "getMsgList", "()Ljava/util/List;", "setMsgList", "(Ljava/util/List;)V", "getUserNameTranslation", "setUserNameTranslation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TalkBean {

    @NotNull
    private List<MessageBean> msgList;
    private final int speakerId;

    @NotNull
    private String userName;

    @Nullable
    private String userNameTranslation;

    public TalkBean(int i, @NotNull String userName, @NotNull List<MessageBean> msgList, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(msgList, "msgList");
        this.speakerId = i;
        this.userName = userName;
        this.msgList = msgList;
        this.userNameTranslation = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TalkBean copy$default(TalkBean talkBean, int i, String str, List list, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = talkBean.speakerId;
        }
        if ((i2 & 2) != 0) {
            str = talkBean.userName;
        }
        if ((i2 & 4) != 0) {
            list = talkBean.msgList;
        }
        if ((i2 & 8) != 0) {
            str2 = talkBean.userNameTranslation;
        }
        return talkBean.copy(i, str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSpeakerId() {
        return this.speakerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final List<MessageBean> component3() {
        return this.msgList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserNameTranslation() {
        return this.userNameTranslation;
    }

    @NotNull
    public final TalkBean copy(int speakerId, @NotNull String userName, @NotNull List<MessageBean> msgList, @Nullable String userNameTranslation) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(msgList, "msgList");
        return new TalkBean(speakerId, userName, msgList, userNameTranslation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TalkBean)) {
            return false;
        }
        TalkBean talkBean = (TalkBean) other;
        return this.speakerId == talkBean.speakerId && Intrinsics.areEqual(this.userName, talkBean.userName) && Intrinsics.areEqual(this.msgList, talkBean.msgList) && Intrinsics.areEqual(this.userNameTranslation, talkBean.userNameTranslation);
    }

    @NotNull
    public final List<MessageBean> getMsgList() {
        return this.msgList;
    }

    public final int getSpeakerId() {
        return this.speakerId;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final String getUserNameTranslation() {
        return this.userNameTranslation;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.speakerId) * 31) + this.userName.hashCode()) * 31) + this.msgList.hashCode()) * 31;
        String str = this.userNameTranslation;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setMsgList(@NotNull List<MessageBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.msgList = list;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setUserNameTranslation(@Nullable String str) {
        this.userNameTranslation = str;
    }

    @NotNull
    public String toString() {
        return "TalkBean(speakerId=" + this.speakerId + ", userName=" + this.userName + ", msgList=" + this.msgList + ", userNameTranslation=" + this.userNameTranslation + ")";
    }

    public /* synthetic */ TalkBean(int i, String str, List list, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? new ArrayList() : list, (i2 & 8) != 0 ? null : str2);
    }
}

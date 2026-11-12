package com.huami.wallet.lib.entity;

import com.alipay.sdk.m.x.d;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016BC\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b4\u00105J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\tJX\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010%R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010*R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010*¨\u00067"}, d2 = {"Lcom/huami/wallet/lib/entity/Protocol;", "Ljava/io/Serializable;", "", "component1", "", "component2", "()Ljava/lang/Long;", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "content", "id", "needConfirm", "serviceName", "title", SecondaryScreen.KEY_UPDATED, "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huami/wallet/lib/entity/Protocol;", "toString", "", "hashCode", "", "other", "equals", "a", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "b", "Ljava/lang/Long;", "getId", WebConst.QueryParam.SET_ID, "(Ljava/lang/Long;)V", "c", "Ljava/lang/Boolean;", "getNeedConfirm", "setNeedConfirm", "(Ljava/lang/Boolean;)V", GoogleApiAvailabilityLight.a, "getServiceName", "setServiceName", "e", "getTitle", d.o, "f", "getUpdated", "setUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Companion", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Protocol implements Serializable {

    @NotNull
    public static final String ACTION_TYPE_ISSUE = "ISSUE";

    @NotNull
    public static final String ACTION_TYPE_RECHARGE = "RECHARGE";

    @NotNull
    public static final String ACTION_TYPE_UPDATE = "UPDATE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Long id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean needConfirm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String serviceName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean updated;

    public Protocol(@Nullable String str, @Nullable Long l, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool2) {
        this.content = str;
        this.id = l;
        this.needConfirm = bool;
        this.serviceName = str2;
        this.title = str3;
        this.updated = bool2;
    }

    public static /* synthetic */ Protocol copy$default(Protocol protocol, String str, Long l, Boolean bool, String str2, String str3, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protocol.content;
        }
        if ((i & 2) != 0) {
            l = protocol.id;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            bool = protocol.needConfirm;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            str2 = protocol.serviceName;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = protocol.title;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            bool2 = protocol.updated;
        }
        return protocol.copy(str, l2, bool3, str4, str5, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getUpdated() {
        return this.updated;
    }

    @NotNull
    public final Protocol copy(@Nullable String content, @Nullable Long id, @Nullable Boolean needConfirm, @Nullable String serviceName, @Nullable String title, @Nullable Boolean updated) {
        return new Protocol(content, id, needConfirm, serviceName, title, updated);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Protocol)) {
            return false;
        }
        Protocol protocol = (Protocol) other;
        return Intrinsics.areEqual(this.content, protocol.content) && Intrinsics.areEqual(this.id, protocol.id) && Intrinsics.areEqual(this.needConfirm, protocol.needConfirm) && Intrinsics.areEqual(this.serviceName, protocol.serviceName) && Intrinsics.areEqual(this.title, protocol.title) && Intrinsics.areEqual(this.updated, protocol.updated);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    @Nullable
    public final String getServiceName() {
        return this.serviceName;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Boolean getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.id;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.needConfirm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.serviceName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.updated;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setId(@Nullable Long l) {
        this.id = l;
    }

    public final void setNeedConfirm(@Nullable Boolean bool) {
        this.needConfirm = bool;
    }

    public final void setServiceName(@Nullable String str) {
        this.serviceName = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUpdated(@Nullable Boolean bool) {
        this.updated = bool;
    }

    @NotNull
    public String toString() {
        return "Protocol(content=" + ((Object) this.content) + ", id=" + this.id + ", needConfirm=" + this.needConfirm + ", serviceName=" + ((Object) this.serviceName) + ", title=" + ((Object) this.title) + ", updated=" + this.updated + ')';
    }
}

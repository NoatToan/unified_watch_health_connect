package com.xiaomi.fitness.feedback.history;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.onetrack.c.q;
import defpackage.a0j;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+J\u0006\u0010T\u001a\u00020\u0005J\u0006\u0010U\u001a\u00020\u0005J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0005HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003J\t\u0010m\u001a\u00020\u0005HÆ\u0003J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\t\u0010o\u001a\u00020\u0005HÆ\u0003J\t\u0010p\u001a\u00020\u0005HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020!HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003Jû\u0002\u0010{\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u0003HÆ\u0001J\u0006\u0010|\u001a\u00020\u0003J\u0014\u0010}\u001a\u00020~2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001HÖ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0005HÖ\u0001J\u001b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010-R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010/R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010-R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010/R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010/R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010/R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010-R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010-R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010-R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010-R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010-R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010-R\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010-¨\u0006\u0088\u0001"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryDetail;", "Landroid/os/Parcelable;", q.f13858b, "", "appName", "", "appVersionName", "channel", MiuiCursorConstants.CONTENT, "customInfo", "deviceName", "feedbackId", "fixedProblemClass", "fixedProblemType", "fixedTagId", "fixedWideTagId", "inputTime", "jiraKey", "labeledTime", "language", "miVersion", "model", "occurrenceTime", "opProblemType", "opTagId", "opWideTagId", "operateTime", AuthorizeActivityBase.KEY_OPERATOR, DevInfoKeys.OS_VERSION, "packageName", "position", "platform", "prob", "", "recProblemType", "recTagId", "recWideTagId", "region", "subChannel", "userProblemType", "userTagId", "userWideTagId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IFIIILjava/lang/String;Ljava/lang/String;III)V", "getAppId", "()I", "getAppName", "()Ljava/lang/String;", "getAppVersionName", "getChannel", "getContent", "getCustomInfo", "getDeviceName", "getFeedbackId", "getFixedProblemClass", "getFixedProblemType", "getFixedTagId", "getFixedWideTagId", "getInputTime", "getJiraKey", "getLabeledTime", "getLanguage", "getMiVersion", "getModel", "getOccurrenceTime", "getOpProblemType", "getOpTagId", "getOpWideTagId", "getOperateTime", "getOperator", "getOsVersion", "getPackageName", "getPosition", "getPlatform", "getProb", "()F", "getRecProblemType", "getRecTagId", "getRecWideTagId", "getRegion", "getSubChannel", "getUserProblemType", "getUserTagId", "getUserWideTagId", "getFeedbackNum", "getTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HistoryDetail implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HistoryDetail> CREATOR = new Creator();
    private final int appId;

    @NotNull
    private final String appName;

    @NotNull
    private final String appVersionName;

    @NotNull
    private final String channel;

    @NotNull
    private final String content;

    @NotNull
    private final String customInfo;

    @NotNull
    private final String deviceName;
    private final int feedbackId;
    private final int fixedProblemClass;
    private final int fixedProblemType;
    private final int fixedTagId;
    private final int fixedWideTagId;

    @NotNull
    private final String inputTime;

    @NotNull
    private final String jiraKey;

    @SerializedName("labeled_time")
    @NotNull
    private final String labeledTime;

    @NotNull
    private final String language;

    @NotNull
    private final String miVersion;

    @NotNull
    private final String model;

    @NotNull
    private final String occurrenceTime;
    private final int opProblemType;
    private final int opTagId;
    private final int opWideTagId;

    @NotNull
    private final String operateTime;

    @NotNull
    private final String operator;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String packageName;
    private final int platform;

    @NotNull
    private final String position;
    private final float prob;
    private final int recProblemType;
    private final int recTagId;
    private final int recWideTagId;

    @NotNull
    private final String region;

    @NotNull
    private final String subChannel;
    private final int userProblemType;
    private final int userTagId;
    private final int userWideTagId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HistoryDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HistoryDetail(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryDetail[] newArray(int i) {
            return new HistoryDetail[i];
        }
    }

    public HistoryDetail() {
        this(0, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, 0, 0.0f, 0, 0, 0, null, null, 0, 0, 0, -1, 31, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFixedProblemType() {
        return this.fixedProblemType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getFixedTagId() {
        return this.fixedTagId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFixedWideTagId() {
        return this.fixedWideTagId;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getInputTime() {
        return this.inputTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getJiraKey() {
        return this.jiraKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLabeledTime() {
        return this.labeledTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMiVersion() {
        return this.miVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOccurrenceTime() {
        return this.occurrenceTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getOpProblemType() {
        return this.opProblemType;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getOpTagId() {
        return this.opTagId;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getOpWideTagId() {
        return this.opWideTagId;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getOperateTime() {
        return this.operateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final float getProb() {
        return this.prob;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getRecProblemType() {
        return this.recProblemType;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getRecTagId() {
        return this.recTagId;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getRecWideTagId() {
        return this.recWideTagId;
    }

    @NotNull
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getSubChannel() {
        return this.subChannel;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getUserProblemType() {
        return this.userProblemType;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getUserTagId() {
        return this.userTagId;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final int getUserWideTagId() {
        return this.userWideTagId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCustomInfo() {
        return this.customInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFeedbackId() {
        return this.feedbackId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFixedProblemClass() {
        return this.fixedProblemClass;
    }

    @NotNull
    public final HistoryDetail copy(int appId, @NotNull String appName, @NotNull String appVersionName, @NotNull String channel, @NotNull String content, @NotNull String customInfo, @NotNull String deviceName, int feedbackId, int fixedProblemClass, int fixedProblemType, int fixedTagId, int fixedWideTagId, @NotNull String inputTime, @NotNull String jiraKey, @NotNull String labeledTime, @NotNull String language, @NotNull String miVersion, @NotNull String model, @NotNull String occurrenceTime, int opProblemType, int opTagId, int opWideTagId, @NotNull String operateTime, @NotNull String operator, @NotNull String osVersion, @NotNull String packageName, @NotNull String position, int platform, float prob, int recProblemType, int recTagId, int recWideTagId, @NotNull String region, @NotNull String subChannel, int userProblemType, int userTagId, int userWideTagId) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersionName, "appVersionName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(customInfo, "customInfo");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(inputTime, "inputTime");
        Intrinsics.checkNotNullParameter(jiraKey, "jiraKey");
        Intrinsics.checkNotNullParameter(labeledTime, "labeledTime");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(miVersion, "miVersion");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(occurrenceTime, "occurrenceTime");
        Intrinsics.checkNotNullParameter(operateTime, "operateTime");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        return new HistoryDetail(appId, appName, appVersionName, channel, content, customInfo, deviceName, feedbackId, fixedProblemClass, fixedProblemType, fixedTagId, fixedWideTagId, inputTime, jiraKey, labeledTime, language, miVersion, model, occurrenceTime, opProblemType, opTagId, opWideTagId, operateTime, operator, osVersion, packageName, position, platform, prob, recProblemType, recTagId, recWideTagId, region, subChannel, userProblemType, userTagId, userWideTagId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryDetail)) {
            return false;
        }
        HistoryDetail historyDetail = (HistoryDetail) other;
        return this.appId == historyDetail.appId && Intrinsics.areEqual(this.appName, historyDetail.appName) && Intrinsics.areEqual(this.appVersionName, historyDetail.appVersionName) && Intrinsics.areEqual(this.channel, historyDetail.channel) && Intrinsics.areEqual(this.content, historyDetail.content) && Intrinsics.areEqual(this.customInfo, historyDetail.customInfo) && Intrinsics.areEqual(this.deviceName, historyDetail.deviceName) && this.feedbackId == historyDetail.feedbackId && this.fixedProblemClass == historyDetail.fixedProblemClass && this.fixedProblemType == historyDetail.fixedProblemType && this.fixedTagId == historyDetail.fixedTagId && this.fixedWideTagId == historyDetail.fixedWideTagId && Intrinsics.areEqual(this.inputTime, historyDetail.inputTime) && Intrinsics.areEqual(this.jiraKey, historyDetail.jiraKey) && Intrinsics.areEqual(this.labeledTime, historyDetail.labeledTime) && Intrinsics.areEqual(this.language, historyDetail.language) && Intrinsics.areEqual(this.miVersion, historyDetail.miVersion) && Intrinsics.areEqual(this.model, historyDetail.model) && Intrinsics.areEqual(this.occurrenceTime, historyDetail.occurrenceTime) && this.opProblemType == historyDetail.opProblemType && this.opTagId == historyDetail.opTagId && this.opWideTagId == historyDetail.opWideTagId && Intrinsics.areEqual(this.operateTime, historyDetail.operateTime) && Intrinsics.areEqual(this.operator, historyDetail.operator) && Intrinsics.areEqual(this.osVersion, historyDetail.osVersion) && Intrinsics.areEqual(this.packageName, historyDetail.packageName) && Intrinsics.areEqual(this.position, historyDetail.position) && this.platform == historyDetail.platform && Float.compare(this.prob, historyDetail.prob) == 0 && this.recProblemType == historyDetail.recProblemType && this.recTagId == historyDetail.recTagId && this.recWideTagId == historyDetail.recWideTagId && Intrinsics.areEqual(this.region, historyDetail.region) && Intrinsics.areEqual(this.subChannel, historyDetail.subChannel) && this.userProblemType == historyDetail.userProblemType && this.userTagId == historyDetail.userTagId && this.userWideTagId == historyDetail.userWideTagId;
    }

    public final int getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getCustomInfo() {
        return this.customInfo;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    public final int getFeedbackId() {
        return this.feedbackId;
    }

    @NotNull
    public final String getFeedbackNum() {
        return ApplicationExtKt.getApplication().getString(a0j.A) + this.feedbackId;
    }

    public final int getFixedProblemClass() {
        return this.fixedProblemClass;
    }

    public final int getFixedProblemType() {
        return this.fixedProblemType;
    }

    public final int getFixedTagId() {
        return this.fixedTagId;
    }

    public final int getFixedWideTagId() {
        return this.fixedWideTagId;
    }

    @NotNull
    public final String getInputTime() {
        return this.inputTime;
    }

    @NotNull
    public final String getJiraKey() {
        return this.jiraKey;
    }

    @NotNull
    public final String getLabeledTime() {
        return this.labeledTime;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getMiVersion() {
        return this.miVersion;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOccurrenceTime() {
        return this.occurrenceTime;
    }

    public final int getOpProblemType() {
        return this.opProblemType;
    }

    public final int getOpTagId() {
        return this.opTagId;
    }

    public final int getOpWideTagId() {
        return this.opWideTagId;
    }

    @NotNull
    public final String getOperateTime() {
        return this.operateTime;
    }

    @NotNull
    public final String getOperator() {
        return this.operator;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    public final float getProb() {
        return this.prob;
    }

    public final int getRecProblemType() {
        return this.recProblemType;
    }

    public final int getRecTagId() {
        return this.recTagId;
    }

    public final int getRecWideTagId() {
        return this.recWideTagId;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getSubChannel() {
        return this.subChannel;
    }

    @NotNull
    public final String getTime() {
        if (this.inputTime.length() <= 0) {
            return "";
        }
        Date dateStringToDate = TimeUtils.stringToDate(this.inputTime, "yyyy-MM-dd HH:mm:ss.S");
        return TimeUtils.formatDate("yyyy/MM/dd HH:mm", dateStringToDate != null ? Long.valueOf(dateStringToDate.getTime()) : null);
    }

    public final int getUserProblemType() {
        return this.userProblemType;
    }

    public final int getUserTagId() {
        return this.userTagId;
    }

    public final int getUserWideTagId() {
        return this.userWideTagId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.appId) * 31) + this.appName.hashCode()) * 31) + this.appVersionName.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.content.hashCode()) * 31) + this.customInfo.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + Integer.hashCode(this.feedbackId)) * 31) + Integer.hashCode(this.fixedProblemClass)) * 31) + Integer.hashCode(this.fixedProblemType)) * 31) + Integer.hashCode(this.fixedTagId)) * 31) + Integer.hashCode(this.fixedWideTagId)) * 31) + this.inputTime.hashCode()) * 31) + this.jiraKey.hashCode()) * 31) + this.labeledTime.hashCode()) * 31) + this.language.hashCode()) * 31) + this.miVersion.hashCode()) * 31) + this.model.hashCode()) * 31) + this.occurrenceTime.hashCode()) * 31) + Integer.hashCode(this.opProblemType)) * 31) + Integer.hashCode(this.opTagId)) * 31) + Integer.hashCode(this.opWideTagId)) * 31) + this.operateTime.hashCode()) * 31) + this.operator.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.position.hashCode()) * 31) + Integer.hashCode(this.platform)) * 31) + Float.hashCode(this.prob)) * 31) + Integer.hashCode(this.recProblemType)) * 31) + Integer.hashCode(this.recTagId)) * 31) + Integer.hashCode(this.recWideTagId)) * 31) + this.region.hashCode()) * 31) + this.subChannel.hashCode()) * 31) + Integer.hashCode(this.userProblemType)) * 31) + Integer.hashCode(this.userTagId)) * 31) + Integer.hashCode(this.userWideTagId);
    }

    @NotNull
    public String toString() {
        return "HistoryDetail(appId=" + this.appId + ", appName=" + this.appName + ", appVersionName=" + this.appVersionName + ", channel=" + this.channel + ", content=" + this.content + ", customInfo=" + this.customInfo + ", deviceName=" + this.deviceName + ", feedbackId=" + this.feedbackId + ", fixedProblemClass=" + this.fixedProblemClass + ", fixedProblemType=" + this.fixedProblemType + ", fixedTagId=" + this.fixedTagId + ", fixedWideTagId=" + this.fixedWideTagId + ", inputTime=" + this.inputTime + ", jiraKey=" + this.jiraKey + ", labeledTime=" + this.labeledTime + ", language=" + this.language + ", miVersion=" + this.miVersion + ", model=" + this.model + ", occurrenceTime=" + this.occurrenceTime + ", opProblemType=" + this.opProblemType + ", opTagId=" + this.opTagId + ", opWideTagId=" + this.opWideTagId + ", operateTime=" + this.operateTime + ", operator=" + this.operator + ", osVersion=" + this.osVersion + ", packageName=" + this.packageName + ", position=" + this.position + ", platform=" + this.platform + ", prob=" + this.prob + ", recProblemType=" + this.recProblemType + ", recTagId=" + this.recTagId + ", recWideTagId=" + this.recWideTagId + ", region=" + this.region + ", subChannel=" + this.subChannel + ", userProblemType=" + this.userProblemType + ", userTagId=" + this.userTagId + ", userWideTagId=" + this.userWideTagId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.appId);
        dest.writeString(this.appName);
        dest.writeString(this.appVersionName);
        dest.writeString(this.channel);
        dest.writeString(this.content);
        dest.writeString(this.customInfo);
        dest.writeString(this.deviceName);
        dest.writeInt(this.feedbackId);
        dest.writeInt(this.fixedProblemClass);
        dest.writeInt(this.fixedProblemType);
        dest.writeInt(this.fixedTagId);
        dest.writeInt(this.fixedWideTagId);
        dest.writeString(this.inputTime);
        dest.writeString(this.jiraKey);
        dest.writeString(this.labeledTime);
        dest.writeString(this.language);
        dest.writeString(this.miVersion);
        dest.writeString(this.model);
        dest.writeString(this.occurrenceTime);
        dest.writeInt(this.opProblemType);
        dest.writeInt(this.opTagId);
        dest.writeInt(this.opWideTagId);
        dest.writeString(this.operateTime);
        dest.writeString(this.operator);
        dest.writeString(this.osVersion);
        dest.writeString(this.packageName);
        dest.writeString(this.position);
        dest.writeInt(this.platform);
        dest.writeFloat(this.prob);
        dest.writeInt(this.recProblemType);
        dest.writeInt(this.recTagId);
        dest.writeInt(this.recWideTagId);
        dest.writeString(this.region);
        dest.writeString(this.subChannel);
        dest.writeInt(this.userProblemType);
        dest.writeInt(this.userTagId);
        dest.writeInt(this.userWideTagId);
    }

    public HistoryDetail(int i, @NotNull String appName, @NotNull String appVersionName, @NotNull String channel, @NotNull String content, @NotNull String customInfo, @NotNull String deviceName, int i2, int i3, int i4, int i5, int i6, @NotNull String inputTime, @NotNull String jiraKey, @NotNull String labeledTime, @NotNull String language, @NotNull String miVersion, @NotNull String model, @NotNull String occurrenceTime, int i7, int i8, int i9, @NotNull String operateTime, @NotNull String operator, @NotNull String osVersion, @NotNull String packageName, @NotNull String position, int i10, float f, int i11, int i12, int i13, @NotNull String region, @NotNull String subChannel, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersionName, "appVersionName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(customInfo, "customInfo");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(inputTime, "inputTime");
        Intrinsics.checkNotNullParameter(jiraKey, "jiraKey");
        Intrinsics.checkNotNullParameter(labeledTime, "labeledTime");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(miVersion, "miVersion");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(occurrenceTime, "occurrenceTime");
        Intrinsics.checkNotNullParameter(operateTime, "operateTime");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        this.appId = i;
        this.appName = appName;
        this.appVersionName = appVersionName;
        this.channel = channel;
        this.content = content;
        this.customInfo = customInfo;
        this.deviceName = deviceName;
        this.feedbackId = i2;
        this.fixedProblemClass = i3;
        this.fixedProblemType = i4;
        this.fixedTagId = i5;
        this.fixedWideTagId = i6;
        this.inputTime = inputTime;
        this.jiraKey = jiraKey;
        this.labeledTime = labeledTime;
        this.language = language;
        this.miVersion = miVersion;
        this.model = model;
        this.occurrenceTime = occurrenceTime;
        this.opProblemType = i7;
        this.opTagId = i8;
        this.opWideTagId = i9;
        this.operateTime = operateTime;
        this.operator = operator;
        this.osVersion = osVersion;
        this.packageName = packageName;
        this.position = position;
        this.platform = i10;
        this.prob = f;
        this.recProblemType = i11;
        this.recTagId = i12;
        this.recWideTagId = i13;
        this.region = region;
        this.subChannel = subChannel;
        this.userProblemType = i14;
        this.userTagId = i15;
        this.userWideTagId = i16;
    }

    public /* synthetic */ HistoryDetail(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, int i5, int i6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i7, int i8, int i9, String str14, String str15, String str16, String str17, String str18, int i10, float f, int i11, int i12, int i13, String str19, String str20, int i14, int i15, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? -1 : i, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? "" : str5, (i17 & 64) != 0 ? "" : str6, (i17 & 128) != 0 ? -1 : i2, (i17 & 256) != 0 ? -1 : i3, (i17 & 512) != 0 ? -1 : i4, (i17 & 1024) != 0 ? -1 : i5, (i17 & 2048) != 0 ? -1 : i6, (i17 & 4096) != 0 ? "" : str7, (i17 & 8192) != 0 ? "" : str8, (i17 & 16384) != 0 ? "" : str9, (i17 & 32768) != 0 ? "" : str10, (i17 & 65536) != 0 ? "" : str11, (i17 & 131072) != 0 ? "" : str12, (i17 & 262144) != 0 ? "" : str13, (i17 & 524288) != 0 ? -1 : i7, (i17 & EventRecurrence.TH) != 0 ? -1 : i8, (i17 & 2097152) != 0 ? -1 : i9, (i17 & 4194304) != 0 ? "" : str14, (i17 & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? "" : str15, (i17 & 16777216) != 0 ? "" : str16, (i17 & 33554432) != 0 ? "" : str17, (i17 & 67108864) != 0 ? "" : str18, (i17 & 134217728) != 0 ? -1 : i10, (i17 & 268435456) != 0 ? -1.0f : f, (i17 & 536870912) != 0 ? -1 : i11, (i17 & 1073741824) != 0 ? -1 : i12, (i17 & Integer.MIN_VALUE) != 0 ? -1 : i13, (i18 & 1) != 0 ? "" : str19, (i18 & 2) != 0 ? "" : str20, (i18 & 4) != 0 ? -1 : i14, (i18 & 8) != 0 ? -1 : i15, (i18 & 16) != 0 ? -1 : i16);
    }
}

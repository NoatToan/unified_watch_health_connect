package com.huami.ecg.sync.health.model;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b}\b\u0086\b\u0018\u0000  \u00012\u00020\u0001:\u0002 \u0001B£\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0006\u0012\b\b\u0002\u0010'\u001a\u00020\b\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020\b\u0012\b\b\u0002\u0010+\u001a\u00020\b\u0012\b\b\u0002\u0010,\u001a\u00020\u000e\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020\b\u0012\b\b\u0002\u0010/\u001a\u00020\u0012\u0012\b\b\u0002\u00100\u001a\u00020\u000e\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0016\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018\u0012\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010$¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0018HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003J§\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u000e2\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00162\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00182\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00182\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00182\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010;\u001a\u0004\u0018\u00010$HÆ\u0001J\t\u0010=\u001a\u00020\u0006HÖ\u0001J\t\u0010>\u001a\u00020\u0002HÖ\u0001J\u0013\u0010@\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010G\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010&\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010L\u001a\u0004\bX\u0010N\"\u0004\bY\u0010PR\"\u0010*\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010N\"\u0004\b\\\u0010PR\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010L\u001a\u0004\b+\u0010N\"\u0004\b^\u0010PR\"\u0010,\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010-\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010L\u001a\u0004\bf\u0010N\"\u0004\bg\u0010PR\"\u0010.\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010L\u001a\u0004\bi\u0010N\"\u0004\bj\u0010PR\"\u0010/\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u00100\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010`\u001a\u0004\br\u0010b\"\u0004\bs\u0010dR\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010R\u001a\u0004\bu\u0010T\"\u0004\bv\u0010VR\"\u00102\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R-\u00103\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R/\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0083\u0001\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001\"\u0006\b\u0085\u0001\u0010\u0082\u0001R/\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0086\u0001\u0010~\u001a\u0006\b\u0087\u0001\u0010\u0080\u0001\"\u0006\b\u0088\u0001\u0010\u0082\u0001R/\u00106\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0089\u0001\u0010~\u001a\u0006\b\u008a\u0001\u0010\u0080\u0001\"\u0006\b\u008b\u0001\u0010\u0082\u0001R/\u00107\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010~\u001a\u0006\b\u008d\u0001\u0010\u0080\u0001\"\u0006\b\u008e\u0001\u0010\u0082\u0001R/\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010~\u001a\u0006\b\u0090\u0001\u0010\u0080\u0001\"\u0006\b\u0091\u0001\u0010\u0082\u0001R/\u00109\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0092\u0001\u0010~\u001a\u0006\b\u0093\u0001\u0010\u0080\u0001\"\u0006\b\u0094\u0001\u0010\u0082\u0001R/\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0095\u0001\u0010~\u001a\u0006\b\u0096\u0001\u0010\u0080\u0001\"\u0006\b\u0097\u0001\u0010\u0082\u0001R*\u0010;\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/huami/ecg/sync/health/model/EcgInput;", "", "", "self", "", "setIsSelf", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "Lcom/huami/ecg/sync/health/model/SensorRecord;", "component10", "component11", "component12", "Ljava/util/Calendar;", "component13", "", "", "component14", "component15", "component16", "", "component17", "component18", "component19", "", "component20", "component21", "", "component22", "measureContentType", "online", "errorCode", "badECG", "userAsBioIdMatched", "isAlgoBioIdMatched", "bioIdGroupId", "asBioId", "noneBioIdSelf", "sensorRecord", EcgData.GROUP_ID, "deviceSource", "timestamp", "ecgRawData", "lodData", "lodLocation", "etLost", "btLost", "fwLost", "extRawData", "ppgData", "normalizedData", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "b", "getMeasureContentType", "setMeasureContentType", "c", "Z", "getOnline", "()Z", "setOnline", "(Z)V", GoogleApiAvailabilityLight.a, LogUtil.I, "getErrorCode", "()I", "setErrorCode", "(I)V", "e", "getBadECG", "setBadECG", "f", "getUserAsBioIdMatched", "setUserAsBioIdMatched", "g", "setAlgoBioIdMatched", "h", "J", "getBioIdGroupId", "()J", "setBioIdGroupId", "(J)V", "i", "getAsBioId", "setAsBioId", z.j, "getNoneBioIdSelf", "setNoneBioIdSelf", hl.k, "Lcom/huami/ecg/sync/health/model/SensorRecord;", "getSensorRecord", "()Lcom/huami/ecg/sync/health/model/SensorRecord;", "setSensorRecord", "(Lcom/huami/ecg/sync/health/model/SensorRecord;)V", "l", "getGroupId", "setGroupId", "m", "getDeviceSource", "setDeviceSource", GoogleApiAvailabilityLight.b, "Ljava/util/Calendar;", "getTimestamp", "()Ljava/util/Calendar;", "setTimestamp", "(Ljava/util/Calendar;)V", "o", "Ljava/util/List;", "getEcgRawData", "()Ljava/util/List;", "setEcgRawData", "(Ljava/util/List;)V", b.r, "getLodData", "setLodData", DTransferConstants.SEARCH_KEY, "getLodLocation", "setLodLocation", "r", "getEtLost", "setEtLost", SOAP.XMLNS, "getBtLost", "setBtLost", "t", "getFwLost", "setFwLost", "u", "getExtRawData", "setExtRawData", "v", "getPpgData", "setPpgData", "w", "[D", "getNormalizedData", "()[D", "setNormalizedData", "([D)V", "<init>", "(Ljava/lang/String;ZIZZZJZZLcom/huami/ecg/sync/health/model/SensorRecord;JILjava/util/Calendar;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;[D)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EcgInput {
    public static final int SELF_ISMY = 1;
    public static final int SELF_NO_AUTH = 0;
    public static final int SELF_OTHERS = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String measureContentType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean online;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int errorCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean badECG;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean userAsBioIdMatched;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private boolean isAlgoBioIdMatched;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private long bioIdGroupId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private boolean asBioId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private boolean noneBioIdSelf;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    private SensorRecord sensorRecord;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private long groupId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private int deviceSource;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @NotNull
    private Calendar timestamp;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private List<Float> ecgRawData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    private List<Integer> lodData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @Nullable
    private List<Integer> lodLocation;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @Nullable
    private List<int[]> etLost;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @Nullable
    private List<int[]> btLost;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @Nullable
    private List<Integer> fwLost;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @Nullable
    private List<Byte> extRawData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @Nullable
    private List<Float> ppgData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @Nullable
    private double[] normalizedData;

    public EcgInput(@NotNull String str, boolean z, int i, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, @NotNull SensorRecord sensorRecord, long j2, int i2, @NotNull Calendar calendar, @Nullable List<Float> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<int[]> list4, @Nullable List<int[]> list5, @Nullable List<Integer> list6, @Nullable List<Byte> list7, @Nullable List<Float> list8, @Nullable double[] dArr) {
        this.measureContentType = str;
        this.online = z;
        this.errorCode = i;
        this.badECG = z2;
        this.userAsBioIdMatched = z3;
        this.isAlgoBioIdMatched = z4;
        this.bioIdGroupId = j;
        this.asBioId = z5;
        this.noneBioIdSelf = z6;
        this.sensorRecord = sensorRecord;
        this.groupId = j2;
        this.deviceSource = i2;
        this.timestamp = calendar;
        this.ecgRawData = list;
        this.lodData = list2;
        this.lodLocation = list3;
        this.etLost = list4;
        this.btLost = list5;
        this.fwLost = list6;
        this.extRawData = list7;
        this.ppgData = list8;
        this.normalizedData = dArr;
        this.userId = "";
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMeasureContentType() {
        return this.measureContentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SensorRecord getSensorRecord() {
        return this.sensorRecord;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Calendar getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final List<Float> component14() {
        return this.ecgRawData;
    }

    @Nullable
    public final List<Integer> component15() {
        return this.lodData;
    }

    @Nullable
    public final List<Integer> component16() {
        return this.lodLocation;
    }

    @Nullable
    public final List<int[]> component17() {
        return this.etLost;
    }

    @Nullable
    public final List<int[]> component18() {
        return this.btLost;
    }

    @Nullable
    public final List<Integer> component19() {
        return this.fwLost;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    @Nullable
    public final List<Byte> component20() {
        return this.extRawData;
    }

    @Nullable
    public final List<Float> component21() {
        return this.ppgData;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final double[] getNormalizedData() {
        return this.normalizedData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getBadECG() {
        return this.badECG;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getUserAsBioIdMatched() {
        return this.userAsBioIdMatched;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsAlgoBioIdMatched() {
        return this.isAlgoBioIdMatched;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getBioIdGroupId() {
        return this.bioIdGroupId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getAsBioId() {
        return this.asBioId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getNoneBioIdSelf() {
        return this.noneBioIdSelf;
    }

    @NotNull
    public final EcgInput copy(@NotNull String measureContentType, boolean online, int errorCode, boolean badECG, boolean userAsBioIdMatched, boolean isAlgoBioIdMatched, long bioIdGroupId, boolean asBioId, boolean noneBioIdSelf, @NotNull SensorRecord sensorRecord, long groupId, int deviceSource, @NotNull Calendar timestamp, @Nullable List<Float> ecgRawData, @Nullable List<Integer> lodData, @Nullable List<Integer> lodLocation, @Nullable List<int[]> etLost, @Nullable List<int[]> btLost, @Nullable List<Integer> fwLost, @Nullable List<Byte> extRawData, @Nullable List<Float> ppgData, @Nullable double[] normalizedData) {
        return new EcgInput(measureContentType, online, errorCode, badECG, userAsBioIdMatched, isAlgoBioIdMatched, bioIdGroupId, asBioId, noneBioIdSelf, sensorRecord, groupId, deviceSource, timestamp, ecgRawData, lodData, lodLocation, etLost, btLost, fwLost, extRawData, ppgData, normalizedData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgInput)) {
            return false;
        }
        EcgInput ecgInput = (EcgInput) other;
        return Intrinsics.areEqual(this.measureContentType, ecgInput.measureContentType) && this.online == ecgInput.online && this.errorCode == ecgInput.errorCode && this.badECG == ecgInput.badECG && this.userAsBioIdMatched == ecgInput.userAsBioIdMatched && this.isAlgoBioIdMatched == ecgInput.isAlgoBioIdMatched && this.bioIdGroupId == ecgInput.bioIdGroupId && this.asBioId == ecgInput.asBioId && this.noneBioIdSelf == ecgInput.noneBioIdSelf && Intrinsics.areEqual(this.sensorRecord, ecgInput.sensorRecord) && this.groupId == ecgInput.groupId && this.deviceSource == ecgInput.deviceSource && Intrinsics.areEqual(this.timestamp, ecgInput.timestamp) && Intrinsics.areEqual(this.ecgRawData, ecgInput.ecgRawData) && Intrinsics.areEqual(this.lodData, ecgInput.lodData) && Intrinsics.areEqual(this.lodLocation, ecgInput.lodLocation) && Intrinsics.areEqual(this.etLost, ecgInput.etLost) && Intrinsics.areEqual(this.btLost, ecgInput.btLost) && Intrinsics.areEqual(this.fwLost, ecgInput.fwLost) && Intrinsics.areEqual(this.extRawData, ecgInput.extRawData) && Intrinsics.areEqual(this.ppgData, ecgInput.ppgData) && Intrinsics.areEqual(this.normalizedData, ecgInput.normalizedData);
    }

    public final boolean getAsBioId() {
        return this.asBioId;
    }

    public final boolean getBadECG() {
        return this.badECG;
    }

    public final long getBioIdGroupId() {
        return this.bioIdGroupId;
    }

    @Nullable
    public final List<int[]> getBtLost() {
        return this.btLost;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final List<Float> getEcgRawData() {
        return this.ecgRawData;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final List<int[]> getEtLost() {
        return this.etLost;
    }

    @Nullable
    public final List<Byte> getExtRawData() {
        return this.extRawData;
    }

    @Nullable
    public final List<Integer> getFwLost() {
        return this.fwLost;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final List<Integer> getLodData() {
        return this.lodData;
    }

    @Nullable
    public final List<Integer> getLodLocation() {
        return this.lodLocation;
    }

    @NotNull
    public final String getMeasureContentType() {
        return this.measureContentType;
    }

    public final boolean getNoneBioIdSelf() {
        return this.noneBioIdSelf;
    }

    @Nullable
    public final double[] getNormalizedData() {
        return this.normalizedData;
    }

    public final boolean getOnline() {
        return this.online;
    }

    @Nullable
    public final List<Float> getPpgData() {
        return this.ppgData;
    }

    @NotNull
    public final SensorRecord getSensorRecord() {
        return this.sensorRecord;
    }

    @NotNull
    public final Calendar getTimestamp() {
        return this.timestamp;
    }

    public final boolean getUserAsBioIdMatched() {
        return this.userAsBioIdMatched;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public int hashCode() {
        String str = this.measureContentType;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.online;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (((iHashCode + r2) * 31) + this.errorCode) * 31;
        boolean z2 = this.badECG;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (i + r3) * 31;
        boolean z3 = this.userAsBioIdMatched;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int i3 = (i2 + r4) * 31;
        boolean z4 = this.isAlgoBioIdMatched;
        ?? r5 = z4;
        if (z4) {
            r5 = 1;
        }
        long j = this.bioIdGroupId;
        int i4 = (((i3 + r5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z5 = this.asBioId;
        ?? r6 = z5;
        if (z5) {
            r6 = 1;
        }
        int i5 = (i4 + r6) * 31;
        boolean z6 = this.noneBioIdSelf;
        int i6 = (i5 + (z6 ? 1 : z6)) * 31;
        SensorRecord sensorRecord = this.sensorRecord;
        int iHashCode2 = (i6 + (sensorRecord != null ? sensorRecord.hashCode() : 0)) * 31;
        long j2 = this.groupId;
        int i7 = (((iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.deviceSource) * 31;
        Calendar calendar = this.timestamp;
        int iHashCode3 = (i7 + (calendar != null ? calendar.hashCode() : 0)) * 31;
        List<Float> list = this.ecgRawData;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.lodData;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Integer> list3 = this.lodLocation;
        int iHashCode6 = (iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<int[]> list4 = this.etLost;
        int iHashCode7 = (iHashCode6 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<int[]> list5 = this.btLost;
        int iHashCode8 = (iHashCode7 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<Integer> list6 = this.fwLost;
        int iHashCode9 = (iHashCode8 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<Byte> list7 = this.extRawData;
        int iHashCode10 = (iHashCode9 + (list7 != null ? list7.hashCode() : 0)) * 31;
        List<Float> list8 = this.ppgData;
        int iHashCode11 = (iHashCode10 + (list8 != null ? list8.hashCode() : 0)) * 31;
        double[] dArr = this.normalizedData;
        return iHashCode11 + (dArr != null ? Arrays.hashCode(dArr) : 0);
    }

    public final boolean isAlgoBioIdMatched() {
        return this.isAlgoBioIdMatched;
    }

    public final void setAlgoBioIdMatched(boolean z) {
        this.isAlgoBioIdMatched = z;
    }

    public final void setAsBioId(boolean z) {
        this.asBioId = z;
    }

    public final void setBadECG(boolean z) {
        this.badECG = z;
    }

    public final void setBioIdGroupId(long j) {
        this.bioIdGroupId = j;
    }

    public final void setBtLost(@Nullable List<int[]> list) {
        this.btLost = list;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setEcgRawData(@Nullable List<Float> list) {
        this.ecgRawData = list;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setEtLost(@Nullable List<int[]> list) {
        this.etLost = list;
    }

    public final void setExtRawData(@Nullable List<Byte> list) {
        this.extRawData = list;
    }

    public final void setFwLost(@Nullable List<Integer> list) {
        this.fwLost = list;
    }

    public final void setGroupId(long j) {
        this.groupId = j;
    }

    public final void setIsSelf(int self) {
        if (self == 0) {
            this.userAsBioIdMatched = true;
            this.isAlgoBioIdMatched = true;
        } else {
            this.userAsBioIdMatched = self == 1;
            this.isAlgoBioIdMatched = false;
        }
    }

    public final void setLodData(@Nullable List<Integer> list) {
        this.lodData = list;
    }

    public final void setLodLocation(@Nullable List<Integer> list) {
        this.lodLocation = list;
    }

    public final void setMeasureContentType(@NotNull String str) {
        this.measureContentType = str;
    }

    public final void setNoneBioIdSelf(boolean z) {
        this.noneBioIdSelf = z;
    }

    public final void setNormalizedData(@Nullable double[] dArr) {
        this.normalizedData = dArr;
    }

    public final void setOnline(boolean z) {
        this.online = z;
    }

    public final void setPpgData(@Nullable List<Float> list) {
        this.ppgData = list;
    }

    public final void setSensorRecord(@NotNull SensorRecord sensorRecord) {
        this.sensorRecord = sensorRecord;
    }

    public final void setTimestamp(@NotNull Calendar calendar) {
        this.timestamp = calendar;
    }

    public final void setUserAsBioIdMatched(boolean z) {
        this.userAsBioIdMatched = z;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "EcgInput(measureContentType=" + this.measureContentType + ", online=" + this.online + ", errorCode=" + this.errorCode + ", badECG=" + this.badECG + ", userAsBioIdMatched=" + this.userAsBioIdMatched + ", isAlgoBioIdMatched=" + this.isAlgoBioIdMatched + ", bioIdGroupId=" + this.bioIdGroupId + ", asBioId=" + this.asBioId + ", noneBioIdSelf=" + this.noneBioIdSelf + ", sensorRecord=" + this.sensorRecord + ", groupId=" + this.groupId + ", deviceSource=" + this.deviceSource + ", timestamp=" + this.timestamp + ", ecgRawData=" + this.ecgRawData + ", lodData=" + this.lodData + ", lodLocation=" + this.lodLocation + ", etLost=" + this.etLost + ", btLost=" + this.btLost + ", fwLost=" + this.fwLost + ", extRawData=" + this.extRawData + ", ppgData=" + this.ppgData + ", normalizedData=" + Arrays.toString(this.normalizedData) + ")";
    }

    public /* synthetic */ EcgInput(String str, boolean z, int i, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, SensorRecord sensorRecord, long j2, int i2, Calendar calendar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, double[] dArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? MeasureContentType.HEART : str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? true : z3, (i3 & 32) != 0 ? true : z4, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? false : z5, (i3 & 256) != 0 ? false : z6, (i3 & 512) != 0 ? new SensorRecord(0, false, 0, false, 0, null, 0L, 0, 0L, 0L, 1023, null) : sensorRecord, (i3 & 1024) != 0 ? 0L : j2, i2, calendar, (i3 & 8192) != 0 ? null : list, (i3 & 16384) != 0 ? null : list2, (32768 & i3) != 0 ? null : list3, (65536 & i3) != 0 ? null : list4, (131072 & i3) != 0 ? null : list5, (262144 & i3) != 0 ? null : list6, (524288 & i3) != 0 ? null : list7, (1048576 & i3) != 0 ? null : list8, (i3 & 2097152) != 0 ? null : dArr);
    }
}

package com.huami.ecg.core.model;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 L2\u00020\u0001:\u0005LMNOPB\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u000f\u001a\u0004\b.\u0010\u0011\"\u0004\b/\u0010\u0013R\"\u00104\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000f\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R\"\u00108\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u000f\u001a\u0004\b6\u0010\u0011\"\u0004\b7\u0010\u0013R\"\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u000f\u001a\u0004\b:\u0010\u0011\"\u0004\b;\u0010\u0013R\"\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010\b\u001a\u0004\b>\u0010\n\"\u0004\b?\u0010\fR(\u0010I\u001a\b\u0012\u0004\u0012\u00020B0A8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006Q"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis;", "", "", "toString", "", "isNormal", "", "a", "J", "getDateTime", "()J", "setDateTime", "(J)V", "dateTime", "b", "Ljava/lang/String;", "getDiagnosisTime", "()Ljava/lang/String;", "setDiagnosisTime", "(Ljava/lang/String;)V", Diagnosis.p, "c", "getDiagnosis", "setDiagnosis", "diagnosis", GoogleApiAvailabilityLight.a, "getDoctorName", "setDoctorName", Diagnosis.x, "e", "getDoctorTitle", "setDoctorTitle", Diagnosis.y, "", "f", LogUtil.I, "getDiagnosisStatus", "()I", "setDiagnosisStatus", "(I)V", Diagnosis.q, "g", "getResult", "setResult", "result", "h", "getDiagnosisTitle", "setDiagnosisTitle", Diagnosis.r, "i", "getProposal", "setProposal", Diagnosis.s, z.j, "getUserId", "setUserId", "userId", hl.k, "getSignatureUrl", "setSignatureUrl", Diagnosis.u, "l", "getSubmitTime", "setSubmitTime", Diagnosis.v, "", "Lcom/huami/ecg/core/model/Diagnosis$Labels;", "m", "Ljava/util/List;", "getLabels", "()Ljava/util/List;", "setLabels", "(Ljava/util/List;)V", Diagnosis.z, "<init>", "()V", "Companion", "DiagnoseResult", "DiagnoseStatus", "DiagnosisType", "Labels", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class Diagnosis {
    private static final String n = "dataTime";
    private static final String o = "diagnosis";
    private static final String p = "diagnosisTime";
    private static final String q = "diagnosisStatus";
    private static final String r = "diagnosisTitle";
    private static final String s = "proposal";
    private static final String t = "userId";
    private static final String u = "signatureUrl";
    private static final String v = "submitTime";
    private static final String w = "result";
    private static final String x = "doctorName";
    private static final String y = "doctorTitle";
    private static final String z = "labels";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(n)
    private long dateTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName(q)
    private int diagnosisStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("result")
    private int result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(p)
    @NotNull
    private String diagnosisTime = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("diagnosis")
    @NotNull
    private String diagnosis = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(x)
    @NotNull
    private String doctorName = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(y)
    @NotNull
    private String doctorTitle = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName(r)
    @NotNull
    private String diagnosisTitle = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName(s)
    @NotNull
    private String proposal = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("userId")
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName(u)
    @NotNull
    private String signatureUrl = "";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName(v)
    private long submitTime = -1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName(z)
    @NotNull
    private List<Labels> labels = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis$DiagnoseResult;", "", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    public @interface DiagnoseResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.a;
        public static final int ECG_ANALYSIS_FAILED = 0;
        public static final int ECG_ANALYSIS_SUCCESS = 1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis$DiagnoseResult$Companion;", "", "", "ECG_ANALYSIS_FAILED", LogUtil.I, "ECG_ANALYSIS_SUCCESS", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            public static final int ECG_ANALYSIS_FAILED = 0;
            public static final int ECG_ANALYSIS_SUCCESS = 1;
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis$DiagnoseStatus;", "", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    public @interface DiagnoseStatus {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.a;
        public static final int DIAGNOSIS_STATUS_INVALID = 3;
        public static final int DIAGNOSIS_STATUS_ISSUE = 2;
        public static final int DIAGNOSIS_STATUS_NORMAL = 1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis$DiagnoseStatus$Companion;", "", "", "DIAGNOSIS_STATUS_NORMAL", LogUtil.I, "DIAGNOSIS_STATUS_ISSUE", "DIAGNOSIS_STATUS_INVALID", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            public static final int DIAGNOSIS_STATUS_INVALID = 3;
            public static final int DIAGNOSIS_STATUS_ISSUE = 2;
            public static final int DIAGNOSIS_STATUS_NORMAL = 1;
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis$DiagnosisType;", "", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface DiagnosisType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.a;

        @NotNull
        public static final String DIAGNOSIS_ABNORMAL = "abnormal";

        @NotNull
        public static final String DIAGNOSIS_AF = "af";

        @NotNull
        public static final String DIAGNOSIS_AFIB = "afib";

        @NotNull
        public static final String DIAGNOSIS_AT = "at";

        @NotNull
        public static final String DIAGNOSIS_AVB1 = "avb1";

        @NotNull
        public static final String DIAGNOSIS_AVB2 = "avb2";

        @NotNull
        public static final String DIAGNOSIS_AVB3 = "avb3";

        @NotNull
        public static final String DIAGNOSIS_INTERFERE = "interfere";

        @NotNull
        public static final String DIAGNOSIS_NOISE = "noise";

        @NotNull
        public static final String DIAGNOSIS_NORMAL = "normal";

        @NotNull
        public static final String DIAGNOSIS_OTHER = "other";

        @NotNull
        public static final String DIAGNOSIS_PSVT = "psvt";

        @NotNull
        public static final String DIAGNOSIS_RFENG = "rfeng";

        @NotNull
        public static final String DIAGNOSIS_SP = "sp";

        @NotNull
        public static final String DIAGNOSIS_SPB = "spb";

        @NotNull
        public static final String DIAGNOSIS_VPB = "vpb";

        @NotNull
        public static final String DIAGNOSIS_VT = "vt";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis$DiagnosisType$Companion;", "", "", "DIAGNOSIS_NOISE", "Ljava/lang/String;", "DIAGNOSIS_RFENG", "DIAGNOSIS_NORMAL", "DIAGNOSIS_AFIB", "DIAGNOSIS_VT", "DIAGNOSIS_AT", "DIAGNOSIS_SPB", "DIAGNOSIS_VPB", "DIAGNOSIS_AF", "DIAGNOSIS_PSVT", "DIAGNOSIS_SP", "DIAGNOSIS_AVB1", "DIAGNOSIS_AVB2", "DIAGNOSIS_AVB3", "DIAGNOSIS_OTHER", "DIAGNOSIS_ABNORMAL", "DIAGNOSIS_INTERFERE", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {

            @NotNull
            public static final String DIAGNOSIS_ABNORMAL = "abnormal";

            @NotNull
            public static final String DIAGNOSIS_AF = "af";

            @NotNull
            public static final String DIAGNOSIS_AFIB = "afib";

            @NotNull
            public static final String DIAGNOSIS_AT = "at";

            @NotNull
            public static final String DIAGNOSIS_AVB1 = "avb1";

            @NotNull
            public static final String DIAGNOSIS_AVB2 = "avb2";

            @NotNull
            public static final String DIAGNOSIS_AVB3 = "avb3";

            @NotNull
            public static final String DIAGNOSIS_INTERFERE = "interfere";

            @NotNull
            public static final String DIAGNOSIS_NOISE = "noise";

            @NotNull
            public static final String DIAGNOSIS_NORMAL = "normal";

            @NotNull
            public static final String DIAGNOSIS_OTHER = "other";

            @NotNull
            public static final String DIAGNOSIS_PSVT = "psvt";

            @NotNull
            public static final String DIAGNOSIS_RFENG = "rfeng";

            @NotNull
            public static final String DIAGNOSIS_SP = "sp";

            @NotNull
            public static final String DIAGNOSIS_SPB = "spb";

            @NotNull
            public static final String DIAGNOSIS_VPB = "vpb";

            @NotNull
            public static final String DIAGNOSIS_VT = "vt";
            public static final /* synthetic */ Companion a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\u0005\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/huami/ecg/core/model/Diagnosis$Labels;", "", "", "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "b", "getType", "setType", "type$annotations", "()V", "type", "c", "getStart", "setStart", "start", GoogleApiAvailabilityLight.a, "getEnd", "setEnd", "end", "<init>", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Labels {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("name")
        @NotNull
        private String name = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("type")
        @NotNull
        private String type = "normal";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @SerializedName("start")
        @NotNull
        private String start = "";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @SerializedName("end")
        @NotNull
        private String end = "";

        public static /* synthetic */ void type$annotations() {
        }

        @NotNull
        public final String getEnd() {
            return this.end;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getStart() {
            return this.start;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public final void setEnd(@NotNull String str) {
            this.end = str;
        }

        public final void setName(@NotNull String str) {
            this.name = str;
        }

        public final void setStart(@NotNull String str) {
            this.start = str;
        }

        public final void setType(@NotNull String str) {
            this.type = str;
        }

        @NotNull
        public String toString() {
            return "<Name: " + this.name + ", Type: " + this.type + ", Start: " + this.start + ", End: " + this.end + Typography.greater;
        }
    }

    public final long getDateTime() {
        return this.dateTime;
    }

    @NotNull
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    public final int getDiagnosisStatus() {
        return this.diagnosisStatus;
    }

    @NotNull
    public final String getDiagnosisTime() {
        return this.diagnosisTime;
    }

    @NotNull
    public final String getDiagnosisTitle() {
        return this.diagnosisTitle;
    }

    @NotNull
    public final String getDoctorName() {
        return this.doctorName;
    }

    @NotNull
    public final String getDoctorTitle() {
        return this.doctorTitle;
    }

    @NotNull
    public final List<Labels> getLabels() {
        return this.labels;
    }

    @NotNull
    public final String getProposal() {
        return this.proposal;
    }

    public final int getResult() {
        return this.result;
    }

    @NotNull
    public final String getSignatureUrl() {
        return this.signatureUrl;
    }

    public final long getSubmitTime() {
        return this.submitTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final boolean isNormal() {
        return this.diagnosisStatus == 1;
    }

    public final void setDateTime(long j) {
        this.dateTime = j;
    }

    public final void setDiagnosis(@NotNull String str) {
        this.diagnosis = str;
    }

    public final void setDiagnosisStatus(int i) {
        this.diagnosisStatus = i;
    }

    public final void setDiagnosisTime(@NotNull String str) {
        this.diagnosisTime = str;
    }

    public final void setDiagnosisTitle(@NotNull String str) {
        this.diagnosisTitle = str;
    }

    public final void setDoctorName(@NotNull String str) {
        this.doctorName = str;
    }

    public final void setDoctorTitle(@NotNull String str) {
        this.doctorTitle = str;
    }

    public final void setLabels(@NotNull List<Labels> list) {
        this.labels = list;
    }

    public final void setProposal(@NotNull String str) {
        this.proposal = str;
    }

    public final void setResult(int i) {
        this.result = i;
    }

    public final void setSignatureUrl(@NotNull String str) {
        this.signatureUrl = str;
    }

    public final void setSubmitTime(long j) {
        this.submitTime = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<DateTime: ");
        sb.append(this.dateTime);
        sb.append(", DiagnosisTime: ");
        sb.append(this.diagnosisTime);
        sb.append(", DoctorName: ");
        sb.append(this.doctorName);
        sb.append(" ,DoctorTitle:");
        sb.append(this.doctorTitle);
        sb.append(", labels");
        Object[] array = this.labels.toArray(new Labels[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sb.append(Arrays.toString(array));
        sb.append(Typography.greater);
        return sb.toString();
    }
}

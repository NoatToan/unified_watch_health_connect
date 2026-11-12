package com.huami.ecg.core.model;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bu\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000b\b\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001B\u0013\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0006\b\u008f\u0001\u0010\u0091\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\u0004H\u0016R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001f\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR\"\u0010'\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\"\u0010/\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u000b\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u000fR\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR\"\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\r\"\u0004\b:\u0010\u000fR\"\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b=\u0010\r\"\u0004\b>\u0010\u000fR\"\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000fR\"\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010\u000fR\"\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010\u000b\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010\u000fR\"\u0010O\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bM\u0010\r\"\u0004\bN\u0010\u000fR\"\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010\u000b\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u000fR\"\u0010W\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010\u000b\u001a\u0004\bU\u0010\r\"\u0004\bV\u0010\u000fR\"\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010\u000b\u001a\u0004\bY\u0010\r\"\u0004\bZ\u0010\u000fR\"\u0010_\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u000b\u001a\u0004\b]\u0010\r\"\u0004\b^\u0010\u000fR\"\u0010c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010\u000b\u001a\u0004\ba\u0010\r\"\u0004\bb\u0010\u000fR\"\u0010g\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bd\u0010\u000b\u001a\u0004\be\u0010\r\"\u0004\bf\u0010\u000fR\"\u0010k\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010\u000b\u001a\u0004\bi\u0010\r\"\u0004\bj\u0010\u000fR\"\u0010o\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010\u000b\u001a\u0004\bm\u0010\r\"\u0004\bn\u0010\u000fR\"\u0010s\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bp\u0010\u000b\u001a\u0004\bq\u0010\r\"\u0004\br\u0010\u000fR\"\u0010w\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010\u000b\u001a\u0004\bu\u0010\r\"\u0004\bv\u0010\u000fR\"\u0010{\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010\u000b\u001a\u0004\by\u0010\r\"\u0004\bz\u0010\u000fR\"\u0010\u007f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b|\u0010\u000b\u001a\u0004\b}\u0010\r\"\u0004\b~\u0010\u000fR&\u0010\u0083\u0001\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u0013\u001a\u0005\b\u0081\u0001\u0010\u0015\"\u0005\b\u0082\u0001\u0010\u0017R%\u0010\u0086\u0001\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b\u000b\u0010\u0013\u001a\u0005\b\u0084\u0001\u0010\u0015\"\u0005\b\u0085\u0001\u0010\u0017R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/huami/ecg/core/model/EcgReport;", "", "", GoogleApiAvailabilityLight.a, "", "a", "", "data", "", "parse", "toString", LogUtil.D, "getMaxBPM", "()D", "setMaxBPM", "(D)V", "MaxBPM", "", "b", LogUtil.I, "getMinBPM", "()I", "setMinBPM", "(I)V", "MinBPM", "c", "getMeanBPM", "setMeanBPM", "MeanBPM", "getASYS", "setASYS", "ASYS", "e", "getTTD100", "setTTD100", "TTD100", "f", "getTTC100", "setTTC100", "TTC100", "g", "getBTD50", "setBTD50", "BTD50", "h", "getBTC50", "setBTC50", "BTC50", "i", "getSDNN", "setSDNN", "SDNN", z.j, "getSDANN", "setSDANN", "SDANN", hl.k, "getSDNNIndex", "setSDNNIndex", "SDNNIndex", "l", "getAVNN", "setAVNN", "AVNN", "m", "getRMSSD", "setRMSSD", "rMSSD", GoogleApiAvailabilityLight.b, "getNN50", "setNN50", "NN50", "o", "getPNN50", "setPNN50", "pNN50", b.r, "getMeanHR", "setMeanHR", "meanHR", DTransferConstants.SEARCH_KEY, "getStdHR", "setStdHR", "stdHR", "r", "getSDSD", "setSDSD", "SDSD", SOAP.XMLNS, "getNN20", "setNN20", "NN20", "t", "getPNN20", "setPNN20", "pNN20", "u", "getVLF", "setVLF", "VLF", "v", "getLF", "setLF", "LF", "w", "getHF", "setHF", "HF", "x", "getTP", "setTP", "TP", "y", "getPLF", "setPLF", "pLF", "z", "getPHF", "setPHF", "pHF", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getLFHFratio", "setLFHFratio", "LFHFratio", "B", "getTotal_time", "setTotal_time", "Total_time", "C", "getTotal_beats", "setTotal_beats", "Total_beats", "getStress", "setStress", "stress", "", "E", "F", "getFatigue", "()F", "setFatigue", "(F)V", "fatigue", "<init>", "()V", "([D)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgReport {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("ASYS")
    private int ASYS;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @SerializedName("SDSD")
    private double SDSD;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @SerializedName("LF")
    private double LF;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("MaxBPM")
    private double MaxBPM = -1.0d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("MinBPM")
    private int MinBPM = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("MeanBPM")
    private double MeanBPM = -1.0d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("TTD100")
    private double TTD100 = -1.0d;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("TTC100")
    private int TTC100 = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("BTD50")
    private double BTD50 = -1.0d;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("BTC50")
    private int BTC50 = -1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("SDNN")
    private double SDNN = -1.0d;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("SDANN")
    private double SDANN = -1.0d;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName("SDNNIndex")
    private double SDNNIndex = -1.0d;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName("AVNN")
    private double AVNN = -1.0d;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName("rMSSD")
    private double rMSSD = -1.0d;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SerializedName("NN50")
    private double NN50 = -1.0d;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName("pNN50")
    private double pNN50 = -1.0d;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName("meanHR")
    private double meanHR = -1.0d;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @SerializedName("stdHR")
    private double stdHR = -1.0d;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @SerializedName("NN20")
    private double NN20 = -1.0d;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @SerializedName("pNN20")
    private double pNN20 = -1.0d;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @SerializedName("VLF")
    private double VLF = -1.0d;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @SerializedName("HF")
    private double HF = -1.0d;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @SerializedName("TP")
    private double TP = -1.0d;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @SerializedName("pLF")
    private double pLF = -1.0d;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @SerializedName("pHF")
    private double pHF = -1.0d;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("LFHFratio")
    private double LFHFratio = -1.0d;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("Total_time")
    private double Total_time = -1.0d;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("Total_beats")
    private int Total_beats = -1;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("stress")
    private int stress = -1;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("fatigue")
    private float fatigue = -1.0f;

    public EcgReport() {
    }

    private final String a(double d) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    public final int getASYS() {
        return this.ASYS;
    }

    public final double getAVNN() {
        return this.AVNN;
    }

    public final int getBTC50() {
        return this.BTC50;
    }

    public final double getBTD50() {
        return this.BTD50;
    }

    public final float getFatigue() {
        return this.fatigue;
    }

    public final double getHF() {
        return this.HF;
    }

    public final double getLF() {
        return this.LF;
    }

    public final double getLFHFratio() {
        return this.LFHFratio;
    }

    public final double getMaxBPM() {
        return this.MaxBPM;
    }

    public final double getMeanBPM() {
        return this.MeanBPM;
    }

    public final double getMeanHR() {
        return this.meanHR;
    }

    public final int getMinBPM() {
        return this.MinBPM;
    }

    public final double getNN20() {
        return this.NN20;
    }

    public final double getNN50() {
        return this.NN50;
    }

    public final double getPHF() {
        return this.pHF;
    }

    public final double getPLF() {
        return this.pLF;
    }

    public final double getPNN20() {
        return this.pNN20;
    }

    public final double getPNN50() {
        return this.pNN50;
    }

    public final double getRMSSD() {
        return this.rMSSD;
    }

    public final double getSDANN() {
        return this.SDANN;
    }

    public final double getSDNN() {
        return this.SDNN;
    }

    public final double getSDNNIndex() {
        return this.SDNNIndex;
    }

    public final double getSDSD() {
        return this.SDSD;
    }

    public final double getStdHR() {
        return this.stdHR;
    }

    public final int getStress() {
        return this.stress;
    }

    public final double getTP() {
        return this.TP;
    }

    public final int getTTC100() {
        return this.TTC100;
    }

    public final double getTTD100() {
        return this.TTD100;
    }

    public final int getTotal_beats() {
        return this.Total_beats;
    }

    public final double getTotal_time() {
        return this.Total_time;
    }

    public final double getVLF() {
        return this.VLF;
    }

    public final boolean parse(@NotNull double[] data) {
        if (data.length < 31) {
            return false;
        }
        this.MaxBPM = data[0];
        this.MinBPM = (int) data[1];
        this.MeanBPM = data[2];
        this.ASYS = (int) data[3];
        this.TTD100 = data[4];
        this.TTC100 = (int) data[5];
        this.BTD50 = data[6];
        this.BTC50 = (int) data[7];
        this.SDNN = data[8];
        this.SDANN = data[9];
        this.SDNNIndex = data[10];
        this.AVNN = data[11];
        this.rMSSD = data[12];
        this.NN50 = data[13];
        this.pNN50 = data[14];
        this.meanHR = data[15];
        this.stdHR = data[16];
        this.SDSD = data[17];
        this.NN20 = data[18];
        this.pNN20 = data[19];
        this.VLF = data[20];
        this.LF = data[21];
        this.HF = data[22];
        this.TP = data[23];
        this.pLF = data[24];
        this.pHF = data[25];
        this.LFHFratio = data[26];
        this.Total_time = data[27];
        this.Total_beats = (int) data[28];
        this.stress = (int) data[29];
        this.fatigue = (float) data[30];
        return true;
    }

    public final void setASYS(int i) {
        this.ASYS = i;
    }

    public final void setAVNN(double d) {
        this.AVNN = d;
    }

    public final void setBTC50(int i) {
        this.BTC50 = i;
    }

    public final void setBTD50(double d) {
        this.BTD50 = d;
    }

    public final void setFatigue(float f) {
        this.fatigue = f;
    }

    public final void setHF(double d) {
        this.HF = d;
    }

    public final void setLF(double d) {
        this.LF = d;
    }

    public final void setLFHFratio(double d) {
        this.LFHFratio = d;
    }

    public final void setMaxBPM(double d) {
        this.MaxBPM = d;
    }

    public final void setMeanBPM(double d) {
        this.MeanBPM = d;
    }

    public final void setMeanHR(double d) {
        this.meanHR = d;
    }

    public final void setMinBPM(int i) {
        this.MinBPM = i;
    }

    public final void setNN20(double d) {
        this.NN20 = d;
    }

    public final void setNN50(double d) {
        this.NN50 = d;
    }

    public final void setPHF(double d) {
        this.pHF = d;
    }

    public final void setPLF(double d) {
        this.pLF = d;
    }

    public final void setPNN20(double d) {
        this.pNN20 = d;
    }

    public final void setPNN50(double d) {
        this.pNN50 = d;
    }

    public final void setRMSSD(double d) {
        this.rMSSD = d;
    }

    public final void setSDANN(double d) {
        this.SDANN = d;
    }

    public final void setSDNN(double d) {
        this.SDNN = d;
    }

    public final void setSDNNIndex(double d) {
        this.SDNNIndex = d;
    }

    public final void setSDSD(double d) {
        this.SDSD = d;
    }

    public final void setStdHR(double d) {
        this.stdHR = d;
    }

    public final void setStress(int i) {
        this.stress = i;
    }

    public final void setTP(double d) {
        this.TP = d;
    }

    public final void setTTC100(int i) {
        this.TTC100 = i;
    }

    public final void setTTD100(double d) {
        this.TTD100 = d;
    }

    public final void setTotal_beats(int i) {
        this.Total_beats = i;
    }

    public final void setTotal_time(double d) {
        this.Total_time = d;
    }

    public final void setVLF(double d) {
        this.VLF = d;
    }

    @NotNull
    public String toString() {
        return "EcgReport [,stress:" + a(this.stress) + ",fatigue:" + a(this.fatigue) + ",MaxBPM:" + a(this.MaxBPM) + ",MinBPM:" + a(this.MinBPM) + ",MeanBPM:" + a(this.MeanBPM) + ",ASYS:" + a(this.ASYS) + ",TTD100:" + a(this.TTD100) + ",TTC100:" + a(this.TTC100) + ",BTD50:" + a(this.BTD50) + ",BTC50:" + a(this.BTC50) + ",SDNN:" + a(this.SDNN) + ",SDANN:" + a(this.SDANN) + ",SDNNIndex:" + a(this.SDNNIndex) + ",AVNN:" + a(this.AVNN) + ",rMSSD:" + a(this.rMSSD) + ",NN50:" + a(this.NN50) + ",pNN50:" + a(this.pNN50) + ",SDANN:" + a(this.SDANN) + ",meanHR:" + a(this.meanHR) + ",stdHR:" + a(this.stdHR) + ",SDSD:" + a(this.SDSD) + ",NN20:" + a(this.NN20) + ",pNN20:" + a(this.pNN20) + ",VLF:" + a(this.VLF) + ",LF:" + a(this.LF) + ",HF " + a(this.HF) + ",TP:" + a(this.SDSD) + ",pHF:" + a(this.pHF) + ",LFHFratio:" + a(this.LFHFratio) + ",Total_time:" + a(this.Total_time) + ",Total_beats:" + a(this.Total_beats) + "]";
    }

    public EcgReport(@NotNull double[] dArr) {
        parse(dArr);
    }
}

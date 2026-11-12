package com.xiaomi.fitness.sport.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b/\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001a\u0010\"\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010%\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001a\u0010(\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001a\u0010.\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u00101\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u001a\u00104\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u00107\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0016\"\u0004\b9\u0010\u0018R\u001a\u0010:\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\u001a\u0010=\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010\u0018R\u001a\u0010@\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\u001a\u0010C\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010\u0018R\u001a\u0010F\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010\u001e¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport/bean/SportingBean;", "", "<init>", "()V", "isVisible0", "", "()Z", "setVisible0", "(Z)V", "isVisible1", "setVisible1", "isVisible2", "setVisible2", "isVisible3", "setVisible3", "isVisible4", "setVisible4", "isVisible5", "setVisible5", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "gpsStatus", "getGpsStatus", "setGpsStatus", "target", "getTarget", "setTarget", "data0", "getData0", "setData0", "dataDes0", "getDataDes0", "setDataDes0", "data1", "getData1", "setData1", "dataDes1", "getDataDes1", "setDataDes1", "data2", "getData2", "setData2", "dataDes2", "getDataDes2", "setDataDes2", "data3", "getData3", "setData3", "dataDes3", "getDataDes3", "setDataDes3", "data4", "getData4", "setData4", "dataDes4", "getDataDes4", "setDataDes4", "data5", "getData5", "setData5", "dataDes5", "getDataDes5", "setDataDes5", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportingBean {
    private int data0;
    private int data1;
    private int data2;
    private int data3;
    private int data4;
    private int data5;
    private int duration;
    private int gpsStatus;
    private boolean isVisible0;
    private boolean isVisible1;
    private boolean isVisible2;
    private boolean isVisible3;
    private boolean isVisible4;
    private boolean isVisible5;

    @NotNull
    private String title = "";

    @NotNull
    private String target = "";

    @NotNull
    private String dataDes0 = "";

    @NotNull
    private String dataDes1 = "";

    @NotNull
    private String dataDes2 = "";

    @NotNull
    private String dataDes3 = "";

    @NotNull
    private String dataDes4 = "";

    @NotNull
    private String dataDes5 = "";

    public final int getData0() {
        return this.data0;
    }

    public final int getData1() {
        return this.data1;
    }

    public final int getData2() {
        return this.data2;
    }

    public final int getData3() {
        return this.data3;
    }

    public final int getData4() {
        return this.data4;
    }

    public final int getData5() {
        return this.data5;
    }

    @NotNull
    public final String getDataDes0() {
        return this.dataDes0;
    }

    @NotNull
    public final String getDataDes1() {
        return this.dataDes1;
    }

    @NotNull
    public final String getDataDes2() {
        return this.dataDes2;
    }

    @NotNull
    public final String getDataDes3() {
        return this.dataDes3;
    }

    @NotNull
    public final String getDataDes4() {
        return this.dataDes4;
    }

    @NotNull
    public final String getDataDes5() {
        return this.dataDes5;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getGpsStatus() {
        return this.gpsStatus;
    }

    @NotNull
    public final String getTarget() {
        return this.target;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: isVisible0, reason: from getter */
    public final boolean getIsVisible0() {
        return this.isVisible0;
    }

    /* JADX INFO: renamed from: isVisible1, reason: from getter */
    public final boolean getIsVisible1() {
        return this.isVisible1;
    }

    /* JADX INFO: renamed from: isVisible2, reason: from getter */
    public final boolean getIsVisible2() {
        return this.isVisible2;
    }

    /* JADX INFO: renamed from: isVisible3, reason: from getter */
    public final boolean getIsVisible3() {
        return this.isVisible3;
    }

    /* JADX INFO: renamed from: isVisible4, reason: from getter */
    public final boolean getIsVisible4() {
        return this.isVisible4;
    }

    /* JADX INFO: renamed from: isVisible5, reason: from getter */
    public final boolean getIsVisible5() {
        return this.isVisible5;
    }

    public final void setData0(int i) {
        this.data0 = i;
    }

    public final void setData1(int i) {
        this.data1 = i;
    }

    public final void setData2(int i) {
        this.data2 = i;
    }

    public final void setData3(int i) {
        this.data3 = i;
    }

    public final void setData4(int i) {
        this.data4 = i;
    }

    public final void setData5(int i) {
        this.data5 = i;
    }

    public final void setDataDes0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataDes0 = str;
    }

    public final void setDataDes1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataDes1 = str;
    }

    public final void setDataDes2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataDes2 = str;
    }

    public final void setDataDes3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataDes3 = str;
    }

    public final void setDataDes4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataDes4 = str;
    }

    public final void setDataDes5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataDes5 = str;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setGpsStatus(int i) {
        this.gpsStatus = i;
    }

    public final void setTarget(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.target = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setVisible0(boolean z) {
        this.isVisible0 = z;
    }

    public final void setVisible1(boolean z) {
        this.isVisible1 = z;
    }

    public final void setVisible2(boolean z) {
        this.isVisible2 = z;
    }

    public final void setVisible3(boolean z) {
        this.isVisible3 = z;
    }

    public final void setVisible4(boolean z) {
        this.isVisible4 = z;
    }

    public final void setVisible5(boolean z) {
        this.isVisible5 = z;
    }
}

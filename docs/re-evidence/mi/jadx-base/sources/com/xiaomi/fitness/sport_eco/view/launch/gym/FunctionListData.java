package com.xiaomi.fitness.sport_eco.view.launch.gym;

import defpackage.e1j;
import defpackage.foi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0017\u0018\u0019\u001a\u001bB;\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013\u0082\u0001\u0005\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "Ljava/io/Serializable;", "icon", "", "title", "des", "desV2", "", "scene", "<init>", "(IIILjava/lang/String;Ljava/lang/String;)V", "getIcon", "()I", "getTitle", "setTitle", "(I)V", "getDes", "setDes", "getDesV2", "()Ljava/lang/String;", "setDesV2", "(Ljava/lang/String;)V", "getScene", "RopeIntervalTraining", "FtpTest", "SportDynamic", "Environmental", "RopeSportHistory", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$Environmental;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$FtpTest;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$RopeIntervalTraining;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$RopeSportHistory;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$SportDynamic;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FunctionListData implements Serializable {
    private int des;

    @NotNull
    private String desV2;
    private final int icon;

    @NotNull
    private final String scene;
    private int title;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$Environmental;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Environmental extends FunctionListData {

        @NotNull
        public static final Environmental INSTANCE = new Environmental();

        private Environmental() {
            super(foi.c, e1j.t, e1j.j, "", FunctionListDataKt.TAG_ENVIRONMENTAL, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$FtpTest;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FtpTest extends FunctionListData {

        @NotNull
        public static final FtpTest INSTANCE = new FtpTest();

        private FtpTest() {
            super(foi.F, e1j.L1, e1j.M1, "", FunctionListDataKt.TAG_FTP_TEST, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$RopeIntervalTraining;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RopeIntervalTraining extends FunctionListData {

        @NotNull
        public static final RopeIntervalTraining INSTANCE = new RopeIntervalTraining();

        /* JADX WARN: Illegal instructions before constructor call */
        private RopeIntervalTraining() {
            int i = foi.t;
            int i2 = e1j.n3;
            super(i, i2, i2, "", FunctionListDataKt.TAG_INTERVAL_TRAINING, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$RopeSportHistory;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RopeSportHistory extends FunctionListData {

        @NotNull
        public static final RopeSportHistory INSTANCE = new RopeSportHistory();

        /* JADX WARN: Illegal instructions before constructor call */
        private RopeSportHistory() {
            int i = foi.u;
            int i2 = e1j.I3;
            super(i, i2, i2, "", FunctionListDataKt.TAG_SPORT_HISTORY, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData$SportDynamic;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/FunctionListData;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SportDynamic extends FunctionListData {

        @NotNull
        public static final SportDynamic INSTANCE = new SportDynamic();

        private SportDynamic() {
            super(foi.E, e1j.r0, e1j.G1, "", FunctionListDataKt.TAG_SPORT_DYNAMIC, null);
        }
    }

    public /* synthetic */ FunctionListData(int i, int i2, int i3, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2);
    }

    public final int getDes() {
        return this.des;
    }

    @NotNull
    public final String getDesV2() {
        return this.desV2;
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getScene() {
        return this.scene;
    }

    public final int getTitle() {
        return this.title;
    }

    public final void setDes(int i) {
        this.des = i;
    }

    public final void setDesV2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.desV2 = str;
    }

    public final void setTitle(int i) {
        this.title = i;
    }

    private FunctionListData(int i, int i2, int i3, String str, String str2) {
        this.icon = i;
        this.title = i2;
        this.des = i3;
        this.desV2 = str;
        this.scene = str2;
    }

    public /* synthetic */ FunctionListData(int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? "" : str2, null);
    }
}
